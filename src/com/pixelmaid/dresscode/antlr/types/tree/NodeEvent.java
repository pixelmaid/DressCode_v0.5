package com.pixelmaid.dresscode.antlr.types.tree;

import java.util.ArrayList;
import java.util.Iterator;

import com.pixelmaid.dresscode.app.ui.usercreated.UserUI;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.events.CustomEventListener;
import com.pixelmaid.dresscode.events.EventInterface;

public class NodeEvent implements EventInterface{
	  protected String error;
	private ArrayList<CustomEventListener> _listeners = new ArrayList<CustomEventListener>();

	public NodeEvent(){
		error = "default error";
	}
	  
	protected String getError() {
		return this.error;
	}

	 public synchronized void fireEvent(int eventType) {
		   
		    Iterator<CustomEventListener> i = _listeners.iterator();
		    while(i.hasNext())  {
		      ((CustomEventListener) i.next()).handleCustomInstructionEvent(this, eventType);
		    }
	 }
	 
	 public void fireDrawableEvent(int event, Drawable d) {
		  Iterator<CustomEventListener> i = _listeners.iterator();
		    while(i.hasNext())  {
		    	
		      ((CustomEventListener) i.next()).handleCustomDrawableEvent(this, event, d);
		    }
		
	}
	 
	 public void fireUIEvent(int event, UserUI d) {
		  Iterator<CustomEventListener> i = _listeners.iterator();
		    while(i.hasNext())  {
		    	
		      ((CustomEventListener) i.next()).handleCustomUINodeEvent(this, event, d);
		    }
		
	}
	 
	
	 public void fireDrawableEvent(int event, Drawable d1,Drawable d2) {
		  Iterator<CustomEventListener> i = _listeners.iterator();
		    while(i.hasNext())  {
		    	
		      ((CustomEventListener) i.next()).handleCustomDrawableEvent(this, event, d1,d2);
		    }
		
	}
	 
	 public void fireToolEvent(int event) {
		  Iterator<CustomEventListener> i = _listeners.iterator();
		    while(i.hasNext())  {
		    	
		      ((CustomEventListener) i.next()).handleCustomToolEvent(this, event);
		    }
		
	}
	 public void firePrintEvent(int event, String value) {
		 Iterator<CustomEventListener> i = _listeners.iterator();
		    while(i.hasNext())  {
		    	
		      ((CustomEventListener) i.next()).handleCustomPrintEvent(this, event, value);
		    }
		
	}
	 public void fireRuntimeErrorEvent(int event, String message) {
		  Iterator<CustomEventListener> i = _listeners.iterator();
		    while(i.hasNext())  {
		    	
		      ((CustomEventListener) i.next()).handleCustomRuntimeErrorEventDrawableEvent(this, event, message);
		    }
		
	}
	 
	 @Override
	 public synchronized void addEventListener(CustomEventListener listener)  {
		    _listeners.add(listener);
		  }
	 @Override	  
	 public synchronized CustomEventListener getListenerAt(int index) {
				return (CustomEventListener) _listeners.get(index);
					
				}
		  
	 @Override
	 public synchronized void removeEventListener(CustomEventListener listener)   {
			    _listeners.remove(listener);
			  }
	
	
		
}
