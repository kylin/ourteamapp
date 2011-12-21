package com.ourteam.app.modelbase.ui;

import org.eclipse.swt.widgets.Composite;

public class DtoPropertyMappingConfigComposite extends AbstractBusinessObjectPropertyMappingConfigComposite {

	public DtoPropertyMappingConfigComposite(Composite parent) {
		super(parent);
	}

	@Override
	protected String getTableConfigId() {
		return "genDtoPropertyTable";
	}

	

}
