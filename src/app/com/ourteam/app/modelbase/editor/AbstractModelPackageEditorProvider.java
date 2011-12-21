package com.ourteam.app.modelbase.editor;

import net.ui.eclipse.editorpart.EditorPartAgent;
import net.ui.model.tree.NodeBean;

import com.ourteam.modelbase.domain.BusinessPackageBean;

public abstract class AbstractModelPackageEditorProvider extends
		AbstractModelObjectEditorProvider<BusinessPackageBean> {

	@Override
	public String getEditorId() {
		return EditorPartAgent.EDITOR_ID;
	}
	
	@Override
	protected AbstractModelObjectEditorInput<BusinessPackageBean> getModelObjectEditorInput(
			BusinessPackageBean editObject, NodeBean nodeBean) {
		return new BusinessPackageEditorInput(editObject);
	}
}
