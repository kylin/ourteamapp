/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.dao.impl;

import com.ourteam.product.dao.IProductVersionDAO;
import com.ourteam.product.dao.ProductVersion;
import com.ourteam.product.dao.ProductVersionDAOQueryBean;

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
 * ²úÆ·°æ±¾ DAO JDBC Impl Generate Date : 2011-10-12 15:02:19
 *
 * @author kylin
 */
abstract public class BaseProductVersionDAOJdbcImpl extends AbstractJdbcDAO
    implements IProductVersionDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, ProductDefineId, ProductVersion, Remarks, Status,
            ProductVersionType, ParentVersionId
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.ProductDefineId,
            DataProperty.ProductVersion, DataProperty.Remarks,
            DataProperty.Status, DataProperty.ProductVersionType,
            DataProperty.ParentVersionId
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
            ProductDefineId, ProductVersion
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
     * Creates a new BaseProductVersionDAOJdbcImpl object.
     */
    public BaseProductVersionDAOJdbcImpl() {
        super();
    } // end BaseProductVersionDAOJdbcImpl()

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
     * Check Unique ProductVersion
     *
     * @param aProductVersion
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(ProductVersion aProductVersion)
        throws Exception {
        if (aProductVersion == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aProductVersion,
                DataProperty.Id));

        valueList.add(PropertyUtils.getProperty(aProductVersion,
                DataProperty.ProductDefineId));

        valueList.add(PropertyUtils.getProperty(aProductVersion,
                DataProperty.ProductVersion));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IProductVersion
     *
     * @param aProductVersion
     *
     * @throws Exception
     */
    public void insertProductVersion(ProductVersion aProductVersion)
        throws Exception {
        insert(aProductVersion);
    } // end insertProductVersion()

    /**
     * Batch Insert IProductVersion
     *
     * @param aProductVersion
     *
     * @throws Exception
     */
    public void batchInsertProductVersion(ProductVersion[] aProductVersion)
        throws Exception {
        batchInsert(aProductVersion);
    } // end batchInsertProductVersion()

    /**
     * Delete IProductVersion
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteProductVersion(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteProductVersion()

    /**
     * Delete IProductVersion
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteProductVersion(ProductVersionDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteProductVersion()

    /**
     * Update IProductVersion Selective
     *
     * @param aProductVersion
     *
     * @throws Exception
     */
    public void updateProductVersion(ProductVersion aProductVersion)
        throws Exception {
        if (aProductVersion.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aProductVersion);

        ProductVersion tempObj = findProductVersionById(aProductVersion.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aProductVersion, tempObj);
        } // end if
    } // end updateProductVersion()

    /**
     * Batch Update IProductVersion
     *
     * @param aProductVersion
     *
     * @throws Exception
     */
    public void batchUpdateProductVersion(ProductVersion[] aProductVersion)
        throws Exception {
        batchUpdate(aProductVersion);
    } // end batchUpdateProductVersion()

    /**
     * Update IProductVersion
     *
     * @param aProductVersion
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateProductVersion(ProductVersion aProductVersion,
        ProductVersionDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aProductVersion, aQueryBean);
    } // end updateProductVersion()

    /**
     * DOCUMENT ME!
     *
     * @param aProductVersion DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(ProductVersion aProductVersion)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aProductVersions DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeProductVersion(ProductVersion[] aProductVersions,
        ProductVersionDAOQueryBean aQueryBean) throws Exception {
        synchronizeProductVersion(aProductVersions, aQueryBean, null);
    } // end synchronizeProductVersion()

    /**
     * DOCUMENT ME!
     *
     * @param aProductVersions DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeProductVersion(ProductVersion[] aProductVersions,
        ProductVersionDAOQueryBean aQueryBean,
        ProductVersionSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aProductVersions) == false) {
            inputList.addAll(Arrays.asList(aProductVersions));
        } // end if

        ProductVersion[] existentProductVersions = this.queryProductVersion(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentProductVersions) == false) {
            existentList.addAll(Arrays.asList(existentProductVersions));
        } // end if

        List willAddProductVersions = ListUtils.subtract(inputList, existentList);

        List willDeleteProductVersions = ListUtils.subtract(existentList,
                inputList);

        List willUpdateProductVersions = ListUtils.intersection(existentList,
                inputList);

        ProductVersion[] willUpdateProductVersionArray = (ProductVersion[]) willUpdateProductVersions.toArray(new ProductVersion[willUpdateProductVersions.size()]);
        ProductVersion[] willAddProductVersionArray = (ProductVersion[]) willAddProductVersions.toArray(new ProductVersion[willAddProductVersions.size()]);
        ProductVersion[] willDeleteProductVersionArray = (ProductVersion[]) willDeleteProductVersions.toArray(new ProductVersion[willDeleteProductVersions.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddProductVersionArray,
                willUpdateProductVersionArray, willDeleteProductVersionArray);
        } // end if

        if (willUpdateProductVersions.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateProductVersionArray);
            } // end if

            this.batchUpdateProductVersion(willUpdateProductVersionArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateProductVersionArray);
            } // end if
        } // end if

        if (willAddProductVersions.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddProductVersionArray);
            } // end if

            this.batchInsertProductVersion(willAddProductVersionArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddProductVersionArray);
            } // end if
        } // end if

        if (willDeleteProductVersions.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteProductVersionArray);
            } // end if

            for (int i = 0; i < willDeleteProductVersionArray.length; i++) {
                ProductVersion object = willDeleteProductVersionArray[i];
                this.deleteProductVersion(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteProductVersionArray);
            } // end if
        } // end if
    } // end synchronizeProductVersion()

    /**
     * Query IProductVersion
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public ProductVersion findProductVersionById(final long aId)
        throws Exception {
        ProductVersionDAOQueryBean queryBean = new ProductVersionDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        ProductVersion[] ProductVersions = queryProductVersion(queryBean);

        if (ProductVersions.length == 0) {
            return null;
        } // end if
        else {
            return ProductVersions[0];
        } // end else
    } // end findProductVersionById()

    /**
     * Query IProductVersion
     *
     * @param queryBean
     *
     * @return IProductVersion[]
     *
     * @throws Exception
     */
    public ProductVersion[] queryProductVersion(
        ProductVersionDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcProductVersionRowMapper());

        return (ProductVersion[]) result.toArray(new ProductVersion[result.size()]);
    } // end queryProductVersion()

    /**
     * Query ProductVersion Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryProductVersionSelective(
        ProductVersionDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryProductVersionSelective()

    /**
     * Query IProductVersion Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryProductVersionCount(ProductVersionDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryProductVersionCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcProductVersionRowMapper
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
            ProductVersion object = new ProductVersion();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object ProductDefineId = resultSet.getObject(columnIndex++);

                object.setProductDefineIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (ProductDefineId != null) {
                    BeanUtils.setProperty(object, DataProperty.ProductDefineId,
                        ProductDefineId);
                } // end if

                Object ProductVersion = resultSet.getObject(columnIndex++);

                object.setProductVersionNull(resultSet.getBoolean(columnIndex++));

                if (ProductVersion != null) {
                    BeanUtils.setProperty(object, DataProperty.ProductVersion,
                        ProductVersion);
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

                Object ProductVersionType = resultSet.getObject(columnIndex++);

                object.setProductVersionTypeNull(resultSet.getBoolean(
                        columnIndex++));

                if (ProductVersionType != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ProductVersionType, ProductVersionType);
                } // end if

                Object ParentVersionId = resultSet.getObject(columnIndex++);

                object.setParentVersionIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (ParentVersionId != null) {
                    BeanUtils.setProperty(object, DataProperty.ParentVersionId,
                        ParentVersionId);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcProductVersionRowMapper
} // end BaseProductVersionDAOJdbcImpl
