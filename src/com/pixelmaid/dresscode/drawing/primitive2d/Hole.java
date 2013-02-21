package com.pixelmaid.dresscode.drawing.primitive2d;

import java.util.ArrayList;

import processing.core.PApplet;


import com.pixelmaid.dresscode.app.Embedded;
import com.pixelmaid.dresscode.drawing.datatype.Point;

//class for holes inside of polygons. cannot be called independently
public class Hole extends Polygon {
	
		@Override
		public void draw(Embedded e){
			
		    ArrayList<Point> points = this.getPoints();
			e.beginShape();
			for(int i=0;i<points.size();i++){
				e.vertex((float)points.get(i).getX(),(float)points.get(i).getY());
			}
			e.endShape(PApplet.CLOSE);
		}
		
		@Override
		public void print(Embedded e){
			
		    ArrayList<Point> points = this.getPoints();
			e.beginShape();
			for(int i=0;i<points.size();i++){
				e.vertex((float)points.get(i).getX(),(float)points.get(i).getY());
			}
			e.endShape(PApplet.CLOSE);
		}
		
		@Override
		public Polygon copy(){
			Polygon c = new Polygon();
			for(int i=0;i<this.getPoints().size();i++){
				c.addPoint(this.getPoints().get(i).copy());
			}
			return c;
		}
		
		@Override
		//sets the points and holes relative around a new origin
		public void setPointsRelativeTo(Point p) {
			for(int i=0;i<this.getPoints().size();i++){
				Point newPoint = this.getPoints().get(i);
				this.getPoints().set(i,newPoint.difference(p));
			}
			
		}
		
		@Override
		//sets the points and holes relative around a new origin
		public void setPointsAbsolute() {
			for(int i=0;i<this.getPoints().size();i++){
				Point newPoint = this.getPoints().get(i);
				this.getPoints().set(i,newPoint.add(this.getParent().origin));
			}
			
		}
}
