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
}

@parser::header {
  package com.pixelmaid.dresscode.antlr;
  import com.pixelmaid.dresscode.antlr.types.*; 
  import java.util.Map;
  import java.util.HashMap;
}

@lexer::header {
  package com.pixelmaid.dresscode.antlr;
}

@parser::members {
  public Map<String, FunctionType> functions = new HashMap<String, FunctionType>();
  
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


parse
  :  block EOF -> block
  ;

block
  :  (statement | functionDecl)* (Return expression ';')? 
     -> ^(BLOCK ^(STATEMENTS statement*) ^(RETURN expression?))
  ;

statement
  :  assignment ';'   -> assignment
  |  functionCall ';' -> functionCall
  |  ifStatement
  |  forStatement
  |  whileStatement
  ;

assignment
  :  Identifier indexes? '=' expression  -> ^(ASSIGNMENT Identifier indexes? expression)
  |  
  ;

functionCall
  :  Identifier '(' exprList? ')' -> ^(FUNC_CALL Identifier exprList?)
  |  Println '(' expression? ')'  -> ^(FUNC_CALL Println expression?)
  |  Print '(' expression ')'     -> ^(FUNC_CALL Print expression)
  |  Assert '(' expression ')'    -> ^(FUNC_CALL Assert expression)
  |  Size '(' expression ')'      -> ^(FUNC_CALL Size expression)
  |	 primitiveCall
  |	 transformCall
  |	 mathCall
  ;
  
  
  primitiveCall
  	:Ellipse '(' exprList? ')'   -> ^(FUNC_CALL Ellipse exprList?) 
  	|Line '(' exprList? ')'   -> ^(FUNC_CALL Line exprList?) 
  	|Rect '(' exprList? ')'   -> ^(FUNC_CALL Rect exprList?) 
  	|Curve '(' exprList? ')' ->  ^(FUNC_CALL Curve exprList?)
  	|Polygon '(' exprList? ')' ->  ^(FUNC_CALL Polygon exprList?)
  	;
  
  transformCall
   : Move '(' exprList? ')' -> ^(FUNC_CALL Move exprList?) 
   | Copy '(' expression ')' -> ^(FUNC_CALL Copy expression)
   | Rotate '(' exprList? ')'-> ^(FUNC_CALL Rotate exprList?)
   | Fill '(' exprList? ')'-> ^(FUNC_CALL Fill exprList?)
   | Stroke '(' exprList? ')'-> ^(FUNC_CALL Stroke exprList?)
   | NoFill	'(' expression ')'-> ^(FUNC_CALL NoFill expression)
   | NoStroke '(' expression ')'-> ^(FUNC_CALL NoStroke expression)
   | Weight	'(' exprList? ')'-> ^(FUNC_CALL Weight exprList?)
   | Hide	'(' expression ')'-> ^(FUNC_CALL Hide expression)
   ;
   
   mathCall
   	:Cosine '(' expression ')'   -> ^(FUNC_CALL Cosine expression)
   	|Sine '(' expression ')'   -> ^(FUNC_CALL Sine expression)
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
  :  Def Identifier '(' idList? ')' block End 
     {defineFunction($Identifier.text, $idList.tree, $block.tree);}
  ;

forStatement
  :  For Identifier '=' expression To expression Do block End 
     -> ^(For Identifier expression expression block)
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
  ;

list
  :  '[' exprList? ']' -> ^(LIST exprList?)
  ;

lookup
  :  functionCall indexes?       -> ^(LOOKUP functionCall indexes?)
  |  list indexes?               -> ^(LOOKUP list indexes?)
  |  Identifier indexes?         -> ^(LOOKUP Identifier indexes?)
  |  String indexes?             -> ^(LOOKUP String indexes?)
  |  '(' expression ')' indexes? -> ^(LOOKUP expression indexes?)
  |	 forStatement indexes?		 -> ^(LOOKUP forStatement indexes?)
  ;

indexes
  :  ('[' expression ']')+ -> ^(INDEXES expression+)
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

//math keywords
Cosine	:'cos';
Sine	: 'sin';

//transforms
Move	: 'move';
Copy	: 'copy';
Rotate	: 'rotate';
Scale	: 'scale';
Fill : 'fill';
Stroke : 'stroke';
NoFill	: 'noFill';
NoStroke : 'noStroke';
Weight	: 'weight';
Hide	: 'hide';


COLOR_CONSTANT: 'RED'|'BLUE'|'GREEN'|'PURPLE'|'YELLOW'|'ORANGE'|'PINK'|'BLACK'|'WHITE'|'GREY';

PI_CONSTANT: 'PI';

Println  : 'println';
Print    : 'print';
Assert   : 'assert';
Size     : 'size';
Def      : 'def';
If       : 'if';
Else     : 'else';
Return   : 'return';
For      : 'for';
While    : 'while';
To       : 'to';
Do       : 'do';
End      : 'end';
In       : 'in';
Null     : 'null';

Or       : '||';
And      : '&&';
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
SColon   : ';';
Assign   : '=';
Comma    : ',';
QMark    : '?';
Colon    : ':';

Bool
  :  'true' 
  |  'false'
  ;

Number
  :  Int ('.' Digit*)?
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
  :  '//' ~('\r' | '\n')* {skip();}
  |  '/*' .* '*/'         {skip();}
  ;

Space
  : (' '| '\t'|'\n'|'\r'|'\f')+{$channel = HIDDEN;}
  ;

fragment Int
  :  '1'..'9' Digit*
  |  '0'
  ;
  
fragment Digit 
  :  '0'..'9'
  ;