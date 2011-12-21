package net.ui.eclipse.widget;

public interface ISearchCallback<T extends SearchDataModel> {

	void doSearch(T searchDataModel) throws Exception;
}
