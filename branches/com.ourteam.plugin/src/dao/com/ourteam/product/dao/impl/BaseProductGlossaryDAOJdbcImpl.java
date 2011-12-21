/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.dao.impl;

import com.ourteam.product.dao.IProductGlossaryDAO;
import com.ourteam.product.dao.ProductGlossary;
import com.ourteam.product.dao.ProductGlossaryDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-10-12 16:27:00
 *
 * @author kylin
 */
abstract public class BaseProductGlossaryDAOJdbcImpl extends AbstractJdbcDAO
    implements IProductGlossaryDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, Code, Content, CreateDate, CreatorId, LastEditorId, LastEditDate,
            Name, ProductId, Remarks, Status, LastEditorName, SinceVersionId,
            SinceVersion
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.Code, DataProperty.Content,
            DataProperty.CreateDate, DataProperty.CreatorId,
            DataProperty.LastEditorId, DataProperty.LastEditDate,
            DataProperty.Name, DataProperty.ProductId, DataProperty.Remarks,
            DataProperty.Status, DataProperty.LastEditorName,
            DataProperty.SinceVersionId, DataProperty.SinceVersion
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
     * Creates a new BaseProductGlossaryDAOJdbcImpl object.
     */
    public BaseProductGlossaryDAOJdbcImpl() {
        super();
    } // end BaseProductGlossaryDAOJdbcImpl()

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

            relatedJoinSQLBuffer.append(" LEFT JOIN SYS_USER lastEditorA ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " lastEditorA.ID = PRODUCT_GLOSSARY.LAST_EDITOR_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQLBuffer.append(
                " LEFT JOIN PRODUCT_VERSION productVersionA ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " productVersionA.ID = PRODUCT_GLOSSARY.SINCE_VERSION_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique ProductGlossary
     *
     * @param aProductGlossary
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(ProductGlossary aProductGlossary)
        throws Exception {
        if (aProductGlossary == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aProductGlossary,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IProductGlossary
     *
     * @param aProductGlossary
     *
     * @throws Exception
     */
    public void insertProductGlossary(ProductGlossary aProductGlossary)
        throws Exception {
        org.apache.commons.beanutils.PropertyUtils.setProperty(aProductGlossary,
            "lastEditDate", new java.sql.Timestamp(System.currentTimeMillis()));

        org.apache.commons.beanutils.PropertyUtils.setProperty(aProductGlossary,
            "createDate", new java.sql.Timestamp(System.currentTimeMillis()));

        insert(aProductGlossary);
    } // end insertProductGlossary()

    /**
     * Batch Insert IProductGlossary
     *
     * @param aProductGlossary
     *
     * @throws Exception
     */
    public void batchInsertProductGlossary(ProductGlossary[] aProductGlossary)
        throws Exception {
        batchInsert(aProductGlossary);
    } // end batchInsertProductGlossary()

    /**
     * Delete IProductGlossary
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteProductGlossary(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteProductGlossary()

    /**
     * Delete IProductGlossary
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteProductGlossary(ProductGlossaryDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteProductGlossary()

    /**
     * Update IProductGlossary Selective
     *
     * @param aProductGlossary
     *
     * @throws Exception
     */
    public void updateProductGlossary(ProductGlossary aProductGlossary)
        throws Exception {
        org.apache.commons.beanutils.PropertyUtils.setProperty(aProductGlossary,
            "lastEditDate", new java.sql.Timestamp(System.currentTimeMillis()));

        if (aProductGlossary.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aProductGlossary);

        ProductGlossary tempObj = findProductGlossaryById(aProductGlossary.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aProductGlossary, tempObj);
        } // end if
    } // end updateProductGlossary()

    /**
     * Batch Update IProductGlossary
     *
     * @param aProductGlossary
     *
     * @throws Exception
     */
    public void batchUpdateProductGlossary(ProductGlossary[] aProductGlossary)
        throws Exception {
        batchUpdate(aProductGlossary);
    } // end batchUpdateProductGlossary()

    /**
     * Update IProductGlossary
     *
     * @param aProductGlossary
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateProductGlossary(ProductGlossary aProductGlossary,
        ProductGlossaryDAOQueryBean aQueryBean) throws Exception {
        org.apache.commons.beanutils.PropertyUtils.setProperty(aProductGlossary,
            "lastEditDate", new java.sql.Timestamp(System.currentTimeMillis()));

        updateByQuery(aProductGlossary, aQueryBean);
    } // end updateProductGlossary()

    /**
     * DOCUMENT ME!
     *
     * @param aProductGlossary DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(ProductGlossary aProductGlossary)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aProductGlossarys DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeProductGlossary(
        ProductGlossary[] aProductGlossarys,
        ProductGlossaryDAOQueryBean aQueryBean) throws Exception {
        synchronizeProductGlossary(aProductGlossarys, aQueryBean, null);
    } // end synchronizeProductGlossary()

    /**
     * DOCUMENT ME!
     *
     * @param aProductGlossarys DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeProductGlossary(
        ProductGlossary[] aProductGlossarys,
        ProductGlossaryDAOQueryBean aQueryBean,
        ProductGlossarySynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aProductGlossarys) == false) {
            inputList.addAll(Arrays.asList(aProductGlossarys));
        } // end if

        ProductGlossary[] existentProductGlossarys = this.queryProductGlossary(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentProductGlossarys) == false) {
            existentList.addAll(Arrays.asList(existentProductGlossarys));
        } // end if

        List willAddProductGlossarys = ListUtils.subtract(inputList,
                existentList);

        List willDeleteProductGlossarys = ListUtils.subtract(existentList,
                inputList);

        List willUpdateProductGlossarys = ListUtils.intersection(existentList,
                inputList);

        ProductGlossary[] willUpdateProductGlossaryArray = (ProductGlossary[]) willUpdateProductGlossarys.toArray(new ProductGlossary[willUpdateProductGlossarys.size()]);
        ProductGlossary[] willAddProductGlossaryArray = (ProductGlossary[]) willAddProductGlossarys.toArray(new ProductGlossary[willAddProductGlossarys.size()]);
        ProductGlossary[] willDeleteProductGlossaryArray = (ProductGlossary[]) willDeleteProductGlossarys.toArray(new ProductGlossary[willDeleteProductGlossarys.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddProductGlossaryArray,
                willUpdateProductGlossaryArray, willDeleteProductGlossaryArray);
        } // end if

        if (willUpdateProductGlossarys.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateProductGlossaryArray);
            } // end if

            this.batchUpdateProductGlossary(willUpdateProductGlossaryArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateProductGlossaryArray);
            } // end if
        } // end if

        if (willAddProductGlossarys.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddProductGlossaryArray);
            } // end if

            this.batchInsertProductGlossary(willAddProductGlossaryArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddProductGlossaryArray);
            } // end if
        } // end if

        if (willDeleteProductGlossarys.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteProductGlossaryArray);
            } // end if

            for (int i = 0; i < willDeleteProductGlossaryArray.length; i++) {
                ProductGlossary object = willDeleteProductGlossaryArray[i];
                this.deleteProductGlossary(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteProductGlossaryArray);
            } // end if
        } // end if
    } // end synchronizeProductGlossary()

    /**
     * Query IProductGlossary
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public ProductGlossary findProductGlossaryById(final long aId)
        throws Exception {
        ProductGlossaryDAOQueryBean queryBean = new ProductGlossaryDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        ProductGlossary[] ProductGlossarys = queryProductGlossary(queryBean);

        if (ProductGlossarys.length == 0) {
            return null;
        } // end if
        else {
            return ProductGlossarys[0];
        } // end else
    } // end findProductGlossaryById()

    /**
     * Query IProductGlossary
     *
     * @param queryBean
     *
     * @return IProductGlossary[]
     *
     * @throws Exception
     */
    public ProductGlossary[] queryProductGlossary(
        ProductGlossaryDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcProductGlossaryRowMapper());

        return (ProductGlossary[]) result.toArray(new ProductGlossary[result.size()]);
    } // end queryProductGlossary()

    /**
     * Query ProductGlossary Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryProductGlossarySelective(
        ProductGlossaryDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryProductGlossarySelective()

    /**
     * Query IProductGlossary Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryProductGlossaryCount(ProductGlossaryDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryProductGlossaryCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcProductGlossaryRowMapper
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
            ProductGlossary object = new ProductGlossary();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object Code = resultSet.getObject(columnIndex++);

                object.setCodeNull(resultSet.getBoolean(columnIndex++));

                if (Code != null) {
                    BeanUtils.setProperty(object, DataProperty.Code, Code);
                } // end if

                Object Content = resultSet.getObject(columnIndex++);

                object.setContentNull(resultSet.getBoolean(columnIndex++));

                if (Content != null) {
                    BeanUtils.setProperty(object, DataProperty.Content, Content);
                } // end if

                Object CreateDate = resultSet.getObject(columnIndex++);

                object.setCreateDateNull(resultSet.getBoolean(columnIndex++));

                if (CreateDate != null) {
                    BeanUtils.setProperty(object, DataProperty.CreateDate,
                        CreateDate);
                } // end if

                Object CreatorId = resultSet.getObject(columnIndex++);

                object.setCreatorIdNull(resultSet.getBoolean(columnIndex++));

                if (CreatorId != null) {
                    BeanUtils.setProperty(object, DataProperty.CreatorId,
                        CreatorId);
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

                Object Name = resultSet.getObject(columnIndex++);

                object.setNameNull(resultSet.getBoolean(columnIndex++));

                if (Name != null) {
                    BeanUtils.setProperty(object, DataProperty.Name, Name);
                } // end if

                Object ProductId = resultSet.getObject(columnIndex++);

                object.setProductIdNull(resultSet.getBoolean(columnIndex++));

                if (ProductId != null) {
                    BeanUtils.setProperty(object, DataProperty.ProductId,
                        ProductId);
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

                Object LastEditorName = resultSet.getObject(columnIndex++);

                object.setLastEditorNameNull(resultSet.getBoolean(columnIndex++));

                if (LastEditorName != null) {
                    BeanUtils.setProperty(object, DataProperty.LastEditorName,
                        LastEditorName);
                } // end if

                Object SinceVersionId = resultSet.getObject(columnIndex++);

                object.setSinceVersionIdNull(resultSet.getBoolean(columnIndex++));

                if (SinceVersionId != null) {
                    BeanUtils.setProperty(object, DataProperty.SinceVersionId,
                        SinceVersionId);
                } // end if

                Object SinceVersion = resultSet.getObject(columnIndex++);

                object.setSinceVersionNull(resultSet.getBoolean(columnIndex++));

                if (SinceVersion != null) {
                    BeanUtils.setProperty(object, DataProperty.SinceVersion,
                        SinceVersion);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcProductGlossaryRowMapper
} // end BaseProductGlossaryDAOJdbcImpl
