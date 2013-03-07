package com.pixelmaid.dresscode.antlr.types.tree.properties;

import java.util.List;



import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.primitive2d.Curve;

import com.pixelmaid.dresscode.drawing.primitive2d.Line;



public class StartPropertyNode implements DCNode {

	protected DCNode param;

    protected int line;


    
    public StartPropertyNode(DCNode p, int l) {
        param = p;
        line = l;
        //System.out.println("created new drawable node at line:"+line);
    }

    @Override
    public VarType evaluate() {
    	if(!(param.evaluate().isLine() || param.evaluate().isCurve())){
    		  throw new RuntimeException("Illegal start property access: " + this);
    	}
    	Point s;
    	if(param.evaluate().isLine()){
    		
    		Line d = param.evaluate().asLine();
    		s = d.getStart().copy();
    	}
    	else{
    		Curve d = (Curve)param.evaluate().asCurve();
    		s = d.getStart();
    	}
    	
    	return new VarType(s);	
    	
      
      
    }

   
}
