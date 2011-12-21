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
 * SysRole query bean 2011-09-22 10:11:19
 *
 * @author Auto Gen
 */
public class SysRoleDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new SysRoleDAOQueryBean object.
     */
    public SysRoleDAOQueryBean() {
        super();
    } // end SysRoleDAOQueryBean()

    /**
     * Creates a new SysRoleDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public SysRoleDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end SysRoleDAOQueryBean()

    /**
     * Creates a new SysRoleDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public SysRoleDAOQueryBean(BaseQueryBean aQueryBean, Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end SysRoleDAOQueryBean()

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
            addSelectProperty(ISysRoleDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleDAO.Id, "id");
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
            addSelectProperty(ISysRoleDAO.DomainId, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleDAO.DomainId, "domainId");
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
            addSelectProperty(ISysRoleDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleDAO.Remarks, "remarks");
        } // end else
    } // end addRemarksSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRoleCodeSelectProperty() {
        addRoleCodeSelectProperty("roleCode");
    } // end addRoleCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRoleCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysRoleDAO.RoleCode, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleDAO.RoleCode, "roleCode");
        } // end else
    } // end addRoleCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRoleNameSelectProperty() {
        addRoleNameSelectProperty("roleName");
    } // end addRoleNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRoleNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysRoleDAO.RoleName, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleDAO.RoleName, "roleName");
        } // end else
    } // end addRoleNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRoleTypeSelectProperty() {
        addRoleTypeSelectProperty("roleType");
    } // end addRoleTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRoleTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysRoleDAO.RoleType, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleDAO.RoleType, "roleType");
        } // end else
    } // end addRoleTypeSelectProperty()

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
            addSelectProperty(ISysRoleDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

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
            addSelectProperty(ISysRoleDAO.DomainTitleKey, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleDAO.DomainTitleKey, "domainTitleKey");
        } // end else
    } // end addDomainTitleKeySelectProperty()

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
            addSelectProperty(ISysRoleDAO.DomainName, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleDAO.DomainName, "domainName");
        } // end else
    } // end addDomainNameSelectProperty()

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
            addSelectProperty(ISysRoleDAO.DomainCode, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleDAO.DomainCode, "domainCode");
        } // end else
    } // end addDomainCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addDomainIdSelectProperty();

        addRemarksSelectProperty();

        addRoleCodeSelectProperty();

        addRoleNameSelectProperty();

        addRoleTypeSelectProperty();

        addStatusSelectProperty();

        addDomainTitleKeySelectProperty();

        addDomainNameSelectProperty();

        addDomainCodeSelectProperty();
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
            addCriterion("SYS_ROLE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("SYS_ROLE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion("SYS_ROLE.ID is not null AND SYS_ROLE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion("(SYS_ROLE.ID is null OR SYS_ROLE.ID = '')");

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
            addCriterion("SYS_ROLE.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_ROLE.ID");
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
            addCriterion("SYS_ROLE.ID <>", value, "id");

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
            addCriterion("SYS_ROLE.ID is null OR SYS_ROLE.ID <>", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_ROLE.ID");
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
            addCriterion("SYS_ROLE.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_ROLE.ID");
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
            addCriterion("SYS_ROLE.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_ROLE.ID");
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
            addCriterion("SYS_ROLE.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_ROLE.ID");
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
            addCriterion("SYS_ROLE.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_ROLE.ID");
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
                addCriterion("SYS_ROLE.ID in", values, "id");

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
                addCriterion("SYS_ROLE.ID not in", values, "id");

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
                addCriterion("SYS_ROLE.ID in", values, "id");

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
                addCriterion("SYS_ROLE.ID not in", values, "id");

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
                addCriterion("SYS_ROLE.ID in", Arrays.asList(values), "id");

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
                addCriterion("SYS_ROLE.ID not in", Arrays.asList(values), "id");

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
            addCriterion("SYS_ROLE.ID between", value1, value2, "id");

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
            addCriterion("SYS_ROLE.ID between", value1, value2, "id");

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
            addCriterion("SYS_ROLE.ID not between", value1, value2, "id");

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
            addCriterion("SYS_ROLE.ID not between", value1, value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdIsNull() {
            addCriterion("SYS_ROLE.DOMAIN_ID is null");

            return this;
        } // end andDomainIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdIsNotNull() {
            addCriterion("SYS_ROLE.DOMAIN_ID is not null");

            return this;
        } // end andDomainIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdIsNotEmpty() {
            addCriterion(
                "SYS_ROLE.DOMAIN_ID is not null AND SYS_ROLE.DOMAIN_ID <> ''");

            return this;
        } // end andDomainIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdIsEmpty() {
            addCriterion(
                "(SYS_ROLE.DOMAIN_ID is null OR SYS_ROLE.DOMAIN_ID = '')");

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
            addCriterion("SYS_ROLE.DOMAIN_ID =", value, "domainId");

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
            StringBuffer str = new StringBuffer("SYS_ROLE.DOMAIN_ID");
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
            addCriterion("SYS_ROLE.DOMAIN_ID <>", value, "domainId");

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
            addCriterion("SYS_ROLE.DOMAIN_ID is null OR SYS_ROLE.DOMAIN_ID <>",
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
            StringBuffer str = new StringBuffer("SYS_ROLE.DOMAIN_ID");
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
            addCriterion("SYS_ROLE.DOMAIN_ID >", value, "domainId");

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
            StringBuffer str = new StringBuffer("SYS_ROLE.DOMAIN_ID");
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
            addCriterion("SYS_ROLE.DOMAIN_ID >=", value, "domainId");

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
            StringBuffer str = new StringBuffer("SYS_ROLE.DOMAIN_ID");
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
            addCriterion("SYS_ROLE.DOMAIN_ID <", value, "domainId");

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
            StringBuffer str = new StringBuffer("SYS_ROLE.DOMAIN_ID");
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
            addCriterion("SYS_ROLE.DOMAIN_ID <=", value, "domainId");

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
            StringBuffer str = new StringBuffer("SYS_ROLE.DOMAIN_ID");
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
                addCriterion("SYS_ROLE.DOMAIN_ID in", values, "domainId");

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
                addCriterion("SYS_ROLE.DOMAIN_ID not in", values, "domainId");

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
                addCriterion("SYS_ROLE.DOMAIN_ID in", values, "domainId");

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
                addCriterion("SYS_ROLE.DOMAIN_ID not in", values, "domainId");

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
                addCriterion("SYS_ROLE.DOMAIN_ID in", Arrays.asList(values),
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
        public Criteria andDomainIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andDomainIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE.DOMAIN_ID not in",
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
            addCriterion("SYS_ROLE.DOMAIN_ID between", value1, value2,
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
            addCriterion("SYS_ROLE.DOMAIN_ID between", value1, value2,
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
            addCriterion("SYS_ROLE.DOMAIN_ID not between", value1, value2,
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
            addCriterion("SYS_ROLE.DOMAIN_ID not between", value1, value2,
                "domainId");

            return this;
        } // end andDomainIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("SYS_ROLE.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("SYS_ROLE.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "SYS_ROLE.REMARKS is not null AND SYS_ROLE.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion("(SYS_ROLE.REMARKS is null OR SYS_ROLE.REMARKS = '')");

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
            addCriterion("SYS_ROLE.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_ROLE.REMARKS");
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
            addCriterion("SYS_ROLE.REMARKS <>", value, "remarks");

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
            addCriterion("SYS_ROLE.REMARKS is null OR SYS_ROLE.REMARKS <>",
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
            StringBuffer str = new StringBuffer("SYS_ROLE.REMARKS");
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
            addCriterion("SYS_ROLE.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_ROLE.REMARKS");
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
            addCriterion("SYS_ROLE.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_ROLE.REMARKS");
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
            addCriterion("SYS_ROLE.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_ROLE.REMARKS");
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
            addCriterion("SYS_ROLE.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_ROLE.REMARKS");
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
            addCriterion("SYS_ROLE.REMARKS like", buffer.toString(), "remarks");

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
            addCriterion("SYS_ROLE.REMARKS not like", buffer.toString(),
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
                addCriterion("SYS_ROLE.REMARKS in", values, "remarks");

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
                addCriterion("SYS_ROLE.REMARKS not in", values, "remarks");

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
                addCriterion("SYS_ROLE.REMARKS in", Arrays.asList(values),
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
                addCriterion("SYS_ROLE.REMARKS not in", Arrays.asList(values),
                    "remarks");

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
            addCriterion("SYS_ROLE.REMARKS between", value1, value2, "remarks");

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
            addCriterion("SYS_ROLE.REMARKS not between", value1, value2,
                "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeIsNull() {
            addCriterion("SYS_ROLE.ROLE_CODE is null");

            return this;
        } // end andRoleCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeIsNotNull() {
            addCriterion("SYS_ROLE.ROLE_CODE is not null");

            return this;
        } // end andRoleCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeIsNotEmpty() {
            addCriterion(
                "SYS_ROLE.ROLE_CODE is not null AND SYS_ROLE.ROLE_CODE <> ''");

            return this;
        } // end andRoleCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeIsEmpty() {
            addCriterion(
                "(SYS_ROLE.ROLE_CODE is null OR SYS_ROLE.ROLE_CODE = '')");

            return this;
        } // end andRoleCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeEqualTo(String value) {
            addCriterion("SYS_ROLE.ROLE_CODE =", value, "roleCode");

            return this;
        } // end andRoleCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_ROLE.ROLE_CODE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeNotEqualTo(String value) {
            addCriterion("SYS_ROLE.ROLE_CODE <>", value, "roleCode");

            return this;
        } // end andRoleCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeNotEqualToOrIsNull(String value) {
            addCriterion("SYS_ROLE.ROLE_CODE is null OR SYS_ROLE.ROLE_CODE <>",
                value, "roleCode");

            return this;
        } // end andRoleCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_ROLE.ROLE_CODE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeGreaterThan(String value) {
            addCriterion("SYS_ROLE.ROLE_CODE >", value, "roleCode");

            return this;
        } // end andRoleCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_ROLE.ROLE_CODE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_ROLE.ROLE_CODE >=", value, "roleCode");

            return this;
        } // end andRoleCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_ROLE.ROLE_CODE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeLessThan(String value) {
            addCriterion("SYS_ROLE.ROLE_CODE <", value, "roleCode");

            return this;
        } // end andRoleCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_ROLE.ROLE_CODE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeLessThanOrEqualTo(String value) {
            addCriterion("SYS_ROLE.ROLE_CODE <=", value, "roleCode");

            return this;
        } // end andRoleCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_ROLE.ROLE_CODE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_ROLE.ROLE_CODE like", buffer.toString(),
                "roleCode");

            return this;
        } // end andRoleCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_ROLE.ROLE_CODE not like", buffer.toString(),
                "roleCode");

            return this;
        } // end andRoleCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeIn(List values) {
            if (values.size() == 1) {
                return andRoleCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_ROLE.ROLE_CODE in", values, "roleCode");

                return this;
            } // end else
        } // end andRoleCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeNotIn(List values) {
            if (values.size() == 1) {
                return andRoleCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_ROLE.ROLE_CODE not in", values, "roleCode");

                return this;
            } // end else
        } // end andRoleCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeIn(Object[] values) {
            if (values.length == 1) {
                return andRoleCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE.ROLE_CODE in", Arrays.asList(values),
                    "roleCode");

                return this;
            } // end else
        } // end andRoleCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andRoleCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE.ROLE_CODE not in",
                    Arrays.asList(values), "roleCode");

                return this;
            } // end else
        } // end andRoleCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeBetween(String value1, String value2) {
            addCriterion("SYS_ROLE.ROLE_CODE between", value1, value2,
                "roleCode");

            return this;
        } // end andRoleCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeNotBetween(String value1, String value2) {
            addCriterion("SYS_ROLE.ROLE_CODE not between", value1, value2,
                "roleCode");

            return this;
        } // end andRoleCodeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameIsNull() {
            addCriterion("SYS_ROLE.ROLE_NAME is null");

            return this;
        } // end andRoleNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameIsNotNull() {
            addCriterion("SYS_ROLE.ROLE_NAME is not null");

            return this;
        } // end andRoleNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameIsNotEmpty() {
            addCriterion(
                "SYS_ROLE.ROLE_NAME is not null AND SYS_ROLE.ROLE_NAME <> ''");

            return this;
        } // end andRoleNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameIsEmpty() {
            addCriterion(
                "(SYS_ROLE.ROLE_NAME is null OR SYS_ROLE.ROLE_NAME = '')");

            return this;
        } // end andRoleNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("SYS_ROLE.ROLE_NAME =", value, "roleName");

            return this;
        } // end andRoleNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_ROLE.ROLE_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("SYS_ROLE.ROLE_NAME <>", value, "roleName");

            return this;
        } // end andRoleNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameNotEqualToOrIsNull(String value) {
            addCriterion("SYS_ROLE.ROLE_NAME is null OR SYS_ROLE.ROLE_NAME <>",
                value, "roleName");

            return this;
        } // end andRoleNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_ROLE.ROLE_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("SYS_ROLE.ROLE_NAME >", value, "roleName");

            return this;
        } // end andRoleNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_ROLE.ROLE_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_ROLE.ROLE_NAME >=", value, "roleName");

            return this;
        } // end andRoleNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_ROLE.ROLE_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameLessThan(String value) {
            addCriterion("SYS_ROLE.ROLE_NAME <", value, "roleName");

            return this;
        } // end andRoleNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_ROLE.ROLE_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("SYS_ROLE.ROLE_NAME <=", value, "roleName");

            return this;
        } // end andRoleNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_ROLE.ROLE_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_ROLE.ROLE_NAME like", buffer.toString(),
                "roleName");

            return this;
        } // end andRoleNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_ROLE.ROLE_NAME not like", buffer.toString(),
                "roleName");

            return this;
        } // end andRoleNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameIn(List values) {
            if (values.size() == 1) {
                return andRoleNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_ROLE.ROLE_NAME in", values, "roleName");

                return this;
            } // end else
        } // end andRoleNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameNotIn(List values) {
            if (values.size() == 1) {
                return andRoleNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_ROLE.ROLE_NAME not in", values, "roleName");

                return this;
            } // end else
        } // end andRoleNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameIn(Object[] values) {
            if (values.length == 1) {
                return andRoleNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE.ROLE_NAME in", Arrays.asList(values),
                    "roleName");

                return this;
            } // end else
        } // end andRoleNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andRoleNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE.ROLE_NAME not in",
                    Arrays.asList(values), "roleName");

                return this;
            } // end else
        } // end andRoleNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("SYS_ROLE.ROLE_NAME between", value1, value2,
                "roleName");

            return this;
        } // end andRoleNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("SYS_ROLE.ROLE_NAME not between", value1, value2,
                "roleName");

            return this;
        } // end andRoleNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleTypeIsNull() {
            addCriterion("SYS_ROLE.ROLE_TYPE is null");

            return this;
        } // end andRoleTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleTypeIsNotNull() {
            addCriterion("SYS_ROLE.ROLE_TYPE is not null");

            return this;
        } // end andRoleTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleTypeIsNotEmpty() {
            addCriterion(
                "SYS_ROLE.ROLE_TYPE is not null AND SYS_ROLE.ROLE_TYPE <> ''");

            return this;
        } // end andRoleTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleTypeIsEmpty() {
            addCriterion(
                "(SYS_ROLE.ROLE_TYPE is null OR SYS_ROLE.ROLE_TYPE = '')");

            return this;
        } // end andRoleTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleTypeEqualTo(String value) {
            addCriterion("SYS_ROLE.ROLE_TYPE =", value, "roleType");

            return this;
        } // end andRoleTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleTypeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_ROLE.ROLE_TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleTypeNotEqualTo(String value) {
            addCriterion("SYS_ROLE.ROLE_TYPE <>", value, "roleType");

            return this;
        } // end andRoleTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleTypeNotEqualToOrIsNull(String value) {
            addCriterion("SYS_ROLE.ROLE_TYPE is null OR SYS_ROLE.ROLE_TYPE <>",
                value, "roleType");

            return this;
        } // end andRoleTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleTypeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_ROLE.ROLE_TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleTypeGreaterThan(String value) {
            addCriterion("SYS_ROLE.ROLE_TYPE >", value, "roleType");

            return this;
        } // end andRoleTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleTypeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_ROLE.ROLE_TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_ROLE.ROLE_TYPE >=", value, "roleType");

            return this;
        } // end andRoleTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_ROLE.ROLE_TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleTypeLessThan(String value) {
            addCriterion("SYS_ROLE.ROLE_TYPE <", value, "roleType");

            return this;
        } // end andRoleTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleTypeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_ROLE.ROLE_TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleTypeLessThanOrEqualTo(String value) {
            addCriterion("SYS_ROLE.ROLE_TYPE <=", value, "roleType");

            return this;
        } // end andRoleTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_ROLE.ROLE_TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_ROLE.ROLE_TYPE like", buffer.toString(),
                "roleType");

            return this;
        } // end andRoleTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_ROLE.ROLE_TYPE not like", buffer.toString(),
                "roleType");

            return this;
        } // end andRoleTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleTypeIn(List values) {
            if (values.size() == 1) {
                return andRoleTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_ROLE.ROLE_TYPE in", values, "roleType");

                return this;
            } // end else
        } // end andRoleTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleTypeNotIn(List values) {
            if (values.size() == 1) {
                return andRoleTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_ROLE.ROLE_TYPE not in", values, "roleType");

                return this;
            } // end else
        } // end andRoleTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleTypeIn(Object[] values) {
            if (values.length == 1) {
                return andRoleTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE.ROLE_TYPE in", Arrays.asList(values),
                    "roleType");

                return this;
            } // end else
        } // end andRoleTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andRoleTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE.ROLE_TYPE not in",
                    Arrays.asList(values), "roleType");

                return this;
            } // end else
        } // end andRoleTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleTypeBetween(String value1, String value2) {
            addCriterion("SYS_ROLE.ROLE_TYPE between", value1, value2,
                "roleType");

            return this;
        } // end andRoleTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleTypeNotBetween(String value1, String value2) {
            addCriterion("SYS_ROLE.ROLE_TYPE not between", value1, value2,
                "roleType");

            return this;
        } // end andRoleTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("SYS_ROLE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("SYS_ROLE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "SYS_ROLE.STATUS is not null AND SYS_ROLE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion("(SYS_ROLE.STATUS is null OR SYS_ROLE.STATUS = '')");

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
            addCriterion("SYS_ROLE.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_ROLE.STATUS");
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
            addCriterion("SYS_ROLE.STATUS <>", value, "status");

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
            addCriterion("SYS_ROLE.STATUS is null OR SYS_ROLE.STATUS <>",
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
            StringBuffer str = new StringBuffer("SYS_ROLE.STATUS");
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
            addCriterion("SYS_ROLE.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_ROLE.STATUS");
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
            addCriterion("SYS_ROLE.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_ROLE.STATUS");
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
            addCriterion("SYS_ROLE.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_ROLE.STATUS");
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
            addCriterion("SYS_ROLE.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_ROLE.STATUS");
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
            addCriterion("SYS_ROLE.STATUS like", buffer.toString(), "status");

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
            addCriterion("SYS_ROLE.STATUS not like", buffer.toString(), "status");

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
                addCriterion("SYS_ROLE.STATUS in", values, "status");

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
                addCriterion("SYS_ROLE.STATUS not in", values, "status");

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
                addCriterion("SYS_ROLE.STATUS in", Arrays.asList(values),
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
                addCriterion("SYS_ROLE.STATUS not in", Arrays.asList(values),
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
            addCriterion("SYS_ROLE.STATUS between", value1, value2, "status");

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
            addCriterion("SYS_ROLE.STATUS not between", value1, value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitleKeyIsNull() {
            addCriterion("domain.DOMAIN_TITEL_KEY is null");

            return this;
        } // end andDomainTitleKeyIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitleKeyIsNotNull() {
            addCriterion("domain.DOMAIN_TITEL_KEY is not null");

            return this;
        } // end andDomainTitleKeyIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitleKeyIsNotEmpty() {
            addCriterion(
                "domain.DOMAIN_TITEL_KEY is not null AND domain.DOMAIN_TITEL_KEY <> ''");

            return this;
        } // end andDomainTitleKeyIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainTitleKeyIsEmpty() {
            addCriterion(
                "(domain.DOMAIN_TITEL_KEY is null OR domain.DOMAIN_TITEL_KEY = '')");

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
            addCriterion("domain.DOMAIN_TITEL_KEY =", value, "domainTitleKey");

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
            StringBuffer str = new StringBuffer("domain.DOMAIN_TITEL_KEY");
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
            addCriterion("domain.DOMAIN_TITEL_KEY <>", value, "domainTitleKey");

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
            addCriterion("domain.DOMAIN_TITEL_KEY is null OR domain.DOMAIN_TITEL_KEY <>",
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
            StringBuffer str = new StringBuffer("domain.DOMAIN_TITEL_KEY");
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
            addCriterion("domain.DOMAIN_TITEL_KEY >", value, "domainTitleKey");

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
            StringBuffer str = new StringBuffer("domain.DOMAIN_TITEL_KEY");
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
            addCriterion("domain.DOMAIN_TITEL_KEY >=", value, "domainTitleKey");

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
            StringBuffer str = new StringBuffer("domain.DOMAIN_TITEL_KEY");
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
            addCriterion("domain.DOMAIN_TITEL_KEY <", value, "domainTitleKey");

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
            StringBuffer str = new StringBuffer("domain.DOMAIN_TITEL_KEY");
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
            addCriterion("domain.DOMAIN_TITEL_KEY <=", value, "domainTitleKey");

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
            StringBuffer str = new StringBuffer("domain.DOMAIN_TITEL_KEY");
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
            addCriterion("domain.DOMAIN_TITEL_KEY like", buffer.toString(),
                "domainTitleKey");

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
            addCriterion("domain.DOMAIN_TITEL_KEY not like", buffer.toString(),
                "domainTitleKey");

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
                addCriterion("domain.DOMAIN_TITEL_KEY in", values,
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
                addCriterion("domain.DOMAIN_TITEL_KEY not in", values,
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
                addCriterion("domain.DOMAIN_TITEL_KEY in",
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
                addCriterion("domain.DOMAIN_TITEL_KEY not in",
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
            addCriterion("domain.DOMAIN_TITEL_KEY between", value1, value2,
                "domainTitleKey");

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
            addCriterion("domain.DOMAIN_TITEL_KEY not between", value1, value2,
                "domainTitleKey");

            return this;
        } // end andDomainTitleKeyNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameIsNull() {
            addCriterion("domain.DOMAIN_NAME is null");

            return this;
        } // end andDomainNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameIsNotNull() {
            addCriterion("domain.DOMAIN_NAME is not null");

            return this;
        } // end andDomainNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameIsNotEmpty() {
            addCriterion(
                "domain.DOMAIN_NAME is not null AND domain.DOMAIN_NAME <> ''");

            return this;
        } // end andDomainNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameIsEmpty() {
            addCriterion(
                "(domain.DOMAIN_NAME is null OR domain.DOMAIN_NAME = '')");

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
            addCriterion("domain.DOMAIN_NAME =", value, "domainName");

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
            StringBuffer str = new StringBuffer("domain.DOMAIN_NAME");
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
            addCriterion("domain.DOMAIN_NAME <>", value, "domainName");

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
            addCriterion("domain.DOMAIN_NAME is null OR domain.DOMAIN_NAME <>",
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
            StringBuffer str = new StringBuffer("domain.DOMAIN_NAME");
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
            addCriterion("domain.DOMAIN_NAME >", value, "domainName");

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
            StringBuffer str = new StringBuffer("domain.DOMAIN_NAME");
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
            addCriterion("domain.DOMAIN_NAME >=", value, "domainName");

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
            StringBuffer str = new StringBuffer("domain.DOMAIN_NAME");
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
            addCriterion("domain.DOMAIN_NAME <", value, "domainName");

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
            StringBuffer str = new StringBuffer("domain.DOMAIN_NAME");
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
            addCriterion("domain.DOMAIN_NAME <=", value, "domainName");

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
            StringBuffer str = new StringBuffer("domain.DOMAIN_NAME");
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
            addCriterion("domain.DOMAIN_NAME like", buffer.toString(),
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
            addCriterion("domain.DOMAIN_NAME not like", buffer.toString(),
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
                addCriterion("domain.DOMAIN_NAME in", values, "domainName");

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
                addCriterion("domain.DOMAIN_NAME not in", values, "domainName");

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
                addCriterion("domain.DOMAIN_NAME in", Arrays.asList(values),
                    "domainName");

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
                addCriterion("domain.DOMAIN_NAME not in",
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
            addCriterion("domain.DOMAIN_NAME between", value1, value2,
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
            addCriterion("domain.DOMAIN_NAME not between", value1, value2,
                "domainName");

            return this;
        } // end andDomainNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainCodeIsNull() {
            addCriterion("domain.DOMAIN_CODE is null");

            return this;
        } // end andDomainCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainCodeIsNotNull() {
            addCriterion("domain.DOMAIN_CODE is not null");

            return this;
        } // end andDomainCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainCodeIsNotEmpty() {
            addCriterion(
                "domain.DOMAIN_CODE is not null AND domain.DOMAIN_CODE <> ''");

            return this;
        } // end andDomainCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainCodeIsEmpty() {
            addCriterion(
                "(domain.DOMAIN_CODE is null OR domain.DOMAIN_CODE = '')");

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
            addCriterion("domain.DOMAIN_CODE =", value, "domainCode");

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
            StringBuffer str = new StringBuffer("domain.DOMAIN_CODE");
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
            addCriterion("domain.DOMAIN_CODE <>", value, "domainCode");

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
            addCriterion("domain.DOMAIN_CODE is null OR domain.DOMAIN_CODE <>",
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
            StringBuffer str = new StringBuffer("domain.DOMAIN_CODE");
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
            addCriterion("domain.DOMAIN_CODE >", value, "domainCode");

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
            StringBuffer str = new StringBuffer("domain.DOMAIN_CODE");
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
            addCriterion("domain.DOMAIN_CODE >=", value, "domainCode");

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
            StringBuffer str = new StringBuffer("domain.DOMAIN_CODE");
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
            addCriterion("domain.DOMAIN_CODE <", value, "domainCode");

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
            StringBuffer str = new StringBuffer("domain.DOMAIN_CODE");
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
            addCriterion("domain.DOMAIN_CODE <=", value, "domainCode");

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
            StringBuffer str = new StringBuffer("domain.DOMAIN_CODE");
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
            addCriterion("domain.DOMAIN_CODE like", buffer.toString(),
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
            addCriterion("domain.DOMAIN_CODE not like", buffer.toString(),
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
                addCriterion("domain.DOMAIN_CODE in", values, "domainCode");

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
                addCriterion("domain.DOMAIN_CODE not in", values, "domainCode");

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
                addCriterion("domain.DOMAIN_CODE in", Arrays.asList(values),
                    "domainCode");

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
                addCriterion("domain.DOMAIN_CODE not in",
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
            addCriterion("domain.DOMAIN_CODE between", value1, value2,
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
            addCriterion("domain.DOMAIN_CODE not between", value1, value2,
                "domainCode");

            return this;
        } // end andDomainCodeNotBetween()
    } // end Criteria
} // end SysRoleDAOQueryBean
