package com.ourteam.app.modelbase.editor;

import com.ourteam.modelbase.domain.BusinessPackageBean;
import com.ourteam.modelbase.domain.BusinessPackageTypeEnum;

abstract public class AbstractAddBusinessPackageWizardProvider extends
		AbstractAddModelObjectWizardProvider<BusinessPackageBean> {

	private long businessDomainId;

	public AbstractAddBusinessPackageWizardProvider(long businessDomainId) {
		super();
		this.businessDomainId = businessDomainId;
	}

	abstract protected BusinessPackageTypeEnum getBusinessPackageType();

	@Override
	protected BusinessPackageBean getBusinessObjectDataModel() {
		BusinessPackageBean packageBean = new BusinessPackageBean();

		packageBean.setBusinessDomainId(businessDomainId);

		packageBean.setType(getBusinessPackageType().getName());

		return packageBean;
	}

	@Override
	protected void addBusinessObject(BusinessPackageBean businessObject)
			throws Exception {

		getBusinessPackageService().addNewBusinessPackage(businessObject);
	}

}
