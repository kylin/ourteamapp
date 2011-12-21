package com.ourteam.app.modelbase.editor;

import net.ui.eclipse.utils.IDialogProvider;
import net.ui.eclipse.wizard.IWizardProvider;

import com.ourteam.app.IOurTeamServiceConst;
import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.domain.ObjectRelationBean;
import com.ourteam.modelbase.domain.ObjectRelationTypeEnum;

public class DaoRelatedViewListEditorPart extends
		AbstractBusinessObjectRelationListEditorPart {

	@Override
	protected ObjectRelationBean[] getDataList(BusinessObjectBean dataModel)
			throws Exception {

		return IOurTeamServiceConst.BUSINESS_OBJECT_SERVICE
				.getBusinessObjectRelatedBusinessObjects(
						dataModel.getBusinessObjectId(),
						ObjectRelationTypeEnum.RELATED_VIEW);

	}

	@Override
	protected String getTableConfigId() {
		return "businessObjectRelatedViewTable";
	}

	@Override
	protected IWizardProvider getAddBusinessObjectRelationWizardProvider(
			BusinessObjectRelationDataModel objectRelationDataModel) {
		return new AddDaoObjectRelateViewWizardProvider(objectRelationDataModel);
	}

	@Override
	protected IDialogProvider getEditBusinessObjectRelationWizardProvider(
			BusinessObjectRelationDataModel objectRelationDataModel) {
		return new EditDaoObjectRelateViewDialogProvider(
				objectRelationDataModel);
	}

}
