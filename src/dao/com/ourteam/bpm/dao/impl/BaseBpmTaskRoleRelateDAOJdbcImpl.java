/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao.impl;

import com.ourteam.bpm.dao.BpmTaskRoleRelate;
import com.ourteam.bpm.dao.BpmTaskRoleRelateDAOQueryBean;
import com.ourteam.bpm.dao.IBpmTaskRoleRelateDAO;

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
 * DAO JDBC Impl Generate Date : 2011-11-30 15:28:22
 *
 * @author kylin
 */
abstract public class BaseBpmTaskRoleRelateDAOJdbcImpl extends AbstractJdbcDAO
    implements IBpmTaskRoleRelateDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, Remarks, RoleId, Status, TaskId, ProcessInstanceId, TaskName,
            TaskSerialNumber
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.Remarks, DataProperty.RoleId,
            DataProperty.Status, DataProperty.TaskId,
            DataProperty.ProcessInstanceId, DataProperty.TaskName,
            DataProperty.TaskSerialNumber
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
     * Creates a new BaseBpmTaskRoleRelateDAOJdbcImpl object.
     */
    public BaseBpmTaskRoleRelateDAOJdbcImpl() {
        super();
    } // end BaseBpmTaskRoleRelateDAOJdbcImpl()

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

            relatedJoinSQLBuffer.append(" LEFT JOIN BPM_TASK bpmTaskG ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " bpmTaskG.ID = BPM_TASK_ROLE_RELATE.TASK_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique BpmTaskRoleRelate
     *
     * @param aBpmTaskRoleRelate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(BpmTaskRoleRelate aBpmTaskRoleRelate)
        throws Exception {
        if (aBpmTaskRoleRelate == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aBpmTaskRoleRelate,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IBpmTaskRoleRelate
     *
     * @param aBpmTaskRoleRelate
     *
     * @throws Exception
     */
    public void insertBpmTaskRoleRelate(BpmTaskRoleRelate aBpmTaskRoleRelate)
        throws Exception {
        org.apache.commons.beanutils.PropertyUtils.setProperty(aBpmTaskRoleRelate,
            "status",
            org.apache.commons.beanutils.ConvertUtils.convert("ACTIVED",
                String.class));

        insert(aBpmTaskRoleRelate);
    } // end insertBpmTaskRoleRelate()

    /**
     * Batch Insert IBpmTaskRoleRelate
     *
     * @param aBpmTaskRoleRelate
     *
     * @throws Exception
     */
    public void batchInsertBpmTaskRoleRelate(
        BpmTaskRoleRelate[] aBpmTaskRoleRelate) throws Exception {
        batchInsert(aBpmTaskRoleRelate);
    } // end batchInsertBpmTaskRoleRelate()

    /**
     * Delete IBpmTaskRoleRelate
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteBpmTaskRoleRelate(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteBpmTaskRoleRelate()

    /**
     * Delete IBpmTaskRoleRelate
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteBpmTaskRoleRelate(BpmTaskRoleRelateDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteBpmTaskRoleRelate()

    /**
     * Update IBpmTaskRoleRelate Selective
     *
     * @param aBpmTaskRoleRelate
     *
     * @throws Exception
     */
    public void updateBpmTaskRoleRelate(BpmTaskRoleRelate aBpmTaskRoleRelate)
        throws Exception {
        if (aBpmTaskRoleRelate.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aBpmTaskRoleRelate);

        BpmTaskRoleRelate tempObj = findBpmTaskRoleRelateById(aBpmTaskRoleRelate.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aBpmTaskRoleRelate, tempObj);
        } // end if
    } // end updateBpmTaskRoleRelate()

    /**
     * Batch Update IBpmTaskRoleRelate
     *
     * @param aBpmTaskRoleRelate
     *
     * @throws Exception
     */
    public void batchUpdateBpmTaskRoleRelate(
        BpmTaskRoleRelate[] aBpmTaskRoleRelate) throws Exception {
        batchUpdate(aBpmTaskRoleRelate);
    } // end batchUpdateBpmTaskRoleRelate()

    /**
     * Update IBpmTaskRoleRelate
     *
     * @param aBpmTaskRoleRelate
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateBpmTaskRoleRelate(BpmTaskRoleRelate aBpmTaskRoleRelate,
        BpmTaskRoleRelateDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aBpmTaskRoleRelate, aQueryBean);
    } // end updateBpmTaskRoleRelate()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmTaskRoleRelate DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(BpmTaskRoleRelate aBpmTaskRoleRelate)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmTaskRoleRelates DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmTaskRoleRelate(
        BpmTaskRoleRelate[] aBpmTaskRoleRelates,
        BpmTaskRoleRelateDAOQueryBean aQueryBean) throws Exception {
        synchronizeBpmTaskRoleRelate(aBpmTaskRoleRelates, aQueryBean, null);
    } // end synchronizeBpmTaskRoleRelate()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmTaskRoleRelates DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmTaskRoleRelate(
        BpmTaskRoleRelate[] aBpmTaskRoleRelates,
        BpmTaskRoleRelateDAOQueryBean aQueryBean,
        BpmTaskRoleRelateSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aBpmTaskRoleRelates) == false) {
            inputList.addAll(Arrays.asList(aBpmTaskRoleRelates));
        } // end if

        BpmTaskRoleRelate[] existentBpmTaskRoleRelates = this.queryBpmTaskRoleRelate(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentBpmTaskRoleRelates) == false) {
            existentList.addAll(Arrays.asList(existentBpmTaskRoleRelates));
        } // end if

        List willAddBpmTaskRoleRelates = ListUtils.subtract(inputList,
                existentList);

        List willDeleteBpmTaskRoleRelates = ListUtils.subtract(existentList,
                inputList);

        List willUpdateBpmTaskRoleRelates = ListUtils.intersection(existentList,
                inputList);

        BpmTaskRoleRelate[] willUpdateBpmTaskRoleRelateArray = (BpmTaskRoleRelate[]) willUpdateBpmTaskRoleRelates.toArray(new BpmTaskRoleRelate[willUpdateBpmTaskRoleRelates.size()]);
        BpmTaskRoleRelate[] willAddBpmTaskRoleRelateArray = (BpmTaskRoleRelate[]) willAddBpmTaskRoleRelates.toArray(new BpmTaskRoleRelate[willAddBpmTaskRoleRelates.size()]);
        BpmTaskRoleRelate[] willDeleteBpmTaskRoleRelateArray = (BpmTaskRoleRelate[]) willDeleteBpmTaskRoleRelates.toArray(new BpmTaskRoleRelate[willDeleteBpmTaskRoleRelates.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddBpmTaskRoleRelateArray,
                willUpdateBpmTaskRoleRelateArray,
                willDeleteBpmTaskRoleRelateArray);
        } // end if

        if (willUpdateBpmTaskRoleRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateBpmTaskRoleRelateArray);
            } // end if

            this.batchUpdateBpmTaskRoleRelate(willUpdateBpmTaskRoleRelateArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateBpmTaskRoleRelateArray);
            } // end if
        } // end if

        if (willAddBpmTaskRoleRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddBpmTaskRoleRelateArray);
            } // end if

            this.batchInsertBpmTaskRoleRelate(willAddBpmTaskRoleRelateArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddBpmTaskRoleRelateArray);
            } // end if
        } // end if

        if (willDeleteBpmTaskRoleRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteBpmTaskRoleRelateArray);
            } // end if

            for (int i = 0; i < willDeleteBpmTaskRoleRelateArray.length; i++) {
                BpmTaskRoleRelate object = willDeleteBpmTaskRoleRelateArray[i];
                this.deleteBpmTaskRoleRelate(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteBpmTaskRoleRelateArray);
            } // end if
        } // end if
    } // end synchronizeBpmTaskRoleRelate()

    /**
     * Query IBpmTaskRoleRelate
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public BpmTaskRoleRelate findBpmTaskRoleRelateById(final long aId)
        throws Exception {
        BpmTaskRoleRelateDAOQueryBean queryBean = new BpmTaskRoleRelateDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        BpmTaskRoleRelate[] BpmTaskRoleRelates = queryBpmTaskRoleRelate(queryBean);

        if (BpmTaskRoleRelates.length == 0) {
            return null;
        } // end if
        else {
            return BpmTaskRoleRelates[0];
        } // end else
    } // end findBpmTaskRoleRelateById()

    /**
     * Query IBpmTaskRoleRelate
     *
     * @param queryBean
     *
     * @return IBpmTaskRoleRelate[]
     *
     * @throws Exception
     */
    public BpmTaskRoleRelate[] queryBpmTaskRoleRelate(
        BpmTaskRoleRelateDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcBpmTaskRoleRelateRowMapper());

        return (BpmTaskRoleRelate[]) result.toArray(new BpmTaskRoleRelate[result.size()]);
    } // end queryBpmTaskRoleRelate()

    /**
     * Query BpmTaskRoleRelate Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryBpmTaskRoleRelateSelective(
        BpmTaskRoleRelateDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryBpmTaskRoleRelateSelective()

    /**
     * Query IBpmTaskRoleRelate Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryBpmTaskRoleRelateCount(
        BpmTaskRoleRelateDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end queryBpmTaskRoleRelateCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcBpmTaskRoleRelateRowMapper
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
            BpmTaskRoleRelate object = new BpmTaskRoleRelate();

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

                Object RoleId = resultSet.getObject(columnIndex++);

                object.setRoleIdNull(resultSet.getBoolean(columnIndex++));

                if (RoleId != null) {
                    BeanUtils.setProperty(object, DataProperty.RoleId, RoleId);
                } // end if

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object TaskId = resultSet.getObject(columnIndex++);

                object.setTaskIdNull(resultSet.getBoolean(columnIndex++));

                if (TaskId != null) {
                    BeanUtils.setProperty(object, DataProperty.TaskId, TaskId);
                } // end if

                Object ProcessInstanceId = resultSet.getObject(columnIndex++);

                object.setProcessInstanceIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (ProcessInstanceId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ProcessInstanceId, ProcessInstanceId);
                } // end if

                Object TaskName = resultSet.getObject(columnIndex++);

                object.setTaskNameNull(resultSet.getBoolean(columnIndex++));

                if (TaskName != null) {
                    BeanUtils.setProperty(object, DataProperty.TaskName,
                        TaskName);
                } // end if

                Object TaskSerialNumber = resultSet.getObject(columnIndex++);

                object.setTaskSerialNumberNull(resultSet.getBoolean(
                        columnIndex++));

                if (TaskSerialNumber != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.TaskSerialNumber, TaskSerialNumber);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcBpmTaskRoleRelateRowMapper
} // end BaseBpmTaskRoleRelateDAOJdbcImpl
