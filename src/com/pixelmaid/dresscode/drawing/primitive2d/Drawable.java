package com.pixelmaid.dresscode.drawing.primitive2d;

import java.util.ArrayList;

import javax.media.opengl.GL2;

import com.pixelmaid.dresscode.app.Embedded;

//interface implemented by all classes that are drawable or printable by the processing applet


public interface Drawable {

	
	public void draw( Embedded embedded);
	
	public void print( float strokeWeight);
	

}
