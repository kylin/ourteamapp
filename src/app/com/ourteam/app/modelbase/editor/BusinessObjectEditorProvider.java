package com.ourteam.app.modelbase.editor;

import net.ui.eclipse.editorpart.MultiPageEditorPartAgent;
import net.ui.model.tree.NodeBean;

import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;

public class BusinessObjectEditorProvider extends
		AbstractModelObjectEditorProvider<BusinessObjectBean> {

	private BusinessObjectTypeEnum businessObjectTypeEnum;

	public BusinessObjectEditorProvider(
			BusinessObjectTypeEnum businessObjectTypeEnum) {
		super();
		this.businessObjectTypeEnum = businessObjectTypeEnum;
	}

	@Override
	protected AbstractModelObjectEditorInput<BusinessObjectBean> getModelObjectEditorInput(
			BusinessObjectBean editObject, NodeBean nodeBean) {
		return new BusinessObjectEditorInput(editObject);
	}

	@Override
	public String getEditorId() {
		return MultiPageEditorPartAgent.EDITOR_ID;
	}

	@Override
	protected String getModelObjectType() {
		return this.businessObjectTypeEnum.getName();
	}

}
