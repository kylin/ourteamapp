/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.product.dao.impl;

import com.ourteam.product.dao.IProductTeamRelateDAO;
import com.ourteam.product.dao.ProductTeamRelate;
import com.ourteam.product.dao.ProductTeamRelateDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-10-10 16:08:03
 *
 * @author kylin
 */
abstract public class BaseProductTeamRelateDAOJdbcImpl extends AbstractJdbcDAO
    implements IProductTeamRelateDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, ProductId, Remarks, Status, TeamId, TeamName, TeamCode, TeamMail,
            TeamStatus, ProductCode, ProductName
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.ProductId, DataProperty.Remarks,
            DataProperty.Status, DataProperty.TeamId, DataProperty.TeamName,
            DataProperty.TeamCode, DataProperty.TeamMail,
            DataProperty.TeamStatus, DataProperty.ProductCode,
            DataProperty.ProductName
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
     * Creates a new BaseProductTeamRelateDAOJdbcImpl object.
     */
    public BaseProductTeamRelateDAOJdbcImpl() {
        super();
    } // end BaseProductTeamRelateDAOJdbcImpl()

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

            relatedJoinSQLBuffer.append(" LEFT JOIN TEAM_DEFINE teamA ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " teamA.ID = PRODUCT_TEAM_RELATE.TEAM_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQLBuffer.append(" LEFT JOIN PRODUCT_DEFINE productA ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " productA.ID = PRODUCT_TEAM_RELATE.PRODUCT_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique ProductTeamRelate
     *
     * @param aProductTeamRelate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(ProductTeamRelate aProductTeamRelate)
        throws Exception {
        if (aProductTeamRelate == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aProductTeamRelate,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IProductTeamRelate
     *
     * @param aProductTeamRelate
     *
     * @throws Exception
     */
    public void insertProductTeamRelate(ProductTeamRelate aProductTeamRelate)
        throws Exception {
        insert(aProductTeamRelate);
    } // end insertProductTeamRelate()

    /**
     * Batch Insert IProductTeamRelate
     *
     * @param aProductTeamRelate
     *
     * @throws Exception
     */
    public void batchInsertProductTeamRelate(
        ProductTeamRelate[] aProductTeamRelate) throws Exception {
        batchInsert(aProductTeamRelate);
    } // end batchInsertProductTeamRelate()

    /**
     * Delete IProductTeamRelate
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteProductTeamRelate(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteProductTeamRelate()

    /**
     * Delete IProductTeamRelate
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteProductTeamRelate(ProductTeamRelateDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteProductTeamRelate()

    /**
     * Update IProductTeamRelate Selective
     *
     * @param aProductTeamRelate
     *
     * @throws Exception
     */
    public void updateProductTeamRelate(ProductTeamRelate aProductTeamRelate)
        throws Exception {
        if (aProductTeamRelate.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aProductTeamRelate);

        ProductTeamRelate tempObj = findProductTeamRelateById(aProductTeamRelate.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aProductTeamRelate, tempObj);
        } // end if
    } // end updateProductTeamRelate()

    /**
     * Batch Update IProductTeamRelate
     *
     * @param aProductTeamRelate
     *
     * @throws Exception
     */
    public void batchUpdateProductTeamRelate(
        ProductTeamRelate[] aProductTeamRelate) throws Exception {
        batchUpdate(aProductTeamRelate);
    } // end batchUpdateProductTeamRelate()

    /**
     * Update IProductTeamRelate
     *
     * @param aProductTeamRelate
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateProductTeamRelate(ProductTeamRelate aProductTeamRelate,
        ProductTeamRelateDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aProductTeamRelate, aQueryBean);
    } // end updateProductTeamRelate()

    /**
     * DOCUMENT ME!
     *
     * @param aProductTeamRelate DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(ProductTeamRelate aProductTeamRelate)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aProductTeamRelates DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeProductTeamRelate(
        ProductTeamRelate[] aProductTeamRelates,
        ProductTeamRelateDAOQueryBean aQueryBean) throws Exception {
        synchronizeProductTeamRelate(aProductTeamRelates, aQueryBean, null);
    } // end synchronizeProductTeamRelate()

    /**
     * DOCUMENT ME!
     *
     * @param aProductTeamRelates DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeProductTeamRelate(
        ProductTeamRelate[] aProductTeamRelates,
        ProductTeamRelateDAOQueryBean aQueryBean,
        ProductTeamRelateSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aProductTeamRelates) == false) {
            inputList.addAll(Arrays.asList(aProductTeamRelates));
        } // end if

        ProductTeamRelate[] existentProductTeamRelates = this.queryProductTeamRelate(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentProductTeamRelates) == false) {
            existentList.addAll(Arrays.asList(existentProductTeamRelates));
        } // end if

        List willAddProductTeamRelates = ListUtils.subtract(inputList,
                existentList);

        List willDeleteProductTeamRelates = ListUtils.subtract(existentList,
                inputList);

        List willUpdateProductTeamRelates = ListUtils.intersection(existentList,
                inputList);

        ProductTeamRelate[] willUpdateProductTeamRelateArray = (ProductTeamRelate[]) willUpdateProductTeamRelates.toArray(new ProductTeamRelate[willUpdateProductTeamRelates.size()]);
        ProductTeamRelate[] willAddProductTeamRelateArray = (ProductTeamRelate[]) willAddProductTeamRelates.toArray(new ProductTeamRelate[willAddProductTeamRelates.size()]);
        ProductTeamRelate[] willDeleteProductTeamRelateArray = (ProductTeamRelate[]) willDeleteProductTeamRelates.toArray(new ProductTeamRelate[willDeleteProductTeamRelates.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddProductTeamRelateArray,
                willUpdateProductTeamRelateArray,
                willDeleteProductTeamRelateArray);
        } // end if

        if (willUpdateProductTeamRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateProductTeamRelateArray);
            } // end if

            this.batchUpdateProductTeamRelate(willUpdateProductTeamRelateArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateProductTeamRelateArray);
            } // end if
        } // end if

        if (willAddProductTeamRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddProductTeamRelateArray);
            } // end if

            this.batchInsertProductTeamRelate(willAddProductTeamRelateArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddProductTeamRelateArray);
            } // end if
        } // end if

        if (willDeleteProductTeamRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteProductTeamRelateArray);
            } // end if

            for (int i = 0; i < willDeleteProductTeamRelateArray.length; i++) {
                ProductTeamRelate object = willDeleteProductTeamRelateArray[i];
                this.deleteProductTeamRelate(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteProductTeamRelateArray);
            } // end if
        } // end if
    } // end synchronizeProductTeamRelate()

    /**
     * Query IProductTeamRelate
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public ProductTeamRelate findProductTeamRelateById(final long aId)
        throws Exception {
        ProductTeamRelateDAOQueryBean queryBean = new ProductTeamRelateDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        ProductTeamRelate[] ProductTeamRelates = queryProductTeamRelate(queryBean);

        if (ProductTeamRelates.length == 0) {
            return null;
        } // end if
        else {
            return ProductTeamRelates[0];
        } // end else
    } // end findProductTeamRelateById()

    /**
     * Query IProductTeamRelate
     *
     * @param queryBean
     *
     * @return IProductTeamRelate[]
     *
     * @throws Exception
     */
    public ProductTeamRelate[] queryProductTeamRelate(
        ProductTeamRelateDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcProductTeamRelateRowMapper());

        return (ProductTeamRelate[]) result.toArray(new ProductTeamRelate[result.size()]);
    } // end queryProductTeamRelate()

    /**
     * Query ProductTeamRelate Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryProductTeamRelateSelective(
        ProductTeamRelateDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryProductTeamRelateSelective()

    /**
     * Query IProductTeamRelate Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryProductTeamRelateCount(
        ProductTeamRelateDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end queryProductTeamRelateCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcProductTeamRelateRowMapper
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
            ProductTeamRelate object = new ProductTeamRelate();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
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

                Object TeamId = resultSet.getObject(columnIndex++);

                object.setTeamIdNull(resultSet.getBoolean(columnIndex++));

                if (TeamId != null) {
                    BeanUtils.setProperty(object, DataProperty.TeamId, TeamId);
                } // end if

                Object TeamName = resultSet.getObject(columnIndex++);

                object.setTeamNameNull(resultSet.getBoolean(columnIndex++));

                if (TeamName != null) {
                    BeanUtils.setProperty(object, DataProperty.TeamName,
                        TeamName);
                } // end if

                Object TeamCode = resultSet.getObject(columnIndex++);

                object.setTeamCodeNull(resultSet.getBoolean(columnIndex++));

                if (TeamCode != null) {
                    BeanUtils.setProperty(object, DataProperty.TeamCode,
                        TeamCode);
                } // end if

                Object TeamMail = resultSet.getObject(columnIndex++);

                object.setTeamMailNull(resultSet.getBoolean(columnIndex++));

                if (TeamMail != null) {
                    BeanUtils.setProperty(object, DataProperty.TeamMail,
                        TeamMail);
                } // end if

                Object TeamStatus = resultSet.getObject(columnIndex++);

                object.setTeamStatusNull(resultSet.getBoolean(columnIndex++));

                if (TeamStatus != null) {
                    BeanUtils.setProperty(object, DataProperty.TeamStatus,
                        TeamStatus);
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

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcProductTeamRelateRowMapper
} // end BaseProductTeamRelateDAOJdbcImpl
