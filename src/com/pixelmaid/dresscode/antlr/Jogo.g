grammar Jogo;

options {
  language = Java;
  output=AST;
 
}

tokens {
	PROGRAM;
	FUNC_DECL;
	FUNC_CALL;
	PARAM;
	NEGATION;
	POSTINCREMENT;
	POSTDECREMENT;
	VAR_DECL;
	VAR_CALL;
	IF_STATEMENT;
	ELSEIF_STATEMENT;
	ELSE_STATEMENT;
}
@header {
  package com.pixelmaid.dresscode.antlr;
}

@lexer::header {
  package com.pixelmaid.dresscode.antlr;
}

//Parser Rules
program
	:'program' IDENT
		 (script)*
		'end' IDENT -> ^(PROGRAM script*)
	;

script
	:atom
	|function
	;

atom	
	:variable 
	| statement 
	| typeDecl
	;
	
function
	: 'function' IDENT '(' parameters? ')'
		(atom)*
		(returnStatement)*
		'end' IDENT -> ^(FUNC_DECL IDENT parameters? (atom)* (returnStatement)*)
		;

parameters
	: parameter (',' parameter)*
	;
	
parameter
	:	^(type IDENT)
	;
	
statement
	: assignmentStatement
	| ifStatement
	| loopStatement
	| whileStatement
	| functionCallStatement
	;
	

functionCallStatement
	: IDENT '(' actualParameters? ')' ';' -> ^(FUNC_CALL IDENT actualParameters?)
	;
	
actualParameters
	:  expression (',' expression)*
	;
	
	
returnStatement
	:'return' expression ';'
	;
	
ifStatement
	: 'if' expression 'then' statement+
		('elseif' expression 'then' statement+)*
		('else' statement+)?
		'end' 'if'->^(IF_STATEMENT expression statement* (ELSEIF_STATEMENT expression statement*)* (ELSE_STATEMENT statement*)?)
	;
	
whileStatement
	:'while' expression loopStatement
	;
	
loopStatement
	: 'loop' (statement|exitStatement)* 'end' 'loop'
	;
	
exitStatement
	: 'exit' 'when' expression ';'
	;
	
assignmentStatement
	:	IDENT '='^ expression ';'!
	;	
	

variable
	:('var'|'constant')
		type
        variableDeclarator
        (',' variableDeclarator)*
        ';'-> ^(VAR_DECL type variableDeclarator (variableDeclarator)*)
	;
	
variableDeclarator 
    :   IDENT ('=' expression)->^('=' IDENT expression)
    |	IDENT -> IDENT
    ;
 
 typeDecl
 	:	array
 		';'
 	;
 	
 array
 	:arrayType
 		type
 		arrayDeclarator
 		(',' arrayDeclarator)*
 		;
 		

 arrayDeclarator
 	: 	IDENT
 		('=' arrayInitializer
        )?
 	;
 	 
 arrayInitializer
 	:'['(expression)
        (',' (expression))*
 		']'
 	;
 	
 arrayCallStatement
 	: IDENT '[' expression ']'
 	;

 
 term
	: IDENT
	| '('! expression ')'!
	| INTLITERAL
	| FLOATLITERAL
	| STRINGLITERAL
	| CHARLITERAL
	| BOOLEAN
	| functionCallStatement
	| arrayCallStatement
	;
    

unary
	:   '+' unary-> unary
    |   '-' unary -> ^(NEGATION unary)
    |   '++' unary -> ^(POSTINCREMENT unary)
    |   '--' unary -> ^(POSTDECREMENT unary)
    |	term-> term
    ;



mult
	:	unary(('*'^ | '/'^ | '%'^) unary)*
	;
	
add
	:	mult (('+'^ | '-'^ ) mult)*
	;
	
relation
	: add (('=='^ | '!='^ | '<'^ | '<='^ | '>='^ | '>'^) add)*
	;
	
expression
	:relation (('and'^ | 'or'^) relation)*
	;

typeSpec
	: arrayType
	;
	
arrayType
	: 'list'
	;
    
type  
    :   'int'
    |   'long'
    |   'float'
    |   'double'
    | 	'boolean'
    |	'string'
    |	'char'
    |	typeSpec
    |	IDENT
    ;
    

    
 //Lexer Rules
    
BOOLEAN
	:'true'
	| 'false'
	;

IDENT: ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9')* ;



LONGLITERAL
    :   IntegerNumber LongSuffix
    ;

    
INTLITERAL
    :   IntegerNumber 
    ;
    
fragment
IntegerNumber
    :   '0' 
    |   '1'..'9' ('0'..'9')*    
    |   '0' ('0'..'7')+         
    |   HexPrefix HexDigit+        
    ;

fragment
HexPrefix
    :   '0x' | '0X'
    ;
        
fragment
HexDigit
    :   ('0'..'9'|'a'..'f'|'A'..'F')
    ;

fragment
LongSuffix
    :   'l' | 'L'
    ;


fragment
NonIntegerNumber
    :   ('0' .. '9')+ '.' ('0' .. '9')* Exponent?  
    |   '.' ( '0' .. '9' )+ Exponent?  
    |   ('0' .. '9')+ Exponent  
    |   ('0' .. '9')+ 
    |   
        HexPrefix (HexDigit )* 
        (    () 
        |    ('.' (HexDigit )* ) 
        ) 
        ( 'p' | 'P' ) 
        ( '+' | '-' )? 
        ( '0' .. '9' )+
        ;
        
fragment 
Exponent    
    :   ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ 
    ;
    
fragment 
FloatSuffix
    :   'f' | 'F' 
    ;     

fragment
DoubleSuffix
    :   'd' | 'D'
    ;
        
FLOATLITERAL
    :   NonIntegerNumber //FloatSuffix
    ;
    
DOUBLELITERAL
    :   NonIntegerNumber DoubleSuffix?
    ;


STRINGLITERAL
    :   '"' 
    {StringBuilder b = new StringBuilder();}
	( c= ~('"'|'\r'|'\n') {b.appendCodePoint(c);}
	)*
	'"' 
	{setText(b.toString());}
    ;
    
CHARLITERAL
	:'\''.'\''
	{setText(getText().substring(1,2));}
	;
fragment
EscapeSequence 
    :   '\\' (
                 'b' 
             |   't' 
             |   'n' 
             |   'f' 
             |   'r' 
             |   '\"' 
             |   '\'' 
             |   '\\' 
             |       
                 ('0'..'3') ('0'..'7') ('0'..'7')
             |       
                 ('0'..'7') ('0'..'7') 
             |       
                 ('0'..'7')
             )          
;

WS : (' '| '\t'|'\n'|'\r'|'\f')+{$channel = HIDDEN;};
COMMENT : '//' .* ('\n'|'\r'){$channel = HIDDEN;};
MULTILINE_COMMENT: '/*' .* '*/'{$channel = HIDDEN;};
