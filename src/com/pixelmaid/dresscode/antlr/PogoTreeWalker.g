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
  import com.pixelmaid.dresscode.antlr.types.tree.properties.*; 
  import com.pixelmaid.dresscode.antlr.types.tree.functions.transforms.*; 
  import com.pixelmaid.dresscode.data.*;
  
  import java.util.Map;
  import java.util.HashMap;
  import java.util.LinkedList;

}

@members {
 
 double widthParam;
 double heightParam;
 DrawableManager drawableManager;
  Scope currentScope = null;
  
  
  private List<String> errors = new LinkedList<String>();
    public void displayRecognitionError(String[] tokenNames,
                                        RecognitionException e) {
        String hdr = getErrorHeader(e);
        String msg = getErrorMessage(e, tokenNames);
        errors.add(hdr + " " + msg);
    }
    public List<String> getErrors() {
        return errors;
    }
  public Map<String, FunctionType> functions = null;
  
  public PogoTreeWalker(CommonTreeNodeStream nodes, Map<String, FunctionType> fns, DrawableManager dm, double w, double h) {
    this(nodes, null, fns,dm,w,h);
   
  }
  
  public PogoTreeWalker(CommonTreeNodeStream nds, Scope sc, Map<String, FunctionType> fns, DrawableManager dm,double w,double h) {
    super(nds);
    currentScope = sc;
    functions = fns;
    this.drawableManager = dm;
    widthParam = w;
    heightParam = h;
  }
  
}

walk returns [BlockNode node]
  :  block {node = $block.node;}
  ;

block returns [BlockNode node]

@init{
	//System.out.println(" new block called");

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
	//System.out.println(" statement called");
}
  :  assignment     {node = $assignment.node; ((NodeEvent)node).addEventListener(drawableManager);}
  |  functionCall   {node = $functionCall.node;}
  |  ifStatement    {node = $ifStatement.node; ((NodeEvent)node).addEventListener(drawableManager);}
  |  forStatement   {node = $forStatement.node; ((NodeEvent)node).addEventListener(drawableManager);}
  |  whileStatement {node = $whileStatement.node; ((NodeEvent)node).addEventListener(drawableManager);}
  | repeatStatement[false] {node = $repeatStatement.node; ((NodeEvent)node).addEventListener(drawableManager);}
  ;

assignment returns [DCNode node]
  :  ^(ASSIGNMENT Identifier indexes? expression) {node = new AssignmentNode($Identifier.text, $indexes.e, $expression.node, currentScope);}

  ;

functionCall returns [DCNode node]
@init{
	//System.out.println("function called");
}
  :  ^(FUNC_CALL Identifier exprList?) {node = new FunctionCallNode($Identifier.text, $exprList.e, functions, widthParam, heightParam); ((NodeEvent)node).addEventListener(drawableManager);}
  |  ^(FUNC_CALL Println expression?)  {node = new PrintlnNode($expression.node); ((NodeEvent)node).addEventListener(drawableManager);}
  |  ^(FUNC_CALL Print expression)     {node = new PrintNode($expression.node); ((NodeEvent)node).addEventListener(drawableManager);}
  |  ^(FUNC_CALL Assert expression)    {node = new AssertNode($expression.node); ((NodeEvent)node).addEventListener(drawableManager);}
  |  ^(FUNC_CALL Size expression)      {node = new SizeNode($expression.node); ((NodeEvent)node).addEventListener(drawableManager);}
  |  ^(FUNC_CALL LAdd exprList?) 	{node = new LAddNode($exprList.e,$FUNC_CALL.getLine()); ((NodeEvent)node).addEventListener(drawableManager);}
  |  ^(FUNC_CALL LRemove exprList?) {node = new LRemoveNode($exprList.e,$FUNC_CALL.getLine()); ((NodeEvent)node).addEventListener(drawableManager);}
  |	 primitiveCall {node = $primitiveCall.node; ((NodeEvent)node).addEventListener(drawableManager);}
  |	 transformCall {node = $transformCall.node; ((NodeEvent)node).addEventListener(drawableManager);}
  |	 mathCall {node= $mathCall.node; ((NodeEvent)node).addEventListener(drawableManager);}
  ;
  
  
  primitiveCall returns [DCNode node]
  	:^(FUNC_CALL Ellipse exprList?)  {node = new EllipseNode($exprList.e,$FUNC_CALL.getLine());}
  	|^(FUNC_CALL Line exprList?) 	 {node = new LineNode($exprList.e,$FUNC_CALL.getLine());}
  	|^(FUNC_CALL Rect exprList?) 	 {node = new RectangleNode($exprList.e,$FUNC_CALL.getLine());}
  	| ^(FUNC_CALL Curve exprList?)   {node = new CurveNode($exprList.e,$FUNC_CALL.getLine());}
  	| ^(FUNC_CALL Polygon exprList?) {node = new PolygonNode($exprList.e,$FUNC_CALL.getLine());}
  	| ^(FUNC_CALL LShape exprList?) {node = new LShapeNode($exprList.e,$FUNC_CALL.getLine());}
  	|  ^(FUNC_CALL Point exprList?) {node = new PointNode($exprList.e,$FUNC_CALL.getLine());}
  	;
  
  transformCall returns [DCNode node]
   :^(FUNC_CALL Move exprList?)   {node = new MoveNode($exprList.e,$FUNC_CALL.getLine());}
   |^(FUNC_CALL Copy expression)  {node = new CopyNode($expression.node,$FUNC_CALL.getLine());}
   |^(FUNC_CALL Rotate exprList?) {node = new RotateNode($exprList.e,$FUNC_CALL.getLine());}
   |^(FUNC_CALL Fill exprList?)   {node = new FillNode($exprList.e,$FUNC_CALL.getLine());}
   |^(FUNC_CALL Stroke exprList?) {node = new StrokeNode($exprList.e,$FUNC_CALL.getLine());}
   |^(FUNC_CALL NoFill expression) {node = new NoFillNode($expression.node,$FUNC_CALL.getLine());}
   |^(FUNC_CALL NoStroke expression) {node = new NoStrokeNode($expression.node,$FUNC_CALL.getLine());}
   |^(FUNC_CALL Weight exprList?) {node = new WeightNode($exprList.e,$FUNC_CALL.getLine());}
   |^(FUNC_CALL Hide expression) {node = new HideNode($expression.node,$FUNC_CALL.getLine());}
   |^(FUNC_CALL Group exprList?) {node = new GroupNode($exprList.e,$FUNC_CALL.getLine());}
   |^(FUNC_CALL Expand expression){node = new ExpandNode($expression.node,$FUNC_CALL.getLine());}
   | ^(FUNC_CALL Merge expression){node = new MergeNode($expression.node,$FUNC_CALL.getLine());}
   | ^(FUNC_CALL Scale exprList?){node = new ScaleNode($exprList.e,$FUNC_CALL.getLine());}
   ;
   
   mathCall returns [DCNode node]
   :^(FUNC_CALL Cosine expression) {node = new CosineNode($expression.node,$FUNC_CALL.getLine());}
   |^(FUNC_CALL Sine expression) {node = new SineNode($expression.node,$FUNC_CALL.getLine());}
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
  
repeatStatement[boolean lookup] returns [DCNode node]
  : ^(Repeat Identifier a=expression b=expression (c=expression)? block) {node = new RepeatStatementNode($Identifier.text, $a.node, $b.node, $c.node, $block.node, currentScope, lookup);}
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
  :  ^(TERNARY a=expression b=expression c=expression) {node = new TernaryNode($a.node, $b.node, $c.node); }
  |  ^(In a=expression b=expression)                   {node = new InNode($a.node, $b.node);}
  |  ^('||' a=expression b=expression)                 {node = new OrNode($a.node, $b.node);}
  |  ^('&&' a=expression b=expression)                 {node = new AndNode($a.node, $b.node); ((NodeEvent)node).addEventListener(drawableManager);}
  |  ^('==' a=expression b=expression)                 {node = new EqualsNode($a.node, $b.node);}
  |  ^('!=' a=expression b=expression)                 {node = new NotEqualsNode($a.node, $b.node);}
  |  ^('>=' a=expression b=expression)                 {node = new GTEqualsNode($a.node, $b.node);}
  |  ^('<=' a=expression b=expression)                 {node = new LTEqualsNode($a.node, $b.node);}
  |  ^('>' a=expression b=expression)                  {node = new GTNode($a.node, $b.node);}
  |  ^('<' a=expression b=expression)                  {node = new LTNode($a.node, $b.node);}
  |  ^('+' a=expression b=expression)                  {node = new AddNode($a.node, $b.node); ((NodeEvent)node).addEventListener(drawableManager);}
  |  ^('-' a=expression b=expression)                  {node = new SubNode($a.node, $b.node); ((NodeEvent)node).addEventListener(drawableManager);}
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
  |  COLOR_CONSTANT									   {node = new AtomNode($COLOR_CONSTANT.text);}
  |	PI_CONSTANT                                        {node = new AtomNode(Math.PI);}
  |WIDTH_CONSTANT                                       {node = new AtomNode(widthParam);}
  |HEIGHT_CONSTANT                                       {node = new AtomNode(heightParam);}
  ;

list returns [DCNode node]
  :  ^(LIST exprList?) {node = new ListNode($exprList.e);}
  ;


//START HERE TOMOROW FIXING DOT LOOKUP WITH MULTIPLE INDEXES
lookup returns [DCNode node]
 	:^(DOTPROPERTY functionCall dotProperty){node = new DotPropertyNode($functionCall.node, $dotProperty.e);}
 	|^(DOTPROPERTY Identifier dotProperty){node = new DotPropertyNode(new IdentifierNode($Identifier.text, currentScope), $dotProperty.e);}
 
 // :  ^(DOTPROPERTY functionCall d=dotLookup[$functionCall.node]) {node = $d.node;}
  //|  ^(DOTPROPERTY Identifier d=dotLookup[new IdentifierNode($Identifier.text, currentScope)]) {node = $d.node;}
    
  
  | ^(LOOKUP functionCall i=indexes?) {node = $i.e != null ? new LookupNode($functionCall.node, $indexes.e) : $functionCall.node;}
  |  ^(LOOKUP list i=indexes?)         {node = $i.e != null ? new LookupNode($list.node, $indexes.e) : $list.node;}
  |  ^(LOOKUP expression i=indexes?)   {node = $i.e != null ? new LookupNode($expression.node, $indexes.e) : $expression.node;}
  |  ^(LOOKUP Identifier i=indexes?)   {node = $i.e != null ? new LookupNode(new IdentifierNode($Identifier.text, currentScope), $indexes.e) : new IdentifierNode($Identifier.text, currentScope);}
  |  ^(LOOKUP String i=indexes?)       {node = $i.e != null ? new LookupNode(new AtomNode($String.text), $indexes.e) : new AtomNode($String.text);}
  
 
 // |  ^(LOOKUP forStatement i=indexes?)   {node = $i.e != null ? new LookupNode($forStatement.node, $indexes.e) : $forStatement.node;}
 // |  ^(LOOKUP whileStatement i=indexes?)   {node = $i.e != null ? new LookupNode($whileStatement.node, $indexes.e) : $whileStatement.node;}
 // |  ^(LOOKUP repeatStatement[true] i=indexes?)   {node = $i.e != null ? new LookupNode($repeatStatement.node, $indexes.e) : $repeatStatement.node;}
  ;
  
 

indexes returns [java.util.List<DCNode> e]
@init {e = new java.util.ArrayList<DCNode>();}
  :  ^(INDEXES (expression {e.add($expression.node);})+) 
  ;
  
  

 dotProperty returns [java.util.List<PropertyNode> e]
 @init {e = new java.util.ArrayList<PropertyNode>();}
  :  ^(DOT (dotExpression {e.add($dotExpression.node);})+)
  ;	 
  
  dotExpression returns [PropertyNode node]
  : DotX {node = new XPropertyNode();}
  | DotY {node = new YPropertyNode();}
  | DotStart {node = new StartPropertyNode();}
  | DotEnd {node = new EndPropertyNode();}
  | DotOrigin {node = new OriginPropertyNode();}
  | DotRotation {node = new RotationPropertyNode();}
  | DotWidth {node = new WidthPropertyNode();}
  | DotHeight {node = new HeightPropertyNode();}
  | DotFill //{node = new FillPropertyNode(ref,$DOT.getLine());}
  |	DotStroke //{node = new StrokePropertyNode(ref,$DOT.getLine());}
  | DotWeight //{node = new WeightPropertyNode(ref,$DOT.getLine());}
  ;