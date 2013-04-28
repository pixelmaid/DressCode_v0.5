package com.pixelmaid.dresscode.antlr.types.tree.functions.transforms;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.events.CustomEvent;


public class CopyNode extends NodeEvent implements DCNode {

	protected DCNode param;

    protected int line;


    
    public CopyNode(DCNode p, int l) {
        param = p;
        line = l;
        //System.out.println("created new drawable node at line:"+line);
    }

    @Override
    public VarType evaluate() {
    	Drawable d;
    	
    	
    	d= param.evaluate().asDrawable();
    	Drawable d2= d.copy();
    	this.drawableEvent(CustomEvent.DRAWABLE_CREATED, d2);
    	d.setLine(line);
    	d2.setLine(line);
    	return new VarType(d2);	
        //throw new RuntimeException("Illegal function call: " + this);
    }

   
}
