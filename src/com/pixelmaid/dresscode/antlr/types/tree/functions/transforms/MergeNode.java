package com.pixelmaid.dresscode.antlr.types.tree.functions.transforms;

import com.pixelmaid.dresscode.antlr.types.Scope;
import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.drawing.math.PolyBoolean;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.events.CustomEvent;


public class MergeNode extends NodeEvent implements DCNode {

	protected DCNode param;

    protected int line;
    protected Scope scope;

    
    public MergeNode(DCNode p, Scope s, int l) {
        param = p;
        line = l;
        scope = s;
       
    }

    @Override
    public VarType evaluate() {
    	
    	Drawable dNew= null;
    	VarType v = null;
    	try{
    		
    	VarType d= param.evaluate();
    	if(d.isDrawable()){
    		
    		Drawable draw = d.asDrawable();
    		dNew = PolyBoolean.merge(draw);
    		this.drawableEvent(CustomEvent.SWAP_DRAWABLE, draw,dNew);
    		v=  new VarType(dNew);
    		if(draw.getIdentifier()!=null){
    		
    		scope.assign(draw.getIdentifier(), v);
    		}
        	dNew.setLine(line);

    		return v;	
    	}
    	}
    	
    	catch (ClassCastException e){
    		throw new RuntimeException("Illegal merge function call at line:"+ line+" : " + this);
    	}
    	 return v;
    }
   
   
   }

   

