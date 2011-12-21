/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao.impl;

import com.ourteam.system.dao.ISysRoleModuleRelateDAO;
import com.ourteam.system.dao.SysRoleModuleRelate;
import com.ourteam.system.dao.SysRoleModuleRelateDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-10-27 09:54:29
 *
 * @author kylin
 */
abstract public class BaseSysRoleModuleRelateDAOJdbcImpl extends AbstractJdbcDAO
    implements ISysRoleModuleRelateDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, ModuleId, Remarks, RoleId, Status
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.ModuleId, DataProperty.Remarks,
            DataProperty.RoleId, DataProperty.Status
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
     * Creates a new BaseSysRoleModuleRelateDAOJdbcImpl object.
     */
    public BaseSysRoleModuleRelateDAOJdbcImpl() {
        super();
    } // end BaseSysRoleModuleRelateDAOJdbcImpl()

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
     * Check Unique SysRoleModuleRelate
     *
     * @param aSysRoleModuleRelate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(SysRoleModuleRelate aSysRoleModuleRelate)
        throws Exception {
        if (aSysRoleModuleRelate == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aSysRoleModuleRelate,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert ISysRoleModuleRelate
     *
     * @param aSysRoleModuleRelate
     *
     * @throws Exception
     */
    public void insertSysRoleModuleRelate(
        SysRoleModuleRelate aSysRoleModuleRelate) throws Exception {
        insert(aSysRoleModuleRelate);
    } // end insertSysRoleModuleRelate()

    /**
     * Batch Insert ISysRoleModuleRelate
     *
     * @param aSysRoleModuleRelate
     *
     * @throws Exception
     */
    public void batchInsertSysRoleModuleRelate(
        SysRoleModuleRelate[] aSysRoleModuleRelate) throws Exception {
        batchInsert(aSysRoleModuleRelate);
    } // end batchInsertSysRoleModuleRelate()

    /**
     * Delete ISysRoleModuleRelate
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteSysRoleModuleRelate(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteSysRoleModuleRelate()

    /**
     * Delete ISysRoleModuleRelate
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteSysRoleModuleRelate(
        SysRoleModuleRelateDAOQueryBean queryBean) throws Exception {
        deleteByQuery(queryBean);
    } // end deleteSysRoleModuleRelate()

    /**
     * Update ISysRoleModuleRelate Selective
     *
     * @param aSysRoleModuleRelate
     *
     * @throws Exception
     */
    public void updateSysRoleModuleRelate(
        SysRoleModuleRelate aSysRoleModuleRelate) throws Exception {
        if (aSysRoleModuleRelate.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aSysRoleModuleRelate);

        SysRoleModuleRelate tempObj = findSysRoleModuleRelateById(aSysRoleModuleRelate.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aSysRoleModuleRelate, tempObj);
        } // end if
    } // end updateSysRoleModuleRelate()

    /**
     * Batch Update ISysRoleModuleRelate
     *
     * @param aSysRoleModuleRelate
     *
     * @throws Exception
     */
    public void batchUpdateSysRoleModuleRelate(
        SysRoleModuleRelate[] aSysRoleModuleRelate) throws Exception {
        batchUpdate(aSysRoleModuleRelate);
    } // end batchUpdateSysRoleModuleRelate()

    /**
     * Update ISysRoleModuleRelate
     *
     * @param aSysRoleModuleRelate
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateSysRoleModuleRelate(
        SysRoleModuleRelate aSysRoleModuleRelate,
        SysRoleModuleRelateDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aSysRoleModuleRelate, aQueryBean);
    } // end updateSysRoleModuleRelate()

    /**
     * DOCUMENT ME!
     *
     * @param aSysRoleModuleRelate DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(SysRoleModuleRelate aSysRoleModuleRelate)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aSysRoleModuleRelates DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysRoleModuleRelate(
        SysRoleModuleRelate[] aSysRoleModuleRelates,
        SysRoleModuleRelateDAOQueryBean aQueryBean) throws Exception {
        synchronizeSysRoleModuleRelate(aSysRoleModuleRelates, aQueryBean, null);
    } // end synchronizeSysRoleModuleRelate()

    /**
     * DOCUMENT ME!
     *
     * @param aSysRoleModuleRelates DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysRoleModuleRelate(
        SysRoleModuleRelate[] aSysRoleModuleRelates,
        SysRoleModuleRelateDAOQueryBean aQueryBean,
        SysRoleModuleRelateSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aSysRoleModuleRelates) == false) {
            inputList.addAll(Arrays.asList(aSysRoleModuleRelates));
        } // end if

        SysRoleModuleRelate[] existentSysRoleModuleRelates = this.querySysRoleModuleRelate(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentSysRoleModuleRelates) == false) {
            existentList.addAll(Arrays.asList(existentSysRoleModuleRelates));
        } // end if

        List willAddSysRoleModuleRelates = ListUtils.subtract(inputList,
                existentList);

        List willDeleteSysRoleModuleRelates = ListUtils.subtract(existentList,
                inputList);

        List willUpdateSysRoleModuleRelates = ListUtils.intersection(existentList,
                inputList);

        SysRoleModuleRelate[] willUpdateSysRoleModuleRelateArray = (SysRoleModuleRelate[]) willUpdateSysRoleModuleRelates.toArray(new SysRoleModuleRelate[willUpdateSysRoleModuleRelates.size()]);
        SysRoleModuleRelate[] willAddSysRoleModuleRelateArray = (SysRoleModuleRelate[]) willAddSysRoleModuleRelates.toArray(new SysRoleModuleRelate[willAddSysRoleModuleRelates.size()]);
        SysRoleModuleRelate[] willDeleteSysRoleModuleRelateArray = (SysRoleModuleRelate[]) willDeleteSysRoleModuleRelates.toArray(new SysRoleModuleRelate[willDeleteSysRoleModuleRelates.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddSysRoleModuleRelateArray,
                willUpdateSysRoleModuleRelateArray,
                willDeleteSysRoleModuleRelateArray);
        } // end if

        if (willUpdateSysRoleModuleRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateSysRoleModuleRelateArray);
            } // end if

            this.batchUpdateSysRoleModuleRelate(willUpdateSysRoleModuleRelateArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateSysRoleModuleRelateArray);
            } // end if
        } // end if

        if (willAddSysRoleModuleRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddSysRoleModuleRelateArray);
            } // end if

            this.batchInsertSysRoleModuleRelate(willAddSysRoleModuleRelateArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddSysRoleModuleRelateArray);
            } // end if
        } // end if

        if (willDeleteSysRoleModuleRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteSysRoleModuleRelateArray);
            } // end if

            for (int i = 0; i < willDeleteSysRoleModuleRelateArray.length;
                    i++) {
                SysRoleModuleRelate object = willDeleteSysRoleModuleRelateArray[i];
                this.deleteSysRoleModuleRelate(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteSysRoleModuleRelateArray);
            } // end if
        } // end if
    } // end synchronizeSysRoleModuleRelate()

    /**
     * Query ISysRoleModuleRelate
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public SysRoleModuleRelate findSysRoleModuleRelateById(final long aId)
        throws Exception {
        SysRoleModuleRelateDAOQueryBean queryBean = new SysRoleModuleRelateDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        SysRoleModuleRelate[] SysRoleModuleRelates = querySysRoleModuleRelate(queryBean);

        if (SysRoleModuleRelates.length == 0) {
            return null;
        } // end if
        else {
            return SysRoleModuleRelates[0];
        } // end else
    } // end findSysRoleModuleRelateById()

    /**
     * Query ISysRoleModuleRelate
     *
     * @param queryBean
     *
     * @return ISysRoleModuleRelate[]
     *
     * @throws Exception
     */
    public SysRoleModuleRelate[] querySysRoleModuleRelate(
        SysRoleModuleRelateDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean,
                new JdbcSysRoleModuleRelateRowMapper());

        return (SysRoleModuleRelate[]) result.toArray(new SysRoleModuleRelate[result.size()]);
    } // end querySysRoleModuleRelate()

    /**
     * Query SysRoleModuleRelate Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] querySysRoleModuleRelateSelective(
        SysRoleModuleRelateDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end querySysRoleModuleRelateSelective()

    /**
     * Query ISysRoleModuleRelate Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int querySysRoleModuleRelateCount(
        SysRoleModuleRelateDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end querySysRoleModuleRelateCount()

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.system.dao.impl.BaseSysModuleDAOJdbcImpl sysModule;

    /**
     * DOCUMENT ME!
     *
     * @param sysModule DOCUMENT ME!
     */
    public void setSysModule(
        com.ourteam.system.dao.impl.BaseSysModuleDAOJdbcImpl sysModule) {
        this.sysModule = sysModule;
    } // end setSysModule()

    /**
     * Query Related ISysModule
     *
     * @param aDaoQueryBean DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="ISysModule" containment="true"
     */
    public com.ourteam.system.dao.SysModule[] querySysModules(
        SysRoleModuleRelateDAOQueryBean aDaoQueryBean)
        throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN SYS_ROLE_MODULE_RELATE ON ( ");

        joinSQL.append(" SYS_MODULE.ID = SYS_ROLE_MODULE_RELATE.MODULE_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.system.dao.ISysModuleDAO.EntityName;

        String[] entityFields = com.ourteam.system.dao.impl.BaseSysModuleDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.system.dao.impl.BaseSysModuleDAOJdbcImpl.ENTITY_PROPERTIES;

        List list = sysModule.query(entityName, entityFields, entityProperties,
                aDaoQueryBean, joinSQL.toString(),
                new com.ourteam.system.dao.impl.BaseSysModuleDAOJdbcImpl.JdbcSysModuleRowMapper());

        return (com.ourteam.system.dao.SysModule[]) list.toArray(new com.ourteam.system.dao.SysModule[list.size()]);
    } // end querySysModules()

    /**
     * Query SysRoleModuleRelate Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] querySysModulesSelective(
        SysRoleModuleRelateDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysModuleDAO.Id,
                "id");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysModuleDAO.ModuleCode,
                "moduleCode");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysModuleDAO.ModuleName,
                "moduleName");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysModuleDAO.ParentModuleId,
                "parentModuleId");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysModuleDAO.Remarks,
                "remarks");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysModuleDAO.Status,
                "status");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysModuleDAO.DomainId,
                "domainId");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysModuleDAO.ModuleIcon,
                "moduleIcon");

            aQueryBean.addSelectProperty(com.ourteam.system.dao.ISysModuleDAO.SortIndex,
                "sortIndex");
        } // end if

        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN SYS_ROLE_MODULE_RELATE ON ( ");

        joinSQL.append(" SYS_MODULE.ID = SYS_ROLE_MODULE_RELATE.MODULE_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.system.dao.ISysModuleDAO.EntityName;

        return sysModule.querySelective(entityName, aQueryBean,
            joinSQL.toString());
    } // end querySysModulesSelective()

    /**
     * Update Related ISysModule
     *
     * @param aSysModule {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void updateSysModule(com.ourteam.system.dao.SysModule aSysModule,
        SysRoleModuleRelateDAOQueryBean aQueryBean) throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN SYS_ROLE_MODULE_RELATE ON ( ");

        joinSQL.append(" SYS_MODULE.ID = SYS_ROLE_MODULE_RELATE.MODULE_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.system.dao.ISysModuleDAO.EntityName;

        String[] entityFields = com.ourteam.system.dao.impl.BaseSysModuleDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.system.dao.impl.BaseSysModuleDAOJdbcImpl.ENTITY_PROPERTIES;

        sysModule.updateByQuery(entityName, entityFields, entityProperties,
            joinSQL.toString(), aSysModule, aQueryBean);
    } // end updateSysModule()

    /**
     * Delete Related ISysModule
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void deleteSysModule(SysRoleModuleRelateDAOQueryBean aQueryBean)
        throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN SYS_ROLE_MODULE_RELATE ON ( ");

        joinSQL.append(" SYS_MODULE.ID = SYS_ROLE_MODULE_RELATE.MODULE_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.system.dao.ISysModuleDAO.EntityName;

        sysModule.deleteByQuery(entityName, joinSQL.toString(), aQueryBean);
    } // end deleteSysModule()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcSysRoleModuleRelateRowMapper
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
            SysRoleModuleRelate object = new SysRoleModuleRelate();

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

                Object Remarks = resultSet.getObject(columnIndex++);

                object.setRemarksNull(resultSet.getBoolean(columnIndex++));

                if (Remarks != null) {
                    BeanUtils.setProperty(object, DataProperty.Remarks, Remarks);
                } // end if

                Object RoleId = resultSet.getObject(columnIndex++);

                object.setRoleIdNull(resultSet.getBoolean(columnIndex++));

                if (RoleId != null) {
                    BeanUtils.setProperty(object, DataProperty.RoleId, RoleId);
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
    } // end JdbcSysRoleModuleRelateRowMapper
} // end BaseSysRoleModuleRelateDAOJdbcImpl
