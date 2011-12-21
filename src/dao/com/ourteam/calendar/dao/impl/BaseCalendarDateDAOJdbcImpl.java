/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.calendar.dao.impl;

import com.ourteam.calendar.dao.CalendarDate;
import com.ourteam.calendar.dao.CalendarDateDAOQueryBean;
import com.ourteam.calendar.dao.ICalendarDateDAO;

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
 * DAO JDBC Impl Generate Date : 2011-06-15 21:24:29
 *
 * @author Kylin
 */
abstract public class BaseCalendarDateDAOJdbcImpl extends AbstractJdbcDAO
    implements ICalendarDateDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, CalendarItemId, ItemDate, Status, CalendarId
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.CalendarItemId, DataProperty.ItemDate,
            DataProperty.Status, DataProperty.CalendarId
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
     * Creates a new BaseCalendarDateDAOJdbcImpl object.
     */
    public BaseCalendarDateDAOJdbcImpl() {
        super();
    } // end BaseCalendarDateDAOJdbcImpl()

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
     * Check Unique CalendarDate
     *
     * @param aCalendarDate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(CalendarDate aCalendarDate)
        throws Exception {
        if (aCalendarDate == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aCalendarDate, DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert ICalendarDate
     *
     * @param aCalendarDate
     *
     * @throws Exception
     */
    public void insertCalendarDate(CalendarDate aCalendarDate)
        throws Exception {
        insert(aCalendarDate);
    } // end insertCalendarDate()

    /**
     * Batch Insert ICalendarDate
     *
     * @param aCalendarDate
     *
     * @throws Exception
     */
    public void batchInsertCalendarDate(CalendarDate[] aCalendarDate)
        throws Exception {
        batchInsert(aCalendarDate);
    } // end batchInsertCalendarDate()

    /**
     * Delete ICalendarDate
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteCalendarDate(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteCalendarDate()

    /**
     * Delete ICalendarDate
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteCalendarDate(CalendarDateDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteCalendarDate()

    /**
     * Update ICalendarDate Selective
     *
     * @param aCalendarDate
     *
     * @throws Exception
     */
    public void updateCalendarDate(CalendarDate aCalendarDate)
        throws Exception {
        if (aCalendarDate.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aCalendarDate);

        CalendarDate tempObj = findCalendarDateById(aCalendarDate.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aCalendarDate, tempObj);
        } // end if
    } // end updateCalendarDate()

    /**
     * Batch Update ICalendarDate
     *
     * @param aCalendarDate
     *
     * @throws Exception
     */
    public void batchUpdateCalendarDate(CalendarDate[] aCalendarDate)
        throws Exception {
        batchUpdate(aCalendarDate);
    } // end batchUpdateCalendarDate()

    /**
     * Update ICalendarDate
     *
     * @param aCalendarDate
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateCalendarDate(CalendarDate aCalendarDate,
        CalendarDateDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aCalendarDate, aQueryBean);
    } // end updateCalendarDate()

    /**
     * DOCUMENT ME!
     *
     * @param aCalendarDate DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(CalendarDate aCalendarDate)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aCalendarDates DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeCalendarDate(CalendarDate[] aCalendarDates,
        CalendarDateDAOQueryBean aQueryBean) throws Exception {
        synchronizeCalendarDate(aCalendarDates, aQueryBean, null);
    } // end synchronizeCalendarDate()

    /**
     * DOCUMENT ME!
     *
     * @param aCalendarDates DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeCalendarDate(CalendarDate[] aCalendarDates,
        CalendarDateDAOQueryBean aQueryBean,
        CalendarDateSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aCalendarDates) == false) {
            inputList.addAll(Arrays.asList(aCalendarDates));
        } // end if

        CalendarDate[] existentCalendarDates = this.queryCalendarDate(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentCalendarDates) == false) {
            existentList.addAll(Arrays.asList(existentCalendarDates));
        } // end if

        List willAddCalendarDates = ListUtils.subtract(inputList, existentList);

        List willDeleteCalendarDates = ListUtils.subtract(existentList,
                inputList);

        List willUpdateCalendarDates = ListUtils.intersection(existentList,
                inputList);

        CalendarDate[] willUpdateCalendarDateArray = (CalendarDate[]) willUpdateCalendarDates.toArray(new CalendarDate[willUpdateCalendarDates.size()]);
        CalendarDate[] willAddCalendarDateArray = (CalendarDate[]) willAddCalendarDates.toArray(new CalendarDate[willAddCalendarDates.size()]);
        CalendarDate[] willDeleteCalendarDateArray = (CalendarDate[]) willDeleteCalendarDates.toArray(new CalendarDate[willDeleteCalendarDates.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddCalendarDateArray,
                willUpdateCalendarDateArray, willDeleteCalendarDateArray);
        } // end if

        if (willUpdateCalendarDates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateCalendarDateArray);
            } // end if

            this.batchUpdateCalendarDate(willUpdateCalendarDateArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateCalendarDateArray);
            } // end if
        } // end if

        if (willAddCalendarDates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddCalendarDateArray);
            } // end if

            this.batchInsertCalendarDate(willAddCalendarDateArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddCalendarDateArray);
            } // end if
        } // end if

        if (willDeleteCalendarDates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteCalendarDateArray);
            } // end if

            for (int i = 0; i < willDeleteCalendarDateArray.length; i++) {
                CalendarDate object = willDeleteCalendarDateArray[i];
                this.deleteCalendarDate(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteCalendarDateArray);
            } // end if
        } // end if
    } // end synchronizeCalendarDate()

    /**
     * Query ICalendarDate
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public CalendarDate findCalendarDateById(final long aId)
        throws Exception {
        CalendarDateDAOQueryBean queryBean = new CalendarDateDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        CalendarDate[] CalendarDates = queryCalendarDate(queryBean);

        if (CalendarDates.length == 0) {
            return null;
        } // end if
        else {
            return CalendarDates[0];
        } // end else
    } // end findCalendarDateById()

    /**
     * Query ICalendarDate
     *
     * @param queryBean
     *
     * @return ICalendarDate[]
     *
     * @throws Exception
     */
    public CalendarDate[] queryCalendarDate(CalendarDateDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean, new JdbcCalendarDateRowMapper());

        return (CalendarDate[]) result.toArray(new CalendarDate[result.size()]);
    } // end queryCalendarDate()

    /**
     * Query CalendarDate Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryCalendarDateSelective(CalendarDateDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryCalendarDateSelective()

    /**
     * Query ICalendarDate Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryCalendarDateCount(CalendarDateDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryCalendarDateCount()

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.calendar.dao.impl.BaseCalendarItemDAOJdbcImpl calendarItem;

    /**
     * DOCUMENT ME!
     *
     * @param calendarItem DOCUMENT ME!
     */
    public void setCalendarItem(
        com.ourteam.calendar.dao.impl.BaseCalendarItemDAOJdbcImpl calendarItem) {
        this.calendarItem = calendarItem;
    } // end setCalendarItem()

    /**
     * Query Related ICalendarItem
     *
     * @param aDaoQueryBean DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="ICalendarItem" containment="true"
     */
    public com.ourteam.calendar.dao.CalendarItem[] queryCalendarItems(
        CalendarDateDAOQueryBean aDaoQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN CALENDAR_DATE ON ( ");

        joinSQL.append(" CALENDAR_ITEM.ID = CALENDAR_DATE.CALENDAR_ITEM_ID ");

        joinSQL.append(" AND ");

        joinSQL.append(
            " CALENDAR_ITEM.CALENDAR_ID = CALENDAR_DATE.CALENDAR_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.calendar.dao.ICalendarItemDAO.EntityName;

        String[] entityFields = com.ourteam.calendar.dao.impl.BaseCalendarItemDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.calendar.dao.impl.BaseCalendarItemDAOJdbcImpl.ENTITY_PROPERTIES;

        List list = calendarItem.query(entityName, entityFields,
                entityProperties, aDaoQueryBean, joinSQL.toString(),
                new com.ourteam.calendar.dao.impl.BaseCalendarItemDAOJdbcImpl.JdbcCalendarItemRowMapper());

        return (com.ourteam.calendar.dao.CalendarItem[]) list.toArray(new com.ourteam.calendar.dao.CalendarItem[list.size()]);
    } // end queryCalendarItems()

    /**
     * Query CalendarDate Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryCalendarItemsSelective(
        CalendarDateDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addSelectProperty(com.ourteam.calendar.dao.ICalendarItemDAO.Id,
                "id");

            aQueryBean.addSelectProperty(com.ourteam.calendar.dao.ICalendarItemDAO.AlermConfig,
                "alermConfig");

            aQueryBean.addSelectProperty(com.ourteam.calendar.dao.ICalendarItemDAO.CalendarId,
                "calendarId");

            aQueryBean.addSelectProperty(com.ourteam.calendar.dao.ICalendarItemDAO.EndDateTime,
                "endDateTime");

            aQueryBean.addSelectProperty(com.ourteam.calendar.dao.ICalendarItemDAO.FullDateItem,
                "fullDateItem");

            aQueryBean.addSelectProperty(com.ourteam.calendar.dao.ICalendarItemDAO.ItemAttchment,
                "itemAttchment");

            aQueryBean.addSelectProperty(com.ourteam.calendar.dao.ICalendarItemDAO.ItemContent,
                "itemContent");

            aQueryBean.addSelectProperty(com.ourteam.calendar.dao.ICalendarItemDAO.ItemLocaltion,
                "itemLocaltion");

            aQueryBean.addSelectProperty(com.ourteam.calendar.dao.ICalendarItemDAO.ItemTitle,
                "itemTitle");

            aQueryBean.addSelectProperty(com.ourteam.calendar.dao.ICalendarItemDAO.ProtectedType,
                "protectedType");

            aQueryBean.addSelectProperty(com.ourteam.calendar.dao.ICalendarItemDAO.Remarks,
                "remarks");

            aQueryBean.addSelectProperty(com.ourteam.calendar.dao.ICalendarItemDAO.RepeateConfig,
                "repeateConfig");

            aQueryBean.addSelectProperty(com.ourteam.calendar.dao.ICalendarItemDAO.StartDateTime,
                "startDateTime");

            aQueryBean.addSelectProperty(com.ourteam.calendar.dao.ICalendarItemDAO.Status,
                "status");

            aQueryBean.addSelectProperty(com.ourteam.calendar.dao.ICalendarItemDAO.CalendarName,
                "calendarName");

            aQueryBean.addSelectProperty(com.ourteam.calendar.dao.ICalendarItemDAO.CalendarType,
                "calendarType");
        } // end if

        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN CALENDAR_DATE ON ( ");

        joinSQL.append(" CALENDAR_ITEM.ID = CALENDAR_DATE.CALENDAR_ITEM_ID ");

        joinSQL.append(" AND ");

        joinSQL.append(
            " CALENDAR_ITEM.CALENDAR_ID = CALENDAR_DATE.CALENDAR_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.calendar.dao.ICalendarItemDAO.EntityName;

        return calendarItem.querySelective(entityName, aQueryBean,
            joinSQL.toString());
    } // end queryCalendarItemsSelective()

    /**
     * Update Related ICalendarItem
     *
     * @param aCalendarItem {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void updateCalendarItem(
        com.ourteam.calendar.dao.CalendarItem aCalendarItem,
        CalendarDateDAOQueryBean aQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN CALENDAR_DATE ON ( ");

        joinSQL.append(" CALENDAR_ITEM.ID = CALENDAR_DATE.CALENDAR_ITEM_ID ");

        joinSQL.append(" AND ");

        joinSQL.append(
            " CALENDAR_ITEM.CALENDAR_ID = CALENDAR_DATE.CALENDAR_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.calendar.dao.ICalendarItemDAO.EntityName;

        String[] entityFields = com.ourteam.calendar.dao.impl.BaseCalendarItemDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.calendar.dao.impl.BaseCalendarItemDAOJdbcImpl.ENTITY_PROPERTIES;

        calendarItem.updateByQuery(entityName, entityFields, entityProperties,
            joinSQL.toString(), aCalendarItem, aQueryBean);
    } // end updateCalendarItem()

    /**
     * Delete Related ICalendarItem
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void deleteCalendarItem(CalendarDateDAOQueryBean aQueryBean)
        throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN CALENDAR_DATE ON ( ");

        joinSQL.append(" CALENDAR_ITEM.ID = CALENDAR_DATE.CALENDAR_ITEM_ID ");

        joinSQL.append(" AND ");

        joinSQL.append(
            " CALENDAR_ITEM.CALENDAR_ID = CALENDAR_DATE.CALENDAR_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.calendar.dao.ICalendarItemDAO.EntityName;

        calendarItem.deleteByQuery(entityName, joinSQL.toString(), aQueryBean);
    } // end deleteCalendarItem()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcCalendarDateRowMapper
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
            CalendarDate object = new CalendarDate();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object CalendarItemId = resultSet.getObject(columnIndex++);

                object.setCalendarItemIdNull(resultSet.getBoolean(columnIndex++));

                if (CalendarItemId != null) {
                    BeanUtils.setProperty(object, DataProperty.CalendarItemId,
                        CalendarItemId);
                } // end if

                Object ItemDate = resultSet.getObject(columnIndex++);

                object.setItemDateNull(resultSet.getBoolean(columnIndex++));

                if (ItemDate != null) {
                    BeanUtils.setProperty(object, DataProperty.ItemDate,
                        ItemDate);
                } // end if

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object CalendarId = resultSet.getObject(columnIndex++);

                object.setCalendarIdNull(resultSet.getBoolean(columnIndex++));

                if (CalendarId != null) {
                    BeanUtils.setProperty(object, DataProperty.CalendarId,
                        CalendarId);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcCalendarDateRowMapper
} // end BaseCalendarDateDAOJdbcImpl
