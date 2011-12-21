/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao.impl;

import com.ourteam.system.dao.ISysDomainDAO;
import com.ourteam.system.dao.SysDomain;
import com.ourteam.system.dao.SysDomainDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-11-29 09:08:10
 *
 * @author kylin
 */
abstract public class BaseSysDomainDAOJdbcImpl extends AbstractJdbcDAO
    implements ISysDomainDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, DomainCode, DomainIcon, DomainName, DomainTitelKey, Remarks,
            SortIndex, Status, DomainShortName, DomainSmallIcon
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.DomainCode, DataProperty.DomainIcon,
            DataProperty.DomainName, DataProperty.DomainTitelKey,
            DataProperty.Remarks, DataProperty.SortIndex, DataProperty.Status,
            DataProperty.DomainShortName, DataProperty.DomainSmallIcon
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
    public static final String[] ENTITY_UNIQUE_FIELDS = new String[] { DomainCode };

    /**
     * DOCUMENT ME!
     */
    private static String relatedJoinSQL = null;

    /**
     * DOCUMENT ME!
     */
    private static String basicFilterSQL = null;

    /**
     * Creates a new BaseSysDomainDAOJdbcImpl object.
     */
    public BaseSysDomainDAOJdbcImpl() {
        super();
    } // end BaseSysDomainDAOJdbcImpl()

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
     * Check Unique SysDomain
     *
     * @param aSysDomain
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(SysDomain aSysDomain)
        throws Exception {
        if (aSysDomain == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aSysDomain, DataProperty.Id));

        valueList.add(PropertyUtils.getProperty(aSysDomain,
                DataProperty.DomainCode));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert ISysDomain
     *
     * @param aSysDomain
     *
     * @throws Exception
     */
    public void insertSysDomain(SysDomain aSysDomain) throws Exception {
        checkNullValue(aSysDomain);

        insert(aSysDomain);
    } // end insertSysDomain()

    /**
     * Batch Insert ISysDomain
     *
     * @param aSysDomain
     *
     * @throws Exception
     */
    public void batchInsertSysDomain(SysDomain[] aSysDomain)
        throws Exception {
        batchInsert(aSysDomain);
    } // end batchInsertSysDomain()

    /**
     * Delete ISysDomain
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteSysDomain(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteSysDomain()

    /**
     * Delete ISysDomain
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteSysDomain(SysDomainDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteSysDomain()

    /**
     * Update ISysDomain Selective
     *
     * @param aSysDomain
     *
     * @throws Exception
     */
    public void updateSysDomain(SysDomain aSysDomain) throws Exception {
        if (aSysDomain.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aSysDomain);

        SysDomain tempObj = findSysDomainById(aSysDomain.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aSysDomain, tempObj);
        } // end if
    } // end updateSysDomain()

    /**
     * Batch Update ISysDomain
     *
     * @param aSysDomain
     *
     * @throws Exception
     */
    public void batchUpdateSysDomain(SysDomain[] aSysDomain)
        throws Exception {
        batchUpdate(aSysDomain);
    } // end batchUpdateSysDomain()

    /**
     * Update ISysDomain
     *
     * @param aSysDomain
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateSysDomain(SysDomain aSysDomain,
        SysDomainDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aSysDomain, aQueryBean);
    } // end updateSysDomain()

    /**
     * DOCUMENT ME!
     *
     * @param aSysDomain DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(SysDomain aSysDomain)
        throws Exception {
        if (aSysDomain.getDomainCode() == null) {
            throw new Exception(
                "The SysDomain.domainCode value is not allow NULL");
        } // end if

        if (aSysDomain.getDomainName() == null) {
            throw new Exception(
                "The SysDomain.domainName value is not allow NULL");
        } // end if
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aSysDomains DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysDomain(SysDomain[] aSysDomains,
        SysDomainDAOQueryBean aQueryBean) throws Exception {
        synchronizeSysDomain(aSysDomains, aQueryBean, null);
    } // end synchronizeSysDomain()

    /**
     * DOCUMENT ME!
     *
     * @param aSysDomains DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysDomain(SysDomain[] aSysDomains,
        SysDomainDAOQueryBean aQueryBean, SysDomainSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aSysDomains) == false) {
            inputList.addAll(Arrays.asList(aSysDomains));
        } // end if

        SysDomain[] existentSysDomains = this.querySysDomain(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentSysDomains) == false) {
            existentList.addAll(Arrays.asList(existentSysDomains));
        } // end if

        List willAddSysDomains = ListUtils.subtract(inputList, existentList);

        List willDeleteSysDomains = ListUtils.subtract(existentList, inputList);

        List willUpdateSysDomains = ListUtils.intersection(existentList,
                inputList);

        SysDomain[] willUpdateSysDomainArray = (SysDomain[]) willUpdateSysDomains.toArray(new SysDomain[willUpdateSysDomains.size()]);
        SysDomain[] willAddSysDomainArray = (SysDomain[]) willAddSysDomains.toArray(new SysDomain[willAddSysDomains.size()]);
        SysDomain[] willDeleteSysDomainArray = (SysDomain[]) willDeleteSysDomains.toArray(new SysDomain[willDeleteSysDomains.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddSysDomainArray,
                willUpdateSysDomainArray, willDeleteSysDomainArray);
        } // end if

        if (willUpdateSysDomains.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateSysDomainArray);
            } // end if

            this.batchUpdateSysDomain(willUpdateSysDomainArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateSysDomainArray);
            } // end if
        } // end if

        if (willAddSysDomains.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddSysDomainArray);
            } // end if

            this.batchInsertSysDomain(willAddSysDomainArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddSysDomainArray);
            } // end if
        } // end if

        if (willDeleteSysDomains.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteSysDomainArray);
            } // end if

            for (int i = 0; i < willDeleteSysDomainArray.length; i++) {
                SysDomain object = willDeleteSysDomainArray[i];
                this.deleteSysDomain(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteSysDomainArray);
            } // end if
        } // end if
    } // end synchronizeSysDomain()

    /**
     * Query ISysDomain
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public SysDomain findSysDomainById(final long aId)
        throws Exception {
        SysDomainDAOQueryBean queryBean = new SysDomainDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        SysDomain[] SysDomains = querySysDomain(queryBean);

        if (SysDomains.length == 0) {
            return null;
        } // end if
        else {
            return SysDomains[0];
        } // end else
    } // end findSysDomainById()

    /**
     * Query ISysDomain
     *
     * @param queryBean
     *
     * @return ISysDomain[]
     *
     * @throws Exception
     */
    public SysDomain[] querySysDomain(SysDomainDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean, new JdbcSysDomainRowMapper());

        return (SysDomain[]) result.toArray(new SysDomain[result.size()]);
    } // end querySysDomain()

    /**
     * Query SysDomain Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] querySysDomainSelective(SysDomainDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end querySysDomainSelective()

    /**
     * Query ISysDomain Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int querySysDomainCount(SysDomainDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end querySysDomainCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcSysDomainRowMapper implements ParameterizedRowMapper {
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
            SysDomain object = new SysDomain();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object DomainCode = resultSet.getObject(columnIndex++);

                object.setDomainCodeNull(resultSet.getBoolean(columnIndex++));

                if (DomainCode != null) {
                    BeanUtils.setProperty(object, DataProperty.DomainCode,
                        DomainCode);
                } // end if

                Object DomainIcon = resultSet.getObject(columnIndex++);

                object.setDomainIconNull(resultSet.getBoolean(columnIndex++));

                if (DomainIcon != null) {
                    BeanUtils.setProperty(object, DataProperty.DomainIcon,
                        DomainIcon);
                } // end if

                Object DomainName = resultSet.getObject(columnIndex++);

                object.setDomainNameNull(resultSet.getBoolean(columnIndex++));

                if (DomainName != null) {
                    BeanUtils.setProperty(object, DataProperty.DomainName,
                        DomainName);
                } // end if

                Object DomainTitelKey = resultSet.getObject(columnIndex++);

                object.setDomainTitelKeyNull(resultSet.getBoolean(columnIndex++));

                if (DomainTitelKey != null) {
                    BeanUtils.setProperty(object, DataProperty.DomainTitelKey,
                        DomainTitelKey);
                } // end if

                Object Remarks = resultSet.getObject(columnIndex++);

                object.setRemarksNull(resultSet.getBoolean(columnIndex++));

                if (Remarks != null) {
                    BeanUtils.setProperty(object, DataProperty.Remarks, Remarks);
                } // end if

                Object SortIndex = resultSet.getObject(columnIndex++);

                object.setSortIndexNull(resultSet.getBoolean(columnIndex++));

                if (SortIndex != null) {
                    BeanUtils.setProperty(object, DataProperty.SortIndex,
                        SortIndex);
                } // end if

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object DomainShortName = resultSet.getObject(columnIndex++);

                object.setDomainShortNameNull(resultSet.getBoolean(
                        columnIndex++));

                if (DomainShortName != null) {
                    BeanUtils.setProperty(object, DataProperty.DomainShortName,
                        DomainShortName);
                } // end if

                Object DomainSmallIcon = resultSet.getObject(columnIndex++);

                object.setDomainSmallIconNull(resultSet.getBoolean(
                        columnIndex++));

                if (DomainSmallIcon != null) {
                    BeanUtils.setProperty(object, DataProperty.DomainSmallIcon,
                        DomainSmallIcon);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcSysDomainRowMapper
} // end BaseSysDomainDAOJdbcImpl
