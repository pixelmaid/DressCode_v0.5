package com.pixelmaid.dresscode.events;

import java.util.EventObject;

public class CustomEvent extends EventObject {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int PARSE_COMPLETE = 0;
	public static final int PARSE_ERROR = 1;
	public  static final int DRAWABLE_CREATED = 2;
	public static final int ADD_DRAWABLE = 3;
	public static final int REMOVE_DRAWABLE = 4;
	public static final int SWAP_DRAWABLE = 5;
	public static final int SHAPE_LOAD_REQUESTED = 6;
	public static final int TARGET_SELECTED = 7;
	public static final int RUNTIME_ERROR=8;
	public static final int PRINT_STATEMENT = 9;
	public static final int PRINT_LN_STATEMENT = 10;
	public static final int DRAWABLE_MOVED = 11;
	public static final int CANVAS_MOUSE_PRESSED = 12;
	public static final int CANVAS_MOUSE_RELEASED = 13;
	public static final int CANVAS_MOUSE_DRAGGED = 14;
	public static final int REDRAW_REQUEST = 15;
	public static final int PAN_ACTIVE = 16;
	public static final int RECT_ADDED = 17;
	public static final int ELLIPSE_ADDED = 18;
	public static final int STAMP_SELECTED = 19;
	public static final int STAMP_INSERTED = 20;
	public static final int MAIN_SELECTED = 21;
	public static final int POLY_ADDED = 22;
	public static final int LINE_ADDED = 23;
	public static final int CURVE_ADDED = 24;

	public CustomEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}

}
