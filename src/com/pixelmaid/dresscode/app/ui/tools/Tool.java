package com.pixelmaid.dresscode.app.ui.tools;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Toolkit;

import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;

public class Tool extends NodeEvent{
	protected Cursor cursorImage;
	protected boolean active = false;
	protected Drawable createdDrawable;
	
	public Cursor getImage(){
		return cursorImage;
		
	}
	
	public void setImage(String cImage){
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image cursor = toolkit.getImage(ClassLoader.getSystemResource("com/pixelmaid/dresscode/resources/"+cImage+".png"));
		java.awt.Point cursorHotSpot = new java.awt.Point(0,0);
		cursorImage = toolkit.createCustomCursor(cursor, cursorHotSpot, "Cursor");
	
		
	}
	
	public boolean isActive(){
		return active;
	}
	
	public void setActive(boolean a){
		active =a;
	}

	public void mousePressed(double mouseX, double mouseY) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(double mouseX, double mouseY) {
		// TODO Auto-generated method stub
		
	}

	public void mouseDragged(double mouseX, double mouseY) {
		// TODO Auto-generated method stub
		
	}
	public Drawable getCreated(){
		return this.createdDrawable;
	}
	
	
}
