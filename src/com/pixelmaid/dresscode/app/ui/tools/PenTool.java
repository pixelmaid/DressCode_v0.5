package com.pixelmaid.dresscode.app.ui.tools;

import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.drawing.primitive2d.Polygon;
import com.pixelmaid.dresscode.drawing.primitive2d.Rectangle;
import com.pixelmaid.dresscode.events.CustomEvent;

public class PenTool extends Tool  {
	private Polygon createdDrawable;
	private Point startPoint;


	public PenTool(){
	}

	public void init(){


	}

	public Polygon closePoly(){
		if(createdDrawable!=null){
		createdDrawable.setClosed(true);
		createdDrawable.resetOriginRecur();
		

		Polygon d2 = createdDrawable.copy();
		
		createdDrawable = null;
		startPoint = null;
		return d2;
		
		}
		return null;
	}
	
	/*public void clearDrawable(){
		createdDrawable = null;
	}*/

	@Override 
	public void setActive(boolean a){
		
		active = a;
	}

	@Override
	public void mousePressed(double mouseX, double mouseY, boolean special) {
		if(createdDrawable==null){
			createdDrawable = new Polygon();
			createdDrawable.setClosed(false);
			this.fireToolEvent(CustomEvent.DRAWABLE_CREATED);
		}
		addPoint(mouseX,mouseY);


		this.fireToolEvent(CustomEvent.REDRAW_REQUEST);
	}



	public void addPoint(double x, double y){
		System.out.println("number of points ="+createdDrawable.getPoints().size());
		if(startPoint!=null){
			if(startPoint.distance(new Point(x,y))<10){
				this.fireToolEvent(CustomEvent.IRREGULAR_POLY_ADDED);
				
			}
			else{
				createdDrawable.addPoint(x,y);
			}
		}
		else{
			createdDrawable.addPoint(x,y);
			if(startPoint==null){
				startPoint = new Point(x,y);



			}
		}

	}

	@Override
	public Drawable getCreated(){
		return this.createdDrawable;
	}






}
