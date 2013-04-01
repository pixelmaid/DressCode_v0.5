package com.pixelmaid.dresscode.antlr.types.tree.functions;


import java.util.List;
import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.drawing.datatype.Point;


public class PointNode extends DrawableNode implements DCNode {

	public PointNode(List<DCNode> ps, int l) {
		super(ps,l);

	}

	@Override
	public VarType evaluate() {
		Point e = null;

		try{
			if(params.get(0).evaluate().isNumber()&&params.get(1).evaluate().isNumber()){
				double x = params.get(0).evaluate().asDouble();
				double y = params.get(1).evaluate().asDouble();
				if(params.size()==2){
					e = new Point(x,y);

				}
				else if(params.size()==1 && params.get(0).evaluate().isPoint()){
					
					e = params.get(0).evaluate().asPoint().copy();

				}
				
				else{
					//Window.output.setText("incorrect number of arguments for point at line:"+line);
					System.err.println("incorrect number of arguments for point at line:"+line);
				}
			}
			else{
				//Window.output.setText("incorrect number of arguments for point at line:"+line);

				System.err.println("incorrect arguments for point at line:"+line);
			}


			//Window.canvas.addDrawable("point",line,e);
		}
		catch (ClassCastException err){
			//Window.output.setText("incorrect parameters for point at line:"+line);

			System.err.println("incorrect parameters for point at line:"+line);

		}
		return new VarType(e);	
		//throw new RuntimeException("Illegal function call: " + this);
	}


}
