package com.pixelmaid.dresscode.antlr.types.tree.functions.transforms;

import com.pixelmaid.dresscode.antlr.types.Scope;
import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.events.CustomEvent;


public class ExpandNode extends DCNode {

	protected DCNode param;

    protected Scope scope;


    
    public ExpandNode(DCNode p, Scope s, int l, int c) {
        param = p;
        line = l;
        col=c;
        scope = s;
       
    }

    @Override
    public VarType evaluate() {
    	
    	Drawable dNew= null;
    	//try{
    		
    	VarType d= param.evaluate();
    	if(d.isDrawable()){
    		
    		Drawable d1 = d.asDrawable();
    		d1.hide();
    		Drawable draw = d1.copy();
    		if(draw.getStrokeWeight()<4){
    			draw.setStrokeWeight(4);
    		}
    		dNew = draw.expand(true);
        	this.fireDrawableEvent(CustomEvent.SWAP_DRAWABLE, d1,dNew);
        	//dNew.setLastTransform(TransformTypes.ROTATE,line, col);
        	VarType v=  new VarType(dNew);
    		if(d1.getIdentifier()!=null){
    		
    			scope.assign(d1.getIdentifier(), v);
    		}

    		return v;	
    		}
    	//}
    	
    	//catch (ClassCastException e){
    		//throw new RuntimeException("Illegal expand function call at line:"+ line+" : " + this);
    	//}
    	
    	return null;
    }
    

   
}
