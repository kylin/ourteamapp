package com.ourteam.app.modelbase.editor;

import org.eclipse.jface.wizard.IWizard;

import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;
import com.ourteam.modelbase.domain.ObjectRelationTypeEnum;

public class ConfigDaoObjectMappingWizardProvider extends
		AbstractAddBsuinessObjectRelationWizardProvider {

	
	public ConfigDaoObjectMappingWizardProvider(
			BusinessObjectRelationDataModel dataModel) {
		super(dataModel);
	}

	protected String getWizardConfigId() {
		return "daoMappingConfigWizard";
	}

	@Override
	protected BusinessObjectTypeEnum[] getBusinessObjectTypeEnums() {
		return new BusinessObjectTypeEnum[] { BusinessObjectTypeEnum.PERSISTENT };
	}

	@Override
	public boolean canFinsh(IWizard wizard) {
		return true;
	}

	@Override
	protected ObjectRelationTypeEnum getBusinessObjectRelationTypeEnum() {
		return ObjectRelationTypeEnum.MAPPED;
	}

}
