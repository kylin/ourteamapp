/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.resource.dao.impl;

import com.ourteam.resource.dao.IResourcePropertyInstanceDAO;
import com.ourteam.resource.dao.ResourcePropertyInstance;
import com.ourteam.resource.dao.ResourcePropertyInstanceDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-09-01 17:17:11
 *
 * @author kylin
 */
abstract public class BaseResourcePropertyInstanceDAOJdbcImpl
    extends AbstractJdbcDAO implements IResourcePropertyInstanceDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, Remarks, ResourceInstanceId, ResourcePropertyId, Status, Value,
            PropertyCode, PropertyName, PropertyDataType, PropertySortIndex,
            PropertyStatus, ResourceTypeId
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.Remarks,
            DataProperty.ResourceInstanceId, DataProperty.ResourcePropertyId,
            DataProperty.Status, DataProperty.Value, DataProperty.PropertyCode,
            DataProperty.PropertyName, DataProperty.PropertyDataType,
            DataProperty.PropertySortIndex, DataProperty.PropertyStatus,
            DataProperty.ResourceTypeId
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PK_FIELDS = new String[] { Id };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_AUTO_GEN_PK_FIELDS = new String[] { Id };

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
     * Creates a new BaseResourcePropertyInstanceDAOJdbcImpl object.
     */
    public BaseResourcePropertyInstanceDAOJdbcImpl() {
        super();
    } // end BaseResourcePropertyInstanceDAOJdbcImpl()

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
                " LEFT JOIN RESOURCE_PROPERTY resourcePropertyC ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " resourcePropertyC.ID = RESOURCE_PROPERTY_INSTANCE.RESOURCE_PROPERTY_ID ");

            relatedJoinSQLBuffer.append(" AND ");
            relatedJoinSQLBuffer.append(
                " resourcePropertyC.RESOURCE_TYPE_ID = RESOURCE_PROPERTY_INSTANCE.RESOURCE_TYPE_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique ResourcePropertyInstance
     *
     * @param aResourcePropertyInstance
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(
        ResourcePropertyInstance aResourcePropertyInstance)
        throws Exception {
        if (aResourcePropertyInstance == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aResourcePropertyInstance,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IResourcePropertyInstance
     *
     * @param aResourcePropertyInstance
     *
     * @throws Exception
     */
    public void insertResourcePropertyInstance(
        ResourcePropertyInstance aResourcePropertyInstance)
        throws Exception {
        insert(aResourcePropertyInstance);
    } // end insertResourcePropertyInstance()

    /**
     * Batch Insert IResourcePropertyInstance
     *
     * @param aResourcePropertyInstance
     *
     * @throws Exception
     */
    public void batchInsertResourcePropertyInstance(
        ResourcePropertyInstance[] aResourcePropertyInstance)
        throws Exception {
        batchInsert(aResourcePropertyInstance);
    } // end batchInsertResourcePropertyInstance()

    /**
     * Delete IResourcePropertyInstance
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteResourcePropertyInstance(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteResourcePropertyInstance()

    /**
     * Delete IResourcePropertyInstance
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteResourcePropertyInstance(
        ResourcePropertyInstanceDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteResourcePropertyInstance()

    /**
     * Update IResourcePropertyInstance Selective
     *
     * @param aResourcePropertyInstance
     *
     * @throws Exception
     */
    public void updateResourcePropertyInstance(
        ResourcePropertyInstance aResourcePropertyInstance)
        throws Exception {
        if (aResourcePropertyInstance.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aResourcePropertyInstance);

        ResourcePropertyInstance tempObj = findResourcePropertyInstanceById(aResourcePropertyInstance.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aResourcePropertyInstance, tempObj);
        } // end if
    } // end updateResourcePropertyInstance()

    /**
     * Batch Update IResourcePropertyInstance
     *
     * @param aResourcePropertyInstance
     *
     * @throws Exception
     */
    public void batchUpdateResourcePropertyInstance(
        ResourcePropertyInstance[] aResourcePropertyInstance)
        throws Exception {
        batchUpdate(aResourcePropertyInstance);
    } // end batchUpdateResourcePropertyInstance()

    /**
     * Update IResourcePropertyInstance
     *
     * @param aResourcePropertyInstance
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateResourcePropertyInstance(
        ResourcePropertyInstance aResourcePropertyInstance,
        ResourcePropertyInstanceDAOQueryBean aQueryBean)
        throws Exception {
        updateByQuery(aResourcePropertyInstance, aQueryBean);
    } // end updateResourcePropertyInstance()

    /**
     * DOCUMENT ME!
     *
     * @param aResourcePropertyInstance DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(
        ResourcePropertyInstance aResourcePropertyInstance)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aResourcePropertyInstances DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeResourcePropertyInstance(
        ResourcePropertyInstance[] aResourcePropertyInstances,
        ResourcePropertyInstanceDAOQueryBean aQueryBean)
        throws Exception {
        synchronizeResourcePropertyInstance(aResourcePropertyInstances,
            aQueryBean, null);
    } // end synchronizeResourcePropertyInstance()

    /**
     * DOCUMENT ME!
     *
     * @param aResourcePropertyInstances DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeResourcePropertyInstance(
        ResourcePropertyInstance[] aResourcePropertyInstances,
        ResourcePropertyInstanceDAOQueryBean aQueryBean,
        ResourcePropertyInstanceSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aResourcePropertyInstances) == false) {
            inputList.addAll(Arrays.asList(aResourcePropertyInstances));
        } // end if

        ResourcePropertyInstance[] existentResourcePropertyInstances = this.queryResourcePropertyInstance(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentResourcePropertyInstances) == false) {
            existentList.addAll(Arrays.asList(existentResourcePropertyInstances));
        } // end if

        List willAddResourcePropertyInstances = ListUtils.subtract(inputList,
                existentList);

        List willDeleteResourcePropertyInstances = ListUtils.subtract(existentList,
                inputList);

        List willUpdateResourcePropertyInstances = ListUtils.intersection(existentList,
                inputList);

        ResourcePropertyInstance[] willUpdateResourcePropertyInstanceArray = (ResourcePropertyInstance[]) willUpdateResourcePropertyInstances.toArray(new ResourcePropertyInstance[willUpdateResourcePropertyInstances.size()]);
        ResourcePropertyInstance[] willAddResourcePropertyInstanceArray = (ResourcePropertyInstance[]) willAddResourcePropertyInstances.toArray(new ResourcePropertyInstance[willAddResourcePropertyInstances.size()]);
        ResourcePropertyInstance[] willDeleteResourcePropertyInstanceArray = (ResourcePropertyInstance[]) willDeleteResourcePropertyInstances.toArray(new ResourcePropertyInstance[willDeleteResourcePropertyInstances.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddResourcePropertyInstanceArray,
                willUpdateResourcePropertyInstanceArray,
                willDeleteResourcePropertyInstanceArray);
        } // end if

        if (willUpdateResourcePropertyInstances.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateResourcePropertyInstanceArray);
            } // end if

            this.batchUpdateResourcePropertyInstance(willUpdateResourcePropertyInstanceArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateResourcePropertyInstanceArray);
            } // end if
        } // end if

        if (willAddResourcePropertyInstances.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddResourcePropertyInstanceArray);
            } // end if

            this.batchInsertResourcePropertyInstance(willAddResourcePropertyInstanceArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddResourcePropertyInstanceArray);
            } // end if
        } // end if

        if (willDeleteResourcePropertyInstances.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteResourcePropertyInstanceArray);
            } // end if

            for (int i = 0; i < willDeleteResourcePropertyInstanceArray.length;
                    i++) {
                ResourcePropertyInstance object = willDeleteResourcePropertyInstanceArray[i];
                this.deleteResourcePropertyInstance(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteResourcePropertyInstanceArray);
            } // end if
        } // end if
    } // end synchronizeResourcePropertyInstance()

    /**
     * Query IResourcePropertyInstance
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public ResourcePropertyInstance findResourcePropertyInstanceById(
        final long aId) throws Exception {
        ResourcePropertyInstanceDAOQueryBean queryBean = new ResourcePropertyInstanceDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        ResourcePropertyInstance[] ResourcePropertyInstances = queryResourcePropertyInstance(queryBean);

        if (ResourcePropertyInstances.length == 0) {
            return null;
        } // end if
        else {
            return ResourcePropertyInstances[0];
        } // end else
    } // end findResourcePropertyInstanceById()

    /**
     * Query IResourcePropertyInstance
     *
     * @param queryBean
     *
     * @return IResourcePropertyInstance[]
     *
     * @throws Exception
     */
    public ResourcePropertyInstance[] queryResourcePropertyInstance(
        ResourcePropertyInstanceDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean,
                new JdbcResourcePropertyInstanceRowMapper());

        return (ResourcePropertyInstance[]) result.toArray(new ResourcePropertyInstance[result.size()]);
    } // end queryResourcePropertyInstance()

    /**
     * Query ResourcePropertyInstance Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryResourcePropertyInstanceSelective(
        ResourcePropertyInstanceDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryResourcePropertyInstanceSelective()

    /**
     * Query IResourcePropertyInstance Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryResourcePropertyInstanceCount(
        ResourcePropertyInstanceDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryResourcePropertyInstanceCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcResourcePropertyInstanceRowMapper
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
            ResourcePropertyInstance object = new ResourcePropertyInstance();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object Remarks = resultSet.getObject(columnIndex++);

                object.setRemarksNull(resultSet.getBoolean(columnIndex++));

                if (Remarks != null) {
                    BeanUtils.setProperty(object, DataProperty.Remarks, Remarks);
                } // end if

                Object ResourceInstanceId = resultSet.getObject(columnIndex++);

                object.setResourceInstanceIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (ResourceInstanceId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ResourceInstanceId, ResourceInstanceId);
                } // end if

                Object ResourcePropertyId = resultSet.getObject(columnIndex++);

                object.setResourcePropertyIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (ResourcePropertyId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ResourcePropertyId, ResourcePropertyId);
                } // end if

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object Value = resultSet.getObject(columnIndex++);

                object.setValueNull(resultSet.getBoolean(columnIndex++));

                if (Value != null) {
                    BeanUtils.setProperty(object, DataProperty.Value, Value);
                } // end if

                Object PropertyCode = resultSet.getObject(columnIndex++);

                object.setPropertyCodeNull(resultSet.getBoolean(columnIndex++));

                if (PropertyCode != null) {
                    BeanUtils.setProperty(object, DataProperty.PropertyCode,
                        PropertyCode);
                } // end if

                Object PropertyName = resultSet.getObject(columnIndex++);

                object.setPropertyNameNull(resultSet.getBoolean(columnIndex++));

                if (PropertyName != null) {
                    BeanUtils.setProperty(object, DataProperty.PropertyName,
                        PropertyName);
                } // end if

                Object PropertyDataType = resultSet.getObject(columnIndex++);

                object.setPropertyDataTypeNull(resultSet.getBoolean(
                        columnIndex++));

                if (PropertyDataType != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.PropertyDataType, PropertyDataType);
                } // end if

                Object PropertySortIndex = resultSet.getObject(columnIndex++);

                object.setPropertySortIndexNull(resultSet.getBoolean(
                        columnIndex++));

                if (PropertySortIndex != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.PropertySortIndex, PropertySortIndex);
                } // end if

                Object PropertyStatus = resultSet.getObject(columnIndex++);

                object.setPropertyStatusNull(resultSet.getBoolean(columnIndex++));

                if (PropertyStatus != null) {
                    BeanUtils.setProperty(object, DataProperty.PropertyStatus,
                        PropertyStatus);
                } // end if

                Object ResourceTypeId = resultSet.getObject(columnIndex++);

                object.setResourceTypeIdNull(resultSet.getBoolean(columnIndex++));

                if (ResourceTypeId != null) {
                    BeanUtils.setProperty(object, DataProperty.ResourceTypeId,
                        ResourceTypeId);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcResourcePropertyInstanceRowMapper
} // end BaseResourcePropertyInstanceDAOJdbcImpl
