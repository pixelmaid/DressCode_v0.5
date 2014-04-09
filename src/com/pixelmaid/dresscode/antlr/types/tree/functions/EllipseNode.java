package com.pixelmaid.dresscode.antlr.types.tree.functions;


import java.util.List;
import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.drawing.primitive2d.DrawablePoint;
import com.pixelmaid.dresscode.drawing.primitive2d.Ellipse;
import com.pixelmaid.dresscode.drawing.primitive2d.Rectangle;
import com.pixelmaid.dresscode.events.CustomEvent;

public class EllipseNode extends DrawableNode {

	public EllipseNode(List<DCNode> ps, int l, int c) {
		super(ps,l,c);
		System.out.println("char position is:"+c);

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
					if(width>0){
						e = new Ellipse(x,y,width,width);
					}
					else{
						System.err.println("cannot set ellipse width to less than zero at :"+line);
						this.fireRuntimeErrorEvent(CustomEvent.RUNTIME_ERROR, "cannot set ellipse width to less than zero at :"+line);

					}

				}
				else if(params.size()==4){
					double width =  params.get(2).evaluate().asDouble();
					double height = params.get(3).evaluate().asDouble();
					if(width>0 && height>0){
						e = new Ellipse(x,y,width,height);
					}
					else{
						if(width<=0){
						System.err.println("cannot set ellipse width to less than zero at :"+line);
						this.fireRuntimeErrorEvent(CustomEvent.RUNTIME_ERROR, "cannot set ellipse width to less than zero at :"+line);

						}
						if(height<=0){
							System.err.println("cannot set ellipse height to less than zero :"+line);
							this.fireRuntimeErrorEvent(CustomEvent.RUNTIME_ERROR, "cannot set ellipse height to less than zero at :"+line);

						}
					}


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


			this.fireDrawableEvent(CustomEvent.DRAWABLE_CREATED, e);
			
		}
		catch (ClassCastException err){
			//Window.output.setText("incorrect parameters for ellipse at line:"+line);

			System.err.println("incorrect parameters for ellipse at line:"+line);
			
			this.fireRuntimeErrorEvent(CustomEvent.RUNTIME_ERROR, "incorrect parameters for ellipse");

		}
		if(e!=null){
			e.setLine(line);
			return new VarType(e);
		}
		else{
			return VarType.VOID;
		}
		//throw new RuntimeException("Illegal function call: " + this);
	}


}
