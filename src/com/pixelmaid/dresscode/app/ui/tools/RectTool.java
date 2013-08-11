package com.pixelmaid.dresscode.app.ui.tools;


import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.drawing.primitive2d.Ellipse;
import com.pixelmaid.dresscode.drawing.primitive2d.Rectangle;
import com.pixelmaid.dresscode.events.CustomEvent;

public class RectTool extends Tool  {
	private boolean created;
	

	
	public RectTool(){
	
	}
	
	public void init(){
	
	}
	
	public void reset(){
		createdDrawable = null;
		created = false;
		
	}
	
	@Override 
	public void setActive(boolean a){
		this.reset();
		active = a;
	}
	
	
	@Override
	public void mouseReleased(double mouseX, double mouseY) {
		
		if (created){
			this.fireToolEvent(CustomEvent.RECT_ADDED);
		}
	}
	
	@Override
	public void mousePressed(double mouseX, double mouseY) {
		created=true;
		createdDrawable = new Rectangle(mouseX+4, mouseY+6,1,1);
		this.fireToolEvent(CustomEvent.DRAWABLE_CREATED);
		this.fireToolEvent(CustomEvent.REDRAW_REQUEST);
		
	}
	
	@Override
	public void mouseDragged(double mouseX, double mouseY) {

		if(created){
			((Rectangle)(createdDrawable)).setWidth(1);
			((Rectangle)(createdDrawable)).setHeight(1);
			double scaleX = Math.abs(mouseX+4-createdDrawable.getOrigin().getX())*2;
			double scaleY = Math.abs(mouseY+5-createdDrawable.getOrigin().getY())*2;
			createdDrawable.scale(scaleX,scaleY);
			System.out.println(createdDrawable.getWidth()+","+createdDrawable.getHeight());
			this.fireToolEvent(CustomEvent.REDRAW_REQUEST);
		}
	
	}
	
	public Drawable getCreated(){
		return this.createdDrawable;
	}
	
	
}
