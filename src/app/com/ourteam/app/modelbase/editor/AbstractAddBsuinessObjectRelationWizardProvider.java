package com.ourteam.app.modelbase.editor;

import java.util.ArrayList;
import java.util.List;

import net.ui.eclipse.form.GridFormComposite;
import net.ui.eclipse.table.TableCompositInputChangListener;
import net.ui.eclipse.utils.SWTUtils;
import net.ui.eclipse.wizard.AbstractWizardProvider;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;

import com.ourteam.app.modelbase.ui.AbstractModelObjectRelationConfigComposite;
import com.ourteam.app.modelbase.ui.ModelBaseUIUtils;
import com.ourteam.app.modelbase.ui.ModelObjectMappingConfigComposite;
import com.ourteam.app.modelbase.ui.ModelObjectRelationConfigComposite;
import com.ourteam.app.modelbase.ui.ModelObjectSearchComposite;
import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;
import com.ourteam.modelbase.domain.ObjectPropertyBean;
import com.ourteam.modelbase.domain.ObjectRelationAttrBean;
import com.ourteam.modelbase.domain.ObjectRelationAttrTypeEnum;
import com.ourteam.modelbase.domain.ObjectRelationBean;
import com.ourteam.modelbase.domain.ObjectRelationTypeEnum;
import com.ourteam.modelbase.service.BusinessObjectServiceFactory;
import com.ourteam.modelbase.service.IBusinessObjectService;

public abstract class AbstractAddBsuinessObjectRelationWizardProvider extends
		AbstractWizardProvider {
	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(AbstractAddBsuinessObjectRelationWizardProvider.class);

	protected static final IBusinessObjectService businessObjectService = BusinessObjectServiceFactory
			.getBusinessObjectService();

	private BusinessObjectRelationDataModel dataModel;

	protected boolean relaedBusinessObjectChanged = false;

	abstract protected BusinessObjectTypeEnum[] getBusinessObjectTypeEnums();

	abstract protected ObjectRelationTypeEnum getBusinessObjectRelationTypeEnum();

	public AbstractAddBsuinessObjectRelationWizardProvider(
			BusinessObjectRelationDataModel dataModel) {
		super();
		this.dataModel = dataModel;
	}

	@Override
	public void doFinish(IWizard wizard) throws Exception {

		ObjectPropertyRelationDataModel[] propertyRelationDataModels = this.dataModel
				.getPropertyRelationDataModels();

		long businessObjectId = this.dataModel.getBusinessObjectBean()
				.getBusinessObjectId();

		long relatedBusinessObjectId = this.dataModel
				.getRelatedBusinessObjectBean().getBusinessObjectId();

		ObjectRelationBean objectRelation = new ObjectRelationBean();

		objectRelation.setRelateType(getBusinessObjectRelationTypeEnum()
				.getName());

		objectRelation.setRelateConfig(this.dataModel.getAliasName());

		objectRelation.setObjectId(businessObjectId);

		objectRelation.setRelatedObjectId(relatedBusinessObjectId);

		objectRelation.setDescription(this.dataModel.getDescription());

		if (ArrayUtils.isNotEmpty(propertyRelationDataModels)) {

			ObjectRelationAttrBean[] objectRelationAttrs = new ObjectRelationAttrBean[propertyRelationDataModels.length];

			for (int i = 0; i < objectRelationAttrs.length; i++) {
				objectRelationAttrs[i] = new ObjectRelationAttrBean();
				objectRelationAttrs[i]
						.setPropertyId(propertyRelationDataModels[i]
								.getObjectPropertyBean().getObjectPropertyId());
				objectRelationAttrs[i]
						.setRelatedPropertyId(propertyRelationDataModels[i]
								.getRelatedObjectPropertyBean()
								.getObjectPropertyId());

				if (ObjectRelationTypeEnum.RELATED_OPERATION
						.equals(getBusinessObjectRelationTypeEnum())
						|| ObjectRelationTypeEnum.RELATED_VIEW
								.equals(getBusinessObjectRelationTypeEnum())) {
					if (propertyRelationDataModels[i].getRelationAttrTypeEnum() != null) {
						objectRelationAttrs[i]
								.setRelateAttrType(propertyRelationDataModels[i]
										.getRelationAttrTypeEnum().getName());
					} else {
						objectRelationAttrs[i]
								.setRelateAttrType(ObjectRelationAttrTypeEnum.RELATED
										.getName());
					}
				} else if (ObjectRelationTypeEnum.MAPPED
						.equals(getBusinessObjectRelationTypeEnum())) {
					objectRelationAttrs[i]
							.setRelateAttrType(ObjectRelationAttrTypeEnum.MAPPED
									.getName());
				} else if (ObjectRelationTypeEnum.COMPOUNDED
						.equals(getBusinessObjectRelationTypeEnum())) {
					objectRelationAttrs[i]
							.setRelateAttrType(ObjectRelationAttrTypeEnum.MAPPED
									.getName());
				} else if (ObjectRelationTypeEnum.DEPENDED
						.equals(getBusinessObjectRelationTypeEnum())) {
					objectRelationAttrs[i]
							.setRelateAttrType(ObjectRelationAttrTypeEnum.RELATED
									.getName());
				}

			}

			objectRelation.setRelationAttrBeans(objectRelationAttrs);

		}

		if (ObjectRelationTypeEnum.EXTEND
				.equals(getBusinessObjectRelationTypeEnum())) {
			businessObjectService.setBusinessObjectExtension(objectRelation);
		} else if (ObjectRelationTypeEnum.MAPPED
				.equals(getBusinessObjectRelationTypeEnum())) {
			businessObjectService
					.setBusinessObjectMappedPersistentObject(objectRelation);
		} else if (ObjectRelationTypeEnum.DEPENDED
				.equals(getBusinessObjectRelationTypeEnum())) {

			BusinessObjectBean[] businessObjectBeans = this.dataModel
					.getRelatedBusinessObjectBeans();

			ObjectRelationBean[] objectRelationBeans = new ObjectRelationBean[businessObjectBeans.length];

			for (int j = 0; j < businessObjectBeans.length; j++) {

				BusinessObjectBean businessObjectBean = businessObjectBeans[j];

				objectRelationBeans[j] = new ObjectRelationBean();

				objectRelationBeans[j]
						.setRelateType(getBusinessObjectRelationTypeEnum()
								.getName());

				objectRelationBeans[j].setObjectId(businessObjectId);

				objectRelationBeans[j].setRelatedObjectId(businessObjectBean
						.getBusinessObjectId());
			}

			businessObjectService
					.addBusinessObjectRelations(objectRelationBeans);

		} else {
			businessObjectService
					.addBusinessObjectRelations(new ObjectRelationBean[] { objectRelation });
		}

	}

	@Override
	public boolean canFlipToNextPage(IWizardPage wizardPage) {
		if (wizardPage.getControl() instanceof ModelObjectSearchComposite) {
			ModelObjectSearchComposite objectSearchComposite = (ModelObjectSearchComposite) wizardPage
					.getControl();

			List<BusinessObjectBean> selectedItems = objectSearchComposite
					.getSelectedSearchResults();

			if (selectedItems.isEmpty()) {
				return false;
			} else {
				return true;
			}
		} else if (wizardPage.getControl() instanceof ModelObjectRelationConfigComposite) {
			ModelObjectRelationConfigComposite objectRelationComposite = (ModelObjectRelationConfigComposite) wizardPage
					.getControl();

			if (objectRelationComposite.getObjectPropertyRelations().length == 0) {
				return false;
			} else {
				return true;
			}

		} else {
			return true;
		}
	}

	@Override
	public void initWizardPage(final IWizardPage wizardPage) {
		if (wizardPage.getControl() instanceof ModelObjectSearchComposite) {
			ModelObjectSearchComposite objectSearchComposite = (ModelObjectSearchComposite) wizardPage
					.getControl();

			objectSearchComposite
					.setBusinessObjectTypeEnums(getBusinessObjectTypeEnums());

			List<Long> excludeIds = new ArrayList<Long>();

			long businessObjectId = this.dataModel.getBusinessObjectBean()
					.getBusinessObjectId();

			excludeIds.add(Long.valueOf(businessObjectId));

			try {
				ObjectRelationBean[] relationBeans = businessObjectService
						.getBusinessObjectRelatedBusinessObjects(
								businessObjectId,
								getBusinessObjectRelationTypeEnum());

				for (int i = 0; i < relationBeans.length; i++) {
					ObjectRelationBean objectRelationBean = relationBeans[i];
					excludeIds.add(Long.valueOf(objectRelationBean
							.getRelatedObjectId()));
				}

			} catch (Exception ex) {

				logger.error("get related object error", ex);
				setErrorMessage(ex.getLocalizedMessage());
			}

			long[] ids = ArrayUtils.toPrimitive(excludeIds
					.toArray(new Long[excludeIds.size()]));

			objectSearchComposite.setExcludeBusinessObjectIds(ids);

			objectSearchComposite.addSelectionChangedListener(this);

		} else if (wizardPage.getControl() instanceof AbstractModelObjectRelationConfigComposite) {

			AbstractModelObjectRelationConfigComposite objectRelationComposite = (AbstractModelObjectRelationConfigComposite) wizardPage
					.getControl();

			objectRelationComposite.getRelationTableComposite()
					.addTableCompositInputChangListener(
							new TableCompositInputChangListener() {

								@Override
								public void inputChanged(Viewer viewer,
										Object oldInput, Object newInput) {
									updateWizardButtons();
								}

							});

		} else if (wizardPage.getControl() instanceof GridFormComposite) {
			final GridFormComposite<BusinessObjectRelationDataModel> aliasNameSeterComposite = (GridFormComposite) wizardPage
					.getControl();

			aliasNameSeterComposite.setFormDataModel(this.getDataModel());

			aliasNameSeterComposite.addModifyListener(new ModifyListener() {

				@Override
				public void modifyText(ModifyEvent event) {
					aliasNameSeterComposite.getFormDataModel();
					updateWizardButtons();
				}
			});
		}

	}

	@Override
	public void doNextWizardPage(IWizardPage wizardPage) {
		if (wizardPage.getControl() instanceof ModelObjectRelationConfigComposite) {

			ModelObjectRelationConfigComposite objectRelationComposite = (ModelObjectRelationConfigComposite) wizardPage
					.getControl();

			try {
				final ObjectPropertyBean[] propertyBeans = businessObjectService
						.getBusinessObjectProperties(this.dataModel
								.getBusinessObjectBean().getBusinessObjectId());

				final ObjectPropertyBean[] relatedPropertyBeans = businessObjectService
						.getBusinessObjectProperties(this.dataModel
								.getRelatedBusinessObjectBean()
								.getBusinessObjectId());

				ObjectPropertyRelationDataModel[] propertyRelationDataModels = objectRelationComposite
						.getObjectPropertyRelations();

				if (this.relaedBusinessObjectChanged == true) {
					propertyRelationDataModels = new ObjectPropertyRelationDataModel[0];
				}

				ModelBaseUIUtils.initModelObjectRelationConfigCompositeData(
						objectRelationComposite, propertyBeans,
						relatedPropertyBeans, propertyRelationDataModels);

			} catch (Exception e) {
				logger.error("configWizardPage error", e);
				this.setErrorMessage(e.getLocalizedMessage());

			}
		}

		if (wizardPage.getControl() instanceof ModelObjectMappingConfigComposite) {

			ModelObjectMappingConfigComposite objectMappingComposite = (ModelObjectMappingConfigComposite) wizardPage
					.getControl();

			try {
				final ObjectPropertyBean[] propertyBeans = businessObjectService
						.getBusinessObjectNotMappedProperties(this
								.getDataModel().getBusinessObjectBean()
								.getBusinessObjectId());

				final ObjectPropertyBean[] relatedPropertyBeans = businessObjectService
						.getBusinessObjectProperties(this.getDataModel()
								.getRelatedBusinessObjectBean()
								.getBusinessObjectId());

				SWTUtils.fillCommboBox(
						objectMappingComposite.getPropertyCombo(),
						new BusinessPropertyComboListProvider(propertyBeans));

				SWTUtils.fillCommboBox(objectMappingComposite
						.getRelatedPropertyCombo(),
						new BusinessPropertyComboListProvider(
								relatedPropertyBeans));

				if (this.relaedBusinessObjectChanged == true) {
					objectMappingComposite.clearPropertyRelation();
				}

			} catch (Exception e) {
				logger.error("configWizardPage error", e);
				this.setErrorMessage(e.getLocalizedMessage());

			}
		}

	}

	@Override
	public void onActiveWizardPageChanged(IWizardPage wizardPage) {
		if (wizardPage.getControl() instanceof ModelObjectSearchComposite) {
			ModelObjectSearchComposite objectSearchComposite = (ModelObjectSearchComposite) wizardPage
					.getControl();

			BusinessObjectBean relatedBusinessObjectBean = objectSearchComposite
					.getSelectedSearchResults().get(0);

			this.dataModel.setRelatedBusinessObjectBeans(objectSearchComposite
					.getSelectedSearchResults().toArray(
							new BusinessObjectBean[0]));

			if (this.dataModel.getRelatedBusinessObjectBean() == null
					|| this.dataModel.getRelatedBusinessObjectBean()
							.getBusinessObjectId() != relatedBusinessObjectBean
							.getBusinessObjectId()) {
				this.relaedBusinessObjectChanged = true;
			} else {
				this.relaedBusinessObjectChanged = false;
			}

			this.dataModel
					.setRelatedBusinessObjectBean(relatedBusinessObjectBean);

		} else if (wizardPage.getControl() instanceof AbstractModelObjectRelationConfigComposite) {

			AbstractModelObjectRelationConfigComposite objectRelationComposite = (AbstractModelObjectRelationConfigComposite) wizardPage
					.getControl();

			ObjectPropertyRelationDataModel[] objectPropertyRelationDataModels = objectRelationComposite
					.getObjectPropertyRelations();

			if (ArrayUtils.isNotEmpty(this.dataModel
					.getPropertyRelationDataModels())) {

				objectPropertyRelationDataModels = (ObjectPropertyRelationDataModel[]) ArrayUtils
						.addAll(objectPropertyRelationDataModels,
								this.dataModel.getPropertyRelationDataModels());

			}

			this.dataModel
					.setPropertyRelationDataModels(objectPropertyRelationDataModels);
		}

	}

	public BusinessObjectRelationDataModel getDataModel() {
		return dataModel;
	}

}
