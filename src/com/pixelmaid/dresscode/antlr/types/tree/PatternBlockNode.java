package com.pixelmaid.dresscode.antlr.types.tree;

import java.util.ArrayList;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.app.ui.usercreated.UserUI;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.events.CustomEvent;
import com.pixelmaid.dresscode.events.CustomEventListener;

public class PatternBlockNode extends BlockNode implements CustomEventListener{
public ArrayList<Drawable> patternDrawables;
	
	
	public void storeDrawables(){
		patternDrawables = new ArrayList<Drawable>();
	}

		 /* patternDrawables = new ArrayList<Drawable>();
		  for(int i=0;i<statements.size(); i++){
		      VarType value = statements.get(i).evaluate();
		      
		      if(value != VarType.VOID) {
		        // return early from this block if value is a return statement
		        //return value;
		      }
		      
		      //if value is drawable then add it to master drawable and remove it from the canvas
		      if (value.isDrawable()){
		    	 Drawable d = value.asDrawable();
		    	 if(!drawables.contains(d)){
		    		 drawables.add(d);
		      }
		    }
		  }
		  Drawable g = new Drawable();
		  this.fireDrawableEvent(CustomEvent.DRAWABLE_CREATED, g);
		  
		  for(int i=0;i<drawables.size();i++){
			  Drawable d = drawables.get(i);
			  Drawable p = d.getParent();
			  if(p!=null){
				  if(!drawables.contains(p)){
					  g.addToGroup(drawables.get(i));
				  }
			  }
			  else{
			 	g.addToGroup(drawables.get(i));
			  }
		  }
		  double theta = 360/num*pos;
		  g.heading(theta, rad);

		  return g;
		     
	  }*/
	
	@Override
	public void handleCustomInstructionEvent(Object source, int eventType) {
		// TODO Auto-generated method stub
		
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
	public void handleCustomToolEvent(Object source, int event) {
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleCustomUIEvent(Object source, int event) {
		// TODO Auto-generated method stub
		
	}

}
