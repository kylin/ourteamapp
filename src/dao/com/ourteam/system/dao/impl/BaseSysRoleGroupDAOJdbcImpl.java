/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao.impl;

import com.ourteam.system.dao.ISysRoleGroupDAO;
import com.ourteam.system.dao.SysRoleGroup;
import com.ourteam.system.dao.SysRoleGroupDAOQueryBean;

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
 * 系统角色群组 DAO JDBC Impl Generate Date : 2011-06-10 22:45:10
 *
 * @author Kylin
 */
abstract public class BaseSysRoleGroupDAOJdbcImpl extends AbstractJdbcDAO
    implements ISysRoleGroupDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, Remarks, RoleCode, RoleName, RoleType, Status
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.Remarks, DataProperty.RoleCode,
            DataProperty.RoleName, DataProperty.RoleType, DataProperty.Status
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
    public static final String[] ENTITY_UNIQUE_FIELDS = new String[] { RoleCode };

    /**
     * DOCUMENT ME!
     */
    private static String relatedJoinSQL = null;

    /**
     * DOCUMENT ME!
     */
    private static String basicFilterSQL = null;

    /**
     * Creates a new BaseSysRoleGroupDAOJdbcImpl object.
     */
    public BaseSysRoleGroupDAOJdbcImpl() {
        super();
    } // end BaseSysRoleGroupDAOJdbcImpl()

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

            basicFilterSQLbuffer.append(" SYS_ROLE.ROLE_TYPE = 'ROLE_GROUP' ");

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
     * Check Unique SysRoleGroup
     *
     * @param aSysRoleGroup
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(SysRoleGroup aSysRoleGroup)
        throws Exception {
        if (aSysRoleGroup == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aSysRoleGroup, DataProperty.Id));

        valueList.add(PropertyUtils.getProperty(aSysRoleGroup,
                DataProperty.RoleCode));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert ISysRoleGroup
     *
     * @param aSysRoleGroup
     *
     * @throws Exception
     */
    public void insertSysRoleGroup(SysRoleGroup aSysRoleGroup)
        throws Exception {
        org.apache.commons.beanutils.PropertyUtils.setProperty(aSysRoleGroup,
            "roleType",
            org.apache.commons.beanutils.ConvertUtils.convert("ROLE_GROUP",
                String.class));

        insert(aSysRoleGroup);
    } // end insertSysRoleGroup()

    /**
     * Batch Insert ISysRoleGroup
     *
     * @param aSysRoleGroup
     *
     * @throws Exception
     */
    public void batchInsertSysRoleGroup(SysRoleGroup[] aSysRoleGroup)
        throws Exception {
        batchInsert(aSysRoleGroup);
    } // end batchInsertSysRoleGroup()

    /**
     * Delete ISysRoleGroup
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteSysRoleGroup(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteSysRoleGroup()

    /**
     * Delete ISysRoleGroup
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteSysRoleGroup(SysRoleGroupDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteSysRoleGroup()

    /**
     * Update ISysRoleGroup Selective
     *
     * @param aSysRoleGroup
     *
     * @throws Exception
     */
    public void updateSysRoleGroup(SysRoleGroup aSysRoleGroup)
        throws Exception {
        if (aSysRoleGroup.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aSysRoleGroup);

        SysRoleGroup tempObj = findSysRoleGroupById(aSysRoleGroup.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aSysRoleGroup, tempObj);
        } // end if
    } // end updateSysRoleGroup()

    /**
     * Batch Update ISysRoleGroup
     *
     * @param aSysRoleGroup
     *
     * @throws Exception
     */
    public void batchUpdateSysRoleGroup(SysRoleGroup[] aSysRoleGroup)
        throws Exception {
        batchUpdate(aSysRoleGroup);
    } // end batchUpdateSysRoleGroup()

    /**
     * Update ISysRoleGroup
     *
     * @param aSysRoleGroup
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateSysRoleGroup(SysRoleGroup aSysRoleGroup,
        SysRoleGroupDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aSysRoleGroup, aQueryBean);
    } // end updateSysRoleGroup()

    /**
     * DOCUMENT ME!
     *
     * @param aSysRoleGroup DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(SysRoleGroup aSysRoleGroup)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aSysRoleGroups DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysRoleGroup(SysRoleGroup[] aSysRoleGroups,
        SysRoleGroupDAOQueryBean aQueryBean) throws Exception {
        synchronizeSysRoleGroup(aSysRoleGroups, aQueryBean, null);
    } // end synchronizeSysRoleGroup()

    /**
     * DOCUMENT ME!
     *
     * @param aSysRoleGroups DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysRoleGroup(SysRoleGroup[] aSysRoleGroups,
        SysRoleGroupDAOQueryBean aQueryBean,
        SysRoleGroupSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aSysRoleGroups) == false) {
            inputList.addAll(Arrays.asList(aSysRoleGroups));
        } // end if

        SysRoleGroup[] existentSysRoleGroups = this.querySysRoleGroup(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentSysRoleGroups) == false) {
            existentList.addAll(Arrays.asList(existentSysRoleGroups));
        } // end if

        List willAddSysRoleGroups = ListUtils.subtract(inputList, existentList);

        List willDeleteSysRoleGroups = ListUtils.subtract(existentList,
                inputList);

        List willUpdateSysRoleGroups = ListUtils.intersection(existentList,
                inputList);

        SysRoleGroup[] willUpdateSysRoleGroupArray = (SysRoleGroup[]) willUpdateSysRoleGroups.toArray(new SysRoleGroup[willUpdateSysRoleGroups.size()]);
        SysRoleGroup[] willAddSysRoleGroupArray = (SysRoleGroup[]) willAddSysRoleGroups.toArray(new SysRoleGroup[willAddSysRoleGroups.size()]);
        SysRoleGroup[] willDeleteSysRoleGroupArray = (SysRoleGroup[]) willDeleteSysRoleGroups.toArray(new SysRoleGroup[willDeleteSysRoleGroups.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddSysRoleGroupArray,
                willUpdateSysRoleGroupArray, willDeleteSysRoleGroupArray);
        } // end if

        if (willUpdateSysRoleGroups.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateSysRoleGroupArray);
            } // end if

            this.batchUpdateSysRoleGroup(willUpdateSysRoleGroupArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateSysRoleGroupArray);
            } // end if
        } // end if

        if (willAddSysRoleGroups.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddSysRoleGroupArray);
            } // end if

            this.batchInsertSysRoleGroup(willAddSysRoleGroupArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddSysRoleGroupArray);
            } // end if
        } // end if

        if (willDeleteSysRoleGroups.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteSysRoleGroupArray);
            } // end if

            for (int i = 0; i < willDeleteSysRoleGroupArray.length; i++) {
                SysRoleGroup object = willDeleteSysRoleGroupArray[i];
                this.deleteSysRoleGroup(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteSysRoleGroupArray);
            } // end if
        } // end if
    } // end synchronizeSysRoleGroup()

    /**
     * Query ISysRoleGroup
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public SysRoleGroup findSysRoleGroupById(final long aId)
        throws Exception {
        SysRoleGroupDAOQueryBean queryBean = new SysRoleGroupDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        SysRoleGroup[] SysRoleGroups = querySysRoleGroup(queryBean);

        if (SysRoleGroups.length == 0) {
            return null;
        } // end if
        else {
            return SysRoleGroups[0];
        } // end else
    } // end findSysRoleGroupById()

    /**
     * Query ISysRoleGroup
     *
     * @param queryBean
     *
     * @return ISysRoleGroup[]
     *
     * @throws Exception
     */
    public SysRoleGroup[] querySysRoleGroup(SysRoleGroupDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean, new JdbcSysRoleGroupRowMapper());

        return (SysRoleGroup[]) result.toArray(new SysRoleGroup[result.size()]);
    } // end querySysRoleGroup()

    /**
     * Query SysRoleGroup Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] querySysRoleGroupSelective(SysRoleGroupDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end querySysRoleGroupSelective()

    /**
     * Query ISysRoleGroup Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int querySysRoleGroupCount(SysRoleGroupDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end querySysRoleGroupCount()

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.system.dao.impl.BaseSysRoleRelateDAOJdbcImpl sysRoleRelate;

    /**
     * DOCUMENT ME!
     *
     * @param sysRoleRelate DOCUMENT ME!
     */
    public void setSysRoleRelate(
        com.ourteam.system.dao.impl.BaseSysRoleRelateDAOJdbcImpl sysRoleRelate) {
        this.sysRoleRelate = sysRoleRelate;
    } // end setSysRoleRelate()

    /**
     * Query Related ISysRoleRelate
     *
     * @param aDaoQueryBean DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="ISysRoleRelate" containment="true"
     */
    public com.ourteam.system.dao.SysRoleRelate[] querySysRoleRelates(
        SysRoleGroupDAOQueryBean aDaoQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN SYS_ROLE ON ( ");

        joinSQL.append(" SYS_ROLE_RELATE.SYS_ROLE_GROUP_ID = SYS_ROLE.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.system.dao.ISysRoleRelateDAO.EntityName;

        String[] entityFields = com.ourteam.system.dao.impl.BaseSysRoleRelateDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.system.dao.impl.BaseSysRoleRelateDAOJdbcImpl.ENTITY_PROPERTIES;

        List list = sysRoleRelate.query(entityName, entityFields,
                entityProperties, aDaoQueryBean, joinSQL.toString(),
                new com.ourteam.system.dao.impl.BaseSysRoleRelateDAOJdbcImpl.JdbcSysRoleRelateRowMapper());

        return (com.ourteam.system.dao.SysRoleRelate[]) list.toArray(new com.ourteam.system.dao.SysRoleRelate[list.size()]);
    } // end querySysRoleRelates()

    /**
     * Query SysRoleGroup Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] querySysRoleRelatesSelective(
        SysRoleGroupDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysRoleRelateDAO.Id,
                "id");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysRoleRelateDAO.RelatedSysRoleId,
                "relatedSysRoleId");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysRoleRelateDAO.Remarks,
                "remarks");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysRoleRelateDAO.Status,
                "status");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysRoleRelateDAO.SysRoleGroupId,
                "sysRoleGroupId");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysRoleRelateDAO.RelatedSysRoleCode,
                "relatedSysRoleCode");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysRoleRelateDAO.SysRoleName,
                "sysRoleName");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysRoleRelateDAO.SysRoleCode,
                "sysRoleCode");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysRoleRelateDAO.SysRoleType,
                "sysRoleType");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysRoleRelateDAO.SysRoleDomainId,
                "sysRoleDomainId");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysRoleRelateDAO.SysDomainName,
                "sysDomainName");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysRoleRelateDAO.SysDomainCode,
                "sysDomainCode");
        } // end if

        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN SYS_ROLE ON ( ");

        joinSQL.append(" SYS_ROLE_RELATE.SYS_ROLE_GROUP_ID = SYS_ROLE.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.system.dao.ISysRoleRelateDAO.EntityName;

        return sysRoleRelate.querySelective(entityName, aQueryBean,
            joinSQL.toString());
    } // end querySysRoleRelatesSelective()

    /**
     * Update Related ISysRoleRelate
     *
     * @param aSysRoleRelate {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void updateSysRoleRelate(
        com.ourteam.system.dao.SysRoleRelate aSysRoleRelate,
        SysRoleGroupDAOQueryBean aQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN SYS_ROLE ON ( ");

        joinSQL.append(" SYS_ROLE_RELATE.SYS_ROLE_GROUP_ID = SYS_ROLE.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.system.dao.ISysRoleRelateDAO.EntityName;

        String[] entityFields = com.ourteam.system.dao.impl.BaseSysRoleRelateDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.system.dao.impl.BaseSysRoleRelateDAOJdbcImpl.ENTITY_PROPERTIES;

        sysRoleRelate.updateByQuery(entityName, entityFields, entityProperties,
            joinSQL.toString(), aSysRoleRelate, aQueryBean);
    } // end updateSysRoleRelate()

    /**
     * Delete Related ISysRoleRelate
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void deleteSysRoleRelate(SysRoleGroupDAOQueryBean aQueryBean)
        throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN SYS_ROLE ON ( ");

        joinSQL.append(" SYS_ROLE_RELATE.SYS_ROLE_GROUP_ID = SYS_ROLE.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.system.dao.ISysRoleRelateDAO.EntityName;

        sysRoleRelate.deleteByQuery(entityName, joinSQL.toString(), aQueryBean);
    } // end deleteSysRoleRelate()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcSysRoleGroupRowMapper
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
            SysRoleGroup object = new SysRoleGroup();

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

                Object RoleCode = resultSet.getObject(columnIndex++);

                object.setRoleCodeNull(resultSet.getBoolean(columnIndex++));

                if (RoleCode != null) {
                    BeanUtils.setProperty(object, DataProperty.RoleCode,
                        RoleCode);
                } // end if

                Object RoleName = resultSet.getObject(columnIndex++);

                object.setRoleNameNull(resultSet.getBoolean(columnIndex++));

                if (RoleName != null) {
                    BeanUtils.setProperty(object, DataProperty.RoleName,
                        RoleName);
                } // end if

                Object RoleType = resultSet.getObject(columnIndex++);

                object.setRoleTypeNull(resultSet.getBoolean(columnIndex++));

                if (RoleType != null) {
                    BeanUtils.setProperty(object, DataProperty.RoleType,
                        RoleType);
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
    } // end JdbcSysRoleGroupRowMapper
} // end BaseSysRoleGroupDAOJdbcImpl
