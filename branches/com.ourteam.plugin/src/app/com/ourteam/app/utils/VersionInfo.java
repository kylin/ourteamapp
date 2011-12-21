package com.ourteam.app.utils;

import java.util.Date;

public class VersionInfo {

	private String fileName;

	private String revision;

	private Date timestamp;

	private String options;

	private String tagdate;
	
	private String serverType;
	
	private String lastCommitAuthor;
	
	private boolean localModified;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getRevision() {
		return revision;
	}

	public void setRevision(String revision) {
		this.revision = revision;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getOptions() {
		return options;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public String getTagdate() {
		return tagdate;
	}

	public void setTagdate(String tagdate) {
		this.tagdate = tagdate;
	}

	public String getServerType() {
		return serverType;
	}

	public void setServerType(String serverType) {
		this.serverType = serverType;
	}

	public boolean isLocalModified() {
		return localModified;
	}

	public void setLocalModified(boolean localModified) {
		this.localModified = localModified;
	}

	public String getLastCommitAuthor() {
		return lastCommitAuthor;
	}

	public void setLastCommitAuthor(String lastCommitAuthor) {
		this.lastCommitAuthor = lastCommitAuthor;
	}
	
	
}
