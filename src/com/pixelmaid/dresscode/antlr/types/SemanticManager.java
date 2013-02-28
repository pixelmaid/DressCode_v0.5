package com.pixelmaid.dresscode.antlr.types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.tree.CommonTree;

import com.pixelmaid.dresscode.app.Window;

public class SemanticManager { //data object to store variable declarations

    public static Map<String, FunctionType> functions = new HashMap<String, FunctionType>(); //set for storing top level functions
    public static Map<String, VarType> variables = null; //set for storing global variables
    
    public static Scope currentScope = null; 
    
	public final static int INTNUM = 0;
	public final static int FLOATNUM = 1;
	public final static int STRINGNUM = 2;
	public final static int BOOLNUM = 3;
	public final static int ARRAYNUM = 4;

	
	//function methods
	//function definition
	public static boolean defineFunction(String id, Object idList, Object block){
		boolean set = false;
		 // `idList` is possibly null!  Create an empty tree in that case.  
	    CommonTree idListTree = idList == null ? new CommonTree() : (CommonTree)idList; 
	 
	    // `block` is never null 
	    CommonTree blockTree = (CommonTree)block; 
	 
	    // The function name with the number of parameters after it, is the unique key 
	    String key = id + idListTree.getChildCount(); 
	    functions.put(key, new FunctionType(id, idListTree, blockTree)); 
		return set;
		
	}
	
	//Hash Set get methods
	
	//variable set method
	
	public static boolean setPrimVar(String id, Object val){
		boolean set = false;
		if(!variables.containsKey(id)){
			Window.output.setText("variable " +id+" not yet defined");

			System.err.println("variable not yet defined at line");
		}
		else{
		/*VarType var = variables.get(id);
			int prevType = var.type;
			String prevVal = var.val;
			var.type=val.getType();
			var.val=val.getResult().toString();
			//System.out.println("set variable "+ id +" of type "+ prevType+ " =" + prevVal+" to " + val.getResult()+" of type " + var.type);*/
			
		
			set = true;
		}
		
		return set;
	}
	
	//variable access method
	/*public static PrimObject getPrimVar(String id){
		PrimObject pf;
		if(variables.containsKey(id)){
		
		VarType v = variables.get(id);
		
		switch (v.type){
			case INTNUM:
				 pf= SemanticManager.parseInt(v.val);
			break;
			case FLOATNUM:
				pf=SemanticManager.parseFloat(v.val);
			break;
			case STRINGNUM:
				pf=SemanticManager.parseString(v.val);
			break;
			case BOOLNUM:
				pf=SemanticManager.parseBool(v.val);
				break;
			default:
				 pf = null;
				System.err.println("unable to resolve variable to a primitive at line ");
		}
		return pf;
		}
		else{
			System.err.println("variable at line does not exist");
		}
		return null;
	
		
	}
	
	//variable declaration method
	public static boolean declarePrimVar(int type, String id, PrimObject val){
		boolean set = false;
		if(variables.containsKey(id)){
			System.err.println("duplicate variable identifier at line");
		}
		else{
			VarType var = new VarType();
			var.ident=id;
			var.type=type;
			
			if(val!=null){
				System.out.println("declaring variable "+ id +" of type "+ type+ " = " + val.getResult());
				var.val=val.getResult().toString();
			}
			else{
				System.out.println("declaring variable "+ id +" of type "+ type+ " not yet defined");
	
			}
			set = true;
			variables.put(id, var);
		}
		return set;
	}
	*/
	
	//function for handling negation
	public static PrimObject negation(PrimObject p){
		switch(p.getType()){
		case 0:
			p.setResult(-((Integer)(p.getResult())));
			break;
		
		case 1:
			p.setResult(-((Float)(p.getResult())));
			break;
		
		
		default:
			Window.output.setText("incompatable negation");
			System.err.println("incompatable negation at line ");
			
		}
		return p;
	
	}
	//function for handling ++
	public static PrimObject postIncrement(PrimObject p){
		switch(p.getType()){
		case 0:
			p.setResult(1+((Integer)(p.getResult())));
			break;
		
		case 1:
			p.setResult(1.0+((Float)(p.getResult())));
			break;
		
		
		default:
			Window.output.setText("incompatable post increment");
			System.err.println("incompatable post increment at line ");
			
		}
		return p;
	
		
	}
	
	//function for handling --
	public static PrimObject postDecrement(PrimObject p){
		switch(p.getType()){
		case INTNUM:
			p.setResult(((Integer)(p.getResult()))-1);
			break;
		
		case FLOATNUM:
			p.setResult(((Float)(p.getResult()))-1.0);
			break;
		
		
		default:
			Window.output.setText("incompatable post decrement");

			System.err.println("incompatable post decrement at line ");
			
		}
		return p;
		
	}
	
	//function for handling *
	public static PrimObject multiplication(PrimObject p1,PrimObject p2 ){
		
		PrimObject pf = new PrimObject();
		switch(p1.getType()){
		case INTNUM:
			switch(p2.getType()){
				case INTNUM:
					pf.setResult((Integer)(p1.getResult())*(Integer)(p2.getResult()));
					pf.setType(INTNUM);
				break;
				case FLOATNUM:
					pf.setResult((Integer)(p1.getResult())*(Float)(p2.getResult()));	
					pf.setType(FLOATNUM);
				break;
				default:
					Window.output.setText("incompatable multiplication expression");

					System.err.println("incompatable multiplication expression at line ");
				break;
			}
			break;
		
		case FLOATNUM:
			switch(p2.getType()){
				case INTNUM:
					pf.setResult((Float)(p1.getResult())*(Integer)(p2.getResult()));
					pf.setType(FLOATNUM);
				break;
				case FLOATNUM:
					pf.setResult((Float)(p1.getResult())*(Float)(p2.getResult()));
					pf.setType(FLOATNUM);
				break;
				default:
					Window.output.setText("incompatable multiplication expression");
					System.err.println("incompatable multiplication expression at line ");
				break;
			}
			break;
		
		default:
			Window.output.setText("incompatable multiplication expression");
			System.err.println("incompatable multiplication expression at line ");
			
		}
		return pf;
		
	}
	//function for handling division
public static PrimObject division(PrimObject p1,PrimObject p2 ){
		
		PrimObject pf = new PrimObject();
		switch(p1.getType()){
		case INTNUM:
			switch(p2.getType()){
				case INTNUM:
					pf.setResult((Integer)(p1.getResult())/(Integer)(p2.getResult()));
					pf.setType(INTNUM);
				break;
				case FLOATNUM:
					pf.setResult((Integer)(p1.getResult())/(Float)(p2.getResult()));	
					pf.setType(FLOATNUM);
				break;
				default:
					Window.output.setText("incompatable division expression");
					System.err.println("incompatable division expression at line ");
				break;
			}
			break;
		
		case FLOATNUM:
			switch(p2.getType()){
				case INTNUM:
					pf.setResult((Float)(p1.getResult())/(Integer)(p2.getResult()));
					pf.setType(FLOATNUM);
				break;
				case FLOATNUM:
					pf.setResult((Float)(p1.getResult())/(Float)(p2.getResult()));
					pf.setType(FLOATNUM);
				break;
				default:
					Window.output.setText("incompatable division expression");
					System.err.println("incompatable division expression at line ");
				break;
			}
			break;
		
		default:
			Window.output.setText("incompatable division expression");
			System.err.println("incompatable division expression at line ");
			
		}
		return pf;
		
	}

//function for handling modulo
public static PrimObject modulo(PrimObject p1,PrimObject p2 ){
	
	PrimObject pf = new PrimObject();
	switch(p1.getType()){
	case INTNUM:
		switch(p2.getType()){
			case INTNUM:
				pf.setResult((Integer)(p1.getResult())%(Integer)(p2.getResult()));
				pf.setType(INTNUM);
			break;
			case FLOATNUM:
				pf.setResult((Integer)(p1.getResult())%(Float)(p2.getResult()));	
				pf.setType(INTNUM);
			break;
			default:
				Window.output.setText("incompatable modulo expression");
				System.err.println("incompatable modulo expression at line ");
			break;
		}
		break;
	
	case FLOATNUM:
		switch(p2.getType()){
			case INTNUM:
				pf.setResult((Float)(p1.getResult())%(Integer)(p2.getResult()));
				pf.setType(INTNUM);
			break;
			case FLOATNUM:
				pf.setResult((Float)(p1.getResult())%(Float)(p2.getResult()));
				pf.setType(INTNUM);
			break;
			default:
				Window.output.setText("incompatable modulo expression");

				System.err.println("incompatable modulo expression at line ");
			break;
		}
		break;
	
	default:
		Window.output.setText("incompatable modulo expression");

		System.err.println("incompatable modulo expression at line ");
		
	}
	return pf;
	
}


//function for handling addition
public static PrimObject addition(PrimObject p1,PrimObject p2 ){
	
	PrimObject pf = new PrimObject();
	switch(p1.getType()){
	case INTNUM:
		switch(p2.getType()){
			case INTNUM:
				pf.setResult((Integer)(p1.getResult())+(Integer)(p2.getResult()));
				pf.setType(INTNUM);
			break;
			case FLOATNUM:
				pf.setResult((Integer)(p1.getResult())+(Float)(p2.getResult()));	
				pf.setType(FLOATNUM);
			break;
			default:
				Window.output.setText("incompatable addition expression");

				System.err.println("incompatable addition expression at line ");
			break;
		}
		break;
	
	case FLOATNUM:
		switch(p2.getType()){
			case INTNUM:
				pf.setResult((Float)(p1.getResult())+(Integer)(p2.getResult()));
				pf.setType(FLOATNUM);
			break;
			case FLOATNUM:
				pf.setResult((Float)(p1.getResult())+(Float)(p2.getResult()));
				pf.setType(FLOATNUM);
			break;
			default:
				Window.output.setText("incompatable addition expression");

				System.err.println("incompatable addition expression at line ");
			break;
		}
		break;
	
	default:
		Window.output.setText("incompatable addition expression");

		System.err.println("incompatable addition expression at line ");
		
	}
	return pf;
	
}

//function for handling subtraction
public static PrimObject subtraction(PrimObject p1,PrimObject p2 ){
	
	PrimObject pf = new PrimObject();
	switch(p1.getType()){
	case INTNUM:
		switch(p2.getType()){
			case INTNUM:
				pf.setResult((Integer)(p1.getResult())-(Integer)(p2.getResult()));
				pf.setType(INTNUM);
			break;
			case FLOATNUM:
				pf.setResult((Integer)(p1.getResult())-(Float)(p2.getResult()));	
				pf.setType(FLOATNUM);
			break;
			default:
				Window.output.setText("incompatable subtraction expression");

				System.err.println("incompatable subtraction expression at line ");
			break;
		}
		break;
	
	case FLOATNUM:
		switch(p2.getType()){
			case INTNUM:
				pf.setResult((Float)(p1.getResult())-(Integer)(p2.getResult()));
				pf.setType(FLOATNUM);
			break;
			case FLOATNUM:
				pf.setResult((Float)(p1.getResult())-(Float)(p2.getResult()));
				pf.setType(FLOATNUM);
			break;
			default:
				Window.output.setText("incompatable subtraction expression");

				System.err.println("incompatable subtraction expression at line ");
			break;
		}
		break;
	
	default:
		Window.output.setText("incompatable subtraction expression");

		System.err.println("incompatable subtraction expression at line ");
		
	}
	return pf;
	
}

//function for handling equality relation
public static PrimObject equality(PrimObject p1,PrimObject p2 ){
	
	PrimObject pf = new PrimObject();
	switch(p1.getType()){
	case INTNUM:
		switch(p2.getType()){
			case INTNUM:
				pf.setResult((Integer)(p1.getResult())==(Integer)(p2.getResult()));
				pf.setType(BOOLNUM);
			break;
			case FLOATNUM:
				pf.setResult(((Integer)(p1.getResult())).floatValue()==((Float)(p2.getResult())).floatValue());	
				pf.setType(BOOLNUM);
			break;
			default:
				Window.output.setText("incompatable equality relation");

				System.err.println("incompatable equality relation expression at line ");
			break;
		}
		break;
	
	case FLOATNUM:
		switch(p2.getType()){
			case INTNUM:
				pf.setResult(((Float)(p1.getResult())).floatValue()==((Integer)(p2.getResult())).floatValue());	
				pf.setType(BOOLNUM);
			break;
			case FLOATNUM:
				pf.setResult(((Float)(p1.getResult())).floatValue()==((Float)(p2.getResult())).floatValue());
				pf.setType(BOOLNUM);
			break;
			default:
				Window.output.setText("incompatable equality relation");

				System.err.println("incompatable equality relation expression at line ");
			break;
		}
		break;
	case BOOLNUM:
		switch(p2.getType()){
			case BOOLNUM:
				pf.setResult((Boolean)(p1.getResult())==(Boolean)(p2.getResult()));	
				pf.setType(BOOLNUM);
			break;
			default:
				Window.output.setText("incompatable equality relation");

				System.err.println("incompatable equality relation expression at line ");
			break;
		}
		break;
	
	case STRINGNUM:
			switch(p2.getType()){
				case STRINGNUM:
					pf.setResult((String)(p1.getResult())==(String)(p2.getResult()));	
					pf.setType(BOOLNUM);
				break;
				default:
					Window.output.setText("incompatable equality relation");

					System.err.println("incompatable equality relation expression at line ");
				break;
			}
			break;	
		
	default:
		Window.output.setText("incompatable equality relation");

		System.err.println("incompatable equality relation expression at line ");
		
	}
	return pf;
	
}

//function for handling non equality relation
public static PrimObject nonEquality(PrimObject p1,PrimObject p2 ){
	
	PrimObject pf = new PrimObject();
	switch(p1.getType()){
	case INTNUM:
		switch(p2.getType()){
			case INTNUM:
				pf.setResult((Integer)(p1.getResult())!=(Integer)(p2.getResult()));
				pf.setType(BOOLNUM);
			break;
			case FLOATNUM:
				pf.setResult(((Integer)(p1.getResult())).floatValue()!=((Float)(p2.getResult())).floatValue());	
				pf.setType(BOOLNUM);
			break;
			default:
				Window.output.setText("incompatable non equality relation");

				System.err.println("incompatable non equality relation expression at line ");
			break;
		}
		break;
	
	case FLOATNUM:
		switch(p2.getType()){
			case INTNUM:
				pf.setResult(((Float)(p1.getResult())).floatValue()!=((Integer)(p2.getResult())).floatValue());	
				pf.setType(BOOLNUM);
			break;
			case FLOATNUM:
				pf.setResult(((Float)(p1.getResult())).floatValue()!=((Float)(p2.getResult())).floatValue());
				pf.setType(BOOLNUM);
			break;
			default:
				Window.output.setText("incompatable non equality relation");

				System.err.println("incompatable non equality relation expression at line ");
			break;
		}
		break;
	case BOOLNUM:
		switch(p2.getType()){
			case BOOLNUM:
				pf.setResult((Boolean)(p1.getResult())!=(Boolean)(p2.getResult()));	
				pf.setType(BOOLNUM);
			break;
			default:
				System.err.println("incompatable non equality relation expression at line ");
			break;
		}
		break;
		
	case STRINGNUM:
		switch(p2.getType()){
			case STRINGNUM:
				pf.setResult((String)(p1.getResult())!=(String)(p2.getResult()));	
				pf.setType(BOOLNUM);
			break;
			default:
				Window.output.setText("incompatable non equality relation");

				System.err.println("incompatable non equality relation expression at line ");
			break;
		}
		break;	
	
	
	default:
		Window.output.setText("incompatable non equality relation");

		System.err.println("incompatable non equality relation expression at line ");
		
	}
	return pf;
	
}

//function for handling less than relation
public static PrimObject lessThan(PrimObject p1,PrimObject p2 ){
	
	PrimObject pf = new PrimObject();
	switch(p1.getType()){
	case INTNUM:
		switch(p2.getType()){
			case INTNUM:
				pf.setResult((Integer)(p1.getResult())<(Integer)(p2.getResult()));
				pf.setType(BOOLNUM);
			break;
			case FLOATNUM:
				pf.setResult(((Integer)(p1.getResult())).floatValue()<((Float)(p2.getResult())).floatValue());	
				pf.setType(BOOLNUM);
			break;
			default:
				Window.output.setText("incompatable less than relation");

				System.err.println("incompatable less than relation expression at line ");
			break;
		}
		break;
	
	case FLOATNUM:
		switch(p2.getType()){
			case INTNUM:
				pf.setResult(((Float)(p1.getResult())).floatValue()<((Integer)(p2.getResult())).floatValue());	
				pf.setType(BOOLNUM);
			break;
			case FLOATNUM:
				pf.setResult(((Float)(p1.getResult())).floatValue()<((Float)(p2.getResult())).floatValue());
				pf.setType(BOOLNUM);
			break;
			default:
				Window.output.setText("incompatable less than relation");

				System.err.println("incompatable less than relation expression at line ");
			break;
		}
		break;
	
	default:
		Window.output.setText("incompatable less than relation");

		System.err.println("incompatable less than relation expression at line ");
		
	}
	return pf;
	
}

//function for handling less than or equal relation
public static PrimObject lessThanEqual(PrimObject p1,PrimObject p2 ){
	
	PrimObject pf = new PrimObject();
	switch(p1.getType()){
	case INTNUM:
		switch(p2.getType()){
			case INTNUM:
				pf.setResult((Integer)(p1.getResult())<=(Integer)(p2.getResult()));
				pf.setType(BOOLNUM);
			break;
			case FLOATNUM:
				pf.setResult(((Integer)(p1.getResult())).floatValue()<=((Float)(p2.getResult())).floatValue());	
				pf.setType(BOOLNUM);
			break;
			default:
				Window.output.setText("incompatable less than or equal to relation");

				System.err.println("incompatable less than or equal relation expression at line ");
			break;
		}
		break;
	
	case FLOATNUM:
		switch(p2.getType()){
			case INTNUM:
				pf.setResult(((Float)(p1.getResult())).floatValue()<=((Integer)(p2.getResult())).floatValue());	
				pf.setType(BOOLNUM);
			break;
			case FLOATNUM:
				pf.setResult(((Float)(p1.getResult())).floatValue()<=((Float)(p2.getResult())).floatValue());
				pf.setType(BOOLNUM);
			break;
			default:
				Window.output.setText("incompatable less than or equal to relation");

				System.err.println("incompatable less than or equal relation expression at line ");
			break;
		}
		break;
	
	default:
		Window.output.setText("incompatable less than or equal to relation");

		System.err.println("incompatable less than or equal relation expression at line ");
		
	}
	return pf;
	
}

//function for handling greater than relation
public static PrimObject greaterThan(PrimObject p1,PrimObject p2 ){
	
	PrimObject pf = new PrimObject();
	switch(p1.getType()){
	case INTNUM:
		switch(p2.getType()){
			case INTNUM:
				pf.setResult((Integer)(p1.getResult())>(Integer)(p2.getResult()));
				pf.setType(BOOLNUM);
			break;
			case FLOATNUM:
				pf.setResult(((Integer)(p1.getResult())).floatValue()>((Float)(p2.getResult())).floatValue());	
				pf.setType(BOOLNUM);
			break;
			default:
				Window.output.setText("incompatable greater than relation");

				System.err.println("incompatable greater than relation expression at line ");
			break;
		}
		break;
	
	case FLOATNUM:
		switch(p2.getType()){
			case INTNUM:
				pf.setResult(((Float)(p1.getResult())).floatValue()>((Integer)(p2.getResult())).floatValue());	
				pf.setType(BOOLNUM);
			break;
			case FLOATNUM:
				pf.setResult(((Float)(p1.getResult())).floatValue()>((Float)(p2.getResult())).floatValue());
				pf.setType(BOOLNUM);
			break;
			default:
				Window.output.setText("incompatable greater than relation");

				System.err.println("incompatable greater than relation expression at line ");
			break;
		}
		break;
	
	default:
		Window.output.setText("incompatable greater than relation");

		System.err.println("incompatable greater than relation expression at line ");
		
	}
	return pf;
	
}

//function for handling greater than or equal relation
public static PrimObject greaterThanEqual(PrimObject p1,PrimObject p2 ){
	
	PrimObject pf = new PrimObject();
	switch(p1.getType()){
	case INTNUM:
		switch(p2.getType()){
			case INTNUM:
				pf.setResult((Integer)(p1.getResult())>=(Integer)(p2.getResult()));
				pf.setType(BOOLNUM);
			break;
			case FLOATNUM:
				pf.setResult(((Integer)(p1.getResult())).floatValue()>=((Float)(p2.getResult())).floatValue());	
				pf.setType(BOOLNUM);
			break;
			default:
				Window.output.setText("incompatable greater than or equal to relation");
				System.err.println("incompatable greater than or equal relation expression at line ");
			break;
		}
		break;
	
	case FLOATNUM:
		switch(p2.getType()){
			case INTNUM:
				pf.setResult(((Float)(p1.getResult())).floatValue()>=((Integer)(p2.getResult())).floatValue());	
				pf.setType(BOOLNUM);
			break;
			case FLOATNUM:
				pf.setResult(((Float)(p1.getResult())).floatValue()>=((Float)(p2.getResult())).floatValue());
				pf.setType(BOOLNUM);
			break;
			default:
				Window.output.setText("incompatable greater than or equal to relation");
				System.err.println("incompatable greater than or equal relation expression at line ");
			break;
		}
		break;
	
	default:
		Window.output.setText("incompatable greater than or equal to relation");
		System.err.println("incompatable greater than or equal relation expression at line ");
		
	}
	return pf;
	
}

//function for handling greater than or equal relation
public static PrimObject andCheck(PrimObject p1,PrimObject p2 ){
	PrimObject pf = new PrimObject();
	switch(p1.getType()){
	case BOOLNUM:
		switch(p2.getType()){
			case BOOLNUM:
				pf.setResult(((Boolean)(p1.getResult())).booleanValue()&&((Boolean)(p2.getResult())).booleanValue());
				pf.setType(BOOLNUM);
			break;
		
			default:
				Window.output.setText("incompatable and expression");
				System.err.println("incompatable and expression at line ");
			break;
		}
		break;	
	default:
		Window.output.setText("incompatable and expression");
		System.err.println("incompatable and expression at line ");
		
	}
	return pf;
	
}

//function for handling greater than or equal relation
public static PrimObject orCheck(PrimObject p1,PrimObject p2 ){
	
	PrimObject pf = new PrimObject();
	switch(p1.getType()){
	case BOOLNUM:
		switch(p2.getType()){
			case BOOLNUM:
				pf.setResult((Boolean)(p1.getResult())||(Boolean)(p2.getResult()));
				pf.setType(BOOLNUM);
			break;
		
			default:
				Window.output.setText("incompatable and expression");

				System.err.println("incompatable and expression at line ");
			break;
		}
		break;	
	default:
		Window.output.setText("incompatable and expression");

		System.err.println("incompatable and expression at line ");
		
	}
	return pf;
	
}
	
	//functions for recognizing objects
	public static PrimObject parseInt(String text){
		PrimObject pObject = new PrimObject();
		pObject.setResult(Integer.parseInt(text));
		pObject.setType(INTNUM);
		return pObject;
	
	}	
	public static PrimObject parseFloat(String text){
		PrimObject pObject = new PrimObject();
		pObject.setResult(Float.parseFloat(text));
		pObject.setType(FLOATNUM);
		return pObject;
	
	}
	
	public static PrimObject parseString(String text){
		PrimObject pObject = new PrimObject();
		pObject.setResult(text);
		pObject.setType(STRINGNUM);
		return pObject;
	
	}
	
	public static PrimObject parseBool(String text){
		PrimObject pObject = new PrimObject();
		pObject.setResult(Boolean.valueOf(text));
		pObject.setType(BOOLNUM);
		return pObject;
	
	}
}
