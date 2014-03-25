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
 : Indent block_atoms Dedent -> block_atoms
 ;

block_atoms
 :(statement | functionDecl)* (Return expression )? -> ^(BLOCK ^(STATEMENTS statement*) ^(RETURN expression?))
 //:  (statement | functionDecl)*  -> ^(BLOCK ^(STATEMENTS statement*))
 ;
 
statement
  :  assignment   -> assignment
  |  functionCall -> functionCall
  |  ifStatement
  |  whileStatement
  |	 repeatStatement
  //|  returnStatement
  ;
  
 /* returnStatement
  	: Return expression -> ^(RETURN expression)
  	;  */
  
   assignment
  :  Identifier ('=' expression)?  -> ^(ASSIGNMENT Identifier expression?)
  ;
  
  functionDecl
  :  Def Identifier '(' idList? ')' Do block 
     {defineFunction($Identifier.text, $idList.tree, $block.tree);}
  ;
/* functionDecl
  :  Identifier '=' '(' idList? ')' Do (statement | block)
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
  :  Identifier '(' exprList? ')' -> ^(FUNC_CALL Identifier exprList?)
  |  Println '(' expression? ')'  -> ^(FUNC_CALL Println expression?)
  |  Print '(' expression ')'     -> ^(FUNC_CALL Print expression)
  |  Assert '(' expression ')'    -> ^(FUNC_CALL Assert expression)
  |  Size '(' expression ')'      -> ^(FUNC_CALL Size expression)
  |  LAdd '(' exprList? ')'   -> ^(FUNC_CALL LAdd exprList?) 
  |  LRemove '(' exprList? ')'   -> ^(FUNC_CALL LRemove exprList?) 
  |	 primitiveCall
  |	 transformCall
  |	 patternCall
  |	 mathCall
  | getCall
  |	uICall
  |	templateCall
  ;
  
  
  primitiveCall
  	:Ellipse '(' exprList? ')'   -> ^(FUNC_CALL Ellipse exprList?) 
  	|Line '(' exprList? ')'   -> ^(FUNC_CALL Line exprList?) 
  	|Rect '(' exprList? ')'   -> ^(FUNC_CALL Rect exprList?) 
  	|Curve '(' exprList? ')' ->  ^(FUNC_CALL Curve exprList?)
  	|Polygon '(' exprList? ')' ->  ^(FUNC_CALL Polygon exprList?)
  	|Skirt '(' exprList? ')' ->  ^(FUNC_CALL Skirt exprList?)
  	|SkirtBack '(' exprList? ')' ->  ^(FUNC_CALL SkirtBack exprList?)
    |LShape '(' exprList? ')' ->  ^(FUNC_CALL LShape exprList?)
    | Point '(' exprList? ')' ->  ^(FUNC_CALL Point exprList?)
  	;
  
  transformCall
   : Move '(' exprList? ')' -> ^(FUNC_CALL Move exprList?)
   | MoveBy '(' exprList? ')' -> ^(FUNC_CALL MoveBy exprList?) 
   | Heading '(' exprList? ')' -> ^(FUNC_CALL Heading exprList?) 
   | Copy '(' expression ')' -> ^(FUNC_CALL Copy expression)
   | Rotate '(' exprList? ')'-> ^(FUNC_CALL Rotate exprList?)
   | Fill '(' exprList? ')'-> ^(FUNC_CALL Fill exprList?)
   | Stroke '(' exprList? ')'-> ^(FUNC_CALL Stroke exprList?)
   | NoFill	'(' expression ')'-> ^(FUNC_CALL NoFill expression)
   | NoStroke '(' expression ')'-> ^(FUNC_CALL NoStroke expression)
   | Weight	'(' exprList? ')'-> ^(FUNC_CALL Weight exprList?)
   | Hide	'(' expression ')'-> ^(FUNC_CALL Hide expression)
   | Show	'(' expression ')'-> ^(FUNC_CALL Show expression)
   | Group	'(' exprList? ')'-> ^(FUNC_CALL Group exprList?)
   | Expand	'(' expression ')'-> ^(FUNC_CALL Expand expression)
   | Merge	'(' expression ')'-> ^(FUNC_CALL Merge expression)
   | Scale '(' exprList? ')'-> ^(FUNC_CALL Scale exprList?)
   | MirrorX	'(' expression ')'-> ^(FUNC_CALL MirrorX expression)
   | MirrorY	'(' expression ')'-> ^(FUNC_CALL MirrorY expression)
   | Union	'(' exprList? ')'-> ^(FUNC_CALL Union exprList?)
   | Difference	'(' exprList? ')'-> ^(FUNC_CALL Difference exprList?)
   | Clip	'(' exprList? ')'-> ^(FUNC_CALL Clip exprList?)
   | Xor	'(' exprList? ')'-> ^(FUNC_CALL Xor exprList?)
   | Flatten	'(' expression ')'-> ^(FUNC_CALL Flatten expression)
   ;
   
   patternCall
   : Grid '(' exprList? ')' -> ^(FUNC_CALL Grid exprList?)
   | Wave '(' exprList? ')' -> ^(FUNC_CALL Wave exprList?)
   | Arc '(' exprList? ')' -> ^(FUNC_CALL Arc exprList?)
   ;
   
   getCall
  : GetWidth '(' expression ')'-> ^(FUNC_CALL GetWidth expression)
  |GetHeight '(' expression ')'-> ^(FUNC_CALL GetHeight expression)
  |GetX	'(' expression ')'-> ^(FUNC_CALL GetX expression)
  |GetY '(' expression ')'-> ^(FUNC_CALL GetY expression)
  |GetOrigin '(' expression ')'-> ^(FUNC_CALL GetOrigin expression)
  |GetRotation '(' expression ')'-> ^(FUNC_CALL GetRotation expression)
  |GetFill '(' expression ')'-> ^(FUNC_CALL GetFill expression)
  |GetStroke '(' expression ')'-> ^(FUNC_CALL GetStroke expression)
  |GetStart '(' expression ')'-> ^(FUNC_CALL GetStart expression)
  |GetEnd '(' expression ')'-> ^(FUNC_CALL GetEnd expression) 
  |GetDistance '(' exprList?  ')'-> ^(FUNC_CALL GetDistance exprList? ) 
  |GetIntersect'(' exprList?  ')'-> ^(FUNC_CALL GetIntersect exprList? ) 
  |GetAngle'(' exprList?  ')'-> ^(FUNC_CALL GetAngle exprList? ) 
  |GetRadius'(' exprList?  ')'-> ^(FUNC_CALL GetRadius exprList? ) 
  ;
   
   mathCall
   	:Cosine '(' expression ')'   -> ^(FUNC_CALL Cosine expression)
   	|Sine '(' expression ')'   -> ^(FUNC_CALL Sine expression)
   	|Tan '(' expression ')'   -> ^(FUNC_CALL Tan expression)
   	|ATan '(' exprList? ')'   -> ^(FUNC_CALL ATan exprList?)
   	|Random '(' exprList? ')'   -> ^(FUNC_CALL Random exprList?)
   	|Pow '(' exprList? ')'   -> ^(FUNC_CALL Pow exprList?)
   	|Sqrt '(' expression ')'   -> ^(FUNC_CALL Sqrt expression)
   	|Sq '(' expression ')'   -> ^(FUNC_CALL Sq expression)
   	|Gaussian '(' exprList? ')'   -> ^(FUNC_CALL Gaussian exprList?)
   	|Noise '(' exprList? ')'   -> ^(FUNC_CALL Noise exprList?)
   	|Round'(' expression ')'   -> ^(FUNC_CALL Round expression)
   	|Map'(' exprList? ')'   -> ^(FUNC_CALL Map exprList?)
   	|Inch '(' expression ')'   -> ^(FUNC_CALL Inch expression)
   	|Mm '(' expression ')'   -> ^(FUNC_CALL Mm expression)
   	|Cm '(' expression ')'   -> ^(FUNC_CALL Cm expression)
   	|Units'(' expression ')'   -> ^(FUNC_CALL Units expression)
   	;
  
  uICall
  	:Slider '(' exprList? ')'   -> ^(FUNC_CALL Slider exprList?) 
  	;
  	
  templateCall
  	:Template '(' exprList? ')'   -> ^(FUNC_CALL Template exprList?)
  	|SetWidth '(' exprList? ')'   -> ^(FUNC_CALL SetWidth exprList?)
  	|SetHeight '(' exprList? ')'   -> ^(FUNC_CALL SetHeight exprList?)
  	|SetSeam '(' exprList? ')'   -> ^(FUNC_CALL SetSeam exprList?)
  	|SetName '(' exprList? ')'   -> ^(FUNC_CALL SetName exprList?)
  	|SetVFold '(' exprList? ')'   -> ^(FUNC_CALL SetVFold exprList?)
  	|SetHFold '(' exprList? ')'   -> ^(FUNC_CALL SetHFold exprList?)
  	|SetCorner '(' exprList? ')'   -> ^(FUNC_CALL SetCorner exprList?)
  	|TemplateCollection '('   exprList? ')'   -> ^(FUNC_CALL TemplateCollection   exprList?)
  	|AddDesign'(' exprList? ')'   -> ^(FUNC_CALL AddDesign exprList?)
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
  : Repeat Identifier '=' expression Do expression ('add' expression)* Do block -> ^(Repeat Identifier expression expression (expression)? block)
  ;

whileStatement
  :  While expression Do block -> ^(While expression block)
  ;
 
 expression
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
  |  '(' expression ')' indexes? -> ^(LOOKUP expression indexes?) 
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
Grid	: 'grid';
Wave	: 'wave';
Spiral	: 'spiral';
Arc	: 'arc';

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
Def      : 'function';
If       : 'if';
Else     : 'else';
Return   : 'return';
Repeat	 : 'repeat';
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
 

NewLine
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
 
SemiColon
	:';'{skip();}
	;


SpaceChars
 : SP {skip();}
 ;

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