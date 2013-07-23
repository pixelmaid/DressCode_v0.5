package com.pixelmaid.dresscode.app;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class Console extends JTextPane{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init(Color bg, Color fg, int size){
		this.setBackground(bg);
		this.setBorder(new EmptyBorder(10,10,10,10));
		this.setForeground(fg);
		this.setFont(new Font("Courier", 0, size));
	}
	
	public void reportErrors(String errorTxt) {
		this.setText(errorTxt);
		
	}

}
