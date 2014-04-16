package com.pixelmaid.dresscode.app;

import javax.naming.NameParser;
import javax.swing.JDialog; 

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
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

import com.pixelmaid.dresscode.data.InstructionManager;
import com.pixelmaid.dresscode.data.Stamp;

import java.awt.event.ActionEvent; 
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class LogicDialog extends JDialog implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 private JPanel myPanel = null;
	 private JPanel entryPanel;
	 private GridBagConstraints c;
	    private JButton okButton = null;
	    private JButton cancelButton = null;
	   
	    private boolean answer = false;
	   
	    private JTextField nameF;
	    private String groupName;
	    private ArrayList<String> vals;
	    private ArrayList<JTextField> nums;
		public static final int REPEAT_TYPE =0;
	    public static final int RADIAL_TYPE =1;
	    public static final int ROW_TYPE =2;
	    public static final int ARC_TYPE =3;
	    public static final int SPIRAL_TYPE =4;
	    private InstructionManager instructionManager;

	    public boolean getAnswer() { return answer; }
	    
	    public LogicDialog(JFrame frame, boolean modal, int type, InstructionManager iM) {
	        super(frame, modal);
	        instructionManager = iM;
	        vals = new ArrayList<String>();
	        nums = new ArrayList<JTextField>();
	        this.setPreferredSize(new Dimension(300,200));
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
	        
	        entryPanel = new JPanel();
	        entryPanel.setLayout(new GridBagLayout());
	        c = new GridBagConstraints();
	        c.insets = new Insets(3,3,3,3);
	        c.anchor= GridBagConstraints.NORTHWEST;
	        c.gridx = 0;
	        c.gridy = 0;
	        JLabel groupL = new JLabel("group name", SwingConstants.LEFT);
	        groupL.setPreferredSize(new Dimension(130, 25));
	        entryPanel.add(groupL, c);
	        c.gridx = 1;
	        c.gridy = 0;
	        nameF = new JTextField();
	        entryPanel.add(nameF,c);
	        nameF.setPreferredSize(new Dimension(100,25));
	        switch(type){
	        case RADIAL_TYPE:
	        	createRadialDialog();
	        	break;
	        case REPEAT_TYPE:
	        	createRepeatDialog();
	        	break;
	        case ARC_TYPE:
	        	createArcDialog();
	        	break;
	        case ROW_TYPE:
	        	createRowDialog();
	        	break;
	        case SPIRAL_TYPE:
	        	createSpiralDialog();
	        	break;
	        	
	        	
	        }
	        myPanel.add(entryPanel,BorderLayout.CENTER);  
	        pack();
	        setLocationRelativeTo(frame);
	        setVisible(true);
	       
	    }
	    
	    
	    private void createRadialDialog(){
	    	 this.setTitle("Insert Radial Statement");
		       
		        c.gridx = 0;
		        c.gridy = 1;
		        JLabel numL = new JLabel("number of repeats", SwingConstants.LEFT);
		        numL.setPreferredSize(new Dimension(130, 25));
		        entryPanel.add(numL, c);
		        c.gridx = 1;
		        c.gridy = 1;
		        JTextField numF = new JTextField();
		        numF.setName("number of repeats");
		        entryPanel.add(numF,c);
		        nums.add(numF);
		        numF.setPreferredSize(new Dimension(75,25));
		        c.gridx = 0;
		        c.gridy = 2;
		        JLabel radL = new JLabel("radius", SwingConstants.LEFT);
		        radL.setPreferredSize(new Dimension(130, 25));
		        entryPanel.add(radL, c);
		        c.gridx = 1;
		        c.gridy = 2;
		        JTextField radF = new JTextField();
		        radF.setName("radius");
		        radF.setPreferredSize(new Dimension(75,25));
		        entryPanel.add(radF,c);
		        nums.add(radF);
		        
		        
		        
	    }
	    
	    private void createRowDialog(){
	    	 this.setTitle("Insert Row Statement");
		       
		        c.gridx = 0;
		        c.gridy = 1;
		        JLabel numL = new JLabel("number of repeats", SwingConstants.LEFT);
		        numL.setPreferredSize(new Dimension(130, 25));
		        entryPanel.add(numL, c);
		        c.gridx = 1;
		        c.gridy = 1;
		        JTextField numF = new JTextField();
		        numF.setName("number of repeats");
		        entryPanel.add(numF,c);
		        nums.add(numF);
		        numF.setPreferredSize(new Dimension(75,25));
		        c.gridx = 0;
		        c.gridy = 2;
		        JLabel radL = new JLabel("gap", SwingConstants.LEFT);
		        radL.setPreferredSize(new Dimension(130, 25));
		        entryPanel.add(radL, c);
		        c.gridx = 1;
		        c.gridy = 2;
		        JTextField radF = new JTextField();
		        radF.setName("gap");
		        radF.setPreferredSize(new Dimension(75,25));
		        entryPanel.add(radF,c);
		        nums.add(radF);
		        
		        
		        
	    }
	    
	    private void createSpiralDialog(){
	    	 this.setTitle("Insert Spiral Statement");
		       
		        c.gridx = 0;
		        c.gridy = 1;
		        JLabel numL = new JLabel("number of repeats", SwingConstants.LEFT);
		        numL.setPreferredSize(new Dimension(130, 25));
		        entryPanel.add(numL, c);
		        c.gridx = 1;
		        c.gridy = 1;
		        JTextField numF = new JTextField();
		        numF.setName("number of repeats");
		        entryPanel.add(numF,c);
		        nums.add(numF);
		        numF.setPreferredSize(new Dimension(75,25));
		        c.gridx = 0;
		        c.gridy = 2;
		        JLabel radL = new JLabel("angle increment", SwingConstants.LEFT);
		        radL.setPreferredSize(new Dimension(130, 25));
		        entryPanel.add(radL, c);
		        c.gridx = 1;
		        c.gridy = 2;
		        JTextField radF = new JTextField();
		        radF.setName("angle");
		        radF.setPreferredSize(new Dimension(75,25));
		        entryPanel.add(radF,c);
		        nums.add(radF);
		        
		        
		        
	    }
	    
	    private void createArcDialog(){
	    	 this.setTitle("Insert Arc Statement");
		       
		        c.gridx = 0;
		        c.gridy = 1;
		        JLabel numL = new JLabel("number of repeats", SwingConstants.LEFT);
		        numL.setPreferredSize(new Dimension(130, 25));
		        entryPanel.add(numL, c);
		        c.gridx = 1;
		        c.gridy = 1;
		        JTextField numF = new JTextField();
		        numF.setName("number of repeats");
		        entryPanel.add(numF,c);
		        nums.add(numF);
		        numF.setPreferredSize(new Dimension(75,25));
		        c.gridx = 0;
		        c.gridy = 2;
		        JLabel radL = new JLabel("width of arc", SwingConstants.LEFT);
		        radL.setPreferredSize(new Dimension(130, 25));
		        entryPanel.add(radL, c);
		        c.gridx = 1;
		        c.gridy = 2;
		        JTextField radF = new JTextField();
		        radF.setName("width of arc");
		        radF.setPreferredSize(new Dimension(75,25));
		        entryPanel.add(radF,c);
		        nums.add(radF);
		        c.gridx = 0;
		        c.gridy = 3;
		        JLabel hL = new JLabel("height of arc", SwingConstants.LEFT);
		        hL.setPreferredSize(new Dimension(130, 25));
		        entryPanel.add(hL, c);
		        c.gridx = 1;
		        c.gridy = 3;
		        JTextField hF = new JTextField();
		        hF.setName("height of arc");
		        hF.setPreferredSize(new Dimension(75,25));
		        entryPanel.add(hF,c);
		        nums.add(hF);
		        
		        
		        
	    }
	    
	    
	    private void createRepeatDialog(){
	    	 this.setTitle("Insert Repeat Statement");
		       
		        c.gridx = 0;
		        c.gridy = 1;
		        JLabel numL = new JLabel("number of repeats", SwingConstants.LEFT);
		        numL.setPreferredSize(new Dimension(130, 25));
		        entryPanel.add(numL, c);
		        c.gridx = 1;
		        c.gridy = 1;
		        JTextField numF = new JTextField();
		        numF.setName("number of repeats");
		        entryPanel.add(numF,c);
		        nums.add(numF);
		        numF.setPreferredSize(new Dimension(75,25));
		        
		        
		        
		        
	    }

	    public void actionPerformed(ActionEvent e) {
	        if(okButton == e.getSource()) {
	            System.err.println("User chose yes.");
	            String name = nameF.getText();
	            vals.clear();
	            for(int i=0;i<nums.size();i++){
	            	try{
	            		double d = Double.parseDouble(nums.get(i).getText());
	            		this.vals.add(Double.toString(d));
	            	}
	            	catch (NumberFormatException nfe){
	            		String n = nums.get(i).getText();
	            		boolean exists = instructionManager.lookup(n);
	            		if(!exists){
	            			LogicDialog.infoBox("value at "+nums.get(i).getName()+" must be a number", "","error in number");
	            			return;
	            		}
	            		else{
	            			this.vals.add(n);	
	            		}
	            		
	            		
	            	}
	            	
	            }
	            if(name.length()==0){
	            	LogicDialog.infoBox("please enter a name for your group.", "","Error in group name");

	            }
	            else if(Character.isDigit(name.charAt(0))){
	            	LogicDialog.infoBox("group name cannot start with a number.", "","Error in group name");
	            }
	            else if(name.contains(" ")){
	            	LogicDialog.infoBox("group name cannot contain any spaces.", "","Error in group name");
	            }
	           
	            else{
	            	answer = true;
	            	groupName= name;
	            	nums.clear();
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
	    	return groupName;
	    }
	    
	    public ArrayList<String> getVals(){
	    	return vals;
	    }
	  
	    public static void infoBox(String infoMessage, String location, String boxTitle)
	    {
	    
	    	JOptionPane.showMessageDialog(null, infoMessage, boxTitle + location, JOptionPane.ERROR_MESSAGE);
	    }
}
