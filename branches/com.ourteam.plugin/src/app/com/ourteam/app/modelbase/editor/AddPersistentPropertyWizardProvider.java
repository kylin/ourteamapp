package com.ourteam.app.modelbase.editor;

import com.ourteam.modelbase.domain.ObjectPropertyTypeEnum;

public class AddPersistentPropertyWizardProvider extends
		AbstractAddObjectPropertyWizardProvider {

	public AddPersistentPropertyWizardProvider(long businessObjectId) {
		super(businessObjectId);
	}

	@Override
	protected ObjectPropertyTypeEnum getObjectPropertyTypeEnum() {
		return ObjectPropertyTypeEnum.PERSISTENT_PROPERTY;
	}

	@Override
	protected String getWizardConfigId() {
		return "addPersistentPropertyWizard";
	}

}
