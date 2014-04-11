package com.pixelmaid.dresscode.antlr.types.tree;

import com.pixelmaid.dresscode.antlr.types.VarType;


public class DCNode extends NodeEvent {
	protected int line=0;
	protected int col;
	protected int startArg;
	protected int endArg;
	public VarType evaluate(){
		return VarType.NULL;
	}
	
	public int getLine(){
		return line;
	}
	
	public int getCol(){
		return col;
	}
	
	public void setLimits(int s, int e){
		
		startArg=s;
		endArg=e;
		System.out.println("parse start arg ="+startArg+","+"end arg="+endArg);
	}
	
	
}

