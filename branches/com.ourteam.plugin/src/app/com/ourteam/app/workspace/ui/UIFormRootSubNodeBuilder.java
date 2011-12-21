package com.ourteam.app.workspace.ui;

import net.ui.eclipse.tree.ISubNodeBuilder;
import net.ui.model.form.FormBean;

public class UIFormRootSubNodeBuilder implements
		ISubNodeBuilder<FormBean, FormBean> {

	@Override
	public FormBean[] getSubNodes(FormBean aParentObject) throws Exception {
		return new FormBean[] { aParentObject };
	}

	@Override
	public String getSubNodeDefineId(FormBean nodeObject) {
		return "form";
	}

	@Override
	public String[] getSubNodeActionGroupIds(FormBean nodeObject) {
		return new String[]{"uiFormConfigActionGroup"};
	}

}
