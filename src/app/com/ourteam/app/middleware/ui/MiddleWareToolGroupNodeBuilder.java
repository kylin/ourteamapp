package com.ourteam.app.middleware.ui;

import net.ui.eclipse.tree.ISubNodeBuilder;

import com.ourteam.app.IOurTeamServiceConst;
import com.ourteam.middleware.domain.MiddleWareProviderBean;
import com.ourteam.middleware.domain.MiddleWareToolGroupBean;

public class MiddleWareToolGroupNodeBuilder implements
		ISubNodeBuilder<MiddleWareProviderBean, MiddleWareToolGroupBean> {

	@Override
	public MiddleWareToolGroupBean[] getSubNodes(
			MiddleWareProviderBean aParentObject) throws Exception {
		return IOurTeamServiceConst.MIDDLE_WARE_SERVICE
				.getMiddleWareToolGroups(aParentObject.getId(), 0);
	}

	@Override
	public String getSubNodeDefineId(MiddleWareToolGroupBean nodeObject) {
		return "middleWareToolGroup";
	}

	@Override
	public String[] getSubNodeActionGroupIds(MiddleWareToolGroupBean nodeObject) {
		return null;
	}

}
