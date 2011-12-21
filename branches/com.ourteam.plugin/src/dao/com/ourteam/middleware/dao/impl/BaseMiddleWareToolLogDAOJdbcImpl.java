/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.dao.impl;

import com.ourteam.middleware.dao.IMiddleWareToolLogDAO;
import com.ourteam.middleware.dao.MiddleWareToolLog;
import com.ourteam.middleware.dao.MiddleWareToolLogDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-12-09 11:53:50
 *
 * @author kylin
 */
abstract public class BaseMiddleWareToolLogDAOJdbcImpl extends AbstractJdbcDAO
    implements IMiddleWareToolLogDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, ExecuteFinishTime, ExecuteLog, ExecuteResult, ExecuteStartTime,
            ExecutorId, MiddleWareId, Remarks, Status, ToolId, ExecutorName,
            ExecuteScript
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.ExecuteFinishTime,
            DataProperty.ExecuteLog, DataProperty.ExecuteResult,
            DataProperty.ExecuteStartTime, DataProperty.ExecutorId,
            DataProperty.MiddleWareId, DataProperty.Remarks, DataProperty.Status,
            DataProperty.ToolId, DataProperty.ExecutorName,
            DataProperty.ExecuteScript
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
     * Creates a new BaseMiddleWareToolLogDAOJdbcImpl object.
     */
    public BaseMiddleWareToolLogDAOJdbcImpl() {
        super();
    } // end BaseMiddleWareToolLogDAOJdbcImpl()

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

            relatedJoinSQLBuffer.append(" LEFT JOIN HR_EMPLOYEE employeeC ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " employeeC.ID = MIDDLE_WARE_TOOL_LOG.EXECUTOR_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique MiddleWareToolLog
     *
     * @param aMiddleWareToolLog
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(MiddleWareToolLog aMiddleWareToolLog)
        throws Exception {
        if (aMiddleWareToolLog == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aMiddleWareToolLog,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IMiddleWareToolLog
     *
     * @param aMiddleWareToolLog
     *
     * @throws Exception
     */
    public void insertMiddleWareToolLog(MiddleWareToolLog aMiddleWareToolLog)
        throws Exception {
        insert(aMiddleWareToolLog);
    } // end insertMiddleWareToolLog()

    /**
     * Batch Insert IMiddleWareToolLog
     *
     * @param aMiddleWareToolLog
     *
     * @throws Exception
     */
    public void batchInsertMiddleWareToolLog(
        MiddleWareToolLog[] aMiddleWareToolLog) throws Exception {
        batchInsert(aMiddleWareToolLog);
    } // end batchInsertMiddleWareToolLog()

    /**
     * Delete IMiddleWareToolLog
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteMiddleWareToolLog(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteMiddleWareToolLog()

    /**
     * Delete IMiddleWareToolLog
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteMiddleWareToolLog(MiddleWareToolLogDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteMiddleWareToolLog()

    /**
     * Update IMiddleWareToolLog Selective
     *
     * @param aMiddleWareToolLog
     *
     * @throws Exception
     */
    public void updateMiddleWareToolLog(MiddleWareToolLog aMiddleWareToolLog)
        throws Exception {
        if (aMiddleWareToolLog.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aMiddleWareToolLog);

        MiddleWareToolLog tempObj = findMiddleWareToolLogById(aMiddleWareToolLog.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aMiddleWareToolLog, tempObj);
        } // end if
    } // end updateMiddleWareToolLog()

    /**
     * Batch Update IMiddleWareToolLog
     *
     * @param aMiddleWareToolLog
     *
     * @throws Exception
     */
    public void batchUpdateMiddleWareToolLog(
        MiddleWareToolLog[] aMiddleWareToolLog) throws Exception {
        batchUpdate(aMiddleWareToolLog);
    } // end batchUpdateMiddleWareToolLog()

    /**
     * Update IMiddleWareToolLog
     *
     * @param aMiddleWareToolLog
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateMiddleWareToolLog(MiddleWareToolLog aMiddleWareToolLog,
        MiddleWareToolLogDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aMiddleWareToolLog, aQueryBean);
    } // end updateMiddleWareToolLog()

    /**
     * DOCUMENT ME!
     *
     * @param aMiddleWareToolLog DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(MiddleWareToolLog aMiddleWareToolLog)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aMiddleWareToolLogs DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeMiddleWareToolLog(
        MiddleWareToolLog[] aMiddleWareToolLogs,
        MiddleWareToolLogDAOQueryBean aQueryBean) throws Exception {
        synchronizeMiddleWareToolLog(aMiddleWareToolLogs, aQueryBean, null);
    } // end synchronizeMiddleWareToolLog()

    /**
     * DOCUMENT ME!
     *
     * @param aMiddleWareToolLogs DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeMiddleWareToolLog(
        MiddleWareToolLog[] aMiddleWareToolLogs,
        MiddleWareToolLogDAOQueryBean aQueryBean,
        MiddleWareToolLogSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aMiddleWareToolLogs) == false) {
            inputList.addAll(Arrays.asList(aMiddleWareToolLogs));
        } // end if

        MiddleWareToolLog[] existentMiddleWareToolLogs = this.queryMiddleWareToolLog(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentMiddleWareToolLogs) == false) {
            existentList.addAll(Arrays.asList(existentMiddleWareToolLogs));
        } // end if

        List willAddMiddleWareToolLogs = ListUtils.subtract(inputList,
                existentList);

        List willDeleteMiddleWareToolLogs = ListUtils.subtract(existentList,
                inputList);

        List willUpdateMiddleWareToolLogs = ListUtils.intersection(existentList,
                inputList);

        MiddleWareToolLog[] willUpdateMiddleWareToolLogArray = (MiddleWareToolLog[]) willUpdateMiddleWareToolLogs.toArray(new MiddleWareToolLog[willUpdateMiddleWareToolLogs.size()]);
        MiddleWareToolLog[] willAddMiddleWareToolLogArray = (MiddleWareToolLog[]) willAddMiddleWareToolLogs.toArray(new MiddleWareToolLog[willAddMiddleWareToolLogs.size()]);
        MiddleWareToolLog[] willDeleteMiddleWareToolLogArray = (MiddleWareToolLog[]) willDeleteMiddleWareToolLogs.toArray(new MiddleWareToolLog[willDeleteMiddleWareToolLogs.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddMiddleWareToolLogArray,
                willUpdateMiddleWareToolLogArray,
                willDeleteMiddleWareToolLogArray);
        } // end if

        if (willUpdateMiddleWareToolLogs.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateMiddleWareToolLogArray);
            } // end if

            this.batchUpdateMiddleWareToolLog(willUpdateMiddleWareToolLogArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateMiddleWareToolLogArray);
            } // end if
        } // end if

        if (willAddMiddleWareToolLogs.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddMiddleWareToolLogArray);
            } // end if

            this.batchInsertMiddleWareToolLog(willAddMiddleWareToolLogArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddMiddleWareToolLogArray);
            } // end if
        } // end if

        if (willDeleteMiddleWareToolLogs.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteMiddleWareToolLogArray);
            } // end if

            for (int i = 0; i < willDeleteMiddleWareToolLogArray.length; i++) {
                MiddleWareToolLog object = willDeleteMiddleWareToolLogArray[i];
                this.deleteMiddleWareToolLog(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteMiddleWareToolLogArray);
            } // end if
        } // end if
    } // end synchronizeMiddleWareToolLog()

    /**
     * Query IMiddleWareToolLog
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public MiddleWareToolLog findMiddleWareToolLogById(final long aId)
        throws Exception {
        MiddleWareToolLogDAOQueryBean queryBean = new MiddleWareToolLogDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        MiddleWareToolLog[] MiddleWareToolLogs = queryMiddleWareToolLog(queryBean);

        if (MiddleWareToolLogs.length == 0) {
            return null;
        } // end if
        else {
            return MiddleWareToolLogs[0];
        } // end else
    } // end findMiddleWareToolLogById()

    /**
     * Query IMiddleWareToolLog
     *
     * @param queryBean
     *
     * @return IMiddleWareToolLog[]
     *
     * @throws Exception
     */
    public MiddleWareToolLog[] queryMiddleWareToolLog(
        MiddleWareToolLogDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcMiddleWareToolLogRowMapper());

        return (MiddleWareToolLog[]) result.toArray(new MiddleWareToolLog[result.size()]);
    } // end queryMiddleWareToolLog()

    /**
     * Query MiddleWareToolLog Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryMiddleWareToolLogSelective(
        MiddleWareToolLogDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryMiddleWareToolLogSelective()

    /**
     * Query IMiddleWareToolLog Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryMiddleWareToolLogCount(
        MiddleWareToolLogDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end queryMiddleWareToolLogCount()

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.middleware.dao.impl.BaseMiddleWareToolInputLogDAOJdbcImpl middleWareToolInputLog;

    /**
     * DOCUMENT ME!
     *
     * @param middleWareToolInputLog DOCUMENT ME!
     */
    public void setMiddleWareToolInputLog(
        com.ourteam.middleware.dao.impl.BaseMiddleWareToolInputLogDAOJdbcImpl middleWareToolInputLog) {
        this.middleWareToolInputLog = middleWareToolInputLog;
    } // end setMiddleWareToolInputLog()

    /**
     * Query Related IMiddleWareToolInputLog
     *
     * @param aDaoQueryBean DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="IMiddleWareToolInputLog" containment="true"
     */
    public com.ourteam.middleware.dao.MiddleWareToolInputLog[] queryMiddleWareToolInputLogs(
        MiddleWareToolLogDAOQueryBean aDaoQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN MIDDLE_WARE_TOOL_LOG ON ( ");

        joinSQL.append(
            " MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_LOG_ID = MIDDLE_WARE_TOOL_LOG.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.middleware.dao.IMiddleWareToolInputLogDAO.EntityName;

        String[] entityFields = com.ourteam.middleware.dao.impl.BaseMiddleWareToolInputLogDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.middleware.dao.impl.BaseMiddleWareToolInputLogDAOJdbcImpl.ENTITY_PROPERTIES;

        List list = middleWareToolInputLog.query(entityName, entityFields,
                entityProperties, aDaoQueryBean, joinSQL.toString(),
                new com.ourteam.middleware.dao.impl.BaseMiddleWareToolInputLogDAOJdbcImpl.JdbcMiddleWareToolInputLogRowMapper());

        return (com.ourteam.middleware.dao.MiddleWareToolInputLog[]) list.toArray(new com.ourteam.middleware.dao.MiddleWareToolInputLog[list.size()]);
    } // end queryMiddleWareToolInputLogs()

    /**
     * Query MiddleWareToolLog Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryMiddleWareToolInputLogsSelective(
        MiddleWareToolLogDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addSelectProperty(com.ourteam.middleware.dao.IMiddleWareToolInputLogDAO.Id,
                "id");

            aQueryBean.addSelectProperty(com.ourteam.middleware.dao.IMiddleWareToolInputLogDAO.Remarks,
                "remarks");

            aQueryBean.addSelectProperty(com.ourteam.middleware.dao.IMiddleWareToolInputLogDAO.Status,
                "status");

            aQueryBean.addSelectProperty(com.ourteam.middleware.dao.IMiddleWareToolInputLogDAO.ToolInputId,
                "toolInputId");

            aQueryBean.addSelectProperty(com.ourteam.middleware.dao.IMiddleWareToolInputLogDAO.ToolInputValue,
                "toolInputValue");

            aQueryBean.addSelectProperty(com.ourteam.middleware.dao.IMiddleWareToolInputLogDAO.ToolLogId,
                "toolLogId");

            aQueryBean.addSelectProperty(com.ourteam.middleware.dao.IMiddleWareToolInputLogDAO.ParameterName,
                "parameterName");

            aQueryBean.addSelectProperty(com.ourteam.middleware.dao.IMiddleWareToolInputLogDAO.ParameterCode,
                "parameterCode");

            aQueryBean.addSelectProperty(com.ourteam.middleware.dao.IMiddleWareToolInputLogDAO.ParameterType,
                "parameterType");

            aQueryBean.addSelectProperty(com.ourteam.middleware.dao.IMiddleWareToolInputLogDAO.SortIndex,
                "sortIndex");
        } // end if

        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN MIDDLE_WARE_TOOL_LOG ON ( ");

        joinSQL.append(
            " MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_LOG_ID = MIDDLE_WARE_TOOL_LOG.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.middleware.dao.IMiddleWareToolInputLogDAO.EntityName;

        return middleWareToolInputLog.querySelective(entityName, aQueryBean,
            joinSQL.toString());
    } // end queryMiddleWareToolInputLogsSelective()

    /**
     * Update Related IMiddleWareToolInputLog
     *
     * @param aMiddleWareToolInputLog {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void updateMiddleWareToolInputLog(
        com.ourteam.middleware.dao.MiddleWareToolInputLog aMiddleWareToolInputLog,
        MiddleWareToolLogDAOQueryBean aQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN MIDDLE_WARE_TOOL_LOG ON ( ");

        joinSQL.append(
            " MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_LOG_ID = MIDDLE_WARE_TOOL_LOG.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.middleware.dao.IMiddleWareToolInputLogDAO.EntityName;

        String[] entityFields = com.ourteam.middleware.dao.impl.BaseMiddleWareToolInputLogDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.middleware.dao.impl.BaseMiddleWareToolInputLogDAOJdbcImpl.ENTITY_PROPERTIES;

        middleWareToolInputLog.updateByQuery(entityName, entityFields,
            entityProperties, joinSQL.toString(), aMiddleWareToolInputLog,
            aQueryBean);
    } // end updateMiddleWareToolInputLog()

    /**
     * Delete Related IMiddleWareToolInputLog
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void deleteMiddleWareToolInputLog(
        MiddleWareToolLogDAOQueryBean aQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN MIDDLE_WARE_TOOL_LOG ON ( ");

        joinSQL.append(
            " MIDDLE_WARE_TOOL_INPUT_LOG.TOOL_LOG_ID = MIDDLE_WARE_TOOL_LOG.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.middleware.dao.IMiddleWareToolInputLogDAO.EntityName;

        middleWareToolInputLog.deleteByQuery(entityName, joinSQL.toString(),
            aQueryBean);
    } // end deleteMiddleWareToolInputLog()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcMiddleWareToolLogRowMapper
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
            MiddleWareToolLog object = new MiddleWareToolLog();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object ExecuteFinishTime = resultSet.getObject(columnIndex++);

                object.setExecuteFinishTimeNull(resultSet.getBoolean(
                        columnIndex++));

                if (ExecuteFinishTime != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ExecuteFinishTime, ExecuteFinishTime);
                } // end if

                Object ExecuteLog = resultSet.getObject(columnIndex++);

                object.setExecuteLogNull(resultSet.getBoolean(columnIndex++));

                if (ExecuteLog != null) {
                    BeanUtils.setProperty(object, DataProperty.ExecuteLog,
                        ExecuteLog);
                } // end if

                Object ExecuteResult = resultSet.getObject(columnIndex++);

                object.setExecuteResultNull(resultSet.getBoolean(columnIndex++));

                if (ExecuteResult != null) {
                    BeanUtils.setProperty(object, DataProperty.ExecuteResult,
                        ExecuteResult);
                } // end if

                Object ExecuteStartTime = resultSet.getObject(columnIndex++);

                object.setExecuteStartTimeNull(resultSet.getBoolean(
                        columnIndex++));

                if (ExecuteStartTime != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ExecuteStartTime, ExecuteStartTime);
                } // end if

                Object ExecutorId = resultSet.getObject(columnIndex++);

                object.setExecutorIdNull(resultSet.getBoolean(columnIndex++));

                if (ExecutorId != null) {
                    BeanUtils.setProperty(object, DataProperty.ExecutorId,
                        ExecutorId);
                } // end if

                Object MiddleWareId = resultSet.getObject(columnIndex++);

                object.setMiddleWareIdNull(resultSet.getBoolean(columnIndex++));

                if (MiddleWareId != null) {
                    BeanUtils.setProperty(object, DataProperty.MiddleWareId,
                        MiddleWareId);
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

                Object ToolId = resultSet.getObject(columnIndex++);

                object.setToolIdNull(resultSet.getBoolean(columnIndex++));

                if (ToolId != null) {
                    BeanUtils.setProperty(object, DataProperty.ToolId, ToolId);
                } // end if

                Object ExecutorName = resultSet.getObject(columnIndex++);

                object.setExecutorNameNull(resultSet.getBoolean(columnIndex++));

                if (ExecutorName != null) {
                    BeanUtils.setProperty(object, DataProperty.ExecutorName,
                        ExecutorName);
                } // end if

                Object ExecuteScript = resultSet.getObject(columnIndex++);

                object.setExecuteScriptNull(resultSet.getBoolean(columnIndex++));

                if (ExecuteScript != null) {
                    BeanUtils.setProperty(object, DataProperty.ExecuteScript,
                        ExecuteScript);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcMiddleWareToolLogRowMapper
} // end BaseMiddleWareToolLogDAOJdbcImpl
