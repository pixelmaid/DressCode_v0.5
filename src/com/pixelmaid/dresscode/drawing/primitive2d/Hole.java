package com.pixelmaid.dresscode.drawing.primitive2d;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PGraphics;


import com.pixelmaid.dresscode.app.Embedded;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.math.Geom;

//class for holes inside of polygons. cannot be called independently
public class Hole extends Polygon {
	
		@Override
		public void draw(Embedded e){
			appearance(e.g);
			e.fill(e.DEFAULT_BG);
		    ArrayList<Point> points = this.getPoints();
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
		
		@Override
		public void print(PGraphics e){
			
			appearance(e);
			//e.fill(e.DEFAULT_BG);
			e.noFill();
			
		    ArrayList<Point> points = this.getPoints();
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
		
		
		@Override
		public Hole copy(){
			Hole c =  new Hole();
			copyParameters(this, c);
			
			this.setParent(this.getParent());
			ArrayList<Point> points = this.getPoints();
			for(int i=0;i<points.size();i++){
				c.addPoint(points.get(i).copy());
			}
			
			return c;
		}
		
		public Hole mirrorX(Point o){
			this.setPointsAbsolute();
			for(int i=0;i<points.size();i++){
				Point p = points.get(i);
				System.out.println("original point="+p.getX());

				double delta = o.getX()-p.getX();
				double xNew = o.getX()+delta;
				points.set(i, new Point(xNew,p.getY()));
				System.out.println("new point="+xNew);
			}
			
			this.setPointsRelativeTo(o);
			
			return this;
		}
		
		@Override
		public Drawable rotateWithFocus(double theta, Point focus, Boolean top){
			System.out.println("hole rotate w/ focus");
			System.out.println("hole parent origin="+getParent().getOrigin().getX()+","+getParent().getOrigin().getY());
			System.out.println("hole origin="+this.getOrigin().getX()+","+this.getOrigin().getY());

			this.setPointsAbsolute();
			for(int i=0;i<this.points.size();i++){
				Point newPoint = this.points.get(i).rotate(theta, focus);
				this.points.set(i,newPoint);
			}
			
			return this;

			
		}
		
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
		public void resetOriginRecur(){
			this.setOrigin(this.getParent().getOrigin());
			this.setPointsRelativeTo(this.getOrigin());
		}
		
		
}
