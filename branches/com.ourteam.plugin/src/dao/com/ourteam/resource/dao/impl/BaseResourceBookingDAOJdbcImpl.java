/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.resource.dao.impl;

import com.ourteam.resource.dao.IResourceBookingDAO;
import com.ourteam.resource.dao.ResourceBooking;
import com.ourteam.resource.dao.ResourceBookingDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-09-13 17:57:46
 *
 * @author kylin
 */
abstract public class BaseResourceBookingDAOJdbcImpl extends AbstractJdbcDAO
    implements IResourceBookingDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, EndTime, Remarks, ResourceInstanceId, ResourceTypeId, StartTime,
            Status, ResourceInstanceCode, ResourceInstanceName,
            ResourceInstanceStatus, ResourceTypeCode, ResourceTypeName, UserId,
            UserName
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.EndTime, DataProperty.Remarks,
            DataProperty.ResourceInstanceId, DataProperty.ResourceTypeId,
            DataProperty.StartTime, DataProperty.Status,
            DataProperty.ResourceInstanceCode, DataProperty.ResourceInstanceName,
            DataProperty.ResourceInstanceStatus, DataProperty.ResourceTypeCode,
            DataProperty.ResourceTypeName, DataProperty.UserId,
            DataProperty.UserName
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
     * Creates a new BaseResourceBookingDAOJdbcImpl object.
     */
    public BaseResourceBookingDAOJdbcImpl() {
        super();
    } // end BaseResourceBookingDAOJdbcImpl()

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
                " LEFT JOIN RESOURCE_INSTANCE ResourceInstanceE ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " ResourceInstanceE.ID = RESOURCE_BOOKING.RESOURCE_INSTANCE_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQLBuffer.append(
                " LEFT JOIN RESOURCE_TYPE ResourceTypeE ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " ResourceTypeE.ID = RESOURCE_BOOKING.RESOURCE_TYPE_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQLBuffer.append(" LEFT JOIN SYS_USER sysUserE ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " sysUserE.ID = RESOURCE_BOOKING.USER_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique ResourceBooking
     *
     * @param aResourceBooking
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(ResourceBooking aResourceBooking)
        throws Exception {
        if (aResourceBooking == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aResourceBooking,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IResourceBooking
     *
     * @param aResourceBooking
     *
     * @throws Exception
     */
    public void insertResourceBooking(ResourceBooking aResourceBooking)
        throws Exception {
        insert(aResourceBooking);
    } // end insertResourceBooking()

    /**
     * Batch Insert IResourceBooking
     *
     * @param aResourceBooking
     *
     * @throws Exception
     */
    public void batchInsertResourceBooking(ResourceBooking[] aResourceBooking)
        throws Exception {
        batchInsert(aResourceBooking);
    } // end batchInsertResourceBooking()

    /**
     * Delete IResourceBooking
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteResourceBooking(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteResourceBooking()

    /**
     * Delete IResourceBooking
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteResourceBooking(ResourceBookingDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteResourceBooking()

    /**
     * Update IResourceBooking Selective
     *
     * @param aResourceBooking
     *
     * @throws Exception
     */
    public void updateResourceBooking(ResourceBooking aResourceBooking)
        throws Exception {
        if (aResourceBooking.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aResourceBooking);

        ResourceBooking tempObj = findResourceBookingById(aResourceBooking.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aResourceBooking, tempObj);
        } // end if
    } // end updateResourceBooking()

    /**
     * Batch Update IResourceBooking
     *
     * @param aResourceBooking
     *
     * @throws Exception
     */
    public void batchUpdateResourceBooking(ResourceBooking[] aResourceBooking)
        throws Exception {
        batchUpdate(aResourceBooking);
    } // end batchUpdateResourceBooking()

    /**
     * Update IResourceBooking
     *
     * @param aResourceBooking
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateResourceBooking(ResourceBooking aResourceBooking,
        ResourceBookingDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aResourceBooking, aQueryBean);
    } // end updateResourceBooking()

    /**
     * DOCUMENT ME!
     *
     * @param aResourceBooking DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(ResourceBooking aResourceBooking)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aResourceBookings DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeResourceBooking(
        ResourceBooking[] aResourceBookings,
        ResourceBookingDAOQueryBean aQueryBean) throws Exception {
        synchronizeResourceBooking(aResourceBookings, aQueryBean, null);
    } // end synchronizeResourceBooking()

    /**
     * DOCUMENT ME!
     *
     * @param aResourceBookings DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeResourceBooking(
        ResourceBooking[] aResourceBookings,
        ResourceBookingDAOQueryBean aQueryBean,
        ResourceBookingSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aResourceBookings) == false) {
            inputList.addAll(Arrays.asList(aResourceBookings));
        } // end if

        ResourceBooking[] existentResourceBookings = this.queryResourceBooking(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentResourceBookings) == false) {
            existentList.addAll(Arrays.asList(existentResourceBookings));
        } // end if

        List willAddResourceBookings = ListUtils.subtract(inputList,
                existentList);

        List willDeleteResourceBookings = ListUtils.subtract(existentList,
                inputList);

        List willUpdateResourceBookings = ListUtils.intersection(existentList,
                inputList);

        ResourceBooking[] willUpdateResourceBookingArray = (ResourceBooking[]) willUpdateResourceBookings.toArray(new ResourceBooking[willUpdateResourceBookings.size()]);
        ResourceBooking[] willAddResourceBookingArray = (ResourceBooking[]) willAddResourceBookings.toArray(new ResourceBooking[willAddResourceBookings.size()]);
        ResourceBooking[] willDeleteResourceBookingArray = (ResourceBooking[]) willDeleteResourceBookings.toArray(new ResourceBooking[willDeleteResourceBookings.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddResourceBookingArray,
                willUpdateResourceBookingArray, willDeleteResourceBookingArray);
        } // end if

        if (willUpdateResourceBookings.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateResourceBookingArray);
            } // end if

            this.batchUpdateResourceBooking(willUpdateResourceBookingArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateResourceBookingArray);
            } // end if
        } // end if

        if (willAddResourceBookings.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddResourceBookingArray);
            } // end if

            this.batchInsertResourceBooking(willAddResourceBookingArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddResourceBookingArray);
            } // end if
        } // end if

        if (willDeleteResourceBookings.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteResourceBookingArray);
            } // end if

            for (int i = 0; i < willDeleteResourceBookingArray.length; i++) {
                ResourceBooking object = willDeleteResourceBookingArray[i];
                this.deleteResourceBooking(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteResourceBookingArray);
            } // end if
        } // end if
    } // end synchronizeResourceBooking()

    /**
     * Query IResourceBooking
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public ResourceBooking findResourceBookingById(final long aId)
        throws Exception {
        ResourceBookingDAOQueryBean queryBean = new ResourceBookingDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        ResourceBooking[] ResourceBookings = queryResourceBooking(queryBean);

        if (ResourceBookings.length == 0) {
            return null;
        } // end if
        else {
            return ResourceBookings[0];
        } // end else
    } // end findResourceBookingById()

    /**
     * Query IResourceBooking
     *
     * @param queryBean
     *
     * @return IResourceBooking[]
     *
     * @throws Exception
     */
    public ResourceBooking[] queryResourceBooking(
        ResourceBookingDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcResourceBookingRowMapper());

        return (ResourceBooking[]) result.toArray(new ResourceBooking[result.size()]);
    } // end queryResourceBooking()

    /**
     * Query ResourceBooking Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryResourceBookingSelective(
        ResourceBookingDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryResourceBookingSelective()

    /**
     * Query IResourceBooking Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryResourceBookingCount(ResourceBookingDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryResourceBookingCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcResourceBookingRowMapper
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
            ResourceBooking object = new ResourceBooking();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object EndTime = resultSet.getObject(columnIndex++);

                object.setEndTimeNull(resultSet.getBoolean(columnIndex++));

                if (EndTime != null) {
                    BeanUtils.setProperty(object, DataProperty.EndTime, EndTime);
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

                Object ResourceTypeId = resultSet.getObject(columnIndex++);

                object.setResourceTypeIdNull(resultSet.getBoolean(columnIndex++));

                if (ResourceTypeId != null) {
                    BeanUtils.setProperty(object, DataProperty.ResourceTypeId,
                        ResourceTypeId);
                } // end if

                Object StartTime = resultSet.getObject(columnIndex++);

                object.setStartTimeNull(resultSet.getBoolean(columnIndex++));

                if (StartTime != null) {
                    BeanUtils.setProperty(object, DataProperty.StartTime,
                        StartTime);
                } // end if

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object ResourceInstanceCode = resultSet.getObject(columnIndex++);

                object.setResourceInstanceCodeNull(resultSet.getBoolean(
                        columnIndex++));

                if (ResourceInstanceCode != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ResourceInstanceCode, ResourceInstanceCode);
                } // end if

                Object ResourceInstanceName = resultSet.getObject(columnIndex++);

                object.setResourceInstanceNameNull(resultSet.getBoolean(
                        columnIndex++));

                if (ResourceInstanceName != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ResourceInstanceName, ResourceInstanceName);
                } // end if

                Object ResourceInstanceStatus = resultSet.getObject(columnIndex++);

                object.setResourceInstanceStatusNull(resultSet.getBoolean(
                        columnIndex++));

                if (ResourceInstanceStatus != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ResourceInstanceStatus,
                        ResourceInstanceStatus);
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

                Object UserId = resultSet.getObject(columnIndex++);

                object.setUserIdNull(resultSet.getBoolean(columnIndex++));

                if (UserId != null) {
                    BeanUtils.setProperty(object, DataProperty.UserId, UserId);
                } // end if

                Object UserName = resultSet.getObject(columnIndex++);

                object.setUserNameNull(resultSet.getBoolean(columnIndex++));

                if (UserName != null) {
                    BeanUtils.setProperty(object, DataProperty.UserName,
                        UserName);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcResourceBookingRowMapper
} // end BaseResourceBookingDAOJdbcImpl
