package com.pixelmaid.dresscode.antlr.types.tree.functions.transforms;

import java.util.ArrayList;
import java.util.List;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.app.Manager;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.math.Geom;
import com.pixelmaid.dresscode.drawing.primitive2d.Color;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.drawing.primitive2d.DrawableInterface;


public class GroupNode implements DCNode {

	protected List<DCNode> params;

    protected int line;


    
    public GroupNode(List<DCNode> ps, int l) {
        params = ps;
        line = l;
       
    }

    @Override
    public VarType evaluate() {
    	Drawable d;
    	Color c = null;
    	if(params.size()<1){
    		
    		throw new RuntimeException("Incorrect number of parameters for group at line " + line);
    	}
    	
    	try{
    	Drawable master = new Drawable();	
    	ArrayList<Point> origins = new ArrayList<Point>();
    	for(int i=0;i<params.size();i++){
    		d= (params.get(i).evaluate().asDrawable());
    		origins.add(d.getOrigin());
    		d.removeFromCanvas();
    		master.add(d);
    	
    	}
    	master.alterOrigin(Geom.getAveragePoint(origins)); //set origin to average of group origins and re-orient group origins
    	Manager.canvas.addDrawable("drawable",-1,master);
    	return new VarType(master);
    	}
    	catch (ClassCastException e){
    		throw new RuntimeException("Illegal group function call at line:"+ line+" : " + this);
    	}
    }

   
}
