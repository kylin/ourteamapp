package com.ourteam.app.modelbase.editor;

import java.util.List;

import net.ui.eclipse.action.IActionHandler;
import net.ui.eclipse.editorpart.AbstractObjectRelationDataListEditorPart;
import net.ui.eclipse.utils.IDialogProvider;
import net.ui.eclipse.wizard.IWizardProvider;
import net.ui.model.action.ActionBean;

import com.ourteam.app.IOurTeamServiceConst;
import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.domain.ObjectRelationAttrBean;
import com.ourteam.modelbase.domain.ObjectRelationAttrTypeEnum;
import com.ourteam.modelbase.domain.ObjectRelationBean;

public abstract class AbstractBusinessObjectRelationListEditorPart
		extends
		AbstractObjectRelationDataListEditorPart<BusinessObjectBean, BusinessObjectEditorInput, ObjectRelationBean> {

	abstract protected IWizardProvider getAddBusinessObjectRelationWizardProvider(
			BusinessObjectRelationDataModel objectRelationDataModel);

	abstract protected IDialogProvider getEditBusinessObjectRelationWizardProvider(
			BusinessObjectRelationDataModel objectRelationDataModel);

	@Override
	public IActionHandler createActionHandler() {
		return new BusinessObjectRelationActionHandler();
	}

	public class BusinessObjectRelationActionHandler extends
			ObjectRelationActionHandler {
		@Override
		protected void doRemoveRelations(List<ObjectRelationBean> items)
				throws Exception {

			long[] objectRelationIds = new long[items.size()];

			for (int i = 0; i < items.size(); i++) {
				objectRelationIds[i] = items.get(i).getObjectRelationId();
			}

			IOurTeamServiceConst.BUSINESS_OBJECT_SERVICE
					.removeBusinessObjectRelations(objectRelationIds);
		}

		@Override
		protected IWizardProvider getAddRelationWizardProvider(
				ActionBean actionBean) throws Exception {

			BusinessObjectRelationDataModel dataModel = new BusinessObjectRelationDataModel();

			dataModel.setBusinessObjectBean(getDataModel());

			return getAddBusinessObjectRelationWizardProvider(dataModel);
		}

		@Override
		protected IDialogProvider getEditDialogProvider(
				List<ObjectRelationBean> items) throws Exception {
			BusinessObjectRelationDataModel dataModel = new BusinessObjectRelationDataModel();

			dataModel.setBusinessObjectRelationId(items.get(0)
					.getObjectRelationId());

			dataModel.setBusinessObjectBean(getDataModel());

			dataModel
					.setRelatedBusinessObjectBean(IOurTeamServiceConst.BUSINESS_OBJECT_SERVICE
							.getBusinessObjectById(items.get(0)
									.getRelatedObjectId()));

			dataModel.setDescription(items.get(0).getDescription());

			dataModel.setAliasName(items.get(0).getRelateConfig());

			ObjectRelationAttrBean[] relationAttrBeans = IOurTeamServiceConst.BUSINESS_OBJECT_SERVICE
					.getBusinessObjectRelatedProperties(items.get(0)
							.getObjectRelationId());

			ObjectPropertyRelationDataModel[] propertyRelationDataModels = new ObjectPropertyRelationDataModel[relationAttrBeans.length];

			for (int i = 0; i < relationAttrBeans.length; i++) {
				ObjectRelationAttrBean objectRelationAttrBean = relationAttrBeans[i];

				propertyRelationDataModels[i] = new ObjectPropertyRelationDataModel(
						IOurTeamServiceConst.BUSINESS_OBJECT_SERVICE.getBusinessObjectPropertyById(objectRelationAttrBean
								.getPropertyId()),
						IOurTeamServiceConst.BUSINESS_OBJECT_SERVICE
								.getBusinessObjectPropertyById(objectRelationAttrBean
										.getRelatedPropertyId()));

				propertyRelationDataModels[i]
						.setRelationAttrTypeEnum(ObjectRelationAttrTypeEnum
								.getEnum(objectRelationAttrBean
										.getRelateAttrType()));
			}

			dataModel.setPropertyRelationDataModels(propertyRelationDataModels);

			return getEditBusinessObjectRelationWizardProvider(dataModel);
		}

	}
}
