package com.ourteam.app.modelbase.ui;

import net.ui.eclipse.tree.ISubNodeBuilder;

import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;
import com.ourteam.modelbase.domain.BusinessPackageTypeEnum;
import com.ourteam.modelbase.domain.BusinessTemplateProviderTypeBean;
import com.ourteam.modelbase.service.BusinessTemplateServiceFactory;
import com.ourteam.modelbase.service.IBusinessTemplateService;

public class BusinessPackageProviderTypeSubNodeBuilder
		implements
		ISubNodeBuilder<com.ourteam.modelbase.domain.BusinessPackageTypeEnum, BusinessTemplateProviderTypeBean> {

	private static final IBusinessTemplateService BUSINESS_TEMPLATE_SERVICE = BusinessTemplateServiceFactory
			.getBusinessTemplateService();

	@Override
	public BusinessTemplateProviderTypeBean[] getSubNodes(
			BusinessPackageTypeEnum aParentObject) throws Exception {

		String businessObjectType = null;

		if (aParentObject.equals(BusinessPackageTypeEnum.BUSINESS_PACKAGE)) {
			businessObjectType = BusinessObjectTypeEnum.DAO.getName();
		} else if (aParentObject
				.equals(BusinessPackageTypeEnum.SERVICE_PACKAGE)) {
			businessObjectType = BusinessObjectTypeEnum.SERVICE.getName();
		} else if (aParentObject
				.equals(BusinessPackageTypeEnum.PERSISTENT_PACKAGE)) {
			businessObjectType = BusinessObjectTypeEnum.PERSISTENT.getName();
		}

		BusinessTemplateProviderTypeBean[] providerTypeBeans = BUSINESS_TEMPLATE_SERVICE
				.getBusinessTemplateProviderTypes(businessObjectType);

		for (int i = 0; i < providerTypeBeans.length; i++) {
			providerTypeBeans[i].setBusinessObjectType(aParentObject.getName());
		}

		return providerTypeBeans;

	}

	@Override
	public String getSubNodeDefineId(BusinessTemplateProviderTypeBean nodeObject) {
		return "TEMPLATE_TYPE";
	}

	@Override
	public String[] getSubNodeActionGroupIds(
			BusinessTemplateProviderTypeBean nodeObject) {
		return new String[] { "businessTypeActionGroup",
				"editBusinessTypeActionGroup" };
	}

}
