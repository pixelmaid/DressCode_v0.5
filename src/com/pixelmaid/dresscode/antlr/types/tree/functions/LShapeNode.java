package com.pixelmaid.dresscode.antlr.types.tree.functions;


import java.util.List;
import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.app.Manager;
import com.pixelmaid.dresscode.drawing.primitive2d.LShape;

public class LShapeNode extends DrawableNode implements DCNode {

	public LShapeNode(List<DCNode> ps, int l) {
		super(ps,l);

	}

	@Override
	public VarType evaluate() {
		LShape e = null;

		try{
			/*if(params.size()==0){
				e= new Polygon();
			}
			else if(params.get(0).evaluate().isPoint()){
				e= new Polygon(params.get(0).evaluate().asPoint());
			}
			else if(params.get(0).evaluate().isNumber()&&params.get(1).evaluate().isNumber()){
				
				if(params.size()==2){
					int sides =params.get(0).evaluate().asDouble().intValue();
					double length = params.get(1).evaluate().asDouble();
					e = new Polygon(sides,length);

				}
				else if(params.size()==3){
					double x = params.get(0).evaluate().asDouble();
					double y = params.get(1).evaluate().asDouble();
					int sides =params.get(2).evaluate().asDouble().intValue();
					
					e = new Polygon(x,y,sides);

				}
				else if(params.size()==4){
					double x = params.get(0).evaluate().asDouble();
					double y = params.get(1).evaluate().asDouble();
					int sides =params.get(2).evaluate().asDouble().intValue();
					double length = params.get(3).evaluate().asDouble();
					e= new Polygon(x,y,sides,length);

				}
				else{
					Manager.output.setText("incorrect parameters for polygon call at line:"+line);

					System.err.println("inccorect number of arguments for polygon at line:"+line);
				}
			}
			else{
				Manager.output.setText("incorrect parameters for polygon call at line:"+line);

				System.err.println("inccorect arguments for polygon at line:"+line);
			}


			Manager.canvas.addDrawable("polygon",line,e);*/
		}
		catch (ClassCastException err){
			Manager.output.setText("incorrect parameters for polygon call at line:"+line);

			System.err.println("incorrect parameters for polygon at line:"+line);

		}
		return new VarType(e);	
		//throw new RuntimeException("Illegal function call: " + this);
	}


}
