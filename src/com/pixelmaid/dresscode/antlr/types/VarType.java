package com.pixelmaid.dresscode.antlr.types;

import java.util.List;

import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.drawing.primitive2d.Ellipse;

public class VarType implements Comparable<VarType> {  
	  
	  public static final VarType NULL = new VarType();  
	  public static final VarType VOID = new VarType();  
	  
	  private Object value;  
	  
	  private VarType() {  
	    // private constructor: only used for NULL and VOID  
	    value = new Object();  
	  }  
	  
	  public VarType(Object v) {  
	    if(v == null) {  
	      throw new RuntimeException("v == null");  
	    }  
	    value = v;  
	    // only accept boolean, list, number or string types  
	    if(!(isBoolean() || isList() || isNumber() || isString() || isDrawable()) ) {  
	      throw new RuntimeException("invalid type: " + v + " (" + v.getClass() + ")");  
	    } 
	    
	  }  
	  
	  public Boolean asBoolean() {  
	    return (Boolean)value;  
	  }  
	  
	  public Double asDouble() {  
	    return ((Number)value).doubleValue();  
	  }  
	  
	  public Long asLong() {  
	    return ((Number)value).longValue();  
	  }  
	  
	  @SuppressWarnings("unchecked")  
	  public List<VarType> asList() {  
	    return (List<VarType>)value;  
	  }  
	  
	  public String asString() {  
	    return (String)value;  
	  }
	  
	  public Ellipse asEllipse(){
		  
		  return  new Ellipse(0, 0, 0);
	  }
	  
	  @Override  
	  public int compareTo(VarType that) {  
	    if(this.isNumber() && that.isNumber()) {  
	      if(this.equals(that)) {  
	        return 0;  
	      }  
	      else {  
	        return this.asDouble().compareTo(that.asDouble());  
	      }  
	    }  
	    else if(this.isString() && that.isString()) {  
	      return this.asString().compareTo(that.asString());  
	    }  
	    else {  
	      throw new RuntimeException("illegal expression: can't compare `" +   
	          this + "` to `" + that + "`");  
	    }  
	  }  
	  
	  @Override  
	  public boolean equals(Object o) {  
	    if(this == VOID || o == VOID) {  
	      throw new RuntimeException("can't use VOID: " + this + " ==/!= " + o);  
	    }  
	    if(this == o) {  
	      return true;  
	    }  
	    if(o == null || this.getClass() != o.getClass()) {  
	      return false;  
	    }  
	    VarType that = (VarType)o;  
	    if(this.isNumber() && that.isNumber()) {  
	      double diff = Math.abs(this.asDouble() - that.asDouble());  
	      return diff < 0.00000000001;  
	    }  
	    else {  
	      return this.value.equals(that.value);  
	    }  
	  }  
	  
	  @Override  
	  public int hashCode() {  
	    return value.hashCode();  
	  }  
	  
	  public boolean isBoolean() {  
	    return value instanceof Boolean;  
	  }  
	  
	  public boolean isNumber() {  
	    return value instanceof Number;  
	  }  
	  
	  public boolean isList() {  
	    return value instanceof List<?>;  
	  }  
	  
	  public boolean isNull() {  
	    return this == NULL;  
	  }  
	  
	  public boolean isVoid() {  
	    return this == VOID;  
	  }  
	  
	  public boolean isString() {  
	    return value instanceof String;  
	  } 
	  
	  public boolean isDrawable(){
		  return value instanceof Drawable;
	  }
	  
	  @Override  
	  public String toString() {  
	    return isNull() ? "NULL" : isVoid() ? "VOID" : String.valueOf(value);  
	  }  
	}  