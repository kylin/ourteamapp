/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao.impl;

import com.ourteam.bpm.dao.BpmDomainSysModuleRelate;
import com.ourteam.bpm.dao.BpmDomainSysModuleRelateDAOQueryBean;
import com.ourteam.bpm.dao.IBpmDomainSysModuleRelateDAO;

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
 * DAO JDBC Impl Generate Date : 2011-11-04 10:01:55
 *
 * @author kylin
 */
abstract public class BaseBpmDomainSysModuleRelateDAOJdbcImpl
    extends AbstractJdbcDAO implements IBpmDomainSysModuleRelateDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, BpmDomainId, Remarks, Status, SysModuleId, ModuleName,
            ModuleCode, ModuleIcon
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.BpmDomainId, DataProperty.Remarks,
            DataProperty.Status, DataProperty.SysModuleId,
            DataProperty.ModuleName, DataProperty.ModuleCode,
            DataProperty.ModuleIcon
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
     * Creates a new BaseBpmDomainSysModuleRelateDAOJdbcImpl object.
     */
    public BaseBpmDomainSysModuleRelateDAOJdbcImpl() {
        super();
    } // end BaseBpmDomainSysModuleRelateDAOJdbcImpl()

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

            relatedJoinSQLBuffer.append(" LEFT JOIN SYS_MODULE sysModuleF ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " sysModuleF.ID = BPM_DOMAIN_SYS_MODULE_RELATE.SYS_MODULE_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique BpmDomainSysModuleRelate
     *
     * @param aBpmDomainSysModuleRelate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(
        BpmDomainSysModuleRelate aBpmDomainSysModuleRelate)
        throws Exception {
        if (aBpmDomainSysModuleRelate == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aBpmDomainSysModuleRelate,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IBpmDomainSysModuleRelate
     *
     * @param aBpmDomainSysModuleRelate
     *
     * @throws Exception
     */
    public void insertBpmDomainSysModuleRelate(
        BpmDomainSysModuleRelate aBpmDomainSysModuleRelate)
        throws Exception {
        insert(aBpmDomainSysModuleRelate);
    } // end insertBpmDomainSysModuleRelate()

    /**
     * Batch Insert IBpmDomainSysModuleRelate
     *
     * @param aBpmDomainSysModuleRelate
     *
     * @throws Exception
     */
    public void batchInsertBpmDomainSysModuleRelate(
        BpmDomainSysModuleRelate[] aBpmDomainSysModuleRelate)
        throws Exception {
        batchInsert(aBpmDomainSysModuleRelate);
    } // end batchInsertBpmDomainSysModuleRelate()

    /**
     * Delete IBpmDomainSysModuleRelate
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteBpmDomainSysModuleRelate(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteBpmDomainSysModuleRelate()

    /**
     * Delete IBpmDomainSysModuleRelate
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteBpmDomainSysModuleRelate(
        BpmDomainSysModuleRelateDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteBpmDomainSysModuleRelate()

    /**
     * Update IBpmDomainSysModuleRelate Selective
     *
     * @param aBpmDomainSysModuleRelate
     *
     * @throws Exception
     */
    public void updateBpmDomainSysModuleRelate(
        BpmDomainSysModuleRelate aBpmDomainSysModuleRelate)
        throws Exception {
        if (aBpmDomainSysModuleRelate.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aBpmDomainSysModuleRelate);

        BpmDomainSysModuleRelate tempObj = findBpmDomainSysModuleRelateById(aBpmDomainSysModuleRelate.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aBpmDomainSysModuleRelate, tempObj);
        } // end if
    } // end updateBpmDomainSysModuleRelate()

    /**
     * Batch Update IBpmDomainSysModuleRelate
     *
     * @param aBpmDomainSysModuleRelate
     *
     * @throws Exception
     */
    public void batchUpdateBpmDomainSysModuleRelate(
        BpmDomainSysModuleRelate[] aBpmDomainSysModuleRelate)
        throws Exception {
        batchUpdate(aBpmDomainSysModuleRelate);
    } // end batchUpdateBpmDomainSysModuleRelate()

    /**
     * Update IBpmDomainSysModuleRelate
     *
     * @param aBpmDomainSysModuleRelate
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateBpmDomainSysModuleRelate(
        BpmDomainSysModuleRelate aBpmDomainSysModuleRelate,
        BpmDomainSysModuleRelateDAOQueryBean aQueryBean)
        throws Exception {
        updateByQuery(aBpmDomainSysModuleRelate, aQueryBean);
    } // end updateBpmDomainSysModuleRelate()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmDomainSysModuleRelate DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(
        BpmDomainSysModuleRelate aBpmDomainSysModuleRelate)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmDomainSysModuleRelates DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmDomainSysModuleRelate(
        BpmDomainSysModuleRelate[] aBpmDomainSysModuleRelates,
        BpmDomainSysModuleRelateDAOQueryBean aQueryBean)
        throws Exception {
        synchronizeBpmDomainSysModuleRelate(aBpmDomainSysModuleRelates,
            aQueryBean, null);
    } // end synchronizeBpmDomainSysModuleRelate()

    /**
     * DOCUMENT ME!
     *
     * @param aBpmDomainSysModuleRelates DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBpmDomainSysModuleRelate(
        BpmDomainSysModuleRelate[] aBpmDomainSysModuleRelates,
        BpmDomainSysModuleRelateDAOQueryBean aQueryBean,
        BpmDomainSysModuleRelateSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aBpmDomainSysModuleRelates) == false) {
            inputList.addAll(Arrays.asList(aBpmDomainSysModuleRelates));
        } // end if

        BpmDomainSysModuleRelate[] existentBpmDomainSysModuleRelates = this.queryBpmDomainSysModuleRelate(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentBpmDomainSysModuleRelates) == false) {
            existentList.addAll(Arrays.asList(existentBpmDomainSysModuleRelates));
        } // end if

        List willAddBpmDomainSysModuleRelates = ListUtils.subtract(inputList,
                existentList);

        List willDeleteBpmDomainSysModuleRelates = ListUtils.subtract(existentList,
                inputList);

        List willUpdateBpmDomainSysModuleRelates = ListUtils.intersection(existentList,
                inputList);

        BpmDomainSysModuleRelate[] willUpdateBpmDomainSysModuleRelateArray = (BpmDomainSysModuleRelate[]) willUpdateBpmDomainSysModuleRelates.toArray(new BpmDomainSysModuleRelate[willUpdateBpmDomainSysModuleRelates.size()]);
        BpmDomainSysModuleRelate[] willAddBpmDomainSysModuleRelateArray = (BpmDomainSysModuleRelate[]) willAddBpmDomainSysModuleRelates.toArray(new BpmDomainSysModuleRelate[willAddBpmDomainSysModuleRelates.size()]);
        BpmDomainSysModuleRelate[] willDeleteBpmDomainSysModuleRelateArray = (BpmDomainSysModuleRelate[]) willDeleteBpmDomainSysModuleRelates.toArray(new BpmDomainSysModuleRelate[willDeleteBpmDomainSysModuleRelates.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddBpmDomainSysModuleRelateArray,
                willUpdateBpmDomainSysModuleRelateArray,
                willDeleteBpmDomainSysModuleRelateArray);
        } // end if

        if (willUpdateBpmDomainSysModuleRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateBpmDomainSysModuleRelateArray);
            } // end if

            this.batchUpdateBpmDomainSysModuleRelate(willUpdateBpmDomainSysModuleRelateArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateBpmDomainSysModuleRelateArray);
            } // end if
        } // end if

        if (willAddBpmDomainSysModuleRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddBpmDomainSysModuleRelateArray);
            } // end if

            this.batchInsertBpmDomainSysModuleRelate(willAddBpmDomainSysModuleRelateArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddBpmDomainSysModuleRelateArray);
            } // end if
        } // end if

        if (willDeleteBpmDomainSysModuleRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteBpmDomainSysModuleRelateArray);
            } // end if

            for (int i = 0; i < willDeleteBpmDomainSysModuleRelateArray.length;
                    i++) {
                BpmDomainSysModuleRelate object = willDeleteBpmDomainSysModuleRelateArray[i];
                this.deleteBpmDomainSysModuleRelate(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteBpmDomainSysModuleRelateArray);
            } // end if
        } // end if
    } // end synchronizeBpmDomainSysModuleRelate()

    /**
     * Query IBpmDomainSysModuleRelate
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public BpmDomainSysModuleRelate findBpmDomainSysModuleRelateById(
        final long aId) throws Exception {
        BpmDomainSysModuleRelateDAOQueryBean queryBean = new BpmDomainSysModuleRelateDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        BpmDomainSysModuleRelate[] BpmDomainSysModuleRelates = queryBpmDomainSysModuleRelate(queryBean);

        if (BpmDomainSysModuleRelates.length == 0) {
            return null;
        } // end if
        else {
            return BpmDomainSysModuleRelates[0];
        } // end else
    } // end findBpmDomainSysModuleRelateById()

    /**
     * Query IBpmDomainSysModuleRelate
     *
     * @param queryBean
     *
     * @return IBpmDomainSysModuleRelate[]
     *
     * @throws Exception
     */
    public BpmDomainSysModuleRelate[] queryBpmDomainSysModuleRelate(
        BpmDomainSysModuleRelateDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean,
                new JdbcBpmDomainSysModuleRelateRowMapper());

        return (BpmDomainSysModuleRelate[]) result.toArray(new BpmDomainSysModuleRelate[result.size()]);
    } // end queryBpmDomainSysModuleRelate()

    /**
     * Query BpmDomainSysModuleRelate Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryBpmDomainSysModuleRelateSelective(
        BpmDomainSysModuleRelateDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryBpmDomainSysModuleRelateSelective()

    /**
     * Query IBpmDomainSysModuleRelate Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryBpmDomainSysModuleRelateCount(
        BpmDomainSysModuleRelateDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryBpmDomainSysModuleRelateCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcBpmDomainSysModuleRelateRowMapper
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
            BpmDomainSysModuleRelate object = new BpmDomainSysModuleRelate();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object BpmDomainId = resultSet.getObject(columnIndex++);

                object.setBpmDomainIdNull(resultSet.getBoolean(columnIndex++));

                if (BpmDomainId != null) {
                    BeanUtils.setProperty(object, DataProperty.BpmDomainId,
                        BpmDomainId);
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

                Object SysModuleId = resultSet.getObject(columnIndex++);

                object.setSysModuleIdNull(resultSet.getBoolean(columnIndex++));

                if (SysModuleId != null) {
                    BeanUtils.setProperty(object, DataProperty.SysModuleId,
                        SysModuleId);
                } // end if

                Object ModuleName = resultSet.getObject(columnIndex++);

                object.setModuleNameNull(resultSet.getBoolean(columnIndex++));

                if (ModuleName != null) {
                    BeanUtils.setProperty(object, DataProperty.ModuleName,
                        ModuleName);
                } // end if

                Object ModuleCode = resultSet.getObject(columnIndex++);

                object.setModuleCodeNull(resultSet.getBoolean(columnIndex++));

                if (ModuleCode != null) {
                    BeanUtils.setProperty(object, DataProperty.ModuleCode,
                        ModuleCode);
                } // end if

                Object ModuleIcon = resultSet.getObject(columnIndex++);

                object.setModuleIconNull(resultSet.getBoolean(columnIndex++));

                if (ModuleIcon != null) {
                    BeanUtils.setProperty(object, DataProperty.ModuleIcon,
                        ModuleIcon);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcBpmDomainSysModuleRelateRowMapper
} // end BaseBpmDomainSysModuleRelateDAOJdbcImpl
