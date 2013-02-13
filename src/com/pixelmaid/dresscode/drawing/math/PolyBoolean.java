package com.pixelmaid.dresscode.drawing.math;

import java.util.ArrayList;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.drawing.primitive2d.Hole;
import com.pixelmaid.dresscode.drawing.primitive2d.Polygon;
import com.seisw.util.geom.Point2D;
import com.seisw.util.geom.Poly ;
import com.seisw.util.geom.PolyDefault ;

public class PolyBoolean{
	
	//performs union of two polygons and returns the result
	public static Drawable union(Drawable a, Drawable b){
		Poly a_Poly =  drawableToBoolean(a);
		Poly b_Poly =  drawableToBoolean(b);

		
		Poly o_Poly = a_Poly.union(b_Poly);
		
		//System.out.println("oPoly.size="+o_Poly.getNumPoints());

		return booleanToPolygon(o_Poly);
	}
	
	//performs difference of two polygons and returns the result
	public static Drawable difference(Drawable a, Drawable b) {
		Poly a_Poly =  drawableToBoolean(a);
		Poly b_Poly =  drawableToBoolean(b);
		Poly o_Poly = a_Poly.difference(b_Poly);
		//System.out.println("oPoly.size="+o_Poly.getNumPoints());

		return booleanToPolygon(o_Poly);
	}
	
	//converts drawable polygon to boolean operation polygon
	private static Poly drawableToBoolean(Drawable d){
		Poly m_Poly = new PolyDefault(); // master level polygon
		d = d.condense();
		
		if(d.isPolygon()){
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
	
	private static Poly polygonToBoolean(Polygon p){
		
		ArrayList<Point> pPoints = p.getPoints();

		//temp polygon to be stored in master polygon
		Poly p_Poly = new PolyDefault();

		//add all polygon points to temp polygon
		for(int i=0;i<pPoints.size();i++)
		{
			Point pt = new Point(pPoints.get(i).getX()+p.getOrigin().getX(),pPoints.get(i).getY()+p.getOrigin().getY());
			pt.rotate(p.getRotation(),p.getOrigin());

			p_Poly.add( new Point2D(pt.getX(),pt.getY()) );
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
				Point pt = new Point(holePoints.get(k).getX()+p.getOrigin().getX(),holePoints.get(k).getY()+p.getOrigin().getY());
				pt.rotate(p.getRotation(),p.getOrigin());

				h_Poly.add( new Point2D(pt.getX(),pt.getY()) );
			}
		}
		return p_Poly;
	}
	//converts boolean operation polygon to drawable polygon
	private static Drawable booleanToPolygon(Poly poly){
	
		Drawable master = new Drawable();
		ArrayList<Point> origins = new ArrayList<Point>();
		for( int i = 0 ; i < poly.getNumInnerPoly() ; i++ )
	      {
	         Poly ip = poly.getInnerPoly(i);
	         Polygon p = innerPolyToPolygon(ip);
	         System.out.println(p.getPoints().size());
	         origins.add(Geom.findCentroid(p));
	         master.add(p);
	      }
		master.alterOrigin(Geom.getAveragePoint(origins));
		return master;
	}
	
	   private static Polygon innerPolyToPolygon(Poly ip)
	   {
	      Polygon jp = new Polygon();
	      for( int i = 0 ; i < ip.getNumPoints(); i++ )
	      {
	         jp.addPoint( ip.getX(i), ip.getY(i));
	      }
	      for( int i = 0 ; i < ip.getNumInnerPoly() ; i++ )
	      {
	         Poly ipp = ip.getInnerPoly(i);
	         Hole h = innerPolyToHole(ipp);
	       
	         jp.addHole(h);
	      }
	      
	     return jp;
	   }
	   
	   private static Hole innerPolyToHole(Poly ip )
	   {
	      Hole jp = new Hole();
	      System.out.println("ip.numPoints="+ip.getNumPoints());
	      for( int i = 0 ; i < ip.getNumPoints(); i++ )
	      {
	         jp.addPoint( ip.getX(i), ip.getY(i) );
	      }
	      
	     return jp;
	   }

	
	
	 
	
	
}