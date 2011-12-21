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
 * SysDomain query bean 2011-11-29 09:07:49
 *
 * @author Auto Gen
 */
public class SysDomainDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new SysDomainDAOQueryBean object.
     */
    public SysDomainDAOQueryBean() {
        super();
    } // end SysDomainDAOQueryBean()

    /**
     * Creates a new SysDomainDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public SysDomainDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end SysDomainDAOQueryBean()

    /**
     * Creates a new SysDomainDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public SysDomainDAOQueryBean(BaseQueryBean aQueryBean, Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end SysDomainDAOQueryBean()

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
            addSelectProperty(ISysDomainDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(ISysDomainDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addDomainCodeSelectProperty() {
        addDomainCodeSelectProperty("domainCode");
    } // end addDomainCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addDomainCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysDomainDAO.DomainCode, aAlias);
        } // end if
        else {
            addSelectProperty(ISysDomainDAO.DomainCode, "domainCode");
        } // end else
    } // end addDomainCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addDomainIconSelectProperty() {
        addDomainIconSelectProperty("domainIcon");
    } // end addDomainIconSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addDomainIconSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysDomainDAO.DomainIcon, aAlias);
        } // end if
        else {
            addSelectProperty(ISysDomainDAO.DomainIcon, "domainIcon");
        } // end else
    } // end addDomainIconSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addDomainNameSelectProperty() {
        addDomainNameSelectProperty("domainName");
    } // end addDomainNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addDomainNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysDomainDAO.DomainName, aAlias);
        } // end if
        else {
            addSelectProperty(ISysDomainDAO.DomainName, "domainName");
        } // end else
    } // end addDomainNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addDomainTitelKeySelectProperty() {
        addDomainTitelKeySelectProperty("domainTitelKey");
    } // end addDomainTitelKeySelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addDomainTitelKeySelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysDomainDAO.DomainTitelKey, aAlias);
        } // end if
        else {
            addSelectProperty(ISysDomainDAO.DomainTitelKey, "domainTitelKey");
        } // end else
    } // end addDomainTitelKeySelectProperty()

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
            addSelectProperty(ISysDomainDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(ISysDomainDAO.Remarks, "remarks");
        } // end else
    } // end addRemarksSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addSortIndexSelectProperty() {
        addSortIndexSelectProperty("sortIndex");
    } // end addSortIndexSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addSortIndexSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysDomainDAO.SortIndex, aAlias);
        } // end if
        else {
            addSelectProperty(ISysDomainDAO.SortIndex, "sortIndex");
        } // end else
    } // end addSortIndexSelectProperty()

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
            addSelectProperty(ISysDomainDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(ISysDomainDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addDomainShortNameSelectProperty() {
        addDomainShortNameSelectProperty("domainShortName");
    } // end addDomainShortNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addDomainShortNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysDomainDAO.DomainShortName, aAlias);
        } // end if
        else {
            addSelectProperty(ISysDomainDAO.DomainShortName, "domainShortName");
        } // end else
    } // end addDomainShortNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addDomainSmallIconSelectProperty() {
        addDomainSmallIconSelectProperty("domainSmallIcon");
    } // end addDomainSmallIconSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addDomainSmallIconSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysDomainDAO.DomainSmallIcon, aAlias);
        } // end if
        else {
            addSelectProperty(ISysDomainDAO.DomainSmallIcon, "domainSmallIcon");
        } // end else
    } // end addDomainSmallIconSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addDomainCodeSelectProperty();

        addDomainIconSelectProperty();

        addDomainNameSelectProperty();

        addDomainTitelKeySelectProperty();

        addRemarksSelectProperty();

        addSortIndexSelectProperty();

        addStatusSelectProperty();

        addDomainShortNameSelectProperty();

        addDomainSmallIconSelectProperty();
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
            addCriterion("SYS_DOMAIN.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("SYS_DOMAIN.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion("SYS_DOMAIN.ID is not null AND SYS_DOMAIN.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion("(SYS_DOMAIN.ID is null OR SYS_DOMAIN.ID = '')");

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
            addCriterion("SYS_DOMAIN.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_DOMAIN.ID");
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
            addCriterion("SYS_DOMAIN.ID <>", value, "id");

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
            addCriterion("SYS_DOMAIN.ID is null OR SYS_DOMAIN.ID <>", value,
                "id");

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
            StringBuffer str = new StringBuffer("SYS_DOMAIN.ID");
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
            addCriterion("SYS_DOMAIN.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_DOMAIN.ID");
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
            addCriterion("SYS_DOMAIN.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_DOMAIN.ID");
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
            addCriterion("SYS_DOMAIN.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_DOMAIN.ID");
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
            addCriterion("SYS_DOMAIN.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_DOMAIN.ID");
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
                addCriterion("SYS_DOMAIN.ID in", values, "id");

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
                addCriterion("SYS_DOMAIN.ID not in", values, "id");

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
                addCriterion("SYS_DOMAIN.ID in", values, "id");

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
                addCriterion("SYS_DOMAIN.ID not in", values, "id");

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
                addCriterion("SYS_DOMAIN.ID in", Arrays.asList(values), "id");

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
                addCriterion("SYS_DOMAIN.ID not in", Arrays.asList(values), "id");

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
            addCriterion("SYS_DOMAIN.ID between", value1, value2, "id");

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
            addCriterion("SYS_DOMAIN.ID between", value1, value2, "id");

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
            addCriterion("SYS_DOMAIN.ID not between", value1, value2, "id");

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
            addCriterion("SYS_DOMAIN.ID not between", value1, value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainCodeIsNull() {
            addCriterion("SYS_DOMAIN.DOMAIN_CODE is null");

            return this;
        } // end andDomainCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainCodeIsNotNull() {
            addCriterion("SYS_DOMAIN.DOMAIN_CODE is not null");

            return this;
        } // end andDomainCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainCodeIsNotEmpty() {
            addCriterion(
                "SYS_DOMAIN.DOMAIN_CODE is not null AND SYS_DOMAIN.DOMAIN_CODE <> ''");

            return this;
        } // end andDomainCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainCodeIsEmpty() {
            addCriterion(
                "(SYS_DOMAIN.DOMAIN_CODE is null OR SYS_DOMAIN.DOMAIN_CODE = '')");

            return this;
        } // end andDomainCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainCodeEqualTo(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_CODE =", value, "domainCode");

            return this;
        } // end andDomainCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainCodeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.DOMAIN_CODE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainCodeNotEqualTo(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_CODE <>", value, "domainCode");

            return this;
        } // end andDomainCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainCodeNotEqualToOrIsNull(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_CODE is null OR SYS_DOMAIN.DOMAIN_CODE <>",
                value, "domainCode");

            return this;
        } // end andDomainCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainCodeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.DOMAIN_CODE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainCodeGreaterThan(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_CODE >", value, "domainCode");

            return this;
        } // end andDomainCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainCodeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.DOMAIN_CODE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_CODE >=", value, "domainCode");

            return this;
        } // end andDomainCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.DOMAIN_CODE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainCodeLessThan(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_CODE <", value, "domainCode");

            return this;
        } // end andDomainCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainCodeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.DOMAIN_CODE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainCodeLessThanOrEqualTo(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_CODE <=", value, "domainCode");

            return this;
        } // end andDomainCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainCodeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.DOMAIN_CODE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_DOMAIN.DOMAIN_CODE like", buffer.toString(),
                "domainCode");

            return this;
        } // end andDomainCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_DOMAIN.DOMAIN_CODE not like", buffer.toString(),
                "domainCode");

            return this;
        } // end andDomainCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainCodeIn(List values) {
            if (values.size() == 1) {
                return andDomainCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_DOMAIN.DOMAIN_CODE in", values, "domainCode");

                return this;
            } // end else
        } // end andDomainCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainCodeNotIn(List values) {
            if (values.size() == 1) {
                return andDomainCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_DOMAIN.DOMAIN_CODE not in", values,
                    "domainCode");

                return this;
            } // end else
        } // end andDomainCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainCodeIn(Object[] values) {
            if (values.length == 1) {
                return andDomainCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_DOMAIN.DOMAIN_CODE in",
                    Arrays.asList(values), "domainCode");

                return this;
            } // end else
        } // end andDomainCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andDomainCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_DOMAIN.DOMAIN_CODE not in",
                    Arrays.asList(values), "domainCode");

                return this;
            } // end else
        } // end andDomainCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainCodeBetween(String value1, String value2) {
            addCriterion("SYS_DOMAIN.DOMAIN_CODE between", value1, value2,
                "domainCode");

            return this;
        } // end andDomainCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainCodeNotBetween(String value1, String value2) {
            addCriterion("SYS_DOMAIN.DOMAIN_CODE not between", value1, value2,
                "domainCode");

            return this;
        } // end andDomainCodeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIconIsNull() {
            addCriterion("SYS_DOMAIN.DOMAIN_ICON is null");

            return this;
        } // end andDomainIconIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIconIsNotNull() {
            addCriterion("SYS_DOMAIN.DOMAIN_ICON is not null");

            return this;
        } // end andDomainIconIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIconIsNotEmpty() {
            addCriterion(
                "SYS_DOMAIN.DOMAIN_ICON is not null AND SYS_DOMAIN.DOMAIN_ICON <> ''");

            return this;
        } // end andDomainIconIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIconIsEmpty() {
            addCriterion(
                "(SYS_DOMAIN.DOMAIN_ICON is null OR SYS_DOMAIN.DOMAIN_ICON = '')");

            return this;
        } // end andDomainIconIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIconEqualTo(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_ICON =", value, "domainIcon");

            return this;
        } // end andDomainIconEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIconEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.DOMAIN_ICON");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainIconEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIconNotEqualTo(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_ICON <>", value, "domainIcon");

            return this;
        } // end andDomainIconNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIconNotEqualToOrIsNull(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_ICON is null OR SYS_DOMAIN.DOMAIN_ICON <>",
                value, "domainIcon");

            return this;
        } // end andDomainIconNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIconNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.DOMAIN_ICON");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainIconNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIconGreaterThan(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_ICON >", value, "domainIcon");

            return this;
        } // end andDomainIconGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIconGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.DOMAIN_ICON");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainIconGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIconGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_ICON >=", value, "domainIcon");

            return this;
        } // end andDomainIconGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIconGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.DOMAIN_ICON");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainIconGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIconLessThan(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_ICON <", value, "domainIcon");

            return this;
        } // end andDomainIconLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIconLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.DOMAIN_ICON");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainIconLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIconLessThanOrEqualTo(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_ICON <=", value, "domainIcon");

            return this;
        } // end andDomainIconLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIconLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.DOMAIN_ICON");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainIconLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIconLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_DOMAIN.DOMAIN_ICON like", buffer.toString(),
                "domainIcon");

            return this;
        } // end andDomainIconLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIconNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_DOMAIN.DOMAIN_ICON not like", buffer.toString(),
                "domainIcon");

            return this;
        } // end andDomainIconNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIconIn(List values) {
            if (values.size() == 1) {
                return andDomainIconEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_DOMAIN.DOMAIN_ICON in", values, "domainIcon");

                return this;
            } // end else
        } // end andDomainIconIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIconNotIn(List values) {
            if (values.size() == 1) {
                return andDomainIconNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_DOMAIN.DOMAIN_ICON not in", values,
                    "domainIcon");

                return this;
            } // end else
        } // end andDomainIconNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIconIn(Object[] values) {
            if (values.length == 1) {
                return andDomainIconEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_DOMAIN.DOMAIN_ICON in",
                    Arrays.asList(values), "domainIcon");

                return this;
            } // end else
        } // end andDomainIconIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIconNotIn(Object[] values) {
            if (values.length == 1) {
                return andDomainIconNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_DOMAIN.DOMAIN_ICON not in",
                    Arrays.asList(values), "domainIcon");

                return this;
            } // end else
        } // end andDomainIconNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIconBetween(String value1, String value2) {
            addCriterion("SYS_DOMAIN.DOMAIN_ICON between", value1, value2,
                "domainIcon");

            return this;
        } // end andDomainIconBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIconNotBetween(String value1, String value2) {
            addCriterion("SYS_DOMAIN.DOMAIN_ICON not between", value1, value2,
                "domainIcon");

            return this;
        } // end andDomainIconNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameIsNull() {
            addCriterion("SYS_DOMAIN.DOMAIN_NAME is null");

            return this;
        } // end andDomainNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameIsNotNull() {
            addCriterion("SYS_DOMAIN.DOMAIN_NAME is not null");

            return this;
        } // end andDomainNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameIsNotEmpty() {
            addCriterion(
                "SYS_DOMAIN.DOMAIN_NAME is not null AND SYS_DOMAIN.DOMAIN_NAME <> ''");

            return this;
        } // end andDomainNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameIsEmpty() {
            addCriterion(
                "(SYS_DOMAIN.DOMAIN_NAME is null OR SYS_DOMAIN.DOMAIN_NAME = '')");

            return this;
        } // end andDomainNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameEqualTo(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_NAME =", value, "domainName");

            return this;
        } // end andDomainNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.DOMAIN_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameNotEqualTo(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_NAME <>", value, "domainName");

            return this;
        } // end andDomainNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameNotEqualToOrIsNull(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_NAME is null OR SYS_DOMAIN.DOMAIN_NAME <>",
                value, "domainName");

            return this;
        } // end andDomainNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.DOMAIN_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameGreaterThan(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_NAME >", value, "domainName");

            return this;
        } // end andDomainNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.DOMAIN_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_NAME >=", value, "domainName");

            return this;
        } // end andDomainNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.DOMAIN_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameLessThan(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_NAME <", value, "domainName");

            return this;
        } // end andDomainNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.DOMAIN_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameLessThanOrEqualTo(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_NAME <=", value, "domainName");

            return this;
        } // end andDomainNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.DOMAIN_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_DOMAIN.DOMAIN_NAME like", buffer.toString(),
                "domainName");

            return this;
        } // end andDomainNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_DOMAIN.DOMAIN_NAME not like", buffer.toString(),
                "domainName");

            return this;
        } // end andDomainNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameIn(List values) {
            if (values.size() == 1) {
                return andDomainNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_DOMAIN.DOMAIN_NAME in", values, "domainName");

                return this;
            } // end else
        } // end andDomainNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameNotIn(List values) {
            if (values.size() == 1) {
                return andDomainNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_DOMAIN.DOMAIN_NAME not in", values,
                    "domainName");

                return this;
            } // end else
        } // end andDomainNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameIn(Object[] values) {
            if (values.length == 1) {
                return andDomainNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_DOMAIN.DOMAIN_NAME in",
                    Arrays.asList(values), "domainName");

                return this;
            } // end else
        } // end andDomainNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andDomainNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_DOMAIN.DOMAIN_NAME not in",
                    Arrays.asList(values), "domainName");

                return this;
            } // end else
        } // end andDomainNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameBetween(String value1, String value2) {
            addCriterion("SYS_DOMAIN.DOMAIN_NAME between", value1, value2,
                "domainName");

            return this;
        } // end andDomainNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameNotBetween(String value1, String value2) {
            addCriterion("SYS_DOMAIN.DOMAIN_NAME not between", value1, value2,
                "domainName");

            return this;
        } // end andDomainNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitelKeyIsNull() {
            addCriterion("SYS_DOMAIN.DOMAIN_TITEL_KEY is null");

            return this;
        } // end andDomainTitelKeyIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitelKeyIsNotNull() {
            addCriterion("SYS_DOMAIN.DOMAIN_TITEL_KEY is not null");

            return this;
        } // end andDomainTitelKeyIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitelKeyIsNotEmpty() {
            addCriterion(
                "SYS_DOMAIN.DOMAIN_TITEL_KEY is not null AND SYS_DOMAIN.DOMAIN_TITEL_KEY <> ''");

            return this;
        } // end andDomainTitelKeyIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitelKeyIsEmpty() {
            addCriterion(
                "(SYS_DOMAIN.DOMAIN_TITEL_KEY is null OR SYS_DOMAIN.DOMAIN_TITEL_KEY = '')");

            return this;
        } // end andDomainTitelKeyIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitelKeyEqualTo(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_TITEL_KEY =", value,
                "domainTitelKey");

            return this;
        } // end andDomainTitelKeyEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitelKeyEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.DOMAIN_TITEL_KEY");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainTitelKeyEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitelKeyNotEqualTo(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_TITEL_KEY <>", value,
                "domainTitelKey");

            return this;
        } // end andDomainTitelKeyNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitelKeyNotEqualToOrIsNull(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_TITEL_KEY is null OR SYS_DOMAIN.DOMAIN_TITEL_KEY <>",
                value, "domainTitelKey");

            return this;
        } // end andDomainTitelKeyNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitelKeyNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.DOMAIN_TITEL_KEY");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainTitelKeyNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitelKeyGreaterThan(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_TITEL_KEY >", value,
                "domainTitelKey");

            return this;
        } // end andDomainTitelKeyGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitelKeyGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.DOMAIN_TITEL_KEY");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainTitelKeyGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitelKeyGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_TITEL_KEY >=", value,
                "domainTitelKey");

            return this;
        } // end andDomainTitelKeyGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitelKeyGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.DOMAIN_TITEL_KEY");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainTitelKeyGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitelKeyLessThan(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_TITEL_KEY <", value,
                "domainTitelKey");

            return this;
        } // end andDomainTitelKeyLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitelKeyLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.DOMAIN_TITEL_KEY");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainTitelKeyLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitelKeyLessThanOrEqualTo(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_TITEL_KEY <=", value,
                "domainTitelKey");

            return this;
        } // end andDomainTitelKeyLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitelKeyLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.DOMAIN_TITEL_KEY");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainTitelKeyLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitelKeyLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_DOMAIN.DOMAIN_TITEL_KEY like", buffer.toString(),
                "domainTitelKey");

            return this;
        } // end andDomainTitelKeyLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitelKeyNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_DOMAIN.DOMAIN_TITEL_KEY not like",
                buffer.toString(), "domainTitelKey");

            return this;
        } // end andDomainTitelKeyNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitelKeyIn(List values) {
            if (values.size() == 1) {
                return andDomainTitelKeyEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_DOMAIN.DOMAIN_TITEL_KEY in", values,
                    "domainTitelKey");

                return this;
            } // end else
        } // end andDomainTitelKeyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitelKeyNotIn(List values) {
            if (values.size() == 1) {
                return andDomainTitelKeyNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_DOMAIN.DOMAIN_TITEL_KEY not in", values,
                    "domainTitelKey");

                return this;
            } // end else
        } // end andDomainTitelKeyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitelKeyIn(Object[] values) {
            if (values.length == 1) {
                return andDomainTitelKeyEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_DOMAIN.DOMAIN_TITEL_KEY in",
                    Arrays.asList(values), "domainTitelKey");

                return this;
            } // end else
        } // end andDomainTitelKeyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitelKeyNotIn(Object[] values) {
            if (values.length == 1) {
                return andDomainTitelKeyNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_DOMAIN.DOMAIN_TITEL_KEY not in",
                    Arrays.asList(values), "domainTitelKey");

                return this;
            } // end else
        } // end andDomainTitelKeyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitelKeyBetween(String value1, String value2) {
            addCriterion("SYS_DOMAIN.DOMAIN_TITEL_KEY between", value1, value2,
                "domainTitelKey");

            return this;
        } // end andDomainTitelKeyBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitelKeyNotBetween(String value1, String value2) {
            addCriterion("SYS_DOMAIN.DOMAIN_TITEL_KEY not between", value1,
                value2, "domainTitelKey");

            return this;
        } // end andDomainTitelKeyNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("SYS_DOMAIN.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("SYS_DOMAIN.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "SYS_DOMAIN.REMARKS is not null AND SYS_DOMAIN.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(SYS_DOMAIN.REMARKS is null OR SYS_DOMAIN.REMARKS = '')");

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
            addCriterion("SYS_DOMAIN.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_DOMAIN.REMARKS");
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
            addCriterion("SYS_DOMAIN.REMARKS <>", value, "remarks");

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
            addCriterion("SYS_DOMAIN.REMARKS is null OR SYS_DOMAIN.REMARKS <>",
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
            StringBuffer str = new StringBuffer("SYS_DOMAIN.REMARKS");
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
            addCriterion("SYS_DOMAIN.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_DOMAIN.REMARKS");
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
            addCriterion("SYS_DOMAIN.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_DOMAIN.REMARKS");
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
            addCriterion("SYS_DOMAIN.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_DOMAIN.REMARKS");
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
            addCriterion("SYS_DOMAIN.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_DOMAIN.REMARKS");
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
            addCriterion("SYS_DOMAIN.REMARKS like", buffer.toString(), "remarks");

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
            addCriterion("SYS_DOMAIN.REMARKS not like", buffer.toString(),
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
                addCriterion("SYS_DOMAIN.REMARKS in", values, "remarks");

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
                addCriterion("SYS_DOMAIN.REMARKS not in", values, "remarks");

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
                addCriterion("SYS_DOMAIN.REMARKS in", Arrays.asList(values),
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
                addCriterion("SYS_DOMAIN.REMARKS not in",
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
            addCriterion("SYS_DOMAIN.REMARKS between", value1, value2, "remarks");

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
            addCriterion("SYS_DOMAIN.REMARKS not between", value1, value2,
                "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIsNull() {
            addCriterion("SYS_DOMAIN.SORT_INDEX is null");

            return this;
        } // end andSortIndexIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIsNotNull() {
            addCriterion("SYS_DOMAIN.SORT_INDEX is not null");

            return this;
        } // end andSortIndexIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIsNotEmpty() {
            addCriterion(
                "SYS_DOMAIN.SORT_INDEX is not null AND SYS_DOMAIN.SORT_INDEX <> ''");

            return this;
        } // end andSortIndexIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIsEmpty() {
            addCriterion(
                "(SYS_DOMAIN.SORT_INDEX is null OR SYS_DOMAIN.SORT_INDEX = '')");

            return this;
        } // end andSortIndexIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexEqualTo(Integer value) {
            addCriterion("SYS_DOMAIN.SORT_INDEX =", value, "sortIndex");

            return this;
        } // end andSortIndexEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.SORT_INDEX");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSortIndexEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexNotEqualTo(Integer value) {
            addCriterion("SYS_DOMAIN.SORT_INDEX <>", value, "sortIndex");

            return this;
        } // end andSortIndexNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexNotEqualToOrIsNull(Integer value) {
            addCriterion("SYS_DOMAIN.SORT_INDEX is null OR SYS_DOMAIN.SORT_INDEX <>",
                value, "sortIndex");

            return this;
        } // end andSortIndexNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.SORT_INDEX");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSortIndexNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexGreaterThan(Integer value) {
            addCriterion("SYS_DOMAIN.SORT_INDEX >", value, "sortIndex");

            return this;
        } // end andSortIndexGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.SORT_INDEX");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSortIndexGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("SYS_DOMAIN.SORT_INDEX >=", value, "sortIndex");

            return this;
        } // end andSortIndexGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.SORT_INDEX");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSortIndexGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexLessThan(Integer value) {
            addCriterion("SYS_DOMAIN.SORT_INDEX <", value, "sortIndex");

            return this;
        } // end andSortIndexLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.SORT_INDEX");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSortIndexLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexLessThanOrEqualTo(Integer value) {
            addCriterion("SYS_DOMAIN.SORT_INDEX <=", value, "sortIndex");

            return this;
        } // end andSortIndexLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.SORT_INDEX");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSortIndexLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIn(List values) {
            if (values.size() == 1) {
                return andSortIndexEqualTo((Integer) values.get(0));
            } // end if
            else {
                addCriterion("SYS_DOMAIN.SORT_INDEX in", values, "sortIndex");

                return this;
            } // end else
        } // end andSortIndexIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexNotIn(List values) {
            if (values.size() == 1) {
                return andSortIndexNotEqualTo((Integer) values.get(0));
            } // end if
            else {
                addCriterion("SYS_DOMAIN.SORT_INDEX not in", values, "sortIndex");

                return this;
            } // end else
        } // end andSortIndexNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIn(Object[] values) {
            if (values.length == 1) {
                return andSortIndexEqualTo((Integer) values[0]);
            } // end if
            else {
                addCriterion("SYS_DOMAIN.SORT_INDEX in", Arrays.asList(values),
                    "sortIndex");

                return this;
            } // end else
        } // end andSortIndexIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexNotIn(Object[] values) {
            if (values.length == 1) {
                return andSortIndexNotEqualTo((Integer) values[0]);
            } // end if
            else {
                addCriterion("SYS_DOMAIN.SORT_INDEX not in",
                    Arrays.asList(values), "sortIndex");

                return this;
            } // end else
        } // end andSortIndexNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexBetween(Integer value1, Integer value2) {
            addCriterion("SYS_DOMAIN.SORT_INDEX between", value1, value2,
                "sortIndex");

            return this;
        } // end andSortIndexBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("SYS_DOMAIN.SORT_INDEX not between", value1, value2,
                "sortIndex");

            return this;
        } // end andSortIndexNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("SYS_DOMAIN.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("SYS_DOMAIN.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "SYS_DOMAIN.STATUS is not null AND SYS_DOMAIN.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(SYS_DOMAIN.STATUS is null OR SYS_DOMAIN.STATUS = '')");

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
            addCriterion("SYS_DOMAIN.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_DOMAIN.STATUS");
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
            addCriterion("SYS_DOMAIN.STATUS <>", value, "status");

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
            addCriterion("SYS_DOMAIN.STATUS is null OR SYS_DOMAIN.STATUS <>",
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
            StringBuffer str = new StringBuffer("SYS_DOMAIN.STATUS");
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
            addCriterion("SYS_DOMAIN.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_DOMAIN.STATUS");
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
            addCriterion("SYS_DOMAIN.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_DOMAIN.STATUS");
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
            addCriterion("SYS_DOMAIN.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_DOMAIN.STATUS");
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
            addCriterion("SYS_DOMAIN.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_DOMAIN.STATUS");
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
            addCriterion("SYS_DOMAIN.STATUS like", buffer.toString(), "status");

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
            addCriterion("SYS_DOMAIN.STATUS not like", buffer.toString(),
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
                addCriterion("SYS_DOMAIN.STATUS in", values, "status");

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
                addCriterion("SYS_DOMAIN.STATUS not in", values, "status");

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
                addCriterion("SYS_DOMAIN.STATUS in", Arrays.asList(values),
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
                addCriterion("SYS_DOMAIN.STATUS not in", Arrays.asList(values),
                    "status");

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
            addCriterion("SYS_DOMAIN.STATUS between", value1, value2, "status");

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
            addCriterion("SYS_DOMAIN.STATUS not between", value1, value2,
                "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainShortNameIsNull() {
            addCriterion("SYS_DOMAIN.DOMAIN_SHORT_NAME is null");

            return this;
        } // end andDomainShortNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainShortNameIsNotNull() {
            addCriterion("SYS_DOMAIN.DOMAIN_SHORT_NAME is not null");

            return this;
        } // end andDomainShortNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainShortNameIsNotEmpty() {
            addCriterion(
                "SYS_DOMAIN.DOMAIN_SHORT_NAME is not null AND SYS_DOMAIN.DOMAIN_SHORT_NAME <> ''");

            return this;
        } // end andDomainShortNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainShortNameIsEmpty() {
            addCriterion(
                "(SYS_DOMAIN.DOMAIN_SHORT_NAME is null OR SYS_DOMAIN.DOMAIN_SHORT_NAME = '')");

            return this;
        } // end andDomainShortNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainShortNameEqualTo(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_SHORT_NAME =", value,
                "domainShortName");

            return this;
        } // end andDomainShortNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainShortNameEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.DOMAIN_SHORT_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainShortNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainShortNameNotEqualTo(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_SHORT_NAME <>", value,
                "domainShortName");

            return this;
        } // end andDomainShortNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainShortNameNotEqualToOrIsNull(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_SHORT_NAME is null OR SYS_DOMAIN.DOMAIN_SHORT_NAME <>",
                value, "domainShortName");

            return this;
        } // end andDomainShortNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainShortNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.DOMAIN_SHORT_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainShortNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainShortNameGreaterThan(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_SHORT_NAME >", value,
                "domainShortName");

            return this;
        } // end andDomainShortNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainShortNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.DOMAIN_SHORT_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainShortNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_SHORT_NAME >=", value,
                "domainShortName");

            return this;
        } // end andDomainShortNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainShortNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.DOMAIN_SHORT_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainShortNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainShortNameLessThan(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_SHORT_NAME <", value,
                "domainShortName");

            return this;
        } // end andDomainShortNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainShortNameLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.DOMAIN_SHORT_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainShortNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainShortNameLessThanOrEqualTo(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_SHORT_NAME <=", value,
                "domainShortName");

            return this;
        } // end andDomainShortNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainShortNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.DOMAIN_SHORT_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainShortNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainShortNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_DOMAIN.DOMAIN_SHORT_NAME like",
                buffer.toString(), "domainShortName");

            return this;
        } // end andDomainShortNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainShortNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_DOMAIN.DOMAIN_SHORT_NAME not like",
                buffer.toString(), "domainShortName");

            return this;
        } // end andDomainShortNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainShortNameIn(List values) {
            if (values.size() == 1) {
                return andDomainShortNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_DOMAIN.DOMAIN_SHORT_NAME in", values,
                    "domainShortName");

                return this;
            } // end else
        } // end andDomainShortNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainShortNameNotIn(List values) {
            if (values.size() == 1) {
                return andDomainShortNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_DOMAIN.DOMAIN_SHORT_NAME not in", values,
                    "domainShortName");

                return this;
            } // end else
        } // end andDomainShortNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainShortNameIn(Object[] values) {
            if (values.length == 1) {
                return andDomainShortNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_DOMAIN.DOMAIN_SHORT_NAME in",
                    Arrays.asList(values), "domainShortName");

                return this;
            } // end else
        } // end andDomainShortNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainShortNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andDomainShortNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_DOMAIN.DOMAIN_SHORT_NAME not in",
                    Arrays.asList(values), "domainShortName");

                return this;
            } // end else
        } // end andDomainShortNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainShortNameBetween(String value1, String value2) {
            addCriterion("SYS_DOMAIN.DOMAIN_SHORT_NAME between", value1,
                value2, "domainShortName");

            return this;
        } // end andDomainShortNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainShortNameNotBetween(String value1,
            String value2) {
            addCriterion("SYS_DOMAIN.DOMAIN_SHORT_NAME not between", value1,
                value2, "domainShortName");

            return this;
        } // end andDomainShortNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainSmallIconIsNull() {
            addCriterion("SYS_DOMAIN.DOMAIN_SMALL_ICON is null");

            return this;
        } // end andDomainSmallIconIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainSmallIconIsNotNull() {
            addCriterion("SYS_DOMAIN.DOMAIN_SMALL_ICON is not null");

            return this;
        } // end andDomainSmallIconIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainSmallIconIsNotEmpty() {
            addCriterion(
                "SYS_DOMAIN.DOMAIN_SMALL_ICON is not null AND SYS_DOMAIN.DOMAIN_SMALL_ICON <> ''");

            return this;
        } // end andDomainSmallIconIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainSmallIconIsEmpty() {
            addCriterion(
                "(SYS_DOMAIN.DOMAIN_SMALL_ICON is null OR SYS_DOMAIN.DOMAIN_SMALL_ICON = '')");

            return this;
        } // end andDomainSmallIconIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainSmallIconEqualTo(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_SMALL_ICON =", value,
                "domainSmallIcon");

            return this;
        } // end andDomainSmallIconEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainSmallIconEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.DOMAIN_SMALL_ICON");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainSmallIconEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainSmallIconNotEqualTo(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_SMALL_ICON <>", value,
                "domainSmallIcon");

            return this;
        } // end andDomainSmallIconNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainSmallIconNotEqualToOrIsNull(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_SMALL_ICON is null OR SYS_DOMAIN.DOMAIN_SMALL_ICON <>",
                value, "domainSmallIcon");

            return this;
        } // end andDomainSmallIconNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainSmallIconNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.DOMAIN_SMALL_ICON");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainSmallIconNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainSmallIconGreaterThan(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_SMALL_ICON >", value,
                "domainSmallIcon");

            return this;
        } // end andDomainSmallIconGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainSmallIconGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.DOMAIN_SMALL_ICON");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainSmallIconGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainSmallIconGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_SMALL_ICON >=", value,
                "domainSmallIcon");

            return this;
        } // end andDomainSmallIconGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainSmallIconGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.DOMAIN_SMALL_ICON");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainSmallIconGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainSmallIconLessThan(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_SMALL_ICON <", value,
                "domainSmallIcon");

            return this;
        } // end andDomainSmallIconLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainSmallIconLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.DOMAIN_SMALL_ICON");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainSmallIconLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainSmallIconLessThanOrEqualTo(String value) {
            addCriterion("SYS_DOMAIN.DOMAIN_SMALL_ICON <=", value,
                "domainSmallIcon");

            return this;
        } // end andDomainSmallIconLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainSmallIconLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_DOMAIN.DOMAIN_SMALL_ICON");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainSmallIconLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainSmallIconLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_DOMAIN.DOMAIN_SMALL_ICON like",
                buffer.toString(), "domainSmallIcon");

            return this;
        } // end andDomainSmallIconLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainSmallIconNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_DOMAIN.DOMAIN_SMALL_ICON not like",
                buffer.toString(), "domainSmallIcon");

            return this;
        } // end andDomainSmallIconNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainSmallIconIn(List values) {
            if (values.size() == 1) {
                return andDomainSmallIconEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_DOMAIN.DOMAIN_SMALL_ICON in", values,
                    "domainSmallIcon");

                return this;
            } // end else
        } // end andDomainSmallIconIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainSmallIconNotIn(List values) {
            if (values.size() == 1) {
                return andDomainSmallIconNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_DOMAIN.DOMAIN_SMALL_ICON not in", values,
                    "domainSmallIcon");

                return this;
            } // end else
        } // end andDomainSmallIconNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainSmallIconIn(Object[] values) {
            if (values.length == 1) {
                return andDomainSmallIconEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_DOMAIN.DOMAIN_SMALL_ICON in",
                    Arrays.asList(values), "domainSmallIcon");

                return this;
            } // end else
        } // end andDomainSmallIconIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainSmallIconNotIn(Object[] values) {
            if (values.length == 1) {
                return andDomainSmallIconNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_DOMAIN.DOMAIN_SMALL_ICON not in",
                    Arrays.asList(values), "domainSmallIcon");

                return this;
            } // end else
        } // end andDomainSmallIconNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainSmallIconBetween(String value1, String value2) {
            addCriterion("SYS_DOMAIN.DOMAIN_SMALL_ICON between", value1,
                value2, "domainSmallIcon");

            return this;
        } // end andDomainSmallIconBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainSmallIconNotBetween(String value1,
            String value2) {
            addCriterion("SYS_DOMAIN.DOMAIN_SMALL_ICON not between", value1,
                value2, "domainSmallIcon");

            return this;
        } // end andDomainSmallIconNotBetween()
    } // end Criteria
} // end SysDomainDAOQueryBean
