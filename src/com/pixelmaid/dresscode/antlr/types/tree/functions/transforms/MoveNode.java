package com.pixelmaid.dresscode.antlr.types.tree.functions.transforms;

import java.util.List;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.drawing.primitive2d.DrawableInterface;


public class MoveNode implements DCNode {

	protected List<DCNode> params;

    protected int line;


    
    public MoveNode(List<DCNode> ps, int l) {
        params = ps;
        line = l;
        //System.out.println("created new drawable node at line:"+line);
    }

    @Override
    public VarType evaluate() {
    	DrawableInterface d;
    	Double x;
    	Double y;
    	if(params.size()!=3){
    		
    		throw new RuntimeException("Incorrect number of parameters for move at line " + line);
    	}
    	
    	d= (params.get(0).evaluate().asDrawable());
    	x=params.get(1).evaluate().asDouble();
    	y=params.get(2).evaluate().asDouble();
    	
    	d.moveTo(x, y);
    	return new VarType(d);	
        //throw new RuntimeException("Illegal function call: " + this);
    }

   
}
