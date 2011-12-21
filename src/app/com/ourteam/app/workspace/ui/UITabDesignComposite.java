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
import net.ui.model.tab.TabConfig;
import net.ui.model.tab.TabProperty;
import net.ui.model.tab.TabbedPaneConfig;

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

import com.ourteam.app.workspace.ui.UITabDesignComposite.CompositeInitor;

public class UITabDesignComposite extends
		AbstractTreeNodePropertyConfigComposite<CompositeInitor> {

	private Composite configComposite;

	private Composite tabPropertyComposite;

	private GridFormComposite<Object> configFormComposite;

	private TableViewComposite<TabProperty> tabPropertyTableViewComposite;

	private ToolBarComposite toolBarComposite;

	private CTabFolder tabFolder;

	public UITabDesignComposite(Composite parent,
			TabbedPaneConfig tabbedPaneConfig) {
		super(parent, SWT.NONE, new CompositeInitor(tabbedPaneConfig));
	}

	@Override
	protected IActionHandler createActionHandler() {
		return new ActionHandler();
	}

	@Override
	protected String getTreeConfigId() {
		return "ui/work/ui_tab.tree";
	}

	@Override
	protected Object getTreeRootNodeUserObject() {
		return getInitHelper().getTabbedPaneConfig();
	}

	@Override
	protected void createConfigContent(Composite parent) {

		tabFolder = new CTabFolder(parent, SWT.BORDER | SWT.BOTTOM);

		CTabItem configTabItem = new CTabItem(tabFolder, SWT.NONE);

		configTabItem.setText("属性");

		configTabItem.setImage(ImageChache
				.getImage("/16X16/GuiTools/tabbar.png"));

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

		tabPropertyComposite = new Composite(tabFolder, SWT.NONE);

		tabPropertyComposite.setLayout(new FillLayout());

		tabPropertyTableViewComposite = new TableViewComposite<TabProperty>(
				tabPropertyComposite, UIConfigFactory.getInstance()
						.getTableConfig("uiTabItemPropertyConfigTable"),
				SWT.CHECK | SWT.BORDER, true) {

			@Override
			protected ToolBarComposite createHeadToolBar(Composite composite) {

				toolBarComposite = new ToolBarComposite(composite,
						UIConfigFactory.getInstance().getActionGroupConfig(
								"uiTabItemPropertyListConfigActionGroup"),
						UITabDesignComposite.this.getActionHandler(), SWT.FLAT);

				return toolBarComposite;
			}

		};

		tabPropertyTableViewComposite.setActionHandler(getActionHandler());

		tabFolder.setSelection(0);

		getTreeViewComposite().getTreeViewer().expandToLevel(2);

		getTreeViewComposite().setSelection(
				getInitHelper().getTabbedPaneConfig());
	}

	@Override
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
			if ("UI_TAB".equals(nodeId)) {

				configFormComposite = new GridFormComposite<Object>(
						this.configComposite, UIConfigFactory.getInstance()
								.getFormConfig("uiTabConfigForm"));

				while (tabFolder.getItemCount() > 1) {
					tabFolder.getItem(1).dispose();
				}

			} else {

				configFormComposite = new GridFormComposite<Object>(
						this.configComposite, UIConfigFactory.getInstance()
								.getFormConfig("uiTabItemConfigForm"));

				CTabItem columnPropertyTabItem = new CTabItem(tabFolder,
						SWT.NONE);

				columnPropertyTabItem.setText("扩展属性");

				columnPropertyTabItem.setImage(ImageChache
						.getImage("/16X16/GuiTools/attributes_display.png"));

				columnPropertyTabItem.setControl(tabPropertyComposite);

				toolBarComposite.update();

			}

			this.configComposite.layout(true);
		}

		configFormComposite.setFormDataModel(treeNodeItem.getUserObject());

		if (treeNodeItem.getUserObject() instanceof TabConfig) {
			TabConfig tabConfig = (TabConfig) treeNodeItem.getUserObject();
			tabPropertyTableViewComposite
					.setDataList(tabConfig.getProperties());
		}
	}

	static public class CompositeInitor implements ICompositeInitHelper {

		private TabbedPaneConfig tabbedPaneConfig;

		public CompositeInitor(TabbedPaneConfig tabbedPaneConfig) {
			super();
			this.tabbedPaneConfig = tabbedPaneConfig;
		}

		public TabbedPaneConfig getTabbedPaneConfig() {
			return tabbedPaneConfig;
		}

		public void setTabbedPaneConfig(TabbedPaneConfig tabbedPaneConfig) {
			this.tabbedPaneConfig = tabbedPaneConfig;
		}

		@Override
		public void onConstructor(Composite composite) {

		}

	}

	class ActionHandler extends AbstractDispatchActionHandler {

		@Override
		public boolean isActionEnable(ActionBean aAction) {

			if ("removeTabProperty".equals(aAction.getHandler())) {
				return tabPropertyTableViewComposite.getSelectedDataList()
						.isEmpty() == false;
			} else if ("moveUp".equals(aAction.getId())) {
				TabConfig tabConfig = (TabConfig) getTreeViewComposite()
						.getSlectedUserObjects()[0];

				List<TabConfig> tabConfigs = getInitHelper()
						.getTabbedPaneConfig().getTabPageList();

				return tabConfigs.indexOf(tabConfig) > 0;

			} else if ("moveDown".equals(aAction.getId())) {
				TabConfig tabConfig = (TabConfig) getTreeViewComposite()
						.getSlectedUserObjects()[0];

				List<TabConfig> tabConfigs = getInitHelper()
						.getTabbedPaneConfig().getTabPageList();

				return tabConfigs.indexOf(tabConfig) < tabConfigs.size() - 1;

			} else {
				return true;
			}
		}

		public void removeTabProperty(ActionEvent actionEvent) throws Exception {

			TabConfig tabConfig = (TabConfig) getTreeViewComposite()
					.getSlectedUserObjects()[0];

			tabConfig.getProperties().removeAll(
					tabPropertyTableViewComposite.getSelectedDataList());

			tabPropertyTableViewComposite
					.setDataList(tabConfig.getProperties());

		}

		public void addTabProperty(ActionEvent actionEvent) throws Exception {
			TabProperty tabProperty = new TabProperty();
			tabProperty.setId("property");
			tabProperty.setValue("value");
			tabPropertyTableViewComposite.addRow(tabProperty);
		}

		public void addTabItem(ActionEvent actionEvent) throws Exception {
			TabConfig tabConfig = new TabConfig();

			tabConfig.setName("TabItem");

			getInitHelper().getTabbedPaneConfig().addTab(tabConfig);

			getTreeViewComposite().refreshTree();

			getTreeViewComposite().getTreeViewer().expandToLevel(2);

			getTreeViewComposite().setSelection(tabConfig);

		}

		public void moveUp(ActionEvent actionEvent) throws Exception {

			TabConfig tabConfig = (TabConfig) getTreeViewComposite()
					.getSlectedUserObjects()[0];

			List<TabConfig> tabConfigs = getInitHelper().getTabbedPaneConfig()
					.getTabPageList();

			int index = tabConfigs.indexOf(tabConfig);

			Collections.swap(tabConfigs, index, index - 1);

			getTreeViewComposite().refreshTree();

			getTreeViewComposite().getTreeViewer().expandToLevel(2);

			getTreeViewComposite().setSelection(tabConfig);

		}

		public void moveDown(ActionEvent actionEvent) throws Exception {

			TabConfig tabConfig = (TabConfig) getTreeViewComposite()
					.getSlectedUserObjects()[0];

			List<TabConfig> tabConfigs = getInitHelper().getTabbedPaneConfig()
					.getTabPageList();

			int index = tabConfigs.indexOf(tabConfig);

			Collections.swap(tabConfigs, index, index + 1);

			getTreeViewComposite().refreshTree();

			getTreeViewComposite().getTreeViewer().expandToLevel(2);

			getTreeViewComposite().setSelection(tabConfig);

		}

		public void removeTabItem(ActionEvent actionEvent) throws Exception {

			TabConfig tabConfig = (TabConfig) getTreeViewComposite()
					.getSlectedUserObjects()[0];

			getInitHelper().getTabbedPaneConfig().removeTab(tabConfig);

			getTreeViewComposite().refreshTree();

			getTreeViewComposite().getTreeViewer().expandToLevel(2);

			getTreeViewComposite().setSelection(
					getInitHelper().getTabbedPaneConfig());

		}
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
