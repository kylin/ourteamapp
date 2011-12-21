package com.ourteam.app.modelbase.editor;

import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;

public class AddBusinessBeanWizardProvider extends
		AbstractAddBusinessObjectWizardProvider {

	public AddBusinessBeanWizardProvider(long packageId) {
		super(packageId);
	}

	@Override
	protected String getWizardConfigId() {
		return "addBusinessBeanWizard";
	}

	@Override
	protected BusinessObjectTypeEnum getBusinessObjectTypeEnum() {
		return BusinessObjectTypeEnum.JAVA_CLASS;
	}

	

}
