package com.ourteam.app.modelbase.editor;

import net.ui.eclipse.wizard.AbstractSerachWizardPageControlHelper;
import net.ui.eclipse.wizard.AbstractWizardProvider;

import com.ourteam.app.middleware.ui.DatabaseSearchComposite;
import com.ourteam.middleware.domain.MiddleWareBean;

public class DatabaseSearchWizardPageHelper
		extends
		AbstractSerachWizardPageControlHelper<MiddleWareBean, DatabaseSearchComposite> {

	public DatabaseSearchWizardPageHelper(AbstractWizardProvider wizardProvider) {
		super(wizardProvider);
	}

	@Override
	protected void doInitSearchConfig(DatabaseSearchComposite control)
			throws Exception {

	}

}
