package com.ourteam.app.workspace.editor;

import net.ui.eclipse.wizard.AbstractSerachWizardPageControlHelper;
import net.ui.eclipse.wizard.AbstractWizardProvider;

import com.ourteam.app.project.ui.ProjectSearchComposite;
import com.ourteam.project.domain.ProjectBean;

public class ProjectSearchCompositePageHelper
		extends
		AbstractSerachWizardPageControlHelper<ProjectBean, ProjectSearchComposite> {

	public ProjectSearchCompositePageHelper(
			AbstractWizardProvider wizardProvider) {
		super(wizardProvider);
	}

	private long selectedProjectId;

	@Override
	public void onActiveWizardPageControlChanged(ProjectSearchComposite control)throws Exception {
		super.onActiveWizardPageControlChanged(control);
		selectedProjectId = control.getSelectedSearchResults().get(0).getId();
	}


	public long getSelectedProjectId() {
		return selectedProjectId;
	}

	@Override
	protected void doInitSearchConfig(ProjectSearchComposite control)
			throws Exception {
	
	}

}
