/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.resource.dao;

import net.dao.BaseQueryBean;
import net.dao.BaseWhereCriterion;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * ResourcePropertyInstance query bean 2011-09-22 10:18:27
 *
 * @author Auto Gen
 */
public class ResourcePropertyInstanceDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new ResourcePropertyInstanceDAOQueryBean object.
     */
    public ResourcePropertyInstanceDAOQueryBean() {
        super();
    } // end ResourcePropertyInstanceDAOQueryBean()

    /**
     * Creates a new ResourcePropertyInstanceDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public ResourcePropertyInstanceDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end ResourcePropertyInstanceDAOQueryBean()

    /**
     * Creates a new ResourcePropertyInstanceDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public ResourcePropertyInstanceDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end ResourcePropertyInstanceDAOQueryBean()

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
            addSelectProperty(IResourcePropertyInstanceDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IResourcePropertyInstanceDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRemarksSelectProperty() {
        addRemarksSelectProperty("remarks");
    } // end addRemarksSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRemarksSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IResourcePropertyInstanceDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IResourcePropertyInstanceDAO.Remarks, "remarks");
        } // end else
    } // end addRemarksSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addResourceInstanceIdSelectProperty() {
        addResourceInstanceIdSelectProperty("resourceInstanceId");
    } // end addResourceInstanceIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addResourceInstanceIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IResourcePropertyInstanceDAO.ResourceInstanceId,
                aAlias);
        } // end if
        else {
            addSelectProperty(IResourcePropertyInstanceDAO.ResourceInstanceId,
                "resourceInstanceId");
        } // end else
    } // end addResourceInstanceIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addResourcePropertyIdSelectProperty() {
        addResourcePropertyIdSelectProperty("resourcePropertyId");
    } // end addResourcePropertyIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addResourcePropertyIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IResourcePropertyInstanceDAO.ResourcePropertyId,
                aAlias);
        } // end if
        else {
            addSelectProperty(IResourcePropertyInstanceDAO.ResourcePropertyId,
                "resourcePropertyId");
        } // end else
    } // end addResourcePropertyIdSelectProperty()

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
            addSelectProperty(IResourcePropertyInstanceDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IResourcePropertyInstanceDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addValueSelectProperty() {
        addValueSelectProperty("value");
    } // end addValueSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addValueSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IResourcePropertyInstanceDAO.Value, aAlias);
        } // end if
        else {
            addSelectProperty(IResourcePropertyInstanceDAO.Value, "value");
        } // end else
    } // end addValueSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addPropertyCodeSelectProperty() {
        addPropertyCodeSelectProperty("propertyCode");
    } // end addPropertyCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addPropertyCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IResourcePropertyInstanceDAO.PropertyCode, aAlias);
        } // end if
        else {
            addSelectProperty(IResourcePropertyInstanceDAO.PropertyCode,
                "propertyCode");
        } // end else
    } // end addPropertyCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addPropertyNameSelectProperty() {
        addPropertyNameSelectProperty("propertyName");
    } // end addPropertyNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addPropertyNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IResourcePropertyInstanceDAO.PropertyName, aAlias);
        } // end if
        else {
            addSelectProperty(IResourcePropertyInstanceDAO.PropertyName,
                "propertyName");
        } // end else
    } // end addPropertyNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addPropertyDataTypeSelectProperty() {
        addPropertyDataTypeSelectProperty("propertyDataType");
    } // end addPropertyDataTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addPropertyDataTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IResourcePropertyInstanceDAO.PropertyDataType,
                aAlias);
        } // end if
        else {
            addSelectProperty(IResourcePropertyInstanceDAO.PropertyDataType,
                "propertyDataType");
        } // end else
    } // end addPropertyDataTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addPropertySortIndexSelectProperty() {
        addPropertySortIndexSelectProperty("propertySortIndex");
    } // end addPropertySortIndexSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addPropertySortIndexSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IResourcePropertyInstanceDAO.PropertySortIndex,
                aAlias);
        } // end if
        else {
            addSelectProperty(IResourcePropertyInstanceDAO.PropertySortIndex,
                "propertySortIndex");
        } // end else
    } // end addPropertySortIndexSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addPropertyStatusSelectProperty() {
        addPropertyStatusSelectProperty("propertyStatus");
    } // end addPropertyStatusSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addPropertyStatusSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IResourcePropertyInstanceDAO.PropertyStatus,
                aAlias);
        } // end if
        else {
            addSelectProperty(IResourcePropertyInstanceDAO.PropertyStatus,
                "propertyStatus");
        } // end else
    } // end addPropertyStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addResourceTypeIdSelectProperty() {
        addResourceTypeIdSelectProperty("resourceTypeId");
    } // end addResourceTypeIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addResourceTypeIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IResourcePropertyInstanceDAO.ResourceTypeId,
                aAlias);
        } // end if
        else {
            addSelectProperty(IResourcePropertyInstanceDAO.ResourceTypeId,
                "resourceTypeId");
        } // end else
    } // end addResourceTypeIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addRemarksSelectProperty();

        addResourceInstanceIdSelectProperty();

        addResourcePropertyIdSelectProperty();

        addStatusSelectProperty();

        addValueSelectProperty();

        addPropertyCodeSelectProperty();

        addPropertyNameSelectProperty();

        addPropertyDataTypeSelectProperty();

        addPropertySortIndexSelectProperty();

        addPropertyStatusSelectProperty();

        addResourceTypeIdSelectProperty();
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
            addCriterion("RESOURCE_PROPERTY_INSTANCE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "RESOURCE_PROPERTY_INSTANCE.ID is not null AND RESOURCE_PROPERTY_INSTANCE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(RESOURCE_PROPERTY_INSTANCE.ID is null OR RESOURCE_PROPERTY_INSTANCE.ID = '')");

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
            addCriterion("RESOURCE_PROPERTY_INSTANCE.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("RESOURCE_PROPERTY_INSTANCE.ID");
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
            addCriterion("RESOURCE_PROPERTY_INSTANCE.ID <>", value, "id");

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
            addCriterion("RESOURCE_PROPERTY_INSTANCE.ID is null OR RESOURCE_PROPERTY_INSTANCE.ID <>",
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
            StringBuffer str = new StringBuffer("RESOURCE_PROPERTY_INSTANCE.ID");
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
            addCriterion("RESOURCE_PROPERTY_INSTANCE.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("RESOURCE_PROPERTY_INSTANCE.ID");
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
            addCriterion("RESOURCE_PROPERTY_INSTANCE.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("RESOURCE_PROPERTY_INSTANCE.ID");
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
            addCriterion("RESOURCE_PROPERTY_INSTANCE.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("RESOURCE_PROPERTY_INSTANCE.ID");
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
            addCriterion("RESOURCE_PROPERTY_INSTANCE.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("RESOURCE_PROPERTY_INSTANCE.ID");
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
                addCriterion("RESOURCE_PROPERTY_INSTANCE.ID in", values, "id");

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
                addCriterion("RESOURCE_PROPERTY_INSTANCE.ID not in", values,
                    "id");

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
                addCriterion("RESOURCE_PROPERTY_INSTANCE.ID in", values, "id");

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
                addCriterion("RESOURCE_PROPERTY_INSTANCE.ID not in", values,
                    "id");

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
                addCriterion("RESOURCE_PROPERTY_INSTANCE.ID in",
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
                addCriterion("RESOURCE_PROPERTY_INSTANCE.ID not in",
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
            addCriterion("RESOURCE_PROPERTY_INSTANCE.ID between", value1,
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
            addCriterion("RESOURCE_PROPERTY_INSTANCE.ID between", value1,
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
            addCriterion("RESOURCE_PROPERTY_INSTANCE.ID not between", value1,
                value2, "id");

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
            addCriterion("RESOURCE_PROPERTY_INSTANCE.ID not between", value1,
                value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "RESOURCE_PROPERTY_INSTANCE.REMARKS is not null AND RESOURCE_PROPERTY_INSTANCE.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(RESOURCE_PROPERTY_INSTANCE.REMARKS is null OR RESOURCE_PROPERTY_INSTANCE.REMARKS = '')");

            return this;
        } // end andRemarksIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksEqualTo(String value) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.REMARKS =", value,
                "remarks");

            return this;
        } // end andRemarksEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_PROPERTY_INSTANCE.REMARKS");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRemarksEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.REMARKS <>", value,
                "remarks");

            return this;
        } // end andRemarksNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksNotEqualToOrIsNull(String value) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.REMARKS is null OR RESOURCE_PROPERTY_INSTANCE.REMARKS <>",
                value, "remarks");

            return this;
        } // end andRemarksNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_PROPERTY_INSTANCE.REMARKS");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRemarksNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.REMARKS >", value,
                "remarks");

            return this;
        } // end andRemarksGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_PROPERTY_INSTANCE.REMARKS");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRemarksGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.REMARKS >=", value,
                "remarks");

            return this;
        } // end andRemarksGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_PROPERTY_INSTANCE.REMARKS");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRemarksGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksLessThan(String value) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.REMARKS <", value,
                "remarks");

            return this;
        } // end andRemarksLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_PROPERTY_INSTANCE.REMARKS");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRemarksLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.REMARKS <=", value,
                "remarks");

            return this;
        } // end andRemarksLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_PROPERTY_INSTANCE.REMARKS");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRemarksLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("RESOURCE_PROPERTY_INSTANCE.REMARKS like",
                buffer.toString(), "remarks");

            return this;
        } // end andRemarksLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("RESOURCE_PROPERTY_INSTANCE.REMARKS not like",
                buffer.toString(), "remarks");

            return this;
        } // end andRemarksNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIn(List values) {
            if (values.size() == 1) {
                return andRemarksEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("RESOURCE_PROPERTY_INSTANCE.REMARKS in", values,
                    "remarks");

                return this;
            } // end else
        } // end andRemarksIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksNotIn(List values) {
            if (values.size() == 1) {
                return andRemarksNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("RESOURCE_PROPERTY_INSTANCE.REMARKS not in",
                    values, "remarks");

                return this;
            } // end else
        } // end andRemarksNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIn(Object[] values) {
            if (values.length == 1) {
                return andRemarksEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("RESOURCE_PROPERTY_INSTANCE.REMARKS in",
                    Arrays.asList(values), "remarks");

                return this;
            } // end else
        } // end andRemarksIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksNotIn(Object[] values) {
            if (values.length == 1) {
                return andRemarksNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("RESOURCE_PROPERTY_INSTANCE.REMARKS not in",
                    Arrays.asList(values), "remarks");

                return this;
            } // end else
        } // end andRemarksNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.REMARKS between", value1,
                value2, "remarks");

            return this;
        } // end andRemarksBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.REMARKS not between",
                value1, value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdIsNull() {
            addCriterion(
                "RESOURCE_PROPERTY_INSTANCE.RESOURCE_INSTANCE_ID is null");

            return this;
        } // end andResourceInstanceIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdIsNotNull() {
            addCriterion(
                "RESOURCE_PROPERTY_INSTANCE.RESOURCE_INSTANCE_ID is not null");

            return this;
        } // end andResourceInstanceIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdIsNotEmpty() {
            addCriterion(
                "RESOURCE_PROPERTY_INSTANCE.RESOURCE_INSTANCE_ID is not null AND RESOURCE_PROPERTY_INSTANCE.RESOURCE_INSTANCE_ID <> ''");

            return this;
        } // end andResourceInstanceIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdIsEmpty() {
            addCriterion(
                "(RESOURCE_PROPERTY_INSTANCE.RESOURCE_INSTANCE_ID is null OR RESOURCE_PROPERTY_INSTANCE.RESOURCE_INSTANCE_ID = '')");

            return this;
        } // end andResourceInstanceIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdEqualTo(long value) {
            return andResourceInstanceIdEqualTo(Long.valueOf(value));
        } // end andResourceInstanceIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdEqualTo(java.lang.Long value) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_INSTANCE_ID =",
                value, "resourceInstanceId");

            return this;
        } // end andResourceInstanceIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_PROPERTY_INSTANCE.RESOURCE_INSTANCE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceInstanceIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdNotEqualTo(long value) {
            return andResourceInstanceIdNotEqualTo(Long.valueOf(value));
        } // end andResourceInstanceIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdNotEqualTo(java.lang.Long value) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_INSTANCE_ID <>",
                value, "resourceInstanceId");

            return this;
        } // end andResourceInstanceIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdNotEqualToOrIsNull(long value) {
            return andResourceInstanceIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andResourceInstanceIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_INSTANCE_ID is null OR RESOURCE_PROPERTY_INSTANCE.RESOURCE_INSTANCE_ID <>",
                value, "resourceInstanceId");

            return this;
        } // end andResourceInstanceIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_PROPERTY_INSTANCE.RESOURCE_INSTANCE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceInstanceIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdGreaterThan(long value) {
            return andResourceInstanceIdGreaterThan(Long.valueOf(value));
        } // end andResourceInstanceIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdGreaterThan(java.lang.Long value) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_INSTANCE_ID >",
                value, "resourceInstanceId");

            return this;
        } // end andResourceInstanceIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_PROPERTY_INSTANCE.RESOURCE_INSTANCE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceInstanceIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdGreaterThanOrEqualTo(long value) {
            return andResourceInstanceIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andResourceInstanceIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_INSTANCE_ID >=",
                value, "resourceInstanceId");

            return this;
        } // end andResourceInstanceIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_PROPERTY_INSTANCE.RESOURCE_INSTANCE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceInstanceIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdLessThan(long value) {
            return andResourceInstanceIdLessThan(Long.valueOf(value));
        } // end andResourceInstanceIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdLessThan(java.lang.Long value) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_INSTANCE_ID <",
                value, "resourceInstanceId");

            return this;
        } // end andResourceInstanceIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_PROPERTY_INSTANCE.RESOURCE_INSTANCE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceInstanceIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdLessThanOrEqualTo(long value) {
            return andResourceInstanceIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andResourceInstanceIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_INSTANCE_ID <=",
                value, "resourceInstanceId");

            return this;
        } // end andResourceInstanceIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_PROPERTY_INSTANCE.RESOURCE_INSTANCE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceInstanceIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdIn(long[] values) {
            if (values.length == 1) {
                return andResourceInstanceIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_INSTANCE_ID in",
                    values, "resourceInstanceId");

                return this;
            } // end else
        } // end andResourceInstanceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdNotIn(long[] values) {
            if (values.length == 1) {
                return andResourceInstanceIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_INSTANCE_ID not in",
                    values, "resourceInstanceId");

                return this;
            } // end else
        } // end andResourceInstanceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdIn(List values) {
            if (values.size() == 1) {
                return andResourceInstanceIdEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_INSTANCE_ID in",
                    values, "resourceInstanceId");

                return this;
            } // end else
        } // end andResourceInstanceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdNotIn(List values) {
            if (values.size() == 1) {
                return andResourceInstanceIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_INSTANCE_ID not in",
                    values, "resourceInstanceId");

                return this;
            } // end else
        } // end andResourceInstanceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdIn(Object[] values) {
            if (values.length == 1) {
                return andResourceInstanceIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_INSTANCE_ID in",
                    Arrays.asList(values), "resourceInstanceId");

                return this;
            } // end else
        } // end andResourceInstanceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andResourceInstanceIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_INSTANCE_ID not in",
                    Arrays.asList(values), "resourceInstanceId");

                return this;
            } // end else
        } // end andResourceInstanceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdBetween(long value1, long value2) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_INSTANCE_ID between",
                value1, value2, "resourceInstanceId");

            return this;
        } // end andResourceInstanceIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_INSTANCE_ID between",
                value1, value2, "resourceInstanceId");

            return this;
        } // end andResourceInstanceIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdNotBetween(long value1, long value2) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_INSTANCE_ID not between",
                value1, value2, "resourceInstanceId");

            return this;
        } // end andResourceInstanceIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_INSTANCE_ID not between",
                value1, value2, "resourceInstanceId");

            return this;
        } // end andResourceInstanceIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyIdIsNull() {
            addCriterion(
                "RESOURCE_PROPERTY_INSTANCE.RESOURCE_PROPERTY_ID is null");

            return this;
        } // end andResourcePropertyIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyIdIsNotNull() {
            addCriterion(
                "RESOURCE_PROPERTY_INSTANCE.RESOURCE_PROPERTY_ID is not null");

            return this;
        } // end andResourcePropertyIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyIdIsNotEmpty() {
            addCriterion(
                "RESOURCE_PROPERTY_INSTANCE.RESOURCE_PROPERTY_ID is not null AND RESOURCE_PROPERTY_INSTANCE.RESOURCE_PROPERTY_ID <> ''");

            return this;
        } // end andResourcePropertyIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyIdIsEmpty() {
            addCriterion(
                "(RESOURCE_PROPERTY_INSTANCE.RESOURCE_PROPERTY_ID is null OR RESOURCE_PROPERTY_INSTANCE.RESOURCE_PROPERTY_ID = '')");

            return this;
        } // end andResourcePropertyIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyIdEqualTo(long value) {
            return andResourcePropertyIdEqualTo(Long.valueOf(value));
        } // end andResourcePropertyIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyIdEqualTo(java.lang.Long value) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_PROPERTY_ID =",
                value, "resourcePropertyId");

            return this;
        } // end andResourcePropertyIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_PROPERTY_INSTANCE.RESOURCE_PROPERTY_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyIdNotEqualTo(long value) {
            return andResourcePropertyIdNotEqualTo(Long.valueOf(value));
        } // end andResourcePropertyIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyIdNotEqualTo(java.lang.Long value) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_PROPERTY_ID <>",
                value, "resourcePropertyId");

            return this;
        } // end andResourcePropertyIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyIdNotEqualToOrIsNull(long value) {
            return andResourcePropertyIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andResourcePropertyIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_PROPERTY_ID is null OR RESOURCE_PROPERTY_INSTANCE.RESOURCE_PROPERTY_ID <>",
                value, "resourcePropertyId");

            return this;
        } // end andResourcePropertyIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_PROPERTY_INSTANCE.RESOURCE_PROPERTY_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyIdGreaterThan(long value) {
            return andResourcePropertyIdGreaterThan(Long.valueOf(value));
        } // end andResourcePropertyIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyIdGreaterThan(java.lang.Long value) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_PROPERTY_ID >",
                value, "resourcePropertyId");

            return this;
        } // end andResourcePropertyIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_PROPERTY_INSTANCE.RESOURCE_PROPERTY_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyIdGreaterThanOrEqualTo(long value) {
            return andResourcePropertyIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andResourcePropertyIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_PROPERTY_ID >=",
                value, "resourcePropertyId");

            return this;
        } // end andResourcePropertyIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_PROPERTY_INSTANCE.RESOURCE_PROPERTY_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyIdLessThan(long value) {
            return andResourcePropertyIdLessThan(Long.valueOf(value));
        } // end andResourcePropertyIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyIdLessThan(java.lang.Long value) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_PROPERTY_ID <",
                value, "resourcePropertyId");

            return this;
        } // end andResourcePropertyIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_PROPERTY_INSTANCE.RESOURCE_PROPERTY_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyIdLessThanOrEqualTo(long value) {
            return andResourcePropertyIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andResourcePropertyIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_PROPERTY_ID <=",
                value, "resourcePropertyId");

            return this;
        } // end andResourcePropertyIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_PROPERTY_INSTANCE.RESOURCE_PROPERTY_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyIdIn(long[] values) {
            if (values.length == 1) {
                return andResourcePropertyIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_PROPERTY_ID in",
                    values, "resourcePropertyId");

                return this;
            } // end else
        } // end andResourcePropertyIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyIdNotIn(long[] values) {
            if (values.length == 1) {
                return andResourcePropertyIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_PROPERTY_ID not in",
                    values, "resourcePropertyId");

                return this;
            } // end else
        } // end andResourcePropertyIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyIdIn(List values) {
            if (values.size() == 1) {
                return andResourcePropertyIdEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_PROPERTY_ID in",
                    values, "resourcePropertyId");

                return this;
            } // end else
        } // end andResourcePropertyIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyIdNotIn(List values) {
            if (values.size() == 1) {
                return andResourcePropertyIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_PROPERTY_ID not in",
                    values, "resourcePropertyId");

                return this;
            } // end else
        } // end andResourcePropertyIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyIdIn(Object[] values) {
            if (values.length == 1) {
                return andResourcePropertyIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_PROPERTY_ID in",
                    Arrays.asList(values), "resourcePropertyId");

                return this;
            } // end else
        } // end andResourcePropertyIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andResourcePropertyIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_PROPERTY_ID not in",
                    Arrays.asList(values), "resourcePropertyId");

                return this;
            } // end else
        } // end andResourcePropertyIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyIdBetween(long value1, long value2) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_PROPERTY_ID between",
                value1, value2, "resourcePropertyId");

            return this;
        } // end andResourcePropertyIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_PROPERTY_ID between",
                value1, value2, "resourcePropertyId");

            return this;
        } // end andResourcePropertyIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyIdNotBetween(long value1, long value2) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_PROPERTY_ID not between",
                value1, value2, "resourcePropertyId");

            return this;
        } // end andResourcePropertyIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_PROPERTY_ID not between",
                value1, value2, "resourcePropertyId");

            return this;
        } // end andResourcePropertyIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "RESOURCE_PROPERTY_INSTANCE.STATUS is not null AND RESOURCE_PROPERTY_INSTANCE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(RESOURCE_PROPERTY_INSTANCE.STATUS is null OR RESOURCE_PROPERTY_INSTANCE.STATUS = '')");

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
            addCriterion("RESOURCE_PROPERTY_INSTANCE.STATUS =", value, "status");

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
                    "RESOURCE_PROPERTY_INSTANCE.STATUS");
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
            addCriterion("RESOURCE_PROPERTY_INSTANCE.STATUS <>", value, "status");

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
            addCriterion("RESOURCE_PROPERTY_INSTANCE.STATUS is null OR RESOURCE_PROPERTY_INSTANCE.STATUS <>",
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
                    "RESOURCE_PROPERTY_INSTANCE.STATUS");
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
            addCriterion("RESOURCE_PROPERTY_INSTANCE.STATUS >", value, "status");

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
                    "RESOURCE_PROPERTY_INSTANCE.STATUS");
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
            addCriterion("RESOURCE_PROPERTY_INSTANCE.STATUS >=", value, "status");

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
                    "RESOURCE_PROPERTY_INSTANCE.STATUS");
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
            addCriterion("RESOURCE_PROPERTY_INSTANCE.STATUS <", value, "status");

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
                    "RESOURCE_PROPERTY_INSTANCE.STATUS");
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
            addCriterion("RESOURCE_PROPERTY_INSTANCE.STATUS <=", value, "status");

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
                    "RESOURCE_PROPERTY_INSTANCE.STATUS");
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
            addCriterion("RESOURCE_PROPERTY_INSTANCE.STATUS like",
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
            addCriterion("RESOURCE_PROPERTY_INSTANCE.STATUS not like",
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
                addCriterion("RESOURCE_PROPERTY_INSTANCE.STATUS in", values,
                    "status");

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
                addCriterion("RESOURCE_PROPERTY_INSTANCE.STATUS not in",
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
                addCriterion("RESOURCE_PROPERTY_INSTANCE.STATUS in",
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
                addCriterion("RESOURCE_PROPERTY_INSTANCE.STATUS not in",
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
            addCriterion("RESOURCE_PROPERTY_INSTANCE.STATUS between", value1,
                value2, "status");

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
            addCriterion("RESOURCE_PROPERTY_INSTANCE.STATUS not between",
                value1, value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueIsNull() {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.VALUE is null");

            return this;
        } // end andValueIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueIsNotNull() {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.VALUE is not null");

            return this;
        } // end andValueIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueIsNotEmpty() {
            addCriterion(
                "RESOURCE_PROPERTY_INSTANCE.VALUE is not null AND RESOURCE_PROPERTY_INSTANCE.VALUE <> ''");

            return this;
        } // end andValueIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueIsEmpty() {
            addCriterion(
                "(RESOURCE_PROPERTY_INSTANCE.VALUE is null OR RESOURCE_PROPERTY_INSTANCE.VALUE = '')");

            return this;
        } // end andValueIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueEqualTo(String value) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.VALUE =", value, "value");

            return this;
        } // end andValueEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_PROPERTY_INSTANCE.VALUE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValueEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueNotEqualTo(String value) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.VALUE <>", value, "value");

            return this;
        } // end andValueNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueNotEqualToOrIsNull(String value) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.VALUE is null OR RESOURCE_PROPERTY_INSTANCE.VALUE <>",
                value, "value");

            return this;
        } // end andValueNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_PROPERTY_INSTANCE.VALUE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValueNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueGreaterThan(String value) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.VALUE >", value, "value");

            return this;
        } // end andValueGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_PROPERTY_INSTANCE.VALUE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValueGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.VALUE >=", value, "value");

            return this;
        } // end andValueGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_PROPERTY_INSTANCE.VALUE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValueGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLessThan(String value) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.VALUE <", value, "value");

            return this;
        } // end andValueLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_PROPERTY_INSTANCE.VALUE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValueLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLessThanOrEqualTo(String value) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.VALUE <=", value, "value");

            return this;
        } // end andValueLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_PROPERTY_INSTANCE.VALUE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValueLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("RESOURCE_PROPERTY_INSTANCE.VALUE like",
                buffer.toString(), "value");

            return this;
        } // end andValueLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("RESOURCE_PROPERTY_INSTANCE.VALUE not like",
                buffer.toString(), "value");

            return this;
        } // end andValueNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueIn(List values) {
            if (values.size() == 1) {
                return andValueEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("RESOURCE_PROPERTY_INSTANCE.VALUE in", values,
                    "value");

                return this;
            } // end else
        } // end andValueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueNotIn(List values) {
            if (values.size() == 1) {
                return andValueNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("RESOURCE_PROPERTY_INSTANCE.VALUE not in", values,
                    "value");

                return this;
            } // end else
        } // end andValueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueIn(Object[] values) {
            if (values.length == 1) {
                return andValueEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("RESOURCE_PROPERTY_INSTANCE.VALUE in",
                    Arrays.asList(values), "value");

                return this;
            } // end else
        } // end andValueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueNotIn(Object[] values) {
            if (values.length == 1) {
                return andValueNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("RESOURCE_PROPERTY_INSTANCE.VALUE not in",
                    Arrays.asList(values), "value");

                return this;
            } // end else
        } // end andValueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueBetween(String value1, String value2) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.VALUE between", value1,
                value2, "value");

            return this;
        } // end andValueBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueNotBetween(String value1, String value2) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.VALUE not between",
                value1, value2, "value");

            return this;
        } // end andValueNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyCodeIsNull() {
            addCriterion("resourcePropertyC.CODE is null");

            return this;
        } // end andPropertyCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyCodeIsNotNull() {
            addCriterion("resourcePropertyC.CODE is not null");

            return this;
        } // end andPropertyCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyCodeIsNotEmpty() {
            addCriterion(
                "resourcePropertyC.CODE is not null AND resourcePropertyC.CODE <> ''");

            return this;
        } // end andPropertyCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyCodeIsEmpty() {
            addCriterion(
                "(resourcePropertyC.CODE is null OR resourcePropertyC.CODE = '')");

            return this;
        } // end andPropertyCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyCodeEqualTo(String value) {
            addCriterion("resourcePropertyC.CODE =", value, "propertyCode");

            return this;
        } // end andPropertyCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyCodeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("resourcePropertyC.CODE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyCodeNotEqualTo(String value) {
            addCriterion("resourcePropertyC.CODE <>", value, "propertyCode");

            return this;
        } // end andPropertyCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyCodeNotEqualToOrIsNull(String value) {
            addCriterion("resourcePropertyC.CODE is null OR resourcePropertyC.CODE <>",
                value, "propertyCode");

            return this;
        } // end andPropertyCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyCodeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("resourcePropertyC.CODE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyCodeGreaterThan(String value) {
            addCriterion("resourcePropertyC.CODE >", value, "propertyCode");

            return this;
        } // end andPropertyCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyCodeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("resourcePropertyC.CODE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("resourcePropertyC.CODE >=", value, "propertyCode");

            return this;
        } // end andPropertyCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("resourcePropertyC.CODE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyCodeLessThan(String value) {
            addCriterion("resourcePropertyC.CODE <", value, "propertyCode");

            return this;
        } // end andPropertyCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyCodeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("resourcePropertyC.CODE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyCodeLessThanOrEqualTo(String value) {
            addCriterion("resourcePropertyC.CODE <=", value, "propertyCode");

            return this;
        } // end andPropertyCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyCodeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("resourcePropertyC.CODE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("resourcePropertyC.CODE like", buffer.toString(),
                "propertyCode");

            return this;
        } // end andPropertyCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("resourcePropertyC.CODE not like", buffer.toString(),
                "propertyCode");

            return this;
        } // end andPropertyCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyCodeIn(List values) {
            if (values.size() == 1) {
                return andPropertyCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("resourcePropertyC.CODE in", values, "propertyCode");

                return this;
            } // end else
        } // end andPropertyCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyCodeNotIn(List values) {
            if (values.size() == 1) {
                return andPropertyCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("resourcePropertyC.CODE not in", values,
                    "propertyCode");

                return this;
            } // end else
        } // end andPropertyCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyCodeIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("resourcePropertyC.CODE in",
                    Arrays.asList(values), "propertyCode");

                return this;
            } // end else
        } // end andPropertyCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("resourcePropertyC.CODE not in",
                    Arrays.asList(values), "propertyCode");

                return this;
            } // end else
        } // end andPropertyCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyCodeBetween(String value1, String value2) {
            addCriterion("resourcePropertyC.CODE between", value1, value2,
                "propertyCode");

            return this;
        } // end andPropertyCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyCodeNotBetween(String value1, String value2) {
            addCriterion("resourcePropertyC.CODE not between", value1, value2,
                "propertyCode");

            return this;
        } // end andPropertyCodeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameIsNull() {
            addCriterion("resourcePropertyC.NAME is null");

            return this;
        } // end andPropertyNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameIsNotNull() {
            addCriterion("resourcePropertyC.NAME is not null");

            return this;
        } // end andPropertyNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameIsNotEmpty() {
            addCriterion(
                "resourcePropertyC.NAME is not null AND resourcePropertyC.NAME <> ''");

            return this;
        } // end andPropertyNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameIsEmpty() {
            addCriterion(
                "(resourcePropertyC.NAME is null OR resourcePropertyC.NAME = '')");

            return this;
        } // end andPropertyNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameEqualTo(String value) {
            addCriterion("resourcePropertyC.NAME =", value, "propertyName");

            return this;
        } // end andPropertyNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("resourcePropertyC.NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameNotEqualTo(String value) {
            addCriterion("resourcePropertyC.NAME <>", value, "propertyName");

            return this;
        } // end andPropertyNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameNotEqualToOrIsNull(String value) {
            addCriterion("resourcePropertyC.NAME is null OR resourcePropertyC.NAME <>",
                value, "propertyName");

            return this;
        } // end andPropertyNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("resourcePropertyC.NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameGreaterThan(String value) {
            addCriterion("resourcePropertyC.NAME >", value, "propertyName");

            return this;
        } // end andPropertyNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("resourcePropertyC.NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameGreaterThanOrEqualTo(String value) {
            addCriterion("resourcePropertyC.NAME >=", value, "propertyName");

            return this;
        } // end andPropertyNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("resourcePropertyC.NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameLessThan(String value) {
            addCriterion("resourcePropertyC.NAME <", value, "propertyName");

            return this;
        } // end andPropertyNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("resourcePropertyC.NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameLessThanOrEqualTo(String value) {
            addCriterion("resourcePropertyC.NAME <=", value, "propertyName");

            return this;
        } // end andPropertyNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("resourcePropertyC.NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("resourcePropertyC.NAME like", buffer.toString(),
                "propertyName");

            return this;
        } // end andPropertyNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("resourcePropertyC.NAME not like", buffer.toString(),
                "propertyName");

            return this;
        } // end andPropertyNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameIn(List values) {
            if (values.size() == 1) {
                return andPropertyNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("resourcePropertyC.NAME in", values, "propertyName");

                return this;
            } // end else
        } // end andPropertyNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameNotIn(List values) {
            if (values.size() == 1) {
                return andPropertyNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("resourcePropertyC.NAME not in", values,
                    "propertyName");

                return this;
            } // end else
        } // end andPropertyNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("resourcePropertyC.NAME in",
                    Arrays.asList(values), "propertyName");

                return this;
            } // end else
        } // end andPropertyNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("resourcePropertyC.NAME not in",
                    Arrays.asList(values), "propertyName");

                return this;
            } // end else
        } // end andPropertyNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameBetween(String value1, String value2) {
            addCriterion("resourcePropertyC.NAME between", value1, value2,
                "propertyName");

            return this;
        } // end andPropertyNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameNotBetween(String value1, String value2) {
            addCriterion("resourcePropertyC.NAME not between", value1, value2,
                "propertyName");

            return this;
        } // end andPropertyNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeIsNull() {
            addCriterion("resourcePropertyC.DATA_TYPE is null");

            return this;
        } // end andPropertyDataTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeIsNotNull() {
            addCriterion("resourcePropertyC.DATA_TYPE is not null");

            return this;
        } // end andPropertyDataTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeIsNotEmpty() {
            addCriterion(
                "resourcePropertyC.DATA_TYPE is not null AND resourcePropertyC.DATA_TYPE <> ''");

            return this;
        } // end andPropertyDataTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeIsEmpty() {
            addCriterion(
                "(resourcePropertyC.DATA_TYPE is null OR resourcePropertyC.DATA_TYPE = '')");

            return this;
        } // end andPropertyDataTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeEqualTo(String value) {
            addCriterion("resourcePropertyC.DATA_TYPE =", value,
                "propertyDataType");

            return this;
        } // end andPropertyDataTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("resourcePropertyC.DATA_TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyDataTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeNotEqualTo(String value) {
            addCriterion("resourcePropertyC.DATA_TYPE <>", value,
                "propertyDataType");

            return this;
        } // end andPropertyDataTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeNotEqualToOrIsNull(String value) {
            addCriterion("resourcePropertyC.DATA_TYPE is null OR resourcePropertyC.DATA_TYPE <>",
                value, "propertyDataType");

            return this;
        } // end andPropertyDataTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("resourcePropertyC.DATA_TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyDataTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeGreaterThan(String value) {
            addCriterion("resourcePropertyC.DATA_TYPE >", value,
                "propertyDataType");

            return this;
        } // end andPropertyDataTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("resourcePropertyC.DATA_TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyDataTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeGreaterThanOrEqualTo(String value) {
            addCriterion("resourcePropertyC.DATA_TYPE >=", value,
                "propertyDataType");

            return this;
        } // end andPropertyDataTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("resourcePropertyC.DATA_TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyDataTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeLessThan(String value) {
            addCriterion("resourcePropertyC.DATA_TYPE <", value,
                "propertyDataType");

            return this;
        } // end andPropertyDataTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("resourcePropertyC.DATA_TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyDataTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeLessThanOrEqualTo(String value) {
            addCriterion("resourcePropertyC.DATA_TYPE <=", value,
                "propertyDataType");

            return this;
        } // end andPropertyDataTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("resourcePropertyC.DATA_TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyDataTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("resourcePropertyC.DATA_TYPE like", buffer.toString(),
                "propertyDataType");

            return this;
        } // end andPropertyDataTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("resourcePropertyC.DATA_TYPE not like",
                buffer.toString(), "propertyDataType");

            return this;
        } // end andPropertyDataTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeIn(List values) {
            if (values.size() == 1) {
                return andPropertyDataTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("resourcePropertyC.DATA_TYPE in", values,
                    "propertyDataType");

                return this;
            } // end else
        } // end andPropertyDataTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeNotIn(List values) {
            if (values.size() == 1) {
                return andPropertyDataTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("resourcePropertyC.DATA_TYPE not in", values,
                    "propertyDataType");

                return this;
            } // end else
        } // end andPropertyDataTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyDataTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("resourcePropertyC.DATA_TYPE in",
                    Arrays.asList(values), "propertyDataType");

                return this;
            } // end else
        } // end andPropertyDataTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyDataTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("resourcePropertyC.DATA_TYPE not in",
                    Arrays.asList(values), "propertyDataType");

                return this;
            } // end else
        } // end andPropertyDataTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeBetween(String value1, String value2) {
            addCriterion("resourcePropertyC.DATA_TYPE between", value1, value2,
                "propertyDataType");

            return this;
        } // end andPropertyDataTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeNotBetween(String value1,
            String value2) {
            addCriterion("resourcePropertyC.DATA_TYPE not between", value1,
                value2, "propertyDataType");

            return this;
        } // end andPropertyDataTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertySortIndexIsNull() {
            addCriterion("resourcePropertyC.SORT_INDEX is null");

            return this;
        } // end andPropertySortIndexIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertySortIndexIsNotNull() {
            addCriterion("resourcePropertyC.SORT_INDEX is not null");

            return this;
        } // end andPropertySortIndexIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertySortIndexIsNotEmpty() {
            addCriterion(
                "resourcePropertyC.SORT_INDEX is not null AND resourcePropertyC.SORT_INDEX <> ''");

            return this;
        } // end andPropertySortIndexIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertySortIndexIsEmpty() {
            addCriterion(
                "(resourcePropertyC.SORT_INDEX is null OR resourcePropertyC.SORT_INDEX = '')");

            return this;
        } // end andPropertySortIndexIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertySortIndexEqualTo(int value) {
            return andPropertySortIndexEqualTo(Integer.valueOf(value));
        } // end andPropertySortIndexEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertySortIndexEqualTo(java.lang.Integer value) {
            addCriterion("resourcePropertyC.SORT_INDEX =", value,
                "propertySortIndex");

            return this;
        } // end andPropertySortIndexEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertySortIndexEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("resourcePropertyC.SORT_INDEX");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertySortIndexEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertySortIndexNotEqualTo(int value) {
            return andPropertySortIndexNotEqualTo(Integer.valueOf(value));
        } // end andPropertySortIndexNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertySortIndexNotEqualTo(java.lang.Integer value) {
            addCriterion("resourcePropertyC.SORT_INDEX <>", value,
                "propertySortIndex");

            return this;
        } // end andPropertySortIndexNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertySortIndexNotEqualToOrIsNull(int value) {
            return andPropertySortIndexNotEqualToOrIsNull(Integer.valueOf(value));
        } // end andPropertySortIndexNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertySortIndexNotEqualToOrIsNull(
            java.lang.Integer value) {
            addCriterion("resourcePropertyC.SORT_INDEX is null OR resourcePropertyC.SORT_INDEX <>",
                value, "propertySortIndex");

            return this;
        } // end andPropertySortIndexNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertySortIndexNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("resourcePropertyC.SORT_INDEX");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertySortIndexNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertySortIndexGreaterThan(int value) {
            return andPropertySortIndexGreaterThan(Integer.valueOf(value));
        } // end andPropertySortIndexGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertySortIndexGreaterThan(java.lang.Integer value) {
            addCriterion("resourcePropertyC.SORT_INDEX >", value,
                "propertySortIndex");

            return this;
        } // end andPropertySortIndexGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertySortIndexGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("resourcePropertyC.SORT_INDEX");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertySortIndexGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertySortIndexGreaterThanOrEqualTo(int value) {
            return andPropertySortIndexGreaterThanOrEqualTo(Integer.valueOf(
                    value));
        } // end andPropertySortIndexGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertySortIndexGreaterThanOrEqualTo(
            java.lang.Integer value) {
            addCriterion("resourcePropertyC.SORT_INDEX >=", value,
                "propertySortIndex");

            return this;
        } // end andPropertySortIndexGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertySortIndexGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("resourcePropertyC.SORT_INDEX");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertySortIndexGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertySortIndexLessThan(int value) {
            return andPropertySortIndexLessThan(Integer.valueOf(value));
        } // end andPropertySortIndexLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertySortIndexLessThan(java.lang.Integer value) {
            addCriterion("resourcePropertyC.SORT_INDEX <", value,
                "propertySortIndex");

            return this;
        } // end andPropertySortIndexLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertySortIndexLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("resourcePropertyC.SORT_INDEX");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertySortIndexLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertySortIndexLessThanOrEqualTo(int value) {
            return andPropertySortIndexLessThanOrEqualTo(Integer.valueOf(value));
        } // end andPropertySortIndexLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertySortIndexLessThanOrEqualTo(
            java.lang.Integer value) {
            addCriterion("resourcePropertyC.SORT_INDEX <=", value,
                "propertySortIndex");

            return this;
        } // end andPropertySortIndexLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertySortIndexLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("resourcePropertyC.SORT_INDEX");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertySortIndexLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertySortIndexIn(int[] values) {
            if (values.length == 1) {
                return andPropertySortIndexEqualTo((int) values[0]);
            } // end if
            else {
                addCriterion("resourcePropertyC.SORT_INDEX in", values,
                    "propertySortIndex");

                return this;
            } // end else
        } // end andPropertySortIndexIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertySortIndexNotIn(int[] values) {
            if (values.length == 1) {
                return andPropertySortIndexNotEqualTo((int) values[0]);
            } // end if
            else {
                addCriterion("resourcePropertyC.SORT_INDEX not in", values,
                    "propertySortIndex");

                return this;
            } // end else
        } // end andPropertySortIndexNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertySortIndexIn(List values) {
            if (values.size() == 1) {
                return andPropertySortIndexEqualTo((java.lang.Integer) values.get(
                        0));
            } // end if
            else {
                addCriterion("resourcePropertyC.SORT_INDEX in", values,
                    "propertySortIndex");

                return this;
            } // end else
        } // end andPropertySortIndexIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertySortIndexNotIn(List values) {
            if (values.size() == 1) {
                return andPropertySortIndexNotEqualTo((java.lang.Integer) values.get(
                        0));
            } // end if
            else {
                addCriterion("resourcePropertyC.SORT_INDEX not in", values,
                    "propertySortIndex");

                return this;
            } // end else
        } // end andPropertySortIndexNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertySortIndexIn(Object[] values) {
            if (values.length == 1) {
                return andPropertySortIndexEqualTo((java.lang.Integer) values[0]);
            } // end if
            else {
                addCriterion("resourcePropertyC.SORT_INDEX in",
                    Arrays.asList(values), "propertySortIndex");

                return this;
            } // end else
        } // end andPropertySortIndexIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertySortIndexNotIn(Object[] values) {
            if (values.length == 1) {
                return andPropertySortIndexNotEqualTo((java.lang.Integer) values[0]);
            } // end if
            else {
                addCriterion("resourcePropertyC.SORT_INDEX not in",
                    Arrays.asList(values), "propertySortIndex");

                return this;
            } // end else
        } // end andPropertySortIndexNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertySortIndexBetween(int value1, int value2) {
            addCriterion("resourcePropertyC.SORT_INDEX between", value1,
                value2, "propertySortIndex");

            return this;
        } // end andPropertySortIndexBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertySortIndexBetween(java.lang.Integer value1,
            java.lang.Integer value2) {
            addCriterion("resourcePropertyC.SORT_INDEX between", value1,
                value2, "propertySortIndex");

            return this;
        } // end andPropertySortIndexBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertySortIndexNotBetween(int value1, int value2) {
            addCriterion("resourcePropertyC.SORT_INDEX not between", value1,
                value2, "propertySortIndex");

            return this;
        } // end andPropertySortIndexNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertySortIndexNotBetween(
            java.lang.Integer value1, java.lang.Integer value2) {
            addCriterion("resourcePropertyC.SORT_INDEX not between", value1,
                value2, "propertySortIndex");

            return this;
        } // end andPropertySortIndexNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStatusIsNull() {
            addCriterion("resourcePropertyC.STATUS is null");

            return this;
        } // end andPropertyStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStatusIsNotNull() {
            addCriterion("resourcePropertyC.STATUS is not null");

            return this;
        } // end andPropertyStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStatusIsNotEmpty() {
            addCriterion(
                "resourcePropertyC.STATUS is not null AND resourcePropertyC.STATUS <> ''");

            return this;
        } // end andPropertyStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStatusIsEmpty() {
            addCriterion(
                "(resourcePropertyC.STATUS is null OR resourcePropertyC.STATUS = '')");

            return this;
        } // end andPropertyStatusIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStatusEqualTo(String value) {
            addCriterion("resourcePropertyC.STATUS =", value, "propertyStatus");

            return this;
        } // end andPropertyStatusEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStatusEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("resourcePropertyC.STATUS");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyStatusEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStatusNotEqualTo(String value) {
            addCriterion("resourcePropertyC.STATUS <>", value, "propertyStatus");

            return this;
        } // end andPropertyStatusNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStatusNotEqualToOrIsNull(String value) {
            addCriterion("resourcePropertyC.STATUS is null OR resourcePropertyC.STATUS <>",
                value, "propertyStatus");

            return this;
        } // end andPropertyStatusNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStatusNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("resourcePropertyC.STATUS");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyStatusNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStatusGreaterThan(String value) {
            addCriterion("resourcePropertyC.STATUS >", value, "propertyStatus");

            return this;
        } // end andPropertyStatusGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStatusGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("resourcePropertyC.STATUS");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyStatusGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStatusGreaterThanOrEqualTo(String value) {
            addCriterion("resourcePropertyC.STATUS >=", value, "propertyStatus");

            return this;
        } // end andPropertyStatusGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStatusGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("resourcePropertyC.STATUS");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyStatusGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStatusLessThan(String value) {
            addCriterion("resourcePropertyC.STATUS <", value, "propertyStatus");

            return this;
        } // end andPropertyStatusLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStatusLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("resourcePropertyC.STATUS");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyStatusLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStatusLessThanOrEqualTo(String value) {
            addCriterion("resourcePropertyC.STATUS <=", value, "propertyStatus");

            return this;
        } // end andPropertyStatusLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStatusLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("resourcePropertyC.STATUS");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyStatusLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStatusLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("resourcePropertyC.STATUS like", buffer.toString(),
                "propertyStatus");

            return this;
        } // end andPropertyStatusLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStatusNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("resourcePropertyC.STATUS not like",
                buffer.toString(), "propertyStatus");

            return this;
        } // end andPropertyStatusNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStatusIn(List values) {
            if (values.size() == 1) {
                return andPropertyStatusEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("resourcePropertyC.STATUS in", values,
                    "propertyStatus");

                return this;
            } // end else
        } // end andPropertyStatusIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStatusNotIn(List values) {
            if (values.size() == 1) {
                return andPropertyStatusNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("resourcePropertyC.STATUS not in", values,
                    "propertyStatus");

                return this;
            } // end else
        } // end andPropertyStatusNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStatusIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyStatusEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("resourcePropertyC.STATUS in",
                    Arrays.asList(values), "propertyStatus");

                return this;
            } // end else
        } // end andPropertyStatusIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStatusNotIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyStatusNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("resourcePropertyC.STATUS not in",
                    Arrays.asList(values), "propertyStatus");

                return this;
            } // end else
        } // end andPropertyStatusNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStatusBetween(String value1, String value2) {
            addCriterion("resourcePropertyC.STATUS between", value1, value2,
                "propertyStatus");

            return this;
        } // end andPropertyStatusBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStatusNotBetween(String value1, String value2) {
            addCriterion("resourcePropertyC.STATUS not between", value1,
                value2, "propertyStatus");

            return this;
        } // end andPropertyStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdIsNull() {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_TYPE_ID is null");

            return this;
        } // end andResourceTypeIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdIsNotNull() {
            addCriterion(
                "RESOURCE_PROPERTY_INSTANCE.RESOURCE_TYPE_ID is not null");

            return this;
        } // end andResourceTypeIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdIsNotEmpty() {
            addCriterion(
                "RESOURCE_PROPERTY_INSTANCE.RESOURCE_TYPE_ID is not null AND RESOURCE_PROPERTY_INSTANCE.RESOURCE_TYPE_ID <> ''");

            return this;
        } // end andResourceTypeIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdIsEmpty() {
            addCriterion(
                "(RESOURCE_PROPERTY_INSTANCE.RESOURCE_TYPE_ID is null OR RESOURCE_PROPERTY_INSTANCE.RESOURCE_TYPE_ID = '')");

            return this;
        } // end andResourceTypeIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdEqualTo(long value) {
            return andResourceTypeIdEqualTo(Long.valueOf(value));
        } // end andResourceTypeIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdEqualTo(java.lang.Long value) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_TYPE_ID =",
                value, "resourceTypeId");

            return this;
        } // end andResourceTypeIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_PROPERTY_INSTANCE.RESOURCE_TYPE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceTypeIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdNotEqualTo(long value) {
            return andResourceTypeIdNotEqualTo(Long.valueOf(value));
        } // end andResourceTypeIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdNotEqualTo(java.lang.Long value) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_TYPE_ID <>",
                value, "resourceTypeId");

            return this;
        } // end andResourceTypeIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdNotEqualToOrIsNull(long value) {
            return andResourceTypeIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andResourceTypeIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_TYPE_ID is null OR RESOURCE_PROPERTY_INSTANCE.RESOURCE_TYPE_ID <>",
                value, "resourceTypeId");

            return this;
        } // end andResourceTypeIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_PROPERTY_INSTANCE.RESOURCE_TYPE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceTypeIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdGreaterThan(long value) {
            return andResourceTypeIdGreaterThan(Long.valueOf(value));
        } // end andResourceTypeIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdGreaterThan(java.lang.Long value) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_TYPE_ID >",
                value, "resourceTypeId");

            return this;
        } // end andResourceTypeIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_PROPERTY_INSTANCE.RESOURCE_TYPE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceTypeIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdGreaterThanOrEqualTo(long value) {
            return andResourceTypeIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andResourceTypeIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_TYPE_ID >=",
                value, "resourceTypeId");

            return this;
        } // end andResourceTypeIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_PROPERTY_INSTANCE.RESOURCE_TYPE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceTypeIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdLessThan(long value) {
            return andResourceTypeIdLessThan(Long.valueOf(value));
        } // end andResourceTypeIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdLessThan(java.lang.Long value) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_TYPE_ID <",
                value, "resourceTypeId");

            return this;
        } // end andResourceTypeIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_PROPERTY_INSTANCE.RESOURCE_TYPE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceTypeIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdLessThanOrEqualTo(long value) {
            return andResourceTypeIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andResourceTypeIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_TYPE_ID <=",
                value, "resourceTypeId");

            return this;
        } // end andResourceTypeIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_PROPERTY_INSTANCE.RESOURCE_TYPE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceTypeIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdIn(long[] values) {
            if (values.length == 1) {
                return andResourceTypeIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_TYPE_ID in",
                    values, "resourceTypeId");

                return this;
            } // end else
        } // end andResourceTypeIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdNotIn(long[] values) {
            if (values.length == 1) {
                return andResourceTypeIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_TYPE_ID not in",
                    values, "resourceTypeId");

                return this;
            } // end else
        } // end andResourceTypeIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdIn(List values) {
            if (values.size() == 1) {
                return andResourceTypeIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_TYPE_ID in",
                    values, "resourceTypeId");

                return this;
            } // end else
        } // end andResourceTypeIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdNotIn(List values) {
            if (values.size() == 1) {
                return andResourceTypeIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_TYPE_ID not in",
                    values, "resourceTypeId");

                return this;
            } // end else
        } // end andResourceTypeIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdIn(Object[] values) {
            if (values.length == 1) {
                return andResourceTypeIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_TYPE_ID in",
                    Arrays.asList(values), "resourceTypeId");

                return this;
            } // end else
        } // end andResourceTypeIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andResourceTypeIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_TYPE_ID not in",
                    Arrays.asList(values), "resourceTypeId");

                return this;
            } // end else
        } // end andResourceTypeIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdBetween(long value1, long value2) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_TYPE_ID between",
                value1, value2, "resourceTypeId");

            return this;
        } // end andResourceTypeIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_TYPE_ID between",
                value1, value2, "resourceTypeId");

            return this;
        } // end andResourceTypeIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdNotBetween(long value1, long value2) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_TYPE_ID not between",
                value1, value2, "resourceTypeId");

            return this;
        } // end andResourceTypeIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("RESOURCE_PROPERTY_INSTANCE.RESOURCE_TYPE_ID not between",
                value1, value2, "resourceTypeId");

            return this;
        } // end andResourceTypeIdNotBetween()
    } // end Criteria
} // end ResourcePropertyInstanceDAOQueryBean
