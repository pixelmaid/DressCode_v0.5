package com.pixelmaid.dresscode.antlr.types.tree.functions.transforms;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;


public class ShowNode extends DCNode {

	protected DCNode param;



    
    public ShowNode(DCNode p, int l, int c) {
        param = p;
        line = l;
	    col=c;
       
    }

    @Override
    public VarType evaluate() {
    	Drawable d;
    	
    	try{
    		
    	d= (param.evaluate().asDrawable());
    	d.show();
    	d.setLine(line);

    	return new VarType(d);
    	}
    	catch (ClassCastException e){
    		throw new RuntimeException("Illegal show function call at line:"+ line+" : " + this);
    	}
    }

   
}
