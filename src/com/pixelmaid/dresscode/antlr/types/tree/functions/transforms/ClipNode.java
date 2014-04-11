package com.pixelmaid.dresscode.antlr.types.tree.functions.transforms;

import java.util.List;

import com.pixelmaid.dresscode.antlr.types.Scope;
import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.drawing.math.PolyBoolean;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.drawing.primitive2d.Polygon;
import com.pixelmaid.dresscode.events.CustomEvent;


public class ClipNode extends DCNode {

	protected List<DCNode> params;

    protected Scope scope;

    
    public ClipNode(List<DCNode> ps, Scope s, int l, int c) {
        params = ps;
        line = l;
        col = c;
        scope = s;
        //System.out.println("created new drawable node at line:"+line);
    }

    @Override
    public VarType evaluate() {
    	Drawable d= null;
    	VarType v = null;
    
    	//try{
    	Drawable aP = params.get(0).evaluate().asDrawable();
    	Drawable bP = params.get(1).evaluate().asDrawable();
    
    	
    	
        aP.hide();
    	bP.hide();
		d = PolyBoolean.intersection(aP.copy(),bP.copy());

    	if(d!=null){
            d.setIdentifier(aP.getIdentifier());
    		this.fireDrawableEvent(CustomEvent.DRAWABLE_CREATED, d);
    	
    		v=  new VarType(d);
		
    		d.setLine(line);
    		return v;
    	}

//    	}
    	/*catch (ClassCastException e){
    		throw new RuntimeException("Illegal clip function call at line:"+ line+" : " + this);
    	}*/
    	return new VarType(new Polygon());
    	
    }

   
}

