package com.pixelmaid.dresscode.app.ui.tools;


import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.math.Geom;
import com.pixelmaid.dresscode.drawing.primitive2d.Curve;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.drawing.primitive2d.Line;
import com.pixelmaid.dresscode.drawing.primitive2d.Polygon;
import com.pixelmaid.dresscode.events.CustomEvent;

public class CurveTool extends Tool  {
	private boolean created;
	private int clickCount=0;

	
	public CurveTool(){
	
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
	public void mouseReleased(double mouseX, double mouseY, boolean special) {
		
		
	}
	
	@Override
	public void mousePressed(double mouseX, double mouseY, boolean special) {
		if(clickCount==0){
			created=true;
		
		createdDrawable = new Curve(new Point(mouseX+4, mouseY+6),new Point(mouseX+4, mouseY+6),new Point(mouseX+4, mouseY+6),new Point(mouseX+4, mouseY+6));
		this.fireToolEvent(CustomEvent.DRAWABLE_CREATED);
		}
		else if(clickCount==1){
			((Curve)createdDrawable).setControl1(mouseX+4, mouseY+6);
			((Curve)createdDrawable).setControl2(mouseX+4, mouseY+6);
			((Curve)createdDrawable).setEnd(mouseX+4, mouseY+6);


		}
		else if(clickCount==2){
			
			((Curve)createdDrawable).setControl2(mouseX+4, mouseY+6);
			((Curve)createdDrawable).setEnd(mouseX+4, mouseY+6);


		}
		else if(clickCount==3){
			
			((Curve)createdDrawable).setEnd(mouseX+4, mouseY+6);
			this.fireToolEvent(CustomEvent.CURVE_ADDED);

		}
		clickCount++;
		if(clickCount>3){
			clickCount=0;
		}
		this.fireToolEvent(CustomEvent.REDRAW_REQUEST);
		
	}
	
	@Override
	public void mouseDragged(double mouseX, double mouseY, boolean special) {

		if(created){
			
			
			double scaleX = mouseX+4;
			double scaleY = mouseY+5;
			//double theta = Geom.cartToPolar(scaleX,scaleY)[1];
			//double r =  Geom.cartToPolar(scaleX,scaleY)[0];
			((Line)createdDrawable).setEnd(scaleX,scaleY);
			
			this.fireToolEvent(CustomEvent.REDRAW_REQUEST);
		}
	
	}
	
	public Drawable getCreated(){
		return this.createdDrawable;
	}
	

	
}
