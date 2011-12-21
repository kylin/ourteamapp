/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.dao.impl;

import com.ourteam.middleware.dao.IMiddleWareToolInputLogDAO;
import com.ourteam.middleware.dao.MiddleWareToolInputLog;
import com.ourteam.middleware.dao.MiddleWareToolInputLogDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-12-09 08:49:23
 *
 * @author kylin
 */
abstract public class BaseMiddleWareToolInputLogDAOJdbcImpl
    extends AbstractJdbcDAO implements IMiddleWareToolInputLogDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, Remarks, Status, ToolInputId, ToolInputValue, ToolLogId,
            ParameterName, ParameterCode, ParameterType, SortIndex
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.Remarks, DataProperty.Status,
            DataProperty.ToolInputId, DataProperty.ToolInputValue,
            DataProperty.ToolLogId, DataProperty.ParameterName,
            DataProperty.ParameterCode, DataProperty.ParameterType,
            DataProperty.SortIndex
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
     * Creates a new BaseMiddleWareToolInputLogDAOJdbcImpl object.
     */
    public BaseMiddleWareToolInputLogDAOJdbcImpl() {
        super();
    } // end BaseMiddleWareToolInputLogDAOJdbcImpl()

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
                " LEFT JOIN MIDDLE_WARE_TOOL_INPUT toolInputD ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " toolInputD.ID = MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_INPUT_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique MiddleWareToolInputLog
     *
     * @param aMiddleWareToolInputLog
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(MiddleWareToolInputLog aMiddleWareToolInputLog)
        throws Exception {
        if (aMiddleWareToolInputLog == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aMiddleWareToolInputLog,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IMiddleWareToolInputLog
     *
     * @param aMiddleWareToolInputLog
     *
     * @throws Exception
     */
    public void insertMiddleWareToolInputLog(
        MiddleWareToolInputLog aMiddleWareToolInputLog)
        throws Exception {
        insert(aMiddleWareToolInputLog);
    } // end insertMiddleWareToolInputLog()

    /**
     * Batch Insert IMiddleWareToolInputLog
     *
     * @param aMiddleWareToolInputLog
     *
     * @throws Exception
     */
    public void batchInsertMiddleWareToolInputLog(
        MiddleWareToolInputLog[] aMiddleWareToolInputLog)
        throws Exception {
        batchInsert(aMiddleWareToolInputLog);
    } // end batchInsertMiddleWareToolInputLog()

    /**
     * Delete IMiddleWareToolInputLog
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteMiddleWareToolInputLog(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteMiddleWareToolInputLog()

    /**
     * Delete IMiddleWareToolInputLog
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteMiddleWareToolInputLog(
        MiddleWareToolInputLogDAOQueryBean queryBean) throws Exception {
        deleteByQuery(queryBean);
    } // end deleteMiddleWareToolInputLog()

    /**
     * Update IMiddleWareToolInputLog Selective
     *
     * @param aMiddleWareToolInputLog
     *
     * @throws Exception
     */
    public void updateMiddleWareToolInputLog(
        MiddleWareToolInputLog aMiddleWareToolInputLog)
        throws Exception {
        if (aMiddleWareToolInputLog.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aMiddleWareToolInputLog);

        MiddleWareToolInputLog tempObj = findMiddleWareToolInputLogById(aMiddleWareToolInputLog.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aMiddleWareToolInputLog, tempObj);
        } // end if
    } // end updateMiddleWareToolInputLog()

    /**
     * Batch Update IMiddleWareToolInputLog
     *
     * @param aMiddleWareToolInputLog
     *
     * @throws Exception
     */
    public void batchUpdateMiddleWareToolInputLog(
        MiddleWareToolInputLog[] aMiddleWareToolInputLog)
        throws Exception {
        batchUpdate(aMiddleWareToolInputLog);
    } // end batchUpdateMiddleWareToolInputLog()

    /**
     * Update IMiddleWareToolInputLog
     *
     * @param aMiddleWareToolInputLog
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateMiddleWareToolInputLog(
        MiddleWareToolInputLog aMiddleWareToolInputLog,
        MiddleWareToolInputLogDAOQueryBean aQueryBean)
        throws Exception {
        updateByQuery(aMiddleWareToolInputLog, aQueryBean);
    } // end updateMiddleWareToolInputLog()

    /**
     * DOCUMENT ME!
     *
     * @param aMiddleWareToolInputLog DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(
        MiddleWareToolInputLog aMiddleWareToolInputLog)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aMiddleWareToolInputLogs DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeMiddleWareToolInputLog(
        MiddleWareToolInputLog[] aMiddleWareToolInputLogs,
        MiddleWareToolInputLogDAOQueryBean aQueryBean)
        throws Exception {
        synchronizeMiddleWareToolInputLog(aMiddleWareToolInputLogs, aQueryBean,
            null);
    } // end synchronizeMiddleWareToolInputLog()

    /**
     * DOCUMENT ME!
     *
     * @param aMiddleWareToolInputLogs DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeMiddleWareToolInputLog(
        MiddleWareToolInputLog[] aMiddleWareToolInputLogs,
        MiddleWareToolInputLogDAOQueryBean aQueryBean,
        MiddleWareToolInputLogSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aMiddleWareToolInputLogs) == false) {
            inputList.addAll(Arrays.asList(aMiddleWareToolInputLogs));
        } // end if

        MiddleWareToolInputLog[] existentMiddleWareToolInputLogs = this.queryMiddleWareToolInputLog(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentMiddleWareToolInputLogs) == false) {
            existentList.addAll(Arrays.asList(existentMiddleWareToolInputLogs));
        } // end if

        List willAddMiddleWareToolInputLogs = ListUtils.subtract(inputList,
                existentList);

        List willDeleteMiddleWareToolInputLogs = ListUtils.subtract(existentList,
                inputList);

        List willUpdateMiddleWareToolInputLogs = ListUtils.intersection(existentList,
                inputList);

        MiddleWareToolInputLog[] willUpdateMiddleWareToolInputLogArray = (MiddleWareToolInputLog[]) willUpdateMiddleWareToolInputLogs.toArray(new MiddleWareToolInputLog[willUpdateMiddleWareToolInputLogs.size()]);
        MiddleWareToolInputLog[] willAddMiddleWareToolInputLogArray = (MiddleWareToolInputLog[]) willAddMiddleWareToolInputLogs.toArray(new MiddleWareToolInputLog[willAddMiddleWareToolInputLogs.size()]);
        MiddleWareToolInputLog[] willDeleteMiddleWareToolInputLogArray = (MiddleWareToolInputLog[]) willDeleteMiddleWareToolInputLogs.toArray(new MiddleWareToolInputLog[willDeleteMiddleWareToolInputLogs.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddMiddleWareToolInputLogArray,
                willUpdateMiddleWareToolInputLogArray,
                willDeleteMiddleWareToolInputLogArray);
        } // end if

        if (willUpdateMiddleWareToolInputLogs.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateMiddleWareToolInputLogArray);
            } // end if

            this.batchUpdateMiddleWareToolInputLog(willUpdateMiddleWareToolInputLogArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateMiddleWareToolInputLogArray);
            } // end if
        } // end if

        if (willAddMiddleWareToolInputLogs.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddMiddleWareToolInputLogArray);
            } // end if

            this.batchInsertMiddleWareToolInputLog(willAddMiddleWareToolInputLogArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddMiddleWareToolInputLogArray);
            } // end if
        } // end if

        if (willDeleteMiddleWareToolInputLogs.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteMiddleWareToolInputLogArray);
            } // end if

            for (int i = 0; i < willDeleteMiddleWareToolInputLogArray.length;
                    i++) {
                MiddleWareToolInputLog object = willDeleteMiddleWareToolInputLogArray[i];
                this.deleteMiddleWareToolInputLog(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteMiddleWareToolInputLogArray);
            } // end if
        } // end if
    } // end synchronizeMiddleWareToolInputLog()

    /**
     * Query IMiddleWareToolInputLog
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public MiddleWareToolInputLog findMiddleWareToolInputLogById(final long aId)
        throws Exception {
        MiddleWareToolInputLogDAOQueryBean queryBean = new MiddleWareToolInputLogDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        MiddleWareToolInputLog[] MiddleWareToolInputLogs = queryMiddleWareToolInputLog(queryBean);

        if (MiddleWareToolInputLogs.length == 0) {
            return null;
        } // end if
        else {
            return MiddleWareToolInputLogs[0];
        } // end else
    } // end findMiddleWareToolInputLogById()

    /**
     * Query IMiddleWareToolInputLog
     *
     * @param queryBean
     *
     * @return IMiddleWareToolInputLog[]
     *
     * @throws Exception
     */
    public MiddleWareToolInputLog[] queryMiddleWareToolInputLog(
        MiddleWareToolInputLogDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean,
                new JdbcMiddleWareToolInputLogRowMapper());

        return (MiddleWareToolInputLog[]) result.toArray(new MiddleWareToolInputLog[result.size()]);
    } // end queryMiddleWareToolInputLog()

    /**
     * Query MiddleWareToolInputLog Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryMiddleWareToolInputLogSelective(
        MiddleWareToolInputLogDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryMiddleWareToolInputLogSelective()

    /**
     * Query IMiddleWareToolInputLog Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryMiddleWareToolInputLogCount(
        MiddleWareToolInputLogDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end queryMiddleWareToolInputLogCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcMiddleWareToolInputLogRowMapper
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
            MiddleWareToolInputLog object = new MiddleWareToolInputLog();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
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

                Object ToolInputId = resultSet.getObject(columnIndex++);

                object.setToolInputIdNull(resultSet.getBoolean(columnIndex++));

                if (ToolInputId != null) {
                    BeanUtils.setProperty(object, DataProperty.ToolInputId,
                        ToolInputId);
                } // end if

                Object ToolInputValue = resultSet.getObject(columnIndex++);

                object.setToolInputValueNull(resultSet.getBoolean(columnIndex++));

                if (ToolInputValue != null) {
                    BeanUtils.setProperty(object, DataProperty.ToolInputValue,
                        ToolInputValue);
                } // end if

                Object ToolLogId = resultSet.getObject(columnIndex++);

                object.setToolLogIdNull(resultSet.getBoolean(columnIndex++));

                if (ToolLogId != null) {
                    BeanUtils.setProperty(object, DataProperty.ToolLogId,
                        ToolLogId);
                } // end if

                Object ParameterName = resultSet.getObject(columnIndex++);

                object.setParameterNameNull(resultSet.getBoolean(columnIndex++));

                if (ParameterName != null) {
                    BeanUtils.setProperty(object, DataProperty.ParameterName,
                        ParameterName);
                } // end if

                Object ParameterCode = resultSet.getObject(columnIndex++);

                object.setParameterCodeNull(resultSet.getBoolean(columnIndex++));

                if (ParameterCode != null) {
                    BeanUtils.setProperty(object, DataProperty.ParameterCode,
                        ParameterCode);
                } // end if

                Object ParameterType = resultSet.getObject(columnIndex++);

                object.setParameterTypeNull(resultSet.getBoolean(columnIndex++));

                if (ParameterType != null) {
                    BeanUtils.setProperty(object, DataProperty.ParameterType,
                        ParameterType);
                } // end if

                Object SortIndex = resultSet.getObject(columnIndex++);

                object.setSortIndexNull(resultSet.getBoolean(columnIndex++));

                if (SortIndex != null) {
                    BeanUtils.setProperty(object, DataProperty.SortIndex,
                        SortIndex);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcMiddleWareToolInputLogRowMapper
} // end BaseMiddleWareToolInputLogDAOJdbcImpl
