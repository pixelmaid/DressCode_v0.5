package com.pixelmaid.dresscode.antlr.types.tree.properties;

import java.util.List;



import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.primitive2d.Curve;

import com.pixelmaid.dresscode.drawing.primitive2d.Line;



public class EndPropertyNode implements DCNode {

	protected DCNode param;

    protected int line;


    
    public EndPropertyNode(DCNode p, int l) {
        param = p;
        line = l;
        //System.out.println("created new drawable node at line:"+line);
    }

    @Override
    public VarType evaluate() {
    	if(!(param.evaluate().isLine() || param.evaluate().isCurve())){
    		  throw new RuntimeException("Illegal end property access: " + this);
    	}
    	Point s;
    	if(param.evaluate().isLine()){
    		
    		Line d = param.evaluate().asLine();
    		s = d.getEnd().copy();
    	}
    	else{
    		Curve d = (Curve)param.evaluate().asCurve();
    		s = d.getEnd();
    	}
    	
    	return new VarType(s);	
    	
      
      
    }

   
}
