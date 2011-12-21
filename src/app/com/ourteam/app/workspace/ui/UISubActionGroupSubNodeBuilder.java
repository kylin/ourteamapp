package com.ourteam.app.workspace.ui;

import net.ui.model.action.ActionBean;
import net.ui.model.action.ActionGroupBean;
import net.ui.model.action.ActionSetConfigBean;

import org.apache.commons.beanutils.PropertyUtils;

public class UISubActionGroupSubNodeBuilder extends
		AbstractUIActionSubNodeBuilder<ActionGroupBean, ActionBean> {

	@Override
	public ActionBean[] getSubNodes(ActionGroupBean aParentObject)
			throws Exception {

		ActionBean[] actionBeans = aParentObject.getActionBeans();

		ActionBean[] beans = new ActionBean[actionBeans.length];

		for (int i = 0; i < beans.length; i++) {
			beans[i] = new ActionBean();
			PropertyUtils.copyProperties(beans[i], actionBeans[i]);
		}

		ActionSetConfigBean.reBuildActions(getActionSetBean(), beans);

		return beans;
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
