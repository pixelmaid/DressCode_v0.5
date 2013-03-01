package com.pixelmaid.dresscode.drawing.primitive2d;


import java.util.ArrayList;

import processing.core.PApplet;

import com.pixelmaid.dresscode.app.Embedded;
import com.pixelmaid.dresscode.app.Manager;
import com.pixelmaid.dresscode.app.Window;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.math.Geom;

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
	public Curve(ArrayList<Double> values) {
		this(values.get(0),values.get(1),values.get(2),values.get(3),values.get(4),values.get(5),values.get(6),values.get(7));
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
		e.bezier((float)(start.getX()-getOrigin().getX()), (float)(start.getY()-getOrigin().getY()),(float)(control1.getX()-getOrigin().getX()), (float)(control1.getY()-getOrigin().getY()), (float)(control2.getX()-origin.getX()), (float)(control2.getY()-origin.getY()),(float)(end.getX()-origin.getX()), (float)(end.getY()-origin.getY()));
		e.stroke(255,0,0);
		e.strokeWeight(5);
		e.point((float)(control1.getX()-getOrigin().getX()), (float)(control1.getY()-getOrigin().getY()));
		e.stroke(0,0,255);
		e.point((float)(control2.getX()-getOrigin().getX()), (float)(control2.getY()-getOrigin().getY()));
		e.popMatrix();
		if(this.getDrawOrigin()){
			this.drawOrigin(e);
		}
		}
	}

	
	@Override
	public void print(Embedded e){
		//TODO: MAKE CURVE DRAW RELATIVE
		if(!this.getHide()){
		appearance(e);
		e.pushMatrix();
		e.translate((float)(getOrigin().getX()),(float)(getOrigin().getY()));
		e.rotate(PApplet.radians((float)getRotation()));
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
	//converts ellipse to polygon
	public Polygon toPolygon() {
		Polygon poly =  new Polygon();
		copyParameters(this,poly);
		
			for (int i = 0; i <= resolution; i++) {
				float t = (float)i / (float)resolution;
				double x = Window.canvas.bezierPoint((float)start.getX(), (float)control1.getX(), (float)control2.getX(), (float)end.getX(), t);
				double y = Window.canvas.bezierPoint((float)start.getY(), (float)control1.getY(), (float)control2.getY(), (float)end.getY(), t);
				poly.addPoint(x,y);
			}
			return poly;
		}
			


}