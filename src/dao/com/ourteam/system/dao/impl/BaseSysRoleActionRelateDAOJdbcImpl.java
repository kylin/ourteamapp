/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao.impl;

import com.ourteam.system.dao.ISysRoleActionRelateDAO;
import com.ourteam.system.dao.SysRoleActionRelate;
import com.ourteam.system.dao.SysRoleActionRelateDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-12-12 21:20:16
 *
 * @author Kylin
 */
abstract public class BaseSysRoleActionRelateDAOJdbcImpl extends AbstractJdbcDAO
    implements ISysRoleActionRelateDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, ActionId, Remarks, RoleId, Status, ActionCode, ActionName,
            DomainId, DomainName, DomainCode
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.ActionId, DataProperty.Remarks,
            DataProperty.RoleId, DataProperty.Status, DataProperty.ActionCode,
            DataProperty.ActionName, DataProperty.DomainId,
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
     * Creates a new BaseSysRoleActionRelateDAOJdbcImpl object.
     */
    public BaseSysRoleActionRelateDAOJdbcImpl() {
        super();
    } // end BaseSysRoleActionRelateDAOJdbcImpl()

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

            relatedJoinSQLBuffer.append(" LEFT JOIN SYS_ACTION sysActionAA ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " sysActionAA.ID = SYS_ROLE_ACTION_RELATE.ACTION_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQLBuffer.append(" LEFT JOIN SYS_DOMAIN sysDomainAA ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " sysDomainAA.ID = sysActionAA.DOMAIN_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique SysRoleActionRelate
     *
     * @param aSysRoleActionRelate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(SysRoleActionRelate aSysRoleActionRelate)
        throws Exception {
        if (aSysRoleActionRelate == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aSysRoleActionRelate,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert ISysRoleActionRelate
     *
     * @param aSysRoleActionRelate
     *
     * @throws Exception
     */
    public void insertSysRoleActionRelate(
        SysRoleActionRelate aSysRoleActionRelate) throws Exception {
        insert(aSysRoleActionRelate);
    } // end insertSysRoleActionRelate()

    /**
     * Batch Insert ISysRoleActionRelate
     *
     * @param aSysRoleActionRelate
     *
     * @throws Exception
     */
    public void batchInsertSysRoleActionRelate(
        SysRoleActionRelate[] aSysRoleActionRelate) throws Exception {
        batchInsert(aSysRoleActionRelate);
    } // end batchInsertSysRoleActionRelate()

    /**
     * Delete ISysRoleActionRelate
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteSysRoleActionRelate(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteSysRoleActionRelate()

    /**
     * Delete ISysRoleActionRelate
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteSysRoleActionRelate(
        SysRoleActionRelateDAOQueryBean queryBean) throws Exception {
        deleteByQuery(queryBean);
    } // end deleteSysRoleActionRelate()

    /**
     * Update ISysRoleActionRelate Selective
     *
     * @param aSysRoleActionRelate
     *
     * @throws Exception
     */
    public void updateSysRoleActionRelate(
        SysRoleActionRelate aSysRoleActionRelate) throws Exception {
        if (aSysRoleActionRelate.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aSysRoleActionRelate);

        SysRoleActionRelate tempObj = findSysRoleActionRelateById(aSysRoleActionRelate.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aSysRoleActionRelate, tempObj);
        } // end if
    } // end updateSysRoleActionRelate()

    /**
     * Batch Update ISysRoleActionRelate
     *
     * @param aSysRoleActionRelate
     *
     * @throws Exception
     */
    public void batchUpdateSysRoleActionRelate(
        SysRoleActionRelate[] aSysRoleActionRelate) throws Exception {
        batchUpdate(aSysRoleActionRelate);
    } // end batchUpdateSysRoleActionRelate()

    /**
     * Update ISysRoleActionRelate
     *
     * @param aSysRoleActionRelate
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateSysRoleActionRelate(
        SysRoleActionRelate aSysRoleActionRelate,
        SysRoleActionRelateDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aSysRoleActionRelate, aQueryBean);
    } // end updateSysRoleActionRelate()

    /**
     * DOCUMENT ME!
     *
     * @param aSysRoleActionRelate DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(SysRoleActionRelate aSysRoleActionRelate)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aSysRoleActionRelates DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysRoleActionRelate(
        SysRoleActionRelate[] aSysRoleActionRelates,
        SysRoleActionRelateDAOQueryBean aQueryBean) throws Exception {
        synchronizeSysRoleActionRelate(aSysRoleActionRelates, aQueryBean, null);
    } // end synchronizeSysRoleActionRelate()

    /**
     * DOCUMENT ME!
     *
     * @param aSysRoleActionRelates DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysRoleActionRelate(
        SysRoleActionRelate[] aSysRoleActionRelates,
        SysRoleActionRelateDAOQueryBean aQueryBean,
        SysRoleActionRelateSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aSysRoleActionRelates) == false) {
            inputList.addAll(Arrays.asList(aSysRoleActionRelates));
        } // end if

        SysRoleActionRelate[] existentSysRoleActionRelates = this.querySysRoleActionRelate(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentSysRoleActionRelates) == false) {
            existentList.addAll(Arrays.asList(existentSysRoleActionRelates));
        } // end if

        List willAddSysRoleActionRelates = ListUtils.subtract(inputList,
                existentList);

        List willDeleteSysRoleActionRelates = ListUtils.subtract(existentList,
                inputList);

        List willUpdateSysRoleActionRelates = ListUtils.intersection(existentList,
                inputList);

        SysRoleActionRelate[] willUpdateSysRoleActionRelateArray = (SysRoleActionRelate[]) willUpdateSysRoleActionRelates.toArray(new SysRoleActionRelate[willUpdateSysRoleActionRelates.size()]);
        SysRoleActionRelate[] willAddSysRoleActionRelateArray = (SysRoleActionRelate[]) willAddSysRoleActionRelates.toArray(new SysRoleActionRelate[willAddSysRoleActionRelates.size()]);
        SysRoleActionRelate[] willDeleteSysRoleActionRelateArray = (SysRoleActionRelate[]) willDeleteSysRoleActionRelates.toArray(new SysRoleActionRelate[willDeleteSysRoleActionRelates.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddSysRoleActionRelateArray,
                willUpdateSysRoleActionRelateArray,
                willDeleteSysRoleActionRelateArray);
        } // end if

        if (willUpdateSysRoleActionRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateSysRoleActionRelateArray);
            } // end if

            this.batchUpdateSysRoleActionRelate(willUpdateSysRoleActionRelateArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateSysRoleActionRelateArray);
            } // end if
        } // end if

        if (willAddSysRoleActionRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddSysRoleActionRelateArray);
            } // end if

            this.batchInsertSysRoleActionRelate(willAddSysRoleActionRelateArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddSysRoleActionRelateArray);
            } // end if
        } // end if

        if (willDeleteSysRoleActionRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteSysRoleActionRelateArray);
            } // end if

            for (int i = 0; i < willDeleteSysRoleActionRelateArray.length;
                    i++) {
                SysRoleActionRelate object = willDeleteSysRoleActionRelateArray[i];
                this.deleteSysRoleActionRelate(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteSysRoleActionRelateArray);
            } // end if
        } // end if
    } // end synchronizeSysRoleActionRelate()

    /**
     * Query ISysRoleActionRelate
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public SysRoleActionRelate findSysRoleActionRelateById(final long aId)
        throws Exception {
        SysRoleActionRelateDAOQueryBean queryBean = new SysRoleActionRelateDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        SysRoleActionRelate[] SysRoleActionRelates = querySysRoleActionRelate(queryBean);

        if (SysRoleActionRelates.length == 0) {
            return null;
        } // end if
        else {
            return SysRoleActionRelates[0];
        } // end else
    } // end findSysRoleActionRelateById()

    /**
     * Query ISysRoleActionRelate
     *
     * @param queryBean
     *
     * @return ISysRoleActionRelate[]
     *
     * @throws Exception
     */
    public SysRoleActionRelate[] querySysRoleActionRelate(
        SysRoleActionRelateDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean,
                new JdbcSysRoleActionRelateRowMapper());

        return (SysRoleActionRelate[]) result.toArray(new SysRoleActionRelate[result.size()]);
    } // end querySysRoleActionRelate()

    /**
     * Query SysRoleActionRelate Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] querySysRoleActionRelateSelective(
        SysRoleActionRelateDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end querySysRoleActionRelateSelective()

    /**
     * Query ISysRoleActionRelate Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int querySysRoleActionRelateCount(
        SysRoleActionRelateDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end querySysRoleActionRelateCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcSysRoleActionRelateRowMapper
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
            SysRoleActionRelate object = new SysRoleActionRelate();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object ActionId = resultSet.getObject(columnIndex++);

                object.setActionIdNull(resultSet.getBoolean(columnIndex++));

                if (ActionId != null) {
                    BeanUtils.setProperty(object, DataProperty.ActionId,
                        ActionId);
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
    } // end JdbcSysRoleActionRelateRowMapper
} // end BaseSysRoleActionRelateDAOJdbcImpl
