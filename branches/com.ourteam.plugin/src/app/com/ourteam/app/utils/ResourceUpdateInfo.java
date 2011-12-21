package com.ourteam.app.utils;

import java.util.Date;

public class ResourceUpdateInfo {

	private String revision;
	
	private Date date;
	
	private Date time;
	
	private boolean overWriteLocal;
	
	private boolean updateToLastVersion;

	public String getRevision() {
		return revision;
	}

	public void setRevision(String revision) {
		this.revision = revision;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean isOverWriteLocal() {
		return overWriteLocal;
	}

	public void setOverWriteLocal(boolean overWriteLocal) {
		this.overWriteLocal = overWriteLocal;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public boolean isUpdateToLastVersion() {
		return updateToLastVersion;
	}

	public void setUpdateToLastVersion(boolean updateToLastVersion) {
		this.updateToLastVersion = updateToLastVersion;
	}
	
	
}
