/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.dao.impl;

import com.ourteam.product.dao.IProductDefineDAO;
import com.ourteam.product.dao.ProductDefine;
import com.ourteam.product.dao.ProductDefineDAOQueryBean;

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
 * 产品定义 DAO JDBC Impl Generate Date : 2011-10-10 16:08:02
 *
 * @author kylin
 */
abstract public class BaseProductDefineDAOJdbcImpl extends AbstractJdbcDAO
    implements IProductDefineDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, CatalogId, ProductCode, ProductName, Remarks, Status
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.CatalogId, DataProperty.ProductCode,
            DataProperty.ProductName, DataProperty.Remarks, DataProperty.Status
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
     * Creates a new BaseProductDefineDAOJdbcImpl object.
     */
    public BaseProductDefineDAOJdbcImpl() {
        super();
    } // end BaseProductDefineDAOJdbcImpl()

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
     * Check Unique ProductDefine
     *
     * @param aProductDefine
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(ProductDefine aProductDefine)
        throws Exception {
        if (aProductDefine == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aProductDefine,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IProductDefine
     *
     * @param aProductDefine
     *
     * @throws Exception
     */
    public void insertProductDefine(ProductDefine aProductDefine)
        throws Exception {
        insert(aProductDefine);
    } // end insertProductDefine()

    /**
     * Batch Insert IProductDefine
     *
     * @param aProductDefine
     *
     * @throws Exception
     */
    public void batchInsertProductDefine(ProductDefine[] aProductDefine)
        throws Exception {
        batchInsert(aProductDefine);
    } // end batchInsertProductDefine()

    /**
     * Delete IProductDefine
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteProductDefine(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteProductDefine()

    /**
     * Delete IProductDefine
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteProductDefine(ProductDefineDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteProductDefine()

    /**
     * Update IProductDefine Selective
     *
     * @param aProductDefine
     *
     * @throws Exception
     */
    public void updateProductDefine(ProductDefine aProductDefine)
        throws Exception {
        if (aProductDefine.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aProductDefine);

        ProductDefine tempObj = findProductDefineById(aProductDefine.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aProductDefine, tempObj);
        } // end if
    } // end updateProductDefine()

    /**
     * Batch Update IProductDefine
     *
     * @param aProductDefine
     *
     * @throws Exception
     */
    public void batchUpdateProductDefine(ProductDefine[] aProductDefine)
        throws Exception {
        batchUpdate(aProductDefine);
    } // end batchUpdateProductDefine()

    /**
     * Update IProductDefine
     *
     * @param aProductDefine
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateProductDefine(ProductDefine aProductDefine,
        ProductDefineDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aProductDefine, aQueryBean);
    } // end updateProductDefine()

    /**
     * DOCUMENT ME!
     *
     * @param aProductDefine DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(ProductDefine aProductDefine)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aProductDefines DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeProductDefine(ProductDefine[] aProductDefines,
        ProductDefineDAOQueryBean aQueryBean) throws Exception {
        synchronizeProductDefine(aProductDefines, aQueryBean, null);
    } // end synchronizeProductDefine()

    /**
     * DOCUMENT ME!
     *
     * @param aProductDefines DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeProductDefine(ProductDefine[] aProductDefines,
        ProductDefineDAOQueryBean aQueryBean,
        ProductDefineSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aProductDefines) == false) {
            inputList.addAll(Arrays.asList(aProductDefines));
        } // end if

        ProductDefine[] existentProductDefines = this.queryProductDefine(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentProductDefines) == false) {
            existentList.addAll(Arrays.asList(existentProductDefines));
        } // end if

        List willAddProductDefines = ListUtils.subtract(inputList, existentList);

        List willDeleteProductDefines = ListUtils.subtract(existentList,
                inputList);

        List willUpdateProductDefines = ListUtils.intersection(existentList,
                inputList);

        ProductDefine[] willUpdateProductDefineArray = (ProductDefine[]) willUpdateProductDefines.toArray(new ProductDefine[willUpdateProductDefines.size()]);
        ProductDefine[] willAddProductDefineArray = (ProductDefine[]) willAddProductDefines.toArray(new ProductDefine[willAddProductDefines.size()]);
        ProductDefine[] willDeleteProductDefineArray = (ProductDefine[]) willDeleteProductDefines.toArray(new ProductDefine[willDeleteProductDefines.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddProductDefineArray,
                willUpdateProductDefineArray, willDeleteProductDefineArray);
        } // end if

        if (willUpdateProductDefines.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateProductDefineArray);
            } // end if

            this.batchUpdateProductDefine(willUpdateProductDefineArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateProductDefineArray);
            } // end if
        } // end if

        if (willAddProductDefines.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddProductDefineArray);
            } // end if

            this.batchInsertProductDefine(willAddProductDefineArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddProductDefineArray);
            } // end if
        } // end if

        if (willDeleteProductDefines.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteProductDefineArray);
            } // end if

            for (int i = 0; i < willDeleteProductDefineArray.length; i++) {
                ProductDefine object = willDeleteProductDefineArray[i];
                this.deleteProductDefine(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteProductDefineArray);
            } // end if
        } // end if
    } // end synchronizeProductDefine()

    /**
     * Query IProductDefine
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public ProductDefine findProductDefineById(final long aId)
        throws Exception {
        ProductDefineDAOQueryBean queryBean = new ProductDefineDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        ProductDefine[] ProductDefines = queryProductDefine(queryBean);

        if (ProductDefines.length == 0) {
            return null;
        } // end if
        else {
            return ProductDefines[0];
        } // end else
    } // end findProductDefineById()

    /**
     * Query IProductDefine
     *
     * @param queryBean
     *
     * @return IProductDefine[]
     *
     * @throws Exception
     */
    public ProductDefine[] queryProductDefine(
        ProductDefineDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcProductDefineRowMapper());

        return (ProductDefine[]) result.toArray(new ProductDefine[result.size()]);
    } // end queryProductDefine()

    /**
     * Query ProductDefine Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryProductDefineSelective(
        ProductDefineDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryProductDefineSelective()

    /**
     * Query IProductDefine Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryProductDefineCount(ProductDefineDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryProductDefineCount()

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.product.dao.impl.BaseProductVersionDAOJdbcImpl productVersion;

    /**
     * DOCUMENT ME!
     *
     * @param productVersion DOCUMENT ME!
     */
    public void setProductVersion(
        com.ourteam.product.dao.impl.BaseProductVersionDAOJdbcImpl productVersion) {
        this.productVersion = productVersion;
    } // end setProductVersion()

    /**
     * Query Related IProductVersion
     *
     * @param aDaoQueryBean DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="IProductVersion" containment="true"
     */
    public com.ourteam.product.dao.ProductVersion[] queryProductVersions(
        ProductDefineDAOQueryBean aDaoQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN PRODUCT_DEFINE ON ( ");

        joinSQL.append(
            " PRODUCT_VERSION.PRODUCT_DEFINE_ID = PRODUCT_DEFINE.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.product.dao.IProductVersionDAO.EntityName;

        String[] entityFields = com.ourteam.product.dao.impl.BaseProductVersionDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.product.dao.impl.BaseProductVersionDAOJdbcImpl.ENTITY_PROPERTIES;

        List list = productVersion.query(entityName, entityFields,
                entityProperties, aDaoQueryBean, joinSQL.toString(),
                new com.ourteam.product.dao.impl.BaseProductVersionDAOJdbcImpl.JdbcProductVersionRowMapper());

        return (com.ourteam.product.dao.ProductVersion[]) list.toArray(new com.ourteam.product.dao.ProductVersion[list.size()]);
    } // end queryProductVersions()

    /**
     * Query ProductDefine Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryProductVersionsSelective(
        ProductDefineDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addSelectProperty(com.ourteam.product.dao.IProductVersionDAO.Id,
                "id");

            aQueryBean.addSelectProperty(com.ourteam.product.dao.IProductVersionDAO.ProductDefineId,
                "productDefineId");

            aQueryBean.addSelectProperty(com.ourteam.product.dao.IProductVersionDAO.ProductVersion,
                "productVersion");

            aQueryBean.addSelectProperty(com.ourteam.product.dao.IProductVersionDAO.Remarks,
                "remarks");

            aQueryBean.addSelectProperty(com.ourteam.product.dao.IProductVersionDAO.Status,
                "status");

            aQueryBean.addSelectProperty(com.ourteam.product.dao.IProductVersionDAO.ProductVersionType,
                "productVersionType");
        } // end if

        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN PRODUCT_DEFINE ON ( ");

        joinSQL.append(
            " PRODUCT_VERSION.PRODUCT_DEFINE_ID = PRODUCT_DEFINE.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.product.dao.IProductVersionDAO.EntityName;

        return productVersion.querySelective(entityName, aQueryBean,
            joinSQL.toString());
    } // end queryProductVersionsSelective()

    /**
     * Update Related IProductVersion
     *
     * @param aProductVersion {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void updateProductVersion(
        com.ourteam.product.dao.ProductVersion aProductVersion,
        ProductDefineDAOQueryBean aQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN PRODUCT_DEFINE ON ( ");

        joinSQL.append(
            " PRODUCT_VERSION.PRODUCT_DEFINE_ID = PRODUCT_DEFINE.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.product.dao.IProductVersionDAO.EntityName;

        String[] entityFields = com.ourteam.product.dao.impl.BaseProductVersionDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.product.dao.impl.BaseProductVersionDAOJdbcImpl.ENTITY_PROPERTIES;

        productVersion.updateByQuery(entityName, entityFields,
            entityProperties, joinSQL.toString(), aProductVersion, aQueryBean);
    } // end updateProductVersion()

    /**
     * Delete Related IProductVersion
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void deleteProductVersion(ProductDefineDAOQueryBean aQueryBean)
        throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN PRODUCT_DEFINE ON ( ");

        joinSQL.append(
            " PRODUCT_VERSION.PRODUCT_DEFINE_ID = PRODUCT_DEFINE.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.product.dao.IProductVersionDAO.EntityName;

        productVersion.deleteByQuery(entityName, joinSQL.toString(), aQueryBean);
    } // end deleteProductVersion()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcProductDefineRowMapper
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
            ProductDefine object = new ProductDefine();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object CatalogId = resultSet.getObject(columnIndex++);

                object.setCatalogIdNull(resultSet.getBoolean(columnIndex++));

                if (CatalogId != null) {
                    BeanUtils.setProperty(object, DataProperty.CatalogId,
                        CatalogId);
                } // end if

                Object ProductCode = resultSet.getObject(columnIndex++);

                object.setProductCodeNull(resultSet.getBoolean(columnIndex++));

                if (ProductCode != null) {
                    BeanUtils.setProperty(object, DataProperty.ProductCode,
                        ProductCode);
                } // end if

                Object ProductName = resultSet.getObject(columnIndex++);

                object.setProductNameNull(resultSet.getBoolean(columnIndex++));

                if (ProductName != null) {
                    BeanUtils.setProperty(object, DataProperty.ProductName,
                        ProductName);
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
    } // end JdbcProductDefineRowMapper
} // end BaseProductDefineDAOJdbcImpl
