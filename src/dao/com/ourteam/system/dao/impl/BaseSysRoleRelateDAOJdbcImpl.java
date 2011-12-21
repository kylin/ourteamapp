/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao.impl;

import com.ourteam.system.dao.ISysRoleRelateDAO;
import com.ourteam.system.dao.SysRoleRelate;
import com.ourteam.system.dao.SysRoleRelateDAOQueryBean;

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
 * 系统角色关系组 DAO JDBC Impl Generate Date : 2011-06-10 22:45:10
 *
 * @author Kylin
 */
abstract public class BaseSysRoleRelateDAOJdbcImpl extends AbstractJdbcDAO
    implements ISysRoleRelateDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, RelatedSysRoleId, Remarks, Status, SysRoleGroupId,
            RelatedSysRoleCode, SysRoleName, SysRoleCode, SysRoleType,
            SysRoleDomainId, SysDomainName, SysDomainCode
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.RelatedSysRoleId, DataProperty.Remarks,
            DataProperty.Status, DataProperty.SysRoleGroupId,
            DataProperty.RelatedSysRoleCode, DataProperty.SysRoleName,
            DataProperty.SysRoleCode, DataProperty.SysRoleType,
            DataProperty.SysRoleDomainId, DataProperty.SysDomainName,
            DataProperty.SysDomainCode
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
     * Creates a new BaseSysRoleRelateDAOJdbcImpl object.
     */
    public BaseSysRoleRelateDAOJdbcImpl() {
        super();
    } // end BaseSysRoleRelateDAOJdbcImpl()

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

            relatedJoinSQLBuffer.append(" LEFT JOIN SYS_ROLE sysRoleA ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " sysRoleA.ID = SYS_ROLE_RELATE.RELATED_SYS_ROLE_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQLBuffer.append(" LEFT JOIN SYS_DOMAIN sysDomianA ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(" sysDomianA.ID = sysRoleA.DOMAIN_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique SysRoleRelate
     *
     * @param aSysRoleRelate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(SysRoleRelate aSysRoleRelate)
        throws Exception {
        if (aSysRoleRelate == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aSysRoleRelate,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert ISysRoleRelate
     *
     * @param aSysRoleRelate
     *
     * @throws Exception
     */
    public void insertSysRoleRelate(SysRoleRelate aSysRoleRelate)
        throws Exception {
        insert(aSysRoleRelate);
    } // end insertSysRoleRelate()

    /**
     * Batch Insert ISysRoleRelate
     *
     * @param aSysRoleRelate
     *
     * @throws Exception
     */
    public void batchInsertSysRoleRelate(SysRoleRelate[] aSysRoleRelate)
        throws Exception {
        batchInsert(aSysRoleRelate);
    } // end batchInsertSysRoleRelate()

    /**
     * Delete ISysRoleRelate
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteSysRoleRelate(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteSysRoleRelate()

    /**
     * Delete ISysRoleRelate
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteSysRoleRelate(SysRoleRelateDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteSysRoleRelate()

    /**
     * Update ISysRoleRelate Selective
     *
     * @param aSysRoleRelate
     *
     * @throws Exception
     */
    public void updateSysRoleRelate(SysRoleRelate aSysRoleRelate)
        throws Exception {
        if (aSysRoleRelate.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aSysRoleRelate);

        SysRoleRelate tempObj = findSysRoleRelateById(aSysRoleRelate.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aSysRoleRelate, tempObj);
        } // end if
    } // end updateSysRoleRelate()

    /**
     * Batch Update ISysRoleRelate
     *
     * @param aSysRoleRelate
     *
     * @throws Exception
     */
    public void batchUpdateSysRoleRelate(SysRoleRelate[] aSysRoleRelate)
        throws Exception {
        batchUpdate(aSysRoleRelate);
    } // end batchUpdateSysRoleRelate()

    /**
     * Update ISysRoleRelate
     *
     * @param aSysRoleRelate
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateSysRoleRelate(SysRoleRelate aSysRoleRelate,
        SysRoleRelateDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aSysRoleRelate, aQueryBean);
    } // end updateSysRoleRelate()

    /**
     * DOCUMENT ME!
     *
     * @param aSysRoleRelate DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(SysRoleRelate aSysRoleRelate)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aSysRoleRelates DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysRoleRelate(SysRoleRelate[] aSysRoleRelates,
        SysRoleRelateDAOQueryBean aQueryBean) throws Exception {
        synchronizeSysRoleRelate(aSysRoleRelates, aQueryBean, null);
    } // end synchronizeSysRoleRelate()

    /**
     * DOCUMENT ME!
     *
     * @param aSysRoleRelates DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysRoleRelate(SysRoleRelate[] aSysRoleRelates,
        SysRoleRelateDAOQueryBean aQueryBean,
        SysRoleRelateSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aSysRoleRelates) == false) {
            inputList.addAll(Arrays.asList(aSysRoleRelates));
        } // end if

        SysRoleRelate[] existentSysRoleRelates = this.querySysRoleRelate(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentSysRoleRelates) == false) {
            existentList.addAll(Arrays.asList(existentSysRoleRelates));
        } // end if

        List willAddSysRoleRelates = ListUtils.subtract(inputList, existentList);

        List willDeleteSysRoleRelates = ListUtils.subtract(existentList,
                inputList);

        List willUpdateSysRoleRelates = ListUtils.intersection(existentList,
                inputList);

        SysRoleRelate[] willUpdateSysRoleRelateArray = (SysRoleRelate[]) willUpdateSysRoleRelates.toArray(new SysRoleRelate[willUpdateSysRoleRelates.size()]);
        SysRoleRelate[] willAddSysRoleRelateArray = (SysRoleRelate[]) willAddSysRoleRelates.toArray(new SysRoleRelate[willAddSysRoleRelates.size()]);
        SysRoleRelate[] willDeleteSysRoleRelateArray = (SysRoleRelate[]) willDeleteSysRoleRelates.toArray(new SysRoleRelate[willDeleteSysRoleRelates.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddSysRoleRelateArray,
                willUpdateSysRoleRelateArray, willDeleteSysRoleRelateArray);
        } // end if

        if (willUpdateSysRoleRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateSysRoleRelateArray);
            } // end if

            this.batchUpdateSysRoleRelate(willUpdateSysRoleRelateArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateSysRoleRelateArray);
            } // end if
        } // end if

        if (willAddSysRoleRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddSysRoleRelateArray);
            } // end if

            this.batchInsertSysRoleRelate(willAddSysRoleRelateArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddSysRoleRelateArray);
            } // end if
        } // end if

        if (willDeleteSysRoleRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteSysRoleRelateArray);
            } // end if

            for (int i = 0; i < willDeleteSysRoleRelateArray.length; i++) {
                SysRoleRelate object = willDeleteSysRoleRelateArray[i];
                this.deleteSysRoleRelate(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteSysRoleRelateArray);
            } // end if
        } // end if
    } // end synchronizeSysRoleRelate()

    /**
     * Query ISysRoleRelate
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public SysRoleRelate findSysRoleRelateById(final long aId)
        throws Exception {
        SysRoleRelateDAOQueryBean queryBean = new SysRoleRelateDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        SysRoleRelate[] SysRoleRelates = querySysRoleRelate(queryBean);

        if (SysRoleRelates.length == 0) {
            return null;
        } // end if
        else {
            return SysRoleRelates[0];
        } // end else
    } // end findSysRoleRelateById()

    /**
     * Query ISysRoleRelate
     *
     * @param queryBean
     *
     * @return ISysRoleRelate[]
     *
     * @throws Exception
     */
    public SysRoleRelate[] querySysRoleRelate(
        SysRoleRelateDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcSysRoleRelateRowMapper());

        return (SysRoleRelate[]) result.toArray(new SysRoleRelate[result.size()]);
    } // end querySysRoleRelate()

    /**
     * Query SysRoleRelate Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] querySysRoleRelateSelective(
        SysRoleRelateDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end querySysRoleRelateSelective()

    /**
     * Query ISysRoleRelate Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int querySysRoleRelateCount(SysRoleRelateDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end querySysRoleRelateCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcSysRoleRelateRowMapper
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
            SysRoleRelate object = new SysRoleRelate();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object RelatedSysRoleId = resultSet.getObject(columnIndex++);

                object.setRelatedSysRoleIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (RelatedSysRoleId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.RelatedSysRoleId, RelatedSysRoleId);
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

                Object SysRoleGroupId = resultSet.getObject(columnIndex++);

                object.setSysRoleGroupIdNull(resultSet.getBoolean(columnIndex++));

                if (SysRoleGroupId != null) {
                    BeanUtils.setProperty(object, DataProperty.SysRoleGroupId,
                        SysRoleGroupId);
                } // end if

                Object RelatedSysRoleCode = resultSet.getObject(columnIndex++);

                object.setRelatedSysRoleCodeNull(resultSet.getBoolean(
                        columnIndex++));

                if (RelatedSysRoleCode != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.RelatedSysRoleCode, RelatedSysRoleCode);
                } // end if

                Object SysRoleName = resultSet.getObject(columnIndex++);

                object.setSysRoleNameNull(resultSet.getBoolean(columnIndex++));

                if (SysRoleName != null) {
                    BeanUtils.setProperty(object, DataProperty.SysRoleName,
                        SysRoleName);
                } // end if

                Object SysRoleCode = resultSet.getObject(columnIndex++);

                object.setSysRoleCodeNull(resultSet.getBoolean(columnIndex++));

                if (SysRoleCode != null) {
                    BeanUtils.setProperty(object, DataProperty.SysRoleCode,
                        SysRoleCode);
                } // end if

                Object SysRoleType = resultSet.getObject(columnIndex++);

                object.setSysRoleTypeNull(resultSet.getBoolean(columnIndex++));

                if (SysRoleType != null) {
                    BeanUtils.setProperty(object, DataProperty.SysRoleType,
                        SysRoleType);
                } // end if

                Object SysRoleDomainId = resultSet.getObject(columnIndex++);

                object.setSysRoleDomainIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (SysRoleDomainId != null) {
                    BeanUtils.setProperty(object, DataProperty.SysRoleDomainId,
                        SysRoleDomainId);
                } // end if

                Object SysDomainName = resultSet.getObject(columnIndex++);

                object.setSysDomainNameNull(resultSet.getBoolean(columnIndex++));

                if (SysDomainName != null) {
                    BeanUtils.setProperty(object, DataProperty.SysDomainName,
                        SysDomainName);
                } // end if

                Object SysDomainCode = resultSet.getObject(columnIndex++);

                object.setSysDomainCodeNull(resultSet.getBoolean(columnIndex++));

                if (SysDomainCode != null) {
                    BeanUtils.setProperty(object, DataProperty.SysDomainCode,
                        SysDomainCode);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcSysRoleRelateRowMapper
} // end BaseSysRoleRelateDAOJdbcImpl
