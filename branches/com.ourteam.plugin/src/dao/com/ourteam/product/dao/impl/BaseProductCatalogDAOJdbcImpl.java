/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.dao.impl;

import com.ourteam.product.dao.IProductCatalogDAO;
import com.ourteam.product.dao.ProductCatalog;
import com.ourteam.product.dao.ProductCatalogDAOQueryBean;

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
 * ²úÆ·Ä¿Â¼ DAO JDBC Impl Generate Date : 2011-10-10 16:08:01
 *
 * @author kylin
 */
abstract public class BaseProductCatalogDAOJdbcImpl extends AbstractJdbcDAO
    implements IProductCatalogDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            CatalogName, Id, ParentId, Remarks, Status, SortIndex
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.CatalogName, DataProperty.Id, DataProperty.ParentId,
            DataProperty.Remarks, DataProperty.Status, DataProperty.SortIndex
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
    public static final String[] ENTITY_UNIQUE_FIELDS = new String[] {
            CatalogName, ParentId
        };

    /**
     * DOCUMENT ME!
     */
    private static String relatedJoinSQL = null;

    /**
     * DOCUMENT ME!
     */
    private static String basicFilterSQL = null;

    /**
     * Creates a new BaseProductCatalogDAOJdbcImpl object.
     */
    public BaseProductCatalogDAOJdbcImpl() {
        super();
    } // end BaseProductCatalogDAOJdbcImpl()

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
     * Check Unique ProductCatalog
     *
     * @param aProductCatalog
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(ProductCatalog aProductCatalog)
        throws Exception {
        if (aProductCatalog == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        valueList.add(PropertyUtils.getProperty(aProductCatalog,
                DataProperty.CatalogName));

        pkValueList.add(PropertyUtils.getProperty(aProductCatalog,
                DataProperty.Id));

        valueList.add(PropertyUtils.getProperty(aProductCatalog,
                DataProperty.ParentId));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IProductCatalog
     *
     * @param aProductCatalog
     *
     * @throws Exception
     */
    public void insertProductCatalog(ProductCatalog aProductCatalog)
        throws Exception {
        insert(aProductCatalog);
    } // end insertProductCatalog()

    /**
     * Batch Insert IProductCatalog
     *
     * @param aProductCatalog
     *
     * @throws Exception
     */
    public void batchInsertProductCatalog(ProductCatalog[] aProductCatalog)
        throws Exception {
        batchInsert(aProductCatalog);
    } // end batchInsertProductCatalog()

    /**
     * Delete IProductCatalog
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteProductCatalog(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteProductCatalog()

    /**
     * Delete IProductCatalog
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteProductCatalog(ProductCatalogDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteProductCatalog()

    /**
     * Update IProductCatalog Selective
     *
     * @param aProductCatalog
     *
     * @throws Exception
     */
    public void updateProductCatalog(ProductCatalog aProductCatalog)
        throws Exception {
        if (aProductCatalog.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aProductCatalog);

        ProductCatalog tempObj = findProductCatalogById(aProductCatalog.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aProductCatalog, tempObj);
        } // end if
    } // end updateProductCatalog()

    /**
     * Batch Update IProductCatalog
     *
     * @param aProductCatalog
     *
     * @throws Exception
     */
    public void batchUpdateProductCatalog(ProductCatalog[] aProductCatalog)
        throws Exception {
        batchUpdate(aProductCatalog);
    } // end batchUpdateProductCatalog()

    /**
     * Update IProductCatalog
     *
     * @param aProductCatalog
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateProductCatalog(ProductCatalog aProductCatalog,
        ProductCatalogDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aProductCatalog, aQueryBean);
    } // end updateProductCatalog()

    /**
     * DOCUMENT ME!
     *
     * @param aProductCatalog DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(ProductCatalog aProductCatalog)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aProductCatalogs DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeProductCatalog(ProductCatalog[] aProductCatalogs,
        ProductCatalogDAOQueryBean aQueryBean) throws Exception {
        synchronizeProductCatalog(aProductCatalogs, aQueryBean, null);
    } // end synchronizeProductCatalog()

    /**
     * DOCUMENT ME!
     *
     * @param aProductCatalogs DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeProductCatalog(ProductCatalog[] aProductCatalogs,
        ProductCatalogDAOQueryBean aQueryBean,
        ProductCatalogSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aProductCatalogs) == false) {
            inputList.addAll(Arrays.asList(aProductCatalogs));
        } // end if

        ProductCatalog[] existentProductCatalogs = this.queryProductCatalog(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentProductCatalogs) == false) {
            existentList.addAll(Arrays.asList(existentProductCatalogs));
        } // end if

        List willAddProductCatalogs = ListUtils.subtract(inputList, existentList);

        List willDeleteProductCatalogs = ListUtils.subtract(existentList,
                inputList);

        List willUpdateProductCatalogs = ListUtils.intersection(existentList,
                inputList);

        ProductCatalog[] willUpdateProductCatalogArray = (ProductCatalog[]) willUpdateProductCatalogs.toArray(new ProductCatalog[willUpdateProductCatalogs.size()]);
        ProductCatalog[] willAddProductCatalogArray = (ProductCatalog[]) willAddProductCatalogs.toArray(new ProductCatalog[willAddProductCatalogs.size()]);
        ProductCatalog[] willDeleteProductCatalogArray = (ProductCatalog[]) willDeleteProductCatalogs.toArray(new ProductCatalog[willDeleteProductCatalogs.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddProductCatalogArray,
                willUpdateProductCatalogArray, willDeleteProductCatalogArray);
        } // end if

        if (willUpdateProductCatalogs.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateProductCatalogArray);
            } // end if

            this.batchUpdateProductCatalog(willUpdateProductCatalogArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateProductCatalogArray);
            } // end if
        } // end if

        if (willAddProductCatalogs.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddProductCatalogArray);
            } // end if

            this.batchInsertProductCatalog(willAddProductCatalogArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddProductCatalogArray);
            } // end if
        } // end if

        if (willDeleteProductCatalogs.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteProductCatalogArray);
            } // end if

            for (int i = 0; i < willDeleteProductCatalogArray.length; i++) {
                ProductCatalog object = willDeleteProductCatalogArray[i];
                this.deleteProductCatalog(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteProductCatalogArray);
            } // end if
        } // end if
    } // end synchronizeProductCatalog()

    /**
     * Query IProductCatalog
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public ProductCatalog findProductCatalogById(final long aId)
        throws Exception {
        ProductCatalogDAOQueryBean queryBean = new ProductCatalogDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        ProductCatalog[] ProductCatalogs = queryProductCatalog(queryBean);

        if (ProductCatalogs.length == 0) {
            return null;
        } // end if
        else {
            return ProductCatalogs[0];
        } // end else
    } // end findProductCatalogById()

    /**
     * Query IProductCatalog
     *
     * @param queryBean
     *
     * @return IProductCatalog[]
     *
     * @throws Exception
     */
    public ProductCatalog[] queryProductCatalog(
        ProductCatalogDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcProductCatalogRowMapper());

        return (ProductCatalog[]) result.toArray(new ProductCatalog[result.size()]);
    } // end queryProductCatalog()

    /**
     * Query ProductCatalog Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryProductCatalogSelective(
        ProductCatalogDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryProductCatalogSelective()

    /**
     * Query IProductCatalog Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryProductCatalogCount(ProductCatalogDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryProductCatalogCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcProductCatalogRowMapper
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
            ProductCatalog object = new ProductCatalog();

            int columnIndex = 1;

            try {
                Object CatalogName = resultSet.getObject(columnIndex++);

                object.setCatalogNameNull(resultSet.getBoolean(columnIndex++));

                if (CatalogName != null) {
                    BeanUtils.setProperty(object, DataProperty.CatalogName,
                        CatalogName);
                } // end if

                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
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

                Object SortIndex = resultSet.getObject(columnIndex++);

                object.setSortIndexNull(resultSet.getBoolean(columnIndex++));

                if (SortIndex != null) {
                    BeanUtils.setProperty(object, DataProperty.SortIndex,
                        SortIndex);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcProductCatalogRowMapper
} // end BaseProductCatalogDAOJdbcImpl
