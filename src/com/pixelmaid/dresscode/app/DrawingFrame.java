package com.pixelmaid.dresscode.app;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.ScrollPane;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import com.pixelmaid.dresscode.app.ui.Toolbar;

public class DrawingFrame extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Embedded canvas;
	private Dimension masterDimension;
	private JPanel sketchPanel; //holds JInternalFrame
	private JInternalFrame sketch; //holds the actual sketch
	private ScrollPane sketchScroll; //scrollpane to hold sketch
	private Toolbar toolbar;
	public DrawingFrame(){
		
	}
	
	
	
	/*public void init(int width, int height, Embedded c, Toolbar t){
		//pane.remove(sketchScrollpane);
int sketchw= 800;
int sketchh= 1000;
int max_w = 600; // max width to create window
 int max_h =600; // max height to create window
Dimension dimension = new Dimension(sketchw, sketchh); //will act as size of sketch

		 JPanel sketchPanel = new JPanel(true); //holds JInternalFrame
		 JInternalFrame sketch = new JInternalFrame(); //holds the actual sketch

		 //sketchPanel size is the larger of either sketchWindow or canvas
	     sketchPanel.setLayout(new BoxLayout(sketchPanel, BoxLayout.PAGE_AXIS)); //centers sketch - optional


	     int width1, height1;
	        if (sketchw <= max_w)
	            width1 = sketchw;
	        else
	            width1 = max_w;
	        if (sketchh <= max_h)
	            height1 = sketchh;
	        else
	            height1 = max_h;

	     canvas = new Embedded(); //Canvas is just a sketch which extends PApplet
	     canvas.setSize(dimension);
	     canvas.setMaximumSize(dimension);


	     BasicInternalFrameUI ui = (BasicInternalFrameUI)sketch.getUI();
        sketch.putClientProperty("titlePane", ui.getNorthPane());
        sketch.putClientProperty("border", sketch.getBorder());
        ui.setNorthPane(null);
        sketch.setBorder(null);
        
        //just basic options to keep the sketch the right size
        sketch.add(canvas); //adds canvas to JInternalFrame
        sketch.setSize(sketchw, sketchh);
           sketch.setPreferredSize(dimension);
           sketch.setMaximumSize(dimension);
           sketch.setResizable(false);
           sketch.setVisible(true);
           sketch.pack();
           
           
           //centers the JInternalFrame using the BoxLayout
           sketchPanel.add(Box.createVerticalGlue());
           sketchPanel.add(Box.createHorizontalGlue());
           sketchPanel.add(sketch); //adds JInternalFrame to JPanel
           sketchPanel.add(Box.createHorizontalGlue());
           sketchPanel.add(Box.createVerticalGlue());

          // uses ScrollPane instead of JScrollPane to circumvent rendering issues
         // sketchScrollpane = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS); //follows Adobe's lead
          this.add(sketchPanel); //adds JPanel to ScrollPane
         
      // 	pane.add(sketchScrollpane);
         //canvas.init();
	}*/

	 public void init(int width, int height, Embedded c, Toolbar t){
			masterDimension = new Dimension(width,height); //will act as size of sketch
			//this.setPreferredSize(masterDimension);
	 		//this.setMaximumSize(masterDimension);
	 		//this.setSize(masterDimension);
			this.setLayout(new BorderLayout());
			sketchPanel = new JPanel(true); 
			sketch = new JInternalFrame(); //holds the actual sketch
			canvas = c;
			
			toolbar = t;
			 //sketchPanel size is the larger of either sketchWindow or canvas
		     sketchPanel.setLayout(new BoxLayout(sketchPanel, BoxLayout.PAGE_AXIS)); //centers sketch - optional

		     
		     BasicInternalFrameUI ui = (BasicInternalFrameUI)sketch.getUI();
		     sketch.putClientProperty("titlePane", ui.getNorthPane());
	         sketch.putClientProperty("border", sketch.getBorder());
	         ui.setNorthPane(null);
	         sketch.setBorder(null);
	       
	       //just basic options to keep the sketch the right size
	        sketch.add(canvas); //adds canvas to JInternalFrame
	        sketch.setSize(canvas.getWidth(),canvas.getHeight());
	        sketch.setPreferredSize(new Dimension(canvas.getWidth(),canvas.getHeight()));
	         sketch.setResizable(false);
	          sketch.setVisible(true);
	         sketch.pack();
	          
	          
	          //centers the JInternalFrame using the BoxLayout
	          sketchPanel.add(Box.createVerticalGlue());
	          sketchPanel.add(Box.createHorizontalGlue());
	          sketchPanel.add(sketch); //adds JInternalFrame to JPanel
	          sketchPanel.add(Box.createHorizontalGlue());
	          sketchPanel.add(Box.createVerticalGlue());

	         // uses ScrollPane instead of JScrollPane to circumvent rendering issues
	        sketchScroll = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
	       
	        sketchScroll.add(sketchPanel); //adds JPanel to ScrollPane
	       
	        //canvas.init();
	    	this.add(t, BorderLayout.PAGE_START);
	        this.add(sketchScroll, BorderLayout.CENTER); 
	       //Add the toolbar and the log to this panel.
	 	
	 		this.doLayout();
	 		
	      
	 	
	     }


	public void resetSize(Embedded c) {
		sketch.remove(canvas);
		canvas = c;
		 sketch.add(canvas); //adds canvas to JInternalFrame
	        sketch.setSize(canvas.getWidth(),canvas.getHeight());
	        sketch.setPreferredSize(new Dimension(canvas.getWidth(),canvas.getHeight()));
	         sketch.setResizable(false);
	          sketch.setVisible(true);
	         sketch.pack();
	         
	         //centers the JInternalFrame using the BoxLayout
	          sketchPanel.add(Box.createVerticalGlue());
	          sketchPanel.add(Box.createHorizontalGlue());
	          sketchPanel.add(sketch); //adds JInternalFrame to JPanel
	          sketchPanel.add(Box.createHorizontalGlue());
	          sketchPanel.add(Box.createVerticalGlue());

	}
	 
	 
	



}
