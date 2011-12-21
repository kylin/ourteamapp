package com.ourteam.app.middleware.ui;

import net.ui.eclipse.tree.ISubNodeBuilder;

import com.ourteam.app.IOurTeamServiceConst;
import com.ourteam.middleware.domain.MiddleWareToolBean;
import com.ourteam.middleware.domain.MiddleWareToolGroupBean;

public class MiddleWareToolNodeBuilder implements
		ISubNodeBuilder<MiddleWareToolGroupBean, MiddleWareToolBean> {

	@Override
	public MiddleWareToolBean[] getSubNodes(
			MiddleWareToolGroupBean aParentObject) throws Exception {
		return IOurTeamServiceConst.MIDDLE_WARE_SERVICE
				.getMiddleWareTools(aParentObject.getId());
	}

	@Override
	public String getSubNodeDefineId(MiddleWareToolBean nodeObject) {
		return "middleWareTool";
	}

	@Override
	public String[] getSubNodeActionGroupIds(MiddleWareToolBean nodeObject) {
		return null;
	}

}
