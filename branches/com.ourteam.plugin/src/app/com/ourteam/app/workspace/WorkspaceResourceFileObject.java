package com.ourteam.app.workspace;

import java.io.File;
import java.io.Serializable;

import org.apache.commons.lang.time.DateFormatUtils;

import com.ourteam.app.utils.VersionInfo;

public class WorkspaceResourceFileObject implements Serializable {

	private File resourceFile;

	private String resourceType;

	private long workspaceId;

	private VersionInfo versionInfo;

	public WorkspaceResourceFileObject(File resourceFile) {
		super();
		this.resourceFile = resourceFile;
	}

	public File getResourceFile() {
		return resourceFile;
	}

	public String getName() {

		return this.resourceFile.getName();
	}

	public String getNameWithVersionInfo() {

		StringBuffer stringBuffer = new StringBuffer();

		if (this.versionInfo != null) {

			if (this.versionInfo.isLocalModified()) {
				stringBuffer.append(">");
			}

			stringBuffer.append(this.resourceFile.getName());

			stringBuffer.append("   ").append(this.versionInfo.getRevision());

			stringBuffer.append("   ").append(
					DateFormatUtils.ISO_DATETIME_FORMAT.format(this.versionInfo
							.getTimestamp()));

			stringBuffer.append("   ").append(
					this.versionInfo.getLastCommitAuthor());

			return stringBuffer.toString();
		} else {
			return this.resourceFile.getName();
		}
	}

	public String getDescription() {
		return "";
	}

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public long getWorkspaceId() {
		return workspaceId;
	}

	public void setWorkspaceId(long workspaceId) {
		this.workspaceId = workspaceId;
	}

	public VersionInfo getVersionInfo() {
		return versionInfo;
	}

	public void setVersionInfo(VersionInfo versionInfo) {
		this.versionInfo = versionInfo;
	}

	public void setResourceFile(File resourceFile) {
		this.resourceFile = resourceFile;
	}

}
