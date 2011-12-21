package com.ourteam.app.workspace.editor;

import net.ui.model.constlist.ListDataContainer;

public class ListDataContainerFormBean extends ListDataContainer {

	private boolean staticList = false;
	
	public boolean isStaticList() {
		return staticList;
	}

	public void setStaticList(boolean staticList) {
		this.staticList = staticList;
	}

	@Override
	public void setType(String type) {
		super.setType(type);
		this.staticList = "static".equalsIgnoreCase(type);
	}

}