/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.dao.impl;

import com.ourteam.middleware.dao.IMiddleWareToolGroupDAO;
import com.ourteam.middleware.dao.MiddleWareToolGroup;
import com.ourteam.middleware.dao.MiddleWareToolGroupDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-12-07 08:48:27
 *
 * @author kylin
 */
abstract public class BaseMiddleWareToolGroupDAOJdbcImpl extends AbstractJdbcDAO
    implements IMiddleWareToolGroupDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, GroupName, Remarks, SortIndex, Status, ParentGroupId, ProviderId
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.GroupName, DataProperty.Remarks,
            DataProperty.SortIndex, DataProperty.Status,
            DataProperty.ParentGroupId, DataProperty.ProviderId
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
     * Creates a new BaseMiddleWareToolGroupDAOJdbcImpl object.
     */
    public BaseMiddleWareToolGroupDAOJdbcImpl() {
        super();
    } // end BaseMiddleWareToolGroupDAOJdbcImpl()

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
     * Check Unique MiddleWareToolGroup
     *
     * @param aMiddleWareToolGroup
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(MiddleWareToolGroup aMiddleWareToolGroup)
        throws Exception {
        if (aMiddleWareToolGroup == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aMiddleWareToolGroup,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IMiddleWareToolGroup
     *
     * @param aMiddleWareToolGroup
     *
     * @throws Exception
     */
    public void insertMiddleWareToolGroup(
        MiddleWareToolGroup aMiddleWareToolGroup) throws Exception {
        insert(aMiddleWareToolGroup);
    } // end insertMiddleWareToolGroup()

    /**
     * Batch Insert IMiddleWareToolGroup
     *
     * @param aMiddleWareToolGroup
     *
     * @throws Exception
     */
    public void batchInsertMiddleWareToolGroup(
        MiddleWareToolGroup[] aMiddleWareToolGroup) throws Exception {
        batchInsert(aMiddleWareToolGroup);
    } // end batchInsertMiddleWareToolGroup()

    /**
     * Delete IMiddleWareToolGroup
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteMiddleWareToolGroup(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteMiddleWareToolGroup()

    /**
     * Delete IMiddleWareToolGroup
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteMiddleWareToolGroup(
        MiddleWareToolGroupDAOQueryBean queryBean) throws Exception {
        deleteByQuery(queryBean);
    } // end deleteMiddleWareToolGroup()

    /**
     * Update IMiddleWareToolGroup Selective
     *
     * @param aMiddleWareToolGroup
     *
     * @throws Exception
     */
    public void updateMiddleWareToolGroup(
        MiddleWareToolGroup aMiddleWareToolGroup) throws Exception {
        if (aMiddleWareToolGroup.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aMiddleWareToolGroup);

        MiddleWareToolGroup tempObj = findMiddleWareToolGroupById(aMiddleWareToolGroup.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aMiddleWareToolGroup, tempObj);
        } // end if
    } // end updateMiddleWareToolGroup()

    /**
     * Batch Update IMiddleWareToolGroup
     *
     * @param aMiddleWareToolGroup
     *
     * @throws Exception
     */
    public void batchUpdateMiddleWareToolGroup(
        MiddleWareToolGroup[] aMiddleWareToolGroup) throws Exception {
        batchUpdate(aMiddleWareToolGroup);
    } // end batchUpdateMiddleWareToolGroup()

    /**
     * Update IMiddleWareToolGroup
     *
     * @param aMiddleWareToolGroup
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateMiddleWareToolGroup(
        MiddleWareToolGroup aMiddleWareToolGroup,
        MiddleWareToolGroupDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aMiddleWareToolGroup, aQueryBean);
    } // end updateMiddleWareToolGroup()

    /**
     * DOCUMENT ME!
     *
     * @param aMiddleWareToolGroup DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(MiddleWareToolGroup aMiddleWareToolGroup)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aMiddleWareToolGroups DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeMiddleWareToolGroup(
        MiddleWareToolGroup[] aMiddleWareToolGroups,
        MiddleWareToolGroupDAOQueryBean aQueryBean) throws Exception {
        synchronizeMiddleWareToolGroup(aMiddleWareToolGroups, aQueryBean, null);
    } // end synchronizeMiddleWareToolGroup()

    /**
     * DOCUMENT ME!
     *
     * @param aMiddleWareToolGroups DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeMiddleWareToolGroup(
        MiddleWareToolGroup[] aMiddleWareToolGroups,
        MiddleWareToolGroupDAOQueryBean aQueryBean,
        MiddleWareToolGroupSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aMiddleWareToolGroups) == false) {
            inputList.addAll(Arrays.asList(aMiddleWareToolGroups));
        } // end if

        MiddleWareToolGroup[] existentMiddleWareToolGroups = this.queryMiddleWareToolGroup(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentMiddleWareToolGroups) == false) {
            existentList.addAll(Arrays.asList(existentMiddleWareToolGroups));
        } // end if

        List willAddMiddleWareToolGroups = ListUtils.subtract(inputList,
                existentList);

        List willDeleteMiddleWareToolGroups = ListUtils.subtract(existentList,
                inputList);

        List willUpdateMiddleWareToolGroups = ListUtils.intersection(existentList,
                inputList);

        MiddleWareToolGroup[] willUpdateMiddleWareToolGroupArray = (MiddleWareToolGroup[]) willUpdateMiddleWareToolGroups.toArray(new MiddleWareToolGroup[willUpdateMiddleWareToolGroups.size()]);
        MiddleWareToolGroup[] willAddMiddleWareToolGroupArray = (MiddleWareToolGroup[]) willAddMiddleWareToolGroups.toArray(new MiddleWareToolGroup[willAddMiddleWareToolGroups.size()]);
        MiddleWareToolGroup[] willDeleteMiddleWareToolGroupArray = (MiddleWareToolGroup[]) willDeleteMiddleWareToolGroups.toArray(new MiddleWareToolGroup[willDeleteMiddleWareToolGroups.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddMiddleWareToolGroupArray,
                willUpdateMiddleWareToolGroupArray,
                willDeleteMiddleWareToolGroupArray);
        } // end if

        if (willUpdateMiddleWareToolGroups.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateMiddleWareToolGroupArray);
            } // end if

            this.batchUpdateMiddleWareToolGroup(willUpdateMiddleWareToolGroupArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateMiddleWareToolGroupArray);
            } // end if
        } // end if

        if (willAddMiddleWareToolGroups.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddMiddleWareToolGroupArray);
            } // end if

            this.batchInsertMiddleWareToolGroup(willAddMiddleWareToolGroupArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddMiddleWareToolGroupArray);
            } // end if
        } // end if

        if (willDeleteMiddleWareToolGroups.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteMiddleWareToolGroupArray);
            } // end if

            for (int i = 0; i < willDeleteMiddleWareToolGroupArray.length;
                    i++) {
                MiddleWareToolGroup object = willDeleteMiddleWareToolGroupArray[i];
                this.deleteMiddleWareToolGroup(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteMiddleWareToolGroupArray);
            } // end if
        } // end if
    } // end synchronizeMiddleWareToolGroup()

    /**
     * Query IMiddleWareToolGroup
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public MiddleWareToolGroup findMiddleWareToolGroupById(final long aId)
        throws Exception {
        MiddleWareToolGroupDAOQueryBean queryBean = new MiddleWareToolGroupDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        MiddleWareToolGroup[] MiddleWareToolGroups = queryMiddleWareToolGroup(queryBean);

        if (MiddleWareToolGroups.length == 0) {
            return null;
        } // end if
        else {
            return MiddleWareToolGroups[0];
        } // end else
    } // end findMiddleWareToolGroupById()

    /**
     * Query IMiddleWareToolGroup
     *
     * @param queryBean
     *
     * @return IMiddleWareToolGroup[]
     *
     * @throws Exception
     */
    public MiddleWareToolGroup[] queryMiddleWareToolGroup(
        MiddleWareToolGroupDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean,
                new JdbcMiddleWareToolGroupRowMapper());

        return (MiddleWareToolGroup[]) result.toArray(new MiddleWareToolGroup[result.size()]);
    } // end queryMiddleWareToolGroup()

    /**
     * Query MiddleWareToolGroup Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryMiddleWareToolGroupSelective(
        MiddleWareToolGroupDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryMiddleWareToolGroupSelective()

    /**
     * Query IMiddleWareToolGroup Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryMiddleWareToolGroupCount(
        MiddleWareToolGroupDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end queryMiddleWareToolGroupCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcMiddleWareToolGroupRowMapper
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
            MiddleWareToolGroup object = new MiddleWareToolGroup();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object GroupName = resultSet.getObject(columnIndex++);

                object.setGroupNameNull(resultSet.getBoolean(columnIndex++));

                if (GroupName != null) {
                    BeanUtils.setProperty(object, DataProperty.GroupName,
                        GroupName);
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

                Object ParentGroupId = resultSet.getObject(columnIndex++);

                object.setParentGroupIdNull(resultSet.getBoolean(columnIndex++));

                if (ParentGroupId != null) {
                    BeanUtils.setProperty(object, DataProperty.ParentGroupId,
                        ParentGroupId);
                } // end if

                Object ProviderId = resultSet.getObject(columnIndex++);

                object.setProviderIdNull(resultSet.getBoolean(columnIndex++));

                if (ProviderId != null) {
                    BeanUtils.setProperty(object, DataProperty.ProviderId,
                        ProviderId);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcMiddleWareToolGroupRowMapper
} // end BaseMiddleWareToolGroupDAOJdbcImpl
