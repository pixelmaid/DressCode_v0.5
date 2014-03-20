package com.pixelmaid.dresscode.app.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;


import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.MatteBorder;


public class TreeToolbar extends JPanel {
	public static final int IMG_WIDTH = 72;
	
	  private JLabel label;
	 
	
	public void init(int width, int height, String name, Color background, Color font, Color border){
		this.setPreferredSize(new Dimension(width,height));
		this.setBackground(background);

		SpringLayout layout = new SpringLayout();
	     this.setLayout(layout);
		label = new JLabel(name);//initialize the label
		label.setForeground(font);
		label.setFont(new Font("helvetica",10,10));
		this.add(label);
		 MatteBorder b = new MatteBorder(0,0,3,0,border);
	     //   this.setBorder(b);      
		
		this.setVisible(true);
		this.setBackground(background);
		
		
		layout.putConstraint(SpringLayout.WEST, label, 5,SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, label,height/2-5,SpringLayout.NORTH, this);
		
		
		 this.doLayout();
	
		
	}
	
	   
	   public void updateLabel(String l){
		   label.setText(l);
		   
	   }

}
