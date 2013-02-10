package com.pixelmaid.dresscode.drawing.primitive2d;

import java.util.ArrayList;
import com.pixelmaid.dresscode.app.Embedded;
import com.pixelmaid.dresscode.drawing.datatype.Point;

//interface implemented by all classes that are drawable or printable by the processing applet


public interface DrawableInterface {

	//draws drawable
	public void draw( Embedded embedded);
	
	//prints drawable
	public void print( Embedded embedded);
	
	//prevents drawable from being drawn
	public void hide();
	
	//unhides drawable
	public void show();
	
	//moves drawable to specific location
	public void moveTo(double x,double y);
	
	//moves drawable by the amount specified in x, y
	public void moveBy(double x,double y);
	
	//rotates drawable by amount specified in degrees
	public void rotate(double theta);
	
	//scales drawable along x axis
	public void scaleX(double x);
	
	//scales drawable along y axis
	public void scaleY(double y);
	
	//scales drawable equally along x and y axis
	public void scale(double s);
	
	// returns a copy of the drawable
	public Drawable copy();
	
	//returns the difference of two drawables
	public Drawable difference(Drawable d);
	
	//returns the union of two drawables
	public Drawable union(Drawable d);
	
	//returns the clip of two drawables
	public Drawable clip(Drawable d);
	
	public Point getOrigin();
	
	public double getWidth();
	
	public double getHeight();

	//adds shapes, lines to the drawable
	public void add(Drawable d);

	//removes drawable from canvas
	public void removeFromCanvas();

	//gets absolute origin
	public Point getAbsoluteOrigin();

	
		
}
