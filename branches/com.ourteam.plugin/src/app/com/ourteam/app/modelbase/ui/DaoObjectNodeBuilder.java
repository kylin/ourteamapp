package com.ourteam.app.modelbase.ui;

import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;

public class DaoObjectNodeBuilder extends AbstractBusinessObjectNodeBuilder {

	@Override
	protected BusinessObjectTypeEnum getBusinessObjectType() {
		return BusinessObjectTypeEnum.DAO;
	}

	@Override
	public String[] getSubNodeActionGroupIds(BusinessObjectBean nodeObject) {
		return new String[]{"daoObjectActionGroup"};
	}

}
