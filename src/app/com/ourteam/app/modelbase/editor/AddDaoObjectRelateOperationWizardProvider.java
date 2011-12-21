package com.ourteam.app.modelbase.editor;

import org.apache.commons.lang.ArrayUtils;
import org.eclipse.jface.wizard.IWizard;

import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;
import com.ourteam.modelbase.domain.ObjectRelationTypeEnum;

public class AddDaoObjectRelateOperationWizardProvider extends
		AbstractAddBsuinessObjectRelationWizardProvider {

	public AddDaoObjectRelateOperationWizardProvider(
			BusinessObjectRelationDataModel dataModel) {
		super(dataModel);
	}

	protected String getWizardConfigId() {
		return "daoRelateOperationConfigWizard";
	}

	@Override
	protected BusinessObjectTypeEnum[] getBusinessObjectTypeEnums() {
		return new BusinessObjectTypeEnum[] { BusinessObjectTypeEnum.DAO };
	}

	@Override
	public boolean canFinsh(IWizard wizard) {
		return ArrayUtils.isNotEmpty(this.getDataModel()
				.getPropertyRelationDataModels());
	}

	@Override
	protected ObjectRelationTypeEnum getBusinessObjectRelationTypeEnum() {
		return ObjectRelationTypeEnum.RELATED_OPERATION;
	}

}
