package com.ourteam.app.modelbase.editor;

import net.ui.UIConfigFactory;
import net.ui.eclipse.editorpart.IMultiPageEditorAgentInput;
import net.ui.model.tab.TabbedPaneConfig;

import org.apache.log4j.Logger;

import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.domain.ServiceFunctionBean;

public class ServiceMethodEditorInput extends
		AbstractModelObjectEditorInput<ServiceFunctionBean> implements
		IMultiPageEditorAgentInput {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger
			.getLogger(ServiceMethodEditorInput.class);

	public ServiceMethodEditorInput(ServiceFunctionBean dataModel) {
		super(dataModel);
	}

	@Override
	protected ServiceFunctionBean doReloadDataModel() throws Exception {
		return getBusinessObjectService().getServiceFunctionById(
				getDataModel().getObjectFunctionId());
	}

	@Override
	public boolean exists() {
		try {
			return getBusinessObjectService().getServiceFunctionById(
					getDataModel().getObjectFunctionId()) != null;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public String getName() {
		try {
			BusinessObjectBean businessObjectBean = getBusinessObjectService()
					.getBusinessObjectById(getDataModel().getObjectId());

			return businessObjectBean.getName() + "."
					+ getDataModel().getName();

		} catch (Exception e) {
			logger.error("getName error", e);
			return "";
		}

	}

	@Override
	public String getToolTipText() {
		if (getDataModel().getDescription() != null) {
			return getDataModel().getDescription();
		} else {
			return "";
		}
	}

	@Override
	public TabbedPaneConfig getTabbedPaneConfig() {
		return UIConfigFactory.getInstance().getTabConfig(
				"serviceMethodEditorTab");
	}

}
