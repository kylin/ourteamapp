package net.ui.eclipse.tabfloder;

import net.ui.eclipse.ICompositeInitHelper;
import net.ui.model.tab.TabConfig;

public interface ITabbedCompositeInitHelper extends ICompositeInitHelper {

	Object[] getTabLabelParameters(TabConfig tabConfig);
}
