/*Piece.java
 * Stores a single piece of an object pattern
 * in this case, extends the rectangle class, because we assume 
 * that all parts are rectangular. This will most likely change
 * in the future. Initialized by the PatternManager class
 */

package com.pixelmaid.dresscode.data.templates;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

import com.pixelmaid.dresscode.app.Canvas;
import com.pixelmaid.dresscode.drawing.primitive2d.*;
public class Template extends Rectangle {

private double seam;
private String name;
private ArrayList<Double> hfolds;
private ArrayList<Double> vfolds;
private ArrayList<Double> xPos;
private ArrayList<Double> yPos;


	public Template(String name){
		super(0,0,100,100);
		this.setName(name);
		this.setNodeName(name);
		hfolds = new ArrayList<Double>();
		vfolds = new ArrayList<Double>();
		xPos = new ArrayList<Double>();
		yPos = new ArrayList<Double>();

	}
	
	
	public void setSeam(double s){
		seam = s;
	}
	public double getSeam(){
		return seam;
	}
	
	public void setName(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
	
	public void draw(Canvas e, PImage design){
		e.imageMode(PConstants.CENTER);

		if(xPos.size()==0){
			e.image(design,(float)(width/2),(float)(height/2));
		}
		else{
			for(int i=0;i<xPos.size();i++){
				e.image(design, xPos.get(i).floatValue(), yPos.get(i).floatValue());
			}
		}
		e.noFill();
		e.stroke(216,65,78);
		e.strokeWeight(3);
		e.pushMatrix();
		e.rectMode(PConstants.LEFT);
		e.rect(0,0,(float)width,(float)height);
		e.stroke(209,255,178);
		e.rect((float)seam, (float)seam, (float)(width-seam),(float)(height-seam));
		
		e.stroke(153,0,255);
		for(int i=0;i<hfolds.size();i++){
			e.line( (float)(0),  hfolds.get(i).floatValue(),  (float)(width),  hfolds.get(i).floatValue());
		}
		for(int i=0;i<vfolds.size();i++){
			e.line( vfolds.get(i).floatValue(),(float)(0),  vfolds.get(i).floatValue(), (float)(height));
		}
		e.popMatrix();
		
		/*if(this.getDrawOrigin()){
			this.drawOrigin(e);
		}*/	
		
	}
	
	public void setHFold(double x){
		hfolds.add(x);
	}
	
public void setVFold(double y){
	vfolds.add(y);
	}


public void addDesign(double x, double y) {
	xPos.add(x);
	yPos.add(y);
	
}
	
}
