package com.ourteam.app.modelbase.ui;

import net.ui.eclipse.tree.ISubNodeBuilder;

import com.ourteam.modelbase.domain.BusinessDomainBean;
import com.ourteam.modelbase.domain.BusinessPackageBean;
import com.ourteam.modelbase.domain.BusinessPackageTypeEnum;
import com.ourteam.modelbase.service.BusinessPackageServiceFactory;
import com.ourteam.modelbase.service.IBusinessPackageService;

abstract public class AbscractPackageNodeBuilder implements
		ISubNodeBuilder<BusinessDomainBean, BusinessPackageBean> {

	private static final IBusinessPackageService BUSINESS_PACKAGE_SERVICE = BusinessPackageServiceFactory
			.getBusinessPackageService();

	abstract protected BusinessPackageTypeEnum getBusinessPackageType();

	@Override
	public BusinessPackageBean[] getSubNodes(BusinessDomainBean aParentObject)
			throws Exception {
		BusinessPackageBean[] result = BUSINESS_PACKAGE_SERVICE
				.getBusinessPackagesByType(aParentObject.getBusinessDomainId(),
						getBusinessPackageType());
		return result;
	}

	@Override
	public String getSubNodeDefineId(BusinessPackageBean nodeObject) {
		return getBusinessPackageType().getName();
	}

}
