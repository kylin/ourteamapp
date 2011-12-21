package com.ourteam.app.modelbase.editor;

import net.ui.eclipse.editorpart.IDataModelEditorInput;
import net.ui.eclipse.editorpart.MultiPageEditorPartAgent;
import net.ui.model.tree.NodeBean;

import com.ourteam.modelbase.domain.ServiceFunctionBean;

public class ServiceMethodEditorProvider extends
		AbstractModelObjectEditorProvider<ServiceFunctionBean> {

	@Override
	public String getEditorId() {
		return MultiPageEditorPartAgent.EDITOR_ID;
	}

	@Override
	protected String getModelObjectType() {
		return "SERVICE_METHOD";
	}

	@Override
	protected IDataModelEditorInput<ServiceFunctionBean> getModelObjectEditorInput(
			ServiceFunctionBean editObject, NodeBean nodeBean) {
		return new ServiceMethodEditorInput(editObject);
	}

}
