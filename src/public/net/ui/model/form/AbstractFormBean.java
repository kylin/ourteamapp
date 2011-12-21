package net.ui.model.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractFormBean implements Serializable {

	private String id;

	private String desc;

	private String title;

	private String titleKey;

	private List<LayoutDataBean> layoutDataList = new ArrayList<LayoutDataBean>();

	private List<FormPropertyBean> properties = new ArrayList<FormPropertyBean>();

	public void addFormProperty(FormPropertyBean aProperty) {
		properties.add(aProperty);
	}

	public void removeFormProperty(FormPropertyBean aProperty) {
		properties.remove(aProperty);
	}

	public List<FormPropertyBean> getFormProperties() {
		return properties;
	}

	public FormPropertyBean getFormProperty(String id) {

		FormPropertyBean propertyBean = null;

		for (Iterator<FormPropertyBean> iterator = properties.iterator(); iterator
				.hasNext();) {
			FormPropertyBean formPropertyBean = iterator.next();
			if (formPropertyBean.getId().equals(id)) {
				propertyBean = formPropertyBean;
				break;
			}

			if (formPropertyBean.getFormProperties().isEmpty() == false) {

				propertyBean = getFormProperty(formPropertyBean, id);
			}
		}

		return propertyBean;
	}

	private FormPropertyBean getFormProperty(FormPropertyBean parentBean,
			String id) {

		FormPropertyBean propertyBean = null;

		for (Iterator<FormPropertyBean> iterator = parentBean
				.getFormProperties().iterator(); iterator.hasNext();) {
			FormPropertyBean formPropertyBean = iterator.next();
			if (formPropertyBean.getId().equals(id)) {
				propertyBean = formPropertyBean;
				break;
			}
		}

		return propertyBean;
	}

	public void addLayoutData(LayoutDataBean aLayoutProperty) {
		layoutDataList.add(aLayoutProperty);
	}

	public void removeLayoutData(LayoutDataBean aLayoutProperty) {
		layoutDataList.remove(aLayoutProperty);
	}

	public List<LayoutDataBean> getLayoutDataList() {
		return layoutDataList;
	}

	public LayoutDataBean getLayoutData(String aName) {
		LayoutDataBean layoyt = null;
		for (Iterator<LayoutDataBean> iter = layoutDataList.iterator(); iter
				.hasNext();) {
			LayoutDataBean element = iter.next();
			if (element.getName().equals(aName)) {
				layoyt = element;
				break;
			}
		}

		return layoyt;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitleKey() {
		return titleKey;
	}

	public void setTitleKey(String titleKey) {
		this.titleKey = titleKey;
	}

}
