package com.pixelmaid.dresscode.antlr.types.tree.functions.transforms;

import java.util.List;

import com.pixelmaid.dresscode.antlr.types.Scope;
import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.events.CustomEvent;


public class RotateNode extends NodeEvent implements DCNode {

	protected List<DCNode> params;

    protected int line;
    protected int col;
  protected Scope scope;


    
    public RotateNode(List<DCNode>  ps, Scope s, int l, int c) {
        params = ps;
        line = l;
        scope = s;
        col=c;
       
    }

    @Override
    public VarType evaluate() {
    	Drawable draw;
    	Double r;
    	if(params.size()<2||params.size()>4){
    		
    		throw new RuntimeException("Incorrect number of parameters for rotate at line " + line);
    	}
    	draw= (params.get(0).evaluate().asDrawable());
    	r=params.get(1).evaluate().asDouble();
    	if(params.size()==2){
    	
    	Drawable dNew = draw.rotateWithFocus(r,draw.getOrigin(),true);
    	this.fireDrawableEvent(CustomEvent.SWAP_DRAWABLE, draw,dNew);
    	//dNew.setLastTransform(TransformTypes.ROTATE,line, col);
    	VarType v=  new VarType(dNew);
		if(draw.getIdentifier()!=null){
		
			scope.assign(draw.getIdentifier(), v);
		}

		return v;	
    	
        //throw new RuntimeException("Illegal function call: " + this);
	    	}
	    	
    	else if(params.size()==3){
    		Point f = params.get(2).evaluate().asDrawablePoint().getOrigin();
    		
    		Drawable dNew = draw.rotateWithFocus(r, f, true);
    		//TODO: create swap event
    		this.fireDrawableEvent(CustomEvent.SWAP_DRAWABLE, draw,dNew);
    		//dNew.setLastTransform(TransformTypes.ROTATE_WITH_FOCUS,line,col);

    		VarType v=  new VarType(dNew);
    		if(draw.getIdentifier()!=null){
    		
    		scope.assign(draw.getIdentifier(), v);
    		}

    		return v;	
    		
    	}
    	else{
    		double fX = params.get(2).evaluate().asDouble();
    		double fY = params.get(3).evaluate().asDouble();
    		Drawable dNew=draw.rotateWithFocus(r, new Point(fX,fY),true);
    		this.fireDrawableEvent(CustomEvent.SWAP_DRAWABLE, draw,dNew);
    		//dNew.setLastTransform(TransformTypes.ROTATE_WITH_FOCUS,line,col);

    		VarType v=  new VarType(dNew);

    		if(draw.getIdentifier()!=null){
    		
    		scope.assign(draw.getIdentifier(), v);
    		}

    		return v;		
    	}
    	
    }

   
}
