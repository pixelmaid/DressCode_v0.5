package com.pixelmaid.dresscode.antlr.types.tree;



import java.util.List;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.app.Manager;
import com.pixelmaid.dresscode.app.Window;
import com.pixelmaid.dresscode.drawing.math.PolyBoolean;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.drawing.primitive2d.Polygon;

public class SubNode implements DCNode {

    private DCNode lhs;
    private DCNode rhs;

    public SubNode(DCNode lhs, DCNode rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public VarType evaluate() {

        VarType a = lhs.evaluate();
        VarType b = rhs.evaluate();

        // number - number
        if(a.isNumber() && b.isNumber()) {
            return new VarType(a.asDouble() - b.asDouble());
        }

        // list - any
        if(a.isList()) {
            List<VarType> list = a.asList();
            list.remove(b);
            return new VarType(list);
        }
        
        if(a.isDrawable() && b.isDrawable()) {
        	Drawable aP = a.asDrawable();
        	Drawable bP = b.asDrawable();
        	aP.removeFromCanvas();
        	bP.removeFromCanvas();
        	Drawable d = PolyBoolean.difference(aP,bP);
        	 //TODO: add actual line number instead of 0 here
    		Window.canvas.addDrawable("drawable",-1,d);
        	return new VarType(d);
          }

        throw new RuntimeException("illegal expression: " + this);
    }

    @Override
    public String toString() {
        return String.format("(%s - %s)", lhs, rhs);
    }
}
