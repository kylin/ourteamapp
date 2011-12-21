package com.ourteam.app.workspace;

import net.ui.UIConfigFactory;
import net.ui.eclipse.LocalHelper;

public class SourceCodeCheckResult {

	private String fileName;

	private int beginLine;

	private int endLine;

	private int beginColumn;

	private int endColumn;

	private String packageName;

	private String methodName;

	private String className;

	private String variableName;

	private String description;

	private String priority;

	private String example;

	private String message;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public int getBeginLine() {
		return beginLine;
	}

	public void setBeginLine(int beginLine) {
		this.beginLine = beginLine;
	}

	public int getEndLine() {
		return endLine;
	}

	public void setEndLine(int endLine) {
		this.endLine = endLine;
	}

	public int getBeginColumn() {
		return beginColumn;
	}

	public void setBeginColumn(int beginColumn) {
		this.beginColumn = beginColumn;
	}

	public int getEndColumn() {
		return endColumn;
	}

	public void setEndColumn(int endColumn) {
		this.endColumn = endColumn;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getVariableName() {
		return variableName;
	}

	public void setVariableName(String variableName) {
		this.variableName = variableName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLabel() {
		StringBuffer buffer = new StringBuffer();

		buffer.append(UIConfigFactory.getInstance().getLocalMessage(
				getPriority(), LocalHelper.getLocale()));

		buffer.append("  " + getBeginLine());

		if (getBeginLine() != getEndLine()) {
			buffer.append(" ~ " + getEndLine());
		}
		
		buffer.append("行");

		// buffer.append(" : 列：" + getBeginColumn());
		//
		// if (getBeginColumn() != getEndColumn()) {
		// buffer.append(" ~ " + getEndColumn());
		// }

		buffer.append(" - ").append(getDescription());

		return buffer.toString();
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getExample() {
		return example;
	}

	public void setExample(String example) {
		this.example = example;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
