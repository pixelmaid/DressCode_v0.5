package com.pixelmaid.dresscode.data;

import java.util.ArrayList;

import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.app.CodeField;
import com.pixelmaid.dresscode.app.ui.usercreated.*;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.events.CustomEvent;
import com.pixelmaid.dresscode.events.CustomEventListener;
import com.pixelmaid.dresscode.events.EventInterface;
public class UserUIManager extends NodeEvent implements CustomEventListener {
private ArrayList<UserUI> uis= new ArrayList<UserUI>();
private CodeField codeField;
public UserUIManager(CodeField cf){
	codeField= cf;
	
	
}


	public void addUI(UserUI d) {
		uis.add(d);
		d.addEventListener(this);
	
	}
	
	public void swapUI(UserUI a, UserUI b){
		int i = uis.indexOf(a);
		setUserUI(b,i);
		b.addEventListener(this);
		a.removeEventListener(this);

	}
	
	public void setUserUI(UserUI a, int i){	
		uis.set(i, a);	
		a.addEventListener(this);

	}

	public boolean removeUserUI(UserUI d){
		d.removeEventListener(this);
		return true;

	}
	
	public boolean removeUserUIAt(int i){
		return uis.remove(i)==null?false:true;
	}

	
	public void clearAllUserUIs() {
		uis.clear();

	}
	
	public ArrayList<UserUI> getUserUIs(){
		return this.uis;
	}


	@Override
	public void handleCustomInstructionEvent(Object source, int eventType) {
		
	}

	@Override
	public void handleCustomToolEvent(Object source, int event) {
		
	}

	

	@Override
	public void handleCustomDrawableEvent(Object source, int event, Drawable d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleCustomDrawableEvent(Object source, int event,
			Drawable d1, Drawable d2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleCustomRuntimeErrorEventDrawableEvent(Object source,
			int event, String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleCustomPrintEvent(Object source, int event, String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleCustomUINodeEvent(Object source, int event, UserUI d) {
		switch (event){
		case CustomEvent.UI_CREATED:
			addUI(d);
	
		break;
		}
		
	}

	@Override
	public void handleCustomUIEvent(Object source, int event) {
		switch (event){
		
		case CustomEvent.UI_MODIFIED:
			Slider s = (Slider)(source);
			int line = s.getLine();
		
			String insertStatement = s.getId()+"="+Math.round(s.getSliderValue())+";";
			codeField.updateVariable(insertStatement, line);
			System.out.println("insertStatement:"+insertStatement);
			
		break;
		case CustomEvent.UI_RELEASED:
			this.fireToolEvent(CustomEvent.RUN_REQUEST);
			break;
		}
		
	}

	

	

}
