package com.pixelmaid.dresscode.app.ui.usercreated;

import processing.core.PApplet;

import com.pixelmaid.dresscode.events.CustomEvent;
import com.pixelmaid.dresscode.events.EventInterface;
import com.pixelmaid.dresscode.events.EventSource;

public class UserUI extends EventSource {
	private String identifier;
	private int line;
	public void setId(String id){
		identifier=id;
	}
	public String getId(){
		return identifier;
	}
	
	public void draw(PApplet myParent) {
		
	}
	public void setLine(int l) {
		line = l;
		
	}
	
	public int getLine() {
		return line;
		
	}


	
	  public boolean checkForMousePress(double mouseX, double mouseY) {
	       return false;
	    }
	    public boolean checkForMouseDrag(double mouseX, double mouseY) {
	       
	        return false;
	    }
	    
	   
	    public void checkForMouseRelease(double mouseX, double mouseY) {

	        this.fireUIModifedEvent(this, CustomEvent.UI_RELEASED);

	    } 
	
}
