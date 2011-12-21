package com.ourteam.app.modelbase.ui;

import org.eclipse.swt.widgets.Composite;

import com.ourteam.modelbase.domain.ObjectRelationAttrTypeEnum;

public class ModelObjectMappingConfigComposite extends
		AbstractModelObjectRelationConfigComposite {

	public ModelObjectMappingConfigComposite(Composite parent, int style) {
		super(parent, style);
		this.setCanMultiEstablishRelation(false);
	}

	@Override
	protected ObjectRelationAttrTypeEnum getObjectRelationAttrTypeEnum() {
		return ObjectRelationAttrTypeEnum.MAPPED;
	}

}
