package com.ourteam.app.middleware.editor;

import org.apache.commons.lang.StringUtils;

import net.ui.eclipse.editorpart.AbstractDataModelMultiPageEditorInput;

public class MiddleWareManageToolExecuteEditorInput extends
		AbstractDataModelMultiPageEditorInput<MiddleWareManageToolExecuteBean> {

	public MiddleWareManageToolExecuteEditorInput(
			MiddleWareManageToolExecuteBean dataModel) {
		super(dataModel);
	}

	@Override
	public boolean exists() {
		return true;
	}

	@Override
	public String getName() {
		return getDataModel().getMiddleWareBean().getName() + " "
				+ getDataModel().getMiddleWareToolBean().getToolName();
	}

	@Override
	public String getToolTipText() {
		StringBuffer tip = new StringBuffer();
		tip.append(getDataModel().getMiddleWareToolBean().getToolName());
		if (StringUtils.isNotBlank(getDataModel().getMiddleWareToolBean()
				.getRemarks())) {
			tip.append("(")
					.append(getDataModel().getMiddleWareToolBean().getRemarks())
					.append(")");
		}
		return tip.toString();
	}

	@Override
	protected String getTabbedPaneConfigId() {
		return "middleWareManageEditorTab";
	}

	@Override
	protected MiddleWareManageToolExecuteBean doReloadDataModel()
			throws Exception {
		getDataModel().reload();
		return getDataModel();
	}

}
