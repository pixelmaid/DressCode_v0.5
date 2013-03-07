package com.pixelmaid.dresscode.antlr.types.tree;

import java.util.List;



import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.primitive2d.Curve;

import com.pixelmaid.dresscode.drawing.primitive2d.Line;



public class PropertyNode implements DCNode {

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
