package com.pixelmaid.dresscode.app;

import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


import javax.media.opengl.awt.GLCanvas;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.SwingUtilities;

//import org.antlr.runtime.ANTLRStringStream;
//import org.antlr.runtime.CommonTokenStream;
//import org.antlr.runtime.RecognitionException;

import com.jogamp.opengl.util.FPSAnimator;

public class Container {
	
	
	 private static String TITLE = "JOGL 2.0 Setup (GLCanvas)";  // window's title
	   private static final int CANVAS_WIDTH = 640;  // width of the drawable
	   private static final int CANVAS_HEIGHT = 480; // height of the drawable
	   private static final int FPS = 60; // animator's target frames per second
	
	   
	   private static JFrame frame; //main frame
	  private static JDesktopPane desk; //desktop for panels
	  private static  JInternalFrame flatFrame; //panel for 2d rendering
	  private static JInternalFrame textFrame; //panel for textRendering
	  private static CodeField codeField; //textField for code entry
		    
	 
	   /** The entry main() method to setup the top-level container and animator */
	   public static void main(String[] args) {
	      // Run the GUI codes in the event-dispatching thread for thread safety
	      SwingUtilities.invokeLater(new Runnable() {
	         @Override
	         public void run() {
	            // Create the OpenGL rendering canvas
	            GLCanvas canvas = new JOGL2Setup_GLCanvas();
	            canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
	 
	            // Create a animator that drives canvas' display() at the specified FPS.
	            final FPSAnimator animator = new FPSAnimator(canvas, FPS, true);
	 
	            // Create the top-level container
	            frame = new JFrame(); // Swing's JFrame or AWT's Frame
	            
	           //create desktop
	            desk = new JDesktopPane();
	            
	            //create internal panes
	            flatFrame = new JInternalFrame("Design", true, true, true, true);
	            flatFrame.setBounds(0, 0, 512, 768);
	            flatFrame.add(canvas);
	            flatFrame.setVisible(true);
	            
	            textFrame = new JInternalFrame("Code", true, true, true, true);
	            textFrame.setBounds(512, 0, 512, 768);
	            //textFrame.add(canvas);
	            textFrame.setVisible(true);
	            
	            
	            //create CodeField (JTextPane)
	            codeField = new CodeField();
	            textFrame.add(codeField);
	             
	             desk.add(flatFrame);
	             desk.add(textFrame);
	  	      
	  	      	frame.add(desk);
	  	      	frame.setSize(1024,768);
	  	      	frame.setVisible(true);
	  	      
	            frame.addWindowListener(new WindowAdapter() {
	               @Override
	               public void windowClosing(WindowEvent e) {
	                  // Use a dedicate thread to run the stop() to ensure that the
	                  // animator stops before program exits.
	                  new Thread() {
	                     @Override
	                     public void run() {
	                        if (animator.isStarted()) animator.stop();
	                        System.exit(0);
	                     }
	                  }.start();
	               }
	            });
	            frame.setTitle(TITLE);
	            frame.pack();
	            frame.setVisible(true);
	            animator.start(); // start the animation loop
	         }
	      });
	   }
	 	
		
	   
	   
	   private void initTextField(){
		   
		   
		   
	   }
	

		  
		  
		  
		
	 /* public static void main(String argv[]) throws Exception {
		  
			initWindow();
		  
		  ANTLRStringStream input = new ANTLRStringStream("x=10\n 1+2*x \n");
			
			
		
			ExprLexer lexer = new ExprLexer(input);
			
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			
			ExprParser parser = new ExprParser(tokens);
			
			try {
				parser.prog();
			} catch (RecognitionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	  }
	  
	  public static void initWindow(){
		  
		  frame = new JFrame("Clothing Sim");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      desk = new JDesktopPane();
	      
	      
	      frame.add(desk);
	      frame.setSize(1024,768);
	      frame.setVisible(true);
 
	}*/
}
