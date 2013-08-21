package com.pixelmaid.dresscode.app;

import javax.naming.NameParser;
import javax.swing.JDialog; 

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.pixelmaid.dresscode.data.Stamp;

import java.awt.event.ActionEvent; 
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class NewSaveDialog extends JDialog implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 private JPanel myPanel = null;
	    private JButton saveButton = null;
	    private JButton dontSaveButton = null;

	    private JButton cancelButton = null;
	   
	    private int answer = 0;
	    
	    public static final int SAVED = 1;
	    public static final int NOTSAVED = 2;
	    public static final int CANCEL = 0;
	   
	    public int getAnswer() { return answer; }
	    
	    public NewSaveDialog(JFrame frame, boolean modal) {
	        super(frame, modal);
	       
			
	        
	        
	        this.setPreferredSize(new Dimension(500,100));
	        this.setTitle("Save your file?");
	        myPanel = new JPanel();
	        getContentPane().add(myPanel);
	        myPanel.setLayout(new BorderLayout());
	        
	        //myPanel.add(new JLabel(message), BorderLayout.NORTH);
	        saveButton = new JButton("Save");
	        saveButton.addActionListener(this);
	        
	        dontSaveButton = new JButton("Don't Save");
	        dontSaveButton .addActionListener(this);
	        
	        cancelButton = new JButton("Cancel");
	        cancelButton.addActionListener(this);
	        
	        
	      
	      	        
	        
	        JPanel buttonPanel = new JPanel(); //use FlowLayout
	        buttonPanel.add(dontSaveButton);
	        buttonPanel.add(saveButton);
			buttonPanel.add(cancelButton);
			
	        myPanel.add(buttonPanel,BorderLayout.PAGE_END);  
	        
	        
	        JLabel label = new JLabel("You have unsaved changes. Do you wish to save your file?");
	        label.setHorizontalAlignment(SwingConstants.CENTER);
	        myPanel.add(label,BorderLayout.CENTER);
	       
	        myPanel.doLayout();
	        
	        pack();
	        setLocationRelativeTo(frame);
	        setVisible(true);
	    }

	    public void actionPerformed(ActionEvent e) {
	        if(saveButton == e.getSource()) {
	            System.err.println("User chose yes.");
	            	answer = SAVED;
	            	setVisible(false);
	            
	        }
	       
	        else if(dontSaveButton == e.getSource()){
	        	  System.err.println("User chose don't save.");
		            answer = NOTSAVED;
		            setVisible(false);
	        }
	        else{
	            System.err.println("User chose cancel.");
	            answer = CANCEL;
	            setVisible(false);
	        }
	    }
	    
	    
	    
	    
	    

}
