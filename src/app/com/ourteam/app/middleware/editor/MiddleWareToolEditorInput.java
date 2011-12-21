package com.ourteam.app.middleware.editor;

import org.apache.commons.lang.StringUtils;

import net.ui.eclipse.editorpart.AbstractDataModelMultiPageEditorInput;

import com.ourteam.app.IOurTeamServiceConst;
import com.ourteam.middleware.domain.MiddleWareToolBean;

public class MiddleWareToolEditorInput extends
		AbstractDataModelMultiPageEditorInput<MiddleWareToolBean> {

	public MiddleWareToolEditorInput(MiddleWareToolBean dataModel) {
		super(dataModel);
	}

	@Override
	public boolean exists() {
		return getDataModel().getId() != 0;
	}

	@Override
	public String getName() {
		return StringUtils.join(new String[] {
				getDataModel().getProviderName(),
				getDataModel().getMiddleWareName(),
				getDataModel().getMiddleWareVersion(),
				getDataModel().getToolName() }, " ");

	}

	@Override
	public String getToolTipText() {
		return getDataModel().getRemarks();
	}

	@Override
	protected String getTabbedPaneConfigId() {
		return "middleWareToolEditorTab";
	}

	@Override
	protected MiddleWareToolBean doReloadDataModel() throws Exception {
		return IOurTeamServiceConst.MIDDLE_WARE_SERVICE
				.getMiddleWareToolById(getDataModel().getId());
	}

}
