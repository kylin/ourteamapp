package net.ui.eclipse.tree;

import net.ui.model.table.ColumnBean;
import net.ui.model.table.TableBean;

public abstract class AbstractTreeTableViewProvider extends
		AbstractTreeViewProvider {

	private static TableBean tableBean;

	public AbstractTreeTableViewProvider() {
		super();
	}

	public AbstractTreeTableViewProvider(int extendStyle) {
		super(extendStyle);
	}

	@Override
	public TableBean getTableConfig() {
		if (tableBean == null) {
			tableBean = new TableBean();
			tableBean.setId("defaultTreeTable");
			ColumnBean columnBean = new ColumnBean();
			columnBean.setProperty("__name");
			columnBean.setWidth("300");
			tableBean.addColumn(columnBean);
		}

		return tableBean;

	}

}
