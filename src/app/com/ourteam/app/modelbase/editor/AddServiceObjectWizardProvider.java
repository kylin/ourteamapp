package com.ourteam.app.modelbase.editor;

import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;

public class AddServiceObjectWizardProvider extends AbstractAddBusinessObjectWizardProvider {

	public AddServiceObjectWizardProvider(long packageId) {
		super(packageId);
	}

	@Override
	protected String getWizardConfigId() {
		return "addServiceObjectWizard";
	}

	@Override
	protected BusinessObjectTypeEnum getBusinessObjectTypeEnum() {
		return BusinessObjectTypeEnum.SERVICE;
	}

}
