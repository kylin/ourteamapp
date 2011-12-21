package com.ourteam.app.modelbase.editor;

import net.ui.eclipse.form.GridFormComposite;
import net.ui.eclipse.utils.AbstractTabbedPanelDialogProvider;

import org.eclipse.swt.widgets.Control;

import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.service.BusinessObjectServiceFactory;
import com.ourteam.modelbase.service.IBusinessObjectService;

public class EditCustomDataObjectDialogProvider extends
		AbstractTabbedPanelDialogProvider {

	private static final IBusinessObjectService BUSINESS_OBJECT_SERVICE = BusinessObjectServiceFactory
			.getBusinessObjectService();

	private BusinessObjectBean customDataObject;

	private GridFormComposite<BusinessObjectBean> formComposite;

	public EditCustomDataObjectDialogProvider(
			BusinessObjectBean customDataObject) {
		super();
		this.customDataObject = customDataObject;
	}

	@Override
	public String getTitle() {
		if (customDataObject.getBusinessObjectId() == 0) {
			return "新建自定义数据对象";
		} else {
			return "编辑自定义数据对象";
		}
	}

	@Override
	public boolean doOkPressed() throws Exception {

		formComposite.getFormDataModel();

		if (customDataObject.getBusinessObjectId() == 0) {
			BUSINESS_OBJECT_SERVICE.addNewCustomDataObject(customDataObject);
		} else {
			BUSINESS_OBJECT_SERVICE.modifyCustomDataObject(customDataObject);
		}
		return true;
	}

	@Override
	protected String getTabbedPaneConfigId() {
		return "customDataObjectConfigTab";
	}

	@Override
	protected void initTabPanel(Control aPanel) throws Exception {

		if (aPanel instanceof GridFormComposite) {
			formComposite = (GridFormComposite<BusinessObjectBean>) aPanel;

			formComposite.setFormDataModel(this.customDataObject);
		}
	}

}
