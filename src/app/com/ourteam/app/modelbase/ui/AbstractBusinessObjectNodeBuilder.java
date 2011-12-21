package com.ourteam.app.modelbase.ui;

import net.ui.eclipse.tree.ISubNodeBuilder;

import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;
import com.ourteam.modelbase.domain.BusinessPackageBean;
import com.ourteam.modelbase.service.BusinessObjectServiceFactory;
import com.ourteam.modelbase.service.IBusinessObjectService;

abstract public class AbstractBusinessObjectNodeBuilder implements
		ISubNodeBuilder<BusinessPackageBean, BusinessObjectBean> {

	private static final IBusinessObjectService BUSINESS_OBJECT_SERVICE = BusinessObjectServiceFactory
			.getBusinessObjectService();

	

	abstract protected BusinessObjectTypeEnum getBusinessObjectType();


	@Override
	public BusinessObjectBean[] getSubNodes(BusinessPackageBean aParentObject)
			throws Exception {

		return BUSINESS_OBJECT_SERVICE.getBusinessObjectsByType(
				aParentObject.getBusinessPackageId(), getBusinessObjectType());
	}

	@Override
	public String getSubNodeDefineId(BusinessObjectBean nodeObject) {
		return getBusinessObjectType().getName();
	}

}
