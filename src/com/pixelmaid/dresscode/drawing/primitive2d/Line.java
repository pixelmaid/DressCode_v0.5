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
	}
	
	//initialize line from polar coordinates
	public Line(Point origin, double radius, double theta) {
		 this(origin,Geom.polarToCart(radius, theta).copy().add(origin));
	}
	
	@Override
	public void draw(Embedded e){
		e.line((float)start.getX(), (float)start.getY(), (float)end.getX(), (float)end.getY());
	}
	
	@Override
	public void print(Embedded e){
		//TODO:implement print method
	}
	
	@Override
	public void moveTo(double x, double y) {
       this.start.moveTo(x, y, new Point(0,0));
       this.end.moveTo(x, y, new Point(0,0));
        
    }
	
	@Override
	public void moveBy(double x, double y){
		 this.start.moveBy(x, y);
		 this.end.moveBy(x, y);
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
	public ArrayList<Line> getAllLines() {
		 ArrayList<Line>lines = new ArrayList<Line>();
		 lines.add(this);
		return lines;
	}
	

}
