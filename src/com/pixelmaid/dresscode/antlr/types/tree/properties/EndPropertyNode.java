package com.pixelmaid.dresscode.antlr.types.tree.properties;

import java.util.List;



import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.PropertyNode;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.primitive2d.Curve;

import com.pixelmaid.dresscode.drawing.primitive2d.Line;



public class EndPropertyNode extends PropertyNode {

    
    public EndPropertyNode() {
       
    }

    @Override
    public VarType evaluate() {
    	if(!(value.isLine() ||value.isCurve())){
    		  throw new RuntimeException("Illegal end property access: " + this);
    	}
    	Point s;
    	if(value.isLine()){
    		
    		Line d = value.asLine();
    		s = d.getEnd().copy();
    	}
    	else{
    		Curve d = value.asCurve();
    		s = d.getEnd();
    	}
    	
    	return new VarType(s);	
    	
      
      
    }

   
}
