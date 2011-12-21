package com.ourteam.app.middleware.editor;

import java.util.List;

import net.ui.UIConfigFactory;
import net.ui.eclipse.action.ActionEvent;
import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.action.ToolBarComposite;
import net.ui.eclipse.editorpart.AbstractFormEditorPart;
import net.ui.eclipse.table.TableViewComposite;
import net.ui.eclipse.utils.SWTUtils;
import net.ui.model.action.ActionBean;
import net.ui.model.action.ActionGroupBean;

import org.apache.commons.lang.StringUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.events.ExpansionAdapter;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.widgets.Section;

import com.ourteam.app.IOurTeamServiceConst;
import com.ourteam.hr.domain.EmployeeBean;
import com.ourteam.middleware.domain.MiddleWareToolBean;
import com.ourteam.middleware.domain.MiddleWareToolInputBean;

public class MiddleWareToolScriptEditorPart extends
		AbstractFormEditorPart<MiddleWareToolBean, MiddleWareToolEditorInput> {

	private TableViewComposite<MiddleWareToolInputBean> tableViewComposite;

	private EmployeeBean employeeBean = null;

	@Override
	public IActionHandler createActionHandler() {
		return new ActionHandler();
	}

	@Override
	protected void reloadDataModel() throws Exception {
		super.reloadDataModel();
		MiddleWareToolInputBean[] inputBeans = IOurTeamServiceConst.MIDDLE_WARE_SERVICE
				.getMiddleWareToolInputs(getDataModel().getId());

		this.tableViewComposite.setDataList(inputBeans);

		tableViewComposite.getHeadToolBarComposite().update();

	}

	@Override
	protected void doCreatePartControl(Composite parent) {

		parent.setLayout(new GridLayout());

		final IActionHandler actionHandler = getActionHandler();

		Composite formComposite = toolkit.createComposite(parent);

		formComposite.setLayoutData(new GridData(GridData.FILL_BOTH));

		super.doCreatePartControl(formComposite);

		final Section section = toolkit.createSection(parent,
				Section.DESCRIPTION | Section.TITLE_BAR | Section.TWISTIE);

		section.setText("脚本输入参数列表");

		section.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		section.addExpansionListener(new ExpansionAdapter() {
			public void expansionStateChanged(ExpansionEvent e) {
				if (section.isExpanded()) {
					section.setLayoutData(new GridData(GridData.FILL_BOTH));
				} else {
					section.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
				}
				form.getBody().layout(true);
			}
		});

		Composite inputComposite = toolkit.createComposite(section);

		inputComposite.setLayout(new FillLayout());

		tableViewComposite = new TableViewComposite<MiddleWareToolInputBean>(
				inputComposite, UIConfigFactory.getInstance().getTableConfig(
						"middleWareToolInputTable"), SWT.BORDER) {

			@Override
			protected ToolBarComposite createHeadToolBar(Composite composite) {

				ActionGroupBean[] actionGroupBeans = new ActionGroupBean[] {
						UIConfigFactory.getInstance().getActionGroupConfig(
								"defaultRelationActionGroup_16"),
						UIConfigFactory.getInstance().getActionGroupConfig(
								"defaultListMoveActionGroup")

				};

				ToolBarComposite toolBarComposite = new ToolBarComposite(
						composite, actionGroupBeans, actionHandler, SWT.FLAT);

				return toolBarComposite;
			}

		};

		tableViewComposite.setActionHandler(actionHandler);

		tableViewComposite.getHeadToolBarComposite().update();

		section.setClient(inputComposite);
	}

	@Override
	protected void saveDataModel(MiddleWareToolBean aDataModel)
			throws Exception {

		aDataModel.setLastEditorId(employeeBean.getId());

		IOurTeamServiceConst.MIDDLE_WARE_SERVICE
				.modifyMiddleWareTool(aDataModel);

	}

	@Override
	protected String getFormId() {
		return "middleWareTooScritpForm";
	}

	public class ActionHandler extends DefaultFormEditorActionHandler {

		@Override
		public boolean isActionEnable(ActionBean aAction) {

			if (StringUtils.indexOfAny(aAction.getId(), new String[] {
					"removeRelation", "editRelation", "moveUp", "moveDown" }) != -1) {
				if (tableViewComposite.getSelectedDataList().isEmpty()) {
					return false;
				} else if ("moveUp".equals(aAction.getId())) {
					return tableViewComposite.canMoveUp(tableViewComposite
							.getSelectedDataList().get(0));
				} else if ("moveDown".equals(aAction.getId())) {
					return tableViewComposite.canMoveDown(tableViewComposite
							.getSelectedDataList().get(0));
				} else {
					return true;
				}

			} else {
				return super.isActionEnable(aAction);
			}

		}

		public void refresh(ActionEvent actionEvent) throws Exception {
			reloadDataModel();
		}

		public void moveUp(ActionEvent actionEvent) throws Exception {
			MiddleWareToolInputBean middleWareToolInputBean = tableViewComposite
					.getSelectedDataList().get(0);

			List<MiddleWareToolInputBean> inputBeans = tableViewComposite
					.getDataList();

			int index = inputBeans.indexOf(middleWareToolInputBean);

			MiddleWareToolInputBean tempInputBean = inputBeans.get(index - 1);

			int sort = tempInputBean.getSortIndex();

			tempInputBean.setSortIndex(middleWareToolInputBean.getSortIndex());

			middleWareToolInputBean.setSortIndex(sort);

			IOurTeamServiceConst.MIDDLE_WARE_SERVICE
					.modifyMiddleWareToolInput(tempInputBean);

			IOurTeamServiceConst.MIDDLE_WARE_SERVICE
					.modifyMiddleWareToolInput(middleWareToolInputBean);

			tableViewComposite.setSelection(middleWareToolInputBean);

			reloadDataModel();

		}

		public void moveDown(ActionEvent actionEvent) throws Exception {

			MiddleWareToolInputBean middleWareToolInputBean = tableViewComposite
					.getSelectedDataList().get(0);

			List<MiddleWareToolInputBean> inputBeans = tableViewComposite
					.getDataList();

			int index = inputBeans.indexOf(middleWareToolInputBean);

			MiddleWareToolInputBean tempInputBean = inputBeans.get(index + 1);

			int sort = tempInputBean.getSortIndex();

			tempInputBean.setSortIndex(middleWareToolInputBean.getSortIndex());

			middleWareToolInputBean.setSortIndex(sort);

			IOurTeamServiceConst.MIDDLE_WARE_SERVICE
					.modifyMiddleWareToolInput(tempInputBean);

			IOurTeamServiceConst.MIDDLE_WARE_SERVICE
					.modifyMiddleWareToolInput(middleWareToolInputBean);

			reloadDataModel();

		}

		public void addRelation(ActionEvent actionEvent) throws Exception {

			MiddleWareToolInputBean toolInputBean = new MiddleWareToolInputBean();

			toolInputBean.setToolId(getDataModel().getId());

			MiddleWareToolInputEditDialogProvider dialogProvider = new MiddleWareToolInputEditDialogProvider(
					toolInputBean);

			if (SWTUtils.openDialog(getShell(), dialogProvider)) {
				reloadDataModel();
				tableViewComposite.getHeadToolBarComposite().update();
			}
		}

		public void removeRelation(ActionEvent actionEvent) throws Exception {
			List<MiddleWareToolInputBean> middleWareToolInputBeans = tableViewComposite
					.getSelectedDataList();

			long[] ids = new long[middleWareToolInputBeans.size()];

			for (int i = 0; i < ids.length; i++) {
				ids[i] = middleWareToolInputBeans.get(i).getId();
			}

			IOurTeamServiceConst.MIDDLE_WARE_SERVICE
					.deleteMiddleWareToolInputs(ids);

			reloadDataModel();

		}

		public void editRelation(ActionEvent actionEvent) throws Exception {

			MiddleWareToolInputBean middleWareToolInputBean = tableViewComposite
					.getSelectedDataList().get(0);

			MiddleWareToolInputEditDialogProvider dialogProvider = new MiddleWareToolInputEditDialogProvider(
					middleWareToolInputBean);

			if (SWTUtils.openDialog(getShell(), dialogProvider)) {
				reloadDataModel();
			}
		}

	}

}
