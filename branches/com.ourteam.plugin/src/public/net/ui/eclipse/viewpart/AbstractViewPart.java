package net.ui.eclipse.viewpart;

import java.util.ArrayList;
import java.util.List;

import net.ui.UIConfigFactory;
import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.action.IActionHandlerListener;
import net.ui.eclipse.action.ICustomActionControl;
import net.ui.eclipse.action.MenuBuilder;
import net.ui.eclipse.action.ToolBarBuilder;
import net.ui.model.action.ActionBean;
import net.ui.model.action.ActionGroupBean;

import org.apache.commons.lang.ArrayUtils;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.part.ViewPart;

public abstract class AbstractViewPart extends ViewPart implements
		IActionHandlerListener {

	protected IActionHandler actionHandler;

	private MenuBuilder menuBuilder;

	private ToolBarBuilder toolBarBuilder;

	public AbstractViewPart() {
		super();
	}

	public void setViewSite(IWorkbenchPartSite site) {
		setSite(site);
	}

	protected Shell getShell() {
		return getSite().getShell();
	}

	abstract protected IActionHandler getActionHandler(ViewPart viewPart);

	protected abstract String[] getToolbarActionGrous();

	protected abstract String[] getMenuActionGrous();

	protected abstract void doCreatePartControl(Composite parent);

	protected void createToolBar(IToolBarManager toolBarManager) {

		toolBarManager.removeAll();

		String[] actionGroupIds = getToolbarActionGrous();

		List<ActionGroupBean> actionGroupBeans = new ArrayList<ActionGroupBean>();

		if (ArrayUtils.isNotEmpty(actionGroupIds)) {

			for (int i = 0; i < actionGroupIds.length; i++) {
				String actionGroupId = actionGroupIds[i];

				actionGroupBeans.add(UIConfigFactory.getInstance()
						.getActionGroupConfig(actionGroupId));
			}

		}

		toolBarBuilder = new ToolBarBuilder(toolBarManager, actionGroupBeans,
				actionHandler, getCustomActionControl());

	}

	protected ICustomActionControl getCustomActionControl() {
		return null;
	}

	protected void createMenus(IMenuManager menuManager) {

		menuManager.removeAll();

		String[] actionGroupIds = getMenuActionGrous();

		List<ActionGroupBean> actionGroupBeans = new ArrayList<ActionGroupBean>();

		if (ArrayUtils.isNotEmpty(actionGroupIds)) {

			for (int i = 0; i < actionGroupIds.length; i++) {
				String actionGroupId = actionGroupIds[i];

				actionGroupBeans.add(UIConfigFactory.getInstance()
						.getActionGroupConfig(actionGroupId));
			}

		}

		menuBuilder = new MenuBuilder(menuManager, actionGroupBeans,
				actionHandler, null);
	}

	public void createPartControl(Composite parent) {

		actionHandler = getActionHandler(this);

		if (actionHandler != null) {

			actionHandler.addListener(this);
		}

		IToolBarManager toolBarManager = getViewSite().getActionBars()
				.getToolBarManager();

		createToolBar(toolBarManager);

		IMenuManager menuManager = getViewSite().getActionBars()
				.getMenuManager();

		createMenus(menuManager);

		doCreatePartControl(parent);

		updateActionStatus();

	}

	public void updatePartActions() {

		IToolBarManager toolBarManager = getViewSite().getActionBars()
				.getToolBarManager();

		toolBarManager.removeAll();

		createToolBar(toolBarManager);

	}

	public void updatePartMenus() {
		IMenuManager menuManager = getViewSite().getActionBars()
				.getMenuManager();

		menuManager.removeAll();

		createMenus(menuManager);
	}

	protected void updateActionStatus() {

		if (toolBarBuilder != null) {
			toolBarBuilder.updateActionStatus();
		}

		if (menuBuilder != null) {
			menuBuilder.updateActionStatus();
		}

	}

	public IActionHandler getActionHandler() {
		return actionHandler;
	}

	public MenuBuilder getMenuBuilder() {
		return menuBuilder;
	}

	public ToolBarBuilder getToolBarBuilder() {
		return toolBarBuilder;
	}

	@Override
	public void affterHandleAction(ActionBean actionBean) {
		this.updateActionStatus();
	}

	@Override
	public void setPartName(String partName) {
		super.setPartName(partName);
	}

	@Override
	public void setTitleImage(Image titleImage) {
		super.setTitleImage(titleImage);
	}

	@Override
	public void setTitleToolTip(String toolTip) {
		super.setTitleToolTip(toolTip);
	}

	@Override
	public void setFocus() {

	}

}