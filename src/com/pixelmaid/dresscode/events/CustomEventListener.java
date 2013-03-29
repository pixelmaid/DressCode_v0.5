package com.pixelmaid.dresscode.events;

import java.util.EventObject;

import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;

public interface CustomEventListener {

	public void handleCustomEvent(Object source, int eventType);

	public void handleCustomDrawableEvent(Object source, int event, Drawable d);

}
