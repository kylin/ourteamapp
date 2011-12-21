package com.ourteam.app.modelbase.editor;

import net.ui.eclipse.editorpart.EditorPartAgent;
import net.ui.model.tree.NodeBean;

import com.ourteam.modelbase.domain.ObjectPropertyBean;
import com.ourteam.modelbase.domain.ObjectPropertyTypeEnum;

public class ObjectPropertyEditorProvider extends
		AbstractModelObjectEditorProvider<ObjectPropertyBean> {

	private ObjectPropertyTypeEnum propertyTypeEnum;

	private boolean primaryKey;

	public ObjectPropertyEditorProvider(ObjectPropertyTypeEnum propertyTypeEnum) {
		this(propertyTypeEnum, false);
	}

	public ObjectPropertyEditorProvider(
			ObjectPropertyTypeEnum propertyTypeEnum, boolean primaryKey) {
		super();
		this.propertyTypeEnum = propertyTypeEnum;
		this.primaryKey = primaryKey;
	}

	@Override
	public String getEditorId() {
		return EditorPartAgent.EDITOR_ID;
	}

	@Override
	protected AbstractModelObjectEditorInput<ObjectPropertyBean> getModelObjectEditorInput(
			ObjectPropertyBean editObject, NodeBean nodeBean) {
		return new BusinessObjectPropertyEditorInput(editObject);
	}

	@Override
	protected String getModelObjectType() {
		if (this.primaryKey) {
			return "PRIMARY_" + this.propertyTypeEnum.getName();
		} else {
			return this.propertyTypeEnum.getName();
		}

	}
}
