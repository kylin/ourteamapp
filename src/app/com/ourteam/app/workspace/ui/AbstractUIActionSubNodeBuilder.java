package com.ourteam.app.workspace.ui;

import net.ui.eclipse.tree.ISubNodeBuilder;
import net.ui.model.action.ActionSetBean;

public abstract class AbstractUIActionSubNodeBuilder<ParentType, ChildType>
		implements ISubNodeBuilder<ParentType, ChildType> {

	private ActionSetBean actionSetBean;

	public ActionSetBean getActionSetBean() {
		return actionSetBean;
	}

	public void setActionSetBean(ActionSetBean actionSetBean) {
		this.actionSetBean = actionSetBean;
	}

}
