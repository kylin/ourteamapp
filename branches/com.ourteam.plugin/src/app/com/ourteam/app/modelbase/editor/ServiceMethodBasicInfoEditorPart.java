package com.ourteam.app.modelbase.editor;

import net.ui.eclipse.editorpart.AbstractFormEditorPart;

import com.ourteam.modelbase.domain.ServiceFunctionBean;
import com.ourteam.modelbase.service.BusinessObjectServiceFactory;
import com.ourteam.modelbase.service.IBusinessObjectService;

public class ServiceMethodBasicInfoEditorPart extends
		AbstractFormEditorPart<ServiceFunctionBean, ServiceMethodEditorInput> {

	@Override
	protected String getFormId() {
		return "serviceMethodForm";
	}

	@Override
	protected void saveDataModel(ServiceFunctionBean aDataModel)
			throws Exception {
		IBusinessObjectService businessObjectService = BusinessObjectServiceFactory
				.getBusinessObjectService();

		businessObjectService.modifyServiceFunction(aDataModel);
	}

}
