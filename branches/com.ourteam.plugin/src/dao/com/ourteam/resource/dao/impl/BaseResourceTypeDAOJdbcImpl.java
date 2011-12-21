/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.resource.dao.impl;

import com.ourteam.resource.dao.IResourceTypeDAO;
import com.ourteam.resource.dao.ResourceType;
import com.ourteam.resource.dao.ResourceTypeDAOQueryBean;

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
abstract public class BaseResourceTypeDAOJdbcImpl extends AbstractJdbcDAO
    implements IResourceTypeDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, Code, Name, Remarks, Status
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.Code, DataProperty.Name,
            DataProperty.Remarks, DataProperty.Status
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
     * Creates a new BaseResourceTypeDAOJdbcImpl object.
     */
    public BaseResourceTypeDAOJdbcImpl() {
        super();
    } // end BaseResourceTypeDAOJdbcImpl()

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

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique ResourceType
     *
     * @param aResourceType
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(ResourceType aResourceType)
        throws Exception {
        if (aResourceType == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aResourceType, DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IResourceType
     *
     * @param aResourceType
     *
     * @throws Exception
     */
    public void insertResourceType(ResourceType aResourceType)
        throws Exception {
        insert(aResourceType);
    } // end insertResourceType()

    /**
     * Batch Insert IResourceType
     *
     * @param aResourceType
     *
     * @throws Exception
     */
    public void batchInsertResourceType(ResourceType[] aResourceType)
        throws Exception {
        batchInsert(aResourceType);
    } // end batchInsertResourceType()

    /**
     * Delete IResourceType
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteResourceType(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteResourceType()

    /**
     * Delete IResourceType
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteResourceType(ResourceTypeDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteResourceType()

    /**
     * Update IResourceType Selective
     *
     * @param aResourceType
     *
     * @throws Exception
     */
    public void updateResourceType(ResourceType aResourceType)
        throws Exception {
        if (aResourceType.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aResourceType);

        ResourceType tempObj = findResourceTypeById(aResourceType.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aResourceType, tempObj);
        } // end if
    } // end updateResourceType()

    /**
     * Batch Update IResourceType
     *
     * @param aResourceType
     *
     * @throws Exception
     */
    public void batchUpdateResourceType(ResourceType[] aResourceType)
        throws Exception {
        batchUpdate(aResourceType);
    } // end batchUpdateResourceType()

    /**
     * Update IResourceType
     *
     * @param aResourceType
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateResourceType(ResourceType aResourceType,
        ResourceTypeDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aResourceType, aQueryBean);
    } // end updateResourceType()

    /**
     * DOCUMENT ME!
     *
     * @param aResourceType DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(ResourceType aResourceType)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aResourceTypes DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeResourceType(ResourceType[] aResourceTypes,
        ResourceTypeDAOQueryBean aQueryBean) throws Exception {
        synchronizeResourceType(aResourceTypes, aQueryBean, null);
    } // end synchronizeResourceType()

    /**
     * DOCUMENT ME!
     *
     * @param aResourceTypes DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeResourceType(ResourceType[] aResourceTypes,
        ResourceTypeDAOQueryBean aQueryBean,
        ResourceTypeSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aResourceTypes) == false) {
            inputList.addAll(Arrays.asList(aResourceTypes));
        } // end if

        ResourceType[] existentResourceTypes = this.queryResourceType(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentResourceTypes) == false) {
            existentList.addAll(Arrays.asList(existentResourceTypes));
        } // end if

        List willAddResourceTypes = ListUtils.subtract(inputList, existentList);

        List willDeleteResourceTypes = ListUtils.subtract(existentList,
                inputList);

        List willUpdateResourceTypes = ListUtils.intersection(existentList,
                inputList);

        ResourceType[] willUpdateResourceTypeArray = (ResourceType[]) willUpdateResourceTypes.toArray(new ResourceType[willUpdateResourceTypes.size()]);
        ResourceType[] willAddResourceTypeArray = (ResourceType[]) willAddResourceTypes.toArray(new ResourceType[willAddResourceTypes.size()]);
        ResourceType[] willDeleteResourceTypeArray = (ResourceType[]) willDeleteResourceTypes.toArray(new ResourceType[willDeleteResourceTypes.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddResourceTypeArray,
                willUpdateResourceTypeArray, willDeleteResourceTypeArray);
        } // end if

        if (willUpdateResourceTypes.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateResourceTypeArray);
            } // end if

            this.batchUpdateResourceType(willUpdateResourceTypeArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateResourceTypeArray);
            } // end if
        } // end if

        if (willAddResourceTypes.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddResourceTypeArray);
            } // end if

            this.batchInsertResourceType(willAddResourceTypeArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddResourceTypeArray);
            } // end if
        } // end if

        if (willDeleteResourceTypes.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteResourceTypeArray);
            } // end if

            for (int i = 0; i < willDeleteResourceTypeArray.length; i++) {
                ResourceType object = willDeleteResourceTypeArray[i];
                this.deleteResourceType(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteResourceTypeArray);
            } // end if
        } // end if
    } // end synchronizeResourceType()

    /**
     * Query IResourceType
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public ResourceType findResourceTypeById(final long aId)
        throws Exception {
        ResourceTypeDAOQueryBean queryBean = new ResourceTypeDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        ResourceType[] ResourceTypes = queryResourceType(queryBean);

        if (ResourceTypes.length == 0) {
            return null;
        } // end if
        else {
            return ResourceTypes[0];
        } // end else
    } // end findResourceTypeById()

    /**
     * Query IResourceType
     *
     * @param queryBean
     *
     * @return IResourceType[]
     *
     * @throws Exception
     */
    public ResourceType[] queryResourceType(ResourceTypeDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean, new JdbcResourceTypeRowMapper());

        return (ResourceType[]) result.toArray(new ResourceType[result.size()]);
    } // end queryResourceType()

    /**
     * Query ResourceType Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryResourceTypeSelective(ResourceTypeDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryResourceTypeSelective()

    /**
     * Query IResourceType Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryResourceTypeCount(ResourceTypeDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryResourceTypeCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcResourceTypeRowMapper
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
            ResourceType object = new ResourceType();

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

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcResourceTypeRowMapper
} // end BaseResourceTypeDAOJdbcImpl
