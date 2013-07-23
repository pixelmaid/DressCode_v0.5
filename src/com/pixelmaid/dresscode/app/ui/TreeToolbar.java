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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class TreeToolbar extends Toolbar {
	public static final int IMG_WIDTH = 72;
	   public static final int IMG_HEIGHT = 31;
	   private JPanel buttonPanel =new JPanel();
	   private JPanel labelPanel;
	  private JLabel label;
	   private BufferedImage image = new BufferedImage(IMG_WIDTH, IMG_HEIGHT,
	            BufferedImage.TYPE_INT_ARGB);
	
	public void init(int width, int height, Color background, Color border){
		Dimension masterDimension = new Dimension(width,10);
		this.setPreferredSize(masterDimension);
		this.setSize(masterDimension);
		
		 SpringLayout layout = new SpringLayout();
	     this.setLayout(layout);
	     labelPanel = new JPanel();
		label = new JLabel("Tree");//initialize the label
		label.setForeground(new Color(191,184,184));
		this.add(label);
		/*JTextField textField = new JTextField("Text field", 15);
	    this.add(textField);
	    */
		
		
		
	    MatteBorder b = new MatteBorder(0,0,3,0,border);
        //this.setBorder(b);       
		this.setVisible(true);
		this.setBackground(background);
		
		
		layout.putConstraint(SpringLayout.WEST, label, 10,SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.NORTH, label,6,SpringLayout.NORTH, this);
		
		
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
	      if (image != null) {
	         g.drawImage(image, 0, 0, null);
	      }
	   }

	   @Override
	   public Dimension getPreferredSize() {
	      return new Dimension(IMG_WIDTH, IMG_HEIGHT);
	   }

	   public void clearScreen() {
	      Graphics g = image.getGraphics();
	      g.setColor(Color.black);
	      g.fillRect(0, 0, image.getWidth(), image.getHeight());
	      g.dispose();
	      repaint();
	   }
	   
	   public void updateLabel(String l){
		   label.setText(l);
		   
	   }

}
