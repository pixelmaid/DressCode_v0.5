package com.pixelmaid.dresscode.drawing.primitive2d;


import java.util.ArrayList;

import processing.core.PGraphics;

import com.pixelmaid.dresscode.app.Canvas;
import com.pixelmaid.dresscode.drawing.datatype.Point;


//interface implemented by all classes that extend drawable


public interface PrimitiveInterface {

	public void draw(Canvas embedded);
	
	public void print(PGraphics embedded);
	
	public Drawable copy();
	
	void setPointsRelativeTo(Point p);
	
	public void setPointsAbsolute();
	
	Drawable toPolygon();	
	
	public Drawable addToGroup(Drawable d);
	
	public Drawable removeFromGroup(Drawable d);
	
	public ArrayList<Drawable> removeAllChildren();
	
	public Drawable addAllChildren(ArrayList<Drawable> orphans);

	public Drawable expand();
	
	public Point pointAt(int i);
}
