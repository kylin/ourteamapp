package net.ui.eclipse.action;

import java.util.Iterator;
import java.util.List;

import net.ui.UIConfigFactory;
import net.ui.model.action.ActionBean;

import org.apache.commons.beanutils.MethodUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.widgets.Display;

public abstract class AbstractDispatchActionHandler extends
		AbstractActionHandler {
	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(AbstractDispatchActionHandler.class);

	public AbstractDispatchActionHandler() {
		super();
	}

	@Override
	public void fireAction(String actionId) throws Exception {

		ActionEvent actionEvent = new ActionEvent();

		actionEvent.setActionBean(UIConfigFactory.getInstance().getActionBean(
				actionId));

		doAction(actionEvent);
	}

	@Override
	public void doAction(ActionEvent actionEvent) throws Exception {

		ActionBean aAction = actionEvent.getActionBean();

		String handler = aAction.getHandler();

		if (StringUtils.isNotBlank(handler)) {
			try {

				MethodUtils.invokeMethod(getActionHandlerObject(), handler,
						actionEvent);

				List<IActionHandlerListener> listeners = getListeners();

				for (Iterator<IActionHandlerListener> iterator = listeners
						.iterator(); iterator.hasNext();) {
					IActionHandlerListener iActionHandlerListener = iterator
							.next();

					iActionHandlerListener.affterHandleAction(aAction);

				}

			} catch (NoSuchMethodException ex) {

				IStatus status = new Status(IStatus.ERROR,
						"com.ourteam.app.modelbase", 10, "invokeMethod Error",
						ex);
				ErrorDialog.openError(Display.getDefault().getActiveShell(),
						"invokeMethod Error", ex.getLocalizedMessage(), status);
				logger.error("invokeMethod Error", ex);
			}
		}
	}

	protected Object getActionHandlerObject() {
		return this;
	}

}
