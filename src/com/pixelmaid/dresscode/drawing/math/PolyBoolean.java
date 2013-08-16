package com.pixelmaid.dresscode.drawing.math;

import java.util.ArrayList;

import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.primitive2d.ComplexPolygon;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.drawing.primitive2d.Polygon;
import com.seisw.util.geom.Point2D;
import com.seisw.util.geom.PolyDefault;
import com.seisw.util.geom.Poly;

import com.seisw.util.geom.Clip;
public class PolyBoolean{
	//merges a group of objects into one
/*	public static Drawable merge(Drawable d) {
		
		
		//Point origin = d.getOrigin();
		
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
			//master.moveTo(origin.getX(), origin.getY());
			return master;
		}
		
	}*/

	
	public static Drawable merge(Drawable d) {
		
		
		Drawable group = d;
		if(group.numChildren()==1){
			return group.removeFromGroup(0);
		}
		else{
			
			Drawable master = group.removeFromGroup(0);
			int count =0;
			while(group.numChildren()!=0){
				System.out.println("current merge count="+count);
				count++;
				Drawable m1 = group.removeFromGroup(0);
				master = union(master,m1);
			
			}
			return master;
		}
		
	}
	
	//performs union of two polygons and returns the result
	
	public static Drawable union(Drawable a, Drawable b){
		Drawable result = unionRecur(a,b);
		result.copyParameters(a,result);
		return result;
	}
	
	private static Drawable unionRecur(Drawable d1, Drawable d2){
		if(d1.numChildren()!=0 && !(d1 instanceof ComplexPolygon)){
			Drawable child1 = d1.removeFromGroup(0);
			d1 = unionRecur(d1,child1);
		}
		if(d2.numChildren()!=0&& !(d2 instanceof ComplexPolygon)){
			Drawable child1 = d2.removeFromGroup(0);
			d2 = unionRecur(d2,child1);
		}
		
		return unionSimple(d1,d2);
	}
	
	
	
	public static Drawable unionSimple(Drawable a, Drawable b){
		
		
		
		BooleanPoly a_Poly =  drawableToBoolean(a.copy());
		BooleanPoly b_Poly =  drawableToBoolean(b.copy());
	
		
		BooleanPoly o_Poly = (BooleanPoly)a_Poly.union(b_Poly);
		Drawable unionPoly = booleanToDrawable(o_Poly);
		if(unionPoly.numChildren()>1&&!(unionPoly instanceof ComplexPolygon)){
			Drawable d = new Drawable();
			d.addToGroup(a);
			d.addToGroup(b);
			return(d);
		}
		else{
			return unionPoly;
		}
		
		//Drawable a_d =  booleanToDrawable(a_Poly);
		//Drawable  b_d =  booleanToDrawable(b_Poly);
		//return a_d;
		//return booleanToDrawable(o_Poly);
		
		
	}
	


	//performs difference of two polygons and returns the result
	public static Drawable difference(Drawable a, Drawable b) {
				
		BooleanPoly a_Poly =  drawableToBoolean(a);
		BooleanPoly b_Poly =  drawableToBoolean(b);
		Poly o_Poly = a_Poly.difference(b_Poly);	
		
		Drawable result = booleanToDrawable(o_Poly);
		result.copyParameters(a,result);
		return result;
	
	}
	
	//performs difference of two polygons and returns the result
	public static Drawable xor(Drawable a, Drawable b) {
	
		
		
		BooleanPoly a_Poly =  drawableToBoolean(a);
		BooleanPoly b_Poly =  drawableToBoolean(b);
	    Poly o_Poly = a_Poly.xor(b_Poly);
		//System.out.println("oPoly.size="+o_Poly.getNumPoints());

	    Drawable result = booleanToDrawable(o_Poly);
		result.copyParameters(a,result);
		return result;
	}
	
	//performs difference of two polygons and returns the result
	public static Drawable intersection(Drawable a, Drawable b) {
		a  = a.toPolygon();
		b = b.toPolygon();
		if(a.numChildren()!=0){
			//Window.output.setText("first object must be a single object, not a group for intersection");

			System.err.println("first object must be a single object, not a group for intersection");
			return null;
		}
		else{
		System.out.println("first object is a single polygon");
		BooleanPoly a_Poly =  polygonToBoolean((Polygon)a);
			
		
				System.out.println("only clipping with single poly");
				BooleanPoly b_Poly;
				if(b instanceof ComplexPolygon){
					 b_Poly = complexPolygonToBoolean((ComplexPolygon)b);
					 Poly o_Poly = Clip.intersection(a_Poly,b_Poly);
						System.out.println("holes for o poly="+ o_Poly.getNumInnerPoly());

						Polygon returnPoly = booleanToPolygon(o_Poly);
						return returnPoly;
				}
				else if(b.numChildren()==0){
				b_Poly =  polygonToBoolean((Polygon)b);
				Poly o_Poly = Clip.intersection(a_Poly,b_Poly);
				System.out.println("holes for o poly="+ o_Poly.getNumInnerPoly());

				Polygon returnPoly = booleanToPolygon(o_Poly);
			
				returnPoly.copyParameters(a,returnPoly);
			
				return returnPoly;
				}
				//System.out.println("holes for converted poly="+ b_Poly.getNumInnerPoly());
				
				//Poly o_Poly = a_Poly.intersection(b_Poly);
				
			//}
			else{
				b_Poly = drawableToBoolean(b);
				 Drawable result =  groupIntersection(a_Poly,b_Poly);
					result.copyParameters(a,result);
					return result;
			
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
		//d = d.condense();
		
		BooleanPoly m_Poly = new BooleanPoly(); // master level polygon
		d = d.toPolygon();

		if(d.numChildren()==0 && (d instanceof Polygon)){
			Poly p = polygonToBoolean((Polygon)d);
			m_Poly.add(p);
		}
		else{
			for(int j=0;j<d.children.size();j++){
				Poly bP;
				if(d.children.get(j) instanceof ComplexPolygon){
					ComplexPolygon p = (ComplexPolygon)d.children.get(j);
					bP = complexPolygonToBoolean(p);
				}
				else{
				System.out.println("d check:");
				System.out.println(d instanceof Polygon);
				Polygon p = (Polygon)d.children.get(j);
				bP = polygonToBoolean(p);
				if(p.isHole()){
					bP.setIsHole(true);
				}
				//}
				
				}
				m_Poly.add(bP);

			}
		}
		//System.out.println("master poly Bounds="+m_Poly.getX(0)+","+m_Poly.getBounds().getWidth());
		
		return m_Poly;

	}
	/*
	//converts single polygon to single boolean operation polygon
		private static BooleanPoly complexPolygonToBoolean(ComplexPolygon cp){
			BooleanPoly
			
			for(int j=0;j<cp.numChildren();j++){
			
				Polygon p = (Polygon)cp.removeFromGroup(j);
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
			}
			return p_Poly;
		}*/
	
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
		
		return p_Poly;
	}
	
	private static BooleanPoly complexPolygonToBoolean(ComplexPolygon cp){
		BooleanPoly masterPoly = new BooleanPoly();
		for(int j=0;j<cp.numChildren();j++){
			Polygon p = (Polygon)cp.removeFromGroup(j);
			p.setPointsAbsolute();
			
		
			ArrayList<Point> pPoints = p.getPoints();

		//temp polygon to be stored in master polygon
		BooleanPoly p_Poly = new BooleanPoly();

		//add all polygon points to temp polygon
		for(int i=0;i<pPoints.size();i++)
		{
			p_Poly.add( new Point2D(pPoints.get(i).getX(),pPoints.get(i).getY()) );
		}
		if (p.isHole()){
			p_Poly.isHole();
		}
		//add all polygon holes to temp polygon
		masterPoly.add(p_Poly);
		}
		return masterPoly;
	}
	//converts boolean operation collection of polygons to drawable
	private static Drawable booleanToDrawable(Poly poly){
		
		Drawable master = new Drawable();
	if(poly.getNumInnerPoly()==1){
			master = booleanToPolygon(poly.getInnerPoly(0));
	
		}
		else{
			int polyCount =0;
			int polyIndex;
			ComplexPolygon cp = new ComplexPolygon();
			System.out.println("Number of inner poly="+poly.getNumInnerPoly());
			for( int i = 0 ; i < poly.getNumInnerPoly() ; i++ )
			{
				
				Poly ip = poly.getInnerPoly(i);
				Polygon p = booleanToPolygon(ip);
				if(ip.isHole()){
					p.toHole();
				}
				else{
					polyCount++;
					polyIndex=i;
				}
					master.addToGroup(p.copy());
					cp.addToGroup(p);
				
				
				
				
				}
			
			if(polyCount ==1){
				return cp;
			}
		}
			
			
	
		return master;
	}
	
	
	//converts single boolean operation polygon to single polygon

	private static Polygon booleanToPolygon(Poly ip)
	{
		Polygon jp = new Polygon();
	
		//System.out.println("NUM OF INNER POLY="+ip.getNumInnerPoly());
		
		//System.out.println("PolyBoolean has " + ip.getNumInnerPoly()+" holes");
		for( int i = 0 ; i < ip.getNumInnerPoly() ; i++ )
		{
			
			
			Poly ipp = ip.getInnerPoly(i);
			
				//System.out.println("found a non hole");
				for( int j = 0 ;j < ipp.getNumPoints(); j++ )
				{
					jp.addPoint( ipp.getX(j), ipp.getY(j));
				}
			
		}
		//set all points relative to the centroid;
		Point c;
		if(ip.isHole()){
			jp.reversePoints();
		}
		
		c = Geom.findCentroid(jp);
		if(ip.isHole()){
			jp.reversePoints();
		}
		//System.out.println("centroid of polygon="+c.getX()+","+c.getY());
		jp.setPointsRelativeTo(c) ;
		//System.out.println("holes for hole count="+holeCount);
		return jp;
	}

	







}