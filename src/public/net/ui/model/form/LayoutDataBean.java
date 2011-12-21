package net.ui.model.form;

import java.io.Serializable;

public class LayoutDataBean implements Serializable{
	
	private String name;
	
	private String value;

	public LayoutDataBean() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}
	
	public int getValueAsInt(){
		return Integer.parseInt(value);
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	

}
