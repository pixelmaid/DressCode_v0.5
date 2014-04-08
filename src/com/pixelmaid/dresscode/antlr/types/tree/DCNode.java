package com.pixelmaid.dresscode.antlr.types.tree;

import com.pixelmaid.dresscode.antlr.types.VarType;


public class DCNode extends NodeEvent {
	protected int line;
	protected int col;
	public VarType evaluate(){
		return VarType.NULL;
	}
	
	public int getLine(){
		return line;
	}
	
	public int getCol(){
		return col;
	}
	
	
}

