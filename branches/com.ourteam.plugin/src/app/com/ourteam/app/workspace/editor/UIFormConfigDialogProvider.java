package com.ourteam.app.workspace.editor;

import java.util.Iterator;
import java.util.List;

import net.ui.UIConfigFactory;
import net.ui.eclipse.utils.AbstractDialogProvider;
import net.ui.model.form.AbstractFormBean;
import net.ui.model.form.FormBean;
import net.ui.model.form.FormPropertyBean;
import net.ui.model.form.LayoutDataBean;

import org.apache.commons.beanutils.PropertyUtils;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

import com.ourteam.app.workspace.ui.UIFormDesignComposite;

public class UIFormConfigDialogProvider extends AbstractDialogProvider {

	private FormBean formBean;

	private UIFormDesignComposite formDesignComposite;

	public UIFormConfigDialogProvider(FormBean formBean) {
		super();
		this.formBean = formBean;
	}

	@Override
	public String getTitle() {
		return "编辑表单配置信息";
	}

	@Override
	public boolean doOkPressed() throws Exception {
		formDesignComposite.applyChange();
		this.formBean.getFormProperties().clear();
		this.formBean.getLayoutDataList().clear();
		copyFormBean(formBean, formDesignComposite.getInitHelper()
				.getFormBean());
		return true;
	}

	@Override
	public void createContentComposite(Composite parent) throws Exception {
		parent.setLayout(new FillLayout());

		FormBean tempFormBean = new FormBean();

		copyFormBean(tempFormBean, formBean);

		formDesignComposite = new UIFormDesignComposite(parent,
				tempFormBean) {
			@Override
			protected FormBean getRefFormBean(String formId) {
				return UIFormConfigDialogProvider.this.getRefFormBean(formId);
			}
			
			
		};
	}

	protected FormBean getRefFormBean(String formId) {
		return UIConfigFactory.getInstance().getFormConfig(formId);
	}

	protected void copyFormBean(AbstractFormBean tempFormBean,
			AbstractFormBean formBean) throws Exception {

		PropertyUtils.copyProperties(tempFormBean, formBean);

		List<LayoutDataBean> layoutDataBeans = formBean.getLayoutDataList();

		for (Iterator<LayoutDataBean> iterator = layoutDataBeans.iterator(); iterator
				.hasNext();) {
			LayoutDataBean layoutDataBean = iterator.next();

			LayoutDataBean tmpLayoutDataBean = new LayoutDataBean();

			PropertyUtils.copyProperties(tmpLayoutDataBean, layoutDataBean);

			tempFormBean.addLayoutData(tmpLayoutDataBean);

		}

		List<FormPropertyBean> formPropertyBeans = formBean.getFormProperties();

		for (Iterator<FormPropertyBean> iterator = formPropertyBeans.iterator(); iterator
				.hasNext();) {
			FormPropertyBean formPropertyBean = iterator.next();

			FormPropertyBean tmpFormPropertyBean = new FormPropertyBean();

			copyFormBean(tmpFormPropertyBean, formPropertyBean);

			tempFormBean.addFormProperty(tmpFormPropertyBean);

		}
	}

}
