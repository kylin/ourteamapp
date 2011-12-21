package com.ourteam.app.modelbase.editor;

import com.ourteam.modelbase.domain.BusinessPackageTypeEnum;

public class AddDaoPackageWizardProvider extends
		AbstractAddBusinessPackageWizardProvider {

	public AddDaoPackageWizardProvider(long businessDomainId) {
		super(businessDomainId);
	}

	@Override
	protected BusinessPackageTypeEnum getBusinessPackageType() {
		return BusinessPackageTypeEnum.BUSINESS_PACKAGE;
	}

	@Override
	protected String getWizardConfigId() {
		return "addDaoPackageWizard";
	}

}
