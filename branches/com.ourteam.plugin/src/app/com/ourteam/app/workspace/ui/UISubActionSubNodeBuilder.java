package com.ourteam.app.workspace.ui;

import net.ui.model.action.ActionBean;

public class UISubActionSubNodeBuilder extends
		AbstractUIActionSubNodeBuilder<ActionBean, ActionBean> {

	@Override
	public ActionBean[] getSubNodes(ActionBean aParentObject) throws Exception {

		return aParentObject.getSubActionBeans();
	}

	@Override
	public String getSubNodeDefineId(ActionBean nodeObject) {
		return "UI_ACTION";
	}

	@Override
	public String[] getSubNodeActionGroupIds(ActionBean nodeObject) {
		return new String[]{"subActionBeanContextMenu"};
	}

}
