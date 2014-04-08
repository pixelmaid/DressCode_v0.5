package com.pixelmaid.dresscode.antlr.types.tree.functions;


import com.pixelmaid.dresscode.antlr.types.VarType;

import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.antlr.types.tree.PropertyNode;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;


public class GetYNode extends DCNode{

	
	  private DCNode expression;

	    public GetYNode(DCNode e,int l,int c) {
	        expression = e;
	        line = l;
		    col=c;
	    }

	    @Override
	    public VarType evaluate() {
	        VarType value = expression.evaluate();

	        if(!(value.isDrawable())){
	    		  throw new RuntimeException("Illegal y property access: " + this);
	    	}
	    	
	    	Drawable d = value.asDrawable();
	    	Double y= d.getOrigin().getY();
	    	return new VarType(y);	
	    }

	    @Override
	    public String toString() {
	        return String.format("size(%s)", expression);
	    }
	
	

   
}
