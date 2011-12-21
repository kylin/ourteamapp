package com.ourteam.app.workspace.ui;

import java.util.List;

import net.ui.eclipse.tree.ISubNodeBuilder;
import net.ui.model.tab.TabConfig;
import net.ui.model.tab.TabbedPaneConfig;

public class UITabItemSubNodeBuilder implements
		ISubNodeBuilder<TabbedPaneConfig, TabConfig> {

	@Override
	public TabConfig[] getSubNodes(TabbedPaneConfig aParentObject)
			throws Exception {
		List<TabConfig> tabConfigs = aParentObject.getTabPageList();

		return tabConfigs.toArray(new TabConfig[tabConfigs.size()]);
	}

	@Override
	public String getSubNodeDefineId(TabConfig nodeObject) {
		return "UI_TAB_ITEM";
	}

	@Override
	public String[] getSubNodeActionGroupIds(TabConfig nodeObject) {
		return new String[]{"uiTabItemConfigActionGroup"};
	}

}
