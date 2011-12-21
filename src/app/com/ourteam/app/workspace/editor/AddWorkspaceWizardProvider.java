package com.ourteam.app.workspace.editor;

import net.ui.eclipse.form.GridFormComposite;
import net.ui.eclipse.wizard.AbstractReflectWizardProvider;
import net.ui.eclipse.wizard.DefaultGridFormWizardPageControlHelper;

import org.eclipse.jface.wizard.IWizard;
import org.eclipse.swt.widgets.Control;

import com.ourteam.app.project.ui.ProjectSearchComposite;
import com.ourteam.workspace.domain.WorkspaceBean;
import com.ourteam.workspace.service.IWorkspaceService;
import com.ourteam.workspace.service.WorkspaceServiceFactory;

public class AddWorkspaceWizardProvider extends AbstractReflectWizardProvider {

	private static final IWorkspaceService WORKSPACE_SERVICE = WorkspaceServiceFactory
			.getWorkspaceService();

	private ProjectSearchCompositePageHelper projectSearchCompositePageHelper;

	private DefaultGridFormWizardPageControlHelper<WorkspaceBean> workspaceInfoPageHelper;

	protected String getWizardConfigId() {
		return "addWorkspaceWizard";
	}

	@Override
	public void doFinish(IWizard wizard) throws Exception {

		WorkspaceBean workspaceBean = workspaceInfoPageHelper
				.getGridFormComposite().getFormDataModel();

		WORKSPACE_SERVICE.addNewWorkspace(
				projectSearchCompositePageHelper.getSelectedProjectId(),
				workspaceBean);

	}

	@Override
	protected Object getReflectObject(Control control) {
		if (control instanceof GridFormComposite) {
			return workspaceInfoPageHelper = new DefaultGridFormWizardPageControlHelper<WorkspaceBean>(
					this, new WorkspaceBean());
		} else if (control instanceof ProjectSearchComposite) {
			return projectSearchCompositePageHelper = new ProjectSearchCompositePageHelper(
					this);
		} else {
			return this;
		}

	}

}
