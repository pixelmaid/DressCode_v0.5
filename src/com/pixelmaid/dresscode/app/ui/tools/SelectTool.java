package com.pixelmaid.dresscode.app.ui.tools;

import java.util.ArrayList;

import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.math.Geom;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.events.CustomEvent;

public class SelectTool extends Tool  {
	private ArrayList<Drawable> selectedDrawable;
	private ArrayList<Point> points;

	private Drawable group = new Drawable();
	private boolean selected;
	private boolean moved;
	private ArrayList<Drawable> tempDrawables;
	private double selectDist = 5;
	
	public SelectTool(){
		selectedDrawable= new ArrayList<Drawable>();
		points= new ArrayList<Point>();
	}
	
	public void init(){
	}
	
	public void reset(){
		
		for(int i=0;i<tempDrawables.size();i++){
			tempDrawables.get(i).setSelected(false);
		}
		
		selectedDrawable.clear();
		group.removeAllChildren();
		group = new Drawable();
		selected = false;
		moved = false;
	}
	
	@Override 
	public void setActive(boolean a){
		this.reset();
		
		active = a;
	}
	
	public void setDrawables(ArrayList<Drawable>tD){
		tempDrawables = tD;
		this.fireToolEvent(CustomEvent.REDRAW_REQUEST);
	}
	
	@Override
	public void mouseReleased(double mouseX, double mouseY, boolean special) {
		if(moved){
			this.fireToolEvent(CustomEvent.DRAWABLE_MOVED);
		}
		
		
	}
	
	@Override
	public void mousePressed(double mouseX, double mouseY, boolean special) {
		
		
		for(int i=tempDrawables.size()-1;i>=0;i--){
			Point origin = tempDrawables.get(i).getOrigin();
			if(!special){
				reset();
			}
			if((Math.abs(mouseX-origin.getX())<selectDist)&&(Math.abs(mouseY-origin.getY())<selectDist)){
				Drawable sD = tempDrawables.get(i);
				selectedDrawable.add(sD);
				
				selected=true;
				sD.setSelected(true);
				System.out.println("selected object at"+i);
				break;
		
			}
		}
		this.fireToolEvent(CustomEvent.REDRAW_REQUEST);

		
		
	}
	
	@Override
	public void mouseDragged(double mouseX, double mouseY, boolean special) {
		if(selected){
			points.clear();
			for(int i=0;i<selectedDrawable.size();i++){
				points.add(selectedDrawable.get(i).getOrigin());

			}
		
			
			
		if(selectedDrawable.size()>1){
			Point centroid = Geom.getAveragePoint(points);
			for(int i=0;i<selectedDrawable.size();i++){
				
				Drawable sD = selectedDrawable.get(i);
				double dX = mouseX-centroid.getX();
				double dY = mouseY-centroid.getY();
				Point o = sD.getOrigin();
				sD.moveBy(dX,dY);

			}
			moved=true;

		}
		else{
			Drawable sD = selectedDrawable.get(0);
			sD.moveTo(mouseX,mouseY);
		
			moved=true;
			System.out.println("select drag");
			System.out.println(sD.getOrigin().getX()+","+sD.getOrigin().getY());
		}
		this.fireToolEvent(CustomEvent.REDRAW_REQUEST);
		}

	}
	
	public boolean shapeSelected(){
		return selected;
	}
	
	public boolean shapeMoved(){
		return moved;
	}

	public ArrayList<Drawable> getSelected(){
		return this.selectedDrawable;
	}
	
	
}
