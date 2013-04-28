package com.pixelmaid.dresscode.antlr.types.tree;

import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.events.CustomEvent;
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
	
	protected void drawableEvent(int event, Drawable d1 , Drawable d2) {
		this.es.fireDrawableEvent(this,event,d1,d2);
		
	}
	protected void printEvent(int event, String value){
		this.es.firePrintEvent(this,event,value);
	}
	
	protected void errorEvent(int event, String error){
		this.es.fireRuntimeErrorEvent(this, event, error);
	}
	
	public void addEventListener(CustomEventListener listener) {
		this.es.addEventListener(listener);
		
	}
	
	public CustomEventListener getListenerAt(int index) {
	return es.getListenerAt(index);
		
	}

	public void removeEventListener(CustomEventListener listener) {
		this.es.removeEventListener(listener);
	}
		
}
