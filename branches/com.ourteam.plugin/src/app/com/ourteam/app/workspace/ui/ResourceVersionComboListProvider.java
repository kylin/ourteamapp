package com.ourteam.app.workspace.ui;

import java.io.File;

import net.ui.eclipse.utils.AbstractComboListProvider;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ourteam.app.utils.SCMUtils;
import com.ourteam.app.utils.VersionLogInformation;
import com.ourteam.app.workspace.WorkspaceResourceFileObject;
import com.ourteam.workspace.domain.WorkspaceBean;
import com.ourteam.workspace.service.IWorkspaceService;
import com.ourteam.workspace.service.WorkspaceServiceFactory;

public class ResourceVersionComboListProvider extends
		AbstractComboListProvider<VersionLogInformation> {
	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory.getLog(ResourceVersionComboListProvider.class);

	private WorkspaceResourceFileObject fileObject;

	private static final IWorkspaceService WORKSPACE_SERVICE = WorkspaceServiceFactory
			.getWorkspaceService();

	public ResourceVersionComboListProvider(
			WorkspaceResourceFileObject fileObject) {
		super();
		this.fileObject = fileObject;
	}

	@Override
	public VersionLogInformation[] getDataList() {
		long workspaceId = fileObject.getWorkspaceId();

		WorkspaceBean workspaceBean;
		try {
			workspaceBean = WORKSPACE_SERVICE.getWorkspaceById(workspaceId);

			VersionLogInformation[] versionLogInformations = SCMUtils
					.showResourceLog(WORKSPACE_SERVICE
							.getWorkspaceFileObject(workspaceBean),
							new File[] { fileObject.getResourceFile() },
							SCMUtils.getWorkspaceSCMConfig(workspaceId), null);
			return versionLogInformations;
		} catch (Exception e) {
			logger.error("getResourceversionLog Error",e);
			return new VersionLogInformation[0];
		}

	}

	@Override
	public String getDataLabel(VersionLogInformation dataItem) {
		return dataItem.getRevision() + " - " + dataItem.getAuthor();
	}

}
