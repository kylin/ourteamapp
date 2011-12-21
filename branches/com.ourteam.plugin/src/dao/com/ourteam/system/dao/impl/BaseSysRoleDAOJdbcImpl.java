/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao.impl;

import com.ourteam.system.dao.ISysRoleDAO;
import com.ourteam.system.dao.SysRole;
import com.ourteam.system.dao.SysRoleDAOQueryBean;

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
 * ÏµÍ³½ÇÉ« DAO JDBC Impl Generate Date : 2011-06-10 22:45:10
 *
 * @author Kylin
 */
abstract public class BaseSysRoleDAOJdbcImpl extends AbstractJdbcDAO
    implements ISysRoleDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, DomainId, Remarks, RoleCode, RoleName, RoleType, Status,
            DomainTitleKey, DomainName, DomainCode
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.DomainId, DataProperty.Remarks,
            DataProperty.RoleCode, DataProperty.RoleName, DataProperty.RoleType,
            DataProperty.Status, DataProperty.DomainTitleKey,
            DataProperty.DomainName, DataProperty.DomainCode
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
     * Creates a new BaseSysRoleDAOJdbcImpl object.
     */
    public BaseSysRoleDAOJdbcImpl() {
        super();
    } // end BaseSysRoleDAOJdbcImpl()

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

            basicFilterSQLbuffer.append(" SYS_ROLE.ROLE_TYPE = 'ROLE' ");

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

            relatedJoinSQLBuffer.append(" LEFT JOIN SYS_DOMAIN domain ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(" domain.ID = SYS_ROLE.DOMAIN_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique SysRole
     *
     * @param aSysRole
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(SysRole aSysRole) throws Exception {
        if (aSysRole == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aSysRole, DataProperty.Id));

        valueList.add(PropertyUtils.getProperty(aSysRole, DataProperty.RoleCode));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert ISysRole
     *
     * @param aSysRole
     *
     * @throws Exception
     */
    public void insertSysRole(SysRole aSysRole) throws Exception {
        org.apache.commons.beanutils.PropertyUtils.setProperty(aSysRole,
            "roleType",
            org.apache.commons.beanutils.ConvertUtils.convert("ROLE",
                String.class));

        insert(aSysRole);
    } // end insertSysRole()

    /**
     * Batch Insert ISysRole
     *
     * @param aSysRole
     *
     * @throws Exception
     */
    public void batchInsertSysRole(SysRole[] aSysRole)
        throws Exception {
        batchInsert(aSysRole);
    } // end batchInsertSysRole()

    /**
     * Delete ISysRole
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteSysRole(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteSysRole()

    /**
     * Delete ISysRole
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteSysRole(SysRoleDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteSysRole()

    /**
     * Update ISysRole Selective
     *
     * @param aSysRole
     *
     * @throws Exception
     */
    public void updateSysRole(SysRole aSysRole) throws Exception {
        if (aSysRole.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aSysRole);

        SysRole tempObj = findSysRoleById(aSysRole.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aSysRole, tempObj);
        } // end if
    } // end updateSysRole()

    /**
     * Batch Update ISysRole
     *
     * @param aSysRole
     *
     * @throws Exception
     */
    public void batchUpdateSysRole(SysRole[] aSysRole)
        throws Exception {
        batchUpdate(aSysRole);
    } // end batchUpdateSysRole()

    /**
     * Update ISysRole
     *
     * @param aSysRole
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateSysRole(SysRole aSysRole, SysRoleDAOQueryBean aQueryBean)
        throws Exception {
        updateByQuery(aSysRole, aQueryBean);
    } // end updateSysRole()

    /**
     * DOCUMENT ME!
     *
     * @param aSysRole DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(SysRole aSysRole) throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aSysRoles DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysRole(SysRole[] aSysRoles,
        SysRoleDAOQueryBean aQueryBean) throws Exception {
        synchronizeSysRole(aSysRoles, aQueryBean, null);
    } // end synchronizeSysRole()

    /**
     * DOCUMENT ME!
     *
     * @param aSysRoles DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysRole(SysRole[] aSysRoles,
        SysRoleDAOQueryBean aQueryBean, SysRoleSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aSysRoles) == false) {
            inputList.addAll(Arrays.asList(aSysRoles));
        } // end if

        SysRole[] existentSysRoles = this.querySysRole(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentSysRoles) == false) {
            existentList.addAll(Arrays.asList(existentSysRoles));
        } // end if

        List willAddSysRoles = ListUtils.subtract(inputList, existentList);

        List willDeleteSysRoles = ListUtils.subtract(existentList, inputList);

        List willUpdateSysRoles = ListUtils.intersection(existentList, inputList);

        SysRole[] willUpdateSysRoleArray = (SysRole[]) willUpdateSysRoles.toArray(new SysRole[willUpdateSysRoles.size()]);
        SysRole[] willAddSysRoleArray = (SysRole[]) willAddSysRoles.toArray(new SysRole[willAddSysRoles.size()]);
        SysRole[] willDeleteSysRoleArray = (SysRole[]) willDeleteSysRoles.toArray(new SysRole[willDeleteSysRoles.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddSysRoleArray,
                willUpdateSysRoleArray, willDeleteSysRoleArray);
        } // end if

        if (willUpdateSysRoles.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateSysRoleArray);
            } // end if

            this.batchUpdateSysRole(willUpdateSysRoleArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateSysRoleArray);
            } // end if
        } // end if

        if (willAddSysRoles.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddSysRoleArray);
            } // end if

            this.batchInsertSysRole(willAddSysRoleArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddSysRoleArray);
            } // end if
        } // end if

        if (willDeleteSysRoles.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteSysRoleArray);
            } // end if

            for (int i = 0; i < willDeleteSysRoleArray.length; i++) {
                SysRole object = willDeleteSysRoleArray[i];
                this.deleteSysRole(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteSysRoleArray);
            } // end if
        } // end if
    } // end synchronizeSysRole()

    /**
     * Query ISysRole
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public SysRole findSysRoleById(final long aId) throws Exception {
        SysRoleDAOQueryBean queryBean = new SysRoleDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        SysRole[] SysRoles = querySysRole(queryBean);

        if (SysRoles.length == 0) {
            return null;
        } // end if
        else {
            return SysRoles[0];
        } // end else
    } // end findSysRoleById()

    /**
     * Query ISysRole
     *
     * @param queryBean
     *
     * @return ISysRole[]
     *
     * @throws Exception
     */
    public SysRole[] querySysRole(SysRoleDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean, new JdbcSysRoleRowMapper());

        return (SysRole[]) result.toArray(new SysRole[result.size()]);
    } // end querySysRole()

    /**
     * Query SysRole Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] querySysRoleSelective(SysRoleDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end querySysRoleSelective()

    /**
     * Query ISysRole Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int querySysRoleCount(SysRoleDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end querySysRoleCount()

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
        SysRoleDAOQueryBean aDaoQueryBean) throws Exception {
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
     * Query SysRole Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] querySysRoleRelatesSelective(SysRoleDAOQueryBean aQueryBean)
        throws Exception {
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
        SysRoleDAOQueryBean aQueryBean) throws Exception {
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
    public void deleteSysRoleRelate(SysRoleDAOQueryBean aQueryBean)
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
     */
    private com.ourteam.system.dao.impl.BaseSysRoleResourceRelateDAOJdbcImpl sysRoleResourceRelate;

    /**
     * DOCUMENT ME!
     *
     * @param sysRoleResourceRelate DOCUMENT ME!
     */
    public void setSysRoleResourceRelate(
        com.ourteam.system.dao.impl.BaseSysRoleResourceRelateDAOJdbcImpl sysRoleResourceRelate) {
        this.sysRoleResourceRelate = sysRoleResourceRelate;
    } // end setSysRoleResourceRelate()

    /**
     * Query Related ISysRoleResourceRelate
     *
     * @param aDaoQueryBean DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="ISysRoleResourceRelate" containment="true"
     */
    public com.ourteam.system.dao.SysRoleResourceRelate[] querySysRoleResourceRelates(
        SysRoleDAOQueryBean aDaoQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN SYS_ROLE ON ( ");

        joinSQL.append(" SYS_ROLE_RESOURCE_RELATE.SYS_ROLE_ID = SYS_ROLE.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.system.dao.ISysRoleResourceRelateDAO.EntityName;

        String[] entityFields = com.ourteam.system.dao.impl.BaseSysRoleResourceRelateDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.system.dao.impl.BaseSysRoleResourceRelateDAOJdbcImpl.ENTITY_PROPERTIES;

        List list = sysRoleResourceRelate.query(entityName, entityFields,
                entityProperties, aDaoQueryBean, joinSQL.toString(),
                new com.ourteam.system.dao.impl.BaseSysRoleResourceRelateDAOJdbcImpl.JdbcSysRoleResourceRelateRowMapper());

        return (com.ourteam.system.dao.SysRoleResourceRelate[]) list.toArray(new com.ourteam.system.dao.SysRoleResourceRelate[list.size()]);
    } // end querySysRoleResourceRelates()

    /**
     * Query SysRole Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] querySysRoleResourceRelatesSelective(
        SysRoleDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysRoleResourceRelateDAO.Id,
                "id");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysRoleResourceRelateDAO.RelateCode,
                "relateCode");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysRoleResourceRelateDAO.RelateName,
                "relateName");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysRoleResourceRelateDAO.Remarks,
                "remarks");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysRoleResourceRelateDAO.Status,
                "status");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysRoleResourceRelateDAO.SysResourceId,
                "sysResourceId");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysRoleResourceRelateDAO.SysRoleId,
                "sysRoleId");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysRoleResourceRelateDAO.SysResourceTitleKey,
                "sysResourceTitleKey");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysRoleResourceRelateDAO.SysRoleName,
                "sysRoleName");
        } // end if

        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN SYS_ROLE ON ( ");

        joinSQL.append(" SYS_ROLE_RESOURCE_RELATE.SYS_ROLE_ID = SYS_ROLE.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.system.dao.ISysRoleResourceRelateDAO.EntityName;

        return sysRoleResourceRelate.querySelective(entityName, aQueryBean,
            joinSQL.toString());
    } // end querySysRoleResourceRelatesSelective()

    /**
     * Update Related ISysRoleResourceRelate
     *
     * @param aSysRoleResourceRelate {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void updateSysRoleResourceRelate(
        com.ourteam.system.dao.SysRoleResourceRelate aSysRoleResourceRelate,
        SysRoleDAOQueryBean aQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN SYS_ROLE ON ( ");

        joinSQL.append(" SYS_ROLE_RESOURCE_RELATE.SYS_ROLE_ID = SYS_ROLE.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.system.dao.ISysRoleResourceRelateDAO.EntityName;

        String[] entityFields = com.ourteam.system.dao.impl.BaseSysRoleResourceRelateDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.system.dao.impl.BaseSysRoleResourceRelateDAOJdbcImpl.ENTITY_PROPERTIES;

        sysRoleResourceRelate.updateByQuery(entityName, entityFields,
            entityProperties, joinSQL.toString(), aSysRoleResourceRelate,
            aQueryBean);
    } // end updateSysRoleResourceRelate()

    /**
     * Delete Related ISysRoleResourceRelate
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void deleteSysRoleResourceRelate(SysRoleDAOQueryBean aQueryBean)
        throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN SYS_ROLE ON ( ");

        joinSQL.append(" SYS_ROLE_RESOURCE_RELATE.SYS_ROLE_ID = SYS_ROLE.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.system.dao.ISysRoleResourceRelateDAO.EntityName;

        sysRoleResourceRelate.deleteByQuery(entityName, joinSQL.toString(),
            aQueryBean);
    } // end deleteSysRoleResourceRelate()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcSysRoleRowMapper implements ParameterizedRowMapper {
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
            SysRole object = new SysRole();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
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

                Object DomainTitleKey = resultSet.getObject(columnIndex++);

                object.setDomainTitleKeyNull(resultSet.getBoolean(columnIndex++));

                if (DomainTitleKey != null) {
                    BeanUtils.setProperty(object, DataProperty.DomainTitleKey,
                        DomainTitleKey);
                } // end if

                Object DomainName = resultSet.getObject(columnIndex++);

                object.setDomainNameNull(resultSet.getBoolean(columnIndex++));

                if (DomainName != null) {
                    BeanUtils.setProperty(object, DataProperty.DomainName,
                        DomainName);
                } // end if

                Object DomainCode = resultSet.getObject(columnIndex++);

                object.setDomainCodeNull(resultSet.getBoolean(columnIndex++));

                if (DomainCode != null) {
                    BeanUtils.setProperty(object, DataProperty.DomainCode,
                        DomainCode);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcSysRoleRowMapper
} // end BaseSysRoleDAOJdbcImpl
