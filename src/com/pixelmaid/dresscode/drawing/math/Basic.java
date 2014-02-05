package com.pixelmaid.dresscode.drawing.math;

public class Basic {
	
	//basic mapping function
	static public final double map(double value, double istart, double istop, double ostart, double ostop) {
	    return ostart + (ostop - ostart) * ((value - istart) / (istop - istart));
	  }

}
