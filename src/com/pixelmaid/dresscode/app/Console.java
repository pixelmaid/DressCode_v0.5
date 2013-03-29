package com.pixelmaid.dresscode.app;

import javax.swing.JTextPane;

public class Console extends JTextPane{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init(){
		
	}
	
	public void reportErrors(String errorTxt) {
		this.setText(errorTxt);
		
	}

}
