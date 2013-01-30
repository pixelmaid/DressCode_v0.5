grammar orign;

options {
  language = Java;
  output= AST;
}
@header {
  package com.pixelmaid.antlr3x.tutorial;
}

@lexer::header {
  package com.pixelmaid.antlr3x.tutorial;
}

program
	:'program' IDENT '='
	(constant | variable)*
	
	'begin'
	statement*
	'end' IDENT '.'
	;

constant
	:'constant' IDENT ':' type ':=' expression ';'
	;
	
variable
	:'var' IDENT (',' IDENT)* ':' type (':=' expression)* ';'
	;
	
function
	: 'function' IDENT '('parameters? ')' '='
		(variable )*
		statement*
		'end' IDENT
		;
	
type
	: 'Integer'
	;


statement
	: assignmentStatement
	| ifStatement
	| loopStatement
	| whileStatement
	;
	
	
ifStatement
	: 'if' expression 'then' statement+
		('elseif' expression 'then' statement+)*
		('else' statement+)?
		'end' 'if' ';'
	;
	
whileStatement
	:'while' expression loopStatement
	;
	
loopStatement
	: 'loop' (statement|exitStatement)* 'end' 'loop' ';'
	;
	
exitStatement
	: 'exit' 'when' expression ';'
	;
	
assignmentStatement
	:	IDENT ':=' expression ';'
	;
	
	

		
parameters
	: parameter (',' parameter)*
	;
	
parameter
	:	IDENT ':' type (':=' expression)?
	;
	
	
// expressions
term
	: IDENT
	| '(' expression ')'
	| INTEGER
	;
	
negation
	: 'not'* term
	;
	
unary
	: ('+'| '-')* negation
	;

mult
	:	unary(('*' | '/' | 'mod') unary)*
	;
	
add
	:	mult (('+' | '-' ) mult)*
	;
	
relation
	: add (('=' | '!=' | '<' | '<=' | '>=' | '>') add)*
	;
	
expression
	:relation (('and' | 'or') relation)*
	;
	
INTEGER : '0'..'9'+;

IDENT: ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9')* ;
WS : (' '| '\t'|'\n'|'\r'|'\f')+{$channel = HIDDEN;};
COMMENT : '//' .* ('\n'|'\r'){$channel = HIDDEN;};
MULTILINE_COMMENT: '/*' .* '*/'{$channel = HIDDEN;};
