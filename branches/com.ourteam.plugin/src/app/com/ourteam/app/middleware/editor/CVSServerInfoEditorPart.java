package com.ourteam.app.middleware.editor;

import net.ui.eclipse.editorpart.AbstractFormEditorPart;

import com.ourteam.middleware.domain.MiddleWareBean;
import com.ourteam.middleware.service.IMiddleWareService;
import com.ourteam.middleware.service.MiddleWareServiceFactory;

public class CVSServerInfoEditorPart extends
		AbstractFormEditorPart<MiddleWareBean, MiddleWareServerEditorInput> {
	
	public static final String EDITOR_ID = "com.ourteam.app.middleware.editor.CVSServerInfoEditorPart";


	private static final IMiddleWareService MIDDLE_WARE_SERVICE = MiddleWareServiceFactory
			.getMiddleWareService();

	@Override
	protected String getFormId() {
		return "cvsServerInfoForm";
	}

	@Override
	protected void saveDataModel(MiddleWareBean aDataModel) throws Exception {

		MIDDLE_WARE_SERVICE.modifyMiddleWare(aDataModel);
	}

}
