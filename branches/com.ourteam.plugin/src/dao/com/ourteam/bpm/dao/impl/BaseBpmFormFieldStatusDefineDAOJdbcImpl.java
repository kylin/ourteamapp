/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao.impl;

import com.ourteam.bpm.dao.BpmFormFieldStatusDefine;
import com.ourteam.bpm.dao.BpmFormFieldStatusDefineDAOQueryBean;
import com.ourteam.bpm.dao.IBpmFormFieldStatusDefineDAO;

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
 * DAO JDBC Impl Generate Date : 2011-11-01 13:20:49
 *
 * @author kylin
 */
abstract public class BaseBpmFormFieldStatusDefineDAOJdbcImpl
    extends AbstractJdbcDAO implements IBpmFormFieldStatusDefineDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, BpmRoleId, FieldDefineId, Remarks, Status, StepDefineId,
            FieldStatus
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.BpmRoleId, DataProperty.FieldDefineId,
            DataProperty.Remarks, DataProperty.Status, DataProperty.StepDefineId,
            DataProperty.FieldStatus
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
     * Creates a new BaseBpmFormFieldStatusDefineDAOJdbcImpl object.
     */
    public BaseBpmFormFieldStatusDefineDAOJdbcImpl() {
        super();
    } // end BaseBpmFormFieldStatusDefineDAOJdbcImpl()

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
     * Check Unique BpmFormFieldStatusDefine
     *
     * @param aBpmFormFieldStatusDefine
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(
        BpmFormFieldStatusDefine aBpmFormFieldStatusDefine)
        throws Exception {
        if (aBpmFormFieldStatusDefine == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aBpmFormFieldStatusDefine,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IBpmFormFieldStatusDefine
     *
     * @param aBpmFormFieldStatusDefine
     *
     * @throws Exception
     */
    public void insertBpmFormFieldStatusDefine(
        BpmFormFieldStatusDefine aBpmFormFieldStatusDefine)
        throws Exception {
        insert(aBpmFormFieldStatusDefine);
    } // end insertBpmFormFieldStatusDefine()

    /**
     * Batch Insert IBpmFormFieldStatusDefine
     *
     * @param aBpmFormFieldStatusDefine
     *
     * @throws Exception
     */
    public void batchInsertBpmFormFieldStatusDefine(
        BpmFormFieldStatusDefine[] aBpmFormFieldStatusDefine)
        throws Exception {
        batchInsert(aBpmFormFieldStatusDefine);
    } // end batchInsertBpmFormFieldStatusDefine()

    /**
     * Delete IBpmFormFieldStatusDefine
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteBpmFormFieldStatusDefine(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteBpmFormFieldStatusDefine()

    /**
     * Delete IBpmFormFieldStatusDefine
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteBpmFormFieldStatusDefine(
        BpmFormFieldStatusDefineDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteBpmFormFieldStatusDefine()

    /**
     * Update IBpmFormFieldStatusDefine Selective
     *
     * @param aBpmFormFieldStatusDefine
     *
     * @throws Exception
     */
    public void updateBpmFormFieldStatusDefine(
        BpmFormFieldStatusDefine aBpmFormFieldStatusDefine)
        throws Exception {
        if (aBpmFormFieldStatusDefine.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aBpmFormFieldStatusDefine);

        BpmFormFieldStatusDefine tempObj = findBpmFormFieldStatusDefineById(aBpmFormFieldStatusDefine.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aBpmFormFieldStatusDefine, tempObj);
        } // end if
    } // end updateBpmFormFieldStatusDefine()

    /**
     * Batch Update IBpmFormFieldStatusDefine
     *
     * @param aBpmFormFieldStatusDefine
     *
     * @throws Exception
     */
    public void batchUpdateBpmFormFieldStatusDefine(
        BpmFormFieldStatusDefine[] aBpmFormFieldStatusDefine)
        throws Exception {
        batchUpdate(aBpmFormFieldStatusDefine);
    } // end batchUpdateBpmFormFieldStatusDefine()

    /**
     * Update IBpmFormFieldStatusDefine
     *
     * @param aBpmFormFieldStatusDefine
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateBpmFormFieldStatusDefine(
        BpmFormFieldStatusDefine aBpmFormFieldStatusDefine,
        BpmFormFieldStatusDefineDAOQueryBean aQueryBean)
        throws Exception {
        updateByQuery(aBpmFormFieldStatusDefine, aQueryBean);
    } // end updateBpmFormFieldStatusDefine()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmFormFieldStatusDefine DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(
        BpmFormFieldStatusDefine aBpmFormFieldStatusDefine)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmFormFieldStatusDefines DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmFormFieldStatusDefine(
        BpmFormFieldStatusDefine[] aBpmFormFieldStatusDefines,
        BpmFormFieldStatusDefineDAOQueryBean aQueryBean)
        throws Exception {
        synchronizeBpmFormFieldStatusDefine(aBpmFormFieldStatusDefines,
            aQueryBean, null);
    } // end synchronizeBpmFormFieldStatusDefine()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmFormFieldStatusDefines DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmFormFieldStatusDefine(
        BpmFormFieldStatusDefine[] aBpmFormFieldStatusDefines,
        BpmFormFieldStatusDefineDAOQueryBean aQueryBean,
        BpmFormFieldStatusDefineSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aBpmFormFieldStatusDefines) == false) {
            inputList.addAll(Arrays.asList(aBpmFormFieldStatusDefines));
        } // end if

        BpmFormFieldStatusDefine[] existentBpmFormFieldStatusDefines = this.queryBpmFormFieldStatusDefine(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentBpmFormFieldStatusDefines) == false) {
            existentList.addAll(Arrays.asList(existentBpmFormFieldStatusDefines));
        } // end if

        List willAddBpmFormFieldStatusDefines = ListUtils.subtract(inputList,
                existentList);

        List willDeleteBpmFormFieldStatusDefines = ListUtils.subtract(existentList,
                inputList);

        List willUpdateBpmFormFieldStatusDefines = ListUtils.intersection(existentList,
                inputList);

        BpmFormFieldStatusDefine[] willUpdateBpmFormFieldStatusDefineArray = (BpmFormFieldStatusDefine[]) willUpdateBpmFormFieldStatusDefines.toArray(new BpmFormFieldStatusDefine[willUpdateBpmFormFieldStatusDefines.size()]);
        BpmFormFieldStatusDefine[] willAddBpmFormFieldStatusDefineArray = (BpmFormFieldStatusDefine[]) willAddBpmFormFieldStatusDefines.toArray(new BpmFormFieldStatusDefine[willAddBpmFormFieldStatusDefines.size()]);
        BpmFormFieldStatusDefine[] willDeleteBpmFormFieldStatusDefineArray = (BpmFormFieldStatusDefine[]) willDeleteBpmFormFieldStatusDefines.toArray(new BpmFormFieldStatusDefine[willDeleteBpmFormFieldStatusDefines.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddBpmFormFieldStatusDefineArray,
                willUpdateBpmFormFieldStatusDefineArray,
                willDeleteBpmFormFieldStatusDefineArray);
        } // end if

        if (willUpdateBpmFormFieldStatusDefines.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateBpmFormFieldStatusDefineArray);
            } // end if

            this.batchUpdateBpmFormFieldStatusDefine(willUpdateBpmFormFieldStatusDefineArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateBpmFormFieldStatusDefineArray);
            } // end if
        } // end if

        if (willAddBpmFormFieldStatusDefines.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddBpmFormFieldStatusDefineArray);
            } // end if

            this.batchInsertBpmFormFieldStatusDefine(willAddBpmFormFieldStatusDefineArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddBpmFormFieldStatusDefineArray);
            } // end if
        } // end if

        if (willDeleteBpmFormFieldStatusDefines.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteBpmFormFieldStatusDefineArray);
            } // end if

            for (int i = 0; i < willDeleteBpmFormFieldStatusDefineArray.length;
                    i++) {
                BpmFormFieldStatusDefine object = willDeleteBpmFormFieldStatusDefineArray[i];
                this.deleteBpmFormFieldStatusDefine(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteBpmFormFieldStatusDefineArray);
            } // end if
        } // end if
    } // end synchronizeBpmFormFieldStatusDefine()

    /**
     * Query IBpmFormFieldStatusDefine
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public BpmFormFieldStatusDefine findBpmFormFieldStatusDefineById(
        final long aId) throws Exception {
        BpmFormFieldStatusDefineDAOQueryBean queryBean = new BpmFormFieldStatusDefineDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        BpmFormFieldStatusDefine[] BpmFormFieldStatusDefines = queryBpmFormFieldStatusDefine(queryBean);

        if (BpmFormFieldStatusDefines.length == 0) {
            return null;
        } // end if
        else {
            return BpmFormFieldStatusDefines[0];
        } // end else
    } // end findBpmFormFieldStatusDefineById()

    /**
     * Query IBpmFormFieldStatusDefine
     *
     * @param queryBean
     *
     * @return IBpmFormFieldStatusDefine[]
     *
     * @throws Exception
     */
    public BpmFormFieldStatusDefine[] queryBpmFormFieldStatusDefine(
        BpmFormFieldStatusDefineDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean,
                new JdbcBpmFormFieldStatusDefineRowMapper());

        return (BpmFormFieldStatusDefine[]) result.toArray(new BpmFormFieldStatusDefine[result.size()]);
    } // end queryBpmFormFieldStatusDefine()

    /**
     * Query BpmFormFieldStatusDefine Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryBpmFormFieldStatusDefineSelective(
        BpmFormFieldStatusDefineDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryBpmFormFieldStatusDefineSelective()

    /**
     * Query IBpmFormFieldStatusDefine Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryBpmFormFieldStatusDefineCount(
        BpmFormFieldStatusDefineDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryBpmFormFieldStatusDefineCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcBpmFormFieldStatusDefineRowMapper
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
            BpmFormFieldStatusDefine object = new BpmFormFieldStatusDefine();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object BpmRoleId = resultSet.getObject(columnIndex++);

                object.setBpmRoleIdNull(resultSet.getBoolean(columnIndex++));

                if (BpmRoleId != null) {
                    BeanUtils.setProperty(object, DataProperty.BpmRoleId,
                        BpmRoleId);
                } // end if

                Object FieldDefineId = resultSet.getObject(columnIndex++);

                object.setFieldDefineIdNull(resultSet.getBoolean(columnIndex++));

                if (FieldDefineId != null) {
                    BeanUtils.setProperty(object, DataProperty.FieldDefineId,
                        FieldDefineId);
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

                Object StepDefineId = resultSet.getObject(columnIndex++);

                object.setStepDefineIdNull(resultSet.getBoolean(columnIndex++));

                if (StepDefineId != null) {
                    BeanUtils.setProperty(object, DataProperty.StepDefineId,
                        StepDefineId);
                } // end if

                Object FieldStatus = resultSet.getObject(columnIndex++);

                object.setFieldStatusNull(resultSet.getBoolean(columnIndex++));

                if (FieldStatus != null) {
                    BeanUtils.setProperty(object, DataProperty.FieldStatus,
                        FieldStatus);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcBpmFormFieldStatusDefineRowMapper
} // end BaseBpmFormFieldStatusDefineDAOJdbcImpl
