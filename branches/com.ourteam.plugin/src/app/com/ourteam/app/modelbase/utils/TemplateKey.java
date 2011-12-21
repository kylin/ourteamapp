package com.ourteam.app.modelbase.utils;

public class TemplateKey {

	private String businessObjectType;
	
	private String providerType;

	public TemplateKey(String businessObjectType, String providerType) {
		super();
		this.businessObjectType = businessObjectType;
		this.providerType = providerType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((businessObjectType == null) ? 0 : businessObjectType
						.hashCode());
		result = prime * result
				+ ((providerType == null) ? 0 : providerType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TemplateKey other = (TemplateKey) obj;
		if (businessObjectType == null) {
			if (other.businessObjectType != null)
				return false;
		} else if (!businessObjectType.equals(other.businessObjectType))
			return false;
		if (providerType == null) {
			if (other.providerType != null)
				return false;
		} else if (!providerType.equals(other.providerType))
			return false;
		return true;
	}
	
	
}
