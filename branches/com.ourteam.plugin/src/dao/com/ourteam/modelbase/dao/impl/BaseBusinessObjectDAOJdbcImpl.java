/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao.impl;

import com.ourteam.modelbase.dao.BusinessObject;
import com.ourteam.modelbase.dao.BusinessObjectDAOQueryBean;
import com.ourteam.modelbase.dao.IBusinessObjectDAO;

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
 * 业务对象 DAO JDBC Impl Generate Date : 2011-06-29 21:07:04
 *
 * @author Kylin
 */
abstract public class BaseBusinessObjectDAOJdbcImpl extends AbstractJdbcDAO
    implements IBusinessObjectDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            BusinessObjectId, Description, GenerateOption, Name, PackageId,
            State, Type, DomainId, DomainName, PackageName
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.BusinessObjectId, DataProperty.Description,
            DataProperty.GenerateOption, DataProperty.Name,
            DataProperty.PackageId, DataProperty.State, DataProperty.Type,
            DataProperty.DomainId, DataProperty.DomainName,
            DataProperty.PackageName
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PK_FIELDS = new String[] {
            BusinessObjectId
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_AUTO_GEN_PK_FIELDS = new String[] {
            BusinessObjectId
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
     * Creates a new BaseBusinessObjectDAOJdbcImpl object.
     */
    public BaseBusinessObjectDAOJdbcImpl() {
        super();
    } // end BaseBusinessObjectDAOJdbcImpl()

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

            basicFilterSQLbuffer.append(" BUSINESS_OBJECT.STATE = 'U' ");

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

            relatedJoinSQLBuffer.append(" LEFT JOIN BUSINESS_PACKAGE package ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " package.BUSINESS_PACKAGE_ID = BUSINESS_OBJECT.PACKAGE_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQLBuffer.append(" LEFT JOIN BUSINESS_DOMAIN domain ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " domain.BUSINESS_DOMAIN_ID = package.BUSINESS_DOMAIN_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique BusinessObject
     *
     * @param aBusinessObject
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(BusinessObject aBusinessObject)
        throws Exception {
        if (aBusinessObject == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aBusinessObject,
                DataProperty.BusinessObjectId));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IBusinessObject
     *
     * @param aBusinessObject
     *
     * @throws Exception
     */
    public void insertBusinessObject(BusinessObject aBusinessObject)
        throws Exception {
        org.apache.commons.beanutils.PropertyUtils.setProperty(aBusinessObject,
            "state",
            org.apache.commons.beanutils.ConvertUtils.convert("U", String.class));

        checkNullValue(aBusinessObject);

        insert(aBusinessObject);
    } // end insertBusinessObject()

    /**
     * Batch Insert IBusinessObject
     *
     * @param aBusinessObject
     *
     * @throws Exception
     */
    public void batchInsertBusinessObject(BusinessObject[] aBusinessObject)
        throws Exception {
        batchInsert(aBusinessObject);
    } // end batchInsertBusinessObject()

    /**
     * Delete IBusinessObject
     *
     * @param aBusinessObjectId long aBusinessObjectId
     *
     * @throws Exception
     */
    public void deleteBusinessObject(final long aBusinessObjectId)
        throws Exception {
        BusinessObject tempBusinessObject = findBusinessObjectById(aBusinessObjectId);

        org.apache.commons.beanutils.PropertyUtils.setProperty(tempBusinessObject,
            "state",
            org.apache.commons.beanutils.ConvertUtils.convert("E", String.class));

        updateBusinessObject(tempBusinessObject);
    } // end deleteBusinessObject()

    /**
     * Delete IBusinessObject
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteBusinessObject(BusinessObjectDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteBusinessObject()

    /**
     * Update IBusinessObject Selective
     *
     * @param aBusinessObject
     *
     * @throws Exception
     */
    public void updateBusinessObject(BusinessObject aBusinessObject)
        throws Exception {
        if (aBusinessObject.getBusinessObjectId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aBusinessObject);

        BusinessObject tempObj = findBusinessObjectById(aBusinessObject.getBusinessObjectId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aBusinessObject, tempObj);
        } // end if
    } // end updateBusinessObject()

    /**
     * Batch Update IBusinessObject
     *
     * @param aBusinessObject
     *
     * @throws Exception
     */
    public void batchUpdateBusinessObject(BusinessObject[] aBusinessObject)
        throws Exception {
        batchUpdate(aBusinessObject);
    } // end batchUpdateBusinessObject()

    /**
     * Update IBusinessObject
     *
     * @param aBusinessObject
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateBusinessObject(BusinessObject aBusinessObject,
        BusinessObjectDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aBusinessObject, aQueryBean);
    } // end updateBusinessObject()

    /**
     * DOCUMENT ME!
     *
     * @param aBusinessObject DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(BusinessObject aBusinessObject)
        throws Exception {
        if (aBusinessObject.getType() == null) {
            throw new Exception(
                "The BusinessObject.type value is not allow NULL");
        } // end if
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aBusinessObjects DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBusinessObject(BusinessObject[] aBusinessObjects,
        BusinessObjectDAOQueryBean aQueryBean) throws Exception {
        synchronizeBusinessObject(aBusinessObjects, aQueryBean, null);
    } // end synchronizeBusinessObject()

    /**
     * DOCUMENT ME!
     *
     * @param aBusinessObjects DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBusinessObject(BusinessObject[] aBusinessObjects,
        BusinessObjectDAOQueryBean aQueryBean,
        BusinessObjectSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aBusinessObjects) == false) {
            inputList.addAll(Arrays.asList(aBusinessObjects));
        } // end if

        BusinessObject[] existentBusinessObjects = this.queryBusinessObject(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentBusinessObjects) == false) {
            existentList.addAll(Arrays.asList(existentBusinessObjects));
        } // end if

        List willAddBusinessObjects = ListUtils.subtract(inputList, existentList);

        List willDeleteBusinessObjects = ListUtils.subtract(existentList,
                inputList);

        List willUpdateBusinessObjects = ListUtils.intersection(existentList,
                inputList);

        BusinessObject[] willUpdateBusinessObjectArray = (BusinessObject[]) willUpdateBusinessObjects.toArray(new BusinessObject[willUpdateBusinessObjects.size()]);
        BusinessObject[] willAddBusinessObjectArray = (BusinessObject[]) willAddBusinessObjects.toArray(new BusinessObject[willAddBusinessObjects.size()]);
        BusinessObject[] willDeleteBusinessObjectArray = (BusinessObject[]) willDeleteBusinessObjects.toArray(new BusinessObject[willDeleteBusinessObjects.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddBusinessObjectArray,
                willUpdateBusinessObjectArray, willDeleteBusinessObjectArray);
        } // end if

        if (willUpdateBusinessObjects.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateBusinessObjectArray);
            } // end if

            this.batchUpdateBusinessObject(willUpdateBusinessObjectArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateBusinessObjectArray);
            } // end if
        } // end if

        if (willAddBusinessObjects.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddBusinessObjectArray);
            } // end if

            this.batchInsertBusinessObject(willAddBusinessObjectArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddBusinessObjectArray);
            } // end if
        } // end if

        if (willDeleteBusinessObjects.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteBusinessObjectArray);
            } // end if

            for (int i = 0; i < willDeleteBusinessObjectArray.length; i++) {
                BusinessObject object = willDeleteBusinessObjectArray[i];
                this.deleteBusinessObject(object.getBusinessObjectId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteBusinessObjectArray);
            } // end if
        } // end if
    } // end synchronizeBusinessObject()

    /**
     * Query IBusinessObject
     *
     * @param aBusinessObjectId long aBusinessObjectId
     *
     * @return
     *
     * @throws Exception
     */
    public BusinessObject findBusinessObjectById(final long aBusinessObjectId)
        throws Exception {
        BusinessObjectDAOQueryBean queryBean = new BusinessObjectDAOQueryBean();

        queryBean.createCriteria()
                 .andBusinessObjectIdEqualTo(new java.lang.Long(
                aBusinessObjectId));

        queryBean.setDistinct(true);

        BusinessObject[] BusinessObjects = queryBusinessObject(queryBean);

        if (BusinessObjects.length == 0) {
            return null;
        } // end if
        else {
            return BusinessObjects[0];
        } // end else
    } // end findBusinessObjectById()

    /**
     * Query IBusinessObject
     *
     * @param queryBean
     *
     * @return IBusinessObject[]
     *
     * @throws Exception
     */
    public BusinessObject[] queryBusinessObject(
        BusinessObjectDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcBusinessObjectRowMapper());

        return (BusinessObject[]) result.toArray(new BusinessObject[result.size()]);
    } // end queryBusinessObject()

    /**
     * Query BusinessObject Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryBusinessObjectSelective(
        BusinessObjectDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryBusinessObjectSelective()

    /**
     * Query IBusinessObject Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryBusinessObjectCount(BusinessObjectDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryBusinessObjectCount()

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.modelbase.dao.impl.BaseObjectPropertyDAOJdbcImpl objectProperty;

    /**
     * DOCUMENT ME!
     *
     * @param objectProperty DOCUMENT ME!
     */
    public void setObjectProperty(
        com.ourteam.modelbase.dao.impl.BaseObjectPropertyDAOJdbcImpl objectProperty) {
        this.objectProperty = objectProperty;
    } // end setObjectProperty()

    /**
     * Query Related IObjectProperty
     *
     * @param aDaoQueryBean DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="IObjectProperty" containment="true"
     */
    public com.ourteam.modelbase.dao.ObjectProperty[] queryObjectPropertys(
        BusinessObjectDAOQueryBean aDaoQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN BUSINESS_OBJECT ON ( ");

        joinSQL.append(
            " OBJECT_PROPERTY.OBJECT_ID = BUSINESS_OBJECT.BUSINESS_OBJECT_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.modelbase.dao.IObjectPropertyDAO.EntityName;

        String[] entityFields = com.ourteam.modelbase.dao.impl.BaseObjectPropertyDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.modelbase.dao.impl.BaseObjectPropertyDAOJdbcImpl.ENTITY_PROPERTIES;

        List list = objectProperty.query(entityName, entityFields,
                entityProperties, aDaoQueryBean, joinSQL.toString(),
                new com.ourteam.modelbase.dao.impl.BaseObjectPropertyDAOJdbcImpl.JdbcObjectPropertyRowMapper());

        return (com.ourteam.modelbase.dao.ObjectProperty[]) list.toArray(new com.ourteam.modelbase.dao.ObjectProperty[list.size()]);
    } // end queryObjectPropertys()

    /**
     * Query BusinessObject Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryObjectPropertysSelective(
        BusinessObjectDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectPropertyDAO.ObjectPropertyId,
                "objectPropertyId");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectPropertyDAO.DataSize,
                "dataSize");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectPropertyDAO.DataType,
                "dataType");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectPropertyDAO.Description,
                "description");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectPropertyDAO.IsEnum,
                "isEnum");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectPropertyDAO.IsGenerate,
                "isGenerate");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectPropertyDAO.IsPrimaryProperty,
                "isPrimaryProperty");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectPropertyDAO.Name,
                "name");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectPropertyDAO.ObjectId,
                "objectId");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectPropertyDAO.OrderIndex,
                "orderIndex");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectPropertyDAO.PropertyKind,
                "propertyKind");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectPropertyDAO.State,
                "state");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectPropertyDAO.Type,
                "type");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectPropertyDAO.Value,
                "value");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectPropertyDAO.IsUnique,
                "isUnique");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectPropertyDAO.ObjectName,
                "objectName");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectPropertyDAO.IsAllowNull,
                "isAllowNull");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectPropertyDAO.PrecisionSize,
                "precisionSize");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectPropertyDAO.IsReadable,
                "isReadable");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectPropertyDAO.IsWritable,
                "isWritable");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectPropertyDAO.IsArray,
                "isArray");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IObjectPropertyDAO.ReferenceObjectId,
                "referenceObjectId");
        } // end if

        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN BUSINESS_OBJECT ON ( ");

        joinSQL.append(
            " OBJECT_PROPERTY.OBJECT_ID = BUSINESS_OBJECT.BUSINESS_OBJECT_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.modelbase.dao.IObjectPropertyDAO.EntityName;

        return objectProperty.querySelective(entityName, aQueryBean,
            joinSQL.toString());
    } // end queryObjectPropertysSelective()

    /**
     * Update Related IObjectProperty
     *
     * @param aObjectProperty {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void updateObjectProperty(
        com.ourteam.modelbase.dao.ObjectProperty aObjectProperty,
        BusinessObjectDAOQueryBean aQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN BUSINESS_OBJECT ON ( ");

        joinSQL.append(
            " OBJECT_PROPERTY.OBJECT_ID = BUSINESS_OBJECT.BUSINESS_OBJECT_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.modelbase.dao.IObjectPropertyDAO.EntityName;

        String[] entityFields = com.ourteam.modelbase.dao.impl.BaseObjectPropertyDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.modelbase.dao.impl.BaseObjectPropertyDAOJdbcImpl.ENTITY_PROPERTIES;

        objectProperty.updateByQuery(entityName, entityFields,
            entityProperties, joinSQL.toString(), aObjectProperty, aQueryBean);
    } // end updateObjectProperty()

    /**
     * Delete Related IObjectProperty
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void deleteObjectProperty(BusinessObjectDAOQueryBean aQueryBean)
        throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN BUSINESS_OBJECT ON ( ");

        joinSQL.append(
            " OBJECT_PROPERTY.OBJECT_ID = BUSINESS_OBJECT.BUSINESS_OBJECT_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.modelbase.dao.IObjectPropertyDAO.EntityName;

        objectProperty.deleteByQuery(entityName, joinSQL.toString(), aQueryBean);
    } // end deleteObjectProperty()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcBusinessObjectRowMapper
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
            BusinessObject object = new BusinessObject();

            int columnIndex = 1;

            try {
                Object BusinessObjectId = resultSet.getObject(columnIndex++);

                object.setBusinessObjectIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (BusinessObjectId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.BusinessObjectId, BusinessObjectId);
                } // end if

                Object Description = resultSet.getObject(columnIndex++);

                object.setDescriptionNull(resultSet.getBoolean(columnIndex++));

                if (Description != null) {
                    BeanUtils.setProperty(object, DataProperty.Description,
                        Description);
                } // end if

                Object GenerateOption = resultSet.getObject(columnIndex++);

                object.setGenerateOptionNull(resultSet.getBoolean(columnIndex++));

                if (GenerateOption != null) {
                    BeanUtils.setProperty(object, DataProperty.GenerateOption,
                        GenerateOption);
                } // end if

                Object Name = resultSet.getObject(columnIndex++);

                object.setNameNull(resultSet.getBoolean(columnIndex++));

                if (Name != null) {
                    BeanUtils.setProperty(object, DataProperty.Name, Name);
                } // end if

                Object PackageId = resultSet.getObject(columnIndex++);

                object.setPackageIdNull(resultSet.getBoolean(columnIndex++));

                if (PackageId != null) {
                    BeanUtils.setProperty(object, DataProperty.PackageId,
                        PackageId);
                } // end if

                Object State = resultSet.getObject(columnIndex++);

                object.setStateNull(resultSet.getBoolean(columnIndex++));

                if (State != null) {
                    BeanUtils.setProperty(object, DataProperty.State, State);
                } // end if

                Object Type = resultSet.getObject(columnIndex++);

                object.setTypeNull(resultSet.getBoolean(columnIndex++));

                if (Type != null) {
                    BeanUtils.setProperty(object, DataProperty.Type, Type);
                } // end if

                Object DomainId = resultSet.getObject(columnIndex++);

                object.setDomainIdNull(resultSet.getBoolean(columnIndex++));

                if (DomainId != null) {
                    BeanUtils.setProperty(object, DataProperty.DomainId,
                        DomainId);
                } // end if

                Object DomainName = resultSet.getObject(columnIndex++);

                object.setDomainNameNull(resultSet.getBoolean(columnIndex++));

                if (DomainName != null) {
                    BeanUtils.setProperty(object, DataProperty.DomainName,
                        DomainName);
                } // end if

                Object PackageName = resultSet.getObject(columnIndex++);

                object.setPackageNameNull(resultSet.getBoolean(columnIndex++));

                if (PackageName != null) {
                    BeanUtils.setProperty(object, DataProperty.PackageName,
                        PackageName);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcBusinessObjectRowMapper
} // end BaseBusinessObjectDAOJdbcImpl
