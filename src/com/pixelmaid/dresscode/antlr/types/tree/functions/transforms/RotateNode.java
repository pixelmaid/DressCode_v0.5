package com.pixelmaid.dresscode.antlr.types.tree.functions.transforms;

import java.util.List;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.drawing.primitive2d.DrawablePoint;
import com.pixelmaid.dresscode.events.CustomEvent;


public class RotateNode extends NodeEvent implements DCNode {

	protected List<DCNode> params;

    protected int line;


    
    public RotateNode(List<DCNode> ps, int l) {
        params = ps;
        line = l;
       
    }

    @Override
    public VarType evaluate() {
    	Drawable d;
    	Double r;
    	if(params.size()<2||params.size()>4){
    		
    		throw new RuntimeException("Incorrect number of parameters for rotate at line " + line);
    	}
    	d= (params.get(0).evaluate().asDrawable());
    	r=params.get(1).evaluate().asDouble();
    	if(params.size()==2){
    	
    	d.rotate(r);
    	
        //throw new RuntimeException("Illegal function call: " + this);
	    	}
	    	
    	else if(params.size()==3){
    		DrawablePoint f = params.get(2).evaluate().asDrawablePoint();
    		
    		Drawable b = d.rotateWithFocus(r, f.getOrigin());
    		//TODO: create swap event
    		this.drawableEvent(CustomEvent.REMOVE_DRAWABLE, d);
    		this.drawableEvent(CustomEvent.DRAWABLE_CREATED, b);
    		return new VarType(b);	
    		
    	}
    	else{
    		double fX = params.get(2).evaluate().asDouble();
    		double fY = params.get(3).evaluate().asDouble();
    		Drawable b=d.rotateWithFocus(r, new Point(fX,fY));
    		this.drawableEvent(CustomEvent.REMOVE_DRAWABLE, d);
    		this.drawableEvent(CustomEvent.DRAWABLE_CREATED, b);
    		return new VarType(b);	
    	}
    	return new VarType(d);	
    }

   
}
