package com.pixelmaid.dresscode.antlr.types.tree;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;



public class PropertyNode extends NodeEvent implements DCNode {

	protected VarType value;

    protected int line;


    
    public PropertyNode() {
    
    }

    public void setParam(VarType v){
    	value = v;
    }

	@Override
	public VarType evaluate() {
		// TODO Auto-generated method stub
		return null;
	}
    

   
}
