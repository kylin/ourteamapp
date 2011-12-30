package com.ourteam.app.modelbase.ui;

import net.ui.eclipse.widget.SearchDataModel;

public class BusinessPackageSearchDataModel extends SearchDataModel {

	private Long businessDomainId;
	
	private String name;
	
	private String packageType;

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

	public String getPackageType() {
		return packageType;
	}

	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}
	
	
}
