package com.ourteam.app.modelbase.editor;

import net.ui.eclipse.utils.IDialogProvider;
import net.ui.eclipse.wizard.IWizardProvider;

import org.eclipse.jface.wizard.IWizard;

import com.ourteam.app.IOurTeamServiceConst;
import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;
import com.ourteam.modelbase.domain.ObjectRelationBean;
import com.ourteam.modelbase.domain.ObjectRelationTypeEnum;

public class ServiceObjectDependListEditorPart extends
		AbstractBusinessObjectRelationListEditorPart {

	@Override
	protected ObjectRelationBean[] getDataList(BusinessObjectBean dataModel)
			throws Exception {
 
		ObjectRelationBean[] objectRelationBean = IOurTeamServiceConst.BUSINESS_OBJECT_SERVICE
				.getServiceObjectDependedBusinessObjects(dataModel
						.getBusinessObjectId());

		return objectRelationBean;
	}

	@Override
	protected String getTableConfigId() {
		return "serviceObjectDependTable";
	}

	@Override
	protected void saveDataModel(BusinessObjectBean aDataModel)
			throws Exception {

	}

	@Override
	public String[] getActionGroupIds() {
		return new String[] { "extendRelationActionGroup" };
	}

	@Override
	protected IWizardProvider getAddBusinessObjectRelationWizardProvider(
			BusinessObjectRelationDataModel objectRelationDataModel) {
		return new AbstractAddBsuinessObjectRelationWizardProvider(
				objectRelationDataModel) {

			protected String getWizardConfigId() {
				return "serviceObjectDependConfigWizard";

			}

			@Override
			public boolean canFinsh(IWizard wizard) {
				if (canFlipToNextPage(wizard.getPages()[0])) {
					return true;
				} else {
					return false;
				}
			}

			@Override
			protected BusinessObjectTypeEnum[] getBusinessObjectTypeEnums() {
				return new BusinessObjectTypeEnum[] {
						BusinessObjectTypeEnum.DAO,
						BusinessObjectTypeEnum.SERVICE };
			}

			@Override
			protected ObjectRelationTypeEnum getBusinessObjectRelationTypeEnum() {
				return ObjectRelationTypeEnum.DEPENDED;
			}

		};
	}

	@Override
	protected IDialogProvider getEditBusinessObjectRelationWizardProvider(
			BusinessObjectRelationDataModel objectRelationDataModel) {
		return null;
	}

}
