package com.pixelmaid.dresscode.antlr.types;

import java.util.HashSet;

public class FunctionType {  //data object to store function declarations
	public HashSet<FunctionType> functions;
	public HashSet<VarType> variables;
	public HashSet<ArrayType> arrays;
	public HashSet<ParamType> parameters;
	public String ident;
	
	public FunctionType(String _ident){
		
		this.ident = _ident;
		functions = new HashSet<FunctionType>();
		variables = new HashSet<VarType>();
		arrays = new HashSet<ArrayType>();
		parameters = new HashSet<ParamType>();
	}
}
