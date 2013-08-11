package com.pixelmaid.dresscode.app.ui.tools;

import com.pixelmaid.dresscode.events.CustomEvent;

public class PanTool extends Tool{

	@Override
	public void mouseDragged(double mouseX, double mouseY) {

			
			this.fireToolEvent(CustomEvent.PAN_ACTIVE);
	
	
	}
	
}
