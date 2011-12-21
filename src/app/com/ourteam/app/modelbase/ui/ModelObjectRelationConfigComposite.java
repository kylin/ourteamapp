package com.ourteam.app.modelbase.ui;

import org.eclipse.swt.widgets.Composite;

import com.ourteam.modelbase.domain.ObjectRelationAttrTypeEnum;

public class ModelObjectRelationConfigComposite extends
		AbstractModelObjectRelationConfigComposite {

	public ModelObjectRelationConfigComposite(Composite parent, int style) {
		super(parent, style);
	}

	@Override
	protected ObjectRelationAttrTypeEnum getObjectRelationAttrTypeEnum() {
		return ObjectRelationAttrTypeEnum.RELATED;
	}

	
}
