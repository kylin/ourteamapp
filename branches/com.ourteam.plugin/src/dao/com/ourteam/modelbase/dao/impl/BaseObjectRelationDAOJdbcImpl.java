/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao.impl;

import com.ourteam.modelbase.dao.IObjectRelationDAO;
import com.ourteam.modelbase.dao.ObjectRelation;
import com.ourteam.modelbase.dao.ObjectRelationDAOQueryBean;

import net.dao.AbstractJdbcDAO;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.collections.ListUtils;
import org.apache.commons.lang.ArrayUtils;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * 对象关联关系 DAO JDBC Impl Generate Date : 2011-06-29 21:07:05
 *
 * @author Kylin
 */
abstract public class BaseObjectRelationDAOJdbcImpl extends AbstractJdbcDAO
    implements IObjectRelationDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            ObjectRelationId, Description, ObjectId, RelatedObjectId,
            RelateConfig, RelateType, RelatedBusinessObjectName,
            RelatedBusinessObjectType, RelatedBusinessPackageName,
            RelatedBusinessPackageId
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.ObjectRelationId, DataProperty.Description,
            DataProperty.ObjectId, DataProperty.RelatedObjectId,
            DataProperty.RelateConfig, DataProperty.RelateType,
            DataProperty.RelatedBusinessObjectName,
            DataProperty.RelatedBusinessObjectType,
            DataProperty.RelatedBusinessPackageName,
            DataProperty.RelatedBusinessPackageId
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PK_FIELDS = new String[] {
            ObjectRelationId
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_AUTO_GEN_PK_FIELDS = new String[] {
            ObjectRelationId
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_UNIQUE_FIELDS = new String[] {  };

    /**
     * DOCUMENT ME!
     */
    private static String relatedJoinSQL = null;

    /**
     * DOCUMENT ME!
     */
    private static String basicFilterSQL = null;

    /**
     * Creates a new BaseObjectRelationDAOJdbcImpl object.
     */
    public BaseObjectRelationDAOJdbcImpl() {
        super();
    } // end BaseObjectRelationDAOJdbcImpl()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    protected String getEntityName() {
        return EntityName;
    } // end getEntityName()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    protected String[] getEntityFields() {
        return ENTITY_FIELDS;
    } // end getEntityFields()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    protected String[] getEntityProperties() {
        return ENTITY_PROPERTIES;
    } // end getEntityProperties()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    protected String[] getEntityPKFields() {
        return ENTITY_PK_FIELDS;
    } // end getEntityPKFields()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    protected String[] getEntityAutoGenPKFields() {
        return ENTITY_AUTO_GEN_PK_FIELDS;
    } // end getEntityAutoGenPKFields()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    protected String[] getEntityUniqueFields() {
        return ENTITY_UNIQUE_FIELDS;
    } // end getEntityUniqueFields()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    protected String getBaiscQueryFilter() {
        if (basicFilterSQL == null) {
            StringBuffer basicFilterSQLbuffer = new StringBuffer();

            basicFilterSQL = basicFilterSQLbuffer.toString();
        } // end if

        return basicFilterSQL;
    } // end getBaiscQueryFilter()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    protected String getRelatedJoinSQL() {
        if (relatedJoinSQL == null) {
            StringBuffer relatedJoinSQLBuffer = new StringBuffer();

            relatedJoinSQLBuffer.append(
                " LEFT JOIN BUSINESS_OBJECT relatedBusinessObject ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " relatedBusinessObject.BUSINESS_OBJECT_ID = OBJECT_RELATION.RELATED_OBJECT_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQLBuffer.append(
                " LEFT JOIN BUSINESS_PACKAGE relatedBusinessPackage ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " relatedBusinessPackage.BUSINESS_PACKAGE_ID = relatedBusinessObject.PACKAGE_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique ObjectRelation
     *
     * @param aObjectRelation
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(ObjectRelation aObjectRelation)
        throws Exception {
        if (aObjectRelation == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aObjectRelation,
                DataProperty.ObjectRelationId));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IObjectRelation
     *
     * @param aObjectRelation
     *
     * @throws Exception
     */
    public void insertObjectRelation(ObjectRelation aObjectRelation)
        throws Exception {
        insert(aObjectRelation);
    } // end insertObjectRelation()

    /**
     * Batch Insert IObjectRelation
     *
     * @param aObjectRelation
     *
     * @throws Exception
     */
    public void batchInsertObjectRelation(ObjectRelation[] aObjectRelation)
        throws Exception {
        batchInsert(aObjectRelation);
    } // end batchInsertObjectRelation()

    /**
     * Delete IObjectRelation
     *
     * @param aObjectRelationId long aObjectRelationId
     *
     * @throws Exception
     */
    public void deleteObjectRelation(final long aObjectRelationId)
        throws Exception {
        deleteById(new Object[] { new Long(aObjectRelationId) });
    } // end deleteObjectRelation()

    /**
     * Delete IObjectRelation
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteObjectRelation(ObjectRelationDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteObjectRelation()

    /**
     * Update IObjectRelation Selective
     *
     * @param aObjectRelation
     *
     * @throws Exception
     */
    public void updateObjectRelation(ObjectRelation aObjectRelation)
        throws Exception {
        if (aObjectRelation.getObjectRelationId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aObjectRelation);

        ObjectRelation tempObj = findObjectRelationById(aObjectRelation.getObjectRelationId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aObjectRelation, tempObj);
        } // end if
    } // end updateObjectRelation()

    /**
     * Batch Update IObjectRelation
     *
     * @param aObjectRelation
     *
     * @throws Exception
     */
    public void batchUpdateObjectRelation(ObjectRelation[] aObjectRelation)
        throws Exception {
        batchUpdate(aObjectRelation);
    } // end batchUpdateObjectRelation()

    /**
     * Update IObjectRelation
     *
     * @param aObjectRelation
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateObjectRelation(ObjectRelation aObjectRelation,
        ObjectRelationDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aObjectRelation, aQueryBean);
    } // end updateObjectRelation()

    /**
     * DOCUMENT ME!
     *
     * @param aObjectRelation DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(ObjectRelation aObjectRelation)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aObjectRelations DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeObjectRelation(ObjectRelation[] aObjectRelations,
        ObjectRelationDAOQueryBean aQueryBean) throws Exception {
        synchronizeObjectRelation(aObjectRelations, aQueryBean, null);
    } // end synchronizeObjectRelation()

    /**
     * DOCUMENT ME!
     *
     * @param aObjectRelations DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeObjectRelation(ObjectRelation[] aObjectRelations,
        ObjectRelationDAOQueryBean aQueryBean,
        ObjectRelationSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aObjectRelations) == false) {
            inputList.addAll(Arrays.asList(aObjectRelations));
        } // end if

        ObjectRelation[] existentObjectRelations = this.queryObjectRelation(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentObjectRelations) == false) {
            existentList.addAll(Arrays.asList(existentObjectRelations));
        } // end if

        List willAddObjectRelations = ListUtils.subtract(inputList, existentList);

        List willDeleteObjectRelations = ListUtils.subtract(existentList,
                inputList);

        List willUpdateObjectRelations = ListUtils.intersection(existentList,
                inputList);

        ObjectRelation[] willUpdateObjectRelationArray = (ObjectRelation[]) willUpdateObjectRelations.toArray(new ObjectRelation[willUpdateObjectRelations.size()]);
        ObjectRelation[] willAddObjectRelationArray = (ObjectRelation[]) willAddObjectRelations.toArray(new ObjectRelation[willAddObjectRelations.size()]);
        ObjectRelation[] willDeleteObjectRelationArray = (ObjectRelation[]) willDeleteObjectRelations.toArray(new ObjectRelation[willDeleteObjectRelations.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddObjectRelationArray,
                willUpdateObjectRelationArray, willDeleteObjectRelationArray);
        } // end if

        if (willUpdateObjectRelations.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateObjectRelationArray);
            } // end if

            this.batchUpdateObjectRelation(willUpdateObjectRelationArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateObjectRelationArray);
            } // end if
        } // end if

        if (willAddObjectRelations.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddObjectRelationArray);
            } // end if

            this.batchInsertObjectRelation(willAddObjectRelationArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddObjectRelationArray);
            } // end if
        } // end if

        if (willDeleteObjectRelations.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteObjectRelationArray);
            } // end if

            for (int i = 0; i < willDeleteObjectRelationArray.length; i++) {
                ObjectRelation object = willDeleteObjectRelationArray[i];
                this.deleteObjectRelation(object.getObjectRelationId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteObjectRelationArray);
            } // end if
        } // end if
    } // end synchronizeObjectRelation()

    /**
     * Query IObjectRelation
     *
     * @param aObjectRelationId long aObjectRelationId
     *
     * @return
     *
     * @throws Exception
     */
    public ObjectRelation findObjectRelationById(final long aObjectRelationId)
        throws Exception {
        ObjectRelationDAOQueryBean queryBean = new ObjectRelationDAOQueryBean();

        queryBean.createCriteria()
                 .andObjectRelationIdEqualTo(new java.lang.Long(
                aObjectRelationId));

        queryBean.setDistinct(true);

        ObjectRelation[] ObjectRelations = queryObjectRelation(queryBean);

        if (ObjectRelations.length == 0) {
            return null;
        } // end if
        else {
            return ObjectRelations[0];
        } // end else
    } // end findObjectRelationById()

    /**
     * Query IObjectRelation
     *
     * @param queryBean
     *
     * @return IObjectRelation[]
     *
     * @throws Exception
     */
    public ObjectRelation[] queryObjectRelation(
        ObjectRelationDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcObjectRelationRowMapper());

        return (ObjectRelation[]) result.toArray(new ObjectRelation[result.size()]);
    } // end queryObjectRelation()

    /**
     * Query ObjectRelation Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryObjectRelationSelective(
        ObjectRelationDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryObjectRelationSelective()

    /**
     * Query IObjectRelation Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryObjectRelationCount(ObjectRelationDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryObjectRelationCount()

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.modelbase.dao.impl.BaseObjectRelationAttrDAOJdbcImpl objectRelationAttr;

    /**
     * DOCUMENT ME!
     *
     * @param objectRelationAttr DOCUMENT ME!
     */
    public void setObjectRelationAttr(
        com.ourteam.modelbase.dao.impl.BaseObjectRelationAttrDAOJdbcImpl objectRelationAttr) {
        this.objectRelationAttr = objectRelationAttr;
    } // end setObjectRelationAttr()

    /**
     * Query Related IObjectRelationAttr
     *
     * @param aDaoQueryBean DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="IObjectRelationAttr" containment="true"
     */
    public com.ourteam.modelbase.dao.ObjectRelationAttr[] queryObjectRelationAttrs(
        ObjectRelationDAOQueryBean aDaoQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN OBJECT_RELATION ON ( ");

        joinSQL.append(
            " OBJECT_RELATION_ATTR.OBJECT_RELATION_ID = OBJECT_RELATION.OBJECT_RELATION_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.modelbase.dao.IObjectRelationAttrDAO.EntityName;

        String[] entityFields = com.ourteam.modelbase.dao.impl.BaseObjectRelationAttrDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.modelbase.dao.impl.BaseObjectRelationAttrDAOJdbcImpl.ENTITY_PROPERTIES;

        List list = objectRelationAttr.query(entityName, entityFields,
                entityProperties, aDaoQueryBean, joinSQL.toString(),
                new com.ourteam.modelbase.dao.impl.BaseObjectRelationAttrDAOJdbcImpl.JdbcObjectRelationAttrRowMapper());

        return (com.ourteam.modelbase.dao.ObjectRelationAttr[]) list.toArray(new com.ourteam.modelbase.dao.ObjectRelationAttr[list.size()]);
    } // end queryObjectRelationAttrs()

    /**
     * Query ObjectRelation Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryObjectRelationAttrsSelective(
        ObjectRelationDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectRelationAttrDAO.ObjectRelationAttrId,
                "objectRelationAttrId");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectRelationAttrDAO.ObjectRelationId,
                "objectRelationId");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectRelationAttrDAO.PropertyId,
                "propertyId");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectRelationAttrDAO.RelatedPropertyId,
                "relatedPropertyId");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectRelationAttrDAO.ObjectRelationDescription,
                "objectRelationDescription");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectRelationAttrDAO.PropertyDataSize,
                "propertyDataSize");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectRelationAttrDAO.PropertyDataType,
                "propertyDataType");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectRelationAttrDAO.PropertyDescription,
                "propertyDescription");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectRelationAttrDAO.PropertyIsEnum,
                "propertyIsEnum");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectRelationAttrDAO.PropertyIsGenerate,
                "propertyIsGenerate");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectRelationAttrDAO.PropertyIsPrimaryProperty,
                "propertyIsPrimaryProperty");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectRelationAttrDAO.PropertyName,
                "propertyName");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectRelationAttrDAO.PropertyObjectId,
                "propertyObjectId");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectRelationAttrDAO.PropertyOrderIndex,
                "propertyOrderIndex");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectRelationAttrDAO.PropertyKind,
                "propertyKind");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectRelationAttrDAO.PropertyState,
                "propertyState");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectRelationAttrDAO.PropertyType,
                "propertyType");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectRelationAttrDAO.PropertyValue,
                "propertyValue");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectRelationAttrDAO.RelatedPropertyDataSize,
                "relatedPropertyDataSize");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectRelationAttrDAO.RelatedPropertyDataType,
                "relatedPropertyDataType");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectRelationAttrDAO.RelatedPropertyDescription,
                "relatedPropertyDescription");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectRelationAttrDAO.RelatedPropertyIsEnum,
                "relatedPropertyIsEnum");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectRelationAttrDAO.RelatedPropertyIsGenerate,
                "relatedPropertyIsGenerate");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectRelationAttrDAO.RelatedPropertyIsPrimaryProperty,
                "relatedPropertyIsPrimaryProperty");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectRelationAttrDAO.RelatedPropertyName,
                "relatedPropertyName");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectRelationAttrDAO.RelatedPropertyObjectId,
                "relatedPropertyObjectId");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectRelationAttrDAO.RelatedPropertyOrderIndex,
                "relatedPropertyOrderIndex");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectRelationAttrDAO.RelatedPropertyKind,
                "relatedPropertyKind");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectRelationAttrDAO.RelatedPropertyState,
                "relatedPropertyState");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectRelationAttrDAO.RelatedPropertyType,
                "relatedPropertyType");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectRelationAttrDAO.RelatedPropertyValue,
                "relatedPropertyValue");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectRelationAttrDAO.RelateAttrType,
                "relateAttrType");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectRelationAttrDAO.PropertyIsUnique,
                "propertyIsUnique");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectRelationAttrDAO.RelatedPropertyIsUnique,
                "relatedPropertyIsUnique");
        } // end if

        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN OBJECT_RELATION ON ( ");

        joinSQL.append(
            " OBJECT_RELATION_ATTR.OBJECT_RELATION_ID = OBJECT_RELATION.OBJECT_RELATION_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.modelbase.dao.IObjectRelationAttrDAO.EntityName;

        return objectRelationAttr.querySelective(entityName, aQueryBean,
            joinSQL.toString());
    } // end queryObjectRelationAttrsSelective()

    /**
     * Update Related IObjectRelationAttr
     *
     * @param aObjectRelationAttr {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void updateObjectRelationAttr(
        com.ourteam.modelbase.dao.ObjectRelationAttr aObjectRelationAttr,
        ObjectRelationDAOQueryBean aQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN OBJECT_RELATION ON ( ");

        joinSQL.append(
            " OBJECT_RELATION_ATTR.OBJECT_RELATION_ID = OBJECT_RELATION.OBJECT_RELATION_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.modelbase.dao.IObjectRelationAttrDAO.EntityName;

        String[] entityFields = com.ourteam.modelbase.dao.impl.BaseObjectRelationAttrDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.modelbase.dao.impl.BaseObjectRelationAttrDAOJdbcImpl.ENTITY_PROPERTIES;

        objectRelationAttr.updateByQuery(entityName, entityFields,
            entityProperties, joinSQL.toString(), aObjectRelationAttr,
            aQueryBean);
    } // end updateObjectRelationAttr()

    /**
     * Delete Related IObjectRelationAttr
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void deleteObjectRelationAttr(ObjectRelationDAOQueryBean aQueryBean)
        throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN OBJECT_RELATION ON ( ");

        joinSQL.append(
            " OBJECT_RELATION_ATTR.OBJECT_RELATION_ID = OBJECT_RELATION.OBJECT_RELATION_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.modelbase.dao.IObjectRelationAttrDAO.EntityName;

        objectRelationAttr.deleteByQuery(entityName, joinSQL.toString(),
            aQueryBean);
    } // end deleteObjectRelationAttr()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcObjectRelationRowMapper
        implements ParameterizedRowMapper {
        /**
         * DOCUMENT ME!
         *
         * @param resultSet DOCUMENT ME!
         * @param arg1 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         *
         * @throws SQLException DOCUMENT ME!
         */
        public Object mapRow(ResultSet resultSet, int arg1)
            throws SQLException {
            ObjectRelation object = new ObjectRelation();

            int columnIndex = 1;

            try {
                Object ObjectRelationId = resultSet.getObject(columnIndex++);

                object.setObjectRelationIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (ObjectRelationId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ObjectRelationId, ObjectRelationId);
                } // end if

                Object Description = resultSet.getObject(columnIndex++);

                object.setDescriptionNull(resultSet.getBoolean(columnIndex++));

                if (Description != null) {
                    BeanUtils.setProperty(object, DataProperty.Description,
                        Description);
                } // end if

                Object ObjectId = resultSet.getObject(columnIndex++);

                object.setObjectIdNull(resultSet.getBoolean(columnIndex++));

                if (ObjectId != null) {
                    BeanUtils.setProperty(object, DataProperty.ObjectId,
                        ObjectId);
                } // end if

                Object RelatedObjectId = resultSet.getObject(columnIndex++);

                object.setRelatedObjectIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (RelatedObjectId != null) {
                    BeanUtils.setProperty(object, DataProperty.RelatedObjectId,
                        RelatedObjectId);
                } // end if

                Object RelateConfig = resultSet.getObject(columnIndex++);

                object.setRelateConfigNull(resultSet.getBoolean(columnIndex++));

                if (RelateConfig != null) {
                    BeanUtils.setProperty(object, DataProperty.RelateConfig,
                        RelateConfig);
                } // end if

                Object RelateType = resultSet.getObject(columnIndex++);

                object.setRelateTypeNull(resultSet.getBoolean(columnIndex++));

                if (RelateType != null) {
                    BeanUtils.setProperty(object, DataProperty.RelateType,
                        RelateType);
                } // end if

                Object RelatedBusinessObjectName = resultSet.getObject(columnIndex++);

                object.setRelatedBusinessObjectNameNull(resultSet.getBoolean(
                        columnIndex++));

                if (RelatedBusinessObjectName != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.RelatedBusinessObjectName,
                        RelatedBusinessObjectName);
                } // end if

                Object RelatedBusinessObjectType = resultSet.getObject(columnIndex++);

                object.setRelatedBusinessObjectTypeNull(resultSet.getBoolean(
                        columnIndex++));

                if (RelatedBusinessObjectType != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.RelatedBusinessObjectType,
                        RelatedBusinessObjectType);
                } // end if

                Object RelatedBusinessPackageName = resultSet.getObject(columnIndex++);

                object.setRelatedBusinessPackageNameNull(resultSet.getBoolean(
                        columnIndex++));

                if (RelatedBusinessPackageName != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.RelatedBusinessPackageName,
                        RelatedBusinessPackageName);
                } // end if

                Object RelatedBusinessPackageId = resultSet.getObject(columnIndex++);

                object.setRelatedBusinessPackageIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (RelatedBusinessPackageId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.RelatedBusinessPackageId,
                        RelatedBusinessPackageId);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcObjectRelationRowMapper
} // end BaseObjectRelationDAOJdbcImpl
