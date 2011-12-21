/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.dao.impl;

import com.ourteam.workspace.dao.IWorkspaceResourceBusinessPackageRelateDAO;
import com.ourteam.workspace.dao.WorkspaceResourceBusinessPackageRelate;
import com.ourteam.workspace.dao.WorkspaceResourceBusinessPackageRelateDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-06-10 22:46:12
 *
 * @author Kylin
 */
abstract public class BaseWorkspaceResourceBusinessPackageRelateDAOJdbcImpl
    extends AbstractJdbcDAO
    implements IWorkspaceResourceBusinessPackageRelateDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, BusinessPcakageId, Description, Status, WorkspaceResourceId,
            BusinessPackageName, BusinessDomainName, BusinessDomainId,
            BusinessPackageType
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.BusinessPcakageId,
            DataProperty.Description, DataProperty.Status,
            DataProperty.WorkspaceResourceId, DataProperty.BusinessPackageName,
            DataProperty.BusinessDomainName, DataProperty.BusinessDomainId,
            DataProperty.BusinessPackageType
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
     * Creates a new BaseWorkspaceResourceBusinessPackageRelateDAOJdbcImpl object.
     */
    public BaseWorkspaceResourceBusinessPackageRelateDAOJdbcImpl() {
        super();
    } // end BaseWorkspaceResourceBusinessPackageRelateDAOJdbcImpl()

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

            relatedJoinSQLBuffer.append(
                " LEFT JOIN BUSINESS_PACKAGE businessPackage ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " businessPackage.BUSINESS_PACKAGE_ID = WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.BUSINESS_PCAKAGE_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQLBuffer.append(
                " LEFT JOIN BUSINESS_DOMAIN businessDomain ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " businessDomain.BUSINESS_DOMAIN_ID = businessPackage.BUSINESS_DOMAIN_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique WorkspaceResourceBusinessPackageRelate
     *
     * @param aWorkspaceResourceBusinessPackageRelate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(
        WorkspaceResourceBusinessPackageRelate aWorkspaceResourceBusinessPackageRelate)
        throws Exception {
        if (aWorkspaceResourceBusinessPackageRelate == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(
                aWorkspaceResourceBusinessPackageRelate, DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IWorkspaceResourceBusinessPackageRelate
     *
     * @param aWorkspaceResourceBusinessPackageRelate
     *
     * @throws Exception
     */
    public void insertWorkspaceResourceBusinessPackageRelate(
        WorkspaceResourceBusinessPackageRelate aWorkspaceResourceBusinessPackageRelate)
        throws Exception {
        insert(aWorkspaceResourceBusinessPackageRelate);
    } // end insertWorkspaceResourceBusinessPackageRelate()

    /**
     * Batch Insert IWorkspaceResourceBusinessPackageRelate
     *
     * @param aWorkspaceResourceBusinessPackageRelate
     *
     * @throws Exception
     */
    public void batchInsertWorkspaceResourceBusinessPackageRelate(
        WorkspaceResourceBusinessPackageRelate[] aWorkspaceResourceBusinessPackageRelate)
        throws Exception {
        batchInsert(aWorkspaceResourceBusinessPackageRelate);
    } // end batchInsertWorkspaceResourceBusinessPackageRelate()

    /**
     * Delete IWorkspaceResourceBusinessPackageRelate
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteWorkspaceResourceBusinessPackageRelate(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteWorkspaceResourceBusinessPackageRelate()

    /**
     * Delete IWorkspaceResourceBusinessPackageRelate
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteWorkspaceResourceBusinessPackageRelate(
        WorkspaceResourceBusinessPackageRelateDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteWorkspaceResourceBusinessPackageRelate()

    /**
     * Update IWorkspaceResourceBusinessPackageRelate Selective
     *
     * @param aWorkspaceResourceBusinessPackageRelate
     *
     * @throws Exception
     */
    public void updateWorkspaceResourceBusinessPackageRelate(
        WorkspaceResourceBusinessPackageRelate aWorkspaceResourceBusinessPackageRelate)
        throws Exception {
        if (aWorkspaceResourceBusinessPackageRelate.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aWorkspaceResourceBusinessPackageRelate);

        WorkspaceResourceBusinessPackageRelate tempObj = findWorkspaceResourceBusinessPackageRelateById(aWorkspaceResourceBusinessPackageRelate.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aWorkspaceResourceBusinessPackageRelate,
                tempObj);
        } // end if
    } // end updateWorkspaceResourceBusinessPackageRelate()

    /**
     * Batch Update IWorkspaceResourceBusinessPackageRelate
     *
     * @param aWorkspaceResourceBusinessPackageRelate
     *
     * @throws Exception
     */
    public void batchUpdateWorkspaceResourceBusinessPackageRelate(
        WorkspaceResourceBusinessPackageRelate[] aWorkspaceResourceBusinessPackageRelate)
        throws Exception {
        batchUpdate(aWorkspaceResourceBusinessPackageRelate);
    } // end batchUpdateWorkspaceResourceBusinessPackageRelate()

    /**
     * Update IWorkspaceResourceBusinessPackageRelate
     *
     * @param aWorkspaceResourceBusinessPackageRelate
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateWorkspaceResourceBusinessPackageRelate(
        WorkspaceResourceBusinessPackageRelate aWorkspaceResourceBusinessPackageRelate,
        WorkspaceResourceBusinessPackageRelateDAOQueryBean aQueryBean)
        throws Exception {
        updateByQuery(aWorkspaceResourceBusinessPackageRelate, aQueryBean);
    } // end updateWorkspaceResourceBusinessPackageRelate()

    /**
     * DOCUMENT ME!
     *
     * @param aWorkspaceResourceBusinessPackageRelate DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(
        WorkspaceResourceBusinessPackageRelate aWorkspaceResourceBusinessPackageRelate)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aWorkspaceResourceBusinessPackageRelates DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeWorkspaceResourceBusinessPackageRelate(
        WorkspaceResourceBusinessPackageRelate[] aWorkspaceResourceBusinessPackageRelates,
        WorkspaceResourceBusinessPackageRelateDAOQueryBean aQueryBean)
        throws Exception {
        synchronizeWorkspaceResourceBusinessPackageRelate(aWorkspaceResourceBusinessPackageRelates,
            aQueryBean, null);
    } // end synchronizeWorkspaceResourceBusinessPackageRelate()

    /**
     * DOCUMENT ME!
     *
     * @param aWorkspaceResourceBusinessPackageRelates DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeWorkspaceResourceBusinessPackageRelate(
        WorkspaceResourceBusinessPackageRelate[] aWorkspaceResourceBusinessPackageRelates,
        WorkspaceResourceBusinessPackageRelateDAOQueryBean aQueryBean,
        WorkspaceResourceBusinessPackageRelateSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aWorkspaceResourceBusinessPackageRelates) == false) {
            inputList.addAll(Arrays.asList(
                    aWorkspaceResourceBusinessPackageRelates));
        } // end if

        WorkspaceResourceBusinessPackageRelate[] existentWorkspaceResourceBusinessPackageRelates =
            this.queryWorkspaceResourceBusinessPackageRelate(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentWorkspaceResourceBusinessPackageRelates) == false) {
            existentList.addAll(Arrays.asList(
                    existentWorkspaceResourceBusinessPackageRelates));
        } // end if

        List willAddWorkspaceResourceBusinessPackageRelates = ListUtils.subtract(inputList,
                existentList);

        List willDeleteWorkspaceResourceBusinessPackageRelates = ListUtils.subtract(existentList,
                inputList);

        List willUpdateWorkspaceResourceBusinessPackageRelates = ListUtils.intersection(existentList,
                inputList);

        WorkspaceResourceBusinessPackageRelate[] willUpdateWorkspaceResourceBusinessPackageRelateArray =
            (WorkspaceResourceBusinessPackageRelate[]) willUpdateWorkspaceResourceBusinessPackageRelates.toArray(new WorkspaceResourceBusinessPackageRelate[willUpdateWorkspaceResourceBusinessPackageRelates.size()]);
        WorkspaceResourceBusinessPackageRelate[] willAddWorkspaceResourceBusinessPackageRelateArray =
            (WorkspaceResourceBusinessPackageRelate[]) willAddWorkspaceResourceBusinessPackageRelates.toArray(new WorkspaceResourceBusinessPackageRelate[willAddWorkspaceResourceBusinessPackageRelates.size()]);
        WorkspaceResourceBusinessPackageRelate[] willDeleteWorkspaceResourceBusinessPackageRelateArray =
            (WorkspaceResourceBusinessPackageRelate[]) willDeleteWorkspaceResourceBusinessPackageRelates.toArray(new WorkspaceResourceBusinessPackageRelate[willDeleteWorkspaceResourceBusinessPackageRelates.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddWorkspaceResourceBusinessPackageRelateArray,
                willUpdateWorkspaceResourceBusinessPackageRelateArray,
                willDeleteWorkspaceResourceBusinessPackageRelateArray);
        } // end if

        if (willUpdateWorkspaceResourceBusinessPackageRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateWorkspaceResourceBusinessPackageRelateArray);
            } // end if

            this.batchUpdateWorkspaceResourceBusinessPackageRelate(willUpdateWorkspaceResourceBusinessPackageRelateArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateWorkspaceResourceBusinessPackageRelateArray);
            } // end if
        } // end if

        if (willAddWorkspaceResourceBusinessPackageRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddWorkspaceResourceBusinessPackageRelateArray);
            } // end if

            this.batchInsertWorkspaceResourceBusinessPackageRelate(willAddWorkspaceResourceBusinessPackageRelateArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddWorkspaceResourceBusinessPackageRelateArray);
            } // end if
        } // end if

        if (willDeleteWorkspaceResourceBusinessPackageRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteWorkspaceResourceBusinessPackageRelateArray);
            } // end if

            for (int i = 0;
                    i < willDeleteWorkspaceResourceBusinessPackageRelateArray.length;
                    i++) {
                WorkspaceResourceBusinessPackageRelate object = willDeleteWorkspaceResourceBusinessPackageRelateArray[i];
                this.deleteWorkspaceResourceBusinessPackageRelate(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteWorkspaceResourceBusinessPackageRelateArray);
            } // end if
        } // end if
    } // end synchronizeWorkspaceResourceBusinessPackageRelate()

    /**
     * Query IWorkspaceResourceBusinessPackageRelate
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public WorkspaceResourceBusinessPackageRelate findWorkspaceResourceBusinessPackageRelateById(
        final long aId) throws Exception {
        WorkspaceResourceBusinessPackageRelateDAOQueryBean queryBean = new WorkspaceResourceBusinessPackageRelateDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        WorkspaceResourceBusinessPackageRelate[] WorkspaceResourceBusinessPackageRelates =
            queryWorkspaceResourceBusinessPackageRelate(queryBean);

        if (WorkspaceResourceBusinessPackageRelates.length == 0) {
            return null;
        } // end if
        else {
            return WorkspaceResourceBusinessPackageRelates[0];
        } // end else
    } // end findWorkspaceResourceBusinessPackageRelateById()

    /**
     * Query IWorkspaceResourceBusinessPackageRelate
     *
     * @param queryBean
     *
     * @return IWorkspaceResourceBusinessPackageRelate[]
     *
     * @throws Exception
     */
    public WorkspaceResourceBusinessPackageRelate[] queryWorkspaceResourceBusinessPackageRelate(
        WorkspaceResourceBusinessPackageRelateDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean,
                new JdbcWorkspaceResourceBusinessPackageRelateRowMapper());

        return (WorkspaceResourceBusinessPackageRelate[]) result.toArray(new WorkspaceResourceBusinessPackageRelate[result.size()]);
    } // end queryWorkspaceResourceBusinessPackageRelate()

    /**
     * Query WorkspaceResourceBusinessPackageRelate Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryWorkspaceResourceBusinessPackageRelateSelective(
        WorkspaceResourceBusinessPackageRelateDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryWorkspaceResourceBusinessPackageRelateSelective()

    /**
     * Query IWorkspaceResourceBusinessPackageRelate Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryWorkspaceResourceBusinessPackageRelateCount(
        WorkspaceResourceBusinessPackageRelateDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryWorkspaceResourceBusinessPackageRelateCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcWorkspaceResourceBusinessPackageRelateRowMapper
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
            WorkspaceResourceBusinessPackageRelate object = new WorkspaceResourceBusinessPackageRelate();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object BusinessPcakageId = resultSet.getObject(columnIndex++);

                object.setBusinessPcakageIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (BusinessPcakageId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.BusinessPcakageId, BusinessPcakageId);
                } // end if

                Object Description = resultSet.getObject(columnIndex++);

                object.setDescriptionNull(resultSet.getBoolean(columnIndex++));

                if (Description != null) {
                    BeanUtils.setProperty(object, DataProperty.Description,
                        Description);
                } // end if

                Object Status = resultSet.getObject(columnIndex++);

                object.setStatusNull(resultSet.getBoolean(columnIndex++));

                if (Status != null) {
                    BeanUtils.setProperty(object, DataProperty.Status, Status);
                } // end if

                Object WorkspaceResourceId = resultSet.getObject(columnIndex++);

                object.setWorkspaceResourceIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (WorkspaceResourceId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.WorkspaceResourceId, WorkspaceResourceId);
                } // end if

                Object BusinessPackageName = resultSet.getObject(columnIndex++);

                object.setBusinessPackageNameNull(resultSet.getBoolean(
                        columnIndex++));

                if (BusinessPackageName != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.BusinessPackageName, BusinessPackageName);
                } // end if

                Object BusinessDomainName = resultSet.getObject(columnIndex++);

                object.setBusinessDomainNameNull(resultSet.getBoolean(
                        columnIndex++));

                if (BusinessDomainName != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.BusinessDomainName, BusinessDomainName);
                } // end if

                Object BusinessDomainId = resultSet.getObject(columnIndex++);

                object.setBusinessDomainIdNull(resultSet.getBoolean(
                        columnIndex++));

                if (BusinessDomainId != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.BusinessDomainId, BusinessDomainId);
                } // end if

                Object BusinessPackageType = resultSet.getObject(columnIndex++);

                object.setBusinessPackageTypeNull(resultSet.getBoolean(
                        columnIndex++));

                if (BusinessPackageType != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.BusinessPackageType, BusinessPackageType);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcWorkspaceResourceBusinessPackageRelateRowMapper
} // end BaseWorkspaceResourceBusinessPackageRelateDAOJdbcImpl
