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
 * SysResourceType query bean 2011-09-22 10:11:18
 *
 * @author Auto Gen
 */
public class SysResourceTypeDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new SysResourceTypeDAOQueryBean object.
     */
    public SysResourceTypeDAOQueryBean() {
        super();
    } // end SysResourceTypeDAOQueryBean()

    /**
     * Creates a new SysResourceTypeDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public SysResourceTypeDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end SysResourceTypeDAOQueryBean()

    /**
     * Creates a new SysResourceTypeDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public SysResourceTypeDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end SysResourceTypeDAOQueryBean()

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
            addSelectProperty(ISysResourceTypeDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(ISysResourceTypeDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addConfigCodeSelectProperty() {
        addConfigCodeSelectProperty("configCode");
    } // end addConfigCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addConfigCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysResourceTypeDAO.ConfigCode, aAlias);
        } // end if
        else {
            addSelectProperty(ISysResourceTypeDAO.ConfigCode, "configCode");
        } // end else
    } // end addConfigCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addConfigNameSelectProperty() {
        addConfigNameSelectProperty("configName");
    } // end addConfigNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addConfigNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysResourceTypeDAO.ConfigName, aAlias);
        } // end if
        else {
            addSelectProperty(ISysResourceTypeDAO.ConfigName, "configName");
        } // end else
    } // end addConfigNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addDomainIdSelectProperty() {
        addDomainIdSelectProperty("domainId");
    } // end addDomainIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addDomainIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysResourceTypeDAO.DomainId, aAlias);
        } // end if
        else {
            addSelectProperty(ISysResourceTypeDAO.DomainId, "domainId");
        } // end else
    } // end addDomainIdSelectProperty()

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
            addSelectProperty(ISysResourceTypeDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(ISysResourceTypeDAO.Remarks, "remarks");
        } // end else
    } // end addRemarksSelectProperty()

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
            addSelectProperty(ISysResourceTypeDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(ISysResourceTypeDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

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
            addSelectProperty(ISysResourceTypeDAO.ResourceTypeId, aAlias);
        } // end if
        else {
            addSelectProperty(ISysResourceTypeDAO.ResourceTypeId,
                "resourceTypeId");
        } // end else
    } // end addResourceTypeIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addSortSelectProperty() {
        addSortSelectProperty("sort");
    } // end addSortSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addSortSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysResourceTypeDAO.Sort, aAlias);
        } // end if
        else {
            addSelectProperty(ISysResourceTypeDAO.Sort, "sort");
        } // end else
    } // end addSortSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addConfigCodeSelectProperty();

        addConfigNameSelectProperty();

        addDomainIdSelectProperty();

        addRemarksSelectProperty();

        addStatusSelectProperty();

        addResourceTypeIdSelectProperty();

        addSortSelectProperty();
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
            addCriterion("SYS_RESOURCE_TYPE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("SYS_RESOURCE_TYPE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "SYS_RESOURCE_TYPE.ID is not null AND SYS_RESOURCE_TYPE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(SYS_RESOURCE_TYPE.ID is null OR SYS_RESOURCE_TYPE.ID = '')");

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
            addCriterion("SYS_RESOURCE_TYPE.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.ID");
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
            addCriterion("SYS_RESOURCE_TYPE.ID <>", value, "id");

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
            addCriterion("SYS_RESOURCE_TYPE.ID is null OR SYS_RESOURCE_TYPE.ID <>",
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
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.ID");
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
            addCriterion("SYS_RESOURCE_TYPE.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.ID");
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
            addCriterion("SYS_RESOURCE_TYPE.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.ID");
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
            addCriterion("SYS_RESOURCE_TYPE.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.ID");
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
            addCriterion("SYS_RESOURCE_TYPE.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.ID");
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
                addCriterion("SYS_RESOURCE_TYPE.ID in", values, "id");

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
                addCriterion("SYS_RESOURCE_TYPE.ID not in", values, "id");

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
                addCriterion("SYS_RESOURCE_TYPE.ID in", values, "id");

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
                addCriterion("SYS_RESOURCE_TYPE.ID not in", values, "id");

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
                addCriterion("SYS_RESOURCE_TYPE.ID in", Arrays.asList(values),
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
                addCriterion("SYS_RESOURCE_TYPE.ID not in",
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
            addCriterion("SYS_RESOURCE_TYPE.ID between", value1, value2, "id");

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
            addCriterion("SYS_RESOURCE_TYPE.ID between", value1, value2, "id");

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
            addCriterion("SYS_RESOURCE_TYPE.ID not between", value1, value2,
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
            addCriterion("SYS_RESOURCE_TYPE.ID not between", value1, value2,
                "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigCodeIsNull() {
            addCriterion("SYS_RESOURCE_TYPE.CONFIG_CODE is null");

            return this;
        } // end andConfigCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigCodeIsNotNull() {
            addCriterion("SYS_RESOURCE_TYPE.CONFIG_CODE is not null");

            return this;
        } // end andConfigCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigCodeIsNotEmpty() {
            addCriterion(
                "SYS_RESOURCE_TYPE.CONFIG_CODE is not null AND SYS_RESOURCE_TYPE.CONFIG_CODE <> ''");

            return this;
        } // end andConfigCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigCodeIsEmpty() {
            addCriterion(
                "(SYS_RESOURCE_TYPE.CONFIG_CODE is null OR SYS_RESOURCE_TYPE.CONFIG_CODE = '')");

            return this;
        } // end andConfigCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigCodeEqualTo(String value) {
            addCriterion("SYS_RESOURCE_TYPE.CONFIG_CODE =", value, "configCode");

            return this;
        } // end andConfigCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigCodeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.CONFIG_CODE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigCodeNotEqualTo(String value) {
            addCriterion("SYS_RESOURCE_TYPE.CONFIG_CODE <>", value, "configCode");

            return this;
        } // end andConfigCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigCodeNotEqualToOrIsNull(String value) {
            addCriterion("SYS_RESOURCE_TYPE.CONFIG_CODE is null OR SYS_RESOURCE_TYPE.CONFIG_CODE <>",
                value, "configCode");

            return this;
        } // end andConfigCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigCodeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.CONFIG_CODE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigCodeGreaterThan(String value) {
            addCriterion("SYS_RESOURCE_TYPE.CONFIG_CODE >", value, "configCode");

            return this;
        } // end andConfigCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigCodeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.CONFIG_CODE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_RESOURCE_TYPE.CONFIG_CODE >=", value, "configCode");

            return this;
        } // end andConfigCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.CONFIG_CODE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigCodeLessThan(String value) {
            addCriterion("SYS_RESOURCE_TYPE.CONFIG_CODE <", value, "configCode");

            return this;
        } // end andConfigCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigCodeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.CONFIG_CODE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigCodeLessThanOrEqualTo(String value) {
            addCriterion("SYS_RESOURCE_TYPE.CONFIG_CODE <=", value, "configCode");

            return this;
        } // end andConfigCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigCodeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.CONFIG_CODE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_RESOURCE_TYPE.CONFIG_CODE like",
                buffer.toString(), "configCode");

            return this;
        } // end andConfigCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_RESOURCE_TYPE.CONFIG_CODE not like",
                buffer.toString(), "configCode");

            return this;
        } // end andConfigCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigCodeIn(List values) {
            if (values.size() == 1) {
                return andConfigCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE_TYPE.CONFIG_CODE in", values,
                    "configCode");

                return this;
            } // end else
        } // end andConfigCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigCodeNotIn(List values) {
            if (values.size() == 1) {
                return andConfigCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE_TYPE.CONFIG_CODE not in", values,
                    "configCode");

                return this;
            } // end else
        } // end andConfigCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigCodeIn(Object[] values) {
            if (values.length == 1) {
                return andConfigCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE_TYPE.CONFIG_CODE in",
                    Arrays.asList(values), "configCode");

                return this;
            } // end else
        } // end andConfigCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andConfigCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE_TYPE.CONFIG_CODE not in",
                    Arrays.asList(values), "configCode");

                return this;
            } // end else
        } // end andConfigCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigCodeBetween(String value1, String value2) {
            addCriterion("SYS_RESOURCE_TYPE.CONFIG_CODE between", value1,
                value2, "configCode");

            return this;
        } // end andConfigCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigCodeNotBetween(String value1, String value2) {
            addCriterion("SYS_RESOURCE_TYPE.CONFIG_CODE not between", value1,
                value2, "configCode");

            return this;
        } // end andConfigCodeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameIsNull() {
            addCriterion("SYS_RESOURCE_TYPE.CONFIG_NAME is null");

            return this;
        } // end andConfigNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameIsNotNull() {
            addCriterion("SYS_RESOURCE_TYPE.CONFIG_NAME is not null");

            return this;
        } // end andConfigNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameIsNotEmpty() {
            addCriterion(
                "SYS_RESOURCE_TYPE.CONFIG_NAME is not null AND SYS_RESOURCE_TYPE.CONFIG_NAME <> ''");

            return this;
        } // end andConfigNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameIsEmpty() {
            addCriterion(
                "(SYS_RESOURCE_TYPE.CONFIG_NAME is null OR SYS_RESOURCE_TYPE.CONFIG_NAME = '')");

            return this;
        } // end andConfigNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameEqualTo(String value) {
            addCriterion("SYS_RESOURCE_TYPE.CONFIG_NAME =", value, "configName");

            return this;
        } // end andConfigNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.CONFIG_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameNotEqualTo(String value) {
            addCriterion("SYS_RESOURCE_TYPE.CONFIG_NAME <>", value, "configName");

            return this;
        } // end andConfigNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameNotEqualToOrIsNull(String value) {
            addCriterion("SYS_RESOURCE_TYPE.CONFIG_NAME is null OR SYS_RESOURCE_TYPE.CONFIG_NAME <>",
                value, "configName");

            return this;
        } // end andConfigNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.CONFIG_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameGreaterThan(String value) {
            addCriterion("SYS_RESOURCE_TYPE.CONFIG_NAME >", value, "configName");

            return this;
        } // end andConfigNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.CONFIG_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_RESOURCE_TYPE.CONFIG_NAME >=", value, "configName");

            return this;
        } // end andConfigNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.CONFIG_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameLessThan(String value) {
            addCriterion("SYS_RESOURCE_TYPE.CONFIG_NAME <", value, "configName");

            return this;
        } // end andConfigNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.CONFIG_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameLessThanOrEqualTo(String value) {
            addCriterion("SYS_RESOURCE_TYPE.CONFIG_NAME <=", value, "configName");

            return this;
        } // end andConfigNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.CONFIG_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andConfigNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_RESOURCE_TYPE.CONFIG_NAME like",
                buffer.toString(), "configName");

            return this;
        } // end andConfigNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_RESOURCE_TYPE.CONFIG_NAME not like",
                buffer.toString(), "configName");

            return this;
        } // end andConfigNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameIn(List values) {
            if (values.size() == 1) {
                return andConfigNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE_TYPE.CONFIG_NAME in", values,
                    "configName");

                return this;
            } // end else
        } // end andConfigNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameNotIn(List values) {
            if (values.size() == 1) {
                return andConfigNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE_TYPE.CONFIG_NAME not in", values,
                    "configName");

                return this;
            } // end else
        } // end andConfigNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameIn(Object[] values) {
            if (values.length == 1) {
                return andConfigNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE_TYPE.CONFIG_NAME in",
                    Arrays.asList(values), "configName");

                return this;
            } // end else
        } // end andConfigNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andConfigNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE_TYPE.CONFIG_NAME not in",
                    Arrays.asList(values), "configName");

                return this;
            } // end else
        } // end andConfigNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameBetween(String value1, String value2) {
            addCriterion("SYS_RESOURCE_TYPE.CONFIG_NAME between", value1,
                value2, "configName");

            return this;
        } // end andConfigNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andConfigNameNotBetween(String value1, String value2) {
            addCriterion("SYS_RESOURCE_TYPE.CONFIG_NAME not between", value1,
                value2, "configName");

            return this;
        } // end andConfigNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdIsNull() {
            addCriterion("SYS_RESOURCE_TYPE.DOMAIN_ID is null");

            return this;
        } // end andDomainIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdIsNotNull() {
            addCriterion("SYS_RESOURCE_TYPE.DOMAIN_ID is not null");

            return this;
        } // end andDomainIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdIsNotEmpty() {
            addCriterion(
                "SYS_RESOURCE_TYPE.DOMAIN_ID is not null AND SYS_RESOURCE_TYPE.DOMAIN_ID <> ''");

            return this;
        } // end andDomainIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdIsEmpty() {
            addCriterion(
                "(SYS_RESOURCE_TYPE.DOMAIN_ID is null OR SYS_RESOURCE_TYPE.DOMAIN_ID = '')");

            return this;
        } // end andDomainIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdEqualTo(Long value) {
            addCriterion("SYS_RESOURCE_TYPE.DOMAIN_ID =", value, "domainId");

            return this;
        } // end andDomainIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.DOMAIN_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdNotEqualTo(Long value) {
            addCriterion("SYS_RESOURCE_TYPE.DOMAIN_ID <>", value, "domainId");

            return this;
        } // end andDomainIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdNotEqualToOrIsNull(Long value) {
            addCriterion("SYS_RESOURCE_TYPE.DOMAIN_ID is null OR SYS_RESOURCE_TYPE.DOMAIN_ID <>",
                value, "domainId");

            return this;
        } // end andDomainIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.DOMAIN_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdGreaterThan(Long value) {
            addCriterion("SYS_RESOURCE_TYPE.DOMAIN_ID >", value, "domainId");

            return this;
        } // end andDomainIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.DOMAIN_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SYS_RESOURCE_TYPE.DOMAIN_ID >=", value, "domainId");

            return this;
        } // end andDomainIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.DOMAIN_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdLessThan(Long value) {
            addCriterion("SYS_RESOURCE_TYPE.DOMAIN_ID <", value, "domainId");

            return this;
        } // end andDomainIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.DOMAIN_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdLessThanOrEqualTo(Long value) {
            addCriterion("SYS_RESOURCE_TYPE.DOMAIN_ID <=", value, "domainId");

            return this;
        } // end andDomainIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.DOMAIN_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdIn(List values) {
            if (values.size() == 1) {
                return andDomainIdEqualTo((Long) values.get(0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE_TYPE.DOMAIN_ID in", values,
                    "domainId");

                return this;
            } // end else
        } // end andDomainIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdNotIn(List values) {
            if (values.size() == 1) {
                return andDomainIdNotEqualTo((Long) values.get(0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE_TYPE.DOMAIN_ID not in", values,
                    "domainId");

                return this;
            } // end else
        } // end andDomainIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdIn(Object[] values) {
            if (values.length == 1) {
                return andDomainIdEqualTo((Long) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE_TYPE.DOMAIN_ID in",
                    Arrays.asList(values), "domainId");

                return this;
            } // end else
        } // end andDomainIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andDomainIdNotEqualTo((Long) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE_TYPE.DOMAIN_ID not in",
                    Arrays.asList(values), "domainId");

                return this;
            } // end else
        } // end andDomainIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdBetween(Long value1, Long value2) {
            addCriterion("SYS_RESOURCE_TYPE.DOMAIN_ID between", value1, value2,
                "domainId");

            return this;
        } // end andDomainIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdNotBetween(Long value1, Long value2) {
            addCriterion("SYS_RESOURCE_TYPE.DOMAIN_ID not between", value1,
                value2, "domainId");

            return this;
        } // end andDomainIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("SYS_RESOURCE_TYPE.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("SYS_RESOURCE_TYPE.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "SYS_RESOURCE_TYPE.REMARKS is not null AND SYS_RESOURCE_TYPE.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(SYS_RESOURCE_TYPE.REMARKS is null OR SYS_RESOURCE_TYPE.REMARKS = '')");

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
            addCriterion("SYS_RESOURCE_TYPE.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.REMARKS");
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
            addCriterion("SYS_RESOURCE_TYPE.REMARKS <>", value, "remarks");

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
            addCriterion("SYS_RESOURCE_TYPE.REMARKS is null OR SYS_RESOURCE_TYPE.REMARKS <>",
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
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.REMARKS");
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
            addCriterion("SYS_RESOURCE_TYPE.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.REMARKS");
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
            addCriterion("SYS_RESOURCE_TYPE.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.REMARKS");
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
            addCriterion("SYS_RESOURCE_TYPE.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.REMARKS");
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
            addCriterion("SYS_RESOURCE_TYPE.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.REMARKS");
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
            addCriterion("SYS_RESOURCE_TYPE.REMARKS like", buffer.toString(),
                "remarks");

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
            addCriterion("SYS_RESOURCE_TYPE.REMARKS not like",
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
                addCriterion("SYS_RESOURCE_TYPE.REMARKS in", values, "remarks");

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
                addCriterion("SYS_RESOURCE_TYPE.REMARKS not in", values,
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
                addCriterion("SYS_RESOURCE_TYPE.REMARKS in",
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
                addCriterion("SYS_RESOURCE_TYPE.REMARKS not in",
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
            addCriterion("SYS_RESOURCE_TYPE.REMARKS between", value1, value2,
                "remarks");

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
            addCriterion("SYS_RESOURCE_TYPE.REMARKS not between", value1,
                value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("SYS_RESOURCE_TYPE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("SYS_RESOURCE_TYPE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "SYS_RESOURCE_TYPE.STATUS is not null AND SYS_RESOURCE_TYPE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(SYS_RESOURCE_TYPE.STATUS is null OR SYS_RESOURCE_TYPE.STATUS = '')");

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
            addCriterion("SYS_RESOURCE_TYPE.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.STATUS");
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
            addCriterion("SYS_RESOURCE_TYPE.STATUS <>", value, "status");

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
            addCriterion("SYS_RESOURCE_TYPE.STATUS is null OR SYS_RESOURCE_TYPE.STATUS <>",
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
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.STATUS");
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
            addCriterion("SYS_RESOURCE_TYPE.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.STATUS");
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
            addCriterion("SYS_RESOURCE_TYPE.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.STATUS");
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
            addCriterion("SYS_RESOURCE_TYPE.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.STATUS");
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
            addCriterion("SYS_RESOURCE_TYPE.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.STATUS");
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
            addCriterion("SYS_RESOURCE_TYPE.STATUS like", buffer.toString(),
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
            addCriterion("SYS_RESOURCE_TYPE.STATUS not like",
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
                addCriterion("SYS_RESOURCE_TYPE.STATUS in", values, "status");

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
                addCriterion("SYS_RESOURCE_TYPE.STATUS not in", values, "status");

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
                addCriterion("SYS_RESOURCE_TYPE.STATUS in",
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
                addCriterion("SYS_RESOURCE_TYPE.STATUS not in",
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
            addCriterion("SYS_RESOURCE_TYPE.STATUS between", value1, value2,
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
            addCriterion("SYS_RESOURCE_TYPE.STATUS not between", value1,
                value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdIsNull() {
            addCriterion("SYS_RESOURCE_TYPE.RESOURCE_TYPE_ID is null");

            return this;
        } // end andResourceTypeIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdIsNotNull() {
            addCriterion("SYS_RESOURCE_TYPE.RESOURCE_TYPE_ID is not null");

            return this;
        } // end andResourceTypeIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdIsNotEmpty() {
            addCriterion(
                "SYS_RESOURCE_TYPE.RESOURCE_TYPE_ID is not null AND SYS_RESOURCE_TYPE.RESOURCE_TYPE_ID <> ''");

            return this;
        } // end andResourceTypeIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdIsEmpty() {
            addCriterion(
                "(SYS_RESOURCE_TYPE.RESOURCE_TYPE_ID is null OR SYS_RESOURCE_TYPE.RESOURCE_TYPE_ID = '')");

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
            addCriterion("SYS_RESOURCE_TYPE.RESOURCE_TYPE_ID =", value,
                "resourceTypeId");

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
                    "SYS_RESOURCE_TYPE.RESOURCE_TYPE_ID");
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
            addCriterion("SYS_RESOURCE_TYPE.RESOURCE_TYPE_ID <>", value,
                "resourceTypeId");

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
            addCriterion("SYS_RESOURCE_TYPE.RESOURCE_TYPE_ID is null OR SYS_RESOURCE_TYPE.RESOURCE_TYPE_ID <>",
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
                    "SYS_RESOURCE_TYPE.RESOURCE_TYPE_ID");
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
            addCriterion("SYS_RESOURCE_TYPE.RESOURCE_TYPE_ID >", value,
                "resourceTypeId");

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
                    "SYS_RESOURCE_TYPE.RESOURCE_TYPE_ID");
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
            addCriterion("SYS_RESOURCE_TYPE.RESOURCE_TYPE_ID >=", value,
                "resourceTypeId");

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
                    "SYS_RESOURCE_TYPE.RESOURCE_TYPE_ID");
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
            addCriterion("SYS_RESOURCE_TYPE.RESOURCE_TYPE_ID <", value,
                "resourceTypeId");

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
                    "SYS_RESOURCE_TYPE.RESOURCE_TYPE_ID");
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
            addCriterion("SYS_RESOURCE_TYPE.RESOURCE_TYPE_ID <=", value,
                "resourceTypeId");

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
                    "SYS_RESOURCE_TYPE.RESOURCE_TYPE_ID");
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
                addCriterion("SYS_RESOURCE_TYPE.RESOURCE_TYPE_ID in", values,
                    "resourceTypeId");

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
                addCriterion("SYS_RESOURCE_TYPE.RESOURCE_TYPE_ID not in",
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
                addCriterion("SYS_RESOURCE_TYPE.RESOURCE_TYPE_ID in", values,
                    "resourceTypeId");

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
                addCriterion("SYS_RESOURCE_TYPE.RESOURCE_TYPE_ID not in",
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
                addCriterion("SYS_RESOURCE_TYPE.RESOURCE_TYPE_ID in",
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
                addCriterion("SYS_RESOURCE_TYPE.RESOURCE_TYPE_ID not in",
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
            addCriterion("SYS_RESOURCE_TYPE.RESOURCE_TYPE_ID between", value1,
                value2, "resourceTypeId");

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
            addCriterion("SYS_RESOURCE_TYPE.RESOURCE_TYPE_ID between", value1,
                value2, "resourceTypeId");

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
            addCriterion("SYS_RESOURCE_TYPE.RESOURCE_TYPE_ID not between",
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
            addCriterion("SYS_RESOURCE_TYPE.RESOURCE_TYPE_ID not between",
                value1, value2, "resourceTypeId");

            return this;
        } // end andResourceTypeIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIsNull() {
            addCriterion("SYS_RESOURCE_TYPE.SORT_INDEX is null");

            return this;
        } // end andSortIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIsNotNull() {
            addCriterion("SYS_RESOURCE_TYPE.SORT_INDEX is not null");

            return this;
        } // end andSortIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIsNotEmpty() {
            addCriterion(
                "SYS_RESOURCE_TYPE.SORT_INDEX is not null AND SYS_RESOURCE_TYPE.SORT_INDEX <> ''");

            return this;
        } // end andSortIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIsEmpty() {
            addCriterion(
                "(SYS_RESOURCE_TYPE.SORT_INDEX is null OR SYS_RESOURCE_TYPE.SORT_INDEX = '')");

            return this;
        } // end andSortIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortEqualTo(int value) {
            return andSortEqualTo(Integer.valueOf(value));
        } // end andSortEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortEqualTo(java.lang.Integer value) {
            addCriterion("SYS_RESOURCE_TYPE.SORT_INDEX =", value, "sort");

            return this;
        } // end andSortEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.SORT_INDEX");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSortEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortNotEqualTo(int value) {
            return andSortNotEqualTo(Integer.valueOf(value));
        } // end andSortNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortNotEqualTo(java.lang.Integer value) {
            addCriterion("SYS_RESOURCE_TYPE.SORT_INDEX <>", value, "sort");

            return this;
        } // end andSortNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortNotEqualToOrIsNull(int value) {
            return andSortNotEqualToOrIsNull(Integer.valueOf(value));
        } // end andSortNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortNotEqualToOrIsNull(java.lang.Integer value) {
            addCriterion("SYS_RESOURCE_TYPE.SORT_INDEX is null OR SYS_RESOURCE_TYPE.SORT_INDEX <>",
                value, "sort");

            return this;
        } // end andSortNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.SORT_INDEX");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSortNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortGreaterThan(int value) {
            return andSortGreaterThan(Integer.valueOf(value));
        } // end andSortGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortGreaterThan(java.lang.Integer value) {
            addCriterion("SYS_RESOURCE_TYPE.SORT_INDEX >", value, "sort");

            return this;
        } // end andSortGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.SORT_INDEX");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSortGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortGreaterThanOrEqualTo(int value) {
            return andSortGreaterThanOrEqualTo(Integer.valueOf(value));
        } // end andSortGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortGreaterThanOrEqualTo(java.lang.Integer value) {
            addCriterion("SYS_RESOURCE_TYPE.SORT_INDEX >=", value, "sort");

            return this;
        } // end andSortGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.SORT_INDEX");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSortGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortLessThan(int value) {
            return andSortLessThan(Integer.valueOf(value));
        } // end andSortLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortLessThan(java.lang.Integer value) {
            addCriterion("SYS_RESOURCE_TYPE.SORT_INDEX <", value, "sort");

            return this;
        } // end andSortLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.SORT_INDEX");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSortLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortLessThanOrEqualTo(int value) {
            return andSortLessThanOrEqualTo(Integer.valueOf(value));
        } // end andSortLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("SYS_RESOURCE_TYPE.SORT_INDEX <=", value, "sort");

            return this;
        } // end andSortLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortLessThanOrEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_RESOURCE_TYPE.SORT_INDEX");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSortLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIn(int[] values) {
            if (values.length == 1) {
                return andSortEqualTo((int) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE_TYPE.SORT_INDEX in", values, "sort");

                return this;
            } // end else
        } // end andSortIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortNotIn(int[] values) {
            if (values.length == 1) {
                return andSortNotEqualTo((int) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE_TYPE.SORT_INDEX not in", values,
                    "sort");

                return this;
            } // end else
        } // end andSortNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIn(List values) {
            if (values.size() == 1) {
                return andSortEqualTo((java.lang.Integer) values.get(0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE_TYPE.SORT_INDEX in", values, "sort");

                return this;
            } // end else
        } // end andSortIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortNotIn(List values) {
            if (values.size() == 1) {
                return andSortNotEqualTo((java.lang.Integer) values.get(0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE_TYPE.SORT_INDEX not in", values,
                    "sort");

                return this;
            } // end else
        } // end andSortNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIn(Object[] values) {
            if (values.length == 1) {
                return andSortEqualTo((java.lang.Integer) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE_TYPE.SORT_INDEX in",
                    Arrays.asList(values), "sort");

                return this;
            } // end else
        } // end andSortIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortNotIn(Object[] values) {
            if (values.length == 1) {
                return andSortNotEqualTo((java.lang.Integer) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE_TYPE.SORT_INDEX not in",
                    Arrays.asList(values), "sort");

                return this;
            } // end else
        } // end andSortNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortBetween(int value1, int value2) {
            addCriterion("SYS_RESOURCE_TYPE.SORT_INDEX between", value1,
                value2, "sort");

            return this;
        } // end andSortBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortBetween(java.lang.Integer value1,
            java.lang.Integer value2) {
            addCriterion("SYS_RESOURCE_TYPE.SORT_INDEX between", value1,
                value2, "sort");

            return this;
        } // end andSortBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortNotBetween(int value1, int value2) {
            addCriterion("SYS_RESOURCE_TYPE.SORT_INDEX not between", value1,
                value2, "sort");

            return this;
        } // end andSortNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortNotBetween(java.lang.Integer value1,
            java.lang.Integer value2) {
            addCriterion("SYS_RESOURCE_TYPE.SORT_INDEX not between", value1,
                value2, "sort");

            return this;
        } // end andSortNotBetween()
    } // end Criteria
} // end SysResourceTypeDAOQueryBean
