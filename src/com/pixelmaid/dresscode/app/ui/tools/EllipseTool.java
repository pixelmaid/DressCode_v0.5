package com.pixelmaid.dresscode.app.ui.tools;


import com.pixelmaid.dresscode.drawing.primitive2d.Ellipse;

import com.pixelmaid.dresscode.events.CustomEvent;

public class EllipseTool extends Tool  {
	private boolean created;
	

	
	public EllipseTool(){
	
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
			this.fireToolEvent(CustomEvent.ELLIPSE_ADDED);
		}
	}
	
	@Override
	public void mousePressed(double mouseX, double mouseY) {
		created=true;
		createdDrawable = new Ellipse(mouseX+4, mouseY+6,1,1);
		this.fireToolEvent(CustomEvent.DRAWABLE_CREATED);
		this.fireToolEvent(CustomEvent.REDRAW_REQUEST);
		
	}
	
	@Override
	public void mouseDragged(double mouseX, double mouseY) {

		if(created){
			((Ellipse)(createdDrawable)).setWidth(1);
			((Ellipse)(createdDrawable)).setHeight(1);
			double scaleX = Math.abs(mouseX+4-createdDrawable.getOrigin().getX())*2;
			double scaleY = Math.abs(mouseY+5-createdDrawable.getOrigin().getY())*2;
			createdDrawable.scale(scaleX,scaleY,createdDrawable.getOrigin(),true);
			System.out.println(createdDrawable.getWidth()+","+createdDrawable.getHeight());
			this.fireToolEvent(CustomEvent.REDRAW_REQUEST);
		}
	
	}
	
	
	
	
}
