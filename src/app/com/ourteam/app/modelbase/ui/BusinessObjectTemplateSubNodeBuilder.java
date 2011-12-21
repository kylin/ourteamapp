package com.ourteam.app.modelbase.ui;

import net.ui.eclipse.tree.ISubNodeBuilder;

import com.ourteam.modelbase.domain.BusinessTemplateBean;
import com.ourteam.modelbase.domain.BusinessTemplateProviderTypeBean;
import com.ourteam.modelbase.service.BusinessTemplateServiceFactory;
import com.ourteam.modelbase.service.IBusinessTemplateService;

public class BusinessObjectTemplateSubNodeBuilder implements
		ISubNodeBuilder<BusinessTemplateProviderTypeBean, BusinessTemplateBean> {

	private static final IBusinessTemplateService BUSINESS_TEMPLATE_SERVICE = BusinessTemplateServiceFactory
			.getBusinessTemplateService();

	@Override
	public BusinessTemplateBean[] getSubNodes(
			BusinessTemplateProviderTypeBean aParentObject) throws Exception {

		return BUSINESS_TEMPLATE_SERVICE.getBusinessTemplates(
				aParentObject.getBusinessObjectType(), aParentObject.getId());

	}

	@Override
	public String getSubNodeDefineId(BusinessTemplateBean nodeObject) {
		return "TEMPLATE";
	}

	@Override
	public String[] getSubNodeActionGroupIds(BusinessTemplateBean nodeObject) {
		return null;
	}

}
