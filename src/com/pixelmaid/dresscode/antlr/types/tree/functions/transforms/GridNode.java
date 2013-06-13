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


public class GridNode extends NodeEvent implements DCNode {

	protected List<DCNode> params;

    protected int line;
    protected Scope scope;
    private double width;
    private double height;

    
    public GridNode(List<DCNode> ps, Scope s, int l, double w, double h) {
        params = ps;
        line = l;
        scope = s;
        width = w;
        height = h;
        //System.out.println("created new drawable node at line:"+line);
    }

    @Override
    public VarType evaluate() {
    	Drawable d= null;
    	VarType v = null;
    	int rowNum=0;
    	int colNum=0;
    	double gapX =50;
    	double gapY = 50;
    	double posX = width/2;
    	double posY = height/2;
    	
    	try{
    	Drawable aP = params.get(0).evaluate().asDrawable();
    	aP.show();
    	rowNum = params.get(1).evaluate().asDouble().intValue();
    	colNum = params.get(2).evaluate().asDouble().intValue();
    	if(params.size()>=4){
    		gapX = params.get(3).evaluate().asDouble();
    		gapY =  params.get(3).evaluate().asDouble();
    	}
    	if(params.size()>=5){
    		gapY = params.get(4).evaluate().asDouble();
    	}
    	if(params.size()>=6){
    	posX = params.get(5).evaluate().asDouble();
    	}
    	if(params.size()==7){
    	posY = params.get(6).evaluate().asDouble();
    	}
    	//this.drawableEvent(CustomEvent.REMOVE_DRAWABLE, aP);
    	//this.drawableEvent(CustomEvent.REMOVE_DRAWABLE, bP);
    	d = Pattern.grid(aP, rowNum, colNum, gapX, gapY,posX, posY);
    	//d = PolyBoolean.union(aP.copy(),bP.copy());
    	aP.hide();
    	
    	aP.setLine(line);

       // d.setIdentifier(aP.getIdentifier());

    	this.drawableEvent(CustomEvent.DRAWABLE_CREATED, d);
    	
    	v=  new VarType(d);
		/*if(aP.getIdentifier()!=null){
		
		scope.assign(aP.getIdentifier(), v);
		}*/
    	d.setLine(line);

    	}
    	catch (ClassCastException e){
    		throw new RuntimeException("Illegal grid function call at line:"+ line+" : " + this);
    	}
    	return v;
    	
    }

   
}

