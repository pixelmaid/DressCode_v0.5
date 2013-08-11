package com.pixelmaid.dresscode.antlr.types.tree.functions.transforms;

import com.pixelmaid.dresscode.antlr.types.Scope;
import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.events.CustomEvent;


public class ExpandNode extends NodeEvent implements DCNode {

	protected DCNode param;

    protected int line;
    protected Scope scope;


    
    public ExpandNode(DCNode p, Scope s, int l) {
        param = p;
        line = l;
        scope = s;
       
    }

    @Override
    public VarType evaluate() {
    	
    	Drawable dNew= null;
    	try{
    		
    	VarType d= param.evaluate();
    	if(d.isDrawable()){
    		
    		Drawable d1 = d.asDrawable();
    		d1.hide();
    		Drawable draw = d1.copy();
    		if(draw.getStrokeWeight()<4){
    			draw.setStrokeWeight(4);
    		}
    		dNew = draw.expand();
    		//this.drawableEvent(CustomEvent.REMOVE_DRAWABLE, draw);
    		//this.drawableEvent(CustomEvent.DRAWABLE_CREATED, dNew);
    		
        	dNew.setLine(line);

           // d.setIdentifier(aP.getIdentifier());

        	this.fireDrawableEvent(CustomEvent.DRAWABLE_CREATED, dNew);
    		VarType v=  new VarType(dNew);
    		
    		return v;
    		}
    	}
    	
    	catch (ClassCastException e){
    		throw new RuntimeException("Illegal expand function call at line:"+ line+" : " + this);
    	}
    	
    	return new VarType(dNew);
    }
    

   
}
