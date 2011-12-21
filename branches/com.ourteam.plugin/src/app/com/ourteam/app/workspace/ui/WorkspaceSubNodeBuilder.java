package com.ourteam.app.workspace.ui;

import java.util.Iterator;
import java.util.List;

import net.ui.eclipse.tree.ISubNodeBuilder;

import com.ourteam.project.domain.ProjectBean;
import com.ourteam.workspace.domain.WorkspaceBean;
import com.ourteam.workspace.service.IWorkspaceService;
import com.ourteam.workspace.service.WorkspaceServiceFactory;

public class WorkspaceSubNodeBuilder implements
		ISubNodeBuilder<Object, WorkspaceBean> {

	private List<ProjectBean> projectBeans;

	private static final IWorkspaceService WORKSPACE_SERVICE = WorkspaceServiceFactory
			.getWorkspaceService();

	@Override
	public WorkspaceBean[] getSubNodes(Object aParentObject) throws Exception {

		if (projectBeans == null) {
			return new WorkspaceBean[0];
		}

		long[] projectIds = new long[projectBeans.size()];

		int index = 0;

		for (Iterator<ProjectBean> iterator = projectBeans.iterator(); iterator
				.hasNext();) {
			ProjectBean projectBean = iterator.next();
			projectIds[index++] = projectBean.getId();
		}

		return WORKSPACE_SERVICE.getWorkspacesByProjectIds(projectIds);
	}

	@Override
	public String getSubNodeDefineId(WorkspaceBean nodeObject) {
		return "WORKSPACE";
	}

	@Override
	public String[] getSubNodeActionGroupIds(WorkspaceBean nodeObject) {
		return new String[]{"workspaceActionGroup"};
	}

	public List<ProjectBean> getProjectBeans() {
		return projectBeans;
	}

	public void setProjectBeans(List<ProjectBean> projectBeans) {
		this.projectBeans = projectBeans;
	}

}
