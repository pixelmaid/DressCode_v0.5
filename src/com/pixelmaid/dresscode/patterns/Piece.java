/*Piece.java
 * Stores a single piece of an object pattern
 * in this case, extends the rectangle class, because we assume 
 * that all parts are rectangular. This will most likely change
 * in the future. Initialized by the PatternManager class
 */

package com.pixelmaid.dresscode.patterns;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

import com.pixelmaid.dresscode.app.Canvas;
import com.pixelmaid.dresscode.drawing.primitive2d.*;
public class Piece extends Rectangle {

private double seam;
private String name;

	public Piece(double w,double h,double s, String n){
		super(0,0,w,h);
		this.width =w;
		this.height = h;
		seam = s;
		name = n;
	}
	
	public double getSeam(){
		return seam;
	}
	public String getName(){
		return name;
	}
	
	public void draw(Canvas e, PImage design){
		e.image(design, (float)-width/2,(float)-height/2);
		e.noFill();
		e.stroke(216,65,78);
		e.strokeWeight(3);
		e.pushMatrix();
		e.translate((float)(getOrigin().getX()),(float)(getOrigin().getY()));
		e.rotate(PApplet.radians((float)getRotation()));
		e.scale((float)getScaleX(),(float)getScaleY());
		e.rectMode(PConstants.CENTER);
		e.rect(0,0,(float)width,(float)height);
		e.stroke(209,255,178);
		e.rect(0, 0, (float)(width-(seam*2)),(float)(height-(seam*2)));
		e.popMatrix();
		
		/*if(this.getDrawOrigin()){
			this.drawOrigin(e);
		}*/	
		
	}
	
}
