package net.ui.eclipse.table;

import net.ui.model.table.ColumnBean;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.Table;


public interface TableCompositeListener {

	public CellEditor getCellEcitor(Table aParentTable,ColumnBean aColumnConfig);
}
