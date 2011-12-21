package com.ourteam.app.modelbase.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;


public class ServiceObjectDependBusinessObjectSearchComposite extends
		ModelObjectSearchComposite {

	public ServiceObjectDependBusinessObjectSearchComposite(Composite parent) {
		super(parent);
	}

	@Override
	protected int getResultTableStyle() {
		return SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI;
	}

	
}
