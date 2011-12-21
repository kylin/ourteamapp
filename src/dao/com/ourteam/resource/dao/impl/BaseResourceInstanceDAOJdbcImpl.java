/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.resource.dao.impl;

import com.ourteam.resource.dao.IResourceInstanceDAO;
import com.ourteam.resource.dao.ResourceInstance;
import com.ourteam.resource.dao.ResourceInstanceDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-08-31 10:49:53
 *
 * @author kylin
 */
abstract public class BaseResourceInstanceDAOJdbcImpl extends AbstractJdbcDAO
    implements IResourceInstanceDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, Code, Name, Remarks, ResourceTypeId, Status, ResourceTypeCode,
            ResourceTypeName, ResourceTypeStatus
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.Code, DataProperty.Name,
            DataProperty.Remarks, DataProperty.ResourceTypeId,
            DataProperty.Status, DataProperty.ResourceTypeCode,
            DataProperty.ResourceTypeName, DataProperty.ResourceTypeStatus
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
     * Creates a new BaseResourceInstanceDAOJdbcImpl object.
     */
    public BaseResourceInstanceDAOJdbcImpl() {
        super();
    } // end BaseResourceInstanceDAOJdbcImpl()

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
                " LEFT JOIN RESOURCE_TYPE resourceTypeB ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " resourceTypeB.ID = RESOURCE_INSTANCE.RESOURCE_TYPE_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique ResourceInstance
     *
     * @param aResourceInstance
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(ResourceInstance aResourceInstance)
        throws Exception {
        if (aResourceInstance == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aResourceInstance,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IResourceInstance
     *
     * @param aResourceInstance
     *
     * @throws Exception
     */
    public void insertResourceInstance(ResourceInstance aResourceInstance)
        throws Exception {
        insert(aResourceInstance);
    } // end insertResourceInstance()

    /**
     * Batch Insert IResourceInstance
     *
     * @param aResourceInstance
     *
     * @throws Exception
     */
    public void batchInsertResourceInstance(
        ResourceInstance[] aResourceInstance) throws Exception {
        batchInsert(aResourceInstance);
    } // end batchInsertResourceInstance()

    /**
     * Delete IResourceInstance
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteResourceInstance(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteResourceInstance()

    /**
     * Delete IResourceInstance
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteResourceInstance(ResourceInstanceDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteResourceInstance()

    /**
     * Update IResourceInstance Selective
     *
     * @param aResourceInstance
     *
     * @throws Exception
     */
    public void updateResourceInstance(ResourceInstance aResourceInstance)
        throws Exception {
        if (aResourceInstance.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aResourceInstance);

        ResourceInstance tempObj = findResourceInstanceById(aResourceInstance.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aResourceInstance, tempObj);
        } // end if
    } // end updateResourceInstance()

    /**
     * Batch Update IResourceInstance
     *
     * @param aResourceInstance
     *
     * @throws Exception
     */
    public void batchUpdateResourceInstance(
        ResourceInstance[] aResourceInstance) throws Exception {
        batchUpdate(aResourceInstance);
    } // end batchUpdateResourceInstance()

    /**
     * Update IResourceInstance
     *
     * @param aResourceInstance
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateResourceInstance(ResourceInstance aResourceInstance,
        ResourceInstanceDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aResourceInstance, aQueryBean);
    } // end updateResourceInstance()

    /**
     * DOCUMENT ME!
     *
     * @param aResourceInstance DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(ResourceInstance aResourceInstance)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aResourceInstances DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeResourceInstance(
        ResourceInstance[] aResourceInstances,
        ResourceInstanceDAOQueryBean aQueryBean) throws Exception {
        synchronizeResourceInstance(aResourceInstances, aQueryBean, null);
    } // end synchronizeResourceInstance()

    /**
     * DOCUMENT ME!
     *
     * @param aResourceInstances DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeResourceInstance(
        ResourceInstance[] aResourceInstances,
        ResourceInstanceDAOQueryBean aQueryBean,
        ResourceInstanceSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aResourceInstances) == false) {
            inputList.addAll(Arrays.asList(aResourceInstances));
        } // end if

        ResourceInstance[] existentResourceInstances = this.queryResourceInstance(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentResourceInstances) == false) {
            existentList.addAll(Arrays.asList(existentResourceInstances));
        } // end if

        List willAddResourceInstances = ListUtils.subtract(inputList,
                existentList);

        List willDeleteResourceInstances = ListUtils.subtract(existentList,
                inputList);

        List willUpdateResourceInstances = ListUtils.intersection(existentList,
                inputList);

        ResourceInstance[] willUpdateResourceInstanceArray = (ResourceInstance[]) willUpdateResourceInstances.toArray(new ResourceInstance[willUpdateResourceInstances.size()]);
        ResourceInstance[] willAddResourceInstanceArray = (ResourceInstance[]) willAddResourceInstances.toArray(new ResourceInstance[willAddResourceInstances.size()]);
        ResourceInstance[] willDeleteResourceInstanceArray = (ResourceInstance[]) willDeleteResourceInstances.toArray(new ResourceInstance[willDeleteResourceInstances.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddResourceInstanceArray,
                willUpdateResourceInstanceArray, willDeleteResourceInstanceArray);
        } // end if

        if (willUpdateResourceInstances.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateResourceInstanceArray);
            } // end if

            this.batchUpdateResourceInstance(willUpdateResourceInstanceArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateResourceInstanceArray);
            } // end if
        } // end if

        if (willAddResourceInstances.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddResourceInstanceArray);
            } // end if

            this.batchInsertResourceInstance(willAddResourceInstanceArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddResourceInstanceArray);
            } // end if
        } // end if

        if (willDeleteResourceInstances.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteResourceInstanceArray);
            } // end if

            for (int i = 0; i < willDeleteResourceInstanceArray.length; i++) {
                ResourceInstance object = willDeleteResourceInstanceArray[i];
                this.deleteResourceInstance(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteResourceInstanceArray);
            } // end if
        } // end if
    } // end synchronizeResourceInstance()

    /**
     * Query IResourceInstance
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public ResourceInstance findResourceInstanceById(final long aId)
        throws Exception {
        ResourceInstanceDAOQueryBean queryBean = new ResourceInstanceDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        ResourceInstance[] ResourceInstances = queryResourceInstance(queryBean);

        if (ResourceInstances.length == 0) {
            return null;
        } // end if
        else {
            return ResourceInstances[0];
        } // end else
    } // end findResourceInstanceById()

    /**
     * Query IResourceInstance
     *
     * @param queryBean
     *
     * @return IResourceInstance[]
     *
     * @throws Exception
     */
    public ResourceInstance[] queryResourceInstance(
        ResourceInstanceDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcResourceInstanceRowMapper());

        return (ResourceInstance[]) result.toArray(new ResourceInstance[result.size()]);
    } // end queryResourceInstance()

    /**
     * Query ResourceInstance Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryResourceInstanceSelective(
        ResourceInstanceDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryResourceInstanceSelective()

    /**
     * Query IResourceInstance Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryResourceInstanceCount(
        ResourceInstanceDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end queryResourceInstanceCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcResourceInstanceRowMapper
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
            ResourceInstance object = new ResourceInstance();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object Code = resultSet.getObject(columnIndex++);

                object.setCodeNull(resultSet.getBoolean(columnIndex++));

                if (Code != null) {
                    BeanUtils.setProperty(object, DataProperty.Code, Code);
                } // end if

                Object Name = resultSet.getObject(columnIndex++);

                object.setNameNull(resultSet.getBoolean(columnIndex++));

                if (Name != null) {
                    BeanUtils.setProperty(object, DataProperty.Name, Name);
                } // end if

                Object Remarks = resultSet.getObject(columnIndex++);

                object.setRemarksNull(resultSet.getBoolean(columnIndex++));

                if (Remarks != null) {
                    BeanUtils.setProperty(object, DataProperty.Remarks, Remarks);
                } // end if

                Object ResourceTypeId = resultSet.getObject(columnIndex++);

                object.setResourceTypeIdNull(resultSet.getBoolean(columnIndex++));

                if (ResourceTypeId != null) {
                    BeanUtils.setProperty(object, DataProperty.ResourceTypeId,
                        ResourceTypeId);
                } // end if

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object ResourceTypeCode = resultSet.getObject(columnIndex++);

                object.setResourceTypeCodeNull(resultSet.getBoolean(
                        columnIndex++));

                if (ResourceTypeCode != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ResourceTypeCode, ResourceTypeCode);
                } // end if

                Object ResourceTypeName = resultSet.getObject(columnIndex++);

                object.setResourceTypeNameNull(resultSet.getBoolean(
                        columnIndex++));

                if (ResourceTypeName != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ResourceTypeName, ResourceTypeName);
                } // end if

                Object ResourceTypeStatus = resultSet.getObject(columnIndex++);

                object.setResourceTypeStatusNull(resultSet.getBoolean(
                        columnIndex++));

                if (ResourceTypeStatus != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ResourceTypeStatus, ResourceTypeStatus);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcResourceInstanceRowMapper
} // end BaseResourceInstanceDAOJdbcImpl
