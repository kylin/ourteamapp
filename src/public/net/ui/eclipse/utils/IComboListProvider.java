package net.ui.eclipse.utils;

public interface IComboListProvider<T> {
	
	T[] getDataList() throws Exception;
	
	String getDataLabel(T dataItem);
	
	boolean isAllowNull();
	
	Object getNullValue();

}
