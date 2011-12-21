/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao.impl;

import com.ourteam.bpm.dao.BpmPublicUiConfig;
import com.ourteam.bpm.dao.BpmPublicUiConfigDAOQueryBean;
import com.ourteam.bpm.dao.IBpmPublicUiConfigDAO;

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
 * DAO JDBC Impl Generate Date : 2011-11-11 16:20:45
 *
 * @author kylin
 */
abstract public class BaseBpmPublicUiConfigDAOJdbcImpl extends AbstractJdbcDAO
    implements IBpmPublicUiConfigDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, ConfigXml, Remarks, Status, UiConfigType
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.ConfigXml, DataProperty.Remarks,
            DataProperty.Status, DataProperty.UiConfigType
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
     * Creates a new BaseBpmPublicUiConfigDAOJdbcImpl object.
     */
    public BaseBpmPublicUiConfigDAOJdbcImpl() {
        super();
    } // end BaseBpmPublicUiConfigDAOJdbcImpl()

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
     * Check Unique BpmPublicUiConfig
     *
     * @param aBpmPublicUiConfig
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(BpmPublicUiConfig aBpmPublicUiConfig)
        throws Exception {
        if (aBpmPublicUiConfig == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aBpmPublicUiConfig,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IBpmPublicUiConfig
     *
     * @param aBpmPublicUiConfig
     *
     * @throws Exception
     */
    public void insertBpmPublicUiConfig(BpmPublicUiConfig aBpmPublicUiConfig)
        throws Exception {
        insert(aBpmPublicUiConfig);
    } // end insertBpmPublicUiConfig()

    /**
     * Batch Insert IBpmPublicUiConfig
     *
     * @param aBpmPublicUiConfig
     *
     * @throws Exception
     */
    public void batchInsertBpmPublicUiConfig(
        BpmPublicUiConfig[] aBpmPublicUiConfig) throws Exception {
        batchInsert(aBpmPublicUiConfig);
    } // end batchInsertBpmPublicUiConfig()

    /**
     * Delete IBpmPublicUiConfig
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteBpmPublicUiConfig(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteBpmPublicUiConfig()

    /**
     * Delete IBpmPublicUiConfig
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteBpmPublicUiConfig(BpmPublicUiConfigDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteBpmPublicUiConfig()

    /**
     * Update IBpmPublicUiConfig Selective
     *
     * @param aBpmPublicUiConfig
     *
     * @throws Exception
     */
    public void updateBpmPublicUiConfig(BpmPublicUiConfig aBpmPublicUiConfig)
        throws Exception {
        if (aBpmPublicUiConfig.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aBpmPublicUiConfig);

        BpmPublicUiConfig tempObj = findBpmPublicUiConfigById(aBpmPublicUiConfig.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aBpmPublicUiConfig, tempObj);
        } // end if
    } // end updateBpmPublicUiConfig()

    /**
     * Batch Update IBpmPublicUiConfig
     *
     * @param aBpmPublicUiConfig
     *
     * @throws Exception
     */
    public void batchUpdateBpmPublicUiConfig(
        BpmPublicUiConfig[] aBpmPublicUiConfig) throws Exception {
        batchUpdate(aBpmPublicUiConfig);
    } // end batchUpdateBpmPublicUiConfig()

    /**
     * Update IBpmPublicUiConfig
     *
     * @param aBpmPublicUiConfig
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateBpmPublicUiConfig(BpmPublicUiConfig aBpmPublicUiConfig,
        BpmPublicUiConfigDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aBpmPublicUiConfig, aQueryBean);
    } // end updateBpmPublicUiConfig()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmPublicUiConfig DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(BpmPublicUiConfig aBpmPublicUiConfig)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmPublicUiConfigs DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmPublicUiConfig(
        BpmPublicUiConfig[] aBpmPublicUiConfigs,
        BpmPublicUiConfigDAOQueryBean aQueryBean) throws Exception {
        synchronizeBpmPublicUiConfig(aBpmPublicUiConfigs, aQueryBean, null);
    } // end synchronizeBpmPublicUiConfig()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmPublicUiConfigs DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmPublicUiConfig(
        BpmPublicUiConfig[] aBpmPublicUiConfigs,
        BpmPublicUiConfigDAOQueryBean aQueryBean,
        BpmPublicUiConfigSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aBpmPublicUiConfigs) == false) {
            inputList.addAll(Arrays.asList(aBpmPublicUiConfigs));
        } // end if

        BpmPublicUiConfig[] existentBpmPublicUiConfigs = this.queryBpmPublicUiConfig(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentBpmPublicUiConfigs) == false) {
            existentList.addAll(Arrays.asList(existentBpmPublicUiConfigs));
        } // end if

        List willAddBpmPublicUiConfigs = ListUtils.subtract(inputList,
                existentList);

        List willDeleteBpmPublicUiConfigs = ListUtils.subtract(existentList,
                inputList);

        List willUpdateBpmPublicUiConfigs = ListUtils.intersection(existentList,
                inputList);

        BpmPublicUiConfig[] willUpdateBpmPublicUiConfigArray = (BpmPublicUiConfig[]) willUpdateBpmPublicUiConfigs.toArray(new BpmPublicUiConfig[willUpdateBpmPublicUiConfigs.size()]);
        BpmPublicUiConfig[] willAddBpmPublicUiConfigArray = (BpmPublicUiConfig[]) willAddBpmPublicUiConfigs.toArray(new BpmPublicUiConfig[willAddBpmPublicUiConfigs.size()]);
        BpmPublicUiConfig[] willDeleteBpmPublicUiConfigArray = (BpmPublicUiConfig[]) willDeleteBpmPublicUiConfigs.toArray(new BpmPublicUiConfig[willDeleteBpmPublicUiConfigs.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddBpmPublicUiConfigArray,
                willUpdateBpmPublicUiConfigArray,
                willDeleteBpmPublicUiConfigArray);
        } // end if

        if (willUpdateBpmPublicUiConfigs.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateBpmPublicUiConfigArray);
            } // end if

            this.batchUpdateBpmPublicUiConfig(willUpdateBpmPublicUiConfigArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateBpmPublicUiConfigArray);
            } // end if
        } // end if

        if (willAddBpmPublicUiConfigs.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddBpmPublicUiConfigArray);
            } // end if

            this.batchInsertBpmPublicUiConfig(willAddBpmPublicUiConfigArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddBpmPublicUiConfigArray);
            } // end if
        } // end if

        if (willDeleteBpmPublicUiConfigs.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteBpmPublicUiConfigArray);
            } // end if

            for (int i = 0; i < willDeleteBpmPublicUiConfigArray.length; i++) {
                BpmPublicUiConfig object = willDeleteBpmPublicUiConfigArray[i];
                this.deleteBpmPublicUiConfig(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteBpmPublicUiConfigArray);
            } // end if
        } // end if
    } // end synchronizeBpmPublicUiConfig()

    /**
     * Query IBpmPublicUiConfig
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public BpmPublicUiConfig findBpmPublicUiConfigById(final long aId)
        throws Exception {
        BpmPublicUiConfigDAOQueryBean queryBean = new BpmPublicUiConfigDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        BpmPublicUiConfig[] BpmPublicUiConfigs = queryBpmPublicUiConfig(queryBean);

        if (BpmPublicUiConfigs.length == 0) {
            return null;
        } // end if
        else {
            return BpmPublicUiConfigs[0];
        } // end else
    } // end findBpmPublicUiConfigById()

    /**
     * Query IBpmPublicUiConfig
     *
     * @param queryBean
     *
     * @return IBpmPublicUiConfig[]
     *
     * @throws Exception
     */
    public BpmPublicUiConfig[] queryBpmPublicUiConfig(
        BpmPublicUiConfigDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcBpmPublicUiConfigRowMapper());

        return (BpmPublicUiConfig[]) result.toArray(new BpmPublicUiConfig[result.size()]);
    } // end queryBpmPublicUiConfig()

    /**
     * Query BpmPublicUiConfig Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryBpmPublicUiConfigSelective(
        BpmPublicUiConfigDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryBpmPublicUiConfigSelective()

    /**
     * Query IBpmPublicUiConfig Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryBpmPublicUiConfigCount(
        BpmPublicUiConfigDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end queryBpmPublicUiConfigCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcBpmPublicUiConfigRowMapper
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
            BpmPublicUiConfig object = new BpmPublicUiConfig();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object ConfigXml = resultSet.getObject(columnIndex++);

                object.setConfigXmlNull(resultSet.getBoolean(columnIndex++));

                if (ConfigXml != null) {
                    BeanUtils.setProperty(object, DataProperty.ConfigXml,
                        ConfigXml);
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

                Object UiConfigType = resultSet.getObject(columnIndex++);

                object.setUiConfigTypeNull(resultSet.getBoolean(columnIndex++));

                if (UiConfigType != null) {
                    BeanUtils.setProperty(object, DataProperty.UiConfigType,
                        UiConfigType);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcBpmPublicUiConfigRowMapper
} // end BaseBpmPublicUiConfigDAOJdbcImpl
