package com.pixelmaid.dresscode.app.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class PatternToolbar extends Toolbar {
	   private JPanel buttonPanel =new JPanel();
	   private JPanel labelPanel;
	  private JLabel label;
	  private JComboBox dropdown;
	
	public void init(int width, int height, JComboBox d, Color background){
		Dimension masterDimension = new Dimension(width,height);
		this.setPreferredSize(masterDimension);
		
		 SpringLayout layout = new SpringLayout();
	     this.setLayout(layout);
	     labelPanel = new JPanel();
		label = new JLabel("design view");//initialize the label
		label.setForeground(new Color(190,184,184));
		dropdown= d;
	
		this.add(label);
		this.add(dropdown);
		/*JTextField textField = new JTextField("Text field", 15);
	    this.add(textField);
	    */
		
		FlowLayout panelLayout = new FlowLayout();
		//panelLayout.setVgap(1);
		panelLayout.setHgap(1);
		panelLayout.setAlignment(FlowLayout.LEFT);
		
		buttonPanel.setSize(new Dimension(121,10));
		buttonPanel.setBackground(null);
		buttonPanel.setBorder(new EmptyBorder(0,0,0,0));
		buttonPanel.setLayout(panelLayout);
		buttonPanel.doLayout();
		this.add(buttonPanel);
		
	    EmptyBorder b = new EmptyBorder(0,0,0,0);
        this.setBorder(b);       
		this.setVisible(true);
		this.setBackground(background);
		
		
		layout.putConstraint(SpringLayout.WEST, buttonPanel, 20,SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, label,6,SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.WEST, dropdown, 220,SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, dropdown, 2,SpringLayout.NORTH, this);

		//Adjust constraints for the text field so it's at
		//(<label's right edge> + 5, 5).
		layout.putConstraint(SpringLayout.WEST, label,110,SpringLayout.WEST,this);
		layout.putConstraint(SpringLayout.NORTH, buttonPanel,-2,SpringLayout.NORTH, this);
		
		
		 this.doLayout();
		
		/*
		labelPanel = new JPanel();
		label = new JLabel("untitled");//initialize the label
		label.setForeground(new Color(242,242,242));
		labelPanel.setSize(new Dimension(width-121,26));
		FlowLayout lLayout = new FlowLayout();
		lLayout.setAlignment(FlowLayout.RIGHT);
		labelPanel	.setLayout(lLayout);
			//do some stuff with label here maybe...
		this.add(label);//now add it

		buttonPanel.setSize(new Dimension(121,26));
		buttonPanel.setBackground(null);
		buttonPanel.setBorder(new LineBorder(new Color(255,0,0)));
		this.add(buttonPanel);
		FlowLayout layout = new FlowLayout();
		layout.setVgap(0);
		layout.setHgap(2);
		layout.setAlignment(FlowLayout.RIGHT);
		EmptyBorder b = new EmptyBorder(2,0,0,10);
         this.setBorder(b);       
		this.setLayout(layout);
		this.setVisible(true);
		
		this.setBackground(background);
		
		
		 try {
			 URL url = ClassLoader.getSystemResource("com/pixelmaid/dresscode/resources/flower.png");
			 image = ImageIO.read(url);
			} catch (IOException e) {
			
			}
		
		 this.doLayout();
		 */
		
	}
	@Override
	public void addButton(JButton b){
		buttonList.add(b);	
		buttonPanel.add(b);
	}
	
	@Override
	public void removeButton(Button b){
		buttonList.remove(b);	
		buttonPanel.remove(b);
		
	}
	
	 @Override
	   protected void paintComponent(Graphics g) {
	      super.paintComponent(g);
	    
	   }

	  
	  
	   public void updateLabel(String l){
		   label.setText(l);
		   
	   }

}
