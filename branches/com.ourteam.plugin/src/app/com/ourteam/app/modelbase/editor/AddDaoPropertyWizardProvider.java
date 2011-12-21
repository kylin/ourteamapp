package com.ourteam.app.modelbase.editor;

import com.ourteam.modelbase.domain.ObjectPropertyTypeEnum;

public class AddDaoPropertyWizardProvider extends
		AbstractAddObjectPropertyWizardProvider {

	public AddDaoPropertyWizardProvider(long businessObjectId) {
		super(businessObjectId);
	}

	@Override
	protected ObjectPropertyTypeEnum getObjectPropertyTypeEnum() {
		return ObjectPropertyTypeEnum.BUSINESS_PROPERTY;
	}

	@Override
	protected String getWizardConfigId() {
		return "addDaoPropertyWizard";
	}

}
