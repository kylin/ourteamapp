package com.ourteam.app.workspace.editor;

import net.ui.eclipse.form.GridFormComposite;
import net.ui.eclipse.utils.AbstractTabbedPanelDialogProvider;
import net.ui.model.action.ActionGroupBean;
import net.ui.model.action.ActionSetBean;

import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.widgets.Control;

import com.ourteam.app.workspace.ui.UIActionGroupRefActionConfigComposite;

public class UIActionGroupConfigDialogProvider extends
		AbstractTabbedPanelDialogProvider {

	private GridFormComposite<ActionGroupBean> actionGroupFormComposite;

	private UIActionGroupRefActionConfigComposite refActionConfigComposite;

	private ActionSetBean actionSetBean;

	private ActionGroupBean actionGroupBean;

	public UIActionGroupConfigDialogProvider(ActionSetBean actionSetBean,
			ActionGroupBean actionGroupBean) {
		super();
		this.actionSetBean = actionSetBean;
		this.actionGroupBean = actionGroupBean;
	}

	@Override
	public String getTitle() {
		return "编辑动作组信息";
	}

	@Override
	public boolean doOkPressed() throws Exception {
		actionGroupFormComposite.getFormDataModel();

		actionGroupBean
				.setActionBeans(refActionConfigComposite.getActionRefs());

		return true;
	}

	@Override
	protected void initTabPanel(Control aPanel) throws Exception {
		if (aPanel instanceof GridFormComposite<?>) {
			actionGroupFormComposite = ((GridFormComposite) aPanel);

			actionGroupFormComposite.setFormDataModel(actionGroupBean);

		}
	}

	@Override
	protected String getTabbedPaneConfigId() {
		return "uiActionGroupConfigTab";
	}

	@Override
	protected Control constructTabPanel(Class<?> panelClass,
			CTabFolder tabFolder) {
		if (panelClass.equals(UIActionGroupRefActionConfigComposite.class)) {

			UIActionGroupRefActionConfigComposite.CompositeInitor initor = new UIActionGroupRefActionConfigComposite.CompositeInitor(
					actionSetBean, actionGroupBean);

			return refActionConfigComposite = new UIActionGroupRefActionConfigComposite(
					tabFolder, initor);

		} else {
			return super.constructTabPanel(panelClass, tabFolder);
		}
	}

}
