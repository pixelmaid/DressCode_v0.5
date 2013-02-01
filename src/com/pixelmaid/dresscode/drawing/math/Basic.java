package com.pixelmaid.dresscode.drawing.math;

public class Basic {
	
	//basic mapping function
	static public final float map(float value, float istart, float istop, float ostart, float ostop) {
	    return ostart + (ostop - ostart) * ((value - istart) / (istop - istart));
	  }

}
