package com.ourteam.app.workspace.ui;

import java.util.List;

import net.ui.UIConfigFactory;
import net.ui.eclipse.AbstractComposite;
import net.ui.eclipse.ICompositeInitHelper;
import net.ui.eclipse.action.AbstractDispatchActionHandler;
import net.ui.eclipse.action.ActionEvent;
import net.ui.eclipse.action.ToolBarComposite;
import net.ui.eclipse.table.TableViewComposite;
import net.ui.model.action.ActionBean;
import net.ui.model.tree.PropertyBean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import com.ourteam.app.workspace.ui.UITreeNodePropertyListConfigComposite.CompositeInitor;

public class UITreeNodePropertyListConfigComposite extends
		AbstractComposite<CompositeInitor> {

	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(UITreeNodePropertyListConfigComposite.class);

	private TableViewComposite<PropertyBean> tableViewComposite;

	private ToolBarComposite toolBarComposite;

	public UITreeNodePropertyListConfigComposite(Composite parent,
			List<PropertyBean> propertyBeans) {
		super(parent, SWT.NONE, new CompositeInitor(propertyBeans));
	}

	@Override
	protected void createContent(Composite parent) {

		this.setLayout(new GridLayout());

		tableViewComposite = new TableViewComposite<PropertyBean>(parent,
				UIConfigFactory.getInstance().getTableConfig(
						"uiTreeNodePropertyListTable"), SWT.BORDER, true) {

			@Override
			protected ToolBarComposite createHeadToolBar(Composite composite) {
				toolBarComposite = new ToolBarComposite(composite,
						UIConfigFactory.getInstance().getActionGroupConfig(
								"uiTreeNodePropertyListConfigActionGroup"),
						new ActionHandler(), SWT.FLAT);
				return toolBarComposite;
			}

		};

		tableViewComposite.setLayoutData(new GridData(GridData.FILL_BOTH));

		PropertyBean[] listDatas = new PropertyBean[getInitHelper()
				.getPropertyBeans().size()];

		for (int i = 0; i < listDatas.length; i++) {
			listDatas[i] = new PropertyBean();
			listDatas[i].setName(getInitHelper().getPropertyBeans().get(i)
					.getName());
			listDatas[i].setValue(getInitHelper().getPropertyBeans().get(i)
					.getValue());
		}

		tableViewComposite.setDataList(listDatas);

		toolBarComposite.update();

	}

	static public class CompositeInitor implements ICompositeInitHelper {

		private List<PropertyBean> propertyBeans;

		public CompositeInitor(List<PropertyBean> propertyBeans) {
			super();
			this.propertyBeans = propertyBeans;
		}

		public List<PropertyBean> getPropertyBeans() {
			return propertyBeans;
		}

		@Override
		public void onConstructor(Composite composite) {

		}

	}

	public List<PropertyBean> getPropertyBeans() {
		return this.tableViewComposite.getDataList();
	}

	class ActionHandler extends AbstractDispatchActionHandler {

		@Override
		public boolean isActionEnable(ActionBean aAction) {

			List<PropertyBean> selectedDatas = tableViewComposite
					.getSelectedDataList();

			if ("remove".equals(aAction.getId())) {
				return selectedDatas.isEmpty() == false;
			} else {
				return true;
			}
		}

		public void remove(ActionEvent actionEvent) throws Exception {
			tableViewComposite.removeSelectedRows();
		}

		public void add(ActionEvent actionEvent) throws Exception {
			PropertyBean propertyBean = new PropertyBean();

			propertyBean.setName("property");

			propertyBean.setValue("value");

			tableViewComposite.addRow(propertyBean);
		}

	}

}
