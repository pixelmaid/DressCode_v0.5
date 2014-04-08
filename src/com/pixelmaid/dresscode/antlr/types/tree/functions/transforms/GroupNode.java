package com.pixelmaid.dresscode.antlr.types.tree.functions.transforms;


import java.util.List;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.events.CustomEvent;


public class GroupNode extends DCNode {

	protected List<DCNode> params;
    
    public GroupNode(List<DCNode> ps, int l, int c) {
        params = ps;
        line = l;
        col=c;
       
    }

    @Override
    public VarType evaluate() {
    	
    	
    	
    	try{
    	Drawable master = new Drawable();	
    	if (params!=null){
    	for(int i=0;i<params.size();i++){
    		Drawable d= (params.get(i).evaluate().asDrawable());
    		
    		this.fireDrawableEvent(CustomEvent.REMOVE_DRAWABLE, d);
    		
    		master.addToGroup(d);
    	
    	}
    	}
    	
    	//System.out.println("group children are polygons" + master.childrenArePolygons());
    	this.fireDrawableEvent(CustomEvent.DRAWABLE_CREATED, master);
    	master.setLine(line);

    	return new VarType(master);
    	}
    	catch (ClassCastException e){
    		throw new RuntimeException("Illegal group function call at line:"+ line+" : " + this);
    	}
    }

   
}
