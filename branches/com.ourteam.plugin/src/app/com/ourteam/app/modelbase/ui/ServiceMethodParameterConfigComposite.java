package com.ourteam.app.modelbase.ui;

import net.ui.eclipse.widget.AbstractMultiPanelGroupComposite;

import org.eclipse.swt.widgets.Composite;

public class ServiceMethodParameterConfigComposite extends
		AbstractMultiPanelGroupComposite {

	public ServiceMethodParameterConfigComposite(Composite parent, int style) {
		super(parent, style);
	}

	@Override
	protected String getTabbedPaneConfigId() {
		return "serviceMethodParameterPanelGroup";
	}

}
