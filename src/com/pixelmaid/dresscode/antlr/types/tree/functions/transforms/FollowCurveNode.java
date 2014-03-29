package com.pixelmaid.dresscode.antlr.types.tree.functions.transforms;

import java.util.List;

import com.pixelmaid.dresscode.antlr.types.Scope;
import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.drawing.math.Pattern;
import com.pixelmaid.dresscode.drawing.math.PolyBoolean;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.events.CustomEvent;


public class FollowCurveNode extends NodeEvent implements DCNode {

	protected List<DCNode> params;

    protected int line;
    protected Scope scope;
;

    
    public FollowCurveNode(List<DCNode> ps, Scope s, int l) {
        params = ps;
        line = l;
        scope = s;
      
        //System.out.println("created new drawable node at line:"+line);
    }

    @Override
    public VarType evaluate() {
    	Drawable d= null;
    	VarType v = null;
    	int dNum=0;
    	
    	
    	try{
    	Drawable aP = params.get(0).evaluate().asDrawable();
    	Drawable cP = params.get(1).evaluate().asDrawable();
    	aP.show();
    	dNum = params.get(2).evaluate().asDouble().intValue();
    	if(params.size()>3){
    		boolean angle = params.get(3).evaluate().asBoolean();
    		d = Pattern.followCurve(aP, cP,dNum,angle);
    	}
    	else{
    	
    		d = Pattern.followCurve(aP, cP,dNum,true);
    	}
    	//d = PolyBoolean.union(aP.copy(),bP.copy());
    	aP.hide();
    	
    	aP.setLine(line);

       // d.setIdentifier(aP.getIdentifier());

    	this.fireDrawableEvent(CustomEvent.DRAWABLE_CREATED, d);
    	
    	v=  new VarType(d);
		/*if(aP.getIdentifier()!=null){
		
		scope.assign(aP.getIdentifier(), v);
		}*/
    	d.setLine(line);

    	}
    	catch (ClassCastException e){
    		throw new RuntimeException("Illegal followCurve function call at line:"+ line+" : " + this);
    	}
    	return v;
    	
    }

   
}

