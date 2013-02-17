package com.pixelmaid.dresscode.drawing.primitive2d;

import java.util.ArrayList;
import com.pixelmaid.dresscode.app.Embedded;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.math.Geom;

public class Line extends Drawable {
	private Point start;
	private Point end;
	
	//initialize line from 4 x/y coordinates values
		public Line(ArrayList<Double> values) {
			this(values.get(0),values.get(1),values.get(2),values.get(3));
		}
	//initialize line from 4 x/y coordinates values
	public Line(double startX, double startY, double endX, double endY) {
		this(new Point(startX,startY),new Point(endX,endY));
	}
	
	//initialize line from two points;
	public Line(Point s, Point e) {
		this.start = s;
		this.end = e;
		this.origin=Geom.getMidpoint(start, end);
	}
	
	//initialize line from polar coordinates
	public Line(Point origin, double radius, double theta) {
		 this(origin,Geom.polarToCart(radius, theta).copy().add(origin));
	}
	
	@Override
	public void draw(Embedded e){
		appearance(e);
		e.line((float)start.getX(), (float)start.getY(), (float)end.getX(), (float)end.getY());
		
		
		if(this.getDrawOrigin()){
			this.drawOrigin(e);
		}
	}
	
	@Override
	public void print(Embedded e){
		//TODO:implement print method
	}
	
	@Override
	 public Line copy(){
	    return new Line(start.copy(),end.copy());
	  }
	 
	public Point getStart(){
		return this.start.copy();
	}
	public Point getEnd(){
		return this.end.copy();
	}
	
	public Point getMidPoint(){
		return Geom.getMidpoint(this.start, this.end);
	}
	
	@Override 
	public Point getOrigin(){
		return this.start;
	}

	
	@Override
	//converts line to polygon (questionable...)
	public Drawable toPolygon(){
		Polygon poly = new Polygon(this.origin);
		
		poly.addPoint(start);
		poly.addPoint(end);
		poly.rotate(this.getRotation());
		return poly;
		
	}

}
