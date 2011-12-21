package com.ourteam.app.modelbase.ui;

import com.ourteam.modelbase.domain.ObjectPropertyTypeEnum;

public class PersistentPropertyNodeBuilder extends AbstractBusinessObjectPropertyNodeBuilder {

	@Override
	protected ObjectPropertyTypeEnum getBusinessPropertyType() {
		return ObjectPropertyTypeEnum.PERSISTENT_PROPERTY;
	}

	

}
