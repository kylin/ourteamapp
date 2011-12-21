/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.business.dao.impl;

import com.ourteam.business.dao.IMeetingResourceDAO;
import com.ourteam.business.dao.MeetingResource;
import com.ourteam.business.dao.MeetingResourceDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-09-02 11:25:13
 *
 * @author kylin
 */
abstract public class BaseMeetingResourceDAOJdbcImpl extends AbstractJdbcDAO
    implements IMeetingResourceDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, MeetingId, Remarks, ResourceId, Status, ResourceCode,
            ResourceName
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.MeetingId, DataProperty.Remarks,
            DataProperty.ResourceId, DataProperty.Status,
            DataProperty.ResourceCode, DataProperty.ResourceName
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
     * Creates a new BaseMeetingResourceDAOJdbcImpl object.
     */
    public BaseMeetingResourceDAOJdbcImpl() {
        super();
    } // end BaseMeetingResourceDAOJdbcImpl()

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
                " LEFT JOIN RESOURCE_INSTANCE resourceA ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " resourceA.ID = MEETING_RESOURCE.RESOURCE_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique MeetingResource
     *
     * @param aMeetingResource
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(MeetingResource aMeetingResource)
        throws Exception {
        if (aMeetingResource == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aMeetingResource,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IMeetingResource
     *
     * @param aMeetingResource
     *
     * @throws Exception
     */
    public void insertMeetingResource(MeetingResource aMeetingResource)
        throws Exception {
        insert(aMeetingResource);
    } // end insertMeetingResource()

    /**
     * Batch Insert IMeetingResource
     *
     * @param aMeetingResource
     *
     * @throws Exception
     */
    public void batchInsertMeetingResource(MeetingResource[] aMeetingResource)
        throws Exception {
        batchInsert(aMeetingResource);
    } // end batchInsertMeetingResource()

    /**
     * Delete IMeetingResource
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteMeetingResource(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteMeetingResource()

    /**
     * Delete IMeetingResource
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteMeetingResource(MeetingResourceDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteMeetingResource()

    /**
     * Update IMeetingResource Selective
     *
     * @param aMeetingResource
     *
     * @throws Exception
     */
    public void updateMeetingResource(MeetingResource aMeetingResource)
        throws Exception {
        if (aMeetingResource.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aMeetingResource);

        MeetingResource tempObj = findMeetingResourceById(aMeetingResource.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aMeetingResource, tempObj);
        } // end if
    } // end updateMeetingResource()

    /**
     * Batch Update IMeetingResource
     *
     * @param aMeetingResource
     *
     * @throws Exception
     */
    public void batchUpdateMeetingResource(MeetingResource[] aMeetingResource)
        throws Exception {
        batchUpdate(aMeetingResource);
    } // end batchUpdateMeetingResource()

    /**
     * Update IMeetingResource
     *
     * @param aMeetingResource
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateMeetingResource(MeetingResource aMeetingResource,
        MeetingResourceDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aMeetingResource, aQueryBean);
    } // end updateMeetingResource()

    /**
     * DOCUMENT ME!
     *
     * @param aMeetingResource DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(MeetingResource aMeetingResource)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aMeetingResources DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeMeetingResource(
        MeetingResource[] aMeetingResources,
        MeetingResourceDAOQueryBean aQueryBean) throws Exception {
        synchronizeMeetingResource(aMeetingResources, aQueryBean, null);
    } // end synchronizeMeetingResource()

    /**
     * DOCUMENT ME!
     *
     * @param aMeetingResources DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeMeetingResource(
        MeetingResource[] aMeetingResources,
        MeetingResourceDAOQueryBean aQueryBean,
        MeetingResourceSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aMeetingResources) == false) {
            inputList.addAll(Arrays.asList(aMeetingResources));
        } // end if

        MeetingResource[] existentMeetingResources = this.queryMeetingResource(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentMeetingResources) == false) {
            existentList.addAll(Arrays.asList(existentMeetingResources));
        } // end if

        List willAddMeetingResources = ListUtils.subtract(inputList,
                existentList);

        List willDeleteMeetingResources = ListUtils.subtract(existentList,
                inputList);

        List willUpdateMeetingResources = ListUtils.intersection(existentList,
                inputList);

        MeetingResource[] willUpdateMeetingResourceArray = (MeetingResource[]) willUpdateMeetingResources.toArray(new MeetingResource[willUpdateMeetingResources.size()]);
        MeetingResource[] willAddMeetingResourceArray = (MeetingResource[]) willAddMeetingResources.toArray(new MeetingResource[willAddMeetingResources.size()]);
        MeetingResource[] willDeleteMeetingResourceArray = (MeetingResource[]) willDeleteMeetingResources.toArray(new MeetingResource[willDeleteMeetingResources.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddMeetingResourceArray,
                willUpdateMeetingResourceArray, willDeleteMeetingResourceArray);
        } // end if

        if (willUpdateMeetingResources.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateMeetingResourceArray);
            } // end if

            this.batchUpdateMeetingResource(willUpdateMeetingResourceArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateMeetingResourceArray);
            } // end if
        } // end if

        if (willAddMeetingResources.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddMeetingResourceArray);
            } // end if

            this.batchInsertMeetingResource(willAddMeetingResourceArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddMeetingResourceArray);
            } // end if
        } // end if

        if (willDeleteMeetingResources.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteMeetingResourceArray);
            } // end if

            for (int i = 0; i < willDeleteMeetingResourceArray.length; i++) {
                MeetingResource object = willDeleteMeetingResourceArray[i];
                this.deleteMeetingResource(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteMeetingResourceArray);
            } // end if
        } // end if
    } // end synchronizeMeetingResource()

    /**
     * Query IMeetingResource
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public MeetingResource findMeetingResourceById(final long aId)
        throws Exception {
        MeetingResourceDAOQueryBean queryBean = new MeetingResourceDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        MeetingResource[] MeetingResources = queryMeetingResource(queryBean);

        if (MeetingResources.length == 0) {
            return null;
        } // end if
        else {
            return MeetingResources[0];
        } // end else
    } // end findMeetingResourceById()

    /**
     * Query IMeetingResource
     *
     * @param queryBean
     *
     * @return IMeetingResource[]
     *
     * @throws Exception
     */
    public MeetingResource[] queryMeetingResource(
        MeetingResourceDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcMeetingResourceRowMapper());

        return (MeetingResource[]) result.toArray(new MeetingResource[result.size()]);
    } // end queryMeetingResource()

    /**
     * Query MeetingResource Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryMeetingResourceSelective(
        MeetingResourceDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryMeetingResourceSelective()

    /**
     * Query IMeetingResource Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryMeetingResourceCount(MeetingResourceDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryMeetingResourceCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcMeetingResourceRowMapper
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
            MeetingResource object = new MeetingResource();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object MeetingId = resultSet.getObject(columnIndex++);

                object.setMeetingIdNull(resultSet.getBoolean(columnIndex++));

                if (MeetingId != null) {
                    BeanUtils.setProperty(object, DataProperty.MeetingId,
                        MeetingId);
                } // end if

                Object Remarks = resultSet.getObject(columnIndex++);

                object.setRemarksNull(resultSet.getBoolean(columnIndex++));

                if (Remarks != null) {
                    BeanUtils.setProperty(object, DataProperty.Remarks, Remarks);
                } // end if

                Object ResourceId = resultSet.getObject(columnIndex++);

                object.setResourceIdNull(resultSet.getBoolean(columnIndex++));

                if (ResourceId != null) {
                    BeanUtils.setProperty(object, DataProperty.ResourceId,
                        ResourceId);
                } // end if

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object ResourceCode = resultSet.getObject(columnIndex++);

                object.setResourceCodeNull(resultSet.getBoolean(columnIndex++));

                if (ResourceCode != null) {
                    BeanUtils.setProperty(object, DataProperty.ResourceCode,
                        ResourceCode);
                } // end if

                Object ResourceName = resultSet.getObject(columnIndex++);

                object.setResourceNameNull(resultSet.getBoolean(columnIndex++));

                if (ResourceName != null) {
                    BeanUtils.setProperty(object, DataProperty.ResourceName,
                        ResourceName);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcMeetingResourceRowMapper
} // end BaseMeetingResourceDAOJdbcImpl
