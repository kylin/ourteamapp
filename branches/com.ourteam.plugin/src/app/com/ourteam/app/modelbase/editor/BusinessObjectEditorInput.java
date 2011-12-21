package com.ourteam.app.modelbase.editor;

import net.ui.UIConfigFactory;
import net.ui.eclipse.editorpart.IMultiPageEditorAgentInput;
import net.ui.model.tab.TabbedPaneConfig;

import com.ourteam.modelbase.domain.BusinessObjectBean;

public class BusinessObjectEditorInput extends
		AbstractModelObjectEditorInput<BusinessObjectBean> implements
		IMultiPageEditorAgentInput {

	public BusinessObjectEditorInput(BusinessObjectBean dataModel) {
		super(dataModel);
	}

	@Override
	public boolean exists() {
		try {
			return getBusinessObjectService().getBusinessObjectById(
					getDataModel().getBusinessObjectId()) != null;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public String getName() {
		return getDataModel().getName();
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
	protected BusinessObjectBean doReloadDataModel() throws Exception {
		return getBusinessObjectService().getBusinessObjectById(
				getDataModel().getBusinessObjectId());
	}

	@Override
	public TabbedPaneConfig getTabbedPaneConfig() {
		String tabId = null;
		if ("DAO".equals(getDataModel().getType())) {
			tabId = "daoConfigTab";
		} else if ("PERSISTENT".equals(getDataModel().getType())) {
			tabId = "dataObjectConfigTab";
		} else if ("SERVICE".equals(getDataModel().getType())) {
			tabId = "serviceObjectConfigTab";
		} else if ("ENUM".equals(getDataModel().getType())) {
			tabId = "enumObjectConfigTab";
		} else if ("JAVA_CLASS".equals(getDataModel().getType())) {
			tabId = "businessBeanConfigTab";
		}

		return UIConfigFactory.getInstance().getTabConfig(tabId);
	}
}
