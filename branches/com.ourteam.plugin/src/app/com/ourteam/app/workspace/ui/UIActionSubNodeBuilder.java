package com.ourteam.app.workspace.ui;

import net.ui.model.action.ActionBean;

public class UIActionSubNodeBuilder extends
		AbstractUIActionSubNodeBuilder<UIActionDomainBean, ActionBean> {

	@Override
	public ActionBean[] getSubNodes(UIActionDomainBean aParentObject)
			throws Exception {

		return this.getActionSetBean().getActions(aParentObject.getId());
	}

	@Override
	public String getSubNodeDefineId(ActionBean nodeObject) {
		return "UI_ACTION";
	}

	@Override
	public String[] getSubNodeActionGroupIds(ActionBean nodeObject) {
		return new String[]{"actionBeanContextMenu"};
	}

}
