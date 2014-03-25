package com.pixelmaid.dresscode.app;

import javax.naming.NameParser;
import javax.swing.JDialog; 

import java.awt.BorderLayout;
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

import com.pixelmaid.dresscode.data.Stamp;

import java.awt.event.ActionEvent; 
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class IrregularShapeDialog extends JDialog implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 private JPanel myPanel = null;
	    private JButton okButton = null;
	    private JButton cancelButton = null;
	   
	    private boolean answer = false;
	   
	    private JTextField nameF;
	    private ArrayList<String> stampNames;

	    public boolean getAnswer() { return answer; }
	    private String message = "Create a new stamp";
	    
	    public IrregularShapeDialog(JFrame frame, boolean modal, LinkedHashMap<String, Stamp>stampMap) {
	        super(frame, modal);
	        stampNames = new ArrayList<String>();
	        for (String key : stampMap.keySet())
			{
			  
			    stampNames.add(key);
			}
			
	        
	        
	        this.setPreferredSize(new Dimension(200,150));
	        this.setTitle("New Stamp");
	        myPanel = new JPanel();
	        getContentPane().add(myPanel);
	        myPanel.setLayout(new BorderLayout());
	        
	        //myPanel.add(new JLabel(message), BorderLayout.NORTH);
	        okButton = new JButton("Ok");
	        okButton.addActionListener(this);
	        
	        cancelButton = new JButton("Cancel");
	        cancelButton.addActionListener(this);
	        
	        
	        
	        JPanel buttonPanel = new JPanel(); //use FlowLayout
			buttonPanel.add(okButton);
			buttonPanel.add(cancelButton);
			
	        myPanel.add(buttonPanel,BorderLayout.PAGE_END);  
	        
	        JPanel entryPanel = new JPanel();
	        entryPanel.setLayout(new GridBagLayout());
	        GridBagConstraints c = new GridBagConstraints();
	        c.gridx = 0;
	        c.gridy = 0;
	        entryPanel.add(new JLabel("Shape name"), c);
	        c.gridx = 1;
	        c.gridy = 0;
	        nameF = new JTextField();
	        entryPanel.add(nameF,c);
	        nameF.setPreferredSize(new Dimension(100,25));
	        c.gridx = 1;
	        c.gridy = 1;
	        myPanel.add(entryPanel,BorderLayout.CENTER);  
	        
	        pack();
	        setLocationRelativeTo(frame);
	        setVisible(true);
	    }

	    public void actionPerformed(ActionEvent e) {
	        if(okButton == e.getSource()) {
	            System.err.println("User chose yes.");
	            String name = nameF.getText();
	            if(Character.isDigit(name.charAt(0))){
	            	IrregularShapeDialog.infoBox("Stamp name cannot start with a number.", "","Error in stamp name");
	            }
	            else if(name.contains(" ")){
	            	IrregularShapeDialog.infoBox("Stamp name cannot contain any spaces.", "","Error in stamp name");
	            }
	            else if(stampNames.contains(name)){
	            	IrregularShapeDialog.infoBox("You already have a stamp named "+name+".\n Please choose a unique name.", "","Error in stamp name");

	            }
	            else{
	            	answer = true;
	            	setVisible(false);
	            }
	        }
	        else if(cancelButton == e.getSource()) {
	            System.err.println("User chose no.");
	            answer = false;
	            setVisible(false);
	        }
	    }
	    
	    public String getName(){
	    	String val = nameF.getText();
	    	return val;
	    }
	    
	  
	    
	    public static void infoBox(String infoMessage, String location, String boxTitle)
	    {
	    
	    	JOptionPane.showMessageDialog(null, infoMessage, boxTitle + location, JOptionPane.ERROR_MESSAGE);
	    }
}
