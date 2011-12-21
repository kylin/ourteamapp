package com.ourteam.app.modelbase.editor;

import net.ui.eclipse.utils.AbstractComboListProvider;

import org.apache.commons.lang.BooleanUtils;

import com.ourteam.modelbase.domain.ObjectPropertyBean;

public class BusinessPropertyComboListProvider extends
		AbstractComboListProvider<ObjectPropertyBean> {

	private ObjectPropertyBean[] objectPropertyBeans;

	public BusinessPropertyComboListProvider(
			ObjectPropertyBean[] objectPropertyBeans) {
		super(false);
		this.objectPropertyBeans = objectPropertyBeans;
	}

	@Override
	public String getDataLabel(ObjectPropertyBean dataItem) {
		StringBuffer label = new StringBuffer(dataItem.getName());

		if (BooleanUtils.toBoolean(dataItem.getIsPrimaryProperty())) {
			label.append(" : PK");
		}

		return label.toString();
	}

	@Override
	public ObjectPropertyBean[] getDataList() {
		return objectPropertyBeans;
	}

}
