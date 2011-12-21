package com.ourteam.app.workspace.editor;

import java.util.Map;

import net.ui.eclipse.form.FormOptionListDataProviderAdapter;
import net.ui.eclipse.form.IFormOptionListDataProvider;
import net.ui.eclipse.utils.AbstractFormDialogProvider;
import net.ui.model.action.ActionBean;
import net.ui.model.action.ActionSetBean;

import com.ourteam.app.workspace.editor.UIActionConfigEditorPart.UIActionDomainComboListProvider;

public class UIActionConfigDialogProvider extends
		AbstractFormDialogProvider<ActionBean> {

	private ActionSetBean actionSetBean;

	public UIActionConfigDialogProvider(ActionSetBean actionSetBean,
			ActionBean formDataModel) {
		super(formDataModel);
		this.actionSetBean = actionSetBean;
	}

	@Override
	public String getTitle() {
		return "编辑动作信息";
	}

	@Override
	protected String getFormConfigId() {
		return "uiActionConfigForm";
	}

	@Override
	protected void initFormOptionListDataProviders(
			Map<String, IFormOptionListDataProvider> listDataProiverMap) {
		UIActionDomainComboListProvider listProvider = new UIActionDomainComboListProvider(
				actionSetBean);

		listDataProiverMap.put("getUIActionDomains",
				new FormOptionListDataProviderAdapter(listProvider));
	}

}
