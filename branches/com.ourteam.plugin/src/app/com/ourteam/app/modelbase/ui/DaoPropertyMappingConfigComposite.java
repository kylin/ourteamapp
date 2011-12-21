package com.ourteam.app.modelbase.ui;

import org.eclipse.swt.widgets.Composite;

public class DaoPropertyMappingConfigComposite extends AbstractBusinessObjectPropertyMappingConfigComposite {


	public DaoPropertyMappingConfigComposite(Composite parent) {
		super(parent);
	}

	@Override
	protected String getTableConfigId() {
		return "genPropertyTable";
	}

}
