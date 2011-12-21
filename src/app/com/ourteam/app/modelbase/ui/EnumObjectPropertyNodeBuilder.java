package com.ourteam.app.modelbase.ui;

import com.ourteam.modelbase.domain.ObjectPropertyTypeEnum;

public class EnumObjectPropertyNodeBuilder extends
		AbstractBusinessObjectPropertyNodeBuilder {

	@Override
	protected ObjectPropertyTypeEnum getBusinessPropertyType() {
		return ObjectPropertyTypeEnum.ENUM_PROPERTY;
	}

	

}
