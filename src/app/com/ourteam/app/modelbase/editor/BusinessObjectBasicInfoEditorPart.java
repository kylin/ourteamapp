package com.ourteam.app.modelbase.editor;

import net.ui.eclipse.editorpart.AbstractFormEditorPart;

import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.service.BusinessObjectServiceFactory;
import com.ourteam.modelbase.service.IBusinessObjectService;

public class BusinessObjectBasicInfoEditorPart extends
		AbstractFormEditorPart<BusinessObjectBean, BusinessObjectEditorInput> {

	@Override
	protected String getFormId() {
		return "businessObjectForm";
	}

	@Override
	protected void saveDataModel(BusinessObjectBean aDataModel)
			throws Exception {
		IBusinessObjectService businessObjectService = BusinessObjectServiceFactory
				.getBusinessObjectService();

		businessObjectService.modifyBusinessObject(aDataModel);
	}

}
