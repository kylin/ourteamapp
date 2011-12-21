package com.ourteam.app.middleware.ui;

import java.util.Iterator;
import java.util.List;

import net.ui.eclipse.tree.ISubNodeBuilder;

import org.apache.commons.lang.StringUtils;

import com.ourteam.middleware.domain.MiddleWareBean;
import com.ourteam.middleware.domain.MiddleWareTypeEnum;
import com.ourteam.project.domain.ProjectBean;
import com.ourteam.workspace.service.IWorkspaceService;
import com.ourteam.workspace.service.WorkspaceServiceFactory;

public class ServerSubNodeBuilder implements
		ISubNodeBuilder<MiddleWareTypeEnum, MiddleWareBean> {

	private List<ProjectBean> projectBeans;

	private static final IWorkspaceService WORKSPACE_SERVICE = WorkspaceServiceFactory
			.getWorkspaceService();

	@Override
	public MiddleWareBean[] getSubNodes(MiddleWareTypeEnum aParentObject)
			throws Exception {

		if (projectBeans == null || projectBeans.isEmpty()) {
			return new MiddleWareBean[0];
		}

		long[] projectIds = new long[projectBeans.size()];

		int index = 0;

		for (Iterator<ProjectBean> iterator = projectBeans.iterator(); iterator
				.hasNext();) {
			ProjectBean projectBean = iterator.next();
			projectIds[index++] = projectBean.getId();
		}
		return WORKSPACE_SERVICE.getServersByProjectIds(projectIds,
				new MiddleWareTypeEnum[] { aParentObject });
	}

	@Override
	public String getSubNodeDefineId(MiddleWareBean nodeObject) {
		return StringUtils.replace(nodeObject.getType(), "_SERVER", "");
	}

	@Override
	public String[] getSubNodeActionGroupIds(MiddleWareBean nodeObject) {
		
		
		if (nodeObject.getType().equals(
				MiddleWareTypeEnum.DATABASE_SERVER.getName())) {
			return new String[] { "databaseServerActionGroup" };
		} else if (nodeObject.getType().equals(
				MiddleWareTypeEnum.CVS_SERVER.getName())) {
			return new String[] { "cvsServerActionGroup" };
		} else if (nodeObject.getType().equals(
				MiddleWareTypeEnum.SVN_SERVER.getName())) {
			return new String[] { "svnServerActionGroup" };
		} else if (nodeObject.getType().equals(
				MiddleWareTypeEnum.APPLICATION_SERVER.getName())) {
			return new String[] { "appServerActionGroup" };
		} else {
			return null;
		}
	}

	public void setProjectBeans(List<ProjectBean> projectBeans) {
		this.projectBeans = projectBeans;
	}

}
