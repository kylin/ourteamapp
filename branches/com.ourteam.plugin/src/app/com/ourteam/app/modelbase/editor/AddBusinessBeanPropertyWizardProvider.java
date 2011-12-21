package com.ourteam.app.modelbase.editor;

import com.ourteam.modelbase.domain.ObjectPropertyTypeEnum;

public class AddBusinessBeanPropertyWizardProvider extends
		AbstractAddObjectPropertyWizardProvider {

	public AddBusinessBeanPropertyWizardProvider(long businessObjectId) {
		super(businessObjectId);
	}

	@Override
	protected ObjectPropertyTypeEnum getObjectPropertyTypeEnum() {
		return ObjectPropertyTypeEnum.BEAN_PROPERTY;
	}

	@Override
	protected String getWizardConfigId() {
		return "addBusinessBeanPropertyWizard";
	}

}
