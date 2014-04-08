package com.pixelmaid.dresscode.antlr.types.tree.functions.transforms;

import com.pixelmaid.dresscode.antlr.types.Scope;
import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.drawing.primitive2d.Polygon;
import com.pixelmaid.dresscode.events.CustomEvent;


public class FlattenNode extends DCNode {

	protected DCNode param;

    protected Scope scope;

    
    public FlattenNode(DCNode p,Scope s, int l, int c) {
        param = p;
        line = l;
        col=c;
        scope = s;
        //System.out.println("created new drawable node at line:"+line);
    }

    @Override
    public VarType evaluate() {
    	Drawable d;
    	
    	d= param.evaluate().asDrawable();
 
    	
    	d.hide();
    	Drawable n = d.flatten(true,new Drawable());
    
    	
    	n.setLine(line);
    	if(d.getIdentifier()!=null){
    		n.setIdentifier(d.getIdentifier());
    	}
    	this.fireDrawableEvent(CustomEvent.DRAWABLE_CREATED, n);
    	return new VarType(n);	
        //throw new RuntimeException("Illegal function call: " + this);
    }

   
}
