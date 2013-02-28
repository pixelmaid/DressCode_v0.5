//inserted a different comment
package com.pixelmaid.dresscode.app;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
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
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;
import java.awt.event.ComponentListener;



import jsyntaxpane.DefaultSyntaxKit;


public class Window extends JFrame implements WindowListener,WindowFocusListener,
WindowStateListener, ComponentListener, ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static CodeField codeField; //textField for code entry 
	public static Embedded canvas;
	public static boolean RIGHT_TO_LEFT = false;
	public static JFileChooser	 fc;
	public static JButton openButton, saveButton, printButton, runButton, pathButton, targetButton;
	public static JMenuItem newAction, openAction,saveAction ,exitAction ,exportAction, importAction, copyAction ,pasteAction ,cutAction;
	public static final JTextPane output = new JTextPane();
	public static StyledDocument doc;
	public static File homeDir ;


	public Window(String title) {
		super(title);
	}
	
	
   public void createMenu() {
        
        //frame.setTitle("Menu Example");
        //frame.setSize(150, 150);
        
        // Creates a menubar for a JFrame
        JMenuBar menuBar = new JMenuBar();
        
        // Add the menubar to the frame
        this.setJMenuBar(menuBar);
        
        // Define and add two drop down menu to the menubar
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu exampleMenu = new JMenu("Examples");
        //TODO:setup example menu
        
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(exampleMenu);
        
        // Create and add simple menu item to one of the drop down menu
        newAction = new JMenuItem("New");
        openAction = new JMenuItem("Open");
        saveAction = new JMenuItem("Save");
        exitAction = new JMenuItem("Exit");
        exportAction = new JMenuItem("Export to PDF");
        importAction = new JMenuItem("Import SVG");
        copyAction = new JMenuItem("Copy");
        pasteAction = new JMenuItem("Paste");
        cutAction = new JMenuItem("Cut");
        
     
        fileMenu.add(newAction);
        fileMenu.add(openAction);
        fileMenu.add(saveAction);
        fileMenu.addSeparator();
        fileMenu.add(exportAction);
        fileMenu.add(importAction);
        fileMenu.addSeparator();
        fileMenu.add(exitAction);
        editMenu.add(cutAction);
        editMenu.add(copyAction);
        editMenu.add(pasteAction);
        
        
        //action listeners
        newAction.addActionListener(this);
        openAction.addActionListener(this);
        saveAction.addActionListener(this);
        exitAction.addActionListener(this);
        exportAction.addActionListener(this);
        importAction.addActionListener(this);

        copyAction.addActionListener(this);
        pasteAction.addActionListener(this);
        cutAction.addActionListener(this);
        
    }

	public void setupFileChooser(){
		fc = new JFileChooser();

		homeDir = new File("/Users/jenniferjacobs/Documents/MIT/HighLow_Tech/thesis/code/snowflake.dc"); 
		openButton = new JButton("Open");
		//  createImageIcon("images/Open16.gif"));

		openButton.addActionListener(this);

		saveButton = new JButton("Save");//,
		//createImageIcon("images/Save16.gif"));
		saveButton.addActionListener(this);

		printButton = new JButton("Export to PDF");//,
		//createImageIcon("images/Save16.gif"));
		printButton.addActionListener(this);

		runButton = new JButton("Run");//,
		//createImageIcon("images/Save16.gif"));
		runButton.addActionListener(this);

		pathButton = new JButton("Path");//,
		//createImageIcon("images/Save16.gif"));
		pathButton.addActionListener(this);

		targetButton = new JButton("target");//,
		//createImageIcon("images/Save16.gif"));
		targetButton.addActionListener(this);

	}


	public static void addComponentsToPane(Container pane) {

		
		
		//Comment out below lines to remove syntax highlighting
		DefaultSyntaxKit.initKit();
		// override default syntax values
		jsyntaxpane.util.Configuration config = DefaultSyntaxKit.getConfig(DefaultSyntaxKit.class);
		config.put("DefaultFont","monospaced 14");
		//end syntax highlighting


		if (!(pane.getLayout() instanceof BorderLayout)) {
			pane.add(new JLabel("Container doesn't use BorderLayout!"));
			return;
		}

		if (RIGHT_TO_LEFT) {
			pane.setComponentOrientation(
					java.awt.ComponentOrientation.RIGHT_TO_LEFT);
		}


		canvas = new Embedded();
		canvas.init();

		canvas.setPreferredSize(new Dimension(600,786));
		pane.add(canvas, BorderLayout.CENTER);
	
		

		JPanel code = new JPanel();
		code.setLayout(new BorderLayout());
		code.setPreferredSize(new Dimension(600,786));

		codeField= new CodeField();
		codeField.setPreferredSize(new Dimension(600,500));


		output.setPreferredSize(new Dimension(600,200));
		doc = output.getStyledDocument();





		JScrollPane scrPane1 = new JScrollPane(codeField);
		JScrollPane scrPane2 = new JScrollPane(output);


		output.setVisible(true);

		code.add(scrPane1, BorderLayout.CENTER);
		code.add(scrPane2, BorderLayout.PAGE_END);

		JPanel buttonPanel = new JPanel(); //use FlowLayout
		buttonPanel.add(runButton);
		buttonPanel.add(openButton);
		buttonPanel.add(saveButton);
		buttonPanel.add(printButton);
		buttonPanel.add(pathButton);
		buttonPanel.add(targetButton);

		//Add the buttons and the log to this panel.
		code.add(buttonPanel, BorderLayout.PAGE_START);
		pane.add(code, BorderLayout.LINE_END);
		pane.doLayout();
		codeField.setContentType("text/java");
		codeField.setText("");
		//output.setContentType("text/java");
		// output.setText("hello world");
	}

	public void createAndShowGUI() {

		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//setup file chooser and buttons
		setupFileChooser();
		//Set up the content pane.
		addComponentsToPane(this.getContentPane());
		createMenu();
		//Display the window.
		this.pack();
		this.setVisible(true);
		this.addWindowListener(this);
		this.addComponentListener(this);

		
	}
	

	//closes down the app
	private void exit(){
		System.exit(getDefaultCloseOperation());
	}

	//inits a new file
	private void newFile(){
		codeField.clear();
		codeField.updateCanvas();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		//Handle open button action.
		if (e.getSource() == openButton || e.getSource() == openAction ) {

			int returnVal = fc.showOpenDialog(this);

			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				String filetxt= readFile(file);
				codeField.loadFile(filetxt);
				//log.append("Opening: " + file.getName() + "." + newline);
			} 

			//Handle save button action.
		} else if (e.getSource() == saveButton || e.getSource() == saveAction ) {
			int returnVal = fc.showSaveDialog(this);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				writeFile(codeField.getText(),file);
			} 
		}
		else if (e.getSource() == runButton ) {
			codeField.updateCanvas();

		}

		else if (e.getSource() == printButton || e.getSource() == exportAction ) {
			int returnVal = fc.showDialog(this, "Export");
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				canvas.print(file);
			}
			
		}
		
		else if (e.getSource() == pathButton || e.getSource() == importAction ) {
			int returnVal = fc.showDialog(this, "Select");
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				try {
					codeField.insertPath(file);
				} catch (BadLocationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		}
		else if (e.getSource() == exitAction) {
			exit();
			
		}
		
		else if (e.getSource() == newAction) {
			newFile();
			
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
				//System.out.println(sCurrentLine);
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
	public void windowStateChanged(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowGainedFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowLostFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void componentHidden(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void componentMoved(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void componentResized(ComponentEvent arg0) {
		System.out.println("component is resized");
		codeField.updateCanvas();
		
	}


	@Override
	public void componentShown(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	

	
}
