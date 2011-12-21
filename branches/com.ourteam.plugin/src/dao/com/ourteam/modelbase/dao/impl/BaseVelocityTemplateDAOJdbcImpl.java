/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao.impl;

import com.ourteam.modelbase.dao.IVelocityTemplateDAO;
import com.ourteam.modelbase.dao.VelocityTemplate;
import com.ourteam.modelbase.dao.VelocityTemplateDAOQueryBean;

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
 * DAO JDBC Impl Generate Date : 2011-06-29 21:07:06
 *
 * @author Kylin
 */
abstract public class BaseVelocityTemplateDAOJdbcImpl extends AbstractJdbcDAO
    implements IVelocityTemplateDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, Description, TemplateContent, TemplateName, TemplateTimestamp
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.Description,
            DataProperty.TemplateContent, DataProperty.TemplateName,
            DataProperty.TemplateTimestamp
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
     * Creates a new BaseVelocityTemplateDAOJdbcImpl object.
     */
    public BaseVelocityTemplateDAOJdbcImpl() {
        super();
    } // end BaseVelocityTemplateDAOJdbcImpl()

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
     * Check Unique VelocityTemplate
     *
     * @param aVelocityTemplate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(VelocityTemplate aVelocityTemplate)
        throws Exception {
        if (aVelocityTemplate == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aVelocityTemplate,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IVelocityTemplate
     *
     * @param aVelocityTemplate
     *
     * @throws Exception
     */
    public void insertVelocityTemplate(VelocityTemplate aVelocityTemplate)
        throws Exception {
        org.apache.commons.beanutils.PropertyUtils.setProperty(aVelocityTemplate,
            "templateTimestamp",
            new java.sql.Timestamp(System.currentTimeMillis()));

        insert(aVelocityTemplate);
    } // end insertVelocityTemplate()

    /**
     * Batch Insert IVelocityTemplate
     *
     * @param aVelocityTemplate
     *
     * @throws Exception
     */
    public void batchInsertVelocityTemplate(
        VelocityTemplate[] aVelocityTemplate) throws Exception {
        batchInsert(aVelocityTemplate);
    } // end batchInsertVelocityTemplate()

    /**
     * Delete IVelocityTemplate
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteVelocityTemplate(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteVelocityTemplate()

    /**
     * Delete IVelocityTemplate
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteVelocityTemplate(VelocityTemplateDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteVelocityTemplate()

    /**
     * Update IVelocityTemplate Selective
     *
     * @param aVelocityTemplate
     *
     * @throws Exception
     */
    public void updateVelocityTemplate(VelocityTemplate aVelocityTemplate)
        throws Exception {
        org.apache.commons.beanutils.PropertyUtils.setProperty(aVelocityTemplate,
            "templateTimestamp",
            new java.sql.Timestamp(System.currentTimeMillis()));

        if (aVelocityTemplate.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aVelocityTemplate);

        VelocityTemplate tempObj = findVelocityTemplateById(aVelocityTemplate.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aVelocityTemplate, tempObj);
        } // end if
    } // end updateVelocityTemplate()

    /**
     * Batch Update IVelocityTemplate
     *
     * @param aVelocityTemplate
     *
     * @throws Exception
     */
    public void batchUpdateVelocityTemplate(
        VelocityTemplate[] aVelocityTemplate) throws Exception {
        batchUpdate(aVelocityTemplate);
    } // end batchUpdateVelocityTemplate()

    /**
     * Update IVelocityTemplate
     *
     * @param aVelocityTemplate
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateVelocityTemplate(VelocityTemplate aVelocityTemplate,
        VelocityTemplateDAOQueryBean aQueryBean) throws Exception {
        org.apache.commons.beanutils.PropertyUtils.setProperty(aVelocityTemplate,
            "templateTimestamp",
            new java.sql.Timestamp(System.currentTimeMillis()));

        updateByQuery(aVelocityTemplate, aQueryBean);
    } // end updateVelocityTemplate()

    /**
     * DOCUMENT ME!
     *
     * @param aVelocityTemplate DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(VelocityTemplate aVelocityTemplate)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aVelocityTemplates DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeVelocityTemplate(
        VelocityTemplate[] aVelocityTemplates,
        VelocityTemplateDAOQueryBean aQueryBean) throws Exception {
        synchronizeVelocityTemplate(aVelocityTemplates, aQueryBean, null);
    } // end synchronizeVelocityTemplate()

    /**
     * DOCUMENT ME!
     *
     * @param aVelocityTemplates DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeVelocityTemplate(
        VelocityTemplate[] aVelocityTemplates,
        VelocityTemplateDAOQueryBean aQueryBean,
        VelocityTemplateSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aVelocityTemplates) == false) {
            inputList.addAll(Arrays.asList(aVelocityTemplates));
        } // end if

        VelocityTemplate[] existentVelocityTemplates = this.queryVelocityTemplate(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentVelocityTemplates) == false) {
            existentList.addAll(Arrays.asList(existentVelocityTemplates));
        } // end if

        List willAddVelocityTemplates = ListUtils.subtract(inputList,
                existentList);

        List willDeleteVelocityTemplates = ListUtils.subtract(existentList,
                inputList);

        List willUpdateVelocityTemplates = ListUtils.intersection(existentList,
                inputList);

        VelocityTemplate[] willUpdateVelocityTemplateArray = (VelocityTemplate[]) willUpdateVelocityTemplates.toArray(new VelocityTemplate[willUpdateVelocityTemplates.size()]);
        VelocityTemplate[] willAddVelocityTemplateArray = (VelocityTemplate[]) willAddVelocityTemplates.toArray(new VelocityTemplate[willAddVelocityTemplates.size()]);
        VelocityTemplate[] willDeleteVelocityTemplateArray = (VelocityTemplate[]) willDeleteVelocityTemplates.toArray(new VelocityTemplate[willDeleteVelocityTemplates.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddVelocityTemplateArray,
                willUpdateVelocityTemplateArray, willDeleteVelocityTemplateArray);
        } // end if

        if (willUpdateVelocityTemplates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateVelocityTemplateArray);
            } // end if

            this.batchUpdateVelocityTemplate(willUpdateVelocityTemplateArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateVelocityTemplateArray);
            } // end if
        } // end if

        if (willAddVelocityTemplates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddVelocityTemplateArray);
            } // end if

            this.batchInsertVelocityTemplate(willAddVelocityTemplateArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddVelocityTemplateArray);
            } // end if
        } // end if

        if (willDeleteVelocityTemplates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteVelocityTemplateArray);
            } // end if

            for (int i = 0; i < willDeleteVelocityTemplateArray.length; i++) {
                VelocityTemplate object = willDeleteVelocityTemplateArray[i];
                this.deleteVelocityTemplate(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteVelocityTemplateArray);
            } // end if
        } // end if
    } // end synchronizeVelocityTemplate()

    /**
     * Query IVelocityTemplate
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public VelocityTemplate findVelocityTemplateById(final long aId)
        throws Exception {
        VelocityTemplateDAOQueryBean queryBean = new VelocityTemplateDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        VelocityTemplate[] VelocityTemplates = queryVelocityTemplate(queryBean);

        if (VelocityTemplates.length == 0) {
            return null;
        } // end if
        else {
            return VelocityTemplates[0];
        } // end else
    } // end findVelocityTemplateById()

    /**
     * Query IVelocityTemplate
     *
     * @param queryBean
     *
     * @return IVelocityTemplate[]
     *
     * @throws Exception
     */
    public VelocityTemplate[] queryVelocityTemplate(
        VelocityTemplateDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcVelocityTemplateRowMapper());

        return (VelocityTemplate[]) result.toArray(new VelocityTemplate[result.size()]);
    } // end queryVelocityTemplate()

    /**
     * Query VelocityTemplate Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryVelocityTemplateSelective(
        VelocityTemplateDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryVelocityTemplateSelective()

    /**
     * Query IVelocityTemplate Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryVelocityTemplateCount(
        VelocityTemplateDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end queryVelocityTemplateCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcVelocityTemplateRowMapper
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
            VelocityTemplate object = new VelocityTemplate();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object Description = resultSet.getObject(columnIndex++);

                object.setDescriptionNull(resultSet.getBoolean(columnIndex++));

                if (Description != null) {
                    BeanUtils.setProperty(object, DataProperty.Description,
                        Description);
                } // end if

                Object TemplateContent = resultSet.getObject(columnIndex++);

                object.setTemplateContentNull(resultSet.getBoolean(
                        columnIndex++));

                if (TemplateContent != null) {
                    BeanUtils.setProperty(object, DataProperty.TemplateContent,
                        TemplateContent);
                } // end if

                Object TemplateName = resultSet.getObject(columnIndex++);

                object.setTemplateNameNull(resultSet.getBoolean(columnIndex++));

                if (TemplateName != null) {
                    BeanUtils.setProperty(object, DataProperty.TemplateName,
                        TemplateName);
                } // end if

                Object TemplateTimestamp = resultSet.getObject(columnIndex++);

                object.setTemplateTimestampNull(resultSet.getBoolean(
                        columnIndex++));

                if (TemplateTimestamp != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.TemplateTimestamp, TemplateTimestamp);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcVelocityTemplateRowMapper
} // end BaseVelocityTemplateDAOJdbcImpl
