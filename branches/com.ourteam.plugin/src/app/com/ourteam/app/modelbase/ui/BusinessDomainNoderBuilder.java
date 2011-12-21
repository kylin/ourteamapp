package com.ourteam.app.modelbase.ui;

import java.util.List;

import net.ui.eclipse.tree.ISubNodeBuilder;

import com.ourteam.modelbase.domain.BusinessDomainBean;
import com.ourteam.modelbase.domain.BusinessDomainGroupBean;
import com.ourteam.modelbase.service.BusinessDomainServiceFactory;
import com.ourteam.modelbase.service.IBusinessDomainService;

public class BusinessDomainNoderBuilder implements
		ISubNodeBuilder<Object, BusinessDomainBean> {

	private List<BusinessDomainGroupBean> businessDomainGroupBeans;

	private static final IBusinessDomainService BUSINESS_DOMAIN_SERVICE = BusinessDomainServiceFactory
			.getBusinessDomainService();

	public BusinessDomainNoderBuilder() {

	}

	public List<BusinessDomainGroupBean> getBusinessDomainGroupBeans() {
		return businessDomainGroupBeans;
	}

	public void setBusinessDomainGroupBeans(
			List<BusinessDomainGroupBean> businessDomainGroupBeans) {
		this.businessDomainGroupBeans = businessDomainGroupBeans;
	}

	@Override
	public BusinessDomainBean[] getSubNodes(Object aParentObject)
			throws Exception {
		if (this.businessDomainGroupBeans == null
				|| businessDomainGroupBeans.isEmpty()) {
			return BUSINESS_DOMAIN_SERVICE.getAllBusinessDomains();
		} else {
			return BUSINESS_DOMAIN_SERVICE
					.getBusinessDomainsByGroupId(this.businessDomainGroupBeans
							.get(0).getId());
		}

	}

	@Override
	public String getSubNodeDefineId(BusinessDomainBean nodeObject) {
		return "BUSINESS_DOMAIN";
	}

	@Override
	public String[] getSubNodeActionGroupIds(BusinessDomainBean nodeObject) {
		return new String[] { "businessDomainActionGroup" };
	}

}
