package com.ourteam.app.modelbase.editor;

import net.ui.eclipse.form.GridFormComposite;
import net.ui.eclipse.utils.AbstractTabbedPanelDialogProvider;

import org.eclipse.swt.widgets.Control;

import com.ourteam.modelbase.domain.BusinessTemplateProviderTypeBean;
import com.ourteam.modelbase.service.BusinessTemplateServiceFactory;
import com.ourteam.modelbase.service.IBusinessTemplateService;

public class EditBusinessTemplateProviderTypeDialogProvider extends
		AbstractTabbedPanelDialogProvider {

	private BusinessTemplateProviderTypeBean businessTemplateProviderType;

	private GridFormComposite<BusinessTemplateProviderTypeBean> formComposite;

	private static final IBusinessTemplateService BUSINESS_TEMPLATE_SERVICE = BusinessTemplateServiceFactory
			.getBusinessTemplateService();

	public EditBusinessTemplateProviderTypeDialogProvider(
			BusinessTemplateProviderTypeBean businessTemplateProviderType) {
		super();
		this.businessTemplateProviderType = businessTemplateProviderType;
	}

	@Override
	public String getTitle() {
		if (businessTemplateProviderType.getId() != 0) {
			return "编辑模板类型";
		} else {
			return "添加模板类型";
		}
	}

	@Override
	public boolean doOkPressed() throws Exception {
		formComposite.getFormDataModel();

		if (businessTemplateProviderType.getId() != 0) {

			BUSINESS_TEMPLATE_SERVICE
					.modifyBusinessTemplateProviderType(businessTemplateProviderType);
		} else {
			BUSINESS_TEMPLATE_SERVICE
					.addBusinessTemplateProviderType(businessTemplateProviderType);
		}

		return true;
	}

	@Override
	protected String getTabbedPaneConfigId() {
		return "businessTemplateProviderTypeConfigTab";
	}

	@Override
	protected void initTabPanel(Control aPanel) throws Exception {
		if (aPanel instanceof GridFormComposite) {
			formComposite = (GridFormComposite<BusinessTemplateProviderTypeBean>) aPanel;

			formComposite.setFormDataModel(this.businessTemplateProviderType);
		}
	}

}
