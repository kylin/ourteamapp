package net.ui.eclipse.table;

public interface ITableCellListener<T> {

	void onTableCellClick(T row, String property,int x,int y);
}
