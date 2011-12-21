/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao.impl;

import com.ourteam.modelbase.dao.BusinessPackage;
import com.ourteam.modelbase.dao.BusinessPackageDAOQueryBean;
import com.ourteam.modelbase.dao.IBusinessPackageDAO;

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
 * 业务对象包 DAO JDBC Impl Generate Date : 2011-06-29 21:07:05
 *
 * @author Kylin
 */
abstract public class BaseBusinessPackageDAOJdbcImpl extends AbstractJdbcDAO
    implements IBusinessPackageDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            BusinessPackageId, BusinessDomainId, Description, Name,
            ParentPackageId, State, Type
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.BusinessPackageId, DataProperty.BusinessDomainId,
            DataProperty.Description, DataProperty.Name,
            DataProperty.ParentPackageId, DataProperty.State, DataProperty.Type
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PK_FIELDS = new String[] {
            BusinessPackageId
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_AUTO_GEN_PK_FIELDS = new String[] {
            BusinessPackageId
        };

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
     * Creates a new BaseBusinessPackageDAOJdbcImpl object.
     */
    public BaseBusinessPackageDAOJdbcImpl() {
        super();
    } // end BaseBusinessPackageDAOJdbcImpl()

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
     * Check Unique BusinessPackage
     *
     * @param aBusinessPackage
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(BusinessPackage aBusinessPackage)
        throws Exception {
        if (aBusinessPackage == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aBusinessPackage,
                DataProperty.BusinessPackageId));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IBusinessPackage
     *
     * @param aBusinessPackage
     *
     * @throws Exception
     */
    public void insertBusinessPackage(BusinessPackage aBusinessPackage)
        throws Exception {
        checkNullValue(aBusinessPackage);

        insert(aBusinessPackage);
    } // end insertBusinessPackage()

    /**
     * Batch Insert IBusinessPackage
     *
     * @param aBusinessPackage
     *
     * @throws Exception
     */
    public void batchInsertBusinessPackage(BusinessPackage[] aBusinessPackage)
        throws Exception {
        batchInsert(aBusinessPackage);
    } // end batchInsertBusinessPackage()

    /**
     * Delete IBusinessPackage
     *
     * @param aBusinessPackageId long aBusinessPackageId
     *
     * @throws Exception
     */
    public void deleteBusinessPackage(final long aBusinessPackageId)
        throws Exception {
        deleteById(new Object[] { new Long(aBusinessPackageId) });
    } // end deleteBusinessPackage()

    /**
     * Delete IBusinessPackage
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteBusinessPackage(BusinessPackageDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteBusinessPackage()

    /**
     * Update IBusinessPackage Selective
     *
     * @param aBusinessPackage
     *
     * @throws Exception
     */
    public void updateBusinessPackage(BusinessPackage aBusinessPackage)
        throws Exception {
        if (aBusinessPackage.getBusinessPackageId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aBusinessPackage);

        BusinessPackage tempObj = findBusinessPackageById(aBusinessPackage.getBusinessPackageId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aBusinessPackage, tempObj);
        } // end if
    } // end updateBusinessPackage()

    /**
     * Batch Update IBusinessPackage
     *
     * @param aBusinessPackage
     *
     * @throws Exception
     */
    public void batchUpdateBusinessPackage(BusinessPackage[] aBusinessPackage)
        throws Exception {
        batchUpdate(aBusinessPackage);
    } // end batchUpdateBusinessPackage()

    /**
     * Update IBusinessPackage
     *
     * @param aBusinessPackage
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateBusinessPackage(BusinessPackage aBusinessPackage,
        BusinessPackageDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aBusinessPackage, aQueryBean);
    } // end updateBusinessPackage()

    /**
     * DOCUMENT ME!
     *
     * @param aBusinessPackage DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(BusinessPackage aBusinessPackage)
        throws Exception {
        if (aBusinessPackage.getType() == null) {
            throw new Exception(
                "The BusinessPackage.type value is not allow NULL");
        } // end if
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aBusinessPackages DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBusinessPackage(
        BusinessPackage[] aBusinessPackages,
        BusinessPackageDAOQueryBean aQueryBean) throws Exception {
        synchronizeBusinessPackage(aBusinessPackages, aQueryBean, null);
    } // end synchronizeBusinessPackage()

    /**
     * DOCUMENT ME!
     *
     * @param aBusinessPackages DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBusinessPackage(
        BusinessPackage[] aBusinessPackages,
        BusinessPackageDAOQueryBean aQueryBean,
        BusinessPackageSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aBusinessPackages) == false) {
            inputList.addAll(Arrays.asList(aBusinessPackages));
        } // end if

        BusinessPackage[] existentBusinessPackages = this.queryBusinessPackage(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentBusinessPackages) == false) {
            existentList.addAll(Arrays.asList(existentBusinessPackages));
        } // end if

        List willAddBusinessPackages = ListUtils.subtract(inputList,
                existentList);

        List willDeleteBusinessPackages = ListUtils.subtract(existentList,
                inputList);

        List willUpdateBusinessPackages = ListUtils.intersection(existentList,
                inputList);

        BusinessPackage[] willUpdateBusinessPackageArray = (BusinessPackage[]) willUpdateBusinessPackages.toArray(new BusinessPackage[willUpdateBusinessPackages.size()]);
        BusinessPackage[] willAddBusinessPackageArray = (BusinessPackage[]) willAddBusinessPackages.toArray(new BusinessPackage[willAddBusinessPackages.size()]);
        BusinessPackage[] willDeleteBusinessPackageArray = (BusinessPackage[]) willDeleteBusinessPackages.toArray(new BusinessPackage[willDeleteBusinessPackages.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddBusinessPackageArray,
                willUpdateBusinessPackageArray, willDeleteBusinessPackageArray);
        } // end if

        if (willUpdateBusinessPackages.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateBusinessPackageArray);
            } // end if

            this.batchUpdateBusinessPackage(willUpdateBusinessPackageArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateBusinessPackageArray);
            } // end if
        } // end if

        if (willAddBusinessPackages.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddBusinessPackageArray);
            } // end if

            this.batchInsertBusinessPackage(willAddBusinessPackageArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddBusinessPackageArray);
            } // end if
        } // end if

        if (willDeleteBusinessPackages.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteBusinessPackageArray);
            } // end if

            for (int i = 0; i < willDeleteBusinessPackageArray.length; i++) {
                BusinessPackage object = willDeleteBusinessPackageArray[i];
                this.deleteBusinessPackage(object.getBusinessPackageId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteBusinessPackageArray);
            } // end if
        } // end if
    } // end synchronizeBusinessPackage()

    /**
     * Query IBusinessPackage
     *
     * @param aBusinessPackageId long aBusinessPackageId
     *
     * @return
     *
     * @throws Exception
     */
    public BusinessPackage findBusinessPackageById(
        final long aBusinessPackageId) throws Exception {
        BusinessPackageDAOQueryBean queryBean = new BusinessPackageDAOQueryBean();

        queryBean.createCriteria()
                 .andBusinessPackageIdEqualTo(new java.lang.Long(
                aBusinessPackageId));

        queryBean.setDistinct(true);

        BusinessPackage[] BusinessPackages = queryBusinessPackage(queryBean);

        if (BusinessPackages.length == 0) {
            return null;
        } // end if
        else {
            return BusinessPackages[0];
        } // end else
    } // end findBusinessPackageById()

    /**
     * Query IBusinessPackage
     *
     * @param queryBean
     *
     * @return IBusinessPackage[]
     *
     * @throws Exception
     */
    public BusinessPackage[] queryBusinessPackage(
        BusinessPackageDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcBusinessPackageRowMapper());

        return (BusinessPackage[]) result.toArray(new BusinessPackage[result.size()]);
    } // end queryBusinessPackage()

    /**
     * Query BusinessPackage Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryBusinessPackageSelective(
        BusinessPackageDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryBusinessPackageSelective()

    /**
     * Query IBusinessPackage Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryBusinessPackageCount(BusinessPackageDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryBusinessPackageCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcBusinessPackageRowMapper
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
            BusinessPackage object = new BusinessPackage();

            int columnIndex = 1;

            try {
                Object BusinessPackageId = resultSet.getObject(columnIndex++);

                object.setBusinessPackageIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (BusinessPackageId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.BusinessPackageId, BusinessPackageId);
                } // end if

                Object BusinessDomainId = resultSet.getObject(columnIndex++);

                object.setBusinessDomainIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (BusinessDomainId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.BusinessDomainId, BusinessDomainId);
                } // end if

                Object Description = resultSet.getObject(columnIndex++);

                object.setDescriptionNull(resultSet.getBoolean(columnIndex++));

                if (Description != null) {
                    BeanUtils.setProperty(object, DataProperty.Description,
                        Description);
                } // end if

                Object Name = resultSet.getObject(columnIndex++);

                object.setNameNull(resultSet.getBoolean(columnIndex++));

                if (Name != null) {
                    BeanUtils.setProperty(object, DataProperty.Name, Name);
                } // end if

                Object ParentPackageId = resultSet.getObject(columnIndex++);

                object.setParentPackageIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (ParentPackageId != null) {
                    BeanUtils.setProperty(object, DataProperty.ParentPackageId,
                        ParentPackageId);
                } // end if

                Object State = resultSet.getObject(columnIndex++);

                object.setStateNull(resultSet.getBoolean(columnIndex++));

                if (State != null) {
                    BeanUtils.setProperty(object, DataProperty.State, State);
                } // end if

                Object Type = resultSet.getObject(columnIndex++);

                object.setTypeNull(resultSet.getBoolean(columnIndex++));

                if (Type != null) {
                    BeanUtils.setProperty(object, DataProperty.Type, Type);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcBusinessPackageRowMapper
} // end BaseBusinessPackageDAOJdbcImpl
