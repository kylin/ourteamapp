package com.ourteam.app.modelbase.ui;

import net.ui.eclipse.tree.ISubNodeBuilder;

import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;
import com.ourteam.modelbase.domain.BusinessTemplateProviderTypeBean;
import com.ourteam.modelbase.service.BusinessTemplateServiceFactory;
import com.ourteam.modelbase.service.IBusinessTemplateService;

public class BusinessTemplateTypeSubNodeBuilder
		implements
		ISubNodeBuilder<BusinessObjectTypeEnum, BusinessTemplateProviderTypeBean> {

	private static final IBusinessTemplateService BUSINESS_TEMPLATE_SERVICE = BusinessTemplateServiceFactory
			.getBusinessTemplateService();

	@Override
	public BusinessTemplateProviderTypeBean[] getSubNodes(
			BusinessObjectTypeEnum aParentObject) throws Exception {
		return BUSINESS_TEMPLATE_SERVICE
				.getBusinessTemplateProviderTypes(aParentObject.getName());

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
