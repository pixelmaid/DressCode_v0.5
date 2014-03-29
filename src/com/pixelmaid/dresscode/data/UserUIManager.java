package com.pixelmaid.dresscode.data;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.app.CodeField;
import com.pixelmaid.dresscode.app.SliderFrame;
import com.pixelmaid.dresscode.app.ui.usercreated.*;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.events.CustomEvent;
import com.pixelmaid.dresscode.events.CustomEventListener;
import com.pixelmaid.dresscode.events.EventInterface;
public class UserUIManager extends NodeEvent implements CustomEventListener, ChangeListener, MouseListener {
private ArrayList<UserUI> uis= new ArrayList<UserUI>();
private CodeField codeField;
private SliderFrame sliderFrame;
public UserUIManager(CodeField cf, SliderFrame sf){
	codeField= cf;
	sliderFrame = sf;
	
	
}


	public void addUI(UserUI d) {
		uis.add(d);
		Slider s = (Slider)d;
		JSlider js = sliderFrame.addSlider(s.getName(), s.getMin(), s.getMax(), s.getSliderValue());
		js.addChangeListener(this);
		js.addMouseListener(this);
	
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
		sliderFrame.clearAllSliders();

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
			codeField.updateVariable(insertStatement, line,0);
			System.out.println("insertStatement:"+insertStatement);
			
		break;
		case CustomEvent.UI_RELEASED:
			this.fireToolEvent(CustomEvent.RUN_REQUEST);
			break;
		}
		
	}


	@Override
	public void stateChanged(ChangeEvent event) {
		JSlider js = (JSlider)event.getSource();
		String name = js.getName();
		Slider s = null;
		for(int i=0;i<uis.size();i++){
			if(uis.get(i).getName().matches(name)){
				s = (Slider)uis.get(i);
				s.setSliderValue(js.getValue());
				int line = s.getLine();
				double val = s.getSliderValue();
				String valString = "";
				if(Math.round(val)==val){
					valString = String.format("%.0f",val);
				}
				else{
					valString =  String.format("%.2f",val);
				}
				String insertStatement = s.getId()+"="+valString;
				codeField.updateVariable(insertStatement, line,0);
				System.out.println("insertStatement:"+insertStatement);
				break;
				
			}
		}
		
		
	}


	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent event) {
		if(event.getSource() instanceof JSlider){
			this.fireToolEvent(CustomEvent.RUN_REQUEST);
		}
		
	}

	

	

}
