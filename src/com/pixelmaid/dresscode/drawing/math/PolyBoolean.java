package com.pixelmaid.dresscode.drawing.math;

import java.util.ArrayList;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.app.Window;

import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.drawing.primitive2d.Hole;
import com.pixelmaid.dresscode.drawing.primitive2d.Polygon;
import com.seisw.util.geom.Point2D;
import com.seisw.util.geom.PolyDefault;
import com.seisw.util.geom.Poly;

import com.seisw.util.geom.Clip;
public class PolyBoolean{
	//merges a group of objects into one
	public static Drawable merge(Drawable d) {
		Drawable master;
		
		Poly group = drawableToBoolean(d);
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
		
		
		BooleanPoly a_Poly =  drawableToBoolean(a);
		BooleanPoly b_Poly =  drawableToBoolean(b);
	
		BooleanPoly o_Poly = (BooleanPoly)a_Poly.union(b_Poly);


		return booleanToDrawable(o_Poly);
		
		
	}
	


	//performs difference of two polygons and returns the result
	public static Drawable difference(Drawable a, Drawable b) {
				
		BooleanPoly a_Poly =  drawableToBoolean(a);
		BooleanPoly b_Poly =  drawableToBoolean(b);
		Poly o_Poly = a_Poly.difference(b_Poly);	
		
		return booleanToDrawable(o_Poly);
	
	}
	
	//performs difference of two polygons and returns the result
	public static Drawable xor(Drawable a, Drawable b) {
	
		
		
		BooleanPoly a_Poly =  drawableToBoolean(a);
		BooleanPoly b_Poly =  drawableToBoolean(b);
	    Poly o_Poly = a_Poly.xor(b_Poly);
		//System.out.println("oPoly.size="+o_Poly.getNumPoints());

		return booleanToDrawable(o_Poly);
	}
	
	//performs difference of two polygons and returns the result
	public static Drawable intersection(Drawable a, Drawable b) {
		a  = a.toPolygon();
		b = b.toPolygon();
		if(a.numChildren()!=0){
			Window.output.setText("first object must be a single object, not a group for intersection");

			System.err.println("first object must be a single object, not a group for intersection");
			return null;
		}
		else{
		System.out.println("first object is a single polygon");
		BooleanPoly a_Poly =  polygonToBoolean((Polygon)a);
			if(b.numChildren()==0){
		
				System.out.println("only clipping with single poly");
				System.out.println("holes for clipped poly="+((Polygon)b).getHoles().size());
				BooleanPoly b_Poly =  polygonToBoolean((Polygon)b);
				System.out.println("holes for converted poly="+ b_Poly.getNumInnerPoly());
				
				//Poly o_Poly = a_Poly.intersection(b_Poly);
				Poly o_Poly = Clip.intersection(a_Poly,b_Poly);
				System.out.println("holes for o poly="+ o_Poly.getNumInnerPoly());

				Polygon returnPoly = booleanToPolygon(o_Poly);
				System.out.println("holes for returned poly="+ returnPoly.getHoles().size());
				return returnPoly;
			}
			else{
				BooleanPoly b_Poly = drawableToBoolean(b);
				return groupIntersection(a_Poly,b_Poly);
			}
		}
	}
	
	
	// performs intersection on a group of objects
		private static Drawable groupIntersection(BooleanPoly clip, BooleanPoly group){
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
	private static BooleanPoly drawableToBoolean(Drawable d){
		d = d.condense();
		
		BooleanPoly m_Poly = new BooleanPoly(); // master level polygon
		d = d.toPolygon();

		if(d.numChildren()==0){
			Poly p = polygonToBoolean((Polygon)d);
			m_Poly.add(p);
		}
		else{
			for(int j=0;j<d.children.size();j++){
				Polygon p = (Polygon)d.children.get(j);
				m_Poly.add(polygonToBoolean(p));
			}
		}
		//System.out.println("master poly Bounds="+m_Poly.getX(0)+","+m_Poly.getBounds().getWidth());
	
		ArrayList<Hole> holes = d.getHoles();
		//System.out.println("total number of holes="+holes.size());

			for(int j=0;j<holes.size();j++){
				Hole h = holes.get(j);
				
				Poly hP = polygonToBoolean(h);
				hP.setIsHole(true);
				m_Poly.add(hP);
				//System.out.println("hole "+j+" Bounds="+hP.getX(0)+","+hP.getBounds().getWidth());

			}
		
		return m_Poly;

	}
	
	//converts single polygon to single boolean operation polygon
	private static BooleanPoly polygonToBoolean(Polygon p){
		p.setPointsAbsolute();
		ArrayList<Point> pPoints = p.getPoints();

		//temp polygon to be stored in master polygon
		BooleanPoly p_Poly = new BooleanPoly();

		//add all polygon points to temp polygon
		for(int i=0;i<pPoints.size();i++)
		{
			p_Poly.add( new Point2D(pPoints.get(i).getX(),pPoints.get(i).getY()) );
		}
		//add all polygon holes to temp polygon
		ArrayList<Hole> holes = p.getHoles();
		for(int i=0;i<holes.size();i++)
		{	
			BooleanPoly h_Poly = new BooleanPoly();
			h_Poly.setIsHole(true);
			ArrayList<Point> holePoints = holes.get(i).getPoints();
			for(int k=0;k<holePoints.size();k++)
			{
				
				h_Poly.add( new Point2D(holePoints.get(i).getX(),holePoints.get(i).getY()) );
			}
			p_Poly.add(h_Poly);
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
				if(ip.isHole()){
					master.addHoleToGroup(p.toHole());
				}
				else{
					master.addToGroup(p);
				}
				
				
			}
		
		}
		
		return master;
	}
	
	
	//converts single boolean operation polygon to single polygon

	private static Polygon booleanToPolygon(Poly ip)
	{
		Polygon jp = new Polygon();
	
		
		int holeCount = 0;
		
		//System.out.println("PolyBoolean has " + ip.getNumInnerPoly()+" holes");
		for( int i = 0 ; i < ip.getNumInnerPoly() ; i++ )
		{
			
			
			Poly ipp = ip.getInnerPoly(i);
			if (ipp.isHole()){
				Hole h = innerPolyToHole(ipp);

				jp.addHoleToGroup(h);
				holeCount ++;
			}
			else{
				System.out.println("found a non hole");
				for( int j = 0 ;j < ipp.getNumPoints(); j++ )
				{
					jp.addPoint( ipp.getX(j), ipp.getY(j));
				}
			}
		}
		//set all points relative to the centroid;
		Point c = Geom.findCentroid(jp);
		jp.setPointsRelativeTo(c) ;
		System.out.println("holes for hole count="+holeCount);
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