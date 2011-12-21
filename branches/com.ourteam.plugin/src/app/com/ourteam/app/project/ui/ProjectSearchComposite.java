package com.ourteam.app.project.ui;

import net.ui.eclipse.widget.AbstractConfigableSearchComposite;

import org.eclipse.swt.widgets.Composite;

import com.ourteam.project.domain.ProjectBean;
import com.ourteam.project.service.IProjectService;
import com.ourteam.project.service.ProjectServiceFactory;

public class ProjectSearchComposite extends
		AbstractConfigableSearchComposite<ProjectSearchDataModel, ProjectBean> {

	private static final IProjectService PROJECT_SERVICE = ProjectServiceFactory
			.getProjectService();

	public ProjectSearchComposite(Composite parent, int style) {
		super(parent, style);
	}

	
	@Override
	protected ProjectBean[] doSearch(ProjectSearchDataModel searchDataModel)
			throws Exception {
		return PROJECT_SERVICE.getProjectsByUserId(1);
	}

	@Override
	protected String getQueryFormConfigId() {
		return "projectSearchForm";
	}

	@Override
	protected String getQueryResultConfigId() {
		return "projectSearchResultList";
	}


	@Override
	protected ProjectSearchDataModel createSearchDataModel() {
		return new ProjectSearchDataModel();
	}

}
