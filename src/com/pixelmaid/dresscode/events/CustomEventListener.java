package com.pixelmaid.dresscode.events;

import java.util.EventObject;

import javax.swing.JComponent;

import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.app.ui.usercreated.UserUI;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;

public interface CustomEventListener {

	public void handleCustomInstructionEvent(Object source, int eventType);

	public void handleCustomDrawableEvent(Object source, int event, Drawable d);

	public void handleCustomDrawableEvent(Object source, int event, Drawable d1,Drawable d2);

	public void handleCustomToolEvent(Object source, int event);

	public void handleCustomRuntimeErrorEventDrawableEvent(Object source,
			int event, String message);

	public void handleCustomPrintEvent(Object source, int event, String value);

	public void handleCustomUINodeEvent(Object source, int event, UserUI d);
	
	public void handleCustomUIEvent(Object source, int event);


	
}
