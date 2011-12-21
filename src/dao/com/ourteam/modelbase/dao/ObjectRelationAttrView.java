package com.ourteam.modelbase.dao;


import com.ourteam.modelbase.dao.ObjectRelationAttr;



/**
*  对象属性关联视图
*  Generate Date 2010-07-05 16:19:58  
*  @author Auto Gen 
*/
public class ObjectRelationAttrView  extends ObjectRelationAttr  implements java.io.Serializable{

	public ObjectRelationAttrView() {
		super();
	}
	
																																																																
																																																																
		
	public int hashCode() {
		final int prime = 31;
		int result = 1;
				
				
		result = prime * result + (int) (getObjectRelationAttrId() ^ (getObjectRelationAttrId() >>> 32));
						
		return result;
	}

	public boolean equals(Object obj) {
	
			
		return super.equals(obj);
		
		
	}	
	
	public String toString(){
		StringBuffer buffer = new StringBuffer(super.toString());
		
				
		buffer.append(super.toString());
				
		buffer.append("[\r\n");
																																																																																																																																
		buffer.append("]");
		
		return buffer.toString();
	}
	
}