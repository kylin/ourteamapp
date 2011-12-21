package com.ourteam.app.modelbase.utils;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ourteam.modelbase.domain.BusinessObjectActionBean;
import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;
import com.ourteam.modelbase.domain.BusinessPackageBean;
import com.ourteam.modelbase.domain.ObjectActionEnumType;
import com.ourteam.modelbase.domain.ObjectPropertyBean;
import com.ourteam.modelbase.domain.ObjectRelationAttrBean;
import com.ourteam.modelbase.domain.ObjectRelationBean;
import com.ourteam.modelbase.domain.ObjectRelationTypeEnum;
import com.ourteam.modelbase.domain.ServiceFunctionBean;
import com.ourteam.modelbase.service.BusinessObjectServiceFactory;
import com.ourteam.modelbase.service.BusinessPackageServiceFactory;
import com.ourteam.modelbase.service.IBusinessObjectService;
import com.ourteam.modelbase.service.IBusinessPackageService;

public class BusinessObjectHelper {
	/**
	 * Logger for this class
	 */
	private static final Log logger = LogFactory
			.getLog(BusinessObjectHelper.class);

	private static final IBusinessPackageService BUSINESS_PACKAGE_SERVICE = BusinessPackageServiceFactory
			.getBusinessPackageService();

	private static final IBusinessObjectService BUSINESS_OBJECT_SERVICE = BusinessObjectServiceFactory
			.getBusinessObjectService();

	private BusinessPackageBean businessPackage;

	private BusinessObjectBean businessObject;

	private ObjectRelationBean mappedPersistentRelation;

	private ObjectRelationBean extendRelation;

	private ObjectRelationBean[] compositeRelations;

	private ObjectRelationBean[] relatedViewRelations;

	private ObjectRelationBean[] relatedOperationRelations;

	private ObjectRelationBean[] serviceDependRelations;

	private ObjectPropertyBean[] properties;

	private ObjectPropertyBean[] primaryProperties;

	private BusinessObjectActionBean[] queryActions;

	private BusinessObjectActionBean[] createActions;

	private BusinessObjectActionBean[] deleteActions;

	private BusinessObjectActionBean[] updateActions;

	private ServiceFunctionBean[] serviceMethods;

	public BusinessObjectHelper getHelper(long businessObjectId) {

		try {
			return new BusinessObjectHelper(
					BUSINESS_OBJECT_SERVICE
							.getBusinessObjectById(businessObjectId));
		} catch (Exception e) {
			logger.error("getBusinessObject Error", e);
			throw new RuntimeException(e);
		}

	}

	public BusinessObjectHelper(BusinessObjectBean businessObject) {
		super();
		this.businessObject = businessObject;
		initData();
	}

	protected void initData() {
		try {

			long businessObjectId = this.businessObject.getBusinessObjectId();

			businessPackage = BUSINESS_PACKAGE_SERVICE
					.getBusinessPackageById(this.businessObject.getPackageId());

			properties = BUSINESS_OBJECT_SERVICE
					.getBusinessObjectProperties(businessObjectId);

			List<ObjectPropertyBean> primaryPropertyList = new ArrayList<ObjectPropertyBean>();

			for (int i = 0; i < properties.length; i++) {
				ObjectPropertyBean propertyBean = properties[i];
				if (BooleanUtils.toBoolean(propertyBean.getIsPrimaryProperty()) == true) {
					primaryPropertyList.add(propertyBean);
				}
			}

			this.primaryProperties = primaryPropertyList
					.toArray(new ObjectPropertyBean[primaryPropertyList.size()]);

			extendRelation = BUSINESS_OBJECT_SERVICE
					.getBusinessObjectExtension(businessObjectId);

			if (this.businessObject.getType().equals(
					BusinessObjectTypeEnum.DAO.getName())) {

				mappedPersistentRelation = BUSINESS_OBJECT_SERVICE
						.getBusinessObjectMappedPersistentObject(businessObjectId);

				if (mappedPersistentRelation != null) {

					initRelationProperties(new ObjectRelationBean[] { mappedPersistentRelation });

				}

				this.relatedOperationRelations = BUSINESS_OBJECT_SERVICE
						.getBusinessObjectRelatedBusinessObjects(
								businessObjectId,
								ObjectRelationTypeEnum.RELATED_OPERATION);

				initRelationProperties(this.relatedOperationRelations);

				this.relatedViewRelations = BUSINESS_OBJECT_SERVICE
						.getBusinessObjectRelatedBusinessObjects(
								businessObjectId,
								ObjectRelationTypeEnum.RELATED_VIEW);

				initRelationProperties(this.relatedViewRelations);

				this.queryActions = BUSINESS_OBJECT_SERVICE
						.getBusinessObjectActions(businessObjectId,
								ObjectActionEnumType.QUERY);

				this.createActions = BUSINESS_OBJECT_SERVICE
						.getBusinessObjectActions(businessObjectId,
								ObjectActionEnumType.CREATE);

				this.deleteActions = BUSINESS_OBJECT_SERVICE
						.getBusinessObjectActions(businessObjectId,
								ObjectActionEnumType.DELETE);

				this.updateActions = BUSINESS_OBJECT_SERVICE
						.getBusinessObjectActions(businessObjectId,
								ObjectActionEnumType.UPDATE);

			} else if (this.businessObject.getType().equals(
					BusinessObjectTypeEnum.JAVA_CLASS.getName())) {
				this.compositeRelations = BUSINESS_OBJECT_SERVICE
						.getBeanObjectCompoundedBusinessObjects(businessObjectId);
				initRelationProperties(this.compositeRelations);
			} else if (this.businessObject.getType().equals(
					BusinessObjectTypeEnum.SERVICE.getName())) {

				this.serviceMethods = BUSINESS_OBJECT_SERVICE
						.getServiceFunctions(businessObjectId);

				for (int i = 0; i < this.serviceMethods.length; i++) {
					ServiceFunctionBean functionBean = this.serviceMethods[i];
					functionBean.setInputParameters(BUSINESS_OBJECT_SERVICE
							.getServiceInputParameters(functionBean
									.getObjectFunctionId()));

					functionBean.setOutPutParameter(BUSINESS_OBJECT_SERVICE
							.getServiceOutputParameter(functionBean
									.getObjectFunctionId()));
				}

				this.serviceDependRelations = BUSINESS_OBJECT_SERVICE
						.getServiceObjectDependedBusinessObjects(businessObjectId);

			}

		} catch (Exception e) {
			logger.error("initData Error", e);
		}
	}

	protected void initRelationProperties(
			ObjectRelationBean[] objectRelationBeans) throws Exception {

		for (int i = 0; i < objectRelationBeans.length; i++) {
			ObjectRelationBean objectRelationBean = objectRelationBeans[i];
			objectRelationBean.setRelationAttrBeans(BUSINESS_OBJECT_SERVICE
					.getBusinessObjectRelatedProperties(objectRelationBean
							.getObjectRelationId()));
		}

	}

	public BusinessPackageBean getBusinessPackage() {
		return businessPackage;
	}

	public BusinessObjectBean getBusinessObject() {
		return businessObject;
	}

	public ObjectRelationBean getMappedPersistentRelation() {
		return mappedPersistentRelation;
	}

	public ObjectRelationBean getExtendRelation() {
		return extendRelation;
	}

	public ObjectRelationBean[] getRelatedViewRelations() {
		return relatedViewRelations;
	}

	public ObjectRelationBean[] getRelatedOperationRelations() {
		return relatedOperationRelations;
	}

	public ObjectRelationBean[] getCompositeRelations() {
		return compositeRelations;
	}

	public ObjectPropertyBean[] getProperties() {
		return properties;
	}

	public ObjectPropertyBean[] getPrimaryProperties() {
		return primaryProperties;
	}

	public BusinessObjectActionBean[] getQueryActions() {
		return queryActions;
	}

	public BusinessObjectActionBean[] getCreateActions() {
		return createActions;
	}

	public BusinessObjectActionBean[] getDeleteActions() {
		return deleteActions;
	}

	public BusinessObjectActionBean[] getUpdateActions() {
		return updateActions;
	}

	public ServiceFunctionBean[] getServiceMethods() {
		return serviceMethods;
	}

	public ObjectRelationBean[] getServiceDependRelations() {
		return serviceDependRelations;
	}

	public boolean isPropertyMapped(ObjectPropertyBean propertyBean) {

		boolean flag = false;

		ObjectRelationAttrBean[] relationAttrBeans = this.mappedPersistentRelation
				.getRelationAttrBeans();

		for (int i = 0; i < relationAttrBeans.length; i++) {
			ObjectRelationAttrBean objectRelationAttrBean = relationAttrBeans[i];
			if (objectRelationAttrBean.getPropertyId() == propertyBean
					.getObjectPropertyId()) {
				flag = true;
				break;
			}
		}

		for (int i = 0; i < this.relatedViewRelations.length; i++) {
			ObjectRelationBean objectRelationBean = this.relatedViewRelations[i];
			relationAttrBeans = objectRelationBean.getRelationAttrBeans();

			for (int j = 0; j < relationAttrBeans.length; j++) {
				ObjectRelationAttrBean objectRelationAttrBean = relationAttrBeans[j];
				if (objectRelationAttrBean.getPropertyId() == propertyBean
						.getObjectPropertyId()) {
					flag = true;
					break;
				}
			}
		}

		if (ArrayUtils.isNotEmpty(this.compositeRelations)) {
			for (int i = 0; i < this.compositeRelations.length; i++) {
				ObjectRelationBean objectRelationBean = this.compositeRelations[i];
				relationAttrBeans = objectRelationBean.getRelationAttrBeans();

				for (int j = 0; j < relationAttrBeans.length; j++) {
					ObjectRelationAttrBean objectRelationAttrBean = relationAttrBeans[j];
					if (objectRelationAttrBean.getPropertyId() == propertyBean
							.getObjectPropertyId()) {
						flag = true;
						break;
					}
				}
			}
		}

		return flag;
	}
}
