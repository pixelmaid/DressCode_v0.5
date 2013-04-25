package com.pixelmaid.dresscode.antlr.types.tree.functions;


import com.pixelmaid.dresscode.antlr.types.VarType;

import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.antlr.types.tree.PropertyNode;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;


public class GetHeightNode extends NodeEvent implements DCNode{

	
	  private DCNode expression;

	    public GetHeightNode(DCNode e) {
	        expression = e;
	    }

	    @Override
	    public VarType evaluate() {
	        VarType value = expression.evaluate();

	        if(!(value.isDrawable())){
	    		  throw new RuntimeException("Illegal height property access: " + this);
	    	}
	    	
	    	Drawable d = value.asDrawable();
	    	Double h= d.getHeight();
	    	return new VarType(h);	
	    }

	    @Override
	    public String toString() {
	        return String.format("size(%s)", expression);
	    }
	
	

   
}
