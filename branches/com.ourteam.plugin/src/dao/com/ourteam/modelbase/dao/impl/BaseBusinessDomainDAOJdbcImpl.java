/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao.impl;

import com.ourteam.modelbase.dao.BusinessDomain;
import com.ourteam.modelbase.dao.BusinessDomainDAOQueryBean;
import com.ourteam.modelbase.dao.IBusinessDomainDAO;

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
 * “µŒÒ¡Ï”Ú DAO JDBC Impl Generate Date : 2011-06-29 21:07:04
 *
 * @author Kylin
 */
abstract public class BaseBusinessDomainDAOJdbcImpl extends AbstractJdbcDAO
    implements IBusinessDomainDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            BusinessDomainId, Code, Description, Name
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.BusinessDomainId, DataProperty.Code,
            DataProperty.Description, DataProperty.Name
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PK_FIELDS = new String[] {
            BusinessDomainId
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_AUTO_GEN_PK_FIELDS = new String[] {
            BusinessDomainId
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
     * Creates a new BaseBusinessDomainDAOJdbcImpl object.
     */
    public BaseBusinessDomainDAOJdbcImpl() {
        super();
    } // end BaseBusinessDomainDAOJdbcImpl()

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
     * Check Unique BusinessDomain
     *
     * @param aBusinessDomain
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(BusinessDomain aBusinessDomain)
        throws Exception {
        if (aBusinessDomain == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aBusinessDomain,
                DataProperty.BusinessDomainId));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IBusinessDomain
     *
     * @param aBusinessDomain
     *
     * @throws Exception
     */
    public void insertBusinessDomain(BusinessDomain aBusinessDomain)
        throws Exception {
        insert(aBusinessDomain);
    } // end insertBusinessDomain()

    /**
     * Batch Insert IBusinessDomain
     *
     * @param aBusinessDomain
     *
     * @throws Exception
     */
    public void batchInsertBusinessDomain(BusinessDomain[] aBusinessDomain)
        throws Exception {
        batchInsert(aBusinessDomain);
    } // end batchInsertBusinessDomain()

    /**
     * Delete IBusinessDomain
     *
     * @param aBusinessDomainId long aBusinessDomainId
     *
     * @throws Exception
     */
    public void deleteBusinessDomain(final long aBusinessDomainId)
        throws Exception {
        deleteById(new Object[] { new Long(aBusinessDomainId) });
    } // end deleteBusinessDomain()

    /**
     * Delete IBusinessDomain
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteBusinessDomain(BusinessDomainDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteBusinessDomain()

    /**
     * Update IBusinessDomain Selective
     *
     * @param aBusinessDomain
     *
     * @throws Exception
     */
    public void updateBusinessDomain(BusinessDomain aBusinessDomain)
        throws Exception {
        if (aBusinessDomain.getBusinessDomainId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aBusinessDomain);

        BusinessDomain tempObj = findBusinessDomainById(aBusinessDomain.getBusinessDomainId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aBusinessDomain, tempObj);
        } // end if
    } // end updateBusinessDomain()

    /**
     * Batch Update IBusinessDomain
     *
     * @param aBusinessDomain
     *
     * @throws Exception
     */
    public void batchUpdateBusinessDomain(BusinessDomain[] aBusinessDomain)
        throws Exception {
        batchUpdate(aBusinessDomain);
    } // end batchUpdateBusinessDomain()

    /**
     * Update IBusinessDomain
     *
     * @param aBusinessDomain
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateBusinessDomain(BusinessDomain aBusinessDomain,
        BusinessDomainDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aBusinessDomain, aQueryBean);
    } // end updateBusinessDomain()

    /**
     * DOCUMENT ME!
     *
     * @param aBusinessDomain DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(BusinessDomain aBusinessDomain)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aBusinessDomains DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBusinessDomain(BusinessDomain[] aBusinessDomains,
        BusinessDomainDAOQueryBean aQueryBean) throws Exception {
        synchronizeBusinessDomain(aBusinessDomains, aQueryBean, null);
    } // end synchronizeBusinessDomain()

    /**
     * DOCUMENT ME!
     *
     * @param aBusinessDomains DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBusinessDomain(BusinessDomain[] aBusinessDomains,
        BusinessDomainDAOQueryBean aQueryBean,
        BusinessDomainSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aBusinessDomains) == false) {
            inputList.addAll(Arrays.asList(aBusinessDomains));
        } // end if

        BusinessDomain[] existentBusinessDomains = this.queryBusinessDomain(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentBusinessDomains) == false) {
            existentList.addAll(Arrays.asList(existentBusinessDomains));
        } // end if

        List willAddBusinessDomains = ListUtils.subtract(inputList, existentList);

        List willDeleteBusinessDomains = ListUtils.subtract(existentList,
                inputList);

        List willUpdateBusinessDomains = ListUtils.intersection(existentList,
                inputList);

        BusinessDomain[] willUpdateBusinessDomainArray = (BusinessDomain[]) willUpdateBusinessDomains.toArray(new BusinessDomain[willUpdateBusinessDomains.size()]);
        BusinessDomain[] willAddBusinessDomainArray = (BusinessDomain[]) willAddBusinessDomains.toArray(new BusinessDomain[willAddBusinessDomains.size()]);
        BusinessDomain[] willDeleteBusinessDomainArray = (BusinessDomain[]) willDeleteBusinessDomains.toArray(new BusinessDomain[willDeleteBusinessDomains.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddBusinessDomainArray,
                willUpdateBusinessDomainArray, willDeleteBusinessDomainArray);
        } // end if

        if (willUpdateBusinessDomains.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateBusinessDomainArray);
            } // end if

            this.batchUpdateBusinessDomain(willUpdateBusinessDomainArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateBusinessDomainArray);
            } // end if
        } // end if

        if (willAddBusinessDomains.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddBusinessDomainArray);
            } // end if

            this.batchInsertBusinessDomain(willAddBusinessDomainArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddBusinessDomainArray);
            } // end if
        } // end if

        if (willDeleteBusinessDomains.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteBusinessDomainArray);
            } // end if

            for (int i = 0; i < willDeleteBusinessDomainArray.length; i++) {
                BusinessDomain object = willDeleteBusinessDomainArray[i];
                this.deleteBusinessDomain(object.getBusinessDomainId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteBusinessDomainArray);
            } // end if
        } // end if
    } // end synchronizeBusinessDomain()

    /**
     * Query IBusinessDomain
     *
     * @param aBusinessDomainId long aBusinessDomainId
     *
     * @return
     *
     * @throws Exception
     */
    public BusinessDomain findBusinessDomainById(final long aBusinessDomainId)
        throws Exception {
        BusinessDomainDAOQueryBean queryBean = new BusinessDomainDAOQueryBean();

        queryBean.createCriteria()
                 .andBusinessDomainIdEqualTo(new java.lang.Long(
                aBusinessDomainId));

        queryBean.setDistinct(true);

        BusinessDomain[] BusinessDomains = queryBusinessDomain(queryBean);

        if (BusinessDomains.length == 0) {
            return null;
        } // end if
        else {
            return BusinessDomains[0];
        } // end else
    } // end findBusinessDomainById()

    /**
     * Query IBusinessDomain
     *
     * @param queryBean
     *
     * @return IBusinessDomain[]
     *
     * @throws Exception
     */
    public BusinessDomain[] queryBusinessDomain(
        BusinessDomainDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcBusinessDomainRowMapper());

        return (BusinessDomain[]) result.toArray(new BusinessDomain[result.size()]);
    } // end queryBusinessDomain()

    /**
     * Query BusinessDomain Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryBusinessDomainSelective(
        BusinessDomainDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryBusinessDomainSelective()

    /**
     * Query IBusinessDomain Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryBusinessDomainCount(BusinessDomainDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryBusinessDomainCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcBusinessDomainRowMapper
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
            BusinessDomain object = new BusinessDomain();

            int columnIndex = 1;

            try {
                Object BusinessDomainId = resultSet.getObject(columnIndex++);

                object.setBusinessDomainIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (BusinessDomainId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.BusinessDomainId, BusinessDomainId);
                } // end if

                Object Code = resultSet.getObject(columnIndex++);

                object.setCodeNull(resultSet.getBoolean(columnIndex++));

                if (Code != null) {
                    BeanUtils.setProperty(object, DataProperty.Code, Code);
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

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcBusinessDomainRowMapper
} // end BaseBusinessDomainDAOJdbcImpl
