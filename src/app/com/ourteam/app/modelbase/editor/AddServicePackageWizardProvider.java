package com.ourteam.app.modelbase.editor;

import com.ourteam.modelbase.domain.BusinessPackageTypeEnum;

public class AddServicePackageWizardProvider extends
		AbstractAddBusinessPackageWizardProvider {

	public AddServicePackageWizardProvider(long businessDomainId) {
		super(businessDomainId);
	}

	@Override
	protected BusinessPackageTypeEnum getBusinessPackageType() {
		return BusinessPackageTypeEnum.SERVICE_PACKAGE;
	}

	@Override
	protected String getWizardConfigId() {
		return "addServicePackageWizard";
	}

}
