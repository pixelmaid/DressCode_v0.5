package com.pixelmaid.dresscode.app.ui.tools;


import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.math.Geom;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.drawing.primitive2d.Polygon;
import com.pixelmaid.dresscode.events.CustomEvent;

public class PolyTool extends Tool  {
	private boolean created;
	private int sideNum=5;
	private double rotation=0;

	
	public PolyTool(){
	
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
			this.fireToolEvent(CustomEvent.POLY_ADDED);
		}
	}
	
	@Override
	public void mousePressed(double mouseX, double mouseY) {
		created=true;
		createdDrawable = new Polygon(new Point(mouseX+4, mouseY+6));
		this.fireToolEvent(CustomEvent.DRAWABLE_CREATED);
		this.fireToolEvent(CustomEvent.REDRAW_REQUEST);
		
	}
	
	@Override
	public void mouseDragged(double mouseX, double mouseY) {

		if(created){
			
			
			double scaleX = mouseX+4-createdDrawable.getOrigin().getX();
			double scaleY = mouseY+5-createdDrawable.getOrigin().getY();
			double theta = Geom.cartToPolar(scaleX,scaleY)[1];
			double r =  Geom.cartToPolar(scaleX,scaleY)[0];
			((Polygon)createdDrawable).setRadius(r,sideNum);
			((Polygon)createdDrawable).rotate(theta);
			this.rotation = theta;
			this.fireToolEvent(CustomEvent.REDRAW_REQUEST);
		}
	
	}
	
	public Drawable getCreated(){
		return this.createdDrawable;
	}
	
	public void setSideNum(int n){
		sideNum=n;
	}

	public double getRotation() {
		
		return this.rotation;
	}
	
}
