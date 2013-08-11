package com.pixelmaid.dresscode.antlr.types.tree.functions.transforms;

import java.util.List;

import com.pixelmaid.dresscode.antlr.types.Scope;
import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.drawing.math.PolyBoolean;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.events.CustomEvent;


public class DifferenceNode extends NodeEvent implements DCNode {

	protected List<DCNode> params;

    protected int line;
    protected Scope scope;

    
    public DifferenceNode(List<DCNode> ps, Scope s, int l) {
        params = ps;
        line = l;
        scope = s;
        //System.out.println("created new drawable node at line:"+line);
    }

    @Override
    public VarType evaluate() {
    	Drawable d= null;
    	VarType v = null;
    
    	try{
    	Drawable aP = params.get(0).evaluate().asDrawable();
    	Drawable bP =  params.get(1).evaluate().asDrawable();
    	
        d = PolyBoolean.difference(aP.copy(),bP.copy());
        this.fireDrawableEvent(CustomEvent.DRAWABLE_CREATED, d);
        aP.hide();
    	bP.hide();
    	v=  new VarType(d);
		
    	d.setLine(line);

    	}
    	catch (ClassCastException e){
    		throw new RuntimeException("Illegal expand function call at line:"+ line+" : " + this);
    	}
    	return v;
    	
    }

   
}

