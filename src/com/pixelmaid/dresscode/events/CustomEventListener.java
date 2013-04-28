package com.pixelmaid.dresscode.events;

import java.util.EventObject;

import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;

public interface CustomEventListener {

	public void handleCustomEvent(Object source, int eventType);

	public void handleCustomDrawableEvent(Object source, int event, Drawable d);

	public void handleCustomDrawableEvent(Object source, int event, Drawable d1,Drawable d2);

	
	public void handleCustomTargetEvent(Object source, int event, double x,
			double y);

	public void handleCustomRuntimeErrorEventDrawableEvent(Object source,
			int event, String message);


	public void handleCustomPrintEvent(Object source, int event, String value);

	public void handleCustomMoveEvent(Object source, int event, Drawable selectedObject);

	
}
