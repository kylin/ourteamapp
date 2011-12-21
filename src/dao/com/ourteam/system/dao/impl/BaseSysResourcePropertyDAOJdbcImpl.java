/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao.impl;

import com.ourteam.system.dao.ISysResourcePropertyDAO;
import com.ourteam.system.dao.SysResourceProperty;
import com.ourteam.system.dao.SysResourcePropertyDAOQueryBean;

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
 * 系统资源属性 DAO JDBC Impl Generate Date : 2011-06-10 22:45:09
 *
 * @author Kylin
 */
abstract public class BaseSysResourcePropertyDAOJdbcImpl extends AbstractJdbcDAO
    implements ISysResourcePropertyDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, Remarks, ResourcePropertyCode, ResourcePropertyDefaultValue,
            ResourcePropertyName, ResourcePropertyOrder, ResourcePropertyType,
            ResourcePropertyValue, Status, SysResourceId
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.Remarks,
            DataProperty.ResourcePropertyCode,
            DataProperty.ResourcePropertyDefaultValue,
            DataProperty.ResourcePropertyName,
            DataProperty.ResourcePropertyOrder,
            DataProperty.ResourcePropertyType,
            DataProperty.ResourcePropertyValue, DataProperty.Status,
            DataProperty.SysResourceId
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
     * Creates a new BaseSysResourcePropertyDAOJdbcImpl object.
     */
    public BaseSysResourcePropertyDAOJdbcImpl() {
        super();
    } // end BaseSysResourcePropertyDAOJdbcImpl()

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
     * Check Unique SysResourceProperty
     *
     * @param aSysResourceProperty
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(SysResourceProperty aSysResourceProperty)
        throws Exception {
        if (aSysResourceProperty == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aSysResourceProperty,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert ISysResourceProperty
     *
     * @param aSysResourceProperty
     *
     * @throws Exception
     */
    public void insertSysResourceProperty(
        SysResourceProperty aSysResourceProperty) throws Exception {
        insert(aSysResourceProperty);
    } // end insertSysResourceProperty()

    /**
     * Batch Insert ISysResourceProperty
     *
     * @param aSysResourceProperty
     *
     * @throws Exception
     */
    public void batchInsertSysResourceProperty(
        SysResourceProperty[] aSysResourceProperty) throws Exception {
        batchInsert(aSysResourceProperty);
    } // end batchInsertSysResourceProperty()

    /**
     * Delete ISysResourceProperty
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteSysResourceProperty(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteSysResourceProperty()

    /**
     * Delete ISysResourceProperty
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteSysResourceProperty(
        SysResourcePropertyDAOQueryBean queryBean) throws Exception {
        deleteByQuery(queryBean);
    } // end deleteSysResourceProperty()

    /**
     * Update ISysResourceProperty Selective
     *
     * @param aSysResourceProperty
     *
     * @throws Exception
     */
    public void updateSysResourceProperty(
        SysResourceProperty aSysResourceProperty) throws Exception {
        if (aSysResourceProperty.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aSysResourceProperty);

        SysResourceProperty tempObj = findSysResourcePropertyById(aSysResourceProperty.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aSysResourceProperty, tempObj);
        } // end if
    } // end updateSysResourceProperty()

    /**
     * Batch Update ISysResourceProperty
     *
     * @param aSysResourceProperty
     *
     * @throws Exception
     */
    public void batchUpdateSysResourceProperty(
        SysResourceProperty[] aSysResourceProperty) throws Exception {
        batchUpdate(aSysResourceProperty);
    } // end batchUpdateSysResourceProperty()

    /**
     * Update ISysResourceProperty
     *
     * @param aSysResourceProperty
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateSysResourceProperty(
        SysResourceProperty aSysResourceProperty,
        SysResourcePropertyDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aSysResourceProperty, aQueryBean);
    } // end updateSysResourceProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aSysResourceProperty DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(SysResourceProperty aSysResourceProperty)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aSysResourcePropertys DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysResourceProperty(
        SysResourceProperty[] aSysResourcePropertys,
        SysResourcePropertyDAOQueryBean aQueryBean) throws Exception {
        synchronizeSysResourceProperty(aSysResourcePropertys, aQueryBean, null);
    } // end synchronizeSysResourceProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aSysResourcePropertys DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysResourceProperty(
        SysResourceProperty[] aSysResourcePropertys,
        SysResourcePropertyDAOQueryBean aQueryBean,
        SysResourcePropertySynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aSysResourcePropertys) == false) {
            inputList.addAll(Arrays.asList(aSysResourcePropertys));
        } // end if

        SysResourceProperty[] existentSysResourcePropertys = this.querySysResourceProperty(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentSysResourcePropertys) == false) {
            existentList.addAll(Arrays.asList(existentSysResourcePropertys));
        } // end if

        List willAddSysResourcePropertys = ListUtils.subtract(inputList,
                existentList);

        List willDeleteSysResourcePropertys = ListUtils.subtract(existentList,
                inputList);

        List willUpdateSysResourcePropertys = ListUtils.intersection(existentList,
                inputList);

        SysResourceProperty[] willUpdateSysResourcePropertyArray = (SysResourceProperty[]) willUpdateSysResourcePropertys.toArray(new SysResourceProperty[willUpdateSysResourcePropertys.size()]);
        SysResourceProperty[] willAddSysResourcePropertyArray = (SysResourceProperty[]) willAddSysResourcePropertys.toArray(new SysResourceProperty[willAddSysResourcePropertys.size()]);
        SysResourceProperty[] willDeleteSysResourcePropertyArray = (SysResourceProperty[]) willDeleteSysResourcePropertys.toArray(new SysResourceProperty[willDeleteSysResourcePropertys.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddSysResourcePropertyArray,
                willUpdateSysResourcePropertyArray,
                willDeleteSysResourcePropertyArray);
        } // end if

        if (willUpdateSysResourcePropertys.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateSysResourcePropertyArray);
            } // end if

            this.batchUpdateSysResourceProperty(willUpdateSysResourcePropertyArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateSysResourcePropertyArray);
            } // end if
        } // end if

        if (willAddSysResourcePropertys.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddSysResourcePropertyArray);
            } // end if

            this.batchInsertSysResourceProperty(willAddSysResourcePropertyArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddSysResourcePropertyArray);
            } // end if
        } // end if

        if (willDeleteSysResourcePropertys.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteSysResourcePropertyArray);
            } // end if

            for (int i = 0; i < willDeleteSysResourcePropertyArray.length;
                    i++) {
                SysResourceProperty object = willDeleteSysResourcePropertyArray[i];
                this.deleteSysResourceProperty(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteSysResourcePropertyArray);
            } // end if
        } // end if
    } // end synchronizeSysResourceProperty()

    /**
     * Query ISysResourceProperty
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public SysResourceProperty findSysResourcePropertyById(final long aId)
        throws Exception {
        SysResourcePropertyDAOQueryBean queryBean = new SysResourcePropertyDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        SysResourceProperty[] SysResourcePropertys = querySysResourceProperty(queryBean);

        if (SysResourcePropertys.length == 0) {
            return null;
        } // end if
        else {
            return SysResourcePropertys[0];
        } // end else
    } // end findSysResourcePropertyById()

    /**
     * Query ISysResourceProperty
     *
     * @param queryBean
     *
     * @return ISysResourceProperty[]
     *
     * @throws Exception
     */
    public SysResourceProperty[] querySysResourceProperty(
        SysResourcePropertyDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean,
                new JdbcSysResourcePropertyRowMapper());

        return (SysResourceProperty[]) result.toArray(new SysResourceProperty[result.size()]);
    } // end querySysResourceProperty()

    /**
     * Query SysResourceProperty Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] querySysResourcePropertySelective(
        SysResourcePropertyDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end querySysResourcePropertySelective()

    /**
     * Query ISysResourceProperty Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int querySysResourcePropertyCount(
        SysResourcePropertyDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end querySysResourcePropertyCount()

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.system.dao.impl.BaseSysResourcePropertyOptionDAOJdbcImpl sysResourcePropertyOption;

    /**
     * DOCUMENT ME!
     *
     * @param sysResourcePropertyOption DOCUMENT ME!
     */
    public void setSysResourcePropertyOption(
        com.ourteam.system.dao.impl.BaseSysResourcePropertyOptionDAOJdbcImpl sysResourcePropertyOption) {
        this.sysResourcePropertyOption = sysResourcePropertyOption;
    } // end setSysResourcePropertyOption()

    /**
     * Query Related ISysResourcePropertyOption
     *
     * @param aDaoQueryBean DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="ISysResourcePropertyOption" containment="true"
     */
    public com.ourteam.system.dao.SysResourcePropertyOption[] querySysResourcePropertyOptions(
        SysResourcePropertyDAOQueryBean aDaoQueryBean)
        throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN SYS_RESOURCE_PROPERTY ON ( ");

        joinSQL.append(
            " SYS_RESOURCE_PROPERTY_OPTION.SYS_RESOURCE_PROPERTY_ID = SYS_RESOURCE_PROPERTY.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.system.dao.ISysResourcePropertyOptionDAO.EntityName;

        String[] entityFields = com.ourteam.system.dao.impl.BaseSysResourcePropertyOptionDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.system.dao.impl.BaseSysResourcePropertyOptionDAOJdbcImpl.ENTITY_PROPERTIES;

        List list = sysResourcePropertyOption.query(entityName, entityFields,
                entityProperties, aDaoQueryBean, joinSQL.toString(),
                new com.ourteam.system.dao.impl.BaseSysResourcePropertyOptionDAOJdbcImpl.JdbcSysResourcePropertyOptionRowMapper());

        return (com.ourteam.system.dao.SysResourcePropertyOption[]) list.toArray(new com.ourteam.system.dao.SysResourcePropertyOption[list.size()]);
    } // end querySysResourcePropertyOptions()

    /**
     * Query SysResourceProperty Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] querySysResourcePropertyOptionsSelective(
        SysResourcePropertyDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysResourcePropertyOptionDAO.Id,
                "id");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysResourcePropertyOptionDAO.OrderIndex,
                "orderIndex");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysResourcePropertyOptionDAO.Remarks,
                "remarks");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysResourcePropertyOptionDAO.Status,
                "status");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysResourcePropertyOptionDAO.SysResourcePropertyId,
                "sysResourcePropertyId");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysResourcePropertyOptionDAO.ValueCode,
                "valueCode");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysResourcePropertyOptionDAO.ValueLable,
                "valueLable");
        } // end if

        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN SYS_RESOURCE_PROPERTY ON ( ");

        joinSQL.append(
            " SYS_RESOURCE_PROPERTY_OPTION.SYS_RESOURCE_PROPERTY_ID = SYS_RESOURCE_PROPERTY.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.system.dao.ISysResourcePropertyOptionDAO.EntityName;

        return sysResourcePropertyOption.querySelective(entityName, aQueryBean,
            joinSQL.toString());
    } // end querySysResourcePropertyOptionsSelective()

    /**
     * Update Related ISysResourcePropertyOption
     *
     * @param aSysResourcePropertyOption {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void updateSysResourcePropertyOption(
        com.ourteam.system.dao.SysResourcePropertyOption aSysResourcePropertyOption,
        SysResourcePropertyDAOQueryBean aQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN SYS_RESOURCE_PROPERTY ON ( ");

        joinSQL.append(
            " SYS_RESOURCE_PROPERTY_OPTION.SYS_RESOURCE_PROPERTY_ID = SYS_RESOURCE_PROPERTY.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.system.dao.ISysResourcePropertyOptionDAO.EntityName;

        String[] entityFields = com.ourteam.system.dao.impl.BaseSysResourcePropertyOptionDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.system.dao.impl.BaseSysResourcePropertyOptionDAOJdbcImpl.ENTITY_PROPERTIES;

        sysResourcePropertyOption.updateByQuery(entityName, entityFields,
            entityProperties, joinSQL.toString(), aSysResourcePropertyOption,
            aQueryBean);
    } // end updateSysResourcePropertyOption()

    /**
     * Delete Related ISysResourcePropertyOption
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void deleteSysResourcePropertyOption(
        SysResourcePropertyDAOQueryBean aQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN SYS_RESOURCE_PROPERTY ON ( ");

        joinSQL.append(
            " SYS_RESOURCE_PROPERTY_OPTION.SYS_RESOURCE_PROPERTY_ID = SYS_RESOURCE_PROPERTY.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.system.dao.ISysResourcePropertyOptionDAO.EntityName;

        sysResourcePropertyOption.deleteByQuery(entityName, joinSQL.toString(),
            aQueryBean);
    } // end deleteSysResourcePropertyOption()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcSysResourcePropertyRowMapper
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
            SysResourceProperty object = new SysResourceProperty();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object Remarks = resultSet.getObject(columnIndex++);

                object.setRemarksNull(resultSet.getBoolean(columnIndex++));

                if (Remarks != null) {
                    BeanUtils.setProperty(object, DataProperty.Remarks, Remarks);
                } // end if

                Object ResourcePropertyCode = resultSet.getObject(columnIndex++);

                object.setResourcePropertyCodeNull(resultSet.getBoolean(
                        columnIndex++));

                if (ResourcePropertyCode != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ResourcePropertyCode, ResourcePropertyCode);
                } // end if

                Object ResourcePropertyDefaultValue = resultSet.getObject(columnIndex++);

                object.setResourcePropertyDefaultValueNull(resultSet.getBoolean(
                        columnIndex++));

                if (ResourcePropertyDefaultValue != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ResourcePropertyDefaultValue,
                        ResourcePropertyDefaultValue);
                } // end if

                Object ResourcePropertyName = resultSet.getObject(columnIndex++);

                object.setResourcePropertyNameNull(resultSet.getBoolean(
                        columnIndex++));

                if (ResourcePropertyName != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ResourcePropertyName, ResourcePropertyName);
                } // end if

                Object ResourcePropertyOrder = resultSet.getObject(columnIndex++);

                object.setResourcePropertyOrderNull(resultSet.getBoolean(
                        columnIndex++));

                if (ResourcePropertyOrder != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ResourcePropertyOrder,
                        ResourcePropertyOrder);
                } // end if

                Object ResourcePropertyType = resultSet.getObject(columnIndex++);

                object.setResourcePropertyTypeNull(resultSet.getBoolean(
                        columnIndex++));

                if (ResourcePropertyType != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ResourcePropertyType, ResourcePropertyType);
                } // end if

                Object ResourcePropertyValue = resultSet.getObject(columnIndex++);

                object.setResourcePropertyValueNull(resultSet.getBoolean(
                        columnIndex++));

                if (ResourcePropertyValue != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.ResourcePropertyValue,
                        ResourcePropertyValue);
                } // end if

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object SysResourceId = resultSet.getObject(columnIndex++);

                object.setSysResourceIdNull(resultSet.getBoolean(columnIndex++));

                if (SysResourceId != null) {
                    BeanUtils.setProperty(object, DataProperty.SysResourceId,
                        SysResourceId);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcSysResourcePropertyRowMapper
} // end BaseSysResourcePropertyDAOJdbcImpl
