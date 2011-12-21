package com.ourteam.app.workspace;

import java.util.ArrayList;
import java.util.List;

import net.ui.eclipse.action.ActionEvent;
import net.ui.eclipse.common.AbstractContentViewerComposite;
import net.ui.eclipse.viewpart.AbstractTreeViewPart;
import net.ui.model.action.ActionBean;
import net.ui.model.action.CustomActionBean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.swt.widgets.Composite;

import com.ourteam.project.domain.ProjectBean;
import com.ourteam.project.service.IProjectService;
import com.ourteam.project.service.ProjectServiceFactory;

public abstract class AbstractProjectFilterOpenEditorTreeViewPart extends
		AbstractTreeViewPart {

	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(AbstractProjectFilterOpenEditorTreeViewPart.class);

	private static final IProjectService PROJECT_SERVICE = ProjectServiceFactory
			.getProjectService();

	private List<ProjectBean> selectedProjects = new ArrayList<ProjectBean>();

	public AbstractProjectFilterOpenEditorTreeViewPart() {
		super();
	}

	@Override
	protected AbstractContentViewerComposite createContentViewerComposite(
			Composite parent) {

		try {

			ProjectBean[] projectBeans = PROJECT_SERVICE.getProjectsByUserId(1);

			for (int i = 0; i < projectBeans.length; i++) {
				final ProjectBean projectBean = projectBeans[i];
				selectedProjects.add(projectBean);
			}

			return super.createContentViewerComposite(parent);

		} catch (Exception e) {
			logger.error("createContentViewerComposite Error", e);
			throw new RuntimeException(e);
		}

	}

	public List<ProjectBean> getSelectedProjects() {
		return selectedProjects;
	}

	protected class ProjectFilterExplorerActionHandler extends
			TreeViewActionHandler {

		public ProjectFilterExplorerActionHandler(
				AbstractTreeViewPart treeViewPart) {
			super(treeViewPart);
		}

		@Override
		public boolean isActionSelected(ActionBean aAction) {
			if ("selectProjectAction".equals(aAction.getId())) {
				return getSelectedProjects().contains(
						((CustomActionBean<ProjectBean>) aAction)
								.getUserObject());
			} else {
				return false;
			}
		}

		public void selectProject(ActionEvent actionEvent) throws Exception {

			ProjectBean projectBean = ((CustomActionBean<ProjectBean>) actionEvent
					.getActionBean()).getUserObject();

			if (actionEvent.isChecked()) {
				getSelectedProjects().add(projectBean);
			} else {
				getSelectedProjects().remove(projectBean);
			}

			getTreeComposite().getTreeViewer().getTree().deselectAll();

			getTreeComposite().refresh();
		}
	}

}
