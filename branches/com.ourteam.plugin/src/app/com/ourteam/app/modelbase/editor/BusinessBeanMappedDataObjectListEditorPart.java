package com.ourteam.app.modelbase.editor;

import net.ui.eclipse.utils.IDialogProvider;
import net.ui.eclipse.wizard.IWizardProvider;

import com.ourteam.app.IOurTeamServiceConst;
import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.domain.ObjectRelationBean;

public class BusinessBeanMappedDataObjectListEditorPart extends
		AbstractBusinessObjectRelationListEditorPart {

	@Override
	protected ObjectRelationBean[] getDataList(BusinessObjectBean dataModel)
			throws Exception {

		return IOurTeamServiceConst.BUSINESS_OBJECT_SERVICE
				.getBeanObjectCompoundedBusinessObjects(dataModel
						.getBusinessObjectId());

	}

	@Override
	protected String getTableConfigId() {
		return "businessBeanMappedDataObjectTable";
	}

	@Override
	protected IWizardProvider getAddBusinessObjectRelationWizardProvider(
			BusinessObjectRelationDataModel objectRelationDataModel) {
		return new AddBusinessBeanMappedDataObjectWizardProvider(
				objectRelationDataModel);
	}

	@Override
	protected IDialogProvider getEditBusinessObjectRelationWizardProvider(
			BusinessObjectRelationDataModel objectRelationDataModel) {
		return new EditBusinessBeanMappedDataObjectDialogProvider(
				objectRelationDataModel);
	}

}
