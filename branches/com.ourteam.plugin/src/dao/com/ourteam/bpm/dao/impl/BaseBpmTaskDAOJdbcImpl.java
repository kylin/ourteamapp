/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao.impl;

import com.ourteam.bpm.dao.BpmTask;
import com.ourteam.bpm.dao.BpmTaskDAOQueryBean;
import com.ourteam.bpm.dao.IBpmTaskDAO;

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
 * DAO JDBC Impl Generate Date : 2011-11-30 15:28:53
 *
 * @author kylin
 */
abstract public class BaseBpmTaskDAOJdbcImpl extends AbstractJdbcDAO
    implements IBpmTaskDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, AssignerId, EndDateTime, Priority, ProcessInstanceId, Remarks,
            StartDateTime, Status, TaskKey, TaskName, ProcessDefineId,
            ProcessName, AssignerName, StarterId, SerialNumber, CommentCount,
            AttachmentCount, TaskFormKey, ProcessFormKey, PreTaskId
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.AssignerId, DataProperty.EndDateTime,
            DataProperty.Priority, DataProperty.ProcessInstanceId,
            DataProperty.Remarks, DataProperty.StartDateTime,
            DataProperty.Status, DataProperty.TaskKey, DataProperty.TaskName,
            DataProperty.ProcessDefineId, DataProperty.ProcessName,
            DataProperty.AssignerName, DataProperty.StarterId,
            DataProperty.SerialNumber, DataProperty.CommentCount,
            DataProperty.AttachmentCount, DataProperty.TaskFormKey,
            DataProperty.ProcessFormKey, DataProperty.PreTaskId
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
     * Creates a new BaseBpmTaskDAOJdbcImpl object.
     */
    public BaseBpmTaskDAOJdbcImpl() {
        super();
    } // end BaseBpmTaskDAOJdbcImpl()

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
                " LEFT JOIN BPM_PROCESS_INSTANCE bpmProcessInstanceF ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " bpmProcessInstanceF.ID = BPM_TASK.PROCESS_INSTANCE_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQLBuffer.append(
                " LEFT JOIN BPM_PROCESS_DEFINE bpmProcessDefineF ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " bpmProcessDefineF.ID = bpmProcessInstanceF.PROCESS_DEFINE_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQLBuffer.append(" LEFT JOIN HR_EMPLOYEE employeeF ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(" employeeF.ID = BPM_TASK.ASSIGNER_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique BpmTask
     *
     * @param aBpmTask
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(BpmTask aBpmTask) throws Exception {
        if (aBpmTask == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aBpmTask, DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IBpmTask
     *
     * @param aBpmTask
     *
     * @throws Exception
     */
    public void insertBpmTask(BpmTask aBpmTask) throws Exception {
        insert(aBpmTask);
    } // end insertBpmTask()

    /**
     * Batch Insert IBpmTask
     *
     * @param aBpmTask
     *
     * @throws Exception
     */
    public void batchInsertBpmTask(BpmTask[] aBpmTask)
        throws Exception {
        batchInsert(aBpmTask);
    } // end batchInsertBpmTask()

    /**
     * Delete IBpmTask
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteBpmTask(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteBpmTask()

    /**
     * Delete IBpmTask
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteBpmTask(BpmTaskDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteBpmTask()

    /**
     * Update IBpmTask Selective
     *
     * @param aBpmTask
     *
     * @throws Exception
     */
    public void updateBpmTask(BpmTask aBpmTask) throws Exception {
        if (aBpmTask.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aBpmTask);

        BpmTask tempObj = findBpmTaskById(aBpmTask.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aBpmTask, tempObj);
        } // end if
    } // end updateBpmTask()

    /**
     * Batch Update IBpmTask
     *
     * @param aBpmTask
     *
     * @throws Exception
     */
    public void batchUpdateBpmTask(BpmTask[] aBpmTask)
        throws Exception {
        batchUpdate(aBpmTask);
    } // end batchUpdateBpmTask()

    /**
     * Update IBpmTask
     *
     * @param aBpmTask
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateBpmTask(BpmTask aBpmTask, BpmTaskDAOQueryBean aQueryBean)
        throws Exception {
        updateByQuery(aBpmTask, aQueryBean);
    } // end updateBpmTask()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmTask DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(BpmTask aBpmTask) throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmTasks DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmTask(BpmTask[] aBpmTasks,
        BpmTaskDAOQueryBean aQueryBean) throws Exception {
        synchronizeBpmTask(aBpmTasks, aQueryBean, null);
    } // end synchronizeBpmTask()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmTasks DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmTask(BpmTask[] aBpmTasks,
        BpmTaskDAOQueryBean aQueryBean, BpmTaskSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aBpmTasks) == false) {
            inputList.addAll(Arrays.asList(aBpmTasks));
        } // end if

        BpmTask[] existentBpmTasks = this.queryBpmTask(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentBpmTasks) == false) {
            existentList.addAll(Arrays.asList(existentBpmTasks));
        } // end if

        List willAddBpmTasks = ListUtils.subtract(inputList, existentList);

        List willDeleteBpmTasks = ListUtils.subtract(existentList, inputList);

        List willUpdateBpmTasks = ListUtils.intersection(existentList, inputList);

        BpmTask[] willUpdateBpmTaskArray = (BpmTask[]) willUpdateBpmTasks.toArray(new BpmTask[willUpdateBpmTasks.size()]);
        BpmTask[] willAddBpmTaskArray = (BpmTask[]) willAddBpmTasks.toArray(new BpmTask[willAddBpmTasks.size()]);
        BpmTask[] willDeleteBpmTaskArray = (BpmTask[]) willDeleteBpmTasks.toArray(new BpmTask[willDeleteBpmTasks.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddBpmTaskArray,
                willUpdateBpmTaskArray, willDeleteBpmTaskArray);
        } // end if

        if (willUpdateBpmTasks.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateBpmTaskArray);
            } // end if

            this.batchUpdateBpmTask(willUpdateBpmTaskArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateBpmTaskArray);
            } // end if
        } // end if

        if (willAddBpmTasks.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddBpmTaskArray);
            } // end if

            this.batchInsertBpmTask(willAddBpmTaskArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddBpmTaskArray);
            } // end if
        } // end if

        if (willDeleteBpmTasks.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteBpmTaskArray);
            } // end if

            for (int i = 0; i < willDeleteBpmTaskArray.length; i++) {
                BpmTask object = willDeleteBpmTaskArray[i];
                this.deleteBpmTask(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteBpmTaskArray);
            } // end if
        } // end if
    } // end synchronizeBpmTask()

    /**
     * Query IBpmTask
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public BpmTask findBpmTaskById(final long aId) throws Exception {
        BpmTaskDAOQueryBean queryBean = new BpmTaskDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        BpmTask[] BpmTasks = queryBpmTask(queryBean);

        if (BpmTasks.length == 0) {
            return null;
        } // end if
        else {
            return BpmTasks[0];
        } // end else
    } // end findBpmTaskById()

    /**
     * Query IBpmTask
     *
     * @param queryBean
     *
     * @return IBpmTask[]
     *
     * @throws Exception
     */
    public BpmTask[] queryBpmTask(BpmTaskDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean, new JdbcBpmTaskRowMapper());

        return (BpmTask[]) result.toArray(new BpmTask[result.size()]);
    } // end queryBpmTask()

    /**
     * Query BpmTask Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryBpmTaskSelective(BpmTaskDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryBpmTaskSelective()

    /**
     * Query IBpmTask Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryBpmTaskCount(BpmTaskDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryBpmTaskCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcBpmTaskRowMapper implements ParameterizedRowMapper {
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
            BpmTask object = new BpmTask();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object AssignerId = resultSet.getObject(columnIndex++);

                object.setAssignerIdNull(resultSet.getBoolean(columnIndex++));

                if (AssignerId != null) {
                    BeanUtils.setProperty(object, DataProperty.AssignerId,
                        AssignerId);
                } // end if

                Object EndDateTime = resultSet.getObject(columnIndex++);

                object.setEndDateTimeNull(resultSet.getBoolean(columnIndex++));

                if (EndDateTime != null) {
                    BeanUtils.setProperty(object, DataProperty.EndDateTime,
                        EndDateTime);
                } // end if

                Object Priority = resultSet.getObject(columnIndex++);

                object.setPriorityNull(resultSet.getBoolean(columnIndex++));

                if (Priority != null) {
                    BeanUtils.setProperty(object, DataProperty.Priority,
                        Priority);
                } // end if

                Object ProcessInstanceId = resultSet.getObject(columnIndex++);

                object.setProcessInstanceIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (ProcessInstanceId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ProcessInstanceId, ProcessInstanceId);
                } // end if

                Object Remarks = resultSet.getObject(columnIndex++);

                object.setRemarksNull(resultSet.getBoolean(columnIndex++));

                if (Remarks != null) {
                    BeanUtils.setProperty(object, DataProperty.Remarks, Remarks);
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

                Object TaskKey = resultSet.getObject(columnIndex++);

                object.setTaskKeyNull(resultSet.getBoolean(columnIndex++));

                if (TaskKey != null) {
                    BeanUtils.setProperty(object, DataProperty.TaskKey, TaskKey);
                } // end if

                Object TaskName = resultSet.getObject(columnIndex++);

                object.setTaskNameNull(resultSet.getBoolean(columnIndex++));

                if (TaskName != null) {
                    BeanUtils.setProperty(object, DataProperty.TaskName,
                        TaskName);
                } // end if

                Object ProcessDefineId = resultSet.getObject(columnIndex++);

                object.setProcessDefineIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (ProcessDefineId != null) {
                    BeanUtils.setProperty(object, DataProperty.ProcessDefineId,
                        ProcessDefineId);
                } // end if

                Object ProcessName = resultSet.getObject(columnIndex++);

                object.setProcessNameNull(resultSet.getBoolean(columnIndex++));

                if (ProcessName != null) {
                    BeanUtils.setProperty(object, DataProperty.ProcessName,
                        ProcessName);
                } // end if

                Object AssignerName = resultSet.getObject(columnIndex++);

                object.setAssignerNameNull(resultSet.getBoolean(columnIndex++));

                if (AssignerName != null) {
                    BeanUtils.setProperty(object, DataProperty.AssignerName,
                        AssignerName);
                } // end if

                Object StarterId = resultSet.getObject(columnIndex++);

                object.setStarterIdNull(resultSet.getBoolean(columnIndex++));

                if (StarterId != null) {
                    BeanUtils.setProperty(object, DataProperty.StarterId,
                        StarterId);
                } // end if

                Object SerialNumber = resultSet.getObject(columnIndex++);

                object.setSerialNumberNull(resultSet.getBoolean(columnIndex++));

                if (SerialNumber != null) {
                    BeanUtils.setProperty(object, DataProperty.SerialNumber,
                        SerialNumber);
                } // end if

                Object CommentCount = resultSet.getObject(columnIndex++);

                object.setCommentCountNull(resultSet.getBoolean(columnIndex++));

                if (CommentCount != null) {
                    BeanUtils.setProperty(object, DataProperty.CommentCount,
                        CommentCount);
                } // end if

                Object AttachmentCount = resultSet.getObject(columnIndex++);

                object.setAttachmentCountNull(resultSet.getBoolean(
                        columnIndex++));

                if (AttachmentCount != null) {
                    BeanUtils.setProperty(object, DataProperty.AttachmentCount,
                        AttachmentCount);
                } // end if

                Object TaskFormKey = resultSet.getObject(columnIndex++);

                object.setTaskFormKeyNull(resultSet.getBoolean(columnIndex++));

                if (TaskFormKey != null) {
                    BeanUtils.setProperty(object, DataProperty.TaskFormKey,
                        TaskFormKey);
                } // end if

                Object ProcessFormKey = resultSet.getObject(columnIndex++);

                object.setProcessFormKeyNull(resultSet.getBoolean(columnIndex++));

                if (ProcessFormKey != null) {
                    BeanUtils.setProperty(object, DataProperty.ProcessFormKey,
                        ProcessFormKey);
                } // end if

                Object PreTaskId = resultSet.getObject(columnIndex++);

                object.setPreTaskIdNull(resultSet.getBoolean(columnIndex++));

                if (PreTaskId != null) {
                    BeanUtils.setProperty(object, DataProperty.PreTaskId,
                        PreTaskId);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcBpmTaskRowMapper
} // end BaseBpmTaskDAOJdbcImpl
