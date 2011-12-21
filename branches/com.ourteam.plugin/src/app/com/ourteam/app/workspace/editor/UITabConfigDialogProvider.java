package com.ourteam.app.workspace.editor;

import java.util.Iterator;
import java.util.List;

import net.ui.eclipse.utils.AbstractDialogProvider;
import net.ui.model.tab.TabConfig;
import net.ui.model.tab.TabProperty;
import net.ui.model.tab.TabbedPaneConfig;

import org.apache.commons.beanutils.PropertyUtils;
import org.eclipse.swt.widgets.Composite;

import com.ourteam.app.workspace.ui.UITabDesignComposite;

public class UITabConfigDialogProvider extends AbstractDialogProvider {

	private TabbedPaneConfig tabbedPaneConfig;

	private UITabDesignComposite uiTabDesignComposite;

	public UITabConfigDialogProvider(TabbedPaneConfig tabbedPaneConfig) {
		super();
		this.tabbedPaneConfig = tabbedPaneConfig;
	}

	@Override
	public void createContentComposite(Composite parent) throws Exception {

		TabbedPaneConfig tmpTabbedPaneConfig = new TabbedPaneConfig();

		copyTabConfig(tmpTabbedPaneConfig, this.tabbedPaneConfig);

		uiTabDesignComposite = new UITabDesignComposite(parent,
				tmpTabbedPaneConfig);
	}

	@Override
	public String getTitle() {
		return "编辑TAB配置";
	}

	@Override
	public boolean doOkPressed() throws Exception {
		
		uiTabDesignComposite.applyChange();

		this.tabbedPaneConfig.getTabPageList().clear();

		copyTabConfig(this.tabbedPaneConfig, uiTabDesignComposite
				.getInitHelper().getTabbedPaneConfig());

		return true;
	}

	protected void copyTabConfig(TabbedPaneConfig dest, TabbedPaneConfig orig)
			throws Exception {
		PropertyUtils.copyProperties(dest, orig);

		List<TabConfig> tabConfigs = orig.getTabPageList();

		for (Iterator<TabConfig> iterator = tabConfigs.iterator(); iterator
				.hasNext();) {
			TabConfig tabConfig = iterator.next();

			TabConfig tmpTabConfig = new TabConfig();

			PropertyUtils.copyProperties(tmpTabConfig, tabConfig);

			List<TabProperty> tabProperties = tabConfig.getProperties();

			for (Iterator<TabProperty> iterator2 = tabProperties.iterator(); iterator2
					.hasNext();) {
				TabProperty tabProperty = iterator2.next();

				TabProperty tmpTabProperty = new TabProperty();

				PropertyUtils.copyProperties(tmpTabProperty, tabProperty);

				tmpTabConfig.addProperty(tmpTabProperty);

			}

			dest.addTab(tmpTabConfig);
		}

	}

}
