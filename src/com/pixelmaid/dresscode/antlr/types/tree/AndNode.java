package com.pixelmaid.dresscode.antlr.types.tree;

import com.pixelmaid.dresscode.antlr.types.*;
import com.pixelmaid.dresscode.drawing.math.PolyBoolean;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.events.CustomEvent;
public class AndNode extends NodeEvent implements DCNode {

    private DCNode lhs;
    private DCNode rhs;
    //protected int line;
    
    public AndNode(DCNode lhs, DCNode rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
        //line = l;
    }

    @Override
    public VarType evaluate() {

        VarType a = lhs.evaluate();
        VarType b = rhs.evaluate();
        
        if(a.isBoolean() && b.isBoolean()) {
        	return new VarType(a.asBoolean() && b.asBoolean());
           
        }
        if(a.isDrawable() && b.isDrawable()) {
        	Drawable aP = a.asDrawable();
        	Drawable bP = b.asDrawable();
        	this.drawableEvent(CustomEvent.REMOVE_DRAWABLE, aP);
        	this.drawableEvent(CustomEvent.REMOVE_DRAWABLE, bP);
        	Drawable d = PolyBoolean.intersection(aP,bP);
        	 //TODO: add actual line number instead of 0 here
        	this.drawableEvent(CustomEvent.DRAWABLE_CREATED, d);
        	//d.setLine(line);
        	return new VarType(d);
          }

        else{
        	 throw new RuntimeException("illegal expression: " + this);
        }
        
    }

    @Override
    public String toString() {
        return String.format("(%s && %s)", lhs, rhs);
    }
}
