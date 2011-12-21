/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao.impl;

import com.ourteam.bpm.dao.BpmDomain;
import com.ourteam.bpm.dao.BpmDomainDAOQueryBean;
import com.ourteam.bpm.dao.IBpmDomainDAO;

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
 * DAO JDBC Impl Generate Date : 2011-11-01 13:20:48
 *
 * @author kylin
 */
abstract public class BaseBpmDomainDAOJdbcImpl extends AbstractJdbcDAO
    implements IBpmDomainDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, Code, Name, Remarks, Status
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.Code, DataProperty.Name,
            DataProperty.Remarks, DataProperty.Status
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
     * Creates a new BaseBpmDomainDAOJdbcImpl object.
     */
    public BaseBpmDomainDAOJdbcImpl() {
        super();
    } // end BaseBpmDomainDAOJdbcImpl()

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
     * Check Unique BpmDomain
     *
     * @param aBpmDomain
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(BpmDomain aBpmDomain)
        throws Exception {
        if (aBpmDomain == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aBpmDomain, DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IBpmDomain
     *
     * @param aBpmDomain
     *
     * @throws Exception
     */
    public void insertBpmDomain(BpmDomain aBpmDomain) throws Exception {
        insert(aBpmDomain);
    } // end insertBpmDomain()

    /**
     * Batch Insert IBpmDomain
     *
     * @param aBpmDomain
     *
     * @throws Exception
     */
    public void batchInsertBpmDomain(BpmDomain[] aBpmDomain)
        throws Exception {
        batchInsert(aBpmDomain);
    } // end batchInsertBpmDomain()

    /**
     * Delete IBpmDomain
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteBpmDomain(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteBpmDomain()

    /**
     * Delete IBpmDomain
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteBpmDomain(BpmDomainDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteBpmDomain()

    /**
     * Update IBpmDomain Selective
     *
     * @param aBpmDomain
     *
     * @throws Exception
     */
    public void updateBpmDomain(BpmDomain aBpmDomain) throws Exception {
        if (aBpmDomain.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aBpmDomain);

        BpmDomain tempObj = findBpmDomainById(aBpmDomain.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aBpmDomain, tempObj);
        } // end if
    } // end updateBpmDomain()

    /**
     * Batch Update IBpmDomain
     *
     * @param aBpmDomain
     *
     * @throws Exception
     */
    public void batchUpdateBpmDomain(BpmDomain[] aBpmDomain)
        throws Exception {
        batchUpdate(aBpmDomain);
    } // end batchUpdateBpmDomain()

    /**
     * Update IBpmDomain
     *
     * @param aBpmDomain
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateBpmDomain(BpmDomain aBpmDomain,
        BpmDomainDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aBpmDomain, aQueryBean);
    } // end updateBpmDomain()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmDomain DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(BpmDomain aBpmDomain)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmDomains DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmDomain(BpmDomain[] aBpmDomains,
        BpmDomainDAOQueryBean aQueryBean) throws Exception {
        synchronizeBpmDomain(aBpmDomains, aQueryBean, null);
    } // end synchronizeBpmDomain()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmDomains DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmDomain(BpmDomain[] aBpmDomains,
        BpmDomainDAOQueryBean aQueryBean, BpmDomainSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aBpmDomains) == false) {
            inputList.addAll(Arrays.asList(aBpmDomains));
        } // end if

        BpmDomain[] existentBpmDomains = this.queryBpmDomain(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentBpmDomains) == false) {
            existentList.addAll(Arrays.asList(existentBpmDomains));
        } // end if

        List willAddBpmDomains = ListUtils.subtract(inputList, existentList);

        List willDeleteBpmDomains = ListUtils.subtract(existentList, inputList);

        List willUpdateBpmDomains = ListUtils.intersection(existentList,
                inputList);

        BpmDomain[] willUpdateBpmDomainArray = (BpmDomain[]) willUpdateBpmDomains.toArray(new BpmDomain[willUpdateBpmDomains.size()]);
        BpmDomain[] willAddBpmDomainArray = (BpmDomain[]) willAddBpmDomains.toArray(new BpmDomain[willAddBpmDomains.size()]);
        BpmDomain[] willDeleteBpmDomainArray = (BpmDomain[]) willDeleteBpmDomains.toArray(new BpmDomain[willDeleteBpmDomains.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddBpmDomainArray,
                willUpdateBpmDomainArray, willDeleteBpmDomainArray);
        } // end if

        if (willUpdateBpmDomains.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateBpmDomainArray);
            } // end if

            this.batchUpdateBpmDomain(willUpdateBpmDomainArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateBpmDomainArray);
            } // end if
        } // end if

        if (willAddBpmDomains.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddBpmDomainArray);
            } // end if

            this.batchInsertBpmDomain(willAddBpmDomainArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddBpmDomainArray);
            } // end if
        } // end if

        if (willDeleteBpmDomains.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteBpmDomainArray);
            } // end if

            for (int i = 0; i < willDeleteBpmDomainArray.length; i++) {
                BpmDomain object = willDeleteBpmDomainArray[i];
                this.deleteBpmDomain(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteBpmDomainArray);
            } // end if
        } // end if
    } // end synchronizeBpmDomain()

    /**
     * Query IBpmDomain
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public BpmDomain findBpmDomainById(final long aId)
        throws Exception {
        BpmDomainDAOQueryBean queryBean = new BpmDomainDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        BpmDomain[] BpmDomains = queryBpmDomain(queryBean);

        if (BpmDomains.length == 0) {
            return null;
        } // end if
        else {
            return BpmDomains[0];
        } // end else
    } // end findBpmDomainById()

    /**
     * Query IBpmDomain
     *
     * @param queryBean
     *
     * @return IBpmDomain[]
     *
     * @throws Exception
     */
    public BpmDomain[] queryBpmDomain(BpmDomainDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean, new JdbcBpmDomainRowMapper());

        return (BpmDomain[]) result.toArray(new BpmDomain[result.size()]);
    } // end queryBpmDomain()

    /**
     * Query BpmDomain Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryBpmDomainSelective(BpmDomainDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryBpmDomainSelective()

    /**
     * Query IBpmDomain Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryBpmDomainCount(BpmDomainDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryBpmDomainCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcBpmDomainRowMapper implements ParameterizedRowMapper {
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
            BpmDomain object = new BpmDomain();

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

                Object Name = resultSet.getObject(columnIndex++);

                object.setNameNull(resultSet.getBoolean(columnIndex++));

                if (Name != null) {
                    BeanUtils.setProperty(object, DataProperty.Name, Name);
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
    } // end JdbcBpmDomainRowMapper
} // end BaseBpmDomainDAOJdbcImpl
