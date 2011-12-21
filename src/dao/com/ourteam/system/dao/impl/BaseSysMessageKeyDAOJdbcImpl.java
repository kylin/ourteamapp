/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao.impl;

import com.ourteam.system.dao.ISysMessageKeyDAO;
import com.ourteam.system.dao.SysMessageKey;
import com.ourteam.system.dao.SysMessageKeyDAOQueryBean;

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
 * 系统国际化资源Key DAO JDBC Impl Generate Date : 2011-06-10 22:45:09
 *
 * @author Kylin
 */
abstract public class BaseSysMessageKeyDAOJdbcImpl extends AbstractJdbcDAO
    implements ISysMessageKeyDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, MessageCatalog, MessageKey, Remarks, Status
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.MessageCatalog,
            DataProperty.MessageKey, DataProperty.Remarks, DataProperty.Status
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
    public static final String[] ENTITY_UNIQUE_FIELDS = new String[] { MessageKey };

    /**
     * DOCUMENT ME!
     */
    private static String relatedJoinSQL = null;

    /**
     * DOCUMENT ME!
     */
    private static String basicFilterSQL = null;

    /**
     * Creates a new BaseSysMessageKeyDAOJdbcImpl object.
     */
    public BaseSysMessageKeyDAOJdbcImpl() {
        super();
    } // end BaseSysMessageKeyDAOJdbcImpl()

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
     * Check Unique SysMessageKey
     *
     * @param aSysMessageKey
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(SysMessageKey aSysMessageKey)
        throws Exception {
        if (aSysMessageKey == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aSysMessageKey,
                DataProperty.Id));

        valueList.add(PropertyUtils.getProperty(aSysMessageKey,
                DataProperty.MessageKey));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert ISysMessageKey
     *
     * @param aSysMessageKey
     *
     * @throws Exception
     */
    public void insertSysMessageKey(SysMessageKey aSysMessageKey)
        throws Exception {
        checkNullValue(aSysMessageKey);

        insert(aSysMessageKey);
    } // end insertSysMessageKey()

    /**
     * Batch Insert ISysMessageKey
     *
     * @param aSysMessageKey
     *
     * @throws Exception
     */
    public void batchInsertSysMessageKey(SysMessageKey[] aSysMessageKey)
        throws Exception {
        batchInsert(aSysMessageKey);
    } // end batchInsertSysMessageKey()

    /**
     * Delete ISysMessageKey
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteSysMessageKey(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteSysMessageKey()

    /**
     * Delete ISysMessageKey
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteSysMessageKey(SysMessageKeyDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteSysMessageKey()

    /**
     * Update ISysMessageKey Selective
     *
     * @param aSysMessageKey
     *
     * @throws Exception
     */
    public void updateSysMessageKey(SysMessageKey aSysMessageKey)
        throws Exception {
        if (aSysMessageKey.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aSysMessageKey);

        SysMessageKey tempObj = findSysMessageKeyById(aSysMessageKey.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aSysMessageKey, tempObj);
        } // end if
    } // end updateSysMessageKey()

    /**
     * Batch Update ISysMessageKey
     *
     * @param aSysMessageKey
     *
     * @throws Exception
     */
    public void batchUpdateSysMessageKey(SysMessageKey[] aSysMessageKey)
        throws Exception {
        batchUpdate(aSysMessageKey);
    } // end batchUpdateSysMessageKey()

    /**
     * Update ISysMessageKey
     *
     * @param aSysMessageKey
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateSysMessageKey(SysMessageKey aSysMessageKey,
        SysMessageKeyDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aSysMessageKey, aQueryBean);
    } // end updateSysMessageKey()

    /**
     * DOCUMENT ME!
     *
     * @param aSysMessageKey DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(SysMessageKey aSysMessageKey)
        throws Exception {
        if (aSysMessageKey.getMessageKey() == null) {
            throw new Exception(
                "The SysMessageKey.messageKey value is not allow NULL");
        } // end if
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aSysMessageKeys DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysMessageKey(SysMessageKey[] aSysMessageKeys,
        SysMessageKeyDAOQueryBean aQueryBean) throws Exception {
        synchronizeSysMessageKey(aSysMessageKeys, aQueryBean, null);
    } // end synchronizeSysMessageKey()

    /**
     * DOCUMENT ME!
     *
     * @param aSysMessageKeys DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysMessageKey(SysMessageKey[] aSysMessageKeys,
        SysMessageKeyDAOQueryBean aQueryBean,
        SysMessageKeySynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aSysMessageKeys) == false) {
            inputList.addAll(Arrays.asList(aSysMessageKeys));
        } // end if

        SysMessageKey[] existentSysMessageKeys = this.querySysMessageKey(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentSysMessageKeys) == false) {
            existentList.addAll(Arrays.asList(existentSysMessageKeys));
        } // end if

        List willAddSysMessageKeys = ListUtils.subtract(inputList, existentList);

        List willDeleteSysMessageKeys = ListUtils.subtract(existentList,
                inputList);

        List willUpdateSysMessageKeys = ListUtils.intersection(existentList,
                inputList);

        SysMessageKey[] willUpdateSysMessageKeyArray = (SysMessageKey[]) willUpdateSysMessageKeys.toArray(new SysMessageKey[willUpdateSysMessageKeys.size()]);
        SysMessageKey[] willAddSysMessageKeyArray = (SysMessageKey[]) willAddSysMessageKeys.toArray(new SysMessageKey[willAddSysMessageKeys.size()]);
        SysMessageKey[] willDeleteSysMessageKeyArray = (SysMessageKey[]) willDeleteSysMessageKeys.toArray(new SysMessageKey[willDeleteSysMessageKeys.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddSysMessageKeyArray,
                willUpdateSysMessageKeyArray, willDeleteSysMessageKeyArray);
        } // end if

        if (willUpdateSysMessageKeys.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateSysMessageKeyArray);
            } // end if

            this.batchUpdateSysMessageKey(willUpdateSysMessageKeyArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateSysMessageKeyArray);
            } // end if
        } // end if

        if (willAddSysMessageKeys.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddSysMessageKeyArray);
            } // end if

            this.batchInsertSysMessageKey(willAddSysMessageKeyArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddSysMessageKeyArray);
            } // end if
        } // end if

        if (willDeleteSysMessageKeys.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteSysMessageKeyArray);
            } // end if

            for (int i = 0; i < willDeleteSysMessageKeyArray.length; i++) {
                SysMessageKey object = willDeleteSysMessageKeyArray[i];
                this.deleteSysMessageKey(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteSysMessageKeyArray);
            } // end if
        } // end if
    } // end synchronizeSysMessageKey()

    /**
     * Query ISysMessageKey
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public SysMessageKey findSysMessageKeyById(final long aId)
        throws Exception {
        SysMessageKeyDAOQueryBean queryBean = new SysMessageKeyDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        SysMessageKey[] SysMessageKeys = querySysMessageKey(queryBean);

        if (SysMessageKeys.length == 0) {
            return null;
        } // end if
        else {
            return SysMessageKeys[0];
        } // end else
    } // end findSysMessageKeyById()

    /**
     * Query ISysMessageKey
     *
     * @param queryBean
     *
     * @return ISysMessageKey[]
     *
     * @throws Exception
     */
    public SysMessageKey[] querySysMessageKey(
        SysMessageKeyDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcSysMessageKeyRowMapper());

        return (SysMessageKey[]) result.toArray(new SysMessageKey[result.size()]);
    } // end querySysMessageKey()

    /**
     * Query SysMessageKey Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] querySysMessageKeySelective(
        SysMessageKeyDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end querySysMessageKeySelective()

    /**
     * Query ISysMessageKey Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int querySysMessageKeyCount(SysMessageKeyDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end querySysMessageKeyCount()

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.system.dao.impl.BaseSysMessageResourceDAOJdbcImpl sysMessageResource;

    /**
     * DOCUMENT ME!
     *
     * @param sysMessageResource DOCUMENT ME!
     */
    public void setSysMessageResource(
        com.ourteam.system.dao.impl.BaseSysMessageResourceDAOJdbcImpl sysMessageResource) {
        this.sysMessageResource = sysMessageResource;
    } // end setSysMessageResource()

    /**
     * Query Related ISysMessageResource
     *
     * @param aDaoQueryBean DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="ISysMessageResource" containment="true"
     */
    public com.ourteam.system.dao.SysMessageResource[] querySysMessageResources(
        SysMessageKeyDAOQueryBean aDaoQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN SYS_MESSAGE_KEY ON ( ");

        joinSQL.append(
            " SYS_MESSAGE_RESOURCE.MESSAGE_KEY_ID = SYS_MESSAGE_KEY.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.system.dao.ISysMessageResourceDAO.EntityName;

        String[] entityFields = com.ourteam.system.dao.impl.BaseSysMessageResourceDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.system.dao.impl.BaseSysMessageResourceDAOJdbcImpl.ENTITY_PROPERTIES;

        List list = sysMessageResource.query(entityName, entityFields,
                entityProperties, aDaoQueryBean, joinSQL.toString(),
                new com.ourteam.system.dao.impl.BaseSysMessageResourceDAOJdbcImpl.JdbcSysMessageResourceRowMapper());

        return (com.ourteam.system.dao.SysMessageResource[]) list.toArray(new com.ourteam.system.dao.SysMessageResource[list.size()]);
    } // end querySysMessageResources()

    /**
     * Query SysMessageKey Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] querySysMessageResourcesSelective(
        SysMessageKeyDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysMessageResourceDAO.Id,
                "id");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysMessageResourceDAO.MessageKeyId,
                "messageKeyId");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysMessageResourceDAO.LocalCode,
                "localCode");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysMessageResourceDAO.MessageValue,
                "messageValue");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysMessageResourceDAO.Remarks,
                "remarks");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysMessageResourceDAO.Status,
                "status");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysMessageResourceDAO.MessageKey,
                "messageKey");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysMessageResourceDAO.MessageCatalog,
                "messageCatalog");
        } // end if

        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN SYS_MESSAGE_KEY ON ( ");

        joinSQL.append(
            " SYS_MESSAGE_RESOURCE.MESSAGE_KEY_ID = SYS_MESSAGE_KEY.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.system.dao.ISysMessageResourceDAO.EntityName;

        return sysMessageResource.querySelective(entityName, aQueryBean,
            joinSQL.toString());
    } // end querySysMessageResourcesSelective()

    /**
     * Update Related ISysMessageResource
     *
     * @param aSysMessageResource {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void updateSysMessageResource(
        com.ourteam.system.dao.SysMessageResource aSysMessageResource,
        SysMessageKeyDAOQueryBean aQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN SYS_MESSAGE_KEY ON ( ");

        joinSQL.append(
            " SYS_MESSAGE_RESOURCE.MESSAGE_KEY_ID = SYS_MESSAGE_KEY.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.system.dao.ISysMessageResourceDAO.EntityName;

        String[] entityFields = com.ourteam.system.dao.impl.BaseSysMessageResourceDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.system.dao.impl.BaseSysMessageResourceDAOJdbcImpl.ENTITY_PROPERTIES;

        sysMessageResource.updateByQuery(entityName, entityFields,
            entityProperties, joinSQL.toString(), aSysMessageResource,
            aQueryBean);
    } // end updateSysMessageResource()

    /**
     * Delete Related ISysMessageResource
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void deleteSysMessageResource(SysMessageKeyDAOQueryBean aQueryBean)
        throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN SYS_MESSAGE_KEY ON ( ");

        joinSQL.append(
            " SYS_MESSAGE_RESOURCE.MESSAGE_KEY_ID = SYS_MESSAGE_KEY.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.system.dao.ISysMessageResourceDAO.EntityName;

        sysMessageResource.deleteByQuery(entityName, joinSQL.toString(),
            aQueryBean);
    } // end deleteSysMessageResource()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcSysMessageKeyRowMapper
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
            SysMessageKey object = new SysMessageKey();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object MessageCatalog = resultSet.getObject(columnIndex++);

                object.setMessageCatalogNull(resultSet.getBoolean(columnIndex++));

                if (MessageCatalog != null) {
                    BeanUtils.setProperty(object, DataProperty.MessageCatalog,
                        MessageCatalog);
                } // end if

                Object MessageKey = resultSet.getObject(columnIndex++);

                object.setMessageKeyNull(resultSet.getBoolean(columnIndex++));

                if (MessageKey != null) {
                    BeanUtils.setProperty(object, DataProperty.MessageKey,
                        MessageKey);
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
    } // end JdbcSysMessageKeyRowMapper
} // end BaseSysMessageKeyDAOJdbcImpl
