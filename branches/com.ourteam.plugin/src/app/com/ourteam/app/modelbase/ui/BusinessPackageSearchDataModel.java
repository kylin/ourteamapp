package com.ourteam.app.modelbase.ui;

import net.ui.eclipse.widget.SearchDataModel;

public class BusinessPackageSearchDataModel extends SearchDataModel {

	private Long businessDomainId;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getBusinessDomainId() {
		return businessDomainId;
	}

	public void setBusinessDomainId(Long businessDomainId) {
		this.businessDomainId = businessDomainId;
	}
	
	
}
