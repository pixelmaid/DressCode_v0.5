package com.pixelmaid.dresscode.app.ui.tools;

import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.events.CustomEvent;

public class TargetTool extends Tool {
	private Point target;
	
	public TargetTool(){
		
		}
	
	public void init(){
	
	}
	
	public void reset(){
		target = null;
	}
	
	@Override 
	public void setActive(boolean a){
		this.reset();
		active = a;
	}
	
	@Override
	public void mouseReleased(double mouseX, double mouseY) {
		this.target = new Point(mouseX,mouseY);
		this.fireToolEvent(CustomEvent.TARGET_SELECTED);
	}
	
	
	public Point getTarget(){
		return this.target;
	}
		
}
