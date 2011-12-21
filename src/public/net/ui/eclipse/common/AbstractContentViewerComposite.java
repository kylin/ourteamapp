package net.ui.eclipse.common;

import net.ui.UIConfigFactory;
import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.action.MenuBuilder;
import net.ui.model.action.ActionGroupBean;

import org.apache.commons.lang.ArrayUtils;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.swt.widgets.Composite;

abstract public class AbstractContentViewerComposite extends Composite {

	private IActionHandler actionHandler;

	private boolean showActionMenu = true;

	private MenuManager menuManager;

	private IMenuListener menuListener;

	private MenuBuilder contextMenuBuilder;

	public AbstractContentViewerComposite(Composite parent, int style) {
		super(parent, style);
		menuManager = new MenuManager();
		menuManager.setRemoveAllWhenShown(true);
		setShowActionMenu(true);
	}

	public IActionHandler getActionHandler() {
		return actionHandler;
	}

	public void setActionHandler(IActionHandler actionHandler) {
		this.actionHandler = actionHandler;
		if (this.actionHandler != null && contextMenuBuilder != null) {
			contextMenuBuilder.setActionHandler(actionHandler);
		}
	}

	public boolean isShowActionMenu() {
		return showActionMenu;
	}

	public void setShowActionMenu(boolean showActionMenu) {
		this.showActionMenu = showActionMenu;
		this.menuManager.setVisible(this.showActionMenu);
		if (showActionMenu == false && menuListener != null) {
			menuManager.removeMenuListener(menuListener);
			menuListener = null;
		} else {
			menuManager.addMenuListener(menuListener = new IMenuListener() {
				@Override
				public void menuAboutToShow(IMenuManager manager) {
					buildContextMenu(manager);
				}
			});
		}
	}

	public MenuManager getMenuManager() {
		return menuManager;
	}

	abstract public String[] getSelectedItemActionGroupIds();

	protected void buildContextMenu(IMenuManager menuMgr) {

		String[] selectedItemActionIds = getSelectedItemActionGroupIds();

		if (ArrayUtils.isNotEmpty(selectedItemActionIds)
				&& this.isShowActionMenu()) {

			ActionGroupBean[] actionGroupBeans = new ActionGroupBean[selectedItemActionIds.length];

			for (int i = 0; i < selectedItemActionIds.length; i++) {
				String actionGroupId = selectedItemActionIds[i];

				actionGroupBeans[i] = UIConfigFactory.getInstance()
						.getActionGroupConfig(actionGroupId);

			}

			contextMenuBuilder = new MenuBuilder(menuMgr, actionGroupBeans,
					getActionHandler(), null);

			contextMenuBuilder.updateActionStatus();
		}
	}

	abstract public StructuredViewer getViewer();

	abstract public void reLoadContent();

}
