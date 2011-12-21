package com.ourteam.app.workspace.ui;

import net.ui.model.action.ActionGroupBean;
import net.ui.model.action.ActionSetBean;

public class UIActionGroupSubNodeBuilder extends
		AbstractUIActionSubNodeBuilder<ActionSetBean, ActionGroupBean> {

	@Override
	public ActionGroupBean[] getSubNodes(ActionSetBean aParentObject)
			throws Exception {

		return aParentObject.getActionGroups();
	}

	@Override
	public String getSubNodeDefineId(ActionGroupBean nodeObject) {
		return "UI_ACTION_GROUP";
	}

	@Override
	public String[] getSubNodeActionGroupIds(ActionGroupBean nodeObject) {
		// TODO Auto-generated method stub
		return null;
	}

}
