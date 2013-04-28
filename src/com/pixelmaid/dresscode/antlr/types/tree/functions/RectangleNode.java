package com.pixelmaid.dresscode.antlr.types.tree.functions;


import java.util.List;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.drawing.primitive2d.Rectangle;
import com.pixelmaid.dresscode.events.CustomEvent;


public class RectangleNode extends DrawableNode implements DCNode {

    public RectangleNode(List<DCNode> ps, int l) {
       super(ps,l);
    	
    }

    @Override
    public VarType evaluate() {
		Rectangle e = null;

		try{
			if(params.get(0).evaluate().isNumber()&&params.get(1).evaluate().isNumber()){
				double x = params.get(0).evaluate().asDouble();
				double y = params.get(1).evaluate().asDouble();
				if(params.size()==2){
					e = new Rectangle(x,y);

				}
				else if(params.size()==3){
					double width = params.get(2).evaluate().asDouble();
					e = new Rectangle(x,y,width,width);

				}
				else if(params.size()==4){
					double width =  params.get(2).evaluate().asDouble();
					double height = params.get(3).evaluate().asDouble();
					e= new Rectangle(x,y,width,height);

				}
				else{
					//Window.output.setText("incorrect parameters for rectangle call at line:"+line);

					System.err.println("inccorect number of arguments for rectangle at line:"+line);
				}
			}
			else{
				//Window.output.setText("incorrect parameters for rectangle call at line:"+line);

				System.err.println("inccorect arguments for rectangle at line:"+line);
			}


			this.drawableEvent(CustomEvent.DRAWABLE_CREATED, e);
		}
		catch (ClassCastException err){
			//Window.output.setText("incorrect parameters for rectangle call at line:"+line);

			System.err.println("incorrect parameters for rectangle at line:"+line);

		}
		e.setLine(line);
		return new VarType(e);	
		//throw new RuntimeException("Illegal function call: " + this);
	}

   
}
