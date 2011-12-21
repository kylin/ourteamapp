package com.ourteam.app.modelbase.editor;

import net.ui.eclipse.editorpart.AbstractTextEditorPart;

import com.ourteam.app.modelbase.editor.BusinessTemplateEditorHelper.BusinessTemplateEditorInput;
import com.ourteam.modelbase.domain.BusinessTemplateBean;
import com.ourteam.modelbase.domain.VelocityTemplateBean;
import com.ourteam.modelbase.service.BusinessTemplateServiceFactory;
import com.ourteam.modelbase.service.IBusinessTemplateService;

public class BusinessTemplateContentEditor
		extends
		AbstractTextEditorPart<BusinessTemplateBean, BusinessTemplateEditorInput> {

	private static final IBusinessTemplateService BUSINESS_TEMPLATE_SERVICE = BusinessTemplateServiceFactory
			.getBusinessTemplateService();

	@Override
	protected void saveDataModel(BusinessTemplateBean aDataModel)
			throws Exception {

		VelocityTemplateBean templateBean = BUSINESS_TEMPLATE_SERVICE
				.getTemplateById(aDataModel.getTemplateId());

		templateBean.setTemplateContent(this.getEditorTextContent());

		BUSINESS_TEMPLATE_SERVICE.modifyTemplate(templateBean);

	}

	@Override
	protected String getTextContent() throws Exception {
		BusinessTemplateBean businessTemplateBean = getDataModel();

		VelocityTemplateBean templateBean = BUSINESS_TEMPLATE_SERVICE
				.getTemplateById(businessTemplateBean.getTemplateId());
		return templateBean.getTemplateContent();
	}

}
