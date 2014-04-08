package com.pixelmaid.dresscode.antlr.types.tree.functions;


import com.pixelmaid.dresscode.antlr.types.VarType;

import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.antlr.types.tree.PropertyNode;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;


public class GetOriginNode extends DCNode{

	
	  private DCNode expression;

	    public GetOriginNode(DCNode e, int l, int c) {
	        expression = e;
	        line = l;
		    col=c;
	    }

	    @Override
	    public VarType evaluate() {
	        VarType value = expression.evaluate();

	        if(!(value.isDrawable())){
	    		  throw new RuntimeException("Illegal origin property access: " + this);
	    	}
	    	
	    	Drawable d = value.asDrawable();
	    	return new VarType(d.getOrigin().copy().toDrawable());	
	    }

	    @Override
	    public String toString() {
	        return String.format("size(%s)", expression);
	    }
	
	

   
}
