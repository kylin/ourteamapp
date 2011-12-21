package com.ourteam.app.modelbase.editor;

import net.ui.eclipse.editorpart.AbstractFormEditorPart;

import com.ourteam.modelbase.domain.BusinessDomainBean;
import com.ourteam.modelbase.service.BusinessDomainServiceFactory;
import com.ourteam.modelbase.service.IBusinessDomainService;

public class BusinessDomainEditorPart extends
		AbstractFormEditorPart<BusinessDomainBean, BusinessDomainEditorInput> {

	public static final String EDITOR_ID = "com.ourteam.app.modelbase.editor.BusinessDomainEditorPart";

	@Override
	protected String getFormId() {
		return "businessDomainForm";
	}

	@Override
	protected void saveDataModel(BusinessDomainBean aDataModel)
			throws Exception {

		IBusinessDomainService businessDomainService = BusinessDomainServiceFactory
				.getBusinessDomainService();

		businessDomainService.modifyBusinessDomain(aDataModel);
	}

}
