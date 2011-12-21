/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.dao.impl;

import com.ourteam.middleware.dao.IMiddleWareToolInputOptionDAO;
import com.ourteam.middleware.dao.MiddleWareToolInputOption;
import com.ourteam.middleware.dao.MiddleWareToolInputOptionDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-12-08 15:07:01
 *
 * @author kylin
 */
abstract public class BaseMiddleWareToolInputOptionDAOJdbcImpl
    extends AbstractJdbcDAO implements IMiddleWareToolInputOptionDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, DisplayLabel, RealValue, Remarks, SortIndex, Status, ToolInputId
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.DisplayLabel, DataProperty.RealValue,
            DataProperty.Remarks, DataProperty.SortIndex, DataProperty.Status,
            DataProperty.ToolInputId
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
     * Creates a new BaseMiddleWareToolInputOptionDAOJdbcImpl object.
     */
    public BaseMiddleWareToolInputOptionDAOJdbcImpl() {
        super();
    } // end BaseMiddleWareToolInputOptionDAOJdbcImpl()

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
     * Check Unique MiddleWareToolInputOption
     *
     * @param aMiddleWareToolInputOption
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(
        MiddleWareToolInputOption aMiddleWareToolInputOption)
        throws Exception {
        if (aMiddleWareToolInputOption == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aMiddleWareToolInputOption,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IMiddleWareToolInputOption
     *
     * @param aMiddleWareToolInputOption
     *
     * @throws Exception
     */
    public void insertMiddleWareToolInputOption(
        MiddleWareToolInputOption aMiddleWareToolInputOption)
        throws Exception {
        insert(aMiddleWareToolInputOption);
    } // end insertMiddleWareToolInputOption()

    /**
     * Batch Insert IMiddleWareToolInputOption
     *
     * @param aMiddleWareToolInputOption
     *
     * @throws Exception
     */
    public void batchInsertMiddleWareToolInputOption(
        MiddleWareToolInputOption[] aMiddleWareToolInputOption)
        throws Exception {
        batchInsert(aMiddleWareToolInputOption);
    } // end batchInsertMiddleWareToolInputOption()

    /**
     * Delete IMiddleWareToolInputOption
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteMiddleWareToolInputOption(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteMiddleWareToolInputOption()

    /**
     * Delete IMiddleWareToolInputOption
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteMiddleWareToolInputOption(
        MiddleWareToolInputOptionDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteMiddleWareToolInputOption()

    /**
     * Update IMiddleWareToolInputOption Selective
     *
     * @param aMiddleWareToolInputOption
     *
     * @throws Exception
     */
    public void updateMiddleWareToolInputOption(
        MiddleWareToolInputOption aMiddleWareToolInputOption)
        throws Exception {
        if (aMiddleWareToolInputOption.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aMiddleWareToolInputOption);

        MiddleWareToolInputOption tempObj = findMiddleWareToolInputOptionById(aMiddleWareToolInputOption.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aMiddleWareToolInputOption, tempObj);
        } // end if
    } // end updateMiddleWareToolInputOption()

    /**
     * Batch Update IMiddleWareToolInputOption
     *
     * @param aMiddleWareToolInputOption
     *
     * @throws Exception
     */
    public void batchUpdateMiddleWareToolInputOption(
        MiddleWareToolInputOption[] aMiddleWareToolInputOption)
        throws Exception {
        batchUpdate(aMiddleWareToolInputOption);
    } // end batchUpdateMiddleWareToolInputOption()

    /**
     * Update IMiddleWareToolInputOption
     *
     * @param aMiddleWareToolInputOption
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateMiddleWareToolInputOption(
        MiddleWareToolInputOption aMiddleWareToolInputOption,
        MiddleWareToolInputOptionDAOQueryBean aQueryBean)
        throws Exception {
        updateByQuery(aMiddleWareToolInputOption, aQueryBean);
    } // end updateMiddleWareToolInputOption()

    /**
     * DOCUMENT ME!
     *
     * @param aMiddleWareToolInputOption DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(
        MiddleWareToolInputOption aMiddleWareToolInputOption)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aMiddleWareToolInputOptions DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeMiddleWareToolInputOption(
        MiddleWareToolInputOption[] aMiddleWareToolInputOptions,
        MiddleWareToolInputOptionDAOQueryBean aQueryBean)
        throws Exception {
        synchronizeMiddleWareToolInputOption(aMiddleWareToolInputOptions,
            aQueryBean, null);
    } // end synchronizeMiddleWareToolInputOption()

    /**
     * DOCUMENT ME!
     *
     * @param aMiddleWareToolInputOptions DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeMiddleWareToolInputOption(
        MiddleWareToolInputOption[] aMiddleWareToolInputOptions,
        MiddleWareToolInputOptionDAOQueryBean aQueryBean,
        MiddleWareToolInputOptionSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aMiddleWareToolInputOptions) == false) {
            inputList.addAll(Arrays.asList(aMiddleWareToolInputOptions));
        } // end if

        MiddleWareToolInputOption[] existentMiddleWareToolInputOptions = this.queryMiddleWareToolInputOption(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentMiddleWareToolInputOptions) == false) {
            existentList.addAll(Arrays.asList(
                    existentMiddleWareToolInputOptions));
        } // end if

        List willAddMiddleWareToolInputOptions = ListUtils.subtract(inputList,
                existentList);

        List willDeleteMiddleWareToolInputOptions = ListUtils.subtract(existentList,
                inputList);

        List willUpdateMiddleWareToolInputOptions = ListUtils.intersection(existentList,
                inputList);

        MiddleWareToolInputOption[] willUpdateMiddleWareToolInputOptionArray = (MiddleWareToolInputOption[]) willUpdateMiddleWareToolInputOptions.toArray(new MiddleWareToolInputOption[willUpdateMiddleWareToolInputOptions.size()]);
        MiddleWareToolInputOption[] willAddMiddleWareToolInputOptionArray = (MiddleWareToolInputOption[]) willAddMiddleWareToolInputOptions.toArray(new MiddleWareToolInputOption[willAddMiddleWareToolInputOptions.size()]);
        MiddleWareToolInputOption[] willDeleteMiddleWareToolInputOptionArray = (MiddleWareToolInputOption[]) willDeleteMiddleWareToolInputOptions.toArray(new MiddleWareToolInputOption[willDeleteMiddleWareToolInputOptions.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddMiddleWareToolInputOptionArray,
                willUpdateMiddleWareToolInputOptionArray,
                willDeleteMiddleWareToolInputOptionArray);
        } // end if

        if (willUpdateMiddleWareToolInputOptions.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateMiddleWareToolInputOptionArray);
            } // end if

            this.batchUpdateMiddleWareToolInputOption(willUpdateMiddleWareToolInputOptionArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateMiddleWareToolInputOptionArray);
            } // end if
        } // end if

        if (willAddMiddleWareToolInputOptions.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddMiddleWareToolInputOptionArray);
            } // end if

            this.batchInsertMiddleWareToolInputOption(willAddMiddleWareToolInputOptionArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddMiddleWareToolInputOptionArray);
            } // end if
        } // end if

        if (willDeleteMiddleWareToolInputOptions.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteMiddleWareToolInputOptionArray);
            } // end if

            for (int i = 0;
                    i < willDeleteMiddleWareToolInputOptionArray.length; i++) {
                MiddleWareToolInputOption object = willDeleteMiddleWareToolInputOptionArray[i];
                this.deleteMiddleWareToolInputOption(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteMiddleWareToolInputOptionArray);
            } // end if
        } // end if
    } // end synchronizeMiddleWareToolInputOption()

    /**
     * Query IMiddleWareToolInputOption
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public MiddleWareToolInputOption findMiddleWareToolInputOptionById(
        final long aId) throws Exception {
        MiddleWareToolInputOptionDAOQueryBean queryBean = new MiddleWareToolInputOptionDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        MiddleWareToolInputOption[] MiddleWareToolInputOptions = queryMiddleWareToolInputOption(queryBean);

        if (MiddleWareToolInputOptions.length == 0) {
            return null;
        } // end if
        else {
            return MiddleWareToolInputOptions[0];
        } // end else
    } // end findMiddleWareToolInputOptionById()

    /**
     * Query IMiddleWareToolInputOption
     *
     * @param queryBean
     *
     * @return IMiddleWareToolInputOption[]
     *
     * @throws Exception
     */
    public MiddleWareToolInputOption[] queryMiddleWareToolInputOption(
        MiddleWareToolInputOptionDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean,
                new JdbcMiddleWareToolInputOptionRowMapper());

        return (MiddleWareToolInputOption[]) result.toArray(new MiddleWareToolInputOption[result.size()]);
    } // end queryMiddleWareToolInputOption()

    /**
     * Query MiddleWareToolInputOption Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryMiddleWareToolInputOptionSelective(
        MiddleWareToolInputOptionDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryMiddleWareToolInputOptionSelective()

    /**
     * Query IMiddleWareToolInputOption Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryMiddleWareToolInputOptionCount(
        MiddleWareToolInputOptionDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryMiddleWareToolInputOptionCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcMiddleWareToolInputOptionRowMapper
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
            MiddleWareToolInputOption object = new MiddleWareToolInputOption();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object DisplayLabel = resultSet.getObject(columnIndex++);

                object.setDisplayLabelNull(resultSet.getBoolean(columnIndex++));

                if (DisplayLabel != null) {
                    BeanUtils.setProperty(object, DataProperty.DisplayLabel,
                        DisplayLabel);
                } // end if

                Object RealValue = resultSet.getObject(columnIndex++);

                object.setRealValueNull(resultSet.getBoolean(columnIndex++));

                if (RealValue != null) {
                    BeanUtils.setProperty(object, DataProperty.RealValue,
                        RealValue);
                } // end if

                Object Remarks = resultSet.getObject(columnIndex++);

                object.setRemarksNull(resultSet.getBoolean(columnIndex++));

                if (Remarks != null) {
                    BeanUtils.setProperty(object, DataProperty.Remarks, Remarks);
                } // end if

                Object SortIndex = resultSet.getObject(columnIndex++);

                object.setSortIndexNull(resultSet.getBoolean(columnIndex++));

                if (SortIndex != null) {
                    BeanUtils.setProperty(object, DataProperty.SortIndex,
                        SortIndex);
                } // end if

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object ToolInputId = resultSet.getObject(columnIndex++);

                object.setToolInputIdNull(resultSet.getBoolean(columnIndex++));

                if (ToolInputId != null) {
                    BeanUtils.setProperty(object, DataProperty.ToolInputId,
                        ToolInputId);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcMiddleWareToolInputOptionRowMapper
} // end BaseMiddleWareToolInputOptionDAOJdbcImpl
