package com.ourteam.app.modelbase.ui;

import com.ourteam.modelbase.domain.BusinessPackageBean;
import com.ourteam.modelbase.domain.BusinessPackageTypeEnum;

public class PersistentPackageNoderBuilder extends AbscractPackageNodeBuilder {

	@Override
	protected BusinessPackageTypeEnum getBusinessPackageType() {
		return BusinessPackageTypeEnum.PERSISTENT_PACKAGE;
	}

	@Override
	public String[] getSubNodeActionGroupIds(BusinessPackageBean nodeObject) {
		return new String[]{"persistentPackageActionGroup"};
	}

}
