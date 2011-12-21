package com.ourteam.app.workspace.ui;

import net.ui.eclipse.tree.ISubNodeBuilder;

import org.apache.commons.lang.StringUtils;

import com.ourteam.app.workspace.SourceCodeCheckResult;
import com.ourteam.app.workspace.SourceCodeCheckRuleSet;

public class PMDCheckResultSubNodeBuilder implements
		ISubNodeBuilder<SourceCodeCheckRuleSet, SourceCodeCheckResult> {

	@Override
	public String getSubNodeDefineId(SourceCodeCheckResult nodeObject) {
		return "PDMCheckResult"
				+ StringUtils.remove(nodeObject.getPriority(), " ");
	}

	@Override
	public String[] getSubNodeActionGroupIds(SourceCodeCheckResult nodeObject) {

		return null;
	}

	@Override
	public SourceCodeCheckResult[] getSubNodes(
			SourceCodeCheckRuleSet aParentObject) throws Exception {
		return aParentObject.getCheckResults().toArray(
				new SourceCodeCheckResult[aParentObject.getCheckResults()
						.size()]);
	}

}
