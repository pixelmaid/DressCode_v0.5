package com.pixelmaid.dresscode.app;

import java.awt.*;
import javax.swing.*;

public class Test extends JFrame
{
  public Test()
  {
    super();

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500, 200);

    onInit();

    setVisible(true);
  }
  private void onInit()
  {
    JLayeredPane lp = getLayeredPane();

    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout());
    panel.add(new JTextArea(), BorderLayout.CENTER);
    panel.add(new JButton("Submit"), BorderLayout.SOUTH);
    panel.setSize(300, 150); // Size is needed here, as there is no layout in lp

    JPanel glass = new JPanel();
    glass.setOpaque(true); // Set to true to see it
    glass.setBackground( new Color(255, 0, 0, 30) );
    glass.setSize(150, 150);
  
    
    JPanel glass2 = new JPanel();
    glass2.setOpaque(false); // Set to true to see it
    

    JSplitPane splitFrame = new JSplitPane();
    splitFrame.setOpaque(false);
	splitFrame.setOrientation(JSplitPane.VERTICAL_SPLIT );
	splitFrame.setDividerLocation(150); 
	splitFrame.setTopComponent(glass2);
	splitFrame.setBottomComponent(glass);
	//splitFrame.setBorder(null);
	splitFrame.setDividerSize(5);
	splitFrame.setSize(300,150);
	
    
    lp.add(panel, Integer.valueOf(1));
    lp.add(splitFrame, Integer.valueOf(2));
  }

  public static void main(String args[])
  {
    // Schedule a job for the event-dispatching thread:
    // creating and showing this application's GUI.
    javax.swing.SwingUtilities.invokeLater(new Runnable()
    {
      public void run()
      {
        new Test();
      }
    });
  }
}