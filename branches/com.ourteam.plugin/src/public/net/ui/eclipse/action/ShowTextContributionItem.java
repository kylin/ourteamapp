package net.ui.eclipse.action;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.ContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.StatusLineContributionItem;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;

public class ShowTextContributionItem extends ContributionItem {

	private String[] excludeItemIds;

	public ShowTextContributionItem(String[] excludeItemIds) {
		super();
		if (excludeItemIds != null) {
			this.excludeItemIds = excludeItemIds;
		} else {
			this.excludeItemIds = new String[0];
		}

	}

	@Override
	public void fill(ToolBar parent, int index) {
		ToolItem[] toolItems = parent.getItems();
		for (ToolItem toolItem : toolItems) {
			if (toolItem.getData() instanceof ActionContributionItem) {
				ActionContributionItem contributionItem = (ActionContributionItem) toolItem
						.getData();
				IAction action = contributionItem.getAction();

				if (ArrayUtils.contains(this.excludeItemIds, action.getId())) {
					continue;
				}

				if (StringUtils.isEmpty(toolItem.getText())
						&& StringUtils.isNotEmpty(action.getText())) {
					toolItem.setText(action.getText());
				}
			} else if (toolItem.getData() instanceof StatusLineContributionItem) {
				StatusLineContributionItem contributionItem = (StatusLineContributionItem) toolItem
						.getData();

				if (ArrayUtils.contains(this.excludeItemIds,
						contributionItem.getId())) {
					continue;
				}

				if (StringUtils.isEmpty(toolItem.getText())
						&& StringUtils.isNotEmpty(contributionItem.getText())) {
					toolItem.setText(contributionItem.getText());
				}

			}
		}

	}
}
