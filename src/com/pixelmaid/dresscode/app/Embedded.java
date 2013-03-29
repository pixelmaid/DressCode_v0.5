package com.pixelmaid.dresscode.app;


import java.io.File;
import java.util.ArrayList;
import java.util.Map;


import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.drawing.primitive2d.Ellipse;

import processing.core.*;


public class Embedded extends PApplet {
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	public final int DEFAULT_BG = 222;
	private int gridUnits = 10;
	 private int zoomAmount = 0;
	  private int defaultCanvasWidth = 500;
	  private int defaultCanvasHeight = 500;
	  private ArrayList<Drawable> tempDrawables;
	
	public void init(int width, int height){
		defaultCanvasWidth = width;
		defaultCanvasHeight = height;
		
	}
	
	
	
	public void setup() {
		
		tempDrawables = new ArrayList<Drawable>();
		//tempDrawables.add(new Ellipse(100,100));
		
		size(defaultCanvasWidth,defaultCanvasHeight,P3D);
		
		
	}
	
	
public void setDrawables(ArrayList<Drawable> d){
	this.tempDrawables=d;
}
	
public void draw() {
	pushMatrix();
	 background(DEFAULT_BG);
	translate(0,0,zoomAmount);
		
	 
			for (int i=0;i<tempDrawables.size();i++){
			
				tempDrawables.get(i).draw(this);
			}
	//grid();
		
	popMatrix();	

	}

	/*public void showDrawables(ArrayList<Drawable> drawables) {
		pushMatrix();
		translate(0,0,zoomAmount);
		background(210);

		try{
			for (Drawable value : drawables) {
			
				value.draw(this);
		}
		ellipse(100,100,100,100);
		grid();
		}
		catch( java.lang.RuntimeException e){
			System.err.println("missed a pop matrix call, drawing again");
			this.draw();
		}
		
		popMatrix();
		//noLoop();
	}*/
	
	public void print(ArrayList<Drawable> drawables, File file){
		String filename = file.getAbsolutePath();
		String subStr = filename.substring(filename.length()-4, filename.length());
		//System.out.println(subStr);
		if(!subStr.contentEquals(".pdf")){
			//System.out.println("substr!=pdf");
			filename =filename.concat(".pdf");
		}
		this.beginRecord(PDF, filename);
		try{
			for (Drawable value : drawables) {
				
					value.print(this);
			}
			
			
			}
			catch( java.lang.RuntimeException e){
				System.err.println("missed a pop matrix call, printing again");
				PApplet.print(file);
			}
		this.endRecord();
	}

	public void mousePressed() {
		// do something based on mouse movement

		// update the screen (run draw once)
		// redraw();
	}


	public void clear(){
		
		this.draw();
		this.init();
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
	
	  public void zoomIn(){
		  zoomAmount+=20;
		  System.out.println(zoomAmount);
	  }
	  
	  public void zoomOut(){
		  zoomAmount-=20;
		  System.out.println(zoomAmount);
	  }
}