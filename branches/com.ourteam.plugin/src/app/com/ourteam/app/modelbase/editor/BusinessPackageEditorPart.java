package com.ourteam.app.modelbase.editor;

import net.ui.eclipse.editorpart.AbstractFormEditorPart;

import com.ourteam.modelbase.domain.BusinessPackageBean;
import com.ourteam.modelbase.service.BusinessPackageServiceFactory;
import com.ourteam.modelbase.service.IBusinessPackageService;

public class BusinessPackageEditorPart extends
		AbstractFormEditorPart<BusinessPackageBean, BusinessPackageEditorInput> {

	public static final String EDITOR_ID = "com.ourteam.app.modelbase.editor.BusinessPackageEditorPart";

	@Override
	protected String getFormId() {
		return "businessPackageForm";
	}

	@Override
	protected void saveDataModel(BusinessPackageBean aDataModel)
			throws Exception {

		IBusinessPackageService businessPackageService = BusinessPackageServiceFactory
				.getBusinessPackageService();

		businessPackageService.modifyBusinessPackage(aDataModel);
	}

}
