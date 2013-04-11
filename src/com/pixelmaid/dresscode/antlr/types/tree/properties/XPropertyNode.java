package com.pixelmaid.dresscode.antlr.types.tree.properties;

import java.util.List;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.PropertyNode;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.drawing.primitive2d.Rectangle;


public class XPropertyNode extends PropertyNode{



    
    public XPropertyNode() {
     
    }

    @Override
    public VarType evaluate() {
       	if(!value.isDrawable()){
  		  throw new RuntimeException("Illegal y property call: " + this);
  	}
       	else {
  	Drawable d = value.asDrawable();
  	double x = d.getOrigin().getX();
  	return new VarType(x);	
  	
  
    }
    
      
    }

   
}
