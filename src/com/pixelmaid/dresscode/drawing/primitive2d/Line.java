package com.pixelmaid.dresscode.drawing.primitive2d;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PGraphics;

import com.pixelmaid.dresscode.app.Canvas;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.math.Geom;
import com.pixelmaid.dresscode.drawing.math.PolyBoolean;
import com.pixelmaid.dresscode.drawing.math.Vec2d;

public class Line extends Polygon {
	private Point start;
	private Point end;
	
	//initialize line from 4 x/y coordinates values
		public Line(double[] values) {
			this(values[0],values[1],values[2],values[3]);
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
		e.line((float)(start.getX()-getOrigin().getX()), (float)(start.getY()-getOrigin().getY()),(float)(end.getX()-getOrigin().getX()), (float)(end.getY()-getOrigin().getY()));
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
		e.line((float)(start.getX()-getOrigin().getX()), (float)(start.getY()-getOrigin().getY()),(float)(end.getX()-getOrigin().getX()), (float)(end.getY()-getOrigin().getY()));
		e.popMatrix();
		}
	}
	
	@Override
	 public Line copy(){
	    Line l = new Line(start.copy(),end.copy());
	    copyParameters(this,l);
	    return l;
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
		this.origin= this.getMidPoint();
		return this.origin;
	}
	
	
	@Override
	public void moveTo(double x, double y){
		double dx = x - this.origin.getX();
		double dy = y-this.origin.getY();
		this.start.moveBy(dx,dy);
		this.end.moveBy(dx,dy);
		this.origin= Geom.getMidpoint(start, end);
	}
	
	@Override
	public void moveBy(double x, double y){
		
		this.start.moveBy(x,y);
		this.end.moveBy(x,y);
		this.origin= Geom.getMidpoint(start, end);
	}
	
	@Override
	//rotates around a focus. does not change the rotation property
	public Drawable rotateWithFocus(double theta, Point focus, Boolean top){	
		this.setPointsAbsolute();
		
			start= start.rotate(theta, focus);
			end =  end.rotate(theta, focus);
		
		if(top){
			resetOriginRecur();
		}
		return this;
	}
	
		
		
		@Override
		public Drawable mirrorX(Point focus, Boolean top){
			this.setAbsolute();
				Point p1 = start.copy();
				Point p2 = end.copy();
				double delta = focus.getX()-p1.getX();
				double xNew = focus.getX()+delta;
				start = new Point(xNew,p1.getY());
				
				delta = focus.getX()-p2.getX();
				xNew = focus.getX()+delta;
				end = new Point(xNew,p2.getY());
				this.origin= Geom.getMidpoint(start,end);
				
			if(top){
				resetOriginRecur();
			}
			return this;
		}
		@Override
		public Drawable mirrorY(Point focus, Boolean top){
			this.setAbsolute();
	
				Point p1 = start.copy();
				Point p2 = end.copy();
				double delta = focus.getY()-p1.getY();
				double yNew = focus.getY()+delta;
				start = new Point(p1.getX(),yNew);
				
				delta = focus.getY()-p2.getY();
				yNew = focus.getY()+delta;
				end = new Point(p2.getX(),yNew);
				this.origin= Geom.getMidpoint(start,end);

				if(top){
					resetOriginRecur();
				}	
			return this;
		}
		
		
		@Override
		public Drawable scale(double x, double y, Point focus, Boolean top){
			this.setAbsolute();
			Point p1 = this.end.copy();
			Point p2 = this.start.copy();
			Vec2d vX = new Vec2d(p1.getX()-focus.getX(),p1.getY()-focus.getY());
			vX = vX.mul(x);
			p1.setX(vX.x+focus.getX());
			
			Vec2d vY = new Vec2d(p1.getX()-focus.getX(),p1.getY()-focus.getY());
			vY = vY.mul(y);
			p1.setY(vY.y+focus.getY());
			start = p1;
			
			vX = new Vec2d(p2.getX()-focus.getX(),p2.getY()-focus.getY());
			vX = vX.mul(x);
			p2.setX(vX.x+focus.getX());
			
			vY = new Vec2d(p2.getX()-focus.getX(),p2.getY()-focus.getY());
			vY = vY.mul(y);
			p2.setY(vY.y+focus.getY());
			end=p2;
			
			this.origin  = Geom.getMidpoint(start, end);
			
			if(top){
				resetOriginRecur();
			}
			return this;
		}
	
	public double getAngle(){
		return Geom.angleBetweenPoints(this.start, this.end);
	}
		
	@Override
	public void resetOriginRecur(){
			
		this.origin=Geom.getMidpoint(start, end);
		//this.setPointsRelativeTo(this.origin);
		}
	
	@Override
	//converts line to polygon (questionable...)
	public Polygon toPolygon(){
		Polygon poly =  new Polygon();
		copyParameters(this,poly);
		poly.addPoint(start);
		poly.addPoint(end);
		return poly;
		
	}
	
	@Override
	//sets the points and holes relative around a new origin
	public void setPointsRelativeTo(Point p) {
		
		this.moveTo(p.getX(), p.getY());
	}
	
	
	@Override
	public Drawable expand(boolean top){
		System.out.println("line expand called");
		if(this.getStrokeWeight()<1){
			this.setStrokeWeight(1);
		}
		this.end.rotate(this.getRotation(), this.start);
		double dx = end.getX()-start.getX();
		double dy = end.getY()-start.getY();
		Vec2d n1 = Vec2d.Normalize(new Vec2d(-dy,dx)).mul(this.getStrokeWeight()/2);
		Vec2d n2 = Vec2d.Normalize(new Vec2d(dy,-dx)).mul(this.getStrokeWeight()/2);
		
		
		Polygon p = new Polygon();
		p.addPoint(n1.x+start.getX(),n1.y+start.getY());
		p.addPoint(n1.x+end.getX(),n1.y+end.getY());
		p.addPoint(n2.x+end.getX(),n2.y+end.getY());
		p.addPoint(n2.x+start.getX(),n2.y+start.getY());
		
		p.setPointsRelativeTo(this.getMidPoint());
		Ellipse e1 = new Ellipse(this.start,this.getStrokeWeight(),this.getStrokeWeight());
		Ellipse e2 = new Ellipse(this.end,this.getStrokeWeight(),this.getStrokeWeight());
		Polygon d = (Polygon)PolyBoolean.union(e2,PolyBoolean.union(p,e1));
		d.copyParameters(this,d);
		d.setFillColor(this.getStrokeColor());
		d.doStroke(false);
		d.setPointsAbsolute();
		if(top){
			d.resetOriginRecur();
		}
		return d;
		

	}
	@Override 
	protected void setRelativeTo(Point p) {

		this.start = this.start.difference(p);
		this.end = this.end.difference(p);
		this.origin= Geom.getMidpoint(start,end);

		
	}
	
	@Override 
	public Drawable setAbsolute() {
		
		if(this.getParent()!=null){
			this.start= this.start.add(this.getParent().getOrigin()); //add parent's origin to its origin
			this.end= this.end.add(this.getParent().getOrigin()); //add parent's origin to its origin

			this.rotation = (this.getRotation()+this.getParent().getRotation()); //adds parent's rotation to its rotation
		}
		
		return this;

		
		
	}
	
	@Override
	public Point pointAt(int i){
		if(i==0){
			return this.start.copy();
		}
		else if (i==1){
			return this.end.copy();
		}
		throw new RuntimeException("Illegal point index at line call");
	}
	public void setEnd(double x, double y) {
	 this.end = new Point(x,y);
		
	}
	public void setStart(double x, double y) {
		 this.start = new Point(x,y);
			
		}

}
