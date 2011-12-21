package net.ui.eclipse.action;

import java.util.Hashtable;
import java.util.Map;

import net.ui.UIConfigFactory;
import net.ui.eclipse.ImageChache;
import net.ui.eclipse.LocalHelper;
import net.ui.model.action.ActionBean;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;

/**
 * @author qilin
 * 
 */
public class CommandAction extends Action {
	/**
	 * Logger for this class
	 */
	private static Log log = LogFactory.getLog(CommandAction.class);

	private String command;

	private Object eventSource;

	private Map properties = new Hashtable();

	private ActionBean actionConfig;

	private IActionHandler actionHandler;

	public CommandAction(final ActionBean actionConfig) {
		super(UIConfigFactory.getInstance().getLocalMessage(
				actionConfig.getLabelKey(), actionConfig.getLabel(),
				LocalHelper.getLocale()), getActionStyle(actionConfig));
		this.actionConfig = actionConfig;

		if (this.actionConfig != null) {
			setId(this.actionConfig.getId());

			if (StringUtils.isNotBlank(this.actionConfig.getIcon())) {
				setIcon(this.actionConfig.getIcon());
			}

		}

	}

	public static int getActionStyle(final ActionBean actionConfig) {
		int style = IAction.AS_PUSH_BUTTON;

		if ("check".equalsIgnoreCase(actionConfig.getType())) {
			style = IAction.AS_CHECK_BOX;
		} else if ("radio".equalsIgnoreCase(actionConfig.getType())) {
			style = IAction.AS_RADIO_BUTTON;
		} else if ("separator".equalsIgnoreCase(actionConfig.getType())) {
			style = IAction.AS_UNSPECIFIED;
		} else if (ArrayUtils.isNotEmpty(actionConfig.getSubActionBeans())
				|| StringUtils.isNotBlank(actionConfig
						.getSubActionBeansBuilder())) {
			style = IAction.AS_DROP_DOWN_MENU;
		}

		return style;
	}

	public void setEventSource(Object aEventSource) {
		eventSource = aEventSource;
	}

	/**
	 * @param text
	 */
	public CommandAction(String text) {
		super(text);

	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public void addProperty(Object aKey, Object aValue) {
		this.properties.put(aKey, aValue);
	}

	public void removeProperty(Object aKey) {
		this.properties.remove(aKey);
	}

	public Object getProperty(Object aKey) {
		return this.properties.get(aKey);
	}

	public Object getEventSource() {
		return this.eventSource;
	}

	public void runWithEvent(Event event) {

		if (getActionHandler() != null) {
			try {

				ActionEvent actionEvent = new ActionEvent();
				
				actionEvent.setEventSource(event.widget);
				
				this.eventSource = event.widget;

				actionEvent.setActionBean(actionConfig);

				actionEvent.setChecked(this.isChecked());

				if (StringUtils.isNotBlank(this.actionConfig
						.getConfirmInfoKey())) {
					if (MessageDialog.openConfirm(
							Display.getDefault().getActiveShell(),
							UIConfigFactory.getInstance().getLocalMessage(
									"message.confirm", LocalHelper.getLocale()),
							this.actionConfig.getConfirmInfoKey()) == false) {
						return;
					}
				}

				if (isChecked() == false
						&& (getStyle() & IAction.AS_RADIO_BUTTON) != 0) {
					return;
				}

				getActionHandler().doAction(actionEvent);

			} catch (Exception ex) {
				log.error("do action error", ex);
				throw new RuntimeException(ex);
			}

		}

	}

	public void setIcon(String aIcon) {
		this.setImageDescriptor(ImageDescriptor.createFromImage((ImageChache
				.getImage(aIcon))));
	}

	public IActionHandler getActionHandler() {
		return actionHandler;
	}

	public void setActionHandler(IActionHandler actionHandler) {
		this.actionHandler = actionHandler;
	}

	public ActionBean getActionConfig() {
		return actionConfig;
	}

	@Override
	public boolean isEnabled() {
		if (getActionHandler() == null) {
			return super.isEnabled();
		} else {
			return getActionHandler().isActionEnable(actionConfig);
		}
	}
}
