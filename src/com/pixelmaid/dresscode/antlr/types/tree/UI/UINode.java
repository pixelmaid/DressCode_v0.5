package com.pixelmaid.dresscode.antlr.types.tree.UI;

import java.util.ArrayList;
import java.util.List;

import com.pixelmaid.dresscode.antlr.types.Scope;
import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.events.CustomEvent;

public class UINode extends NodeEvent implements DCNode {

	protected List<DCNode> params;
    protected int line;
    protected Scope scope;
 
    
    public UINode(List<DCNode> n, Scope s) {
        params = n;
        scope = s;
        //System.out.println("created new drawable node at line:"+line);
    }

    @Override
    public VarType evaluate() {
    	ArrayList<Double> values = new ArrayList<Double>();
    	
    	
    	return null;	
        //throw new RuntimeException("Illegal function call: " + this);
    }

   
}
