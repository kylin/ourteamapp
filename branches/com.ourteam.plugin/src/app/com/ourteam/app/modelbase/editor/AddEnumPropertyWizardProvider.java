package com.ourteam.app.modelbase.editor;

import com.ourteam.modelbase.domain.ObjectPropertyTypeEnum;

public class AddEnumPropertyWizardProvider extends
		AbstractAddObjectPropertyWizardProvider {

	public AddEnumPropertyWizardProvider(long businessObjectId) {
		super(businessObjectId);
	}

	@Override
	protected ObjectPropertyTypeEnum getObjectPropertyTypeEnum() {
		return ObjectPropertyTypeEnum.ENUM_PROPERTY;
	}

	@Override
	protected String getWizardConfigId() {
		return "addEnumPropertyWizard";
	}

}
