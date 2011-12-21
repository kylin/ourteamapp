package net.ui.model.tab;

import java.io.Serializable;

import org.apache.commons.beanutils.ConvertUtils;

public class ConstructorParam implements Serializable{
	
	private Class<?> paramClass;
	
	private String value;

	public ConstructorParam() {
		super();
	}
	
	public void setType(String aType) throws Exception{
		paramClass = Class.forName(aType);
	}
	
	public void setValue(String aValue){
		value = aValue;
	}
	
	
	
	public Class<?> getParamClass(){
		return paramClass;
	}
	
	public Object getParamValue() throws Exception{
		return ConvertUtils.convert(value,paramClass);
	}

}
