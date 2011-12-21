package com.ourteam.app.workspace.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.ui.UIConfigFactory;
import net.ui.eclipse.AbstractComposite;
import net.ui.eclipse.ICompositeInitHelper;
import net.ui.eclipse.action.AbstractDispatchActionHandler;
import net.ui.eclipse.action.ActionEvent;
import net.ui.eclipse.action.ToolBarComposite;
import net.ui.eclipse.form.FormOptionListDataProviderAdapter;
import net.ui.eclipse.form.IFormOptionListDataProvider;
import net.ui.eclipse.table.TableViewComposite;
import net.ui.eclipse.utils.AbstractFormDialogProvider;
import net.ui.eclipse.utils.SWTUtils;
import net.ui.eclipse.widget.AbstractConfigableSearchComposite;
import net.ui.eclipse.widget.SearchDataModel;
import net.ui.model.action.ActionBean;
import net.ui.model.action.ActionGroupBean;
import net.ui.model.action.ActionSetBean;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import com.ourteam.app.workspace.editor.UIActionConfigEditorPart.UIActionDomainComboListProvider;
import com.ourteam.app.workspace.ui.UIActionGroupRefActionConfigComposite.CompositeInitor;

public class UIActionGroupRefActionConfigComposite extends
		AbstractComposite<CompositeInitor> {

	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(UIActionGroupRefActionConfigComposite.class);

	private ActionBeanSearchComposite actionBeanSearchComposite;

	private TableViewComposite<ActionBean> tableViewComposite;

	private ToolBarComposite toolBarComposite;

	public UIActionGroupRefActionConfigComposite(Composite parent,
			CompositeInitor compositeInitor) {
		super(parent, SWT.NONE, compositeInitor);
	}

	@Override
	protected void createContent(Composite parent) {

		this.setLayout(new GridLayout());

		SashForm sashForm = new SashForm(this, SWT.VERTICAL);

		sashForm.setLayoutData(new GridData(GridData.FILL_BOTH));

		actionBeanSearchComposite = new ActionBeanSearchComposite(sashForm,
				SWT.NONE);

		tableViewComposite = new TableViewComposite<ActionBean>(sashForm,
				UIConfigFactory.getInstance().getTableConfig(
						"uiActionRefListTable"), SWT.BORDER) {

			@Override
			protected ToolBarComposite createHeadToolBar(Composite composite) {
				toolBarComposite = new ToolBarComposite(composite,
						UIConfigFactory.getInstance().getActionGroupConfig(
								"actionGroupRefList"), new ActionHandler(),
						SWT.FLAT);
				return toolBarComposite;
			}

		};

		tableViewComposite.getTableViewer().addDoubleClickListener(
				new IDoubleClickListener() {

					@Override
					public void doubleClick(DoubleClickEvent event) {
						try {
							toolBarComposite.getActionHandler().fireAction(
									"edit");
						} catch (Exception e) {
							logger.error(e);
						}
					}
				});

		tableViewComposite.setDataList(getInitHelper().getActionGroupBean()
				.getActionBeans());

		actionBeanSearchComposite.addSelectionChangedListener(toolBarComposite);

		toolBarComposite.update();

	}

	public ActionBean[] getActionRefs() {

		List<ActionBean> actionBeans = this.tableViewComposite.getDataList();

		return actionBeans.toArray(new ActionBean[actionBeans.size()]);
	}

	static public class CompositeInitor implements ICompositeInitHelper {

		private ActionSetBean actionSetBean;

		private ActionGroupBean actionGroupBean;

		public CompositeInitor(ActionSetBean actionSetBean,
				ActionGroupBean actionGroupBean) {
			super();
			this.actionSetBean = actionSetBean;
			this.actionGroupBean = actionGroupBean;
		}

		public ActionSetBean getActionSetBean() {
			return actionSetBean;
		}

		public ActionGroupBean getActionGroupBean() {
			return actionGroupBean;
		}

		@Override
		public void onConstructor(Composite composite) {

		}

	}

	public static class ActionBeanSearchDataModel extends SearchDataModel {
		private String domainId;

		private String actionId;

		public String getDomainId() {
			return domainId;
		}

		public void setDomainId(String domainId) {
			this.domainId = domainId;
		}

		public String getActionId() {
			return actionId;
		}

		public void setActionId(String actionId) {
			this.actionId = actionId;
		}

	}

	class ActionBeanSearchComposite
			extends
			AbstractConfigableSearchComposite<ActionBeanSearchDataModel, ActionBean> {

		public ActionBeanSearchComposite(Composite parent, int style) {
			super(parent, style);
		}

		@Override
		protected ActionBean[] doSearch(
				ActionBeanSearchDataModel searchDataModel) throws Exception {

			ActionSetBean actionSetBean = UIActionGroupRefActionConfigComposite.this
					.getInitHelper().getActionSetBean();

			ActionBean[] actionBeans = null;

			List<ActionBean> queryResults = new ArrayList<ActionBean>();

			if (StringUtils.isNotBlank(searchDataModel.getDomainId())) {
				actionBeans = actionSetBean.getActions(searchDataModel
						.getDomainId());
			} else {
				actionBeans = actionSetBean.getActions();
			}

			if (StringUtils.isNotBlank(searchDataModel.getActionId())) {
				for (int i = 0; i < actionBeans.length; i++) {
					ActionBean actionBean = actionBeans[i];
					if (StringUtils.containsIgnoreCase(actionBean.getId(),
							searchDataModel.getActionId())) {
						queryResults.add(actionBean);
					}
				}
			} else {
				queryResults.addAll(Arrays.asList(actionBeans));
			}

			return queryResults.toArray(new ActionBean[queryResults.size()]);
		}

		@Override
		protected void doInitFormOptionListDataProviders(
				Map<String, IFormOptionListDataProvider> listDataProiverMap) {

			ActionSetBean actionSetBean = UIActionGroupRefActionConfigComposite.this
					.getInitHelper().getActionSetBean();

			UIActionDomainComboListProvider listProvider = new UIActionDomainComboListProvider(
					actionSetBean);

			listDataProiverMap.put("getUIActionDomains",
					new FormOptionListDataProviderAdapter(listProvider));
		}

		@Override
		protected String getQueryFormConfigId() {
			return "uiActionSearchForm";
		}

		@Override
		protected String getQueryResultConfigId() {
			return "uiActionBeanListTable";
		}

		@Override
		protected ActionBeanSearchDataModel createSearchDataModel() {
			return new ActionBeanSearchDataModel();
		}

	}

	class ActionHandler extends AbstractDispatchActionHandler {

		@Override
		public boolean isActionEnable(ActionBean aAction) {

			List<ActionBean> selectedActionBeans = tableViewComposite
					.getSelectedDataList();

			if ("addUIActionRef".equals(aAction.getId())) {
				return actionBeanSearchComposite.getSelectedSearchResults()
						.isEmpty() == false;
			} else if ("edit".equals(aAction.getId())) {
				return selectedActionBeans.isEmpty() == false;
			} else if ("removeUIActionRef".equals(aAction.getId())) {
				return selectedActionBeans.isEmpty() == false;
			} else if ("moveUp".equals(aAction.getId())) {

				return selectedActionBeans.isEmpty() == false
						&& tableViewComposite.canMoveUp(selectedActionBeans
								.get(0));
			} else if ("moveDown".equals(aAction.getId())) {

				return selectedActionBeans.isEmpty() == false
						&& tableViewComposite.canMoveDown(selectedActionBeans
								.get(0));
			} else {
				return true;
			}
		}

		public void addUIActionRef(ActionEvent actionEvent) throws Exception {

			List<ActionBean> selectedActionBeans = actionBeanSearchComposite
					.getSelectedSearchResults();

			List<ActionBean> actionBeans = new ArrayList<ActionBean>();

			for (Iterator<ActionBean> iterator = selectedActionBeans.iterator(); iterator
					.hasNext();) {
				ActionBean actionBean = iterator.next();

				ActionBean refActionBean = new ActionBean();

				refActionBean.setRef(StringUtils.isNotBlank(actionBean
						.getDomain()) ? actionBean.getDomain() + "."
						+ actionBean.getId() : actionBean.getId());

				actionBeans.add(refActionBean);

			}

			tableViewComposite.addRows(actionBeans);

		}

		public void removeUIActionRef(ActionEvent actionEvent) throws Exception {
			tableViewComposite.removeSelectedRows();
		}

		public void moveUp(ActionEvent actionEvent) throws Exception {
			tableViewComposite.moveUpRow(tableViewComposite.getTable()
					.getSelectionIndex());
			toolBarComposite.update();
		}

		public void moveDown(ActionEvent actionEvent) throws Exception {
			tableViewComposite.moveDownRow(tableViewComposite.getTable()
					.getSelectionIndex());
			toolBarComposite.update();

		}

		public void edit(ActionEvent actionEvent) throws Exception {

			ActionBean actionBean = tableViewComposite.getSelectedDataList()
					.get(0);

			AbstractFormDialogProvider<ActionBean> dialogProvider = new AbstractFormDialogProvider<ActionBean>(
					actionBean) {

				@Override
				public String getTitle() {
					return "编辑动作引用信息";
				}

				@Override
				protected String getFormConfigId() {
					return "uiActionRefConfigForm";
				}

				@Override
				public int getInitialHeight() {
					return 550;
				}

				@Override
				public int getInitialWidth() {
					return 400;
				}

				@Override
				protected void initFormOptionListDataProviders(
						Map<String, IFormOptionListDataProvider> listDataProiverMap) {

					UIActionDomainComboListProvider listProvider = new UIActionDomainComboListProvider(
							getInitHelper().getActionSetBean());

					listDataProiverMap
							.put("getUIActionDomains",
									new FormOptionListDataProviderAdapter(
											listProvider));
				}
			};

			if (SWTUtils.openDialog(getShell(), dialogProvider)) {

				dialogProvider.getFormDataModel();

			}

		}

	}

}
