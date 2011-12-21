/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.calendar.dao.impl;

import com.ourteam.calendar.dao.CalendarItem;
import com.ourteam.calendar.dao.CalendarItemDAOQueryBean;
import com.ourteam.calendar.dao.ICalendarItemDAO;

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
 * DAO JDBC Impl Generate Date : 2011-06-23 17:05:25
 *
 * @author kylin
 */
abstract public class BaseCalendarItemDAOJdbcImpl extends AbstractJdbcDAO
    implements ICalendarItemDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, AlermConfig, CalendarId, EndDateTime, FullDateItem,
            ItemAttchment, ItemContent, ItemLocaltion, ItemTitle, ProtectedType,
            Remarks, RepeateConfig, StartDateTime, Status, CalendarName,
            CalendarType, CalendarStyle, OwnerId
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.AlermConfig, DataProperty.CalendarId,
            DataProperty.EndDateTime, DataProperty.FullDateItem,
            DataProperty.ItemAttchment, DataProperty.ItemContent,
            DataProperty.ItemLocaltion, DataProperty.ItemTitle,
            DataProperty.ProtectedType, DataProperty.Remarks,
            DataProperty.RepeateConfig, DataProperty.StartDateTime,
            DataProperty.Status, DataProperty.CalendarName,
            DataProperty.CalendarType, DataProperty.CalendarStyle,
            DataProperty.OwnerId
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
     * Creates a new BaseCalendarItemDAOJdbcImpl object.
     */
    public BaseCalendarItemDAOJdbcImpl() {
        super();
    } // end BaseCalendarItemDAOJdbcImpl()

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
                " LEFT JOIN CALENDAR_DEFINE calendarDefineB ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " calendarDefineB.ID = CALENDAR_ITEM.CALENDAR_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique CalendarItem
     *
     * @param aCalendarItem
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(CalendarItem aCalendarItem)
        throws Exception {
        if (aCalendarItem == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aCalendarItem, DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert ICalendarItem
     *
     * @param aCalendarItem
     *
     * @throws Exception
     */
    public void insertCalendarItem(CalendarItem aCalendarItem)
        throws Exception {
        insert(aCalendarItem);
    } // end insertCalendarItem()

    /**
     * Batch Insert ICalendarItem
     *
     * @param aCalendarItem
     *
     * @throws Exception
     */
    public void batchInsertCalendarItem(CalendarItem[] aCalendarItem)
        throws Exception {
        batchInsert(aCalendarItem);
    } // end batchInsertCalendarItem()

    /**
     * Delete ICalendarItem
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteCalendarItem(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteCalendarItem()

    /**
     * Delete ICalendarItem
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteCalendarItem(CalendarItemDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteCalendarItem()

    /**
     * Update ICalendarItem Selective
     *
     * @param aCalendarItem
     *
     * @throws Exception
     */
    public void updateCalendarItem(CalendarItem aCalendarItem)
        throws Exception {
        if (aCalendarItem.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aCalendarItem);

        CalendarItem tempObj = findCalendarItemById(aCalendarItem.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aCalendarItem, tempObj);
        } // end if
    } // end updateCalendarItem()

    /**
     * Batch Update ICalendarItem
     *
     * @param aCalendarItem
     *
     * @throws Exception
     */
    public void batchUpdateCalendarItem(CalendarItem[] aCalendarItem)
        throws Exception {
        batchUpdate(aCalendarItem);
    } // end batchUpdateCalendarItem()

    /**
     * Update ICalendarItem
     *
     * @param aCalendarItem
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateCalendarItem(CalendarItem aCalendarItem,
        CalendarItemDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aCalendarItem, aQueryBean);
    } // end updateCalendarItem()

    /**
     * DOCUMENT ME!
     *
     * @param aCalendarItem DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(CalendarItem aCalendarItem)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aCalendarItems DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeCalendarItem(CalendarItem[] aCalendarItems,
        CalendarItemDAOQueryBean aQueryBean) throws Exception {
        synchronizeCalendarItem(aCalendarItems, aQueryBean, null);
    } // end synchronizeCalendarItem()

    /**
     * DOCUMENT ME!
     *
     * @param aCalendarItems DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeCalendarItem(CalendarItem[] aCalendarItems,
        CalendarItemDAOQueryBean aQueryBean,
        CalendarItemSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aCalendarItems) == false) {
            inputList.addAll(Arrays.asList(aCalendarItems));
        } // end if

        CalendarItem[] existentCalendarItems = this.queryCalendarItem(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentCalendarItems) == false) {
            existentList.addAll(Arrays.asList(existentCalendarItems));
        } // end if

        List willAddCalendarItems = ListUtils.subtract(inputList, existentList);

        List willDeleteCalendarItems = ListUtils.subtract(existentList,
                inputList);

        List willUpdateCalendarItems = ListUtils.intersection(existentList,
                inputList);

        CalendarItem[] willUpdateCalendarItemArray = (CalendarItem[]) willUpdateCalendarItems.toArray(new CalendarItem[willUpdateCalendarItems.size()]);
        CalendarItem[] willAddCalendarItemArray = (CalendarItem[]) willAddCalendarItems.toArray(new CalendarItem[willAddCalendarItems.size()]);
        CalendarItem[] willDeleteCalendarItemArray = (CalendarItem[]) willDeleteCalendarItems.toArray(new CalendarItem[willDeleteCalendarItems.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddCalendarItemArray,
                willUpdateCalendarItemArray, willDeleteCalendarItemArray);
        } // end if

        if (willUpdateCalendarItems.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateCalendarItemArray);
            } // end if

            this.batchUpdateCalendarItem(willUpdateCalendarItemArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateCalendarItemArray);
            } // end if
        } // end if

        if (willAddCalendarItems.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddCalendarItemArray);
            } // end if

            this.batchInsertCalendarItem(willAddCalendarItemArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddCalendarItemArray);
            } // end if
        } // end if

        if (willDeleteCalendarItems.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteCalendarItemArray);
            } // end if

            for (int i = 0; i < willDeleteCalendarItemArray.length; i++) {
                CalendarItem object = willDeleteCalendarItemArray[i];
                this.deleteCalendarItem(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteCalendarItemArray);
            } // end if
        } // end if
    } // end synchronizeCalendarItem()

    /**
     * Query ICalendarItem
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public CalendarItem findCalendarItemById(final long aId)
        throws Exception {
        CalendarItemDAOQueryBean queryBean = new CalendarItemDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        CalendarItem[] CalendarItems = queryCalendarItem(queryBean);

        if (CalendarItems.length == 0) {
            return null;
        } // end if
        else {
            return CalendarItems[0];
        } // end else
    } // end findCalendarItemById()

    /**
     * Query ICalendarItem
     *
     * @param queryBean
     *
     * @return ICalendarItem[]
     *
     * @throws Exception
     */
    public CalendarItem[] queryCalendarItem(CalendarItemDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean, new JdbcCalendarItemRowMapper());

        return (CalendarItem[]) result.toArray(new CalendarItem[result.size()]);
    } // end queryCalendarItem()

    /**
     * Query CalendarItem Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryCalendarItemSelective(CalendarItemDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryCalendarItemSelective()

    /**
     * Query ICalendarItem Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryCalendarItemCount(CalendarItemDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryCalendarItemCount()

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.calendar.dao.impl.BaseCalendarDateDAOJdbcImpl calendarDate;

    /**
     * DOCUMENT ME!
     *
     * @param calendarDate DOCUMENT ME!
     */
    public void setCalendarDate(
        com.ourteam.calendar.dao.impl.BaseCalendarDateDAOJdbcImpl calendarDate) {
        this.calendarDate = calendarDate;
    } // end setCalendarDate()

    /**
     * Query Related ICalendarDate
     *
     * @param aDaoQueryBean DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="ICalendarDate" containment="true"
     */
    public com.ourteam.calendar.dao.CalendarDate[] queryCalendarDates(
        CalendarItemDAOQueryBean aDaoQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN CALENDAR_ITEM ON ( ");

        joinSQL.append(" CALENDAR_DATE.CALENDAR_ITEM_ID = CALENDAR_ITEM.ID ");

        joinSQL.append(" AND ");

        joinSQL.append(
            " CALENDAR_DATE.CALENDAR_ID = CALENDAR_ITEM.CALENDAR_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.calendar.dao.ICalendarDateDAO.EntityName;

        String[] entityFields = com.ourteam.calendar.dao.impl.BaseCalendarDateDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.calendar.dao.impl.BaseCalendarDateDAOJdbcImpl.ENTITY_PROPERTIES;

        List list = calendarDate.query(entityName, entityFields,
                entityProperties, aDaoQueryBean, joinSQL.toString(),
                new com.ourteam.calendar.dao.impl.BaseCalendarDateDAOJdbcImpl.JdbcCalendarDateRowMapper());

        return (com.ourteam.calendar.dao.CalendarDate[]) list.toArray(new com.ourteam.calendar.dao.CalendarDate[list.size()]);
    } // end queryCalendarDates()

    /**
     * Query CalendarItem Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryCalendarDatesSelective(
        CalendarItemDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addSelectProperty(com.ourteam.calendar.dao.ICalendarDateDAO.Id,
                "id");

            aQueryBean.addSelectProperty(com.ourteam.calendar.dao.ICalendarDateDAO.CalendarItemId,
                "calendarItemId");

            aQueryBean.addSelectProperty(com.ourteam.calendar.dao.ICalendarDateDAO.ItemDate,
                "itemDate");

            aQueryBean.addSelectProperty(com.ourteam.calendar.dao.ICalendarDateDAO.Status,
                "status");

            aQueryBean.addSelectProperty(com.ourteam.calendar.dao.ICalendarDateDAO.CalendarId,
                "calendarId");
        } // end if

        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN CALENDAR_ITEM ON ( ");

        joinSQL.append(" CALENDAR_DATE.CALENDAR_ITEM_ID = CALENDAR_ITEM.ID ");

        joinSQL.append(" AND ");

        joinSQL.append(
            " CALENDAR_DATE.CALENDAR_ID = CALENDAR_ITEM.CALENDAR_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.calendar.dao.ICalendarDateDAO.EntityName;

        return calendarDate.querySelective(entityName, aQueryBean,
            joinSQL.toString());
    } // end queryCalendarDatesSelective()

    /**
     * Update Related ICalendarDate
     *
     * @param aCalendarDate {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void updateCalendarDate(
        com.ourteam.calendar.dao.CalendarDate aCalendarDate,
        CalendarItemDAOQueryBean aQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN CALENDAR_ITEM ON ( ");

        joinSQL.append(" CALENDAR_DATE.CALENDAR_ITEM_ID = CALENDAR_ITEM.ID ");

        joinSQL.append(" AND ");

        joinSQL.append(
            " CALENDAR_DATE.CALENDAR_ID = CALENDAR_ITEM.CALENDAR_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.calendar.dao.ICalendarDateDAO.EntityName;

        String[] entityFields = com.ourteam.calendar.dao.impl.BaseCalendarDateDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.calendar.dao.impl.BaseCalendarDateDAOJdbcImpl.ENTITY_PROPERTIES;

        calendarDate.updateByQuery(entityName, entityFields, entityProperties,
            joinSQL.toString(), aCalendarDate, aQueryBean);
    } // end updateCalendarDate()

    /**
     * Delete Related ICalendarDate
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void deleteCalendarDate(CalendarItemDAOQueryBean aQueryBean)
        throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN CALENDAR_ITEM ON ( ");

        joinSQL.append(" CALENDAR_DATE.CALENDAR_ITEM_ID = CALENDAR_ITEM.ID ");

        joinSQL.append(" AND ");

        joinSQL.append(
            " CALENDAR_DATE.CALENDAR_ID = CALENDAR_ITEM.CALENDAR_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.calendar.dao.ICalendarDateDAO.EntityName;

        calendarDate.deleteByQuery(entityName, joinSQL.toString(), aQueryBean);
    } // end deleteCalendarDate()

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.calendar.dao.impl.BaseCalendarItemAssignDAOJdbcImpl calendarItemAssign;

    /**
     * DOCUMENT ME!
     *
     * @param calendarItemAssign DOCUMENT ME!
     */
    public void setCalendarItemAssign(
        com.ourteam.calendar.dao.impl.BaseCalendarItemAssignDAOJdbcImpl calendarItemAssign) {
        this.calendarItemAssign = calendarItemAssign;
    } // end setCalendarItemAssign()

    /**
     * Query Related ICalendarItemAssign
     *
     * @param aDaoQueryBean DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="ICalendarItemAssign" containment="true"
     */
    public com.ourteam.calendar.dao.CalendarItemAssign[] queryCalendarItemAssigns(
        CalendarItemDAOQueryBean aDaoQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN CALENDAR_ITEM ON ( ");

        joinSQL.append(
            " CALENDAR_ITEM_ASSIGN.CALENDAR_ITEM_ID = CALENDAR_ITEM.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.calendar.dao.ICalendarItemAssignDAO.EntityName;

        String[] entityFields = com.ourteam.calendar.dao.impl.BaseCalendarItemAssignDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.calendar.dao.impl.BaseCalendarItemAssignDAOJdbcImpl.ENTITY_PROPERTIES;

        List list = calendarItemAssign.query(entityName, entityFields,
                entityProperties, aDaoQueryBean, joinSQL.toString(),
                new com.ourteam.calendar.dao.impl.BaseCalendarItemAssignDAOJdbcImpl.JdbcCalendarItemAssignRowMapper());

        return (com.ourteam.calendar.dao.CalendarItemAssign[]) list.toArray(new com.ourteam.calendar.dao.CalendarItemAssign[list.size()]);
    } // end queryCalendarItemAssigns()

    /**
     * Query CalendarItem Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryCalendarItemAssignsSelective(
        CalendarItemDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addSelectProperty(com.ourteam.calendar.dao.ICalendarItemAssignDAO.Id,
                "id");

            aQueryBean.addSelectProperty(com.ourteam.calendar.dao.ICalendarItemAssignDAO.AssignPercent,
                "assignPercent");

            aQueryBean.addSelectProperty(com.ourteam.calendar.dao.ICalendarItemAssignDAO.CalendarItemId,
                "calendarItemId");

            aQueryBean.addSelectProperty(com.ourteam.calendar.dao.ICalendarItemAssignDAO.Remarks,
                "remarks");

            aQueryBean.addSelectProperty(com.ourteam.calendar.dao.ICalendarItemAssignDAO.SysUserId,
                "sysUserId");

            aQueryBean.addSelectProperty(com.ourteam.calendar.dao.ICalendarItemAssignDAO.Status,
                "status");

            aQueryBean.addSelectProperty(com.ourteam.calendar.dao.ICalendarItemAssignDAO.IsLeader,
                "isLeader");
        } // end if

        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN CALENDAR_ITEM ON ( ");

        joinSQL.append(
            " CALENDAR_ITEM_ASSIGN.CALENDAR_ITEM_ID = CALENDAR_ITEM.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.calendar.dao.ICalendarItemAssignDAO.EntityName;

        return calendarItemAssign.querySelective(entityName, aQueryBean,
            joinSQL.toString());
    } // end queryCalendarItemAssignsSelective()

    /**
     * Update Related ICalendarItemAssign
     *
     * @param aCalendarItemAssign {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void updateCalendarItemAssign(
        com.ourteam.calendar.dao.CalendarItemAssign aCalendarItemAssign,
        CalendarItemDAOQueryBean aQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN CALENDAR_ITEM ON ( ");

        joinSQL.append(
            " CALENDAR_ITEM_ASSIGN.CALENDAR_ITEM_ID = CALENDAR_ITEM.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.calendar.dao.ICalendarItemAssignDAO.EntityName;

        String[] entityFields = com.ourteam.calendar.dao.impl.BaseCalendarItemAssignDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.calendar.dao.impl.BaseCalendarItemAssignDAOJdbcImpl.ENTITY_PROPERTIES;

        calendarItemAssign.updateByQuery(entityName, entityFields,
            entityProperties, joinSQL.toString(), aCalendarItemAssign,
            aQueryBean);
    } // end updateCalendarItemAssign()

    /**
     * Delete Related ICalendarItemAssign
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void deleteCalendarItemAssign(CalendarItemDAOQueryBean aQueryBean)
        throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN CALENDAR_ITEM ON ( ");

        joinSQL.append(
            " CALENDAR_ITEM_ASSIGN.CALENDAR_ITEM_ID = CALENDAR_ITEM.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.calendar.dao.ICalendarItemAssignDAO.EntityName;

        calendarItemAssign.deleteByQuery(entityName, joinSQL.toString(),
            aQueryBean);
    } // end deleteCalendarItemAssign()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcCalendarItemRowMapper
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
            CalendarItem object = new CalendarItem();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object AlermConfig = resultSet.getObject(columnIndex++);

                object.setAlermConfigNull(resultSet.getBoolean(columnIndex++));

                if (AlermConfig != null) {
                    BeanUtils.setProperty(object, DataProperty.AlermConfig,
                        AlermConfig);
                } // end if

                Object CalendarId = resultSet.getObject(columnIndex++);

                object.setCalendarIdNull(resultSet.getBoolean(columnIndex++));

                if (CalendarId != null) {
                    BeanUtils.setProperty(object, DataProperty.CalendarId,
                        CalendarId);
                } // end if

                Object EndDateTime = resultSet.getObject(columnIndex++);

                object.setEndDateTimeNull(resultSet.getBoolean(columnIndex++));

                if (EndDateTime != null) {
                    BeanUtils.setProperty(object, DataProperty.EndDateTime,
                        EndDateTime);
                } // end if

                Object FullDateItem = resultSet.getObject(columnIndex++);

                object.setFullDateItemNull(resultSet.getBoolean(columnIndex++));

                if (FullDateItem != null) {
                    BeanUtils.setProperty(object, DataProperty.FullDateItem,
                        FullDateItem);
                } // end if

                Object ItemAttchment = resultSet.getObject(columnIndex++);

                object.setItemAttchmentNull(resultSet.getBoolean(columnIndex++));

                if (ItemAttchment != null) {
                    BeanUtils.setProperty(object, DataProperty.ItemAttchment,
                        ItemAttchment);
                } // end if

                Object ItemContent = resultSet.getObject(columnIndex++);

                object.setItemContentNull(resultSet.getBoolean(columnIndex++));

                if (ItemContent != null) {
                    BeanUtils.setProperty(object, DataProperty.ItemContent,
                        ItemContent);
                } // end if

                Object ItemLocaltion = resultSet.getObject(columnIndex++);

                object.setItemLocaltionNull(resultSet.getBoolean(columnIndex++));

                if (ItemLocaltion != null) {
                    BeanUtils.setProperty(object, DataProperty.ItemLocaltion,
                        ItemLocaltion);
                } // end if

                Object ItemTitle = resultSet.getObject(columnIndex++);

                object.setItemTitleNull(resultSet.getBoolean(columnIndex++));

                if (ItemTitle != null) {
                    BeanUtils.setProperty(object, DataProperty.ItemTitle,
                        ItemTitle);
                } // end if

                Object ProtectedType = resultSet.getObject(columnIndex++);

                object.setProtectedTypeNull(resultSet.getBoolean(columnIndex++));

                if (ProtectedType != null) {
                    BeanUtils.setProperty(object, DataProperty.ProtectedType,
                        ProtectedType);
                } // end if

                Object Remarks = resultSet.getObject(columnIndex++);

                object.setRemarksNull(resultSet.getBoolean(columnIndex++));

                if (Remarks != null) {
                    BeanUtils.setProperty(object, DataProperty.Remarks, Remarks);
                } // end if

                Object RepeateConfig = resultSet.getObject(columnIndex++);

                object.setRepeateConfigNull(resultSet.getBoolean(columnIndex++));

                if (RepeateConfig != null) {
                    BeanUtils.setProperty(object, DataProperty.RepeateConfig,
                        RepeateConfig);
                } // end if

                Object StartDateTime = resultSet.getObject(columnIndex++);

                object.setStartDateTimeNull(resultSet.getBoolean(columnIndex++));

                if (StartDateTime != null) {
                    BeanUtils.setProperty(object, DataProperty.StartDateTime,
                        StartDateTime);
                } // end if

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object CalendarName = resultSet.getObject(columnIndex++);

                object.setCalendarNameNull(resultSet.getBoolean(columnIndex++));

                if (CalendarName != null) {
                    BeanUtils.setProperty(object, DataProperty.CalendarName,
                        CalendarName);
                } // end if

                Object CalendarType = resultSet.getObject(columnIndex++);

                object.setCalendarTypeNull(resultSet.getBoolean(columnIndex++));

                if (CalendarType != null) {
                    BeanUtils.setProperty(object, DataProperty.CalendarType,
                        CalendarType);
                } // end if

                Object CalendarStyle = resultSet.getObject(columnIndex++);

                object.setCalendarStyleNull(resultSet.getBoolean(columnIndex++));

                if (CalendarStyle != null) {
                    BeanUtils.setProperty(object, DataProperty.CalendarStyle,
                        CalendarStyle);
                } // end if

                Object OwnerId = resultSet.getObject(columnIndex++);

                object.setOwnerIdNull(resultSet.getBoolean(columnIndex++));

                if (OwnerId != null) {
                    BeanUtils.setProperty(object, DataProperty.OwnerId, OwnerId);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcCalendarItemRowMapper
} // end BaseCalendarItemDAOJdbcImpl
