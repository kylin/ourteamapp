package com.ourteam.app.workspace.ui;

import java.util.Collections;
import java.util.List;

import net.ui.UIConfigFactory;
import net.ui.eclipse.ICompositeInitHelper;
import net.ui.eclipse.ImageChache;
import net.ui.eclipse.action.AbstractDispatchActionHandler;
import net.ui.eclipse.action.ActionEvent;
import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.action.ToolBarComposite;
import net.ui.eclipse.form.GridFormComposite;
import net.ui.eclipse.table.TableViewComposite;
import net.ui.eclipse.tree.TreeNodeItem;
import net.ui.eclipse.widget.AbstractTreeNodePropertyConfigComposite;
import net.ui.model.action.ActionBean;
import net.ui.model.table.ColumnBean;
import net.ui.model.table.ColumnDataBean;
import net.ui.model.table.ColumnImageBean;
import net.ui.model.table.TableBean;

import org.apache.commons.lang.ArrayUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import com.ourteam.app.workspace.ui.UITableDesignComposite.CompositeInitor;

public class UITableDesignComposite extends
		AbstractTreeNodePropertyConfigComposite<CompositeInitor> {

	private Composite configComposite;

	private Composite extPropertyComposite;

	private GridFormComposite<Object> configFormComposite;

	private TableViewComposite<ColumnDataBean> extPropertyTableViewComposite;

	private Composite columnIconComposite;

	private TableViewComposite<ColumnImageBean> columnImageTableViewComposite;

	private ToolBarComposite toolBarComposite;

	private ToolBarComposite columnIconToolBarComposite;

	private CTabFolder tabFolder;

	public UITableDesignComposite(Composite parent, TableBean tableBean) {
		super(parent, SWT.NONE, new CompositeInitor(tableBean));
	}

	protected void treeNodeSelectionChanged(TreeNodeItem treeNodeItem) {

		if (treeNodeItem == null) {
			return;
		}

		String nodeId = treeNodeItem.getNodeConfig().getId();

		boolean needReCreate = false;

		Control[] childs = this.configComposite.getChildren();

		if (ArrayUtils.isEmpty(childs)) {
			needReCreate = true;
		} else {
			for (int i = 0; i < childs.length; i++) {
				Control control = childs[i];
				if (control instanceof GridFormComposite) {
					if (treeNodeItem
							.getUserObject()
							.getClass()
							.equals(((GridFormComposite) control)
									.getFormDataModelType()) == false) {
						control.dispose();
						needReCreate = true;

					} else {
						configFormComposite = (GridFormComposite) control;
					}
				}

			}
		}

		if (needReCreate) {
			if ("table".equals(nodeId)) {

				configFormComposite = new GridFormComposite<Object>(
						this.configComposite, UIConfigFactory.getInstance()
								.getFormConfig("uiTableConfigForm"));

				while (tabFolder.getItemCount() > 1) {
					tabFolder.getItem(1).dispose();
				}

			} else {

				configFormComposite = new GridFormComposite<Object>(
						this.configComposite, UIConfigFactory.getInstance()
								.getFormConfig("uiTableColumnConfigForm"));

				CTabItem columnPropertyTabItem = new CTabItem(tabFolder,
						SWT.NONE);

				columnPropertyTabItem.setText("扩展属性");

				columnPropertyTabItem.setImage(ImageChache
						.getImage("/16X16/GuiTools/attributes_display.png"));

				columnPropertyTabItem.setControl(extPropertyComposite);

				CTabItem columnIconTabItem = new CTabItem(tabFolder, SWT.NONE);

				columnIconTabItem.setText("图标列表");

				columnIconTabItem.setImage(ImageChache
						.getImage("/16X16/GuiTools/images.png"));

				columnIconTabItem.setControl(columnIconComposite);

				toolBarComposite.update();

				columnIconToolBarComposite.update();

			}

			this.configComposite.layout(true);
		}

		configFormComposite.setFormDataModel(treeNodeItem.getUserObject());

		if (treeNodeItem.getUserObject() instanceof ColumnBean) {
			ColumnBean columnBean = (ColumnBean) treeNodeItem.getUserObject();
			extPropertyTableViewComposite.setDataList(columnBean
					.getColumnDataList());
			columnImageTableViewComposite
					.setDataList(columnBean.getImageList());
		}

	}

	static public class CompositeInitor implements ICompositeInitHelper {

		private TableBean tableBean;

		public CompositeInitor(TableBean tableBean) {
			super();
			this.tableBean = tableBean;
		}

		public TableBean getTableBean() {
			return tableBean;
		}

		public void setTableBean(TableBean tableBean) {
			this.tableBean = tableBean;
		}

		@Override
		public void onConstructor(Composite composite) {

		}

	}

	class ActionHandler extends AbstractDispatchActionHandler {

		@Override
		public boolean isActionEnable(ActionBean aAction) {

			if ("removeColumnProperty".equals(aAction.getHandler())) {
				return extPropertyTableViewComposite.getSelectedDataList()
						.isEmpty() == false;
			} else if ("removeColumnIcon".equals(aAction.getHandler())) {
				return columnImageTableViewComposite.getSelectedDataList()
						.isEmpty() == false;
			} else if ("moveUp".equals(aAction.getId())) {
				ColumnBean columnBean = (ColumnBean) getTreeViewComposite()
						.getSlectedUserObjects()[0];

				List<ColumnBean> columnBeans = getInitHelper().getTableBean()
						.getColumnList();

				return columnBeans.indexOf(columnBean) > 0;

			} else if ("moveDown".equals(aAction.getId())) {
				ColumnBean columnBean = (ColumnBean) getTreeViewComposite()
						.getSlectedUserObjects()[0];

				List<ColumnBean> columnBeans = getInitHelper().getTableBean()
						.getColumnList();

				return columnBeans.indexOf(columnBean) < columnBeans.size() - 1;

			} else {
				return true;
			}
		}

		public void removeColumnProperty(ActionEvent actionEvent)
				throws Exception {

			ColumnBean columnBean = (ColumnBean) getTreeViewComposite()
					.getSlectedUserObjects()[0];

			columnBean.getColumnDataList().removeAll(
					extPropertyTableViewComposite.getSelectedDataList());

			extPropertyTableViewComposite.setDataList(columnBean
					.getColumnDataList());

		}

		public void addColumnProperty(ActionEvent actionEvent) throws Exception {
			ColumnDataBean columnDataBean = new ColumnDataBean();
			columnDataBean.setData("");
			columnDataBean.setLabel("");
			extPropertyTableViewComposite.addRow(columnDataBean);
		}

		public void removeColumnIcon(ActionEvent actionEvent) throws Exception {

			ColumnBean columnBean = (ColumnBean) getTreeViewComposite()
					.getSlectedUserObjects()[0];

			columnBean.getImageList().removeAll(
					columnImageTableViewComposite.getDataList());

			columnImageTableViewComposite
					.setDataList(columnBean.getImageList());

		}

		public void addColumnIcon(ActionEvent actionEvent) throws Exception {
			ColumnImageBean imageBean = new ColumnImageBean();
			imageBean.setPattern("*");
			imageBean.setImage("");
			columnImageTableViewComposite.addRow(imageBean);
		}

		public void addTableColumn(ActionEvent actionEvent) throws Exception {
			ColumnBean columnBean = new ColumnBean();

			columnBean.setProperty("columnProperty");

			getInitHelper().getTableBean().addColumn(columnBean);

			getTreeViewComposite().refreshTree();

			getTreeViewComposite().getTreeViewer().expandToLevel(2);

			getTreeViewComposite().setSelection(columnBean);

		}

		public void moveUp(ActionEvent actionEvent) throws Exception {

			ColumnBean columnBean = (ColumnBean) getTreeViewComposite()
					.getSlectedUserObjects()[0];

			List<ColumnBean> columnBeans = getInitHelper().getTableBean()
					.getColumnList();

			int index = columnBeans.indexOf(columnBean);

			Collections.swap(columnBeans, index, index - 1);

			getTreeViewComposite().refreshTree();

			getTreeViewComposite().getTreeViewer().expandToLevel(2);

			getTreeViewComposite().setSelection(columnBean);

		}

		public void moveDown(ActionEvent actionEvent) throws Exception {
			ColumnBean columnBean = (ColumnBean) getTreeViewComposite()
					.getSlectedUserObjects()[0];

			List<ColumnBean> columnBeans = getInitHelper().getTableBean()
					.getColumnList();

			int index = columnBeans.indexOf(columnBean);

			Collections.swap(columnBeans, index, index + 1);

			getTreeViewComposite().refreshTree();

			getTreeViewComposite().getTreeViewer().expandToLevel(2);

			getTreeViewComposite().setSelection(columnBean);

		}

		public void removeTableColumn(ActionEvent actionEvent) throws Exception {

			ColumnBean columnBean = (ColumnBean) getTreeViewComposite()
					.getSlectedUserObjects()[0];

			getInitHelper().getTableBean().removeColumn(columnBean);

			getTreeViewComposite().refreshTree();

			getTreeViewComposite().getTreeViewer().expandToLevel(2);

			getTreeViewComposite().setSelection(getInitHelper().getTableBean());

		}
	}

	@Override
	protected IActionHandler createActionHandler() {
		return new ActionHandler();
	}

	@Override
	protected String getTreeConfigId() {
		return "ui/work/ui_table.tree";
	}

	@Override
	protected Object getTreeRootNodeUserObject() {
		return getInitHelper().getTableBean();
	}

	@Override
	protected void createConfigContent(Composite parent) {

		tabFolder = new CTabFolder(parent, SWT.BORDER | SWT.BOTTOM);

		CTabItem configTabItem = new CTabItem(tabFolder, SWT.NONE);

		configTabItem.setText("属性");

		configTabItem.setImage(ImageChache
				.getImage("/16X16/GuiTools/table.png"));

		Composite configContainer = new Composite(tabFolder, SWT.NONE);

		configContainer.setLayout(new GridLayout());

		configComposite = new Composite(configContainer, SWT.NONE);

		configComposite.setLayoutData(new GridData(GridData.FILL_BOTH));

		configComposite.setLayout(new FillLayout());

		Button applyButton = new Button(configContainer, SWT.PUSH);

		applyButton.setText("应用");

		applyButton.setImage(ImageChache
				.getImage("/16X16/Action/pencil_go.png"));

		applyButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {

				try {
					applyChange();

				} catch (Exception ex) {
					return;
				}

			}

		});

		applyButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));

		configTabItem.setControl(configContainer);

		extPropertyComposite = new Composite(tabFolder, SWT.NONE);

		extPropertyComposite.setLayout(new FillLayout());

		extPropertyTableViewComposite = new TableViewComposite<ColumnDataBean>(
				extPropertyComposite, UIConfigFactory.getInstance()
						.getTableConfig("uiTableColumnPropertyConfigTable"),
				SWT.CHECK | SWT.BORDER, true) {

			@Override
			protected ToolBarComposite createHeadToolBar(Composite composite) {

				toolBarComposite = new ToolBarComposite(composite,
						UIConfigFactory.getInstance().getActionGroupConfig(
								"uiTableColumnPropertyListConfigActionGroup"),
						UITableDesignComposite.this.getActionHandler(),
						SWT.FLAT);

				return toolBarComposite;
			}

		};

		extPropertyTableViewComposite.setActionHandler(getActionHandler());

		columnIconComposite = new Composite(tabFolder, SWT.NONE);

		columnIconComposite.setLayout(new FillLayout());

		columnImageTableViewComposite = new TableViewComposite<ColumnImageBean>(
				columnIconComposite, UIConfigFactory.getInstance()
						.getTableConfig("uiTableColumnIconList"), SWT.CHECK
						| SWT.BORDER, true) {

			@Override
			protected ToolBarComposite createHeadToolBar(Composite composite) {

				columnIconToolBarComposite = new ToolBarComposite(composite,
						UIConfigFactory.getInstance().getActionGroupConfig(
								"uiTableColumnIconListConfigActionGroup"),
						UITableDesignComposite.this.getActionHandler(),
						SWT.FLAT);

				return columnIconToolBarComposite;
			}

		};

		columnImageTableViewComposite.setActionHandler(getActionHandler());

		tabFolder.setSelection(0);

		getTreeViewComposite().getTreeViewer().expandToLevel(2);

		getTreeViewComposite().setSelection(getInitHelper().getTableBean());
	}

	@Override
	public void applyChange() throws Exception {
		if (configFormComposite != null) {

			configFormComposite.validate();

			configFormComposite.getFormDataModel();

			getTreeViewComposite().refreshTree();

			getTreeViewComposite().getTreeViewer().expandToLevel(2);

		}
	}

}
