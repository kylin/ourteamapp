package com.ourteam.app.modelbase.editor;

import com.ourteam.modelbase.domain.BusinessDomainBean;

public class AddBusinessDomainWizardProvider extends
		AbstractAddModelObjectWizardProvider<BusinessDomainBean> {

	private long businessDomainGroupId;

	public AddBusinessDomainWizardProvider(long businessDomainGroupId) {
		super();
		this.businessDomainGroupId = businessDomainGroupId;
	}

	@Override
	protected String getWizardConfigId() {
		return "addBusinessDoaminWizard";
	}

	@Override
	protected BusinessDomainBean getBusinessObjectDataModel() {
		return new BusinessDomainBean();
	}

	@Override
	protected void addBusinessObject(BusinessDomainBean businessDomainBean)
			throws Exception {

		getBusinessDomainService().addNewBusinessDomain(businessDomainBean);

		if (businessDomainGroupId != 0) {
			BusinessDomainBean[] businessDomainBeans = getBusinessDomainService()
					.getBusinessDomainsByGroupId(businessDomainGroupId);

			long[] businessDomainIds = new long[businessDomainBeans.length + 1];

			for (int i = 0; i < businessDomainBeans.length; i++) {
				businessDomainIds[i] = businessDomainBeans[i]
						.getBusinessDomainId();

			}

			businessDomainIds[businessDomainBeans.length] = businessDomainBean
					.getBusinessDomainId();

			getBusinessDomainService().setBusinessDomainGroupRelate(
					businessDomainGroupId, businessDomainIds);
		}
	}

}
