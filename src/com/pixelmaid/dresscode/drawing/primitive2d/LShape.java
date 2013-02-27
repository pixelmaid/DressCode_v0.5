package com.pixelmaid.dresscode.drawing.primitive2d;

import processing.core.PShape;

import com.pixelmaid.dresscode.app.Embedded;

//class used for importing in pre-defined svg vector objects

public class LShape extends Polygon {
	private String shapePath; //path to svg to be loaded
	private PShape shape; //processing PShape
	private Embedded canvas; //
	private double x=0; //x coordinate of shape
	private double y= 0; //y coordinate of shape
	    public LShape() {
	    	
	    	
	    }
	    //sets shape path
	    public void setPath(String p){
	    	this.shapePath = p;
	    }
	    
	    //returns current shape path
	    public String getPath(){
	    	return this.shapePath;
	    }
	    
	    public void loadShape(){
	    	this.shape = this.canvas.loadShape(this.shapePath);
	    }
	    
	    //returns current drawing canvas
	    public Embedded getCanvas(){
	    	return this.canvas;
	    }
	    
	    //set current drawing canvas (needed to load the shape, TODO: should eventually work around this)
	    public void setCanvas(Embedded e){
	    	this.canvas = e;
	    }
	    
	    @Override
	    public LShape copy(){
	    	LShape s = new LShape();
	    	copyParameters(this,s);
	    	s.setPath(this.getPath());
	    	s.setCanvas(this.getCanvas());
	    	s.loadShape();
	    	return s;
	    }


		@Override
	    public void draw(Embedded e) {
			e.pushMatrix();
			e.translate((float)(getOrigin().getX()),(float)(getOrigin().getY()));
			e.rotate((float)Math.toRadians(getRotation()));
			e.shape(shape,(float)x,(float)y);
			e.popMatrix();
	    }
		
		

		@Override
		public void print(Embedded e) {
			e.pushMatrix();
			e.translate((float)(getOrigin().getX()),(float)(getOrigin().getY()));
			e.rotate((float)Math.toRadians(getRotation()));
			e.shape(shape,(float)x,(float)y);
			e.popMatrix();
			
		}

		@Override
		//TODO: implement polygon conversion
		//converts shape to polygon
		public Polygon toPolygon() {
			Polygon c =  new Polygon();
			copyParameters(this,c);
			/*double pR = (Math.PI*2)/resolution;
			double wR = width/2.0;
			double hR = height/2.0;
			for (int i = 0; i <= resolution; i++) {
				double t = pR*i;
				double x = wR* Math.cos(t);
				double y = hR* Math.sin(t);
				c.addPoint(x,y);

			}*/
		
			
			return c;
		}

	
}
