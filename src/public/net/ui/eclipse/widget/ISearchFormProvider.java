package net.ui.eclipse.widget;

import java.util.Map;

import net.ui.eclipse.form.IFormFieldStatusChangeListener;
import net.ui.eclipse.form.IFormOptionListDataProvider;

import org.eclipse.swt.widgets.Composite;

public interface ISearchFormProvider<T extends SearchDataModel> {

	public String getSearchFormConfigId();

	public IFormFieldStatusChangeListener getFormFieldStatusChangeListener();

	public void initFormOptionListDataProviders(
			Map<String, IFormOptionListDataProvider> listDataProiverMap);

	public void createContent(Composite parent);

	public void addSearchCallback(ISearchCallback<T> searchCallback);

	public void removeSearchCallback(ISearchCallback<T> searchCallback);
}
