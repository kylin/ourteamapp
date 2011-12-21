package com.ourteam.app.modelbase.editor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.ui.UIConfigFactory;
import net.ui.eclipse.wizard.AbstractSerachWizardPageControlHelper;
import net.ui.eclipse.wizard.AbstractWizardProvider;
import net.ui.eclipse.wizard.IReflectWizardPageControlHelper;
import net.ui.model.constlist.ListData;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.StringUtils;
import org.eclipse.swt.widgets.Control;

import com.ourteam.app.modelbase.ui.DaoPropertyMappingConfigComposite;
import com.ourteam.app.modelbase.ui.ModelObjectSearchComposite;
import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;
import com.ourteam.modelbase.domain.ObjectPropertyBean;
import com.ourteam.modelbase.domain.ObjectPropertyTypeEnum;
import com.ourteam.modelbase.domain.ObjectRelationAttrBean;
import com.ourteam.modelbase.domain.ObjectRelationAttrTypeEnum;
import com.ourteam.modelbase.domain.ObjectRelationBean;
import com.ourteam.modelbase.domain.ObjectRelationTypeEnum;

public class AddDaoObjectWizardProvider extends
		AbstractAddBusinessObjectWizardProvider {

	private ModelObjectSearchCompositeHelper objectSearchCompositeHelper;

	private DaoPropertyMappingConfigComposite daoPropertyMappingConfigComposite;

	private BusinessPropertyMappingDataModel[] daoPropertyMappingDataModels;

	private BusinessObjectBean daoObjectBean;

	public AddDaoObjectWizardProvider(long packageId) {
		super(packageId);
	}

	@Override
	protected String getWizardConfigId() {
		return "addDaoObjectWizard";
	}

	@Override
	protected BusinessObjectTypeEnum getBusinessObjectTypeEnum() {
		return BusinessObjectTypeEnum.DAO;
	}

	@Override
	protected BusinessObjectBean getBusinessObjectDataModel() {
		daoObjectBean = super.getBusinessObjectDataModel();

		return daoObjectBean;
	}

	protected String convertPersistentName(String persistentName) {
		String[] strings = StringUtils.split(persistentName, "_");

		StringBuffer nameBuffer = new StringBuffer();

		for (int i = 0; i < strings.length; i++) {
			String string = strings[i].toLowerCase();
			nameBuffer.append(StringUtils.capitalize(string));
		}

		return nameBuffer.toString();
	}

	protected String convertPersistentPropertyName(String persistentName) {

		return StringUtils.uncapitalize(convertPersistentName(persistentName));

	}

	@Override
	protected void addBusinessObject(BusinessObjectBean businessObject)
			throws Exception {

		BusinessObjectBean persistentObject = objectSearchCompositeHelper
				.getSelectedItems().get(0);

		getBusinessObjectService().addNewBusinessObject(businessObject);

		ObjectRelationBean mappingBean = new ObjectRelationBean();

		mappingBean.setObjectId(businessObject.getBusinessObjectId());

		mappingBean.setRelatedObjectId(persistentObject.getBusinessObjectId());

		mappingBean.setRelateType(ObjectRelationTypeEnum.MAPPED.getName());

		List<ObjectPropertyBean> propertyList = new ArrayList<ObjectPropertyBean>();

		List<ObjectRelationAttrBean> propertyRelatedList = new ArrayList<ObjectRelationAttrBean>();

		List slectedPropertyMappings = this.daoPropertyMappingConfigComposite
				.getTableComposite().getSelectedDataList();

		for (Iterator iterator = slectedPropertyMappings.iterator(); iterator
				.hasNext();) {
			BusinessPropertyMappingDataModel daoPropertyMappingDataModel = (BusinessPropertyMappingDataModel) iterator
					.next();

			ObjectPropertyBean propertyBean = new ObjectPropertyBean();

			propertyBean.setObjectId(businessObject.getBusinessObjectId());

			propertyBean.setIsPrimaryProperty(daoPropertyMappingDataModel
					.getPrimaryKey());

			if (BooleanUtils.toBoolean(daoPropertyMappingDataModel
					.getPrimaryKey())) {
				propertyBean.setIsGenerate(daoPropertyMappingDataModel
						.getMappedProperty().getIsGenerate());
			}

			propertyBean.setName(daoPropertyMappingDataModel.getPropertyName());

			propertyBean.setDataType(daoPropertyMappingDataModel.getDataType());

			propertyBean.setDescription(daoPropertyMappingDataModel
					.getDescription());

			propertyBean
					.setPropertyKind(ObjectPropertyTypeEnum.BUSINESS_PROPERTY
							.getName());

			daoPropertyMappingDataModel.setProperty(propertyBean);

			propertyList.add(propertyBean);
		}

		getBusinessObjectService().addNewBusinessObjectProperties(
				(ObjectPropertyBean[]) propertyList
						.toArray(new ObjectPropertyBean[propertyList.size()]));

		for (Iterator iterator = slectedPropertyMappings.iterator(); iterator
				.hasNext();) {
			BusinessPropertyMappingDataModel daoPropertyMappingDataModel = (BusinessPropertyMappingDataModel) iterator
					.next();

			ObjectRelationAttrBean relationAttrBean = new ObjectRelationAttrBean();

			relationAttrBean.setPropertyId(daoPropertyMappingDataModel
					.getProperty().getObjectPropertyId());

			relationAttrBean.setRelatedPropertyId(daoPropertyMappingDataModel
					.getMappedProperty().getObjectPropertyId());

			relationAttrBean
					.setRelateAttrType(ObjectRelationAttrTypeEnum.MAPPED
							.getName());

			propertyRelatedList.add(relationAttrBean);

		}

		mappingBean
				.setRelationAttrBeans((ObjectRelationAttrBean[]) propertyRelatedList
						.toArray(new ObjectRelationAttrBean[propertyRelatedList
								.size()]));

		getBusinessObjectService().setBusinessObjectMappedPersistentObject(
				mappingBean);

	}

	@Override
	protected Object getReflectObject(Control control) {
		if (control instanceof ModelObjectSearchComposite) {
			return new ModelObjectSearchCompositeHelper(this);
		} else if (control instanceof DaoPropertyMappingConfigComposite) {
			return new DaoPropertyMappingConfigCompositeHelper();
		} else {
			return super.getReflectObject(control);
		}
	}

	public class ModelObjectSearchCompositeHelper
			extends
			AbstractSerachWizardPageControlHelper<BusinessObjectBean, ModelObjectSearchComposite> {

		public ModelObjectSearchCompositeHelper(
				AbstractWizardProvider wizardProvider) {
			super(wizardProvider);
		}

		@Override
		public void onActiveWizardPageControlChanged(
				ModelObjectSearchComposite control) throws Exception {

			super.onActiveWizardPageControlChanged(control);

			BusinessObjectBean persistentObject = control
					.getSelectedSearchResults().get(0);

			daoObjectBean.setName(convertPersistentName(persistentObject
					.getName()));

			try {
				ObjectPropertyBean[] persistentObjectPropertyBeans = getBusinessObjectService()
						.getBusinessObjectProperties(
								persistentObject.getBusinessObjectId());

				daoPropertyMappingDataModels = new BusinessPropertyMappingDataModel[persistentObjectPropertyBeans.length];

				ListData[] listDatas = UIConfigFactory.getInstance()
						.getListDatas("PersistentDataTypeToJavaType");

				for (int i = 0; i < persistentObjectPropertyBeans.length; i++) {
					ObjectPropertyBean objectPropertyBean = persistentObjectPropertyBeans[i];

					daoPropertyMappingDataModels[i] = new BusinessPropertyMappingDataModel();

					daoPropertyMappingDataModels[i]
							.setMappedPropertyName(objectPropertyBean.getName());

					daoPropertyMappingDataModels[i]
							.setPropertyName(convertPersistentPropertyName(objectPropertyBean
									.getName()));

					daoPropertyMappingDataModels[i]
							.setPrimaryKey(objectPropertyBean
									.getIsPrimaryProperty());

					daoPropertyMappingDataModels[i].setDescription("");

					daoPropertyMappingDataModels[i]
							.setMappedProperty(objectPropertyBean);

					for (int j = 0; j < listDatas.length; j++) {
						ListData listData = listDatas[j];
						if (listData.getData().equals(
								objectPropertyBean.getDataType())) {
							daoPropertyMappingDataModels[i]
									.setDataType(listData.getLabel());
							break;
						}
					}
				}

			} catch (Exception e) {
				throw new RuntimeException(e);
			}

			getFormComposite().setFormDataModel(daoObjectBean);

			if (ArrayUtils.isNotEmpty(daoPropertyMappingDataModels)) {
				daoPropertyMappingConfigComposite.getTableComposite()
						.setDataList(daoPropertyMappingDataModels);

				daoPropertyMappingConfigComposite.getTableComposite()
						.selectAll();
			}

		}

		@Override
		public void doInitSearchConfig(ModelObjectSearchComposite control) {
			control.setBusinessObjectTypeEnums(new BusinessObjectTypeEnum[] { BusinessObjectTypeEnum.PERSISTENT });

		}

	}

	public class DaoPropertyMappingConfigCompositeHelper implements
			IReflectWizardPageControlHelper<DaoPropertyMappingConfigComposite> {

		@Override
		public void doNextWizardPageControl(
				DaoPropertyMappingConfigComposite control) {

		}

		@Override
		public boolean canFlipToNextPageControl(
				DaoPropertyMappingConfigComposite control) {
			return true;
		}

		@Override
		public void onActiveWizardPageControlChanged(
				DaoPropertyMappingConfigComposite control) {

		}

		@Override
		public void initWizardPageControl(
				DaoPropertyMappingConfigComposite control) {
			daoPropertyMappingConfigComposite = control;
		}

	}

}
