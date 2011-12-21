package com.ourteam.app.modelbase.ui;

public class BusinessPropertyDataTypeDataModel {

	private String dataType;
	
	private long referencedObjectId;
	
	private boolean arrayType;

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public long getReferencedObjectId() {
		return referencedObjectId;
	}

	public void setReferencedObjectId(long referencedObjectId) {
		this.referencedObjectId = referencedObjectId;
	}

	public boolean isArrayType() {
		return arrayType;
	}

	public void setArrayType(boolean arrayType) {
		this.arrayType = arrayType;
	}
	
	
}
