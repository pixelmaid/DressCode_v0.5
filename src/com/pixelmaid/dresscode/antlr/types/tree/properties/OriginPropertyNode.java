package com.pixelmaid.dresscode.antlr.types.tree.properties;

import java.util.List;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.drawing.primitive2d.Rectangle;


public class OriginPropertyNode implements DCNode {

	protected DCNode param;

    protected int line;


    
    public OriginPropertyNode(DCNode p, int l) {
        param = p;
        line = l;
        //System.out.println("created new drawable node at line:"+line);
    }

    @Override
    public VarType evaluate() {
    	if(!(param.evaluate().isDrawable())){
    		  throw new RuntimeException("Illegal y property access: " + this);
    	}
    	
    	Drawable d = param.evaluate().asDrawable();
    	return new VarType(d.getOrigin().copy());	
    	
      
      
    }

   
}
