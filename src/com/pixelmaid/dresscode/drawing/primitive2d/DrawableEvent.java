package com.pixelmaid.dresscode.drawing.primitive2d;

import com.pixelmaid.dresscode.events.CustomEventListener;

public interface DrawableEvent {
	public Drawable getDrawable();
	
	public  String getError();
	
	public void fireEvent(int event);
	
	public void addEventListener(CustomEventListener listener);
	 
	  
	  public void removeEventListener(CustomEventListener listener) ;
	  
	  void drawableEvent(int event, Drawable d);
}
