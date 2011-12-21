package net.ui.eclipse.form;

/**
 * 表单可选数据列表提供者
 * 
 * @author kylin
 * 
 */
public interface IFormOptionListDataProvider<T> {

	T[] getOptionList(String aDataSrc) throws Exception;

	String getOptionLabel(T dataItem);
	
	Object getOptionData(T dataItem);
}
