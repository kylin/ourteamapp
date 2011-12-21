package com.ourteam.app.modelbase.editor;

import java.util.ArrayList;
import java.util.List;

import net.ui.UIConfigFactory;
import net.ui.eclipse.LocalHelper;

import org.eclipse.swt.widgets.Control;

import com.ourteam.app.modelbase.ui.ModelBaseUIUtils;
import com.ourteam.app.modelbase.ui.ModelObjectMappingConfigComposite;
import com.ourteam.modelbase.domain.ObjectPropertyBean;
import com.ourteam.modelbase.domain.ObjectRelationAttrTypeEnum;

public class EditDaoObjectMappingDialogProvider extends
		AbstractEditBusinessObjectRelationDialogProvider {

	private ModelObjectMappingConfigComposite objectMappingComposite;

	public EditDaoObjectMappingDialogProvider(
			BusinessObjectRelationDataModel dataModel) {
		super(dataModel);
	}

	@Override
	public String getTitle() {
		return UIConfigFactory.getInstance().getLocalMessage(
				"modelbase.editMapping",LocalHelper.getLocale());
	}

	@Override
	protected String getTabbedPaneConfigId() {
		return "daoMappingConfigTab";
	}

	@Override
	protected void initTabPanel(Control aPanel) throws Exception {
		if (aPanel instanceof ModelObjectMappingConfigComposite) {

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

	@Override
	protected ObjectPropertyRelationDataModel[] getObjectPropertyRelationDataModels() {
		return objectMappingComposite.getObjectPropertyRelations();
	}

}
