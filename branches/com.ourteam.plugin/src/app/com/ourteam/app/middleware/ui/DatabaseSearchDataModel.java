package com.ourteam.app.middleware.ui;

import net.ui.eclipse.widget.SearchDataModel;

public class DatabaseSearchDataModel extends SearchDataModel {

	private String name;
	
	private long providerId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getProviderId() {
		return providerId;
	}

	public void setProviderId(long provider) {
		this.providerId = provider;
	}
	
	
}
