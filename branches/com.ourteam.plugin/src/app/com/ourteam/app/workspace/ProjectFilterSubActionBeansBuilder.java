package com.ourteam.app.workspace;

import net.ui.UIConfigFactory;
import net.ui.eclipse.action.AbstractActionGroupBuilder;
import net.ui.eclipse.action.AbstractSubActionBeansBuilder;
import net.ui.model.action.ActionBean;
import net.ui.model.action.CustomActionBean;

import org.apache.commons.beanutils.PropertyUtils;
import org.eclipse.jface.action.IContributionManager;

import com.ourteam.app.IOurTeamServiceConst;
import com.ourteam.project.domain.ProjectBean;

public class ProjectFilterSubActionBeansBuilder extends
		AbstractSubActionBeansBuilder {

	public ProjectFilterSubActionBeansBuilder(
			AbstractActionGroupBuilder<? extends IContributionManager> actionGroupBuilder) {
		super(actionGroupBuilder);
	}

	@Override
	public ActionBean[] getSubActionBeans(ActionBean actionBean)
			throws Exception {

		ProjectBean[] projectBeans = IOurTeamServiceConst.PROJECT_SERVICE
				.getProjectsByUserId(1);

		CustomActionBean<ProjectBean>[] actionBeans = new CustomActionBean[projectBeans.length];

		ActionBean tempalteActionBean = UIConfigFactory.getInstance()
				.getActionBean("selectProjectAction");

		for (int i = 0; i < projectBeans.length; i++) {
			final ProjectBean projectBean = projectBeans[i];

			actionBeans[i] = new CustomActionBean<ProjectBean>();

			PropertyUtils.copyProperties(actionBeans[i], tempalteActionBean);

			actionBeans[i].setLabel(projectBean.getName());
			
			actionBeans[i].setUserObject(projectBean);

		}

		return actionBeans;
	}

}
