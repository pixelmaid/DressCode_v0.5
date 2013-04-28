package com.pixelmaid.dresscode.antlr.types.tree.functions;

import java.util.ArrayList;
import java.util.List;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.primitive2d.Curve;
import com.pixelmaid.dresscode.drawing.primitive2d.DrawablePoint;
import com.pixelmaid.dresscode.events.CustomEvent;

public class CurveNode extends DrawableNode implements DCNode {

	public CurveNode(List<DCNode> ps, int l) {
		super(ps,l);

	}

	@Override
	public VarType evaluate() {
		Curve e = null;
		try{
			double[] values = new double[8];

			if(params.get(0).evaluate().isNumber()&&params.size()==8){



				for(int i=0;i<params.size();i++){
					VarType value = params.get(i).evaluate();
					if(value.isNumber()){
						values[i]=value.asDouble();
					}
				}
			}


			else if(params.get(0).evaluate().isDrawablePoint()&&params.size()==4){



				for(int i=0;i<params.size();i++){
					VarType value = params.get(i).evaluate();
					if(value.isDrawablePoint()){
						DrawablePoint p = value.asDrawablePoint();
						values[i*2]=p.getOrigin().getX();
						values[(i*2)+1]=p.getOrigin().getY();

					}
				}
			}

			e = new Curve(values);

		}

		catch (ClassCastException err){
			//Window.output.setText("incorrect parameters for curve call at line:"+line);
			System.err.println("incorrect parameters for curve call at line:"+line);

		}
	
	//TODO:Implement curve to curve drawing
	/*else if(params.get(0).evaluate().isDrawable()){
    		try{


    			if(params.get(0).evaluate().isLine()&&params.get(0).evaluate().isLine()){
    				Line d1 = params.get(0).evaluate().asLine();
        			Line d2 = params.get(1).evaluate().asLine();
        			e = new Curve(d1.getEnd(),d2.getStart());
    			}
    		else{
    			Drawable d1 = params.get(0).evaluate().asDrawable();
    			Drawable d2 = params.get(1).evaluate().asDrawable();
    			e = new Line(d1.getOrigin(),d2.getOrigin());
    		}

        	}
        	catch (ClassCastException err){

        		System.err.println("incorrect parameters for line call at line:"+line);

        	}
    	}*/
	
	e.setLine(line);
	this.drawableEvent(CustomEvent.DRAWABLE_CREATED, e);
	
	return new VarType(e);	
	//throw new RuntimeException("Illegal function call: " + this);
}


}
