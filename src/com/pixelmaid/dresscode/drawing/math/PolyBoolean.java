package com.pixelmaid.dresscode.drawing.math;

import java.util.ArrayList;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.app.Window;

import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.drawing.primitive2d.Hole;
import com.pixelmaid.dresscode.drawing.primitive2d.Polygon;
import com.seisw.util.geom.Point2D;
import com.seisw.util.geom.Poly ;
import com.seisw.util.geom.PolyDefault ;

public class PolyBoolean{
	//merges a group of objects into one
	public static Drawable merge(Drawable d) {
		Drawable master;
		 Poly group = drawableToBoolean(d.condense());
		if(group.getNumInnerPoly()==1){
			//Poly i_Poly = clip.intersection(group.getInnerPoly(0));
			//master = booleanToPolygon(i_Poly);
			//System.out.println("PolyBoolean has only one polygon result");

			//master.setRelativeTo(Geom.findCentroid((Polygon)master));
			return d;
		}
		else{
			Poly mP = new PolyDefault();

			for( int i = 0 ; i < group.getNumInnerPoly() ; i++ )
			{
				Poly ip = group.getInnerPoly(i);
				mP = mP.union(ip);
			}
			master = booleanToDrawable(mP);
			return master;
		}
		
	}

	
	//performs union of two polygons and returns the result
	public static Drawable union(Drawable a, Drawable b){
		
		
		a = a.condense();
		b = b.condense();
		
		Poly a_Poly =  drawableToBoolean(a);
		Poly b_Poly =  drawableToBoolean(b);
		//Drawable a_P =  booleanToDrawable(a_Poly);
		//Drawable b_P =   booleanToDrawable(b_Poly);


		Poly o_Poly = a_Poly.union(b_Poly);

		//System.out.println("oPoly.size="+o_Poly.getNumPoints());

		return booleanToDrawable(o_Poly);
		
		//a = a.toPolygon();
		//b = b.toPolygon();
		
		//Drawable a_P = a.addToGroup(b);
		//System.out.println("a_p="+a_P.numChildren());
		//a_P = a_P.removeFromGroup(b);
		//Manager.canvas.addDrawable("drawable",-1,b);
		//System.out.println("a_p2="+a_P.numChildren());

		//return a_P.condense();
	}
	
	/*public static Drawable CondenseDrawable(Drawable a){
		
		ArrayList<Drawable> children = a.getChildren();
		for(int i=a.numChildren()-1;i>=0;i--){
			if(children.get(i).numChildren()==0){ //is a polygon
				
			}
			
		}
	}*/

	//performs difference of two polygons and returns the result
	public static Drawable difference(Drawable a, Drawable b) {
		a = a.condense();
		b = b.condense();
		
		Poly a_Poly =  drawableToBoolean(a);
		Poly b_Poly =  drawableToBoolean(b);
		Poly o_Poly = a_Poly.difference(b_Poly);
		//System.out.println("oPoly.size="+o_Poly.getNumPoints());

		return booleanToDrawable(o_Poly);
	}
	
	//performs difference of two polygons and returns the result
	public static Drawable xor(Drawable a, Drawable b) {
		a = a.condense();
		b = b.condense();
		
		Poly a_Poly =  drawableToBoolean(a);
		Poly b_Poly =  drawableToBoolean(b);
		Poly o_Poly = a_Poly.xor(b_Poly);
		//System.out.println("oPoly.size="+o_Poly.getNumPoints());

		return booleanToDrawable(o_Poly);
	}
	
	//performs difference of two polygons and returns the result
	public static Drawable intersection(Drawable a, Drawable b) {
		a = a.condense();
		b = b.condense();
		if(a.numChildren()!=0){
			Window.output.setText("first object must be a single object, not a group for intersection");

			System.err.println("first object must be a single object, not a group for intersection");
			return null;
		}
		else{
		System.out.println("first object is a single polygon");
		Poly a_Poly =  polygonToBoolean((Polygon)a);
			if(b.numChildren()==0){
		
		
				Poly b_Poly =  polygonToBoolean((Polygon)b);
				Poly o_Poly = a_Poly.intersection(b_Poly);
				return booleanToDrawable(o_Poly);
			}
			else{
				Poly b_Poly = drawableToBoolean(b);
				return groupIntersection(a_Poly,b_Poly);
			}
		}
	}
	
	
	// performs intersection on a group of objects
		private static Drawable groupIntersection(Poly clip, Poly group){
			Drawable master = new Drawable();
		
			if(group.getNumInnerPoly()==1){
				Poly i_Poly = clip.intersection(group.getInnerPoly(0));
				master = booleanToPolygon(i_Poly);
				//System.out.println("PolyBoolean has only one polygon result");

				//master.setRelativeTo(Geom.findCentroid((Polygon)master));
			}
			else{
				

				for( int i = 0 ; i < group.getNumInnerPoly() ; i++ )
				{
					Poly ip = group.getInnerPoly(i);
					Poly i_Poly = clip.intersection(ip);
					if(!i_Poly.isEmpty()){
						Polygon p = booleanToPolygon(i_Poly);
					
						master.addToGroup(p);
					}
				}
			
			}
			return master;
		}
		
	//converts drawable to collection of boolean operation polygons
	private static Poly drawableToBoolean(Drawable d){
		Poly m_Poly = new PolyDefault(); // master level polygon
		d = d.toPolygon();

		if(d.numChildren()==0){
			return polygonToBoolean((Polygon)d);
		}
		else{
			for(int j=0;j<d.children.size();j++){
				Polygon p = (Polygon)d.children.get(j);
				m_Poly.add(polygonToBoolean(p));
			}
			return m_Poly;
		}

	}
	
	//converts single polygon to single boolean operation polygon
	private static Poly polygonToBoolean(Polygon p){
		p.setPointsAbsolute();
		ArrayList<Point> pPoints = p.getPoints();

		//temp polygon to be stored in master polygon
		Poly p_Poly = new PolyDefault();

		//add all polygon points to temp polygon
		for(int i=0;i<pPoints.size();i++)
		{
			p_Poly.add( new Point2D(pPoints.get(i).getX(),pPoints.get(i).getY()) );
		}
		//add all polygon holes to temp polygon
		ArrayList<Hole> holes = p.getHoles();

		for(int i=0;i<holes.size();i++)
		{	
			Poly h_Poly = new PolyDefault();
			h_Poly.setIsHole(true);
			ArrayList<Point> holePoints = holes.get(i).getPoints();
			for(int k=0;k<holePoints.size();k++)
			{
				
				h_Poly.add( new Point2D(holePoints.get(i).getX(),holePoints.get(i).getY()) );
			}
		}
		return p_Poly;
	}
	//converts boolean operation collection of polygons to drawable
	private static Drawable booleanToDrawable(Poly poly){

		Drawable master = new Drawable();
		if(poly.getNumInnerPoly()==1){
			master = booleanToPolygon(poly.getInnerPoly(0));
			//System.out.println("PolyBoolean has only one polygon result");

			//master.setRelativeTo(Geom.findCentroid((Polygon)master));
		}
		else{
			

			for( int i = 0 ; i < poly.getNumInnerPoly() ; i++ )
			{
				Poly ip = poly.getInnerPoly(i);
				Polygon p = booleanToPolygon(ip);
				//System.out.println(p.getPoints().size());
				
				master.addToGroup(p);
			}
		
		}
		return master;
	}
	
	
	//converts single boolean operation polygon to single polygon

	private static Polygon booleanToPolygon(Poly ip)
	{
		Polygon jp = new Polygon();
		for( int i = 0 ; i < ip.getNumPoints(); i++ )
		{
			jp.addPoint( ip.getX(i), ip.getY(i));
		}
		
		
		
		//System.out.println("PolyBoolean has " + ip.getNumInnerPoly()+" holes");
		for( int i = 0 ; i < ip.getNumInnerPoly() ; i++ )
		{
			
			
			Poly ipp = ip.getInnerPoly(i);
			if (ipp.isHole()){
				Hole h = innerPolyToHole(ipp);

				jp.addHole(h);
			}
		}
		//set all points relative to the centroid;
		Point c = Geom.findCentroid(jp);
		jp.setPointsRelativeTo(c) ;

		return jp;
	}

	private static Hole innerPolyToHole(Poly ip )
	{
		Hole jp = new Hole();
		//System.out.println("ip.numPoints="+ip.getNumPoints());
		for( int i = 0 ; i < ip.getNumPoints(); i++ )
		{
			jp.addPoint( ip.getX(i), ip.getY(i) );
		}

		return jp;
	}







}