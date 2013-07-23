package com.pixelmaid.dresscode.app.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.border.EmptyBorder;

public class DrawingToolbar extends Toolbar {

	public void init(int width, int height, Color background){
		Dimension masterDimension = new Dimension(width,height);
		this.setPreferredSize(masterDimension);
		
		FlowLayout layout = new FlowLayout();
		layout.setVgap(2);
		layout.setHgap(0);
		layout.setAlignment(FlowLayout.LEFT);
		EmptyBorder b = new EmptyBorder(0,0,0,0);
         this.setBorder(b);       
		this.setLayout(layout);
		this.setVisible(true);
		/*for(int i=0;i<this.buttonList.size();i++){
			Button b = buttonList.get(i);
			//b.setSize(width/this.buttonList.size(),height);
			this.add(b);
		}*/
		this.setBackground(background);
		this.doLayout();
	}
	
}
