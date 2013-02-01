package com.pixelmaid.dresscode.drawing.primitive2d;
import com.pixelmaid.dresscode.drawing.datatype.Point;


interface Turtle {

	public void left(double angle);
	
	public void right(double angle);
	
	public void forward(double dist);
	
	public void back(double dist);
	
	public void penUp();
	
	public void penDown();
	
	
}
