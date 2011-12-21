package com.ourteam.app.modelbase.editor;

import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;

public class AddPersistentObjectWizardProvider extends AbstractAddBusinessObjectWizardProvider {

	public AddPersistentObjectWizardProvider(long packageId) {
		super(packageId);
	}

	@Override
	protected String getWizardConfigId() {
		return "addPersistentObjectWizard";
	}

	@Override
	protected BusinessObjectTypeEnum getBusinessObjectTypeEnum() {
		return BusinessObjectTypeEnum.PERSISTENT;
	}

}
