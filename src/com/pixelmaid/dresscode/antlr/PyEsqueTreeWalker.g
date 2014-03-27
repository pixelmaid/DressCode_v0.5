tree grammar PyEsqueTreeWalker;

options {
  language = Java;
  tokenVocab = PyEsque;
  ASTLabelType = CommonTree;
}



@header {
 package com.pixelmaid.dresscode.antlr;
  import com.pixelmaid.dresscode.antlr.types.*; 
  import com.pixelmaid.dresscode.antlr.types.tree.*; 
  import com.pixelmaid.dresscode.antlr.types.tree.functions.*; 
  import com.pixelmaid.dresscode.antlr.types.tree.UI.*; 
  import com.pixelmaid.dresscode.antlr.types.tree.templates.*;
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
 int unitParam;
 DrawableManager drawableManager;
 UserUIManager uiManager;
 Scope currentScope = null;
 BlockNode currentFunction = null; 
  
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
  
  public PyEsqueTreeWalker(CommonTreeNodeStream nodes, Map<String, FunctionType> fns, DrawableManager dm,UserUIManager ui,double w, double h,int u) {
    this(nodes, null, fns,dm,ui,w,h,u);
   
  }
  
  public PyEsqueTreeWalker(CommonTreeNodeStream nds, Scope sc, Map<String, FunctionType> fns, DrawableManager dm,UserUIManager ui, double w,double h, int u) {
    super(nds);
    currentScope = sc;
    functions = fns;
    this.drawableManager = dm;
    this.uiManager = ui;
    widthParam = w;
    heightParam = h;
    unitParam = u;  }
  
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
  currentFunction = bn;
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
  |  whileStatement {node = $whileStatement.node; ((NodeEvent)node).addEventListener(drawableManager);}
  | repeatStatement {node = $repeatStatement.node; ((NodeEvent)node).addEventListener(drawableManager);}
  /*| returnStatement {node = $returnStatement.node; currentFunction.addReturn($returnStatement.node);}*/
  ;
  
 
assignment returns [DCNode node]
  :  ^(ASSIGNMENT Identifier indexes? expression?) {node = new AssignmentNode($Identifier.text, $indexes.e, $expression.node, currentScope,$ASSIGNMENT.getLine());}

  ;
  
 /*returnStatement returns [DCNode node]
 	:^(RETURN expression) {node = $expression.node;}
 	;*/
 	
 	
functionCall returns [DCNode node]
@init{
	//System.out.println("function called");
}
  :  ^(FUNC_CALL Identifier exprList?) {node = new FunctionCallNode($Identifier.text, $exprList.e, functions, widthParam, heightParam, unitParam,$FUNC_CALL.getLine()); ((NodeEvent)node).addEventListener(drawableManager);((NodeEvent)node).addEventListener(uiManager);}
  |  ^(FUNC_CALL Println expression?)  {node = new PrintlnNode($expression.node); ((NodeEvent)node).addEventListener(drawableManager);}
  |  ^(FUNC_CALL Print expression)     {node = new PrintNode($expression.node); ((NodeEvent)node).addEventListener(drawableManager);}
  |  ^(FUNC_CALL Assert expression)    {node = new AssertNode($expression.node); ((NodeEvent)node).addEventListener(drawableManager);}
  |  ^(FUNC_CALL Size expression)      {node = new SizeNode($expression.node); ((NodeEvent)node).addEventListener(drawableManager);}
  |  ^(FUNC_CALL LAdd exprList?) 	{node = new LAddNode($exprList.e,$FUNC_CALL.getLine()); ((NodeEvent)node).addEventListener(drawableManager);}
  |  ^(FUNC_CALL LRemove exprList?) {node = new LRemoveNode($exprList.e,$FUNC_CALL.getLine()); ((NodeEvent)node).addEventListener(drawableManager);}
  |	 primitiveCall {node = $primitiveCall.node; ((NodeEvent)node).addEventListener(drawableManager);}
  |	 transformCall {node = $transformCall.node; ((NodeEvent)node).addEventListener(drawableManager);}
  |	 patternCall {node = $patternCall.node; ((NodeEvent)node).addEventListener(drawableManager);}
  |	 mathCall {node= $mathCall.node; ((NodeEvent)node).addEventListener(drawableManager);}
  |	 getCall {node= $getCall.node; ((NodeEvent)node).addEventListener(drawableManager);}
  | uICall {node = $uICall.node; ((NodeEvent)node).addEventListener(uiManager);}
  | templateCall {node = $templateCall.node; ((NodeEvent)node).addEventListener(drawableManager);}
  ;
  
  
  primitiveCall returns [DCNode node]
  	:^(FUNC_CALL Ellipse exprList?)  {node = new EllipseNode($exprList.e,$FUNC_CALL.getLine(),$FUNC_CALL.getCharPositionInLine());}
  	|^(FUNC_CALL Line exprList?) 	 {node = new LineNode($exprList.e,$FUNC_CALL.getLine());}
  	|^(FUNC_CALL Rect exprList?) 	 {node = new RectangleNode($exprList.e,$FUNC_CALL.getLine());}
  	| ^(FUNC_CALL Curve exprList?)   {node = new CurveNode($exprList.e,$FUNC_CALL.getLine());}
  	| ^(FUNC_CALL Polygon exprList?) {node = new PolygonNode($exprList.e,$FUNC_CALL.getLine());}
  	| ^(FUNC_CALL Skirt exprList?) //{node = new SkirtNode($exprList.e,$FUNC_CALL.getLine());}
    | ^(FUNC_CALL SkirtBack exprList?) //{node = new SkirtBackNode($exprList.e,$FUNC_CALL.getLine());}
    | ^(FUNC_CALL LShape exprList?) {node = new LShapeNode($exprList.e,$FUNC_CALL.getLine());}
  	|  ^(FUNC_CALL Point exprList?) {node = new PointNode($exprList.e,$FUNC_CALL.getLine());}
  	;
  
  transformCall returns [DCNode node]
   :^(FUNC_CALL Move exprList?)   {node = new MoveNode($exprList.e,$FUNC_CALL.getLine(),$FUNC_CALL.getCharPositionInLine());}
   | ^(FUNC_CALL MoveBy exprList?)   {node = new MoveByNode($exprList.e,$FUNC_CALL.getLine());}
   | ^(FUNC_CALL Heading exprList?)   {node = new HeadingNode($exprList.e,$FUNC_CALL.getLine());}
   |^(FUNC_CALL Copy expression)  {node = new CopyNode($expression.node,$FUNC_CALL.getLine());}
   |^(FUNC_CALL Rotate exprList?) {node = new RotateNode($exprList.e,currentScope,$FUNC_CALL.getLine(),$FUNC_CALL.getCharPositionInLine());}
   |^(FUNC_CALL Fill exprList?)   {node = new FillNode($exprList.e,$FUNC_CALL.getLine());}
   |^(FUNC_CALL Stroke exprList?) {node = new StrokeNode($exprList.e,$FUNC_CALL.getLine());}
   |^(FUNC_CALL NoFill expression) {node = new NoFillNode($expression.node ,$FUNC_CALL.getLine());}
   |^(FUNC_CALL NoStroke expression) {node = new NoStrokeNode($expression.node,$FUNC_CALL.getLine());}
   |^(FUNC_CALL Weight exprList?) {node = new WeightNode($exprList.e,$FUNC_CALL.getLine());}
   |^(FUNC_CALL Hide expression) {node = new HideNode($expression.node,$FUNC_CALL.getLine());}
   |^(FUNC_CALL Show expression) {node = new ShowNode($expression.node,$FUNC_CALL.getLine());}
   |^(FUNC_CALL Group exprList?) {node = new GroupNode($exprList.e,$FUNC_CALL.getLine());}
   |^(FUNC_CALL Expand expression){node = new ExpandNode($expression.node, currentScope, $FUNC_CALL.getLine());}
   |^(FUNC_CALL Merge expression){node = new MergeNode($expression.node,currentScope,$FUNC_CALL.getLine());}
   |^(FUNC_CALL Scale exprList?){node = new ScaleNode($exprList.e,$FUNC_CALL.getLine());}
   |^(FUNC_CALL MirrorX expression){node = new MirrorXNode($expression.node,$FUNC_CALL.getLine());}
   |^(FUNC_CALL MirrorY expression){node = new MirrorYNode($expression.node,$FUNC_CALL.getLine());}
   |^(FUNC_CALL Union exprList?){node = new UnionNode($exprList.e, currentScope, $FUNC_CALL.getLine());}
   |^(FUNC_CALL Difference exprList?){node = new DifferenceNode($exprList.e, currentScope, $FUNC_CALL.getLine());}
   |^(FUNC_CALL Clip exprList?){node = new ClipNode($exprList.e, currentScope, $FUNC_CALL.getLine());}
   |^(FUNC_CALL Xor exprList?){node = new XorNode($exprList.e, currentScope, $FUNC_CALL.getLine());}
   |^(FUNC_CALL Flatten expression){node = new FlattenNode($expression.node,currentScope, $FUNC_CALL.getLine());}
   ;
   
  
    patternCall returns [DCNode node]
   : ^(FUNC_CALL Grid exprList?) {node = new GridNode($exprList.e,currentScope,$FUNC_CALL.getLine(),widthParam, heightParam);}
   | ^(FUNC_CALL Wave exprList?) {node = new WaveNode($exprList.e,currentScope,$FUNC_CALL.getLine(),widthParam, heightParam);}
   | ^(FUNC_CALL Arc exprList?) {node = new ArcNode($exprList.e,currentScope,$FUNC_CALL.getLine(),widthParam, heightParam);}
   ;
  
   
   mathCall returns [DCNode node]
   :^(FUNC_CALL Cosine expression) {node = new CosineNode($expression.node,$FUNC_CALL.getLine());}
   |^(FUNC_CALL Sine expression) {node = new SineNode($expression.node,$FUNC_CALL.getLine());}
   |^(FUNC_CALL Tan expression) {node = new TanNode($expression.node,$FUNC_CALL.getLine());}
   |^(FUNC_CALL ATan exprList?) {node = new ATanNode($exprList.e,$FUNC_CALL.getLine());}
   |^(FUNC_CALL Random exprList?) {node = new RandomNode($exprList.e,$FUNC_CALL.getLine());}
   |^(FUNC_CALL Pow exprList?){node = new PowFNode($exprList.e,$FUNC_CALL.getLine());}
   |^(FUNC_CALL Sqrt expression){node = new SqrtNode($expression.node,$FUNC_CALL.getLine());}
   |^(FUNC_CALL Sq expression){node = new SqNode($expression.node,$FUNC_CALL.getLine());}
   |^(FUNC_CALL Gaussian exprList?) {node = new GaussianNode($exprList.e,$FUNC_CALL.getLine());}
   |^(FUNC_CALL Noise exprList?) {node = new NoiseNode($exprList.e,$FUNC_CALL.getLine());}
   |^(FUNC_CALL Round expression) {node = new RoundNode($expression.node,$FUNC_CALL.getLine());}
   |^(FUNC_CALL Map exprList?) {node = new MapNode($exprList.e,$FUNC_CALL.getLine());}
   |^(FUNC_CALL Inch expression){node = new ConversionNode($expression.node,"inch",unitParam,$FUNC_CALL.getLine());}
   |^(FUNC_CALL Mm expression){node = new ConversionNode($expression.node,"mm",unitParam,$FUNC_CALL.getLine());}
   |^(FUNC_CALL Cm expression){node = new ConversionNode($expression.node,"cm",unitParam,$FUNC_CALL.getLine());}
   |^(FUNC_CALL Units expression){node = new ConversionNode($expression.node,"units",unitParam,$FUNC_CALL.getLine());}
   
   ;
   
  
   
   getCall returns [DCNode node]
  : ^(FUNC_CALL GetWidth expression) {node = new GetWidthNode($expression.node);}
  | ^(FUNC_CALL GetHeight expression){node = new GetHeightNode($expression.node);}
  | ^(FUNC_CALL GetX expression){node = new GetXNode($expression.node);}
  | ^(FUNC_CALL GetY expression){node = new GetYNode($expression.node);}
  | ^(FUNC_CALL GetOrigin expression){node = new GetOriginNode($expression.node);}
  | ^(FUNC_CALL GetRotation expression){node = new GetRotationNode($expression.node);}
  | ^(FUNC_CALL GetFill expression)
  | ^(FUNC_CALL GetStroke expression)
  | ^(FUNC_CALL GetStart expression)
  |^(FUNC_CALL GetEnd expression) 
  |^(FUNC_CALL GetDistance exprList?) {node = new DistanceNode($exprList.e);}
  |^(FUNC_CALL GetIntersect exprList?) {node = new IntersectNode($exprList.e);}
  |^(FUNC_CALL GetAngle exprList? ) {node = new GetAngleNode($exprList.e);}
  |^(FUNC_CALL GetRadius exprList? ) {node = new GetRadiusNode($exprList.e);}
  ;
  
  uICall returns [DCNode node]
  	: ^(FUNC_CALL Slider exprList?)  {node = new SliderNode($exprList.e,currentScope);}
  	;
  	
   templateCall returns [DCNode node]
  	: ^(FUNC_CALL Template exprList?) {node = new TemplateNode($exprList.e,$FUNC_CALL.getLine(),$FUNC_CALL.getCharPositionInLine());}
  	|^(FUNC_CALL SetWidth exprList?) {node = new TemplateSetWidthNode($exprList.e,$FUNC_CALL.getLine(),$FUNC_CALL.getCharPositionInLine());}
  	|^(FUNC_CALL SetHeight exprList?){node = new TemplateSetHeightNode($exprList.e,$FUNC_CALL.getLine(),$FUNC_CALL.getCharPositionInLine());}
  	|^(FUNC_CALL SetSeam exprList?){node = new TemplateSetSeamNode($exprList.e,$FUNC_CALL.getLine(),$FUNC_CALL.getCharPositionInLine());}
  	|^(FUNC_CALL SetName exprList?)
  	|^(FUNC_CALL SetVFold exprList?){node = new TemplateSetVFoldNode($exprList.e,$FUNC_CALL.getLine(),$FUNC_CALL.getCharPositionInLine());}
  	|^(FUNC_CALL SetHFold exprList?){node = new TemplateSetHFoldNode($exprList.e,$FUNC_CALL.getLine(),$FUNC_CALL.getCharPositionInLine());}
  	|^(FUNC_CALL SetCorner exprList?) {node = new TemplateSetCornerNode($exprList.e,$FUNC_CALL.getLine(),$FUNC_CALL.getCharPositionInLine());}
  	|^(FUNC_CALL TemplateCollection   exprList?){node = new TemplateSetCollectionNode($exprList.e,$FUNC_CALL.getLine(),$FUNC_CALL.getCharPositionInLine());}
  	|^(FUNC_CALL AddDesign exprList?){node = new TemplateAddDesignNode($exprList.e,$FUNC_CALL.getLine(),$FUNC_CALL.getCharPositionInLine());}
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
  
repeatStatement returns [DCNode node]
  : ^(Repeat Identifier a=expression b=expression (c=expression)? block) {node = new RepeatStatementNode($Identifier.text, $a.node, $b.node, $c.node, $block.node, currentScope);}
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
 	|^(DOTPROPERTY Identifier dotProperty){node = new DotPropertyNode(new IdentifierNode($Identifier.text, currentScope,$DOTPROPERTY.getLine()), $dotProperty.e);}
 
 // :  ^(DOTPROPERTY functionCall d=dotLookup[$functionCall.node]) {node = $d.node;}
  //|  ^(DOTPROPERTY Identifier d=dotLookup[new IdentifierNode($Identifier.text, currentScope)]) {node = $d.node;}
    
  
  | ^(LOOKUP functionCall i=indexes?) {node = $i.e != null ? new LookupNode($functionCall.node, $indexes.e,$LOOKUP.getLine()) : $functionCall.node;}
  |  ^(LOOKUP list i=indexes?)         {node = $i.e != null ? new LookupNode($list.node, $indexes.e, $LOOKUP.getLine()) : $list.node;}
  |  ^(LOOKUP expression i=indexes?)   {node = $i.e != null ? new LookupNode($expression.node, $indexes.e,$LOOKUP.getLine()) : $expression.node;}
  |  ^(LOOKUP Identifier i=indexes?)   {node = $i.e != null ? new LookupNode(new IdentifierNode($Identifier.text, currentScope,$LOOKUP.getLine()), $indexes.e,$LOOKUP.getLine()) : new IdentifierNode($Identifier.text, currentScope,$LOOKUP.getLine());}
  |  ^(LOOKUP String i=indexes?)       {node = $i.e != null ? new LookupNode(new AtomNode($String.text), $indexes.e,$LOOKUP.getLine()) : new AtomNode($String.text);}
 
 
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