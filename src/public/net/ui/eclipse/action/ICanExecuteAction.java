package net.ui.eclipse.action;

import net.ui.model.action.ActionBean;

public interface ICanExecuteAction {

	boolean canExecuteAction(ActionBean aAction) throws Exception;
}
