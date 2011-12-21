package com.ourteam.app.modelbase.ui;

import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;

public class DomainBeanObjectNodeBuilder extends
		AbstractBusinessObjectNodeBuilder {

	@Override
	protected BusinessObjectTypeEnum getBusinessObjectType() {
		return BusinessObjectTypeEnum.JAVA_CLASS;
	}

	@Override
	public String[] getSubNodeActionGroupIds(BusinessObjectBean nodeObject) {
		return new String[]{"beanObjectActionGroup"};
	}

}
