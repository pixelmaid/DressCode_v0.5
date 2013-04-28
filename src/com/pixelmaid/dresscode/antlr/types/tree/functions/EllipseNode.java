package com.pixelmaid.dresscode.antlr.types.tree.functions;


import java.util.List;
import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.drawing.primitive2d.DrawablePoint;
import com.pixelmaid.dresscode.drawing.primitive2d.Ellipse;
import com.pixelmaid.dresscode.events.CustomEvent;

public class EllipseNode extends DrawableNode implements DCNode {

	public EllipseNode(List<DCNode> ps, int l) {
		super(ps,l);

	}

	@Override
	public VarType evaluate() {
		Ellipse e = null;

		try{
			if(params.get(0).evaluate().isDrawablePoint()){
				DrawablePoint p = params.get(0).evaluate().asDrawablePoint();
				if(params.size()==1){
				e = new Ellipse(p.getOrigin().getX(),p.getOrigin().getY());
				}
				else if(params.size()==2){
					double width =  params.get(1).evaluate().asDouble();
					e = new Ellipse(p.getOrigin().getX(),p.getOrigin().getY(),width,width);
				}
				else if(params.size()==3){
					double width =  params.get(1).evaluate().asDouble();
					double height = params.get(2).evaluate().asDouble();
					e = new Ellipse(p.getOrigin().getX(),p.getOrigin().getY(),width,height);

				}
			}
			
				
			else if(params.get(0).evaluate().isNumber()&&params.get(1).evaluate().isNumber()){
				double x = params.get(0).evaluate().asDouble();
				double y = params.get(1).evaluate().asDouble();
				if(params.size()==2){
					e = new Ellipse(x,y);

				}
			
				else if(params.size()==3){
					double width = params.get(2).evaluate().asDouble();
					e = new Ellipse(x,y,width,width);

				}
				else if(params.size()==4){
					double width =  params.get(2).evaluate().asDouble();
					double height = params.get(3).evaluate().asDouble();
					e= new Ellipse(x,y,width,height);

				}
				else{
					//Window.output.setText("incorrect number of arguments for ellipse at line:"+line);
					System.err.println("incorrect number of arguments for ellipse at line:"+line);
				}
			
			}
			else{
				//Window.output.setText("incorrect number of arguments for ellipse at line:"+line);

				System.err.println("incorrect arguments for ellipse at line:"+line);
			}


			this.drawableEvent(CustomEvent.DRAWABLE_CREATED, e);
		}
		catch (ClassCastException err){
			//Window.output.setText("incorrect parameters for ellipse at line:"+line);

			System.err.println("incorrect parameters for ellipse at line:"+line);
			
			this.errorEvent(CustomEvent.RUNTIME_ERROR, "incorrect parameters for ellipse");

		}
		e.setLine(line);
		return new VarType(e);	
		//throw new RuntimeException("Illegal function call: " + this);
	}


}
