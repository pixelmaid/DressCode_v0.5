grammar PyEsque;

options {
  output=AST;
  language = Java;
 
}

tokens {
  BLOCK;
  RETURN;
  STATEMENTS;
  ASSIGNMENT;
  FUNC_CALL;
  AND_CALL;
  ADD_CALL;
  SUB_CALL;
  EXP;	
  EXP_LIST;
  ID_LIST;
  IF;
  TERNARY;
  UNARY_MIN;
  NEGATE;
  FUNCTION;
  INDEXES;
  LIST;
  LOOKUP;
  LOOKUP_S;
  DOTLOOKUP;
  DOTPROPERTY;
  SPECIAL;
  DOT;
}

@parser::header {
  package com.pixelmaid.dresscode.antlr;
  import com.pixelmaid.dresscode.antlr.types.*; 
  import java.util.Map;
  import java.util.HashMap;
  import com.pixelmaid.dresscode.data.*;
}

@parser::members{
  public Map<String, FunctionType> functions = new HashMap<String, FunctionType>();
  public DrawableManager drawableManager;
  private int widthParam, heightParam;
  Stack paraphrases = new Stack();
  
  
  public PyEsqueParser(CommonTokenStream tokens){
  	super(tokens);

  }
  private void defineFunction(String id, Object idList, Object block) {

    // `idList` is possibly null! Create an empty tree in that case. 
    CommonTree idListTree = idList == null ? new CommonTree() : (CommonTree)idList;

    // `block` is never null.
    CommonTree blockTree = (CommonTree)block;

    // The function name with the number of parameters after it the unique key
    String key = id + idListTree.getChildCount();
    functions.put(key, new FunctionType(id, idListTree, blockTree));
    System.out.println("defined function:"+id);
  }
  //returns readable error message for user
  public String getErrorMessage(RecognitionException e, String[] tokenNames){
  	String msg = super.getErrorMessage(e, tokenNames);
  	if (paraphrases.size()>0){
  		String paraphrase = (String)paraphrases.peek();
  		msg=msg+" "+paraphrase;
  		}
  	return msg;
  }
  
  /*public String getErrorMessage(RecognitionException e, String[] tokenNames){
  	List stack = getRuleInvocationStack(e, this.getClass().getName());
  	String msg = null;
  	if (e instanceof NoViableAltException){
  		NoViableAltException nvae= (NoViableAltException)e;
  		msg = " decision="+nvae.decisionNumber+
  		" state "+nvae.stateNumber+")"+
  		" decision=<<"+nvae.grammarDecisionDescription+">>";
  	}
  	else{
  		msg=super.getErrorMessage(e,tokenNames);
  		}
  		
  	return stack+""+msg;
  
  }*/
  
  public String getTokenErrorDisplay(Token t){
  		return t.toString();
  	}
  
}

@lexer::header {
  package com.pixelmaid.dresscode.antlr;
  
}
@lexer::members {

  private int previousIndents = -1;
  private int indentLevel = 0;
  java.util.Queue<Token> tokens = new java.util.LinkedList<Token>();

  @Override
  public void emit(Token t) {
    state.token = t;
    tokens.offer(t);
  }

  @Override
  public Token nextToken() {
    super.nextToken();
    return tokens.isEmpty() ? getEOFToken() : tokens.poll();
  }

  private void jump(int ttype) {
    indentLevel += (ttype == Dedent ? -1 : 1);
    emit(new CommonToken(ttype, "level=" + indentLevel));
  }
}

parse
 : block EOF -> block 
 ;

block
@init{paraphrases.push("in block");}
@after{paraphrases.pop();}
 : Indent block_atoms Dedent -> block_atoms
 ;

block_atoms
 :(statement | functionDecl)* (Return expression )? -> ^(BLOCK ^(STATEMENTS statement*) ^(RETURN expression?))
 //:  (statement | functionDecl)*  -> ^(BLOCK ^(STATEMENTS statement*))
 ;
 
statement
@init{paraphrases.push("in statement");}
@after{paraphrases.pop();}
  :  assignment   -> assignment
  |  functionCall -> functionCall
  |  ifStatement
  |  whileStatement
  |	 repeatStatement
  |	 radialStatement
  |  spiralStatement
  |  arcStatement
  |	 rowStatement
  |  drawableRepeatStatement
  | followCurveStatement
  //|  returnStatement
  ;
  
 /* returnStatement
  	: Return expression -> ^(RETURN expression)
  	;  */
  
   assignment
   @init{paraphrases.push("in assignment");}
   @after{paraphrases.pop();}
  :  Identifier ('=' expression)?  -> ^(ASSIGNMENT Identifier expression?)
  ;
  
  functionDecl
  @init{paraphrases.push("in function declaration");}
   @after{paraphrases.pop();}
  :  Def Identifier OParen idList? CParen Do block 
     {defineFunction($Identifier.text, $idList.tree, $block.tree);}
  ;
/* functionDecl
  :  Identifier '=' '(' idList? CParen Do (statement | block)
     {if($block.text==null){
     	System.out.println("defining statement function");
     	defineFunction($Identifier.text, $idList.tree, $statement.tree);
     	
     	}
     else{
        System.out.println("defining block function");
     
     	defineFunction($Identifier.text, $idList.tree, $block.tree);
     	}
     }
  ;*/
  
 
 functionCall
 @init{paraphrases.push("in function call");}
 @after{paraphrases.pop();}
  :  Identifier OParen exprList? CParen -> ^(FUNC_CALL Identifier exprList?)
  |  Println OParen expression? CParen  -> ^(FUNC_CALL Println expression?)
  |  Print OParen expression CParen     -> ^(FUNC_CALL Print expression)
  |  Assert OParen expression CParen    -> ^(FUNC_CALL Assert expression)
  |  Size OParen expression CParen      -> ^(FUNC_CALL Size expression)
  |  LAdd OParen exprList? CParen   -> ^(FUNC_CALL LAdd exprList?) 
  |  LRemove OParen exprList? CParen   -> ^(FUNC_CALL LRemove exprList?) 
  |	 primitiveCall
  |	 transformCall
  |	 patternCall
  |	 mathCall
  | getCall
  |	uICall
  |	templateCall
  ;
  
  
  primitiveCall
  	:Ellipse OParen exprList? CParen   -> ^(FUNC_CALL Ellipse exprList?) 
  	|Line OParen exprList? CParen   -> ^(FUNC_CALL Line exprList?) 
  	|Rect OParen exprList? CParen   -> ^(FUNC_CALL Rect exprList?) 
  	|Curve OParen exprList? CParen ->  ^(FUNC_CALL Curve exprList?)
  	|Polygon OParen exprList? CParen ->  ^(FUNC_CALL Polygon exprList?)
  	|Skirt OParen exprList? CParen ->  ^(FUNC_CALL Skirt exprList?)
  	|SkirtBack OParen exprList? CParen ->  ^(FUNC_CALL SkirtBack exprList?)
    |LShape OParen exprList? CParen ->  ^(FUNC_CALL LShape exprList?)
    | Point OParen exprList? CParen ->  ^(FUNC_CALL Point exprList?)
  	;
  
  transformCall
   : Move OParen expression Comma expression Comma expression CParen  -> ^(FUNC_CALL Move OParen expression Comma expression Comma expression CParen)
   | MoveBy OParen exprList? CParen -> ^(FUNC_CALL MoveBy exprList?) 
   | Heading OParen exprList? CParen -> ^(FUNC_CALL Heading exprList?) 
   | Copy OParen expression CParen -> ^(FUNC_CALL Copy expression)
   | Rotate OParen exprList? CParen-> ^(FUNC_CALL Rotate exprList?)
   | Fill OParen exprList? CParen-> ^(FUNC_CALL Fill exprList?)
   | Stroke OParen exprList? CParen-> ^(FUNC_CALL Stroke exprList?)
   | NoFill	OParen expression CParen-> ^(FUNC_CALL NoFill expression)
   | NoStroke OParen expression CParen-> ^(FUNC_CALL NoStroke expression)
   | Weight	OParen exprList? CParen-> ^(FUNC_CALL Weight exprList?)
   | Hide	OParen expression CParen-> ^(FUNC_CALL Hide expression)
   | Show	OParen expression CParen-> ^(FUNC_CALL Show expression)
   | Group	OParen exprList? CParen-> ^(FUNC_CALL Group exprList?)
   | Expand	OParen expression CParen-> ^(FUNC_CALL Expand expression)
   | Merge	OParen expression CParen-> ^(FUNC_CALL Merge expression)
   | Scale OParen exprList? CParen-> ^(FUNC_CALL Scale exprList?)
   | MirrorX	OParen expression CParen-> ^(FUNC_CALL MirrorX expression)
   | MirrorY	OParen expression CParen-> ^(FUNC_CALL MirrorY expression)
   | Union	OParen exprList? CParen-> ^(FUNC_CALL Union exprList?)
   | Difference	OParen exprList? CParen-> ^(FUNC_CALL Difference exprList?)
   | Clip	OParen exprList? CParen-> ^(FUNC_CALL Clip exprList?)
   | Xor	OParen exprList? CParen-> ^(FUNC_CALL Xor exprList?)
   | Flatten	OParen expression CParen-> ^(FUNC_CALL Flatten expression)
   ;
   
   patternCall
   //: Grid OParen exprList? CParen -> ^(FUNC_CALL Grid exprList?)
   : Wave OParen exprList? CParen -> ^(FUNC_CALL Wave exprList?)
   //| Arc OParen exprList? CParen -> ^(FUNC_CALL Arc exprList?)
   //| FollowCurve OParenexprList? CParen -> ^(FUNC_CALL FollowCurve exprList?)
   ;
   
   getCall
  : GetWidth OParen expression CParen-> ^(FUNC_CALL GetWidth expression)
  |GetHeight OParen expression CParen-> ^(FUNC_CALL GetHeight expression)
  |GetX	OParen expression CParen-> ^(FUNC_CALL GetX expression)
  |GetY OParen expression CParen-> ^(FUNC_CALL GetY expression)
  |GetOrigin OParen expression CParen-> ^(FUNC_CALL GetOrigin expression)
  |GetRotation OParen expression CParen-> ^(FUNC_CALL GetRotation expression)
  |GetFill OParen expression CParen-> ^(FUNC_CALL GetFill expression)
  |GetStroke OParen expression CParen-> ^(FUNC_CALL GetStroke expression)
  |GetStart OParen expression CParen-> ^(FUNC_CALL GetStart expression)
  |GetEnd OParen expression CParen-> ^(FUNC_CALL GetEnd expression) 
  |GetDistance OParen exprList?  CParen-> ^(FUNC_CALL GetDistance exprList? ) 
  |GetIntersect OParen exprList?  CParen-> ^(FUNC_CALL GetIntersect exprList? ) 
  |GetAngle OParen exprList?  CParen-> ^(FUNC_CALL GetAngle exprList? ) 
  |GetRadius OParen exprList?  CParen-> ^(FUNC_CALL GetRadius exprList? ) 
  ;
   
   mathCall
   	:Cosine OParen expression CParen   -> ^(FUNC_CALL Cosine expression)
   	|Sine OParen expression CParen   -> ^(FUNC_CALL Sine expression)
   	|Tan OParen expression CParen   -> ^(FUNC_CALL Tan expression)
   	|ATan OParen exprList? CParen   -> ^(FUNC_CALL ATan exprList?)
   	|Random OParen exprList? CParen   -> ^(FUNC_CALL Random exprList?)
   	|Pow OParen exprList? CParen   -> ^(FUNC_CALL Pow exprList?)
   	|Sqrt OParen expression CParen   -> ^(FUNC_CALL Sqrt expression)
   	|Sq OParen expression CParen   -> ^(FUNC_CALL Sq expression)
   	|Gaussian OParen exprList? CParen   -> ^(FUNC_CALL Gaussian exprList?)
   	|Noise OParen exprList? CParen   -> ^(FUNC_CALL Noise exprList?)
   	|Round OParen expression CParen   -> ^(FUNC_CALL Round expression)
   	|Map OParen exprList? CParen   -> ^(FUNC_CALL Map exprList?)
   	|Inch OParen expression CParen   -> ^(FUNC_CALL Inch expression)
   	|Mm OParen expression CParen   -> ^(FUNC_CALL Mm expression)
   	|Cm OParen expression CParen   -> ^(FUNC_CALL Cm expression)
   	|Units OParen expression CParen   -> ^(FUNC_CALL Units expression)
   	;
  
  uICall
  	:Slider OParen exprList? CParen   -> ^(FUNC_CALL Slider exprList?) 
  	;
  	
  templateCall
  	:Template OParen exprList? CParen   -> ^(FUNC_CALL Template exprList?)
  	|SetWidth OParen exprList? CParen   -> ^(FUNC_CALL SetWidth exprList?)
  	|SetHeight OParen exprList? CParen   -> ^(FUNC_CALL SetHeight exprList?)
  	|SetSeam OParen exprList? CParen   -> ^(FUNC_CALL SetSeam exprList?)
  	|SetName OParen exprList? CParen   -> ^(FUNC_CALL SetName exprList?)
  	|SetVFold OParen exprList? CParen   -> ^(FUNC_CALL SetVFold exprList?)
  	|SetHFold OParen exprList? CParen   -> ^(FUNC_CALL SetHFold exprList?)
  	|SetCorner OParen exprList? CParen   -> ^(FUNC_CALL SetCorner exprList?)
  	|TemplateCollection OParen   exprList? CParen   -> ^(FUNC_CALL TemplateCollection   exprList?)
  	|AddDesign OParen exprList? CParen   -> ^(FUNC_CALL AddDesign exprList?)
  	;
  	
 
 ifStatement
  :  ifStat elseIfStat* elseStat? -> ^(IF ifStat elseIfStat* elseStat?)
  ;



ifStat
  :  If expression Do block -> ^(EXP expression block)
  ;

elseIfStat
  :  Else If expression Do block -> ^(EXP expression block)
  ;

elseStat
  :  Else Do block -> ^(EXP block)
  ;
 
 
 repeatStatement
  @init{paraphrases.push("in repeat statement");}
 @after{paraphrases.pop();}
  : Repeat Identifier '=' expression Do expression ('add' expression)* Do block -> ^(Repeat Identifier expression expression (expression)? block)
  ;
  drawableRepeatStatement
  @init{paraphrases.push("in drawable repeat statement");}
  @after{paraphrases.pop();}
  : Repeat Identifier ',' Identifier '=' expression Do block -> ^(Repeat Identifier Identifier expression block)
  ;

 radialStatement
  @init{paraphrases.push("in radial statement");}
 @after{paraphrases.pop();}
  : Radial Identifier ',' Identifier '=' expression ',' Identifier '=' expression Do block -> ^(Radial Identifier Identifier expression Identifier expression block)
  ;
  
   spiralStatement
  @init{paraphrases.push("in radial statement");}
 @after{paraphrases.pop();}
  : Spiral Identifier ',' Identifier '=' expression ',' Identifier '=' expression Do block -> ^(Spiral Identifier Identifier expression Identifier expression block)
  ;
  
   rowStatement
  @init{paraphrases.push("in radial statement");}
 @after{paraphrases.pop();}
  : Row Identifier ',' Identifier '=' expression ',' Identifier '=' expression Do block -> ^(Row Identifier Identifier expression Identifier expression block)
  ;
  
   arcStatement
  @init{paraphrases.push("in radial statement");}
 @after{paraphrases.pop();}
  : Arc Identifier ',' Identifier '=' expression ',' Identifier '=' expression ',' Identifier '=' expression Do block -> ^(Arc Identifier Identifier expression Identifier expression Identifier expression block)
  ;
  
  followCurveStatement
  @init{paraphrases.push("in curve statement");}
 @after{paraphrases.pop();}
  : FollowCurve Identifier ',' statement ',' Identifier '=' expression Do block -> ^(FollowCurve Identifier statement Identifier expression block)
  ;
  
whileStatement
  :  While expression Do block -> ^(While expression block)
  ;
 
 expression
  @init{paraphrases.push("in expression");}
 @after{paraphrases.pop();}
  :  condExpr
  ;
  
  exprList
  :  expression (',' expression)* -> ^(EXP_LIST expression+)
  ;
  

condExpr
  :  (orExpr -> orExpr) 
     ( '?' a=expression ':' b=expression -> ^(TERNARY orExpr $a $b)
     | In expression                     -> ^(In orExpr expression)
     )?
  ;

orExpr
  :  andExpr ('||'^ andExpr)*
  ;

andExpr
  :  equExpr ('&&'^ equExpr)*
  ;

equExpr
  :  relExpr (('==' | '!=')^ relExpr)*
  ;

relExpr
  :  addExpr (('>=' | '<=' | '>' | '<')^ addExpr)*
  ;

addExpr
  :  mulExpr (('+' | '-')^ mulExpr)*
  ;

mulExpr
  :  powExpr (('*' | '/' | '%')^ powExpr)*
  ;

powExpr
  :  unaryExpr ('^'^ unaryExpr)*
  ;
  
unaryExpr
  :  '-' atom -> ^(UNARY_MIN atom)
  |  '!' atom -> ^(NEGATE atom)
  |  atom
  ;

atom
  :  Number
  |  Bool
  |  Null
  |  lookup
  | COLOR_CONSTANT
  | PI_CONSTANT
  | WIDTH_CONSTANT
  | HEIGHT_CONSTANT
  ;
  
 list
  :  '[' exprList? ']' -> ^(LIST exprList?)
  ;
 
  indexes
  :  ('[' expression ']')+ -> ^(INDEXES expression+)
  ;
 
 lookup
  : functionCall indexes?  -> ^(LOOKUP functionCall indexes?)      
  |list indexes?               -> ^(LOOKUP list indexes?)
  |  Identifier indexes?  -> ^(LOOKUP Identifier indexes?)
  |  String indexes?             -> ^(LOOKUP String indexes?)
  |  OParen expression CParen indexes? -> ^(LOOKUP expression indexes?) 
  ;
  
  idList
  :  Identifier (',' Identifier)* -> ^(ID_LIST Identifier+)
  ;
  


   //shape primitives 
Ellipse	: 'ellipse';
Rect	: 'rect';
Line	: 'line';
Curve	: 'curve';
Quad	: 'quad';
Point	: 'point';
Triangle: 'triangle';
Polygon	: 'poly';
Skirt : 'skirt'; 
SkirtBack : 'skirtback';
LShape	: 'import';

//math keywords
Cosine	:'cos';
Sine	: 'sin';
Tan		: 'tan';
ATan	: 'atan';
Sqrt	: 'sqrt';
Pow		: 'pow';
Sq		: 'sq';
Random 	: 'random';
Round	: 'round';
Gaussian: 'gaussianNoise';
Noise	: 'noise';
Map		: 'map';
Inch      : 'inch';
Mm	    : 'mm';
Cm	    : 'cm';
Units	: 'units';


//transforms
Move	: 'moveTo';
MoveBy	: 'moveBy';
Heading	: 'headingBy';
Copy	: 'copy';
Rotate	: 'rotate';
Scale	: 'scale';
Fill : 'fill';
Stroke : 'stroke';
NoFill	: 'noFill';
NoStroke : 'noStroke';
Weight	: 'weight';
Hide	: 'hide';
Show	: 'show';
Group	: 'group';
Expand 	: 'expand';
Merge	: 'merge';
MirrorX	: 'mirrorX';
MirrorY: 'mirrorY';
Union: 'union';
Difference: 'diff';
Clip	: 'clip';
Xor	:'xor';
Flatten : 'flatten';

//patterns
//Grid	: 'grid';
Wave	: 'wave';
//Spiral	: 'spiral';

FollowCurve: 'followCurve';

//UIcommands
Slider	: 'slider';

//Template commands
Template	: 'template';
SetWidth	: 'setWidth';
SetHeight	: 'setHeight';
SetSeam		: 'setSeam';
SetCorner	: 'setCorner';
SetName		: 'setName';
SetVFold	: 'setVFold';
SetHFold	: 'setHFold';
AddDesign	: 'addDesign';
TemplateCollection	: 'templateCollection';
 
//getMethods
GetWidth: 'getWidth';
GetHeight: 'getHeight';
GetX: 'getX';
GetY: 'getY';
GetOrigin: 'getOrigin';
GetRotation: 'getRotation';
GetAngle	: 'getAngle';
GetRadius	: 'getRadius';
GetFill: 'getFill';
GetStroke: 'getStroke';
GetStart: 'getStart';
GetEnd: 'getEnd';
GetDistance: 'getDist';
GetIntersect: 'getIntersect';

COLOR_CONSTANT: 'RED'|'BLUE'|'GREEN'|'PURPLE'|'YELLOW'|'ORANGE'|'PINK'|'BLACK'|'WHITE'|'GREY';

WIDTH_CONSTANT: 'WIDTH';
HEIGHT_CONSTANT: 'HEIGHT';

PI_CONSTANT: 'PI';

//add and removal methods for list
LAdd	: 'add';
LRemove : 'remove';

Println  : 'println';
Print    : 'print';
Assert   : 'assert';
Size     : 'size';


Def      :  'function'{
System.out.println("entered function");
}
		;
If       : 'if';
Else     : 'else';
Return   : 'return';
Repeat	 : 'repeat';
Radial	 : 'radial';
Spiral	 : 'spiral';
Row		 : 'row';
Arc		: 'arc';
While    : 'while';
To       : 'to';
Do       : ':';
In       : 'in';
Null     : 'null';


Or       : 'or';
And      : 'and';
Equals   : '==';
NEquals  : '!=';
GTEquals : '>=';
LTEquals : '<=';
Pw       : '^';
Excl     : '!';
GT       : '>';
LT       : '<';
Add      : '+';
Subtract : '-';
Multiply : '*';
Divide   : '/';
Modulus  : '%';
OBrace   : '{';
CBrace   : '}';
OBracket : '[';
CBracket : ']';
OParen   : '(';
CParen   : ')';
//SColon   : ';';
Assign   : '=';
Comma    : ',';
QMark    : '?';
//Colon    : ':';
Dot	: '.';

Bool
  :  'true' 
  |  'false'
  ;

Number
  :  Int (Dot Digit*)?
  ;
  
Identifier
  :  ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | Digit)*
  ;
 
 
 String
@after {
  setText(getText().substring(1, getText().length()-1).replaceAll("\\\\(.)", "$1"));
}
  :  '"'  (~('"' | '\\')  | '\\' ('\\' | '"'))* '"' 
  |  '\'' (~('\'' | '\\') | '\\' ('\\' | '\''))* '\''
  ;

Comment
  :  '//' ~('\n'|'\r')* {skip();}
  |  '/*' .* '*/'         {skip();}
  ; 
 



SemiColon
	:';'{skip();}
	;


SpaceChars
 : SP {skip();}
 
 ;
 
 NewLine
 @init {
  //System.out.println("Newline new text= "+input.LA(2));
}
 : NL SP? 
   {
     int n = $SP.text == null ? 0 : $SP.text.length();
     if(n > previousIndents) {
       jump(Indent);
       previousIndents = n;
     }
     else if(n < previousIndents) {
       jump(Dedent);
       previousIndents = n;
     }
     else if(input.LA(1) == EOF) {
       while(indentLevel > 0) {
         jump(Dedent);
       }
     }
     else {
       skip();
     }
   }
 ;
 
 //WS  :   ('\r' | '\n' )+   { $channel = HIDDEN; } ;

fragment Int
  :  '1'..'9' Digit*
  |  '0'
  ;
  
fragment Digit 
  :  '0'..'9'
  ;
fragment NL     : '\r'? '\n' | '\r';
fragment SP     : (' ' | '\t')+;
fragment Indent : ;
fragment Dedent : ;