/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao.impl;

import com.ourteam.system.dao.ISysRoleResourceRelateDAO;
import com.ourteam.system.dao.SysRoleResourceRelate;
import com.ourteam.system.dao.SysRoleResourceRelateDAOQueryBean;

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
 * 系统角色与资源关联 DAO JDBC Impl Generate Date : 2011-06-10 22:45:10
 *
 * @author Kylin
 */
abstract public class BaseSysRoleResourceRelateDAOJdbcImpl
    extends AbstractJdbcDAO implements ISysRoleResourceRelateDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, RelateCode, RelateName, Remarks, Status, SysResourceId,
            SysRoleId, SysResourceTitleKey, SysRoleName
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.RelateCode, DataProperty.RelateName,
            DataProperty.Remarks, DataProperty.Status,
            DataProperty.SysResourceId, DataProperty.SysRoleId,
            DataProperty.SysResourceTitleKey, DataProperty.SysRoleName
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
     * Creates a new BaseSysRoleResourceRelateDAOJdbcImpl object.
     */
    public BaseSysRoleResourceRelateDAOJdbcImpl() {
        super();
    } // end BaseSysRoleResourceRelateDAOJdbcImpl()

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

            relatedJoinSQLBuffer.append(" LEFT JOIN SYS_ROLE sysRole ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " sysRole.ID = SYS_ROLE_RESOURCE_RELATE.SYS_ROLE_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQLBuffer.append(" LEFT JOIN SYS_RESOURCE sysResource ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " sysResource.ID = SYS_ROLE_RESOURCE_RELATE.SYS_RESOURCE_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique SysRoleResourceRelate
     *
     * @param aSysRoleResourceRelate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(SysRoleResourceRelate aSysRoleResourceRelate)
        throws Exception {
        if (aSysRoleResourceRelate == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aSysRoleResourceRelate,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert ISysRoleResourceRelate
     *
     * @param aSysRoleResourceRelate
     *
     * @throws Exception
     */
    public void insertSysRoleResourceRelate(
        SysRoleResourceRelate aSysRoleResourceRelate) throws Exception {
        insert(aSysRoleResourceRelate);
    } // end insertSysRoleResourceRelate()

    /**
     * Batch Insert ISysRoleResourceRelate
     *
     * @param aSysRoleResourceRelate
     *
     * @throws Exception
     */
    public void batchInsertSysRoleResourceRelate(
        SysRoleResourceRelate[] aSysRoleResourceRelate)
        throws Exception {
        batchInsert(aSysRoleResourceRelate);
    } // end batchInsertSysRoleResourceRelate()

    /**
     * Delete ISysRoleResourceRelate
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteSysRoleResourceRelate(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteSysRoleResourceRelate()

    /**
     * Delete ISysRoleResourceRelate
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteSysRoleResourceRelate(
        SysRoleResourceRelateDAOQueryBean queryBean) throws Exception {
        deleteByQuery(queryBean);
    } // end deleteSysRoleResourceRelate()

    /**
     * Update ISysRoleResourceRelate Selective
     *
     * @param aSysRoleResourceRelate
     *
     * @throws Exception
     */
    public void updateSysRoleResourceRelate(
        SysRoleResourceRelate aSysRoleResourceRelate) throws Exception {
        if (aSysRoleResourceRelate.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aSysRoleResourceRelate);

        SysRoleResourceRelate tempObj = findSysRoleResourceRelateById(aSysRoleResourceRelate.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aSysRoleResourceRelate, tempObj);
        } // end if
    } // end updateSysRoleResourceRelate()

    /**
     * Batch Update ISysRoleResourceRelate
     *
     * @param aSysRoleResourceRelate
     *
     * @throws Exception
     */
    public void batchUpdateSysRoleResourceRelate(
        SysRoleResourceRelate[] aSysRoleResourceRelate)
        throws Exception {
        batchUpdate(aSysRoleResourceRelate);
    } // end batchUpdateSysRoleResourceRelate()

    /**
     * Update ISysRoleResourceRelate
     *
     * @param aSysRoleResourceRelate
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateSysRoleResourceRelate(
        SysRoleResourceRelate aSysRoleResourceRelate,
        SysRoleResourceRelateDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aSysRoleResourceRelate, aQueryBean);
    } // end updateSysRoleResourceRelate()

    /**
     * DOCUMENT ME!
     *
     * @param aSysRoleResourceRelate DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(SysRoleResourceRelate aSysRoleResourceRelate)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aSysRoleResourceRelates DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysRoleResourceRelate(
        SysRoleResourceRelate[] aSysRoleResourceRelates,
        SysRoleResourceRelateDAOQueryBean aQueryBean) throws Exception {
        synchronizeSysRoleResourceRelate(aSysRoleResourceRelates, aQueryBean,
            null);
    } // end synchronizeSysRoleResourceRelate()

    /**
     * DOCUMENT ME!
     *
     * @param aSysRoleResourceRelates DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysRoleResourceRelate(
        SysRoleResourceRelate[] aSysRoleResourceRelates,
        SysRoleResourceRelateDAOQueryBean aQueryBean,
        SysRoleResourceRelateSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aSysRoleResourceRelates) == false) {
            inputList.addAll(Arrays.asList(aSysRoleResourceRelates));
        } // end if

        SysRoleResourceRelate[] existentSysRoleResourceRelates = this.querySysRoleResourceRelate(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentSysRoleResourceRelates) == false) {
            existentList.addAll(Arrays.asList(existentSysRoleResourceRelates));
        } // end if

        List willAddSysRoleResourceRelates = ListUtils.subtract(inputList,
                existentList);

        List willDeleteSysRoleResourceRelates = ListUtils.subtract(existentList,
                inputList);

        List willUpdateSysRoleResourceRelates = ListUtils.intersection(existentList,
                inputList);

        SysRoleResourceRelate[] willUpdateSysRoleResourceRelateArray = (SysRoleResourceRelate[]) willUpdateSysRoleResourceRelates.toArray(new SysRoleResourceRelate[willUpdateSysRoleResourceRelates.size()]);
        SysRoleResourceRelate[] willAddSysRoleResourceRelateArray = (SysRoleResourceRelate[]) willAddSysRoleResourceRelates.toArray(new SysRoleResourceRelate[willAddSysRoleResourceRelates.size()]);
        SysRoleResourceRelate[] willDeleteSysRoleResourceRelateArray = (SysRoleResourceRelate[]) willDeleteSysRoleResourceRelates.toArray(new SysRoleResourceRelate[willDeleteSysRoleResourceRelates.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddSysRoleResourceRelateArray,
                willUpdateSysRoleResourceRelateArray,
                willDeleteSysRoleResourceRelateArray);
        } // end if

        if (willUpdateSysRoleResourceRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateSysRoleResourceRelateArray);
            } // end if

            this.batchUpdateSysRoleResourceRelate(willUpdateSysRoleResourceRelateArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateSysRoleResourceRelateArray);
            } // end if
        } // end if

        if (willAddSysRoleResourceRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddSysRoleResourceRelateArray);
            } // end if

            this.batchInsertSysRoleResourceRelate(willAddSysRoleResourceRelateArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddSysRoleResourceRelateArray);
            } // end if
        } // end if

        if (willDeleteSysRoleResourceRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteSysRoleResourceRelateArray);
            } // end if

            for (int i = 0; i < willDeleteSysRoleResourceRelateArray.length;
                    i++) {
                SysRoleResourceRelate object = willDeleteSysRoleResourceRelateArray[i];
                this.deleteSysRoleResourceRelate(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteSysRoleResourceRelateArray);
            } // end if
        } // end if
    } // end synchronizeSysRoleResourceRelate()

    /**
     * Query ISysRoleResourceRelate
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public SysRoleResourceRelate findSysRoleResourceRelateById(final long aId)
        throws Exception {
        SysRoleResourceRelateDAOQueryBean queryBean = new SysRoleResourceRelateDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        SysRoleResourceRelate[] SysRoleResourceRelates = querySysRoleResourceRelate(queryBean);

        if (SysRoleResourceRelates.length == 0) {
            return null;
        } // end if
        else {
            return SysRoleResourceRelates[0];
        } // end else
    } // end findSysRoleResourceRelateById()

    /**
     * Query ISysRoleResourceRelate
     *
     * @param queryBean
     *
     * @return ISysRoleResourceRelate[]
     *
     * @throws Exception
     */
    public SysRoleResourceRelate[] querySysRoleResourceRelate(
        SysRoleResourceRelateDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean,
                new JdbcSysRoleResourceRelateRowMapper());

        return (SysRoleResourceRelate[]) result.toArray(new SysRoleResourceRelate[result.size()]);
    } // end querySysRoleResourceRelate()

    /**
     * Query SysRoleResourceRelate Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] querySysRoleResourceRelateSelective(
        SysRoleResourceRelateDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end querySysRoleResourceRelateSelective()

    /**
     * Query ISysRoleResourceRelate Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int querySysRoleResourceRelateCount(
        SysRoleResourceRelateDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end querySysRoleResourceRelateCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcSysRoleResourceRelateRowMapper
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
            SysRoleResourceRelate object = new SysRoleResourceRelate();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object RelateCode = resultSet.getObject(columnIndex++);

                object.setRelateCodeNull(resultSet.getBoolean(columnIndex++));

                if (RelateCode != null) {
                    BeanUtils.setProperty(object, DataProperty.RelateCode,
                        RelateCode);
                } // end if

                Object RelateName = resultSet.getObject(columnIndex++);

                object.setRelateNameNull(resultSet.getBoolean(columnIndex++));

                if (RelateName != null) {
                    BeanUtils.setProperty(object, DataProperty.RelateName,
                        RelateName);
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

                Object SysResourceId = resultSet.getObject(columnIndex++);

                object.setSysResourceIdNull(resultSet.getBoolean(columnIndex++));

                if (SysResourceId != null) {
                    BeanUtils.setProperty(object, DataProperty.SysResourceId,
                        SysResourceId);
                } // end if

                Object SysRoleId = resultSet.getObject(columnIndex++);

                object.setSysRoleIdNull(resultSet.getBoolean(columnIndex++));

                if (SysRoleId != null) {
                    BeanUtils.setProperty(object, DataProperty.SysRoleId,
                        SysRoleId);
                } // end if

                Object SysResourceTitleKey = resultSet.getObject(columnIndex++);

                object.setSysResourceTitleKeyNull(resultSet.getBoolean(
                        columnIndex++));

                if (SysResourceTitleKey != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.SysResourceTitleKey, SysResourceTitleKey);
                } // end if

                Object SysRoleName = resultSet.getObject(columnIndex++);

                object.setSysRoleNameNull(resultSet.getBoolean(columnIndex++));

                if (SysRoleName != null) {
                    BeanUtils.setProperty(object, DataProperty.SysRoleName,
                        SysRoleName);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcSysRoleResourceRelateRowMapper
} // end BaseSysRoleResourceRelateDAOJdbcImpl
