/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.calendar.dao.impl;

import com.ourteam.calendar.dao.CalendarDefine;
import com.ourteam.calendar.dao.CalendarDefineDAOQueryBean;
import com.ourteam.calendar.dao.ICalendarDefineDAO;

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
 * DAO JDBC Impl Generate Date : 2011-06-16 17:20:30
 *
 * @author kylin
 */
abstract public class BaseCalendarDefineDAOJdbcImpl extends AbstractJdbcDAO
    implements ICalendarDefineDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, CalendarName, CalendarType, OwnerId, Remarks, Status,
            CalendarStyle
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.CalendarName,
            DataProperty.CalendarType, DataProperty.OwnerId,
            DataProperty.Remarks, DataProperty.Status,
            DataProperty.CalendarStyle
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
     * Creates a new BaseCalendarDefineDAOJdbcImpl object.
     */
    public BaseCalendarDefineDAOJdbcImpl() {
        super();
    } // end BaseCalendarDefineDAOJdbcImpl()

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
     * Check Unique CalendarDefine
     *
     * @param aCalendarDefine
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(CalendarDefine aCalendarDefine)
        throws Exception {
        if (aCalendarDefine == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aCalendarDefine,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert ICalendarDefine
     *
     * @param aCalendarDefine
     *
     * @throws Exception
     */
    public void insertCalendarDefine(CalendarDefine aCalendarDefine)
        throws Exception {
        insert(aCalendarDefine);
    } // end insertCalendarDefine()

    /**
     * Batch Insert ICalendarDefine
     *
     * @param aCalendarDefine
     *
     * @throws Exception
     */
    public void batchInsertCalendarDefine(CalendarDefine[] aCalendarDefine)
        throws Exception {
        batchInsert(aCalendarDefine);
    } // end batchInsertCalendarDefine()

    /**
     * Delete ICalendarDefine
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteCalendarDefine(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteCalendarDefine()

    /**
     * Delete ICalendarDefine
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteCalendarDefine(CalendarDefineDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteCalendarDefine()

    /**
     * Update ICalendarDefine Selective
     *
     * @param aCalendarDefine
     *
     * @throws Exception
     */
    public void updateCalendarDefine(CalendarDefine aCalendarDefine)
        throws Exception {
        if (aCalendarDefine.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aCalendarDefine);

        CalendarDefine tempObj = findCalendarDefineById(aCalendarDefine.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aCalendarDefine, tempObj);
        } // end if
    } // end updateCalendarDefine()

    /**
     * Batch Update ICalendarDefine
     *
     * @param aCalendarDefine
     *
     * @throws Exception
     */
    public void batchUpdateCalendarDefine(CalendarDefine[] aCalendarDefine)
        throws Exception {
        batchUpdate(aCalendarDefine);
    } // end batchUpdateCalendarDefine()

    /**
     * Update ICalendarDefine
     *
     * @param aCalendarDefine
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateCalendarDefine(CalendarDefine aCalendarDefine,
        CalendarDefineDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aCalendarDefine, aQueryBean);
    } // end updateCalendarDefine()

    /**
     * DOCUMENT ME!
     *
     * @param aCalendarDefine DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(CalendarDefine aCalendarDefine)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aCalendarDefines DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeCalendarDefine(CalendarDefine[] aCalendarDefines,
        CalendarDefineDAOQueryBean aQueryBean) throws Exception {
        synchronizeCalendarDefine(aCalendarDefines, aQueryBean, null);
    } // end synchronizeCalendarDefine()

    /**
     * DOCUMENT ME!
     *
     * @param aCalendarDefines DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeCalendarDefine(CalendarDefine[] aCalendarDefines,
        CalendarDefineDAOQueryBean aQueryBean,
        CalendarDefineSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aCalendarDefines) == false) {
            inputList.addAll(Arrays.asList(aCalendarDefines));
        } // end if

        CalendarDefine[] existentCalendarDefines = this.queryCalendarDefine(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentCalendarDefines) == false) {
            existentList.addAll(Arrays.asList(existentCalendarDefines));
        } // end if

        List willAddCalendarDefines = ListUtils.subtract(inputList, existentList);

        List willDeleteCalendarDefines = ListUtils.subtract(existentList,
                inputList);

        List willUpdateCalendarDefines = ListUtils.intersection(existentList,
                inputList);

        CalendarDefine[] willUpdateCalendarDefineArray = (CalendarDefine[]) willUpdateCalendarDefines.toArray(new CalendarDefine[willUpdateCalendarDefines.size()]);
        CalendarDefine[] willAddCalendarDefineArray = (CalendarDefine[]) willAddCalendarDefines.toArray(new CalendarDefine[willAddCalendarDefines.size()]);
        CalendarDefine[] willDeleteCalendarDefineArray = (CalendarDefine[]) willDeleteCalendarDefines.toArray(new CalendarDefine[willDeleteCalendarDefines.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddCalendarDefineArray,
                willUpdateCalendarDefineArray, willDeleteCalendarDefineArray);
        } // end if

        if (willUpdateCalendarDefines.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateCalendarDefineArray);
            } // end if

            this.batchUpdateCalendarDefine(willUpdateCalendarDefineArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateCalendarDefineArray);
            } // end if
        } // end if

        if (willAddCalendarDefines.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddCalendarDefineArray);
            } // end if

            this.batchInsertCalendarDefine(willAddCalendarDefineArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddCalendarDefineArray);
            } // end if
        } // end if

        if (willDeleteCalendarDefines.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteCalendarDefineArray);
            } // end if

            for (int i = 0; i < willDeleteCalendarDefineArray.length; i++) {
                CalendarDefine object = willDeleteCalendarDefineArray[i];
                this.deleteCalendarDefine(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteCalendarDefineArray);
            } // end if
        } // end if
    } // end synchronizeCalendarDefine()

    /**
     * Query ICalendarDefine
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public CalendarDefine findCalendarDefineById(final long aId)
        throws Exception {
        CalendarDefineDAOQueryBean queryBean = new CalendarDefineDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        CalendarDefine[] CalendarDefines = queryCalendarDefine(queryBean);

        if (CalendarDefines.length == 0) {
            return null;
        } // end if
        else {
            return CalendarDefines[0];
        } // end else
    } // end findCalendarDefineById()

    /**
     * Query ICalendarDefine
     *
     * @param queryBean
     *
     * @return ICalendarDefine[]
     *
     * @throws Exception
     */
    public CalendarDefine[] queryCalendarDefine(
        CalendarDefineDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcCalendarDefineRowMapper());

        return (CalendarDefine[]) result.toArray(new CalendarDefine[result.size()]);
    } // end queryCalendarDefine()

    /**
     * Query CalendarDefine Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryCalendarDefineSelective(
        CalendarDefineDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryCalendarDefineSelective()

    /**
     * Query ICalendarDefine Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryCalendarDefineCount(CalendarDefineDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryCalendarDefineCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcCalendarDefineRowMapper
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
            CalendarDefine object = new CalendarDefine();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
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

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object CalendarStyle = resultSet.getObject(columnIndex++);

                object.setCalendarStyleNull(resultSet.getBoolean(columnIndex++));

                if (CalendarStyle != null) {
                    BeanUtils.setProperty(object, DataProperty.CalendarStyle,
                        CalendarStyle);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcCalendarDefineRowMapper
} // end BaseCalendarDefineDAOJdbcImpl
