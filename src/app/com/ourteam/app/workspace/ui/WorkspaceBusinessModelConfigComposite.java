package com.ourteam.app.workspace.ui;

import java.util.List;

import net.ui.UIConfigFactory;
import net.ui.eclipse.AbstractComposite;
import net.ui.eclipse.editorpart.AbstractObjectRelationActionHandler;
import net.ui.eclipse.table.TableViewComposite;
import net.ui.eclipse.utils.IDialogProvider;
import net.ui.eclipse.widget.AbstractDataListTableComposite;
import net.ui.eclipse.wizard.IWizardProvider;
import net.ui.model.action.ActionBean;
import net.ui.model.table.TableBean;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;

import com.ourteam.app.workspace.editor.AddWorkspaceResourceBusinessPackageWizardProvider;
import com.ourteam.project.domain.ProjectBean;
import com.ourteam.workspace.dao.WorkspaceResourceTypeEnum;
import com.ourteam.workspace.domain.WorkspaceResourceBean;
import com.ourteam.workspace.domain.WorkspaceResourceBusinessPackageRelateBean;
import com.ourteam.workspace.service.IWorkspaceService;
import com.ourteam.workspace.service.WorkspaceServiceFactory;

abstract public class WorkspaceBusinessModelConfigComposite extends
		AbstractComposite {
	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(WorkspaceBusinessModelConfigComposite.class);

	private static final IWorkspaceService workspaceService = WorkspaceServiceFactory
			.getWorkspaceService();

	private AbstractDataListTableComposite<WorkspaceResourceBusinessPackageRelateBean> businessPackageTableViewComposite;

	private TableViewComposite<WorkspaceResourceBean> workspaceResourceTableViewComposite;

	public WorkspaceBusinessModelConfigComposite(Composite parent, int style) {
		super(parent, style);

	}

	abstract protected long getWorkspaceId();

	abstract protected List<ProjectBean> getSelectedProjects();

	@Override
	protected void createContent(Composite parent) {
		parent.setLayout(new FillLayout());

		SashForm sashForm = new SashForm(parent, SWT.VERTICAL);

		Group leftGroup = new Group(sashForm, SWT.NONE);

		leftGroup.setText("源码目录");

		leftGroup.setLayout(new FillLayout());

		TableBean tableBean = UIConfigFactory.getInstance().getTableConfig(
				"workspaceSourceCodeResourceTable");

		workspaceResourceTableViewComposite = new TableViewComposite<WorkspaceResourceBean>(
				leftGroup, tableBean, SWT.BORDER);

		workspaceResourceTableViewComposite.getTableViewer()
				.addSelectionChangedListener(new ISelectionChangedListener() {

					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						loadWorkspaceResourceBusinessPackages();
					}
				});

		final Group rightGroup = new Group(sashForm, SWT.NONE);

		rightGroup.setText("业务对象包");

		rightGroup.setLayout(new FillLayout());

		businessPackageTableViewComposite = new AbstractDataListTableComposite<WorkspaceResourceBusinessPackageRelateBean>(
				rightGroup, SWT.NONE) {

			@Override
			protected TableBean getTableConfig() {
				return UIConfigFactory.getInstance().getTableConfig(
						"workspaceSourceCodeResourceBusinessPackageRelate");
			}

			@Override
			protected String[] getActionGroupIds() {
				return new String[] { "relationActionGroup" };
			}

		};

		businessPackageTableViewComposite
				.setActionHandler(new BusinessPackageTableActionHandler());

		initData();
	}

	protected void loadWorkspaceResourceBusinessPackages() {
		try {
			List<WorkspaceResourceBean> workspaceResourceBeans = workspaceResourceTableViewComposite
					.getSelectedDataList();

			if (workspaceResourceBeans.size() > 0) {

				WorkspaceResourceBusinessPackageRelateBean[] packageRelateBeans = workspaceService
						.getWorkspaceResourceBusinessPackageRelates(workspaceResourceBeans
								.get(0).getId());

				businessPackageTableViewComposite.getTableComposite()
						.setDataList(packageRelateBeans);

			}
		} catch (Exception e) {
			logger.error("load data error", e);
		}
	}

	protected void initData() {

		try {

			WorkspaceResourceBean[] resourceBeans = workspaceService
					.getWorkspaceResources(
							getWorkspaceId(),
							new WorkspaceResourceTypeEnum[] { WorkspaceResourceTypeEnum.SOURCE_CODE });

			workspaceResourceTableViewComposite.setDataList(resourceBeans);

			if (ArrayUtils.isNotEmpty(resourceBeans)) {
				workspaceResourceTableViewComposite
						.getTableViewer()
						.setSelection(new StructuredSelection(resourceBeans[0]));
			}

		} catch (Exception e) {
			logger.error("init data error", e);
		}

	}

	class BusinessPackageTableActionHandler
			extends
			AbstractObjectRelationActionHandler<WorkspaceResourceBusinessPackageRelateBean> {

		@Override
		protected List<WorkspaceResourceBusinessPackageRelateBean> getSelectedItems() {
			return businessPackageTableViewComposite.getTableComposite()
					.getSelectedDataList();
		}

		@Override
		protected void reLoadDataList() throws Exception {
			loadWorkspaceResourceBusinessPackages();
		}

		@Override
		protected Shell getShell() {
			return WorkspaceBusinessModelConfigComposite.this.getShell();
		}

		@Override
		protected void doRemoveRelations(
				List<WorkspaceResourceBusinessPackageRelateBean> items)
				throws Exception {

			long[] relatedIds = new long[items.size()];

			for (int i = 0; i < relatedIds.length; i++) {
				relatedIds[i] = items.get(i).getId();

			}

			workspaceService
					.removeWorkspaceResourceBusinessPackageRelates(relatedIds);

		}

		@Override
		protected IWizardProvider getAddRelationWizardProvider(
				ActionBean actionBean) throws Exception {

			List<WorkspaceResourceBean> workspaceResourceBeans = workspaceResourceTableViewComposite
					.getSelectedDataList();

			if (workspaceResourceBeans.size() > 0) {
				return new AddWorkspaceResourceBusinessPackageWizardProvider(
						workspaceResourceBeans.get(0).getId());
			} else {
				return null;
			}

		}

		@Override
		protected IDialogProvider getEditDialogProvider(
				List<WorkspaceResourceBusinessPackageRelateBean> items)
				throws Exception {

			return null;

		}

	}

}
