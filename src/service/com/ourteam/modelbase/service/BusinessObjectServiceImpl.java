package com.ourteam.modelbase.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.dao.BaseQueryBean;
import net.dao.IDataPopulateCallback;

import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.enums.EnumUtils;
import org.apache.ddlutils.model.Column;
import org.apache.ddlutils.model.Table;

import com.ourteam.modelbase.dao.BusinessObject;
import com.ourteam.modelbase.dao.BusinessObjectActionDAOQueryBean;
import com.ourteam.modelbase.dao.BusinessObjectDAOQueryBean;
import com.ourteam.modelbase.dao.BusinessPackage;
import com.ourteam.modelbase.dao.IBusinessObjectActionDAO;
import com.ourteam.modelbase.dao.IBusinessObjectDAO;
import com.ourteam.modelbase.dao.IObjectPropertyDAO;
import com.ourteam.modelbase.dao.IObjectRelationDAO;
import com.ourteam.modelbase.dao.IPersistentPropertyConstValueDAO;
import com.ourteam.modelbase.dao.IServiceFunctionDAO;
import com.ourteam.modelbase.dao.IServiceParameterDAO;
import com.ourteam.modelbase.dao.ObjectProperty;
import com.ourteam.modelbase.dao.ObjectPropertyDAOQueryBean;
import com.ourteam.modelbase.dao.ObjectRelation;
import com.ourteam.modelbase.dao.ObjectRelationAttr;
import com.ourteam.modelbase.dao.ObjectRelationAttrDAOQueryBean;
import com.ourteam.modelbase.dao.ObjectRelationDAOQueryBean;
import com.ourteam.modelbase.dao.ObjectRelationDAOQueryBean.Criteria;
import com.ourteam.modelbase.dao.PersistentPropertyConstValue;
import com.ourteam.modelbase.dao.PersistentPropertyConstValueDAOQueryBean;
import com.ourteam.modelbase.dao.ServiceFunction;
import com.ourteam.modelbase.dao.ServiceFunctionDAOQueryBean;
import com.ourteam.modelbase.dao.ServiceParameter;
import com.ourteam.modelbase.dao.ServiceParameterDAOQueryBean;
import com.ourteam.modelbase.domain.BusinessObjectActionBean;
import com.ourteam.modelbase.domain.BusinessObjectBean;
import com.ourteam.modelbase.domain.BusinessObjectTypeEnum;
import com.ourteam.modelbase.domain.CustomDataObjectStatusEnum;
import com.ourteam.modelbase.domain.ObjectActionEnumType;
import com.ourteam.modelbase.domain.ObjectPropertyBean;
import com.ourteam.modelbase.domain.ObjectPropertyTypeEnum;
import com.ourteam.modelbase.domain.ObjectRelationAttrBean;
import com.ourteam.modelbase.domain.ObjectRelationAttrTypeEnum;
import com.ourteam.modelbase.domain.ObjectRelationBean;
import com.ourteam.modelbase.domain.ObjectRelationTypeEnum;
import com.ourteam.modelbase.domain.PersistentPropertyConstValueBean;
import com.ourteam.modelbase.domain.ServiceFunctionBean;
import com.ourteam.modelbase.domain.ServiceParameterBean;
import com.ourteam.modelbase.domain.ServiceParameterTypeEnum;

/**
 * ҵ�������� impl Generated Date 2010-04-28 11:26:04
 * 
 * @author $Auto Gen
 */
public class BusinessObjectServiceImpl extends AbstractBusinessObjectService {

	/**
	 * �������ȡ��ҵ������б� impl
	 * 
	 * @param aPackageId
	 * 
	 * @param aBusinessObjectType
	 * 
	 * @param aTransaction
	 * @param aContext
	 * @throws Exception
	 */
	protected com.ourteam.modelbase.domain.BusinessObjectBean[] doGetBusinessObjectsByType(
			final long aPackageId,
			final BusinessObjectTypeEnum aBusinessObjectType)
			throws Exception {

		BusinessObjectDAOQueryBean queryBean = new BusinessObjectDAOQueryBean();

		queryBean.createCriteria()
				.andPackageIdEqualTo(Long.valueOf(aPackageId))
				.andTypeEqualTo(aBusinessObjectType.getName());

		queryBean.setSortProperty(IBusinessObjectDAO.Name);

		return queryBusinessObjects(queryBean);

	}

	@Override
	protected ObjectPropertyBean[] doGetBusinessObjectProperties(long aObjectId)
			throws Exception {

		ObjectPropertyDAOQueryBean queryBean = new ObjectPropertyDAOQueryBean();

		queryBean.createCriteria().andObjectIdEqualTo(Long.valueOf(aObjectId));

		queryBean.setSortProperty(IObjectPropertyDAO.IsPrimaryProperty,false);
		queryBean.setSortProperty(IObjectPropertyDAO.OrderIndex);

		return queryBusinessProperties(queryBean);
	}

	protected Boolean checkPropertyRequired(ObjectProperty aPropertyBean) {
		if (StringUtils.isEmpty(aPropertyBean.getType())) {
			return Boolean.FALSE;
		} else {
			String[] propertyType = StringUtils.split(aPropertyBean.getType(),
					"|");

			String requireType = null;

			if (propertyType.length == 1) {
				requireType = propertyType[0];
			} else {
				requireType = propertyType[1];
			}

			if ("NOT_ALLOW_NULL".equalsIgnoreCase(requireType)) {
				return Boolean.TRUE;
			} else {
				return Boolean.FALSE;
			}

		}

	}

	protected Boolean checkWritable(ObjectProperty aPropertyBean) {
		if (StringUtils.isEmpty(aPropertyBean.getType())) {
			return Boolean.FALSE;
		} else {
			String[] propertyType = StringUtils.split(aPropertyBean.getType(),
					"|");

			String requireType = propertyType[0];

			if ("GET_SET_TYPE".equalsIgnoreCase(requireType)
					|| "SET_TYPE".equalsIgnoreCase(requireType)) {
				return Boolean.TRUE;
			} else {
				return Boolean.FALSE;
			}

		}

	}

	protected Boolean checkReadable(ObjectProperty aPropertyBean) {
		if (StringUtils.isEmpty(aPropertyBean.getType())) {
			return Boolean.FALSE;
		} else {
			String[] propertyType = StringUtils.split(aPropertyBean.getType(),
					"|");

			String requireType = propertyType[0];

			if ("GET_SET_TYPE".equalsIgnoreCase(requireType)
					|| "GET_TYPE".equalsIgnoreCase(requireType)) {
				return Boolean.TRUE;
			} else {
				return Boolean.FALSE;
			}

		}

	}

	@Override
	protected ServiceFunctionBean[] doGetServiceFunctions(long aServiceId)
			throws Exception {

		ServiceFunctionDAOQueryBean queryBean = new ServiceFunctionDAOQueryBean();

		queryBean.createCriteria().andObjectIdEqualTo(Long.valueOf(aServiceId));

		queryBean.setSortProperty(IServiceFunctionDAO.Name);

		return ServiceFunctionBean.toArray(serviceFunctionDao
				.queryServiceFunction(queryBean));
	}

	@Override
	protected void doImportPersistentObjects(long aPersistentPackageId,
			Table[] aTables) throws Exception {

		for (int i = 0; i < aTables.length; i++) {
			Table table = aTables[i];

			String tableName = table.getName().toUpperCase();

			BusinessObjectDAOQueryBean queryBean = new BusinessObjectDAOQueryBean();

			queryBean
					.createCriteria()
					.andPackageIdEqualTo(aPersistentPackageId)
					.andNameEqualTo(tableName)
					.andTypeEqualTo(BusinessObjectTypeEnum.PERSISTENT.getName());

			BusinessObject[] businessObject = businessObjectDao
					.queryBusinessObject(queryBean);

			if (ArrayUtils.isEmpty(businessObject)) {
				BusinessObject persistent = new BusinessObject();

				persistent.setType(BusinessObjectTypeEnum.PERSISTENT.getName());

				persistent.setName(tableName);

				persistent.setDescription(table.getDescription());

				persistent.setPackageId(aPersistentPackageId);

				businessObjectDao.insertBusinessObject(persistent);

				Column[] columns = table.getColumns();

				ObjectProperty[] objectProperties = new ObjectProperty[columns.length];

				for (int j = 0; j < columns.length; j++) {
					Column column = columns[j];

					ObjectProperty property = new ObjectProperty();

					property.setObjectId(persistent.getBusinessObjectId());

					property.setPropertyKind(ObjectPropertyTypeEnum.PERSISTENT_PROPERTY
							.getName());

					property.setName(column.getName().toUpperCase());

					property.setDescription(column.getDescription());

					property.setOrderIndex(Integer.valueOf(j));

					property.setDataType(column.getType());

					property.setDataSize(Integer.valueOf(column.getSizeAsInt()));

					property.setPrecisionSize(Integer.valueOf(column.getScale()));

					if (StringUtils.isNotBlank(column.getDefaultValue())) {
						property.setValue(column.getDefaultValue());
					}

					if (column.isAutoIncrement()) {
						property.setIsGenerate("true");
					} else {
						property.setIsGenerate("false");
					}

					if (column.isRequired()) {
						property.setIsAllowNull("false");
					} else {
						property.setIsAllowNull("true");
					}

					if (column.isPrimaryKey()) {
						property.setIsPrimaryProperty("true");
					} else {
						property.setIsPrimaryProperty("false");
					}

					objectProperties[j] = property;

				}

				objectPropertyDao.batchInsertObjectProperty(objectProperties);

			} else {
				businessObject[0].setDescription(table.getDescription());

				businessObjectDao.updateBusinessObject(businessObject[0]);

				ObjectPropertyBean[] propertyBeans = getBusinessObjectProperties(businessObject[0]
						.getBusinessObjectId());

				Map propertyMap = new HashMap();

				for (int j = 0; j < propertyBeans.length; j++) {
					ObjectPropertyBean objectPropertyBean = propertyBeans[j];
					propertyMap.put(objectPropertyBean.getName().toUpperCase(),
							objectPropertyBean.convertToObjectProperty());
				}

				Column[] columns = table.getColumns();

				ObjectProperty property = null;

				List addList = new ArrayList();

				List updateList = new ArrayList();

				for (int j = 0; j < columns.length; j++) {
					Column column = columns[j];

					if (propertyMap.containsKey(column.getName().toUpperCase())) {
						property = (ObjectProperty) propertyMap.get(column
								.getName().toUpperCase());

						updateList.add(property);

					} else {
						property = new ObjectProperty();

						property.setObjectId(businessObject[0]
								.getBusinessObjectId());

						property.setPropertyKind(ObjectPropertyTypeEnum.PERSISTENT_PROPERTY
								.getName());

						property.setName(column.getName().toUpperCase());

						addList.add(property);
					}

					property.setOrderIndex(j + 1);

					property.setDescription(column.getDescription());

					property.setDataType(column.getType());

					property.setDataSize(Integer.valueOf(column.getSizeAsInt()));

					property.setPrecisionSize(Integer.valueOf(column.getScale()));

					if (StringUtils.isNotBlank(column.getDefaultValue())) {
						property.setValue(column.getDefaultValue());
					}

					if (column.isAutoIncrement()) {
						property.setIsGenerate("true");
					} else {
						property.setIsGenerate("false");
					}

					if (column.isRequired()) {
						property.setIsAllowNull("false");
					} else {
						property.setIsAllowNull("true");
					}

					if (column.isPrimaryKey()) {
						property.setIsPrimaryProperty("true");
					} else {
						property.setIsPrimaryProperty("false");
					}

				}

				if (addList.isEmpty() == false) {
					objectPropertyDao
							.batchInsertObjectProperty((ObjectProperty[]) addList
									.toArray(new ObjectProperty[addList.size()]));
				}

				if (updateList.isEmpty() == false) {
					objectPropertyDao
							.batchUpdateObjectProperty((ObjectProperty[]) updateList
									.toArray(new ObjectProperty[updateList
											.size()]));
				}

			}

		}

	}

	@Override
	protected BusinessObjectBean[] doGetPersistentObjectMappedBusinessObjects(
			long aPersistentObjectId) throws Exception {

		ObjectRelationDAOQueryBean queryBean = new ObjectRelationDAOQueryBean();

		queryBean
				.createCriteria()
				.andRelateTypeEqualTo(ObjectRelationTypeEnum.MAPPED.getName())
				.andRelatedObjectIdEqualTo(Long.valueOf(aPersistentObjectId))
				.andObjectIdEqualToForeignKey(
						IBusinessObjectDAO.BusinessObjectId);

		BusinessObjectDAOQueryBean objectDAOQueryBean = new BusinessObjectDAOQueryBean();

		objectDAOQueryBean.addJoin(IObjectRelationDAO.EntityName, queryBean,
				BaseQueryBean.INNER_JOIN);

		return queryBusinessObjects(objectDAOQueryBean);

	}

	@Override
	protected PersistentPropertyConstValueBean[] doGetPersistentPropertyConstValues(
			long aPersistentPropertyId) throws Exception {

		ObjectProperty property = objectPropertyDao
				.findObjectPropertyById(aPersistentPropertyId);

		BusinessObject object = businessObjectDao
				.findBusinessObjectById(property.getObjectId());

		PersistentPropertyConstValueDAOQueryBean queryBean = new PersistentPropertyConstValueDAOQueryBean();

		queryBean.createCriteria().andTableNameEqualTo(object.getName())
				.andColumnNameEqualTo(property.getName());

		queryBean.setSortProperty(IPersistentPropertyConstValueDAO.FieldOrder);

		return PersistentPropertyConstValueBean
				.toArray(persistentPropertyConstValueDao
						.queryPersistentPropertyConstValue(queryBean));
	}

	@Override
	protected void doAddPersistentPropertyConstValue(
			PersistentPropertyConstValueBean aPersistentPropertyConstValue)
			throws Exception {

		PersistentPropertyConstValue propertyConstValue = aPersistentPropertyConstValue
				.convertToPersistentPropertyConstValue();

		if (persistentPropertyConstValueDao.checkIsUnique(propertyConstValue) == false) {
			throw new Exception("message.notUnique");
		}

		persistentPropertyConstValueDao
				.insertPersistentPropertyConstValue(propertyConstValue);
	}

	@Override
	protected BusinessObjectBean doGetBusinessObjectById(long aObjectId)
			throws Exception {
		BusinessObject businessObject = businessObjectDao
				.findBusinessObjectById(aObjectId);

		if (businessObject == null) {
			return null;
		} else {
			return new BusinessObjectBean(businessObject);
		}

	}

	@Override
	protected void doRemovePersistentPropertyConstValue(long[] aConstvalueIds)
			throws Exception {

		if (ArrayUtils.isEmpty(aConstvalueIds)) {
			return;
		}

		PersistentPropertyConstValueDAOQueryBean queryBean = new PersistentPropertyConstValueDAOQueryBean();

		queryBean.createCriteria().andRowIdIn(
				ArrayUtils.toObject(aConstvalueIds));

		persistentPropertyConstValueDao
				.deletePersistentPropertyConstValue(queryBean);
	}

	@Override
	protected void doModifyBusinessObject(BusinessObjectBean aBusinessObject)
			throws Exception {

		BusinessObject businessObject = aBusinessObject
				.convertToBusinessObject();

		BusinessObjectTypeEnum objectTypeEnum = (BusinessObjectTypeEnum) EnumUtils
				.getEnum(BusinessObjectTypeEnum.class, businessObject.getType());

		if (BusinessObjectTypeEnum.ENUM.equals(objectTypeEnum)) {
			if (BooleanUtils.isTrue(aBusinessObject.getValuedEnum())) {
				businessObject.setGenerateOption(Long.valueOf(1));
			} else {
				businessObject.setGenerateOption(Long.valueOf(0));
			}
		}

		if (BusinessObjectTypeEnum.DAO.getName().equals(
				businessObject.getType())) {

			BusinessObject originallyBusinessObject = this.businessObjectDao
					.findBusinessObjectById(businessObject
							.getBusinessObjectId());

			BusinessObjectDAOQueryBean queryBean = new BusinessObjectDAOQueryBean();

			queryBean
					.createCriteria()
					.andPackageIdEqualTo(
							originallyBusinessObject.getPackageId())
					.andNameEqualTo(
							originallyBusinessObject.getName() + "DAOQueryBean")
					.andTypeEqualTo(
							BusinessObjectTypeEnum.DAO_QUERY_BEAN.getName());

			BusinessObject[] daoQueryBean = this.businessObjectDao
					.queryBusinessObject(queryBean);

			if (ArrayUtils.isNotEmpty(daoQueryBean)) {
				daoQueryBean[0].setPackageId(businessObject.getPackageId());
				daoQueryBean[0].setName(businessObject.getName()
						+ "DAOQueryBean");
				this.businessObjectDao.updateBusinessObject(daoQueryBean[0]);
			}
		}

		ObjectPropertyDAOQueryBean objectPropertyDAOQueryBean = new ObjectPropertyDAOQueryBean();

		objectPropertyDAOQueryBean.createCriteria()
				.andReferenceObjectIdEqualTo(
						aBusinessObject.getBusinessObjectId());

		ObjectProperty objectProperty = new ObjectProperty();

		StringBuffer dataTypeName = new StringBuffer();

		if (aBusinessObject.getPackageId() != 0) {
			dataTypeName.append(aBusinessObject.getPackageName()).append(".");
		}

		dataTypeName.append(aBusinessObject.getName());

		objectProperty.setDataType(dataTypeName.toString());

		objectPropertyDao.updateObjectProperty(objectProperty,
				objectPropertyDAOQueryBean);

		ServiceParameter serviceParameterBean = new ServiceParameter();

		serviceParameterBean.setDataType(dataTypeName.toString());

		ServiceParameterDAOQueryBean parameterDAOQueryBean = new ServiceParameterDAOQueryBean();

		parameterDAOQueryBean.createCriteria().andReferenceObjectIdEqualTo(
				aBusinessObject.getBusinessObjectId());

		serviceParameterDao.updateServiceParameter(serviceParameterBean,
				parameterDAOQueryBean);

		businessObjectDao.updateBusinessObject(businessObject);

	}

	@Override
	protected void doModifyBusinessObjectProperty(
			ObjectPropertyBean aObjectProperty) throws Exception {

		if (aObjectProperty.getReferenceObjectId() != null
				&& aObjectProperty.getReferenceObjectId().longValue() != 0) {

			ObjectRelationDAOQueryBean queryBean = new ObjectRelationDAOQueryBean();

			queryBean
					.createCriteria()
					.andObjectIdEqualTo(aObjectProperty.getObjectId())
					.andRelateTypeEqualTo(
							ObjectRelationTypeEnum.REFERENCE.getName())
					.andRelatedObjectIdEqualTo(
							aObjectProperty.getReferenceObjectId());

			ObjectRelation objectRelation = new ObjectRelation();

			objectRelation.setObjectId(aObjectProperty.getObjectId());

			objectRelation.setRelatedObjectId(aObjectProperty
					.getReferenceObjectId());

			objectRelation.setRelateType(ObjectRelationTypeEnum.REFERENCE
					.getName());

			this.objectRelationDao.synchronizeObjectRelation(
					new ObjectRelation[] { objectRelation }, queryBean);

		}

		objectPropertyDao.updateObjectProperty(aObjectProperty
				.convertToObjectProperty());

	}

	@Override
	protected int doQueryBusinessObjectCount(
			BusinessObjectDAOQueryBean aQueryBean) throws Exception {
		return businessObjectDao.queryBusinessObjectCount(aQueryBean);
	}

	@Override
	protected com.ourteam.modelbase.domain.BusinessObjectBean[] doQueryBusinessObjects(
			BusinessObjectDAOQueryBean aQueryBean) throws Exception {

		if (aQueryBean != null && aQueryBean.getSortProperties().isEmpty()) {
			aQueryBean.setSortProperty(IBusinessObjectDAO.Type);
			aQueryBean.setSortProperty(IBusinessObjectDAO.Name);
		}

		return BusinessObjectBean.toArray(
				businessObjectDao.queryBusinessObject(aQueryBean),
				new BusinessObjectPopulateCallback());
	}

	class BusinessObjectPopulateCallback implements IDataPopulateCallback {

		@Override
		public void populate(Object aTarget, Object[] aSource) {

			BusinessObjectBean businessObjectBean = (BusinessObjectBean) aTarget;

			BusinessObject businessObject = (BusinessObject) aSource[0];

			BusinessObjectTypeEnum objectTypeEnum = (BusinessObjectTypeEnum) EnumUtils
					.getEnum(BusinessObjectTypeEnum.class,
							businessObject.getType());

			if (BusinessObjectTypeEnum.ENUM.equals(objectTypeEnum)) {
				if (businessObject.getGenerateOption() != null
						&& businessObject.getGenerateOption().intValue() == 1) {
					businessObjectBean.setValuedEnum(Boolean.TRUE);
				} else {
					businessObjectBean.setValuedEnum(Boolean.FALSE);
				}
			}

		}
	}

	protected ObjectRelationBean[] getBusinessObjectRelations(
			long aBusinessObjctId, ObjectRelationTypeEnum relationTypeEnum,
			String relationConfigType) throws Exception {

		ObjectRelationDAOQueryBean queryBean = new ObjectRelationDAOQueryBean();

		ObjectRelationDAOQueryBean.Criteria criteria = queryBean
				.createCriteria();

		criteria.andObjectIdEqualTo(Long.valueOf(aBusinessObjctId));

		if (relationTypeEnum != null) {
			criteria.andRelateTypeEqualTo(relationTypeEnum.getName());
		}

		if (StringUtils.isNotBlank(relationConfigType)) {
			criteria.andRelateConfigEqualTo(relationConfigType);
		}

		queryBean.setSortProperty(IObjectRelationDAO.RelatedBusinessObjectType);
		queryBean.setSortProperty(IObjectRelationDAO.RelatedBusinessObjectName);

		return ObjectRelationBean.toArray(objectRelationDao
				.queryObjectRelation(queryBean));
	}

	@Override
	protected ObjectRelationBean[] doGetBusinessObjectRelatedBusinessObjects(
			long aBusinessObjctId, ObjectRelationTypeEnum relationTypeEnum)
			throws Exception {

		return getBusinessObjectRelations(aBusinessObjctId, relationTypeEnum,
				null);
	}

	@Override
	protected void doAddBusinessObjectRelations(
			ObjectRelationBean[] objectRelations) throws Exception {

		ObjectRelation[] relations = new ObjectRelation[objectRelations.length];

		for (int i = 0; i < relations.length; i++) {
			relations[i] = objectRelations[i].convertToObjectRelation();
			this.objectRelationDao.insertObjectRelation(relations[i]);
		}

		List objectRelationAttrs = new ArrayList();

		for (int i = 0; i < objectRelations.length; i++) {
			ObjectRelationBean objectRelationBean = objectRelations[i];
			ObjectRelationAttrBean[] relationAttrBeans = objectRelationBean
					.getRelationAttrBeans();

			for (int j = 0; j < relationAttrBeans.length; j++) {
				ObjectRelationAttrBean objectRelationAttrBean = relationAttrBeans[j];
				objectRelationAttrBean.setObjectRelationId(relations[i]
						.getObjectRelationId());
				objectRelationAttrs.add(objectRelationAttrBean
						.convertToObjectRelationAttr());
			}
		}

		this.objectRelationAttrDao
				.batchInsertObjectRelationAttr((ObjectRelationAttr[]) objectRelationAttrs
						.toArray(new ObjectRelationAttr[objectRelationAttrs
								.size()]));

	}

	protected void removeObjectRelations(long objectId,
			long[] relatedObjectIds, ObjectRelationTypeEnum aRelationTypeEnum)
			throws Exception {

		ObjectRelationDAOQueryBean queryBean = new ObjectRelationDAOQueryBean();

		Criteria criteria = queryBean.createCriteria();

		criteria.andRelateTypeEqualTo(aRelationTypeEnum.getName());
		criteria.andObjectIdEqualTo(Long.valueOf(objectId));

		if (ArrayUtils.isNotEmpty(relatedObjectIds)) {
			criteria.andRelatedObjectIdIn(ArrayUtils.toObject(relatedObjectIds));
		}

		this.objectRelationDao.deleteObjectRelationAttr(queryBean);

		this.objectRelationDao.deleteObjectRelation(queryBean);

	}

	@Override
	protected void doRemoveBusinessObjectRelations(long[] relationIds)
			throws Exception {

		ObjectRelationDAOQueryBean queryBean = new ObjectRelationDAOQueryBean();

		queryBean.createCriteria().andObjectRelationIdIn(relationIds);

		this.objectRelationDao.deleteObjectRelation(queryBean);

		this.objectRelationDao.deleteObjectRelationAttr(queryBean);

	}

	@Override
	protected void doModifyBusinessObjectRelation(
			ObjectRelationBean objectRelationBean) throws Exception {

		this.objectRelationDao.updateObjectRelation(objectRelationBean
				.convertToObjectRelation());

		List objectRelationAttrs = new ArrayList();

		ObjectRelationAttrBean[] relationAttrBeans = objectRelationBean
				.getRelationAttrBeans();

		for (int j = 0; j < relationAttrBeans.length; j++) {
			ObjectRelationAttrBean objectRelationAttrBean = relationAttrBeans[j];
			objectRelationAttrBean.setObjectRelationId(objectRelationBean
					.getObjectRelationId());
			objectRelationAttrs.add(objectRelationAttrBean
					.convertToObjectRelationAttr());
		}

		ObjectRelationAttrDAOQueryBean queryBean = new ObjectRelationAttrDAOQueryBean();

		queryBean.createCriteria().andObjectRelationIdEqualTo(
				Long.valueOf(objectRelationBean.getObjectRelationId()));

		this.objectRelationAttrDao.synchronizeObjectRelationAttr(
				(ObjectRelationAttr[]) objectRelationAttrs
						.toArray(new ObjectRelationAttr[0]), queryBean);

	}

	@Override
	protected ObjectPropertyBean[] doQueryBusinessProperties(
			ObjectPropertyDAOQueryBean queryBean) throws Exception {

		if (queryBean == null) {

			queryBean = new ObjectPropertyDAOQueryBean();

		}

		queryBean.setSortProperty(IObjectPropertyDAO.IsPrimaryProperty, false);

		queryBean.setSortProperty(IObjectPropertyDAO.OrderIndex);

		return ObjectPropertyBean.toArray(objectPropertyDao
				.queryObjectProperty(queryBean));
	}

	@Override
	protected int doQueryBusinessPropertyCount(
			ObjectPropertyDAOQueryBean queryBean) throws Exception {

		return objectPropertyDao.queryObjectPropertyCount(queryBean);
	}

	@Override
	protected ObjectRelationAttrBean[] doGetBusinessObjectRelatedProperties(
			long relationId) throws Exception {

		ObjectRelationAttrDAOQueryBean queryBean = new ObjectRelationAttrDAOQueryBean();

		queryBean.createCriteria().andObjectRelationIdEqualTo(
				Long.valueOf(relationId));

		return ObjectRelationAttrBean.toArray(this.objectRelationAttrDao
				.queryObjectRelationAttr(queryBean));
	}

	@Override
	protected ObjectRelationBean doGetBusinessObjectExtension(
			long businessObjectId) throws Exception {

		ObjectRelationBean[] relationViewBeans = getBusinessObjectRelations(
				businessObjectId, ObjectRelationTypeEnum.EXTEND, null);

		if (ArrayUtils.isEmpty(relationViewBeans)) {
			return null;
		} else {
			return relationViewBeans[0];
		}

	}

	@Override
	protected void doSetBusinessObjectExtension(ObjectRelationBean aRelationBean)
			throws Exception {

		ObjectRelation relation = aRelationBean.convertToObjectRelation();

		ObjectRelationDAOQueryBean queryBean = new ObjectRelationDAOQueryBean();

		queryBean.setDistinct(true);

		queryBean.createCriteria()
				.andRelateTypeEqualTo(ObjectRelationTypeEnum.EXTEND.getName())
				.andObjectIdEqualTo(Long.valueOf(relation.getObjectId()));

		ObjectRelation[] relations = this.objectRelationDao
				.queryObjectRelation(queryBean);

		if (ArrayUtils.isEmpty(relations)) {

			relation.setRelateType(ObjectRelationTypeEnum.EXTEND.getName());

			this.objectRelationDao.insertObjectRelation(relation);

		} else {
			relation.setRelateType(ObjectRelationTypeEnum.EXTEND.getName());

			this.objectRelationDao.updateObjectRelation(relations[0]);
		}

	}

	@Override
	protected void doRemoveBusinessObjectExtension(long objectId)
			throws Exception {

		removeObjectRelations(objectId, new long[0],
				ObjectRelationTypeEnum.EXTEND);

	}

	@Override
	protected ObjectRelationBean doGetBusinessObjectMappedPersistentObject(
			long aBusinessObjctId) throws Exception {
		ObjectRelationBean[] relationViewBeans = getBusinessObjectRelations(
				aBusinessObjctId, ObjectRelationTypeEnum.MAPPED, null);

		if (ArrayUtils.isEmpty(relationViewBeans)) {
			return null;
		} else {
			return relationViewBeans[0];
		}
	}

	@Override
	protected void doRemoveBusinessObjectMappedPersistentObject(long objectId)
			throws Exception {
		removeObjectRelations(objectId, new long[0],
				ObjectRelationTypeEnum.MAPPED);

	}

	@Override
	protected void doSetBusinessObjectMappedPersistentObject(
			ObjectRelationBean objectMapping) throws Exception {

		ObjectRelation relation = objectMapping.convertToObjectRelation();

		if (relation.getObjectRelationId() != 0) {
			removeBusinessObjectMappedPersistentObject(objectMapping
					.getObjectId());
			relation.setObjectRelationId(0);
		}

		relation.setRelateType(ObjectRelationTypeEnum.MAPPED.getName());

		this.objectRelationDao.insertObjectRelation(relation);

		List objectRelationAttrs = new ArrayList();

		ObjectRelationAttrBean[] relationAttrBeans = objectMapping
				.getRelationAttrBeans();

		for (int j = 0; j < relationAttrBeans.length; j++) {
			ObjectRelationAttr objectRelationAttr = relationAttrBeans[j]
					.convertToObjectRelationAttr();
			objectRelationAttr.setObjectRelationId(relation
					.getObjectRelationId());
			objectRelationAttr
					.setRelateAttrType(ObjectRelationAttrTypeEnum.MAPPED
							.getName());
			objectRelationAttrs.add(objectRelationAttr);
		}

		this.objectRelationAttrDao
				.batchInsertObjectRelationAttr((ObjectRelationAttr[]) objectRelationAttrs
						.toArray(new ObjectRelationAttr[0]));

	}

	@Override
	protected void doAddBusinessObjectAction(
			BusinessObjectActionBean businessObjectAction) throws Exception {

		this.businessObjectActionDao
				.insertBusinessObjectAction(businessObjectAction
						.convertToBusinessObjectAction());

	}

	@Override
	protected BusinessObjectActionBean[] doGetBusinessObjectActions(
			long objectId, ObjectActionEnumType actionEnumType)
			throws Exception {

		BusinessObjectActionDAOQueryBean queryBean = new BusinessObjectActionDAOQueryBean();

		BusinessObjectActionDAOQueryBean.Criteria criteria = queryBean
				.createCriteria();

		criteria.andObjectIdEqualTo(Long.valueOf(objectId));

		if (actionEnumType != null) {
			criteria.andActionEqualTo(actionEnumType.getName());
		}

		queryBean.setSortProperty(IBusinessObjectActionDAO.Action);

		queryBean.setSortProperty(IBusinessObjectActionDAO.PropertyId);

		return BusinessObjectActionBean.toArray(this.businessObjectActionDao
				.queryBusinessObjectAction(queryBean));
	}

	@Override
	protected void doModifyBusinessObjectAction(
			BusinessObjectActionBean businessObjectAction) throws Exception {

		this.businessObjectActionDao
				.updateBusinessObjectAction(businessObjectAction
						.convertToBusinessObjectAction());

	}

	@Override
	protected void doRemoveBusinessObjectActions(long[] businessObjectActionId)
			throws Exception {

		BusinessObjectActionDAOQueryBean queryBean = new BusinessObjectActionDAOQueryBean();

		queryBean.createCriteria().andObjectActionIdIn(
				ArrayUtils.toObject(businessObjectActionId));

		this.businessObjectActionDao.deleteBusinessObjectAction(queryBean);

	}

	@Override
	protected void doModifyPersistentPropertyConstValue(
			PersistentPropertyConstValueBean aPersistentPropertyConstValueBean)
			throws Exception {
		PersistentPropertyConstValue propertyConstValue = aPersistentPropertyConstValueBean
				.convertToPersistentPropertyConstValue();

		if (persistentPropertyConstValueDao.checkIsUnique(propertyConstValue) == false) {
			throw new Exception("message.notUnique");
		}

		persistentPropertyConstValueDao
				.updatePersistentPropertyConstValue(propertyConstValue);

	}

	@Override
	protected ObjectRelationAttrBean[] doGetBusinessObjectMappedProperties(
			long relationId) throws Exception {
		ObjectRelationAttrDAOQueryBean queryBean = new ObjectRelationAttrDAOQueryBean();

		queryBean.setDistinct(true);

		queryBean
				.createCriteria()
				.andObjectRelationIdEqualTo(Long.valueOf(relationId))
				.andRelateAttrTypeEqualTo(
						ObjectRelationAttrTypeEnum.MAPPED.getName());

		return ObjectRelationAttrBean.toArray(this.objectRelationAttrDao
				.queryObjectRelationAttr(queryBean));
	}

	@Override
	protected ObjectPropertyBean[] doGetBusinessObjectNotMappedProperties(
			long aObjectId) throws Exception {

		ObjectPropertyBean[] propertyBeans = doGetBusinessObjectProperties(aObjectId);

		long[] properyIds = new long[propertyBeans.length];

		List properties = new ArrayList();

		for (int i = 0; i < propertyBeans.length; i++) {
			properyIds[i] = propertyBeans[i].getObjectPropertyId();
			properties.add(propertyBeans[i]);
		}

		ObjectRelationAttrDAOQueryBean queryBean = new ObjectRelationAttrDAOQueryBean();

		queryBean.setDistinct(true);

		queryBean
				.createCriteria()
				.andPropertyIdIn(properyIds)
				.andRelateAttrTypeEqualTo(
						ObjectRelationAttrTypeEnum.MAPPED.getName());

		ObjectRelationAttr[] objectRelationAttrs = this.objectRelationAttrDao
				.queryObjectRelationAttr(queryBean);

		List removedProperties = new ArrayList();

		for (int i = 0; i < objectRelationAttrs.length; i++) {
			ObjectRelationAttr objectRelationAttr = objectRelationAttrs[i];
			int index = ArrayUtils.indexOf(properyIds,
					objectRelationAttr.getPropertyId());
			if (index >= 0) {
				removedProperties.add(properties.get(index));
			}
		}

		properties.removeAll(removedProperties);

		return (ObjectPropertyBean[]) properties
				.toArray(new ObjectPropertyBean[properties.size()]);

	}

	@Override
	protected ObjectRelationBean[] doGetBeanObjectCompoundedBusinessObjects(
			long aBeanObjectId) throws Exception {
		return getBusinessObjectRelations(aBeanObjectId,
				ObjectRelationTypeEnum.COMPOUNDED, null);
	}

	@Override
	protected ObjectRelationBean[] doGetServiceObjectDependedBusinessObjects(
			long aServiceObjectId) throws Exception {
		return getBusinessObjectRelations(aServiceObjectId,
				ObjectRelationTypeEnum.DEPENDED, null);
	}

	@Override
	protected void doModifyServiceFunction(
			ServiceFunctionBean serviceFunctionBean) throws Exception {

		serviceFunctionDao.updateServiceFunction(serviceFunctionBean
				.convertToServiceFunction());

	}

	@Override
	protected ServiceParameterBean doGetServiceOutputParameter(
			long serviceFunctionId) throws Exception {

		ServiceParameterDAOQueryBean queryBean = new ServiceParameterDAOQueryBean();

		queryBean.createCriteria()
				.andServiceFunctionIdEqualTo(serviceFunctionId)
				.andTypeEqualTo(ServiceParameterTypeEnum.OUT.getName());

		ServiceParameter[] serviceParameters = serviceParameterDao
				.queryServiceParameter(queryBean);

		if (ArrayUtils.isEmpty(serviceParameters)) {
			return null;
		} else {
			return new ServiceParameterBean(serviceParameters[0]);
		}

	}

	@Override
	protected ServiceParameterBean[] doGetServiceInputParameters(
			long serviceFunctionId) throws Exception {

		ServiceParameterDAOQueryBean queryBean = new ServiceParameterDAOQueryBean();

		queryBean.createCriteria()
				.andServiceFunctionIdEqualTo(serviceFunctionId)
				.andTypeEqualTo(ServiceParameterTypeEnum.IN.getName());

		queryBean.setSortProperty(IServiceParameterDAO.Sort);

		ServiceParameter[] serviceParameters = serviceParameterDao
				.queryServiceParameter(queryBean);

		return ServiceParameterBean.toArray(serviceParameters);
	}

	@Override
	protected void doSetServiceOutputParameter(long serviceFunctionId,
			ServiceParameterBean serviceParameterBean) throws Exception {

		ServiceParameterBean outputParameter = getServiceOutputParameter(serviceFunctionId);

		serviceParameterBean.setType(ServiceParameterTypeEnum.OUT.getName());

		serviceParameterBean.setServiceFunctionId(serviceFunctionId);

		if (outputParameter != null) {

			serviceParameterBean.setServiceParameterId(outputParameter
					.getServiceParameterId());

			serviceParameterDao.updateServiceParameter(serviceParameterBean
					.convertToServiceParameter());
		} else {
			serviceParameterDao.insertServiceParameter(serviceParameterBean
					.convertToServiceParameter());
		}

	}

	@Override
	protected void doSetServiceInputParameters(long serviceFunctionId,
			ServiceParameterBean[] serviceParameterBeans) throws Exception {

		ServiceParameter[] parameters = new ServiceParameter[serviceParameterBeans.length];

		for (int i = 0; i < serviceParameterBeans.length; i++) {
			ServiceParameterBean serviceParameterBean = serviceParameterBeans[i];
			serviceParameterBean.setServiceFunctionId(serviceFunctionId);
			serviceParameterBean.setSort(Integer.valueOf(i + 1));
			serviceParameterBean.setType(ServiceParameterTypeEnum.IN.getName());
			if (StringUtils.isBlank(serviceParameterBean.getIsArray())) {
				serviceParameterBean.setIsArray("false");
			}

			parameters[i] = serviceParameterBean.convertToServiceParameter();
		}

		ServiceParameterDAOQueryBean queryBean = new ServiceParameterDAOQueryBean();

		queryBean.createCriteria()
				.andServiceFunctionIdEqualTo(serviceFunctionId)
				.andTypeEqualTo(ServiceParameterTypeEnum.IN.getName());

		queryBean.setSortProperty(IServiceParameterDAO.Sort);

		serviceParameterDao.synchronizeServiceParameter(parameters, queryBean);

	}

	@Override
	protected void doAddNewBusinessObject(BusinessObjectBean businessObjectBean)
			throws Exception {

		if (BusinessObjectTypeEnum.DAO.getName().equals(
				businessObjectBean.getType())) {
			BusinessObject businessObject = new BusinessObject();

			businessObject.setPackageId(businessObjectBean.getPackageId());

			businessObject.setName(businessObjectBean.getName()
					+ "DAOQueryBean");

			businessObject.setType(BusinessObjectTypeEnum.DAO_QUERY_BEAN
					.getName());

			this.businessObjectDao.insertBusinessObject(businessObject);
		}

		this.businessObjectDao.insertBusinessObject(businessObjectBean
				.convertToBusinessObject());

	}

	@Override
	protected void doAddNewBusinessObjectProperties(
			ObjectPropertyBean[] objectPropertyBeans) throws Exception {

		if (ArrayUtils.isEmpty(objectPropertyBeans)) {
			return;
		}

		ObjectProperty[] objectProperties = new ObjectProperty[objectPropertyBeans.length];

		List referenceObjects = new ArrayList();

		List referenceObjectIds = new ArrayList();

		for (int i = 0; i < objectPropertyBeans.length; i++) {
			ObjectPropertyBean objectPropertyBean = objectPropertyBeans[i];

			objectProperties[i] = objectPropertyBean.convertToObjectProperty();

			if (objectProperties[i].getReferenceObjectId() != null
					&& objectProperties[i].getReferenceObjectId().longValue() != 0) {

				if (referenceObjectIds.contains(objectProperties[i]
						.getReferenceObjectId()) == false) {

					ObjectRelation refenerceObjectRelation = new ObjectRelation();

					refenerceObjectRelation.setObjectId(objectProperties[i]
							.getObjectId());

					refenerceObjectRelation
							.setRelatedObjectId(objectProperties[i]
									.getReferenceObjectId().longValue());

					refenerceObjectRelation
							.setRelateType(ObjectRelationTypeEnum.REFERENCE
									.getName());

					referenceObjectIds.add(objectProperties[i]
							.getReferenceObjectId());

					referenceObjects.add(refenerceObjectRelation);
				}
			}
		}

		if (referenceObjectIds.isEmpty() == false) {

			ObjectRelationDAOQueryBean queryBean = new ObjectRelationDAOQueryBean();

			queryBean
					.createCriteria()
					.andObjectIdEqualTo(objectProperties[0].getObjectId())
					.andRelateTypeEqualTo(
							ObjectRelationTypeEnum.REFERENCE.getName())
					.andRelatedObjectIdIn(referenceObjectIds);

			this.objectRelationDao
					.synchronizeObjectRelation(
							(ObjectRelation[]) referenceObjects
									.toArray(new ObjectRelation[referenceObjects
											.size()]), queryBean);
		}
		
		for (int i = 0; i < objectProperties.length; i++) {
			this.objectPropertyDao.insertObjectProperty(objectProperties[i]);
		}

	}

	@Override
	protected void doDeleteBusinessObject(long businessObjectId)
			throws Exception {

		BusinessObject originallyBusinessObject = this.businessObjectDao
				.findBusinessObjectById(businessObjectId);

		if (originallyBusinessObject != null) {

			BusinessObjectDAOQueryBean daoQueryBean = new BusinessObjectDAOQueryBean();

			daoQueryBean
					.createCriteria()
					.andPackageIdEqualTo(
							originallyBusinessObject.getPackageId())
					.andNameEqualTo(
							originallyBusinessObject.getName() + "DAOQueryBean")
					.andTypeEqualTo(
							BusinessObjectTypeEnum.DAO_QUERY_BEAN.getName());

			this.businessObjectDao.deleteBusinessObject(daoQueryBean);
		}

		businessObjectDao.deleteBusinessObject(businessObjectId);

		BusinessObjectDAOQueryBean queryBean = new BusinessObjectDAOQueryBean();

		queryBean.createCriteria().andBusinessObjectIdEqualTo(businessObjectId);

		businessObjectDao.deleteObjectProperty(queryBean);

	}

	@Override
	protected void doDeleteBusinessObjectProperty(long businessObjectPropertyId)
			throws Exception {

		ObjectPropertyBean objectPropertyBean = getBusinessObjectPropertyById(businessObjectPropertyId);

		ObjectPropertyBean[] objectPropertyBeans = getBusinessObjectProperties(objectPropertyBean
				.getObjectId());

		List referenceObjects = new ArrayList();

		List referenceObjectIds = new ArrayList();

		for (int i = 0; i < objectPropertyBeans.length; i++) {
			ObjectPropertyBean tempObjectPropertyBean = objectPropertyBeans[i];

			if (businessObjectPropertyId == tempObjectPropertyBean
					.getObjectPropertyId()) {
				continue;
			}

			if (tempObjectPropertyBean.getReferenceObjectId() != null
					&& tempObjectPropertyBean.getReferenceObjectId()
							.longValue() != 0) {

				if (referenceObjectIds.contains(tempObjectPropertyBean
						.getReferenceObjectId()) == false) {

					ObjectRelation refenerceObjectRelation = new ObjectRelation();

					refenerceObjectRelation.setObjectId(tempObjectPropertyBean
							.getObjectId());

					refenerceObjectRelation
							.setRelatedObjectId(tempObjectPropertyBean
									.getReferenceObjectId().longValue());

					refenerceObjectRelation
							.setRelateType(ObjectRelationTypeEnum.REFERENCE
									.getName());

					referenceObjectIds.add(tempObjectPropertyBean
							.getReferenceObjectId());

					referenceObjects.add(refenerceObjectRelation);
				}
			}
		}

		if (referenceObjectIds.isEmpty() == false) {

			ObjectRelationDAOQueryBean queryBean = new ObjectRelationDAOQueryBean();

			queryBean
					.createCriteria()
					.andObjectIdEqualTo(objectPropertyBean.getObjectId())
					.andRelateTypeEqualTo(
							ObjectRelationTypeEnum.REFERENCE.getName())
					.andRelatedObjectIdIn(referenceObjectIds);

			this.objectRelationDao
					.synchronizeObjectRelation(
							(ObjectRelation[]) referenceObjects
									.toArray(new ObjectRelation[referenceObjects
											.size()]), queryBean);
		}

		objectPropertyDao.deleteObjectProperty(businessObjectPropertyId);
	}

	@Override
	protected ObjectPropertyBean doGetBusinessObjectPropertyById(long propertyId)
			throws Exception {
		ObjectProperty objectProperty = objectPropertyDao
				.findObjectPropertyById(propertyId);

		if (objectProperty == null) {
			return null;
		} else {
			return new ObjectPropertyBean(objectProperty);
		}
	}

	@Override
	protected ObjectRelationBean doGetBusinessObjectRelationById(
			long objectRelationId) throws Exception {
		ObjectRelation objectRelation = objectRelationDao
				.findObjectRelationById(objectRelationId);

		if (objectRelation == null) {
			return null;
		} else {
			return new ObjectRelationBean(objectRelation);
		}

	}

	@Override
	protected void doAddNewServiceFunction(
			ServiceFunctionBean serviceFunctionBean) throws Exception {

		ServiceFunction serviceFunction = serviceFunctionBean
				.convertToServiceFunction();

		this.serviceFunctionDao.insertServiceFunction(serviceFunction);

		ServiceParameterBean serviceOutputParameter = new ServiceParameterBean();

		setServiceOutputParameter(serviceFunction.getObjectFunctionId(),
				serviceOutputParameter);
	}

	@Override
	protected ServiceFunctionBean doGetServiceFunctionById(
			long serviceFunctionId) throws Exception {
		ServiceFunction serviceFunction = this.serviceFunctionDao
				.findServiceFunctionById(serviceFunctionId);

		if (serviceFunction == null) {
			return null;
		} else {
			return new ServiceFunctionBean(serviceFunction);
		}

	}

	@Override
	protected void doDeleteServiceFunction(long serviceFunctionId)
			throws Exception {

		ServiceParameterDAOQueryBean queryBean = new ServiceParameterDAOQueryBean();

		queryBean.createCriteria().andServiceFunctionIdEqualTo(
				serviceFunctionId);

		this.serviceParameterDao.deleteServiceParameter(queryBean);

		this.serviceFunctionDao.deleteServiceFunction(serviceFunctionId);
	}

	@Override
	protected ObjectRelationBean[] doGetBusinessObjectBeRefrencedRelations(
			long businessObjectId,
			BusinessObjectTypeEnum[] businessObjectTypeEnums,
			ObjectRelationTypeEnum[] objectRelationTypeEnums) throws Exception {

		ObjectRelationDAOQueryBean queryBean = new ObjectRelationDAOQueryBean();

		ObjectRelationDAOQueryBean.Criteria criteria = queryBean
				.createCriteria();

		criteria.andRelatedObjectIdEqualTo(businessObjectId);

		if (ArrayUtils.isNotEmpty(businessObjectTypeEnums)) {

			String[] objectTypes = new String[businessObjectTypeEnums.length];

			for (int i = 0; i < objectTypes.length; i++) {
				objectTypes[i] = businessObjectTypeEnums[i].getName();
			}

			criteria.andRelatedBusinessObjectTypeIn(objectTypes);
		}

		if (ArrayUtils.isNotEmpty(objectRelationTypeEnums)) {

			String[] relateTypes = new String[businessObjectTypeEnums.length];

			for (int i = 0; i < relateTypes.length; i++) {
				relateTypes[i] = objectRelationTypeEnums[i].getName();
			}

			criteria.andRelateTypeIn(relateTypes);
		}

		// queryBean.setSortProperty(IObjectRelationDAO.);

		ObjectRelation[] objectRelations = this.objectRelationDao
				.queryObjectRelation(queryBean);

		ObjectRelationBean[] objectRelationBeans = ObjectRelationBean
				.toArray(objectRelations);

		for (int i = 0; i < objectRelations.length; i++) {
			ObjectRelation objectRelation = objectRelations[i];
			BusinessObject businessObject = this.businessObjectDao
					.findBusinessObjectById(objectRelation.getObjectId());

			objectRelationBeans[i].setBusinessObjectName(businessObject
					.getName());
			objectRelationBeans[i].setBusinessPackageId(businessObject
					.getPackageId());

			BusinessPackage businessPackage = this.businessPackageDao
					.findBusinessPackageById(businessObject.getPackageId());

			objectRelationBeans[i].setBusinessPackageName(businessPackage
					.getName());

			objectRelationBeans[i].setBusinessObjectType(businessObject
					.getType());
		}

		return objectRelationBeans;
	}

	@Override
	protected BusinessObjectBean[] doQueryCustomDataObjects(
			BusinessObjectDAOQueryBean queryBean) throws Exception {

		if (queryBean == null) {
			queryBean = new BusinessObjectDAOQueryBean();
		} else {
			queryBean = new BusinessObjectDAOQueryBean(queryBean);
		}

		BusinessObjectDAOQueryBean.Criteria criteria = queryBean
				.createCriteria();

		criteria.andTypeEqualTo(BusinessObjectTypeEnum.CUSTOM_DATA_TYPE
				.getName());

		queryBean.and(criteria);

		BusinessObject[] businessObjects = businessObjectDao
				.queryBusinessObject(queryBean);

		return BusinessObjectBean.toArray(businessObjects);
	}

	@Override
	protected void doAddNewCustomDataObject(BusinessObjectBean customDataObject)
			throws Exception {

		customDataObject.setType(BusinessObjectTypeEnum.CUSTOM_DATA_TYPE
				.getName());

		BusinessObject businessObject = customDataObject
				.convertToBusinessObject();

		businessObject.setState(CustomDataObjectStatusEnum.ACTIVE.getName());

		businessObjectDao.insertBusinessObject(businessObject);
	}

	@Override
	protected void doModifyCustomDataObject(BusinessObjectBean customDataObject)
			throws Exception {
		customDataObject.setType(BusinessObjectTypeEnum.CUSTOM_DATA_TYPE
				.getName());

		businessObjectDao.updateBusinessObject(customDataObject
				.convertToBusinessObject());
	}

	@Override
	protected void doDeleteCustomDataObjects(long[] customDataObjectIds)
			throws Exception {

		BusinessObjectDAOQueryBean queryBean = new BusinessObjectDAOQueryBean();

		queryBean.createCriteria().andBusinessObjectIdIn(customDataObjectIds);

		businessObjectDao.deleteBusinessObject(queryBean);

	}

	@Override
	protected void doChangeCustomDataObjectStatus(long[] customDataObjectIds,
			CustomDataObjectStatusEnum statusEnum) throws Exception {

		BusinessObjectDAOQueryBean queryBean = new BusinessObjectDAOQueryBean();

		queryBean.createCriteria().andBusinessObjectIdIn(customDataObjectIds);

		BusinessObject businessObject = new BusinessObject();

		businessObject.setState(statusEnum.getName());

		businessObjectDao.updateBusinessObject(businessObject, queryBean);

	}

	@Override
	protected int doQueryCustomDataObjectCount(
			BusinessObjectDAOQueryBean queryBean) throws Exception {

		boolean needAnd = false;

		if (queryBean == null) {
			queryBean = new BusinessObjectDAOQueryBean();
		} else {
			queryBean = new BusinessObjectDAOQueryBean(queryBean);
		}

		if (queryBean.getOredCriteria().size() > 0) {
			needAnd = true;
		}

		BusinessObjectDAOQueryBean.Criteria criteria = queryBean
				.createCriteria();

		criteria.andTypeEqualTo(BusinessObjectTypeEnum.CUSTOM_DATA_TYPE
				.getName());

		if (needAnd == true) {
			queryBean.and(criteria);
		}

		return businessObjectDao.queryBusinessObjectCount(queryBean);
	}

	@Override
	protected BusinessObjectBean[] doGetBusinessObjectsByPackageId(
			long[] packageIds) throws Exception {

		BusinessObjectDAOQueryBean queryBean = new BusinessObjectDAOQueryBean();

		queryBean.createCriteria().andPackageIdIn(packageIds);

		return queryBusinessObjects(queryBean);
	}

}
