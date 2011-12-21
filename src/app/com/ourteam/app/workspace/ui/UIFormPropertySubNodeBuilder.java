package com.ourteam.app.workspace.ui;

import java.util.List;

import net.ui.eclipse.form.FormPropertyTypeConst;
import net.ui.eclipse.tree.ISubNodeBuilder;
import net.ui.model.form.FormBean;
import net.ui.model.form.FormPropertyBean;

public class UIFormPropertySubNodeBuilder implements
		ISubNodeBuilder<FormBean, FormPropertyBean> {

	@Override
	public FormPropertyBean[] getSubNodes(FormBean aParentObject)
			throws Exception {

		List<FormPropertyBean> formPropertyBeans = aParentObject
				.getFormProperties();

		return formPropertyBeans.toArray(new FormPropertyBean[formPropertyBeans
				.size()]);
	}

	@Override
	public String getSubNodeDefineId(FormPropertyBean nodeObject) {
		return nodeObject.getType();
	}

	@Override
	public String[] getSubNodeActionGroupIds(FormPropertyBean nodeObject) {
		if (nodeObject.getType().equals(FormPropertyTypeConst.GROUP)) {
			return new String[] { "uiFormGroupPropertyConfigActionGroup" };
		} else {
			return new String[] { "uiFormPropertyConfigActionGroup" };
		}

	}

}
