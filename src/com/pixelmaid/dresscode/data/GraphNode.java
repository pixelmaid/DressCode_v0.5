package com.pixelmaid.dresscode.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;

/*Base class for node in Scene Graph. Should be subclassed by all drawing objects */

public class GraphNode extends NodeEvent {
	
	public ArrayList <GraphNode> m_Children;
	public String type;
	private GraphNode m_Parent;
	private String m_Name;

	 public GraphNode(GraphNode parent, String name){
		 m_Parent = parent;
		 m_Name=name;
	 }
	 
	 public boolean clear(){
		   
		for (int i=0;i<m_Children.size();i++){
			m_Children.get(i).clear();
		 
		 }
		    
		    m_Children.clear();

		    return true;

	 }
	 
	public boolean copyBaseVariables(GraphNode node){
		 
	    if( node == null ){
	      
	        return false;
	    }
	 
	    this.m_Name = node.m_Name;
	    return true;

		
	}
	
	//virtual function
	public void update(){
		

	    if(m_Children.size()>0)
	    {
	        for(int i = 0; i < m_Children.size(); i++)
	        {
	            if( m_Children.get(i)!=null)
	            {
	                m_Children.get(i).update();
	            }
	        }
	    }

		
	}
	
	public final GraphNode getParentNode(){
		return(m_Parent);
	
	}
	public void setParentNode(GraphNode newParent){
		 if( m_Parent!=null)
		    {
		        m_Parent.removeChildNode(this);
		    }
		    m_Parent = newParent;

	}
	   
	//virtual function
	public boolean addChildNode(GraphNode childNode){

	    if(null != childNode)
	    {
	     
	           childNode.setParentNode(this);
	           
	       
	        m_Children.add(childNode);
	        return true;
	    }
	    else return false;

		
		
	}
	
	public final boolean removeChildNode(GraphNode childNode){
		if(null != childNode && m_Children.size()!=0)
	    {
	        for(int i = 0; i < m_Children.size(); i++)
	        {
	            if(m_Children.get(i) == childNode)
	            {
	                m_Children.remove(i);
	               
	                return true;
	            }
	        }
	    }
	    return false;

		
	}
	public boolean recursiveRemoveChildNode(GraphNode childNode){
	    if(null != childNode && m_Children.size()!=0)
	    {
	        for(int i = 0; i < m_Children.size(); i++)
	        {
	            if(m_Children.get(i) == childNode)
	            {
	                m_Children.remove(i);
	                //cout<<"node found child to remove at "<<i<<endl;
	                return true;
	              
	            }
	            else{
	                //cout<<"not found looking in children"<<i<<endl;
	                if(m_Children.get(i).recursiveRemoveChildNode(childNode)){
	                    return true;

	                }
	            }
	        }
	    }
	    //cout<<"node child not found"<<endl;
	    return false;
		
	}
	public final String GetNodeName(){
		return m_Name;
	}
	
	public final void setNodeName(String n){
		m_Name = n;
	}
	    
	public String getType() {
	        return type;
	    }
	    
	public final int countChildNode(final boolean recursiveCount){
		if(!recursiveCount)
	    {
	        return(m_Children.size());
	    }
	    else
	    {
	        int retVal = m_Children.size();
	        for(int i = 0; i < m_Children.size(); i++)
	        {
	            retVal += m_Children.get(i).countChildNode(true);
	        }
	        return(retVal);
	    }

	}
	    //virtual const bool IsRootNode(void) const = 0;
	    
	public GraphNode getChildNodeByName(String searchName){
		GraphNode retval = null;
	    if(m_Children.size()!=0)
	    {
	        for(int i = 0; i < m_Children.size(); ++i)
	        {
	            if(m_Children.get(i).m_Name.matches(searchName)){
	            
	               retval = m_Children.get(i);
	                break; // break the for loop
	            }
	        
	        }
	    }
	    return(retval);

	}
	    
	 public final GraphNode createNewInstance(){
		 GraphNode g = new GraphNode(this.getParentNode(),this.GetNodeName());
		 g.copyBaseVariables(this);
		 return g;
		 
	 }
	 //virtual function   
	 public  boolean deepCopyFrom(final GraphNode node){

		    if( node == null ){
		        return false;
		    }
		    
		    copyBaseVariables(node);
		    for (int i=0;i<node.m_Children.size();i++){  //Recursively deep copy the left child
		        
		        GraphNode c = node.m_Children.get(i).createNewInstance();
		        if(c == null){
		            //cout<<"child not copied"<<endl;
		            return false;
		  
		        }
		        //Validate that the classifier was cloned correctly
		        if( !c.deepCopyFrom( node.m_Children.get(i) ) ){
		           
		            c=null;
		            //cout<<"child not copied because of deep copy"<<endl;
		            return false;
		        }
		       this.m_Children.add(c);
		       c.m_Parent = this;
		        //cout<<"child copy success at "<<i<<endl;

		        //this->leftChild->parent = node;
		    }
		    return true;
	 }


	 
}

