/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.dao.impl;

import com.ourteam.product.dao.IProductGlossaryChangLogDAO;
import com.ourteam.product.dao.ProductGlossaryChangLog;
import com.ourteam.product.dao.ProductGlossaryChangLogDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-10-12 13:50:22
 *
 * @author kylin
 */
abstract public class BaseProductGlossaryChangLogDAOJdbcImpl
    extends AbstractJdbcDAO implements IProductGlossaryChangLogDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, AfterChangeContent, ApproverId, BeforChangeContent, ChangeReason,
            EditorId, EditDate, ProductGlossaryId, Remarks, Status
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.AfterChangeContent,
            DataProperty.ApproverId, DataProperty.BeforChangeContent,
            DataProperty.ChangeReason, DataProperty.EditorId,
            DataProperty.EditDate, DataProperty.ProductGlossaryId,
            DataProperty.Remarks, DataProperty.Status
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
     * Creates a new BaseProductGlossaryChangLogDAOJdbcImpl object.
     */
    public BaseProductGlossaryChangLogDAOJdbcImpl() {
        super();
    } // end BaseProductGlossaryChangLogDAOJdbcImpl()

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
     * Check Unique ProductGlossaryChangLog
     *
     * @param aProductGlossaryChangLog
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(
        ProductGlossaryChangLog aProductGlossaryChangLog)
        throws Exception {
        if (aProductGlossaryChangLog == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aProductGlossaryChangLog,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IProductGlossaryChangLog
     *
     * @param aProductGlossaryChangLog
     *
     * @throws Exception
     */
    public void insertProductGlossaryChangLog(
        ProductGlossaryChangLog aProductGlossaryChangLog)
        throws Exception {
        insert(aProductGlossaryChangLog);
    } // end insertProductGlossaryChangLog()

    /**
     * Batch Insert IProductGlossaryChangLog
     *
     * @param aProductGlossaryChangLog
     *
     * @throws Exception
     */
    public void batchInsertProductGlossaryChangLog(
        ProductGlossaryChangLog[] aProductGlossaryChangLog)
        throws Exception {
        batchInsert(aProductGlossaryChangLog);
    } // end batchInsertProductGlossaryChangLog()

    /**
     * Delete IProductGlossaryChangLog
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteProductGlossaryChangLog(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteProductGlossaryChangLog()

    /**
     * Delete IProductGlossaryChangLog
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteProductGlossaryChangLog(
        ProductGlossaryChangLogDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteProductGlossaryChangLog()

    /**
     * Update IProductGlossaryChangLog Selective
     *
     * @param aProductGlossaryChangLog
     *
     * @throws Exception
     */
    public void updateProductGlossaryChangLog(
        ProductGlossaryChangLog aProductGlossaryChangLog)
        throws Exception {
        if (aProductGlossaryChangLog.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aProductGlossaryChangLog);

        ProductGlossaryChangLog tempObj = findProductGlossaryChangLogById(aProductGlossaryChangLog.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aProductGlossaryChangLog, tempObj);
        } // end if
    } // end updateProductGlossaryChangLog()

    /**
     * Batch Update IProductGlossaryChangLog
     *
     * @param aProductGlossaryChangLog
     *
     * @throws Exception
     */
    public void batchUpdateProductGlossaryChangLog(
        ProductGlossaryChangLog[] aProductGlossaryChangLog)
        throws Exception {
        batchUpdate(aProductGlossaryChangLog);
    } // end batchUpdateProductGlossaryChangLog()

    /**
     * Update IProductGlossaryChangLog
     *
     * @param aProductGlossaryChangLog
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateProductGlossaryChangLog(
        ProductGlossaryChangLog aProductGlossaryChangLog,
        ProductGlossaryChangLogDAOQueryBean aQueryBean)
        throws Exception {
        updateByQuery(aProductGlossaryChangLog, aQueryBean);
    } // end updateProductGlossaryChangLog()

    /**
     * DOCUMENT ME!
     *
     * @param aProductGlossaryChangLog DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(
        ProductGlossaryChangLog aProductGlossaryChangLog)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aProductGlossaryChangLogs DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeProductGlossaryChangLog(
        ProductGlossaryChangLog[] aProductGlossaryChangLogs,
        ProductGlossaryChangLogDAOQueryBean aQueryBean)
        throws Exception {
        synchronizeProductGlossaryChangLog(aProductGlossaryChangLogs,
            aQueryBean, null);
    } // end synchronizeProductGlossaryChangLog()

    /**
     * DOCUMENT ME!
     *
     * @param aProductGlossaryChangLogs DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeProductGlossaryChangLog(
        ProductGlossaryChangLog[] aProductGlossaryChangLogs,
        ProductGlossaryChangLogDAOQueryBean aQueryBean,
        ProductGlossaryChangLogSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aProductGlossaryChangLogs) == false) {
            inputList.addAll(Arrays.asList(aProductGlossaryChangLogs));
        } // end if

        ProductGlossaryChangLog[] existentProductGlossaryChangLogs = this.queryProductGlossaryChangLog(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentProductGlossaryChangLogs) == false) {
            existentList.addAll(Arrays.asList(existentProductGlossaryChangLogs));
        } // end if

        List willAddProductGlossaryChangLogs = ListUtils.subtract(inputList,
                existentList);

        List willDeleteProductGlossaryChangLogs = ListUtils.subtract(existentList,
                inputList);

        List willUpdateProductGlossaryChangLogs = ListUtils.intersection(existentList,
                inputList);

        ProductGlossaryChangLog[] willUpdateProductGlossaryChangLogArray = (ProductGlossaryChangLog[]) willUpdateProductGlossaryChangLogs.toArray(new ProductGlossaryChangLog[willUpdateProductGlossaryChangLogs.size()]);
        ProductGlossaryChangLog[] willAddProductGlossaryChangLogArray = (ProductGlossaryChangLog[]) willAddProductGlossaryChangLogs.toArray(new ProductGlossaryChangLog[willAddProductGlossaryChangLogs.size()]);
        ProductGlossaryChangLog[] willDeleteProductGlossaryChangLogArray = (ProductGlossaryChangLog[]) willDeleteProductGlossaryChangLogs.toArray(new ProductGlossaryChangLog[willDeleteProductGlossaryChangLogs.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddProductGlossaryChangLogArray,
                willUpdateProductGlossaryChangLogArray,
                willDeleteProductGlossaryChangLogArray);
        } // end if

        if (willUpdateProductGlossaryChangLogs.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateProductGlossaryChangLogArray);
            } // end if

            this.batchUpdateProductGlossaryChangLog(willUpdateProductGlossaryChangLogArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateProductGlossaryChangLogArray);
            } // end if
        } // end if

        if (willAddProductGlossaryChangLogs.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddProductGlossaryChangLogArray);
            } // end if

            this.batchInsertProductGlossaryChangLog(willAddProductGlossaryChangLogArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddProductGlossaryChangLogArray);
            } // end if
        } // end if

        if (willDeleteProductGlossaryChangLogs.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteProductGlossaryChangLogArray);
            } // end if

            for (int i = 0; i < willDeleteProductGlossaryChangLogArray.length;
                    i++) {
                ProductGlossaryChangLog object = willDeleteProductGlossaryChangLogArray[i];
                this.deleteProductGlossaryChangLog(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteProductGlossaryChangLogArray);
            } // end if
        } // end if
    } // end synchronizeProductGlossaryChangLog()

    /**
     * Query IProductGlossaryChangLog
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public ProductGlossaryChangLog findProductGlossaryChangLogById(
        final long aId) throws Exception {
        ProductGlossaryChangLogDAOQueryBean queryBean = new ProductGlossaryChangLogDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        ProductGlossaryChangLog[] ProductGlossaryChangLogs = queryProductGlossaryChangLog(queryBean);

        if (ProductGlossaryChangLogs.length == 0) {
            return null;
        } // end if
        else {
            return ProductGlossaryChangLogs[0];
        } // end else
    } // end findProductGlossaryChangLogById()

    /**
     * Query IProductGlossaryChangLog
     *
     * @param queryBean
     *
     * @return IProductGlossaryChangLog[]
     *
     * @throws Exception
     */
    public ProductGlossaryChangLog[] queryProductGlossaryChangLog(
        ProductGlossaryChangLogDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean,
                new JdbcProductGlossaryChangLogRowMapper());

        return (ProductGlossaryChangLog[]) result.toArray(new ProductGlossaryChangLog[result.size()]);
    } // end queryProductGlossaryChangLog()

    /**
     * Query ProductGlossaryChangLog Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryProductGlossaryChangLogSelective(
        ProductGlossaryChangLogDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryProductGlossaryChangLogSelective()

    /**
     * Query IProductGlossaryChangLog Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryProductGlossaryChangLogCount(
        ProductGlossaryChangLogDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryProductGlossaryChangLogCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcProductGlossaryChangLogRowMapper
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
            ProductGlossaryChangLog object = new ProductGlossaryChangLog();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object AfterChangeContent = resultSet.getObject(columnIndex++);

                object.setAfterChangeContentNull(resultSet.getBoolean(
                        columnIndex++));

                if (AfterChangeContent != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.AfterChangeContent, AfterChangeContent);
                } // end if

                Object ApproverId = resultSet.getObject(columnIndex++);

                object.setApproverIdNull(resultSet.getBoolean(columnIndex++));

                if (ApproverId != null) {
                    BeanUtils.setProperty(object, DataProperty.ApproverId,
                        ApproverId);
                } // end if

                Object BeforChangeContent = resultSet.getObject(columnIndex++);

                object.setBeforChangeContentNull(resultSet.getBoolean(
                        columnIndex++));

                if (BeforChangeContent != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.BeforChangeContent, BeforChangeContent);
                } // end if

                Object ChangeReason = resultSet.getObject(columnIndex++);

                object.setChangeReasonNull(resultSet.getBoolean(columnIndex++));

                if (ChangeReason != null) {
                    BeanUtils.setProperty(object, DataProperty.ChangeReason,
                        ChangeReason);
                } // end if

                Object EditorId = resultSet.getObject(columnIndex++);

                object.setEditorIdNull(resultSet.getBoolean(columnIndex++));

                if (EditorId != null) {
                    BeanUtils.setProperty(object, DataProperty.EditorId,
                        EditorId);
                } // end if

                Object EditDate = resultSet.getObject(columnIndex++);

                object.setEditDateNull(resultSet.getBoolean(columnIndex++));

                if (EditDate != null) {
                    BeanUtils.setProperty(object, DataProperty.EditDate,
                        EditDate);
                } // end if

                Object ProductGlossaryId = resultSet.getObject(columnIndex++);

                object.setProductGlossaryIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (ProductGlossaryId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ProductGlossaryId, ProductGlossaryId);
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

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcProductGlossaryChangLogRowMapper
} // end BaseProductGlossaryChangLogDAOJdbcImpl
