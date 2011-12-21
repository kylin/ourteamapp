/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao.impl;

import com.ourteam.bpm.dao.BpmProcessCatalog;
import com.ourteam.bpm.dao.BpmProcessCatalogDAOQueryBean;
import com.ourteam.bpm.dao.IBpmProcessCatalogDAO;

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
 * DAO JDBC Impl Generate Date : 2011-11-03 11:41:34
 *
 * @author kylin
 */
abstract public class BaseBpmProcessCatalogDAOJdbcImpl extends AbstractJdbcDAO
    implements IBpmProcessCatalogDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, Name, ParentId, Remarks, Status, OrderIndex
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.Name, DataProperty.ParentId,
            DataProperty.Remarks, DataProperty.Status, DataProperty.OrderIndex
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
     * Creates a new BaseBpmProcessCatalogDAOJdbcImpl object.
     */
    public BaseBpmProcessCatalogDAOJdbcImpl() {
        super();
    } // end BaseBpmProcessCatalogDAOJdbcImpl()

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
     * Check Unique BpmProcessCatalog
     *
     * @param aBpmProcessCatalog
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(BpmProcessCatalog aBpmProcessCatalog)
        throws Exception {
        if (aBpmProcessCatalog == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aBpmProcessCatalog,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IBpmProcessCatalog
     *
     * @param aBpmProcessCatalog
     *
     * @throws Exception
     */
    public void insertBpmProcessCatalog(BpmProcessCatalog aBpmProcessCatalog)
        throws Exception {
        insert(aBpmProcessCatalog);
    } // end insertBpmProcessCatalog()

    /**
     * Batch Insert IBpmProcessCatalog
     *
     * @param aBpmProcessCatalog
     *
     * @throws Exception
     */
    public void batchInsertBpmProcessCatalog(
        BpmProcessCatalog[] aBpmProcessCatalog) throws Exception {
        batchInsert(aBpmProcessCatalog);
    } // end batchInsertBpmProcessCatalog()

    /**
     * Delete IBpmProcessCatalog
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteBpmProcessCatalog(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteBpmProcessCatalog()

    /**
     * Delete IBpmProcessCatalog
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteBpmProcessCatalog(BpmProcessCatalogDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteBpmProcessCatalog()

    /**
     * Update IBpmProcessCatalog Selective
     *
     * @param aBpmProcessCatalog
     *
     * @throws Exception
     */
    public void updateBpmProcessCatalog(BpmProcessCatalog aBpmProcessCatalog)
        throws Exception {
        if (aBpmProcessCatalog.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aBpmProcessCatalog);

        BpmProcessCatalog tempObj = findBpmProcessCatalogById(aBpmProcessCatalog.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aBpmProcessCatalog, tempObj);
        } // end if
    } // end updateBpmProcessCatalog()

    /**
     * Batch Update IBpmProcessCatalog
     *
     * @param aBpmProcessCatalog
     *
     * @throws Exception
     */
    public void batchUpdateBpmProcessCatalog(
        BpmProcessCatalog[] aBpmProcessCatalog) throws Exception {
        batchUpdate(aBpmProcessCatalog);
    } // end batchUpdateBpmProcessCatalog()

    /**
     * Update IBpmProcessCatalog
     *
     * @param aBpmProcessCatalog
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateBpmProcessCatalog(BpmProcessCatalog aBpmProcessCatalog,
        BpmProcessCatalogDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aBpmProcessCatalog, aQueryBean);
    } // end updateBpmProcessCatalog()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmProcessCatalog DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(BpmProcessCatalog aBpmProcessCatalog)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmProcessCatalogs DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmProcessCatalog(
        BpmProcessCatalog[] aBpmProcessCatalogs,
        BpmProcessCatalogDAOQueryBean aQueryBean) throws Exception {
        synchronizeBpmProcessCatalog(aBpmProcessCatalogs, aQueryBean, null);
    } // end synchronizeBpmProcessCatalog()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmProcessCatalogs DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmProcessCatalog(
        BpmProcessCatalog[] aBpmProcessCatalogs,
        BpmProcessCatalogDAOQueryBean aQueryBean,
        BpmProcessCatalogSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aBpmProcessCatalogs) == false) {
            inputList.addAll(Arrays.asList(aBpmProcessCatalogs));
        } // end if

        BpmProcessCatalog[] existentBpmProcessCatalogs = this.queryBpmProcessCatalog(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentBpmProcessCatalogs) == false) {
            existentList.addAll(Arrays.asList(existentBpmProcessCatalogs));
        } // end if

        List willAddBpmProcessCatalogs = ListUtils.subtract(inputList,
                existentList);

        List willDeleteBpmProcessCatalogs = ListUtils.subtract(existentList,
                inputList);

        List willUpdateBpmProcessCatalogs = ListUtils.intersection(existentList,
                inputList);

        BpmProcessCatalog[] willUpdateBpmProcessCatalogArray = (BpmProcessCatalog[]) willUpdateBpmProcessCatalogs.toArray(new BpmProcessCatalog[willUpdateBpmProcessCatalogs.size()]);
        BpmProcessCatalog[] willAddBpmProcessCatalogArray = (BpmProcessCatalog[]) willAddBpmProcessCatalogs.toArray(new BpmProcessCatalog[willAddBpmProcessCatalogs.size()]);
        BpmProcessCatalog[] willDeleteBpmProcessCatalogArray = (BpmProcessCatalog[]) willDeleteBpmProcessCatalogs.toArray(new BpmProcessCatalog[willDeleteBpmProcessCatalogs.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddBpmProcessCatalogArray,
                willUpdateBpmProcessCatalogArray,
                willDeleteBpmProcessCatalogArray);
        } // end if

        if (willUpdateBpmProcessCatalogs.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateBpmProcessCatalogArray);
            } // end if

            this.batchUpdateBpmProcessCatalog(willUpdateBpmProcessCatalogArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateBpmProcessCatalogArray);
            } // end if
        } // end if

        if (willAddBpmProcessCatalogs.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddBpmProcessCatalogArray);
            } // end if

            this.batchInsertBpmProcessCatalog(willAddBpmProcessCatalogArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddBpmProcessCatalogArray);
            } // end if
        } // end if

        if (willDeleteBpmProcessCatalogs.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteBpmProcessCatalogArray);
            } // end if

            for (int i = 0; i < willDeleteBpmProcessCatalogArray.length; i++) {
                BpmProcessCatalog object = willDeleteBpmProcessCatalogArray[i];
                this.deleteBpmProcessCatalog(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteBpmProcessCatalogArray);
            } // end if
        } // end if
    } // end synchronizeBpmProcessCatalog()

    /**
     * Query IBpmProcessCatalog
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public BpmProcessCatalog findBpmProcessCatalogById(final long aId)
        throws Exception {
        BpmProcessCatalogDAOQueryBean queryBean = new BpmProcessCatalogDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        BpmProcessCatalog[] BpmProcessCatalogs = queryBpmProcessCatalog(queryBean);

        if (BpmProcessCatalogs.length == 0) {
            return null;
        } // end if
        else {
            return BpmProcessCatalogs[0];
        } // end else
    } // end findBpmProcessCatalogById()

    /**
     * Query IBpmProcessCatalog
     *
     * @param queryBean
     *
     * @return IBpmProcessCatalog[]
     *
     * @throws Exception
     */
    public BpmProcessCatalog[] queryBpmProcessCatalog(
        BpmProcessCatalogDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcBpmProcessCatalogRowMapper());

        return (BpmProcessCatalog[]) result.toArray(new BpmProcessCatalog[result.size()]);
    } // end queryBpmProcessCatalog()

    /**
     * Query BpmProcessCatalog Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryBpmProcessCatalogSelective(
        BpmProcessCatalogDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryBpmProcessCatalogSelective()

    /**
     * Query IBpmProcessCatalog Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryBpmProcessCatalogCount(
        BpmProcessCatalogDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end queryBpmProcessCatalogCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcBpmProcessCatalogRowMapper
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
            BpmProcessCatalog object = new BpmProcessCatalog();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object Name = resultSet.getObject(columnIndex++);

                object.setNameNull(resultSet.getBoolean(columnIndex++));

                if (Name != null) {
                    BeanUtils.setProperty(object, DataProperty.Name, Name);
                } // end if

                Object ParentId = resultSet.getObject(columnIndex++);

                object.setParentIdNull(resultSet.getBoolean(columnIndex++));

                if (ParentId != null) {
                    BeanUtils.setProperty(object, DataProperty.ParentId,
                        ParentId);
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

                Object OrderIndex = resultSet.getObject(columnIndex++);

                object.setOrderIndexNull(resultSet.getBoolean(columnIndex++));

                if (OrderIndex != null) {
                    BeanUtils.setProperty(object, DataProperty.OrderIndex,
                        OrderIndex);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcBpmProcessCatalogRowMapper
} // end BaseBpmProcessCatalogDAOJdbcImpl
