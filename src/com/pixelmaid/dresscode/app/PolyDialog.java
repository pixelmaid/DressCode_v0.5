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

public class PolyDialog extends JDialog implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 private JPanel myPanel = null;
	    private JButton okButton = null;
	    private JButton cancelButton = null;
	    private int defaultSides = 0;
	   
	    private boolean answer = false;
	   
	    private JTextField sideNumber;
	    

	    public boolean getAnswer() { return answer; }
	    
	    
	    public PolyDialog(JFrame frame, boolean modal, int dS) {
	        super(frame, modal);
	        this.setResizable(false);
	        defaultSides = dS;
	       
	        this.setPreferredSize(new Dimension(200,100));
	        this.setTitle("Polygon Settings");
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
	        entryPanel.add(new JLabel("number of sides"), c);
	        c.gridx = 1;
	        c.gridy = 0;
	        sideNumber = new JTextField(String.valueOf(defaultSides));
	        entryPanel.add(sideNumber,c);
	        sideNumber.setPreferredSize(new Dimension(50,25));
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
	            String sideNum = sideNumber.getText();
	            int sides = defaultSides;
	            try{
	            	sides = Integer.parseInt(sideNum);
	            	
	            }
	           catch(NumberFormatException n){
	            	PolyDialog.infoBox("Please enter a valid integer.", "");
	    	        sideNumber.setText(String.valueOf(defaultSides));

	            }
	            if(sides<3 || sides>300){
	            	PolyDialog.infoBox("Please enter a number between 3 and 300.", "");
	    	        sideNumber.setText(String.valueOf(defaultSides));

	            }
	            else{
	            	answer = true;
	            	defaultSides = sides;
	            	setVisible(false);
	            }
	            
	        }
	        else if(cancelButton == e.getSource()) {
	            System.err.println("User chose no.");
	            answer = false;
	            setVisible(false);
	        }
	    }
	    
	    public int getSides(){
	    	return defaultSides;
	    }
	    
	  
	    public static void infoBox(String infoMessage, String location)
	    {
	    
	    	JOptionPane.showMessageDialog(null, infoMessage, "Error in stamp name" + location, JOptionPane.ERROR_MESSAGE);
	    }
}
