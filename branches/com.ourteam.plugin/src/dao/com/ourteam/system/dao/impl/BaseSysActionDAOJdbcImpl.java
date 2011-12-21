/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao.impl;

import com.ourteam.system.dao.ISysActionDAO;
import com.ourteam.system.dao.SysAction;
import com.ourteam.system.dao.SysActionDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-11-07 10:18:38
 *
 * @author kylin
 */
abstract public class BaseSysActionDAOJdbcImpl extends AbstractJdbcDAO
    implements ISysActionDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, ModuleId, ActionCode, ActionName, DomainId, Remarks, Status,
            DomainCode, DomainName, ModuleCode, ModuleName
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.ModuleId, DataProperty.ActionCode,
            DataProperty.ActionName, DataProperty.DomainId, DataProperty.Remarks,
            DataProperty.Status, DataProperty.DomainCode,
            DataProperty.DomainName, DataProperty.ModuleCode,
            DataProperty.ModuleName
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
     * Creates a new BaseSysActionDAOJdbcImpl object.
     */
    public BaseSysActionDAOJdbcImpl() {
        super();
    } // end BaseSysActionDAOJdbcImpl()

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

            relatedJoinSQLBuffer.append(" LEFT JOIN SYS_DOMAIN sysDomainA ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " sysDomainA.ID = SYS_ACTION.DOMAIN_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQLBuffer.append(" LEFT JOIN SYS_MODULE sysModuleA ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " sysModuleA.ID = SYS_ACTION.MODULE_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique SysAction
     *
     * @param aSysAction
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(SysAction aSysAction)
        throws Exception {
        if (aSysAction == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aSysAction, DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert ISysAction
     *
     * @param aSysAction
     *
     * @throws Exception
     */
    public void insertSysAction(SysAction aSysAction) throws Exception {
        insert(aSysAction);
    } // end insertSysAction()

    /**
     * Batch Insert ISysAction
     *
     * @param aSysAction
     *
     * @throws Exception
     */
    public void batchInsertSysAction(SysAction[] aSysAction)
        throws Exception {
        batchInsert(aSysAction);
    } // end batchInsertSysAction()

    /**
     * Delete ISysAction
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteSysAction(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteSysAction()

    /**
     * Delete ISysAction
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteSysAction(SysActionDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteSysAction()

    /**
     * Update ISysAction Selective
     *
     * @param aSysAction
     *
     * @throws Exception
     */
    public void updateSysAction(SysAction aSysAction) throws Exception {
        if (aSysAction.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aSysAction);

        SysAction tempObj = findSysActionById(aSysAction.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aSysAction, tempObj);
        } // end if
    } // end updateSysAction()

    /**
     * Batch Update ISysAction
     *
     * @param aSysAction
     *
     * @throws Exception
     */
    public void batchUpdateSysAction(SysAction[] aSysAction)
        throws Exception {
        batchUpdate(aSysAction);
    } // end batchUpdateSysAction()

    /**
     * Update ISysAction
     *
     * @param aSysAction
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateSysAction(SysAction aSysAction,
        SysActionDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aSysAction, aQueryBean);
    } // end updateSysAction()

    /**
     * DOCUMENT ME!
     *
     * @param aSysAction DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(SysAction aSysAction)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aSysActions DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysAction(SysAction[] aSysActions,
        SysActionDAOQueryBean aQueryBean) throws Exception {
        synchronizeSysAction(aSysActions, aQueryBean, null);
    } // end synchronizeSysAction()

    /**
     * DOCUMENT ME!
     *
     * @param aSysActions DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysAction(SysAction[] aSysActions,
        SysActionDAOQueryBean aQueryBean, SysActionSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aSysActions) == false) {
            inputList.addAll(Arrays.asList(aSysActions));
        } // end if

        SysAction[] existentSysActions = this.querySysAction(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentSysActions) == false) {
            existentList.addAll(Arrays.asList(existentSysActions));
        } // end if

        List willAddSysActions = ListUtils.subtract(inputList, existentList);

        List willDeleteSysActions = ListUtils.subtract(existentList, inputList);

        List willUpdateSysActions = ListUtils.intersection(existentList,
                inputList);

        SysAction[] willUpdateSysActionArray = (SysAction[]) willUpdateSysActions.toArray(new SysAction[willUpdateSysActions.size()]);
        SysAction[] willAddSysActionArray = (SysAction[]) willAddSysActions.toArray(new SysAction[willAddSysActions.size()]);
        SysAction[] willDeleteSysActionArray = (SysAction[]) willDeleteSysActions.toArray(new SysAction[willDeleteSysActions.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddSysActionArray,
                willUpdateSysActionArray, willDeleteSysActionArray);
        } // end if

        if (willUpdateSysActions.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateSysActionArray);
            } // end if

            this.batchUpdateSysAction(willUpdateSysActionArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateSysActionArray);
            } // end if
        } // end if

        if (willAddSysActions.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddSysActionArray);
            } // end if

            this.batchInsertSysAction(willAddSysActionArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddSysActionArray);
            } // end if
        } // end if

        if (willDeleteSysActions.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteSysActionArray);
            } // end if

            for (int i = 0; i < willDeleteSysActionArray.length; i++) {
                SysAction object = willDeleteSysActionArray[i];
                this.deleteSysAction(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteSysActionArray);
            } // end if
        } // end if
    } // end synchronizeSysAction()

    /**
     * Query ISysAction
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public SysAction findSysActionById(final long aId)
        throws Exception {
        SysActionDAOQueryBean queryBean = new SysActionDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        SysAction[] SysActions = querySysAction(queryBean);

        if (SysActions.length == 0) {
            return null;
        } // end if
        else {
            return SysActions[0];
        } // end else
    } // end findSysActionById()

    /**
     * Query ISysAction
     *
     * @param queryBean
     *
     * @return ISysAction[]
     *
     * @throws Exception
     */
    public SysAction[] querySysAction(SysActionDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean, new JdbcSysActionRowMapper());

        return (SysAction[]) result.toArray(new SysAction[result.size()]);
    } // end querySysAction()

    /**
     * Query SysAction Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] querySysActionSelective(SysActionDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end querySysActionSelective()

    /**
     * Query ISysAction Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int querySysActionCount(SysActionDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end querySysActionCount()

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.system.dao.impl.BaseSysRoleActionRelateDAOJdbcImpl sysRoleActionRelate;

    /**
     * DOCUMENT ME!
     *
     * @param sysRoleActionRelate DOCUMENT ME!
     */
    public void setSysRoleActionRelate(
        com.ourteam.system.dao.impl.BaseSysRoleActionRelateDAOJdbcImpl sysRoleActionRelate) {
        this.sysRoleActionRelate = sysRoleActionRelate;
    } // end setSysRoleActionRelate()

    /**
     * Query Related ISysRoleActionRelate
     *
     * @param aDaoQueryBean DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="ISysRoleActionRelate" containment="true"
     */
    public com.ourteam.system.dao.SysRoleActionRelate[] querySysRoleActionRelates(
        SysActionDAOQueryBean aDaoQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN SYS_ACTION ON ( ");

        joinSQL.append(" SYS_ROLE_ACTION_RELATE.ACTION_ID = SYS_ACTION.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.system.dao.ISysRoleActionRelateDAO.EntityName;

        String[] entityFields = com.ourteam.system.dao.impl.BaseSysRoleActionRelateDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.system.dao.impl.BaseSysRoleActionRelateDAOJdbcImpl.ENTITY_PROPERTIES;

        List list = sysRoleActionRelate.query(entityName, entityFields,
                entityProperties, aDaoQueryBean, joinSQL.toString(),
                new com.ourteam.system.dao.impl.BaseSysRoleActionRelateDAOJdbcImpl.JdbcSysRoleActionRelateRowMapper());

        return (com.ourteam.system.dao.SysRoleActionRelate[]) list.toArray(new com.ourteam.system.dao.SysRoleActionRelate[list.size()]);
    } // end querySysRoleActionRelates()

    /**
     * Query SysAction Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] querySysRoleActionRelatesSelective(
        SysActionDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysRoleActionRelateDAO.Id,
                "id");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysRoleActionRelateDAO.ActionId,
                "actionId");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysRoleActionRelateDAO.Remarks,
                "remarks");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysRoleActionRelateDAO.RoleId,
                "roleId");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysRoleActionRelateDAO.Status,
                "status");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysRoleActionRelateDAO.ActionCode,
                "actionCode");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysRoleActionRelateDAO.ActionName,
                "actionName");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysRoleActionRelateDAO.DomainId,
                "domainId");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysRoleActionRelateDAO.DomainName,
                "domainName");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysRoleActionRelateDAO.DomainCode,
                "domainCode");
        } // end if

        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN SYS_ACTION ON ( ");

        joinSQL.append(" SYS_ROLE_ACTION_RELATE.ACTION_ID = SYS_ACTION.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.system.dao.ISysRoleActionRelateDAO.EntityName;

        return sysRoleActionRelate.querySelective(entityName, aQueryBean,
            joinSQL.toString());
    } // end querySysRoleActionRelatesSelective()

    /**
     * Update Related ISysRoleActionRelate
     *
     * @param aSysRoleActionRelate {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void updateSysRoleActionRelate(
        com.ourteam.system.dao.SysRoleActionRelate aSysRoleActionRelate,
        SysActionDAOQueryBean aQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN SYS_ACTION ON ( ");

        joinSQL.append(" SYS_ROLE_ACTION_RELATE.ACTION_ID = SYS_ACTION.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.system.dao.ISysRoleActionRelateDAO.EntityName;

        String[] entityFields = com.ourteam.system.dao.impl.BaseSysRoleActionRelateDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.system.dao.impl.BaseSysRoleActionRelateDAOJdbcImpl.ENTITY_PROPERTIES;

        sysRoleActionRelate.updateByQuery(entityName, entityFields,
            entityProperties, joinSQL.toString(), aSysRoleActionRelate,
            aQueryBean);
    } // end updateSysRoleActionRelate()

    /**
     * Delete Related ISysRoleActionRelate
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void deleteSysRoleActionRelate(SysActionDAOQueryBean aQueryBean)
        throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN SYS_ACTION ON ( ");

        joinSQL.append(" SYS_ROLE_ACTION_RELATE.ACTION_ID = SYS_ACTION.ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.system.dao.ISysRoleActionRelateDAO.EntityName;

        sysRoleActionRelate.deleteByQuery(entityName, joinSQL.toString(),
            aQueryBean);
    } // end deleteSysRoleActionRelate()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcSysActionRowMapper implements ParameterizedRowMapper {
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
            SysAction object = new SysAction();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object ModuleId = resultSet.getObject(columnIndex++);

                object.setModuleIdNull(resultSet.getBoolean(columnIndex++));

                if (ModuleId != null) {
                    BeanUtils.setProperty(object, DataProperty.ModuleId,
                        ModuleId);
                } // end if

                Object ActionCode = resultSet.getObject(columnIndex++);

                object.setActionCodeNull(resultSet.getBoolean(columnIndex++));

                if (ActionCode != null) {
                    BeanUtils.setProperty(object, DataProperty.ActionCode,
                        ActionCode);
                } // end if

                Object ActionName = resultSet.getObject(columnIndex++);

                object.setActionNameNull(resultSet.getBoolean(columnIndex++));

                if (ActionName != null) {
                    BeanUtils.setProperty(object, DataProperty.ActionName,
                        ActionName);
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

                Object DomainCode = resultSet.getObject(columnIndex++);

                object.setDomainCodeNull(resultSet.getBoolean(columnIndex++));

                if (DomainCode != null) {
                    BeanUtils.setProperty(object, DataProperty.DomainCode,
                        DomainCode);
                } // end if

                Object DomainName = resultSet.getObject(columnIndex++);

                object.setDomainNameNull(resultSet.getBoolean(columnIndex++));

                if (DomainName != null) {
                    BeanUtils.setProperty(object, DataProperty.DomainName,
                        DomainName);
                } // end if

                Object ModuleCode = resultSet.getObject(columnIndex++);

                object.setModuleCodeNull(resultSet.getBoolean(columnIndex++));

                if (ModuleCode != null) {
                    BeanUtils.setProperty(object, DataProperty.ModuleCode,
                        ModuleCode);
                } // end if

                Object ModuleName = resultSet.getObject(columnIndex++);

                object.setModuleNameNull(resultSet.getBoolean(columnIndex++));

                if (ModuleName != null) {
                    BeanUtils.setProperty(object, DataProperty.ModuleName,
                        ModuleName);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcSysActionRowMapper
} // end BaseSysActionDAOJdbcImpl
