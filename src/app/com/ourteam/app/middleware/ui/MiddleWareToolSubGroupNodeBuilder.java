package com.ourteam.app.middleware.ui;

import net.ui.eclipse.tree.ISubNodeBuilder;

import com.ourteam.app.IOurTeamServiceConst;
import com.ourteam.middleware.domain.MiddleWareToolGroupBean;

public class MiddleWareToolSubGroupNodeBuilder implements
		ISubNodeBuilder<MiddleWareToolGroupBean, MiddleWareToolGroupBean> {

	@Override
	public MiddleWareToolGroupBean[] getSubNodes(
			MiddleWareToolGroupBean aParentObject) throws Exception {
		return IOurTeamServiceConst.MIDDLE_WARE_SERVICE
				.getMiddleWareToolGroups(aParentObject.getProviderId(),
						aParentObject.getId());
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
