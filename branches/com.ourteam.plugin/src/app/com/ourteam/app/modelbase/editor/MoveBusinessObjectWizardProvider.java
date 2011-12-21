package com.ourteam.app.modelbase.editor;

import net.ui.eclipse.wizard.AbstractReflectWizardProvider;
import net.ui.eclipse.wizard.IReflectWizardPageControlHelper;

import org.eclipse.jface.wizard.IWizard;
import org.eclipse.swt.widgets.Control;

import com.ourteam.app.modelbase.ui.ModelPackageSearchComposite;
import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;
import com.ourteam.modelbase.domain.BusinessPackageBean;
import com.ourteam.modelbase.domain.BusinessPackageTypeEnum;
import com.ourteam.modelbase.service.BusinessObjectServiceFactory;
import com.ourteam.modelbase.service.IBusinessObjectService;

public class MoveBusinessObjectWizardProvider extends
		AbstractReflectWizardProvider implements
		IReflectWizardPageControlHelper<ModelPackageSearchComposite> {

	private ModelPackageSearchComposite modelPackageSearchComposite;

	private BusinessObjectBean businessObjectBean;

	private static final IBusinessObjectService BUSINESS_OBJECT_SERVICE = BusinessObjectServiceFactory
			.getBusinessObjectService();

	public MoveBusinessObjectWizardProvider(
			BusinessObjectBean businessObjectBean) {
		super();
		this.businessObjectBean = businessObjectBean;
	}

	protected String getWizardConfigId() {
		return "moveBusinessObjectWizard";
	}

	@Override
	public void doFinish(IWizard wizard) throws Exception {

		BusinessPackageBean businessPackageBean = this.modelPackageSearchComposite
				.getSelectedSearchResults().get(0);

		this.businessObjectBean.setPackageId(businessPackageBean
				.getBusinessPackageId());

		BUSINESS_OBJECT_SERVICE.modifyBusinessObject(this.businessObjectBean);

	}

	@Override
	public boolean canFinsh(IWizard wizard) {
		return this.modelPackageSearchComposite.getSelectedSearchResults()
				.size() != 0;
	}

	@Override
	public void doNextWizardPageControl(ModelPackageSearchComposite control) {

	}

	@Override
	public boolean canFlipToNextPageControl(ModelPackageSearchComposite control) {
		return false;
	}

	@Override
	public void onActiveWizardPageControlChanged(
			ModelPackageSearchComposite control) {

	}

	@Override
	public void initWizardPageControl(ModelPackageSearchComposite control) {

		this.modelPackageSearchComposite = control;

		if (BusinessObjectTypeEnum.DAO.getName().equals(
				this.businessObjectBean.getType())) {
			modelPackageSearchComposite
					.setPackageTypeEnums(new BusinessPackageTypeEnum[] { BusinessPackageTypeEnum.BUSINESS_PACKAGE });
		} else if (BusinessObjectTypeEnum.PERSISTENT.getName().equals(
				this.businessObjectBean.getType())) {
			modelPackageSearchComposite
					.setPackageTypeEnums(new BusinessPackageTypeEnum[] { BusinessPackageTypeEnum.PERSISTENT_PACKAGE });
		} else if (BusinessObjectTypeEnum.ENUM.getName().equals(
				this.businessObjectBean.getType())
				|| BusinessObjectTypeEnum.JAVA_CLASS.getName().equals(
						this.businessObjectBean.getType())
				|| BusinessObjectTypeEnum.SERVICE.getName().equals(
						this.businessObjectBean.getType())) {
			modelPackageSearchComposite
					.setPackageTypeEnums(new BusinessPackageTypeEnum[] { BusinessPackageTypeEnum.SERVICE_PACKAGE });
		}

		modelPackageSearchComposite
				.setExculdPackageIds(new long[] { this.businessObjectBean
						.getPackageId() });

		modelPackageSearchComposite.addSelectionChangedListener(this);
	}

	@Override
	protected Object getReflectObject(Control control) {
		return this;
	}
}
