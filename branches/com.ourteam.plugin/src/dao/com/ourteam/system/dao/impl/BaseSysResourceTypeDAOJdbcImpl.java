/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao.impl;

import com.ourteam.system.dao.ISysResourceTypeDAO;
import com.ourteam.system.dao.SysResourceType;
import com.ourteam.system.dao.SysResourceTypeDAOQueryBean;

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
 * 系统资源类型 DAO JDBC Impl Generate Date : 2011-06-10 22:45:10
 *
 * @author Kylin
 */
abstract public class BaseSysResourceTypeDAOJdbcImpl extends AbstractJdbcDAO
    implements ISysResourceTypeDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, ConfigCode, ConfigName, DomainId, Remarks, Status,
            ResourceTypeId, Sort
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.ConfigCode, DataProperty.ConfigName,
            DataProperty.DomainId, DataProperty.Remarks, DataProperty.Status,
            DataProperty.ResourceTypeId, DataProperty.Sort
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
     * Creates a new BaseSysResourceTypeDAOJdbcImpl object.
     */
    public BaseSysResourceTypeDAOJdbcImpl() {
        super();
    } // end BaseSysResourceTypeDAOJdbcImpl()

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
     * Check Unique SysResourceType
     *
     * @param aSysResourceType
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(SysResourceType aSysResourceType)
        throws Exception {
        if (aSysResourceType == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aSysResourceType,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert ISysResourceType
     *
     * @param aSysResourceType
     *
     * @throws Exception
     */
    public void insertSysResourceType(SysResourceType aSysResourceType)
        throws Exception {
        insert(aSysResourceType);
    } // end insertSysResourceType()

    /**
     * Batch Insert ISysResourceType
     *
     * @param aSysResourceType
     *
     * @throws Exception
     */
    public void batchInsertSysResourceType(SysResourceType[] aSysResourceType)
        throws Exception {
        batchInsert(aSysResourceType);
    } // end batchInsertSysResourceType()

    /**
     * Delete ISysResourceType
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteSysResourceType(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteSysResourceType()

    /**
     * Delete ISysResourceType
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteSysResourceType(SysResourceTypeDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteSysResourceType()

    /**
     * Update ISysResourceType Selective
     *
     * @param aSysResourceType
     *
     * @throws Exception
     */
    public void updateSysResourceType(SysResourceType aSysResourceType)
        throws Exception {
        if (aSysResourceType.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aSysResourceType);

        SysResourceType tempObj = findSysResourceTypeById(aSysResourceType.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aSysResourceType, tempObj);
        } // end if
    } // end updateSysResourceType()

    /**
     * Batch Update ISysResourceType
     *
     * @param aSysResourceType
     *
     * @throws Exception
     */
    public void batchUpdateSysResourceType(SysResourceType[] aSysResourceType)
        throws Exception {
        batchUpdate(aSysResourceType);
    } // end batchUpdateSysResourceType()

    /**
     * Update ISysResourceType
     *
     * @param aSysResourceType
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateSysResourceType(SysResourceType aSysResourceType,
        SysResourceTypeDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aSysResourceType, aQueryBean);
    } // end updateSysResourceType()

    /**
     * DOCUMENT ME!
     *
     * @param aSysResourceType DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(SysResourceType aSysResourceType)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aSysResourceTypes DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysResourceType(
        SysResourceType[] aSysResourceTypes,
        SysResourceTypeDAOQueryBean aQueryBean) throws Exception {
        synchronizeSysResourceType(aSysResourceTypes, aQueryBean, null);
    } // end synchronizeSysResourceType()

    /**
     * DOCUMENT ME!
     *
     * @param aSysResourceTypes DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysResourceType(
        SysResourceType[] aSysResourceTypes,
        SysResourceTypeDAOQueryBean aQueryBean,
        SysResourceTypeSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aSysResourceTypes) == false) {
            inputList.addAll(Arrays.asList(aSysResourceTypes));
        } // end if

        SysResourceType[] existentSysResourceTypes = this.querySysResourceType(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentSysResourceTypes) == false) {
            existentList.addAll(Arrays.asList(existentSysResourceTypes));
        } // end if

        List willAddSysResourceTypes = ListUtils.subtract(inputList,
                existentList);

        List willDeleteSysResourceTypes = ListUtils.subtract(existentList,
                inputList);

        List willUpdateSysResourceTypes = ListUtils.intersection(existentList,
                inputList);

        SysResourceType[] willUpdateSysResourceTypeArray = (SysResourceType[]) willUpdateSysResourceTypes.toArray(new SysResourceType[willUpdateSysResourceTypes.size()]);
        SysResourceType[] willAddSysResourceTypeArray = (SysResourceType[]) willAddSysResourceTypes.toArray(new SysResourceType[willAddSysResourceTypes.size()]);
        SysResourceType[] willDeleteSysResourceTypeArray = (SysResourceType[]) willDeleteSysResourceTypes.toArray(new SysResourceType[willDeleteSysResourceTypes.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddSysResourceTypeArray,
                willUpdateSysResourceTypeArray, willDeleteSysResourceTypeArray);
        } // end if

        if (willUpdateSysResourceTypes.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateSysResourceTypeArray);
            } // end if

            this.batchUpdateSysResourceType(willUpdateSysResourceTypeArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateSysResourceTypeArray);
            } // end if
        } // end if

        if (willAddSysResourceTypes.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddSysResourceTypeArray);
            } // end if

            this.batchInsertSysResourceType(willAddSysResourceTypeArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddSysResourceTypeArray);
            } // end if
        } // end if

        if (willDeleteSysResourceTypes.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteSysResourceTypeArray);
            } // end if

            for (int i = 0; i < willDeleteSysResourceTypeArray.length; i++) {
                SysResourceType object = willDeleteSysResourceTypeArray[i];
                this.deleteSysResourceType(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteSysResourceTypeArray);
            } // end if
        } // end if
    } // end synchronizeSysResourceType()

    /**
     * Query ISysResourceType
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public SysResourceType findSysResourceTypeById(final long aId)
        throws Exception {
        SysResourceTypeDAOQueryBean queryBean = new SysResourceTypeDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        SysResourceType[] SysResourceTypes = querySysResourceType(queryBean);

        if (SysResourceTypes.length == 0) {
            return null;
        } // end if
        else {
            return SysResourceTypes[0];
        } // end else
    } // end findSysResourceTypeById()

    /**
     * Query ISysResourceType
     *
     * @param queryBean
     *
     * @return ISysResourceType[]
     *
     * @throws Exception
     */
    public SysResourceType[] querySysResourceType(
        SysResourceTypeDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcSysResourceTypeRowMapper());

        return (SysResourceType[]) result.toArray(new SysResourceType[result.size()]);
    } // end querySysResourceType()

    /**
     * Query SysResourceType Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] querySysResourceTypeSelective(
        SysResourceTypeDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end querySysResourceTypeSelective()

    /**
     * Query ISysResourceType Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int querySysResourceTypeCount(SysResourceTypeDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end querySysResourceTypeCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcSysResourceTypeRowMapper
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
            SysResourceType object = new SysResourceType();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object ConfigCode = resultSet.getObject(columnIndex++);

                object.setConfigCodeNull(resultSet.getBoolean(columnIndex++));

                if (ConfigCode != null) {
                    BeanUtils.setProperty(object, DataProperty.ConfigCode,
                        ConfigCode);
                } // end if

                Object ConfigName = resultSet.getObject(columnIndex++);

                object.setConfigNameNull(resultSet.getBoolean(columnIndex++));

                if (ConfigName != null) {
                    BeanUtils.setProperty(object, DataProperty.ConfigName,
                        ConfigName);
                } // end if

                Object DomainId = resultSet.getObject(columnIndex++);

                object.setDomainIdNull(resultSet.getBoolean(columnIndex++));

                if (DomainId != null) {
                    BeanUtils.setProperty(object, DataProperty.DomainId,
                        DomainId);
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

                Object ResourceTypeId = resultSet.getObject(columnIndex++);

                object.setResourceTypeIdNull(resultSet.getBoolean(columnIndex++));

                if (ResourceTypeId != null) {
                    BeanUtils.setProperty(object, DataProperty.ResourceTypeId,
                        ResourceTypeId);
                } // end if

                Object Sort = resultSet.getObject(columnIndex++);

                object.setSortNull(resultSet.getBoolean(columnIndex++));

                if (Sort != null) {
                    BeanUtils.setProperty(object, DataProperty.Sort, Sort);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcSysResourceTypeRowMapper
} // end BaseSysResourceTypeDAOJdbcImpl
