/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao.impl;

import com.ourteam.bpm.dao.BpmProcessInstance;
import com.ourteam.bpm.dao.BpmProcessInstanceDAOQueryBean;
import com.ourteam.bpm.dao.IBpmProcessInstanceDAO;

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
 * DAO JDBC Impl Generate Date : 2011-11-25 15:18:08
 *
 * @author kylin
 */
abstract public class BaseBpmProcessInstanceDAOJdbcImpl extends AbstractJdbcDAO
    implements IBpmProcessInstanceDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, CompleteDate, ProcessDefineId, Remarks, StarterId, StartDate,
            Status, ProcessName, ProcessKey, StarterName, StarterCode,
            InstanceId, SerialNumber, LastOperatorId, CommentCount,
            AttachmentCount, StartFormKey
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.CompleteDate,
            DataProperty.ProcessDefineId, DataProperty.Remarks,
            DataProperty.StarterId, DataProperty.StartDate, DataProperty.Status,
            DataProperty.ProcessName, DataProperty.ProcessKey,
            DataProperty.StarterName, DataProperty.StarterCode,
            DataProperty.InstanceId, DataProperty.SerialNumber,
            DataProperty.LastOperatorId, DataProperty.CommentCount,
            DataProperty.AttachmentCount, DataProperty.StartFormKey
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
     * Creates a new BaseBpmProcessInstanceDAOJdbcImpl object.
     */
    public BaseBpmProcessInstanceDAOJdbcImpl() {
        super();
    } // end BaseBpmProcessInstanceDAOJdbcImpl()

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
                " LEFT JOIN BPM_PROCESS_DEFINE bpmProcessDefineE ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " bpmProcessDefineE.ID = BPM_PROCESS_INSTANCE.PROCESS_DEFINE_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQLBuffer.append(" LEFT JOIN HR_EMPLOYEE employeeE ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " employeeE.ID = BPM_PROCESS_INSTANCE.STARTER_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique BpmProcessInstance
     *
     * @param aBpmProcessInstance
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(BpmProcessInstance aBpmProcessInstance)
        throws Exception {
        if (aBpmProcessInstance == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aBpmProcessInstance,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IBpmProcessInstance
     *
     * @param aBpmProcessInstance
     *
     * @throws Exception
     */
    public void insertBpmProcessInstance(BpmProcessInstance aBpmProcessInstance)
        throws Exception {
        insert(aBpmProcessInstance);
    } // end insertBpmProcessInstance()

    /**
     * Batch Insert IBpmProcessInstance
     *
     * @param aBpmProcessInstance
     *
     * @throws Exception
     */
    public void batchInsertBpmProcessInstance(
        BpmProcessInstance[] aBpmProcessInstance) throws Exception {
        batchInsert(aBpmProcessInstance);
    } // end batchInsertBpmProcessInstance()

    /**
     * Delete IBpmProcessInstance
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteBpmProcessInstance(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteBpmProcessInstance()

    /**
     * Delete IBpmProcessInstance
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteBpmProcessInstance(
        BpmProcessInstanceDAOQueryBean queryBean) throws Exception {
        deleteByQuery(queryBean);
    } // end deleteBpmProcessInstance()

    /**
     * Update IBpmProcessInstance Selective
     *
     * @param aBpmProcessInstance
     *
     * @throws Exception
     */
    public void updateBpmProcessInstance(BpmProcessInstance aBpmProcessInstance)
        throws Exception {
        if (aBpmProcessInstance.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aBpmProcessInstance);

        BpmProcessInstance tempObj = findBpmProcessInstanceById(aBpmProcessInstance.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aBpmProcessInstance, tempObj);
        } // end if
    } // end updateBpmProcessInstance()

    /**
     * Batch Update IBpmProcessInstance
     *
     * @param aBpmProcessInstance
     *
     * @throws Exception
     */
    public void batchUpdateBpmProcessInstance(
        BpmProcessInstance[] aBpmProcessInstance) throws Exception {
        batchUpdate(aBpmProcessInstance);
    } // end batchUpdateBpmProcessInstance()

    /**
     * Update IBpmProcessInstance
     *
     * @param aBpmProcessInstance
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateBpmProcessInstance(
        BpmProcessInstance aBpmProcessInstance,
        BpmProcessInstanceDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aBpmProcessInstance, aQueryBean);
    } // end updateBpmProcessInstance()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmProcessInstance DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(BpmProcessInstance aBpmProcessInstance)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmProcessInstances DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmProcessInstance(
        BpmProcessInstance[] aBpmProcessInstances,
        BpmProcessInstanceDAOQueryBean aQueryBean) throws Exception {
        synchronizeBpmProcessInstance(aBpmProcessInstances, aQueryBean, null);
    } // end synchronizeBpmProcessInstance()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmProcessInstances DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmProcessInstance(
        BpmProcessInstance[] aBpmProcessInstances,
        BpmProcessInstanceDAOQueryBean aQueryBean,
        BpmProcessInstanceSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aBpmProcessInstances) == false) {
            inputList.addAll(Arrays.asList(aBpmProcessInstances));
        } // end if

        BpmProcessInstance[] existentBpmProcessInstances = this.queryBpmProcessInstance(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentBpmProcessInstances) == false) {
            existentList.addAll(Arrays.asList(existentBpmProcessInstances));
        } // end if

        List willAddBpmProcessInstances = ListUtils.subtract(inputList,
                existentList);

        List willDeleteBpmProcessInstances = ListUtils.subtract(existentList,
                inputList);

        List willUpdateBpmProcessInstances = ListUtils.intersection(existentList,
                inputList);

        BpmProcessInstance[] willUpdateBpmProcessInstanceArray = (BpmProcessInstance[]) willUpdateBpmProcessInstances.toArray(new BpmProcessInstance[willUpdateBpmProcessInstances.size()]);
        BpmProcessInstance[] willAddBpmProcessInstanceArray = (BpmProcessInstance[]) willAddBpmProcessInstances.toArray(new BpmProcessInstance[willAddBpmProcessInstances.size()]);
        BpmProcessInstance[] willDeleteBpmProcessInstanceArray = (BpmProcessInstance[]) willDeleteBpmProcessInstances.toArray(new BpmProcessInstance[willDeleteBpmProcessInstances.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddBpmProcessInstanceArray,
                willUpdateBpmProcessInstanceArray,
                willDeleteBpmProcessInstanceArray);
        } // end if

        if (willUpdateBpmProcessInstances.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateBpmProcessInstanceArray);
            } // end if

            this.batchUpdateBpmProcessInstance(willUpdateBpmProcessInstanceArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateBpmProcessInstanceArray);
            } // end if
        } // end if

        if (willAddBpmProcessInstances.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddBpmProcessInstanceArray);
            } // end if

            this.batchInsertBpmProcessInstance(willAddBpmProcessInstanceArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddBpmProcessInstanceArray);
            } // end if
        } // end if

        if (willDeleteBpmProcessInstances.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteBpmProcessInstanceArray);
            } // end if

            for (int i = 0; i < willDeleteBpmProcessInstanceArray.length;
                    i++) {
                BpmProcessInstance object = willDeleteBpmProcessInstanceArray[i];
                this.deleteBpmProcessInstance(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteBpmProcessInstanceArray);
            } // end if
        } // end if
    } // end synchronizeBpmProcessInstance()

    /**
     * Query IBpmProcessInstance
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public BpmProcessInstance findBpmProcessInstanceById(final long aId)
        throws Exception {
        BpmProcessInstanceDAOQueryBean queryBean = new BpmProcessInstanceDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        BpmProcessInstance[] BpmProcessInstances = queryBpmProcessInstance(queryBean);

        if (BpmProcessInstances.length == 0) {
            return null;
        } // end if
        else {
            return BpmProcessInstances[0];
        } // end else
    } // end findBpmProcessInstanceById()

    /**
     * Query IBpmProcessInstance
     *
     * @param queryBean
     *
     * @return IBpmProcessInstance[]
     *
     * @throws Exception
     */
    public BpmProcessInstance[] queryBpmProcessInstance(
        BpmProcessInstanceDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean,
                new JdbcBpmProcessInstanceRowMapper());

        return (BpmProcessInstance[]) result.toArray(new BpmProcessInstance[result.size()]);
    } // end queryBpmProcessInstance()

    /**
     * Query BpmProcessInstance Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryBpmProcessInstanceSelective(
        BpmProcessInstanceDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryBpmProcessInstanceSelective()

    /**
     * Query IBpmProcessInstance Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryBpmProcessInstanceCount(
        BpmProcessInstanceDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end queryBpmProcessInstanceCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcBpmProcessInstanceRowMapper
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
            BpmProcessInstance object = new BpmProcessInstance();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object CompleteDate = resultSet.getObject(columnIndex++);

                object.setCompleteDateNull(resultSet.getBoolean(columnIndex++));

                if (CompleteDate != null) {
                    BeanUtils.setProperty(object, DataProperty.CompleteDate,
                        CompleteDate);
                } // end if

                Object ProcessDefineId = resultSet.getObject(columnIndex++);

                object.setProcessDefineIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (ProcessDefineId != null) {
                    BeanUtils.setProperty(object, DataProperty.ProcessDefineId,
                        ProcessDefineId);
                } // end if

                Object Remarks = resultSet.getObject(columnIndex++);

                object.setRemarksNull(resultSet.getBoolean(columnIndex++));

                if (Remarks != null) {
                    BeanUtils.setProperty(object, DataProperty.Remarks, Remarks);
                } // end if

                Object StarterId = resultSet.getObject(columnIndex++);

                object.setStarterIdNull(resultSet.getBoolean(columnIndex++));

                if (StarterId != null) {
                    BeanUtils.setProperty(object, DataProperty.StarterId,
                        StarterId);
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

                Object ProcessName = resultSet.getObject(columnIndex++);

                object.setProcessNameNull(resultSet.getBoolean(columnIndex++));

                if (ProcessName != null) {
                    BeanUtils.setProperty(object, DataProperty.ProcessName,
                        ProcessName);
                } // end if

                Object ProcessKey = resultSet.getObject(columnIndex++);

                object.setProcessKeyNull(resultSet.getBoolean(columnIndex++));

                if (ProcessKey != null) {
                    BeanUtils.setProperty(object, DataProperty.ProcessKey,
                        ProcessKey);
                } // end if

                Object StarterName = resultSet.getObject(columnIndex++);

                object.setStarterNameNull(resultSet.getBoolean(columnIndex++));

                if (StarterName != null) {
                    BeanUtils.setProperty(object, DataProperty.StarterName,
                        StarterName);
                } // end if

                Object StarterCode = resultSet.getObject(columnIndex++);

                object.setStarterCodeNull(resultSet.getBoolean(columnIndex++));

                if (StarterCode != null) {
                    BeanUtils.setProperty(object, DataProperty.StarterCode,
                        StarterCode);
                } // end if

                Object InstanceId = resultSet.getObject(columnIndex++);

                object.setInstanceIdNull(resultSet.getBoolean(columnIndex++));

                if (InstanceId != null) {
                    BeanUtils.setProperty(object, DataProperty.InstanceId,
                        InstanceId);
                } // end if

                Object SerialNumber = resultSet.getObject(columnIndex++);

                object.setSerialNumberNull(resultSet.getBoolean(columnIndex++));

                if (SerialNumber != null) {
                    BeanUtils.setProperty(object, DataProperty.SerialNumber,
                        SerialNumber);
                } // end if

                Object LastOperatorId = resultSet.getObject(columnIndex++);

                object.setLastOperatorIdNull(resultSet.getBoolean(columnIndex++));

                if (LastOperatorId != null) {
                    BeanUtils.setProperty(object, DataProperty.LastOperatorId,
                        LastOperatorId);
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

                Object StartFormKey = resultSet.getObject(columnIndex++);

                object.setStartFormKeyNull(resultSet.getBoolean(columnIndex++));

                if (StartFormKey != null) {
                    BeanUtils.setProperty(object, DataProperty.StartFormKey,
                        StartFormKey);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcBpmProcessInstanceRowMapper
} // end BaseBpmProcessInstanceDAOJdbcImpl
