package com.pixelmaid.dresscode.events;

import java.util.ArrayList;
import java.util.EventObject;
import java.util.Iterator;
import java.util.List;

import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;


public interface EventInterface {
	
	  public void addEventListener(CustomEventListener listener);
	  
	  public CustomEventListener getListenerAt(int index);
	  
	  public void removeEventListener(CustomEventListener listener);

	public void removeAllListeners();

}
