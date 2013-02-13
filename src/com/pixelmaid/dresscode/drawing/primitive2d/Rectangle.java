package com.pixelmaid.dresscode.drawing.primitive2d;

import processing.core.PApplet;
import processing.core.PConstants;

import com.pixelmaid.dresscode.app.Embedded;
import com.pixelmaid.dresscode.drawing.datatype.Point;

public class Rectangle extends Drawable implements DrawableInterface{
	private double width;
	private double height;

	
	public Rectangle(double startX, double startY){
		this(startX,startY, DEFAULT_WIDTH, DEFAULT_WIDTH);

	}
	
	public Rectangle(double startX, double startY, double width){
		this(new Point(startX,startY), width, width);

	}
	
	public Rectangle(double startX, double startY, double width, double height){
		this(new Point(startX,startY), width, height);

	}
	
	public Rectangle(Point o, double width, double height){
		this.width=width;
		this.height=height;
		this.origin=o;
	}
	

	@Override
	public void moveBy(double x, double y) {
		this.origin.setX(origin.getX()+x);
		this.origin.setY(origin.getY()+y);
		
	}
	
	@Override
	public double getWidth(){
		return this.height;
	}
	
	@Override
	public double getHeight(){
		return this.width;
	
	}
	
	@Override
	public void draw(Embedded e){
		appearance(e);
		e.pushMatrix();
		e.translate((float)(getOrigin().getX()),(float)(getOrigin().getY()));
		e.rotate(PApplet.radians((float)getRotation()));
		e.rectMode(PConstants.CENTER);
		e.rect(0,0,(float)width,(float)height);
		e.popMatrix();
		
		if(this.getDrawOrigin()){
			this.drawOrigin(e);
		}
	}
	
	@Override
	//converts rectangle to polygon
	public Drawable toPolygon() {
		Polygon poly = new Polygon(this.origin.copy());
		
		
		poly.addPoint(0.0,0.0);
		poly.addPoint(width,0.0);
		poly.addPoint(width,height);
		poly.addPoint(0.0,height);

		
		return poly;
	}

}
