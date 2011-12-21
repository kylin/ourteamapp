package com.ourteam.app.utils;

import java.util.Date;

public class VersionLogInformation {

	private String revision;

	private String tag;

	private Date revisionTime;

	private String author;

	private String comment;

	private String modifiedLines;

	private int addedLines;

	private int removedLines;

	public String getRevision() {
		return revision;
	}

	public void setRevision(String revision) {
		this.revision = revision;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public Date getRevisionTime() {
		return revisionTime;
	}

	public void setRevisionTime(Date revisionTime) {
		this.revisionTime = revisionTime;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getModifiedLines() {
		return modifiedLines;
	}

	public void setModifiedLines(String modifyLines) {
		this.modifiedLines = modifyLines;
	}

	public int getAddedLines() {
		return addedLines;
	}

	public void setAddedLines(int addLines) {
		this.addedLines = addLines;
	}

	public int getRemovedLines() {
		return removedLines;
	}

	public void setRemovedLines(int removeLines) {
		this.removedLines = removeLines;
	}

}
