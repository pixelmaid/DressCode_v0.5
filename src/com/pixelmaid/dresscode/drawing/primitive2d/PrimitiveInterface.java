package com.pixelmaid.dresscode.drawing.primitive2d;


import java.util.ArrayList;

import com.pixelmaid.dresscode.app.Embedded;
import com.pixelmaid.dresscode.drawing.datatype.Point;


//interface implemented by all classes that extend drawable


public interface PrimitiveInterface {

	public void draw(Embedded embedded);
	
	public void print(Embedded embedded);
	
	public Drawable copy();
	
	void setRelativeTo(Point p);
	
	public void setAbsolute();
	
	Drawable toPolygon();	
	
	public Drawable addToGroup(Drawable d);
	
	public Drawable removeFromGroup(Drawable d);
	
	public ArrayList<Drawable> removeAllChildren();
	
	public Drawable addAllChildren(ArrayList<Drawable> orphans);
}
