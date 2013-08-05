package com.pixelmaid.dresscode.app.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;

public class DrawingToolbar extends Toolbar {

	JPanel btnPanel1= new JPanel();
	JPanel btnPanel2 = new JPanel();
	JPanel btnPanel3 = new JPanel();
	JPanel masterBtnPanel = new JPanel();
	
	
	public void init(int width, int height, Color background){
		Dimension masterDimension = new Dimension(width,height);
		this.setPreferredSize(masterDimension);
		
	
		btnPanel1.setPreferredSize(new Dimension(24,152));
		btnPanel2.setPreferredSize(new Dimension(24,175));
		btnPanel3.setPreferredSize(new Dimension(24,175));
		
		masterBtnPanel.add(btnPanel1);
		masterBtnPanel.add(btnPanel2);
		masterBtnPanel.add(btnPanel3);
		this.add(masterBtnPanel);
		
		FlowLayout layout = new FlowLayout();
		layout.setVgap(30);
		layout.setHgap(2);
		layout.setAlignment(FlowLayout.LEFT);
		EmptyBorder b = new EmptyBorder(0,0,0,0);
		masterBtnPanel.setBorder(b);
		masterBtnPanel.setLayout(layout);
		masterBtnPanel.setPreferredSize(masterDimension);
		masterBtnPanel.setBackground(background);

		 SpringLayout springLayout = new SpringLayout();
		 springLayout.putConstraint(SpringLayout.NORTH, masterBtnPanel,-15,SpringLayout.NORTH, this);
         this.setBorder(b);       
		this.setLayout(springLayout);
		/*for(int i=0;i<this.buttonList.size();i++){
			Button b = buttonList.get(i);
			//b.setSize(width/this.buttonList.size(),height);
			this.add(b);
		}*/
		this.setBackground(background);
		
		FlowLayout panelLayout = new FlowLayout();
		panelLayout.setVgap(1);
		panelLayout.setHgap(0);
		panelLayout.setAlignment(FlowLayout.LEFT);
		
		btnPanel1.setLayout(panelLayout);
		btnPanel2.setLayout(panelLayout);
		btnPanel3.setLayout(panelLayout);
		
		btnPanel1.setBackground(background);
		btnPanel2.setBackground(background);
		btnPanel3.setBackground(background);
		
		
		btnPanel1.setBorder(b);
		btnPanel2.setBorder(b);
		btnPanel3.setBorder(b);
		
		btnPanel1.doLayout();
		btnPanel2.doLayout();
		btnPanel3.doLayout();

		this.doLayout();
	}
	
	public void addButtonTo1(ImageButton btn){
		btnPanel1.add(btn);
	}
	
	public void addButtonTo2(ImageButton btn){
		btnPanel2.add(btn);
	}
	
	public void addButtonTo3(ImageButton btn){
		btnPanel3.add(btn);
	}
	
}
