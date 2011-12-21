package net.ui.eclipse.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.ui.model.action.ActionBean;

public abstract class AbstractActionHandler implements IActionHandler {

	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(AbstractActionHandler.class);

	private List<IActionHandlerListener> listeners = new ArrayList<IActionHandlerListener>();

	@Override
	public void doInit() throws Exception {

	}

	@Override
	public boolean isActionVisible(ActionBean aAction) {
		try {
			return ((ICanExecuteAction) this).canExecuteAction(aAction);
		} catch (Exception e) {
			logger.error("check role purview error", e);
			throw new RuntimeException(e);
		}
	}

	@Override
	public boolean isActionSelected(ActionBean aAction) {
		return false;
	}

	@Override
	public String getActionLabel(ActionBean aAction) {
		return null;
	}

	public List<IActionHandlerListener> getListeners() {
		return listeners;
	}

	@Override
	public void addListener(IActionHandlerListener actionHandlerListener) {
		if (this.listeners.contains(actionHandlerListener) == false) {
			this.listeners.add(actionHandlerListener);
		}
	}

	@Override
	public void removeListener(IActionHandlerListener actionHandlerListener) {
		this.listeners.remove(actionHandlerListener);

	}

}
