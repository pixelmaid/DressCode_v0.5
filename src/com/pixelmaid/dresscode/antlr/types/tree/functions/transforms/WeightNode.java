package com.pixelmaid.dresscode.antlr.types.tree.functions.transforms;

import java.util.List;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.app.Manager;
import com.pixelmaid.dresscode.drawing.primitive2d.Color;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.drawing.primitive2d.PrimitiveInterface;


public class WeightNode implements DCNode {

	protected List<DCNode> params;

    protected int line;


    
    public WeightNode(List<DCNode> ps, int l) {
        params = ps;
        line = l;
       
    }

    @Override
    public VarType evaluate() {
    	Drawable d;
    	Color c = null;
    	if(params.size()!=2){
    		
    		throw new RuntimeException("Incorrect number of parameters for weight at line " + line);
    	}
    	
    	try{
    		
    	d= (params.get(0).evaluate().asDrawable());
    	double w = params.get(1).evaluate().asDouble();
    	d.setStrokeWeight(w);
    	return new VarType(d);
    	}
    	catch (ClassCastException e){
    		throw new RuntimeException("Illegal weight function call at line:"+ line+" : " + this);
    	}
    }

   
}
