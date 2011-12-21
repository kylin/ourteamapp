package com.ourteam.app.middleware.editor;

import net.ui.eclipse.editorpart.AbstractFormEditorPart;

import com.ourteam.app.IOurTeamServiceConst;
import com.ourteam.hr.domain.EmployeeBean;
import com.ourteam.middleware.domain.MiddleWareToolBean;

public class MiddleWareToolInfoEditorPart extends
		AbstractFormEditorPart<MiddleWareToolBean, MiddleWareToolEditorInput> {

	private EmployeeBean employeeBean = null;

	@Override
	protected String getFormId() {
		return "middleWareToolInfoForm";
	}

	@Override
	protected void saveDataModel(MiddleWareToolBean aDataModel)
			throws Exception {

		aDataModel.setLastEditorId(employeeBean.getId());

		IOurTeamServiceConst.MIDDLE_WARE_SERVICE
				.modifyMiddleWareTool(aDataModel);
	}

}
