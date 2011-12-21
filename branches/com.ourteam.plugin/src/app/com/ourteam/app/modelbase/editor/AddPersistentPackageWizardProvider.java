package com.ourteam.app.modelbase.editor;

import com.ourteam.modelbase.domain.BusinessPackageTypeEnum;

public class AddPersistentPackageWizardProvider extends
		AbstractAddBusinessPackageWizardProvider {

	public AddPersistentPackageWizardProvider(long businessDomainId) {
		super(businessDomainId);
	}

	@Override
	protected BusinessPackageTypeEnum getBusinessPackageType() {
		return BusinessPackageTypeEnum.PERSISTENT_PACKAGE;
	}

	@Override
	protected String getWizardConfigId() {
		return "addPersistentPackageWizard";
	}

}
