package com.ourteam.app.workspace.editor;

import org.eclipse.swt.widgets.Control;

import com.ourteam.app.middleware.editor.AddMiddleWareWizardProvider;
import com.ourteam.app.project.ui.ProjectSearchComposite;
import com.ourteam.middleware.domain.MiddleWareBean;
import com.ourteam.middleware.domain.MiddleWareTypeEnum;
import com.ourteam.workspace.service.IWorkspaceService;
import com.ourteam.workspace.service.WorkspaceServiceFactory;

public class AddProjectServerWizardProvider extends AddMiddleWareWizardProvider {

	private ProjectSearchCompositePageHelper projectSearchCompositePageHelper;

	private static final IWorkspaceService WORKSPACE_SERVICE = WorkspaceServiceFactory
			.getWorkspaceService();

	public AddProjectServerWizardProvider(
			MiddleWareTypeEnum middleWareTypeEnum, long parentGroupId) {
		super(middleWareTypeEnum, parentGroupId);
	}

	protected String getWizardConfigId() {
		if (MiddleWareTypeEnum.DATABASE_SERVER.equals(this
				.getMiddleWareTypeEnum())) {
			return "addProjectDatabaseServerWizard";
		} else if (MiddleWareTypeEnum.CVS_SERVER.equals(this
				.getMiddleWareTypeEnum())) {
			return "addProjectCVSServerWizard";
		} else if (MiddleWareTypeEnum.SVN_SERVER.equals(this
				.getMiddleWareTypeEnum())) {
			return "addProjectSVNServerWizard";
		} else if (MiddleWareTypeEnum.APPLICATION_SERVER.equals(this
				.getMiddleWareTypeEnum())) {
			return "addProjectAppServerWizard";
		} else {
			return null;
		}

	}

	protected void affterAddMiddleWare(MiddleWareBean middleWareBean)
			throws Exception {
		long projectId = projectSearchCompositePageHelper
				.getSelectedProjectId();
		WORKSPACE_SERVICE.addServerToProject(middleWareBean.getId(), projectId);
	}

	@Override
	protected Object getReflectObject(Control control) {
		if (control instanceof ProjectSearchComposite) {
			return projectSearchCompositePageHelper = new ProjectSearchCompositePageHelper(
					this);
		} else {
			return super.getReflectObject(control);
		}
	}

}
