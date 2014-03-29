package com.pixelmaid.dresscode.drawing.primitive2d;


import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PGraphics;

import com.pixelmaid.dresscode.app.Canvas;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.math.Geom;
import com.pixelmaid.dresscode.drawing.math.PolyBoolean;
import com.pixelmaid.dresscode.drawing.math.Vec2d;


public class Curve extends Polygon { //series of symmetrical curved lines grouped together in a single line
	private int resolution = 20; // resolution of each curve
	private boolean showPoints = false;
	public Point control1;
	public Point control2;
	public Point start;
	public Point end;
	public Boolean open = true;
	public Boolean showControl = false;

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
		this.origin= this.getOrigin();
		this.doFill(false);

	}



	@Override
	public void draw(Canvas e){
		//TODO: MAKE CURVE DRAW ORIGIN CORRECTLY
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
			e.bezier((float)(start.getX()-getOrigin().getX()), (float)(start.getY()-getOrigin().getY()),(float)(control1.getX()-getOrigin().getX()), (float)(control1.getY()-getOrigin().getY()), (float)(control2.getX()-origin.getX()), (float)(control2.getY()-origin.getY()),(float)(end.getX()-origin.getX()), (float)(end.getY()-origin.getY()));
			e.popMatrix();
			if(showControl){
				drawPoints(e);
			}

		}
	}


	public void drawPoints(Canvas e){
		e.pushMatrix();
		e.strokeWeight(1);
		e.stroke(100,100,100);
		e.translate((float)(getOrigin().getX()),(float)(getOrigin().getY()));
		e.rotate(PApplet.radians((float)getRotation()));
		e.line((float)(start.getX()-getOrigin().getX()), (float)(start.getY()-getOrigin().getY()), (float)(control1.getX()-getOrigin().getX()), (float)(control1.getY()-getOrigin().getY()));
		e.line((float)(control2.getX()-getOrigin().getX()), (float)(control2.getY()-getOrigin().getY()), (float)(end.getX()-getOrigin().getX()), (float)(end.getY()-getOrigin().getY()));
		e.strokeWeight(5);
		e.stroke(255,0,0);
		e.point((float)(start.getX()-getOrigin().getX()), (float)(start.getY()-getOrigin().getY()));
		e.point((float)(control1.getX()-getOrigin().getX()), (float)(control1.getY()-getOrigin().getY()));
		e.point((float)(control2.getX()-getOrigin().getX()), (float)(control2.getY()-getOrigin().getY()));
		e.point((float)(end.getX()-getOrigin().getX()), (float)(end.getY()-getOrigin().getY()));
		e.popMatrix();

	}
	
	@Override
	public void drawOrigin(Canvas e){
		e.stroke(0,0,0);
		e.strokeWeight(8);
		e.point((float)this.origin.getX(),(float)this.origin.getY());

		e.stroke(255,255,255);
		e.strokeWeight(4);
		e.point((float)this.origin.getX(),(float)this.origin.getY());

		e.pushMatrix();
		e.translate((float)(getOrigin().getX()),(float)(getOrigin().getY()));
		e.stroke(255,0,0);
		e.strokeWeight(5);
		e.point((float)(control1.getX()-getOrigin().getX()), (float)(control1.getY()-getOrigin().getY()));
		e.stroke(0,0,255);
		e.point((float)(control2.getX()-getOrigin().getX()), (float)(control2.getY()-getOrigin().getY()));
		e.popMatrix();
	}

	@Override
	public void print(PGraphics e){
		//TODO: MAKE CURVE DRAW RELATIVE
		if(!this.getHide()){
			appearance(e);
			//e.noFill();
			e.pushMatrix();
			e.translate((float)(getOrigin().getX()),(float)(getOrigin().getY()));
			e.rotate(PApplet.radians((float)getRotation()));
			e.scale((float)getScaleX(),(float)getScaleY());
			e.bezier((float)start.getX(), (float)start.getY(),(float)control1.getX(), (float)control1.getY(), (float)control2.getX(), (float)control2.getY(),(float)end.getX(), (float)end.getY());
			e.popMatrix();
		}

	}

	@Override 
	public Drawable setAbsolute() {

		if(this.getParent()!=null){
			this.start= this.start.add(this.getParent().getOrigin()); //add parent's origin to its origin
			this.end= this.end.add(this.getParent().getOrigin()); //add parent's origin to its origin
			this.control1= this.control1.add(this.getParent().getOrigin()); //add parent's origin to its origin
			this.control2= this.control2.add(this.getParent().getOrigin()); //add parent's origin to its origin
			this.rotation = (this.getRotation()+this.getParent().getRotation()); //adds parent's rotation to its rotation
		}
		return this;



	}


	@Override
	public Curve copy(){
		Curve c = new Curve(start.copy(),control1.copy(),control2.copy(),end.copy());
		copyParameters(this,c);
		return c;
	}

	@Override
	//rotates around a focus. does not change the rotation property
	public Drawable rotateWithFocus(double theta, Point focus, Boolean top){	
		this.setPointsAbsolute();

		start= start.rotate(theta, focus);
		end =  end.rotate(theta, focus);
		control1= control1.rotate(theta, focus);
		control2 =  control2.rotate(theta, focus);

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
		Point c1 = control1.copy();
		Point c2 = control2.copy();

		double delta = focus.getX()-p1.getX();
		double xNew = focus.getX()+delta;
		start = new Point(xNew,p1.getY());

		delta = focus.getX()-p2.getX();
		xNew = focus.getX()+delta;
		end = new Point(xNew,p2.getY());

		delta = focus.getX()-c1.getX();
		xNew = focus.getX()+delta;
		control1 = new Point(xNew,c1.getY());


		delta = focus.getX()-c2.getX();
		xNew = focus.getX()+delta;
		control2 = new Point(xNew,c2.getY());
		this.origin= this.getOrigin();

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
		Point c1 = control1.copy();
		Point c2 = control2.copy();

		double delta = focus.getY()-p1.getY();
		double yNew = focus.getY()+delta;
		start = new Point(p1.getX(),yNew);

		delta = focus.getY()-p2.getY();
		yNew = focus.getY()+delta;
		end = new Point(p2.getX(),yNew);

		delta = focus.getY()-c1.getY();
		yNew = focus.getY()+delta;
		control1 = new Point(c1.getX(),yNew);


		delta = focus.getY()-c2.getY();
		yNew = focus.getY()+delta;
		control2 = new Point(c2.getX(),yNew);
		this.origin= this.getOrigin();

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
		Point c1 = this.control1.copy();
		Point c2 = this.control2.copy();
		
		Vec2d vX = new Vec2d(p1.getX()-focus.getX(),p1.getY()-focus.getY());
		vX = vX.mul(x);
		p1.setX(vX.x+focus.getX());

		Vec2d vY = new Vec2d(p1.getX()-focus.getX(),p1.getY()-focus.getY());
		vY = vY.mul(y);
		p1.setY(vY.y+focus.getY());
		start=p2;

		vX = new Vec2d(p2.getX()-focus.getX(),p2.getY()-focus.getY());
		vX = vX.mul(x);
		p2.setX(vX.x+focus.getX());


		vY = new Vec2d(p2.getX()-focus.getX(),p2.getY()-focus.getY());
		vY = vY.mul(y);
		p2.setY(vY.y+focus.getY());
		end=p1;

		vX = new Vec2d(c1.getX()-focus.getX(),c1.getY()-focus.getY());
		vX = vX.mul(x);
		c1.setX(vX.x+focus.getX());

		vY = new Vec2d(c1.getX()-focus.getX(),c1.getY()-focus.getY());
		vY = vY.mul(y);
		c1.setY(vY.y+focus.getY());
		control1 = c1;

		vX = new Vec2d(c2.getX()-focus.getX(),c2.getY()-focus.getY());
		vX = vX.mul(x);
		c2.setX(vX.x+focus.getX());

		vY = new Vec2d(c2.getX()-focus.getX(),c2.getY()-focus.getY());
		vY = vY.mul(y);
		c2.setY(vY.y+focus.getY());
		control2=c2;

		this.getOrigin();

		if(top){
			resetOriginRecur();
		}
		return this;
	}

	@Override
	public void resetOriginRecur(){

		this.origin=this.getOrigin();
		//this.setPointsRelativeTo(this.origin);
	}

	@Override 
	protected void setRelativeTo(Point p) {

		this.start = this.start.difference(p);
		this.end = this.end.difference(p);
		this.control1 = this.control1.difference(p);
		this.control2 = this.control2.difference(p);
		this.getOrigin();


	}

	@Override
	//converts curve to polygon
	public Polygon toPolygon() {
		Polygon poly =  new Polygon();
		copyParameters(this,poly);

		for (int i = 0; i <= resolution; i++) {
			float t = (float)i / (float)resolution;
			PGraphics p = new PGraphics();
			double x = p.bezierPoint((float)start.getX(), (float)control1.getX(), (float)control2.getX(), (float)end.getX(), t);
			double y = p.bezierPoint((float)start.getY(), (float)control1.getY(), (float)control2.getY(), (float)end.getY(), t);
			poly.addPoint(x,y);
		}
		poly.setPointsRelativeTo(this.getOrigin());
		return poly;
	}
	
	public double length() {
		//System.out.println(this.start.getX()+","+this.start.getY()+","+this.control1.getX()+","+this.control1.getY()+","+this.control2.getX()+","+this.control2.getY()+","+this.end.getX()+","+this.end.getY());
		Polygon poly =  this.toPolygon();
		ArrayList<Point> points = poly.getPoints();
		double length = 0;
		for (int i = 1; i < points.size(); i++) {
			double dist = Geom.distance(points.get(i), points.get(i-1));
			length+=dist;
		}
		return length;
	}
	
	public ArrayList<Point> toPoints(int num, boolean getEnd) {
		ArrayList<Point> points = new ArrayList<Point>();
		points.add(start.copy());
		if(getEnd){
			num= num-2;
		}
		else{
			num= num-1;
		}
		for (int i = 1; i < num; i++) {
			float t = (float)i / (float)num;
			PGraphics p = new PGraphics();
			
			double x = p.bezierPoint((float)start.getX(), (float)control1.getX(), (float)control2.getX(), (float)end.getX(), t);
			double y = p.bezierPoint((float)start.getY(), (float)control1.getY(), (float)control2.getY(), (float)end.getY(), t);
			points.add(new Point(x,y));
		}
		if(getEnd){
			points.add(end.copy());
		}
		return points;
	}

	@Override
	public Drawable expand(){

		Polygon poly =  new Polygon();

		double xLast =0;
		double yLast = 0;
		for (int i = 0; i <= resolution; i++) {
			float t = (float)i / (float)resolution;
			PGraphics a = new PGraphics();
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
	public Point getOrigin(){
		this.origin= this.getMidPoint();
		return this.origin;
	}

	public Point getMidPoint(){
		return Geom.getMidpoint(this.start, this.end);
	}

	@Override
	public void moveTo(double x, double y){
		this.origin= this.getOrigin();
		double dx = x - this.origin.getX();
		double dy = y-this.origin.getY();
		this.start.moveBy(dx,dy);
		this.end.moveBy(dx,dy);
		this.control1.moveBy(dx, dy);
		this.control2.moveBy(dx, dy);
		this.origin= this.getOrigin();
	}

	@Override
	public void moveBy(double x, double y){

		this.start.moveBy(x,y);
		this.end.moveBy(x,y);
		this.control1.moveBy(x, y);
		this.control2.moveBy(x, y);
		this.origin= this.getOrigin();
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

	public Point getControl1(){
		return this.control1.copy();
	}
	public Point getControl2(){
		return this.control2.copy();
	}

	public void setEnd(double x, double y) {
		this.end = new Point(x,y);

	}
	public void setStart(double x, double y) {
		this.start = new Point(x,y);

	}
	public void setControl1(double x, double y) {
		this.control1 = new Point(x,y);

	}
	public void setControl2(double x, double y) {
		this.control2 = new Point(x,y);

	}





}