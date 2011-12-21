/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao.impl;

import com.ourteam.system.dao.ISysSerialCodeDAO;
import com.ourteam.system.dao.SysSerialCode;
import com.ourteam.system.dao.SysSerialCodeDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-10-28 13:35:56
 *
 * @author kylin
 */
abstract public class BaseSysSerialCodeDAOJdbcImpl extends AbstractJdbcDAO
    implements ISysSerialCodeDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, CodeTemplate, CodeType, Remarks, SerialNumber,
            SerialNumberIncrement, Status, SerialNumberFormat
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.CodeTemplate, DataProperty.CodeType,
            DataProperty.Remarks, DataProperty.SerialNumber,
            DataProperty.SerialNumberIncrement, DataProperty.Status,
            DataProperty.SerialNumberFormat
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
     * Creates a new BaseSysSerialCodeDAOJdbcImpl object.
     */
    public BaseSysSerialCodeDAOJdbcImpl() {
        super();
    } // end BaseSysSerialCodeDAOJdbcImpl()

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
     * Check Unique SysSerialCode
     *
     * @param aSysSerialCode
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(SysSerialCode aSysSerialCode)
        throws Exception {
        if (aSysSerialCode == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aSysSerialCode,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert ISysSerialCode
     *
     * @param aSysSerialCode
     *
     * @throws Exception
     */
    public void insertSysSerialCode(SysSerialCode aSysSerialCode)
        throws Exception {
        insert(aSysSerialCode);
    } // end insertSysSerialCode()

    /**
     * Batch Insert ISysSerialCode
     *
     * @param aSysSerialCode
     *
     * @throws Exception
     */
    public void batchInsertSysSerialCode(SysSerialCode[] aSysSerialCode)
        throws Exception {
        batchInsert(aSysSerialCode);
    } // end batchInsertSysSerialCode()

    /**
     * Delete ISysSerialCode
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteSysSerialCode(final long aId) throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteSysSerialCode()

    /**
     * Delete ISysSerialCode
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteSysSerialCode(SysSerialCodeDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteSysSerialCode()

    /**
     * Update ISysSerialCode Selective
     *
     * @param aSysSerialCode
     *
     * @throws Exception
     */
    public void updateSysSerialCode(SysSerialCode aSysSerialCode)
        throws Exception {
        if (aSysSerialCode.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aSysSerialCode);

        SysSerialCode tempObj = findSysSerialCodeById(aSysSerialCode.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aSysSerialCode, tempObj);
        } // end if
    } // end updateSysSerialCode()

    /**
     * Batch Update ISysSerialCode
     *
     * @param aSysSerialCode
     *
     * @throws Exception
     */
    public void batchUpdateSysSerialCode(SysSerialCode[] aSysSerialCode)
        throws Exception {
        batchUpdate(aSysSerialCode);
    } // end batchUpdateSysSerialCode()

    /**
     * Update ISysSerialCode
     *
     * @param aSysSerialCode
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateSysSerialCode(SysSerialCode aSysSerialCode,
        SysSerialCodeDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aSysSerialCode, aQueryBean);
    } // end updateSysSerialCode()

    /**
     * DOCUMENT ME!
     *
     * @param aSysSerialCode DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(SysSerialCode aSysSerialCode)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aSysSerialCodes DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysSerialCode(SysSerialCode[] aSysSerialCodes,
        SysSerialCodeDAOQueryBean aQueryBean) throws Exception {
        synchronizeSysSerialCode(aSysSerialCodes, aQueryBean, null);
    } // end synchronizeSysSerialCode()

    /**
     * DOCUMENT ME!
     *
     * @param aSysSerialCodes DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeSysSerialCode(SysSerialCode[] aSysSerialCodes,
        SysSerialCodeDAOQueryBean aQueryBean,
        SysSerialCodeSynchronizeCallback aCallBack) throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aSysSerialCodes) == false) {
            inputList.addAll(Arrays.asList(aSysSerialCodes));
        } // end if

        SysSerialCode[] existentSysSerialCodes = this.querySysSerialCode(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentSysSerialCodes) == false) {
            existentList.addAll(Arrays.asList(existentSysSerialCodes));
        } // end if

        List willAddSysSerialCodes = ListUtils.subtract(inputList, existentList);

        List willDeleteSysSerialCodes = ListUtils.subtract(existentList,
                inputList);

        List willUpdateSysSerialCodes = ListUtils.intersection(existentList,
                inputList);

        SysSerialCode[] willUpdateSysSerialCodeArray = (SysSerialCode[]) willUpdateSysSerialCodes.toArray(new SysSerialCode[willUpdateSysSerialCodes.size()]);
        SysSerialCode[] willAddSysSerialCodeArray = (SysSerialCode[]) willAddSysSerialCodes.toArray(new SysSerialCode[willAddSysSerialCodes.size()]);
        SysSerialCode[] willDeleteSysSerialCodeArray = (SysSerialCode[]) willDeleteSysSerialCodes.toArray(new SysSerialCode[willDeleteSysSerialCodes.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddSysSerialCodeArray,
                willUpdateSysSerialCodeArray, willDeleteSysSerialCodeArray);
        } // end if

        if (willUpdateSysSerialCodes.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateSysSerialCodeArray);
            } // end if

            this.batchUpdateSysSerialCode(willUpdateSysSerialCodeArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateSysSerialCodeArray);
            } // end if
        } // end if

        if (willAddSysSerialCodes.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddSysSerialCodeArray);
            } // end if

            this.batchInsertSysSerialCode(willAddSysSerialCodeArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddSysSerialCodeArray);
            } // end if
        } // end if

        if (willDeleteSysSerialCodes.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteSysSerialCodeArray);
            } // end if

            for (int i = 0; i < willDeleteSysSerialCodeArray.length; i++) {
                SysSerialCode object = willDeleteSysSerialCodeArray[i];
                this.deleteSysSerialCode(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteSysSerialCodeArray);
            } // end if
        } // end if
    } // end synchronizeSysSerialCode()

    /**
     * Query ISysSerialCode
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public SysSerialCode findSysSerialCodeById(final long aId)
        throws Exception {
        SysSerialCodeDAOQueryBean queryBean = new SysSerialCodeDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        SysSerialCode[] SysSerialCodes = querySysSerialCode(queryBean);

        if (SysSerialCodes.length == 0) {
            return null;
        } // end if
        else {
            return SysSerialCodes[0];
        } // end else
    } // end findSysSerialCodeById()

    /**
     * Query ISysSerialCode
     *
     * @param queryBean
     *
     * @return ISysSerialCode[]
     *
     * @throws Exception
     */
    public SysSerialCode[] querySysSerialCode(
        SysSerialCodeDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcSysSerialCodeRowMapper());

        return (SysSerialCode[]) result.toArray(new SysSerialCode[result.size()]);
    } // end querySysSerialCode()

    /**
     * Query SysSerialCode Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] querySysSerialCodeSelective(
        SysSerialCodeDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end querySysSerialCodeSelective()

    /**
     * Query ISysSerialCode Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int querySysSerialCodeCount(SysSerialCodeDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end querySysSerialCodeCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcSysSerialCodeRowMapper
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
            SysSerialCode object = new SysSerialCode();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object CodeTemplate = resultSet.getObject(columnIndex++);

                object.setCodeTemplateNull(resultSet.getBoolean(columnIndex++));

                if (CodeTemplate != null) {
                    BeanUtils.setProperty(object, DataProperty.CodeTemplate,
                        CodeTemplate);
                } // end if

                Object CodeType = resultSet.getObject(columnIndex++);

                object.setCodeTypeNull(resultSet.getBoolean(columnIndex++));

                if (CodeType != null) {
                    BeanUtils.setProperty(object, DataProperty.CodeType,
                        CodeType);
                } // end if

                Object Remarks = resultSet.getObject(columnIndex++);

                object.setRemarksNull(resultSet.getBoolean(columnIndex++));

                if (Remarks != null) {
                    BeanUtils.setProperty(object, DataProperty.Remarks, Remarks);
                } // end if

                Object SerialNumber = resultSet.getObject(columnIndex++);

                object.setSerialNumberNull(resultSet.getBoolean(columnIndex++));

                if (SerialNumber != null) {
                    BeanUtils.setProperty(object, DataProperty.SerialNumber,
                        SerialNumber);
                } // end if

                Object SerialNumberIncrement = resultSet.getObject(columnIndex++);

                object.setSerialNumberIncrementNull(resultSet.getBoolean(
                        columnIndex++));

                if (SerialNumberIncrement != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.SerialNumberIncrement,
                        SerialNumberIncrement);
                } // end if

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object SerialNumberFormat = resultSet.getObject(columnIndex++);

                object.setSerialNumberFormatNull(resultSet.getBoolean(
                        columnIndex++));

                if (SerialNumberFormat != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.SerialNumberFormat, SerialNumberFormat);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcSysSerialCodeRowMapper
} // end BaseSysSerialCodeDAOJdbcImpl
