package com.pixelmaid.dresscode.antlr.types;

public class PrimObject {
	public Object result;
	public int primType;
	
	public PrimObject(){
		
	}
	
	public void setResult(Object result){
		this.result = result;
	}
	
	public void setType(int type){
		this.primType=type;
	}
	
	public Object getResult(){
		return result;
	}
	
	public int getType(){
		return primType;
	}
	
}