package com.ourteam.app.modelbase.ui;

import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;

public class PersistentObjectNodeBuilder extends
		AbstractBusinessObjectNodeBuilder {

	@Override
	protected BusinessObjectTypeEnum getBusinessObjectType() {
		return BusinessObjectTypeEnum.PERSISTENT;
	}

	@Override
	public String[] getSubNodeActionGroupIds(BusinessObjectBean nodeObject) {
		return new String[]{"persistentObjectActionGroup"};
	}

}
