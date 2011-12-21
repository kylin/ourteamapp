package com.ourteam.app.middleware.ui;

import net.ui.eclipse.tree.ISubNodeBuilder;

import com.ourteam.app.IOurTeamServiceConst;
import com.ourteam.middleware.domain.MiddleWareProviderBean;
import com.ourteam.middleware.domain.MiddleWareTypeEnum;

public class MiddleWareProviderNodeBuilder implements
		ISubNodeBuilder<MiddleWareTypeEnum, MiddleWareProviderBean> {

	@Override
	public MiddleWareProviderBean[] getSubNodes(MiddleWareTypeEnum aParentObject)
			throws Exception {
		return IOurTeamServiceConst.MIDDLE_WARE_SERVICE.getMiddleWareProviders(aParentObject);
	}

	@Override
	public String getSubNodeDefineId(MiddleWareProviderBean nodeObject) {
		return "middleWareProvider";
	}

	@Override
	public String[] getSubNodeActionGroupIds(MiddleWareProviderBean nodeObject) {
		return null;
	}

}
