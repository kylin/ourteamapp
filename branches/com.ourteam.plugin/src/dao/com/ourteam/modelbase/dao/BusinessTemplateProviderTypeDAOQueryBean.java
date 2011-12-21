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
 * BusinessTemplateProviderType query bean 2011-09-22 10:16:40
 *
 * @author Auto Gen
 */
public class BusinessTemplateProviderTypeDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new BusinessTemplateProviderTypeDAOQueryBean object.
     */
    public BusinessTemplateProviderTypeDAOQueryBean() {
        super();
    } // end BusinessTemplateProviderTypeDAOQueryBean()

    /**
     * Creates a new BusinessTemplateProviderTypeDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public BusinessTemplateProviderTypeDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end BusinessTemplateProviderTypeDAOQueryBean()

    /**
     * Creates a new BusinessTemplateProviderTypeDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public BusinessTemplateProviderTypeDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end BusinessTemplateProviderTypeDAOQueryBean()

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
            addSelectProperty(IBusinessTemplateProviderTypeDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessTemplateProviderTypeDAO.Id, "id");
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
            addSelectProperty(IBusinessTemplateProviderTypeDAO.BusinessObjectType,
                aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessTemplateProviderTypeDAO.BusinessObjectType,
                "businessObjectType");
        } // end else
    } // end addBusinessObjectTypeSelectProperty()

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
            addSelectProperty(IBusinessTemplateProviderTypeDAO.Description,
                aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessTemplateProviderTypeDAO.Description,
                "description");
        } // end else
    } // end addDescriptionSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addFilePathSelectProperty() {
        addFilePathSelectProperty("filePath");
    } // end addFilePathSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addFilePathSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessTemplateProviderTypeDAO.FilePath, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessTemplateProviderTypeDAO.FilePath,
                "filePath");
        } // end else
    } // end addFilePathSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addProviderNameSelectProperty() {
        addProviderNameSelectProperty("providerName");
    } // end addProviderNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addProviderNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessTemplateProviderTypeDAO.ProviderName,
                aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessTemplateProviderTypeDAO.ProviderName,
                "providerName");
        } // end else
    } // end addProviderNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addProviderTypeSelectProperty() {
        addProviderTypeSelectProperty("providerType");
    } // end addProviderTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addProviderTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessTemplateProviderTypeDAO.ProviderType,
                aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessTemplateProviderTypeDAO.ProviderType,
                "providerType");
        } // end else
    } // end addProviderTypeSelectProperty()

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
            addSelectProperty(IBusinessTemplateProviderTypeDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessTemplateProviderTypeDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addBusinessObjectTypeSelectProperty();

        addDescriptionSelectProperty();

        addFilePathSelectProperty();

        addProviderNameSelectProperty();

        addProviderTypeSelectProperty();

        addStatusSelectProperty();
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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "BUSINESS_TEMPLATE_PROVIDER_TYPE.ID is not null AND BUSINESS_TEMPLATE_PROVIDER_TYPE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(BUSINESS_TEMPLATE_PROVIDER_TYPE.ID is null OR BUSINESS_TEMPLATE_PROVIDER_TYPE.ID = '')");

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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.ID =", value, "id");

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
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.ID");
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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.ID <>", value, "id");

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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.ID is null OR BUSINESS_TEMPLATE_PROVIDER_TYPE.ID <>",
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
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.ID");
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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.ID >", value, "id");

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
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.ID");
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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.ID");
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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.ID <", value, "id");

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
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.ID");
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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.ID");
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
                addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.ID in", values,
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
        public Criteria andIdNotIn(long[] values) {
            if (values.length == 1) {
                return andIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.ID not in",
                    values, "id");

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
                addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.ID in", values,
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
        public Criteria andIdNotIn(List values) {
            if (values.size() == 1) {
                return andIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.ID not in",
                    values, "id");

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
                addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.ID in",
                    Arrays.asList(values), "id");

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
                addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.ID not in",
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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.ID between", value1,
                value2, "id");

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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.ID between", value1,
                value2, "id");

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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.ID not between",
                value1, value2, "id");

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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.ID not between",
                value1, value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectTypeIsNull() {
            addCriterion(
                "BUSINESS_TEMPLATE_PROVIDER_TYPE.BUSINESS_OBJECT_TYPE is null");

            return this;
        } // end andBusinessObjectTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectTypeIsNotNull() {
            addCriterion(
                "BUSINESS_TEMPLATE_PROVIDER_TYPE.BUSINESS_OBJECT_TYPE is not null");

            return this;
        } // end andBusinessObjectTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectTypeIsNotEmpty() {
            addCriterion(
                "BUSINESS_TEMPLATE_PROVIDER_TYPE.BUSINESS_OBJECT_TYPE is not null AND BUSINESS_TEMPLATE_PROVIDER_TYPE.BUSINESS_OBJECT_TYPE <> ''");

            return this;
        } // end andBusinessObjectTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectTypeIsEmpty() {
            addCriterion(
                "(BUSINESS_TEMPLATE_PROVIDER_TYPE.BUSINESS_OBJECT_TYPE is null OR BUSINESS_TEMPLATE_PROVIDER_TYPE.BUSINESS_OBJECT_TYPE = '')");

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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.BUSINESS_OBJECT_TYPE =",
                value, "businessObjectType");

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
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.BUSINESS_OBJECT_TYPE");
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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.BUSINESS_OBJECT_TYPE <>",
                value, "businessObjectType");

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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.BUSINESS_OBJECT_TYPE is null OR BUSINESS_TEMPLATE_PROVIDER_TYPE.BUSINESS_OBJECT_TYPE <>",
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
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.BUSINESS_OBJECT_TYPE");
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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.BUSINESS_OBJECT_TYPE >",
                value, "businessObjectType");

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
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.BUSINESS_OBJECT_TYPE");
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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.BUSINESS_OBJECT_TYPE >=",
                value, "businessObjectType");

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
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.BUSINESS_OBJECT_TYPE");
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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.BUSINESS_OBJECT_TYPE <",
                value, "businessObjectType");

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
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.BUSINESS_OBJECT_TYPE");
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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.BUSINESS_OBJECT_TYPE <=",
                value, "businessObjectType");

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
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.BUSINESS_OBJECT_TYPE");
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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.BUSINESS_OBJECT_TYPE like",
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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.BUSINESS_OBJECT_TYPE not like",
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
                addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.BUSINESS_OBJECT_TYPE in",
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
                addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.BUSINESS_OBJECT_TYPE not in",
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
                addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.BUSINESS_OBJECT_TYPE in",
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
                addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.BUSINESS_OBJECT_TYPE not in",
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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.BUSINESS_OBJECT_TYPE between",
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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.BUSINESS_OBJECT_TYPE not between",
                value1, value2, "businessObjectType");

            return this;
        } // end andBusinessObjectTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNull() {
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.DESCRIPTION is null");

            return this;
        } // end andDescriptionIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNotNull() {
            addCriterion(
                "BUSINESS_TEMPLATE_PROVIDER_TYPE.DESCRIPTION is not null");

            return this;
        } // end andDescriptionIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNotEmpty() {
            addCriterion(
                "BUSINESS_TEMPLATE_PROVIDER_TYPE.DESCRIPTION is not null AND BUSINESS_TEMPLATE_PROVIDER_TYPE.DESCRIPTION <> ''");

            return this;
        } // end andDescriptionIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsEmpty() {
            addCriterion(
                "(BUSINESS_TEMPLATE_PROVIDER_TYPE.DESCRIPTION is null OR BUSINESS_TEMPLATE_PROVIDER_TYPE.DESCRIPTION = '')");

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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.DESCRIPTION =",
                value, "description");

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
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.DESCRIPTION");
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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.DESCRIPTION <>",
                value, "description");

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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.DESCRIPTION is null OR BUSINESS_TEMPLATE_PROVIDER_TYPE.DESCRIPTION <>",
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
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.DESCRIPTION");
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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.DESCRIPTION >",
                value, "description");

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
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.DESCRIPTION");
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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.DESCRIPTION >=",
                value, "description");

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
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.DESCRIPTION");
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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.DESCRIPTION <",
                value, "description");

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
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.DESCRIPTION");
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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.DESCRIPTION <=",
                value, "description");

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
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.DESCRIPTION");
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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.DESCRIPTION like",
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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.DESCRIPTION not like",
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
                addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.DESCRIPTION in",
                    values, "description");

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
                addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.DESCRIPTION not in",
                    values, "description");

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
                addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.DESCRIPTION in",
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
                addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.DESCRIPTION not in",
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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.DESCRIPTION between",
                value1, value2, "description");

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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.DESCRIPTION not between",
                value1, value2, "description");

            return this;
        } // end andDescriptionNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFilePathIsNull() {
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.FILE_PATH is null");

            return this;
        } // end andFilePathIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFilePathIsNotNull() {
            addCriterion(
                "BUSINESS_TEMPLATE_PROVIDER_TYPE.FILE_PATH is not null");

            return this;
        } // end andFilePathIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFilePathIsNotEmpty() {
            addCriterion(
                "BUSINESS_TEMPLATE_PROVIDER_TYPE.FILE_PATH is not null AND BUSINESS_TEMPLATE_PROVIDER_TYPE.FILE_PATH <> ''");

            return this;
        } // end andFilePathIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFilePathIsEmpty() {
            addCriterion(
                "(BUSINESS_TEMPLATE_PROVIDER_TYPE.FILE_PATH is null OR BUSINESS_TEMPLATE_PROVIDER_TYPE.FILE_PATH = '')");

            return this;
        } // end andFilePathIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFilePathEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.FILE_PATH =", value,
                "filePath");

            return this;
        } // end andFilePathEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFilePathEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.FILE_PATH");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFilePathEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFilePathNotEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.FILE_PATH <>", value,
                "filePath");

            return this;
        } // end andFilePathNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFilePathNotEqualToOrIsNull(String value) {
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.FILE_PATH is null OR BUSINESS_TEMPLATE_PROVIDER_TYPE.FILE_PATH <>",
                value, "filePath");

            return this;
        } // end andFilePathNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFilePathNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.FILE_PATH");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFilePathNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFilePathGreaterThan(String value) {
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.FILE_PATH >", value,
                "filePath");

            return this;
        } // end andFilePathGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFilePathGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.FILE_PATH");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFilePathGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.FILE_PATH >=", value,
                "filePath");

            return this;
        } // end andFilePathGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFilePathGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.FILE_PATH");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFilePathGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFilePathLessThan(String value) {
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.FILE_PATH <", value,
                "filePath");

            return this;
        } // end andFilePathLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFilePathLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.FILE_PATH");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFilePathLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFilePathLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.FILE_PATH <=", value,
                "filePath");

            return this;
        } // end andFilePathLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFilePathLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.FILE_PATH");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFilePathLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFilePathLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.FILE_PATH like",
                buffer.toString(), "filePath");

            return this;
        } // end andFilePathLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFilePathNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.FILE_PATH not like",
                buffer.toString(), "filePath");

            return this;
        } // end andFilePathNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFilePathIn(List values) {
            if (values.size() == 1) {
                return andFilePathEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.FILE_PATH in",
                    values, "filePath");

                return this;
            } // end else
        } // end andFilePathIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFilePathNotIn(List values) {
            if (values.size() == 1) {
                return andFilePathNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.FILE_PATH not in",
                    values, "filePath");

                return this;
            } // end else
        } // end andFilePathNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFilePathIn(Object[] values) {
            if (values.length == 1) {
                return andFilePathEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.FILE_PATH in",
                    Arrays.asList(values), "filePath");

                return this;
            } // end else
        } // end andFilePathIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFilePathNotIn(Object[] values) {
            if (values.length == 1) {
                return andFilePathNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.FILE_PATH not in",
                    Arrays.asList(values), "filePath");

                return this;
            } // end else
        } // end andFilePathNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFilePathBetween(String value1, String value2) {
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.FILE_PATH between",
                value1, value2, "filePath");

            return this;
        } // end andFilePathBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFilePathNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.FILE_PATH not between",
                value1, value2, "filePath");

            return this;
        } // end andFilePathNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameIsNull() {
            addCriterion(
                "BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_NAME is null");

            return this;
        } // end andProviderNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameIsNotNull() {
            addCriterion(
                "BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_NAME is not null");

            return this;
        } // end andProviderNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameIsNotEmpty() {
            addCriterion(
                "BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_NAME is not null AND BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_NAME <> ''");

            return this;
        } // end andProviderNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameIsEmpty() {
            addCriterion(
                "(BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_NAME is null OR BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_NAME = '')");

            return this;
        } // end andProviderNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_NAME =",
                value, "providerName");

            return this;
        } // end andProviderNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameNotEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_NAME <>",
                value, "providerName");

            return this;
        } // end andProviderNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameNotEqualToOrIsNull(String value) {
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_NAME is null OR BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_NAME <>",
                value, "providerName");

            return this;
        } // end andProviderNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameGreaterThan(String value) {
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_NAME >",
                value, "providerName");

            return this;
        } // end andProviderNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_NAME >=",
                value, "providerName");

            return this;
        } // end andProviderNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameLessThan(String value) {
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_NAME <",
                value, "providerName");

            return this;
        } // end andProviderNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_NAME <=",
                value, "providerName");

            return this;
        } // end andProviderNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_NAME like",
                buffer.toString(), "providerName");

            return this;
        } // end andProviderNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_NAME not like",
                buffer.toString(), "providerName");

            return this;
        } // end andProviderNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameIn(List values) {
            if (values.size() == 1) {
                return andProviderNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_NAME in",
                    values, "providerName");

                return this;
            } // end else
        } // end andProviderNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameNotIn(List values) {
            if (values.size() == 1) {
                return andProviderNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_NAME not in",
                    values, "providerName");

                return this;
            } // end else
        } // end andProviderNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameIn(Object[] values) {
            if (values.length == 1) {
                return andProviderNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_NAME in",
                    Arrays.asList(values), "providerName");

                return this;
            } // end else
        } // end andProviderNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andProviderNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_NAME not in",
                    Arrays.asList(values), "providerName");

                return this;
            } // end else
        } // end andProviderNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameBetween(String value1, String value2) {
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_NAME between",
                value1, value2, "providerName");

            return this;
        } // end andProviderNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderNameNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_NAME not between",
                value1, value2, "providerName");

            return this;
        } // end andProviderNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIsNull() {
            addCriterion(
                "BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_TYPE is null");

            return this;
        } // end andProviderTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIsNotNull() {
            addCriterion(
                "BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_TYPE is not null");

            return this;
        } // end andProviderTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIsNotEmpty() {
            addCriterion(
                "BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_TYPE is not null AND BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_TYPE <> ''");

            return this;
        } // end andProviderTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIsEmpty() {
            addCriterion(
                "(BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_TYPE is null OR BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_TYPE = '')");

            return this;
        } // end andProviderTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_TYPE =",
                value, "providerType");

            return this;
        } // end andProviderTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeNotEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_TYPE <>",
                value, "providerType");

            return this;
        } // end andProviderTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeNotEqualToOrIsNull(String value) {
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_TYPE is null OR BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_TYPE <>",
                value, "providerType");

            return this;
        } // end andProviderTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeGreaterThan(String value) {
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_TYPE >",
                value, "providerType");

            return this;
        } // end andProviderTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_TYPE >=",
                value, "providerType");

            return this;
        } // end andProviderTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeLessThan(String value) {
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_TYPE <",
                value, "providerType");

            return this;
        } // end andProviderTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_TYPE <=",
                value, "providerType");

            return this;
        } // end andProviderTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_TYPE like",
                buffer.toString(), "providerType");

            return this;
        } // end andProviderTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_TYPE not like",
                buffer.toString(), "providerType");

            return this;
        } // end andProviderTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIn(List values) {
            if (values.size() == 1) {
                return andProviderTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_TYPE in",
                    values, "providerType");

                return this;
            } // end else
        } // end andProviderTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeNotIn(List values) {
            if (values.size() == 1) {
                return andProviderTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_TYPE not in",
                    values, "providerType");

                return this;
            } // end else
        } // end andProviderTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeIn(Object[] values) {
            if (values.length == 1) {
                return andProviderTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_TYPE in",
                    Arrays.asList(values), "providerType");

                return this;
            } // end else
        } // end andProviderTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andProviderTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_TYPE not in",
                    Arrays.asList(values), "providerType");

                return this;
            } // end else
        } // end andProviderTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeBetween(String value1, String value2) {
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_TYPE between",
                value1, value2, "providerType");

            return this;
        } // end andProviderTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderTypeNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.PROVIDER_TYPE not between",
                value1, value2, "providerType");

            return this;
        } // end andProviderTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "BUSINESS_TEMPLATE_PROVIDER_TYPE.STATUS is not null AND BUSINESS_TEMPLATE_PROVIDER_TYPE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(BUSINESS_TEMPLATE_PROVIDER_TYPE.STATUS is null OR BUSINESS_TEMPLATE_PROVIDER_TYPE.STATUS = '')");

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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.STATUS =", value,
                "status");

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
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.STATUS");
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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.STATUS <>", value,
                "status");

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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.STATUS is null OR BUSINESS_TEMPLATE_PROVIDER_TYPE.STATUS <>",
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
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.STATUS");
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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.STATUS >", value,
                "status");

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
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.STATUS");
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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.STATUS >=", value,
                "status");

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
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.STATUS");
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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.STATUS <", value,
                "status");

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
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.STATUS");
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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.STATUS <=", value,
                "status");

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
            StringBuffer str = new StringBuffer(
                    "BUSINESS_TEMPLATE_PROVIDER_TYPE.STATUS");
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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.STATUS like",
                buffer.toString(), "status");

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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.STATUS not like",
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
                addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.STATUS in",
                    values, "status");

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
                addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.STATUS not in",
                    values, "status");

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
                addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.STATUS in",
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
                addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.STATUS not in",
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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.STATUS between",
                value1, value2, "status");

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
            addCriterion("BUSINESS_TEMPLATE_PROVIDER_TYPE.STATUS not between",
                value1, value2, "status");

            return this;
        } // end andStatusNotBetween()
    } // end Criteria
} // end BusinessTemplateProviderTypeDAOQueryBean
