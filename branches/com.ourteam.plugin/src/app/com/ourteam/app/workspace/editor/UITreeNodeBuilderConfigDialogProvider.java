package com.ourteam.app.workspace.editor;

import net.ui.eclipse.form.GridFormComposite;
import net.ui.eclipse.utils.AbstractTabbedPanelDialogProvider;
import net.ui.model.tree.SubNodeBuilderBean;

import org.apache.commons.beanutils.PropertyUtils;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.widgets.Control;

import com.ourteam.app.workspace.ui.UITreeNodePropertyListConfigComposite;

public class UITreeNodeBuilderConfigDialogProvider extends
		AbstractTabbedPanelDialogProvider {

	private SubNodeBuilderBean subNodeBuilderBean;

	private GridFormComposite<SubNodeBuilderBean> formComposite;

	private UITreeNodePropertyListConfigComposite nodeBuilderPropertyListConfigComposite;

	public UITreeNodeBuilderConfigDialogProvider(
			SubNodeBuilderBean subNodeBuilderBean) {
		super();
		this.subNodeBuilderBean = subNodeBuilderBean;
	}

	@Override
	public String getTitle() {
		return "编辑节点构造器信息";
	}

	@Override
	public boolean doOkPressed() throws Exception {

		PropertyUtils.copyProperties(subNodeBuilderBean,
				formComposite.getFormDataModel());

		subNodeBuilderBean.getProperties().clear();

		subNodeBuilderBean.getProperties().addAll(
				nodeBuilderPropertyListConfigComposite.getPropertyBeans());

		return true;
	}

	@Override
	protected String getTabbedPaneConfigId() {
		return "uiTreeNodeBuilderConfigTab";
	}

	@Override
	protected Control constructTabPanel(Class<?> panelClass,
			CTabFolder tabFolder) {
		if (UITreeNodePropertyListConfigComposite.class.equals(panelClass)) {
			nodeBuilderPropertyListConfigComposite = new UITreeNodePropertyListConfigComposite(
					tabFolder, this.subNodeBuilderBean.getProperties());

			return nodeBuilderPropertyListConfigComposite;

		} else {
			return super.constructTabPanel(panelClass, tabFolder);
		}
	}

	@Override
	protected void initTabPanel(Control aPanel) throws Exception {
		if (aPanel instanceof GridFormComposite<?>) {

			SubNodeBuilderBean tmpBean = new SubNodeBuilderBean();

			PropertyUtils.copyProperties(tmpBean, subNodeBuilderBean);

			formComposite = ((GridFormComposite) aPanel);

			formComposite.setFormDataModel(tmpBean);
		}
	}

}
