/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao.impl;

import com.ourteam.bpm.dao.BpmProcessFormInstance;
import com.ourteam.bpm.dao.BpmProcessFormInstanceDAOQueryBean;
import com.ourteam.bpm.dao.IBpmProcessFormInstanceDAO;

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
 * DAO JDBC Impl Generate Date : 2011-11-28 15:45:17
 *
 * @author kylin
 */
abstract public class BaseBpmProcessFormInstanceDAOJdbcImpl
    extends AbstractJdbcDAO implements IBpmProcessFormInstanceDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, FormKey, FormXml, ProcessInstanceId, Remarks, Status, TaskId
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.FormKey, DataProperty.FormXml,
            DataProperty.ProcessInstanceId, DataProperty.Remarks,
            DataProperty.Status, DataProperty.TaskId
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
     * Creates a new BaseBpmProcessFormInstanceDAOJdbcImpl object.
     */
    public BaseBpmProcessFormInstanceDAOJdbcImpl() {
        super();
    } // end BaseBpmProcessFormInstanceDAOJdbcImpl()

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
     * Check Unique BpmProcessFormInstance
     *
     * @param aBpmProcessFormInstance
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(BpmProcessFormInstance aBpmProcessFormInstance)
        throws Exception {
        if (aBpmProcessFormInstance == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aBpmProcessFormInstance,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IBpmProcessFormInstance
     *
     * @param aBpmProcessFormInstance
     *
     * @throws Exception
     */
    public void insertBpmProcessFormInstance(
        BpmProcessFormInstance aBpmProcessFormInstance)
        throws Exception {
        insert(aBpmProcessFormInstance);
    } // end insertBpmProcessFormInstance()

    /**
     * Batch Insert IBpmProcessFormInstance
     *
     * @param aBpmProcessFormInstance
     *
     * @throws Exception
     */
    public void batchInsertBpmProcessFormInstance(
        BpmProcessFormInstance[] aBpmProcessFormInstance)
        throws Exception {
        batchInsert(aBpmProcessFormInstance);
    } // end batchInsertBpmProcessFormInstance()

    /**
     * Delete IBpmProcessFormInstance
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteBpmProcessFormInstance(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteBpmProcessFormInstance()

    /**
     * Delete IBpmProcessFormInstance
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteBpmProcessFormInstance(
        BpmProcessFormInstanceDAOQueryBean queryBean) throws Exception {
        deleteByQuery(queryBean);
    } // end deleteBpmProcessFormInstance()

    /**
     * Update IBpmProcessFormInstance Selective
     *
     * @param aBpmProcessFormInstance
     *
     * @throws Exception
     */
    public void updateBpmProcessFormInstance(
        BpmProcessFormInstance aBpmProcessFormInstance)
        throws Exception {
        if (aBpmProcessFormInstance.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aBpmProcessFormInstance);

        BpmProcessFormInstance tempObj = findBpmProcessFormInstanceById(aBpmProcessFormInstance.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aBpmProcessFormInstance, tempObj);
        } // end if
    } // end updateBpmProcessFormInstance()

    /**
     * Batch Update IBpmProcessFormInstance
     *
     * @param aBpmProcessFormInstance
     *
     * @throws Exception
     */
    public void batchUpdateBpmProcessFormInstance(
        BpmProcessFormInstance[] aBpmProcessFormInstance)
        throws Exception {
        batchUpdate(aBpmProcessFormInstance);
    } // end batchUpdateBpmProcessFormInstance()

    /**
     * Update IBpmProcessFormInstance
     *
     * @param aBpmProcessFormInstance
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateBpmProcessFormInstance(
        BpmProcessFormInstance aBpmProcessFormInstance,
        BpmProcessFormInstanceDAOQueryBean aQueryBean)
        throws Exception {
        updateByQuery(aBpmProcessFormInstance, aQueryBean);
    } // end updateBpmProcessFormInstance()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmProcessFormInstance DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(
        BpmProcessFormInstance aBpmProcessFormInstance)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmProcessFormInstances DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmProcessFormInstance(
        BpmProcessFormInstance[] aBpmProcessFormInstances,
        BpmProcessFormInstanceDAOQueryBean aQueryBean)
        throws Exception {
        synchronizeBpmProcessFormInstance(aBpmProcessFormInstances, aQueryBean,
            null);
    } // end synchronizeBpmProcessFormInstance()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmProcessFormInstances DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmProcessFormInstance(
        BpmProcessFormInstance[] aBpmProcessFormInstances,
        BpmProcessFormInstanceDAOQueryBean aQueryBean,
        BpmProcessFormInstanceSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aBpmProcessFormInstances) == false) {
            inputList.addAll(Arrays.asList(aBpmProcessFormInstances));
        } // end if

        BpmProcessFormInstance[] existentBpmProcessFormInstances = this.queryBpmProcessFormInstance(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentBpmProcessFormInstances) == false) {
            existentList.addAll(Arrays.asList(existentBpmProcessFormInstances));
        } // end if

        List willAddBpmProcessFormInstances = ListUtils.subtract(inputList,
                existentList);

        List willDeleteBpmProcessFormInstances = ListUtils.subtract(existentList,
                inputList);

        List willUpdateBpmProcessFormInstances = ListUtils.intersection(existentList,
                inputList);

        BpmProcessFormInstance[] willUpdateBpmProcessFormInstanceArray = (BpmProcessFormInstance[]) willUpdateBpmProcessFormInstances.toArray(new BpmProcessFormInstance[willUpdateBpmProcessFormInstances.size()]);
        BpmProcessFormInstance[] willAddBpmProcessFormInstanceArray = (BpmProcessFormInstance[]) willAddBpmProcessFormInstances.toArray(new BpmProcessFormInstance[willAddBpmProcessFormInstances.size()]);
        BpmProcessFormInstance[] willDeleteBpmProcessFormInstanceArray = (BpmProcessFormInstance[]) willDeleteBpmProcessFormInstances.toArray(new BpmProcessFormInstance[willDeleteBpmProcessFormInstances.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddBpmProcessFormInstanceArray,
                willUpdateBpmProcessFormInstanceArray,
                willDeleteBpmProcessFormInstanceArray);
        } // end if

        if (willUpdateBpmProcessFormInstances.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateBpmProcessFormInstanceArray);
            } // end if

            this.batchUpdateBpmProcessFormInstance(willUpdateBpmProcessFormInstanceArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateBpmProcessFormInstanceArray);
            } // end if
        } // end if

        if (willAddBpmProcessFormInstances.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddBpmProcessFormInstanceArray);
            } // end if

            this.batchInsertBpmProcessFormInstance(willAddBpmProcessFormInstanceArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddBpmProcessFormInstanceArray);
            } // end if
        } // end if

        if (willDeleteBpmProcessFormInstances.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteBpmProcessFormInstanceArray);
            } // end if

            for (int i = 0; i < willDeleteBpmProcessFormInstanceArray.length;
                    i++) {
                BpmProcessFormInstance object = willDeleteBpmProcessFormInstanceArray[i];
                this.deleteBpmProcessFormInstance(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteBpmProcessFormInstanceArray);
            } // end if
        } // end if
    } // end synchronizeBpmProcessFormInstance()

    /**
     * Query IBpmProcessFormInstance
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public BpmProcessFormInstance findBpmProcessFormInstanceById(final long aId)
        throws Exception {
        BpmProcessFormInstanceDAOQueryBean queryBean = new BpmProcessFormInstanceDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        BpmProcessFormInstance[] BpmProcessFormInstances = queryBpmProcessFormInstance(queryBean);

        if (BpmProcessFormInstances.length == 0) {
            return null;
        } // end if
        else {
            return BpmProcessFormInstances[0];
        } // end else
    } // end findBpmProcessFormInstanceById()

    /**
     * Query IBpmProcessFormInstance
     *
     * @param queryBean
     *
     * @return IBpmProcessFormInstance[]
     *
     * @throws Exception
     */
    public BpmProcessFormInstance[] queryBpmProcessFormInstance(
        BpmProcessFormInstanceDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean,
                new JdbcBpmProcessFormInstanceRowMapper());

        return (BpmProcessFormInstance[]) result.toArray(new BpmProcessFormInstance[result.size()]);
    } // end queryBpmProcessFormInstance()

    /**
     * Query BpmProcessFormInstance Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryBpmProcessFormInstanceSelective(
        BpmProcessFormInstanceDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryBpmProcessFormInstanceSelective()

    /**
     * Query IBpmProcessFormInstance Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryBpmProcessFormInstanceCount(
        BpmProcessFormInstanceDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end queryBpmProcessFormInstanceCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcBpmProcessFormInstanceRowMapper
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
            BpmProcessFormInstance object = new BpmProcessFormInstance();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object FormKey = resultSet.getObject(columnIndex++);

                object.setFormKeyNull(resultSet.getBoolean(columnIndex++));

                if (FormKey != null) {
                    BeanUtils.setProperty(object, DataProperty.FormKey, FormKey);
                } // end if

                Object FormXml = resultSet.getObject(columnIndex++);

                object.setFormXmlNull(resultSet.getBoolean(columnIndex++));

                if (FormXml != null) {
                    BeanUtils.setProperty(object, DataProperty.FormXml, FormXml);
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

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcBpmProcessFormInstanceRowMapper
} // end BaseBpmProcessFormInstanceDAOJdbcImpl
