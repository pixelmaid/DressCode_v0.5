tree grammar JogoTree;

options {
  language = Java;
  tokenVocab = Jogo;
  ASTLabelType = CommonTree;
}
@header {
  package com.pixelmaid.dresscode.antlr;
  import java.util.Map;
  import java.util.HashMap;
  import com.pixelmaid.dresscode.antlr.types.*;
  import com.pixelmaid.dresscode.antlr.types.tree.*;
  
}


@members {
public JogoTree(CommonTreeNodeStream nds, Scope sc, Map<String, FunctionType> fns) { 
    super(nds); 
    currentScope = sc; 
    functions = fns; 
  } 
}

program  returns [DCNode node]
	: ^(PROGRAM atom* function*){ result = 1; }
	;

atom	
	: (variable 
	| statement 
	| typeDecl)
	;
	
function
	:  ^(FUNC_DECL IDENT (atom)* parameters[$IDENT.text]? (returnStatement)*) 
	{ 
		 
	SemanticManager.functions.put($IDENT.text, new FunctionType($IDENT.text));
	System.out.println("declared function "+ $IDENT.text);
	
	}
	;

parameters[String funcName]
	: parameter[funcName] (',' parameter[funcName])*
	;
	
parameter[String funcName]
	:	^(type IDENT) {
	System.out.println("declared parameter "+ $IDENT.text+  "for function "+$funcName);
	
	}
	;
	
statement returns [boolean result]
	: assignmentStatement
	| ifStatement
	| loopStatement
	| whileStatement
	| functionCallStatement
	;
	

functionCallStatement
@init{
	//scopes.add(scopes.size()-1,FUNC_
}
	: ^(FUNC_CALL IDENT actualParameters?)
	
	
	;
finally{

}	
	
actualParameters
	:  actualParameter (',' actualParameter)*
	;
	
actualParameter
	: (expression)
	;
	
returnStatement
	:'return' expression ';'
	;
	
ifStatement returns [boolean result]
@init{
System.out.println("found if statement");
}
	: ^(IF_STATEMENT e1=expression {(Boolean)e1.result}?=> s1=statement *(ELSEIF_STATEMENT e2=expression s2=statement*)* (ELSE_STATEMENT e3=statement*)?)
	
	{if ((Boolean)e1.result){
		System.out.println("if Statement is true");
		}
		else{
		System.out.println("if Statement is false");
		}
	
	}
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
	
assignmentStatement returns [boolean result]
	:	^('=' IDENT expression) {$result = SemanticManager.setPrimVar($IDENT.text,$expression.result);}
	;	
	
	

variable
	
	:^(VAR_DECL type variableDeclarator[$type.text] (variableDeclarator[$type.text] )*)
	;
	
variableDeclarator[int type]
    :  ^('=' IDENT expression) { SemanticManager.declarePrimVar($type,$IDENT.text,$expression.result); }
    | IDENT {SemanticManager.declarePrimVar($type,$IDENT.text,null);}
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

 
 term returns [PrimObject result]
	@init{
	
	}
	
	: IDENT {$result = SemanticManager.getPrimVar($IDENT.text);}
	| INTLITERAL {$result = SemanticManager.parseInt($INTLITERAL.text);}
	| FLOATLITERAL{$result = SemanticManager.parseFloat($FLOATLITERAL.text);}
	| STRINGLITERAL{$result = SemanticManager.parseString($STRINGLITERAL.text);}
	| BOOLEAN {$result = SemanticManager.parseBool($BOOLEAN.text);}
	| functionCallStatement
	| arrayCallStatement
	;
	
	
	finally{
		System.out.println("term result = "+$result.getResult() +", "+ $result.getType());
	
	}
	
	
expression returns [PrimObject result]
	//://op1=relation (('and' | 'or') op2=relation)*
	:^(NEGATION op1=expression) {$result = SemanticManager.negation(op1);}
	|^(POSTINCREMENT op1=expression) {$result = SemanticManager.postIncrement(op1);}
    |^(POSTDECREMENT op1=expression) {$result = SemanticManager.postDecrement(op1);}
    |^('*' op1=expression op2=expression) { $result = SemanticManager.multiplication(op1,op2); }
	|^('/' op1=expression op2=expression) { $result = SemanticManager.division(op1,op2); }
	|^('%' op1=expression op2=expression) { $result = SemanticManager.modulo(op1,op2); }
	|^('+' op1=expression op2=expression) { $result = SemanticManager.addition(op1,op2); }
	|^('-' op1=expression op2=expression) { $result = SemanticManager.subtraction(op1,op2);}	
	|^('==' op1=expression op2=expression) { $result = SemanticManager.equality(op1,op2); }
	|^('!=' op1=expression op2=expression) { $result = SemanticManager.nonEquality(op1,op2); }
	|^('<' op1=expression op2=expression) { $result = SemanticManager.lessThan(op1,op2); }
	|^('<=' op1=expression op2=expression) { $result = SemanticManager.lessThanEqual(op1,op2); }
	|^('>' op1=expression op2=expression) { $result = SemanticManager.greaterThan(op1,op2); }
	|^('>=' op1=expression op2=expression) { $result = SemanticManager.greaterThanEqual(op1,op2); }
	|^('and' op1=expression op2=expression) { $result = SemanticManager.andCheck(op1,op2); }
	|^('or' op1=expression op2=expression) { $result = SemanticManager.orCheck(op1,op2); }
	| op1 = term {$result = op1;}
	;
	finally{
		System.out.println("expression result = "+$result.getResult() +", "+ $result.getType());
	
	}
 
typeSpec
	: arrayType
	;
	
arrayType
	: 'list'
	;
    
type returns [int text]
	:   'int' {$text = SemanticManager.INTNUM;}
    |   'float'{$text = SemanticManager.FLOATNUM;}
    | 	'boolean'{$text = SemanticManager.BOOLNUM;}
    |	'string'{$text = SemanticManager.STRINGNUM;}
    |	typeSpec {$text = SemanticManager.ARRAYNUM;}
    |	IDENT {$text = Integer.valueOf($IDENT.text);}
	;