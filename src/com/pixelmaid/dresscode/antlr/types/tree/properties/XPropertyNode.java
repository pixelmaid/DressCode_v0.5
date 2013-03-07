package com.pixelmaid.dresscode.antlr.types.tree.properties;

import java.util.List;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.drawing.primitive2d.Rectangle;


public class XPropertyNode implements DCNode {

	protected DCNode param;

    protected int line;


    
    public XPropertyNode(DCNode p, int l) {
        param = p;
        line = l;
        //System.out.println("created new drawable node at line:"+line);
    }

    @Override
    public VarType evaluate() {
    	if(!(param.evaluate().isDrawable() || param.evaluate().isPoint())){
    		  throw new RuntimeException("Illegal x property call: " + this);
    	}
    	if(param.evaluate().isDrawable()){
    	Drawable d = param.evaluate().asDrawable();
    	Double x = d.getOrigin().getX();
    	return new VarType(x);	
    	}
    	else{
    		Point d = param.evaluate().asPoint();
        	Double x = d.getX();
        	return new VarType(x);	
    	}
      
      
    }

   
}
