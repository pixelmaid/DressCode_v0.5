package com.pixelmaid.dresscode.antlr.types.tree.properties;

import java.util.List;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.PropertyNode;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.drawing.primitive2d.Rectangle;


public class OriginPropertyNode extends PropertyNode{

	
    public OriginPropertyNode() {
     
    }

    @Override
    public VarType evaluate() {
    	if(!(value.isDrawable())){
    		  throw new RuntimeException("Illegal y property access: " + this);
    	}
    	
    	Drawable d = value.asDrawable();
    	Point origin = d.getOrigin();
    	return new VarType(d.getOrigin().copy().toDrawable());	
    	
      
      
    }

   
}
