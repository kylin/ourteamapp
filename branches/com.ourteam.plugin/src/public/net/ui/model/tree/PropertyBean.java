package net.ui.model.tree;

import java.io.Serializable;

public class PropertyBean implements Serializable{
	
	private String name;
	
	private String value;

	public PropertyBean() {
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

	public void setValue(String value) {
		this.value = value;
	}
	
	
}
