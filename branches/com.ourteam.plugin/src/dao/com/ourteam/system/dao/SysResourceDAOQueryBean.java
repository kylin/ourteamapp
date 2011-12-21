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
 * SysResource query bean 2011-09-22 10:11:15
 *
 * @author Auto Gen
 */
public class SysResourceDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new SysResourceDAOQueryBean object.
     */
    public SysResourceDAOQueryBean() {
        super();
    } // end SysResourceDAOQueryBean()

    /**
     * Creates a new SysResourceDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public SysResourceDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end SysResourceDAOQueryBean()

    /**
     * Creates a new SysResourceDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public SysResourceDAOQueryBean(BaseQueryBean aQueryBean, Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end SysResourceDAOQueryBean()

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
            addSelectProperty(ISysResourceDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(ISysResourceDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

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
            addSelectProperty(ISysResourceDAO.DomainId, aAlias);
        } // end if
        else {
            addSelectProperty(ISysResourceDAO.DomainId, "domainId");
        } // end else
    } // end addDomainIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addParentResourceIdSelectProperty() {
        addParentResourceIdSelectProperty("parentResourceId");
    } // end addParentResourceIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addParentResourceIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysResourceDAO.ParentResourceId, aAlias);
        } // end if
        else {
            addSelectProperty(ISysResourceDAO.ParentResourceId,
                "parentResourceId");
        } // end else
    } // end addParentResourceIdSelectProperty()

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
            addSelectProperty(ISysResourceDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(ISysResourceDAO.Remarks, "remarks");
        } // end else
    } // end addRemarksSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addResourceCodeSelectProperty() {
        addResourceCodeSelectProperty("resourceCode");
    } // end addResourceCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addResourceCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysResourceDAO.ResourceCode, aAlias);
        } // end if
        else {
            addSelectProperty(ISysResourceDAO.ResourceCode, "resourceCode");
        } // end else
    } // end addResourceCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addResourceNameSelectProperty() {
        addResourceNameSelectProperty("resourceName");
    } // end addResourceNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addResourceNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysResourceDAO.ResourceName, aAlias);
        } // end if
        else {
            addSelectProperty(ISysResourceDAO.ResourceName, "resourceName");
        } // end else
    } // end addResourceNameSelectProperty()

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
            addSelectProperty(ISysResourceDAO.ResourceTypeId, aAlias);
        } // end if
        else {
            addSelectProperty(ISysResourceDAO.ResourceTypeId, "resourceTypeId");
        } // end else
    } // end addResourceTypeIdSelectProperty()

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
            addSelectProperty(ISysResourceDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(ISysResourceDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

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
            addSelectProperty(ISysResourceDAO.Sort, aAlias);
        } // end if
        else {
            addSelectProperty(ISysResourceDAO.Sort, "sort");
        } // end else
    } // end addSortSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addResourceTitleKeySelectProperty() {
        addResourceTitleKeySelectProperty("resourceTitleKey");
    } // end addResourceTitleKeySelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addResourceTitleKeySelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysResourceDAO.ResourceTitleKey, aAlias);
        } // end if
        else {
            addSelectProperty(ISysResourceDAO.ResourceTitleKey,
                "resourceTitleKey");
        } // end else
    } // end addResourceTitleKeySelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addDomainTitleKeySelectProperty() {
        addDomainTitleKeySelectProperty("domainTitleKey");
    } // end addDomainTitleKeySelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addDomainTitleKeySelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysResourceDAO.DomainTitleKey, aAlias);
        } // end if
        else {
            addSelectProperty(ISysResourceDAO.DomainTitleKey, "domainTitleKey");
        } // end else
    } // end addDomainTitleKeySelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addDomainIdSelectProperty();

        addParentResourceIdSelectProperty();

        addRemarksSelectProperty();

        addResourceCodeSelectProperty();

        addResourceNameSelectProperty();

        addResourceTypeIdSelectProperty();

        addStatusSelectProperty();

        addSortSelectProperty();

        addResourceTitleKeySelectProperty();

        addDomainTitleKeySelectProperty();
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
            addCriterion("SYS_RESOURCE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("SYS_RESOURCE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "SYS_RESOURCE.ID is not null AND SYS_RESOURCE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion("(SYS_RESOURCE.ID is null OR SYS_RESOURCE.ID = '')");

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
            addCriterion("SYS_RESOURCE.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE.ID");
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
            addCriterion("SYS_RESOURCE.ID <>", value, "id");

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
            addCriterion("SYS_RESOURCE.ID is null OR SYS_RESOURCE.ID <>",
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
            StringBuffer str = new StringBuffer("SYS_RESOURCE.ID");
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
            addCriterion("SYS_RESOURCE.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE.ID");
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
            addCriterion("SYS_RESOURCE.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE.ID");
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
            addCriterion("SYS_RESOURCE.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE.ID");
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
            addCriterion("SYS_RESOURCE.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE.ID");
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
                addCriterion("SYS_RESOURCE.ID in", values, "id");

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
                addCriterion("SYS_RESOURCE.ID not in", values, "id");

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
                addCriterion("SYS_RESOURCE.ID in", values, "id");

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
                addCriterion("SYS_RESOURCE.ID not in", values, "id");

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
                addCriterion("SYS_RESOURCE.ID in", Arrays.asList(values), "id");

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
                addCriterion("SYS_RESOURCE.ID not in", Arrays.asList(values),
                    "id");

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
            addCriterion("SYS_RESOURCE.ID between", value1, value2, "id");

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
            addCriterion("SYS_RESOURCE.ID between", value1, value2, "id");

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
            addCriterion("SYS_RESOURCE.ID not between", value1, value2, "id");

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
            addCriterion("SYS_RESOURCE.ID not between", value1, value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdIsNull() {
            addCriterion("SYS_RESOURCE.DOMAIN_ID is null");

            return this;
        } // end andDomainIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdIsNotNull() {
            addCriterion("SYS_RESOURCE.DOMAIN_ID is not null");

            return this;
        } // end andDomainIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdIsNotEmpty() {
            addCriterion(
                "SYS_RESOURCE.DOMAIN_ID is not null AND SYS_RESOURCE.DOMAIN_ID <> ''");

            return this;
        } // end andDomainIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdIsEmpty() {
            addCriterion(
                "(SYS_RESOURCE.DOMAIN_ID is null OR SYS_RESOURCE.DOMAIN_ID = '')");

            return this;
        } // end andDomainIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdEqualTo(long value) {
            return andDomainIdEqualTo(Long.valueOf(value));
        } // end andDomainIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdEqualTo(java.lang.Long value) {
            addCriterion("SYS_RESOURCE.DOMAIN_ID =", value, "domainId");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE.DOMAIN_ID");
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
        public Criteria andDomainIdNotEqualTo(long value) {
            return andDomainIdNotEqualTo(Long.valueOf(value));
        } // end andDomainIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdNotEqualTo(java.lang.Long value) {
            addCriterion("SYS_RESOURCE.DOMAIN_ID <>", value, "domainId");

            return this;
        } // end andDomainIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdNotEqualToOrIsNull(long value) {
            return andDomainIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andDomainIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("SYS_RESOURCE.DOMAIN_ID is null OR SYS_RESOURCE.DOMAIN_ID <>",
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
            StringBuffer str = new StringBuffer("SYS_RESOURCE.DOMAIN_ID");
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
        public Criteria andDomainIdGreaterThan(long value) {
            return andDomainIdGreaterThan(Long.valueOf(value));
        } // end andDomainIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdGreaterThan(java.lang.Long value) {
            addCriterion("SYS_RESOURCE.DOMAIN_ID >", value, "domainId");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE.DOMAIN_ID");
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
        public Criteria andDomainIdGreaterThanOrEqualTo(long value) {
            return andDomainIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andDomainIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("SYS_RESOURCE.DOMAIN_ID >=", value, "domainId");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE.DOMAIN_ID");
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
        public Criteria andDomainIdLessThan(long value) {
            return andDomainIdLessThan(Long.valueOf(value));
        } // end andDomainIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdLessThan(java.lang.Long value) {
            addCriterion("SYS_RESOURCE.DOMAIN_ID <", value, "domainId");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE.DOMAIN_ID");
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
        public Criteria andDomainIdLessThanOrEqualTo(long value) {
            return andDomainIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andDomainIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("SYS_RESOURCE.DOMAIN_ID <=", value, "domainId");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE.DOMAIN_ID");
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
        public Criteria andDomainIdIn(long[] values) {
            if (values.length == 1) {
                return andDomainIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE.DOMAIN_ID in", values, "domainId");

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
        public Criteria andDomainIdNotIn(long[] values) {
            if (values.length == 1) {
                return andDomainIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE.DOMAIN_ID not in", values, "domainId");

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
        public Criteria andDomainIdIn(List values) {
            if (values.size() == 1) {
                return andDomainIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE.DOMAIN_ID in", values, "domainId");

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
                return andDomainIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE.DOMAIN_ID not in", values, "domainId");

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
                return andDomainIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE.DOMAIN_ID in",
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
                return andDomainIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE.DOMAIN_ID not in",
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
        public Criteria andDomainIdBetween(long value1, long value2) {
            addCriterion("SYS_RESOURCE.DOMAIN_ID between", value1, value2,
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
        public Criteria andDomainIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("SYS_RESOURCE.DOMAIN_ID between", value1, value2,
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
        public Criteria andDomainIdNotBetween(long value1, long value2) {
            addCriterion("SYS_RESOURCE.DOMAIN_ID not between", value1, value2,
                "domainId");

            return this;
        } // end andDomainIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("SYS_RESOURCE.DOMAIN_ID not between", value1, value2,
                "domainId");

            return this;
        } // end andDomainIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentResourceIdIsNull() {
            addCriterion("SYS_RESOURCE.PARENT_RESOURCE_ID is null");

            return this;
        } // end andParentResourceIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentResourceIdIsNotNull() {
            addCriterion("SYS_RESOURCE.PARENT_RESOURCE_ID is not null");

            return this;
        } // end andParentResourceIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentResourceIdIsNotEmpty() {
            addCriterion(
                "SYS_RESOURCE.PARENT_RESOURCE_ID is not null AND SYS_RESOURCE.PARENT_RESOURCE_ID <> ''");

            return this;
        } // end andParentResourceIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentResourceIdIsEmpty() {
            addCriterion(
                "(SYS_RESOURCE.PARENT_RESOURCE_ID is null OR SYS_RESOURCE.PARENT_RESOURCE_ID = '')");

            return this;
        } // end andParentResourceIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentResourceIdEqualTo(long value) {
            return andParentResourceIdEqualTo(Long.valueOf(value));
        } // end andParentResourceIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentResourceIdEqualTo(java.lang.Long value) {
            addCriterion("SYS_RESOURCE.PARENT_RESOURCE_ID =", value,
                "parentResourceId");

            return this;
        } // end andParentResourceIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentResourceIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE.PARENT_RESOURCE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentResourceIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentResourceIdNotEqualTo(long value) {
            return andParentResourceIdNotEqualTo(Long.valueOf(value));
        } // end andParentResourceIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentResourceIdNotEqualTo(java.lang.Long value) {
            addCriterion("SYS_RESOURCE.PARENT_RESOURCE_ID <>", value,
                "parentResourceId");

            return this;
        } // end andParentResourceIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentResourceIdNotEqualToOrIsNull(long value) {
            return andParentResourceIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andParentResourceIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentResourceIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("SYS_RESOURCE.PARENT_RESOURCE_ID is null OR SYS_RESOURCE.PARENT_RESOURCE_ID <>",
                value, "parentResourceId");

            return this;
        } // end andParentResourceIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentResourceIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE.PARENT_RESOURCE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentResourceIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentResourceIdGreaterThan(long value) {
            return andParentResourceIdGreaterThan(Long.valueOf(value));
        } // end andParentResourceIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentResourceIdGreaterThan(java.lang.Long value) {
            addCriterion("SYS_RESOURCE.PARENT_RESOURCE_ID >", value,
                "parentResourceId");

            return this;
        } // end andParentResourceIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentResourceIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE.PARENT_RESOURCE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentResourceIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentResourceIdGreaterThanOrEqualTo(long value) {
            return andParentResourceIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andParentResourceIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentResourceIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("SYS_RESOURCE.PARENT_RESOURCE_ID >=", value,
                "parentResourceId");

            return this;
        } // end andParentResourceIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentResourceIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE.PARENT_RESOURCE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentResourceIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentResourceIdLessThan(long value) {
            return andParentResourceIdLessThan(Long.valueOf(value));
        } // end andParentResourceIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentResourceIdLessThan(java.lang.Long value) {
            addCriterion("SYS_RESOURCE.PARENT_RESOURCE_ID <", value,
                "parentResourceId");

            return this;
        } // end andParentResourceIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentResourceIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE.PARENT_RESOURCE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentResourceIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentResourceIdLessThanOrEqualTo(long value) {
            return andParentResourceIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andParentResourceIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentResourceIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("SYS_RESOURCE.PARENT_RESOURCE_ID <=", value,
                "parentResourceId");

            return this;
        } // end andParentResourceIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentResourceIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE.PARENT_RESOURCE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentResourceIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentResourceIdIn(long[] values) {
            if (values.length == 1) {
                return andParentResourceIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE.PARENT_RESOURCE_ID in", values,
                    "parentResourceId");

                return this;
            } // end else
        } // end andParentResourceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentResourceIdNotIn(long[] values) {
            if (values.length == 1) {
                return andParentResourceIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE.PARENT_RESOURCE_ID not in", values,
                    "parentResourceId");

                return this;
            } // end else
        } // end andParentResourceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentResourceIdIn(List values) {
            if (values.size() == 1) {
                return andParentResourceIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE.PARENT_RESOURCE_ID in", values,
                    "parentResourceId");

                return this;
            } // end else
        } // end andParentResourceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentResourceIdNotIn(List values) {
            if (values.size() == 1) {
                return andParentResourceIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE.PARENT_RESOURCE_ID not in", values,
                    "parentResourceId");

                return this;
            } // end else
        } // end andParentResourceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentResourceIdIn(Object[] values) {
            if (values.length == 1) {
                return andParentResourceIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE.PARENT_RESOURCE_ID in",
                    Arrays.asList(values), "parentResourceId");

                return this;
            } // end else
        } // end andParentResourceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentResourceIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andParentResourceIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE.PARENT_RESOURCE_ID not in",
                    Arrays.asList(values), "parentResourceId");

                return this;
            } // end else
        } // end andParentResourceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentResourceIdBetween(long value1, long value2) {
            addCriterion("SYS_RESOURCE.PARENT_RESOURCE_ID between", value1,
                value2, "parentResourceId");

            return this;
        } // end andParentResourceIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentResourceIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("SYS_RESOURCE.PARENT_RESOURCE_ID between", value1,
                value2, "parentResourceId");

            return this;
        } // end andParentResourceIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentResourceIdNotBetween(long value1, long value2) {
            addCriterion("SYS_RESOURCE.PARENT_RESOURCE_ID not between", value1,
                value2, "parentResourceId");

            return this;
        } // end andParentResourceIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentResourceIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("SYS_RESOURCE.PARENT_RESOURCE_ID not between", value1,
                value2, "parentResourceId");

            return this;
        } // end andParentResourceIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("SYS_RESOURCE.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("SYS_RESOURCE.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "SYS_RESOURCE.REMARKS is not null AND SYS_RESOURCE.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(SYS_RESOURCE.REMARKS is null OR SYS_RESOURCE.REMARKS = '')");

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
            addCriterion("SYS_RESOURCE.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE.REMARKS");
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
            addCriterion("SYS_RESOURCE.REMARKS <>", value, "remarks");

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
            addCriterion("SYS_RESOURCE.REMARKS is null OR SYS_RESOURCE.REMARKS <>",
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
            StringBuffer str = new StringBuffer("SYS_RESOURCE.REMARKS");
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
            addCriterion("SYS_RESOURCE.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE.REMARKS");
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
            addCriterion("SYS_RESOURCE.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE.REMARKS");
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
            addCriterion("SYS_RESOURCE.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE.REMARKS");
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
            addCriterion("SYS_RESOURCE.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE.REMARKS");
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
            addCriterion("SYS_RESOURCE.REMARKS like", buffer.toString(),
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
            addCriterion("SYS_RESOURCE.REMARKS not like", buffer.toString(),
                "remarks");

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
                addCriterion("SYS_RESOURCE.REMARKS in", values, "remarks");

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
                addCriterion("SYS_RESOURCE.REMARKS not in", values, "remarks");

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
                addCriterion("SYS_RESOURCE.REMARKS in", Arrays.asList(values),
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
        public Criteria andRemarksNotIn(Object[] values) {
            if (values.length == 1) {
                return andRemarksNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE.REMARKS not in",
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
            addCriterion("SYS_RESOURCE.REMARKS between", value1, value2,
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
            addCriterion("SYS_RESOURCE.REMARKS not between", value1, value2,
                "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceCodeIsNull() {
            addCriterion("SYS_RESOURCE.RESOURCE_CODE is null");

            return this;
        } // end andResourceCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceCodeIsNotNull() {
            addCriterion("SYS_RESOURCE.RESOURCE_CODE is not null");

            return this;
        } // end andResourceCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceCodeIsNotEmpty() {
            addCriterion(
                "SYS_RESOURCE.RESOURCE_CODE is not null AND SYS_RESOURCE.RESOURCE_CODE <> ''");

            return this;
        } // end andResourceCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceCodeIsEmpty() {
            addCriterion(
                "(SYS_RESOURCE.RESOURCE_CODE is null OR SYS_RESOURCE.RESOURCE_CODE = '')");

            return this;
        } // end andResourceCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceCodeEqualTo(String value) {
            addCriterion("SYS_RESOURCE.RESOURCE_CODE =", value, "resourceCode");

            return this;
        } // end andResourceCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceCodeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_RESOURCE.RESOURCE_CODE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceCodeNotEqualTo(String value) {
            addCriterion("SYS_RESOURCE.RESOURCE_CODE <>", value, "resourceCode");

            return this;
        } // end andResourceCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceCodeNotEqualToOrIsNull(String value) {
            addCriterion("SYS_RESOURCE.RESOURCE_CODE is null OR SYS_RESOURCE.RESOURCE_CODE <>",
                value, "resourceCode");

            return this;
        } // end andResourceCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceCodeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_RESOURCE.RESOURCE_CODE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceCodeGreaterThan(String value) {
            addCriterion("SYS_RESOURCE.RESOURCE_CODE >", value, "resourceCode");

            return this;
        } // end andResourceCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceCodeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_RESOURCE.RESOURCE_CODE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_RESOURCE.RESOURCE_CODE >=", value, "resourceCode");

            return this;
        } // end andResourceCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_RESOURCE.RESOURCE_CODE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceCodeLessThan(String value) {
            addCriterion("SYS_RESOURCE.RESOURCE_CODE <", value, "resourceCode");

            return this;
        } // end andResourceCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceCodeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_RESOURCE.RESOURCE_CODE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceCodeLessThanOrEqualTo(String value) {
            addCriterion("SYS_RESOURCE.RESOURCE_CODE <=", value, "resourceCode");

            return this;
        } // end andResourceCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceCodeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_RESOURCE.RESOURCE_CODE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_RESOURCE.RESOURCE_CODE like", buffer.toString(),
                "resourceCode");

            return this;
        } // end andResourceCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_RESOURCE.RESOURCE_CODE not like",
                buffer.toString(), "resourceCode");

            return this;
        } // end andResourceCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceCodeIn(List values) {
            if (values.size() == 1) {
                return andResourceCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE.RESOURCE_CODE in", values,
                    "resourceCode");

                return this;
            } // end else
        } // end andResourceCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceCodeNotIn(List values) {
            if (values.size() == 1) {
                return andResourceCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE.RESOURCE_CODE not in", values,
                    "resourceCode");

                return this;
            } // end else
        } // end andResourceCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceCodeIn(Object[] values) {
            if (values.length == 1) {
                return andResourceCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE.RESOURCE_CODE in",
                    Arrays.asList(values), "resourceCode");

                return this;
            } // end else
        } // end andResourceCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andResourceCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE.RESOURCE_CODE not in",
                    Arrays.asList(values), "resourceCode");

                return this;
            } // end else
        } // end andResourceCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceCodeBetween(String value1, String value2) {
            addCriterion("SYS_RESOURCE.RESOURCE_CODE between", value1, value2,
                "resourceCode");

            return this;
        } // end andResourceCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceCodeNotBetween(String value1, String value2) {
            addCriterion("SYS_RESOURCE.RESOURCE_CODE not between", value1,
                value2, "resourceCode");

            return this;
        } // end andResourceCodeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceNameIsNull() {
            addCriterion("SYS_RESOURCE.RESOURCE_NAME is null");

            return this;
        } // end andResourceNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceNameIsNotNull() {
            addCriterion("SYS_RESOURCE.RESOURCE_NAME is not null");

            return this;
        } // end andResourceNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceNameIsNotEmpty() {
            addCriterion(
                "SYS_RESOURCE.RESOURCE_NAME is not null AND SYS_RESOURCE.RESOURCE_NAME <> ''");

            return this;
        } // end andResourceNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceNameIsEmpty() {
            addCriterion(
                "(SYS_RESOURCE.RESOURCE_NAME is null OR SYS_RESOURCE.RESOURCE_NAME = '')");

            return this;
        } // end andResourceNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceNameEqualTo(String value) {
            addCriterion("SYS_RESOURCE.RESOURCE_NAME =", value, "resourceName");

            return this;
        } // end andResourceNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_RESOURCE.RESOURCE_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceNameNotEqualTo(String value) {
            addCriterion("SYS_RESOURCE.RESOURCE_NAME <>", value, "resourceName");

            return this;
        } // end andResourceNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceNameNotEqualToOrIsNull(String value) {
            addCriterion("SYS_RESOURCE.RESOURCE_NAME is null OR SYS_RESOURCE.RESOURCE_NAME <>",
                value, "resourceName");

            return this;
        } // end andResourceNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_RESOURCE.RESOURCE_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceNameGreaterThan(String value) {
            addCriterion("SYS_RESOURCE.RESOURCE_NAME >", value, "resourceName");

            return this;
        } // end andResourceNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_RESOURCE.RESOURCE_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceNameGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_RESOURCE.RESOURCE_NAME >=", value, "resourceName");

            return this;
        } // end andResourceNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_RESOURCE.RESOURCE_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceNameLessThan(String value) {
            addCriterion("SYS_RESOURCE.RESOURCE_NAME <", value, "resourceName");

            return this;
        } // end andResourceNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_RESOURCE.RESOURCE_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceNameLessThanOrEqualTo(String value) {
            addCriterion("SYS_RESOURCE.RESOURCE_NAME <=", value, "resourceName");

            return this;
        } // end andResourceNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_RESOURCE.RESOURCE_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_RESOURCE.RESOURCE_NAME like", buffer.toString(),
                "resourceName");

            return this;
        } // end andResourceNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_RESOURCE.RESOURCE_NAME not like",
                buffer.toString(), "resourceName");

            return this;
        } // end andResourceNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceNameIn(List values) {
            if (values.size() == 1) {
                return andResourceNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE.RESOURCE_NAME in", values,
                    "resourceName");

                return this;
            } // end else
        } // end andResourceNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceNameNotIn(List values) {
            if (values.size() == 1) {
                return andResourceNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE.RESOURCE_NAME not in", values,
                    "resourceName");

                return this;
            } // end else
        } // end andResourceNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceNameIn(Object[] values) {
            if (values.length == 1) {
                return andResourceNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE.RESOURCE_NAME in",
                    Arrays.asList(values), "resourceName");

                return this;
            } // end else
        } // end andResourceNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andResourceNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE.RESOURCE_NAME not in",
                    Arrays.asList(values), "resourceName");

                return this;
            } // end else
        } // end andResourceNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceNameBetween(String value1, String value2) {
            addCriterion("SYS_RESOURCE.RESOURCE_NAME between", value1, value2,
                "resourceName");

            return this;
        } // end andResourceNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceNameNotBetween(String value1, String value2) {
            addCriterion("SYS_RESOURCE.RESOURCE_NAME not between", value1,
                value2, "resourceName");

            return this;
        } // end andResourceNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdIsNull() {
            addCriterion("SYS_RESOURCE.RESOURCE_TYPE_ID is null");

            return this;
        } // end andResourceTypeIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdIsNotNull() {
            addCriterion("SYS_RESOURCE.RESOURCE_TYPE_ID is not null");

            return this;
        } // end andResourceTypeIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdIsNotEmpty() {
            addCriterion(
                "SYS_RESOURCE.RESOURCE_TYPE_ID is not null AND SYS_RESOURCE.RESOURCE_TYPE_ID <> ''");

            return this;
        } // end andResourceTypeIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdIsEmpty() {
            addCriterion(
                "(SYS_RESOURCE.RESOURCE_TYPE_ID is null OR SYS_RESOURCE.RESOURCE_TYPE_ID = '')");

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
            addCriterion("SYS_RESOURCE.RESOURCE_TYPE_ID =", value,
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
            StringBuffer str = new StringBuffer("SYS_RESOURCE.RESOURCE_TYPE_ID");
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
            addCriterion("SYS_RESOURCE.RESOURCE_TYPE_ID <>", value,
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
            addCriterion("SYS_RESOURCE.RESOURCE_TYPE_ID is null OR SYS_RESOURCE.RESOURCE_TYPE_ID <>",
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
            StringBuffer str = new StringBuffer("SYS_RESOURCE.RESOURCE_TYPE_ID");
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
            addCriterion("SYS_RESOURCE.RESOURCE_TYPE_ID >", value,
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
            StringBuffer str = new StringBuffer("SYS_RESOURCE.RESOURCE_TYPE_ID");
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
            addCriterion("SYS_RESOURCE.RESOURCE_TYPE_ID >=", value,
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
            StringBuffer str = new StringBuffer("SYS_RESOURCE.RESOURCE_TYPE_ID");
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
            addCriterion("SYS_RESOURCE.RESOURCE_TYPE_ID <", value,
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
            StringBuffer str = new StringBuffer("SYS_RESOURCE.RESOURCE_TYPE_ID");
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
            addCriterion("SYS_RESOURCE.RESOURCE_TYPE_ID <=", value,
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
            StringBuffer str = new StringBuffer("SYS_RESOURCE.RESOURCE_TYPE_ID");
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
                addCriterion("SYS_RESOURCE.RESOURCE_TYPE_ID in", values,
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
                addCriterion("SYS_RESOURCE.RESOURCE_TYPE_ID not in", values,
                    "resourceTypeId");

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
                addCriterion("SYS_RESOURCE.RESOURCE_TYPE_ID in", values,
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
                addCriterion("SYS_RESOURCE.RESOURCE_TYPE_ID not in", values,
                    "resourceTypeId");

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
                addCriterion("SYS_RESOURCE.RESOURCE_TYPE_ID in",
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
                addCriterion("SYS_RESOURCE.RESOURCE_TYPE_ID not in",
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
            addCriterion("SYS_RESOURCE.RESOURCE_TYPE_ID between", value1,
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
            addCriterion("SYS_RESOURCE.RESOURCE_TYPE_ID between", value1,
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
            addCriterion("SYS_RESOURCE.RESOURCE_TYPE_ID not between", value1,
                value2, "resourceTypeId");

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
            addCriterion("SYS_RESOURCE.RESOURCE_TYPE_ID not between", value1,
                value2, "resourceTypeId");

            return this;
        } // end andResourceTypeIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("SYS_RESOURCE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("SYS_RESOURCE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "SYS_RESOURCE.STATUS is not null AND SYS_RESOURCE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(SYS_RESOURCE.STATUS is null OR SYS_RESOURCE.STATUS = '')");

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
            addCriterion("SYS_RESOURCE.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE.STATUS");
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
            addCriterion("SYS_RESOURCE.STATUS <>", value, "status");

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
            addCriterion("SYS_RESOURCE.STATUS is null OR SYS_RESOURCE.STATUS <>",
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
            StringBuffer str = new StringBuffer("SYS_RESOURCE.STATUS");
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
            addCriterion("SYS_RESOURCE.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE.STATUS");
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
            addCriterion("SYS_RESOURCE.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE.STATUS");
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
            addCriterion("SYS_RESOURCE.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE.STATUS");
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
            addCriterion("SYS_RESOURCE.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE.STATUS");
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
            addCriterion("SYS_RESOURCE.STATUS like", buffer.toString(), "status");

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
            addCriterion("SYS_RESOURCE.STATUS not like", buffer.toString(),
                "status");

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
                addCriterion("SYS_RESOURCE.STATUS in", values, "status");

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
                addCriterion("SYS_RESOURCE.STATUS not in", values, "status");

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
                addCriterion("SYS_RESOURCE.STATUS in", Arrays.asList(values),
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
        public Criteria andStatusNotIn(Object[] values) {
            if (values.length == 1) {
                return andStatusNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE.STATUS not in",
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
            addCriterion("SYS_RESOURCE.STATUS between", value1, value2, "status");

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
            addCriterion("SYS_RESOURCE.STATUS not between", value1, value2,
                "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIsNull() {
            addCriterion("SYS_RESOURCE.SORT_INDEX is null");

            return this;
        } // end andSortIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIsNotNull() {
            addCriterion("SYS_RESOURCE.SORT_INDEX is not null");

            return this;
        } // end andSortIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIsNotEmpty() {
            addCriterion(
                "SYS_RESOURCE.SORT_INDEX is not null AND SYS_RESOURCE.SORT_INDEX <> ''");

            return this;
        } // end andSortIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIsEmpty() {
            addCriterion(
                "(SYS_RESOURCE.SORT_INDEX is null OR SYS_RESOURCE.SORT_INDEX = '')");

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
            addCriterion("SYS_RESOURCE.SORT_INDEX =", value, "sort");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE.SORT_INDEX");
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
            addCriterion("SYS_RESOURCE.SORT_INDEX <>", value, "sort");

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
            addCriterion("SYS_RESOURCE.SORT_INDEX is null OR SYS_RESOURCE.SORT_INDEX <>",
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
            StringBuffer str = new StringBuffer("SYS_RESOURCE.SORT_INDEX");
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
            addCriterion("SYS_RESOURCE.SORT_INDEX >", value, "sort");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE.SORT_INDEX");
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
            addCriterion("SYS_RESOURCE.SORT_INDEX >=", value, "sort");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE.SORT_INDEX");
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
            addCriterion("SYS_RESOURCE.SORT_INDEX <", value, "sort");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE.SORT_INDEX");
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
            addCriterion("SYS_RESOURCE.SORT_INDEX <=", value, "sort");

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
            StringBuffer str = new StringBuffer("SYS_RESOURCE.SORT_INDEX");
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
                addCriterion("SYS_RESOURCE.SORT_INDEX in", values, "sort");

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
                addCriterion("SYS_RESOURCE.SORT_INDEX not in", values, "sort");

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
                addCriterion("SYS_RESOURCE.SORT_INDEX in", values, "sort");

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
                addCriterion("SYS_RESOURCE.SORT_INDEX not in", values, "sort");

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
                addCriterion("SYS_RESOURCE.SORT_INDEX in",
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
                addCriterion("SYS_RESOURCE.SORT_INDEX not in",
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
            addCriterion("SYS_RESOURCE.SORT_INDEX between", value1, value2,
                "sort");

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
            addCriterion("SYS_RESOURCE.SORT_INDEX between", value1, value2,
                "sort");

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
            addCriterion("SYS_RESOURCE.SORT_INDEX not between", value1, value2,
                "sort");

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
            addCriterion("SYS_RESOURCE.SORT_INDEX not between", value1, value2,
                "sort");

            return this;
        } // end andSortNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTitleKeyIsNull() {
            addCriterion("SYS_RESOURCE.RESOURCE_TITLE_KEY is null");

            return this;
        } // end andResourceTitleKeyIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTitleKeyIsNotNull() {
            addCriterion("SYS_RESOURCE.RESOURCE_TITLE_KEY is not null");

            return this;
        } // end andResourceTitleKeyIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTitleKeyIsNotEmpty() {
            addCriterion(
                "SYS_RESOURCE.RESOURCE_TITLE_KEY is not null AND SYS_RESOURCE.RESOURCE_TITLE_KEY <> ''");

            return this;
        } // end andResourceTitleKeyIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTitleKeyIsEmpty() {
            addCriterion(
                "(SYS_RESOURCE.RESOURCE_TITLE_KEY is null OR SYS_RESOURCE.RESOURCE_TITLE_KEY = '')");

            return this;
        } // end andResourceTitleKeyIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTitleKeyEqualTo(String value) {
            addCriterion("SYS_RESOURCE.RESOURCE_TITLE_KEY =", value,
                "resourceTitleKey");

            return this;
        } // end andResourceTitleKeyEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTitleKeyEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE.RESOURCE_TITLE_KEY");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceTitleKeyEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTitleKeyNotEqualTo(String value) {
            addCriterion("SYS_RESOURCE.RESOURCE_TITLE_KEY <>", value,
                "resourceTitleKey");

            return this;
        } // end andResourceTitleKeyNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTitleKeyNotEqualToOrIsNull(String value) {
            addCriterion("SYS_RESOURCE.RESOURCE_TITLE_KEY is null OR SYS_RESOURCE.RESOURCE_TITLE_KEY <>",
                value, "resourceTitleKey");

            return this;
        } // end andResourceTitleKeyNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTitleKeyNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE.RESOURCE_TITLE_KEY");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceTitleKeyNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTitleKeyGreaterThan(String value) {
            addCriterion("SYS_RESOURCE.RESOURCE_TITLE_KEY >", value,
                "resourceTitleKey");

            return this;
        } // end andResourceTitleKeyGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTitleKeyGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE.RESOURCE_TITLE_KEY");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceTitleKeyGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTitleKeyGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_RESOURCE.RESOURCE_TITLE_KEY >=", value,
                "resourceTitleKey");

            return this;
        } // end andResourceTitleKeyGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTitleKeyGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE.RESOURCE_TITLE_KEY");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceTitleKeyGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTitleKeyLessThan(String value) {
            addCriterion("SYS_RESOURCE.RESOURCE_TITLE_KEY <", value,
                "resourceTitleKey");

            return this;
        } // end andResourceTitleKeyLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTitleKeyLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE.RESOURCE_TITLE_KEY");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceTitleKeyLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTitleKeyLessThanOrEqualTo(String value) {
            addCriterion("SYS_RESOURCE.RESOURCE_TITLE_KEY <=", value,
                "resourceTitleKey");

            return this;
        } // end andResourceTitleKeyLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTitleKeyLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_RESOURCE.RESOURCE_TITLE_KEY");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceTitleKeyLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTitleKeyLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_RESOURCE.RESOURCE_TITLE_KEY like",
                buffer.toString(), "resourceTitleKey");

            return this;
        } // end andResourceTitleKeyLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTitleKeyNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_RESOURCE.RESOURCE_TITLE_KEY not like",
                buffer.toString(), "resourceTitleKey");

            return this;
        } // end andResourceTitleKeyNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTitleKeyIn(List values) {
            if (values.size() == 1) {
                return andResourceTitleKeyEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE.RESOURCE_TITLE_KEY in", values,
                    "resourceTitleKey");

                return this;
            } // end else
        } // end andResourceTitleKeyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTitleKeyNotIn(List values) {
            if (values.size() == 1) {
                return andResourceTitleKeyNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_RESOURCE.RESOURCE_TITLE_KEY not in", values,
                    "resourceTitleKey");

                return this;
            } // end else
        } // end andResourceTitleKeyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTitleKeyIn(Object[] values) {
            if (values.length == 1) {
                return andResourceTitleKeyEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE.RESOURCE_TITLE_KEY in",
                    Arrays.asList(values), "resourceTitleKey");

                return this;
            } // end else
        } // end andResourceTitleKeyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTitleKeyNotIn(Object[] values) {
            if (values.length == 1) {
                return andResourceTitleKeyNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_RESOURCE.RESOURCE_TITLE_KEY not in",
                    Arrays.asList(values), "resourceTitleKey");

                return this;
            } // end else
        } // end andResourceTitleKeyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTitleKeyBetween(String value1, String value2) {
            addCriterion("SYS_RESOURCE.RESOURCE_TITLE_KEY between", value1,
                value2, "resourceTitleKey");

            return this;
        } // end andResourceTitleKeyBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTitleKeyNotBetween(String value1,
            String value2) {
            addCriterion("SYS_RESOURCE.RESOURCE_TITLE_KEY not between", value1,
                value2, "resourceTitleKey");

            return this;
        } // end andResourceTitleKeyNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitleKeyIsNull() {
            addCriterion("resourceDomain.DOMAIN_TITEL_KEY is null");

            return this;
        } // end andDomainTitleKeyIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitleKeyIsNotNull() {
            addCriterion("resourceDomain.DOMAIN_TITEL_KEY is not null");

            return this;
        } // end andDomainTitleKeyIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitleKeyIsNotEmpty() {
            addCriterion(
                "resourceDomain.DOMAIN_TITEL_KEY is not null AND resourceDomain.DOMAIN_TITEL_KEY <> ''");

            return this;
        } // end andDomainTitleKeyIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitleKeyIsEmpty() {
            addCriterion(
                "(resourceDomain.DOMAIN_TITEL_KEY is null OR resourceDomain.DOMAIN_TITEL_KEY = '')");

            return this;
        } // end andDomainTitleKeyIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitleKeyEqualTo(String value) {
            addCriterion("resourceDomain.DOMAIN_TITEL_KEY =", value,
                "domainTitleKey");

            return this;
        } // end andDomainTitleKeyEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitleKeyEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "resourceDomain.DOMAIN_TITEL_KEY");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainTitleKeyEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitleKeyNotEqualTo(String value) {
            addCriterion("resourceDomain.DOMAIN_TITEL_KEY <>", value,
                "domainTitleKey");

            return this;
        } // end andDomainTitleKeyNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitleKeyNotEqualToOrIsNull(String value) {
            addCriterion("resourceDomain.DOMAIN_TITEL_KEY is null OR resourceDomain.DOMAIN_TITEL_KEY <>",
                value, "domainTitleKey");

            return this;
        } // end andDomainTitleKeyNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitleKeyNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "resourceDomain.DOMAIN_TITEL_KEY");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainTitleKeyNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitleKeyGreaterThan(String value) {
            addCriterion("resourceDomain.DOMAIN_TITEL_KEY >", value,
                "domainTitleKey");

            return this;
        } // end andDomainTitleKeyGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitleKeyGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "resourceDomain.DOMAIN_TITEL_KEY");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainTitleKeyGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitleKeyGreaterThanOrEqualTo(String value) {
            addCriterion("resourceDomain.DOMAIN_TITEL_KEY >=", value,
                "domainTitleKey");

            return this;
        } // end andDomainTitleKeyGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitleKeyGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "resourceDomain.DOMAIN_TITEL_KEY");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainTitleKeyGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitleKeyLessThan(String value) {
            addCriterion("resourceDomain.DOMAIN_TITEL_KEY <", value,
                "domainTitleKey");

            return this;
        } // end andDomainTitleKeyLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitleKeyLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "resourceDomain.DOMAIN_TITEL_KEY");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainTitleKeyLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitleKeyLessThanOrEqualTo(String value) {
            addCriterion("resourceDomain.DOMAIN_TITEL_KEY <=", value,
                "domainTitleKey");

            return this;
        } // end andDomainTitleKeyLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitleKeyLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "resourceDomain.DOMAIN_TITEL_KEY");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainTitleKeyLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitleKeyLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("resourceDomain.DOMAIN_TITEL_KEY like",
                buffer.toString(), "domainTitleKey");

            return this;
        } // end andDomainTitleKeyLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitleKeyNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("resourceDomain.DOMAIN_TITEL_KEY not like",
                buffer.toString(), "domainTitleKey");

            return this;
        } // end andDomainTitleKeyNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitleKeyIn(List values) {
            if (values.size() == 1) {
                return andDomainTitleKeyEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("resourceDomain.DOMAIN_TITEL_KEY in", values,
                    "domainTitleKey");

                return this;
            } // end else
        } // end andDomainTitleKeyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitleKeyNotIn(List values) {
            if (values.size() == 1) {
                return andDomainTitleKeyNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("resourceDomain.DOMAIN_TITEL_KEY not in", values,
                    "domainTitleKey");

                return this;
            } // end else
        } // end andDomainTitleKeyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitleKeyIn(Object[] values) {
            if (values.length == 1) {
                return andDomainTitleKeyEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("resourceDomain.DOMAIN_TITEL_KEY in",
                    Arrays.asList(values), "domainTitleKey");

                return this;
            } // end else
        } // end andDomainTitleKeyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitleKeyNotIn(Object[] values) {
            if (values.length == 1) {
                return andDomainTitleKeyNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("resourceDomain.DOMAIN_TITEL_KEY not in",
                    Arrays.asList(values), "domainTitleKey");

                return this;
            } // end else
        } // end andDomainTitleKeyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitleKeyBetween(String value1, String value2) {
            addCriterion("resourceDomain.DOMAIN_TITEL_KEY between", value1,
                value2, "domainTitleKey");

            return this;
        } // end andDomainTitleKeyBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitleKeyNotBetween(String value1, String value2) {
            addCriterion("resourceDomain.DOMAIN_TITEL_KEY not between", value1,
                value2, "domainTitleKey");

            return this;
        } // end andDomainTitleKeyNotBetween()
    } // end Criteria
} // end SysResourceDAOQueryBean
