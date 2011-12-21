package com.ourteam.app.modelbase.editor;

import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;
import com.ourteam.modelbase.domain.BusinessPackageTypeEnum;

public class GenDtoObjectWizardProvider extends
		AbstractGenBusinessObjectWizardProvider {

	public GenDtoObjectWizardProvider(BusinessObjectBean daoObject) {
		super(daoObject);
	}

	@Override
	protected String getWizardConfigId() {
		return "genDtoObjectWizard";
	}

	@Override
	protected String convertBusinessName(String name) {
		StringBuffer nameBuffer = new StringBuffer(name);

		nameBuffer.append("Bean");

		return nameBuffer.toString();
	}

	@Override
	protected String convertPropertyName(String name) {
		return name;
	}

	@Override
	protected BusinessObjectTypeEnum getBusinessObjectTypeEnum() {
		return BusinessObjectTypeEnum.JAVA_CLASS;
	}

	@Override
	protected BusinessPackageTypeEnum getBusinessPackageTypeEnum() {
		return BusinessPackageTypeEnum.SERVICE_PACKAGE;
	}

}
