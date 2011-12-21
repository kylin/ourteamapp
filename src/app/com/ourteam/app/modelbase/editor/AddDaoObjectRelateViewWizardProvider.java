package com.ourteam.app.modelbase.editor;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.eclipse.jface.wizard.IWizard;

import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;
import com.ourteam.modelbase.domain.ObjectRelationTypeEnum;

public class AddDaoObjectRelateViewWizardProvider extends
		AbstractAddBsuinessObjectRelationWizardProvider {

	public AddDaoObjectRelateViewWizardProvider(
			BusinessObjectRelationDataModel dataModel) {
		super(dataModel);
	}

	protected String getWizardConfigId() {
		return "daoRelateViewConfigWizard";
	}

	@Override
	protected BusinessObjectTypeEnum[] getBusinessObjectTypeEnums() {
		return new BusinessObjectTypeEnum[] { BusinessObjectTypeEnum.DAO };
	}

	@Override
	public boolean canFinsh(IWizard wizard) {
		return ArrayUtils.isNotEmpty(this.getDataModel()
				.getPropertyRelationDataModels())
				&& StringUtils.isNotBlank(this.getDataModel().getAliasName());
	}

	@Override
	protected ObjectRelationTypeEnum getBusinessObjectRelationTypeEnum() {
		return ObjectRelationTypeEnum.RELATED_VIEW;
	}

	// @Override
	// public void doNextWizardPage(IWizardPage wizardPage) {
	// super.doNextWizardPage(wizardPage);
	//
	// if (wizardPage.getControl() instanceof ModelObjectMappingConfigComposite)
	// {
	//
	// ModelObjectMappingConfigComposite objectMappingComposite =
	// (ModelObjectMappingConfigComposite) wizardPage
	// .getControl();
	//
	// try {
	// final ObjectPropertyBean[] propertyBeans = businessObjectService
	// .getBusinessObjectNotMappedProperties(this
	// .getDataModel().getBusinessObjectBean()
	// .getBusinessObjectId());
	//
	// final ObjectPropertyBean[] relatedPropertyBeans = businessObjectService
	// .getBusinessObjectProperties(this.getDataModel()
	// .getRelatedBusinessObjectBean()
	// .getBusinessObjectId());
	//
	// SWTUtils.fillCommboBox(
	// objectMappingComposite.getPropertyCombo(),
	// new BusinessPropertyComboListProvider(propertyBeans));
	//
	// SWTUtils.fillCommboBox(objectMappingComposite
	// .getRelatedPropertyCombo(),
	// new BusinessPropertyComboListProvider(
	// relatedPropertyBeans));
	//
	// if (this.relaedBusinessObjectChanged == true) {
	// objectMappingComposite.clearPropertyRelation();
	// }
	//
	// } catch (Exception e) {
	// logger.error("configWizardPage error", e);
	// this.setErrorMessage(e.getLocalizedMessage());
	//
	// }
	// }
	//
	// }

}
