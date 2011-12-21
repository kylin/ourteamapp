package com.ourteam.app.workspace.ui;

import java.util.List;

import net.ui.eclipse.form.FormPropertyTypeConst;
import net.ui.eclipse.tree.ISubNodeBuilder;
import net.ui.model.form.FormPropertyBean;

public class UIFormGroupSubNodeBuilder implements
		ISubNodeBuilder<FormPropertyBean, FormPropertyBean> {

	@Override
	public FormPropertyBean[] getSubNodes(FormPropertyBean aParentObject)
			throws Exception {
		List<FormPropertyBean> propertyBeans = aParentObject.getSubProperties();
		return propertyBeans
				.toArray(new FormPropertyBean[propertyBeans.size()]);
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
