//inserted a different comment
package com.pixelmaid.dresscode.app;


import java.awt.Dimension;
import java.awt.Toolkit;



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
		
		//SimFrame simFrame = new SimFrame();
		
				//Window manager = new Window("DressCode");
				//manager.createAndShowGUI();
		
		
		
	
	}



}