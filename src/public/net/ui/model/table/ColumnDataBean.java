package net.ui.model.table;

import java.io.Serializable;

public class ColumnDataBean implements Serializable{
	
	private String label;
	
	private String data;

	public ColumnDataBean() {
		super();
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	

}
