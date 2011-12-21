package com.ourteam.app.modelbase.editor;

import net.ui.UIConfigFactory;
import net.ui.eclipse.form.GridFormComposite;
import net.ui.eclipse.wizard.AbstractReflectWizardProvider;
import net.ui.eclipse.wizard.IReflectWizardPageControlHelper;
import net.ui.model.tab.TabbedPaneConfig;

import org.eclipse.jface.wizard.IWizard;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Control;

import com.ourteam.modelbase.service.BusinessDomainServiceFactory;
import com.ourteam.modelbase.service.BusinessObjectServiceFactory;
import com.ourteam.modelbase.service.BusinessPackageServiceFactory;
import com.ourteam.modelbase.service.IBusinessDomainService;
import com.ourteam.modelbase.service.IBusinessObjectService;
import com.ourteam.modelbase.service.IBusinessPackageService;

public abstract class AbstractAddModelObjectWizardProvider<T> extends
		AbstractReflectWizardProvider {

	private static final IBusinessObjectService businessObjectService = BusinessObjectServiceFactory
			.getBusinessObjectService();

	private static final IBusinessDomainService businessDomainService = BusinessDomainServiceFactory
			.getBusinessDomainService();

	private static final IBusinessPackageService businessPackageService = BusinessPackageServiceFactory
			.getBusinessPackageService();

	private GridFormComposite<T> formComposite;

	abstract protected String getWizardConfigId();

	abstract protected T getBusinessObjectDataModel();

	abstract protected void addBusinessObject(T businessObject)
			throws Exception;

	@Override
	public TabbedPaneConfig getWizardConfig() {
		return UIConfigFactory.getInstance().getTabConfig(getWizardConfigId());
	}

	@Override
	public void doFinish(IWizard wizard) throws Exception {
		addBusinessObject(this.formComposite.getFormDataModel());
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

	public static IBusinessObjectService getBusinessObjectService() {
		return businessObjectService;
	}

	public static IBusinessDomainService getBusinessDomainService() {
		return businessDomainService;
	}

	public static IBusinessPackageService getBusinessPackageService() {
		return businessPackageService;
	}

	public GridFormComposite<T> getFormComposite() {
		return formComposite;
	}

	@Override
	protected Object getReflectObject(Control control) {
		if (control instanceof GridFormComposite) {
			return new ModelObjectInfoFormControlHelper();
		} else {
			return this;
		}
	}

	public class ModelObjectInfoFormControlHelper implements
			IReflectWizardPageControlHelper<GridFormComposite<T>> {

		@Override
		public void doNextWizardPageControl(GridFormComposite<T> control) {

		}

		@Override
		public boolean canFlipToNextPageControl(GridFormComposite<T> control) {
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
				GridFormComposite<T> control) {

		}

		@Override
		public void initWizardPageControl(GridFormComposite<T> control) {

			formComposite = control;

			formComposite.setFormDataModel(getBusinessObjectDataModel());

			formComposite.addModifyListener(new ModifyListener() {

				@Override
				public void modifyText(ModifyEvent event) {
					formComposite.getFormDataModel();
					updateWizardButtons();
				}
			});
		}

	}

}
