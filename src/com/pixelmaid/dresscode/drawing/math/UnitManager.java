package com.pixelmaid.dresscode.drawing.math;

public final class UnitManager {
	public static  int METRIC=0;
	public static  int STANDARD=1;
	public static double INCH_IN_PIX = 0.0139;
	public static double MM_IN_PIX = 0.3528;
	public static double CM_IN_PIX = 0.0353;
	public static double PIX_IN_INCH = 	72;
	public static double PIX_IN_MM = 2.8346;
public static double PIX_IN_CM = 28.3465 ;
public static double DEFAULT_WIDTH=8.25;
public static double DEFAULT_HEIGHT=10.75;


	public static double toPixels(double x, int units){
		if(units==METRIC){
			return x*PIX_IN_MM;
		}
		else{
			return x*PIX_IN_INCH;
		}
		
	}
	
	public static double toUnits(double x,int units){
		if(units==METRIC){
			return x*MM_IN_PIX;
		}
		else{
			return x*INCH_IN_PIX;
		}
		
	}
}
