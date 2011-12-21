/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao.impl;

import com.ourteam.bpm.dao.BpmRole;
import com.ourteam.bpm.dao.BpmRoleDAOQueryBean;
import com.ourteam.bpm.dao.IBpmRoleDAO;

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
 * DAO JDBC Impl Generate Date : 2011-11-04 13:14:20
 *
 * @author kylin
 */
abstract public class BaseBpmRoleDAOJdbcImpl extends AbstractJdbcDAO
    implements IBpmRoleDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, Remarks, RoleKey, RoleName, Status, SysModuleId, SysModuleName,
            SysModuleCode, BpmDomainId, BpmDomainCode, BpmDomainName
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.Remarks, DataProperty.RoleKey,
            DataProperty.RoleName, DataProperty.Status, DataProperty.SysModuleId,
            DataProperty.SysModuleName, DataProperty.SysModuleCode,
            DataProperty.BpmDomainId, DataProperty.BpmDomainCode,
            DataProperty.BpmDomainName
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
     * Creates a new BaseBpmRoleDAOJdbcImpl object.
     */
    public BaseBpmRoleDAOJdbcImpl() {
        super();
    } // end BaseBpmRoleDAOJdbcImpl()

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

            relatedJoinSQLBuffer.append(" LEFT JOIN SYS_MODULE sysModuleB ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " sysModuleB.ID = BPM_ROLE.SYS_MODULE_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQLBuffer.append(" LEFT JOIN BPM_DOMAIN bpmDomainB ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " bpmDomainB.ID = BPM_ROLE.BPM_DOMAIN_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique BpmRole
     *
     * @param aBpmRole
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(BpmRole aBpmRole) throws Exception {
        if (aBpmRole == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aBpmRole, DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IBpmRole
     *
     * @param aBpmRole
     *
     * @throws Exception
     */
    public void insertBpmRole(BpmRole aBpmRole) throws Exception {
        insert(aBpmRole);
    } // end insertBpmRole()

    /**
     * Batch Insert IBpmRole
     *
     * @param aBpmRole
     *
     * @throws Exception
     */
    public void batchInsertBpmRole(BpmRole[] aBpmRole)
        throws Exception {
        batchInsert(aBpmRole);
    } // end batchInsertBpmRole()

    /**
     * Delete IBpmRole
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteBpmRole(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteBpmRole()

    /**
     * Delete IBpmRole
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteBpmRole(BpmRoleDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteBpmRole()

    /**
     * Update IBpmRole Selective
     *
     * @param aBpmRole
     *
     * @throws Exception
     */
    public void updateBpmRole(BpmRole aBpmRole) throws Exception {
        if (aBpmRole.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aBpmRole);

        BpmRole tempObj = findBpmRoleById(aBpmRole.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aBpmRole, tempObj);
        } // end if
    } // end updateBpmRole()

    /**
     * Batch Update IBpmRole
     *
     * @param aBpmRole
     *
     * @throws Exception
     */
    public void batchUpdateBpmRole(BpmRole[] aBpmRole)
        throws Exception {
        batchUpdate(aBpmRole);
    } // end batchUpdateBpmRole()

    /**
     * Update IBpmRole
     *
     * @param aBpmRole
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateBpmRole(BpmRole aBpmRole, BpmRoleDAOQueryBean aQueryBean)
        throws Exception {
        updateByQuery(aBpmRole, aQueryBean);
    } // end updateBpmRole()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmRole DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(BpmRole aBpmRole) throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmRoles DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmRole(BpmRole[] aBpmRoles,
        BpmRoleDAOQueryBean aQueryBean) throws Exception {
        synchronizeBpmRole(aBpmRoles, aQueryBean, null);
    } // end synchronizeBpmRole()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmRoles DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmRole(BpmRole[] aBpmRoles,
        BpmRoleDAOQueryBean aQueryBean, BpmRoleSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aBpmRoles) == false) {
            inputList.addAll(Arrays.asList(aBpmRoles));
        } // end if

        BpmRole[] existentBpmRoles = this.queryBpmRole(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentBpmRoles) == false) {
            existentList.addAll(Arrays.asList(existentBpmRoles));
        } // end if

        List willAddBpmRoles = ListUtils.subtract(inputList, existentList);

        List willDeleteBpmRoles = ListUtils.subtract(existentList, inputList);

        List willUpdateBpmRoles = ListUtils.intersection(existentList, inputList);

        BpmRole[] willUpdateBpmRoleArray = (BpmRole[]) willUpdateBpmRoles.toArray(new BpmRole[willUpdateBpmRoles.size()]);
        BpmRole[] willAddBpmRoleArray = (BpmRole[]) willAddBpmRoles.toArray(new BpmRole[willAddBpmRoles.size()]);
        BpmRole[] willDeleteBpmRoleArray = (BpmRole[]) willDeleteBpmRoles.toArray(new BpmRole[willDeleteBpmRoles.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddBpmRoleArray,
                willUpdateBpmRoleArray, willDeleteBpmRoleArray);
        } // end if

        if (willUpdateBpmRoles.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateBpmRoleArray);
            } // end if

            this.batchUpdateBpmRole(willUpdateBpmRoleArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateBpmRoleArray);
            } // end if
        } // end if

        if (willAddBpmRoles.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddBpmRoleArray);
            } // end if

            this.batchInsertBpmRole(willAddBpmRoleArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddBpmRoleArray);
            } // end if
        } // end if

        if (willDeleteBpmRoles.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteBpmRoleArray);
            } // end if

            for (int i = 0; i < willDeleteBpmRoleArray.length; i++) {
                BpmRole object = willDeleteBpmRoleArray[i];
                this.deleteBpmRole(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteBpmRoleArray);
            } // end if
        } // end if
    } // end synchronizeBpmRole()

    /**
     * Query IBpmRole
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public BpmRole findBpmRoleById(final long aId) throws Exception {
        BpmRoleDAOQueryBean queryBean = new BpmRoleDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        BpmRole[] BpmRoles = queryBpmRole(queryBean);

        if (BpmRoles.length == 0) {
            return null;
        } // end if
        else {
            return BpmRoles[0];
        } // end else
    } // end findBpmRoleById()

    /**
     * Query IBpmRole
     *
     * @param queryBean
     *
     * @return IBpmRole[]
     *
     * @throws Exception
     */
    public BpmRole[] queryBpmRole(BpmRoleDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean, new JdbcBpmRoleRowMapper());

        return (BpmRole[]) result.toArray(new BpmRole[result.size()]);
    } // end queryBpmRole()

    /**
     * Query BpmRole Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryBpmRoleSelective(BpmRoleDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryBpmRoleSelective()

    /**
     * Query IBpmRole Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryBpmRoleCount(BpmRoleDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryBpmRoleCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcBpmRoleRowMapper implements ParameterizedRowMapper {
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
            BpmRole object = new BpmRole();

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

                Object RoleKey = resultSet.getObject(columnIndex++);

                object.setRoleKeyNull(resultSet.getBoolean(columnIndex++));

                if (RoleKey != null) {
                    BeanUtils.setProperty(object, DataProperty.RoleKey, RoleKey);
                } // end if

                Object RoleName = resultSet.getObject(columnIndex++);

                object.setRoleNameNull(resultSet.getBoolean(columnIndex++));

                if (RoleName != null) {
                    BeanUtils.setProperty(object, DataProperty.RoleName,
                        RoleName);
                } // end if

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object SysModuleId = resultSet.getObject(columnIndex++);

                object.setSysModuleIdNull(resultSet.getBoolean(columnIndex++));

                if (SysModuleId != null) {
                    BeanUtils.setProperty(object, DataProperty.SysModuleId,
                        SysModuleId);
                } // end if

                Object SysModuleName = resultSet.getObject(columnIndex++);

                object.setSysModuleNameNull(resultSet.getBoolean(columnIndex++));

                if (SysModuleName != null) {
                    BeanUtils.setProperty(object, DataProperty.SysModuleName,
                        SysModuleName);
                } // end if

                Object SysModuleCode = resultSet.getObject(columnIndex++);

                object.setSysModuleCodeNull(resultSet.getBoolean(columnIndex++));

                if (SysModuleCode != null) {
                    BeanUtils.setProperty(object, DataProperty.SysModuleCode,
                        SysModuleCode);
                } // end if

                Object BpmDomainId = resultSet.getObject(columnIndex++);

                object.setBpmDomainIdNull(resultSet.getBoolean(columnIndex++));

                if (BpmDomainId != null) {
                    BeanUtils.setProperty(object, DataProperty.BpmDomainId,
                        BpmDomainId);
                } // end if

                Object BpmDomainCode = resultSet.getObject(columnIndex++);

                object.setBpmDomainCodeNull(resultSet.getBoolean(columnIndex++));

                if (BpmDomainCode != null) {
                    BeanUtils.setProperty(object, DataProperty.BpmDomainCode,
                        BpmDomainCode);
                } // end if

                Object BpmDomainName = resultSet.getObject(columnIndex++);

                object.setBpmDomainNameNull(resultSet.getBoolean(columnIndex++));

                if (BpmDomainName != null) {
                    BeanUtils.setProperty(object, DataProperty.BpmDomainName,
                        BpmDomainName);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcBpmRoleRowMapper
} // end BaseBpmRoleDAOJdbcImpl
