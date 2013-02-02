tree grammar PogoTreeWalker;

options {
  language = Java;
  tokenVocab = Pogo;
  ASTLabelType = CommonTree;
}

@header {
 package com.pixelmaid.dresscode.antlr;
  import com.pixelmaid.dresscode.antlr.types.*; 
  import com.pixelmaid.dresscode.antlr.types.tree.*; 
  import com.pixelmaid.dresscode.antlr.types.tree.functions.*; 
  import java.util.Map;
  import java.util.HashMap;
}

@members {
 
  Scope currentScope = null;
  public Map<String, FunctionType> functions = null;
  
  public PogoTreeWalker(CommonTreeNodeStream nodes, Map<String, FunctionType> fns) {
    this(nodes, null, fns);
  }
  
  public PogoTreeWalker(CommonTreeNodeStream nds, Scope sc, Map<String, FunctionType> fns) {
    super(nds);
    currentScope = sc;
    functions = fns;
  }
}

walk returns [BlockNode node]
  :  block {node = $block.node;}
  ;

block returns [BlockNode node]

@init{
	System.out.println(" new block called");

  BlockNode bn = new BlockNode();
  node = bn;
  Scope local = new Scope(currentScope);
  currentScope = local;
}
@after {
  currentScope = currentScope.parent();
}
  :  ^(BLOCK ^(STATEMENTS (statement {bn.addStatement($statement.node);})*) ^(RETURN (expression {bn.addReturn($expression.node);})?))
  ;

statement returns [DCNode node]
@init{
	System.out.println(" statement called");
}
  :  assignment     {node = $assignment.node;}
  |  functionCall   {node = $functionCall.node;}
  |  ifStatement    {node = $ifStatement.node;}
  |  forStatement   {node = $forStatement.node;}
  |  whileStatement {node = $whileStatement.node;}
  ;

assignment returns [DCNode node]
  :  ^(ASSIGNMENT Identifier indexes? expression) {node = new AssignmentNode($Identifier.text, $indexes.e, $expression.node, currentScope);}
  ;

functionCall returns [DCNode node]
@init{
	System.out.println("function called");
}
  :  ^(FUNC_CALL Identifier exprList?) {node = new FunctionCallNode($Identifier.text, $exprList.e, functions);}
  |  ^(FUNC_CALL Println expression?)  {node = new PrintlnNode($expression.node);}
  |  ^(FUNC_CALL Print expression)     {node = new PrintNode($expression.node);}
  |  ^(FUNC_CALL Assert expression)    {node = new AssertNode($expression.node);}
  |  ^(FUNC_CALL Size expression)      {node = new SizeNode($expression.node);}
  |	 ^(FUNC_CALL Drawable exprList?)   {node = new DrawableNode($exprList.e,$FUNC_CALL.getLine());}
  ;

ifStatement returns [DCNode node]
@init  {IfNode ifNode = new IfNode();}
@after {node = ifNode;}
  :  ^(IF ifStat[ifNode] (elseIfStat[ifNode])* (elseStat[ifNode])?)
  ;

ifStat[IfNode parent]
  :  ^(EXP expression block) {parent.addChoice($expression.node, $block.node);}
  ;

elseIfStat[IfNode parent]
  :  ^(EXP expression block) {parent.addChoice($expression.node, $block.node);}
  ;

elseStat[IfNode parent]
  :  ^(EXP block) {parent.addChoice(new AtomNode(true), $block.node);}
  ;
   
forStatement returns [DCNode node]
  :  ^(For Identifier a=expression b=expression block) {node = new ForStatementNode($Identifier.text, $a.node, $b.node, $block.node, currentScope);}
  ;

whileStatement returns [DCNode node]
  :  ^(While expression block) {node = new WhileStatementNode($expression.node, $block.node);}
  ;

idList returns [java.util.List<String> i]
@init {i = new java.util.ArrayList<String>();}
  :  ^(ID_LIST (Identifier {i.add($Identifier.text);})+)
  ;

exprList returns [java.util.List<DCNode> e]
@init  {e = new java.util.ArrayList<DCNode>();}
  :  ^(EXP_LIST (expression {e.add($expression.node);})+)
  ;

expression returns [DCNode node]
  :  ^(TERNARY a=expression b=expression c=expression) {node = new TernaryNode($a.node, $b.node, $c.node);}
  |  ^(In a=expression b=expression)                   {node = new InNode($a.node, $b.node);}
  |  ^('||' a=expression b=expression)                 {node = new OrNode($a.node, $b.node);}
  |  ^('&&' a=expression b=expression)                 {node = new AndNode($a.node, $b.node);}
  |  ^('==' a=expression b=expression)                 {node = new EqualsNode($a.node, $b.node);}
  |  ^('!=' a=expression b=expression)                 {node = new NotEqualsNode($a.node, $b.node);}
  |  ^('>=' a=expression b=expression)                 {node = new GTEqualsNode($a.node, $b.node);}
  |  ^('<=' a=expression b=expression)                 {node = new LTEqualsNode($a.node, $b.node);}
  |  ^('>' a=expression b=expression)                  {node = new GTNode($a.node, $b.node);}
  |  ^('<' a=expression b=expression)                  {node = new LTNode($a.node, $b.node);}
  |  ^('+' a=expression b=expression)                  {node = new AddNode($a.node, $b.node);}
  |  ^('-' a=expression b=expression)                  {node = new SubNode($a.node, $b.node);}
  |  ^('*' a=expression b=expression)                  {node = new MulNode($a.node, $b.node);}
  |  ^('/' a=expression b=expression)                  {node = new DivNode($a.node, $b.node);}
  |  ^('%' a=expression b=expression)                  {node = new ModNode($a.node, $b.node);}
  |  ^('^' a=expression b=expression)                  {node = new PowNode($a.node, $b.node);}
  |  ^(UNARY_MIN a=expression)                         {node = new UnaryMinusNode($a.node);}
  |  ^(NEGATE a=expression)                            {node = new NegateNode($a.node);}
  |  Number                                            {node = new AtomNode(Double.parseDouble($Number.text));}
  |  Bool                                              {node = new AtomNode(Boolean.parseBoolean($Bool.text));}
  |  Null                                              {node = new AtomNode(null);}
  |  lookup                                            {node = $lookup.node;}
  ;

list returns [DCNode node]
  :  ^(LIST exprList?) {node = new ListNode($exprList.e);}
  ;

lookup returns [DCNode node]
  :  ^(LOOKUP functionCall i=indexes?) {node = $i.e != null ? new LookupNode($functionCall.node, $indexes.e) : $functionCall.node;}
  |  ^(LOOKUP list i=indexes?)         {node = $i.e != null ? new LookupNode($list.node, $indexes.e) : $list.node;}
  |  ^(LOOKUP expression i=indexes?)   {node = $i.e != null ? new LookupNode($expression.node, $indexes.e) : $expression.node;}
  |  ^(LOOKUP Identifier i=indexes?)   {node = $i.e != null ? new LookupNode(new IdentifierNode($Identifier.text, currentScope), $indexes.e) : new IdentifierNode($Identifier.text, currentScope);}
  |  ^(LOOKUP String i=indexes?)       {node = $i.e != null ? new LookupNode(new AtomNode($String.text), $indexes.e) : new AtomNode($String.text);}
  ;

indexes returns [java.util.List<DCNode> e]
@init {e = new java.util.ArrayList<DCNode>();}
  :  ^(INDEXES (expression {e.add($expression.node);})+)
  ;