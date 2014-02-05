package com.pixelmaid.dresscode.drawing.math;

import java.util.Comparator;

import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;

public class CmpDist  implements Comparator<Drawable> {
	Point target;
	public CmpDist(Point t){
		target = t;
	}
	public int compare(Drawable a,Drawable b) {
		Point target = new Point(0,0);
		double distA = a.getOrigin().distance(target);
		double distB = b.getOrigin().distance(target);
		return (distA < distB) ? -1 : (distA > distB) ? 1 : 0;
	}
}