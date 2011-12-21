package com.ourteam.app.workspace.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.ui.UIConfigFactory;
import net.ui.eclipse.AbstractComposite;
import net.ui.eclipse.LocalHelper;
import net.ui.eclipse.form.FormOptionListDataProviderAdapter;
import net.ui.eclipse.form.GridFormComposite;
import net.ui.eclipse.form.IFormOptionListDataProvider;
import net.ui.eclipse.tree.AbstractTreeTableViewProvider;
import net.ui.eclipse.tree.ISubNodeBuilder;
import net.ui.eclipse.tree.TreeNodeItem;
import net.ui.eclipse.tree.TreeViewComposite;
import net.ui.model.form.FormBean;
import net.ui.model.tree.TreeBean;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;

import com.ourteam.project.domain.ProjectBean;
import com.ourteam.workspace.domain.WorkspaceConfigBean;
import com.ourteam.workspace.domain.WorkspaceConfigPropertyBean;
import com.ourteam.workspace.service.IWorkspaceService;
import com.ourteam.workspace.service.WorkspaceServiceFactory;

abstract public class WorkspaceConfigComposite extends AbstractComposite {
	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(WorkspaceConfigComposite.class);

	private TreeViewComposite configItemTreeViewComposite;

	public WorkspaceConfigComposite(Composite parent) {
		super(parent, SWT.NONE);
	}

	abstract protected long getWorkspaceId();

	abstract protected List<ProjectBean> getSelectedProjects();

	@Override
	protected void createContent(Composite parent) {

		parent.setLayout(new FillLayout());

		SashForm sashForm = new SashForm(parent, SWT.HORIZONTAL);

		Group leftGroup = new Group(sashForm, SWT.NONE);

		leftGroup.setText("配置项");

		leftGroup.setLayout(new FillLayout());

		configItemTreeViewComposite = new TreeViewComposite(leftGroup,
				new AbstractTreeTableViewProvider() {

					@Override
					public TreeBean getTreeConfig() {
						return UIConfigFactory.getInstance().getTreeConfig(
								"/ui/work/workspace_config.tree");
					}

					@Override
					public void initSubNodeBuilder(String id,
							ISubNodeBuilder builder) {
						((WorkspaceConfigItemSubNodeBuilder) builder)
								.setWorkspaceId(getWorkspaceId());
					}

				});

		final Group rightGroup = new Group(sashForm, SWT.NONE);

		rightGroup.setText("配置设置");

		rightGroup.setLayout(new GridLayout());

		configItemTreeViewComposite.getTreeViewer()
				.addSelectionChangedListener(new ISelectionChangedListener() {

					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						IStructuredSelection selection = (IStructuredSelection) event
								.getSelection();

						if (selection.isEmpty() == false) {
							openConfigForm(rightGroup,
									(TreeNodeItem) selection.getFirstElement());
						}

					}
				});

		sashForm.setWeights(new int[] { 30, 70 });

		configItemTreeViewComposite.getTreeViewer().expandToLevel(2);

	}

	protected void openConfigForm(Composite composite, TreeNodeItem treeNodeItem) {

		Control[] controls = composite.getChildren();

		for (int i = 0; i < controls.length; i++) {
			controls[i].dispose();
		}

		WorkspaceConfigBean configBean = (WorkspaceConfigBean) treeNodeItem
				.getUserObject();

		final long workspaceConfigId = configBean.getId();

		FormBean formBean = null;

		if (StringUtils.isNotBlank(configBean.getConfigForm())) {
			formBean = UIConfigFactory.getInstance().getFormConfig(
					configBean.getConfigForm());
		}

		if (formBean != null) {

			final List<Long> projectIds = new ArrayList<Long>();

			for (Iterator<ProjectBean> iterator = getSelectedProjects()
					.iterator(); iterator.hasNext();) {
				ProjectBean project = iterator.next();
				projectIds.add(new Long(project.getId()));

			}

			final GridFormComposite<Map<String, Object>> formComposite = new GridFormComposite<Map<String, Object>>(
					composite, formBean) {

				@Override
				protected void initFormOptionListDataProviders(
						Map<String, IFormOptionListDataProvider> listDataProiverMap) {
					super.initFormOptionListDataProviders(listDataProiverMap);

					listDataProiverMap.put("getDAOProviderType",
							new FormOptionListDataProviderAdapter(
									new DAOProviderTypeComboListProvider()));

					listDataProiverMap
							.put("getSCMService",
									new FormOptionListDataProviderAdapter(
											new SCMServiceComboListProvider(
													projectIds)));
				}

			};

			formComposite.setLayoutData(new GridData(GridData.FILL_BOTH));

			IWorkspaceService workspaceService = WorkspaceServiceFactory
					.getWorkspaceService();

			try {
				final WorkspaceConfigPropertyBean[] configFormBeans = workspaceService
						.getWorkspaceConfigProperties(getWorkspaceId(),
								workspaceConfigId);

				final Map<String, Object> map = new HashMap<String, Object>();

				for (int i = 0; i < configFormBeans.length; i++) {
					WorkspaceConfigPropertyBean workspaceConfigFormBean = configFormBeans[i];
					map.put(workspaceConfigFormBean.getConfigProperty(),
							workspaceConfigFormBean.getConfigValue());
				}

				formComposite.setFormDataModel(map);

				Composite buttonPanel = new Composite(composite, SWT.NONE);

				buttonPanel
						.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

				buttonPanel.setLayout(new GridLayout());

				Button applyButton = new Button(buttonPanel, SWT.PUSH);

				applyButton.setText(UIConfigFactory.getInstance()
						.getLocalMessage("apply", LocalHelper.getLocale()));

				GridData gridData = new GridData(SWT.RIGHT, SWT.BOTTOM, true,
						true);

				Point minSize = applyButton.computeSize(SWT.DEFAULT,
						SWT.DEFAULT, true);
				gridData.widthHint = Math.max(IDialogConstants.BUTTON_WIDTH,
						minSize.x);

				applyButton.setLayoutData(gridData);

				applyButton.addSelectionListener(new SelectionListener() {

					@Override
					public void widgetSelected(SelectionEvent e) {
						applyWorkspaceConfig(workspaceConfigId,
								configFormBeans,
								formComposite.getFormDataModel());
					}

					@Override
					public void widgetDefaultSelected(SelectionEvent e) {

						applyWorkspaceConfig(workspaceConfigId,
								configFormBeans,
								formComposite.getFormDataModel());
					}
				});

				composite.layout(true, true);

			} catch (Exception e) {
				throw new RuntimeException(e);
			}

		}

	}

	protected void applyWorkspaceConfig(long workspaceConfigId,
			WorkspaceConfigPropertyBean[] configFormBeans,
			Map<String, Object> formValueMap) {

		Map<String, WorkspaceConfigPropertyBean> beans = new HashMap<String, WorkspaceConfigPropertyBean>();

		for (int i = 0; i < configFormBeans.length; i++) {
			WorkspaceConfigPropertyBean workspaceConfigFormBean = configFormBeans[i];
			if (formValueMap.containsKey(workspaceConfigFormBean
					.getConfigProperty())) {
				workspaceConfigFormBean
						.setConfigValue(formValueMap.get(
								workspaceConfigFormBean.getConfigProperty())
								.toString());

				beans.put(workspaceConfigFormBean.getConfigProperty(),
						workspaceConfigFormBean);
			}
		}

		for (Iterator<String> iterator = formValueMap.keySet().iterator(); iterator
				.hasNext();) {
			String key = iterator.next();

			if (beans.containsKey(key) == false) {
				WorkspaceConfigPropertyBean configFormBean = new WorkspaceConfigPropertyBean();

				configFormBean.setWorkspaceConfigId(workspaceConfigId);
				configFormBean.setConfigProperty(key);
				configFormBean.setConfigValue(formValueMap.get(key).toString());

				beans.put(key, configFormBean);
			}

		}

		IWorkspaceService workspaceService = WorkspaceServiceFactory
				.getWorkspaceService();

		try {
			workspaceService.setWorkspaceConfigProperties(
					getWorkspaceId(),
					workspaceConfigId,
					beans.values().toArray(
							new WorkspaceConfigPropertyBean[beans.size()]));
		} catch (Exception e) {
			logger.error("applyWorkspaceConfig error", e);
			throw new RuntimeException(e);
		}
	}

}
