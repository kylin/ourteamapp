/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao.impl;

import com.ourteam.modelbase.dao.BusinessDomainGroup;
import com.ourteam.modelbase.dao.BusinessDomainGroupDAOQueryBean;
import com.ourteam.modelbase.dao.IBusinessDomainGroupDAO;

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
 * DAO JDBC Impl Generate Date : 2011-06-29 21:07:04
 *
 * @author Kylin
 */
abstract public class BaseBusinessDomainGroupDAOJdbcImpl extends AbstractJdbcDAO
    implements IBusinessDomainGroupDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, GroupName, Remarks, Status
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.GroupName, DataProperty.Remarks,
            DataProperty.Status
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
     * Creates a new BaseBusinessDomainGroupDAOJdbcImpl object.
     */
    public BaseBusinessDomainGroupDAOJdbcImpl() {
        super();
    } // end BaseBusinessDomainGroupDAOJdbcImpl()

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
     * Check Unique BusinessDomainGroup
     *
     * @param aBusinessDomainGroup
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(BusinessDomainGroup aBusinessDomainGroup)
        throws Exception {
        if (aBusinessDomainGroup == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aBusinessDomainGroup,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IBusinessDomainGroup
     *
     * @param aBusinessDomainGroup
     *
     * @throws Exception
     */
    public void insertBusinessDomainGroup(
        BusinessDomainGroup aBusinessDomainGroup) throws Exception {
        insert(aBusinessDomainGroup);
    } // end insertBusinessDomainGroup()

    /**
     * Batch Insert IBusinessDomainGroup
     *
     * @param aBusinessDomainGroup
     *
     * @throws Exception
     */
    public void batchInsertBusinessDomainGroup(
        BusinessDomainGroup[] aBusinessDomainGroup) throws Exception {
        batchInsert(aBusinessDomainGroup);
    } // end batchInsertBusinessDomainGroup()

    /**
     * Delete IBusinessDomainGroup
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteBusinessDomainGroup(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteBusinessDomainGroup()

    /**
     * Delete IBusinessDomainGroup
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteBusinessDomainGroup(
        BusinessDomainGroupDAOQueryBean queryBean) throws Exception {
        deleteByQuery(queryBean);
    } // end deleteBusinessDomainGroup()

    /**
     * Update IBusinessDomainGroup Selective
     *
     * @param aBusinessDomainGroup
     *
     * @throws Exception
     */
    public void updateBusinessDomainGroup(
        BusinessDomainGroup aBusinessDomainGroup) throws Exception {
        if (aBusinessDomainGroup.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aBusinessDomainGroup);

        BusinessDomainGroup tempObj = findBusinessDomainGroupById(aBusinessDomainGroup.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aBusinessDomainGroup, tempObj);
        } // end if
    } // end updateBusinessDomainGroup()

    /**
     * Batch Update IBusinessDomainGroup
     *
     * @param aBusinessDomainGroup
     *
     * @throws Exception
     */
    public void batchUpdateBusinessDomainGroup(
        BusinessDomainGroup[] aBusinessDomainGroup) throws Exception {
        batchUpdate(aBusinessDomainGroup);
    } // end batchUpdateBusinessDomainGroup()

    /**
     * Update IBusinessDomainGroup
     *
     * @param aBusinessDomainGroup
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateBusinessDomainGroup(
        BusinessDomainGroup aBusinessDomainGroup,
        BusinessDomainGroupDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aBusinessDomainGroup, aQueryBean);
    } // end updateBusinessDomainGroup()

    /**
     * DOCUMENT ME!
     *
     * @param aBusinessDomainGroup DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(BusinessDomainGroup aBusinessDomainGroup)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aBusinessDomainGroups DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBusinessDomainGroup(
        BusinessDomainGroup[] aBusinessDomainGroups,
        BusinessDomainGroupDAOQueryBean aQueryBean) throws Exception {
        synchronizeBusinessDomainGroup(aBusinessDomainGroups, aQueryBean, null);
    } // end synchronizeBusinessDomainGroup()

    /**
     * DOCUMENT ME!
     *
     * @param aBusinessDomainGroups DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBusinessDomainGroup(
        BusinessDomainGroup[] aBusinessDomainGroups,
        BusinessDomainGroupDAOQueryBean aQueryBean,
        BusinessDomainGroupSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aBusinessDomainGroups) == false) {
            inputList.addAll(Arrays.asList(aBusinessDomainGroups));
        } // end if

        BusinessDomainGroup[] existentBusinessDomainGroups = this.queryBusinessDomainGroup(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentBusinessDomainGroups) == false) {
            existentList.addAll(Arrays.asList(existentBusinessDomainGroups));
        } // end if

        List willAddBusinessDomainGroups = ListUtils.subtract(inputList,
                existentList);

        List willDeleteBusinessDomainGroups = ListUtils.subtract(existentList,
                inputList);

        List willUpdateBusinessDomainGroups = ListUtils.intersection(existentList,
                inputList);

        BusinessDomainGroup[] willUpdateBusinessDomainGroupArray = (BusinessDomainGroup[]) willUpdateBusinessDomainGroups.toArray(new BusinessDomainGroup[willUpdateBusinessDomainGroups.size()]);
        BusinessDomainGroup[] willAddBusinessDomainGroupArray = (BusinessDomainGroup[]) willAddBusinessDomainGroups.toArray(new BusinessDomainGroup[willAddBusinessDomainGroups.size()]);
        BusinessDomainGroup[] willDeleteBusinessDomainGroupArray = (BusinessDomainGroup[]) willDeleteBusinessDomainGroups.toArray(new BusinessDomainGroup[willDeleteBusinessDomainGroups.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddBusinessDomainGroupArray,
                willUpdateBusinessDomainGroupArray,
                willDeleteBusinessDomainGroupArray);
        } // end if

        if (willUpdateBusinessDomainGroups.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateBusinessDomainGroupArray);
            } // end if

            this.batchUpdateBusinessDomainGroup(willUpdateBusinessDomainGroupArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateBusinessDomainGroupArray);
            } // end if
        } // end if

        if (willAddBusinessDomainGroups.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddBusinessDomainGroupArray);
            } // end if

            this.batchInsertBusinessDomainGroup(willAddBusinessDomainGroupArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddBusinessDomainGroupArray);
            } // end if
        } // end if

        if (willDeleteBusinessDomainGroups.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteBusinessDomainGroupArray);
            } // end if

            for (int i = 0; i < willDeleteBusinessDomainGroupArray.length;
                    i++) {
                BusinessDomainGroup object = willDeleteBusinessDomainGroupArray[i];
                this.deleteBusinessDomainGroup(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteBusinessDomainGroupArray);
            } // end if
        } // end if
    } // end synchronizeBusinessDomainGroup()

    /**
     * Query IBusinessDomainGroup
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public BusinessDomainGroup findBusinessDomainGroupById(final long aId)
        throws Exception {
        BusinessDomainGroupDAOQueryBean queryBean = new BusinessDomainGroupDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        BusinessDomainGroup[] BusinessDomainGroups = queryBusinessDomainGroup(queryBean);

        if (BusinessDomainGroups.length == 0) {
            return null;
        } // end if
        else {
            return BusinessDomainGroups[0];
        } // end else
    } // end findBusinessDomainGroupById()

    /**
     * Query IBusinessDomainGroup
     *
     * @param queryBean
     *
     * @return IBusinessDomainGroup[]
     *
     * @throws Exception
     */
    public BusinessDomainGroup[] queryBusinessDomainGroup(
        BusinessDomainGroupDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean,
                new JdbcBusinessDomainGroupRowMapper());

        return (BusinessDomainGroup[]) result.toArray(new BusinessDomainGroup[result.size()]);
    } // end queryBusinessDomainGroup()

    /**
     * Query BusinessDomainGroup Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryBusinessDomainGroupSelective(
        BusinessDomainGroupDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryBusinessDomainGroupSelective()

    /**
     * Query IBusinessDomainGroup Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryBusinessDomainGroupCount(
        BusinessDomainGroupDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end queryBusinessDomainGroupCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcBusinessDomainGroupRowMapper
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
            BusinessDomainGroup object = new BusinessDomainGroup();

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

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcBusinessDomainGroupRowMapper
} // end BaseBusinessDomainGroupDAOJdbcImpl
