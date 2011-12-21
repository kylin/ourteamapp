package com.ourteam.app.modelbase.editor;

import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;

abstract public class AbstractAddBusinessObjectWizardProvider extends
		AbstractAddModelObjectWizardProvider<BusinessObjectBean> {

	private long packageId;

	public AbstractAddBusinessObjectWizardProvider(long packageId) {
		super();
		this.packageId = packageId;
	}

	abstract protected BusinessObjectTypeEnum getBusinessObjectTypeEnum();

	@Override
	protected BusinessObjectBean getBusinessObjectDataModel() {
		BusinessObjectBean businessObjectBean = new BusinessObjectBean();

		businessObjectBean.setPackageId(this.packageId);

		businessObjectBean.setType(getBusinessObjectTypeEnum().getName());

		return businessObjectBean;
	}

	@Override
	protected void addBusinessObject(BusinessObjectBean businessObjectBean)
			throws Exception {

		getBusinessObjectService().addNewBusinessObject(businessObjectBean);
	}

}
