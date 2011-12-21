package net.ui.model.form;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.digester.Digester;

public class FormSetConfig {

	private List<FormBean> formList = new ArrayList<FormBean>();

	public FormSetConfig() {
		super();
	}

	public void addForm(FormBean aForm) {
		formList.add(aForm);
	}

	public void removeForm(FormBean aForm) {
		formList.remove(aForm);
	}

	public List<FormBean> getFormList() {
		return this.formList;
	}

	public FormBean getForm(String aFormId) {
		FormBean form = null;
		for (Iterator<FormBean> iter = this.formList.iterator(); iter.hasNext();) {
			FormBean element = iter.next();
			if (element.getId().equals(aFormId)) {
				form = element;
			}
		}

		return form;
	}

	public static FormSetConfig init(InputStream aConfig) throws Exception {
		Digester digester = new Digester();

		digester.setValidating(false);

		digester.addObjectCreate("formSet", FormSetConfig.class);

		digester.addSetProperties("formSet");

		digester.addObjectCreate("formSet/form", FormBean.class);

		digester.addSetProperties("formSet/form");

		digester.addSetNext("formSet/form", "addForm");

		digester.addObjectCreate("formSet/form/property",
				FormPropertyBean.class);

		digester.addSetProperties("formSet/form/property", "style", "styleDesc");

		digester.addSetProperties("formSet/form/property");

		digester.addSetNext("formSet/form/property", "addFormProperty");

		digester.addObjectCreate("*/layoutData", LayoutDataBean.class);

		digester.addSetProperties("*/layoutData");

		digester.addSetNext("*/layoutData", "addLayoutData");

		digester.addObjectCreate("formSet/form/property/property",
				FormPropertyBean.class);

		digester.addSetProperties("formSet/form/property/property", "style",
				"styleDesc");

		digester.addSetProperties("formSet/form/property/property");

		digester.addSetNext("formSet/form/property/property", "addSubProperty");

		FormSetConfig formSetConfig = (FormSetConfig) digester.parse(aConfig);

		return formSetConfig;
	}

}
