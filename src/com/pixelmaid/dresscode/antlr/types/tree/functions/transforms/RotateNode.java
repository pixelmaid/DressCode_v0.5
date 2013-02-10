package com.pixelmaid.dresscode.antlr.types.tree.functions.transforms;

import java.util.List;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.app.Manager;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.drawing.primitive2d.DrawableInterface;


public class RotateNode implements DCNode {

	protected List<DCNode> params;

    protected int line;


    
    public RotateNode(List<DCNode> ps, int l) {
        params = ps;
        line = l;
       
    }

    @Override
    public VarType evaluate() {
    	DrawableInterface d;
    	Double r;
    	if(params.size()!=2){
    		
    		throw new RuntimeException("Incorrect number of parameters for rotate at line " + line);
    	}
    	
    	d= (params.get(0).evaluate().asDrawable());
    	r=params.get(1).evaluate().asDouble();
    	
    	
    	d.rotate(r);
    	return new VarType(d);	
        //throw new RuntimeException("Illegal function call: " + this);
    }

   
}
