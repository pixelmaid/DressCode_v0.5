package com.pixelmaid.dresscode.antlr.types.tree.functions;


import java.util.List;
import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.app.Manager;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.primitive2d.LShape;

public class LShapeNode extends DrawableNode implements DCNode {

	public LShapeNode(List<DCNode> ps, int l) {
		super(ps,l);

	}

	@Override
	public VarType evaluate() {
		LShape e = new LShape();

		try{
			if(params.get(0).evaluate().isString()){
				String path = params.get(0).evaluate().asString();
				e.setPath(path);
				e.setCanvas(Manager.canvas);
				e.loadShape();
				
				if(params.size()>1){
					if(params.size()==3 && params.get(1).evaluate().isNumber()&& params.get(2).evaluate().isNumber()){
						
						e.moveTo(params.get(1).evaluate().asDouble(),params.get(2).evaluate().asDouble());
					}
				}
			/*else if(params.get(0).evaluate().isPoint()){
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
			}*/
			}
			else{
				Manager.output.setText("incorrect parameters for LShape call at line:"+line);

				System.err.println("inccorect arguments for LShape at line:"+line);
			}


			Manager.canvas.addDrawable("lShape",line,e);
		}
		catch (ClassCastException err){
			Manager.output.setText("incorrect parameters for LShape call at line:"+line);

			System.err.println("inccorect arguments for LShape at line:"+line);
		}
		return new VarType(e);	
		//throw new RuntimeException("Illegal function call: " + this);
	}


}
