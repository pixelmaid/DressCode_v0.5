package com.pixelmaid.dresscode.antlr.types.tree.functions.transforms;

import java.util.List;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.drawing.primitive2d.Color;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;


public class FillNode extends DCNode {

	protected List<DCNode> params;



    
    public FillNode(List<DCNode> ps, int l, int c) {
        params = ps;
        line = l;
        col=c;
       
    }

    @Override
    public VarType evaluate() {
    	Drawable d;
    	Color c = null;
    	if(params.size()<2||params.size()>4){
    		
    		throw new RuntimeException("Incorrect number of parameters for fill at line " + line);
    	}
    	
    	try{
    		
    	d= (params.get(0).evaluate().asDrawable());
    	
    	if(params.size()==2){
    		
    		if(params.get(1).evaluate().isNumber()){
    			c= new Color(params.get(1).evaluate().asDouble().intValue());
    		}
    		else if(params.get(1).evaluate().isString()){
    			c = params.get(1).evaluate().asColor();
    		}
    		
    		
    	
    	}
    	
    	else if(params.size()==4){
    		c= new Color(params.get(1).evaluate().asDouble().intValue(),params.get(2).evaluate().asDouble().intValue(),params.get(3).evaluate().asDouble().intValue());
    	}
    	d.setFillColor(c);
    	d.doFill(true);
    	d.setLine(line);
    	return new VarType(d);
    	}
    	catch (ClassCastException e){
    		throw new RuntimeException("Illegal fill function call at line:"+ line+" : " + this);
    	}
    }

   
}
