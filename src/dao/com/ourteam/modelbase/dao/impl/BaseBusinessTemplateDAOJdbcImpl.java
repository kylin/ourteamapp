/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao.impl;

import com.ourteam.modelbase.dao.BusinessTemplate;
import com.ourteam.modelbase.dao.BusinessTemplateDAOQueryBean;
import com.ourteam.modelbase.dao.IBusinessTemplateDAO;

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
 * DAO JDBC Impl Generate Date : 2011-06-29 21:07:05
 *
 * @author Kylin
 */
abstract public class BaseBusinessTemplateDAOJdbcImpl extends AbstractJdbcDAO
    implements IBusinessTemplateDAO {
    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_FIELDS = new String[] {
            Id, BusinessObjectType, ProviderTypeId, Description, Status,
            TemplateId, TemplateName, TemplateDescription, FileName, Name,
            CanOverWrite, FileType
        };

    /**
     * DOCUMENT ME!
     */
    public static final String[] ENTITY_PROPERTIES = new String[] {
            DataProperty.Id, DataProperty.BusinessObjectType,
            DataProperty.ProviderTypeId, DataProperty.Description,
            DataProperty.Status, DataProperty.TemplateId,
            DataProperty.TemplateName, DataProperty.TemplateDescription,
            DataProperty.FileName, DataProperty.Name, DataProperty.CanOverWrite,
            DataProperty.FileType
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
     * Creates a new BaseBusinessTemplateDAOJdbcImpl object.
     */
    public BaseBusinessTemplateDAOJdbcImpl() {
        super();
    } // end BaseBusinessTemplateDAOJdbcImpl()

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
                " LEFT JOIN VELOCITY_TEMPLATE template ");

            relatedJoinSQLBuffer.append(" ON ( ");

            relatedJoinSQLBuffer.append(
                " template.ID = BUSINESS_TEMPLATE.TEMPLATE_ID ");

            relatedJoinSQLBuffer.append(" ) ");

            relatedJoinSQL = relatedJoinSQLBuffer.toString();
        } // end if

        return relatedJoinSQL;
    } // end getRelatedJoinSQL()

    /**
     * Check Unique BusinessTemplate
     *
     * @param aBusinessTemplate
     *
     * @return DOCUMENT ME!
     *
     * @throws Exception
     */
    public boolean checkIsUnique(BusinessTemplate aBusinessTemplate)
        throws Exception {
        if (aBusinessTemplate == null) {
            return true;
        } // end if

        List valueList = new ArrayList();

        List pkValueList = new ArrayList();

        pkValueList.add(PropertyUtils.getProperty(aBusinessTemplate,
                DataProperty.Id));

        return isUnique(valueList.toArray(new Object[valueList.size()]),
            pkValueList.toArray(new Object[pkValueList.size()]));
    } // end checkIsUnique()

    /**
     * Insert IBusinessTemplate
     *
     * @param aBusinessTemplate
     *
     * @throws Exception
     */
    public void insertBusinessTemplate(BusinessTemplate aBusinessTemplate)
        throws Exception {
        insert(aBusinessTemplate);
    } // end insertBusinessTemplate()

    /**
     * Batch Insert IBusinessTemplate
     *
     * @param aBusinessTemplate
     *
     * @throws Exception
     */
    public void batchInsertBusinessTemplate(
        BusinessTemplate[] aBusinessTemplate) throws Exception {
        batchInsert(aBusinessTemplate);
    } // end batchInsertBusinessTemplate()

    /**
     * Delete IBusinessTemplate
     *
     * @param aId long aId
     *
     * @throws Exception
     */
    public void deleteBusinessTemplate(final long aId)
        throws Exception {
        deleteById(new Object[] { new Long(aId) });
    } // end deleteBusinessTemplate()

    /**
     * Delete IBusinessTemplate
     *
     * @param queryBean
     *
     * @throws Exception
     */
    public void deleteBusinessTemplate(BusinessTemplateDAOQueryBean queryBean)
        throws Exception {
        deleteByQuery(queryBean);
    } // end deleteBusinessTemplate()

    /**
     * Update IBusinessTemplate Selective
     *
     * @param aBusinessTemplate
     *
     * @throws Exception
     */
    public void updateBusinessTemplate(BusinessTemplate aBusinessTemplate)
        throws Exception {
        if (aBusinessTemplate.getId() == 0) {
            throw new Exception(
                "Can not update object data whith out primary key value");
        } // end if

        update(aBusinessTemplate);

        BusinessTemplate tempObj = findBusinessTemplateById(aBusinessTemplate.getId());

        if (tempObj != null) {
            PropertyUtils.copyProperties(aBusinessTemplate, tempObj);
        } // end if
    } // end updateBusinessTemplate()

    /**
     * Batch Update IBusinessTemplate
     *
     * @param aBusinessTemplate
     *
     * @throws Exception
     */
    public void batchUpdateBusinessTemplate(
        BusinessTemplate[] aBusinessTemplate) throws Exception {
        batchUpdate(aBusinessTemplate);
    } // end batchUpdateBusinessTemplate()

    /**
     * Update IBusinessTemplate
     *
     * @param aBusinessTemplate
     * @param aQueryBean
     *
     * @throws Exception
     */
    public void updateBusinessTemplate(BusinessTemplate aBusinessTemplate,
        BusinessTemplateDAOQueryBean aQueryBean) throws Exception {
        updateByQuery(aBusinessTemplate, aQueryBean);
    } // end updateBusinessTemplate()

    /**
     * DOCUMENT ME!
     *
     * @param aBusinessTemplate DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    protected void checkNullValue(BusinessTemplate aBusinessTemplate)
        throws Exception {
    } // end checkNullValue()

    /**
     * DOCUMENT ME!
     *
     * @param aBusinessTemplates DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBusinessTemplate(
        BusinessTemplate[] aBusinessTemplates,
        BusinessTemplateDAOQueryBean aQueryBean) throws Exception {
        synchronizeBusinessTemplate(aBusinessTemplates, aQueryBean, null);
    } // end synchronizeBusinessTemplate()

    /**
     * DOCUMENT ME!
     *
     * @param aBusinessTemplates DOCUMENT ME!
     * @param aQueryBean DOCUMENT ME!
     * @param aCallBack DOCUMENT ME!
     *
     * @throws Exception DOCUMENT ME!
     */
    public void synchronizeBusinessTemplate(
        BusinessTemplate[] aBusinessTemplates,
        BusinessTemplateDAOQueryBean aQueryBean,
        BusinessTemplateSynchronizeCallback aCallBack)
        throws Exception {
        List inputList = new ArrayList();

        if (ArrayUtils.isEmpty(aBusinessTemplates) == false) {
            inputList.addAll(Arrays.asList(aBusinessTemplates));
        } // end if

        BusinessTemplate[] existentBusinessTemplates = this.queryBusinessTemplate(aQueryBean);

        List existentList = new ArrayList();

        if (ArrayUtils.isEmpty(existentBusinessTemplates) == false) {
            existentList.addAll(Arrays.asList(existentBusinessTemplates));
        } // end if

        List willAddBusinessTemplates = ListUtils.subtract(inputList,
                existentList);

        List willDeleteBusinessTemplates = ListUtils.subtract(existentList,
                inputList);

        List willUpdateBusinessTemplates = ListUtils.intersection(existentList,
                inputList);

        BusinessTemplate[] willUpdateBusinessTemplateArray = (BusinessTemplate[]) willUpdateBusinessTemplates.toArray(new BusinessTemplate[willUpdateBusinessTemplates.size()]);
        BusinessTemplate[] willAddBusinessTemplateArray = (BusinessTemplate[]) willAddBusinessTemplates.toArray(new BusinessTemplate[willAddBusinessTemplates.size()]);
        BusinessTemplate[] willDeleteBusinessTemplateArray = (BusinessTemplate[]) willDeleteBusinessTemplates.toArray(new BusinessTemplate[willDeleteBusinessTemplates.size()]);

        if (aCallBack != null) {
            aCallBack.checkSynchronizeObjects(willAddBusinessTemplateArray,
                willUpdateBusinessTemplateArray, willDeleteBusinessTemplateArray);
        } // end if

        if (willUpdateBusinessTemplates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeUpdate(willUpdateBusinessTemplateArray);
            } // end if

            this.batchUpdateBusinessTemplate(willUpdateBusinessTemplateArray);

            if (aCallBack != null) {
                aCallBack.afterUpdate(willUpdateBusinessTemplateArray);
            } // end if
        } // end if

        if (willAddBusinessTemplates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeInsert(willAddBusinessTemplateArray);
            } // end if

            this.batchInsertBusinessTemplate(willAddBusinessTemplateArray);

            if (aCallBack != null) {
                aCallBack.afterInsert(willAddBusinessTemplateArray);
            } // end if
        } // end if

        if (willDeleteBusinessTemplates.isEmpty() == false) {
            if (aCallBack != null) {
                aCallBack.beforeDelete(willDeleteBusinessTemplateArray);
            } // end if

            for (int i = 0; i < willDeleteBusinessTemplateArray.length; i++) {
                BusinessTemplate object = willDeleteBusinessTemplateArray[i];
                this.deleteBusinessTemplate(object.getId());
            } // end for

            if (aCallBack != null) {
                aCallBack.afterDelete(willDeleteBusinessTemplateArray);
            } // end if
        } // end if
    } // end synchronizeBusinessTemplate()

    /**
     * Query IBusinessTemplate
     *
     * @param aId long aId
     *
     * @return
     *
     * @throws Exception
     */
    public BusinessTemplate findBusinessTemplateById(final long aId)
        throws Exception {
        BusinessTemplateDAOQueryBean queryBean = new BusinessTemplateDAOQueryBean();

        queryBean.createCriteria().andIdEqualTo(new java.lang.Long(aId));

        queryBean.setDistinct(true);

        BusinessTemplate[] BusinessTemplates = queryBusinessTemplate(queryBean);

        if (BusinessTemplates.length == 0) {
            return null;
        } // end if
        else {
            return BusinessTemplates[0];
        } // end else
    } // end findBusinessTemplateById()

    /**
     * Query IBusinessTemplate
     *
     * @param queryBean
     *
     * @return IBusinessTemplate[]
     *
     * @throws Exception
     */
    public BusinessTemplate[] queryBusinessTemplate(
        BusinessTemplateDAOQueryBean queryBean) throws Exception {
        List result = this.query(queryBean, new JdbcBusinessTemplateRowMapper());

        return (BusinessTemplate[]) result.toArray(new BusinessTemplate[result.size()]);
    } // end queryBusinessTemplate()

    /**
     * Query BusinessTemplate Selective
     *
     * @param aQueryBean
     *
     * @return Map[]
     *
     * @throws Exception
     *
     * @model
     */
    public Map[] queryBusinessTemplateSelective(
        BusinessTemplateDAOQueryBean aQueryBean) throws Exception {
        if (aQueryBean.getSelectProperties().isEmpty()) {
            aQueryBean.addAllSelectProperties();
        } // end if

        return querySelective(aQueryBean);
    } // end queryBusinessTemplateSelective()

    /**
     * Query IBusinessTemplate Count
     *
     * @param queryBean
     *
     * @return int
     *
     * @throws Exception
     */
    public int queryBusinessTemplateCount(
        BusinessTemplateDAOQueryBean queryBean) throws Exception {
        return queryCount(queryBean);
    } // end queryBusinessTemplateCount()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class JdbcBusinessTemplateRowMapper
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
            BusinessTemplate object = new BusinessTemplate();

            int columnIndex = 1;

            try {
                Object Id = resultSet.getObject(columnIndex++);

                object.setIdNull(resultSet.getBoolean(columnIndex++));

                if (Id != null) {
                    BeanUtils.setProperty(object, DataProperty.Id, Id);
                } // end if

                Object BusinessObjectType = resultSet.getObject(columnIndex++);

                object.setBusinessObjectTypeNull(resultSet.getBoolean(
                        columnIndex++));

                if (BusinessObjectType != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.BusinessObjectType, BusinessObjectType);
                } // end if

                Object ProviderTypeId = resultSet.getObject(columnIndex++);

                object.setProviderTypeIdNull(resultSet.getBoolean(columnIndex++));

                if (ProviderTypeId != null) {
                    BeanUtils.setProperty(object, DataProperty.ProviderTypeId,
                        ProviderTypeId);
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

                Object TemplateId = resultSet.getObject(columnIndex++);

                object.setTemplateIdNull(resultSet.getBoolean(columnIndex++));

                if (TemplateId != null) {
                    BeanUtils.setProperty(object, DataProperty.TemplateId,
                        TemplateId);
                } // end if

                Object TemplateName = resultSet.getObject(columnIndex++);

                object.setTemplateNameNull(resultSet.getBoolean(columnIndex++));

                if (TemplateName != null) {
                    BeanUtils.setProperty(object, DataProperty.TemplateName,
                        TemplateName);
                } // end if

                Object TemplateDescription = resultSet.getObject(columnIndex++);

                object.setTemplateDescriptionNull(resultSet.getBoolean(
                        columnIndex++));

                if (TemplateDescription != null) {
                    BeanUtils.setProperty(object,
                        DataProperty.TemplateDescription, TemplateDescription);
                } // end if

                Object FileName = resultSet.getObject(columnIndex++);

                object.setFileNameNull(resultSet.getBoolean(columnIndex++));

                if (FileName != null) {
                    BeanUtils.setProperty(object, DataProperty.FileName,
                        FileName);
                } // end if

                Object Name = resultSet.getObject(columnIndex++);

                object.setNameNull(resultSet.getBoolean(columnIndex++));

                if (Name != null) {
                    BeanUtils.setProperty(object, DataProperty.Name, Name);
                } // end if

                Object CanOverWrite = resultSet.getObject(columnIndex++);

                object.setCanOverWriteNull(resultSet.getBoolean(columnIndex++));

                if (CanOverWrite != null) {
                    BeanUtils.setProperty(object, DataProperty.CanOverWrite,
                        CanOverWrite);
                } // end if

                Object FileType = resultSet.getObject(columnIndex++);

                object.setFileTypeNull(resultSet.getBoolean(columnIndex++));

                if (FileType != null) {
                    BeanUtils.setProperty(object, DataProperty.FileType,
                        FileType);
                } // end if

                return object;
            } // end try
            catch (Exception e) {
                throw new SQLException(e.getMessage());
            } // end catch
        } // end mapRow()
    } // end JdbcBusinessTemplateRowMapper
} // end BaseBusinessTemplateDAOJdbcImpl
