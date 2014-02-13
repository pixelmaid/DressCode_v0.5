package com.pixelmaid.dresscode.app;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PFont;

import com.pixelmaid.dresscode.app.ui.usercreated.UserUI;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.events.CustomEventListener;
import com.pixelmaid.dresscode.events.EventInterface;

public class SimView extends PApplet implements EventInterface {
	
	public void setup() {
		
		size(500,500, P3D);
		noLoop();
		this.sphere(100);
		

	}

	public void draw(){
		
	}
	@Override
	public void addEventListener(CustomEventListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CustomEventListener getListenerAt(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeEventListener(CustomEventListener listener) {
		// TODO Auto-generated method stub
		
	}

}
