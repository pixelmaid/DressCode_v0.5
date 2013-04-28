package com.pixelmaid.dresscode.antlr.types.tree.functions.transforms;

import java.util.List;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;


public class MoveByNode extends NodeEvent implements DCNode {

	protected List<DCNode> params;

    protected int line;


    
    public MoveByNode(List<DCNode> ps, int l) {
        params = ps;
        line = l;
        //System.out.println("created new drawable node at line:"+line);
    }

    @Override
    public VarType evaluate() {
    	Drawable d;
    	Double x;
    	Double y;
    	if(params.size()<2||params.size()>3){
    		
    		throw new RuntimeException("Incorrect number of parameters for move at line " + line);
    	}
    	
    	d= (params.get(0).evaluate().asDrawable());
    	
    	
    	if(params.size()==3){
    		x=params.get(1).evaluate().asDouble();
        	y=params.get(2).evaluate().asDouble();
    	}
    	else{
    		Point p=params.get(1).evaluate().asPoint();
    		x= p.getX();
    		y= p.getY();
    	}
    	d.setLine(line);

    	d.moveBy(x, y);
    	return new VarType(d);	
        //throw new RuntimeException("Illegal function call: " + this);
    }

   
}
