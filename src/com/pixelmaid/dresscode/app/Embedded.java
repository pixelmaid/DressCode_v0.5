package com.pixelmaid.dresscode.app;


import java.util.LinkedHashMap;
import java.util.Map;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.drawing.primitive2d.DrawableInterface;

import processing.core.PApplet;

public class Embedded extends PApplet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Map<String, Drawable> drawables = new LinkedHashMap<String, Drawable>();
	public final int DEFAULT_BG = 222;

	public void setup() {
		//this.init();
		// original setup code here ...
		size(600,768,P2D);
		background(DEFAULT_BG,DEFAULT_BG,DEFAULT_BG);
		// prevent thread from starving everything else
		noLoop();
	}

	public void draw() {

		background(DEFAULT_BG,DEFAULT_BG,DEFAULT_BG);
		System.out.println("draw");
		//this.ellipse(0, 0, 100, 100);
		System.out.println("drawable count="+drawables.size());
		for (Drawable value : drawables.values()) {
			
				value.draw(this);
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
}