package com.ourteam.app.modelbase.editor;

import org.apache.commons.lang.ArrayUtils;
import org.eclipse.jface.wizard.IWizard;

import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;
import com.ourteam.modelbase.domain.ObjectRelationTypeEnum;

public class AddBusinessBeanMappedDataObjectWizardProvider extends
		AbstractAddBsuinessObjectRelationWizardProvider {

	public AddBusinessBeanMappedDataObjectWizardProvider(
			BusinessObjectRelationDataModel dataModel) {
		super(dataModel);
	}

	protected String getWizardConfigId() {
		return "businessBeanMappedDataObjectConfigWizard";
	}

	@Override
	protected BusinessObjectTypeEnum[] getBusinessObjectTypeEnums() {
		return new BusinessObjectTypeEnum[] { BusinessObjectTypeEnum.DAO,
				BusinessObjectTypeEnum.JAVA_CLASS };
	}

	@Override
	public boolean canFinsh(IWizard wizard) {
		return ArrayUtils.isNotEmpty(this.getDataModel()
				.getPropertyRelationDataModels());
	}

	@Override
	protected ObjectRelationTypeEnum getBusinessObjectRelationTypeEnum() {
		return ObjectRelationTypeEnum.COMPOUNDED;
	}

}
