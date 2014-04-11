package com.pixelmaid.dresscode.data;

import java.util.ArrayList;
import java.util.Map;

import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.antlr.types.tree.functions.DrawableNode;
import com.pixelmaid.dresscode.app.ui.usercreated.UserUI;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.events.CustomEvent;
import com.pixelmaid.dresscode.events.CustomEventListener;
//manages all of the current drawables  generated by the user and controls access to them

public class DrawableManager extends NodeEvent implements CustomEventListener {
	
	private ArrayList<Drawable> drawables = new ArrayList<Drawable>();

	
	public void addDrawable(Drawable d) {
		drawables.add(d);
	}
	
	public void swapDrawable(Drawable a, Drawable b){
		int i = drawables.indexOf(a);
		setDrawable(b,i);
	}
	
	public void setDrawable(Drawable a, int i){	
		drawables.set(i, a);	
	}

	public boolean removeDrawable(Drawable d){
		return drawables.remove(d);
	}
	
	public boolean removeDrawableAt(int i){
		return drawables.remove(i)==null?false:true;
	}

	
	public void clearAllDrawables() {
		drawables.clear();

	}
	
	public ArrayList<Drawable> getDrawables(){
		return this.drawables;
	}

	@Override
	public void handleCustomDrawableEvent(Object source, int eventType, Drawable d) {
		if(d!=null){
		//System.out.println("drawable event called");
		switch (eventType){
		case CustomEvent.DRAWABLE_CREATED:
			this.addDrawable(d);
			d.addEventListener(this);
			//System.out.println("drawable created");
			this.fireDrawableEvent(CustomEvent.DRAWABLE_CREATED, d);
			break;
			
		case CustomEvent.REMOVE_DRAWABLE:
			this.removeDrawable(d);
			d.removeEventListener(this);
			this.fireDrawableEvent(CustomEvent.REMOVE_DRAWABLE, d);
			//System.out.println("drawable removed");
			//System.out.println("condensing holes");
			break;
		
		case CustomEvent.SHAPE_LOAD_REQUESTED:
			this.fireDrawableEvent(CustomEvent.SHAPE_LOAD_REQUESTED, d);
			break;
		}
		}
		//System.out.println("num drawables="+this.drawables.size());
		
	}
	
	@Override
	//TODO: has to be recursive switch to work on groups
	public void handleCustomDrawableEvent(Object source, int eventType, Drawable d1, Drawable d2) {
		//System.out.println("drawable event called");
		switch (eventType){
		case CustomEvent.SWAP_DRAWABLE:
			int i = this.drawables.indexOf(d1);
			drawables.set(i, d2);
			d2.addEventListener(this);
			this.fireDrawableEvent(CustomEvent.SWAP_DRAWABLE, d1, d2);
			//System.out.println("drawable swapped");
			
			break;
		}
			
		
		
	}

	@Override
	public void handleCustomInstructionEvent(Object source, int eventType) {
		
	}

	@Override
	public void handleCustomToolEvent(Object source, int event) {
		
	}

	@Override
	public void handleCustomRuntimeErrorEventDrawableEvent(Object source,
			int event, String message) {
		System.out.println("error event d ="+message);
		this.fireRuntimeErrorEvent(CustomEvent.RUNTIME_ERROR, message);
		
	}

	@Override
	public void handleCustomPrintEvent(Object source, int event, String value) {
		System.out.println("print event d ="+value);
		this.firePrintEvent(CustomEvent.PRINT_STATEMENT, value);
		
	}

	public void deselectAll() {
		for(int i=0;i<drawables.size();i++){
			drawables.get(i).setSelected(false);
		}
		
	}
	
	public void selectAll() {
		for(int i=0;i<drawables.size();i++){
			drawables.get(i).setSelected(true);
		}
		
	}

	@Override
	public void handleCustomUINodeEvent(Object nodeEvent, int event, UserUI d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleCustomUIEvent(Object source, int event) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean identifierExists(String id){
		for (int i=0;i<drawables.size();i++){
			if(drawables.get(i).getIdentifier()!=null){
				if(id.matches(drawables.get(i).getIdentifier())){
					return true;
				}
			}
		}
		return false;
	}

	
	
	
}
