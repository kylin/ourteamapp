package com.ourteam.app.middleware.editor;

import net.ui.eclipse.editorpart.AbstractDataModelMultiPageEditorInput;

import org.apache.commons.lang.StringUtils;

import com.ourteam.middleware.domain.MiddleWareBean;
import com.ourteam.middleware.service.IMiddleWareService;
import com.ourteam.middleware.service.MiddleWareServiceFactory;

public class MiddleWareServerEditorInput extends
		AbstractDataModelMultiPageEditorInput<MiddleWareBean> {

	private static final IMiddleWareService MIDDLE_WARE_SERVICE = MiddleWareServiceFactory
			.getMiddleWareService();

	private String editorTabId;

	public MiddleWareServerEditorInput(MiddleWareBean dataModel,
			String editorTabId) {
		super(dataModel);
		this.editorTabId = editorTabId;
	}

	@Override
	protected MiddleWareBean doReloadDataModel() throws Exception {
		return MIDDLE_WARE_SERVICE.getMiddleWareById(getDataModel().getId());
	}

	@Override
	public boolean exists() {
		try {
			return MIDDLE_WARE_SERVICE
					.getMiddleWareById(getDataModel().getId()) != null;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public String getName() {
		return getDataModel().getName();
	}

	@Override
	public String getToolTipText() {
		if (StringUtils.isNotBlank(getDataModel().getDesc())) {
			return getDataModel().getDesc();
		} else {
			return "";
		}

	}

	@Override
	protected String getTabbedPaneConfigId() {
		return this.editorTabId;
	}

}
