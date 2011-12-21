/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao.impl;

import com.ourteam.bpm.dao.BpmFormDefine;
import com.ourteam.bpm.dao.BpmFormDefineDAOQueryBean;
import com.ourteam.bpm.dao.IBpmFormDefineDAO;

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
 * DAO JDBC Impl Generate Date : 2011-11-11 14:51:46
 *
 * @author kylin
 */
abstract public class BaseBpmFormDefineDAOJdbcImpl extends AbstractJdbcDAO
    implements IBpmFormDefineDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, FormKey, FormName, ProcessDefineId, Remarks, Status, FormXml
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.FormKey, DataProperty.FormName,
            DataProperty.ProcessDefineId, DataProperty.Remarks,
            DataProperty.Status, DataProperty.FormXml
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
     * Creates a new BaseBpmFormDefineDAOJdbcImpl object.
     */
    public BaseBpmFormDefineDAOJdbcImpl() {
        super();
    } // end BaseBpmFormDefineDAOJdbcImpl()

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
     * Check Unique BpmFormDefine
     *
     * @param aBpmFormDefine
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(BpmFormDefine aBpmFormDefine)
        throws Exception {
        if (aBpmFormDefine == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aBpmFormDefine,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IBpmFormDefine
     *
     * @param aBpmFormDefine
     *
     * @throws Exception
     */
    public void insertBpmFormDefine(BpmFormDefine aBpmFormDefine)
        throws Exception {
        insert(aBpmFormDefine);
    } // end insertBpmFormDefine()

    /**
     * Batch Insert IBpmFormDefine
     *
     * @param aBpmFormDefine
     *
     * @throws Exception
     */
    public void batchInsertBpmFormDefine(BpmFormDefine[] aBpmFormDefine)
        throws Exception {
        batchInsert(aBpmFormDefine);
    } // end batchInsertBpmFormDefine()

    /**
     * Delete IBpmFormDefine
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteBpmFormDefine(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteBpmFormDefine()

    /**
     * Delete IBpmFormDefine
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteBpmFormDefine(BpmFormDefineDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteBpmFormDefine()

    /**
     * Update IBpmFormDefine Selective
     *
     * @param aBpmFormDefine
     *
     * @throws Exception
     */
    public void updateBpmFormDefine(BpmFormDefine aBpmFormDefine)
        throws Exception {
        if (aBpmFormDefine.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aBpmFormDefine);

        BpmFormDefine tempObj = findBpmFormDefineById(aBpmFormDefine.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aBpmFormDefine, tempObj);
        } // end if
    } // end updateBpmFormDefine()

    /**
     * Batch Update IBpmFormDefine
     *
     * @param aBpmFormDefine
     *
     * @throws Exception
     */
    public void batchUpdateBpmFormDefine(BpmFormDefine[] aBpmFormDefine)
        throws Exception {
        batchUpdate(aBpmFormDefine);
    } // end batchUpdateBpmFormDefine()

    /**
     * Update IBpmFormDefine
     *
     * @param aBpmFormDefine
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateBpmFormDefine(BpmFormDefine aBpmFormDefine,
        BpmFormDefineDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aBpmFormDefine, aQueryBean);
    } // end updateBpmFormDefine()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmFormDefine DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(BpmFormDefine aBpmFormDefine)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmFormDefines DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmFormDefine(BpmFormDefine[] aBpmFormDefines,
        BpmFormDefineDAOQueryBean aQueryBean) throws Exception {
        synchronizeBpmFormDefine(aBpmFormDefines, aQueryBean, null);
    } // end synchronizeBpmFormDefine()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmFormDefines DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmFormDefine(BpmFormDefine[] aBpmFormDefines,
        BpmFormDefineDAOQueryBean aQueryBean,
        BpmFormDefineSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aBpmFormDefines) == false) {
            inputList.addAll(Arrays.asList(aBpmFormDefines));
        } // end if

        BpmFormDefine[] existentBpmFormDefines = this.queryBpmFormDefine(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentBpmFormDefines) == false) {
            existentList.addAll(Arrays.asList(existentBpmFormDefines));
        } // end if

        List willAddBpmFormDefines = ListUtils.subtract(inputList, existentList);

        List willDeleteBpmFormDefines = ListUtils.subtract(existentList,
                inputList);

        List willUpdateBpmFormDefines = ListUtils.intersection(existentList,
                inputList);

        BpmFormDefine[] willUpdateBpmFormDefineArray = (BpmFormDefine[]) willUpdateBpmFormDefines.toArray(new BpmFormDefine[willUpdateBpmFormDefines.size()]);
        BpmFormDefine[] willAddBpmFormDefineArray = (BpmFormDefine[]) willAddBpmFormDefines.toArray(new BpmFormDefine[willAddBpmFormDefines.size()]);
        BpmFormDefine[] willDeleteBpmFormDefineArray = (BpmFormDefine[]) willDeleteBpmFormDefines.toArray(new BpmFormDefine[willDeleteBpmFormDefines.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddBpmFormDefineArray,
                willUpdateBpmFormDefineArray, willDeleteBpmFormDefineArray);
        } // end if

        if (willUpdateBpmFormDefines.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateBpmFormDefineArray);
            } // end if

            this.batchUpdateBpmFormDefine(willUpdateBpmFormDefineArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateBpmFormDefineArray);
            } // end if
        } // end if

        if (willAddBpmFormDefines.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddBpmFormDefineArray);
            } // end if

            this.batchInsertBpmFormDefine(willAddBpmFormDefineArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddBpmFormDefineArray);
            } // end if
        } // end if

        if (willDeleteBpmFormDefines.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteBpmFormDefineArray);
            } // end if

            for (int i = 0; i < willDeleteBpmFormDefineArray.length; i++) {
                BpmFormDefine object = willDeleteBpmFormDefineArray[i];
                this.deleteBpmFormDefine(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteBpmFormDefineArray);
            } // end if
        } // end if
    } // end synchronizeBpmFormDefine()

    /**
     * Query IBpmFormDefine
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public BpmFormDefine findBpmFormDefineById(final long aId)
        throws Exception {
        BpmFormDefineDAOQueryBean queryBean = new BpmFormDefineDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        BpmFormDefine[] BpmFormDefines = queryBpmFormDefine(queryBean);

        if (BpmFormDefines.length == 0) {
            return null;
        } // end if
        else {
            return BpmFormDefines[0];
        } // end else
    } // end findBpmFormDefineById()

    /**
     * Query IBpmFormDefine
     *
     * @param queryBean
     *
     * @return IBpmFormDefine[]
     *
     * @throws Exception
     */
    public BpmFormDefine[] queryBpmFormDefine(
        BpmFormDefineDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcBpmFormDefineRowMapper());

        return (BpmFormDefine[]) result.toArray(new BpmFormDefine[result.size()]);
    } // end queryBpmFormDefine()

    /**
     * Query BpmFormDefine Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryBpmFormDefineSelective(
        BpmFormDefineDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryBpmFormDefineSelective()

    /**
     * Query IBpmFormDefine Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryBpmFormDefineCount(BpmFormDefineDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryBpmFormDefineCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcBpmFormDefineRowMapper
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
            BpmFormDefine object = new BpmFormDefine();

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

                Object FormName = resultSet.getObject(columnIndex++);

                object.setFormNameNull(resultSet.getBoolean(columnIndex++));

                if (FormName != null) {
                    BeanUtils.setProperty(object, DataProperty.FormName,
                        FormName);
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

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object FormXml = resultSet.getObject(columnIndex++);

                object.setFormXmlNull(resultSet.getBoolean(columnIndex++));

                if (FormXml != null) {
                    BeanUtils.setProperty(object, DataProperty.FormXml, FormXml);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcBpmFormDefineRowMapper
} // end BaseBpmFormDefineDAOJdbcImpl
