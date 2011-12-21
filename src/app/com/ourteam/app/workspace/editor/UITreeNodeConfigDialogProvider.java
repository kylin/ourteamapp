package com.ourteam.app.workspace.editor;

import net.ui.eclipse.form.GridFormComposite;
import net.ui.eclipse.utils.AbstractTabbedPanelDialogProvider;
import net.ui.model.tree.NodeBean;

import org.apache.commons.beanutils.PropertyUtils;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.widgets.Control;

import com.ourteam.app.workspace.ui.UITreeNodePropertyListConfigComposite;

public class UITreeNodeConfigDialogProvider extends
		AbstractTabbedPanelDialogProvider {

	private NodeBean nodeBean;

	private GridFormComposite<NodeBean> formComposite;

	private UITreeNodePropertyListConfigComposite nodePropertyListConfigComposite;

	public UITreeNodeConfigDialogProvider(NodeBean nodeBean) {
		super();
		this.nodeBean = nodeBean;
	}

	@Override
	public String getTitle() {
		return "编辑节点信息";
	}

	@Override
	public boolean doOkPressed() throws Exception {

		PropertyUtils
				.copyProperties(nodeBean, formComposite.getFormDataModel());

		nodeBean.getProperties().clear();

		nodeBean.getProperties().addAll(
				nodePropertyListConfigComposite.getPropertyBeans());

		return true;
	}

	@Override
	protected String getTabbedPaneConfigId() {
		return "uiTreeNodeConfigTab";
	}

	@Override
	protected Control constructTabPanel(Class<?> panelClass,
			CTabFolder tabFolder) {
		if (UITreeNodePropertyListConfigComposite.class.equals(panelClass)) {
			nodePropertyListConfigComposite = new UITreeNodePropertyListConfigComposite(
					tabFolder, this.nodeBean.getProperties());

			return nodePropertyListConfigComposite;

		} else {
			return super.constructTabPanel(panelClass, tabFolder);
		}
	}

	@Override
	protected void initTabPanel(Control aPanel) throws Exception {
		if (aPanel instanceof GridFormComposite<?>) {

			NodeBean tmpBean = new NodeBean();

			PropertyUtils.copyProperties(tmpBean, nodeBean);

			formComposite = ((GridFormComposite) aPanel);

			formComposite.setFormDataModel(tmpBean);
		}
	}

}
