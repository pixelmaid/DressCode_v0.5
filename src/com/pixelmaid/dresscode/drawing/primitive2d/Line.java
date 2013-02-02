package com.pixelmaid.dresscode.drawing.primitive2d;

import javax.media.opengl.GL2;

import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.datatype.DCHalfEdge;

public class Line extends DCHalfEdge implements Drawable{
	public float strokeWeight=1;

	public Line(Point start, Point end) {
		super(start,end);
	}
	
	public Line(double startX, double startY, double endX, double endY) {
		super(new Point(startX,startY),new Point(endX,endY));
	}
	
	public Line(Point origin, double radius, double theta) {
		super(origin.copy(),radius, theta);
	}
	
	public void draw( float strokeWeight){
		//parent.strokeWeight(strokeWeight);
		//parent.line((float)start.getX(),(float)start.getY(), (float)end.getX(), (float)end.getY());
		
		/*parent.strokeWeight(4);
		parent.stroke(255,0,0);
		parent.point((float)start.getX()+0.5f,(float)start.getY()+0.5f);
		parent.stroke(0,255,0);
		parent.point((float)end.getX(),(float)end.getY());*/
	}
	
	public void print(float strokeWeight){
		//TODO:implement print method
	}
	
	
	public void moveTo(double x, double y) {
       this.start.moveTo(x, y, this.start);
       this.end.moveTo(x, y, this.start);
        
    }
	
	@Override
	public void moveTo(double x, double y, Point focus) {
	    this.start.moveTo(x, y, focus);
	    this.end.moveTo(x, y, focus);
	        
	 }
	
	@Override
	public void moveBy(double x, double y){
		 this.start.moveBy(x, y);
		 this.end.moveBy(x, y);
	}
	
	 public Line copy(){
	    return new Line(start.copy(),end.copy());
	  }
	 
	 public void setStrokeWeight(float strokeWeight){
	    	this.strokeWeight=strokeWeight;
	    }

	@Override
	public void draw(GL2 gl) {
		// TODO Auto-generated method stub
		
	}

}
