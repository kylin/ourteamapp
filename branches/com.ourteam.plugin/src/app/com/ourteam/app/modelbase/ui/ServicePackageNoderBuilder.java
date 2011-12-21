package com.ourteam.app.modelbase.ui;

import com.ourteam.modelbase.domain.BusinessPackageBean;
import com.ourteam.modelbase.domain.BusinessPackageTypeEnum;

public class ServicePackageNoderBuilder extends AbscractPackageNodeBuilder {

	@Override
	protected BusinessPackageTypeEnum getBusinessPackageType() {
		return BusinessPackageTypeEnum.SERVICE_PACKAGE;
	}

	@Override
	public String[] getSubNodeActionGroupIds(BusinessPackageBean nodeObject) {
		return new String[]{"servicePackageActionGroup"};
	}

}
