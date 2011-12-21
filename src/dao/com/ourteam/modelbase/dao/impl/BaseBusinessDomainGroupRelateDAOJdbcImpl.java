/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao.impl;

import com.ourteam.modelbase.dao.BusinessDomainGroupRelate;
import com.ourteam.modelbase.dao.BusinessDomainGroupRelateDAOQueryBean;
import com.ourteam.modelbase.dao.IBusinessDomainGroupRelateDAO;

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
abstract public class BaseBusinessDomainGroupRelateDAOJdbcImpl
    extends AbstractJdbcDAO implements IBusinessDomainGroupRelateDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, DomainId, GroupId, Remarks, Status, DomainName, GroupName
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.DomainId, DataProperty.GroupId,
            DataProperty.Remarks, DataProperty.Status, DataProperty.DomainName,
            DataProperty.GroupName
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
     * Creates a new BaseBusinessDomainGroupRelateDAOJdbcImpl object.
     */
    public BaseBusinessDomainGroupRelateDAOJdbcImpl() {
        super();
    } // end BaseBusinessDomainGroupRelateDAOJdbcImpl()

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
                " LEFT JOIN BUSINESS_DOMAIN businessDomainB ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " businessDomainB.BUSINESS_DOMAIN_ID = BUSINESS_DOMAIN_GROUP_RELATE.DOMAIN_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQLBuffer.append(
                " LEFT JOIN BUSINESS_DOMAIN_GROUP businessDomainGroupB ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " businessDomainGroupB.ID = BUSINESS_DOMAIN_GROUP_RELATE.GROUP_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique BusinessDomainGroupRelate
     *
     * @param aBusinessDomainGroupRelate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(
        BusinessDomainGroupRelate aBusinessDomainGroupRelate)
        throws Exception {
        if (aBusinessDomainGroupRelate == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aBusinessDomainGroupRelate,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IBusinessDomainGroupRelate
     *
     * @param aBusinessDomainGroupRelate
     *
     * @throws Exception
     */
    public void insertBusinessDomainGroupRelate(
        BusinessDomainGroupRelate aBusinessDomainGroupRelate)
        throws Exception {
        insert(aBusinessDomainGroupRelate);
    } // end insertBusinessDomainGroupRelate()

    /**
     * Batch Insert IBusinessDomainGroupRelate
     *
     * @param aBusinessDomainGroupRelate
     *
     * @throws Exception
     */
    public void batchInsertBusinessDomainGroupRelate(
        BusinessDomainGroupRelate[] aBusinessDomainGroupRelate)
        throws Exception {
        batchInsert(aBusinessDomainGroupRelate);
    } // end batchInsertBusinessDomainGroupRelate()

    /**
     * Delete IBusinessDomainGroupRelate
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteBusinessDomainGroupRelate(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteBusinessDomainGroupRelate()

    /**
     * Delete IBusinessDomainGroupRelate
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteBusinessDomainGroupRelate(
        BusinessDomainGroupRelateDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteBusinessDomainGroupRelate()

    /**
     * Update IBusinessDomainGroupRelate Selective
     *
     * @param aBusinessDomainGroupRelate
     *
     * @throws Exception
     */
    public void updateBusinessDomainGroupRelate(
        BusinessDomainGroupRelate aBusinessDomainGroupRelate)
        throws Exception {
        if (aBusinessDomainGroupRelate.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aBusinessDomainGroupRelate);

        BusinessDomainGroupRelate tempObj = findBusinessDomainGroupRelateById(aBusinessDomainGroupRelate.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aBusinessDomainGroupRelate, tempObj);
        } // end if
    } // end updateBusinessDomainGroupRelate()

    /**
     * Batch Update IBusinessDomainGroupRelate
     *
     * @param aBusinessDomainGroupRelate
     *
     * @throws Exception
     */
    public void batchUpdateBusinessDomainGroupRelate(
        BusinessDomainGroupRelate[] aBusinessDomainGroupRelate)
        throws Exception {
        batchUpdate(aBusinessDomainGroupRelate);
    } // end batchUpdateBusinessDomainGroupRelate()

    /**
     * Update IBusinessDomainGroupRelate
     *
     * @param aBusinessDomainGroupRelate
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateBusinessDomainGroupRelate(
        BusinessDomainGroupRelate aBusinessDomainGroupRelate,
        BusinessDomainGroupRelateDAOQueryBean aQueryBean)
        throws Exception {
        updateByQuery(aBusinessDomainGroupRelate, aQueryBean);
    } // end updateBusinessDomainGroupRelate()

    /**
     * DOCUMENT ME!
     *
     * @param aBusinessDomainGroupRelate DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(
        BusinessDomainGroupRelate aBusinessDomainGroupRelate)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aBusinessDomainGroupRelates DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBusinessDomainGroupRelate(
        BusinessDomainGroupRelate[] aBusinessDomainGroupRelates,
        BusinessDomainGroupRelateDAOQueryBean aQueryBean)
        throws Exception {
        synchronizeBusinessDomainGroupRelate(aBusinessDomainGroupRelates,
            aQueryBean, null);
    } // end synchronizeBusinessDomainGroupRelate()

    /**
     * DOCUMENT ME!
     *
     * @param aBusinessDomainGroupRelates DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBusinessDomainGroupRelate(
        BusinessDomainGroupRelate[] aBusinessDomainGroupRelates,
        BusinessDomainGroupRelateDAOQueryBean aQueryBean,
        BusinessDomainGroupRelateSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aBusinessDomainGroupRelates) == false) {
            inputList.addAll(Arrays.asList(aBusinessDomainGroupRelates));
        } // end if

        BusinessDomainGroupRelate[] existentBusinessDomainGroupRelates = this.queryBusinessDomainGroupRelate(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentBusinessDomainGroupRelates) == false) {
            existentList.addAll(Arrays.asList(
                    existentBusinessDomainGroupRelates));
        } // end if

        List willAddBusinessDomainGroupRelates = ListUtils.subtract(inputList,
                existentList);

        List willDeleteBusinessDomainGroupRelates = ListUtils.subtract(existentList,
                inputList);

        List willUpdateBusinessDomainGroupRelates = ListUtils.intersection(existentList,
                inputList);

        BusinessDomainGroupRelate[] willUpdateBusinessDomainGroupRelateArray = (BusinessDomainGroupRelate[]) willUpdateBusinessDomainGroupRelates.toArray(new BusinessDomainGroupRelate[willUpdateBusinessDomainGroupRelates.size()]);
        BusinessDomainGroupRelate[] willAddBusinessDomainGroupRelateArray = (BusinessDomainGroupRelate[]) willAddBusinessDomainGroupRelates.toArray(new BusinessDomainGroupRelate[willAddBusinessDomainGroupRelates.size()]);
        BusinessDomainGroupRelate[] willDeleteBusinessDomainGroupRelateArray = (BusinessDomainGroupRelate[]) willDeleteBusinessDomainGroupRelates.toArray(new BusinessDomainGroupRelate[willDeleteBusinessDomainGroupRelates.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddBusinessDomainGroupRelateArray,
                willUpdateBusinessDomainGroupRelateArray,
                willDeleteBusinessDomainGroupRelateArray);
        } // end if

        if (willUpdateBusinessDomainGroupRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateBusinessDomainGroupRelateArray);
            } // end if

            this.batchUpdateBusinessDomainGroupRelate(willUpdateBusinessDomainGroupRelateArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateBusinessDomainGroupRelateArray);
            } // end if
        } // end if

        if (willAddBusinessDomainGroupRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddBusinessDomainGroupRelateArray);
            } // end if

            this.batchInsertBusinessDomainGroupRelate(willAddBusinessDomainGroupRelateArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddBusinessDomainGroupRelateArray);
            } // end if
        } // end if

        if (willDeleteBusinessDomainGroupRelates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteBusinessDomainGroupRelateArray);
            } // end if

            for (int i = 0;
                    i < willDeleteBusinessDomainGroupRelateArray.length; i++) {
                BusinessDomainGroupRelate object = willDeleteBusinessDomainGroupRelateArray[i];
                this.deleteBusinessDomainGroupRelate(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteBusinessDomainGroupRelateArray);
            } // end if
        } // end if
    } // end synchronizeBusinessDomainGroupRelate()

    /**
     * Query IBusinessDomainGroupRelate
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public BusinessDomainGroupRelate findBusinessDomainGroupRelateById(
        final long aId) throws Exception {
        BusinessDomainGroupRelateDAOQueryBean queryBean = new BusinessDomainGroupRelateDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        BusinessDomainGroupRelate[] BusinessDomainGroupRelates = queryBusinessDomainGroupRelate(queryBean);

        if (BusinessDomainGroupRelates.length == 0) {
            return null;
        } // end if
        else {
            return BusinessDomainGroupRelates[0];
        } // end else
    } // end findBusinessDomainGroupRelateById()

    /**
     * Query IBusinessDomainGroupRelate
     *
     * @param queryBean
     *
     * @return IBusinessDomainGroupRelate[]
     *
     * @throws Exception
     */
    public BusinessDomainGroupRelate[] queryBusinessDomainGroupRelate(
        BusinessDomainGroupRelateDAOQueryBean queryBean)
        throws Exception {
        List result = this.query(queryBean,
                new JdbcBusinessDomainGroupRelateRowMapper());

        return (BusinessDomainGroupRelate[]) result.toArray(new BusinessDomainGroupRelate[result.size()]);
    } // end queryBusinessDomainGroupRelate()

    /**
     * Query BusinessDomainGroupRelate Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryBusinessDomainGroupRelateSelective(
        BusinessDomainGroupRelateDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryBusinessDomainGroupRelateSelective()

    /**
     * Query IBusinessDomainGroupRelate Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryBusinessDomainGroupRelateCount(
        BusinessDomainGroupRelateDAOQueryBean queryBean)
        throws Exception {
        return queryCount(queryBean);
    } // end queryBusinessDomainGroupRelateCount()

    /**
     * DOCUMENT ME!
     */
    private com.ourteam.modelbase.dao.impl.BaseBusinessDomainDAOJdbcImpl businessDomain;

    /**
     * DOCUMENT ME!
     *
     * @param businessDomain DOCUMENT ME!
     */
    public void setBusinessDomain(
        com.ourteam.modelbase.dao.impl.BaseBusinessDomainDAOJdbcImpl businessDomain) {
        this.businessDomain = businessDomain;
    } // end setBusinessDomain()

    /**
     * Query Related IBusinessDomain
     *
     * @param aDaoQueryBean DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     *
     * @model type="IBusinessDomain" containment="true"
     */
    public com.ourteam.modelbase.dao.BusinessDomain[] queryBusinessDomains(
        BusinessDomainGroupRelateDAOQueryBean aDaoQueryBean)
        throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN BUSINESS_DOMAIN_GROUP_RELATE ON ( ");

        joinSQL.append(
            " BUSINESS_DOMAIN.BUSINESS_DOMAIN_ID = BUSINESS_DOMAIN_GROUP_RELATE.DOMAIN_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.modelbase.dao.IBusinessDomainDAO.EntityName;

        String[] entityFields = com.ourteam.modelbase.dao.impl.BaseBusinessDomainDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.modelbase.dao.impl.BaseBusinessDomainDAOJdbcImpl.ENTITY_PROPERTIES;

        List list = businessDomain.query(entityName, entityFields,
                entityProperties, aDaoQueryBean, joinSQL.toString(),
                new com.ourteam.modelbase.dao.impl.BaseBusinessDomainDAOJdbcImpl.JdbcBusinessDomainRowMapper());

        return (com.ourteam.modelbase.dao.BusinessDomain[]) list.toArray(new com.ourteam.modelbase.dao.BusinessDomain[list.size()]);
    } // end queryBusinessDomains()

    /**
     * Query BusinessDomainGroupRelate Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryBusinessDomainsSelective(
        BusinessDomainGroupRelateDAOQueryBean aQueryBean)
        throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IBusinessDomainDAO.BusinessDomainId,
                "businessDomainId");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IBusinessDomainDAO.Code,
                "code");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IBusinessDomainDAO.Description,
                "description");

            aQueryBean.addSelectProperty(com.ourteam.modelbase.dao.IBusinessDomainDAO.Name,
                "name");
        } // end if

        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN BUSINESS_DOMAIN_GROUP_RELATE ON ( ");

        joinSQL.append(
            " BUSINESS_DOMAIN.BUSINESS_DOMAIN_ID = BUSINESS_DOMAIN_GROUP_RELATE.DOMAIN_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.modelbase.dao.IBusinessDomainDAO.EntityName;

        return businessDomain.querySelective(entityName, aQueryBean,
            joinSQL.toString());
    } // end queryBusinessDomainsSelective()

    /**
     * Update Related IBusinessDomain
     *
     * @param aBusinessDomain {relatAttr.property.capName}
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void updateBusinessDomain(
        com.ourteam.modelbase.dao.BusinessDomain aBusinessDomain,
        BusinessDomainGroupRelateDAOQueryBean aQueryBean)
        throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN BUSINESS_DOMAIN_GROUP_RELATE ON ( ");

        joinSQL.append(
            " BUSINESS_DOMAIN.BUSINESS_DOMAIN_ID = BUSINESS_DOMAIN_GROUP_RELATE.DOMAIN_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.modelbase.dao.IBusinessDomainDAO.EntityName;

        String[] entityFields = com.ourteam.modelbase.dao.impl.BaseBusinessDomainDAOJdbcImpl.ENTITY_FIELDS;

        String[] entityProperties = com.ourteam.modelbase.dao.impl.BaseBusinessDomainDAOJdbcImpl.ENTITY_PROPERTIES;

        businessDomain.updateByQuery(entityName, entityFields,
            entityProperties, joinSQL.toString(), aBusinessDomain, aQueryBean);
    } // end updateBusinessDomain()

    /**
     * Delete Related IBusinessDomain
     *
     * @param aQueryBean
     *
     * @throws Exception
     *
     * @model
     */
    public void deleteBusinessDomain(
        BusinessDomainGroupRelateDAOQueryBean aQueryBean)
        throws Exception {
        StringBuffer joinSQL = new StringBuffer();

        joinSQL.append(" LEFT JOIN BUSINESS_DOMAIN_GROUP_RELATE ON ( ");

        joinSQL.append(
            " BUSINESS_DOMAIN.BUSINESS_DOMAIN_ID = BUSINESS_DOMAIN_GROUP_RELATE.DOMAIN_ID ");

        joinSQL.append(" ) ");

        String entityName = com.ourteam.modelbase.dao.IBusinessDomainDAO.EntityName;

        businessDomain.deleteByQuery(entityName, joinSQL.toString(), aQueryBean);
    } // end deleteBusinessDomain()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcBusinessDomainGroupRelateRowMapper
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
            BusinessDomainGroupRelate object = new BusinessDomainGroupRelate();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object DomainId = resultSet.getObject(columnIndex++);

                object.setDomainIdNull(resultSet.getBoolean(columnIndex++));

                if (DomainId != null) {
                    BeanUtils.setProperty(object, DataProperty.DomainId,
                        DomainId);
                } // end if

                Object GroupId = resultSet.getObject(columnIndex++);

                object.setGroupIdNull(resultSet.getBoolean(columnIndex++));

                if (GroupId != null) {
                    BeanUtils.setProperty(object, DataProperty.GroupId, GroupId);
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

                Object DomainName = resultSet.getObject(columnIndex++);

                object.setDomainNameNull(resultSet.getBoolean(columnIndex++));

                if (DomainName != null) {
                    BeanUtils.setProperty(object, DataProperty.DomainName,
                        DomainName);
                } // end if

                Object GroupName = resultSet.getObject(columnIndex++);

                object.setGroupNameNull(resultSet.getBoolean(columnIndex++));

                if (GroupName != null) {
                    BeanUtils.setProperty(object, DataProperty.GroupName,
                        GroupName);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcBusinessDomainGroupRelateRowMapper
} // end BaseBusinessDomainGroupRelateDAOJdbcImpl
