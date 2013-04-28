package com.pixelmaid.dresscode.drawing.primitive2d;


import java.util.ArrayList;

import processing.core.PApplet;

import com.pixelmaid.dresscode.app.Embedded;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.math.Geom;
import com.pixelmaid.dresscode.drawing.math.PolyBoolean;


public class Curve extends Polygon { //series of symmetrical curved lines grouped together in a single line
	private int resolution = 20; // resolution of each curve
	private boolean showPoints = false;
	public Point control1;
	public Point control2;
	public Point start;
	public Point end;


	//TODO: implement two point curve
	//public Curve(double sX, double sY, double eX, double eY ){
	//this(new Point(sX,sY),new Point(c1X,c1Y),new Point(c2X,c2Y),new Point(eX,eY));

	//}
	
	//initialize curve from 4 x/y coordinates values
	public Curve(double[] values) {
		
		this(values[0],values[1],values[2],values[3],values[4],values[5],values[6],values[7]);
	}

	public Curve(double sX, double sY, double c1X, double c1Y, double c2X, double c2Y, double eX, double eY ){
		this(new Point(sX,sY),new Point(c1X,c1Y),new Point(c2X,c2Y),new Point(eX,eY));

	}


	public Curve(Point start, Point control1, Point control2, Point end){
		this.start=start;
		this.control1=control1;
		this.control2=control2;
		this.end=end;
		this.origin= Geom.getMidpoint(start, end);

	}

	@Override
	public void draw(Embedded e){
		//TODO: MAKE CURVE DRAW ORIGIN CORRECTLY
		if(!this.getHide()){
		appearance(e);
		e.pushMatrix();
		e.translate((float)(getOrigin().getX()),(float)(getOrigin().getY()));
		e.rotate(PApplet.radians((float)getRotation()));
		e.scale((float)getScaleX(),(float)getScaleY());
		e.bezier((float)(start.getX()-getOrigin().getX()), (float)(start.getY()-getOrigin().getY()),(float)(control1.getX()-getOrigin().getX()), (float)(control1.getY()-getOrigin().getY()), (float)(control2.getX()-origin.getX()), (float)(control2.getY()-origin.getY()),(float)(end.getX()-origin.getX()), (float)(end.getY()-origin.getY()));
		e.stroke(255,0,0);
		e.strokeWeight(5);
		e.point((float)(control1.getX()-getOrigin().getX()), (float)(control1.getY()-getOrigin().getY()));
		e.stroke(0,0,255);
		e.point((float)(control2.getX()-getOrigin().getX()), (float)(control2.getY()-getOrigin().getY()));
		e.popMatrix();
		/*if(this.getDrawOrigin()){
			this.drawOrigin(e);
		}*/
		}
	}

	
	@Override
	public void print(Embedded e){
		//TODO: MAKE CURVE DRAW RELATIVE
		if(!this.getHide()){
		appearance(e);
		e.noFill();
		e.pushMatrix();
		e.translate((float)(getOrigin().getX()),(float)(getOrigin().getY()));
		e.rotate(PApplet.radians((float)getRotation()));
		e.scale((float)getScaleX(),(float)getScaleY());
		e.bezier((float)start.getX(), (float)start.getY(),(float)control1.getX(), (float)control1.getY(), (float)control2.getX(), (float)control2.getY(),(float)end.getX(), (float)end.getY());
		e.popMatrix();
		}
		
	}


	/*@Override
	public void setAbsolute(){
		//do nothing;
	}*/

	@Override
	public Curve copy(){
		Curve c = new Curve(start.copy(),control1.copy(),control2.copy(),end.copy());
		copyParameters(this,c);
		return c;
	}
	
	@Override
	public Drawable rotateWithFocus(double theta, Point focus){
		this.start = start.rotate(theta, focus);
		this.end = end.rotate(theta, focus);
		this.control1 = control1.rotate(theta,focus);
		this.control2 = control2.rotate(theta,focus);
		this.origin= Geom.getMidpoint(start, end);
		return this;
	}
	
	@Override
	//converts ellipse to polygon
	public Polygon toPolygon() {
		Polygon poly =  new Polygon();
		copyParameters(this,poly);
		
			for (int i = 0; i <= resolution; i++) {
				float t = (float)i / (float)resolution;
				PApplet p = new PApplet();
				double x = p.bezierPoint((float)start.getX(), (float)control1.getX(), (float)control2.getX(), (float)end.getX(), t);
				double y = p.bezierPoint((float)start.getY(), (float)control1.getY(), (float)control2.getY(), (float)end.getY(), t);
				poly.addPoint(x,y);
			}
			poly.setPointsRelativeTo(this.origin);
			return poly;
		}
	
	@Override
	public Drawable expand(){
		
		Polygon poly =  new Polygon();
		
			double xLast =0;
			double yLast = 0;
			for (int i = 0; i <= resolution; i++) {
				float t = (float)i / (float)resolution;
				PApplet a = new PApplet();
				a.init();
				double x = a.bezierPoint((float)start.getX(), (float)control1.getX(), (float)control2.getX(), (float)end.getX(), t);
				double y = a.bezierPoint((float)start.getY(), (float)control1.getY(), (float)control2.getY(), (float)end.getY(), t);
				if(i>0){
					Line l = new Line(xLast,yLast,x,y);
					l.setStrokeWeight(this.getStrokeWeight());
					Polygon p = (Polygon)l.expand();
					if(i==1){
						poly = p;
					}
					else{
						poly = (Polygon) PolyBoolean.union(poly, p);
					}
				}
				
				xLast = x;
				yLast = y;
				a.dispose();
				a = null;
			}
			
			poly.setFillColor(this.getStrokeColor());
			poly.doStroke(false);
			return poly;
		

	

	}
	
	@Override
	public Point pointAt(int i){
		Polygon poly = this.toPolygon();
		poly.setPointsAbsolute();
		
		Point p = poly.getPoints().get(i).copy();
		
		return p;
	}
	
	public Point getStart(){
		return this.start.copy();
	}
	public Point getEnd(){
		return this.end.copy();
	}
			


}