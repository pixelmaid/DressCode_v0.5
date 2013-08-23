package com.pixelmaid.dresscode.drawing.primitive2d;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PGraphics;

import com.pixelmaid.dresscode.app.Canvas;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.math.Geom;
import com.pixelmaid.dresscode.drawing.math.Vec2d;

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
		return this.width;
	}
	
	public double getHeight(){
		return this.height;
	
	}
	
	public void setWidth(double w){
		this.width=w;
	}
	
	public void setHeight(double h){
		this.height=h;
	
	}
	
	@Override
	public void draw(Canvas e){
		if(!this.getHide()){
		appearance(e.g);
		if(this.getSelected()){
			e.strokeWeight(2);
			e.stroke(Drawable.SELECTED.r(),Drawable.SELECTED.g(),Drawable.SELECTED.b());
		}
		e.pushMatrix();
		e.translate((float)(getOrigin().getX()),(float)(getOrigin().getY()));
		e.rotate(PApplet.radians((float)getRotation()));
		e.scale((float)getScaleX(),(float)getScaleY());
		e.rectMode(PConstants.CENTER);
		e.rect(0,0,(float)width,(float)height);
		e.popMatrix();
		
		/*if(this.getDrawOrigin()){
			this.drawOrigin(e);
		}*/	
		}
	}
	
	@Override
	public void print(PGraphics e){
		if(!this.getHide()){
		appearance(e);
		//e.noFill();
		e.pushMatrix();
		e.translate((float)(getOrigin().getX()),(float)(getOrigin().getY()));
		e.rotate(PApplet.radians((float)getRotation()));
		e.scale((float)getScaleX(),(float)getScaleY());
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
	//rotates around a focus. does not change the rotation property
	public Drawable rotateWithFocus(double theta, Point focus, Boolean top){
		Polygon p = this.toPolygon();
		return p.rotateWithFocus(theta, focus, top);	
	}
	
	@Override
	public Drawable mirrorX(Point focus, Boolean top){
		this.setAbsolute();
			Point p1 = origin.copy();
			
			double delta = focus.getX()-p1.getX();
			double xNew = focus.getX()+delta;
			this.setOrigin(new Point(xNew,p1.getY()));
			
			
			
		if(top){
			resetOriginRecur();
		}
		return this;
	}
	@Override
	public Drawable mirrorY(Point focus, Boolean top){
		this.setAbsolute();
			Point p1 = origin.copy();
			
			double delta = focus.getY()-p1.getY();
			double yNew = focus.getY()+delta;
			this.setOrigin(new Point(p1.getX(),yNew));
			
			
			
		if(top){
			resetOriginRecur();
		}
		return this;
	}
	
	@Override
	public void resetOriginRecur(){
			
		System.out.println("no origin reset needed for rectangle");
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
	public Drawable scale(double x, double y, Point focus, Boolean top){
		this.setAbsolute();
		Point p = this.getOrigin();
		Vec2d vX = new Vec2d(p.getX()-focus.getX(),p.getY()-focus.getY());
		vX = vX.mul(x);
		p.setX(vX.x+focus.getX());
		
		Vec2d vY = new Vec2d(p.getX()-focus.getX(),p.getY()-focus.getY());
		vY = vY.mul(y);
		p.setY(vY.y+focus.getY());
		this.setOrigin(p);
		
		this.width = this.width*x;
		this.height = this.height*y;
		
		if(top){
			resetOriginRecur();
		}
		return this;
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
