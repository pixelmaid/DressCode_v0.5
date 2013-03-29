package com.pixelmaid.dresscode.app.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.pixelmaid.dresscode.events.EventSource;

public class Toolbar extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public EventSource eventSource;
	private ArrayList<JButton> buttonList;
	
	public Toolbar(){
		buttonList = new ArrayList<JButton>();
	}
	
	public void init(int width, int height){
		Dimension masterDimension = new Dimension(width,height);
		this.setPreferredSize(masterDimension);
		
		FlowLayout layout = new FlowLayout();
		layout.setVgap(0);
		layout.setHgap(1);
		layout.setAlignment(FlowLayout.LEFT);
		this.setLayout(layout);
		this.setVisible(true);
		/*for(int i=0;i<this.buttonList.size();i++){
			Button b = buttonList.get(i);
			//b.setSize(width/this.buttonList.size(),height);
			this.add(b);
		}*/
		this.doLayout();
	}
	
	public void addButton(JButton b){
		buttonList.add(b);	
		this.add(b);
		
	}
	
	public void removeButton(Button b){
		buttonList.remove(b);	
		this.remove(b);
		
	}
	
}
