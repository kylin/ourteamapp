package net.ui.eclipse.table;

import net.ui.eclipse.ICompositeProvider;
import net.ui.model.table.TableBean;

public interface ITableViewProvider extends ICompositeProvider {

	TableBean getTableConfig();
	
	boolean isEditable();
}
