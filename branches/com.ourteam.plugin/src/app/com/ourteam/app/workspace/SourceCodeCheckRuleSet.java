package com.ourteam.app.workspace;

import java.util.ArrayList;
import java.util.List;

public class SourceCodeCheckRuleSet {

	private String name;

	private String description;

	private List<SourceCodeCheckResult> checkResults = new ArrayList<SourceCodeCheckResult>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<SourceCodeCheckResult> getCheckResults() {
		return checkResults;
	}

	public String getLabel() {
		return this.name + " (" + this.checkResults.size() + ")";
	}

}
