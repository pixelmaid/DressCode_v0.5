					grammar Pogo;

options {
  output=AST;
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

@lexer::header {
  package com.pixelmaid.dresscode.antlr;
}

@parser::members {
  public Map<String, FunctionType> functions = new HashMap<String, FunctionType>();
  public DrawableManager drawableManager;
  private int widthParam, heightParam;
  
  public PogoParser(CommonTokenStream tokens){
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

@lexer::members{
int implicitLineJoiningLevel = 0;
int startPos=-1;
}

parse
  :  block EOF -> block
  ;

block
  : (statement | functionDecl)* (Return expression ';')? 
     -> ^(BLOCK ^(STATEMENTS statement*) ^(RETURN expression?))
  ;

statement
  :  assignment ';'   -> assignment
  |  functionCall ';'  -> functionCall
  |  ifStatement
  |  forStatement
  |  whileStatement
  |	 repeatStatement
  ;

assignment
  :  Identifier indexes? ('=' expression)?  -> ^(ASSIGNMENT Identifier indexes? expression?)
  | 
  ;

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
  ;
   
   mathCall
   	:Cosine '(' expression ')'   -> ^(FUNC_CALL Cosine expression)
   	|Sine '(' expression ')'   -> ^(FUNC_CALL Sine expression)
   	|Tan '(' expression ')'   -> ^(FUNC_CALL Tan expression)
   	|ATan '(' expression ')'   -> ^(FUNC_CALL ATan expression)
   	|Random '(' exprList? ')'   -> ^(FUNC_CALL Random exprList?)
   	|Round'(' expression ')'   -> ^(FUNC_CALL Round expression)
   	|Map'(' exprList? ')'   -> ^(FUNC_CALL Map exprList?)
   	|Inch '(' expression ')'   -> ^(FUNC_CALL Inch expression)
   	|Mm '(' expression ')'   -> ^(FUNC_CALL Mm expression)
   	|Cm '(' expression ')'   -> ^(FUNC_CALL Cm expression)
   	|Units'(' expression ')'   -> ^(FUNC_CALL Units expression)
   	;
  
  

ifStatement
  :  ifStat elseIfStat* elseStat? End -> ^(IF ifStat elseIfStat* elseStat?)
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

functionDecl
  :  Def Identifier '(' idList? ')' Do block End 
     {defineFunction($Identifier.text, $idList.tree, $block.tree);}
  ;

forStatement
  :  For Identifier '=' expression Do expression Do block End 
     -> ^(For Identifier expression expression block)
  ;

repeatStatement
  : Repeat Identifier '=' expression Do expression ('add' expression)* Do block End -> ^(Repeat Identifier expression expression (expression)? block)
  ;

whileStatement
  :  While expression Do block End -> ^(While expression block)
  ;

idList
  :  Identifier (',' Identifier)* -> ^(ID_LIST Identifier+)
  ;

exprList
  :  expression (',' expression)* -> ^(EXP_LIST expression+)
  ;

expression
  :  condExpr
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

lookup
  :  functionCall (indexes?  -> ^(LOOKUP functionCall indexes?) | dotProperty  -> ^(DOTPROPERTY functionCall dotProperty))      
  |  list indexes?               -> ^(LOOKUP list indexes?)
  |  Identifier (indexes?  -> ^(LOOKUP Identifier indexes?) | dotProperty  -> ^(DOTPROPERTY Identifier dotProperty)) 
  |  String indexes?             -> ^(LOOKUP String indexes?)
  |  '(' expression ')' indexes? -> ^(LOOKUP expression indexes?)
  //|	 forStatement indexes?		 -> ^(LOOKUP forStatement indexes?)
  //|  repeatStatement indexes?	 -> ^(LOOKUP repeatStatement indexes?)
  //|  whileStatement indexes?	 -> ^(LOOKUP whileStatement indexes?)
  
  ;
  
   indexes
  :  ('[' expression ']')+ -> ^(INDEXES expression+)
  ;
	  
  dotProperty
  :  (dotExpression)+ -> ^(DOT dotExpression+)
  ;	 
 
  //being depreciated
  dotExpression
  : DotX
  | DotY
  | DotStart
  | DotEnd
  | DotOrigin
  | DotRotation
  | DotWidth
  | DotHeight
  | DotFill
  |	DotStroke
  | DotWeight
  ;

 

 
	  
/*  
property
  : X
  | Y
  | Start
  | End
  | Origin
  | Rotation
  | Width
  | Height
  | Fill
  |	Stroke
  | Weight
  ;
  */
  
 
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
Random 	: 'random';
Round	: 'round';
Map		: 'map';
Inch      : 'inch';
Mm	    : 'mm';
Cm	    : 'cm';
Units	: 'units';


//transforms
Move	: 'move';
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

//patterns
Grid	: 'grid';
Wave	: 'wave';
Spiral	: 'spiral';
Arc	: 'arc';
 
//getMethods
GetWidth: 'getWidth';
GetHeight: 'getHeight';
GetX: 'getX';
GetY: 'getY';
GetOrigin: 'getOrigin';
GetRotation: 'getRotation';
GetFill: 'getFill';
GetStroke: 'getStroke';
GetStart: 'getStart';
GetEnd: 'getEnd';
GetDistance: 'dist';
GetIntersect: 'intersects';





//properties
   DotX	: '.x';
  DotY		: '.y';
  DotStart	: '.start';
  DotEnd	: '.end';
  DotOrigin	: '.origin';
  DotRotation	: '.rotation';
 DotWidth : '.width';
 DotHeight : '.height';
 DotStroke	:	'.stroke';
 DotFill	: '.fill';
 DotWeight	: '.weight';


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
Def      : 'def';
If       : 'if';
Else     : 'else';
Return   : 'return';
For      : 'for';
Repeat	 : 'repeat';
While    : 'while';
To       : 'to';
Do       : ':';
End		:'end';
In       : 'in';
Null     : 'null';

Or       : 'or';
And      : 'and';
Equals   : '==';
NEquals  : '!=';
GTEquals : '>=';
LTEquals : '<=';
Pow      : '^';
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

Space
  : (' '| '\t'|'\r'|'\f'|'\n')+{$channel = HIDDEN;}
  ;


/*

CONTINUED_LINE
    :    '\\' ('\r')? '\n' (' '|'\t')*  { $channel=HIDDEN; }
         ( nl=NEWLINE {emit(new ClassicToken(NEWLINE,nl.getText()));}
         |
         )
    ;


NEWLINE
    :   (('\u000C')?('\r')? '\n' )+
        {if ( startPos==0 || implicitLineJoiningLevel>0 )
            $channel=HIDDEN;
        }
    ;
    

LEADING_WS
@init {
    int spaces = 0;
}
    :   {startPos==0}?=>
        (   {implicitLineJoiningLevel>0}? ( ' ' | '\t' )+ {$channel=HIDDEN;}
           |    (     ' '  { spaces++; }
            |    '\t' { spaces += 8; spaces -= (spaces \% 8); }
               )+
            {
            // make a string of n spaces where n is column number - 1
            char[] indentation = new char[spaces];
            for (int i=0; i<spaces; i++) {
                indentation[i] = ' ';
            }
            String s = new String(indentation);
            emit(new ClassicToken(LEADING_WS,new String(indentation)));
            }
            // kill trailing newline if present and then ignore
            ( ('\r')? '\n' {if (token!=null) token.setChannel(HIDDEN); else $channel=HIDDEN;})*
           // {token.setChannel(99); }
        )
    ;
    */
fragment Int
  :  '1'..'9' Digit*
  |  '0'
  ;
  
fragment Digit 
  :  '0'..'9'
  ;