package com.pixelmaid.dresscode.drawing.primitive2d;

import java.util.ArrayList;


import processing.core.PApplet;

import com.pixelmaid.dresscode.app.Embedded;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.math.Geom;
import com.pixelmaid.dresscode.drawing.math.PolyBoolean;
import com.pixelmaid.dresscode.events.CustomEvent;

public class Polygon extends Drawable implements PrimitiveInterface, Turtle{
	protected ArrayList<Point> points;
	//private ArrayList<Hole> holes;
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
	
	public Polygon(double x, double y,int sides, double length){
		this(new Point(x,y));
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
	
	public ArrayList<Point> getPoints(){
		return this.points;
	}
	public void setPoints(ArrayList<Point> p){
		this.points = p;
	}
	
	/*public ArrayList<Hole> getHoles(){
		return this.holes;
	}*/
	
	/*public Point rotatePoint(Point pt, Point center, double angle)
	{
	    double theta =  ((angle/180)*Math.PI);
	    double cosAngle = Math.cos(theta);
	    double sinAngle = Math.sin(theta);
	    
	    double x = center.getX() + (int) ((pt.getX()-center.getX())*cosAngle-(pt.getY()-center.getY())*sinAngle);
	    double y = center.getY() + (int) ((pt.getX()-center.getX())*sinAngle+(pt.getY()-center.getY())*cosAngle);
	    Point nP = new Point(x,y);
	    return nP;
	}*/
	
	@Override
	//rotates around a focus. does not change the rotation property
	public Drawable rotateWithFocus(double theta, Point focus){
		this.setPointsAbsolute();
		for(int i=0;i<this.points.size();i++){
			Point newPoint = this.points.get(i).rotate(theta, focus);
			this.points.set(i,newPoint);
		}
		for(int i=0;i<getHoles().size();i++){
			getHoles().get(i).rotateWithFocus(theta, focus);
		}
		this.setOrigin(Geom.findCentroid(this));
		this.setPointsRelativeTo(this.getOrigin());
		return this;
		
	}
	
	
	//===================OVERRIDDEN METHODS==================
	
	@Override
	public void draw(Embedded e){
		if(!this.getHide()){
		appearance(e);
		//System.out.println("number of holes="+this.holes.size()+"number of points="+this.points.size());
		e.pushMatrix();
		e.translate((float)(getOrigin().getX()),(float)(getOrigin().getY()));
		e.rotate(PApplet.radians((float)getRotation()));
		e.beginShape();
		for(int i=0;i<points.size();i++){
			e.vertex((float)points.get(i).getX(),(float)points.get(i).getY());
		}
		e.endShape(PApplet.CLOSE);	
		
		ArrayList<Hole> holes = this.getHoles();
		for(int i=0;i<holes.size();i++){
			holes.get(i).draw(e);
		}
		e.popMatrix();
		
		/*if(this.getDrawOrigin()){
			this.drawOrigin(e);
		}*/
		}
	}
	
	@Override
	public void print(Embedded e){
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
		
		ArrayList<Hole> holes = this.getHoles();
		for(int i=0;i<holes.size();i++){
			holes.get(i).print(e);
		}
		e.popMatrix();
		}
	
	}
	@Override
	public Drawable mirrorX(){
	this.setPointsAbsolute();
		for(int i=0;i<points.size();i++){
			Point p = points.get(i);
			double delta = getOrigin().getX()-p.getX();
			double xNew = origin.getX()+delta;
			points.set(i, new Point(xNew,p.getY()));
		}
		for(int i=0;i<getHoles().size();i++){
			System.out.println("mirroring hole "+i);
			Hole newHole = this.getHoles().get(i).mirrorX(this.getOrigin());
			holes.set(i,newHole);
		}
		
		this.setPointsRelativeTo(this.origin);
		
		return this;
	}
	@Override
	public Drawable mirrorY(){
		this.setPointsAbsolute();
		for(int i=0;i<points.size();i++){
			Point p = points.get(i);
			double delta = getOrigin().getY()-p.getY();
			double yNew = origin.getX()+delta;
			points.set(i, new Point(p.getX(),yNew));
		}
		for(int i=0;i<getHoles().size();i++){
			getHoles().get(i).mirrorY();
		}
		
		this.setPointsRelativeTo(this.origin);
		
		return this;
	}
	
	@Override
	public Polygon copy(){
		Polygon c =  new Polygon();
		copyParameters(this, c);
		
		this.setParent(this.getParent());
		for(int i=0;i<points.size();i++){
			c.addPoint(points.get(i).copy());
		}
		ArrayList<Hole> holes = this.getHoles();
		for(int i=0;i<holes.size();i++){
			c.addHole(holes.get(i).copy());
		}
		return c;
	}
	
	public Hole toHole(){
		Hole h = new Hole();
		copyParameters(this, h);
		
		h.setParent(this.getParent());
		for(int i=0;i<points.size();i++){
			h.addPoint(points.get(i).copy());
		}
		
		return h;
	}
	
	
	
	@Override
	//sets the points and holes relative around a new origin
	public void setPointsRelativeTo(Point p) {
		for(int i=0;i<this.points.size();i++){
			Point newPoint = this.points.get(i);
			this.points.set(i,newPoint.difference(p));
		}
		ArrayList<Hole> holes = this.getHoles();
		for(int i=0;i<holes.size();i++){
			holes.get(i).setPointsRelativeTo(p);
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
					if(i==1){
						poly = p;
					}
					else{
						poly = PolyBoolean.union(poly, p);
					}
				
				
				xLast = x;
				yLast = y;
			}
			
			poly.setFillColor(this.getStrokeColor());
			poly.doStroke(false);
			return poly;

	}
	
	
	@Override
	//sets all points to absolute position based on the origin of the object
	public void setPointsAbsolute() {
		this.setAbsolute();
		
		for(int i=0;i<this.points.size();i++){
		    Point pt = new Point(points.get(i).getX()+getOrigin().getX(),points.get(i).getY()+getOrigin().getY());
			pt.rotate(getRotation(),getOrigin());
			this.points.set(i,pt);
			
		}
		ArrayList<Hole> holes = this.getHoles();
		for(int i=0;i<holes.size();i++){
			ArrayList<Point> holepoints = holes.get(i).getPoints();
			for(int j=0;j<holepoints.size();j++){
			    Point pt2 = new Point(holepoints.get(j).getX()+getOrigin().getX(),holepoints.get(j).getY()+getOrigin().getY());
				pt2.rotate(getRotation(),getOrigin());
				holepoints.set(j,pt2);
				
			}
			holes.get(i).setPoints(holepoints);
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
	 this.drawableEvent(CustomEvent.DRAWABLE_CREATED, master);
    
    	
    	 this.drawableEvent(CustomEvent.REMOVE_DRAWABLE, d);
    		
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
		 this.drawableEvent(CustomEvent.DRAWABLE_CREATED, master);
		    
	    	
    	 this.drawableEvent(CustomEvent.REMOVE_DRAWABLE, this);
				
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

			
			
		


}




