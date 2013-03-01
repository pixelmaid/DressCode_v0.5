package com.pixelmaid.dresscode.app;

import javax.swing.JDialog; 

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionEvent; 

public class NewDialog extends JDialog implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 private JPanel myPanel = null;
	    private JButton okButton = null;
	    private JButton cancelButton = null;
	   
	    private boolean answer = false;
	    private double width=0;
	    private double height=0;
	    private JTextField widthF;
	    private JTextField heightF;
	    public boolean getAnswer() { return answer; }
	    private String message = "Set the size of your canvas";
	    
	    public NewDialog(JFrame frame, boolean modal) {
	        super(frame, modal);
	        this.setPreferredSize(new Dimension(200,150));
	        this.setTitle("New");
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
	        entryPanel.add(new JLabel("Width"), c);
	        c.gridx = 1;
	        c.gridy = 0;
	        widthF = new JTextField("300");
	        entryPanel.add(widthF,c);
	        c.gridx = 0;
	        c.gridy = 1;
	        heightF = new JTextField("500");
	        entryPanel.add(new JLabel("Height"), c);
	        c.gridx = 1;
	        c.gridy = 1;
	        entryPanel.add( heightF, c);
	        
	        myPanel.add(entryPanel,BorderLayout.CENTER);  
	        
	        pack();
	        setLocationRelativeTo(frame);
	        setVisible(true);
	    }

	    public void actionPerformed(ActionEvent e) {
	        if(okButton == e.getSource()) {
	            System.err.println("User chose yes.");
	            answer = true;
	            setVisible(false);
	        }
	        else if(cancelButton == e.getSource()) {
	            System.err.println("User chose no.");
	            answer = false;
	            setVisible(false);
	        }
	    }
	    
	    public int getCanvasWidth(){
	    	Double val = Double.parseDouble(widthF.getText());
	    	return val.intValue();
	    }
	    
	    public int getCanvasHeight(){
	    	Double val = Double.parseDouble(heightF.getText());
	    	return val.intValue();
	    }
}
