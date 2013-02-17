package com.pixelmaid.dresscode.app;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.jogamp.newt.event.WindowEvent;
import com.jogamp.newt.event.WindowListener;
import com.jogamp.newt.event.WindowUpdateEvent;

import jsyntaxpane.DefaultSyntaxKit;


public final class Manager extends JFrame implements WindowListener,ActionListener {
	
	  private static CodeField codeField; //textField for code entry 
	  public static final Embedded canvas = new Embedded();
	  public static boolean RIGHT_TO_LEFT = false;
	  public static JFileChooser fc;
	  public static JButton openButton, saveButton;
	  
	  public Manager(String title) {
		  super(title);
	  }
	  
	  public static void setupFileChooser(Manager frame){
		  fc = new JFileChooser();
		  openButton = new JButton("Open");
                //  createImageIcon("images/Open16.gif"));
		  
		  openButton.addActionListener(frame);
		  
		  saveButton = new JButton("Save");//,
                  //createImageIcon("images/Save16.gif"));
		  saveButton.addActionListener(frame);
		  
	  }
	  
	  
	  public static void addComponentsToPane(Container pane) {
	         
	        if (!(pane.getLayout() instanceof BorderLayout)) {
	            pane.add(new JLabel("Container doesn't use BorderLayout!"));
	            return;
	        }
	         
	        if (RIGHT_TO_LEFT) {
	            pane.setComponentOrientation(
	                    java.awt.ComponentOrientation.RIGHT_TO_LEFT);
	        }
	         
	       canvas.init();
	       
	       canvas.setPreferredSize(new Dimension(600,786));
	        pane.add(canvas, BorderLayout.CENTER);
	         
	        codeField= new CodeField();
	        codeField.setPreferredSize(new Dimension(600,786));
	       
	      

	        DefaultSyntaxKit.initKit();

	        JScrollPane scrPane = new JScrollPane(codeField);
	      	pane.add(scrPane, BorderLayout.LINE_END);
	      	
	      	JPanel buttonPanel = new JPanel(); //use FlowLayout
	        buttonPanel.add(openButton);
	        buttonPanel.add(saveButton);
	 
	        //Add the buttons and the log to this panel.
	       pane.add(buttonPanel, BorderLayout.PAGE_START);
	      	
	        pane.doLayout();
	        codeField.setContentType("text/java");
	        codeField.setText("a= ellipse(100,100);\n" + 
	        		"b = ellipse(200,200,20,100);\n" + 
	        		"d = ellipse(120,120,10,50);\n" + 
	        		"e = group(a,b);\n" + 
	        		"\n" + 
	        		"c = e+b;\n" + 
	        		"\n" + 
	        		"//move(e,500,500);\n" + 
	        		"");
	    
	    }
	  
	  private static void createAndShowGUI() {
		  
	        //Create and set up the window.
	        Manager frame = new Manager("DressCode");
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	       //setup file chooser and buttons
	       setupFileChooser(frame);
	        //Set up the content pane.
	        addComponentsToPane(frame.getContentPane());
	        
	        //Display the window.
	        frame.pack();
	        frame.setVisible(true);
	    }
	  public static void main(String[] args) {
	        /* Use an appropriate Look and Feel */
	        try {
	            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
	            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
	        } catch (UnsupportedLookAndFeelException ex) {
	            ex.printStackTrace();
	        } catch (IllegalAccessException ex) {
	            ex.printStackTrace();
	        } catch (InstantiationException ex) {
	            ex.printStackTrace();
	        } catch (ClassNotFoundException ex) {
	            ex.printStackTrace();
	        }
	        /* Turn off metal's use bold fonts */
	        UIManager.put("swing.boldMetal", Boolean.FALSE);
	         
	        //Schedule a job for the event dispatch thread:
	        //creating and showing this application's GUI.
	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                createAndShowGUI();
	            }
	        });
	    }


	@Override
	public void actionPerformed(ActionEvent e) {
		 
        //Handle open button action.
        if (e.getSource() == openButton) {
            int returnVal = fc.showOpenDialog(Manager.this);
 
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                String filetxt= readFile(file);
                codeField.loadFile(filetxt);
                //log.append("Opening: " + file.getName() + "." + newline);
            } else {
                //log.append("Open command cancelled by user." + newline);
            }
            //log.setCaretPosition(log.getDocument().getLength());
 
        //Handle save button action.
        } else if (e.getSource() == saveButton) {
            int returnVal = fc.showSaveDialog(Manager.this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                writeFile(codeField.getText(),file);
            } else {
               // log.append("Save command cancelled by user." + newline);
            }
            //log.setCaretPosition(log.getDocument().getLength());
        }
    }
	
	public static String readFile(File file) {
		 
		BufferedReader br = null;
		String fileString="";
		try {
 
			String sCurrentLine;
 
			br = new BufferedReader(new FileReader(file));
 
			while ((sCurrentLine = br.readLine()) != null) {
				fileString+=sCurrentLine+"\n";
				System.out.println(sCurrentLine);
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return fileString;
 
	}

	
	public static void writeFile(String content, File file) {
		try {
 
			
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("wrote file");
 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	@Override
	public void windowDestroyNotify(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowDestroyed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowGainedFocus(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowLostFocus(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowMoved(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowRepaint(WindowUpdateEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowResized(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
