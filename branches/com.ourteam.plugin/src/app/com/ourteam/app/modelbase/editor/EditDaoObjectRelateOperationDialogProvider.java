package com.ourteam.app.modelbase.editor;

import net.ui.UIConfigFactory;
import net.ui.eclipse.LocalHelper;
import net.ui.eclipse.form.GridFormComposite;

import org.eclipse.swt.widgets.Control;

import com.ourteam.app.modelbase.ui.ModelBaseUIUtils;
import com.ourteam.app.modelbase.ui.ModelObjectRelationConfigComposite;
import com.ourteam.modelbase.domain.ObjectPropertyBean;

public class EditDaoObjectRelateOperationDialogProvider extends
		AbstractEditBusinessObjectRelationDialogProvider {

	private GridFormComposite<BusinessObjectRelationDataModel> aliasNameSeterComposite;

	private ModelObjectRelationConfigComposite objectRelationComposite;

	public EditDaoObjectRelateOperationDialogProvider(
			BusinessObjectRelationDataModel dataModel) {
		super(dataModel);
	}

	@Override
	public String getTitle() {
		return UIConfigFactory.getInstance().getLocalMessage(
				"modelbase.editRelateOperation", LocalHelper.getLocale());
	}

	@Override
	protected ObjectPropertyRelationDataModel[] getObjectPropertyRelationDataModels() {
		return this.objectRelationComposite.getObjectPropertyRelations();
	}

	@Override
	protected String getTabbedPaneConfigId() {
		return "daoRelateOperationEditTab";
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

			objectRelationComposite.getRelationTableComposite().setDataList(
					getDataModel().getPropertyRelationDataModels());

			ModelBaseUIUtils.initModelObjectRelationConfigCompositeData(
					objectRelationComposite, propertyBeans,
					relatedPropertyBeans, getDataModel()
							.getPropertyRelationDataModels());

		} else if (aPanel instanceof GridFormComposite) {
			aliasNameSeterComposite = (GridFormComposite) aPanel;

			aliasNameSeterComposite.setFormDataModel(getDataModel());
		}

	}

}
