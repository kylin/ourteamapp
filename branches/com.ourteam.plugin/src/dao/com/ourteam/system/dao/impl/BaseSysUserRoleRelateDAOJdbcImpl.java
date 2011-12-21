/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao.impl;

import com.ourteam.system.dao.ISysUserRoleRelateDAO;
import com.ourteam.system.dao.SysUserRoleRelate;
import com.ourteam.system.dao.SysUserRoleRelateDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-11-07 10:15:24
 *
 * @author kylin
 */
abstract public class BaseSysUserRoleRelateDAOJdbcImpl extends AbstractJdbcDAO
    implements ISysUserRoleRelateDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, ExpiredDate, Remarks, RoleId, RoleType, Status, UserId, RoleCode,
            RoleName
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.ExpiredDate, DataProperty.Remarks,
            DataProperty.RoleId, DataProperty.RoleType, DataProperty.Status,
            DataProperty.UserId, DataProperty.RoleCode, DataProperty.RoleName
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
     * Creates a new BaseSysUserRoleRelateDAOJdbcImpl object.
     */
    public BaseSysUserRoleRelateDAOJdbcImpl() {
        super();
    } // end BaseSysUserRoleRelateDAOJdbcImpl()

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

            relatedJoinSQLBuffer.append(" LEFT JOIN SYS_ROLE sysRoleE ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " sysRoleE.ID = SYS_USER_ROLE_RELATE.ROLE_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique SysUserRoleRelate
     *
     * @param aSysUserRoleRelate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(SysUserRoleRelate aSysUserRoleRelate)
        throws Exception {
        if (aSysUserRoleRelate == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aSysUserRoleRelate,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert ISysUserRoleRelate
     *
     * @param aSysUserRoleRelate
     *
     * @throws Exception
     */
    public void insertSysUserRoleRelate(SysUserRoleRelate aSysUserRoleRelate)
        throws Exception {
        insert(aSysUserRoleRelate);
    } // end insertSysUserRoleRelate()

    /**
     * Batch Insert ISysUserRoleRelate
     *
     * @param aSysUserRoleRelate
     *
     * @throws Exception
     */
    public void batchInsertSysUserRoleRelate(
        SysUserRoleRelate[] aSysUserRoleRelate) throws Exception {
        batchInsert(aSysUserRoleRelate);
    } // end batchInsertSysUserRoleRelate()

    /**
     * Delete ISysUserRoleRelate
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteSysUserRoleRelate(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteSysUserRoleRelate()

    /**
     * Delete ISysUserRoleRelate
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteSysUserRoleRelate(SysUserRoleRelateDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteSysUserRoleRelate()

    /**
     * Update ISysUserRoleRelate Selective
     *
     * @param aSysUserRoleRelate
     *
     * @throws Exception
     */
    public void updateSysUserRoleRelate(SysUserRoleRelate aSysUserRoleRelate)
        throws Exception {
        if (aSysUserRoleRelate.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aSysUserRoleRelate);

        SysUserRoleRelate tempObj = findSysUserRoleRelateById(aSysUserRoleRelate.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aSysUserRoleRelate, tempObj);
        } // end if
    } // end updateSysUserRoleRelate()

    /**
     * Batch Update ISysUserRoleRelate
     *
     * @param aSysUserRoleRelate
     *
     * @throws Exception
     */
    public void batchUpdateSysUserRoleRelate(
        SysUserRoleRelate[] aSysUserRoleRelate) throws Exception {
        batchUpdate(aSysUserRoleRelate);
    } // end batchUpdateSysUserRoleRelate()

    /**
     * Update ISysUserRoleRelate
     *
     * @param aSysUserRoleRelate
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateSysUserRoleRelate(SysUserRoleRelate aSysUserRoleRelate,
        SysUserRoleRelateDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aSysUserRoleRelate, aQueryBean);
    } // end updateSysUserRoleRelate()

    /**
     * DOCUMENT ME!
     *
     * @param aSysUserRoleRelate DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(SysUserRoleRelate aSysUserRoleRelate)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aSysUserRoleRelates DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysUserRoleRelate(
        SysUserRoleRelate[] aSysUserRoleRelates,
        SysUserRoleRelateDAOQueryBean aQueryBean) throws Exception {
        synchronizeSysUserRoleRelate(aSysUserRoleRelates, aQueryBean, null);
    } // end synchronizeSysUserRoleRelate()

    /**
     * DOCUMENT ME!
     *
     * @param aSysUserRoleRelates DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysUserRoleRelate(
        SysUserRoleRelate[] aSysUserRoleRelates,
        SysUserRoleRelateDAOQueryBean aQueryBean,
        SysUserRoleRelateSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aSysUserRoleRelates) == false) {
            inputList.addAll(Arrays.asList(aSysUserRoleRelates));
        } // end if

        SysUserRoleRelate[] existentSysUserRoleRelates = this.querySysUserRoleRelate(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentSysUserRoleRelates) == false) {
            existentList.addAll(Arrays.asList(existentSysUserRoleRelates));
        } // end if

        List willAddSysUserRoleRelates = ListUtils.subtract(inputList,
                existentList);

        List willDeleteSysUserRoleRelates = ListUtils.subtract(existentList,
                inputList);

        List willUpdateSysUserRoleRelates = ListUtils.intersection(existentList,
                inputList);

        SysUserRoleRelate[] willUpdateSysUserRoleRelateArray = (SysUserRoleRelate[]) willUpdateSysUserRoleRelates.toArray(new SysUserRoleRelate[willUpdateSysUserRoleRelates.size()]);
        SysUserRoleRelate[] willAddSysUserRoleRelateArray = (SysUserRoleRelate[]) willAddSysUserRoleRelates.toArray(new SysUserRoleRelate[willAddSysUserRoleRelates.size()]);
        SysUserRoleRelate[] willDeleteSysUserRoleRelateArray = (SysUserRoleRelate[]) willDeleteSysUserRoleRelates.toArray(new SysUserRoleRelate[willDeleteSysUserRoleRelates.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddSysUserRoleRelateArray,
                willUpdateSysUserRoleRelateArray,
                willDeleteSysUserRoleRelateArray);
        } // end if

        if (willUpdateSysUserRoleRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateSysUserRoleRelateArray);
            } // end if

            this.batchUpdateSysUserRoleRelate(willUpdateSysUserRoleRelateArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateSysUserRoleRelateArray);
            } // end if
        } // end if

        if (willAddSysUserRoleRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddSysUserRoleRelateArray);
            } // end if

            this.batchInsertSysUserRoleRelate(willAddSysUserRoleRelateArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddSysUserRoleRelateArray);
            } // end if
        } // end if

        if (willDeleteSysUserRoleRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteSysUserRoleRelateArray);
            } // end if

            for (int i = 0; i < willDeleteSysUserRoleRelateArray.length; i++) {
                SysUserRoleRelate object = willDeleteSysUserRoleRelateArray[i];
                this.deleteSysUserRoleRelate(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteSysUserRoleRelateArray);
            } // end if
        } // end if
    } // end synchronizeSysUserRoleRelate()

    /**
     * Query ISysUserRoleRelate
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public SysUserRoleRelate findSysUserRoleRelateById(final long aId)
        throws Exception {
        SysUserRoleRelateDAOQueryBean queryBean = new SysUserRoleRelateDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        SysUserRoleRelate[] SysUserRoleRelates = querySysUserRoleRelate(queryBean);

        if (SysUserRoleRelates.length == 0) {
            return null;
        } // end if
        else {
            return SysUserRoleRelates[0];
        } // end else
    } // end findSysUserRoleRelateById()

    /**
     * Query ISysUserRoleRelate
     *
     * @param queryBean
     *
     * @return ISysUserRoleRelate[]
     *
     * @throws Exception
     */
    public SysUserRoleRelate[] querySysUserRoleRelate(
        SysUserRoleRelateDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcSysUserRoleRelateRowMapper());

        return (SysUserRoleRelate[]) result.toArray(new SysUserRoleRelate[result.size()]);
    } // end querySysUserRoleRelate()

    /**
     * Query SysUserRoleRelate Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] querySysUserRoleRelateSelective(
        SysUserRoleRelateDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end querySysUserRoleRelateSelective()

    /**
     * Query ISysUserRoleRelate Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int querySysUserRoleRelateCount(
        SysUserRoleRelateDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end querySysUserRoleRelateCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcSysUserRoleRelateRowMapper
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
            SysUserRoleRelate object = new SysUserRoleRelate();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object ExpiredDate = resultSet.getObject(columnIndex++);

                object.setExpiredDateNull(resultSet.getBoolean(columnIndex++));

                if (ExpiredDate != null) {
                    BeanUtils.setProperty(object, DataProperty.ExpiredDate,
                        ExpiredDate);
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

                Object UserId = resultSet.getObject(columnIndex++);

                object.setUserIdNull(resultSet.getBoolean(columnIndex++));

                if (UserId != null) {
                    BeanUtils.setProperty(object, DataProperty.UserId, UserId);
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

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcSysUserRoleRelateRowMapper
} // end BaseSysUserRoleRelateDAOJdbcImpl
