package net.ui.eclipse.editorpart;

import net.ui.eclipse.action.AbstractDispatchActionHandler;
import net.ui.eclipse.action.ICanExecuteAction;
import net.ui.model.action.ActionBean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

abstract public class AbstractRoleBasedDispatchActionHandler extends
		AbstractDispatchActionHandler implements ICanExecuteAction {
	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(AbstractRoleBasedDispatchActionHandler.class);

	@Override
	public boolean isActionEnable(ActionBean aAction) {

		try {
			return canExecuteAction(aAction);
		} catch (Exception e) {
			logger.error("check role purview error", e);
			throw new RuntimeException(e);
		}

	}

	public boolean canExecuteAction(ActionBean aAction)
			throws Exception{
		return true;
	}

}
