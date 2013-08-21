package com.pixelmaid.dresscode.antlr.types.tree.functions.transforms;

import com.pixelmaid.dresscode.antlr.types.Scope;
import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.drawing.primitive2d.Polygon;
import com.pixelmaid.dresscode.events.CustomEvent;


public class FlattenNode extends NodeEvent implements DCNode {

	protected DCNode param;

    protected int line;
    protected Scope scope;

    
    public FlattenNode(DCNode p,Scope s, int l) {
        param = p;
        line = l;
        scope = s;
        //System.out.println("created new drawable node at line:"+line);
    }

    @Override
    public VarType evaluate() {
    	Drawable d;
    	
    	d= param.evaluate().asDrawable().copy();
 
    	
    	
    	d.flatten(true,new Drawable());
    	Drawable flattened = d.getFlattenedDrawable();
    	flattened.setLine(line);
    	this.fireDrawableEvent(CustomEvent.DRAWABLE_CREATED, d.getFlattenedDrawable());
    	return new VarType(flattened);	
        //throw new RuntimeException("Illegal function call: " + this);
    }

   
}
