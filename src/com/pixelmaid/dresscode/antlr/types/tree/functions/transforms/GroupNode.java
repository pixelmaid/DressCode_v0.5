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
import com.pixelmaid.dresscode.drawing.primitive2d.PrimitiveInterface;


public class GroupNode implements DCNode {

	protected List<DCNode> params;

    protected int line;


    
    public GroupNode(List<DCNode> ps, int l) {
        params = ps;
        line = l;
       
    }

    @Override
    public VarType evaluate() {
    	
    	
    	
    	try{
    	Drawable master = new Drawable();	
    	if (params!=null){
    	for(int i=0;i<params.size();i++){
    		Drawable d= (params.get(i).evaluate().asDrawable());
    		
    		d.removeFromCanvas();
    		
    		master.addToGroup(d);
    	
    	}
    	}
    	
    	//System.out.println("group children are polygons" + master.childrenArePolygons());
    	Manager.canvas.addDrawable("drawable",-1,master);
    	return new VarType(master);
    	}
    	catch (ClassCastException e){
    		throw new RuntimeException("Illegal group function call at line:"+ line+" : " + this);
    	}
    }

   
}
