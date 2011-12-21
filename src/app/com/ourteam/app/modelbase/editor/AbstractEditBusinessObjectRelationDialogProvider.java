package com.ourteam.app.modelbase.editor;

import net.ui.eclipse.utils.AbstractTabbedPanelDialogProvider;

import com.ourteam.modelbase.domain.ObjectRelationAttrBean;
import com.ourteam.modelbase.domain.ObjectRelationBean;
import com.ourteam.modelbase.domain.ObjectRelationTypeEnum;
import com.ourteam.modelbase.service.BusinessObjectServiceFactory;
import com.ourteam.modelbase.service.IBusinessObjectService;

public abstract class AbstractEditBusinessObjectRelationDialogProvider extends
		AbstractTabbedPanelDialogProvider {

	private static final IBusinessObjectService businessObjectService = BusinessObjectServiceFactory
			.getBusinessObjectService();

	private BusinessObjectRelationDataModel dataModel;

	abstract protected ObjectPropertyRelationDataModel[] getObjectPropertyRelationDataModels();

	public AbstractEditBusinessObjectRelationDialogProvider(
			BusinessObjectRelationDataModel dataModel) {
		super();
		this.dataModel = dataModel;
	}

	@Override
	public boolean doOkPressed() throws Exception {

		ObjectRelationBean objectRelationBean = businessObjectService
				.getBusinessObjectRelationById(getDataModel()
						.getBusinessObjectRelationId());

		objectRelationBean.setDescription(getDataModel().getAliasName());

		ObjectPropertyRelationDataModel[] propertyRelationDataModels = getObjectPropertyRelationDataModels();

		ObjectRelationAttrBean[] objectRelationAttrs = new ObjectRelationAttrBean[propertyRelationDataModels.length];

		for (int i = 0; i < objectRelationAttrs.length; i++) {
			objectRelationAttrs[i] = new ObjectRelationAttrBean();
			objectRelationAttrs[i].setPropertyId(propertyRelationDataModels[i]
					.getObjectPropertyBean().getObjectPropertyId());
			objectRelationAttrs[i]
					.setRelatedPropertyId(propertyRelationDataModels[i]
							.getRelatedObjectPropertyBean()
							.getObjectPropertyId());

			objectRelationAttrs[i]
					.setRelateAttrType(propertyRelationDataModels[i]
							.getRelationAttrTypeEnum().getName());

		}

		objectRelationBean.setRelationAttrBeans(objectRelationAttrs);

		ObjectRelationTypeEnum relationTypeEnum = ObjectRelationTypeEnum
				.getEnum(objectRelationBean.getRelateType());

		if (ObjectRelationTypeEnum.MAPPED.equals(relationTypeEnum)) {
			businessObjectService
					.setBusinessObjectMappedPersistentObject(objectRelationBean);
		} else if (ObjectRelationTypeEnum.RELATED_OPERATION
				.equals(relationTypeEnum)) {
			businessObjectService
					.modifyBusinessObjectRelation(objectRelationBean);
		} else if (ObjectRelationTypeEnum.RELATED_VIEW.equals(relationTypeEnum)) {
			businessObjectService
					.modifyBusinessObjectRelation(objectRelationBean);
		} else if (ObjectRelationTypeEnum.COMPOUNDED.equals(relationTypeEnum)) {
			businessObjectService
					.modifyBusinessObjectRelation(objectRelationBean);
		}

		return true;
	}

	public BusinessObjectRelationDataModel getDataModel() {
		return dataModel;
	}

	public static IBusinessObjectService getBusinessObjectService() {
		return businessObjectService;
	}

}
