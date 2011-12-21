package com.ourteam.app.workspace.ui;

import java.util.List;

import net.ui.UIConfigFactory;
import net.ui.eclipse.AbstractComposite;
import net.ui.eclipse.ICompositeInitHelper;
import net.ui.eclipse.action.AbstractDispatchActionHandler;
import net.ui.eclipse.action.ActionEvent;
import net.ui.eclipse.action.ToolBarComposite;
import net.ui.eclipse.table.TableViewComposite;
import net.ui.eclipse.utils.AbstractFormDialogProvider;
import net.ui.eclipse.utils.SWTUtils;
import net.ui.model.action.ActionBean;
import net.ui.model.constlist.ListData;
import net.ui.model.constlist.ListDataContainer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import com.ourteam.app.workspace.ui.UISelectOptionListConfigComposite.CompositeInitor;

public class UISelectOptionListConfigComposite extends
		AbstractComposite<CompositeInitor> {

	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(UISelectOptionListConfigComposite.class);

	private TableViewComposite<ListData> tableViewComposite;

	private ToolBarComposite toolBarComposite;

	public UISelectOptionListConfigComposite(Composite parent,
			CompositeInitor initHelper) {
		super(parent, SWT.NONE, initHelper);
	}

	@Override
	protected void createContent(Composite parent) {

		this.setLayout(new GridLayout());

		tableViewComposite = new TableViewComposite<ListData>(parent,
				UIConfigFactory.getInstance().getTableConfig(
						"uiSelectoptionListTable"), SWT.BORDER) {

			@Override
			protected ToolBarComposite createHeadToolBar(Composite composite) {
				toolBarComposite = new ToolBarComposite(composite,
						UIConfigFactory.getInstance().getActionGroupConfig(
								"uiSelectOptionListConfigActionGroup"),
						new ActionHandler(), SWT.FLAT);
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
							MessageDialog.openError(getShell(),
									"Do Edit Action Error",
									e.getLocalizedMessage());

							logger.error("Do Edit Action Error", e);
						}
					}
				});

		tableViewComposite.setLayoutData(new GridData(GridData.FILL_BOTH));

		ListData[] listDatas = new ListData[getInitHelper()
				.getListDataContainer().size()];

		for (int i = 0; i < listDatas.length; i++) {
			listDatas[i] = new ListData();
			listDatas[i].setData(getInitHelper().getListDataContainer().get(i)
					.getData());
			listDatas[i].setLabel(getInitHelper().getListDataContainer().get(i)
					.getLabel());
		}

		tableViewComposite.setDataList(listDatas);

		toolBarComposite.update();

	}

	static public class CompositeInitor implements ICompositeInitHelper {

		private ListDataContainer listDataContainer;

		public CompositeInitor(ListDataContainer listDataContainer) {
			super();
			this.listDataContainer = listDataContainer;
		}

		public ListDataContainer getListDataContainer() {
			return listDataContainer;
		}

		@Override
		public void onConstructor(Composite composite) {

		}

	}

	public List<ListData> getSelectOptions() {
		return this.tableViewComposite.getDataList();
	}

	class ActionHandler extends AbstractDispatchActionHandler {

		@Override
		public boolean isActionEnable(ActionBean aAction) {

			List<ListData> selectedDatas = tableViewComposite
					.getSelectedDataList();

			if ("edit".equals(aAction.getId())) {
				return selectedDatas.isEmpty() == false;
			} else if ("remove".equals(aAction.getId())) {
				return selectedDatas.isEmpty() == false;
			} else if ("moveUp".equals(aAction.getId())) {

				return selectedDatas.isEmpty() == false
						&& tableViewComposite.canMoveUp(selectedDatas.get(0));
			} else if ("moveDown".equals(aAction.getId())) {

				return selectedDatas.isEmpty() == false
						&& tableViewComposite.canMoveDown(selectedDatas.get(0));
			} else {
				return true;
			}
		}

		public void remove(ActionEvent actionEvent) throws Exception {
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

			ListData listData = tableViewComposite.getSelectedDataList().get(0);

			AbstractFormDialogProvider<ListData> dialogProvider = createDialogProvider(
					listData, "编辑选项信息");

			if (SWTUtils.openDialog(getShell(), dialogProvider)) {

				dialogProvider.getFormDataModel();

				tableViewComposite.refresh();

			}

		}

		public void add(ActionEvent actionEvent) throws Exception {

			AbstractFormDialogProvider<ListData> dialogProvider = createDialogProvider(
					new ListData(), "添加选项信息");

			if (SWTUtils.openDialog(getShell(), dialogProvider)) {

				ListData listData = dialogProvider.getFormDataModel();

				tableViewComposite.addRow(listData);

			}
		}

		protected AbstractFormDialogProvider<ListData> createDialogProvider(
				ListData listData, final String title) {

			AbstractFormDialogProvider<ListData> dialogProvider = new AbstractFormDialogProvider<ListData>(
					listData) {

				@Override
				public String getTitle() {
					return title;
				}

				@Override
				protected String getFormConfigId() {
					return "uiSelectOptionEditForm";
				}

				@Override
				public int getInitialHeight() {
					return 300;
				}

				@Override
				public int getInitialWidth() {
					return 400;
				}

			};

			return dialogProvider;
		}
	}

}
