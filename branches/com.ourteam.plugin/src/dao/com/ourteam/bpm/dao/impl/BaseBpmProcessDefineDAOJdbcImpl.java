/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao.impl;

import com.ourteam.bpm.dao.BpmProcessDefine;
import com.ourteam.bpm.dao.BpmProcessDefineDAOQueryBean;
import com.ourteam.bpm.dao.IBpmProcessDefineDAO;

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
 * DAO JDBC Impl Generate Date : 2011-11-23 16:27:38
 *
 * @author kylin
 */
abstract public class BaseBpmProcessDefineDAOJdbcImpl extends AbstractJdbcDAO
    implements IBpmProcessDefineDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, LastEditorId, LastEditDate, ProcessKey, ProcessName, Remarks,
            Status, CatalogId, ProcessVersion, LastEditorName, StartFormKey
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.LastEditorId,
            DataProperty.LastEditDate, DataProperty.ProcessKey,
            DataProperty.ProcessName, DataProperty.Remarks, DataProperty.Status,
            DataProperty.CatalogId, DataProperty.ProcessVersion,
            DataProperty.LastEditorName, DataProperty.StartFormKey
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
     * Creates a new BaseBpmProcessDefineDAOJdbcImpl object.
     */
    public BaseBpmProcessDefineDAOJdbcImpl() {
        super();
    } // end BaseBpmProcessDefineDAOJdbcImpl()

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

            relatedJoinSQLBuffer.append(" LEFT JOIN SYS_USER sysUserA ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " sysUserA.ID = BPM_PROCESS_DEFINE.LAST_EDITOR_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique BpmProcessDefine
     *
     * @param aBpmProcessDefine
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(BpmProcessDefine aBpmProcessDefine)
        throws Exception {
        if (aBpmProcessDefine == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aBpmProcessDefine,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IBpmProcessDefine
     *
     * @param aBpmProcessDefine
     *
     * @throws Exception
     */
    public void insertBpmProcessDefine(BpmProcessDefine aBpmProcessDefine)
        throws Exception {
        org.apache.commons.beanutils.PropertyUtils.setProperty(aBpmProcessDefine,
            "lastEditDate", new java.sql.Timestamp(System.currentTimeMillis()));

        insert(aBpmProcessDefine);
    } // end insertBpmProcessDefine()

    /**
     * Batch Insert IBpmProcessDefine
     *
     * @param aBpmProcessDefine
     *
     * @throws Exception
     */
    public void batchInsertBpmProcessDefine(
        BpmProcessDefine[] aBpmProcessDefine) throws Exception {
        batchInsert(aBpmProcessDefine);
    } // end batchInsertBpmProcessDefine()

    /**
     * Delete IBpmProcessDefine
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteBpmProcessDefine(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteBpmProcessDefine()

    /**
     * Delete IBpmProcessDefine
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteBpmProcessDefine(BpmProcessDefineDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteBpmProcessDefine()

    /**
     * Update IBpmProcessDefine Selective
     *
     * @param aBpmProcessDefine
     *
     * @throws Exception
     */
    public void updateBpmProcessDefine(BpmProcessDefine aBpmProcessDefine)
        throws Exception {
        org.apache.commons.beanutils.PropertyUtils.setProperty(aBpmProcessDefine,
            "lastEditDate", new java.sql.Timestamp(System.currentTimeMillis()));

        if (aBpmProcessDefine.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aBpmProcessDefine);

        BpmProcessDefine tempObj = findBpmProcessDefineById(aBpmProcessDefine.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aBpmProcessDefine, tempObj);
        } // end if
    } // end updateBpmProcessDefine()

    /**
     * Batch Update IBpmProcessDefine
     *
     * @param aBpmProcessDefine
     *
     * @throws Exception
     */
    public void batchUpdateBpmProcessDefine(
        BpmProcessDefine[] aBpmProcessDefine) throws Exception {
        batchUpdate(aBpmProcessDefine);
    } // end batchUpdateBpmProcessDefine()

    /**
     * Update IBpmProcessDefine
     *
     * @param aBpmProcessDefine
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateBpmProcessDefine(BpmProcessDefine aBpmProcessDefine,
        BpmProcessDefineDAOQueryBean aQueryBean) throws Exception {
        org.apache.commons.beanutils.PropertyUtils.setProperty(aBpmProcessDefine,
            "lastEditDate", new java.sql.Timestamp(System.currentTimeMillis()));

        updateByQuery(aBpmProcessDefine, aQueryBean);
    } // end updateBpmProcessDefine()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmProcessDefine DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(BpmProcessDefine aBpmProcessDefine)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmProcessDefines DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmProcessDefine(
        BpmProcessDefine[] aBpmProcessDefines,
        BpmProcessDefineDAOQueryBean aQueryBean) throws Exception {
        synchronizeBpmProcessDefine(aBpmProcessDefines, aQueryBean, null);
    } // end synchronizeBpmProcessDefine()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmProcessDefines DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmProcessDefine(
        BpmProcessDefine[] aBpmProcessDefines,
        BpmProcessDefineDAOQueryBean aQueryBean,
        BpmProcessDefineSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aBpmProcessDefines) == false) {
            inputList.addAll(Arrays.asList(aBpmProcessDefines));
        } // end if

        BpmProcessDefine[] existentBpmProcessDefines = this.queryBpmProcessDefine(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentBpmProcessDefines) == false) {
            existentList.addAll(Arrays.asList(existentBpmProcessDefines));
        } // end if

        List willAddBpmProcessDefines = ListUtils.subtract(inputList,
                existentList);

        List willDeleteBpmProcessDefines = ListUtils.subtract(existentList,
                inputList);

        List willUpdateBpmProcessDefines = ListUtils.intersection(existentList,
                inputList);

        BpmProcessDefine[] willUpdateBpmProcessDefineArray = (BpmProcessDefine[]) willUpdateBpmProcessDefines.toArray(new BpmProcessDefine[willUpdateBpmProcessDefines.size()]);
        BpmProcessDefine[] willAddBpmProcessDefineArray = (BpmProcessDefine[]) willAddBpmProcessDefines.toArray(new BpmProcessDefine[willAddBpmProcessDefines.size()]);
        BpmProcessDefine[] willDeleteBpmProcessDefineArray = (BpmProcessDefine[]) willDeleteBpmProcessDefines.toArray(new BpmProcessDefine[willDeleteBpmProcessDefines.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddBpmProcessDefineArray,
                willUpdateBpmProcessDefineArray, willDeleteBpmProcessDefineArray);
        } // end if

        if (willUpdateBpmProcessDefines.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateBpmProcessDefineArray);
            } // end if

            this.batchUpdateBpmProcessDefine(willUpdateBpmProcessDefineArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateBpmProcessDefineArray);
            } // end if
        } // end if

        if (willAddBpmProcessDefines.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddBpmProcessDefineArray);
            } // end if

            this.batchInsertBpmProcessDefine(willAddBpmProcessDefineArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddBpmProcessDefineArray);
            } // end if
        } // end if

        if (willDeleteBpmProcessDefines.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteBpmProcessDefineArray);
            } // end if

            for (int i = 0; i < willDeleteBpmProcessDefineArray.length; i++) {
                BpmProcessDefine object = willDeleteBpmProcessDefineArray[i];
                this.deleteBpmProcessDefine(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteBpmProcessDefineArray);
            } // end if
        } // end if
    } // end synchronizeBpmProcessDefine()

    /**
     * Query IBpmProcessDefine
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public BpmProcessDefine findBpmProcessDefineById(final long aId)
        throws Exception {
        BpmProcessDefineDAOQueryBean queryBean = new BpmProcessDefineDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        BpmProcessDefine[] BpmProcessDefines = queryBpmProcessDefine(queryBean);

        if (BpmProcessDefines.length == 0) {
            return null;
        } // end if
        else {
            return BpmProcessDefines[0];
        } // end else
    } // end findBpmProcessDefineById()

    /**
     * Query IBpmProcessDefine
     *
     * @param queryBean
     *
     * @return IBpmProcessDefine[]
     *
     * @throws Exception
     */
    public BpmProcessDefine[] queryBpmProcessDefine(
        BpmProcessDefineDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcBpmProcessDefineRowMapper());

        return (BpmProcessDefine[]) result.toArray(new BpmProcessDefine[result.size()]);
    } // end queryBpmProcessDefine()

    /**
     * Query BpmProcessDefine Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryBpmProcessDefineSelective(
        BpmProcessDefineDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryBpmProcessDefineSelective()

    /**
     * Query IBpmProcessDefine Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryBpmProcessDefineCount(
        BpmProcessDefineDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end queryBpmProcessDefineCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcBpmProcessDefineRowMapper
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
            BpmProcessDefine object = new BpmProcessDefine();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object LastEditorId = resultSet.getObject(columnIndex++);

                object.setLastEditorIdNull(resultSet.getBoolean(columnIndex++));

                if (LastEditorId != null) {
                    BeanUtils.setProperty(object, DataProperty.LastEditorId,
                        LastEditorId);
                } // end if

                Object LastEditDate = resultSet.getObject(columnIndex++);

                object.setLastEditDateNull(resultSet.getBoolean(columnIndex++));

                if (LastEditDate != null) {
                    BeanUtils.setProperty(object, DataProperty.LastEditDate,
                        LastEditDate);
                } // end if

                Object ProcessKey = resultSet.getObject(columnIndex++);

                object.setProcessKeyNull(resultSet.getBoolean(columnIndex++));

                if (ProcessKey != null) {
                    BeanUtils.setProperty(object, DataProperty.ProcessKey,
                        ProcessKey);
                } // end if

                Object ProcessName = resultSet.getObject(columnIndex++);

                object.setProcessNameNull(resultSet.getBoolean(columnIndex++));

                if (ProcessName != null) {
                    BeanUtils.setProperty(object, DataProperty.ProcessName,
                        ProcessName);
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

                Object CatalogId = resultSet.getObject(columnIndex++);

                object.setCatalogIdNull(resultSet.getBoolean(columnIndex++));

                if (CatalogId != null) {
                    BeanUtils.setProperty(object, DataProperty.CatalogId,
                        CatalogId);
                } // end if

                Object ProcessVersion = resultSet.getObject(columnIndex++);

                object.setProcessVersionNull(resultSet.getBoolean(columnIndex++));

                if (ProcessVersion != null) {
                    BeanUtils.setProperty(object, DataProperty.ProcessVersion,
                        ProcessVersion);
                } // end if

                Object LastEditorName = resultSet.getObject(columnIndex++);

                object.setLastEditorNameNull(resultSet.getBoolean(columnIndex++));

                if (LastEditorName != null) {
                    BeanUtils.setProperty(object, DataProperty.LastEditorName,
                        LastEditorName);
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
    } // end JdbcBpmProcessDefineRowMapper
} // end BaseBpmProcessDefineDAOJdbcImpl
