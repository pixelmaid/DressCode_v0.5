package com.pixelmaid.dresscode.app.ui.tools;

import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.primitive2d.Polygon;
import com.pixelmaid.dresscode.events.CustomEvent;

public class PenTool extends Tool  {
	private Polygon currentPoly;
	private Point startPoint;
	
	
	public PenTool(){
	this.cursorImage="pen";	
	}
	
	public void init(){
		
		
	}
	
	public void reset(){
		currentPoly = new Polygon();
		startPoint = null;
	}
	
	@Override 
	public void setActive(boolean a){
		this.reset();
		active = a;
		
		
	}
	
	@Override
	public void mouseReleased(int mouseX, int mouseY) {
		addPoint(mouseX,mouseY);
	}
	
	public void addPoint(double x, double y){
		if(startPoint!=null){
			if(startPoint.distance(new Point(x,y))<3){
		
			currentPoly.setClosed(true);
			reset();
			}
		}
		else{
			currentPoly.addPoint(x,y);
			if(startPoint==null){
				startPoint = new Point(x,y);
				this.drawableEvent(CustomEvent.DRAWABLE_CREATED,currentPoly);
				
				
			}
		}
		
	}
	
	public Polygon getPoly(){
		return this.currentPoly;
	}
	
	
	
	
	
}
