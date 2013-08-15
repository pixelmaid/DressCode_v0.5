package com.pixelmaid.dresscode.antlr.types.tree.functions;


import java.util.ArrayList;
import java.util.List;
import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.primitive2d.DrawablePoint;
import com.pixelmaid.dresscode.drawing.primitive2d.Polygon;
import com.pixelmaid.dresscode.events.CustomEvent;


public class PolygonNode extends DrawableNode implements DCNode {

	public PolygonNode(List<DCNode> ps, int l) {
		super(ps,l);

	}

	@Override
	public VarType evaluate() {
		Polygon e = null;
	
		try{
			if(params==null){
				e= new Polygon();
			}
			else if(params.get(0).evaluate().isList()){
				System.out.println("found list "+params.get(0).evaluate().isList());
				List<VarType> l = params.get(0).evaluate().asList();
				ArrayList<Point> pts = new ArrayList<Point>();
				for(int i=0;i<l.size();i++){
				
					DrawablePoint dp =l.get(i).asDrawablePoint();
					
					Point p = new Point(dp.getX(),dp.getY());
					pts.add(p);
					System.out.println("creating point at: "+p.getX()+","+p.getY());

					
				}
				System.out.println("creating new polygon");
				e = new Polygon(pts);
			}
			else if(params.get(0).evaluate().isDrawablePoint()){
				e= new Polygon(params.get(0).evaluate().asDrawablePoint().getOrigin());
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
					//Window.output.setText("incorrect parameters for polygon call at line:"+line);

					System.err.println("inccorect number of arguments for polygon at line:"+line);
				}
			}
			else{
				//Window.output.setText("incorrect parameters for polygon call at line:"+line);

				System.err.println("inccorect arguments for polygon at line:"+line);
			}


			this.fireDrawableEvent(CustomEvent.DRAWABLE_CREATED, e);
		}
		catch (ClassCastException err){
			//Window.output.setText("incorrect parameters for polygon call at line:"+line);

			System.err.println("incorrect parameters for polygon at line:"+line);

		}
		//set all code initialized polygons to closed
		e.setClosed(true);
		e.setLine(line);
		return new VarType(e);	
		//throw new RuntimeException("Illegal function call: " + this);
	}


}
