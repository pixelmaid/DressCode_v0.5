//inserted a different comment
package com.pixelmaid.dresscode.app;


import java.awt.Toolkit;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public final class Manager{

	/**
	 * 
	 */



	public Manager() {
		
	}

	
	public static void main(String[] args) {

		System.out.println("scale factor="+Toolkit.getDefaultToolkit().getDesktopProperty("apple.awt.contentScaleFactor"));


		/* Use an appropriate Look and Feel */
		try {
			 System.setProperty("apple.laf.useScreenMenuBar", "true");
			 
             System.setProperty("com.apple.mrj.application.apple.menu.about.name", "DressCode	");
             System.setProperty("apple.awt.graphics.UseQuartz","true");
             System.setProperty("apple.awt.graphics.EnableDeferredUpdates","true");

			 UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());    
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
	            //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
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
		// UIManager.put("swing.boldMetal", Boolean.FALSE);

		//Schedule a job for the event dispatch thread:
		//creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Window manager = new Window("DressCode");
				manager.createAndShowGUI();
				
			}
		});
	}

}