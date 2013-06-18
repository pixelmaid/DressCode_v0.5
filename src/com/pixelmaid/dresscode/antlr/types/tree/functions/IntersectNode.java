package com.pixelmaid.dresscode.antlr.types.tree.functions;

import java.util.List;

import com.pixelmaid.dresscode.antlr.types.Scope;
import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.drawing.math.Geom;
import com.pixelmaid.dresscode.drawing.math.PolyBoolean;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.drawing.primitive2d.Polygon;
import com.pixelmaid.dresscode.events.CustomEvent;


public class IntersectNode extends NodeEvent implements DCNode {

	protected List<DCNode> params;

    protected int line;
    protected Scope scope;

    
    public IntersectNode(List<DCNode> ps) {
        params = ps;
       // line = l;
        //scope = s;
        //System.out.println("created new drawable node at line:"+line);
    }

    @Override
    public VarType evaluate() {
    	Boolean d= null;
    	VarType v = null;
    
    	//try{
    	Drawable aP = params.get(0).evaluate().asDrawable();
    	Drawable bP =  params.get(1).evaluate().asDrawable();
    	//this.drawableEvent(CustomEvent.REMOVE_DRAWABLE, aP);
    	//this.drawableEvent(CustomEvent.REMOVE_DRAWABLE, bP);
    	
    	d = Geom.polygonIntersect((Polygon)aP.copy().toPolygon(),(Polygon)bP.copy().toPolygon());
    	
    	
       // d.setIdentifier(aP.getIdentifier());

    	
    	
    	v=  new VarType(d);
	
    	

    	//}
    	/*catch (ClassCastException e){
    		throw new RuntimeException("Illegal union function call at line:"+ line+" : " + this);
    	}*/
    	return v;
    	
    }

   
}

