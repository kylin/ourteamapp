/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.dao.impl;

import com.ourteam.product.dao.IProductFunctionVersionRelateDAO;
import com.ourteam.product.dao.ProductFunctionVersionRelate;
import com.ourteam.product.dao.ProductFunctionVersionRelateDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-10-10 16:08:02
 *
 * @author kylin
 */
abstract public class BaseProductFunctionVersionRelateDAOJdbcImpl
    extends AbstractJdbcDAO implements IProductFunctionVersionRelateDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, ProductFunctionId, ProductVersionId, Remarks, Status
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.ProductFunctionId,
            DataProperty.ProductVersionId, DataProperty.Remarks,
            DataProperty.Status
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
     * Creates a new BaseProductFunctionVersionRelateDAOJdbcImpl object.
     */
    public BaseProductFunctionVersionRelateDAOJdbcImpl() {
        super();
    } // end BaseProductFunctionVersionRelateDAOJdbcImpl()

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
     * Check Unique ProductFunctionVersionRelate
     *
     * @param aProductFunctionVersionRelate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(
        ProductFunctionVersionRelate aProductFunctionVersionRelate)
        throws Exception {
        if (aProductFunctionVersionRelate == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(
                aProductFunctionVersionRelate, DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IProductFunctionVersionRelate
     *
     * @param aProductFunctionVersionRelate
     *
     * @throws Exception
     */
    public void insertProductFunctionVersionRelate(
        ProductFunctionVersionRelate aProductFunctionVersionRelate)
        throws Exception {
        insert(aProductFunctionVersionRelate);
    } // end insertProductFunctionVersionRelate()

    /**
     * Batch Insert IProductFunctionVersionRelate
     *
     * @param aProductFunctionVersionRelate
     *
     * @throws Exception
     */
    public void batchInsertProductFunctionVersionRelate(
        ProductFunctionVersionRelate[] aProductFunctionVersionRelate)
        throws Exception {
        batchInsert(aProductFunctionVersionRelate);
    } // end batchInsertProductFunctionVersionRelate()

    /**
     * Delete IProductFunctionVersionRelate
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteProductFunctionVersionRelate(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteProductFunctionVersionRelate()

    /**
     * Delete IProductFunctionVersionRelate
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteProductFunctionVersionRelate(
        ProductFunctionVersionRelateDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteProductFunctionVersionRelate()

    /**
     * Update IProductFunctionVersionRelate Selective
     *
     * @param aProductFunctionVersionRelate
     *
     * @throws Exception
     */
    public void updateProductFunctionVersionRelate(
        ProductFunctionVersionRelate aProductFunctionVersionRelate)
        throws Exception {
        if (aProductFunctionVersionRelate.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aProductFunctionVersionRelate);

        ProductFunctionVersionRelate tempObj = findProductFunctionVersionRelateById(aProductFunctionVersionRelate.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aProductFunctionVersionRelate, tempObj);
        } // end if
    } // end updateProductFunctionVersionRelate()

    /**
     * Batch Update IProductFunctionVersionRelate
     *
     * @param aProductFunctionVersionRelate
     *
     * @throws Exception
     */
    public void batchUpdateProductFunctionVersionRelate(
        ProductFunctionVersionRelate[] aProductFunctionVersionRelate)
        throws Exception {
        batchUpdate(aProductFunctionVersionRelate);
    } // end batchUpdateProductFunctionVersionRelate()

    /**
     * Update IProductFunctionVersionRelate
     *
     * @param aProductFunctionVersionRelate
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateProductFunctionVersionRelate(
        ProductFunctionVersionRelate aProductFunctionVersionRelate,
        ProductFunctionVersionRelateDAOQueryBean aQueryBean)
        throws Exception {
        updateByQuery(aProductFunctionVersionRelate, aQueryBean);
    } // end updateProductFunctionVersionRelate()

    /**
     * DOCUMENT ME!
     *
     * @param aProductFunctionVersionRelate DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(
        ProductFunctionVersionRelate aProductFunctionVersionRelate)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aProductFunctionVersionRelates DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeProductFunctionVersionRelate(
        ProductFunctionVersionRelate[] aProductFunctionVersionRelates,
        ProductFunctionVersionRelateDAOQueryBean aQueryBean)
        throws Exception {
        synchronizeProductFunctionVersionRelate(aProductFunctionVersionRelates,
            aQueryBean, null);
    } // end synchronizeProductFunctionVersionRelate()

    /**
     * DOCUMENT ME!
     *
     * @param aProductFunctionVersionRelates DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeProductFunctionVersionRelate(
        ProductFunctionVersionRelate[] aProductFunctionVersionRelates,
        ProductFunctionVersionRelateDAOQueryBean aQueryBean,
        ProductFunctionVersionRelateSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aProductFunctionVersionRelates) == false) {
            inputList.addAll(Arrays.asList(aProductFunctionVersionRelates));
        } // end if

        ProductFunctionVersionRelate[] existentProductFunctionVersionRelates = this.queryProductFunctionVersionRelate(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentProductFunctionVersionRelates) == false) {
            existentList.addAll(Arrays.asList(
                    existentProductFunctionVersionRelates));
        } // end if

        List willAddProductFunctionVersionRelates = ListUtils.subtract(inputList,
                existentList);

        List willDeleteProductFunctionVersionRelates = ListUtils.subtract(existentList,
                inputList);

        List willUpdateProductFunctionVersionRelates = ListUtils.intersection(existentList,
                inputList);

        ProductFunctionVersionRelate[] willUpdateProductFunctionVersionRelateArray =
            (ProductFunctionVersionRelate[]) willUpdateProductFunctionVersionRelates.toArray(new ProductFunctionVersionRelate[willUpdateProductFunctionVersionRelates.size()]);
        ProductFunctionVersionRelate[] willAddProductFunctionVersionRelateArray = (ProductFunctionVersionRelate[]) willAddProductFunctionVersionRelates.toArray(new ProductFunctionVersionRelate[willAddProductFunctionVersionRelates.size()]);
        ProductFunctionVersionRelate[] willDeleteProductFunctionVersionRelateArray =
            (ProductFunctionVersionRelate[]) willDeleteProductFunctionVersionRelates.toArray(new ProductFunctionVersionRelate[willDeleteProductFunctionVersionRelates.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddProductFunctionVersionRelateArray,
                willUpdateProductFunctionVersionRelateArray,
                willDeleteProductFunctionVersionRelateArray);
        } // end if

        if (willUpdateProductFunctionVersionRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateProductFunctionVersionRelateArray);
            } // end if

            this.batchUpdateProductFunctionVersionRelate(willUpdateProductFunctionVersionRelateArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateProductFunctionVersionRelateArray);
            } // end if
        } // end if

        if (willAddProductFunctionVersionRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddProductFunctionVersionRelateArray);
            } // end if

            this.batchInsertProductFunctionVersionRelate(willAddProductFunctionVersionRelateArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddProductFunctionVersionRelateArray);
            } // end if
        } // end if

        if (willDeleteProductFunctionVersionRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteProductFunctionVersionRelateArray);
            } // end if

            for (int i = 0;
                    i < willDeleteProductFunctionVersionRelateArray.length;
                    i++) {
                ProductFunctionVersionRelate object = willDeleteProductFunctionVersionRelateArray[i];
                this.deleteProductFunctionVersionRelate(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteProductFunctionVersionRelateArray);
            } // end if
        } // end if
    } // end synchronizeProductFunctionVersionRelate()

    /**
     * Query IProductFunctionVersionRelate
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public ProductFunctionVersionRelate findProductFunctionVersionRelateById(
        final long aId) throws Exception {
        ProductFunctionVersionRelateDAOQueryBean queryBean = new ProductFunctionVersionRelateDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        ProductFunctionVersionRelate[] ProductFunctionVersionRelates = queryProductFunctionVersionRelate(queryBean);

        if (ProductFunctionVersionRelates.length == 0) {
            return null;
        } // end if
        else {
            return ProductFunctionVersionRelates[0];
        } // end else
    } // end findProductFunctionVersionRelateById()

    /**
     * Query IProductFunctionVersionRelate
     *
     * @param queryBean
     *
     * @return IProductFunctionVersionRelate[]
     *
     * @throws Exception
     */
    public ProductFunctionVersionRelate[] queryProductFunctionVersionRelate(
        ProductFunctionVersionRelateDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean,
                new JdbcProductFunctionVersionRelateRowMapper());

        return (ProductFunctionVersionRelate[]) result.toArray(new ProductFunctionVersionRelate[result.size()]);
    } // end queryProductFunctionVersionRelate()

    /**
     * Query ProductFunctionVersionRelate Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryProductFunctionVersionRelateSelective(
        ProductFunctionVersionRelateDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryProductFunctionVersionRelateSelective()

    /**
     * Query IProductFunctionVersionRelate Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryProductFunctionVersionRelateCount(
        ProductFunctionVersionRelateDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryProductFunctionVersionRelateCount()

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.product.dao.impl.BaseProductFunctionDAOJdbcImpl productFunction;

    /**
     * DOCUMENT ME!
     *
     * @param productFunction DOCUMENT ME!
     */
    public void setProductFunction(
        com.ourteam.product.dao.impl.BaseProductFunctionDAOJdbcImpl productFunction) {
        this.productFunction = productFunction;
    } // end setProductFunction()

    /**
     * Query Related IProductFunction
     *
     * @param aDaoQueryBean DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="IProductFunction" containment="true"
     */
    public com.ourteam.product.dao.ProductFunction[] queryProductFunctions(
        ProductFunctionVersionRelateDAOQueryBean aDaoQueryBean)
        throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN PRODUCT_FUNCTION_VERSION_RELATE ON ( ");

        joinSQL.append(
            " PRODUCT_FUNCTION.ID = PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_FUNCTION_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.product.dao.IProductFunctionDAO.EntityName;

        String[] entityFields = com.ourteam.product.dao.impl.BaseProductFunctionDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.product.dao.impl.BaseProductFunctionDAOJdbcImpl.ENTITY_PROPERTIES;

        List list = productFunction.query(entityName, entityFields,
                entityProperties, aDaoQueryBean, joinSQL.toString(),
                new com.ourteam.product.dao.impl.BaseProductFunctionDAOJdbcImpl.JdbcProductFunctionRowMapper());

        return (com.ourteam.product.dao.ProductFunction[]) list.toArray(new com.ourteam.product.dao.ProductFunction[list.size()]);
    } // end queryProductFunctions()

    /**
     * Query ProductFunctionVersionRelate Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryProductFunctionsSelective(
        ProductFunctionVersionRelateDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addSelectProperty(com.ourteam.product.dao.IProductFunctionDAO.Id,
                "id");

            aQueryBean.addSelectProperty(com.ourteam.product.dao.IProductFunctionDAO.FunctionCode,
                "functionCode");

            aQueryBean.addSelectProperty(com.ourteam.product.dao.IProductFunctionDAO.FunctionName,
                "functionName");

            aQueryBean.addSelectProperty(com.ourteam.product.dao.IProductFunctionDAO.ParentFunctionId,
                "parentFunctionId");

            aQueryBean.addSelectProperty(com.ourteam.product.dao.IProductFunctionDAO.ProductDefineId,
                "productDefineId");

            aQueryBean.addSelectProperty(com.ourteam.product.dao.IProductFunctionDAO.Remarks,
                "remarks");

            aQueryBean.addSelectProperty(com.ourteam.product.dao.IProductFunctionDAO.Status,
                "status");

            aQueryBean.addSelectProperty(com.ourteam.product.dao.IProductFunctionDAO.CanTest,
                "canTest");
        } // end if

        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN PRODUCT_FUNCTION_VERSION_RELATE ON ( ");

        joinSQL.append(
            " PRODUCT_FUNCTION.ID = PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_FUNCTION_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.product.dao.IProductFunctionDAO.EntityName;

        return productFunction.querySelective(entityName, aQueryBean,
            joinSQL.toString());
    } // end queryProductFunctionsSelective()

    /**
     * Update Related IProductFunction
     *
     * @param aProductFunction {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void updateProductFunction(
        com.ourteam.product.dao.ProductFunction aProductFunction,
        ProductFunctionVersionRelateDAOQueryBean aQueryBean)
        throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN PRODUCT_FUNCTION_VERSION_RELATE ON ( ");

        joinSQL.append(
            " PRODUCT_FUNCTION.ID = PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_FUNCTION_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.product.dao.IProductFunctionDAO.EntityName;

        String[] entityFields = com.ourteam.product.dao.impl.BaseProductFunctionDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.product.dao.impl.BaseProductFunctionDAOJdbcImpl.ENTITY_PROPERTIES;

        productFunction.updateByQuery(entityName, entityFields,
            entityProperties, joinSQL.toString(), aProductFunction, aQueryBean);
    } // end updateProductFunction()

    /**
     * Delete Related IProductFunction
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void deleteProductFunction(
        ProductFunctionVersionRelateDAOQueryBean aQueryBean)
        throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN PRODUCT_FUNCTION_VERSION_RELATE ON ( ");

        joinSQL.append(
            " PRODUCT_FUNCTION.ID = PRODUCT_FUNCTION_VERSION_RELATE.PRODUCT_FUNCTION_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.product.dao.IProductFunctionDAO.EntityName;

        productFunction.deleteByQuery(entityName, joinSQL.toString(), aQueryBean);
    } // end deleteProductFunction()

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
        ProductFunctionVersionRelateDAOQueryBean aDaoQueryBean)
        throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN PRODUCT_FUNCTION_VERSION_RELATE ON ( ");

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
     * Query ProductFunctionVersionRelate Selective
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
        ProductFunctionVersionRelateDAOQueryBean aQueryBean)
        throws Exception {
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

        joinSQL.append(" LEFT JOIN PRODUCT_FUNCTION_VERSION_RELATE ON ( ");

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
        ProductFunctionVersionRelateDAOQueryBean aQueryBean)
        throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN PRODUCT_FUNCTION_VERSION_RELATE ON ( ");

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
    public void deleteProductVersion(
        ProductFunctionVersionRelateDAOQueryBean aQueryBean)
        throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN PRODUCT_FUNCTION_VERSION_RELATE ON ( ");

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
    public static class JdbcProductFunctionVersionRelateRowMapper
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
            ProductFunctionVersionRelate object = new ProductFunctionVersionRelate();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object ProductFunctionId = resultSet.getObject(columnIndex++);

                object.setProductFunctionIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (ProductFunctionId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ProductFunctionId, ProductFunctionId);
                } // end if

                Object ProductVersionId = resultSet.getObject(columnIndex++);

                object.setProductVersionIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (ProductVersionId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ProductVersionId, ProductVersionId);
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
    } // end JdbcProductFunctionVersionRelateRowMapper
} // end BaseProductFunctionVersionRelateDAOJdbcImpl
