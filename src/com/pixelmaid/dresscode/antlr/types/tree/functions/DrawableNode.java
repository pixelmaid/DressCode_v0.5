package com.pixelmaid.dresscode.antlr.types.tree.functions;

import java.util.ArrayList;
import java.util.List;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.app.Window;

public class DrawableNode implements DCNode {

	protected List<DCNode> params;
    protected int line;

    
    public DrawableNode(List<DCNode> ps, int l) {
        params = ps;
        line = l;
        //System.out.println("created new drawable node at line:"+line);
    }

    @Override
    public VarType evaluate() {
    	ArrayList<Double> values = new ArrayList<Double>();
    	
    	for(int i=0;i<params.size();i++){
    		VarType value = params.get(i).evaluate();
    		if(value.isNumber()){
               values.add(value.asDouble());
            }
    	}
    	Drawable e = new Drawable(values);
    	Window.canvas.addDrawable("drawable",line,e);
    	return new VarType(e);	
        //throw new RuntimeException("Illegal function call: " + this);
    }

   
}
