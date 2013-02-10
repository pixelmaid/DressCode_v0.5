package com.pixelmaid.dresscode.drawing.primitive2d;

import java.util.ArrayList;


import processing.core.PApplet;

import com.pixelmaid.dresscode.app.Embedded;

import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.math.Geom;

public class Polygon extends Drawable implements DrawableInterface, Turtle{
	private ArrayList<Point> points;
	private ArrayList<Hole> holes;
	private static double DEFAULT_LENGTH = 20;
	
	public Polygon(){
		this(0,0);
	}
	
	public Polygon(Point o){
		this.origin=o;
		points= new ArrayList<Point>();
		holes = new ArrayList<Hole>();
	}
	
	public Polygon(int sides, double length){
		this(0,0,sides,length);
	}
	
	public Polygon(double x, double y, int sides){
		this(x,y,sides,DEFAULT_LENGTH);
	}
	
	public Polygon(double x, double y,int sides, double length){
		this(new Point(x,y));
		double angle = 360/(double)sides;
		resetTurtle();
		for(int i=0;i<sides;i++){
			  this.forward(length);
			  this.right(angle);
			}
		
	}
	
	public void addHole(Hole h){
		holes.add(h);
	}
	
	public void addPoint(Double x, Double y){
		addPoint(new Point(x,y));
	}
	
	
	public void addPoint(Point point){
		this.points.add(point);
	}
	public void clearPoints(){
		this.points.clear();
	}
	public void addAllPoints(Polygon p) {
		this.points.addAll(p.getPoints());
		
	}
	
	@Override
	public void draw(Embedded e){
		System.out.println("number of holes="+this.holes.size()+"number of points="+this.points.size());
		e.pushMatrix();
		e.translate((float)(getOrigin().getX()),(float)(getOrigin().getY()));
		e.rotate(PApplet.radians((float)getRotation()));
		e.beginShape();
		for(int i=0;i<points.size();i++){
			e.vertex((float)points.get(i).getX(),(float)points.get(i).getY());
		}
		e.endShape(PApplet.CLOSE);	
		for(int i=0;i<holes.size();i++){
			holes.get(i).draw(e);
		}
		e.popMatrix();
	}
	
	public ArrayList<Point> getPoints(){
		return this.points;
	}
	
	
	//=============================TURTLE METHODS==================================//

			@Override
			public void left(double angle) {
				TurtleStruct.angle-=angle;
				/*if(TurtleStruct.angle<0){
					TurtleStruct.angle = 360;
				}*/
				
			}

			@Override
			public void right(double angle) {
				// TODO Auto-generated method stub
				TurtleStruct.angle+=angle;
				/*if(TurtleStruct.angle>360){
					TurtleStruct.angle = 0;
				}*/
			}

			@Override
			public void forward(double dist) {
				Point point = Geom.polarToCart(dist, TurtleStruct.angle);
				
				if(TurtleStruct.pen){
					
					this.addPoint(point);
				}
				TurtleStruct.location =point;
				
			}
			
			

			@Override
			public void back(double dist) {
					Point point = Geom.polarToCart(-dist, TurtleStruct.angle);
				
				if(TurtleStruct.pen){
					
					this.addPoint(point);
				}
				TurtleStruct.location =point;
				
			}

			@Override
			public void penUp() {
				TurtleStruct.pen=false;
				// TODO Auto-generated method stub
				
			}

			@Override
			public void penDown() {
				TurtleStruct.pen=true;
				// TODO Auto-generated method stub
				
			}
			
			public void resetTurtle(){
				TurtleStruct.angle = 0;
				TurtleStruct.pen = true;
				TurtleStruct.location = new Point(0,0);
			}
			
			public void moveTurtleTo(double x, double y){
				
				TurtleStruct.location = new Point(x,y);
			}
			
			public void rotateTurtleTo(double theta){
				
				TurtleStruct.angle = theta;
			}

			



}





