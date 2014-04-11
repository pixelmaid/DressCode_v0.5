//inserted a different comment
package com.pixelmaid.dresscode.app;


import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

import com.jogamp.newt.event.KeyEvent;



public final class Manager{

	/**
	 * 
	 */
	private static DisplayFrame displayFrame;
	private static String resourcePath;
	


	public Manager() {
		
	}

	
	public static void main(String[] args) {
	
		
		//initialize windows
		displayFrame = new DisplayFrame();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    Double width = screenSize.getWidth();
	    Double height = screenSize.getHeight();
		displayFrame.initLook(width.intValue(),height.intValue());
		System.out.println("data initated");
		displayFrame.initData();
		displayFrame.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
			    KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "EXIT"); 
		displayFrame.getRootPane().getActionMap().put("EXIT", new AbstractAction(){ 
			        public void actionPerformed(ActionEvent e)
			        {
			           System.out.println("you pressed escape");
			        }

					
			    });
		
		//SimFrame simFrame = new SimFrame();
		
				//Window manager = new Window("DressCode");
				//manager.createAndShowGUI();
		
		
		
	
	}



}