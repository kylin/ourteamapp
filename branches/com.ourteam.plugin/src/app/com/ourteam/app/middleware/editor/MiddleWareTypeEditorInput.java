package com.ourteam.app.middleware.editor;

import net.ui.eclipse.editorpart.AbstractDataModelMultiPageEditorInput;

import com.ourteam.middleware.domain.MiddleWareTypeEnum;

public class MiddleWareTypeEditorInput extends
		AbstractDataModelMultiPageEditorInput<MiddleWareTypeEnum> {

	public MiddleWareTypeEditorInput(MiddleWareTypeEnum dataModel) {
		super(dataModel);
	}

	@Override
	public boolean exists() {
		return true;
	}

	@Override
	public String getName() {
		if (MiddleWareTypeEnum.DATABASE_SERVER.equals(getDataModel())) {
			return "数据库服务";
		} else if (MiddleWareTypeEnum.APPLICATION_SERVER.equals(getDataModel())) {
			return "应用服务";
		} else if (MiddleWareTypeEnum.CVS_SERVER.equals(getDataModel())) {
			return "CVS服务";
		} else if (MiddleWareTypeEnum.SVN_SERVER.equals(getDataModel())) {
			return "SVN服务";
		} else {
			return getDataModel().getDesc();
		}

	}

	@Override
	public String getToolTipText() {
		return getName();
	}

	@Override
	protected MiddleWareTypeEnum doReloadDataModel() throws Exception {
		return getDataModel();
	}

	@Override
	protected String getTabbedPaneConfigId() {
		return "middleWareTypeEditorTab";
	}

}
