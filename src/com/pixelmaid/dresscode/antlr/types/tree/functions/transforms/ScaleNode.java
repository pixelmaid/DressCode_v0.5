package com.pixelmaid.dresscode.antlr.types.tree.functions.transforms;

import java.util.List;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.events.CustomEvent;


public class ScaleNode extends DCNode {

	protected List<DCNode> params;



    
    public ScaleNode(List<DCNode> ps, int l, int c) {
        params = ps;
        line = l;
        col=c;
       
    }

    @Override
    public VarType evaluate() {
    	Drawable d;
    	Double x;
    	Double y;
    	if(params.size()<2||params.size()>3){
    		
    		throw new RuntimeException("Incorrect number of parameters for scale at line " + line);
    	}
    	d= (params.get(0).evaluate().asDrawable());
    	x=params.get(1).evaluate().asDouble();
    	if(params.size()==3){
    	y=params.get(2).evaluate().asDouble();
    	
    		d.scale(x,y,d.getOrigin().copy(),true);
    		
    	}
    	else{
    		d.scale(x,x,d.getOrigin().copy(),true);
    	}
    	
    
    	d.setLine(line);

    	return new VarType(d);	
    }

   
}
