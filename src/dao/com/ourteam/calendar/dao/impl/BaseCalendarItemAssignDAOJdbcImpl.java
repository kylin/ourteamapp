/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.calendar.dao.impl;

import com.ourteam.calendar.dao.CalendarItemAssign;
import com.ourteam.calendar.dao.CalendarItemAssignDAOQueryBean;
import com.ourteam.calendar.dao.ICalendarItemAssignDAO;

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
 * DAO JDBC Impl Generate Date : 2011-06-10 22:46:45
 *
 * @author Kylin
 */
abstract public class BaseCalendarItemAssignDAOJdbcImpl extends AbstractJdbcDAO
    implements ICalendarItemAssignDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, AssignPercent, CalendarItemId, Remarks, SysUserId, Status,
            IsLeader
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.AssignPercent,
            DataProperty.CalendarItemId, DataProperty.Remarks,
            DataProperty.SysUserId, DataProperty.Status, DataProperty.IsLeader
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
     * Creates a new BaseCalendarItemAssignDAOJdbcImpl object.
     */
    public BaseCalendarItemAssignDAOJdbcImpl() {
        super();
    } // end BaseCalendarItemAssignDAOJdbcImpl()

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
     * Check Unique CalendarItemAssign
     *
     * @param aCalendarItemAssign
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(CalendarItemAssign aCalendarItemAssign)
        throws Exception {
        if (aCalendarItemAssign == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aCalendarItemAssign,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert ICalendarItemAssign
     *
     * @param aCalendarItemAssign
     *
     * @throws Exception
     */
    public void insertCalendarItemAssign(CalendarItemAssign aCalendarItemAssign)
        throws Exception {
        insert(aCalendarItemAssign);
    } // end insertCalendarItemAssign()

    /**
     * Batch Insert ICalendarItemAssign
     *
     * @param aCalendarItemAssign
     *
     * @throws Exception
     */
    public void batchInsertCalendarItemAssign(
        CalendarItemAssign[] aCalendarItemAssign) throws Exception {
        batchInsert(aCalendarItemAssign);
    } // end batchInsertCalendarItemAssign()

    /**
     * Delete ICalendarItemAssign
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteCalendarItemAssign(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteCalendarItemAssign()

    /**
     * Delete ICalendarItemAssign
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteCalendarItemAssign(
        CalendarItemAssignDAOQueryBean queryBean) throws Exception {
        deleteByQuery(queryBean);
    } // end deleteCalendarItemAssign()

    /**
     * Update ICalendarItemAssign Selective
     *
     * @param aCalendarItemAssign
     *
     * @throws Exception
     */
    public void updateCalendarItemAssign(CalendarItemAssign aCalendarItemAssign)
        throws Exception {
        if (aCalendarItemAssign.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aCalendarItemAssign);

        CalendarItemAssign tempObj = findCalendarItemAssignById(aCalendarItemAssign.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aCalendarItemAssign, tempObj);
        } // end if
    } // end updateCalendarItemAssign()

    /**
     * Batch Update ICalendarItemAssign
     *
     * @param aCalendarItemAssign
     *
     * @throws Exception
     */
    public void batchUpdateCalendarItemAssign(
        CalendarItemAssign[] aCalendarItemAssign) throws Exception {
        batchUpdate(aCalendarItemAssign);
    } // end batchUpdateCalendarItemAssign()

    /**
     * Update ICalendarItemAssign
     *
     * @param aCalendarItemAssign
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateCalendarItemAssign(
        CalendarItemAssign aCalendarItemAssign,
        CalendarItemAssignDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aCalendarItemAssign, aQueryBean);
    } // end updateCalendarItemAssign()

    /**
     * DOCUMENT ME!
     *
     * @param aCalendarItemAssign DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(CalendarItemAssign aCalendarItemAssign)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aCalendarItemAssigns DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeCalendarItemAssign(
        CalendarItemAssign[] aCalendarItemAssigns,
        CalendarItemAssignDAOQueryBean aQueryBean) throws Exception {
        synchronizeCalendarItemAssign(aCalendarItemAssigns, aQueryBean, null);
    } // end synchronizeCalendarItemAssign()

    /**
     * DOCUMENT ME!
     *
     * @param aCalendarItemAssigns DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeCalendarItemAssign(
        CalendarItemAssign[] aCalendarItemAssigns,
        CalendarItemAssignDAOQueryBean aQueryBean,
        CalendarItemAssignSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aCalendarItemAssigns) == false) {
            inputList.addAll(Arrays.asList(aCalendarItemAssigns));
        } // end if

        CalendarItemAssign[] existentCalendarItemAssigns = this.queryCalendarItemAssign(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentCalendarItemAssigns) == false) {
            existentList.addAll(Arrays.asList(existentCalendarItemAssigns));
        } // end if

        List willAddCalendarItemAssigns = ListUtils.subtract(inputList,
                existentList);

        List willDeleteCalendarItemAssigns = ListUtils.subtract(existentList,
                inputList);

        List willUpdateCalendarItemAssigns = ListUtils.intersection(existentList,
                inputList);

        CalendarItemAssign[] willUpdateCalendarItemAssignArray = (CalendarItemAssign[]) willUpdateCalendarItemAssigns.toArray(new CalendarItemAssign[willUpdateCalendarItemAssigns.size()]);
        CalendarItemAssign[] willAddCalendarItemAssignArray = (CalendarItemAssign[]) willAddCalendarItemAssigns.toArray(new CalendarItemAssign[willAddCalendarItemAssigns.size()]);
        CalendarItemAssign[] willDeleteCalendarItemAssignArray = (CalendarItemAssign[]) willDeleteCalendarItemAssigns.toArray(new CalendarItemAssign[willDeleteCalendarItemAssigns.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddCalendarItemAssignArray,
                willUpdateCalendarItemAssignArray,
                willDeleteCalendarItemAssignArray);
        } // end if

        if (willUpdateCalendarItemAssigns.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateCalendarItemAssignArray);
            } // end if

            this.batchUpdateCalendarItemAssign(willUpdateCalendarItemAssignArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateCalendarItemAssignArray);
            } // end if
        } // end if

        if (willAddCalendarItemAssigns.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddCalendarItemAssignArray);
            } // end if

            this.batchInsertCalendarItemAssign(willAddCalendarItemAssignArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddCalendarItemAssignArray);
            } // end if
        } // end if

        if (willDeleteCalendarItemAssigns.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteCalendarItemAssignArray);
            } // end if

            for (int i = 0; i < willDeleteCalendarItemAssignArray.length;
                    i++) {
                CalendarItemAssign object = willDeleteCalendarItemAssignArray[i];
                this.deleteCalendarItemAssign(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteCalendarItemAssignArray);
            } // end if
        } // end if
    } // end synchronizeCalendarItemAssign()

    /**
     * Query ICalendarItemAssign
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public CalendarItemAssign findCalendarItemAssignById(final long aId)
        throws Exception {
        CalendarItemAssignDAOQueryBean queryBean = new CalendarItemAssignDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        CalendarItemAssign[] CalendarItemAssigns = queryCalendarItemAssign(queryBean);

        if (CalendarItemAssigns.length == 0) {
            return null;
        } // end if
        else {
            return CalendarItemAssigns[0];
        } // end else
    } // end findCalendarItemAssignById()

    /**
     * Query ICalendarItemAssign
     *
     * @param queryBean
     *
     * @return ICalendarItemAssign[]
     *
     * @throws Exception
     */
    public CalendarItemAssign[] queryCalendarItemAssign(
        CalendarItemAssignDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean,
                new JdbcCalendarItemAssignRowMapper());

        return (CalendarItemAssign[]) result.toArray(new CalendarItemAssign[result.size()]);
    } // end queryCalendarItemAssign()

    /**
     * Query CalendarItemAssign Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryCalendarItemAssignSelective(
        CalendarItemAssignDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryCalendarItemAssignSelective()

    /**
     * Query ICalendarItemAssign Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryCalendarItemAssignCount(
        CalendarItemAssignDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end queryCalendarItemAssignCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcCalendarItemAssignRowMapper
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
            CalendarItemAssign object = new CalendarItemAssign();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object AssignPercent = resultSet.getObject(columnIndex++);

                object.setAssignPercentNull(resultSet.getBoolean(columnIndex++));

                if (AssignPercent != null) {
                    BeanUtils.setProperty(object, DataProperty.AssignPercent,
                        AssignPercent);
                } // end if

                Object CalendarItemId = resultSet.getObject(columnIndex++);

                object.setCalendarItemIdNull(resultSet.getBoolean(columnIndex++));

                if (CalendarItemId != null) {
                    BeanUtils.setProperty(object, DataProperty.CalendarItemId,
                        CalendarItemId);
                } // end if

                Object Remarks = resultSet.getObject(columnIndex++);

                object.setRemarksNull(resultSet.getBoolean(columnIndex++));

                if (Remarks != null) {
                    BeanUtils.setProperty(object, DataProperty.Remarks, Remarks);
                } // end if

                Object SysUserId = resultSet.getObject(columnIndex++);

                object.setSysUserIdNull(resultSet.getBoolean(columnIndex++));

                if (SysUserId != null) {
                    BeanUtils.setProperty(object, DataProperty.SysUserId,
                        SysUserId);
                } // end if

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object IsLeader = resultSet.getObject(columnIndex++);

                object.setIsLeaderNull(resultSet.getBoolean(columnIndex++));

                if (IsLeader != null) {
                    BeanUtils.setProperty(object, DataProperty.IsLeader,
                        IsLeader);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcCalendarItemAssignRowMapper
} // end BaseCalendarItemAssignDAOJdbcImpl
