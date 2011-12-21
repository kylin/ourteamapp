package com.ourteam.app.modelbase.editor;

import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;

public class AddEnumObjectWizardProvider extends AbstractAddBusinessObjectWizardProvider {

	public AddEnumObjectWizardProvider(long packageId) {
		super(packageId);
	}

	@Override
	protected String getWizardConfigId() {
		return "addEnumObjectWizard";
	}

	@Override
	protected BusinessObjectTypeEnum getBusinessObjectTypeEnum() {
		return BusinessObjectTypeEnum.ENUM;
	}

}
