/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao.impl;

import com.ourteam.system.dao.ISysModuleDAO;
import com.ourteam.system.dao.SysModule;
import com.ourteam.system.dao.SysModuleDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-09-30 13:37:53
 *
 * @author kylin
 */
abstract public class BaseSysModuleDAOJdbcImpl extends AbstractJdbcDAO
    implements ISysModuleDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, ModuleCode, ModuleName, ParentModuleId, Remarks, Status,
            DomainId, ModuleIcon, SortIndex
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.ModuleCode, DataProperty.ModuleName,
            DataProperty.ParentModuleId, DataProperty.Remarks,
            DataProperty.Status, DataProperty.DomainId, DataProperty.ModuleIcon,
            DataProperty.SortIndex
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
     * Creates a new BaseSysModuleDAOJdbcImpl object.
     */
    public BaseSysModuleDAOJdbcImpl() {
        super();
    } // end BaseSysModuleDAOJdbcImpl()

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
     * Check Unique SysModule
     *
     * @param aSysModule
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(SysModule aSysModule)
        throws Exception {
        if (aSysModule == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aSysModule, DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert ISysModule
     *
     * @param aSysModule
     *
     * @throws Exception
     */
    public void insertSysModule(SysModule aSysModule) throws Exception {
        insert(aSysModule);
    } // end insertSysModule()

    /**
     * Batch Insert ISysModule
     *
     * @param aSysModule
     *
     * @throws Exception
     */
    public void batchInsertSysModule(SysModule[] aSysModule)
        throws Exception {
        batchInsert(aSysModule);
    } // end batchInsertSysModule()

    /**
     * Delete ISysModule
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteSysModule(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteSysModule()

    /**
     * Delete ISysModule
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteSysModule(SysModuleDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteSysModule()

    /**
     * Update ISysModule Selective
     *
     * @param aSysModule
     *
     * @throws Exception
     */
    public void updateSysModule(SysModule aSysModule) throws Exception {
        if (aSysModule.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aSysModule);

        SysModule tempObj = findSysModuleById(aSysModule.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aSysModule, tempObj);
        } // end if
    } // end updateSysModule()

    /**
     * Batch Update ISysModule
     *
     * @param aSysModule
     *
     * @throws Exception
     */
    public void batchUpdateSysModule(SysModule[] aSysModule)
        throws Exception {
        batchUpdate(aSysModule);
    } // end batchUpdateSysModule()

    /**
     * Update ISysModule
     *
     * @param aSysModule
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateSysModule(SysModule aSysModule,
        SysModuleDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aSysModule, aQueryBean);
    } // end updateSysModule()

    /**
     * DOCUMENT ME!
     *
     * @param aSysModule DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(SysModule aSysModule)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aSysModules DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysModule(SysModule[] aSysModules,
        SysModuleDAOQueryBean aQueryBean) throws Exception {
        synchronizeSysModule(aSysModules, aQueryBean, null);
    } // end synchronizeSysModule()

    /**
     * DOCUMENT ME!
     *
     * @param aSysModules DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysModule(SysModule[] aSysModules,
        SysModuleDAOQueryBean aQueryBean, SysModuleSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aSysModules) == false) {
            inputList.addAll(Arrays.asList(aSysModules));
        } // end if

        SysModule[] existentSysModules = this.querySysModule(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentSysModules) == false) {
            existentList.addAll(Arrays.asList(existentSysModules));
        } // end if

        List willAddSysModules = ListUtils.subtract(inputList, existentList);

        List willDeleteSysModules = ListUtils.subtract(existentList, inputList);

        List willUpdateSysModules = ListUtils.intersection(existentList,
                inputList);

        SysModule[] willUpdateSysModuleArray = (SysModule[]) willUpdateSysModules.toArray(new SysModule[willUpdateSysModules.size()]);
        SysModule[] willAddSysModuleArray = (SysModule[]) willAddSysModules.toArray(new SysModule[willAddSysModules.size()]);
        SysModule[] willDeleteSysModuleArray = (SysModule[]) willDeleteSysModules.toArray(new SysModule[willDeleteSysModules.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddSysModuleArray,
                willUpdateSysModuleArray, willDeleteSysModuleArray);
        } // end if

        if (willUpdateSysModules.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateSysModuleArray);
            } // end if

            this.batchUpdateSysModule(willUpdateSysModuleArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateSysModuleArray);
            } // end if
        } // end if

        if (willAddSysModules.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddSysModuleArray);
            } // end if

            this.batchInsertSysModule(willAddSysModuleArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddSysModuleArray);
            } // end if
        } // end if

        if (willDeleteSysModules.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteSysModuleArray);
            } // end if

            for (int i = 0; i < willDeleteSysModuleArray.length; i++) {
                SysModule object = willDeleteSysModuleArray[i];
                this.deleteSysModule(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteSysModuleArray);
            } // end if
        } // end if
    } // end synchronizeSysModule()

    /**
     * Query ISysModule
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public SysModule findSysModuleById(final long aId)
        throws Exception {
        SysModuleDAOQueryBean queryBean = new SysModuleDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        SysModule[] SysModules = querySysModule(queryBean);

        if (SysModules.length == 0) {
            return null;
        } // end if
        else {
            return SysModules[0];
        } // end else
    } // end findSysModuleById()

    /**
     * Query ISysModule
     *
     * @param queryBean
     *
     * @return ISysModule[]
     *
     * @throws Exception
     */
    public SysModule[] querySysModule(SysModuleDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean, new JdbcSysModuleRowMapper());

        return (SysModule[]) result.toArray(new SysModule[result.size()]);
    } // end querySysModule()

    /**
     * Query SysModule Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] querySysModuleSelective(SysModuleDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end querySysModuleSelective()

    /**
     * Query ISysModule Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int querySysModuleCount(SysModuleDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end querySysModuleCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcSysModuleRowMapper implements ParameterizedRowMapper {
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
            SysModule object = new SysModule();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
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

                Object ParentModuleId = resultSet.getObject(columnIndex++);

                object.setParentModuleIdNull(resultSet.getBoolean(columnIndex++));

                if (ParentModuleId != null) {
                    BeanUtils.setProperty(object, DataProperty.ParentModuleId,
                        ParentModuleId);
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

                Object DomainId = resultSet.getObject(columnIndex++);

                object.setDomainIdNull(resultSet.getBoolean(columnIndex++));

                if (DomainId != null) {
                    BeanUtils.setProperty(object, DataProperty.DomainId,
                        DomainId);
                } // end if

                Object ModuleIcon = resultSet.getObject(columnIndex++);

                object.setModuleIconNull(resultSet.getBoolean(columnIndex++));

                if (ModuleIcon != null) {
                    BeanUtils.setProperty(object, DataProperty.ModuleIcon,
                        ModuleIcon);
                } // end if

                Object SortIndex = resultSet.getObject(columnIndex++);

                object.setSortIndexNull(resultSet.getBoolean(columnIndex++));

                if (SortIndex != null) {
                    BeanUtils.setProperty(object, DataProperty.SortIndex,
                        SortIndex);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcSysModuleRowMapper
} // end BaseSysModuleDAOJdbcImpl
