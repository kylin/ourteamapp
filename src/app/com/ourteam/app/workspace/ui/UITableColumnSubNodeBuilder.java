package com.ourteam.app.workspace.ui;

import net.ui.eclipse.tree.ISubNodeBuilder;
import net.ui.model.table.ColumnBean;
import net.ui.model.table.TableBean;

public class UITableColumnSubNodeBuilder implements
		ISubNodeBuilder<TableBean, ColumnBean> {

	@Override
	public ColumnBean[] getSubNodes(TableBean aParentObject) throws Exception {
		return aParentObject.getColumns();
	}

	@Override
	public String getSubNodeDefineId(ColumnBean nodeObject) {
		return "column";
	}

	@Override
	public String[] getSubNodeActionGroupIds(ColumnBean nodeObject) {
		return new String[]{"uiTableColumnConfigActionGroup"};
	}

}
