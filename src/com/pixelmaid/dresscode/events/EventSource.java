package com.pixelmaid.dresscode.events;

import java.util.ArrayList;
import java.util.EventObject;
import java.util.Iterator;
import java.util.List;

import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;


public class EventSource {
	protected List _listeners = new ArrayList<CustomEventListener>();
	  public synchronized void addEventListener(CustomEventListener listener)  {
	    _listeners.add(listener);
	  }
	  
	  public synchronized CustomEventListener getListenerAt(int index) {
			return (CustomEventListener) _listeners.get(index);
				
			}
	  
	  public synchronized void removeEventListener(CustomEventListener listener)   {
		    _listeners.remove(listener);
		  }
		 
		  // call this method whenever you want to notify
		  //the event listeners of the particular event
		  public synchronized void fireEvent( Object source, int eventType) {
		   
		    Iterator i = _listeners.iterator();
		    while(i.hasNext())  {
		      ((CustomEventListener) i.next()).handleCustomEvent(source, eventType);
		    }
		  }

		public void fireDrawableEvent(Object source, int event, Drawable d) {
			  Iterator i = _listeners.iterator();
			    while(i.hasNext())  {
			    	
			      ((CustomEventListener) i.next()).handleCustomDrawableEvent(source, event, d);
			    }
			
		}
		
		public void fireDrawableEvent(Object source, int event, Drawable d1,Drawable d2) {
			  Iterator i = _listeners.iterator();
			    while(i.hasNext())  {
			    	
			      ((CustomEventListener) i.next()).handleCustomDrawableEvent(source, event, d1,d2);
			    }
			
		}
		
		public void fireRuntimeErrorEvent(Object source, int event, String message) {
			  Iterator i = _listeners.iterator();
			    while(i.hasNext())  {
			    	
			      ((CustomEventListener) i.next()).handleCustomRuntimeErrorEventDrawableEvent(source, event, message);
			    }
			
		}

		public void firePrintEvent(Object source, int event, String value) {
			 Iterator i = _listeners.iterator();
			    while(i.hasNext())  {
			    	
			      ((CustomEventListener) i.next()).handleCustomPrintEvent(source, event, value);
			    }
			
		}
}
