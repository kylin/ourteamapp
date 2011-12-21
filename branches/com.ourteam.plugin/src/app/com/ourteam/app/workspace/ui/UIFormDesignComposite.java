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
import net.ui.eclipse.form.FormPropertyTypeConst;
import net.ui.eclipse.form.GridFormComposite;
import net.ui.eclipse.table.TableViewComposite;
import net.ui.eclipse.tree.TreeNodeItem;
import net.ui.eclipse.widget.AbstractTreeNodePropertyConfigComposite;
import net.ui.model.action.ActionBean;
import net.ui.model.form.AbstractFormBean;
import net.ui.model.form.FormBean;
import net.ui.model.form.FormPropertyBean;
import net.ui.model.form.LayoutDataBean;

import org.apache.commons.lang.ArrayUtils;
import org.eclipse.jface.viewers.TreeViewer;
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

import com.ourteam.app.workspace.ui.UIFormDesignComposite.CompositeInitor;

public class UIFormDesignComposite extends
		AbstractTreeNodePropertyConfigComposite<CompositeInitor> {

	private Composite configComposite;

	private Composite layoutComposite;

	private GridFormComposite<AbstractFormBean> configFormComposite;

	private TableViewComposite<LayoutDataBean> layoutTableViewComposite;

	private GridFormComposite<?> previewFormComposite;

	private ToolBarComposite toolBarComposite;

	public UIFormDesignComposite(Composite parent) {
		super(parent, SWT.NONE, new CompositeInitor(new FormBean()));
	}

	public UIFormDesignComposite(Composite parent, FormBean formBean) {
		super(parent, SWT.NONE, new CompositeInitor(formBean));
	}

	@Override
	public String getTreeDefaultNodeDefineId() {
		return "formProperty";
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
		}

		for (int i = 0; i < childs.length; i++) {
			Control control = childs[i];
			if (control instanceof GridFormComposite) {
				if (treeNodeItem
						.getUserObject()
						.getClass()
						.equals(((GridFormComposite<?>) control)
								.getFormDataModelType()) == false) {
					control.dispose();
					needReCreate = true;

				} else {
					configFormComposite = (GridFormComposite) control;
				}
			}

		}

		if (needReCreate) {
			if ("form".equals(nodeId)) {

				configFormComposite = new GridFormComposite<AbstractFormBean>(
						this.configComposite, UIConfigFactory.getInstance()
								.getFormConfig("uiFormConfigForm"));

			} else {
				configFormComposite = new GridFormComposite<AbstractFormBean>(
						this.configComposite, UIConfigFactory.getInstance()
								.getFormConfig("uiFormPropertyConfigForm"));

			}

			this.configComposite.layout(true);
		}

		configFormComposite.setFormDataModel((AbstractFormBean) treeNodeItem
				.getUserObject());

		layoutTableViewComposite.setDataList(((AbstractFormBean) treeNodeItem
				.getUserObject()).getLayoutDataList());

	}

	static public class CompositeInitor implements ICompositeInitHelper {

		private FormBean formBean;

		public CompositeInitor(FormBean formBean) {
			super();
			this.formBean = formBean;
		}

		public FormBean getFormBean() {
			return formBean;
		}

		public void setFormBean(FormBean formBean) {
			this.formBean = formBean;
		}

		@Override
		public void onConstructor(Composite composite) {

		}

	}

	class ActionHandler extends AbstractDispatchActionHandler {

		@Override
		public boolean isActionEnable(ActionBean aAction) {

			List<LayoutDataBean> selectedDatas = layoutTableViewComposite
					.getSelectedDataList();

			if ("remove".equals(aAction.getId())
					&& "remove".equals(aAction.getHandler())) {
				return selectedDatas.isEmpty() == false;
			} else if ("moveUp".equals(aAction.getId())) {
				FormPropertyBean formPropertyBean = (FormPropertyBean) getTreeViewComposite()
						.getSlectedUserObjects()[0];

				List<FormPropertyBean> formPropertyBeans = getInitHelper()
						.getFormBean().getFormProperties();

				return formPropertyBeans.indexOf(formPropertyBean) > 0;

			} else if ("moveDown".equals(aAction.getId())) {
				FormPropertyBean formPropertyBean = (FormPropertyBean) getTreeViewComposite()
						.getSlectedUserObjects()[0];

				List<FormPropertyBean> formPropertyBeans = getInitHelper()
						.getFormBean().getFormProperties();

				return formPropertyBeans.indexOf(formPropertyBean) < formPropertyBeans
						.size() - 1;

			} else {
				return true;
			}
		}

		public void remove(ActionEvent actionEvent) throws Exception {

			AbstractFormBean formBean = (AbstractFormBean) getTreeViewComposite()
					.getSlectedUserObjects()[0];

			formBean.getLayoutDataList().removeAll(
					layoutTableViewComposite.getSelectedDataList());

			layoutTableViewComposite.setDataList(formBean.getLayoutDataList());

			previewFormComposite.update();
		}

		public void add(ActionEvent actionEvent) throws Exception {
			LayoutDataBean layoutDataBean = new LayoutDataBean();
			layoutDataBean.setName("");
			layoutDataBean.setValue("");
			layoutTableViewComposite.addRow(layoutDataBean);
		}

		public void addFormProperty(ActionEvent actionEvent) throws Exception {
			FormPropertyBean formPropertyBean = new FormPropertyBean();

			formPropertyBean.setId("formProperty");

			formPropertyBean.setType(FormPropertyTypeConst.TEXT);

			Object[] objects = getTreeViewComposite().getSlectedUserObjects();

			if (objects[0] instanceof FormBean) {
				getInitHelper().getFormBean().addFormProperty(formPropertyBean);
			} else {
				((FormPropertyBean) objects[0])
						.addFormProperty(formPropertyBean);
			}

			getTreeViewComposite().refreshTree();

			getTreeViewComposite().getTreeViewer().expandToLevel(
					TreeViewer.ALL_LEVELS);

			getTreeViewComposite().setSelection(formPropertyBean);

			previewFormComposite.update();
		}

		public void moveUp(ActionEvent actionEvent) throws Exception {

			FormPropertyBean formPropertyBean = (FormPropertyBean) getTreeViewComposite()
					.getSlectedUserObjects()[0];

			List<FormPropertyBean> formPropertyBeans = getInitHelper()
					.getFormBean().getFormProperties();

			int index = formPropertyBeans.indexOf(formPropertyBean);

			Collections.swap(formPropertyBeans, index, index - 1);

			getTreeViewComposite().refreshTree();

			getTreeViewComposite().getTreeViewer().expandToLevel(2);

			getTreeViewComposite().setSelection(formPropertyBean);

			previewFormComposite.update();
		}

		public void moveDown(ActionEvent actionEvent) throws Exception {
			FormPropertyBean formPropertyBean = (FormPropertyBean) getTreeViewComposite()
					.getSlectedUserObjects()[0];

			List<FormPropertyBean> formPropertyBeans = getInitHelper()
					.getFormBean().getFormProperties();

			int index = formPropertyBeans.indexOf(formPropertyBean);

			Collections.swap(formPropertyBeans, index, index + 1);

			getTreeViewComposite().refreshTree();

			getTreeViewComposite().getTreeViewer().expandToLevel(2);

			getTreeViewComposite().setSelection(formPropertyBean);

			previewFormComposite.update();
		}

		public void removeFormProperty(ActionEvent actionEvent)
				throws Exception {

			FormPropertyBean formPropertyBean = (FormPropertyBean) getTreeViewComposite()
					.getSlectedUserObjects()[0];

			AbstractFormBean abstractFormBean = (AbstractFormBean) getTreeViewComposite()
					.getSlectedTreeNodeItems()[0].getParentNodeItem()
					.getUserObject();
			
			abstractFormBean.removeFormProperty(formPropertyBean);

			getTreeViewComposite().refreshTree();

			getTreeViewComposite().getTreeViewer().expandToLevel(2);

			getTreeViewComposite().setSelection(getInitHelper().getFormBean());

			previewFormComposite.update();

		}
	}

	@Override
	protected IActionHandler createActionHandler() {
		return new ActionHandler();
	}

	@Override
	protected String getTreeConfigId() {
		return "ui/work/ui_form_component.tree";
	}

	@Override
	protected void createConfigContent(Composite parent) {

		final CTabFolder tabFolder = new CTabFolder(parent, SWT.BORDER
				| SWT.BOTTOM);

		CTabItem configTabItem = new CTabItem(tabFolder, SWT.NONE);

		configTabItem.setText("属性");

		configTabItem.setImage(ImageChache
				.getImage("/16X16/GuiTools/application_form_edit.png"));

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

		CTabItem layoutTabItem = new CTabItem(tabFolder, SWT.NONE);

		layoutTabItem.setText("布局");

		layoutTabItem.setImage(ImageChache
				.getImage("/16X16/GuiTools/layout.png"));

		layoutComposite = new Composite(tabFolder, SWT.NONE);

		layoutComposite.setLayout(new FillLayout());

		layoutTableViewComposite = new TableViewComposite<LayoutDataBean>(
				layoutComposite, UIConfigFactory.getInstance().getTableConfig(
						"uiFormLayoutConfigTable"), SWT.CHECK | SWT.BORDER,
				true) {

			@Override
			protected ToolBarComposite createHeadToolBar(Composite composite) {

				toolBarComposite = new ToolBarComposite(composite,
						UIConfigFactory.getInstance().getActionGroupConfig(
								"uiFormLayoutListConfigActionGroup"),
						UIFormDesignComposite.this.getActionHandler(), SWT.FLAT);

				return toolBarComposite;
			}

		};

		layoutTableViewComposite.setActionHandler(getActionHandler());

		layoutTabItem.setControl(layoutComposite);

		CTabItem previewTabItem = new CTabItem(tabFolder, SWT.NONE);

		previewTabItem.setText("预览");

		previewTabItem.setImage(ImageChache
				.getImage("/16X16/GuiTools/application_form_magnify.png"));

		previewFormComposite = new GridFormComposite(tabFolder, getInitHelper()
				.getFormBean()) {

			@Override
			protected FormBean getRefFormBean(String formId) {
				return UIFormDesignComposite.this.getRefFormBean(formId);
			}

		};

		previewTabItem.setControl(previewFormComposite);

		tabFolder.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				if (tabFolder.getSelectionIndex() == 2) {
					previewFormComposite.update();
				}
			}

		});

		tabFolder.setSelection(0);

		getTreeViewComposite().getTreeViewer().expandToLevel(2);

		getTreeViewComposite().setSelection(getInitHelper().getFormBean());

		toolBarComposite.update();
	}

	protected FormBean getRefFormBean(String formId) {
		return UIConfigFactory.getInstance().getFormConfig(formId);
	}

	@Override
	protected Object getTreeRootNodeUserObject() {
		return getInitHelper().getFormBean();
	}

	@Override
	public void applyChange() throws Exception {
		if (configFormComposite != null) {

			configFormComposite.validate();

			configFormComposite.getFormDataModel();

			getTreeViewComposite().refreshTree();

			getTreeViewComposite().getTreeViewer().expandToLevel(2);

			previewFormComposite.update();

		}
	}

}
