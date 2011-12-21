package net.ui.eclipse.utils;

import java.util.Map;

import net.ui.UIConfigFactory;
import net.ui.eclipse.form.GridFormComposite;
import net.ui.eclipse.form.IFormFieldStatusChangeListener;
import net.ui.eclipse.form.IFormOptionListDataProvider;
import net.ui.model.form.FormBean;

import org.eclipse.swt.widgets.Composite;

public abstract class AbstractFormDialogProvider<T> extends
		AbstractDialogProvider {

	private GridFormComposite<T> formComposite;

	private T formDataModel;

	public AbstractFormDialogProvider(T formDataModel) {
		super();
		this.formDataModel = formDataModel;
	}

	abstract protected String getFormConfigId();

	protected FormBean getFormBean() {
		return UIConfigFactory.getInstance().getFormConfig(getFormConfigId());
	}

	@Override
	public void createContentComposite(Composite parent) {

		FormBean formBean = getFormBean();

		formComposite = new GridFormComposite<T>(parent, formBean) {

			@Override
			protected void initFormOptionListDataProviders(
					Map<String, IFormOptionListDataProvider> listDataProiverMap) {
				super.initFormOptionListDataProviders(listDataProiverMap);
				AbstractFormDialogProvider.this
						.initFormOptionListDataProviders(listDataProiverMap);
			}

			@Override
			protected FormBean getRefFormBean(String formId) {
				return AbstractFormDialogProvider.this.getRefFormBean(formId);
			}

		};

		IFormFieldStatusChangeListener fieldStatusChangeListener = getFormFieldStatusChangeListener();

		if (fieldStatusChangeListener != null) {
			formComposite
					.addFieldStatusChangeListener(fieldStatusChangeListener);
		}

		formComposite.setFormDataModel(formDataModel);

		formComposite.setFormStatus(getFormStatus());
		
		formComposite.pack();

	}

	protected FormBean getRefFormBean(String formId) {
		return UIConfigFactory.getInstance().getFormConfig(formId);
	}

	protected String getFormStatus() {
		return null;
	}

	public IFormFieldStatusChangeListener getFormFieldStatusChangeListener() {
		return null;
	}

	protected void initFormOptionListDataProviders(
			Map<String, IFormOptionListDataProvider> listDataProiverMap) {

	}

	public GridFormComposite<T> getFormComposite() {
		return formComposite;
	}

	@Override
	public boolean doOkPressed() throws Exception {

		try {
			formComposite.validate();
			formDataModel = formComposite.getFormDataModel();
			return true;
		} catch (Exception e) {
			setErrorMessage(e.getLocalizedMessage());
			return false;
		}

	}

	public T getFormDataModel() {
		return formDataModel;
	}

	
}
