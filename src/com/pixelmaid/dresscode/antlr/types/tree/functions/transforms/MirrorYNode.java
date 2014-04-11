package com.pixelmaid.dresscode.antlr.types.tree.functions.transforms;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.drawing.primitive2d.Polygon;
import com.pixelmaid.dresscode.events.CustomEvent;


public class MirrorYNode extends DCNode {

	protected DCNode param;

    public MirrorYNode(DCNode p, int l, int c) {
        param = p;
        line = l;
        col=c;
        //System.out.println("created new drawable node at line:"+line);
    }

    @Override
    public VarType evaluate() {
    	Drawable d;
    	
    	
    	d= param.evaluate().asDrawable();
    	d.setLine(line);

    	d.mirrorY(d.getOrigin(),true);
    
    	return new VarType(d);	
        //throw new RuntimeException("Illegal function call: " + this);
    }

   
}
