package com.ourteam.app.modelbase.ui;

import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;

public class ServiceObjectNodeBuilder extends AbstractBusinessObjectNodeBuilder {

	@Override
	protected BusinessObjectTypeEnum getBusinessObjectType() {
		return BusinessObjectTypeEnum.SERVICE;
	}

	@Override
	public String[] getSubNodeActionGroupIds(BusinessObjectBean nodeObject) {
		return new String[] { "serviceObjectActionGroup" };
	}

}
