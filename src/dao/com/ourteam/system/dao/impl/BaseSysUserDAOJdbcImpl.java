/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao.impl;

import com.ourteam.system.dao.ISysUserDAO;
import com.ourteam.system.dao.SysUser;
import com.ourteam.system.dao.SysUserDAOQueryBean;

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
 * 系统用户 DAO JDBC Impl Generate Date : 2011-11-07 09:51:28
 *
 * @author kylin
 */
abstract public class BaseSysUserDAOJdbcImpl extends AbstractJdbcDAO
    implements ISysUserDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, Remarks, Status, UserAccount, UserName, UserType, Password
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.Remarks, DataProperty.Status,
            DataProperty.UserAccount, DataProperty.UserName,
            DataProperty.UserType, DataProperty.Password
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
    public static final String[] ENTITY_UNIQUE_FIELDS = new String[] { UserAccount };

    /**
     * DOCUMENT ME!
     */
    private static String relatedJoinSQL = null;

    /**
     * DOCUMENT ME!
     */
    private static String basicFilterSQL = null;

    /**
     * Creates a new BaseSysUserDAOJdbcImpl object.
     */
    public BaseSysUserDAOJdbcImpl() {
        super();
    } // end BaseSysUserDAOJdbcImpl()

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
     * Check Unique SysUser
     *
     * @param aSysUser
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(SysUser aSysUser) throws Exception {
        if (aSysUser == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aSysUser, DataProperty.Id));

        valueList.add(PropertyUtils.getProperty(aSysUser,
                DataProperty.UserAccount));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert ISysUser
     *
     * @param aSysUser
     *
     * @throws Exception
     */
    public void insertSysUser(SysUser aSysUser) throws Exception {
        insert(aSysUser);
    } // end insertSysUser()

    /**
     * Batch Insert ISysUser
     *
     * @param aSysUser
     *
     * @throws Exception
     */
    public void batchInsertSysUser(SysUser[] aSysUser)
        throws Exception {
        batchInsert(aSysUser);
    } // end batchInsertSysUser()

    /**
     * Delete ISysUser
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteSysUser(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteSysUser()

    /**
     * Delete ISysUser
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteSysUser(SysUserDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteSysUser()

    /**
     * Update ISysUser Selective
     *
     * @param aSysUser
     *
     * @throws Exception
     */
    public void updateSysUser(SysUser aSysUser) throws Exception {
        if (aSysUser.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aSysUser);

        SysUser tempObj = findSysUserById(aSysUser.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aSysUser, tempObj);
        } // end if
    } // end updateSysUser()

    /**
     * Batch Update ISysUser
     *
     * @param aSysUser
     *
     * @throws Exception
     */
    public void batchUpdateSysUser(SysUser[] aSysUser)
        throws Exception {
        batchUpdate(aSysUser);
    } // end batchUpdateSysUser()

    /**
     * Update ISysUser
     *
     * @param aSysUser
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateSysUser(SysUser aSysUser, SysUserDAOQueryBean aQueryBean)
        throws Exception {
        updateByQuery(aSysUser, aQueryBean);
    } // end updateSysUser()

    /**
     * DOCUMENT ME!
     *
     * @param aSysUser DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(SysUser aSysUser) throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aSysUsers DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysUser(SysUser[] aSysUsers,
        SysUserDAOQueryBean aQueryBean) throws Exception {
        synchronizeSysUser(aSysUsers, aQueryBean, null);
    } // end synchronizeSysUser()

    /**
     * DOCUMENT ME!
     *
     * @param aSysUsers DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysUser(SysUser[] aSysUsers,
        SysUserDAOQueryBean aQueryBean, SysUserSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aSysUsers) == false) {
            inputList.addAll(Arrays.asList(aSysUsers));
        } // end if

        SysUser[] existentSysUsers = this.querySysUser(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentSysUsers) == false) {
            existentList.addAll(Arrays.asList(existentSysUsers));
        } // end if

        List willAddSysUsers = ListUtils.subtract(inputList, existentList);

        List willDeleteSysUsers = ListUtils.subtract(existentList, inputList);

        List willUpdateSysUsers = ListUtils.intersection(existentList, inputList);

        SysUser[] willUpdateSysUserArray = (SysUser[]) willUpdateSysUsers.toArray(new SysUser[willUpdateSysUsers.size()]);
        SysUser[] willAddSysUserArray = (SysUser[]) willAddSysUsers.toArray(new SysUser[willAddSysUsers.size()]);
        SysUser[] willDeleteSysUserArray = (SysUser[]) willDeleteSysUsers.toArray(new SysUser[willDeleteSysUsers.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddSysUserArray,
                willUpdateSysUserArray, willDeleteSysUserArray);
        } // end if

        if (willUpdateSysUsers.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateSysUserArray);
            } // end if

            this.batchUpdateSysUser(willUpdateSysUserArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateSysUserArray);
            } // end if
        } // end if

        if (willAddSysUsers.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddSysUserArray);
            } // end if

            this.batchInsertSysUser(willAddSysUserArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddSysUserArray);
            } // end if
        } // end if

        if (willDeleteSysUsers.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteSysUserArray);
            } // end if

            for (int i = 0; i < willDeleteSysUserArray.length; i++) {
                SysUser object = willDeleteSysUserArray[i];
                this.deleteSysUser(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteSysUserArray);
            } // end if
        } // end if
    } // end synchronizeSysUser()

    /**
     * Query ISysUser
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public SysUser findSysUserById(final long aId) throws Exception {
        SysUserDAOQueryBean queryBean = new SysUserDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        SysUser[] SysUsers = querySysUser(queryBean);

        if (SysUsers.length == 0) {
            return null;
        } // end if
        else {
            return SysUsers[0];
        } // end else
    } // end findSysUserById()

    /**
     * Query ISysUser
     *
     * @param queryBean
     *
     * @return ISysUser[]
     *
     * @throws Exception
     */
    public SysUser[] querySysUser(SysUserDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean, new JdbcSysUserRowMapper());

        return (SysUser[]) result.toArray(new SysUser[result.size()]);
    } // end querySysUser()

    /**
     * Query SysUser Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] querySysUserSelective(SysUserDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end querySysUserSelective()

    /**
     * Query ISysUser Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int querySysUserCount(SysUserDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end querySysUserCount()

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.system.dao.impl.BaseSysUserRoleRelateDAOJdbcImpl sysUserRoleRelate;

    /**
     * DOCUMENT ME!
     *
     * @param sysUserRoleRelate DOCUMENT ME!
     */
    public void setSysUserRoleRelate(
        com.ourteam.system.dao.impl.BaseSysUserRoleRelateDAOJdbcImpl sysUserRoleRelate) {
        this.sysUserRoleRelate = sysUserRoleRelate;
    } // end setSysUserRoleRelate()

    /**
     * Query Related ISysUserRoleRelate
     *
     * @param aDaoQueryBean DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="ISysUserRoleRelate" containment="true"
     */
    public com.ourteam.system.dao.SysUserRoleRelate[] querySysUserRoleRelates(
        SysUserDAOQueryBean aDaoQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN SYS_USER ON ( ");

        joinSQL.append(" SYS_USER_ROLE_RELATE.USER_ID = SYS_USER.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.system.dao.ISysUserRoleRelateDAO.EntityName;

        String[] entityFields = com.ourteam.system.dao.impl.BaseSysUserRoleRelateDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.system.dao.impl.BaseSysUserRoleRelateDAOJdbcImpl.ENTITY_PROPERTIES;

        List list = sysUserRoleRelate.query(entityName, entityFields,
                entityProperties, aDaoQueryBean, joinSQL.toString(),
                new com.ourteam.system.dao.impl.BaseSysUserRoleRelateDAOJdbcImpl.JdbcSysUserRoleRelateRowMapper());

        return (com.ourteam.system.dao.SysUserRoleRelate[]) list.toArray(new com.ourteam.system.dao.SysUserRoleRelate[list.size()]);
    } // end querySysUserRoleRelates()

    /**
     * Query SysUser Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] querySysUserRoleRelatesSelective(
        SysUserDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysUserRoleRelateDAO.Id,
                "id");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysUserRoleRelateDAO.ExpiredDate,
                "expiredDate");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysUserRoleRelateDAO.Remarks,
                "remarks");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysUserRoleRelateDAO.RoleId,
                "roleId");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysUserRoleRelateDAO.RoleType,
                "roleType");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysUserRoleRelateDAO.Status,
                "status");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysUserRoleRelateDAO.UserId,
                "userId");
        } // end if

        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN SYS_USER ON ( ");

        joinSQL.append(" SYS_USER_ROLE_RELATE.USER_ID = SYS_USER.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.system.dao.ISysUserRoleRelateDAO.EntityName;

        return sysUserRoleRelate.querySelective(entityName, aQueryBean,
            joinSQL.toString());
    } // end querySysUserRoleRelatesSelective()

    /**
     * Update Related ISysUserRoleRelate
     *
     * @param aSysUserRoleRelate {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void updateSysUserRoleRelate(
        com.ourteam.system.dao.SysUserRoleRelate aSysUserRoleRelate,
        SysUserDAOQueryBean aQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN SYS_USER ON ( ");

        joinSQL.append(" SYS_USER_ROLE_RELATE.USER_ID = SYS_USER.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.system.dao.ISysUserRoleRelateDAO.EntityName;

        String[] entityFields = com.ourteam.system.dao.impl.BaseSysUserRoleRelateDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.system.dao.impl.BaseSysUserRoleRelateDAOJdbcImpl.ENTITY_PROPERTIES;

        sysUserRoleRelate.updateByQuery(entityName, entityFields,
            entityProperties, joinSQL.toString(), aSysUserRoleRelate, aQueryBean);
    } // end updateSysUserRoleRelate()

    /**
     * Delete Related ISysUserRoleRelate
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void deleteSysUserRoleRelate(SysUserDAOQueryBean aQueryBean)
        throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN SYS_USER ON ( ");

        joinSQL.append(" SYS_USER_ROLE_RELATE.USER_ID = SYS_USER.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.system.dao.ISysUserRoleRelateDAO.EntityName;

        sysUserRoleRelate.deleteByQuery(entityName, joinSQL.toString(),
            aQueryBean);
    } // end deleteSysUserRoleRelate()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcSysUserRowMapper implements ParameterizedRowMapper {
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
            SysUser object = new SysUser();

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

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object UserAccount = resultSet.getObject(columnIndex++);

                object.setUserAccountNull(resultSet.getBoolean(columnIndex++));

                if (UserAccount != null) {
                    BeanUtils.setProperty(object, DataProperty.UserAccount,
                        UserAccount);
                } // end if

                Object UserName = resultSet.getObject(columnIndex++);

                object.setUserNameNull(resultSet.getBoolean(columnIndex++));

                if (UserName != null) {
                    BeanUtils.setProperty(object, DataProperty.UserName,
                        UserName);
                } // end if

                Object UserType = resultSet.getObject(columnIndex++);

                object.setUserTypeNull(resultSet.getBoolean(columnIndex++));

                if (UserType != null) {
                    BeanUtils.setProperty(object, DataProperty.UserType,
                        UserType);
                } // end if

                Object Password = resultSet.getObject(columnIndex++);

                object.setPasswordNull(resultSet.getBoolean(columnIndex++));

                if (Password != null) {
                    BeanUtils.setProperty(object, DataProperty.Password,
                        Password);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcSysUserRowMapper
} // end BaseSysUserDAOJdbcImpl
