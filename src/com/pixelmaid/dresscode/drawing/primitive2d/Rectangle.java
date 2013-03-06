package com.pixelmaid.dresscode.drawing.primitive2d;

import processing.core.PApplet;
import processing.core.PConstants;

import com.pixelmaid.dresscode.app.Embedded;
import com.pixelmaid.dresscode.drawing.datatype.Point;

public class Rectangle extends Polygon{
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
	
	public double getWidth(){
		return this.height;
	}
	
	public double getHeight(){
		return this.width;
	
	}
	
	@Override
	public void draw(Embedded e){
		if(!this.getHide()){
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
	}
	
	@Override
	public void print(Embedded e){
		if(!this.getHide()){
		appearance(e);
		e.pushMatrix();
		e.translate((float)(getOrigin().getX()),(float)(getOrigin().getY()));
		e.rotate(PApplet.radians((float)getRotation()));
		e.rectMode(PConstants.CENTER);
		e.rect(0,0,(float)width,(float)height);
		e.popMatrix();
		}
		
	}
	
	@Override
    public Rectangle copy(){
		Rectangle e = new Rectangle(0,0);
    	copyParameters(this,e);
    	e.width = this.width;
    	e.height = this.height;
    	return e;
    }
	
	@Override
	//converts rectangle to polygon
	public Polygon toPolygon() {
		Polygon poly =  new Polygon();
		copyParameters(this,poly);
		
		poly.addPoint(-(width/2),-(height/2));
		poly.addPoint(width/2,-(height/2));
		poly.addPoint(width/2,height/2);
		poly.addPoint(-(width/2),height/2);

		return poly;
	}
	
	@Override
	public Drawable expand(){
		Polygon ep = this.toPolygon();
		return ep.expand();
	}
	
	@Override
	public Point pointAt(int i){
		Polygon poly = this.toPolygon();
		poly.setPointsAbsolute();
		
		Point p = poly.getPoints().get(i).copy();
		
		return p;
	}


}
