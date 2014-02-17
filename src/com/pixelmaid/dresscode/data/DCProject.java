package com.pixelmaid.dresscode.data;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;

import javax.swing.JFileChooser;
import javax.swing.text.BadLocationException;

import org.antlr.gunit.gUnitParser.file_return;

import com.pixelmaid.dresscode.app.CodeField;
import com.pixelmaid.dresscode.app.CodingFrame;
import com.pixelmaid.dresscode.app.Canvas;
import com.pixelmaid.dresscode.data.templates.TemplateManager;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.math.UnitManager;

public class DCProject {
	private double width, height, unitWidth, unitHeight; // default width and height of project
	private int units; //units
	
	private String code = "";
	private String path="";
	private String name = "untitled";
	private String extension = ".dc";
	private String params = "params.txt";
	private String data = "data";
	public static JFileChooser	 fc;
	public boolean saved = false;
	private int template = 0;
	private int inc=0;
	protected boolean hasHiddenCode= false;

	public DCProject(){
		fc = new JFileChooser();
		
		this.unitHeight= 6.94;
		this.unitWidth = 6.94;
		this.units = UnitManager.STANDARD;

	}
	public void setDimensions(double w, double h, int u,Canvas canvas, InstructionManager im){
		this.units = u;
		this.width= UnitManager.toPixels(w, units);
		this.height= UnitManager.toPixels(h, units);

		this.unitWidth = w;
		this.unitHeight = h;
		canvas.setDrawingBoardDimensions(width, height, this.getUnits());
		im.setDimensionParams(width, height,getUnits());
	}


	public boolean hiddenCode(){
		return hasHiddenCode;
	}

	public double getWidth(){
		return this.width;
	}

	public double getHeight(){
		return this.height;
	}
	public double getUnitHeight(){

		return this.unitHeight;
	}


	public double getUnitWidth(){

		return this.unitWidth;
	}

	public void setCode(String c){
		this.code = c;
	}
	public String getCode(){
		return this.code;
	}

	public void run(String code, LinkedHashMap<String, Stamp> stampMap, InstructionManager instructionManager){
		String stampCode ="";
		String parseCode = "";
		for (String key : stampMap.keySet())
		{
		  
		    Stamp s= stampMap.get(key);
		    stampCode +="\n"+s.getFunctionDef();
		}
		
		
		parseCode = code+"\n"+stampCode;

		instructionManager.parseText(parseCode,this.getUnits());
		
		
	}

	public void run(String code, String hc, InstructionManager instructionManager){
		String parseCode = hc+"\n"+code;
		instructionManager.parseText(parseCode,this.getUnits());
	}


	public void newFile(CodingFrame cf, CodeField codeField, Canvas canvas, DrawableManager dm, InstructionManager im){
		
		cf.hideHiddenTab();
		codeField.clear();
		this.name="untitled_"+inc;
		inc++;
		dm.clearAllDrawables();
		canvas.clear();
		saved= false;
		setDimensions(this.getUnitWidth(),this.getUnitHeight(), units, canvas, im);
	}


	public LinkedHashMap<String, Stamp> openFile(File file, Component component, CodingFrame cf, Canvas canvas, InstructionManager im){
		int returnVal = JFileChooser.CANCEL_OPTION;
		LinkedHashMap<String, Stamp> stamps = null;
		
		if(file ==null){
			returnVal = fc.showOpenDialog(component);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				file = fc.getSelectedFile();
			}
		}
		
		if( file!=null){
			String filetxt= readFile(file);
			setCode(filetxt);

			this.name =file.getName();
			this.path= file.getAbsolutePath();
			this.path = this.path.substring(0,path.length()-name.length());
			String paramFile = path+"/"+data+"/"+params;
			System.out.println(paramFile);
			this.name= this.name.substring(0,name.length()-extension.length());

			double [] vars = convertParams(paramFile);
			units = ((Double)(vars[2])).intValue();

			double w = ((Double)(vars[0]));
			double h = ((Double)(vars[1]));
			

			setDimensions(w, h, units,canvas,  im);

			template =((Double)(vars[3])).intValue();
			cf.setCode(name,getCode());
			canvas.setDrawingBoardDimensions(width, height,getUnits());
			im.setDimensionParams(width, height,getUnits());

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
			
			String stampFile = path+"/"+"stamps";
			File templateFolder = new File(path+"/"+"template");
			if(templateFolder.isDirectory()){
				File[] tfiles = templateFolder.listFiles();
				File templateFile = tfiles[0];
				TemplateManager.setTemplateCode(readFile(templateFile));
				TemplateManager.setName(templateFile.getName());
			}
			
			stamps  = convertStamps(stampFile);
			
			this.saved=false;
			return stamps;
		} 
		return null;

	}

	public void saveFile(Component component,String code,LinkedHashMap<String, Stamp> stampMap, CodingFrame cf, String templateCode){
		setCode(code);
		if (templateCode.trim().length() > 0){
			template=1;
		}
		if(!saved){
			if(this.path!=""){
			fc.changeToParentDirectory();
			}

			File blank = new File(this.name);
			fc.setSelectedFile(blank);
			
			int returnVal = fc.showSaveDialog(component);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();

				saveToFile(file,cf,stampMap, templateCode);
			} 

		}
		else{
			File file = new File(path+name);
			saveToFile(file,cf,stampMap,templateCode);
		}
		
	}

	private void saveToFile(File file, CodingFrame cf,LinkedHashMap<String, Stamp> stampMap, String templateCode){
		this.name =file.getName();
		this.path= file.getAbsolutePath();
		this.path = this.path.substring(0,path.length()-name.length());
		File fileDir = new File(path+name);
		System.out.println(fileDir.mkdirs());
		File dataDir = new File(path+name+"/"+"data");
		File stampDir = new File(path+name+"/"+"stamps");
		stampDir.mkdirs();
		File templateDir = new File(path+name+"/"+"template");
		templateDir.mkdirs();
		System.out.println(dataDir.mkdirs());
		File fileNew = new File(path+name+"/"+name+extension);

		System.out.println(path+name+"/"+name+extension);
		writeFile(getCode(),fileNew);
		if(template!=0){
			File templateFile = new File(path+name+"/"+"template"+"/"+TemplateManager.getName()+extension);
			writeFile(templateCode,templateFile);
		}
		else{
			File templateFile = new File(path+name+"/"+"template"+"/"+TemplateManager.getName()+extension);
			templateFile.delete();
		}
		File paramFile = new File(path+name+"/"+data+"/"+params);
		double [] vars = new double[10];

		vars[0]= getUnitWidth();
		vars[1]= getUnitHeight(); // default width and height of project
		vars[2]=  units; //units
		vars[3] = template;
		if(hasHiddenCode){
			vars[4]=1;
			cf.setTabTitle(1,name+"_hidden");
			File hiddenFile = new File(path+name+"/"+data+"/"+name+"_hidden"+extension);
			writeFile(cf.hiddenCodeField.getCode(),hiddenFile);
		}
		else{
			vars[4]=0;

		}
		

		writeFile(vars,paramFile);
		
		for (String key : stampMap.keySet())
		{
		  
		    Stamp s= stampMap.get(key);
		    String stampName = key;
		    String stampCode =s.getFunctionDef();
		    File stampFile = new File(path+name+"/"+"stamps"+"/"+stampName+extension);
		    writeFile(stampCode,stampFile);
		}
		
		this.saved=true;
		cf.setTabTitle(0, name);

	}

	
	public void printFile(Component component, Canvas canvas){
		File blank = new File(this.name);
		fc.setSelectedFile(blank);
		int returnVal = fc.showDialog(component, "Export");
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			canvas.print(file);
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
	
	public LinkedHashMap<String, Stamp> convertStamps(String filePath){
		LinkedHashMap<String, Stamp> stamps = new LinkedHashMap<String, Stamp>();
		
			File stampFolder = new File(filePath);
			if(stampFolder.isDirectory()){
			File[] files = stampFolder.listFiles();
			for (File file : files) {
				String filetxt= readFile(file);
				String name = file.getName().substring(0, file.getName().length()-3);
				System.out.println("name="+name+"\n"+"file="+filetxt);
				Stamp stamp = new Stamp();
				stamp.setFunctionDef(filetxt);
				stamp.setFunctionCall(name);
				stamps.put(name, stamp);
			}
		}
				

		
	
		return stamps;
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
	public int getUnits() {
		return this.units;
	}
	
	public String getName() {
		return this.name;
	}
	public void setSaved(boolean b) {
		saved = b;
		
	}
	public void importFile(Component component, CodeField codeField) {
		int returnVal = fc.showDialog(component, "Select");
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			try {
				codeField.insertPath(file);
			} catch (BadLocationException e1) {
				
				e1.printStackTrace();
			}
		}

		
	}




}
