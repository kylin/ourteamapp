package com.ourteam.app.modelbase.editor;

import net.ui.eclipse.wizard.AbstractReflectWizardProvider;
import net.ui.eclipse.wizard.IReflectWizardPageControlHelper;

import org.eclipse.jface.wizard.IWizard;
import org.eclipse.swt.widgets.Control;

import com.ourteam.app.modelbase.ui.BusinessDomainSearchComposite;
import com.ourteam.modelbase.domain.BusinessDomainBean;
import com.ourteam.modelbase.domain.BusinessPackageBean;
import com.ourteam.modelbase.service.BusinessPackageServiceFactory;
import com.ourteam.modelbase.service.IBusinessPackageService;

public class MoveObjectPackageWizardProvider extends
		AbstractReflectWizardProvider implements
		IReflectWizardPageControlHelper<BusinessDomainSearchComposite> {

	private BusinessDomainSearchComposite businessDomainSearchComposite;

	private BusinessPackageBean businessPackageBean;

	private static final IBusinessPackageService BUSINESS_PACKAGE_SERVICE = BusinessPackageServiceFactory
			.getBusinessPackageService();

	public MoveObjectPackageWizardProvider(
			BusinessPackageBean businessPackageBean) {
		super();
		this.businessPackageBean = businessPackageBean;
	}

	protected String getWizardConfigId() {
		return "moveObjectPackageWizard";
	}

	@Override
	public void doFinish(IWizard wizard) throws Exception {

		BusinessDomainBean businessDomainBean = this.businessDomainSearchComposite
				.getSelectedSearchResults().get(0);

		this.businessPackageBean.setBusinessDomainId(businessDomainBean
				.getBusinessDomainId());

		BUSINESS_PACKAGE_SERVICE
				.modifyBusinessPackage(this.businessPackageBean);

	}

	@Override
	public boolean canFinsh(IWizard wizard) {
		return businessDomainSearchComposite.getSelectedSearchResults().size() != 0;
	}

	@Override
	public void doNextWizardPageControl(BusinessDomainSearchComposite control) {

	}

	@Override
	public boolean canFlipToNextPageControl(
			BusinessDomainSearchComposite control) {
		return false;
	}

	@Override
	public void onActiveWizardPageControlChanged(
			BusinessDomainSearchComposite control) {

	}

	@Override
	public void initWizardPageControl(BusinessDomainSearchComposite control) {
		businessDomainSearchComposite = control;

		businessDomainSearchComposite
				.setExcludeBusinessDomainIds(new long[] { this.businessPackageBean
						.getBusinessDomainId() });

		businessDomainSearchComposite.addSelectionChangedListener(this);

	}

	@Override
	protected Object getReflectObject(Control control) {
		return this;
	}

}
