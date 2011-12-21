package net.ui.eclipse.action;

import java.util.Collection;

import net.ui.model.action.ActionBean;
import net.ui.model.action.ActionGroupBean;

import org.apache.commons.lang.ArrayUtils;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;

public class StatusBarBuilder extends AbstractActionGroupBuilder<IStatusLineManager> {

	public StatusBarBuilder(IStatusLineManager contributionManager,
			ActionGroupBean[] actionGroupBeans, IActionHandler actionHandler,
			ICustomActionControl customActionable) {
		super(contributionManager, actionGroupBeans, actionHandler,
				customActionable);

	}

	public StatusBarBuilder(IStatusLineManager contributionManager,
			Collection<ActionGroupBean> actionGroupBeans,
			IActionHandler actionHandler, ICustomActionControl customActionable) {
		super(contributionManager, actionGroupBeans, actionHandler,
				customActionable);

	}

	@Override
	protected void buildSubActionItems(IStatusLineManager contributionManager,
			ActionBean actionBean, final IActionHandler actionHandler) {

		CommandAction action = new CommandAction(actionBean);

		addActionItem(contributionManager, action);

		final ActionBean[] subActionBeans = getSubActionBeans(actionBean);

		if (ArrayUtils.isNotEmpty(subActionBeans)) {
			IMenuCreator menuCreator = new IMenuCreator() {

				private MenuManager dropDownMenuMgr;

				private MenuBuilder menuBuilder;

				private void createDropDownMenuMgr(IActionHandler actionHandler) {
					if (dropDownMenuMgr == null) {
						dropDownMenuMgr = new MenuManager();
						ActionGroupBean actionGroupBean = new ActionGroupBean();

						actionGroupBean.setActionBeans(subActionBeans);

						menuBuilder = new MenuBuilder(StatusBarBuilder.this,
								dropDownMenuMgr,
								new ActionGroupBean[] { actionGroupBean },
								actionHandler,
								StatusBarBuilder.this.getCustomActionable()) {

							@Override
							public IActionHandler getActionHandler() {
								return StatusBarBuilder.this.getActionHandler();
							}

						};
					}

					menuBuilder.updateActionStatus();
				}

				@Override
				public Menu getMenu(Menu parent) {
					createDropDownMenuMgr(StatusBarBuilder.this
							.getActionHandler());
					Menu menu = new Menu(parent);
					IContributionItem[] items = dropDownMenuMgr.getItems();
					for (int i = 0; i < items.length; i++) {
						IContributionItem item = items[i];
						IContributionItem newItem = item;
						if (item instanceof ActionContributionItem) {
							newItem = new ActionContributionItem(
									((ActionContributionItem) item).getAction());
						}
						newItem.fill(menu, -1);
					}
					return menu;
				}

				@Override
				public Menu getMenu(Control parent) {
					createDropDownMenuMgr(StatusBarBuilder.this
							.getActionHandler());
					return dropDownMenuMgr.createContextMenu(parent);
				}

				@Override
				public void dispose() {
					dropDownMenuMgr.dispose();
				}
			};

			action.setMenuCreator(menuCreator);
		}
	}

}
