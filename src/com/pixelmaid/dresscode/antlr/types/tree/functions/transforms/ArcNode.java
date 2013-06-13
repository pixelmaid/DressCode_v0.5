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


public class ArcNode extends NodeEvent implements DCNode {

	protected List<DCNode> params;

    protected int line;
    protected Scope scope;
    private double width;
    private double height;

    
    public ArcNode(List<DCNode> ps, Scope s, int l, double w, double h) {
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
    	int dNum=0;
    	double wWidth=width;
    	double hHeight = height;
    	double degree =180;
    	double offset = 0;
    	
    	double posX = width/2;
    	double posY = height/2;
    	boolean rotate = true;
    	
    	try{
    	Drawable aP = params.get(0).evaluate().asDrawable();
    	aP.show();
    	dNum = params.get(1).evaluate().asDouble().intValue();
    	
    	
    	if(params.size()>=3){
    		wWidth =  params.get(2).evaluate().asDouble();
    		hHeight = params.get(2).evaluate().asDouble();
    	}
    	
    	if(params.size()>=4){
    		hHeight = params.get(3).evaluate().asDouble();
    	}
    	
    	if(params.size()>=5){
    		degree = params.get(4).evaluate().asDouble();
    	}
    	
    	if(params.size()>=6){
    		offset= params.get(5).evaluate().asDouble();
    	}
    	if(params.size()>=7){
    		rotate= params.get(6).evaluate().asBoolean();
    	}
    	if(params.size()==8){
    		posX = params.get(7).evaluate().asDouble();
    	}
    	if(params.size()==9){
        	posY= params.get(8).evaluate().asDouble();
        }
    	//this.drawableEvent(CustomEvent.REMOVE_DRAWABLE, aP);
    	//this.drawableEvent(CustomEvent.REMOVE_DRAWABLE, bP);
    	d = Pattern.arc(aP, dNum, wWidth,hHeight,degree,offset,rotate,posX,posY);
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
    		throw new RuntimeException("Illegal arc function call at line:"+ line+" : " + this);
    	}
    	return v;
    	
    }

   
}

