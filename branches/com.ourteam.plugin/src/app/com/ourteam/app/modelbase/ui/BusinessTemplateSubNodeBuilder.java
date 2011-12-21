package com.ourteam.app.modelbase.ui;

import net.ui.eclipse.tree.ISubNodeBuilder;

import org.apache.commons.lang.enums.Enum;

import com.ourteam.modelbase.domain.BusinessTemplateBean;
import com.ourteam.modelbase.service.BusinessTemplateServiceFactory;
import com.ourteam.modelbase.service.IBusinessTemplateService;

public class BusinessTemplateSubNodeBuilder implements
		ISubNodeBuilder<Enum, BusinessTemplateBean> {

	private static final IBusinessTemplateService BUSINESS_TEMPLATE_SERVICE = BusinessTemplateServiceFactory
			.getBusinessTemplateService();

	@Override
	public BusinessTemplateBean[] getSubNodes(
			Enum aParentObject) throws Exception {
		return BUSINESS_TEMPLATE_SERVICE.getBusinessTemplates(
				aParentObject.getName(), 0);
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
