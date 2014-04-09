package com.pixelmaid.dresscode.app.ui;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;



public class RunButton  extends ImageButton {
	/**
	 * 
	 */
	ImageIcon aIcon;
	
	 public RunButton(String title,String img,String tip, int width, int height) {
		 
		super(title,img,tip,width,height);
	 }
	 
	 public void setAnimImg(String img){
		 aIcon = new ImageIcon(ClassLoader.getSystemResource("com/pixelmaid/dresscode/resources/"+img+".gif"));
		 this.setDoubleBuffered(true);
	 }
		
	public void toggleAnimate(){
		System.out.println("toggle animate");
			this.setIcon(aIcon);
		
	}
	
	public void toggleStandard(){
		System.out.println("toggle standard");
		this.setIcon(sIcon);
	
}
		  
		  
}
