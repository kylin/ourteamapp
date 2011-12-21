package com.ourteam.app.workspace.ui;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.sourceforge.pmd.IRuleViolation;
import net.sourceforge.pmd.PMD;
import net.sourceforge.pmd.Report;
import net.sourceforge.pmd.RuleContext;
import net.sourceforge.pmd.RuleSet;
import net.sourceforge.pmd.RuleSetFactory;
import net.sourceforge.pmd.RuleSets;
import net.sourceforge.pmd.SourceType;
import net.ui.eclipse.tree.ISubNodeBuilder;

import org.apache.commons.collections.IteratorUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.SystemUtils;

import com.ourteam.app.workspace.SourceCodeCheckResult;
import com.ourteam.app.workspace.SourceCodeCheckRuleSet;
import com.ourteam.app.workspace.WorkspaceResourceFileObject;

public class PMDRuleSetSubNodeBuilder implements
		ISubNodeBuilder<Object, SourceCodeCheckRuleSet> {

	private WorkspaceResourceFileObject workspaceResourceFileObject;

	private List<String> priorityList = new ArrayList<String>();

	@Override
	public SourceCodeCheckRuleSet[] getSubNodes(Object aParentObject)
			throws Exception {

		PMD pmd = new PMD();

		pmd.setClassLoader(Thread.currentThread().getContextClassLoader());

		pmd.setJavaVersion(SourceType.JAVA_16);

		RuleSetFactory ruleSetFactory = new RuleSetFactory();

		RuleSets ruleSets = new RuleSets();

		Map<String, SourceCodeCheckRuleSet> checkResults = new HashMap<String, SourceCodeCheckRuleSet>();

		for (Iterator<RuleSet> iterator = ruleSetFactory
				.getRegisteredRuleSets(); iterator.hasNext();) {
			RuleSet ruleSet = iterator.next();
			ruleSets.addRuleSet(ruleSet);
			SourceCodeCheckRuleSet checkRuleSet = new SourceCodeCheckRuleSet();

			checkRuleSet.setName(ruleSet.getName());

			checkRuleSet.setDescription(ruleSet.getDescription());

			checkResults.put(ruleSet.getName(), checkRuleSet);
		}

		RuleContext ctx = new RuleContext();

		Report report = new Report();
		ctx.setReport(report);

		ctx.setSourceCodeFilename(workspaceResourceFileObject.getResourceFile()
				.getName());
		ctx.setSourceCodeFile(workspaceResourceFileObject.getResourceFile());

		ruleSets.start(ctx);

		InputStream stream = new BufferedInputStream(
				FileUtils.openInputStream(workspaceResourceFileObject
						.getResourceFile()));

		pmd.processFile(stream, "utf-8", ruleSets, ctx);

		ruleSets.end(ctx);

		for (Iterator<IRuleViolation> iterator = report.getViolationTree()
				.iterator(); iterator.hasNext();) {
			IRuleViolation ruleViolation = iterator.next();

			if (priorityList
					.contains(ruleViolation.getRule().getPriorityName()) == false) {
				continue;
			}

			List<SourceCodeCheckResult> results = checkResults.get(
					ruleViolation.getRule().getRuleSetName()).getCheckResults();

			SourceCodeCheckResult checkResult = new SourceCodeCheckResult();

			checkResult.setBeginColumn(ruleViolation.getBeginColumn());
			checkResult.setBeginLine(ruleViolation.getBeginLine());
			checkResult.setClassName(ruleViolation.getClassName());
			checkResult.setDescription(ruleViolation.getDescription());
			checkResult.setEndColumn(ruleViolation.getEndColumn());
			checkResult.setEndLine(ruleViolation.getEndLine());
			checkResult.setFileName(ruleViolation.getFilename());
			checkResult.setMethodName(ruleViolation.getMethodName());
			checkResult.setPackageName(ruleViolation.getPackageName());
			checkResult.setVariableName(ruleViolation.getVariableName());
			checkResult.setPriority(ruleViolation.getRule().getPriorityName());

			List<String> examples = ruleViolation.getRule().getExamples();
			StringBuffer buffer = new StringBuffer();
			for (Iterator<String> examplesIterator = examples.iterator(); examplesIterator
					.hasNext();) {
				String example = examplesIterator.next();
				buffer.append(example).append(SystemUtils.LINE_SEPARATOR);
			}

			checkResult.setExample(buffer.toString());

			checkResult.setMessage(ruleViolation.getRule().getMessage());

			results.add(checkResult);

		}

		return (SourceCodeCheckRuleSet[]) IteratorUtils.toArray(checkResults
				.values().iterator(), SourceCodeCheckRuleSet.class);
	}

	@Override
	public String getSubNodeDefineId(SourceCodeCheckRuleSet nodeObject) {
		return "PDMCheckRuleSet";
	}

	@Override
	public String[] getSubNodeActionGroupIds(SourceCodeCheckRuleSet nodeObject) {
		return null;
	}

	public void setWorkspaceResourceFileObject(
			WorkspaceResourceFileObject workspaceResourceFileObject) {
		this.workspaceResourceFileObject = workspaceResourceFileObject;
	}

	public List<String> getPriorityList() {
		return priorityList;
	}

	public void setPriorityList(List<String> priorityList) {
		this.priorityList = priorityList;
	}

}
