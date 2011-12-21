package com.ourteam.app.modelbase.ui;

import net.ui.eclipse.tree.ISubNodeBuilder;

import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.domain.ServiceFunctionBean;
import com.ourteam.modelbase.service.BusinessObjectServiceFactory;
import com.ourteam.modelbase.service.IBusinessObjectService;

public class ServiceMethodBuilder implements
		ISubNodeBuilder<BusinessObjectBean, ServiceFunctionBean> {

	private static final IBusinessObjectService BUSINESS_OBJECT_SERVICE = BusinessObjectServiceFactory
			.getBusinessObjectService();

	@Override
	public ServiceFunctionBean[] getSubNodes(BusinessObjectBean aParentObject)
			throws Exception {
		return BUSINESS_OBJECT_SERVICE.getServiceFunctions(aParentObject
				.getBusinessObjectId());
	}

	@Override
	public String getSubNodeDefineId(ServiceFunctionBean nodeObject) {
		return "SERVICE_METHOD";
	}

	@Override
	public String[] getSubNodeActionGroupIds(ServiceFunctionBean nodeObject) {
		return new String[] { "serviceMethodActionGroup" };
	}

}
