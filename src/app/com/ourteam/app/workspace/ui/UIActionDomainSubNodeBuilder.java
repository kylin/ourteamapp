package com.ourteam.app.workspace.ui;

import net.ui.model.action.ActionSetBean;

public class UIActionDomainSubNodeBuilder extends
		AbstractUIActionSubNodeBuilder<ActionSetBean, UIActionDomainBean> {

	@Override
	public UIActionDomainBean[] getSubNodes(ActionSetBean aParentObject)
			throws Exception {

		String[] strings = aParentObject.getActionDomains();

		UIActionDomainBean[] domainBeans = new UIActionDomainBean[strings.length];

		for (int i = 0; i < domainBeans.length; i++) {
			domainBeans[i] = new UIActionDomainBean();
			domainBeans[i].setId(strings[i]);
		}

		return domainBeans;
	}

	@Override
	public String getSubNodeDefineId(UIActionDomainBean nodeObject) {
		return "UI_ACTION_DOMAIN";
	}

	@Override
	public String[] getSubNodeActionGroupIds(UIActionDomainBean nodeObject) {
		return null;
	}

}
