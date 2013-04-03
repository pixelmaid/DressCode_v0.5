package com.pixelmaid.dresscode.data;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;

import org.antlr.gunit.gUnitParser.file_return;

import com.pixelmaid.dresscode.app.CodeField;
import com.pixelmaid.dresscode.app.CodingFrame;
import com.pixelmaid.dresscode.app.Embedded;

public class DCProject {
	private int width, height; // default width and height of project
	private static int METRIC = 0;
	private static int STANDARD = 1;
	private int units; //units
	private static double PIX_IN_MM = 0.35278; //conversion from pixels to mm
	private static double PIX_IN_INCH = 0.013888; //conversion from pixels to inches
	private String code = "";
	private String path;
	private String name = "untitled";
	private String extension = ".dc";
	private String params = "params.txt";
	private String data = "data";
	public static JFileChooser	 fc;
	public boolean saved = false;
	private int template = 0;
	protected boolean hasHiddenCode= false;

	public DCProject(int w, int h){
		fc = new JFileChooser();
		this.width=w;
		this.height=h;
		this.units = STANDARD;
		
	}
	public void setDimensions(int w, int h, int u,Embedded canvas, InstructionManager im){
		this.width=w;
		this.height=h;
		this.units = u;
		canvas.setDrawingBoardDimensions(width, height);
		im.setDimensionParams(width, height);
	}
	
	
	public boolean hiddenCode(){
		return hasHiddenCode;
	}
	
	public int getWidth(){
		return this.width;
	}
	
	public int getHeight(){
		return this.height;
	}
	public void setCode(String c){
		this.code = c;
	}
	public String getCode(){
		return this.code;
	}
	
	public void run(String code, InstructionManager instructionManager){
		setCode(code);

		instructionManager.parseText(getCode());
	}
	
	public void run(String code, String hc, InstructionManager instructionManager){
		setCode(hc+"\n"+code);
		instructionManager.parseText(getCode());
	}
	
	
	public void openFile(Component component, CodingFrame cf, Embedded canvas, InstructionManager im){
		int returnVal = fc.showOpenDialog(component);

		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			String filetxt= readFile(file);
			setCode(filetxt);

			this.name =file.getName();
			this.path= file.getAbsolutePath();
			this.path = this.path.substring(0,path.length()-name.length());
			String paramFile = path+"/"+data+"/"+params;
			System.out.println(paramFile);
			this.name= this.name.substring(0,name.length()-extension.length());

			double [] vars = convertParams(paramFile);

			width = ((Double)(vars[0])).intValue();
			height = ((Double)(vars[1])).intValue();
			units = ((Double)(vars[2])).intValue();
			template =((Double)(vars[3])).intValue();
			cf.setCode(name,getCode());
			canvas.setDrawingBoardDimensions(width, height);
			im.setDimensionParams(width, height);
			
			if(vars[4]==1){
				hasHiddenCode=true;
				
				String hiddenCodePath = path+"/"+data+"/"+name+"_hidden.dc";
				String hiddenFiletxt= readFile(new File(hiddenCodePath));
				setCode(hiddenFiletxt+"\n"+filetxt);
				cf.showHiddenTab(name+"_hidden", hiddenFiletxt);
				
			}
			else{
				hasHiddenCode=false;
			}
		} 

	}
	
	public void saveFile(Component component,String code,CodingFrame cf){
		setCode(code);
		if(!saved){
			int returnVal = fc.showSaveDialog(component);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				
				this.name =file.getName();
				this.path= file.getAbsolutePath();
				this.path = this.path.substring(0,path.length()-name.length());
				File fileDir = new File(path+name);
				System.out.println(fileDir.mkdirs());
				File dataDir = new File(path+name+"/"+"data");
				System.out.println(dataDir.mkdirs());
				File fileNew = new File(path+name+"/"+name+extension);
				
				System.out.println(path+name+"/"+name+extension);
				writeFile(getCode(),fileNew);
				
				File paramFile = new File(path+name+"/"+data+"/"+params);
				double [] vars = new double[10];
				
				vars[0]= width;
				vars[1]= height; // default width and height of project
				vars[2]=  units; //units
				vars[3] = template;
				if(hasHiddenCode){
					vars[4]=1;
					cf.setTabTitle(1,name+"_hidden");
				}
				else{
					vars[4]=0;
					
				}
				
				writeFile(vars,paramFile);
				this.saved=true;
				cf.setTabTitle(0, name);
				
			} 
		
		}
		else{
			File f = new File(path+name+extension);
			System.out.println("saved file");
			writeFile(getCode(),f);
		}
	}
		
	
	
	public void printFile(Component component, Embedded canvas){
		
		int returnVal = fc.showDialog(component, "Export");
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			canvas.print(file);
		}
	}
	
	public String readFile(File file) {

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
	
	public double[] convertParams(String filePath){
		double[] vars = new double[100];
		try{
		BufferedReader in = new BufferedReader(new FileReader(filePath));
		String line;
		int count = 0;
		
			while((line = in.readLine()) != null)
			{
				//System.out.println(line);
				vars[count] = Double.parseDouble(line); 
				//System.out.println(vars[count]);
				count ++;
			}
		
		
		}
		catch(IOException e){
			System.out.println("could not read file");
		}
		
		return vars;
	}

	public void writeFile(double[] vars, File file){
		
		String varString = "";
			for(int i=0;i<vars.length;i++){
				varString = varString+Double.toString(vars[i])+"\n";
			}
			System.out.println(varString);
			writeFile(varString, file);
			
		
	}


	public void writeFile(String content, File file) {
		try {


			// if file doesnt exist, then create it
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
	
	
	
}
