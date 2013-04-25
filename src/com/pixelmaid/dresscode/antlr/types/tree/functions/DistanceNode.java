package com.pixelmaid.dresscode.antlr.types.tree.functions;


import java.util.List;

import com.pixelmaid.dresscode.antlr.types.VarType;

import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.drawing.math.Geom;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;


public class DistanceNode extends NodeEvent implements DCNode{

	
	protected List<DCNode> params;

	    public DistanceNode(List<DCNode> ps) {
	    	params = ps;
	    }

	    @Override
	    public VarType evaluate() {
	    	if(params.size()!=2){
	    		
	    		throw new RuntimeException("Incorrect number of parameters for distance");
	    	}
	    	else{
	    	VarType v1 = params.get(0).evaluate();
	    	VarType v2 = params.get(1).evaluate();

	        if(!(v1.isDrawable())||!(v2.isDrawable())){
	    		  throw new RuntimeException("distance can only be done between two drawables: " + this);
	    	}
	       
	    	Drawable d1 = v1.asDrawable();
	    	Drawable d2 = v2.asDrawable();
	    	Double d = Geom.distance(d1.getOrigin(),d2.getOrigin());
	    	return new VarType(d);	
	        
	    	}
	    }

	  
	

   
}
