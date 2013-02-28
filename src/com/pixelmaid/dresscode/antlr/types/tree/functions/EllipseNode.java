package com.pixelmaid.dresscode.antlr.types.tree.functions;


import java.util.List;
import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.drawing.primitive2d.Ellipse;
import com.pixelmaid.dresscode.app.Window;
import com.pixelmaid.dresscode.app.Window;

public class EllipseNode extends DrawableNode implements DCNode {

	public EllipseNode(List<DCNode> ps, int l) {
		super(ps,l);

	}

	@Override
	public VarType evaluate() {
		Ellipse e = null;

		try{
			if(params.get(0).evaluate().isNumber()&&params.get(1).evaluate().isNumber()){
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
					Window.output.setText("incorrect number of arguments for ellipse at line:"+line);
					System.err.println("incorrect number of arguments for ellipse at line:"+line);
				}
			}
			else{
				Window.output.setText("incorrect number of arguments for ellipse at line:"+line);

				System.err.println("incorrect arguments for ellipse at line:"+line);
			}


			Window.canvas.addDrawable("ellipse",line,e);
		}
		catch (ClassCastException err){
			Window.output.setText("incorrect parameters for ellipse at line:"+line);

			System.err.println("incorrect parameters for ellipse at line:"+line);

		}
		return new VarType(e);	
		//throw new RuntimeException("Illegal function call: " + this);
	}


}
