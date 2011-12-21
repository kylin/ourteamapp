package com.ourteam.app.utils;

import net.ui.eclipse.editorpart.AbstractRoleBasedDispatchActionHandler;
import net.ui.model.action.ActionBean;

public class RoleBasesDispatchActionHandler extends
		AbstractRoleBasedDispatchActionHandler {
	
	@Override
	public boolean canExecuteAction(ActionBean aAction) throws Exception {

		return true;

	}

}
