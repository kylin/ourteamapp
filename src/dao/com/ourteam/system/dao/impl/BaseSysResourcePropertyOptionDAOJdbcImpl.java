/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao.impl;

import com.ourteam.system.dao.ISysResourcePropertyOptionDAO;
import com.ourteam.system.dao.SysResourcePropertyOption;
import com.ourteam.system.dao.SysResourcePropertyOptionDAOQueryBean;

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
 * 资源属性可选值 DAO JDBC Impl Generate Date : 2011-06-10 22:45:10
 *
 * @author Kylin
 */
abstract public class BaseSysResourcePropertyOptionDAOJdbcImpl
    extends AbstractJdbcDAO implements ISysResourcePropertyOptionDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, OrderIndex, Remarks, Status, SysResourcePropertyId, ValueCode,
            ValueLable
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.OrderIndex, DataProperty.Remarks,
            DataProperty.Status, DataProperty.SysResourcePropertyId,
            DataProperty.ValueCode, DataProperty.ValueLable
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
     * Creates a new BaseSysResourcePropertyOptionDAOJdbcImpl object.
     */
    public BaseSysResourcePropertyOptionDAOJdbcImpl() {
        super();
    } // end BaseSysResourcePropertyOptionDAOJdbcImpl()

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
     * Check Unique SysResourcePropertyOption
     *
     * @param aSysResourcePropertyOption
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(
        SysResourcePropertyOption aSysResourcePropertyOption)
        throws Exception {
        if (aSysResourcePropertyOption == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aSysResourcePropertyOption,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert ISysResourcePropertyOption
     *
     * @param aSysResourcePropertyOption
     *
     * @throws Exception
     */
    public void insertSysResourcePropertyOption(
        SysResourcePropertyOption aSysResourcePropertyOption)
        throws Exception {
        insert(aSysResourcePropertyOption);
    } // end insertSysResourcePropertyOption()

    /**
     * Batch Insert ISysResourcePropertyOption
     *
     * @param aSysResourcePropertyOption
     *
     * @throws Exception
     */
    public void batchInsertSysResourcePropertyOption(
        SysResourcePropertyOption[] aSysResourcePropertyOption)
        throws Exception {
        batchInsert(aSysResourcePropertyOption);
    } // end batchInsertSysResourcePropertyOption()

    /**
     * Delete ISysResourcePropertyOption
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteSysResourcePropertyOption(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteSysResourcePropertyOption()

    /**
     * Delete ISysResourcePropertyOption
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteSysResourcePropertyOption(
        SysResourcePropertyOptionDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteSysResourcePropertyOption()

    /**
     * Update ISysResourcePropertyOption Selective
     *
     * @param aSysResourcePropertyOption
     *
     * @throws Exception
     */
    public void updateSysResourcePropertyOption(
        SysResourcePropertyOption aSysResourcePropertyOption)
        throws Exception {
        if (aSysResourcePropertyOption.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aSysResourcePropertyOption);

        SysResourcePropertyOption tempObj = findSysResourcePropertyOptionById(aSysResourcePropertyOption.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aSysResourcePropertyOption, tempObj);
        } // end if
    } // end updateSysResourcePropertyOption()

    /**
     * Batch Update ISysResourcePropertyOption
     *
     * @param aSysResourcePropertyOption
     *
     * @throws Exception
     */
    public void batchUpdateSysResourcePropertyOption(
        SysResourcePropertyOption[] aSysResourcePropertyOption)
        throws Exception {
        batchUpdate(aSysResourcePropertyOption);
    } // end batchUpdateSysResourcePropertyOption()

    /**
     * Update ISysResourcePropertyOption
     *
     * @param aSysResourcePropertyOption
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateSysResourcePropertyOption(
        SysResourcePropertyOption aSysResourcePropertyOption,
        SysResourcePropertyOptionDAOQueryBean aQueryBean)
        throws Exception {
        updateByQuery(aSysResourcePropertyOption, aQueryBean);
    } // end updateSysResourcePropertyOption()

    /**
     * DOCUMENT ME!
     *
     * @param aSysResourcePropertyOption DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(
        SysResourcePropertyOption aSysResourcePropertyOption)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aSysResourcePropertyOptions DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysResourcePropertyOption(
        SysResourcePropertyOption[] aSysResourcePropertyOptions,
        SysResourcePropertyOptionDAOQueryBean aQueryBean)
        throws Exception {
        synchronizeSysResourcePropertyOption(aSysResourcePropertyOptions,
            aQueryBean, null);
    } // end synchronizeSysResourcePropertyOption()

    /**
     * DOCUMENT ME!
     *
     * @param aSysResourcePropertyOptions DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysResourcePropertyOption(
        SysResourcePropertyOption[] aSysResourcePropertyOptions,
        SysResourcePropertyOptionDAOQueryBean aQueryBean,
        SysResourcePropertyOptionSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aSysResourcePropertyOptions) == false) {
            inputList.addAll(Arrays.asList(aSysResourcePropertyOptions));
        } // end if

        SysResourcePropertyOption[] existentSysResourcePropertyOptions = this.querySysResourcePropertyOption(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentSysResourcePropertyOptions) == false) {
            existentList.addAll(Arrays.asList(
                    existentSysResourcePropertyOptions));
        } // end if

        List willAddSysResourcePropertyOptions = ListUtils.subtract(inputList,
                existentList);

        List willDeleteSysResourcePropertyOptions = ListUtils.subtract(existentList,
                inputList);

        List willUpdateSysResourcePropertyOptions = ListUtils.intersection(existentList,
                inputList);

        SysResourcePropertyOption[] willUpdateSysResourcePropertyOptionArray = (SysResourcePropertyOption[]) willUpdateSysResourcePropertyOptions.toArray(new SysResourcePropertyOption[willUpdateSysResourcePropertyOptions.size()]);
        SysResourcePropertyOption[] willAddSysResourcePropertyOptionArray = (SysResourcePropertyOption[]) willAddSysResourcePropertyOptions.toArray(new SysResourcePropertyOption[willAddSysResourcePropertyOptions.size()]);
        SysResourcePropertyOption[] willDeleteSysResourcePropertyOptionArray = (SysResourcePropertyOption[]) willDeleteSysResourcePropertyOptions.toArray(new SysResourcePropertyOption[willDeleteSysResourcePropertyOptions.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddSysResourcePropertyOptionArray,
                willUpdateSysResourcePropertyOptionArray,
                willDeleteSysResourcePropertyOptionArray);
        } // end if

        if (willUpdateSysResourcePropertyOptions.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateSysResourcePropertyOptionArray);
            } // end if

            this.batchUpdateSysResourcePropertyOption(willUpdateSysResourcePropertyOptionArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateSysResourcePropertyOptionArray);
            } // end if
        } // end if

        if (willAddSysResourcePropertyOptions.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddSysResourcePropertyOptionArray);
            } // end if

            this.batchInsertSysResourcePropertyOption(willAddSysResourcePropertyOptionArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddSysResourcePropertyOptionArray);
            } // end if
        } // end if

        if (willDeleteSysResourcePropertyOptions.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteSysResourcePropertyOptionArray);
            } // end if

            for (int i = 0;
                    i < willDeleteSysResourcePropertyOptionArray.length; i++) {
                SysResourcePropertyOption object = willDeleteSysResourcePropertyOptionArray[i];
                this.deleteSysResourcePropertyOption(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteSysResourcePropertyOptionArray);
            } // end if
        } // end if
    } // end synchronizeSysResourcePropertyOption()

    /**
     * Query ISysResourcePropertyOption
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public SysResourcePropertyOption findSysResourcePropertyOptionById(
        final long aId) throws Exception {
        SysResourcePropertyOptionDAOQueryBean queryBean = new SysResourcePropertyOptionDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        SysResourcePropertyOption[] SysResourcePropertyOptions = querySysResourcePropertyOption(queryBean);

        if (SysResourcePropertyOptions.length == 0) {
            return null;
        } // end if
        else {
            return SysResourcePropertyOptions[0];
        } // end else
    } // end findSysResourcePropertyOptionById()

    /**
     * Query ISysResourcePropertyOption
     *
     * @param queryBean
     *
     * @return ISysResourcePropertyOption[]
     *
     * @throws Exception
     */
    public SysResourcePropertyOption[] querySysResourcePropertyOption(
        SysResourcePropertyOptionDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean,
                new JdbcSysResourcePropertyOptionRowMapper());

        return (SysResourcePropertyOption[]) result.toArray(new SysResourcePropertyOption[result.size()]);
    } // end querySysResourcePropertyOption()

    /**
     * Query SysResourcePropertyOption Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] querySysResourcePropertyOptionSelective(
        SysResourcePropertyOptionDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end querySysResourcePropertyOptionSelective()

    /**
     * Query ISysResourcePropertyOption Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int querySysResourcePropertyOptionCount(
        SysResourcePropertyOptionDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end querySysResourcePropertyOptionCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcSysResourcePropertyOptionRowMapper
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
            SysResourcePropertyOption object = new SysResourcePropertyOption();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object OrderIndex = resultSet.getObject(columnIndex++);

                object.setOrderIndexNull(resultSet.getBoolean(columnIndex++));

                if (OrderIndex != null) {
                    BeanUtils.setProperty(object, DataProperty.OrderIndex,
                        OrderIndex);
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

                Object SysResourcePropertyId = resultSet.getObject(columnIndex++);

                object.setSysResourcePropertyIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (SysResourcePropertyId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.SysResourcePropertyId,
                        SysResourcePropertyId);
                } // end if

                Object ValueCode = resultSet.getObject(columnIndex++);

                object.setValueCodeNull(resultSet.getBoolean(columnIndex++));

                if (ValueCode != null) {
                    BeanUtils.setProperty(object, DataProperty.ValueCode,
                        ValueCode);
                } // end if

                Object ValueLable = resultSet.getObject(columnIndex++);

                object.setValueLableNull(resultSet.getBoolean(columnIndex++));

                if (ValueLable != null) {
                    BeanUtils.setProperty(object, DataProperty.ValueLable,
                        ValueLable);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcSysResourcePropertyOptionRowMapper
} // end BaseSysResourcePropertyOptionDAOJdbcImpl
