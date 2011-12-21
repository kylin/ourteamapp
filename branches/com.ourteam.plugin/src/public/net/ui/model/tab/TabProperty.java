package net.ui.model.tab;

import java.io.Serializable;

public class TabProperty implements Serializable{
	
	private String id;
	
	private String value;

	public TabProperty() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	

}
