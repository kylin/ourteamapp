package net.ui.model.tab;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TabbedPaneConfig implements Serializable {

	private String id;

	private String desc;

	private List<TabConfig> tabList = new ArrayList<TabConfig>();

	public TabbedPaneConfig() {
	}

	public String getId() {
		return id;
	}

	public void setId(String aId) {
		this.id = aId;
	}

	public void addTab(TabConfig aTab) {
		this.tabList.add(aTab);
	}

	public void removeTab(TabConfig aTab) {
		this.tabList.remove(aTab);
	}

	public List<TabConfig> getTabPageList() {
		return tabList;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}