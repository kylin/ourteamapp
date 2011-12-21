package com.ourteam.app.modelbase.editor;

import java.util.ArrayList;
import java.util.List;

import net.ui.eclipse.form.GridFormComposite;
import net.ui.eclipse.utils.AbstractTabbedPanelDialogProvider;

import org.eclipse.swt.widgets.Control;

import com.ourteam.modelbase.domain.ServiceParameterBean;
import com.ourteam.modelbase.service.BusinessObjectServiceFactory;
import com.ourteam.modelbase.service.IBusinessObjectService;

public class EditServiceMethodInputParameterDialogProvider extends
		AbstractTabbedPanelDialogProvider {

	private static final IBusinessObjectService BUSINESS_OBJECT_SERVICE = BusinessObjectServiceFactory
			.getBusinessObjectService();

	private ServiceParameterBean serviceParameterBean;

	private GridFormComposite<ServiceParameterBean> formComposite;

	public EditServiceMethodInputParameterDialogProvider(
			ServiceParameterBean serviceParameterBean) {
		super();
		this.serviceParameterBean = serviceParameterBean;
	}

	@Override
	public String getTitle() {
		if (this.serviceParameterBean.getServiceParameterId() == 0) {
			return "添加输入参数";
		} else {
			return "编辑输入参数";
		}

	}

	@Override
	public boolean doOkPressed() throws Exception {

		this.formComposite.validate();

		this.formComposite.getFormDataModel();

		ServiceParameterBean[] serviceParameterBeans = BUSINESS_OBJECT_SERVICE
				.getServiceInputParameters(this.serviceParameterBean
						.getServiceFunctionId());

		List<ServiceParameterBean> inputParameters = new ArrayList<ServiceParameterBean>();

		for (int i = 0; i < serviceParameterBeans.length; i++) {
			ServiceParameterBean serviceParameterBean = serviceParameterBeans[i];

			if (this.serviceParameterBean.getServiceParameterId() == serviceParameterBean
					.getServiceParameterId()) {
				inputParameters.add(this.serviceParameterBean);
			} else {
				inputParameters.add(serviceParameterBean);
			}

		}

		if (this.serviceParameterBean.getServiceParameterId() == 0) {
			inputParameters.add(this.serviceParameterBean);
		}

		BUSINESS_OBJECT_SERVICE.setServiceInputParameters(
				this.serviceParameterBean.getServiceFunctionId(),
				(ServiceParameterBean[]) inputParameters
						.toArray(new ServiceParameterBean[inputParameters
								.size()]));

		return true;
	}

	@Override
	protected String getTabbedPaneConfigId() {
		return "serviceMethodInputParameterConfigTab";
	}

	@Override
	protected void initTabPanel(Control aPanel) throws Exception {
		if (aPanel instanceof GridFormComposite) {
			formComposite = (GridFormComposite<ServiceParameterBean>) aPanel;

			formComposite.setFormDataModel(this.serviceParameterBean);
		}

	}

}
