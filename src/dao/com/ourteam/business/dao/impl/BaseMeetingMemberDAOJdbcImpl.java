/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.business.dao.impl;

import com.ourteam.business.dao.IMeetingMemberDAO;
import com.ourteam.business.dao.MeetingMember;
import com.ourteam.business.dao.MeetingMemberDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-09-02 11:25:12
 *
 * @author kylin
 */
abstract public class BaseMeetingMemberDAOJdbcImpl extends AbstractJdbcDAO
    implements IMeetingMemberDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, MeetingId, MeetingRole, MemberId, Remarks, Status
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.MeetingId, DataProperty.MeetingRole,
            DataProperty.MemberId, DataProperty.Remarks, DataProperty.Status
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
     * Creates a new BaseMeetingMemberDAOJdbcImpl object.
     */
    public BaseMeetingMemberDAOJdbcImpl() {
        super();
    } // end BaseMeetingMemberDAOJdbcImpl()

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
     * Check Unique MeetingMember
     *
     * @param aMeetingMember
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(MeetingMember aMeetingMember)
        throws Exception {
        if (aMeetingMember == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aMeetingMember,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IMeetingMember
     *
     * @param aMeetingMember
     *
     * @throws Exception
     */
    public void insertMeetingMember(MeetingMember aMeetingMember)
        throws Exception {
        insert(aMeetingMember);
    } // end insertMeetingMember()

    /**
     * Batch Insert IMeetingMember
     *
     * @param aMeetingMember
     *
     * @throws Exception
     */
    public void batchInsertMeetingMember(MeetingMember[] aMeetingMember)
        throws Exception {
        batchInsert(aMeetingMember);
    } // end batchInsertMeetingMember()

    /**
     * Delete IMeetingMember
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteMeetingMember(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteMeetingMember()

    /**
     * Delete IMeetingMember
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteMeetingMember(MeetingMemberDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteMeetingMember()

    /**
     * Update IMeetingMember Selective
     *
     * @param aMeetingMember
     *
     * @throws Exception
     */
    public void updateMeetingMember(MeetingMember aMeetingMember)
        throws Exception {
        if (aMeetingMember.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aMeetingMember);

        MeetingMember tempObj = findMeetingMemberById(aMeetingMember.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aMeetingMember, tempObj);
        } // end if
    } // end updateMeetingMember()

    /**
     * Batch Update IMeetingMember
     *
     * @param aMeetingMember
     *
     * @throws Exception
     */
    public void batchUpdateMeetingMember(MeetingMember[] aMeetingMember)
        throws Exception {
        batchUpdate(aMeetingMember);
    } // end batchUpdateMeetingMember()

    /**
     * Update IMeetingMember
     *
     * @param aMeetingMember
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateMeetingMember(MeetingMember aMeetingMember,
        MeetingMemberDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aMeetingMember, aQueryBean);
    } // end updateMeetingMember()

    /**
     * DOCUMENT ME!
     *
     * @param aMeetingMember DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(MeetingMember aMeetingMember)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aMeetingMembers DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeMeetingMember(MeetingMember[] aMeetingMembers,
        MeetingMemberDAOQueryBean aQueryBean) throws Exception {
        synchronizeMeetingMember(aMeetingMembers, aQueryBean, null);
    } // end synchronizeMeetingMember()

    /**
     * DOCUMENT ME!
     *
     * @param aMeetingMembers DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeMeetingMember(MeetingMember[] aMeetingMembers,
        MeetingMemberDAOQueryBean aQueryBean,
        MeetingMemberSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aMeetingMembers) == false) {
            inputList.addAll(Arrays.asList(aMeetingMembers));
        } // end if

        MeetingMember[] existentMeetingMembers = this.queryMeetingMember(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentMeetingMembers) == false) {
            existentList.addAll(Arrays.asList(existentMeetingMembers));
        } // end if

        List willAddMeetingMembers = ListUtils.subtract(inputList, existentList);

        List willDeleteMeetingMembers = ListUtils.subtract(existentList,
                inputList);

        List willUpdateMeetingMembers = ListUtils.intersection(existentList,
                inputList);

        MeetingMember[] willUpdateMeetingMemberArray = (MeetingMember[]) willUpdateMeetingMembers.toArray(new MeetingMember[willUpdateMeetingMembers.size()]);
        MeetingMember[] willAddMeetingMemberArray = (MeetingMember[]) willAddMeetingMembers.toArray(new MeetingMember[willAddMeetingMembers.size()]);
        MeetingMember[] willDeleteMeetingMemberArray = (MeetingMember[]) willDeleteMeetingMembers.toArray(new MeetingMember[willDeleteMeetingMembers.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddMeetingMemberArray,
                willUpdateMeetingMemberArray, willDeleteMeetingMemberArray);
        } // end if

        if (willUpdateMeetingMembers.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateMeetingMemberArray);
            } // end if

            this.batchUpdateMeetingMember(willUpdateMeetingMemberArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateMeetingMemberArray);
            } // end if
        } // end if

        if (willAddMeetingMembers.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddMeetingMemberArray);
            } // end if

            this.batchInsertMeetingMember(willAddMeetingMemberArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddMeetingMemberArray);
            } // end if
        } // end if

        if (willDeleteMeetingMembers.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteMeetingMemberArray);
            } // end if

            for (int i = 0; i < willDeleteMeetingMemberArray.length; i++) {
                MeetingMember object = willDeleteMeetingMemberArray[i];
                this.deleteMeetingMember(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteMeetingMemberArray);
            } // end if
        } // end if
    } // end synchronizeMeetingMember()

    /**
     * Query IMeetingMember
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public MeetingMember findMeetingMemberById(final long aId)
        throws Exception {
        MeetingMemberDAOQueryBean queryBean = new MeetingMemberDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        MeetingMember[] MeetingMembers = queryMeetingMember(queryBean);

        if (MeetingMembers.length == 0) {
            return null;
        } // end if
        else {
            return MeetingMembers[0];
        } // end else
    } // end findMeetingMemberById()

    /**
     * Query IMeetingMember
     *
     * @param queryBean
     *
     * @return IMeetingMember[]
     *
     * @throws Exception
     */
    public MeetingMember[] queryMeetingMember(
        MeetingMemberDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcMeetingMemberRowMapper());

        return (MeetingMember[]) result.toArray(new MeetingMember[result.size()]);
    } // end queryMeetingMember()

    /**
     * Query MeetingMember Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryMeetingMemberSelective(
        MeetingMemberDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryMeetingMemberSelective()

    /**
     * Query IMeetingMember Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryMeetingMemberCount(MeetingMemberDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryMeetingMemberCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcMeetingMemberRowMapper
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
            MeetingMember object = new MeetingMember();

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

                Object MeetingRole = resultSet.getObject(columnIndex++);

                object.setMeetingRoleNull(resultSet.getBoolean(columnIndex++));

                if (MeetingRole != null) {
                    BeanUtils.setProperty(object, DataProperty.MeetingRole,
                        MeetingRole);
                } // end if

                Object MemberId = resultSet.getObject(columnIndex++);

                object.setMemberIdNull(resultSet.getBoolean(columnIndex++));

                if (MemberId != null) {
                    BeanUtils.setProperty(object, DataProperty.MemberId,
                        MemberId);
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
    } // end JdbcMeetingMemberRowMapper
} // end BaseMeetingMemberDAOJdbcImpl
