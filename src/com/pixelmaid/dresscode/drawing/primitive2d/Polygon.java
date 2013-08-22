package com.pixelmaid.dresscode.drawing.primitive2d;

import java.util.ArrayList;
import java.util.Collections;


import processing.core.PApplet;
import processing.core.PGraphics;

import com.pixelmaid.dresscode.app.Canvas;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.math.Geom;
import com.pixelmaid.dresscode.drawing.math.PolyBoolean;
import com.pixelmaid.dresscode.drawing.math.Vec2d;
import com.pixelmaid.dresscode.events.CustomEvent;

public class Polygon extends Drawable implements PrimitiveInterface, Turtle{
	protected ArrayList<Point> points;
	private int sideNum = 0;
	private double sideLength = 0;
	//private ArrayList<Hole> holes;
	boolean closed = true;
	private static double DEFAULT_LENGTH = 20;
	
	public Polygon(){
		this(0,0);
	}
	
	public Polygon(Point o){
		this.origin=o;
		points= new ArrayList<Point>();
	//	holes = new ArrayList<Hole>();
	}
	
	public Polygon(int sides, double length){
		this(0,0,sides,length);
	}
	
	public Polygon(double x, double y, int sides){
		this(x,y,sides,DEFAULT_LENGTH);
	}
	
	public Drawable setRadius(double r,int sides){
		this.clearPoints();
		sideNum  = sides;
		sideLength = 2*r*Math.sin(Math.toRadians(180/sides));
		for(int i=0;i<sides;i++){
			double theta = 360/sides*i;
			Point p = new Point(0,0,Math.toRadians(theta)+Math.PI/2 - Math.PI/sides,r);
			this.addPoint(p);
		}
		return this;
	}
	
	public Polygon(double x, double y,int sides, double length){
		this(new Point(x,y));
		sideNum  = sides;
		sideLength = length;
		if(sides!=0){
		double a = length/(2*Math.sin(Math.toRadians(180/sides)));
		for(int i=0;i<sides;i++){
			double theta = 360/sides*i;
			Point p = new Point(0,0,Math.toRadians(theta)+Math.PI/2 - Math.PI/sides,a);
			this.addPoint(p);
		}
		//this.setPointsAbsolute();
		//this.setPointsRelativeTo(new Point(0,0));
		}
		
		/*double angle = 360/(double)sides;
		resetTurtle();
		for(int i=0;i<sides;i++){
			  this.forward(length);
			  this.right(angle);
			}*/
		
	}
	
	/*public void addHole(Hole h){
		h.setParent(this);
		holes.add(h);
	}*/
	
	public Polygon(ArrayList<Point> pts) {
		this(new Point(0,0));
		this.points=pts;
		this.setOrigin(Geom.findCentroid(this));
		this.setPointsRelativeTo(this.getOrigin());
		
	}

	public void addPoint(Double x, Double y){
		addPoint(new Point(x,y));
		
		
	}
	
	protected void addPoint(Point point){
		this.points.add(point);
	}
	
	public void addDynamicPoint(Point point){
		System.out.println("=======================\n starting number of points"+this.points.size());
		
		if(this.points.size()>1){
			
			/*System.out.println("\n before set absolute");
			for(int i=0;i<points.size();i++){
				System.out.println(points.get(i).getX()+","+points.get(i).getY());
			}*/
			
			this.setPointsAbsolute();
			/*
			System.out.println("\n after set absolute");
			System.out.println("number of points"+this.points.size());
			for(int i=0;i<points.size();i++){
				System.out.println(points.get(i).getX()+","+points.get(i).getY());
			}
			System.out.println("\n adding point at: "+point.getX()+","+point.getY());
			 */
			this.points.add(point);
			///System.out.println("number of points"+this.points.size());

			this.setOrigin(Geom.findCentroid(this));
			/*System.out.println("\n after find centroid");
			System.out.println("\n centroid at: "+origin.getX()+","+origin.getY());
			System.out.println("number of points"+this.points.size());*/

			this.setPointsRelativeTo(this.getOrigin());
			
			/*System.out.println("\n after set relative");
			System.out.println("number of points"+this.points.size());
			for(int i=0;i<points.size();i++){
				System.out.println(points.get(i).getX()+","+points.get(i).getY());
			}*/
			
		}
		else{
			this.points.add(point);
		}

	}
	public void reversePoints(){
		Collections.reverse(this.points);
	}
	public void clearPoints(){
		this.points.clear();
	}
	public void addAllPoints(Polygon p) {
		this.points.addAll(p.getPoints());
		
	}
	
	public ArrayList<Point> getPoints(){
		return this.points;
	}
	public void setPoints(ArrayList<Point> p){
		this.points = p;
	}
	
	//determines if polygon is closed or not
	public void setClosed(boolean c){
		closed = c;
	}
	
	@Override
	public Drawable mirrorX(Point focus, Boolean top){
	this.setPointsAbsolute();
		for(int i=0;i<points.size();i++){
			Point p = points.get(i);
			double delta = focus.getX()-p.getX();
			double xNew = focus.getX()+delta;
			points.set(i, new Point(xNew,p.getY()));
		}
		this.reversePoints();

		if(top){
			resetOriginRecur();
		}
		
		
		return this;
	}
	@Override
	public Drawable mirrorY(Point focus, Boolean top){
		this.setPointsAbsolute();
		for(int i=0;i<points.size();i++){
			Point p = points.get(i);
			double delta = focus.getY()-p.getY();
			double yNew = focus.getY()+delta;
			points.set(i, new Point(p.getX(),yNew));
		}
		this.reversePoints();

		if(top){
			resetOriginRecur();
		}
		return this;
	}
	

	@Override
	//flattens multi-dimensional groups into 1 dimension
	public Drawable flatten(boolean top,Drawable d){
		if(top){
			this.flattenedDrawable = d;
		}
		
		System.out.println("flattening polygon");
		this.setAbsolute();	
		d.add(this);	
		return this;
	}
	
	@Override
	//rotates around a focus. does not change the rotation property
	public Drawable rotateWithFocus(double theta, Point focus, Boolean top){	
		this.setPointsAbsolute();
		for(int i=0;i<this.points.size();i++){
			Point newPoint = this.points.get(i).rotate(theta, focus);
			this.points.set(i,newPoint);
		}
		if(top){
			resetOriginRecur();
		}
		return this;
	}
	
	
	public void resetOriginRecur(){
		if(this.isHole()){
			this.reversePoints();
		}
		this.setOrigin(Geom.findCentroid(this));
		if(this.isHole()){
			this.reversePoints();
		}
		this.setPointsRelativeTo(this.getOrigin());
	}
	
	//===================OVERRIDDEN METHODS==================
	
	@Override
	public void draw(Canvas e){
		if(!this.getHide()){
		appearance(e.g);
		if(this.getSelected()){
			e.strokeWeight(2);
			e.stroke(Drawable.SELECTED.r(),Drawable.SELECTED.g(),Drawable.SELECTED.b());
		}
		if(isHole()){
			e.fill(e.DEFAULT_BG);
		}
		//System.out.println("number of holes="+this.holes.size()+"number of points="+this.points.size());
		e.pushMatrix();
		e.translate((float)(getOrigin().getX()),(float)(getOrigin().getY()));
		e.rotate(PApplet.radians((float)getRotation()));
		e.beginShape();
		for(int i=0;i<points.size();i++){
			e.vertex((float)points.get(i).getX(),(float)points.get(i).getY());
		}
		if(!closed){
			e.endShape(PApplet.OPEN);	
		}
		else{
			e.endShape(PApplet.CLOSE);	

		}
		
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
		//System.out.println("number of holes="+this.holes.size()+"number of points="+this.points.size());
		e.pushMatrix();
		e.translate((float)(getOrigin().getX()),(float)(getOrigin().getY()));
		e.rotate(PApplet.radians((float)getRotation()));
		e.scale((float)getScaleX(),(float)getScaleY());
		e.beginShape();
		for(int i=0;i<points.size();i++){
			e.vertex((float)points.get(i).getX(),(float)points.get(i).getY());
		}
		e.endShape(PApplet.CLOSE);	
		
		e.popMatrix();
		}
	
	}
	
	@Override
	public Polygon copy(){
		Polygon c =  new Polygon();
		copyParameters(this, c);
		
		this.setParent(this.getParent());
		for(int i=0;i<points.size();i++){
			c.addPoint(points.get(i).copy());
		}
		if (this.isHole()){
			c.toHole();
		}
		
		return c;
	}
	//converts polygon to hole
	public void toHole(){
		this.isHole = true;
	}
	
	
	//converts hole to poly
	public void toPoly(){
		this.isHole = false;
	}
	
	
	
	
	@Override
	//scales the object on the x axis
		public Drawable scale(double x, double y,  Point focus, Boolean top ) {
		
		this.setPointsAbsolute();
		for(int i=0;i<points.size();i++){
			Point p = points.get(i);
			System.out.println("startX ="+p.getX());
			Vec2d vX = new Vec2d(p.getX()-focus.getX(),p.getY()-focus.getY());
			vX = vX.mul(x);
			p.setX(vX.x+focus.getX());
			
			Vec2d vY = new Vec2d(p.getX()-focus.getX(),p.getY()-focus.getY());
			vY = vY.mul(y);
			p.setY(vY.y+focus.getY());
			//p.setY(v.y+this.getOrigin().getY());
			points.set(i,p);
			
			
		}
	
		if(top){
			resetOriginRecur();
		}
		return this;
		
		
	
		}


	
	@Override
	//sets the points and holes relative around a new origin
	public void setPointsRelativeTo(Point p) {
		for(int i=0;i<this.points.size();i++){
			Point newPoint = this.points.get(i);
			this.points.set(i,newPoint.difference(p));
		}
		
		this.origin=p;
	}
	
@Override	
public Drawable expand(){
		
		Drawable poly =  new Drawable();
			this.setPointsAbsolute();
			double xLast =points.get(0).getX();
			double yLast = points.get(0).getY();
			for (int i = 1; i <= points.size(); i++) {
				double x;
				double y;
				if(i<points.size()){
					x=points.get(i).getX();
					y=points.get(i).getY();
				}
				else{
					 x=points.get(0).getX();
					y=points.get(0).getY();
				}
				
				
					Line l = new Line(xLast,yLast,x,y);
					l.setStrokeWeight(this.getStrokeWeight());
					Polygon p = (Polygon)l.expand();
					
				
						poly.addToGroup(p);
					
				
				
				xLast = x;
				yLast = y;
			}
			
			//poly.setFillColor(this.getStrokeColor());
			//poly.doStroke(false);
			//return poly;
			return PolyBoolean.merge(poly);

	}
	
	
	@Override
	//sets all points to absolute position based on the origin of the object
	public void setPointsAbsolute() {
		//TODO: eventually need to deal with the fact that this should not contain setAbsolute
		this.setAbsolute();
		
		for(int i=0;i<this.points.size();i++){
		    Point pt = new Point(points.get(i).getX()+getOrigin().getX(),points.get(i).getY()+getOrigin().getY());
			pt.rotate(getRotation(),getOrigin());
			this.points.set(i,pt);
			
		}
	
	}
	
	@Override
	//returns itself (already is a polygon)
	public Polygon toPolygon(){
		//System.out.println("polygon to polygon");
		return this;
	}
	
	@Override
	// creates a new drawable and adds this polygon and d to it and returns new drawable
	public Drawable addToGroup(Drawable d){
		return this.addToGroup(d,1);
	}
	
	public Drawable addToGroup(Drawable d, int index){
	 Drawable master = new Drawable();
	//TODO: adjust indexing here to have new drawable added at same index as this
	 this.fireDrawableEvent(CustomEvent.DRAWABLE_CREATED, master);
    
    	
    	 this.fireDrawableEvent(CustomEvent.REMOVE_DRAWABLE, d);
    		
    		master.addToGroup(this);
    		master.addToGroup(d,index);
    	
    	return master;
	}
	
	
	@Override
	//overrides drawable remove from group method- returns a null value since a polygon cannot be a group by itself
	public Drawable removeFromGroup(Drawable d){
		//Window.output.setText("cannot remove from group from a polygon group");

		System.err.println("cannot remove from group from a polygon group");
		return null;
	}
	
	@Override
	//overrides drawable remove all children method- returns a null value since a polygon does not have any children to remove
	public ArrayList<Drawable> removeAllChildren(){
		//Window.output.setText("cannot remove all children from a polygon");
		System.err.println("cannot remove all children from a polygon");
		return null;
	}
	
	@Override
	// creates a new drawable and adds this polygon all orphans to it and returns new drawable
	public Drawable addAllChildren(ArrayList<Drawable> orphans){
		 Drawable master = new Drawable();
		//TODO: adjust indexing here to have new drawable added at same index as this
		 this.fireDrawableEvent(CustomEvent.DRAWABLE_CREATED, master);
		    
	    	
    	 this.fireDrawableEvent(CustomEvent.REMOVE_DRAWABLE, this);
				
		   master.addToGroup(this);
		   
		   for(int i=0;i<orphans.size();i++){
				master.addToGroup(orphans.get(i));
		   }
		   return master;
	}
	
	@Override
	//returns child at a specific index- need to decide if should return a copy or child itself
	public Point pointAt(int i){
		this.setPointsAbsolute();
		
		Point p = this.points.get(i).copy();
		this.setPointsRelativeTo(this.origin);
		return p;
	}
	
	@Override
	   //gets all points of all children
	   public ArrayList<Point> copyAllPoints(){
		   ArrayList<Point> copyPoints = new ArrayList<Point>();
		  
		
				for(int i=0;i<this.getPoints().size();i++){
				   copyPoints.add(this.getPoints().get(i).copy());  
			   }
		  
			   
			   return copyPoints;
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

			
			//returns number of sides
			public int numSides() {
				// TODO Auto-generated method stub
				return sideNum;
			}
			

			//returns number of sides
			public double sideLength() {
				// TODO Auto-generated method stub
				return sideLength;
			}

			
			
		


}




