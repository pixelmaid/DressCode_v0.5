package com.pixelmaid.dresscode.antlr.types.tree.functions;

import java.util.ArrayList;
import java.util.List;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.events.CustomEvent;

public class DrawableNode extends DCNode{

	protected List<DCNode> params;

    
    public DrawableNode(List<DCNode> ps, int l, int c) {
        params = ps;
        line = l;
	    col=c;
        System.out.println("created new drawable node at line:"+line);
    }

    @Override
    public VarType evaluate() {
    	ArrayList<Double> values = new ArrayList<Double>();
    	
    	for(int i=0;i<params.size();i++){
    		VarType value = params.get(i).evaluate();
    		if(value.isNumber()){
               values.add(value.asDouble());
            }
    	}
    	Drawable d = new Drawable(values);
    	d.setLine(line);
    	this.fireDrawableEvent(CustomEvent.DRAWABLE_CREATED, d);
    	return new VarType(d);	
        //throw new RuntimeException("Illegal function call: " + this);
    }

   
}
