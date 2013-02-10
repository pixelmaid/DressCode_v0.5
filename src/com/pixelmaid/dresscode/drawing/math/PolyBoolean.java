package com.pixelmaid.dresscode.drawing.math;

import java.util.ArrayList;

import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.primitive2d.Hole;
import com.pixelmaid.dresscode.drawing.primitive2d.Polygon;
import com.seisw.util.geom.Point2D;
import com.seisw.util.geom.Poly ;
import com.seisw.util.geom.PolyDefault ;

public class PolyBoolean{
	
	//performs union of two polygons and returns the result
	public static Polygon union(Polygon a, Polygon b){
		Poly a_Poly =  polygonToBoolean(a);
		Poly b_Poly =  polygonToBoolean(b);
		Point origin = Geom.getMidpoint(a.getOrigin(),b.getOrigin());
		Poly o_Poly = a_Poly.union(b_Poly);
		
		//System.out.println("oPoly.size="+o_Poly.getNumPoints());

		return booleanToPolygon(o_Poly,origin);
	}
	
	//performs difference of two polygons and returns the result
	public static Polygon difference(Polygon a, Polygon b) {
		Poly a_Poly =  polygonToBoolean(a);
		Poly b_Poly =  polygonToBoolean(b);
		Poly o_Poly = a_Poly.difference(b_Poly);
		Point origin = Geom.getMidpoint(a.getOrigin(),b.getOrigin());
		//System.out.println("oPoly.size="+o_Poly.getNumPoints());

		return booleanToPolygon(o_Poly,origin);
	}
	
	//converts drawable polygon to boolean operation polygon
	private static Poly polygonToBoolean(Polygon p){
		ArrayList<Point> pPoints = p.getPoints();
		Poly p_Poly = new PolyDefault();
		
		for(int i=0;i<pPoints.size();i++)
        {
           Point pt = new Point(pPoints.get(i).getX()+p.getOrigin().getX(),pPoints.get(i).getY()+p.getOrigin().getY());
           pt.rotate(p.getRotation(),p.getOrigin());
           
           p_Poly.add( new Point2D(pt.getX(),pt.getY()) );
        }
		return p_Poly;
	}
	//converts boolean operation polygon to drawable polygon
	private static Polygon booleanToPolygon(Poly poly, Point o){
		
		System.out.println("oPoly.numInnnerPoly="+poly.getNumInnerPoly());
		if(poly.getNumInnerPoly()==0){
			Polygon p= new Polygon();
			p.setOrigin(o);
			return p;
		}
		else if(poly.getNumInnerPoly()==1){
			Polygon p= innerPolyToPolygon(poly,o);
			p.setOrigin(o);
			return p;
		}
		else if(poly.getNumInnerPoly()>1){
			
		 Polygon masterPoly = new Polygon();
		for( int i = 0 ; i < poly.getNumInnerPoly() ; i++ )
	      {
	         Poly ip = poly.getInnerPoly(i);
	         
	         if (ip.isHole()){
	        	masterPoly.addHole(innerPolyToHole( ip,o )) ;
	         }
	         else{
	        	 masterPoly.addAllPoints(innerPolyToPolygon( ip, o ));
	         }
	      }
		masterPoly.setOrigin(o);
		return masterPoly;
	   }
		
			
			System.err.println("Unable to convert boolean to polygon");
			return null;
		}
	
	   private static Polygon innerPolyToPolygon(Poly ip, Point origin )
	   {
	      Polygon jp = new Polygon();
	      System.out.println("ip.numPoints="+ip.getNumPoints());
	      for( int i = 0 ; i < ip.getNumPoints(); i++ )
	      {
	         jp.addPoint( ip.getX(i)-origin.getX(), ip.getY(i)-origin.getY() );
	      }
	      
	     return jp;
	   }
	   
	   private static Hole innerPolyToHole(Poly ip, Point origin )
	   {
	      Hole jp = new Hole();
	      System.out.println("ip.numPoints="+ip.getNumPoints());
	      for( int i = 0 ; i < ip.getNumPoints(); i++ )
	      {
	         jp.addPoint( ip.getX(i)-origin.getX(), ip.getY(i)-origin.getY() );
	      }
	      
	     return jp;
	   }

	
	
	
	
	
}