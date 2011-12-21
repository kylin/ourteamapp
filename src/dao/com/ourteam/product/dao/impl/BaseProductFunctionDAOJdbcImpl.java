/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.dao.impl;

import com.ourteam.product.dao.IProductFunctionDAO;
import com.ourteam.product.dao.ProductFunction;
import com.ourteam.product.dao.ProductFunctionDAOQueryBean;

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
abstract public class BaseProductFunctionDAOJdbcImpl extends AbstractJdbcDAO
    implements IProductFunctionDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, FunctionCode, FunctionName, ParentFunctionId, ProductDefineId,
            Remarks, Status, CanTest
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.FunctionCode,
            DataProperty.FunctionName, DataProperty.ParentFunctionId,
            DataProperty.ProductDefineId, DataProperty.Remarks,
            DataProperty.Status, DataProperty.CanTest
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
            FunctionCode, FunctionName, ParentFunctionId, ProductDefineId
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
     * Creates a new BaseProductFunctionDAOJdbcImpl object.
     */
    public BaseProductFunctionDAOJdbcImpl() {
        super();
    } // end BaseProductFunctionDAOJdbcImpl()

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
     * Check Unique ProductFunction
     *
     * @param aProductFunction
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(ProductFunction aProductFunction)
        throws Exception {
        if (aProductFunction == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aProductFunction,
                DataProperty.Id));

        valueList.add(PropertyUtils.getProperty(aProductFunction,
                DataProperty.FunctionCode));

        valueList.add(PropertyUtils.getProperty(aProductFunction,
                DataProperty.FunctionName));

        valueList.add(PropertyUtils.getProperty(aProductFunction,
                DataProperty.ParentFunctionId));

        valueList.add(PropertyUtils.getProperty(aProductFunction,
                DataProperty.ProductDefineId));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IProductFunction
     *
     * @param aProductFunction
     *
     * @throws Exception
     */
    public void insertProductFunction(ProductFunction aProductFunction)
        throws Exception {
        insert(aProductFunction);
    } // end insertProductFunction()

    /**
     * Batch Insert IProductFunction
     *
     * @param aProductFunction
     *
     * @throws Exception
     */
    public void batchInsertProductFunction(ProductFunction[] aProductFunction)
        throws Exception {
        batchInsert(aProductFunction);
    } // end batchInsertProductFunction()

    /**
     * Delete IProductFunction
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteProductFunction(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteProductFunction()

    /**
     * Delete IProductFunction
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteProductFunction(ProductFunctionDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteProductFunction()

    /**
     * Update IProductFunction Selective
     *
     * @param aProductFunction
     *
     * @throws Exception
     */
    public void updateProductFunction(ProductFunction aProductFunction)
        throws Exception {
        if (aProductFunction.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aProductFunction);

        ProductFunction tempObj = findProductFunctionById(aProductFunction.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aProductFunction, tempObj);
        } // end if
    } // end updateProductFunction()

    /**
     * Batch Update IProductFunction
     *
     * @param aProductFunction
     *
     * @throws Exception
     */
    public void batchUpdateProductFunction(ProductFunction[] aProductFunction)
        throws Exception {
        batchUpdate(aProductFunction);
    } // end batchUpdateProductFunction()

    /**
     * Update IProductFunction
     *
     * @param aProductFunction
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateProductFunction(ProductFunction aProductFunction,
        ProductFunctionDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aProductFunction, aQueryBean);
    } // end updateProductFunction()

    /**
     * DOCUMENT ME!
     *
     * @param aProductFunction DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(ProductFunction aProductFunction)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aProductFunctions DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeProductFunction(
        ProductFunction[] aProductFunctions,
        ProductFunctionDAOQueryBean aQueryBean) throws Exception {
        synchronizeProductFunction(aProductFunctions, aQueryBean, null);
    } // end synchronizeProductFunction()

    /**
     * DOCUMENT ME!
     *
     * @param aProductFunctions DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeProductFunction(
        ProductFunction[] aProductFunctions,
        ProductFunctionDAOQueryBean aQueryBean,
        ProductFunctionSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aProductFunctions) == false) {
            inputList.addAll(Arrays.asList(aProductFunctions));
        } // end if

        ProductFunction[] existentProductFunctions = this.queryProductFunction(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentProductFunctions) == false) {
            existentList.addAll(Arrays.asList(existentProductFunctions));
        } // end if

        List willAddProductFunctions = ListUtils.subtract(inputList,
                existentList);

        List willDeleteProductFunctions = ListUtils.subtract(existentList,
                inputList);

        List willUpdateProductFunctions = ListUtils.intersection(existentList,
                inputList);

        ProductFunction[] willUpdateProductFunctionArray = (ProductFunction[]) willUpdateProductFunctions.toArray(new ProductFunction[willUpdateProductFunctions.size()]);
        ProductFunction[] willAddProductFunctionArray = (ProductFunction[]) willAddProductFunctions.toArray(new ProductFunction[willAddProductFunctions.size()]);
        ProductFunction[] willDeleteProductFunctionArray = (ProductFunction[]) willDeleteProductFunctions.toArray(new ProductFunction[willDeleteProductFunctions.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddProductFunctionArray,
                willUpdateProductFunctionArray, willDeleteProductFunctionArray);
        } // end if

        if (willUpdateProductFunctions.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateProductFunctionArray);
            } // end if

            this.batchUpdateProductFunction(willUpdateProductFunctionArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateProductFunctionArray);
            } // end if
        } // end if

        if (willAddProductFunctions.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddProductFunctionArray);
            } // end if

            this.batchInsertProductFunction(willAddProductFunctionArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddProductFunctionArray);
            } // end if
        } // end if

        if (willDeleteProductFunctions.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteProductFunctionArray);
            } // end if

            for (int i = 0; i < willDeleteProductFunctionArray.length; i++) {
                ProductFunction object = willDeleteProductFunctionArray[i];
                this.deleteProductFunction(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteProductFunctionArray);
            } // end if
        } // end if
    } // end synchronizeProductFunction()

    /**
     * Query IProductFunction
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public ProductFunction findProductFunctionById(final long aId)
        throws Exception {
        ProductFunctionDAOQueryBean queryBean = new ProductFunctionDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        ProductFunction[] ProductFunctions = queryProductFunction(queryBean);

        if (ProductFunctions.length == 0) {
            return null;
        } // end if
        else {
            return ProductFunctions[0];
        } // end else
    } // end findProductFunctionById()

    /**
     * Query IProductFunction
     *
     * @param queryBean
     *
     * @return IProductFunction[]
     *
     * @throws Exception
     */
    public ProductFunction[] queryProductFunction(
        ProductFunctionDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcProductFunctionRowMapper());

        return (ProductFunction[]) result.toArray(new ProductFunction[result.size()]);
    } // end queryProductFunction()

    /**
     * Query ProductFunction Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryProductFunctionSelective(
        ProductFunctionDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryProductFunctionSelective()

    /**
     * Query IProductFunction Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryProductFunctionCount(ProductFunctionDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryProductFunctionCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcProductFunctionRowMapper
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
            ProductFunction object = new ProductFunction();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object FunctionCode = resultSet.getObject(columnIndex++);

                object.setFunctionCodeNull(resultSet.getBoolean(columnIndex++));

                if (FunctionCode != null) {
                    BeanUtils.setProperty(object, DataProperty.FunctionCode,
                        FunctionCode);
                } // end if

                Object FunctionName = resultSet.getObject(columnIndex++);

                object.setFunctionNameNull(resultSet.getBoolean(columnIndex++));

                if (FunctionName != null) {
                    BeanUtils.setProperty(object, DataProperty.FunctionName,
                        FunctionName);
                } // end if

                Object ParentFunctionId = resultSet.getObject(columnIndex++);

                object.setParentFunctionIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (ParentFunctionId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ParentFunctionId, ParentFunctionId);
                } // end if

                Object ProductDefineId = resultSet.getObject(columnIndex++);

                object.setProductDefineIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (ProductDefineId != null) {
                    BeanUtils.setProperty(object, DataProperty.ProductDefineId,
                        ProductDefineId);
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

                Object CanTest = resultSet.getObject(columnIndex++);

                object.setCanTestNull(resultSet.getBoolean(columnIndex++));

                if (CanTest != null) {
                    BeanUtils.setProperty(object, DataProperty.CanTest, CanTest);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcProductFunctionRowMapper
} // end BaseProductFunctionDAOJdbcImpl
