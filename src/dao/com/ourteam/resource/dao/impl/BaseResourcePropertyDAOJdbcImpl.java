/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.resource.dao.impl;

import com.ourteam.resource.dao.IResourcePropertyDAO;
import com.ourteam.resource.dao.ResourceProperty;
import com.ourteam.resource.dao.ResourcePropertyDAOQueryBean;

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
abstract public class BaseResourcePropertyDAOJdbcImpl extends AbstractJdbcDAO
    implements IResourcePropertyDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, Code, DataType, Name, Remarks, ResourceTypeId, SortIndex, Status,
            ResourceTypeCode, ResourceTypeName, ResourceTypeStatus
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.Code, DataProperty.DataType,
            DataProperty.Name, DataProperty.Remarks, DataProperty.ResourceTypeId,
            DataProperty.SortIndex, DataProperty.Status,
            DataProperty.ResourceTypeCode, DataProperty.ResourceTypeName,
            DataProperty.ResourceTypeStatus
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
     * Creates a new BaseResourcePropertyDAOJdbcImpl object.
     */
    public BaseResourcePropertyDAOJdbcImpl() {
        super();
    } // end BaseResourcePropertyDAOJdbcImpl()

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
                " LEFT JOIN RESOURCE_TYPE resourceTypeA ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " resourceTypeA.ID = RESOURCE_PROPERTY.RESOURCE_TYPE_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique ResourceProperty
     *
     * @param aResourceProperty
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(ResourceProperty aResourceProperty)
        throws Exception {
        if (aResourceProperty == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aResourceProperty,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IResourceProperty
     *
     * @param aResourceProperty
     *
     * @throws Exception
     */
    public void insertResourceProperty(ResourceProperty aResourceProperty)
        throws Exception {
        insert(aResourceProperty);
    } // end insertResourceProperty()

    /**
     * Batch Insert IResourceProperty
     *
     * @param aResourceProperty
     *
     * @throws Exception
     */
    public void batchInsertResourceProperty(
        ResourceProperty[] aResourceProperty) throws Exception {
        batchInsert(aResourceProperty);
    } // end batchInsertResourceProperty()

    /**
     * Delete IResourceProperty
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteResourceProperty(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteResourceProperty()

    /**
     * Delete IResourceProperty
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteResourceProperty(ResourcePropertyDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteResourceProperty()

    /**
     * Update IResourceProperty Selective
     *
     * @param aResourceProperty
     *
     * @throws Exception
     */
    public void updateResourceProperty(ResourceProperty aResourceProperty)
        throws Exception {
        if (aResourceProperty.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aResourceProperty);

        ResourceProperty tempObj = findResourcePropertyById(aResourceProperty.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aResourceProperty, tempObj);
        } // end if
    } // end updateResourceProperty()

    /**
     * Batch Update IResourceProperty
     *
     * @param aResourceProperty
     *
     * @throws Exception
     */
    public void batchUpdateResourceProperty(
        ResourceProperty[] aResourceProperty) throws Exception {
        batchUpdate(aResourceProperty);
    } // end batchUpdateResourceProperty()

    /**
     * Update IResourceProperty
     *
     * @param aResourceProperty
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateResourceProperty(ResourceProperty aResourceProperty,
        ResourcePropertyDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aResourceProperty, aQueryBean);
    } // end updateResourceProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aResourceProperty DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(ResourceProperty aResourceProperty)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aResourcePropertys DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeResourceProperty(
        ResourceProperty[] aResourcePropertys,
        ResourcePropertyDAOQueryBean aQueryBean) throws Exception {
        synchronizeResourceProperty(aResourcePropertys, aQueryBean, null);
    } // end synchronizeResourceProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aResourcePropertys DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeResourceProperty(
        ResourceProperty[] aResourcePropertys,
        ResourcePropertyDAOQueryBean aQueryBean,
        ResourcePropertySynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aResourcePropertys) == false) {
            inputList.addAll(Arrays.asList(aResourcePropertys));
        } // end if

        ResourceProperty[] existentResourcePropertys = this.queryResourceProperty(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentResourcePropertys) == false) {
            existentList.addAll(Arrays.asList(existentResourcePropertys));
        } // end if

        List willAddResourcePropertys = ListUtils.subtract(inputList,
                existentList);

        List willDeleteResourcePropertys = ListUtils.subtract(existentList,
                inputList);

        List willUpdateResourcePropertys = ListUtils.intersection(existentList,
                inputList);

        ResourceProperty[] willUpdateResourcePropertyArray = (ResourceProperty[]) willUpdateResourcePropertys.toArray(new ResourceProperty[willUpdateResourcePropertys.size()]);
        ResourceProperty[] willAddResourcePropertyArray = (ResourceProperty[]) willAddResourcePropertys.toArray(new ResourceProperty[willAddResourcePropertys.size()]);
        ResourceProperty[] willDeleteResourcePropertyArray = (ResourceProperty[]) willDeleteResourcePropertys.toArray(new ResourceProperty[willDeleteResourcePropertys.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddResourcePropertyArray,
                willUpdateResourcePropertyArray, willDeleteResourcePropertyArray);
        } // end if

        if (willUpdateResourcePropertys.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateResourcePropertyArray);
            } // end if

            this.batchUpdateResourceProperty(willUpdateResourcePropertyArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateResourcePropertyArray);
            } // end if
        } // end if

        if (willAddResourcePropertys.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddResourcePropertyArray);
            } // end if

            this.batchInsertResourceProperty(willAddResourcePropertyArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddResourcePropertyArray);
            } // end if
        } // end if

        if (willDeleteResourcePropertys.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteResourcePropertyArray);
            } // end if

            for (int i = 0; i < willDeleteResourcePropertyArray.length; i++) {
                ResourceProperty object = willDeleteResourcePropertyArray[i];
                this.deleteResourceProperty(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteResourcePropertyArray);
            } // end if
        } // end if
    } // end synchronizeResourceProperty()

    /**
     * Query IResourceProperty
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public ResourceProperty findResourcePropertyById(final long aId)
        throws Exception {
        ResourcePropertyDAOQueryBean queryBean = new ResourcePropertyDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        ResourceProperty[] ResourcePropertys = queryResourceProperty(queryBean);

        if (ResourcePropertys.length == 0) {
            return null;
        } // end if
        else {
            return ResourcePropertys[0];
        } // end else
    } // end findResourcePropertyById()

    /**
     * Query IResourceProperty
     *
     * @param queryBean
     *
     * @return IResourceProperty[]
     *
     * @throws Exception
     */
    public ResourceProperty[] queryResourceProperty(
        ResourcePropertyDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcResourcePropertyRowMapper());

        return (ResourceProperty[]) result.toArray(new ResourceProperty[result.size()]);
    } // end queryResourceProperty()

    /**
     * Query ResourceProperty Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryResourcePropertySelective(
        ResourcePropertyDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryResourcePropertySelective()

    /**
     * Query IResourceProperty Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryResourcePropertyCount(
        ResourcePropertyDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end queryResourcePropertyCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcResourcePropertyRowMapper
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
            ResourceProperty object = new ResourceProperty();

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

                Object DataType = resultSet.getObject(columnIndex++);

                object.setDataTypeNull(resultSet.getBoolean(columnIndex++));

                if (DataType != null) {
                    BeanUtils.setProperty(object, DataProperty.DataType,
                        DataType);
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

                Object SortIndex = resultSet.getObject(columnIndex++);

                object.setSortIndexNull(resultSet.getBoolean(columnIndex++));

                if (SortIndex != null) {
                    BeanUtils.setProperty(object, DataProperty.SortIndex,
                        SortIndex);
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
    } // end JdbcResourcePropertyRowMapper
} // end BaseResourcePropertyDAOJdbcImpl
