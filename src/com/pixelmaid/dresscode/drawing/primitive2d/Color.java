package com.pixelmaid.dresscode.drawing.primitive2d;
//stores color values for primitives
public class Color {
	private int r=0;
	private int g=0;
	private int b=0;
			
	public static final String BLACK= "BLACK";
	public static final String RED	= "RED";
	public static final String BLUE = "BLUE";
	public static final String GREEN ="GREEN";
	public static final String PURPLE ="PURPLE";
	public static final String YELLOW = "YELLOW";
	public static final String ORANGE = "ORANGE";
	public static final String PINK = "PINK";
	public static final String WHITE = "WHITE";
	public static final String GREY = "GREY";
	
	
	public Color(int c){
		this(c,c,c);
	}
	public Color(int r, int g, int b){
		set(r,g,b);
	}
	
	public Color(String value) {
		if(value.equals(BLACK)){
			set(0,0,0);
		}
		else if(value.equals(RED)){
			set(255,0,0);
		}
		else if(value.equals(BLUE)){
			set(51,204,255);
		}
		else if(value.equals(GREEN)){
			set(51,204,51);
		}
		else if(value.equals(PURPLE)){
			set(153,51,255);
		}
		else if(value.equals(YELLOW)){
			set(255,232,62);
		}
		else if(value.equals(ORANGE)){
			set(255,154,44);
		}
		else if(value.equals(PINK)){
			set(244,154,218);
		}
		else if(value.equals(WHITE)){
			set(255,255,255);
		}
		else if(value.equals(GREY)){
			set(150,150,150);
		}
		else{
			throw new RuntimeException("I'm not sure what color you're trying to set");  
		}
	}
	public Color(){
		this(GREY);
	}
	
	public void set(int r, int g, int b){
		this.r=r;
		this.g=g;
		this.b=b;
		
	}
	
	public int r(){
		return r;
	}
	public int g(){
		return g;
	}
	public int b(){
		return b;
	}
}
