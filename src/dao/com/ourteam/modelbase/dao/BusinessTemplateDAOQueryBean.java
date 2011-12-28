/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import net.dao.BaseQueryBean;
import net.dao.BaseWhereCriterion;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * BusinessTemplate query bean 2011-12-28 11:21:29
 *
 * @author Auto Gen
 */
public class BusinessTemplateDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new BusinessTemplateDAOQueryBean object.
     */
    public BusinessTemplateDAOQueryBean() {
        super();
    } // end BusinessTemplateDAOQueryBean()

    /**
     * Creates a new BusinessTemplateDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public BusinessTemplateDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end BusinessTemplateDAOQueryBean()

    /**
     * Creates a new BusinessTemplateDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public BusinessTemplateDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end BusinessTemplateDAOQueryBean()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();

        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        } // end if

        return criteria;
    } // end createCriteria()

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    protected Criteria createCriteriaInternal() {
        return new Criteria(this);
    } // end createCriteriaInternal()

    /**
     * DOCUMENT ME!
     */
    public void addIdSelectProperty() {
        addIdSelectProperty("id");
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessTemplateDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessTemplateDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addBusinessObjectTypeSelectProperty() {
        addBusinessObjectTypeSelectProperty("businessObjectType");
    } // end addBusinessObjectTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addBusinessObjectTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessTemplateDAO.BusinessObjectType, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessTemplateDAO.BusinessObjectType,
                "businessObjectType");
        } // end else
    } // end addBusinessObjectTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addProviderTypeIdSelectProperty() {
        addProviderTypeIdSelectProperty("providerTypeId");
    } // end addProviderTypeIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addProviderTypeIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessTemplateDAO.ProviderTypeId, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessTemplateDAO.ProviderTypeId,
                "providerTypeId");
        } // end else
    } // end addProviderTypeIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addDescriptionSelectProperty() {
        addDescriptionSelectProperty("description");
    } // end addDescriptionSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addDescriptionSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessTemplateDAO.Description, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessTemplateDAO.Description, "description");
        } // end else
    } // end addDescriptionSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addStatusSelectProperty() {
        addStatusSelectProperty("status");
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addStatusSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessTemplateDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessTemplateDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addTemplateIdSelectProperty() {
        addTemplateIdSelectProperty("templateId");
    } // end addTemplateIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addTemplateIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessTemplateDAO.TemplateId, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessTemplateDAO.TemplateId, "templateId");
        } // end else
    } // end addTemplateIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addTemplateNameSelectProperty() {
        addTemplateNameSelectProperty("templateName");
    } // end addTemplateNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addTemplateNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessTemplateDAO.TemplateName, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessTemplateDAO.TemplateName, "templateName");
        } // end else
    } // end addTemplateNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addTemplateDescriptionSelectProperty() {
        addTemplateDescriptionSelectProperty("templateDescription");
    } // end addTemplateDescriptionSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addTemplateDescriptionSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessTemplateDAO.TemplateDescription, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessTemplateDAO.TemplateDescription,
                "templateDescription");
        } // end else
    } // end addTemplateDescriptionSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addFileNameSelectProperty() {
        addFileNameSelectProperty("fileName");
    } // end addFileNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addFileNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessTemplateDAO.FileName, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessTemplateDAO.FileName, "fileName");
        } // end else
    } // end addFileNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addNameSelectProperty() {
        addNameSelectProperty("name");
    } // end addNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessTemplateDAO.Name, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessTemplateDAO.Name, "name");
        } // end else
    } // end addNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addCanOverWriteSelectProperty() {
        addCanOverWriteSelectProperty("canOverWrite");
    } // end addCanOverWriteSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addCanOverWriteSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessTemplateDAO.CanOverWrite, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessTemplateDAO.CanOverWrite, "canOverWrite");
        } // end else
    } // end addCanOverWriteSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addFileTypeSelectProperty() {
        addFileTypeSelectProperty("fileType");
    } // end addFileTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addFileTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessTemplateDAO.FileType, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessTemplateDAO.FileType, "fileType");
        } // end else
    } // end addFileTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addFileNamePrefixSelectProperty() {
        addFileNamePrefixSelectProperty("fileNamePrefix");
    } // end addFileNamePrefixSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addFileNamePrefixSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessTemplateDAO.FileNamePrefix, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessTemplateDAO.FileNamePrefix,
                "fileNamePrefix");
        } // end else
    } // end addFileNamePrefixSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addFileNamePostfixSelectProperty() {
        addFileNamePostfixSelectProperty("fileNamePostfix");
    } // end addFileNamePostfixSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addFileNamePostfixSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessTemplateDAO.FileNamePostfix, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessTemplateDAO.FileNamePostfix,
                "fileNamePostfix");
        } // end else
    } // end addFileNamePostfixSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addBusinessObjectTypeSelectProperty();

        addProviderTypeIdSelectProperty();

        addDescriptionSelectProperty();

        addStatusSelectProperty();

        addTemplateIdSelectProperty();

        addTemplateNameSelectProperty();

        addTemplateDescriptionSelectProperty();

        addFileNameSelectProperty();

        addNameSelectProperty();

        addCanOverWriteSelectProperty();

        addFileTypeSelectProperty();

        addFileNamePrefixSelectProperty();

        addFileNamePostfixSelectProperty();
    } // end addAllSelectProperties()

    /**
     * DOCUMENT ME!
     *
     * @author $author$
     * @version $Revision$
      */
    public static class Criteria extends BaseWhereCriterion {
        /**
         * Creates a new Criteria object.
         *
         * @param aParentObject DOCUMENT ME!
         */
        protected Criteria(Object aParentObject) {
            super(aParentObject);
        } // end Criteria()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNull() {
            addCriterion("BUSINESS_TEMPLATE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("BUSINESS_TEMPLATE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "BUSINESS_TEMPLATE.ID is not null AND BUSINESS_TEMPLATE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(BUSINESS_TEMPLATE.ID is null OR BUSINESS_TEMPLATE.ID = '')");

            return this;
        } // end andIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdEqualTo(long value) {
            return andIdEqualTo(Long.valueOf(value));
        } // end andIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdEqualTo(java.lang.Long value) {
            addCriterion("BUSINESS_TEMPLATE.ID =", value, "id");

            return this;
        } // end andIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdNotEqualTo(long value) {
            return andIdNotEqualTo(Long.valueOf(value));
        } // end andIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdNotEqualTo(java.lang.Long value) {
            addCriterion("BUSINESS_TEMPLATE.ID <>", value, "id");

            return this;
        } // end andIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdNotEqualToOrIsNull(long value) {
            return andIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("BUSINESS_TEMPLATE.ID is null OR BUSINESS_TEMPLATE.ID <>",
                value, "id");

            return this;
        } // end andIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdGreaterThan(long value) {
            return andIdGreaterThan(Long.valueOf(value));
        } // end andIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdGreaterThan(java.lang.Long value) {
            addCriterion("BUSINESS_TEMPLATE.ID >", value, "id");

            return this;
        } // end andIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdGreaterThanOrEqualTo(long value) {
            return andIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("BUSINESS_TEMPLATE.ID >=", value, "id");

            return this;
        } // end andIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdLessThan(long value) {
            return andIdLessThan(Long.valueOf(value));
        } // end andIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdLessThan(java.lang.Long value) {
            addCriterion("BUSINESS_TEMPLATE.ID <", value, "id");

            return this;
        } // end andIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdLessThanOrEqualTo(long value) {
            return andIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("BUSINESS_TEMPLATE.ID <=", value, "id");

            return this;
        } // end andIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdLessThanOrEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIn(long[] values) {
            if (values.length == 1) {
                return andIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.ID in", values, "id");

                return this;
            } // end else
        } // end andIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdNotIn(long[] values) {
            if (values.length == 1) {
                return andIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.ID not in", values, "id");

                return this;
            } // end else
        } // end andIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIn(List values) {
            if (values.size() == 1) {
                return andIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.ID in", values, "id");

                return this;
            } // end else
        } // end andIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdNotIn(List values) {
            if (values.size() == 1) {
                return andIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.ID not in", values, "id");

                return this;
            } // end else
        } // end andIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIn(Object[] values) {
            if (values.length == 1) {
                return andIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.ID in", Arrays.asList(values),
                    "id");

                return this;
            } // end else
        } // end andIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.ID not in",
                    Arrays.asList(values), "id");

                return this;
            } // end else
        } // end andIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdBetween(long value1, long value2) {
            addCriterion("BUSINESS_TEMPLATE.ID between", value1, value2, "id");

            return this;
        } // end andIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BUSINESS_TEMPLATE.ID between", value1, value2, "id");

            return this;
        } // end andIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdNotBetween(long value1, long value2) {
            addCriterion("BUSINESS_TEMPLATE.ID not between", value1, value2,
                "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BUSINESS_TEMPLATE.ID not between", value1, value2,
                "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectTypeIsNull() {
            addCriterion("BUSINESS_TEMPLATE.BUSINESS_OBJECT_TYPE is null");

            return this;
        } // end andBusinessObjectTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectTypeIsNotNull() {
            addCriterion("BUSINESS_TEMPLATE.BUSINESS_OBJECT_TYPE is not null");

            return this;
        } // end andBusinessObjectTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectTypeIsNotEmpty() {
            addCriterion(
                "BUSINESS_TEMPLATE.BUSINESS_OBJECT_TYPE is not null AND BUSINESS_TEMPLATE.BUSINESS_OBJECT_TYPE <> ''");

            return this;
        } // end andBusinessObjectTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectTypeIsEmpty() {
            addCriterion(
                "(BUSINESS_TEMPLATE.BUSINESS_OBJECT_TYPE is null OR BUSINESS_TEMPLATE.BUSINESS_OBJECT_TYPE = '')");

            return this;
        } // end andBusinessObjectTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectTypeEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE.BUSINESS_OBJECT_TYPE =", value,
                "businessObjectType");

            return this;
        } // end andBusinessObjectTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectTypeEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE.BUSINESS_OBJECT_TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessObjectTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectTypeNotEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE.BUSINESS_OBJECT_TYPE <>", value,
                "businessObjectType");

            return this;
        } // end andBusinessObjectTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectTypeNotEqualToOrIsNull(String value) {
            addCriterion("BUSINESS_TEMPLATE.BUSINESS_OBJECT_TYPE is null OR BUSINESS_TEMPLATE.BUSINESS_OBJECT_TYPE <>",
                value, "businessObjectType");

            return this;
        } // end andBusinessObjectTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectTypeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE.BUSINESS_OBJECT_TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessObjectTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectTypeGreaterThan(String value) {
            addCriterion("BUSINESS_TEMPLATE.BUSINESS_OBJECT_TYPE >", value,
                "businessObjectType");

            return this;
        } // end andBusinessObjectTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectTypeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE.BUSINESS_OBJECT_TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessObjectTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE.BUSINESS_OBJECT_TYPE >=", value,
                "businessObjectType");

            return this;
        } // end andBusinessObjectTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE.BUSINESS_OBJECT_TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessObjectTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectTypeLessThan(String value) {
            addCriterion("BUSINESS_TEMPLATE.BUSINESS_OBJECT_TYPE <", value,
                "businessObjectType");

            return this;
        } // end andBusinessObjectTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectTypeLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE.BUSINESS_OBJECT_TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessObjectTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectTypeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE.BUSINESS_OBJECT_TYPE <=", value,
                "businessObjectType");

            return this;
        } // end andBusinessObjectTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE.BUSINESS_OBJECT_TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessObjectTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BUSINESS_TEMPLATE.BUSINESS_OBJECT_TYPE like",
                buffer.toString(), "businessObjectType");

            return this;
        } // end andBusinessObjectTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BUSINESS_TEMPLATE.BUSINESS_OBJECT_TYPE not like",
                buffer.toString(), "businessObjectType");

            return this;
        } // end andBusinessObjectTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectTypeIn(List values) {
            if (values.size() == 1) {
                return andBusinessObjectTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.BUSINESS_OBJECT_TYPE in",
                    values, "businessObjectType");

                return this;
            } // end else
        } // end andBusinessObjectTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectTypeNotIn(List values) {
            if (values.size() == 1) {
                return andBusinessObjectTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.BUSINESS_OBJECT_TYPE not in",
                    values, "businessObjectType");

                return this;
            } // end else
        } // end andBusinessObjectTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectTypeIn(Object[] values) {
            if (values.length == 1) {
                return andBusinessObjectTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.BUSINESS_OBJECT_TYPE in",
                    Arrays.asList(values), "businessObjectType");

                return this;
            } // end else
        } // end andBusinessObjectTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andBusinessObjectTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.BUSINESS_OBJECT_TYPE not in",
                    Arrays.asList(values), "businessObjectType");

                return this;
            } // end else
        } // end andBusinessObjectTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectTypeBetween(String value1,
            String value2) {
            addCriterion("BUSINESS_TEMPLATE.BUSINESS_OBJECT_TYPE between",
                value1, value2, "businessObjectType");

            return this;
        } // end andBusinessObjectTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectTypeNotBetween(String value1,
            String value2) {
            addCriterion("BUSINESS_TEMPLATE.BUSINESS_OBJECT_TYPE not between",
                value1, value2, "businessObjectType");

            return this;
        } // end andBusinessObjectTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIdIsNull() {
            addCriterion("BUSINESS_TEMPLATE.PROVIDER_TYPE_ID is null");

            return this;
        } // end andProviderTypeIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIdIsNotNull() {
            addCriterion("BUSINESS_TEMPLATE.PROVIDER_TYPE_ID is not null");

            return this;
        } // end andProviderTypeIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIdIsNotEmpty() {
            addCriterion(
                "BUSINESS_TEMPLATE.PROVIDER_TYPE_ID is not null AND BUSINESS_TEMPLATE.PROVIDER_TYPE_ID <> ''");

            return this;
        } // end andProviderTypeIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIdIsEmpty() {
            addCriterion(
                "(BUSINESS_TEMPLATE.PROVIDER_TYPE_ID is null OR BUSINESS_TEMPLATE.PROVIDER_TYPE_ID = '')");

            return this;
        } // end andProviderTypeIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIdEqualTo(long value) {
            return andProviderTypeIdEqualTo(Long.valueOf(value));
        } // end andProviderTypeIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIdEqualTo(java.lang.Long value) {
            addCriterion("BUSINESS_TEMPLATE.PROVIDER_TYPE_ID =", value,
                "providerTypeId");

            return this;
        } // end andProviderTypeIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE.PROVIDER_TYPE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderTypeIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIdNotEqualTo(long value) {
            return andProviderTypeIdNotEqualTo(Long.valueOf(value));
        } // end andProviderTypeIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIdNotEqualTo(java.lang.Long value) {
            addCriterion("BUSINESS_TEMPLATE.PROVIDER_TYPE_ID <>", value,
                "providerTypeId");

            return this;
        } // end andProviderTypeIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIdNotEqualToOrIsNull(long value) {
            return andProviderTypeIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andProviderTypeIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("BUSINESS_TEMPLATE.PROVIDER_TYPE_ID is null OR BUSINESS_TEMPLATE.PROVIDER_TYPE_ID <>",
                value, "providerTypeId");

            return this;
        } // end andProviderTypeIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE.PROVIDER_TYPE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderTypeIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIdGreaterThan(long value) {
            return andProviderTypeIdGreaterThan(Long.valueOf(value));
        } // end andProviderTypeIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIdGreaterThan(java.lang.Long value) {
            addCriterion("BUSINESS_TEMPLATE.PROVIDER_TYPE_ID >", value,
                "providerTypeId");

            return this;
        } // end andProviderTypeIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE.PROVIDER_TYPE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderTypeIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIdGreaterThanOrEqualTo(long value) {
            return andProviderTypeIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andProviderTypeIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("BUSINESS_TEMPLATE.PROVIDER_TYPE_ID >=", value,
                "providerTypeId");

            return this;
        } // end andProviderTypeIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE.PROVIDER_TYPE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderTypeIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIdLessThan(long value) {
            return andProviderTypeIdLessThan(Long.valueOf(value));
        } // end andProviderTypeIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIdLessThan(java.lang.Long value) {
            addCriterion("BUSINESS_TEMPLATE.PROVIDER_TYPE_ID <", value,
                "providerTypeId");

            return this;
        } // end andProviderTypeIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE.PROVIDER_TYPE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderTypeIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIdLessThanOrEqualTo(long value) {
            return andProviderTypeIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andProviderTypeIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("BUSINESS_TEMPLATE.PROVIDER_TYPE_ID <=", value,
                "providerTypeId");

            return this;
        } // end andProviderTypeIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE.PROVIDER_TYPE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderTypeIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIdIn(long[] values) {
            if (values.length == 1) {
                return andProviderTypeIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.PROVIDER_TYPE_ID in", values,
                    "providerTypeId");

                return this;
            } // end else
        } // end andProviderTypeIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIdNotIn(long[] values) {
            if (values.length == 1) {
                return andProviderTypeIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.PROVIDER_TYPE_ID not in",
                    values, "providerTypeId");

                return this;
            } // end else
        } // end andProviderTypeIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIdIn(List values) {
            if (values.size() == 1) {
                return andProviderTypeIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.PROVIDER_TYPE_ID in", values,
                    "providerTypeId");

                return this;
            } // end else
        } // end andProviderTypeIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIdNotIn(List values) {
            if (values.size() == 1) {
                return andProviderTypeIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.PROVIDER_TYPE_ID not in",
                    values, "providerTypeId");

                return this;
            } // end else
        } // end andProviderTypeIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIdIn(Object[] values) {
            if (values.length == 1) {
                return andProviderTypeIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.PROVIDER_TYPE_ID in",
                    Arrays.asList(values), "providerTypeId");

                return this;
            } // end else
        } // end andProviderTypeIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andProviderTypeIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.PROVIDER_TYPE_ID not in",
                    Arrays.asList(values), "providerTypeId");

                return this;
            } // end else
        } // end andProviderTypeIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIdBetween(long value1, long value2) {
            addCriterion("BUSINESS_TEMPLATE.PROVIDER_TYPE_ID between", value1,
                value2, "providerTypeId");

            return this;
        } // end andProviderTypeIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BUSINESS_TEMPLATE.PROVIDER_TYPE_ID between", value1,
                value2, "providerTypeId");

            return this;
        } // end andProviderTypeIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIdNotBetween(long value1, long value2) {
            addCriterion("BUSINESS_TEMPLATE.PROVIDER_TYPE_ID not between",
                value1, value2, "providerTypeId");

            return this;
        } // end andProviderTypeIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BUSINESS_TEMPLATE.PROVIDER_TYPE_ID not between",
                value1, value2, "providerTypeId");

            return this;
        } // end andProviderTypeIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNull() {
            addCriterion("BUSINESS_TEMPLATE.DESCRIPTION is null");

            return this;
        } // end andDescriptionIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNotNull() {
            addCriterion("BUSINESS_TEMPLATE.DESCRIPTION is not null");

            return this;
        } // end andDescriptionIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNotEmpty() {
            addCriterion(
                "BUSINESS_TEMPLATE.DESCRIPTION is not null AND BUSINESS_TEMPLATE.DESCRIPTION <> ''");

            return this;
        } // end andDescriptionIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsEmpty() {
            addCriterion(
                "(BUSINESS_TEMPLATE.DESCRIPTION is null OR BUSINESS_TEMPLATE.DESCRIPTION = '')");

            return this;
        } // end andDescriptionIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE.DESCRIPTION =", value, "description");

            return this;
        } // end andDescriptionEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.DESCRIPTION");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDescriptionEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE.DESCRIPTION <>", value,
                "description");

            return this;
        } // end andDescriptionNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionNotEqualToOrIsNull(String value) {
            addCriterion("BUSINESS_TEMPLATE.DESCRIPTION is null OR BUSINESS_TEMPLATE.DESCRIPTION <>",
                value, "description");

            return this;
        } // end andDescriptionNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.DESCRIPTION");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDescriptionNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("BUSINESS_TEMPLATE.DESCRIPTION >", value, "description");

            return this;
        } // end andDescriptionGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.DESCRIPTION");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDescriptionGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE.DESCRIPTION >=", value,
                "description");

            return this;
        } // end andDescriptionGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.DESCRIPTION");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDescriptionGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionLessThan(String value) {
            addCriterion("BUSINESS_TEMPLATE.DESCRIPTION <", value, "description");

            return this;
        } // end andDescriptionLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.DESCRIPTION");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDescriptionLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE.DESCRIPTION <=", value,
                "description");

            return this;
        } // end andDescriptionLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.DESCRIPTION");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDescriptionLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BUSINESS_TEMPLATE.DESCRIPTION like",
                buffer.toString(), "description");

            return this;
        } // end andDescriptionLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BUSINESS_TEMPLATE.DESCRIPTION not like",
                buffer.toString(), "description");

            return this;
        } // end andDescriptionNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIn(List values) {
            if (values.size() == 1) {
                return andDescriptionEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.DESCRIPTION in", values,
                    "description");

                return this;
            } // end else
        } // end andDescriptionIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionNotIn(List values) {
            if (values.size() == 1) {
                return andDescriptionNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.DESCRIPTION not in", values,
                    "description");

                return this;
            } // end else
        } // end andDescriptionNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIn(Object[] values) {
            if (values.length == 1) {
                return andDescriptionEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.DESCRIPTION in",
                    Arrays.asList(values), "description");

                return this;
            } // end else
        } // end andDescriptionIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionNotIn(Object[] values) {
            if (values.length == 1) {
                return andDescriptionNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.DESCRIPTION not in",
                    Arrays.asList(values), "description");

                return this;
            } // end else
        } // end andDescriptionNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("BUSINESS_TEMPLATE.DESCRIPTION between", value1,
                value2, "description");

            return this;
        } // end andDescriptionBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_TEMPLATE.DESCRIPTION not between", value1,
                value2, "description");

            return this;
        } // end andDescriptionNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("BUSINESS_TEMPLATE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("BUSINESS_TEMPLATE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "BUSINESS_TEMPLATE.STATUS is not null AND BUSINESS_TEMPLATE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(BUSINESS_TEMPLATE.STATUS is null OR BUSINESS_TEMPLATE.STATUS = '')");

            return this;
        } // end andStatusIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE.STATUS =", value, "status");

            return this;
        } // end andStatusEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.STATUS");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStatusEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE.STATUS <>", value, "status");

            return this;
        } // end andStatusNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusNotEqualToOrIsNull(String value) {
            addCriterion("BUSINESS_TEMPLATE.STATUS is null OR BUSINESS_TEMPLATE.STATUS <>",
                value, "status");

            return this;
        } // end andStatusNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.STATUS");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStatusNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusGreaterThan(String value) {
            addCriterion("BUSINESS_TEMPLATE.STATUS >", value, "status");

            return this;
        } // end andStatusGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.STATUS");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStatusGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE.STATUS >=", value, "status");

            return this;
        } // end andStatusGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.STATUS");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStatusGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusLessThan(String value) {
            addCriterion("BUSINESS_TEMPLATE.STATUS <", value, "status");

            return this;
        } // end andStatusLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.STATUS");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStatusLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE.STATUS <=", value, "status");

            return this;
        } // end andStatusLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.STATUS");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStatusLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BUSINESS_TEMPLATE.STATUS like", buffer.toString(),
                "status");

            return this;
        } // end andStatusLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BUSINESS_TEMPLATE.STATUS not like",
                buffer.toString(), "status");

            return this;
        } // end andStatusNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIn(List values) {
            if (values.size() == 1) {
                return andStatusEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.STATUS in", values, "status");

                return this;
            } // end else
        } // end andStatusIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusNotIn(List values) {
            if (values.size() == 1) {
                return andStatusNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.STATUS not in", values, "status");

                return this;
            } // end else
        } // end andStatusNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIn(Object[] values) {
            if (values.length == 1) {
                return andStatusEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.STATUS in",
                    Arrays.asList(values), "status");

                return this;
            } // end else
        } // end andStatusIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusNotIn(Object[] values) {
            if (values.length == 1) {
                return andStatusNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.STATUS not in",
                    Arrays.asList(values), "status");

                return this;
            } // end else
        } // end andStatusNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("BUSINESS_TEMPLATE.STATUS between", value1, value2,
                "status");

            return this;
        } // end andStatusBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_TEMPLATE.STATUS not between", value1,
                value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateIdIsNull() {
            addCriterion("BUSINESS_TEMPLATE.TEMPLATE_ID is null");

            return this;
        } // end andTemplateIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateIdIsNotNull() {
            addCriterion("BUSINESS_TEMPLATE.TEMPLATE_ID is not null");

            return this;
        } // end andTemplateIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateIdIsNotEmpty() {
            addCriterion(
                "BUSINESS_TEMPLATE.TEMPLATE_ID is not null AND BUSINESS_TEMPLATE.TEMPLATE_ID <> ''");

            return this;
        } // end andTemplateIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateIdIsEmpty() {
            addCriterion(
                "(BUSINESS_TEMPLATE.TEMPLATE_ID is null OR BUSINESS_TEMPLATE.TEMPLATE_ID = '')");

            return this;
        } // end andTemplateIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateIdEqualTo(long value) {
            return andTemplateIdEqualTo(Long.valueOf(value));
        } // end andTemplateIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateIdEqualTo(java.lang.Long value) {
            addCriterion("BUSINESS_TEMPLATE.TEMPLATE_ID =", value, "templateId");

            return this;
        } // end andTemplateIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.TEMPLATE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTemplateIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateIdNotEqualTo(long value) {
            return andTemplateIdNotEqualTo(Long.valueOf(value));
        } // end andTemplateIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateIdNotEqualTo(java.lang.Long value) {
            addCriterion("BUSINESS_TEMPLATE.TEMPLATE_ID <>", value, "templateId");

            return this;
        } // end andTemplateIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateIdNotEqualToOrIsNull(long value) {
            return andTemplateIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andTemplateIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("BUSINESS_TEMPLATE.TEMPLATE_ID is null OR BUSINESS_TEMPLATE.TEMPLATE_ID <>",
                value, "templateId");

            return this;
        } // end andTemplateIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.TEMPLATE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTemplateIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateIdGreaterThan(long value) {
            return andTemplateIdGreaterThan(Long.valueOf(value));
        } // end andTemplateIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateIdGreaterThan(java.lang.Long value) {
            addCriterion("BUSINESS_TEMPLATE.TEMPLATE_ID >", value, "templateId");

            return this;
        } // end andTemplateIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.TEMPLATE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTemplateIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateIdGreaterThanOrEqualTo(long value) {
            return andTemplateIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andTemplateIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("BUSINESS_TEMPLATE.TEMPLATE_ID >=", value, "templateId");

            return this;
        } // end andTemplateIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.TEMPLATE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTemplateIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateIdLessThan(long value) {
            return andTemplateIdLessThan(Long.valueOf(value));
        } // end andTemplateIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateIdLessThan(java.lang.Long value) {
            addCriterion("BUSINESS_TEMPLATE.TEMPLATE_ID <", value, "templateId");

            return this;
        } // end andTemplateIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.TEMPLATE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTemplateIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateIdLessThanOrEqualTo(long value) {
            return andTemplateIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andTemplateIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("BUSINESS_TEMPLATE.TEMPLATE_ID <=", value, "templateId");

            return this;
        } // end andTemplateIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.TEMPLATE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTemplateIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateIdIn(long[] values) {
            if (values.length == 1) {
                return andTemplateIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.TEMPLATE_ID in", values,
                    "templateId");

                return this;
            } // end else
        } // end andTemplateIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateIdNotIn(long[] values) {
            if (values.length == 1) {
                return andTemplateIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.TEMPLATE_ID not in", values,
                    "templateId");

                return this;
            } // end else
        } // end andTemplateIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateIdIn(List values) {
            if (values.size() == 1) {
                return andTemplateIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.TEMPLATE_ID in", values,
                    "templateId");

                return this;
            } // end else
        } // end andTemplateIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateIdNotIn(List values) {
            if (values.size() == 1) {
                return andTemplateIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.TEMPLATE_ID not in", values,
                    "templateId");

                return this;
            } // end else
        } // end andTemplateIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateIdIn(Object[] values) {
            if (values.length == 1) {
                return andTemplateIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.TEMPLATE_ID in",
                    Arrays.asList(values), "templateId");

                return this;
            } // end else
        } // end andTemplateIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andTemplateIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.TEMPLATE_ID not in",
                    Arrays.asList(values), "templateId");

                return this;
            } // end else
        } // end andTemplateIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateIdBetween(long value1, long value2) {
            addCriterion("BUSINESS_TEMPLATE.TEMPLATE_ID between", value1,
                value2, "templateId");

            return this;
        } // end andTemplateIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BUSINESS_TEMPLATE.TEMPLATE_ID between", value1,
                value2, "templateId");

            return this;
        } // end andTemplateIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateIdNotBetween(long value1, long value2) {
            addCriterion("BUSINESS_TEMPLATE.TEMPLATE_ID not between", value1,
                value2, "templateId");

            return this;
        } // end andTemplateIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BUSINESS_TEMPLATE.TEMPLATE_ID not between", value1,
                value2, "templateId");

            return this;
        } // end andTemplateIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameIsNull() {
            addCriterion("template.TEMPLATE_NAME is null");

            return this;
        } // end andTemplateNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameIsNotNull() {
            addCriterion("template.TEMPLATE_NAME is not null");

            return this;
        } // end andTemplateNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameIsNotEmpty() {
            addCriterion(
                "template.TEMPLATE_NAME is not null AND template.TEMPLATE_NAME <> ''");

            return this;
        } // end andTemplateNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameIsEmpty() {
            addCriterion(
                "(template.TEMPLATE_NAME is null OR template.TEMPLATE_NAME = '')");

            return this;
        } // end andTemplateNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameEqualTo(String value) {
            addCriterion("template.TEMPLATE_NAME =", value, "templateName");

            return this;
        } // end andTemplateNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("template.TEMPLATE_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTemplateNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameNotEqualTo(String value) {
            addCriterion("template.TEMPLATE_NAME <>", value, "templateName");

            return this;
        } // end andTemplateNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameNotEqualToOrIsNull(String value) {
            addCriterion("template.TEMPLATE_NAME is null OR template.TEMPLATE_NAME <>",
                value, "templateName");

            return this;
        } // end andTemplateNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("template.TEMPLATE_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTemplateNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameGreaterThan(String value) {
            addCriterion("template.TEMPLATE_NAME >", value, "templateName");

            return this;
        } // end andTemplateNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("template.TEMPLATE_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTemplateNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameGreaterThanOrEqualTo(String value) {
            addCriterion("template.TEMPLATE_NAME >=", value, "templateName");

            return this;
        } // end andTemplateNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("template.TEMPLATE_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTemplateNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameLessThan(String value) {
            addCriterion("template.TEMPLATE_NAME <", value, "templateName");

            return this;
        } // end andTemplateNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("template.TEMPLATE_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTemplateNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameLessThanOrEqualTo(String value) {
            addCriterion("template.TEMPLATE_NAME <=", value, "templateName");

            return this;
        } // end andTemplateNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("template.TEMPLATE_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTemplateNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("template.TEMPLATE_NAME like", buffer.toString(),
                "templateName");

            return this;
        } // end andTemplateNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("template.TEMPLATE_NAME not like", buffer.toString(),
                "templateName");

            return this;
        } // end andTemplateNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameIn(List values) {
            if (values.size() == 1) {
                return andTemplateNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("template.TEMPLATE_NAME in", values, "templateName");

                return this;
            } // end else
        } // end andTemplateNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameNotIn(List values) {
            if (values.size() == 1) {
                return andTemplateNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("template.TEMPLATE_NAME not in", values,
                    "templateName");

                return this;
            } // end else
        } // end andTemplateNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameIn(Object[] values) {
            if (values.length == 1) {
                return andTemplateNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("template.TEMPLATE_NAME in",
                    Arrays.asList(values), "templateName");

                return this;
            } // end else
        } // end andTemplateNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andTemplateNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("template.TEMPLATE_NAME not in",
                    Arrays.asList(values), "templateName");

                return this;
            } // end else
        } // end andTemplateNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameBetween(String value1, String value2) {
            addCriterion("template.TEMPLATE_NAME between", value1, value2,
                "templateName");

            return this;
        } // end andTemplateNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateNameNotBetween(String value1, String value2) {
            addCriterion("template.TEMPLATE_NAME not between", value1, value2,
                "templateName");

            return this;
        } // end andTemplateNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateDescriptionIsNull() {
            addCriterion("template.DESCRIPTION is null");

            return this;
        } // end andTemplateDescriptionIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateDescriptionIsNotNull() {
            addCriterion("template.DESCRIPTION is not null");

            return this;
        } // end andTemplateDescriptionIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateDescriptionIsNotEmpty() {
            addCriterion(
                "template.DESCRIPTION is not null AND template.DESCRIPTION <> ''");

            return this;
        } // end andTemplateDescriptionIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateDescriptionIsEmpty() {
            addCriterion(
                "(template.DESCRIPTION is null OR template.DESCRIPTION = '')");

            return this;
        } // end andTemplateDescriptionIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateDescriptionEqualTo(String value) {
            addCriterion("template.DESCRIPTION =", value, "templateDescription");

            return this;
        } // end andTemplateDescriptionEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateDescriptionEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("template.DESCRIPTION");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTemplateDescriptionEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateDescriptionNotEqualTo(String value) {
            addCriterion("template.DESCRIPTION <>", value, "templateDescription");

            return this;
        } // end andTemplateDescriptionNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateDescriptionNotEqualToOrIsNull(String value) {
            addCriterion("template.DESCRIPTION is null OR template.DESCRIPTION <>",
                value, "templateDescription");

            return this;
        } // end andTemplateDescriptionNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateDescriptionNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("template.DESCRIPTION");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTemplateDescriptionNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateDescriptionGreaterThan(String value) {
            addCriterion("template.DESCRIPTION >", value, "templateDescription");

            return this;
        } // end andTemplateDescriptionGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateDescriptionGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("template.DESCRIPTION");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTemplateDescriptionGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("template.DESCRIPTION >=", value, "templateDescription");

            return this;
        } // end andTemplateDescriptionGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateDescriptionGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("template.DESCRIPTION");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTemplateDescriptionGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateDescriptionLessThan(String value) {
            addCriterion("template.DESCRIPTION <", value, "templateDescription");

            return this;
        } // end andTemplateDescriptionLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateDescriptionLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("template.DESCRIPTION");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTemplateDescriptionLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateDescriptionLessThanOrEqualTo(String value) {
            addCriterion("template.DESCRIPTION <=", value, "templateDescription");

            return this;
        } // end andTemplateDescriptionLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateDescriptionLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("template.DESCRIPTION");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTemplateDescriptionLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateDescriptionLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("template.DESCRIPTION like", buffer.toString(),
                "templateDescription");

            return this;
        } // end andTemplateDescriptionLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateDescriptionNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("template.DESCRIPTION not like", buffer.toString(),
                "templateDescription");

            return this;
        } // end andTemplateDescriptionNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateDescriptionIn(List values) {
            if (values.size() == 1) {
                return andTemplateDescriptionEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("template.DESCRIPTION in", values,
                    "templateDescription");

                return this;
            } // end else
        } // end andTemplateDescriptionIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateDescriptionNotIn(List values) {
            if (values.size() == 1) {
                return andTemplateDescriptionNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("template.DESCRIPTION not in", values,
                    "templateDescription");

                return this;
            } // end else
        } // end andTemplateDescriptionNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateDescriptionIn(Object[] values) {
            if (values.length == 1) {
                return andTemplateDescriptionEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("template.DESCRIPTION in", Arrays.asList(values),
                    "templateDescription");

                return this;
            } // end else
        } // end andTemplateDescriptionIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateDescriptionNotIn(Object[] values) {
            if (values.length == 1) {
                return andTemplateDescriptionNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("template.DESCRIPTION not in",
                    Arrays.asList(values), "templateDescription");

                return this;
            } // end else
        } // end andTemplateDescriptionNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateDescriptionBetween(String value1,
            String value2) {
            addCriterion("template.DESCRIPTION between", value1, value2,
                "templateDescription");

            return this;
        } // end andTemplateDescriptionBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTemplateDescriptionNotBetween(String value1,
            String value2) {
            addCriterion("template.DESCRIPTION not between", value1, value2,
                "templateDescription");

            return this;
        } // end andTemplateDescriptionNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameIsNull() {
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME is null");

            return this;
        } // end andFileNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameIsNotNull() {
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME is not null");

            return this;
        } // end andFileNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameIsNotEmpty() {
            addCriterion(
                "BUSINESS_TEMPLATE.FILE_NAME is not null AND BUSINESS_TEMPLATE.FILE_NAME <> ''");

            return this;
        } // end andFileNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameIsEmpty() {
            addCriterion(
                "(BUSINESS_TEMPLATE.FILE_NAME is null OR BUSINESS_TEMPLATE.FILE_NAME = '')");

            return this;
        } // end andFileNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME =", value, "fileName");

            return this;
        } // end andFileNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.FILE_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME <>", value, "fileName");

            return this;
        } // end andFileNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameNotEqualToOrIsNull(String value) {
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME is null OR BUSINESS_TEMPLATE.FILE_NAME <>",
                value, "fileName");

            return this;
        } // end andFileNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.FILE_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME >", value, "fileName");

            return this;
        } // end andFileNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.FILE_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME >=", value, "fileName");

            return this;
        } // end andFileNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.FILE_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameLessThan(String value) {
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME <", value, "fileName");

            return this;
        } // end andFileNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.FILE_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME <=", value, "fileName");

            return this;
        } // end andFileNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.FILE_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME like", buffer.toString(),
                "fileName");

            return this;
        } // end andFileNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME not like",
                buffer.toString(), "fileName");

            return this;
        } // end andFileNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameIn(List values) {
            if (values.size() == 1) {
                return andFileNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.FILE_NAME in", values,
                    "fileName");

                return this;
            } // end else
        } // end andFileNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameNotIn(List values) {
            if (values.size() == 1) {
                return andFileNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.FILE_NAME not in", values,
                    "fileName");

                return this;
            } // end else
        } // end andFileNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameIn(Object[] values) {
            if (values.length == 1) {
                return andFileNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.FILE_NAME in",
                    Arrays.asList(values), "fileName");

                return this;
            } // end else
        } // end andFileNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andFileNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.FILE_NAME not in",
                    Arrays.asList(values), "fileName");

                return this;
            } // end else
        } // end andFileNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME between", value1, value2,
                "fileName");

            return this;
        } // end andFileNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME not between", value1,
                value2, "fileName");

            return this;
        } // end andFileNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNull() {
            addCriterion("BUSINESS_TEMPLATE.NAME is null");

            return this;
        } // end andNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNotNull() {
            addCriterion("BUSINESS_TEMPLATE.NAME is not null");

            return this;
        } // end andNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNotEmpty() {
            addCriterion(
                "BUSINESS_TEMPLATE.NAME is not null AND BUSINESS_TEMPLATE.NAME <> ''");

            return this;
        } // end andNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsEmpty() {
            addCriterion(
                "(BUSINESS_TEMPLATE.NAME is null OR BUSINESS_TEMPLATE.NAME = '')");

            return this;
        } // end andNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE.NAME =", value, "name");

            return this;
        } // end andNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameNotEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE.NAME <>", value, "name");

            return this;
        } // end andNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameNotEqualToOrIsNull(String value) {
            addCriterion("BUSINESS_TEMPLATE.NAME is null OR BUSINESS_TEMPLATE.NAME <>",
                value, "name");

            return this;
        } // end andNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameGreaterThan(String value) {
            addCriterion("BUSINESS_TEMPLATE.NAME >", value, "name");

            return this;
        } // end andNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE.NAME >=", value, "name");

            return this;
        } // end andNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameLessThan(String value) {
            addCriterion("BUSINESS_TEMPLATE.NAME <", value, "name");

            return this;
        } // end andNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE.NAME <=", value, "name");

            return this;
        } // end andNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameLessThanOrEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BUSINESS_TEMPLATE.NAME like", buffer.toString(),
                "name");

            return this;
        } // end andNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BUSINESS_TEMPLATE.NAME not like", buffer.toString(),
                "name");

            return this;
        } // end andNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIn(List values) {
            if (values.size() == 1) {
                return andNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.NAME in", values, "name");

                return this;
            } // end else
        } // end andNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameNotIn(List values) {
            if (values.size() == 1) {
                return andNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.NAME not in", values, "name");

                return this;
            } // end else
        } // end andNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIn(Object[] values) {
            if (values.length == 1) {
                return andNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.NAME in",
                    Arrays.asList(values), "name");

                return this;
            } // end else
        } // end andNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.NAME not in",
                    Arrays.asList(values), "name");

                return this;
            } // end else
        } // end andNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("BUSINESS_TEMPLATE.NAME between", value1, value2,
                "name");

            return this;
        } // end andNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_TEMPLATE.NAME not between", value1, value2,
                "name");

            return this;
        } // end andNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanOverWriteIsNull() {
            addCriterion("BUSINESS_TEMPLATE.CAN_OVER_WRITE is null");

            return this;
        } // end andCanOverWriteIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanOverWriteIsNotNull() {
            addCriterion("BUSINESS_TEMPLATE.CAN_OVER_WRITE is not null");

            return this;
        } // end andCanOverWriteIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanOverWriteIsNotEmpty() {
            addCriterion(
                "BUSINESS_TEMPLATE.CAN_OVER_WRITE is not null AND BUSINESS_TEMPLATE.CAN_OVER_WRITE <> ''");

            return this;
        } // end andCanOverWriteIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanOverWriteIsEmpty() {
            addCriterion(
                "(BUSINESS_TEMPLATE.CAN_OVER_WRITE is null OR BUSINESS_TEMPLATE.CAN_OVER_WRITE = '')");

            return this;
        } // end andCanOverWriteIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanOverWriteEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE.CAN_OVER_WRITE =", value,
                "canOverWrite");

            return this;
        } // end andCanOverWriteEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanOverWriteEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE.CAN_OVER_WRITE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCanOverWriteEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanOverWriteNotEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE.CAN_OVER_WRITE <>", value,
                "canOverWrite");

            return this;
        } // end andCanOverWriteNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanOverWriteNotEqualToOrIsNull(String value) {
            addCriterion("BUSINESS_TEMPLATE.CAN_OVER_WRITE is null OR BUSINESS_TEMPLATE.CAN_OVER_WRITE <>",
                value, "canOverWrite");

            return this;
        } // end andCanOverWriteNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanOverWriteNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE.CAN_OVER_WRITE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCanOverWriteNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanOverWriteGreaterThan(String value) {
            addCriterion("BUSINESS_TEMPLATE.CAN_OVER_WRITE >", value,
                "canOverWrite");

            return this;
        } // end andCanOverWriteGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanOverWriteGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE.CAN_OVER_WRITE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCanOverWriteGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanOverWriteGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE.CAN_OVER_WRITE >=", value,
                "canOverWrite");

            return this;
        } // end andCanOverWriteGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanOverWriteGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE.CAN_OVER_WRITE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCanOverWriteGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanOverWriteLessThan(String value) {
            addCriterion("BUSINESS_TEMPLATE.CAN_OVER_WRITE <", value,
                "canOverWrite");

            return this;
        } // end andCanOverWriteLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanOverWriteLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE.CAN_OVER_WRITE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCanOverWriteLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanOverWriteLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE.CAN_OVER_WRITE <=", value,
                "canOverWrite");

            return this;
        } // end andCanOverWriteLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanOverWriteLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE.CAN_OVER_WRITE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCanOverWriteLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanOverWriteLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BUSINESS_TEMPLATE.CAN_OVER_WRITE like",
                buffer.toString(), "canOverWrite");

            return this;
        } // end andCanOverWriteLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanOverWriteNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BUSINESS_TEMPLATE.CAN_OVER_WRITE not like",
                buffer.toString(), "canOverWrite");

            return this;
        } // end andCanOverWriteNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanOverWriteIn(List values) {
            if (values.size() == 1) {
                return andCanOverWriteEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.CAN_OVER_WRITE in", values,
                    "canOverWrite");

                return this;
            } // end else
        } // end andCanOverWriteIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanOverWriteNotIn(List values) {
            if (values.size() == 1) {
                return andCanOverWriteNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.CAN_OVER_WRITE not in", values,
                    "canOverWrite");

                return this;
            } // end else
        } // end andCanOverWriteNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanOverWriteIn(Object[] values) {
            if (values.length == 1) {
                return andCanOverWriteEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.CAN_OVER_WRITE in",
                    Arrays.asList(values), "canOverWrite");

                return this;
            } // end else
        } // end andCanOverWriteIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanOverWriteNotIn(Object[] values) {
            if (values.length == 1) {
                return andCanOverWriteNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.CAN_OVER_WRITE not in",
                    Arrays.asList(values), "canOverWrite");

                return this;
            } // end else
        } // end andCanOverWriteNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanOverWriteBetween(String value1, String value2) {
            addCriterion("BUSINESS_TEMPLATE.CAN_OVER_WRITE between", value1,
                value2, "canOverWrite");

            return this;
        } // end andCanOverWriteBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanOverWriteNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_TEMPLATE.CAN_OVER_WRITE not between",
                value1, value2, "canOverWrite");

            return this;
        } // end andCanOverWriteNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeIsNull() {
            addCriterion("BUSINESS_TEMPLATE.FILE_TYPE is null");

            return this;
        } // end andFileTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeIsNotNull() {
            addCriterion("BUSINESS_TEMPLATE.FILE_TYPE is not null");

            return this;
        } // end andFileTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeIsNotEmpty() {
            addCriterion(
                "BUSINESS_TEMPLATE.FILE_TYPE is not null AND BUSINESS_TEMPLATE.FILE_TYPE <> ''");

            return this;
        } // end andFileTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeIsEmpty() {
            addCriterion(
                "(BUSINESS_TEMPLATE.FILE_TYPE is null OR BUSINESS_TEMPLATE.FILE_TYPE = '')");

            return this;
        } // end andFileTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE.FILE_TYPE =", value, "fileType");

            return this;
        } // end andFileTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.FILE_TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeNotEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE.FILE_TYPE <>", value, "fileType");

            return this;
        } // end andFileTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeNotEqualToOrIsNull(String value) {
            addCriterion("BUSINESS_TEMPLATE.FILE_TYPE is null OR BUSINESS_TEMPLATE.FILE_TYPE <>",
                value, "fileType");

            return this;
        } // end andFileTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.FILE_TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeGreaterThan(String value) {
            addCriterion("BUSINESS_TEMPLATE.FILE_TYPE >", value, "fileType");

            return this;
        } // end andFileTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.FILE_TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE.FILE_TYPE >=", value, "fileType");

            return this;
        } // end andFileTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.FILE_TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeLessThan(String value) {
            addCriterion("BUSINESS_TEMPLATE.FILE_TYPE <", value, "fileType");

            return this;
        } // end andFileTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.FILE_TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE.FILE_TYPE <=", value, "fileType");

            return this;
        } // end andFileTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_TEMPLATE.FILE_TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BUSINESS_TEMPLATE.FILE_TYPE like", buffer.toString(),
                "fileType");

            return this;
        } // end andFileTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BUSINESS_TEMPLATE.FILE_TYPE not like",
                buffer.toString(), "fileType");

            return this;
        } // end andFileTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeIn(List values) {
            if (values.size() == 1) {
                return andFileTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.FILE_TYPE in", values,
                    "fileType");

                return this;
            } // end else
        } // end andFileTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeNotIn(List values) {
            if (values.size() == 1) {
                return andFileTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.FILE_TYPE not in", values,
                    "fileType");

                return this;
            } // end else
        } // end andFileTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeIn(Object[] values) {
            if (values.length == 1) {
                return andFileTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.FILE_TYPE in",
                    Arrays.asList(values), "fileType");

                return this;
            } // end else
        } // end andFileTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andFileTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.FILE_TYPE not in",
                    Arrays.asList(values), "fileType");

                return this;
            } // end else
        } // end andFileTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeBetween(String value1, String value2) {
            addCriterion("BUSINESS_TEMPLATE.FILE_TYPE between", value1, value2,
                "fileType");

            return this;
        } // end andFileTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileTypeNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_TEMPLATE.FILE_TYPE not between", value1,
                value2, "fileType");

            return this;
        } // end andFileTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePrefixIsNull() {
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME_PREFIX is null");

            return this;
        } // end andFileNamePrefixIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePrefixIsNotNull() {
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME_PREFIX is not null");

            return this;
        } // end andFileNamePrefixIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePrefixIsNotEmpty() {
            addCriterion(
                "BUSINESS_TEMPLATE.FILE_NAME_PREFIX is not null AND BUSINESS_TEMPLATE.FILE_NAME_PREFIX <> ''");

            return this;
        } // end andFileNamePrefixIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePrefixIsEmpty() {
            addCriterion(
                "(BUSINESS_TEMPLATE.FILE_NAME_PREFIX is null OR BUSINESS_TEMPLATE.FILE_NAME_PREFIX = '')");

            return this;
        } // end andFileNamePrefixIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePrefixEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME_PREFIX =", value,
                "fileNamePrefix");

            return this;
        } // end andFileNamePrefixEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePrefixEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE.FILE_NAME_PREFIX");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileNamePrefixEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePrefixNotEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME_PREFIX <>", value,
                "fileNamePrefix");

            return this;
        } // end andFileNamePrefixNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePrefixNotEqualToOrIsNull(String value) {
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME_PREFIX is null OR BUSINESS_TEMPLATE.FILE_NAME_PREFIX <>",
                value, "fileNamePrefix");

            return this;
        } // end andFileNamePrefixNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePrefixNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE.FILE_NAME_PREFIX");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileNamePrefixNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePrefixGreaterThan(String value) {
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME_PREFIX >", value,
                "fileNamePrefix");

            return this;
        } // end andFileNamePrefixGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePrefixGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE.FILE_NAME_PREFIX");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileNamePrefixGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePrefixGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME_PREFIX >=", value,
                "fileNamePrefix");

            return this;
        } // end andFileNamePrefixGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePrefixGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE.FILE_NAME_PREFIX");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileNamePrefixGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePrefixLessThan(String value) {
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME_PREFIX <", value,
                "fileNamePrefix");

            return this;
        } // end andFileNamePrefixLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePrefixLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE.FILE_NAME_PREFIX");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileNamePrefixLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePrefixLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME_PREFIX <=", value,
                "fileNamePrefix");

            return this;
        } // end andFileNamePrefixLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePrefixLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE.FILE_NAME_PREFIX");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileNamePrefixLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePrefixLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME_PREFIX like",
                buffer.toString(), "fileNamePrefix");

            return this;
        } // end andFileNamePrefixLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePrefixNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME_PREFIX not like",
                buffer.toString(), "fileNamePrefix");

            return this;
        } // end andFileNamePrefixNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePrefixIn(List values) {
            if (values.size() == 1) {
                return andFileNamePrefixEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.FILE_NAME_PREFIX in", values,
                    "fileNamePrefix");

                return this;
            } // end else
        } // end andFileNamePrefixIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePrefixNotIn(List values) {
            if (values.size() == 1) {
                return andFileNamePrefixNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.FILE_NAME_PREFIX not in",
                    values, "fileNamePrefix");

                return this;
            } // end else
        } // end andFileNamePrefixNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePrefixIn(Object[] values) {
            if (values.length == 1) {
                return andFileNamePrefixEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.FILE_NAME_PREFIX in",
                    Arrays.asList(values), "fileNamePrefix");

                return this;
            } // end else
        } // end andFileNamePrefixIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePrefixNotIn(Object[] values) {
            if (values.length == 1) {
                return andFileNamePrefixNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.FILE_NAME_PREFIX not in",
                    Arrays.asList(values), "fileNamePrefix");

                return this;
            } // end else
        } // end andFileNamePrefixNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePrefixBetween(String value1, String value2) {
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME_PREFIX between", value1,
                value2, "fileNamePrefix");

            return this;
        } // end andFileNamePrefixBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePrefixNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME_PREFIX not between",
                value1, value2, "fileNamePrefix");

            return this;
        } // end andFileNamePrefixNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePostfixIsNull() {
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME_POSTFIX is null");

            return this;
        } // end andFileNamePostfixIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePostfixIsNotNull() {
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME_POSTFIX is not null");

            return this;
        } // end andFileNamePostfixIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePostfixIsNotEmpty() {
            addCriterion(
                "BUSINESS_TEMPLATE.FILE_NAME_POSTFIX is not null AND BUSINESS_TEMPLATE.FILE_NAME_POSTFIX <> ''");

            return this;
        } // end andFileNamePostfixIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePostfixIsEmpty() {
            addCriterion(
                "(BUSINESS_TEMPLATE.FILE_NAME_POSTFIX is null OR BUSINESS_TEMPLATE.FILE_NAME_POSTFIX = '')");

            return this;
        } // end andFileNamePostfixIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePostfixEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME_POSTFIX =", value,
                "fileNamePostfix");

            return this;
        } // end andFileNamePostfixEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePostfixEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE.FILE_NAME_POSTFIX");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileNamePostfixEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePostfixNotEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME_POSTFIX <>", value,
                "fileNamePostfix");

            return this;
        } // end andFileNamePostfixNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePostfixNotEqualToOrIsNull(String value) {
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME_POSTFIX is null OR BUSINESS_TEMPLATE.FILE_NAME_POSTFIX <>",
                value, "fileNamePostfix");

            return this;
        } // end andFileNamePostfixNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePostfixNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE.FILE_NAME_POSTFIX");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileNamePostfixNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePostfixGreaterThan(String value) {
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME_POSTFIX >", value,
                "fileNamePostfix");

            return this;
        } // end andFileNamePostfixGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePostfixGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE.FILE_NAME_POSTFIX");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileNamePostfixGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePostfixGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME_POSTFIX >=", value,
                "fileNamePostfix");

            return this;
        } // end andFileNamePostfixGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePostfixGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE.FILE_NAME_POSTFIX");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileNamePostfixGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePostfixLessThan(String value) {
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME_POSTFIX <", value,
                "fileNamePostfix");

            return this;
        } // end andFileNamePostfixLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePostfixLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE.FILE_NAME_POSTFIX");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileNamePostfixLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePostfixLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME_POSTFIX <=", value,
                "fileNamePostfix");

            return this;
        } // end andFileNamePostfixLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePostfixLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE.FILE_NAME_POSTFIX");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFileNamePostfixLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePostfixLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME_POSTFIX like",
                buffer.toString(), "fileNamePostfix");

            return this;
        } // end andFileNamePostfixLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePostfixNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME_POSTFIX not like",
                buffer.toString(), "fileNamePostfix");

            return this;
        } // end andFileNamePostfixNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePostfixIn(List values) {
            if (values.size() == 1) {
                return andFileNamePostfixEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.FILE_NAME_POSTFIX in", values,
                    "fileNamePostfix");

                return this;
            } // end else
        } // end andFileNamePostfixIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePostfixNotIn(List values) {
            if (values.size() == 1) {
                return andFileNamePostfixNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.FILE_NAME_POSTFIX not in",
                    values, "fileNamePostfix");

                return this;
            } // end else
        } // end andFileNamePostfixNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePostfixIn(Object[] values) {
            if (values.length == 1) {
                return andFileNamePostfixEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.FILE_NAME_POSTFIX in",
                    Arrays.asList(values), "fileNamePostfix");

                return this;
            } // end else
        } // end andFileNamePostfixIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePostfixNotIn(Object[] values) {
            if (values.length == 1) {
                return andFileNamePostfixNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE.FILE_NAME_POSTFIX not in",
                    Arrays.asList(values), "fileNamePostfix");

                return this;
            } // end else
        } // end andFileNamePostfixNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePostfixBetween(String value1, String value2) {
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME_POSTFIX between", value1,
                value2, "fileNamePostfix");

            return this;
        } // end andFileNamePostfixBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFileNamePostfixNotBetween(String value1,
            String value2) {
            addCriterion("BUSINESS_TEMPLATE.FILE_NAME_POSTFIX not between",
                value1, value2, "fileNamePostfix");

            return this;
        } // end andFileNamePostfixNotBetween()
    } // end Criteria
} // end BusinessTemplateDAOQueryBean
