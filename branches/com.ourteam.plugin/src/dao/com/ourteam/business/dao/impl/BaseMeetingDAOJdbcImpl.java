/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.business.dao.impl;

import com.ourteam.business.dao.IMeetingDAO;
import com.ourteam.business.dao.Meeting;
import com.ourteam.business.dao.MeetingDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-09-02 11:25:11
 *
 * @author kylin
 */
abstract public class BaseMeetingDAOJdbcImpl extends AbstractJdbcDAO
    implements IMeetingDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, EndDate, OwnerId, Remarks, StartDate, Status, Tags, Topic, Type
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.EndDate, DataProperty.OwnerId,
            DataProperty.Remarks, DataProperty.StartDate, DataProperty.Status,
            DataProperty.Tags, DataProperty.Topic, DataProperty.Type
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
     * Creates a new BaseMeetingDAOJdbcImpl object.
     */
    public BaseMeetingDAOJdbcImpl() {
        super();
    } // end BaseMeetingDAOJdbcImpl()

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
     * Check Unique Meeting
     *
     * @param aMeeting
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(Meeting aMeeting) throws Exception {
        if (aMeeting == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aMeeting, DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IMeeting
     *
     * @param aMeeting
     *
     * @throws Exception
     */
    public void insertMeeting(Meeting aMeeting) throws Exception {
        insert(aMeeting);
    } // end insertMeeting()

    /**
     * Batch Insert IMeeting
     *
     * @param aMeeting
     *
     * @throws Exception
     */
    public void batchInsertMeeting(Meeting[] aMeeting)
        throws Exception {
        batchInsert(aMeeting);
    } // end batchInsertMeeting()

    /**
     * Delete IMeeting
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteMeeting(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteMeeting()

    /**
     * Delete IMeeting
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteMeeting(MeetingDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteMeeting()

    /**
     * Update IMeeting Selective
     *
     * @param aMeeting
     *
     * @throws Exception
     */
    public void updateMeeting(Meeting aMeeting) throws Exception {
        if (aMeeting.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aMeeting);

        Meeting tempObj = findMeetingById(aMeeting.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aMeeting, tempObj);
        } // end if
    } // end updateMeeting()

    /**
     * Batch Update IMeeting
     *
     * @param aMeeting
     *
     * @throws Exception
     */
    public void batchUpdateMeeting(Meeting[] aMeeting)
        throws Exception {
        batchUpdate(aMeeting);
    } // end batchUpdateMeeting()

    /**
     * Update IMeeting
     *
     * @param aMeeting
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateMeeting(Meeting aMeeting, MeetingDAOQueryBean aQueryBean)
        throws Exception {
        updateByQuery(aMeeting, aQueryBean);
    } // end updateMeeting()

    /**
     * DOCUMENT ME!
     *
     * @param aMeeting DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(Meeting aMeeting) throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aMeetings DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeMeeting(Meeting[] aMeetings,
        MeetingDAOQueryBean aQueryBean) throws Exception {
        synchronizeMeeting(aMeetings, aQueryBean, null);
    } // end synchronizeMeeting()

    /**
     * DOCUMENT ME!
     *
     * @param aMeetings DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeMeeting(Meeting[] aMeetings,
        MeetingDAOQueryBean aQueryBean, MeetingSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aMeetings) == false) {
            inputList.addAll(Arrays.asList(aMeetings));
        } // end if

        Meeting[] existentMeetings = this.queryMeeting(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentMeetings) == false) {
            existentList.addAll(Arrays.asList(existentMeetings));
        } // end if

        List willAddMeetings = ListUtils.subtract(inputList, existentList);

        List willDeleteMeetings = ListUtils.subtract(existentList, inputList);

        List willUpdateMeetings = ListUtils.intersection(existentList, inputList);

        Meeting[] willUpdateMeetingArray = (Meeting[]) willUpdateMeetings.toArray(new Meeting[willUpdateMeetings.size()]);
        Meeting[] willAddMeetingArray = (Meeting[]) willAddMeetings.toArray(new Meeting[willAddMeetings.size()]);
        Meeting[] willDeleteMeetingArray = (Meeting[]) willDeleteMeetings.toArray(new Meeting[willDeleteMeetings.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddMeetingArray,
                willUpdateMeetingArray, willDeleteMeetingArray);
        } // end if

        if (willUpdateMeetings.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateMeetingArray);
            } // end if

            this.batchUpdateMeeting(willUpdateMeetingArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateMeetingArray);
            } // end if
        } // end if

        if (willAddMeetings.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddMeetingArray);
            } // end if

            this.batchInsertMeeting(willAddMeetingArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddMeetingArray);
            } // end if
        } // end if

        if (willDeleteMeetings.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteMeetingArray);
            } // end if

            for (int i = 0; i < willDeleteMeetingArray.length; i++) {
                Meeting object = willDeleteMeetingArray[i];
                this.deleteMeeting(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteMeetingArray);
            } // end if
        } // end if
    } // end synchronizeMeeting()

    /**
     * Query IMeeting
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public Meeting findMeetingById(final long aId) throws Exception {
        MeetingDAOQueryBean queryBean = new MeetingDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        Meeting[] Meetings = queryMeeting(queryBean);

        if (Meetings.length == 0) {
            return null;
        } // end if
        else {
            return Meetings[0];
        } // end else
    } // end findMeetingById()

    /**
     * Query IMeeting
     *
     * @param queryBean
     *
     * @return IMeeting[]
     *
     * @throws Exception
     */
    public Meeting[] queryMeeting(MeetingDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean, new JdbcMeetingRowMapper());

        return (Meeting[]) result.toArray(new Meeting[result.size()]);
    } // end queryMeeting()

    /**
     * Query Meeting Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryMeetingSelective(MeetingDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryMeetingSelective()

    /**
     * Query IMeeting Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryMeetingCount(MeetingDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryMeetingCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcMeetingRowMapper implements ParameterizedRowMapper {
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
            Meeting object = new Meeting();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object EndDate = resultSet.getObject(columnIndex++);

                object.setEndDateNull(resultSet.getBoolean(columnIndex++));

                if (EndDate != null) {
                    BeanUtils.setProperty(object, DataProperty.EndDate, EndDate);
                } // end if

                Object OwnerId = resultSet.getObject(columnIndex++);

                object.setOwnerIdNull(resultSet.getBoolean(columnIndex++));

                if (OwnerId != null) {
                    BeanUtils.setProperty(object, DataProperty.OwnerId, OwnerId);
                } // end if

                Object Remarks = resultSet.getObject(columnIndex++);

                object.setRemarksNull(resultSet.getBoolean(columnIndex++));

                if (Remarks != null) {
                    BeanUtils.setProperty(object, DataProperty.Remarks, Remarks);
                } // end if

                Object StartDate = resultSet.getObject(columnIndex++);

                object.setStartDateNull(resultSet.getBoolean(columnIndex++));

                if (StartDate != null) {
                    BeanUtils.setProperty(object, DataProperty.StartDate,
                        StartDate);
                } // end if

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object Tags = resultSet.getObject(columnIndex++);

                object.setTagsNull(resultSet.getBoolean(columnIndex++));

                if (Tags != null) {
                    BeanUtils.setProperty(object, DataProperty.Tags, Tags);
                } // end if

                Object Topic = resultSet.getObject(columnIndex++);

                object.setTopicNull(resultSet.getBoolean(columnIndex++));

                if (Topic != null) {
                    BeanUtils.setProperty(object, DataProperty.Topic, Topic);
                } // end if

                Object Type = resultSet.getObject(columnIndex++);

                object.setTypeNull(resultSet.getBoolean(columnIndex++));

                if (Type != null) {
                    BeanUtils.setProperty(object, DataProperty.Type, Type);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcMeetingRowMapper
} // end BaseMeetingDAOJdbcImpl
