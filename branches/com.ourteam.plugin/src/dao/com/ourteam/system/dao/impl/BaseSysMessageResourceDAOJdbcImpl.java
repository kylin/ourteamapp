/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao.impl;

import com.ourteam.system.dao.ISysMessageResourceDAO;
import com.ourteam.system.dao.SysMessageResource;
import com.ourteam.system.dao.SysMessageResourceDAOQueryBean;

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
 * 系统国际化资源 DAO JDBC Impl Generate Date : 2011-06-10 22:45:09
 *
 * @author Kylin
 */
abstract public class BaseSysMessageResourceDAOJdbcImpl extends AbstractJdbcDAO
    implements ISysMessageResourceDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, MessageKeyId, LocalCode, MessageValue, Remarks, Status,
            MessageKey, MessageCatalog
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.MessageKeyId, DataProperty.LocalCode,
            DataProperty.MessageValue, DataProperty.Remarks, DataProperty.Status,
            DataProperty.MessageKey, DataProperty.MessageCatalog
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
     * Creates a new BaseSysMessageResourceDAOJdbcImpl object.
     */
    public BaseSysMessageResourceDAOJdbcImpl() {
        super();
    } // end BaseSysMessageResourceDAOJdbcImpl()

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

            relatedJoinSQLBuffer.append(
                " LEFT JOIN SYS_MESSAGE_KEY sysMessageKey ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " sysMessageKey.ID = SYS_MESSAGE_RESOURCE.MESSAGE_KEY_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique SysMessageResource
     *
     * @param aSysMessageResource
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(SysMessageResource aSysMessageResource)
        throws Exception {
        if (aSysMessageResource == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aSysMessageResource,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert ISysMessageResource
     *
     * @param aSysMessageResource
     *
     * @throws Exception
     */
    public void insertSysMessageResource(SysMessageResource aSysMessageResource)
        throws Exception {
        insert(aSysMessageResource);
    } // end insertSysMessageResource()

    /**
     * Batch Insert ISysMessageResource
     *
     * @param aSysMessageResource
     *
     * @throws Exception
     */
    public void batchInsertSysMessageResource(
        SysMessageResource[] aSysMessageResource) throws Exception {
        batchInsert(aSysMessageResource);
    } // end batchInsertSysMessageResource()

    /**
     * Delete ISysMessageResource
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteSysMessageResource(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteSysMessageResource()

    /**
     * Delete ISysMessageResource
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteSysMessageResource(
        SysMessageResourceDAOQueryBean queryBean) throws Exception {
        deleteByQuery(queryBean);
    } // end deleteSysMessageResource()

    /**
     * Update ISysMessageResource Selective
     *
     * @param aSysMessageResource
     *
     * @throws Exception
     */
    public void updateSysMessageResource(SysMessageResource aSysMessageResource)
        throws Exception {
        if (aSysMessageResource.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aSysMessageResource);

        SysMessageResource tempObj = findSysMessageResourceById(aSysMessageResource.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aSysMessageResource, tempObj);
        } // end if
    } // end updateSysMessageResource()

    /**
     * Batch Update ISysMessageResource
     *
     * @param aSysMessageResource
     *
     * @throws Exception
     */
    public void batchUpdateSysMessageResource(
        SysMessageResource[] aSysMessageResource) throws Exception {
        batchUpdate(aSysMessageResource);
    } // end batchUpdateSysMessageResource()

    /**
     * Update ISysMessageResource
     *
     * @param aSysMessageResource
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateSysMessageResource(
        SysMessageResource aSysMessageResource,
        SysMessageResourceDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aSysMessageResource, aQueryBean);
    } // end updateSysMessageResource()

    /**
     * DOCUMENT ME!
     *
     * @param aSysMessageResource DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(SysMessageResource aSysMessageResource)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aSysMessageResources DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysMessageResource(
        SysMessageResource[] aSysMessageResources,
        SysMessageResourceDAOQueryBean aQueryBean) throws Exception {
        synchronizeSysMessageResource(aSysMessageResources, aQueryBean, null);
    } // end synchronizeSysMessageResource()

    /**
     * DOCUMENT ME!
     *
     * @param aSysMessageResources DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysMessageResource(
        SysMessageResource[] aSysMessageResources,
        SysMessageResourceDAOQueryBean aQueryBean,
        SysMessageResourceSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aSysMessageResources) == false) {
            inputList.addAll(Arrays.asList(aSysMessageResources));
        } // end if

        SysMessageResource[] existentSysMessageResources = this.querySysMessageResource(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentSysMessageResources) == false) {
            existentList.addAll(Arrays.asList(existentSysMessageResources));
        } // end if

        List willAddSysMessageResources = ListUtils.subtract(inputList,
                existentList);

        List willDeleteSysMessageResources = ListUtils.subtract(existentList,
                inputList);

        List willUpdateSysMessageResources = ListUtils.intersection(existentList,
                inputList);

        SysMessageResource[] willUpdateSysMessageResourceArray = (SysMessageResource[]) willUpdateSysMessageResources.toArray(new SysMessageResource[willUpdateSysMessageResources.size()]);
        SysMessageResource[] willAddSysMessageResourceArray = (SysMessageResource[]) willAddSysMessageResources.toArray(new SysMessageResource[willAddSysMessageResources.size()]);
        SysMessageResource[] willDeleteSysMessageResourceArray = (SysMessageResource[]) willDeleteSysMessageResources.toArray(new SysMessageResource[willDeleteSysMessageResources.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddSysMessageResourceArray,
                willUpdateSysMessageResourceArray,
                willDeleteSysMessageResourceArray);
        } // end if

        if (willUpdateSysMessageResources.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateSysMessageResourceArray);
            } // end if

            this.batchUpdateSysMessageResource(willUpdateSysMessageResourceArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateSysMessageResourceArray);
            } // end if
        } // end if

        if (willAddSysMessageResources.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddSysMessageResourceArray);
            } // end if

            this.batchInsertSysMessageResource(willAddSysMessageResourceArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddSysMessageResourceArray);
            } // end if
        } // end if

        if (willDeleteSysMessageResources.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteSysMessageResourceArray);
            } // end if

            for (int i = 0; i < willDeleteSysMessageResourceArray.length;
                    i++) {
                SysMessageResource object = willDeleteSysMessageResourceArray[i];
                this.deleteSysMessageResource(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteSysMessageResourceArray);
            } // end if
        } // end if
    } // end synchronizeSysMessageResource()

    /**
     * Query ISysMessageResource
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public SysMessageResource findSysMessageResourceById(final long aId)
        throws Exception {
        SysMessageResourceDAOQueryBean queryBean = new SysMessageResourceDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        SysMessageResource[] SysMessageResources = querySysMessageResource(queryBean);

        if (SysMessageResources.length == 0) {
            return null;
        } // end if
        else {
            return SysMessageResources[0];
        } // end else
    } // end findSysMessageResourceById()

    /**
     * Query ISysMessageResource
     *
     * @param queryBean
     *
     * @return ISysMessageResource[]
     *
     * @throws Exception
     */
    public SysMessageResource[] querySysMessageResource(
        SysMessageResourceDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean,
                new JdbcSysMessageResourceRowMapper());

        return (SysMessageResource[]) result.toArray(new SysMessageResource[result.size()]);
    } // end querySysMessageResource()

    /**
     * Query SysMessageResource Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] querySysMessageResourceSelective(
        SysMessageResourceDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end querySysMessageResourceSelective()

    /**
     * Query ISysMessageResource Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int querySysMessageResourceCount(
        SysMessageResourceDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end querySysMessageResourceCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcSysMessageResourceRowMapper
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
            SysMessageResource object = new SysMessageResource();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object MessageKeyId = resultSet.getObject(columnIndex++);

                object.setMessageKeyIdNull(resultSet.getBoolean(columnIndex++));

                if (MessageKeyId != null) {
                    BeanUtils.setProperty(object, DataProperty.MessageKeyId,
                        MessageKeyId);
                } // end if

                Object LocalCode = resultSet.getObject(columnIndex++);

                object.setLocalCodeNull(resultSet.getBoolean(columnIndex++));

                if (LocalCode != null) {
                    BeanUtils.setProperty(object, DataProperty.LocalCode,
                        LocalCode);
                } // end if

                Object MessageValue = resultSet.getObject(columnIndex++);

                object.setMessageValueNull(resultSet.getBoolean(columnIndex++));

                if (MessageValue != null) {
                    BeanUtils.setProperty(object, DataProperty.MessageValue,
                        MessageValue);
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

                Object MessageKey = resultSet.getObject(columnIndex++);

                object.setMessageKeyNull(resultSet.getBoolean(columnIndex++));

                if (MessageKey != null) {
                    BeanUtils.setProperty(object, DataProperty.MessageKey,
                        MessageKey);
                } // end if

                Object MessageCatalog = resultSet.getObject(columnIndex++);

                object.setMessageCatalogNull(resultSet.getBoolean(columnIndex++));

                if (MessageCatalog != null) {
                    BeanUtils.setProperty(object, DataProperty.MessageCatalog,
                        MessageCatalog);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcSysMessageResourceRowMapper
} // end BaseSysMessageResourceDAOJdbcImpl
