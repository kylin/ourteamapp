package com.ourteam.app.modelbase.editor;

import net.ui.eclipse.editorpart.EditorPartAgent;
import net.ui.model.tree.NodeBean;

import com.ourteam.modelbase.domain.BusinessDomainBean;

public class BusinessDomainEditorProvider extends
		AbstractModelObjectEditorProvider<BusinessDomainBean> {

	@Override
	protected String getModelObjectType() {
		return "BUSINESS_DOMAIN";
	}

	@Override
	public String getEditorId() {
		return EditorPartAgent.EDITOR_ID;
	}

	@Override
	protected AbstractModelObjectEditorInput<BusinessDomainBean> getModelObjectEditorInput(
			BusinessDomainBean editObject, NodeBean nodeBean) {
		BusinessDomainEditorInput input = new BusinessDomainEditorInput(
				editObject);
		return input;
	}

}
