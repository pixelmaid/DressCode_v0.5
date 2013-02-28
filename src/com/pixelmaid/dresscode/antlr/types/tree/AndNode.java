package com.pixelmaid.dresscode.antlr.types.tree;

import com.pixelmaid.dresscode.antlr.types.*;
import com.pixelmaid.dresscode.app.Window;
import com.pixelmaid.dresscode.drawing.math.PolyBoolean;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
public class AndNode implements DCNode {

    private DCNode lhs;
    private DCNode rhs;

    public AndNode(DCNode lhs, DCNode rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
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
        	aP.removeFromCanvas();
        	bP.removeFromCanvas();
        	Drawable d = PolyBoolean.intersection(aP,bP);
        	 //TODO: add actual line number instead of 0 here
    		Window.canvas.addDrawable("drawable",-1,d);
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
