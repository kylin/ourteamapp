package com.ourteam.app.modelbase.editor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.ui.UIConfigFactory;
import net.ui.eclipse.wizard.AbstractSerachWizardPageControlHelper;
import net.ui.eclipse.wizard.AbstractWizardProvider;
import net.ui.eclipse.wizard.IReflectWizardPageControlHelper;
import net.ui.model.constlist.ListData;
import net.ui.model.constlist.ListDataContainer;

import org.apache.commons.lang.ArrayUtils;
import org.eclipse.swt.widgets.Control;

import com.ourteam.app.modelbase.ui.AbstractBusinessObjectPropertyMappingConfigComposite;
import com.ourteam.app.modelbase.ui.ModelPackageSearchComposite;
import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;
import com.ourteam.modelbase.domain.BusinessPackageBean;
import com.ourteam.modelbase.domain.BusinessPackageTypeEnum;
import com.ourteam.modelbase.domain.ObjectPropertyBean;
import com.ourteam.modelbase.domain.ObjectPropertyTypeEnum;
import com.ourteam.modelbase.domain.ObjectRelationAttrBean;
import com.ourteam.modelbase.domain.ObjectRelationAttrTypeEnum;
import com.ourteam.modelbase.domain.ObjectRelationBean;
import com.ourteam.modelbase.domain.ObjectRelationTypeEnum;

abstract public class AbstractGenBusinessObjectWizardProvider extends
		AbstractAddModelObjectWizardProvider<BusinessObjectBean> {

	private BusinessObjectBean businessObject;

	private ModelPackageSearchCompositeHelper modelPackageSearchCompositeHelper;

	private AbstractBusinessObjectPropertyMappingConfigComposite propertyMappingConfigComposite;

	private BusinessPropertyMappingDataModel[] propertyMappingDataModels;

	public AbstractGenBusinessObjectWizardProvider(BusinessObjectBean daoObject) {
		super();
		this.businessObject = daoObject;
	}

	abstract protected BusinessObjectTypeEnum getBusinessObjectTypeEnum();

	abstract protected BusinessPackageTypeEnum getBusinessPackageTypeEnum();

	@Override
	protected BusinessObjectBean getBusinessObjectDataModel() {
		BusinessObjectBean businessObjBean = new BusinessObjectBean();

		businessObjBean.setType(getBusinessObjectTypeEnum().getName());

		String name = this.businessObject.getName();

		StringBuffer nameBuffer = new StringBuffer();

		nameBuffer.append(convertBusinessName(name));

		businessObjBean.setName(nameBuffer.toString());

		try {
			ObjectPropertyBean[] persistentObjectPropertyBeans = getBusinessObjectService()
					.getBusinessObjectProperties(
							this.businessObject.getBusinessObjectId());

			ListDataContainer persistentDataTypeToJavaType = UIConfigFactory
					.getInstance().getListDataConfig(
							"PersistentDataTypeToJavaType");

			propertyMappingDataModels = new BusinessPropertyMappingDataModel[persistentObjectPropertyBeans.length];

			for (int i = 0; i < persistentObjectPropertyBeans.length; i++) {
				ObjectPropertyBean objectPropertyBean = persistentObjectPropertyBeans[i];

				propertyMappingDataModels[i] = new BusinessPropertyMappingDataModel();
				
				propertyMappingDataModels[i]
						.setMappedPropertyName(objectPropertyBean.getName()
								+ ":" + objectPropertyBean.getDataType());

				propertyMappingDataModels[i]
						.setPropertyName(convertPropertyName(objectPropertyBean
								.getName()));

				propertyMappingDataModels[i].setDescription(objectPropertyBean
						.getDescription());

				propertyMappingDataModels[i]
						.setMappedProperty(objectPropertyBean);

				if (this.businessObject.getType().equals(
						BusinessObjectTypeEnum.PERSISTENT.getName())
						&& getBusinessObjectTypeEnum().equals(
								BusinessObjectTypeEnum.DAO)) {
					for (Iterator<ListData> iterator = persistentDataTypeToJavaType
							.iterator(); iterator.hasNext();) {
						ListData listData = iterator.next();
						if (listData.getData().equals(
								objectPropertyBean.getDataType())) {
							propertyMappingDataModels[i].setDataType(listData
									.getLabel());
							break;
						}

					}
				} else {
					propertyMappingDataModels[i].setDataType(objectPropertyBean
							.getDataType());
				}

				propertyMappingDataModels[i].setPrimaryKey(objectPropertyBean
						.getIsPrimaryProperty());

				propertyMappingDataModels[i].setReadable("true");

				propertyMappingDataModels[i].setWritable("true");
			}

		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		return businessObjBean;
	}

	@Override
	protected void addBusinessObject(BusinessObjectBean businessObject)
			throws Exception {

		businessObject.setPackageId(modelPackageSearchCompositeHelper
				.getSelectedItems().get(0).getBusinessPackageId());

		getBusinessObjectService().addNewBusinessObject(businessObject);

		ObjectRelationBean mappingBean = new ObjectRelationBean();

		mappingBean.setObjectId(businessObject.getBusinessObjectId());

		mappingBean.setRelatedObjectId(this.businessObject
				.getBusinessObjectId());

		List<ObjectPropertyBean> propertyList = new ArrayList<ObjectPropertyBean>();

		List<ObjectRelationAttrBean> propertyRelatedList = new ArrayList<ObjectRelationAttrBean>();

		List<BusinessPropertyMappingDataModel> slectedPropertyMappings = this.propertyMappingConfigComposite
				.getTableComposite().getSelectedDataList();

		ObjectPropertyTypeEnum propertyTypeEnum = null;

		if (getBusinessObjectTypeEnum().equals(BusinessObjectTypeEnum.DAO)) {
			propertyTypeEnum = ObjectPropertyTypeEnum.BUSINESS_PROPERTY;
			mappingBean.setRelateType(ObjectRelationTypeEnum.MAPPED.getName());

		} else if (getBusinessObjectTypeEnum().equals(
				BusinessObjectTypeEnum.JAVA_CLASS)) {
			propertyTypeEnum = ObjectPropertyTypeEnum.BEAN_PROPERTY;
			mappingBean.setRelateType(ObjectRelationTypeEnum.COMPOUNDED
					.getName());

		}

		for (Iterator<BusinessPropertyMappingDataModel> iterator = slectedPropertyMappings
				.iterator(); iterator.hasNext();) {
			BusinessPropertyMappingDataModel daoPropertyMappingDataModel = (BusinessPropertyMappingDataModel) iterator
					.next();

			ObjectPropertyBean propertyBean = new ObjectPropertyBean();

			propertyBean.setObjectId(businessObject.getBusinessObjectId());

			propertyBean.setName(daoPropertyMappingDataModel.getPropertyName());

			propertyBean.setDataType(daoPropertyMappingDataModel.getDataType());

			propertyBean.setWritable(daoPropertyMappingDataModel.getWritable());

			propertyBean.setReadable(daoPropertyMappingDataModel.getReadable());

			propertyBean.setDescription(daoPropertyMappingDataModel
					.getDescription());

			if (propertyTypeEnum != null) {
				propertyBean.setPropertyKind(propertyTypeEnum.getName());

				if (propertyTypeEnum
						.equals(ObjectPropertyTypeEnum.BUSINESS_PROPERTY)) {
					propertyBean
							.setIsPrimaryProperty(daoPropertyMappingDataModel
									.getPrimaryKey());
				}
			}

			daoPropertyMappingDataModel.setProperty(propertyBean);

			propertyList.add(propertyBean);
		}

		getBusinessObjectService().addNewBusinessObjectProperties(
				(ObjectPropertyBean[]) propertyList
						.toArray(new ObjectPropertyBean[propertyList.size()]));

		for (Iterator<BusinessPropertyMappingDataModel> iterator = slectedPropertyMappings
				.iterator(); iterator.hasNext();) {
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

		getBusinessObjectService().addBusinessObjectRelations(
				new ObjectRelationBean[] { mappingBean });

	}

	abstract protected String convertBusinessName(String name);

	abstract protected String convertPropertyName(String name);

	@Override
	protected Object getReflectObject(Control control) {
		if (control instanceof ModelPackageSearchComposite) {
			return modelPackageSearchCompositeHelper = new ModelPackageSearchCompositeHelper(
					this);
		} else if (control instanceof AbstractBusinessObjectPropertyMappingConfigComposite) {
			return new BusinessPropertyMappingConfigCompositeHelper();
		} else {
			return super.getReflectObject(control);
		}
	}

	public class ModelPackageSearchCompositeHelper
			extends
			AbstractSerachWizardPageControlHelper<BusinessPackageBean, ModelPackageSearchComposite> {

		public ModelPackageSearchCompositeHelper(
				AbstractWizardProvider wizardProvider) {
			super(wizardProvider);
		}

		@Override
		public void doInitSearchConfig(ModelPackageSearchComposite control) {

			control.setPackageTypeEnums(new BusinessPackageTypeEnum[] { getBusinessPackageTypeEnum() });

		}

	}

	public class BusinessPropertyMappingConfigCompositeHelper
			implements
			IReflectWizardPageControlHelper<AbstractBusinessObjectPropertyMappingConfigComposite> {

		@Override
		public void doNextWizardPageControl(
				AbstractBusinessObjectPropertyMappingConfigComposite control) {

		}

		@Override
		public boolean canFlipToNextPageControl(
				AbstractBusinessObjectPropertyMappingConfigComposite control) {
			return true;
		}

		@Override
		public void onActiveWizardPageControlChanged(
				AbstractBusinessObjectPropertyMappingConfigComposite control) {

		}

		@Override
		public void initWizardPageControl(
				AbstractBusinessObjectPropertyMappingConfigComposite control) {
			propertyMappingConfigComposite = control;

			if (ArrayUtils.isNotEmpty(propertyMappingDataModels)) {
				propertyMappingConfigComposite.getTableComposite().setDataList(
						propertyMappingDataModels);

				// propertyMappingConfigComposite.getTableComposite().selectAll();

			}
		}

	}

}
