package com.ourteam.app.modelbase.editor;

import net.ui.eclipse.form.GridFormComposite;
import net.ui.eclipse.wizard.AbstractReflectWizardProvider;
import net.ui.eclipse.wizard.DefaultGridFormWizardPageControlHelper;

import org.eclipse.jface.wizard.IWizard;
import org.eclipse.swt.widgets.Control;

import com.ourteam.modelbase.domain.BusinessTemplateBean;
import com.ourteam.modelbase.service.BusinessTemplateServiceFactory;
import com.ourteam.modelbase.service.IBusinessTemplateService;

public class AddBusinessTemplateWizardProvider extends
		AbstractReflectWizardProvider {

	private static final IBusinessTemplateService BUSINESS_TEMPLATE_SERVICE = BusinessTemplateServiceFactory
			.getBusinessTemplateService();

	private DefaultGridFormWizardPageControlHelper<BusinessTemplateBean> businessTemplatePageHepler;

	private BusinessTemplateBean businessTemplateBean;

	public AddBusinessTemplateWizardProvider(
			BusinessTemplateBean businessTemplateBean) {
		super();
		this.businessTemplateBean = businessTemplateBean;
	}

	protected String getWizardConfigId() {
		return "addBusinessTemplateWizard";
	}

	@Override
	public void doFinish(IWizard wizard) throws Exception {

		BUSINESS_TEMPLATE_SERVICE
				.addBusinessTemplate(this.businessTemplateBean);

	}

	@Override
	public boolean canFinsh(IWizard wizard) {
		try {
			businessTemplatePageHepler.getGridFormComposite().validate();
			setMessage("");
			return true;
		} catch (Exception e) {
			setErrorMessage(e.getLocalizedMessage());
			return false;
		}
	}

	@Override
	protected Object getReflectObject(Control control) {
		if (control instanceof GridFormComposite) {
			return businessTemplatePageHepler = new DefaultGridFormWizardPageControlHelper<BusinessTemplateBean>(
					this, businessTemplateBean);
		}
		return this;
	}
}
