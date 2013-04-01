package com.pixelmaid.dresscode.antlr.types.tree.functions.transforms;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.events.CustomEvent;


public class ExpandNode extends NodeEvent implements DCNode {

	protected DCNode param;

    protected int line;


    
    public ExpandNode(DCNode p, int l) {
        param = p;
        line = l;
       
    }

    @Override
    public VarType evaluate() {
    	
    	Drawable dNew= null;
    	try{
    		
    	VarType d= param.evaluate();
    	if(d.isDrawable()){
    		
    		Drawable draw = d.asDrawable();
    		dNew = draw .expand();
    		this.drawableEvent(CustomEvent.REMOVE_DRAWABLE, draw);
    		this.drawableEvent(CustomEvent.DRAWABLE_CREATED, dNew);
    		return new VarType(dNew);
    		}
    	}
    	
    	catch (ClassCastException e){
    		throw new RuntimeException("Illegal expand function call at line:"+ line+" : " + this);
    	}
    	
    	return new VarType(dNew);
    }
    

   
}
