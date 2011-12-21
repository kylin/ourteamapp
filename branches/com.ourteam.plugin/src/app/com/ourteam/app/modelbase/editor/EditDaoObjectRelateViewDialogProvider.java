package com.ourteam.app.modelbase.editor;

import java.util.ArrayList;
import java.util.List;

import net.ui.UIConfigFactory;
import net.ui.eclipse.LocalHelper;
import net.ui.eclipse.form.GridFormComposite;

import org.apache.commons.lang.ArrayUtils;
import org.eclipse.swt.widgets.Control;

import com.ourteam.app.modelbase.ui.ModelBaseUIUtils;
import com.ourteam.app.modelbase.ui.ModelObjectMappingConfigComposite;
import com.ourteam.app.modelbase.ui.ModelObjectRelationConfigComposite;
import com.ourteam.modelbase.domain.ObjectPropertyBean;
import com.ourteam.modelbase.domain.ObjectRelationAttrTypeEnum;

public class EditDaoObjectRelateViewDialogProvider extends
		AbstractEditBusinessObjectRelationDialogProvider {

	private GridFormComposite<BusinessObjectRelationDataModel> aliasNameSeterComposite;

	private ModelObjectRelationConfigComposite objectRelationComposite;

	private ModelObjectMappingConfigComposite objectMappingComposite;

	public EditDaoObjectRelateViewDialogProvider(
			BusinessObjectRelationDataModel dataModel) {
		super(dataModel);
	}

	@Override
	public String getTitle() {
		return UIConfigFactory.getInstance().getLocalMessage(
				"modelbase.editRelateView", LocalHelper.getLocale());
	}

	@Override
	protected ObjectPropertyRelationDataModel[] getObjectPropertyRelationDataModels() {
		ObjectPropertyRelationDataModel[] propertyRelationDataModels = this.objectRelationComposite
				.getObjectPropertyRelations();

		ObjectPropertyRelationDataModel[] propertyMappedDataModels = this.objectMappingComposite
				.getObjectPropertyRelations();

		if (ArrayUtils.isNotEmpty(propertyMappedDataModels)) {

			propertyRelationDataModels = (ObjectPropertyRelationDataModel[]) ArrayUtils
					.addAll(propertyRelationDataModels,
							propertyMappedDataModels);

		}
		return propertyRelationDataModels;
	}

	@Override
	protected String getTabbedPaneConfigId() {
		return "daoRelateViewEditTab";
	}

	@Override
	protected void initTabPanel(Control aPanel) throws Exception {
		if (aPanel instanceof ModelObjectRelationConfigComposite) {

			objectRelationComposite = (ModelObjectRelationConfigComposite) aPanel;

			final ObjectPropertyBean[] propertyBeans = getBusinessObjectService()
					.getBusinessObjectProperties(
							getDataModel().getBusinessObjectBean()
									.getBusinessObjectId());

			final ObjectPropertyBean[] relatedPropertyBeans = getBusinessObjectService()
					.getBusinessObjectProperties(
							getDataModel().getRelatedBusinessObjectBean()
									.getBusinessObjectId());

			List<ObjectPropertyRelationDataModel> relationDataModels = new ArrayList<ObjectPropertyRelationDataModel>();

			ObjectPropertyRelationDataModel[] propertyRelationDataModels = getDataModel()
					.getPropertyRelationDataModels();

			for (int i = 0; i < propertyRelationDataModels.length; i++) {
				ObjectPropertyRelationDataModel propertyRelationDataModel = propertyRelationDataModels[i];

				if (ObjectRelationAttrTypeEnum.RELATED
						.equals(propertyRelationDataModel
								.getRelationAttrTypeEnum())) {
					relationDataModels.add(propertyRelationDataModel);
				}

			}

			ModelBaseUIUtils
					.initModelObjectRelationConfigCompositeData(
							objectRelationComposite,
							propertyBeans,
							relatedPropertyBeans,
							relationDataModels
									.toArray(new ObjectPropertyRelationDataModel[relationDataModels
											.size()]));

		} else if (aPanel instanceof GridFormComposite) {

			aliasNameSeterComposite = (GridFormComposite) aPanel;

			aliasNameSeterComposite.setFormDataModel(getDataModel());

		} else if (aPanel instanceof ModelObjectMappingConfigComposite) {

			objectMappingComposite = (ModelObjectMappingConfigComposite) aPanel;

			final ObjectPropertyBean[] propertyBeans = getBusinessObjectService()
					.getBusinessObjectNotMappedProperties(
							getDataModel().getBusinessObjectBean()
									.getBusinessObjectId());

			final ObjectPropertyBean[] relatedPropertyBeans = getBusinessObjectService()
					.getBusinessObjectProperties(
							getDataModel().getRelatedBusinessObjectBean()
									.getBusinessObjectId());

			List<ObjectPropertyRelationDataModel> relationDataModels = new ArrayList<ObjectPropertyRelationDataModel>();

			ObjectPropertyRelationDataModel[] propertyRelationDataModels = getDataModel()
					.getPropertyRelationDataModels();

			for (int i = 0; i < propertyRelationDataModels.length; i++) {
				ObjectPropertyRelationDataModel propertyRelationDataModel = propertyRelationDataModels[i];

				if (ObjectRelationAttrTypeEnum.MAPPED
						.equals(propertyRelationDataModel
								.getRelationAttrTypeEnum())) {
					relationDataModels.add(propertyRelationDataModel);
				}

			}

			ModelBaseUIUtils
					.initModelObjectRelationConfigCompositeData(
							objectMappingComposite,
							propertyBeans,
							relatedPropertyBeans,
							relationDataModels
									.toArray(new ObjectPropertyRelationDataModel[relationDataModels
											.size()]));

		}

	}

}
