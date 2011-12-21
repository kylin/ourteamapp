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
 * SysRoleActionRelate query bean 2011-12-12 21:19:58
 *
 * @author Auto Gen
 */
public class SysRoleActionRelateDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new SysRoleActionRelateDAOQueryBean object.
     */
    public SysRoleActionRelateDAOQueryBean() {
        super();
    } // end SysRoleActionRelateDAOQueryBean()

    /**
     * Creates a new SysRoleActionRelateDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public SysRoleActionRelateDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end SysRoleActionRelateDAOQueryBean()

    /**
     * Creates a new SysRoleActionRelateDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public SysRoleActionRelateDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end SysRoleActionRelateDAOQueryBean()

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
            addSelectProperty(ISysRoleActionRelateDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleActionRelateDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addActionIdSelectProperty() {
        addActionIdSelectProperty("actionId");
    } // end addActionIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addActionIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysRoleActionRelateDAO.ActionId, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleActionRelateDAO.ActionId, "actionId");
        } // end else
    } // end addActionIdSelectProperty()

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
            addSelectProperty(ISysRoleActionRelateDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleActionRelateDAO.Remarks, "remarks");
        } // end else
    } // end addRemarksSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRoleIdSelectProperty() {
        addRoleIdSelectProperty("roleId");
    } // end addRoleIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRoleIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysRoleActionRelateDAO.RoleId, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleActionRelateDAO.RoleId, "roleId");
        } // end else
    } // end addRoleIdSelectProperty()

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
            addSelectProperty(ISysRoleActionRelateDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleActionRelateDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addActionCodeSelectProperty() {
        addActionCodeSelectProperty("actionCode");
    } // end addActionCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addActionCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysRoleActionRelateDAO.ActionCode, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleActionRelateDAO.ActionCode, "actionCode");
        } // end else
    } // end addActionCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addActionNameSelectProperty() {
        addActionNameSelectProperty("actionName");
    } // end addActionNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addActionNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysRoleActionRelateDAO.ActionName, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleActionRelateDAO.ActionName, "actionName");
        } // end else
    } // end addActionNameSelectProperty()

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
            addSelectProperty(ISysRoleActionRelateDAO.DomainId, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleActionRelateDAO.DomainId, "domainId");
        } // end else
    } // end addDomainIdSelectProperty()

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
            addSelectProperty(ISysRoleActionRelateDAO.DomainName, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleActionRelateDAO.DomainName, "domainName");
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
            addSelectProperty(ISysRoleActionRelateDAO.DomainCode, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleActionRelateDAO.DomainCode, "domainCode");
        } // end else
    } // end addDomainCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addActionIdSelectProperty();

        addRemarksSelectProperty();

        addRoleIdSelectProperty();

        addStatusSelectProperty();

        addActionCodeSelectProperty();

        addActionNameSelectProperty();

        addDomainIdSelectProperty();

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
            addCriterion("SYS_ROLE_ACTION_RELATE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("SYS_ROLE_ACTION_RELATE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "SYS_ROLE_ACTION_RELATE.ID is not null AND SYS_ROLE_ACTION_RELATE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(SYS_ROLE_ACTION_RELATE.ID is null OR SYS_ROLE_ACTION_RELATE.ID = '')");

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
            addCriterion("SYS_ROLE_ACTION_RELATE.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_ROLE_ACTION_RELATE.ID");
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
            addCriterion("SYS_ROLE_ACTION_RELATE.ID <>", value, "id");

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
            addCriterion("SYS_ROLE_ACTION_RELATE.ID is null OR SYS_ROLE_ACTION_RELATE.ID <>",
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
            StringBuffer str = new StringBuffer("SYS_ROLE_ACTION_RELATE.ID");
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
            addCriterion("SYS_ROLE_ACTION_RELATE.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_ROLE_ACTION_RELATE.ID");
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
            addCriterion("SYS_ROLE_ACTION_RELATE.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_ROLE_ACTION_RELATE.ID");
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
            addCriterion("SYS_ROLE_ACTION_RELATE.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_ROLE_ACTION_RELATE.ID");
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
            addCriterion("SYS_ROLE_ACTION_RELATE.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_ROLE_ACTION_RELATE.ID");
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
                addCriterion("SYS_ROLE_ACTION_RELATE.ID in", values, "id");

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
                addCriterion("SYS_ROLE_ACTION_RELATE.ID not in", values, "id");

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
                addCriterion("SYS_ROLE_ACTION_RELATE.ID in", values, "id");

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
                addCriterion("SYS_ROLE_ACTION_RELATE.ID not in", values, "id");

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
                addCriterion("SYS_ROLE_ACTION_RELATE.ID in",
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
                addCriterion("SYS_ROLE_ACTION_RELATE.ID not in",
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
            addCriterion("SYS_ROLE_ACTION_RELATE.ID between", value1, value2,
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
            addCriterion("SYS_ROLE_ACTION_RELATE.ID between", value1, value2,
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
            addCriterion("SYS_ROLE_ACTION_RELATE.ID not between", value1,
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
            addCriterion("SYS_ROLE_ACTION_RELATE.ID not between", value1,
                value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIdIsNull() {
            addCriterion("SYS_ROLE_ACTION_RELATE.ACTION_ID is null");

            return this;
        } // end andActionIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIdIsNotNull() {
            addCriterion("SYS_ROLE_ACTION_RELATE.ACTION_ID is not null");

            return this;
        } // end andActionIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIdIsNotEmpty() {
            addCriterion(
                "SYS_ROLE_ACTION_RELATE.ACTION_ID is not null AND SYS_ROLE_ACTION_RELATE.ACTION_ID <> ''");

            return this;
        } // end andActionIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIdIsEmpty() {
            addCriterion(
                "(SYS_ROLE_ACTION_RELATE.ACTION_ID is null OR SYS_ROLE_ACTION_RELATE.ACTION_ID = '')");

            return this;
        } // end andActionIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIdEqualTo(long value) {
            return andActionIdEqualTo(Long.valueOf(value));
        } // end andActionIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIdEqualTo(java.lang.Long value) {
            addCriterion("SYS_ROLE_ACTION_RELATE.ACTION_ID =", value, "actionId");

            return this;
        } // end andActionIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_ACTION_RELATE.ACTION_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andActionIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIdNotEqualTo(long value) {
            return andActionIdNotEqualTo(Long.valueOf(value));
        } // end andActionIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIdNotEqualTo(java.lang.Long value) {
            addCriterion("SYS_ROLE_ACTION_RELATE.ACTION_ID <>", value,
                "actionId");

            return this;
        } // end andActionIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIdNotEqualToOrIsNull(long value) {
            return andActionIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andActionIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("SYS_ROLE_ACTION_RELATE.ACTION_ID is null OR SYS_ROLE_ACTION_RELATE.ACTION_ID <>",
                value, "actionId");

            return this;
        } // end andActionIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_ACTION_RELATE.ACTION_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andActionIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIdGreaterThan(long value) {
            return andActionIdGreaterThan(Long.valueOf(value));
        } // end andActionIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIdGreaterThan(java.lang.Long value) {
            addCriterion("SYS_ROLE_ACTION_RELATE.ACTION_ID >", value, "actionId");

            return this;
        } // end andActionIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_ACTION_RELATE.ACTION_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andActionIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIdGreaterThanOrEqualTo(long value) {
            return andActionIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andActionIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("SYS_ROLE_ACTION_RELATE.ACTION_ID >=", value,
                "actionId");

            return this;
        } // end andActionIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_ACTION_RELATE.ACTION_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andActionIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIdLessThan(long value) {
            return andActionIdLessThan(Long.valueOf(value));
        } // end andActionIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIdLessThan(java.lang.Long value) {
            addCriterion("SYS_ROLE_ACTION_RELATE.ACTION_ID <", value, "actionId");

            return this;
        } // end andActionIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_ACTION_RELATE.ACTION_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andActionIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIdLessThanOrEqualTo(long value) {
            return andActionIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andActionIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("SYS_ROLE_ACTION_RELATE.ACTION_ID <=", value,
                "actionId");

            return this;
        } // end andActionIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_ACTION_RELATE.ACTION_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andActionIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIdIn(long[] values) {
            if (values.length == 1) {
                return andActionIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE_ACTION_RELATE.ACTION_ID in", values,
                    "actionId");

                return this;
            } // end else
        } // end andActionIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIdNotIn(long[] values) {
            if (values.length == 1) {
                return andActionIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE_ACTION_RELATE.ACTION_ID not in", values,
                    "actionId");

                return this;
            } // end else
        } // end andActionIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIdIn(List values) {
            if (values.size() == 1) {
                return andActionIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("SYS_ROLE_ACTION_RELATE.ACTION_ID in", values,
                    "actionId");

                return this;
            } // end else
        } // end andActionIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIdNotIn(List values) {
            if (values.size() == 1) {
                return andActionIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("SYS_ROLE_ACTION_RELATE.ACTION_ID not in", values,
                    "actionId");

                return this;
            } // end else
        } // end andActionIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIdIn(Object[] values) {
            if (values.length == 1) {
                return andActionIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE_ACTION_RELATE.ACTION_ID in",
                    Arrays.asList(values), "actionId");

                return this;
            } // end else
        } // end andActionIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andActionIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE_ACTION_RELATE.ACTION_ID not in",
                    Arrays.asList(values), "actionId");

                return this;
            } // end else
        } // end andActionIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIdBetween(long value1, long value2) {
            addCriterion("SYS_ROLE_ACTION_RELATE.ACTION_ID between", value1,
                value2, "actionId");

            return this;
        } // end andActionIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("SYS_ROLE_ACTION_RELATE.ACTION_ID between", value1,
                value2, "actionId");

            return this;
        } // end andActionIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIdNotBetween(long value1, long value2) {
            addCriterion("SYS_ROLE_ACTION_RELATE.ACTION_ID not between",
                value1, value2, "actionId");

            return this;
        } // end andActionIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("SYS_ROLE_ACTION_RELATE.ACTION_ID not between",
                value1, value2, "actionId");

            return this;
        } // end andActionIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("SYS_ROLE_ACTION_RELATE.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("SYS_ROLE_ACTION_RELATE.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "SYS_ROLE_ACTION_RELATE.REMARKS is not null AND SYS_ROLE_ACTION_RELATE.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(SYS_ROLE_ACTION_RELATE.REMARKS is null OR SYS_ROLE_ACTION_RELATE.REMARKS = '')");

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
            addCriterion("SYS_ROLE_ACTION_RELATE.REMARKS =", value, "remarks");

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
                    "SYS_ROLE_ACTION_RELATE.REMARKS");
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
            addCriterion("SYS_ROLE_ACTION_RELATE.REMARKS <>", value, "remarks");

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
            addCriterion("SYS_ROLE_ACTION_RELATE.REMARKS is null OR SYS_ROLE_ACTION_RELATE.REMARKS <>",
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
                    "SYS_ROLE_ACTION_RELATE.REMARKS");
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
            addCriterion("SYS_ROLE_ACTION_RELATE.REMARKS >", value, "remarks");

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
                    "SYS_ROLE_ACTION_RELATE.REMARKS");
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
            addCriterion("SYS_ROLE_ACTION_RELATE.REMARKS >=", value, "remarks");

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
                    "SYS_ROLE_ACTION_RELATE.REMARKS");
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
            addCriterion("SYS_ROLE_ACTION_RELATE.REMARKS <", value, "remarks");

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
                    "SYS_ROLE_ACTION_RELATE.REMARKS");
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
            addCriterion("SYS_ROLE_ACTION_RELATE.REMARKS <=", value, "remarks");

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
                    "SYS_ROLE_ACTION_RELATE.REMARKS");
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
            addCriterion("SYS_ROLE_ACTION_RELATE.REMARKS like",
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
            addCriterion("SYS_ROLE_ACTION_RELATE.REMARKS not like",
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
                addCriterion("SYS_ROLE_ACTION_RELATE.REMARKS in", values,
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
                addCriterion("SYS_ROLE_ACTION_RELATE.REMARKS not in", values,
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
                addCriterion("SYS_ROLE_ACTION_RELATE.REMARKS in",
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
                addCriterion("SYS_ROLE_ACTION_RELATE.REMARKS not in",
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
            addCriterion("SYS_ROLE_ACTION_RELATE.REMARKS between", value1,
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
            addCriterion("SYS_ROLE_ACTION_RELATE.REMARKS not between", value1,
                value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdIsNull() {
            addCriterion("SYS_ROLE_ACTION_RELATE.ROLE_ID is null");

            return this;
        } // end andRoleIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdIsNotNull() {
            addCriterion("SYS_ROLE_ACTION_RELATE.ROLE_ID is not null");

            return this;
        } // end andRoleIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdIsNotEmpty() {
            addCriterion(
                "SYS_ROLE_ACTION_RELATE.ROLE_ID is not null AND SYS_ROLE_ACTION_RELATE.ROLE_ID <> ''");

            return this;
        } // end andRoleIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdIsEmpty() {
            addCriterion(
                "(SYS_ROLE_ACTION_RELATE.ROLE_ID is null OR SYS_ROLE_ACTION_RELATE.ROLE_ID = '')");

            return this;
        } // end andRoleIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdEqualTo(long value) {
            return andRoleIdEqualTo(Long.valueOf(value));
        } // end andRoleIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdEqualTo(java.lang.Long value) {
            addCriterion("SYS_ROLE_ACTION_RELATE.ROLE_ID =", value, "roleId");

            return this;
        } // end andRoleIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_ACTION_RELATE.ROLE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdNotEqualTo(long value) {
            return andRoleIdNotEqualTo(Long.valueOf(value));
        } // end andRoleIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdNotEqualTo(java.lang.Long value) {
            addCriterion("SYS_ROLE_ACTION_RELATE.ROLE_ID <>", value, "roleId");

            return this;
        } // end andRoleIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdNotEqualToOrIsNull(long value) {
            return andRoleIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andRoleIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("SYS_ROLE_ACTION_RELATE.ROLE_ID is null OR SYS_ROLE_ACTION_RELATE.ROLE_ID <>",
                value, "roleId");

            return this;
        } // end andRoleIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_ACTION_RELATE.ROLE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdGreaterThan(long value) {
            return andRoleIdGreaterThan(Long.valueOf(value));
        } // end andRoleIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdGreaterThan(java.lang.Long value) {
            addCriterion("SYS_ROLE_ACTION_RELATE.ROLE_ID >", value, "roleId");

            return this;
        } // end andRoleIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_ACTION_RELATE.ROLE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdGreaterThanOrEqualTo(long value) {
            return andRoleIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andRoleIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("SYS_ROLE_ACTION_RELATE.ROLE_ID >=", value, "roleId");

            return this;
        } // end andRoleIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_ACTION_RELATE.ROLE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdLessThan(long value) {
            return andRoleIdLessThan(Long.valueOf(value));
        } // end andRoleIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdLessThan(java.lang.Long value) {
            addCriterion("SYS_ROLE_ACTION_RELATE.ROLE_ID <", value, "roleId");

            return this;
        } // end andRoleIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_ACTION_RELATE.ROLE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdLessThanOrEqualTo(long value) {
            return andRoleIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andRoleIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("SYS_ROLE_ACTION_RELATE.ROLE_ID <=", value, "roleId");

            return this;
        } // end andRoleIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_ACTION_RELATE.ROLE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdIn(long[] values) {
            if (values.length == 1) {
                return andRoleIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE_ACTION_RELATE.ROLE_ID in", values,
                    "roleId");

                return this;
            } // end else
        } // end andRoleIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdNotIn(long[] values) {
            if (values.length == 1) {
                return andRoleIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE_ACTION_RELATE.ROLE_ID not in", values,
                    "roleId");

                return this;
            } // end else
        } // end andRoleIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdIn(List values) {
            if (values.size() == 1) {
                return andRoleIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("SYS_ROLE_ACTION_RELATE.ROLE_ID in", values,
                    "roleId");

                return this;
            } // end else
        } // end andRoleIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdNotIn(List values) {
            if (values.size() == 1) {
                return andRoleIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("SYS_ROLE_ACTION_RELATE.ROLE_ID not in", values,
                    "roleId");

                return this;
            } // end else
        } // end andRoleIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdIn(Object[] values) {
            if (values.length == 1) {
                return andRoleIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE_ACTION_RELATE.ROLE_ID in",
                    Arrays.asList(values), "roleId");

                return this;
            } // end else
        } // end andRoleIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andRoleIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE_ACTION_RELATE.ROLE_ID not in",
                    Arrays.asList(values), "roleId");

                return this;
            } // end else
        } // end andRoleIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdBetween(long value1, long value2) {
            addCriterion("SYS_ROLE_ACTION_RELATE.ROLE_ID between", value1,
                value2, "roleId");

            return this;
        } // end andRoleIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("SYS_ROLE_ACTION_RELATE.ROLE_ID between", value1,
                value2, "roleId");

            return this;
        } // end andRoleIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdNotBetween(long value1, long value2) {
            addCriterion("SYS_ROLE_ACTION_RELATE.ROLE_ID not between", value1,
                value2, "roleId");

            return this;
        } // end andRoleIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("SYS_ROLE_ACTION_RELATE.ROLE_ID not between", value1,
                value2, "roleId");

            return this;
        } // end andRoleIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("SYS_ROLE_ACTION_RELATE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("SYS_ROLE_ACTION_RELATE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "SYS_ROLE_ACTION_RELATE.STATUS is not null AND SYS_ROLE_ACTION_RELATE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(SYS_ROLE_ACTION_RELATE.STATUS is null OR SYS_ROLE_ACTION_RELATE.STATUS = '')");

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
            addCriterion("SYS_ROLE_ACTION_RELATE.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_ROLE_ACTION_RELATE.STATUS");
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
            addCriterion("SYS_ROLE_ACTION_RELATE.STATUS <>", value, "status");

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
            addCriterion("SYS_ROLE_ACTION_RELATE.STATUS is null OR SYS_ROLE_ACTION_RELATE.STATUS <>",
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
            StringBuffer str = new StringBuffer("SYS_ROLE_ACTION_RELATE.STATUS");
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
            addCriterion("SYS_ROLE_ACTION_RELATE.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_ROLE_ACTION_RELATE.STATUS");
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
            addCriterion("SYS_ROLE_ACTION_RELATE.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_ROLE_ACTION_RELATE.STATUS");
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
            addCriterion("SYS_ROLE_ACTION_RELATE.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_ROLE_ACTION_RELATE.STATUS");
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
            addCriterion("SYS_ROLE_ACTION_RELATE.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_ROLE_ACTION_RELATE.STATUS");
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
            addCriterion("SYS_ROLE_ACTION_RELATE.STATUS like",
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
            addCriterion("SYS_ROLE_ACTION_RELATE.STATUS not like",
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
                addCriterion("SYS_ROLE_ACTION_RELATE.STATUS in", values,
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
                addCriterion("SYS_ROLE_ACTION_RELATE.STATUS not in", values,
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
                addCriterion("SYS_ROLE_ACTION_RELATE.STATUS in",
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
                addCriterion("SYS_ROLE_ACTION_RELATE.STATUS not in",
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
            addCriterion("SYS_ROLE_ACTION_RELATE.STATUS between", value1,
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
            addCriterion("SYS_ROLE_ACTION_RELATE.STATUS not between", value1,
                value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionCodeIsNull() {
            addCriterion("sysActionAA.ACTION_CODE is null");

            return this;
        } // end andActionCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionCodeIsNotNull() {
            addCriterion("sysActionAA.ACTION_CODE is not null");

            return this;
        } // end andActionCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionCodeIsNotEmpty() {
            addCriterion(
                "sysActionAA.ACTION_CODE is not null AND sysActionAA.ACTION_CODE <> ''");

            return this;
        } // end andActionCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionCodeIsEmpty() {
            addCriterion(
                "(sysActionAA.ACTION_CODE is null OR sysActionAA.ACTION_CODE = '')");

            return this;
        } // end andActionCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionCodeEqualTo(String value) {
            addCriterion("sysActionAA.ACTION_CODE =", value, "actionCode");

            return this;
        } // end andActionCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionCodeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysActionAA.ACTION_CODE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andActionCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionCodeNotEqualTo(String value) {
            addCriterion("sysActionAA.ACTION_CODE <>", value, "actionCode");

            return this;
        } // end andActionCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionCodeNotEqualToOrIsNull(String value) {
            addCriterion("sysActionAA.ACTION_CODE is null OR sysActionAA.ACTION_CODE <>",
                value, "actionCode");

            return this;
        } // end andActionCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionCodeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysActionAA.ACTION_CODE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andActionCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionCodeGreaterThan(String value) {
            addCriterion("sysActionAA.ACTION_CODE >", value, "actionCode");

            return this;
        } // end andActionCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionCodeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysActionAA.ACTION_CODE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andActionCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sysActionAA.ACTION_CODE >=", value, "actionCode");

            return this;
        } // end andActionCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysActionAA.ACTION_CODE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andActionCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionCodeLessThan(String value) {
            addCriterion("sysActionAA.ACTION_CODE <", value, "actionCode");

            return this;
        } // end andActionCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionCodeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysActionAA.ACTION_CODE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andActionCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionCodeLessThanOrEqualTo(String value) {
            addCriterion("sysActionAA.ACTION_CODE <=", value, "actionCode");

            return this;
        } // end andActionCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionCodeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysActionAA.ACTION_CODE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andActionCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysActionAA.ACTION_CODE like", buffer.toString(),
                "actionCode");

            return this;
        } // end andActionCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysActionAA.ACTION_CODE not like", buffer.toString(),
                "actionCode");

            return this;
        } // end andActionCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionCodeIn(List values) {
            if (values.size() == 1) {
                return andActionCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysActionAA.ACTION_CODE in", values, "actionCode");

                return this;
            } // end else
        } // end andActionCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionCodeNotIn(List values) {
            if (values.size() == 1) {
                return andActionCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysActionAA.ACTION_CODE not in", values,
                    "actionCode");

                return this;
            } // end else
        } // end andActionCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionCodeIn(Object[] values) {
            if (values.length == 1) {
                return andActionCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysActionAA.ACTION_CODE in",
                    Arrays.asList(values), "actionCode");

                return this;
            } // end else
        } // end andActionCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andActionCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysActionAA.ACTION_CODE not in",
                    Arrays.asList(values), "actionCode");

                return this;
            } // end else
        } // end andActionCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionCodeBetween(String value1, String value2) {
            addCriterion("sysActionAA.ACTION_CODE between", value1, value2,
                "actionCode");

            return this;
        } // end andActionCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionCodeNotBetween(String value1, String value2) {
            addCriterion("sysActionAA.ACTION_CODE not between", value1, value2,
                "actionCode");

            return this;
        } // end andActionCodeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionNameIsNull() {
            addCriterion("sysActionAA.ACTION_NAME is null");

            return this;
        } // end andActionNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionNameIsNotNull() {
            addCriterion("sysActionAA.ACTION_NAME is not null");

            return this;
        } // end andActionNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionNameIsNotEmpty() {
            addCriterion(
                "sysActionAA.ACTION_NAME is not null AND sysActionAA.ACTION_NAME <> ''");

            return this;
        } // end andActionNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionNameIsEmpty() {
            addCriterion(
                "(sysActionAA.ACTION_NAME is null OR sysActionAA.ACTION_NAME = '')");

            return this;
        } // end andActionNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionNameEqualTo(String value) {
            addCriterion("sysActionAA.ACTION_NAME =", value, "actionName");

            return this;
        } // end andActionNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysActionAA.ACTION_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andActionNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionNameNotEqualTo(String value) {
            addCriterion("sysActionAA.ACTION_NAME <>", value, "actionName");

            return this;
        } // end andActionNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionNameNotEqualToOrIsNull(String value) {
            addCriterion("sysActionAA.ACTION_NAME is null OR sysActionAA.ACTION_NAME <>",
                value, "actionName");

            return this;
        } // end andActionNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysActionAA.ACTION_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andActionNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionNameGreaterThan(String value) {
            addCriterion("sysActionAA.ACTION_NAME >", value, "actionName");

            return this;
        } // end andActionNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionNameGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysActionAA.ACTION_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andActionNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionNameGreaterThanOrEqualTo(String value) {
            addCriterion("sysActionAA.ACTION_NAME >=", value, "actionName");

            return this;
        } // end andActionNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysActionAA.ACTION_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andActionNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionNameLessThan(String value) {
            addCriterion("sysActionAA.ACTION_NAME <", value, "actionName");

            return this;
        } // end andActionNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysActionAA.ACTION_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andActionNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionNameLessThanOrEqualTo(String value) {
            addCriterion("sysActionAA.ACTION_NAME <=", value, "actionName");

            return this;
        } // end andActionNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysActionAA.ACTION_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andActionNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysActionAA.ACTION_NAME like", buffer.toString(),
                "actionName");

            return this;
        } // end andActionNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysActionAA.ACTION_NAME not like", buffer.toString(),
                "actionName");

            return this;
        } // end andActionNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionNameIn(List values) {
            if (values.size() == 1) {
                return andActionNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysActionAA.ACTION_NAME in", values, "actionName");

                return this;
            } // end else
        } // end andActionNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionNameNotIn(List values) {
            if (values.size() == 1) {
                return andActionNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysActionAA.ACTION_NAME not in", values,
                    "actionName");

                return this;
            } // end else
        } // end andActionNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionNameIn(Object[] values) {
            if (values.length == 1) {
                return andActionNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysActionAA.ACTION_NAME in",
                    Arrays.asList(values), "actionName");

                return this;
            } // end else
        } // end andActionNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andActionNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysActionAA.ACTION_NAME not in",
                    Arrays.asList(values), "actionName");

                return this;
            } // end else
        } // end andActionNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionNameBetween(String value1, String value2) {
            addCriterion("sysActionAA.ACTION_NAME between", value1, value2,
                "actionName");

            return this;
        } // end andActionNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionNameNotBetween(String value1, String value2) {
            addCriterion("sysActionAA.ACTION_NAME not between", value1, value2,
                "actionName");

            return this;
        } // end andActionNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdIsNull() {
            addCriterion("sysActionAA.DOMAIN_ID is null");

            return this;
        } // end andDomainIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdIsNotNull() {
            addCriterion("sysActionAA.DOMAIN_ID is not null");

            return this;
        } // end andDomainIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdIsNotEmpty() {
            addCriterion(
                "sysActionAA.DOMAIN_ID is not null AND sysActionAA.DOMAIN_ID <> ''");

            return this;
        } // end andDomainIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdIsEmpty() {
            addCriterion(
                "(sysActionAA.DOMAIN_ID is null OR sysActionAA.DOMAIN_ID = '')");

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
            addCriterion("sysActionAA.DOMAIN_ID =", value, "domainId");

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
            StringBuffer str = new StringBuffer("sysActionAA.DOMAIN_ID");
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
            addCriterion("sysActionAA.DOMAIN_ID <>", value, "domainId");

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
            addCriterion("sysActionAA.DOMAIN_ID is null OR sysActionAA.DOMAIN_ID <>",
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
            StringBuffer str = new StringBuffer("sysActionAA.DOMAIN_ID");
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
            addCriterion("sysActionAA.DOMAIN_ID >", value, "domainId");

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
            StringBuffer str = new StringBuffer("sysActionAA.DOMAIN_ID");
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
            addCriterion("sysActionAA.DOMAIN_ID >=", value, "domainId");

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
            StringBuffer str = new StringBuffer("sysActionAA.DOMAIN_ID");
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
            addCriterion("sysActionAA.DOMAIN_ID <", value, "domainId");

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
            StringBuffer str = new StringBuffer("sysActionAA.DOMAIN_ID");
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
            addCriterion("sysActionAA.DOMAIN_ID <=", value, "domainId");

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
            StringBuffer str = new StringBuffer("sysActionAA.DOMAIN_ID");
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
                addCriterion("sysActionAA.DOMAIN_ID in", values, "domainId");

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
                addCriterion("sysActionAA.DOMAIN_ID not in", values, "domainId");

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
                addCriterion("sysActionAA.DOMAIN_ID in", values, "domainId");

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
                addCriterion("sysActionAA.DOMAIN_ID not in", values, "domainId");

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
                addCriterion("sysActionAA.DOMAIN_ID in", Arrays.asList(values),
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
                addCriterion("sysActionAA.DOMAIN_ID not in",
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
            addCriterion("sysActionAA.DOMAIN_ID between", value1, value2,
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
            addCriterion("sysActionAA.DOMAIN_ID between", value1, value2,
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
            addCriterion("sysActionAA.DOMAIN_ID not between", value1, value2,
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
            addCriterion("sysActionAA.DOMAIN_ID not between", value1, value2,
                "domainId");

            return this;
        } // end andDomainIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameIsNull() {
            addCriterion("sysDomainAA.DOMAIN_NAME is null");

            return this;
        } // end andDomainNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameIsNotNull() {
            addCriterion("sysDomainAA.DOMAIN_NAME is not null");

            return this;
        } // end andDomainNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameIsNotEmpty() {
            addCriterion(
                "sysDomainAA.DOMAIN_NAME is not null AND sysDomainAA.DOMAIN_NAME <> ''");

            return this;
        } // end andDomainNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameIsEmpty() {
            addCriterion(
                "(sysDomainAA.DOMAIN_NAME is null OR sysDomainAA.DOMAIN_NAME = '')");

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
            addCriterion("sysDomainAA.DOMAIN_NAME =", value, "domainName");

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
            StringBuffer str = new StringBuffer("sysDomainAA.DOMAIN_NAME");
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
            addCriterion("sysDomainAA.DOMAIN_NAME <>", value, "domainName");

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
            addCriterion("sysDomainAA.DOMAIN_NAME is null OR sysDomainAA.DOMAIN_NAME <>",
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
            StringBuffer str = new StringBuffer("sysDomainAA.DOMAIN_NAME");
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
            addCriterion("sysDomainAA.DOMAIN_NAME >", value, "domainName");

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
            StringBuffer str = new StringBuffer("sysDomainAA.DOMAIN_NAME");
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
            addCriterion("sysDomainAA.DOMAIN_NAME >=", value, "domainName");

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
            StringBuffer str = new StringBuffer("sysDomainAA.DOMAIN_NAME");
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
            addCriterion("sysDomainAA.DOMAIN_NAME <", value, "domainName");

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
            StringBuffer str = new StringBuffer("sysDomainAA.DOMAIN_NAME");
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
            addCriterion("sysDomainAA.DOMAIN_NAME <=", value, "domainName");

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
            StringBuffer str = new StringBuffer("sysDomainAA.DOMAIN_NAME");
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
            addCriterion("sysDomainAA.DOMAIN_NAME like", buffer.toString(),
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
            addCriterion("sysDomainAA.DOMAIN_NAME not like", buffer.toString(),
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
                addCriterion("sysDomainAA.DOMAIN_NAME in", values, "domainName");

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
                addCriterion("sysDomainAA.DOMAIN_NAME not in", values,
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
                addCriterion("sysDomainAA.DOMAIN_NAME in",
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
                addCriterion("sysDomainAA.DOMAIN_NAME not in",
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
            addCriterion("sysDomainAA.DOMAIN_NAME between", value1, value2,
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
            addCriterion("sysDomainAA.DOMAIN_NAME not between", value1, value2,
                "domainName");

            return this;
        } // end andDomainNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainCodeIsNull() {
            addCriterion("sysDomainAA.DOMAIN_CODE is null");

            return this;
        } // end andDomainCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainCodeIsNotNull() {
            addCriterion("sysDomainAA.DOMAIN_CODE is not null");

            return this;
        } // end andDomainCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainCodeIsNotEmpty() {
            addCriterion(
                "sysDomainAA.DOMAIN_CODE is not null AND sysDomainAA.DOMAIN_CODE <> ''");

            return this;
        } // end andDomainCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainCodeIsEmpty() {
            addCriterion(
                "(sysDomainAA.DOMAIN_CODE is null OR sysDomainAA.DOMAIN_CODE = '')");

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
            addCriterion("sysDomainAA.DOMAIN_CODE =", value, "domainCode");

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
            StringBuffer str = new StringBuffer("sysDomainAA.DOMAIN_CODE");
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
            addCriterion("sysDomainAA.DOMAIN_CODE <>", value, "domainCode");

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
            addCriterion("sysDomainAA.DOMAIN_CODE is null OR sysDomainAA.DOMAIN_CODE <>",
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
            StringBuffer str = new StringBuffer("sysDomainAA.DOMAIN_CODE");
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
            addCriterion("sysDomainAA.DOMAIN_CODE >", value, "domainCode");

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
            StringBuffer str = new StringBuffer("sysDomainAA.DOMAIN_CODE");
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
            addCriterion("sysDomainAA.DOMAIN_CODE >=", value, "domainCode");

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
            StringBuffer str = new StringBuffer("sysDomainAA.DOMAIN_CODE");
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
            addCriterion("sysDomainAA.DOMAIN_CODE <", value, "domainCode");

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
            StringBuffer str = new StringBuffer("sysDomainAA.DOMAIN_CODE");
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
            addCriterion("sysDomainAA.DOMAIN_CODE <=", value, "domainCode");

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
            StringBuffer str = new StringBuffer("sysDomainAA.DOMAIN_CODE");
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
            addCriterion("sysDomainAA.DOMAIN_CODE like", buffer.toString(),
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
            addCriterion("sysDomainAA.DOMAIN_CODE not like", buffer.toString(),
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
                addCriterion("sysDomainAA.DOMAIN_CODE in", values, "domainCode");

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
                addCriterion("sysDomainAA.DOMAIN_CODE not in", values,
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
                addCriterion("sysDomainAA.DOMAIN_CODE in",
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
                addCriterion("sysDomainAA.DOMAIN_CODE not in",
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
            addCriterion("sysDomainAA.DOMAIN_CODE between", value1, value2,
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
            addCriterion("sysDomainAA.DOMAIN_CODE not between", value1, value2,
                "domainCode");

            return this;
        } // end andDomainCodeNotBetween()
    } // end Criteria
} // end SysRoleActionRelateDAOQueryBean
