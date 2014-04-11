package com.pixelmaid.dresscode.antlr.types.tree.functions.transforms;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.events.CustomEvent;


public class CopyNode extends DCNode {

	protected DCNode param;



    
    public CopyNode(DCNode p, int l,int c) {
        param = p;
        line = l;
        col=c;
        //System.out.println("created new drawable node at line:"+line);
    }

    @Override
    public VarType evaluate() {
    	Drawable d;
    	
    	
    	d= param.evaluate().asDrawable();
    	Drawable d2= d.copy();
    	d2.setLine(line);
    	this.fireDrawableEvent(CustomEvent.DRAWABLE_CREATED, d2);
    	return new VarType(d2);	
        //throw new RuntimeException("Illegal function call: " + this);
    }

   
}
