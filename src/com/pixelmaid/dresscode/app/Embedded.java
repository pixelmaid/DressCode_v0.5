package com.pixelmaid.dresscode.app;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;

import processing.core.PApplet;

public class Embedded extends PApplet {
	  private Map<String, Drawable> drawables = new HashMap<String, Drawable>();
	  
	  
	public void setup() {
        // original setup code here ...
         size(Container.CANVAS_WIDTH, Container.CANVAS_HEIGHT);

        // prevent thread from starving everything else
      // noLoop();
     }

     public void draw() {
    	background(0);
    	 Iterator<Entry<String, Drawable>> it = drawables.entrySet().iterator();
    	System.out.println("drawable count="+drawables.size());
         while (it.hasNext()) {
          Drawable d = it.next().getValue();
          d.draw(this);
          
         }
     }

     public void mousePressed() {
         // do something based on mouse movement

         // update the screen (run draw once)
         redraw();
     }
     
     public void addDrawable(String id, int lineNumber, Drawable d) {
 	    String key = id + Integer.toString(lineNumber);
 	   System.out.println("key="+key);
 	    drawables.put(key, d);
 	    
 	  }
    
    public void removeDrawable(String id, int lineNumber) {
 	    String key = id + Integer.toString(lineNumber);
 	    drawables.remove(key);
 	  }
    
    public void clearAllDrawables() {
 	   drawables.clear();
 	  }
 }