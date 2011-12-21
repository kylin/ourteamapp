/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao.impl;

import com.ourteam.system.dao.ISysNotifyConfigDAO;
import com.ourteam.system.dao.SysNotifyConfig;
import com.ourteam.system.dao.SysNotifyConfigDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-11-24 15:01:21
 *
 * @author kylin
 */
abstract public class BaseSysNotifyConfigDAOJdbcImpl extends AbstractJdbcDAO
    implements ISysNotifyConfigDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            CheckInterval, Id, NotifyIcon, NotifyListener, NotifyMessage,
            NotifyName, Status
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.CheckInterval, DataProperty.Id, DataProperty.NotifyIcon,
            DataProperty.NotifyListener, DataProperty.NotifyMessage,
            DataProperty.NotifyName, DataProperty.Status
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
     * Creates a new BaseSysNotifyConfigDAOJdbcImpl object.
     */
    public BaseSysNotifyConfigDAOJdbcImpl() {
        super();
    } // end BaseSysNotifyConfigDAOJdbcImpl()

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
     * Check Unique SysNotifyConfig
     *
     * @param aSysNotifyConfig
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(SysNotifyConfig aSysNotifyConfig)
        throws Exception {
        if (aSysNotifyConfig == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aSysNotifyConfig,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert ISysNotifyConfig
     *
     * @param aSysNotifyConfig
     *
     * @throws Exception
     */
    public void insertSysNotifyConfig(SysNotifyConfig aSysNotifyConfig)
        throws Exception {
        insert(aSysNotifyConfig);
    } // end insertSysNotifyConfig()

    /**
     * Batch Insert ISysNotifyConfig
     *
     * @param aSysNotifyConfig
     *
     * @throws Exception
     */
    public void batchInsertSysNotifyConfig(SysNotifyConfig[] aSysNotifyConfig)
        throws Exception {
        batchInsert(aSysNotifyConfig);
    } // end batchInsertSysNotifyConfig()

    /**
     * Delete ISysNotifyConfig
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteSysNotifyConfig(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteSysNotifyConfig()

    /**
     * Delete ISysNotifyConfig
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteSysNotifyConfig(SysNotifyConfigDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteSysNotifyConfig()

    /**
     * Update ISysNotifyConfig Selective
     *
     * @param aSysNotifyConfig
     *
     * @throws Exception
     */
    public void updateSysNotifyConfig(SysNotifyConfig aSysNotifyConfig)
        throws Exception {
        if (aSysNotifyConfig.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aSysNotifyConfig);

        SysNotifyConfig tempObj = findSysNotifyConfigById(aSysNotifyConfig.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aSysNotifyConfig, tempObj);
        } // end if
    } // end updateSysNotifyConfig()

    /**
     * Batch Update ISysNotifyConfig
     *
     * @param aSysNotifyConfig
     *
     * @throws Exception
     */
    public void batchUpdateSysNotifyConfig(SysNotifyConfig[] aSysNotifyConfig)
        throws Exception {
        batchUpdate(aSysNotifyConfig);
    } // end batchUpdateSysNotifyConfig()

    /**
     * Update ISysNotifyConfig
     *
     * @param aSysNotifyConfig
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateSysNotifyConfig(SysNotifyConfig aSysNotifyConfig,
        SysNotifyConfigDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aSysNotifyConfig, aQueryBean);
    } // end updateSysNotifyConfig()

    /**
     * DOCUMENT ME!
     *
     * @param aSysNotifyConfig DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(SysNotifyConfig aSysNotifyConfig)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aSysNotifyConfigs DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysNotifyConfig(
        SysNotifyConfig[] aSysNotifyConfigs,
        SysNotifyConfigDAOQueryBean aQueryBean) throws Exception {
        synchronizeSysNotifyConfig(aSysNotifyConfigs, aQueryBean, null);
    } // end synchronizeSysNotifyConfig()

    /**
     * DOCUMENT ME!
     *
     * @param aSysNotifyConfigs DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysNotifyConfig(
        SysNotifyConfig[] aSysNotifyConfigs,
        SysNotifyConfigDAOQueryBean aQueryBean,
        SysNotifyConfigSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aSysNotifyConfigs) == false) {
            inputList.addAll(Arrays.asList(aSysNotifyConfigs));
        } // end if

        SysNotifyConfig[] existentSysNotifyConfigs = this.querySysNotifyConfig(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentSysNotifyConfigs) == false) {
            existentList.addAll(Arrays.asList(existentSysNotifyConfigs));
        } // end if

        List willAddSysNotifyConfigs = ListUtils.subtract(inputList,
                existentList);

        List willDeleteSysNotifyConfigs = ListUtils.subtract(existentList,
                inputList);

        List willUpdateSysNotifyConfigs = ListUtils.intersection(existentList,
                inputList);

        SysNotifyConfig[] willUpdateSysNotifyConfigArray = (SysNotifyConfig[]) willUpdateSysNotifyConfigs.toArray(new SysNotifyConfig[willUpdateSysNotifyConfigs.size()]);
        SysNotifyConfig[] willAddSysNotifyConfigArray = (SysNotifyConfig[]) willAddSysNotifyConfigs.toArray(new SysNotifyConfig[willAddSysNotifyConfigs.size()]);
        SysNotifyConfig[] willDeleteSysNotifyConfigArray = (SysNotifyConfig[]) willDeleteSysNotifyConfigs.toArray(new SysNotifyConfig[willDeleteSysNotifyConfigs.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddSysNotifyConfigArray,
                willUpdateSysNotifyConfigArray, willDeleteSysNotifyConfigArray);
        } // end if

        if (willUpdateSysNotifyConfigs.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateSysNotifyConfigArray);
            } // end if

            this.batchUpdateSysNotifyConfig(willUpdateSysNotifyConfigArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateSysNotifyConfigArray);
            } // end if
        } // end if

        if (willAddSysNotifyConfigs.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddSysNotifyConfigArray);
            } // end if

            this.batchInsertSysNotifyConfig(willAddSysNotifyConfigArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddSysNotifyConfigArray);
            } // end if
        } // end if

        if (willDeleteSysNotifyConfigs.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteSysNotifyConfigArray);
            } // end if

            for (int i = 0; i < willDeleteSysNotifyConfigArray.length; i++) {
                SysNotifyConfig object = willDeleteSysNotifyConfigArray[i];
                this.deleteSysNotifyConfig(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteSysNotifyConfigArray);
            } // end if
        } // end if
    } // end synchronizeSysNotifyConfig()

    /**
     * Query ISysNotifyConfig
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public SysNotifyConfig findSysNotifyConfigById(final long aId)
        throws Exception {
        SysNotifyConfigDAOQueryBean queryBean = new SysNotifyConfigDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        SysNotifyConfig[] SysNotifyConfigs = querySysNotifyConfig(queryBean);

        if (SysNotifyConfigs.length == 0) {
            return null;
        } // end if
        else {
            return SysNotifyConfigs[0];
        } // end else
    } // end findSysNotifyConfigById()

    /**
     * Query ISysNotifyConfig
     *
     * @param queryBean
     *
     * @return ISysNotifyConfig[]
     *
     * @throws Exception
     */
    public SysNotifyConfig[] querySysNotifyConfig(
        SysNotifyConfigDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcSysNotifyConfigRowMapper());

        return (SysNotifyConfig[]) result.toArray(new SysNotifyConfig[result.size()]);
    } // end querySysNotifyConfig()

    /**
     * Query SysNotifyConfig Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] querySysNotifyConfigSelective(
        SysNotifyConfigDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end querySysNotifyConfigSelective()

    /**
     * Query ISysNotifyConfig Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int querySysNotifyConfigCount(SysNotifyConfigDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end querySysNotifyConfigCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcSysNotifyConfigRowMapper
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
            SysNotifyConfig object = new SysNotifyConfig();

            int columnIndex = 1;

            try {
                Object CheckInterval = resultSet.getObject(columnIndex++);

                object.setCheckIntervalNull(resultSet.getBoolean(columnIndex++));

                if (CheckInterval != null) {
                    BeanUtils.setProperty(object, DataProperty.CheckInterval,
                        CheckInterval);
                } // end if

                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object NotifyIcon = resultSet.getObject(columnIndex++);

                object.setNotifyIconNull(resultSet.getBoolean(columnIndex++));

                if (NotifyIcon != null) {
                    BeanUtils.setProperty(object, DataProperty.NotifyIcon,
                        NotifyIcon);
                } // end if

                Object NotifyListener = resultSet.getObject(columnIndex++);

                object.setNotifyListenerNull(resultSet.getBoolean(columnIndex++));

                if (NotifyListener != null) {
                    BeanUtils.setProperty(object, DataProperty.NotifyListener,
                        NotifyListener);
                } // end if

                Object NotifyMessage = resultSet.getObject(columnIndex++);

                object.setNotifyMessageNull(resultSet.getBoolean(columnIndex++));

                if (NotifyMessage != null) {
                    BeanUtils.setProperty(object, DataProperty.NotifyMessage,
                        NotifyMessage);
                } // end if

                Object NotifyName = resultSet.getObject(columnIndex++);

                object.setNotifyNameNull(resultSet.getBoolean(columnIndex++));

                if (NotifyName != null) {
                    BeanUtils.setProperty(object, DataProperty.NotifyName,
                        NotifyName);
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
    } // end JdbcSysNotifyConfigRowMapper
} // end BaseSysNotifyConfigDAOJdbcImpl
