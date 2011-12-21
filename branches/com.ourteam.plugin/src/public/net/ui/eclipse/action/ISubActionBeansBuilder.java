package net.ui.eclipse.action;

import net.ui.model.action.ActionBean;

public interface ISubActionBeansBuilder {

	ActionBean[] getSubActionBeans(ActionBean actionBean) throws Exception;
}
