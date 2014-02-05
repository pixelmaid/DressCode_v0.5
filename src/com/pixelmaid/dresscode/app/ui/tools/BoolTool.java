package com.pixelmaid.dresscode.app.ui.tools;
import java.util.ArrayList;

import com.pixelmaid.dresscode.drawing.math.PolyBoolean;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.events.CustomEvent;
public class BoolTool extends Tool {
	public final static int UNION = 0;
	public final static int DIFF = 1;
	public final static int XOR = 2;
	public final static int CLIP = 3;
	public int boolType=-1;
	
	public void reset(){
		createdDrawable = null;
		
		
	}
	
	public boolean doBool(ArrayList<Drawable>drawables,int bT){
		if(drawables.size()>1){
			Drawable d1 = drawables.get(0);
			Drawable d2 = drawables.get(1);
			boolType = bT;
		switch(boolType){
			case UNION:
				createdDrawable =PolyBoolean.union(d1.copy(),d2 .copy());
			break;
			case DIFF:
				createdDrawable =PolyBoolean.difference(d1.copy(),d2 .copy());
			break;
			case XOR:
				createdDrawable =PolyBoolean.xor(d1.copy(),d2 .copy());
			
			break;
			case CLIP:
				createdDrawable =PolyBoolean.intersection(d1.copy(),d2 .copy());
			break;
			
			
		}
		this.fireToolEvent(CustomEvent.DRAWABLE_CREATED);
		this.fireToolEvent(CustomEvent.BOOL_PERFORMED);
		return true;

		}
		else{
		
			return false;
		}
	}

	
	
}
