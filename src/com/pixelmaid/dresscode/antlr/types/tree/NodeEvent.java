package com.pixelmaid.dresscode.antlr.types.tree;

import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.events.CustomEventListener;
import com.pixelmaid.dresscode.events.EventSource;

public class NodeEvent {
	  protected String error;
	  private EventSource es;
	 
	public NodeEvent(){
		es = new EventSource();
		error = "default error";
	}
	  
	protected String getError() {
		return this.error;
	}

	protected void fireEvent(int event) {
		this.es.fireEvent(this,event);
		
	}

	protected void drawableEvent(int event, Drawable d) {
		this.es.fireDrawableEvent(this,event,d);
		
	}
	
	public void addEventListener(CustomEventListener listener) {
		this.es.addEventListener(listener);
		
	}

	public void removeEventListener(CustomEventListener listener) {
		this.es.removeEventListener(listener);
	}
		
}
