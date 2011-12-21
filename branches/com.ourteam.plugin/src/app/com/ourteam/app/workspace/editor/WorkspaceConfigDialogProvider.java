package com.ourteam.app.workspace.editor;

import java.util.List;

import net.ui.eclipse.utils.AbstractTabbedPanelDialogProvider;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.widgets.Control;

import com.ourteam.app.workspace.ui.WorkspaceBusinessModelConfigComposite;
import com.ourteam.app.workspace.ui.WorkspaceConfigComposite;
import com.ourteam.project.domain.ProjectBean;

public class WorkspaceConfigDialogProvider extends
		AbstractTabbedPanelDialogProvider {

	private long workspaceId;

	private List<ProjectBean> selectedProjects;

	public WorkspaceConfigDialogProvider(List<ProjectBean> selectedProjects,
			long workspaceId) {
		super();
		this.selectedProjects = selectedProjects;
		this.workspaceId = workspaceId;
	}

	@Override
	public String getTitle() {
		return "配置工作空间";
	}

	@Override
	public boolean doOkPressed() throws Exception {
		return true;
	}

	@Override
	protected String getTabbedPaneConfigId() {
		return "workspaceConfigTab";
	}

	@Override
	protected void initTabPanel(Control aPanel) throws Exception {

	}

	@Override
	protected Control constructTabPanel(Class<?> panelClass,
			CTabFolder tabFolder) {
		if (WorkspaceConfigComposite.class.equals(panelClass)) {
			return new WorkspaceConfigComposite(tabFolder) {

				@Override
				protected long getWorkspaceId() {
					return workspaceId;
				}
				
				@Override
				protected List<ProjectBean> getSelectedProjects() {
					return selectedProjects;
				}
			};
		} else if (WorkspaceBusinessModelConfigComposite.class
				.equals(panelClass)) {
			return new WorkspaceBusinessModelConfigComposite(tabFolder,
					SWT.NONE) {

				@Override
				protected long getWorkspaceId() {
					return workspaceId;
				}

				@Override
				protected List<ProjectBean> getSelectedProjects() {
					return selectedProjects;
				}
			};
		} else {
			return super.constructTabPanel(panelClass, tabFolder);
		}

	}

}
