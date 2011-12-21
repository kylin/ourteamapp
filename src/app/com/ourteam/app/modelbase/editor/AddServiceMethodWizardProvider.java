package com.ourteam.app.modelbase.editor;

import net.ui.eclipse.form.GridFormComposite;
import net.ui.eclipse.wizard.AbstractReflectWizardProvider;
import net.ui.eclipse.wizard.IReflectWizardPageControlHelper;

import org.eclipse.jface.wizard.IWizard;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Control;

import com.ourteam.modelbase.domain.ServiceFunctionBean;
import com.ourteam.modelbase.service.BusinessObjectServiceFactory;
import com.ourteam.modelbase.service.IBusinessObjectService;

public class AddServiceMethodWizardProvider extends
		AbstractReflectWizardProvider implements
		IReflectWizardPageControlHelper<GridFormComposite<ServiceFunctionBean>> {
	
	private static final IBusinessObjectService BUSINESS_OBJECT_SERVICE = BusinessObjectServiceFactory
			.getBusinessObjectService();

	private long serviceObjectId;

	private GridFormComposite<ServiceFunctionBean> formComposite;

	private ServiceFunctionBean serviceFunctionBean = new ServiceFunctionBean();

	public AddServiceMethodWizardProvider(long serviceObjectId) {
		super();
		this.serviceObjectId = serviceObjectId;
	}

	protected String getWizardConfigId() {
		return "addServiceMethodWizard";
	}

	@Override
	public void doFinish(IWizard wizard) throws Exception {
		formComposite.getFormDataModel();
		this.serviceFunctionBean.setObjectId(serviceObjectId);

		BUSINESS_OBJECT_SERVICE.addNewServiceFunction(this.serviceFunctionBean);

	}

	@Override
	public boolean canFinsh(IWizard wizard) {
		try {
			formComposite.validate();
			setMessage("");
			return true;
		} catch (Exception e) {
			setErrorMessage(e.getLocalizedMessage());
			return false;
		}
	}

	@Override
	public void doNextWizardPageControl(
			GridFormComposite<ServiceFunctionBean> control) {

	}

	@Override
	public boolean canFlipToNextPageControl(
			GridFormComposite<ServiceFunctionBean> control) {
		try {
			control.validate();
			setMessage("");
			return true;
		} catch (Exception e) {
			setErrorMessage(e.getLocalizedMessage());
			return false;
		}
	}

	@Override
	public void onActiveWizardPageControlChanged(
			GridFormComposite<ServiceFunctionBean> control) {

	}

	@Override
	public void initWizardPageControl(
			GridFormComposite<ServiceFunctionBean> control) {

		formComposite = control;

		formComposite.setFormDataModel(this.serviceFunctionBean);

		formComposite.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent event) {
				formComposite.getFormDataModel();
				updateWizardButtons();
			}
		});

	}

	@Override
	protected Object getReflectObject(Control control) {
		return this;
	}

}
