package com.ourteam.app.workspace.ui;

import net.ui.eclipse.tree.ISubNodeBuilder;
import net.ui.model.table.TableBean;

public class UITableRootSubNodeBuilder implements
		ISubNodeBuilder<TableBean, TableBean> {

	@Override
	public TableBean[] getSubNodes(TableBean aParentObject) throws Exception {
		return new TableBean[]{aParentObject};
	}

	@Override
	public String getSubNodeDefineId(TableBean nodeObject) {
		return "table";
	}

	@Override
	public String[] getSubNodeActionGroupIds(TableBean nodeObject) {
		return new String[]{"uiTableConfigActionGroup"};
	}

}
