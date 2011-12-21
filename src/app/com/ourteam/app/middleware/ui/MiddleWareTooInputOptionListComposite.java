package com.ourteam.app.middleware.ui;

import net.ui.UIConfigFactory;
import net.ui.eclipse.action.AbstractDispatchActionHandler;
import net.ui.eclipse.action.ActionEvent;
import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.action.ToolBarComposite;
import net.ui.eclipse.table.TableViewComposite;
import net.ui.model.action.ActionBean;
import net.ui.model.action.ActionGroupBean;

import org.apache.commons.lang.StringUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import com.ourteam.middleware.domain.MiddleWareToolInputOptionBean;

public class MiddleWareTooInputOptionListComposite extends Composite {

	private TableViewComposite<MiddleWareToolInputOptionBean> tableViewComposite;

	public MiddleWareTooInputOptionListComposite(Composite parent, int style) {
		super(parent, style);
		createUI();
	}

	private void createUI() {
		this.setLayout(new GridLayout());

		final IActionHandler actionHandler = new ActionHandler();

		tableViewComposite = new TableViewComposite<MiddleWareToolInputOptionBean>(
				this, UIConfigFactory.getInstance().getTableConfig(
						"middleWareToolInputOptionTable"), SWT.BORDER, true) {

			@Override
			protected ToolBarComposite createHeadToolBar(Composite composite) {

				ActionGroupBean[] actionGroupBeans = new ActionGroupBean[] {
						UIConfigFactory.getInstance().getActionGroupConfig(
								"addRemoveRelationActionGroup_16"),
						UIConfigFactory.getInstance().getActionGroupConfig(
								"defaultListMoveActionGroup") };

				ToolBarComposite toolBarComposite = new ToolBarComposite(
						composite, actionGroupBeans, actionHandler, SWT.FLAT);

				return toolBarComposite;
			}

		};

		tableViewComposite.setLayoutData(new GridData(GridData.FILL_BOTH));

		tableViewComposite.setActionHandler(actionHandler);

		tableViewComposite.getHeadToolBarComposite().update();
	}

	public TableViewComposite<MiddleWareToolInputOptionBean> getTableViewComposite() {
		return tableViewComposite;
	}

	class ActionHandler extends AbstractDispatchActionHandler {

		@Override
		public boolean isActionEnable(ActionBean aAction) {
			if (StringUtils.indexOfAny(aAction.getId(), new String[] {
					"removeRelation", "moveUp", "moveDown" }) != -1) {
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
				return true;
			}

		}

		public void addRelation(ActionEvent actionEvent) throws Exception {

			MiddleWareToolInputOptionBean optionBean = new MiddleWareToolInputOptionBean();

			optionBean.setId(System.currentTimeMillis() + 1001);
			optionBean.setDisplayLabel("label");
			optionBean.setRealValue("value");
			optionBean.setRemarks("");

			tableViewComposite.addRow(optionBean);
		}

		public void removeRelation(ActionEvent actionEvent) throws Exception {
			tableViewComposite.removeSelectedRows();
		}

		public void moveUp(ActionEvent actionEvent) throws Exception {
			tableViewComposite.moveUpRow(tableViewComposite.getTable()
					.getSelectionIndex());
		}

		public void moveDown(ActionEvent actionEvent) throws Exception {
			tableViewComposite.moveDownRow(tableViewComposite.getTable()
					.getSelectionIndex());
		}

	}

}
