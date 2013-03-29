package com.pixelmaid.dresscode.events;

import java.util.EventObject;

public class CustomEvent extends EventObject {
	
	public static final int PARSE_COMPLETE = 0;
	public static final int PARSE_ERROR = 1;
	public  static final int DRAWABLE_CREATED = 2;
	public static final int ADD_DRAWABLE = 3;
	public static final int REMOVE_DRAWABLE = 4;
	public static final int SWAP_DRAWABLE = 5;
	public static final int DRAWABLE_REMOVED = 0;
	
	public CustomEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}

}
