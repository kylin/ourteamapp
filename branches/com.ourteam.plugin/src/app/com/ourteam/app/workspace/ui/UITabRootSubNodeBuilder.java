package com.ourteam.app.workspace.ui;

import net.ui.eclipse.tree.ISubNodeBuilder;
import net.ui.model.tab.TabbedPaneConfig;

public class UITabRootSubNodeBuilder implements
		ISubNodeBuilder<TabbedPaneConfig, TabbedPaneConfig> {

	@Override
	public TabbedPaneConfig[] getSubNodes(TabbedPaneConfig aParentObject)
			throws Exception {
		return new TabbedPaneConfig[]{aParentObject};
	}

	@Override
	public String getSubNodeDefineId(TabbedPaneConfig nodeObject) {
		return "UI_TAB";
	}

	@Override
	public String[] getSubNodeActionGroupIds(TabbedPaneConfig nodeObject) {
		return new String[]{"uiTabConfigActionGroup"};
	}

}
