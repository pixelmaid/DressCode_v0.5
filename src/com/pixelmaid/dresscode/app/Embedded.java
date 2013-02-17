package com.pixelmaid.dresscode.app;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.drawing.primitive2d.PrimitiveInterface;
import com.pixelmaid.dresscode.drawing.primitive2d.Polygon;

import processing.core.PApplet;

public class Embedded extends PApplet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Map<String, Drawable> drawables = new LinkedHashMap<String, Drawable>();
	public final int DEFAULT_BG = 222;
	private int gridUnits = 10;
	public ArrayList<Drawable> finalPolys = new ArrayList<Drawable>();//for debugging
	public void setup() {
		//this.init();
		// original setup code here ...
		size(600,768,P2D);
		background(DEFAULT_BG,DEFAULT_BG,DEFAULT_BG);
		grid();
		// prevent thread from starving everything else
		noLoop();
	}

	public void draw() {

		background(DEFAULT_BG,DEFAULT_BG,DEFAULT_BG);
		System.out.println("draw");
		//this.ellipse(0, 0, 100, 100);
		System.out.println("drawable count="+drawables.size());
		try{
		for (Drawable value : drawables.values()) {
			
				value.draw(this);
		}
		
		grid();
		}
		catch( java.lang.RuntimeException e){
			System.err.println("missed a pop matrix call, drawing again");
			this.draw();
		}
		
		//debugging code
		for(int j=0;j<finalPolys.size();j++){
        ArrayList<Point> points = ((Polygon)(finalPolys.get(j))).getPoints();
		System.out.println("drawing final poly at "+j);
        strokeWeight(1f);
		
		
		fill(255,0,0,25f);
		beginShape();
		for(int i=0;i<points.size();i++){
			vertex((float)points.get(i).getX(),(float)points.get(i).getY());
		}
		endShape(PApplet.CLOSE);
		
		}
		noLoop();
	}

	public void mousePressed() {
		// do something based on mouse movement

		// update the screen (run draw once)
		// redraw();
	}

	public void addDrawable(String id, int lineNumber, Drawable d) {
		String key = id + Integer.toString(lineNumber)+Double.toString(Math.random()*1000);
		// System.out.println("key="+key);
		drawables.put(key, d);
		d.key=key;

	}

	public boolean removeDrawable(Drawable d){
		return drawables.remove
				(d.key)==null? false: true;
	}

	public void removeDrawable(String id, int lineNumber) {
		String key = id + Integer.toString(lineNumber);
		drawables.remove(key);
	}

	public void clearAllDrawables() {
		drawables.clear();

	}
	
	public void grid(){
		

		int heightGridPos=0;
		int widthGridPos=0;
		while( heightGridPos<height){
			if(((float)heightGridPos)%((float)(gridUnits*10)) == 0){
			stroke(0,0,0,75f);
			strokeWeight(1.5f);
			}
			else{
				stroke(0,0,0,50f);
				strokeWeight(1);
			}
			this.line(0,heightGridPos,width,heightGridPos);
			heightGridPos+=gridUnits;
		}
		while( widthGridPos<width){
			if(((float)widthGridPos)%((float)(gridUnits*10)) == 0){
				stroke(0,0,0,75f);
				strokeWeight(1.5f);
				}
				else{
					stroke(0,0,0,50f);
					strokeWeight(1);
				}
			
			this.line(widthGridPos,0,widthGridPos,height);
			widthGridPos+=gridUnits;
		}
	}
}