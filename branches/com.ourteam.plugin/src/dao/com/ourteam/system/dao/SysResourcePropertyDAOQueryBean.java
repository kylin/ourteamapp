/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import net.dao.BaseQueryBean;
import net.dao.BaseWhereCriterion;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * SysResourceProperty query bean 2011-09-22 10:11:16
 *
 * @author Auto Gen
 */
public class SysResourcePropertyDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new SysResourcePropertyDAOQueryBean object.
     */
    public SysResourcePropertyDAOQueryBean() {
        super();
    } // end SysResourcePropertyDAOQueryBean()

    /**
     * Creates a new SysResourcePropertyDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public SysResourcePropertyDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end SysResourcePropertyDAOQueryBean()

    /**
     * Creates a new SysResourcePropertyDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public SysResourcePropertyDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end SysResourcePropertyDAOQueryBean()

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
            addSelectProperty(ISysResourcePropertyDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(ISysResourcePropertyDAO.Id, "id");
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
            addSelectProperty(ISysResourcePropertyDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(ISysResourcePropertyDAO.Remarks, "remarks");
        } // end else
    } // end addRemarksSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addResourcePropertyCodeSelectProperty() {
        addResourcePropertyCodeSelectProperty("resourcePropertyCode");
    } // end addResourcePropertyCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addResourcePropertyCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysResourcePropertyDAO.ResourcePropertyCode,
                aAlias);
        } // end if
        else {
            addSelectProperty(ISysResourcePropertyDAO.ResourcePropertyCode,
                "resourcePropertyCode");
        } // end else
    } // end addResourcePropertyCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addResourcePropertyDefaultValueSelectProperty() {
        addResourcePropertyDefaultValueSelectProperty(
            "resourcePropertyDefaultValue");
    } // end addResourcePropertyDefaultValueSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addResourcePropertyDefaultValueSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysResourcePropertyDAO.ResourcePropertyDefaultValue,
                aAlias);
        } // end if
        else {
            addSelectProperty(ISysResourcePropertyDAO.ResourcePropertyDefaultValue,
                "resourcePropertyDefaultValue");
        } // end else
    } // end addResourcePropertyDefaultValueSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addResourcePropertyNameSelectProperty() {
        addResourcePropertyNameSelectProperty("resourcePropertyName");
    } // end addResourcePropertyNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addResourcePropertyNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysResourcePropertyDAO.ResourcePropertyName,
                aAlias);
        } // end if
        else {
            addSelectProperty(ISysResourcePropertyDAO.ResourcePropertyName,
                "resourcePropertyName");
        } // end else
    } // end addResourcePropertyNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addResourcePropertyOrderSelectProperty() {
        addResourcePropertyOrderSelectProperty("resourcePropertyOrder");
    } // end addResourcePropertyOrderSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addResourcePropertyOrderSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysResourcePropertyDAO.ResourcePropertyOrder,
                aAlias);
        } // end if
        else {
            addSelectProperty(ISysResourcePropertyDAO.ResourcePropertyOrder,
                "resourcePropertyOrder");
        } // end else
    } // end addResourcePropertyOrderSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addResourcePropertyTypeSelectProperty() {
        addResourcePropertyTypeSelectProperty("resourcePropertyType");
    } // end addResourcePropertyTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addResourcePropertyTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysResourcePropertyDAO.ResourcePropertyType,
                aAlias);
        } // end if
        else {
            addSelectProperty(ISysResourcePropertyDAO.ResourcePropertyType,
                "resourcePropertyType");
        } // end else
    } // end addResourcePropertyTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addResourcePropertyValueSelectProperty() {
        addResourcePropertyValueSelectProperty("resourcePropertyValue");
    } // end addResourcePropertyValueSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addResourcePropertyValueSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysResourcePropertyDAO.ResourcePropertyValue,
                aAlias);
        } // end if
        else {
            addSelectProperty(ISysResourcePropertyDAO.ResourcePropertyValue,
                "resourcePropertyValue");
        } // end else
    } // end addResourcePropertyValueSelectProperty()

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
            addSelectProperty(ISysResourcePropertyDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(ISysResourcePropertyDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addSysResourceIdSelectProperty() {
        addSysResourceIdSelectProperty("sysResourceId");
    } // end addSysResourceIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addSysResourceIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysResourcePropertyDAO.SysResourceId, aAlias);
        } // end if
        else {
            addSelectProperty(ISysResourcePropertyDAO.SysResourceId,
                "sysResourceId");
        } // end else
    } // end addSysResourceIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addRemarksSelectProperty();

        addResourcePropertyCodeSelectProperty();

        addResourcePropertyDefaultValueSelectProperty();

        addResourcePropertyNameSelectProperty();

        addResourcePropertyOrderSelectProperty();

        addResourcePropertyTypeSelectProperty();

        addResourcePropertyValueSelectProperty();

        addStatusSelectProperty();

        addSysResourceIdSelectProperty();
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
            addCriterion("SYS_RESOURCE_PROPERTY.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("SYS_RESOURCE_PROPERTY.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "SYS_RESOURCE_PROPERTY.ID is not null AND SYS_RESOURCE_PROPERTY.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(SYS_RESOURCE_PROPERTY.ID is null OR SYS_RESOURCE_PROPERTY.ID = '')");

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
            addCriterion("SYS_RESOURCE_PROPERTY.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE_PROPERTY.ID");
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
            addCriterion("SYS_RESOURCE_PROPERTY.ID <>", value, "id");

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
            addCriterion("SYS_RESOURCE_PROPERTY.ID is null OR SYS_RESOURCE_PROPERTY.ID <>",
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
            StringBuffer str = new StringBuffer("SYS_RESOURCE_PROPERTY.ID");
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
            addCriterion("SYS_RESOURCE_PROPERTY.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE_PROPERTY.ID");
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
            addCriterion("SYS_RESOURCE_PROPERTY.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE_PROPERTY.ID");
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
            addCriterion("SYS_RESOURCE_PROPERTY.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE_PROPERTY.ID");
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
            addCriterion("SYS_RESOURCE_PROPERTY.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE_PROPERTY.ID");
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
                addCriterion("SYS_RESOURCE_PROPERTY.ID in", values, "id");

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
                addCriterion("SYS_RESOURCE_PROPERTY.ID not in", values, "id");

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
                addCriterion("SYS_RESOURCE_PROPERTY.ID in", values, "id");

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
                addCriterion("SYS_RESOURCE_PROPERTY.ID not in", values, "id");

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
                addCriterion("SYS_RESOURCE_PROPERTY.ID in",
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
                addCriterion("SYS_RESOURCE_PROPERTY.ID not in",
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
            addCriterion("SYS_RESOURCE_PROPERTY.ID between", value1, value2,
                "id");

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
            addCriterion("SYS_RESOURCE_PROPERTY.ID between", value1, value2,
                "id");

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
            addCriterion("SYS_RESOURCE_PROPERTY.ID not between", value1,
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
            addCriterion("SYS_RESOURCE_PROPERTY.ID not between", value1,
                value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("SYS_RESOURCE_PROPERTY.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("SYS_RESOURCE_PROPERTY.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "SYS_RESOURCE_PROPERTY.REMARKS is not null AND SYS_RESOURCE_PROPERTY.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(SYS_RESOURCE_PROPERTY.REMARKS is null OR SYS_RESOURCE_PROPERTY.REMARKS = '')");

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
            addCriterion("SYS_RESOURCE_PROPERTY.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE_PROPERTY.REMARKS");
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
            addCriterion("SYS_RESOURCE_PROPERTY.REMARKS <>", value, "remarks");

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
            addCriterion("SYS_RESOURCE_PROPERTY.REMARKS is null OR SYS_RESOURCE_PROPERTY.REMARKS <>",
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
            StringBuffer str = new StringBuffer("SYS_RESOURCE_PROPERTY.REMARKS");
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
            addCriterion("SYS_RESOURCE_PROPERTY.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE_PROPERTY.REMARKS");
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
            addCriterion("SYS_RESOURCE_PROPERTY.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE_PROPERTY.REMARKS");
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
            addCriterion("SYS_RESOURCE_PROPERTY.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE_PROPERTY.REMARKS");
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
            addCriterion("SYS_RESOURCE_PROPERTY.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE_PROPERTY.REMARKS");
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
            addCriterion("SYS_RESOURCE_PROPERTY.REMARKS like",
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
            addCriterion("SYS_RESOURCE_PROPERTY.REMARKS not like",
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
                addCriterion("SYS_RESOURCE_PROPERTY.REMARKS in", values,
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
                addCriterion("SYS_RESOURCE_PROPERTY.REMARKS not in", values,
                    "remarks");

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
                addCriterion("SYS_RESOURCE_PROPERTY.REMARKS in",
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
                addCriterion("SYS_RESOURCE_PROPERTY.REMARKS not in",
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
            addCriterion("SYS_RESOURCE_PROPERTY.REMARKS between", value1,
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
            addCriterion("SYS_RESOURCE_PROPERTY.REMARKS not between", value1,
                value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyCodeIsNull() {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_CODE is null");

            return this;
        } // end andResourcePropertyCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyCodeIsNotNull() {
            addCriterion(
                "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_CODE is not null");

            return this;
        } // end andResourcePropertyCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyCodeIsNotEmpty() {
            addCriterion(
                "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_CODE is not null AND SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_CODE <> ''");

            return this;
        } // end andResourcePropertyCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyCodeIsEmpty() {
            addCriterion(
                "(SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_CODE is null OR SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_CODE = '')");

            return this;
        } // end andResourcePropertyCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyCodeEqualTo(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_CODE =",
                value, "resourcePropertyCode");

            return this;
        } // end andResourcePropertyCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyCodeEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_CODE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyCodeNotEqualTo(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_CODE <>",
                value, "resourcePropertyCode");

            return this;
        } // end andResourcePropertyCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyCodeNotEqualToOrIsNull(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_CODE is null OR SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_CODE <>",
                value, "resourcePropertyCode");

            return this;
        } // end andResourcePropertyCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyCodeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_CODE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyCodeGreaterThan(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_CODE >",
                value, "resourcePropertyCode");

            return this;
        } // end andResourcePropertyCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyCodeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_CODE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyCodeGreaterThanOrEqualTo(
            String value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_CODE >=",
                value, "resourcePropertyCode");

            return this;
        } // end andResourcePropertyCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_CODE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyCodeLessThan(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_CODE <",
                value, "resourcePropertyCode");

            return this;
        } // end andResourcePropertyCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyCodeLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_CODE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyCodeLessThanOrEqualTo(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_CODE <=",
                value, "resourcePropertyCode");

            return this;
        } // end andResourcePropertyCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyCodeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_CODE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_CODE like",
                buffer.toString(), "resourcePropertyCode");

            return this;
        } // end andResourcePropertyCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_CODE not like",
                buffer.toString(), "resourcePropertyCode");

            return this;
        } // end andResourcePropertyCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyCodeIn(List values) {
            if (values.size() == 1) {
                return andResourcePropertyCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_CODE in",
                    values, "resourcePropertyCode");

                return this;
            } // end else
        } // end andResourcePropertyCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyCodeNotIn(List values) {
            if (values.size() == 1) {
                return andResourcePropertyCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_CODE not in",
                    values, "resourcePropertyCode");

                return this;
            } // end else
        } // end andResourcePropertyCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyCodeIn(Object[] values) {
            if (values.length == 1) {
                return andResourcePropertyCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_CODE in",
                    Arrays.asList(values), "resourcePropertyCode");

                return this;
            } // end else
        } // end andResourcePropertyCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andResourcePropertyCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_CODE not in",
                    Arrays.asList(values), "resourcePropertyCode");

                return this;
            } // end else
        } // end andResourcePropertyCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyCodeBetween(String value1,
            String value2) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_CODE between",
                value1, value2, "resourcePropertyCode");

            return this;
        } // end andResourcePropertyCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyCodeNotBetween(String value1,
            String value2) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_CODE not between",
                value1, value2, "resourcePropertyCode");

            return this;
        } // end andResourcePropertyCodeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyDefaultValueIsNull() {
            addCriterion(
                "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_DEFAULT_VALUE is null");

            return this;
        } // end andResourcePropertyDefaultValueIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyDefaultValueIsNotNull() {
            addCriterion(
                "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_DEFAULT_VALUE is not null");

            return this;
        } // end andResourcePropertyDefaultValueIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyDefaultValueIsNotEmpty() {
            addCriterion(
                "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_DEFAULT_VALUE is not null AND SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_DEFAULT_VALUE <> ''");

            return this;
        } // end andResourcePropertyDefaultValueIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyDefaultValueIsEmpty() {
            addCriterion(
                "(SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_DEFAULT_VALUE is null OR SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_DEFAULT_VALUE = '')");

            return this;
        } // end andResourcePropertyDefaultValueIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyDefaultValueEqualTo(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_DEFAULT_VALUE =",
                value, "resourcePropertyDefaultValue");

            return this;
        } // end andResourcePropertyDefaultValueEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyDefaultValueEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_DEFAULT_VALUE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyDefaultValueEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyDefaultValueNotEqualTo(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_DEFAULT_VALUE <>",
                value, "resourcePropertyDefaultValue");

            return this;
        } // end andResourcePropertyDefaultValueNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyDefaultValueNotEqualToOrIsNull(
            String value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_DEFAULT_VALUE is null OR SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_DEFAULT_VALUE <>",
                value, "resourcePropertyDefaultValue");

            return this;
        } // end andResourcePropertyDefaultValueNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyDefaultValueNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_DEFAULT_VALUE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyDefaultValueNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyDefaultValueGreaterThan(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_DEFAULT_VALUE >",
                value, "resourcePropertyDefaultValue");

            return this;
        } // end andResourcePropertyDefaultValueGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyDefaultValueGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_DEFAULT_VALUE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyDefaultValueGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyDefaultValueGreaterThanOrEqualTo(
            String value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_DEFAULT_VALUE >=",
                value, "resourcePropertyDefaultValue");

            return this;
        } // end andResourcePropertyDefaultValueGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyDefaultValueGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_DEFAULT_VALUE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyDefaultValueGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyDefaultValueLessThan(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_DEFAULT_VALUE <",
                value, "resourcePropertyDefaultValue");

            return this;
        } // end andResourcePropertyDefaultValueLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyDefaultValueLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_DEFAULT_VALUE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyDefaultValueLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyDefaultValueLessThanOrEqualTo(
            String value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_DEFAULT_VALUE <=",
                value, "resourcePropertyDefaultValue");

            return this;
        } // end andResourcePropertyDefaultValueLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyDefaultValueLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_DEFAULT_VALUE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyDefaultValueLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyDefaultValueLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_DEFAULT_VALUE like",
                buffer.toString(), "resourcePropertyDefaultValue");

            return this;
        } // end andResourcePropertyDefaultValueLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyDefaultValueNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_DEFAULT_VALUE not like",
                buffer.toString(), "resourcePropertyDefaultValue");

            return this;
        } // end andResourcePropertyDefaultValueNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyDefaultValueIn(List values) {
            if (values.size() == 1) {
                return andResourcePropertyDefaultValueEqualTo((String) values.get(
                        0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_DEFAULT_VALUE in",
                    values, "resourcePropertyDefaultValue");

                return this;
            } // end else
        } // end andResourcePropertyDefaultValueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyDefaultValueNotIn(List values) {
            if (values.size() == 1) {
                return andResourcePropertyDefaultValueNotEqualTo((String) values.get(
                        0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_DEFAULT_VALUE not in",
                    values, "resourcePropertyDefaultValue");

                return this;
            } // end else
        } // end andResourcePropertyDefaultValueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyDefaultValueIn(Object[] values) {
            if (values.length == 1) {
                return andResourcePropertyDefaultValueEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_DEFAULT_VALUE in",
                    Arrays.asList(values), "resourcePropertyDefaultValue");

                return this;
            } // end else
        } // end andResourcePropertyDefaultValueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyDefaultValueNotIn(Object[] values) {
            if (values.length == 1) {
                return andResourcePropertyDefaultValueNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_DEFAULT_VALUE not in",
                    Arrays.asList(values), "resourcePropertyDefaultValue");

                return this;
            } // end else
        } // end andResourcePropertyDefaultValueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyDefaultValueBetween(String value1,
            String value2) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_DEFAULT_VALUE between",
                value1, value2, "resourcePropertyDefaultValue");

            return this;
        } // end andResourcePropertyDefaultValueBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyDefaultValueNotBetween(
            String value1, String value2) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_DEFAULT_VALUE not between",
                value1, value2, "resourcePropertyDefaultValue");

            return this;
        } // end andResourcePropertyDefaultValueNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyNameIsNull() {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_NAME is null");

            return this;
        } // end andResourcePropertyNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyNameIsNotNull() {
            addCriterion(
                "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_NAME is not null");

            return this;
        } // end andResourcePropertyNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyNameIsNotEmpty() {
            addCriterion(
                "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_NAME is not null AND SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_NAME <> ''");

            return this;
        } // end andResourcePropertyNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyNameIsEmpty() {
            addCriterion(
                "(SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_NAME is null OR SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_NAME = '')");

            return this;
        } // end andResourcePropertyNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyNameEqualTo(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_NAME =",
                value, "resourcePropertyName");

            return this;
        } // end andResourcePropertyNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyNameEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyNameNotEqualTo(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_NAME <>",
                value, "resourcePropertyName");

            return this;
        } // end andResourcePropertyNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyNameNotEqualToOrIsNull(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_NAME is null OR SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_NAME <>",
                value, "resourcePropertyName");

            return this;
        } // end andResourcePropertyNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyNameGreaterThan(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_NAME >",
                value, "resourcePropertyName");

            return this;
        } // end andResourcePropertyNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyNameGreaterThanOrEqualTo(
            String value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_NAME >=",
                value, "resourcePropertyName");

            return this;
        } // end andResourcePropertyNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyNameLessThan(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_NAME <",
                value, "resourcePropertyName");

            return this;
        } // end andResourcePropertyNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyNameLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyNameLessThanOrEqualTo(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_NAME <=",
                value, "resourcePropertyName");

            return this;
        } // end andResourcePropertyNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_NAME like",
                buffer.toString(), "resourcePropertyName");

            return this;
        } // end andResourcePropertyNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_NAME not like",
                buffer.toString(), "resourcePropertyName");

            return this;
        } // end andResourcePropertyNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyNameIn(List values) {
            if (values.size() == 1) {
                return andResourcePropertyNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_NAME in",
                    values, "resourcePropertyName");

                return this;
            } // end else
        } // end andResourcePropertyNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyNameNotIn(List values) {
            if (values.size() == 1) {
                return andResourcePropertyNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_NAME not in",
                    values, "resourcePropertyName");

                return this;
            } // end else
        } // end andResourcePropertyNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyNameIn(Object[] values) {
            if (values.length == 1) {
                return andResourcePropertyNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_NAME in",
                    Arrays.asList(values), "resourcePropertyName");

                return this;
            } // end else
        } // end andResourcePropertyNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andResourcePropertyNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_NAME not in",
                    Arrays.asList(values), "resourcePropertyName");

                return this;
            } // end else
        } // end andResourcePropertyNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyNameBetween(String value1,
            String value2) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_NAME between",
                value1, value2, "resourcePropertyName");

            return this;
        } // end andResourcePropertyNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyNameNotBetween(String value1,
            String value2) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_NAME not between",
                value1, value2, "resourcePropertyName");

            return this;
        } // end andResourcePropertyNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyOrderIsNull() {
            addCriterion(
                "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_ORDER is null");

            return this;
        } // end andResourcePropertyOrderIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyOrderIsNotNull() {
            addCriterion(
                "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_ORDER is not null");

            return this;
        } // end andResourcePropertyOrderIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyOrderIsNotEmpty() {
            addCriterion(
                "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_ORDER is not null AND SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_ORDER <> ''");

            return this;
        } // end andResourcePropertyOrderIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyOrderIsEmpty() {
            addCriterion(
                "(SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_ORDER is null OR SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_ORDER = '')");

            return this;
        } // end andResourcePropertyOrderIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyOrderEqualTo(Integer value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_ORDER =",
                value, "resourcePropertyOrder");

            return this;
        } // end andResourcePropertyOrderEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyOrderEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_ORDER");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyOrderEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyOrderNotEqualTo(Integer value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_ORDER <>",
                value, "resourcePropertyOrder");

            return this;
        } // end andResourcePropertyOrderNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyOrderNotEqualToOrIsNull(
            Integer value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_ORDER is null OR SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_ORDER <>",
                value, "resourcePropertyOrder");

            return this;
        } // end andResourcePropertyOrderNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyOrderNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_ORDER");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyOrderNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyOrderGreaterThan(Integer value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_ORDER >",
                value, "resourcePropertyOrder");

            return this;
        } // end andResourcePropertyOrderGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyOrderGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_ORDER");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyOrderGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyOrderGreaterThanOrEqualTo(
            Integer value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_ORDER >=",
                value, "resourcePropertyOrder");

            return this;
        } // end andResourcePropertyOrderGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyOrderGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_ORDER");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyOrderGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyOrderLessThan(Integer value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_ORDER <",
                value, "resourcePropertyOrder");

            return this;
        } // end andResourcePropertyOrderLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyOrderLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_ORDER");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyOrderLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyOrderLessThanOrEqualTo(Integer value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_ORDER <=",
                value, "resourcePropertyOrder");

            return this;
        } // end andResourcePropertyOrderLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyOrderLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_ORDER");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyOrderLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyOrderIn(List values) {
            if (values.size() == 1) {
                return andResourcePropertyOrderEqualTo((Integer) values.get(0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_ORDER in",
                    values, "resourcePropertyOrder");

                return this;
            } // end else
        } // end andResourcePropertyOrderIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyOrderNotIn(List values) {
            if (values.size() == 1) {
                return andResourcePropertyOrderNotEqualTo((Integer) values.get(
                        0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_ORDER not in",
                    values, "resourcePropertyOrder");

                return this;
            } // end else
        } // end andResourcePropertyOrderNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyOrderIn(Object[] values) {
            if (values.length == 1) {
                return andResourcePropertyOrderEqualTo((Integer) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_ORDER in",
                    Arrays.asList(values), "resourcePropertyOrder");

                return this;
            } // end else
        } // end andResourcePropertyOrderIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyOrderNotIn(Object[] values) {
            if (values.length == 1) {
                return andResourcePropertyOrderNotEqualTo((Integer) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_ORDER not in",
                    Arrays.asList(values), "resourcePropertyOrder");

                return this;
            } // end else
        } // end andResourcePropertyOrderNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyOrderBetween(Integer value1,
            Integer value2) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_ORDER between",
                value1, value2, "resourcePropertyOrder");

            return this;
        } // end andResourcePropertyOrderBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyOrderNotBetween(Integer value1,
            Integer value2) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_ORDER not between",
                value1, value2, "resourcePropertyOrder");

            return this;
        } // end andResourcePropertyOrderNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyTypeIsNull() {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_TYPE is null");

            return this;
        } // end andResourcePropertyTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyTypeIsNotNull() {
            addCriterion(
                "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_TYPE is not null");

            return this;
        } // end andResourcePropertyTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyTypeIsNotEmpty() {
            addCriterion(
                "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_TYPE is not null AND SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_TYPE <> ''");

            return this;
        } // end andResourcePropertyTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyTypeIsEmpty() {
            addCriterion(
                "(SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_TYPE is null OR SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_TYPE = '')");

            return this;
        } // end andResourcePropertyTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyTypeEqualTo(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_TYPE =",
                value, "resourcePropertyType");

            return this;
        } // end andResourcePropertyTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyTypeEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyTypeNotEqualTo(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_TYPE <>",
                value, "resourcePropertyType");

            return this;
        } // end andResourcePropertyTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyTypeNotEqualToOrIsNull(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_TYPE is null OR SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_TYPE <>",
                value, "resourcePropertyType");

            return this;
        } // end andResourcePropertyTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyTypeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyTypeGreaterThan(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_TYPE >",
                value, "resourcePropertyType");

            return this;
        } // end andResourcePropertyTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyTypeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyTypeGreaterThanOrEqualTo(
            String value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_TYPE >=",
                value, "resourcePropertyType");

            return this;
        } // end andResourcePropertyTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyTypeLessThan(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_TYPE <",
                value, "resourcePropertyType");

            return this;
        } // end andResourcePropertyTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyTypeLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyTypeLessThanOrEqualTo(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_TYPE <=",
                value, "resourcePropertyType");

            return this;
        } // end andResourcePropertyTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_TYPE like",
                buffer.toString(), "resourcePropertyType");

            return this;
        } // end andResourcePropertyTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_TYPE not like",
                buffer.toString(), "resourcePropertyType");

            return this;
        } // end andResourcePropertyTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyTypeIn(List values) {
            if (values.size() == 1) {
                return andResourcePropertyTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_TYPE in",
                    values, "resourcePropertyType");

                return this;
            } // end else
        } // end andResourcePropertyTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyTypeNotIn(List values) {
            if (values.size() == 1) {
                return andResourcePropertyTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_TYPE not in",
                    values, "resourcePropertyType");

                return this;
            } // end else
        } // end andResourcePropertyTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyTypeIn(Object[] values) {
            if (values.length == 1) {
                return andResourcePropertyTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_TYPE in",
                    Arrays.asList(values), "resourcePropertyType");

                return this;
            } // end else
        } // end andResourcePropertyTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andResourcePropertyTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_TYPE not in",
                    Arrays.asList(values), "resourcePropertyType");

                return this;
            } // end else
        } // end andResourcePropertyTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyTypeBetween(String value1,
            String value2) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_TYPE between",
                value1, value2, "resourcePropertyType");

            return this;
        } // end andResourcePropertyTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyTypeNotBetween(String value1,
            String value2) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_TYPE not between",
                value1, value2, "resourcePropertyType");

            return this;
        } // end andResourcePropertyTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyValueIsNull() {
            addCriterion(
                "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_VALUE is null");

            return this;
        } // end andResourcePropertyValueIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyValueIsNotNull() {
            addCriterion(
                "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_VALUE is not null");

            return this;
        } // end andResourcePropertyValueIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyValueIsNotEmpty() {
            addCriterion(
                "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_VALUE is not null AND SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_VALUE <> ''");

            return this;
        } // end andResourcePropertyValueIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyValueIsEmpty() {
            addCriterion(
                "(SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_VALUE is null OR SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_VALUE = '')");

            return this;
        } // end andResourcePropertyValueIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyValueEqualTo(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_VALUE =",
                value, "resourcePropertyValue");

            return this;
        } // end andResourcePropertyValueEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyValueEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_VALUE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyValueEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyValueNotEqualTo(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_VALUE <>",
                value, "resourcePropertyValue");

            return this;
        } // end andResourcePropertyValueNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyValueNotEqualToOrIsNull(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_VALUE is null OR SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_VALUE <>",
                value, "resourcePropertyValue");

            return this;
        } // end andResourcePropertyValueNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyValueNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_VALUE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyValueNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyValueGreaterThan(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_VALUE >",
                value, "resourcePropertyValue");

            return this;
        } // end andResourcePropertyValueGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyValueGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_VALUE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyValueGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyValueGreaterThanOrEqualTo(
            String value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_VALUE >=",
                value, "resourcePropertyValue");

            return this;
        } // end andResourcePropertyValueGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyValueGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_VALUE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyValueGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyValueLessThan(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_VALUE <",
                value, "resourcePropertyValue");

            return this;
        } // end andResourcePropertyValueLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyValueLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_VALUE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyValueLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyValueLessThanOrEqualTo(String value) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_VALUE <=",
                value, "resourcePropertyValue");

            return this;
        } // end andResourcePropertyValueLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyValueLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_VALUE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourcePropertyValueLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyValueLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_VALUE like",
                buffer.toString(), "resourcePropertyValue");

            return this;
        } // end andResourcePropertyValueLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyValueNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_VALUE not like",
                buffer.toString(), "resourcePropertyValue");

            return this;
        } // end andResourcePropertyValueNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyValueIn(List values) {
            if (values.size() == 1) {
                return andResourcePropertyValueEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_VALUE in",
                    values, "resourcePropertyValue");

                return this;
            } // end else
        } // end andResourcePropertyValueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyValueNotIn(List values) {
            if (values.size() == 1) {
                return andResourcePropertyValueNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_VALUE not in",
                    values, "resourcePropertyValue");

                return this;
            } // end else
        } // end andResourcePropertyValueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyValueIn(Object[] values) {
            if (values.length == 1) {
                return andResourcePropertyValueEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_VALUE in",
                    Arrays.asList(values), "resourcePropertyValue");

                return this;
            } // end else
        } // end andResourcePropertyValueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyValueNotIn(Object[] values) {
            if (values.length == 1) {
                return andResourcePropertyValueNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_VALUE not in",
                    Arrays.asList(values), "resourcePropertyValue");

                return this;
            } // end else
        } // end andResourcePropertyValueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyValueBetween(String value1,
            String value2) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_VALUE between",
                value1, value2, "resourcePropertyValue");

            return this;
        } // end andResourcePropertyValueBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourcePropertyValueNotBetween(String value1,
            String value2) {
            addCriterion("SYS_RESOURCE_PROPERTY.RESOURCE_PROPERTY_VALUE not between",
                value1, value2, "resourcePropertyValue");

            return this;
        } // end andResourcePropertyValueNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("SYS_RESOURCE_PROPERTY.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("SYS_RESOURCE_PROPERTY.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "SYS_RESOURCE_PROPERTY.STATUS is not null AND SYS_RESOURCE_PROPERTY.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(SYS_RESOURCE_PROPERTY.STATUS is null OR SYS_RESOURCE_PROPERTY.STATUS = '')");

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
            addCriterion("SYS_RESOURCE_PROPERTY.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE_PROPERTY.STATUS");
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
            addCriterion("SYS_RESOURCE_PROPERTY.STATUS <>", value, "status");

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
            addCriterion("SYS_RESOURCE_PROPERTY.STATUS is null OR SYS_RESOURCE_PROPERTY.STATUS <>",
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
            StringBuffer str = new StringBuffer("SYS_RESOURCE_PROPERTY.STATUS");
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
            addCriterion("SYS_RESOURCE_PROPERTY.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE_PROPERTY.STATUS");
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
            addCriterion("SYS_RESOURCE_PROPERTY.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE_PROPERTY.STATUS");
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
            addCriterion("SYS_RESOURCE_PROPERTY.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE_PROPERTY.STATUS");
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
            addCriterion("SYS_RESOURCE_PROPERTY.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE_PROPERTY.STATUS");
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
            addCriterion("SYS_RESOURCE_PROPERTY.STATUS like",
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
            addCriterion("SYS_RESOURCE_PROPERTY.STATUS not like",
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
                addCriterion("SYS_RESOURCE_PROPERTY.STATUS in", values, "status");

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
                addCriterion("SYS_RESOURCE_PROPERTY.STATUS not in", values,
                    "status");

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
                addCriterion("SYS_RESOURCE_PROPERTY.STATUS in",
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
                addCriterion("SYS_RESOURCE_PROPERTY.STATUS not in",
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
            addCriterion("SYS_RESOURCE_PROPERTY.STATUS between", value1,
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
            addCriterion("SYS_RESOURCE_PROPERTY.STATUS not between", value1,
                value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdIsNull() {
            addCriterion("SYS_RESOURCE_PROPERTY.SYS_RESOURCE_ID is null");

            return this;
        } // end andSysResourceIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdIsNotNull() {
            addCriterion("SYS_RESOURCE_PROPERTY.SYS_RESOURCE_ID is not null");

            return this;
        } // end andSysResourceIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdIsNotEmpty() {
            addCriterion(
                "SYS_RESOURCE_PROPERTY.SYS_RESOURCE_ID is not null AND SYS_RESOURCE_PROPERTY.SYS_RESOURCE_ID <> ''");

            return this;
        } // end andSysResourceIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdIsEmpty() {
            addCriterion(
                "(SYS_RESOURCE_PROPERTY.SYS_RESOURCE_ID is null OR SYS_RESOURCE_PROPERTY.SYS_RESOURCE_ID = '')");

            return this;
        } // end andSysResourceIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdEqualTo(Long value) {
            addCriterion("SYS_RESOURCE_PROPERTY.SYS_RESOURCE_ID =", value,
                "sysResourceId");

            return this;
        } // end andSysResourceIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.SYS_RESOURCE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysResourceIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdNotEqualTo(Long value) {
            addCriterion("SYS_RESOURCE_PROPERTY.SYS_RESOURCE_ID <>", value,
                "sysResourceId");

            return this;
        } // end andSysResourceIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdNotEqualToOrIsNull(Long value) {
            addCriterion("SYS_RESOURCE_PROPERTY.SYS_RESOURCE_ID is null OR SYS_RESOURCE_PROPERTY.SYS_RESOURCE_ID <>",
                value, "sysResourceId");

            return this;
        } // end andSysResourceIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.SYS_RESOURCE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysResourceIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdGreaterThan(Long value) {
            addCriterion("SYS_RESOURCE_PROPERTY.SYS_RESOURCE_ID >", value,
                "sysResourceId");

            return this;
        } // end andSysResourceIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.SYS_RESOURCE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysResourceIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SYS_RESOURCE_PROPERTY.SYS_RESOURCE_ID >=", value,
                "sysResourceId");

            return this;
        } // end andSysResourceIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.SYS_RESOURCE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysResourceIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdLessThan(Long value) {
            addCriterion("SYS_RESOURCE_PROPERTY.SYS_RESOURCE_ID <", value,
                "sysResourceId");

            return this;
        } // end andSysResourceIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.SYS_RESOURCE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysResourceIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdLessThanOrEqualTo(Long value) {
            addCriterion("SYS_RESOURCE_PROPERTY.SYS_RESOURCE_ID <=", value,
                "sysResourceId");

            return this;
        } // end andSysResourceIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE_PROPERTY.SYS_RESOURCE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysResourceIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdIn(List values) {
            if (values.size() == 1) {
                return andSysResourceIdEqualTo((Long) values.get(0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY.SYS_RESOURCE_ID in",
                    values, "sysResourceId");

                return this;
            } // end else
        } // end andSysResourceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdNotIn(List values) {
            if (values.size() == 1) {
                return andSysResourceIdNotEqualTo((Long) values.get(0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY.SYS_RESOURCE_ID not in",
                    values, "sysResourceId");

                return this;
            } // end else
        } // end andSysResourceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdIn(Object[] values) {
            if (values.length == 1) {
                return andSysResourceIdEqualTo((Long) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY.SYS_RESOURCE_ID in",
                    Arrays.asList(values), "sysResourceId");

                return this;
            } // end else
        } // end andSysResourceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andSysResourceIdNotEqualTo((Long) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE_PROPERTY.SYS_RESOURCE_ID not in",
                    Arrays.asList(values), "sysResourceId");

                return this;
            } // end else
        } // end andSysResourceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdBetween(Long value1, Long value2) {
            addCriterion("SYS_RESOURCE_PROPERTY.SYS_RESOURCE_ID between",
                value1, value2, "sysResourceId");

            return this;
        } // end andSysResourceIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdNotBetween(Long value1, Long value2) {
            addCriterion("SYS_RESOURCE_PROPERTY.SYS_RESOURCE_ID not between",
                value1, value2, "sysResourceId");

            return this;
        } // end andSysResourceIdNotBetween()
    } // end Criteria
} // end SysResourcePropertyDAOQueryBean
