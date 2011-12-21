/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao.impl;

import com.ourteam.modelbase.dao.BusinessTemplateProviderType;
import com.ourteam.modelbase.dao.BusinessTemplateProviderTypeDAOQueryBean;
import com.ourteam.modelbase.dao.IBusinessTemplateProviderTypeDAO;

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
 * DAO JDBC Impl Generate Date : 2011-06-29 21:07:05
 *
 * @author Kylin
 */
abstract public class BaseBusinessTemplateProviderTypeDAOJdbcImpl
    extends AbstractJdbcDAO implements IBusinessTemplateProviderTypeDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, BusinessObjectType, Description, FilePath, ProviderName,
            ProviderType, Status
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.BusinessObjectType,
            DataProperty.Description, DataProperty.FilePath,
            DataProperty.ProviderName, DataProperty.ProviderType,
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
     * Creates a new BaseBusinessTemplateProviderTypeDAOJdbcImpl object.
     */
    public BaseBusinessTemplateProviderTypeDAOJdbcImpl() {
        super();
    } // end BaseBusinessTemplateProviderTypeDAOJdbcImpl()

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
     * Check Unique BusinessTemplateProviderType
     *
     * @param aBusinessTemplateProviderType
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(
        BusinessTemplateProviderType aBusinessTemplateProviderType)
        throws Exception {
        if (aBusinessTemplateProviderType == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(
                aBusinessTemplateProviderType, DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IBusinessTemplateProviderType
     *
     * @param aBusinessTemplateProviderType
     *
     * @throws Exception
     */
    public void insertBusinessTemplateProviderType(
        BusinessTemplateProviderType aBusinessTemplateProviderType)
        throws Exception {
        insert(aBusinessTemplateProviderType);
    } // end insertBusinessTemplateProviderType()

    /**
     * Batch Insert IBusinessTemplateProviderType
     *
     * @param aBusinessTemplateProviderType
     *
     * @throws Exception
     */
    public void batchInsertBusinessTemplateProviderType(
        BusinessTemplateProviderType[] aBusinessTemplateProviderType)
        throws Exception {
        batchInsert(aBusinessTemplateProviderType);
    } // end batchInsertBusinessTemplateProviderType()

    /**
     * Delete IBusinessTemplateProviderType
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteBusinessTemplateProviderType(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteBusinessTemplateProviderType()

    /**
     * Delete IBusinessTemplateProviderType
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteBusinessTemplateProviderType(
        BusinessTemplateProviderTypeDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteBusinessTemplateProviderType()

    /**
     * Update IBusinessTemplateProviderType Selective
     *
     * @param aBusinessTemplateProviderType
     *
     * @throws Exception
     */
    public void updateBusinessTemplateProviderType(
        BusinessTemplateProviderType aBusinessTemplateProviderType)
        throws Exception {
        if (aBusinessTemplateProviderType.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aBusinessTemplateProviderType);

        BusinessTemplateProviderType tempObj = findBusinessTemplateProviderTypeById(aBusinessTemplateProviderType.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aBusinessTemplateProviderType, tempObj);
        } // end if
    } // end updateBusinessTemplateProviderType()

    /**
     * Batch Update IBusinessTemplateProviderType
     *
     * @param aBusinessTemplateProviderType
     *
     * @throws Exception
     */
    public void batchUpdateBusinessTemplateProviderType(
        BusinessTemplateProviderType[] aBusinessTemplateProviderType)
        throws Exception {
        batchUpdate(aBusinessTemplateProviderType);
    } // end batchUpdateBusinessTemplateProviderType()

    /**
     * Update IBusinessTemplateProviderType
     *
     * @param aBusinessTemplateProviderType
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateBusinessTemplateProviderType(
        BusinessTemplateProviderType aBusinessTemplateProviderType,
        BusinessTemplateProviderTypeDAOQueryBean aQueryBean)
        throws Exception {
        updateByQuery(aBusinessTemplateProviderType, aQueryBean);
    } // end updateBusinessTemplateProviderType()

    /**
     * DOCUMENT ME!
     *
     * @param aBusinessTemplateProviderType DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(
        BusinessTemplateProviderType aBusinessTemplateProviderType)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aBusinessTemplateProviderTypes DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBusinessTemplateProviderType(
        BusinessTemplateProviderType[] aBusinessTemplateProviderTypes,
        BusinessTemplateProviderTypeDAOQueryBean aQueryBean)
        throws Exception {
        synchronizeBusinessTemplateProviderType(aBusinessTemplateProviderTypes,
            aQueryBean, null);
    } // end synchronizeBusinessTemplateProviderType()

    /**
     * DOCUMENT ME!
     *
     * @param aBusinessTemplateProviderTypes DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBusinessTemplateProviderType(
        BusinessTemplateProviderType[] aBusinessTemplateProviderTypes,
        BusinessTemplateProviderTypeDAOQueryBean aQueryBean,
        BusinessTemplateProviderTypeSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aBusinessTemplateProviderTypes) == false) {
            inputList.addAll(Arrays.asList(aBusinessTemplateProviderTypes));
        } // end if

        BusinessTemplateProviderType[] existentBusinessTemplateProviderTypes = this.queryBusinessTemplateProviderType(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentBusinessTemplateProviderTypes) == false) {
            existentList.addAll(Arrays.asList(
                    existentBusinessTemplateProviderTypes));
        } // end if

        List willAddBusinessTemplateProviderTypes = ListUtils.subtract(inputList,
                existentList);

        List willDeleteBusinessTemplateProviderTypes = ListUtils.subtract(existentList,
                inputList);

        List willUpdateBusinessTemplateProviderTypes = ListUtils.intersection(existentList,
                inputList);

        BusinessTemplateProviderType[] willUpdateBusinessTemplateProviderTypeArray =
            (BusinessTemplateProviderType[]) willUpdateBusinessTemplateProviderTypes.toArray(new BusinessTemplateProviderType[willUpdateBusinessTemplateProviderTypes.size()]);
        BusinessTemplateProviderType[] willAddBusinessTemplateProviderTypeArray = (BusinessTemplateProviderType[]) willAddBusinessTemplateProviderTypes.toArray(new BusinessTemplateProviderType[willAddBusinessTemplateProviderTypes.size()]);
        BusinessTemplateProviderType[] willDeleteBusinessTemplateProviderTypeArray =
            (BusinessTemplateProviderType[]) willDeleteBusinessTemplateProviderTypes.toArray(new BusinessTemplateProviderType[willDeleteBusinessTemplateProviderTypes.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddBusinessTemplateProviderTypeArray,
                willUpdateBusinessTemplateProviderTypeArray,
                willDeleteBusinessTemplateProviderTypeArray);
        } // end if

        if (willUpdateBusinessTemplateProviderTypes.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateBusinessTemplateProviderTypeArray);
            } // end if

            this.batchUpdateBusinessTemplateProviderType(willUpdateBusinessTemplateProviderTypeArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateBusinessTemplateProviderTypeArray);
            } // end if
        } // end if

        if (willAddBusinessTemplateProviderTypes.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddBusinessTemplateProviderTypeArray);
            } // end if

            this.batchInsertBusinessTemplateProviderType(willAddBusinessTemplateProviderTypeArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddBusinessTemplateProviderTypeArray);
            } // end if
        } // end if

        if (willDeleteBusinessTemplateProviderTypes.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteBusinessTemplateProviderTypeArray);
            } // end if

            for (int i = 0;
                    i < willDeleteBusinessTemplateProviderTypeArray.length;
                    i++) {
                BusinessTemplateProviderType object = willDeleteBusinessTemplateProviderTypeArray[i];
                this.deleteBusinessTemplateProviderType(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteBusinessTemplateProviderTypeArray);
            } // end if
        } // end if
    } // end synchronizeBusinessTemplateProviderType()

    /**
     * Query IBusinessTemplateProviderType
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public BusinessTemplateProviderType findBusinessTemplateProviderTypeById(
        final long aId) throws Exception {
        BusinessTemplateProviderTypeDAOQueryBean queryBean = new BusinessTemplateProviderTypeDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        BusinessTemplateProviderType[] BusinessTemplateProviderTypes = queryBusinessTemplateProviderType(queryBean);

        if (BusinessTemplateProviderTypes.length == 0) {
            return null;
        } // end if
        else {
            return BusinessTemplateProviderTypes[0];
        } // end else
    } // end findBusinessTemplateProviderTypeById()

    /**
     * Query IBusinessTemplateProviderType
     *
     * @param queryBean
     *
     * @return IBusinessTemplateProviderType[]
     *
     * @throws Exception
     */
    public BusinessTemplateProviderType[] queryBusinessTemplateProviderType(
        BusinessTemplateProviderTypeDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean,
                new JdbcBusinessTemplateProviderTypeRowMapper());

        return (BusinessTemplateProviderType[]) result.toArray(new BusinessTemplateProviderType[result.size()]);
    } // end queryBusinessTemplateProviderType()

    /**
     * Query BusinessTemplateProviderType Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryBusinessTemplateProviderTypeSelective(
        BusinessTemplateProviderTypeDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryBusinessTemplateProviderTypeSelective()

    /**
     * Query IBusinessTemplateProviderType Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryBusinessTemplateProviderTypeCount(
        BusinessTemplateProviderTypeDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryBusinessTemplateProviderTypeCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcBusinessTemplateProviderTypeRowMapper
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
            BusinessTemplateProviderType object = new BusinessTemplateProviderType();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object BusinessObjectType = resultSet.getObject(columnIndex++);

                object.setBusinessObjectTypeNull(resultSet.getBoolean(
                        columnIndex++));

                if (BusinessObjectType != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.BusinessObjectType, BusinessObjectType);
                } // end if

                Object Description = resultSet.getObject(columnIndex++);

                object.setDescriptionNull(resultSet.getBoolean(columnIndex++));

                if (Description != null) {
                    BeanUtils.setProperty(object, DataProperty.Description,
                        Description);
                } // end if

                Object FilePath = resultSet.getObject(columnIndex++);

                object.setFilePathNull(resultSet.getBoolean(columnIndex++));

                if (FilePath != null) {
                    BeanUtils.setProperty(object, DataProperty.FilePath,
                        FilePath);
                } // end if

                Object ProviderName = resultSet.getObject(columnIndex++);

                object.setProviderNameNull(resultSet.getBoolean(columnIndex++));

                if (ProviderName != null) {
                    BeanUtils.setProperty(object, DataProperty.ProviderName,
                        ProviderName);
                } // end if

                Object ProviderType = resultSet.getObject(columnIndex++);

                object.setProviderTypeNull(resultSet.getBoolean(columnIndex++));

                if (ProviderType != null) {
                    BeanUtils.setProperty(object, DataProperty.ProviderType,
                        ProviderType);
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
    } // end JdbcBusinessTemplateProviderTypeRowMapper
} // end BaseBusinessTemplateProviderTypeDAOJdbcImpl
