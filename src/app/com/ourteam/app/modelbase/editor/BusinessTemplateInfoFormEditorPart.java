package com.ourteam.app.modelbase.editor;

import net.ui.eclipse.editorpart.AbstractFormEditorPart;

import com.ourteam.app.modelbase.editor.BusinessTemplateEditorHelper.BusinessTemplateEditorInput;
import com.ourteam.modelbase.domain.BusinessTemplateBean;
import com.ourteam.modelbase.service.BusinessTemplateServiceFactory;
import com.ourteam.modelbase.service.IBusinessTemplateService;

public class BusinessTemplateInfoFormEditorPart
		extends
		AbstractFormEditorPart<BusinessTemplateBean, BusinessTemplateEditorInput> {

	private static final IBusinessTemplateService BUSINESS_TEMPLATE_SERVICE = BusinessTemplateServiceFactory
			.getBusinessTemplateService();

	@Override
	protected String getFormId() {
		return "businessTemplateInfoForm";
	}

	@Override
	protected void saveDataModel(BusinessTemplateBean aDataModel)
			throws Exception {

		BUSINESS_TEMPLATE_SERVICE
				.modifyBusinessTemplateInfo(aDataModel);
	}

}
