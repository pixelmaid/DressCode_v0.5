package com.pixelmaid.dresscode.antlr.types.tree.functions;


import java.util.List;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;

import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.primitive2d.Line;
import com.pixelmaid.dresscode.events.CustomEvent;
import com.pixelmaid.dresscode.drawing.primitive2d.DrawablePoint;


public class LineNode extends DrawableNode implements DCNode {

    public LineNode(List<DCNode> ps, int l) {
       super(ps,l);
    	
    }

    @Override
    
    public VarType evaluate() {
    	Line e = null;
    	if(params.size()==4 && params.get(0).evaluate().isNumber()&&params.get(1).evaluate().isNumber()&&params.get(2).evaluate().isNumber()&&params.get(3).evaluate().isNumber() ){
    		double x1 = params.get(0).evaluate().asDouble();
    		double y1 = params.get(1).evaluate().asDouble();
    		double x2 = params.get(2).evaluate().asDouble();
    		double y2 = params.get(3).evaluate().asDouble();

    		e = new Line(x1,y1,x2,y2);
    		this.drawableEvent(CustomEvent.DRAWABLE_CREATED, e);
    		e.setLine(line);
    		return new VarType(e);	
    	}
    	else if(params.size()==2 && params.get(0).evaluate().isDrawablePoint()&&params.get(1).evaluate().isDrawablePoint()){
    		Point start = params.get(0).evaluate().asDrawablePoint().getOrigin();
    		Point end = params.get(1).evaluate().asDrawablePoint().getOrigin();
    		e = new Line(start.getX(),start.getY(),end.getX(),end.getY());
    		this.drawableEvent(CustomEvent.DRAWABLE_CREATED, e);
    		e.setLine(line);
    		return new VarType(e);	
    		
    		
    	}
    	
    	else if(params.size()==3 && params.get(0).evaluate().isDrawablePoint()&&params.get(1).evaluate().isNumber()&&params.get(2).evaluate().isNumber()){
    		Point start = params.get(0).evaluate().asDrawablePoint().getOrigin();
    		double r = params.get(1).evaluate().asDouble();
    		double theta = params.get(2).evaluate().asDouble();
    		e = new Line(start,r,theta);
    		this.drawableEvent(CustomEvent.DRAWABLE_CREATED, e);
    		e.setLine(line);
    		return new VarType(e);	
    	}
    	
    	
    	throw new RuntimeException("Illegal line function call: " + this);
    	
    }
    	
    	
    	/* public VarType evaluate() {
    	Line e = null;
    	if(params.get(0).evaluate().isNumber()){
    	System.out.println("first line param is number");
    		try{
    		ArrayList<Double> values = new ArrayList<Double>();
    	
    	for(int i=0;i<params.size();i++){
    		VarType value = params.get(i).evaluate();
    		if(value.isNumber()){
               values.add(value.asDouble());
            }
    	}
    	
    		e = new Line(values);
    	}
    	catch (ClassCastException err){
			//Window.output.setText("incorrect parameters for line call at line:"+line);

    		System.err.println("incorrect parameters for line call at line:"+line);
    		
    		}
    	}
    	else if(params.get(0).evaluate().isDrawable()){
    		try{
    		
    		
    			if(params.get(0).evaluate().isLine()&&params.get(0).evaluate().isLine()){
    				Line d1 = params.get(0).evaluate().asLine();
        			Line d2 = params.get(1).evaluate().asLine();
        			e = new Line(d1.getEnd(),d2.getStart());
    			}
    		else{
    			Drawable d1 = params.get(0).evaluate().asDrawable();
    			Drawable d2 = params.get(1).evaluate().asDrawable();
    			e = new Line(d1.getOrigin(),d2.getOrigin());
    		}
        		
        	}
        	catch (ClassCastException err){
    			//Window.output.setText("incorrect parameters for line call at line:"+line);

        		System.err.println("incorrect parameters for line call at line:"+line);
        		
        	}
    	}
    	else if(params.get(0).evaluate().isPoint()){
    		if(params.get(1).evaluate().isPoint()){
    			
    			e = new Line(params.get(0).evaluate().asPoint(),params.get(1).evaluate().asPoint());
    		}
    		else{
    			Point origin = params.get(0).evaluate().asPoint();
    			double r = params.get(1).evaluate().asDouble();
    			double t = params.get(2).evaluate().asDouble();
    			e = new Line(origin,r,t);
	    		}
	    	}
	    	else{
			//	Window.output.setText("incorrect parameters for line call at line:"+line);
	
	    		System.err.println("incorrect parameters for line call at line:"+line);
	    	}
    	this.drawableEvent(CustomEvent.DRAWABLE_CREATED, e);
	    	return new VarType(e);	
        //throw new RuntimeException("Illegal function call: " + this);
    }*/

   
}
