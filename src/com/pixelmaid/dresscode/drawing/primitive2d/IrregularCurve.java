package com.pixelmaid.dresscode.drawing.primitive2d;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PGraphics;

import com.pixelmaid.dresscode.app.Canvas;
import com.pixelmaid.dresscode.drawing.datatype.Point;

public class IrregularCurve extends Polygon {

	
	
	
	public IrregularCurve(){
		points= new ArrayList<Point>();
	//	holes = new ArrayList<Hole>();
	}
	
	
	protected void addPoint(Point point){
		if(this.points.size()==0){
			this.points.add(point);
		}
	}
	
	public void setPoints(ArrayList<Point> p){
		this.points = p;
	}
	
	
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
			if(i==0){
				e.vertex((float)points.get(i).getX(),(float)points.get(i).getY());
			}
			
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
		e.noFill();
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
}
