/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.dao.impl;

import com.ourteam.middleware.dao.IMiddleWareProviderDAO;
import com.ourteam.middleware.dao.MiddleWareProvider;
import com.ourteam.middleware.dao.MiddleWareProviderDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-12-06 11:43:46
 *
 * @author kylin
 */
abstract public class BaseMiddleWareProviderDAOJdbcImpl extends AbstractJdbcDAO
    implements IMiddleWareProviderDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, DriverType, MiddleWareName, MiddleWareType, MiddleWareVersion,
            ProviderName, Remarks, Status
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.DriverType,
            DataProperty.MiddleWareName, DataProperty.MiddleWareType,
            DataProperty.MiddleWareVersion, DataProperty.ProviderName,
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
     * Creates a new BaseMiddleWareProviderDAOJdbcImpl object.
     */
    public BaseMiddleWareProviderDAOJdbcImpl() {
        super();
    } // end BaseMiddleWareProviderDAOJdbcImpl()

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
     * Check Unique MiddleWareProvider
     *
     * @param aMiddleWareProvider
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(MiddleWareProvider aMiddleWareProvider)
        throws Exception {
        if (aMiddleWareProvider == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aMiddleWareProvider,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IMiddleWareProvider
     *
     * @param aMiddleWareProvider
     *
     * @throws Exception
     */
    public void insertMiddleWareProvider(MiddleWareProvider aMiddleWareProvider)
        throws Exception {
        insert(aMiddleWareProvider);
    } // end insertMiddleWareProvider()

    /**
     * Batch Insert IMiddleWareProvider
     *
     * @param aMiddleWareProvider
     *
     * @throws Exception
     */
    public void batchInsertMiddleWareProvider(
        MiddleWareProvider[] aMiddleWareProvider) throws Exception {
        batchInsert(aMiddleWareProvider);
    } // end batchInsertMiddleWareProvider()

    /**
     * Delete IMiddleWareProvider
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteMiddleWareProvider(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteMiddleWareProvider()

    /**
     * Delete IMiddleWareProvider
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteMiddleWareProvider(
        MiddleWareProviderDAOQueryBean queryBean) throws Exception {
        deleteByQuery(queryBean);
    } // end deleteMiddleWareProvider()

    /**
     * Update IMiddleWareProvider Selective
     *
     * @param aMiddleWareProvider
     *
     * @throws Exception
     */
    public void updateMiddleWareProvider(MiddleWareProvider aMiddleWareProvider)
        throws Exception {
        if (aMiddleWareProvider.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aMiddleWareProvider);

        MiddleWareProvider tempObj = findMiddleWareProviderById(aMiddleWareProvider.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aMiddleWareProvider, tempObj);
        } // end if
    } // end updateMiddleWareProvider()

    /**
     * Batch Update IMiddleWareProvider
     *
     * @param aMiddleWareProvider
     *
     * @throws Exception
     */
    public void batchUpdateMiddleWareProvider(
        MiddleWareProvider[] aMiddleWareProvider) throws Exception {
        batchUpdate(aMiddleWareProvider);
    } // end batchUpdateMiddleWareProvider()

    /**
     * Update IMiddleWareProvider
     *
     * @param aMiddleWareProvider
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateMiddleWareProvider(
        MiddleWareProvider aMiddleWareProvider,
        MiddleWareProviderDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aMiddleWareProvider, aQueryBean);
    } // end updateMiddleWareProvider()

    /**
     * DOCUMENT ME!
     *
     * @param aMiddleWareProvider DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(MiddleWareProvider aMiddleWareProvider)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aMiddleWareProviders DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeMiddleWareProvider(
        MiddleWareProvider[] aMiddleWareProviders,
        MiddleWareProviderDAOQueryBean aQueryBean) throws Exception {
        synchronizeMiddleWareProvider(aMiddleWareProviders, aQueryBean, null);
    } // end synchronizeMiddleWareProvider()

    /**
     * DOCUMENT ME!
     *
     * @param aMiddleWareProviders DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeMiddleWareProvider(
        MiddleWareProvider[] aMiddleWareProviders,
        MiddleWareProviderDAOQueryBean aQueryBean,
        MiddleWareProviderSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aMiddleWareProviders) == false) {
            inputList.addAll(Arrays.asList(aMiddleWareProviders));
        } // end if

        MiddleWareProvider[] existentMiddleWareProviders = this.queryMiddleWareProvider(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentMiddleWareProviders) == false) {
            existentList.addAll(Arrays.asList(existentMiddleWareProviders));
        } // end if

        List willAddMiddleWareProviders = ListUtils.subtract(inputList,
                existentList);

        List willDeleteMiddleWareProviders = ListUtils.subtract(existentList,
                inputList);

        List willUpdateMiddleWareProviders = ListUtils.intersection(existentList,
                inputList);

        MiddleWareProvider[] willUpdateMiddleWareProviderArray = (MiddleWareProvider[]) willUpdateMiddleWareProviders.toArray(new MiddleWareProvider[willUpdateMiddleWareProviders.size()]);
        MiddleWareProvider[] willAddMiddleWareProviderArray = (MiddleWareProvider[]) willAddMiddleWareProviders.toArray(new MiddleWareProvider[willAddMiddleWareProviders.size()]);
        MiddleWareProvider[] willDeleteMiddleWareProviderArray = (MiddleWareProvider[]) willDeleteMiddleWareProviders.toArray(new MiddleWareProvider[willDeleteMiddleWareProviders.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddMiddleWareProviderArray,
                willUpdateMiddleWareProviderArray,
                willDeleteMiddleWareProviderArray);
        } // end if

        if (willUpdateMiddleWareProviders.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateMiddleWareProviderArray);
            } // end if

            this.batchUpdateMiddleWareProvider(willUpdateMiddleWareProviderArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateMiddleWareProviderArray);
            } // end if
        } // end if

        if (willAddMiddleWareProviders.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddMiddleWareProviderArray);
            } // end if

            this.batchInsertMiddleWareProvider(willAddMiddleWareProviderArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddMiddleWareProviderArray);
            } // end if
        } // end if

        if (willDeleteMiddleWareProviders.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteMiddleWareProviderArray);
            } // end if

            for (int i = 0; i < willDeleteMiddleWareProviderArray.length;
                    i++) {
                MiddleWareProvider object = willDeleteMiddleWareProviderArray[i];
                this.deleteMiddleWareProvider(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteMiddleWareProviderArray);
            } // end if
        } // end if
    } // end synchronizeMiddleWareProvider()

    /**
     * Query IMiddleWareProvider
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public MiddleWareProvider findMiddleWareProviderById(final long aId)
        throws Exception {
        MiddleWareProviderDAOQueryBean queryBean = new MiddleWareProviderDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        MiddleWareProvider[] MiddleWareProviders = queryMiddleWareProvider(queryBean);

        if (MiddleWareProviders.length == 0) {
            return null;
        } // end if
        else {
            return MiddleWareProviders[0];
        } // end else
    } // end findMiddleWareProviderById()

    /**
     * Query IMiddleWareProvider
     *
     * @param queryBean
     *
     * @return IMiddleWareProvider[]
     *
     * @throws Exception
     */
    public MiddleWareProvider[] queryMiddleWareProvider(
        MiddleWareProviderDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean,
                new JdbcMiddleWareProviderRowMapper());

        return (MiddleWareProvider[]) result.toArray(new MiddleWareProvider[result.size()]);
    } // end queryMiddleWareProvider()

    /**
     * Query MiddleWareProvider Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryMiddleWareProviderSelective(
        MiddleWareProviderDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryMiddleWareProviderSelective()

    /**
     * Query IMiddleWareProvider Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryMiddleWareProviderCount(
        MiddleWareProviderDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end queryMiddleWareProviderCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcMiddleWareProviderRowMapper
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
            MiddleWareProvider object = new MiddleWareProvider();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object DriverType = resultSet.getObject(columnIndex++);

                object.setDriverTypeNull(resultSet.getBoolean(columnIndex++));

                if (DriverType != null) {
                    BeanUtils.setProperty(object, DataProperty.DriverType,
                        DriverType);
                } // end if

                Object MiddleWareName = resultSet.getObject(columnIndex++);

                object.setMiddleWareNameNull(resultSet.getBoolean(columnIndex++));

                if (MiddleWareName != null) {
                    BeanUtils.setProperty(object, DataProperty.MiddleWareName,
                        MiddleWareName);
                } // end if

                Object MiddleWareType = resultSet.getObject(columnIndex++);

                object.setMiddleWareTypeNull(resultSet.getBoolean(columnIndex++));

                if (MiddleWareType != null) {
                    BeanUtils.setProperty(object, DataProperty.MiddleWareType,
                        MiddleWareType);
                } // end if

                Object MiddleWareVersion = resultSet.getObject(columnIndex++);

                object.setMiddleWareVersionNull(resultSet.getBoolean(
                        columnIndex++));

                if (MiddleWareVersion != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.MiddleWareVersion, MiddleWareVersion);
                } // end if

                Object ProviderName = resultSet.getObject(columnIndex++);

                object.setProviderNameNull(resultSet.getBoolean(columnIndex++));

                if (ProviderName != null) {
                    BeanUtils.setProperty(object, DataProperty.ProviderName,
                        ProviderName);
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
    } // end JdbcMiddleWareProviderRowMapper
} // end BaseMiddleWareProviderDAOJdbcImpl
