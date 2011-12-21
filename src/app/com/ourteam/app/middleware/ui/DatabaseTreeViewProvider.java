package com.ourteam.app.middleware.ui;

import net.ui.UIConfigFactory;
import net.ui.eclipse.tree.AbstractTreeTableViewProvider;
import net.ui.model.table.TableBean;
import net.ui.model.tree.TreeBean;


public class DatabaseTreeViewProvider extends AbstractTreeTableViewProvider {
	@Override
	public TreeBean getTreeConfig() {
		return UIConfigFactory.getInstance().getTreeConfig(
				"/ui/middleware/db-tree.tree");
	}

	@Override
	public TableBean getTableConfig() {
		return UIConfigFactory.getInstance().getTableConfig(
				"databaseTreeTable");
	}

}
