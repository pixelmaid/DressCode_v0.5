package com.pixelmaid.dresscode.app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import javax.swing.tree.DefaultMutableTreeNode;



import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.app.ui.ButtonCellRenderer;



public class ListManager extends NodeEvent implements ListSelectionListener{

	protected JList list;
	protected DefaultListModel listModel;
	protected DefaultMutableTreeNode top;
	protected Color bg;
	protected Color fg;
	private ButtonCellRenderer renderer;
	
	public ListManager(Color bg, Color fg){
		listModel = new DefaultListModel();
		list = new JList();
		renderer = new ButtonCellRenderer();	
		list.setCellRenderer(renderer);
		list.setModel(listModel);
		this.list.setBackground(bg);
		list.addListSelectionListener(this);
		
	}
	
	public void addItem(String name){
		renderer.addImage(name);

		listModel.addElement(name);
		
		
		
	}
	
	public void clearItems(){
		DefaultListModel listModel = (DefaultListModel) list.getModel();
		listModel.removeAllElements();
		list.updateUI();
	}
	
	public JList getList(){
		return this.list;
	}




	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

	
	
	
}
