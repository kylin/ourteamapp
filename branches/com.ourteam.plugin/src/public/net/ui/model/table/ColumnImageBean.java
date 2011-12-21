package net.ui.model.table;

import java.io.Serializable;

public class ColumnImageBean implements Serializable{
	
	private String pattern;
	
	private String image;

	public ColumnImageBean() {
		super();
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	
	
}
