package com.ourteam.app.modelbase.ui;

import com.ourteam.modelbase.domain.ObjectPropertyTypeEnum;

public class DomainBeanObjectPropertyNodeBuilder extends
		AbstractBusinessObjectPropertyNodeBuilder {

	@Override
	protected ObjectPropertyTypeEnum getBusinessPropertyType() {
		return ObjectPropertyTypeEnum.BEAN_PROPERTY;
	}

	
	
}
