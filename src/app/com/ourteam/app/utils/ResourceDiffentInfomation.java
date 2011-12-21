package com.ourteam.app.utils;

import java.io.Serializable;

import com.ourteam.app.workspace.WorkspaceResourceFileObject;

public class ResourceDiffentInfomation implements Serializable {

	private String leftVersion;

	private String rightVersion;

	private String rightContent;

	private String leftContent;

	private DiffDetail[] leftDiffDetails;

	private DiffDetail[] rightDiffDetails;

	private WorkspaceResourceFileObject resourceFileObject;

	public String getLeftVersion() {
		return leftVersion;
	}

	public void setLeftVersion(String leftVersion) {
		this.leftVersion = leftVersion;
	}

	public String getRightVersion() {
		return rightVersion;
	}

	public void setRightVersion(String rightVersion) {
		this.rightVersion = rightVersion;
	}

	public String getRightContent() {
		return rightContent;
	}

	public void setRightContent(String rightContent) {
		this.rightContent = rightContent;
	}

	public String getLeftContent() {
		return leftContent;
	}

	public void setLeftContent(String leftContent) {
		this.leftContent = leftContent;
	}

	public WorkspaceResourceFileObject getResourceFileObject() {
		return resourceFileObject;
	}

	public void setResourceFileObject(
			WorkspaceResourceFileObject resourceFileObject) {
		this.resourceFileObject = resourceFileObject;
	}

	public DiffDetail[] getLeftDiffDetails() {
		return leftDiffDetails;
	}

	public void setLeftDiffDetails(DiffDetail[] leftDiffDetails) {
		this.leftDiffDetails = leftDiffDetails;
	}

	public DiffDetail[] getRightDiffDetails() {
		return rightDiffDetails;
	}

	public void setRightDiffDetails(DiffDetail[] rightDiffDetails) {
		this.rightDiffDetails = rightDiffDetails;
	}

	public static class DiffDetail {

		private int type;

		private int lineNumber;

		private String content;

		public int getType() {
			return type;
		}

		public void setType(int type) {
			this.type = type;
		}

		public int getLineNumber() {
			return lineNumber;
		}

		public void setLineNumber(int lineNumber) {
			this.lineNumber = lineNumber;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

	}
}
