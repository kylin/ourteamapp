package com.ourteam.app.modelbase.ui;

import net.ui.eclipse.utils.SWTUtils;

import com.ourteam.app.modelbase.editor.BusinessPropertyComboListProvider;
import com.ourteam.app.modelbase.editor.ObjectPropertyRelationDataModel;
import com.ourteam.modelbase.domain.BusinessObjectActionBean;
import com.ourteam.modelbase.domain.ObjectPropertyBean;
import com.ourteam.modelbase.service.BusinessObjectServiceFactory;
import com.ourteam.modelbase.service.IBusinessObjectService;

public class ModelBaseUIUtils {

	private static final IBusinessObjectService businessObjectService = BusinessObjectServiceFactory
			.getBusinessObjectService();

	public static void initModelObjectRelationConfigCompositeData(
			AbstractModelObjectRelationConfigComposite objectRelationComposite,
			ObjectPropertyBean[] objectPropertyBeans,
			ObjectPropertyBean[] relateObjectPropertyBeans,
			ObjectPropertyRelationDataModel[] objectRelationBeans)
			throws Exception {

		SWTUtils.fillCommboBox(objectRelationComposite.getPropertyCombo(),
				new BusinessPropertyComboListProvider(objectPropertyBeans));

		SWTUtils.fillCommboBox(
				objectRelationComposite.getRelatedPropertyCombo(),
				new BusinessPropertyComboListProvider(relateObjectPropertyBeans));

		objectRelationComposite.getRelationTableComposite().setDataList(
				objectRelationBeans);

	}

	public static void initModelActionComposite(
			ModelObjectActionEditorComposite actionEditorComposite,
			BusinessObjectActionBean actionBean) throws Exception {

		ObjectPropertyBean[] objectPropertyBeans = businessObjectService
				.getBusinessObjectProperties(actionBean.getObjectId());

		SWTUtils.fillCommboBox(actionEditorComposite.getPropertyCombo(),
				new BusinessPropertyComboListProvider(objectPropertyBeans));

		if (actionBean.getPropertyId() > 0) {
			final ObjectPropertyBean propertyBean = businessObjectService
					.getBusinessObjectPropertyById(actionBean.getPropertyId());
			SWTUtils.setCommboBoxSelection(propertyBean,
					actionEditorComposite.getPropertyCombo(),
					new Comparable<ObjectPropertyBean>() {

						@Override
						public int compareTo(
								ObjectPropertyBean objectPropertyBean) {
							if (objectPropertyBean.getObjectPropertyId() == propertyBean
									.getObjectPropertyId()) {
								return 0;
							} else {
								return -1;
							}
						}
					});
		}

		if (actionBean.getOperation() != null) {
			actionEditorComposite.getOperationCombo().setText(
					actionBean.getOperation());
		} else {
			actionEditorComposite.getOperationCombo().setText("");
		}
		if (actionBean.getAction() != null) {
			actionEditorComposite.getActionCombo().setText(
					actionBean.getAction());
		}

		if (actionBean.getPropertyValue() != null) {
			actionEditorComposite.getActionValueText().setText(
					actionBean.getPropertyValue());
		}

	}
}
