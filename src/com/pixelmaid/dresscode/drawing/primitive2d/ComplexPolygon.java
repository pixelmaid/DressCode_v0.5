package com.pixelmaid.dresscode.drawing.primitive2d;

import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;

public class ComplexPolygon extends Drawable {
	@Override
	public Drawable copy() {
		ComplexPolygon d = new ComplexPolygon();
		copyParameters(this,d);
		for(int i=0;i<this.children.size();i++){
			d.add(this.children.get(i).copy());
		}
			
		return d;
		
	}
}
