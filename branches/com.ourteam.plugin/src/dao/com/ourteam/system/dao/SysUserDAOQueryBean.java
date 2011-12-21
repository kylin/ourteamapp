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
 * SysUser query bean 2011-11-07 09:51:15
 *
 * @author Auto Gen
 */
public class SysUserDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new SysUserDAOQueryBean object.
     */
    public SysUserDAOQueryBean() {
        super();
    } // end SysUserDAOQueryBean()

    /**
     * Creates a new SysUserDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public SysUserDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end SysUserDAOQueryBean()

    /**
     * Creates a new SysUserDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public SysUserDAOQueryBean(BaseQueryBean aQueryBean, Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end SysUserDAOQueryBean()

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
            addSelectProperty(ISysUserDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(ISysUserDAO.Id, "id");
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
            addSelectProperty(ISysUserDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(ISysUserDAO.Remarks, "remarks");
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
            addSelectProperty(ISysUserDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(ISysUserDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addUserAccountSelectProperty() {
        addUserAccountSelectProperty("userAccount");
    } // end addUserAccountSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addUserAccountSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysUserDAO.UserAccount, aAlias);
        } // end if
        else {
            addSelectProperty(ISysUserDAO.UserAccount, "userAccount");
        } // end else
    } // end addUserAccountSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addUserNameSelectProperty() {
        addUserNameSelectProperty("userName");
    } // end addUserNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addUserNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysUserDAO.UserName, aAlias);
        } // end if
        else {
            addSelectProperty(ISysUserDAO.UserName, "userName");
        } // end else
    } // end addUserNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addUserTypeSelectProperty() {
        addUserTypeSelectProperty("userType");
    } // end addUserTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addUserTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysUserDAO.UserType, aAlias);
        } // end if
        else {
            addSelectProperty(ISysUserDAO.UserType, "userType");
        } // end else
    } // end addUserTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addPasswordSelectProperty() {
        addPasswordSelectProperty("password");
    } // end addPasswordSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addPasswordSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysUserDAO.Password, aAlias);
        } // end if
        else {
            addSelectProperty(ISysUserDAO.Password, "password");
        } // end else
    } // end addPasswordSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addRemarksSelectProperty();

        addStatusSelectProperty();

        addUserAccountSelectProperty();

        addUserNameSelectProperty();

        addUserTypeSelectProperty();

        addPasswordSelectProperty();
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
            addCriterion("SYS_USER.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("SYS_USER.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion("SYS_USER.ID is not null AND SYS_USER.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion("(SYS_USER.ID is null OR SYS_USER.ID = '')");

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
            addCriterion("SYS_USER.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_USER.ID");
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
            addCriterion("SYS_USER.ID <>", value, "id");

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
            addCriterion("SYS_USER.ID is null OR SYS_USER.ID <>", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_USER.ID");
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
            addCriterion("SYS_USER.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_USER.ID");
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
            addCriterion("SYS_USER.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_USER.ID");
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
            addCriterion("SYS_USER.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_USER.ID");
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
            addCriterion("SYS_USER.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_USER.ID");
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
                addCriterion("SYS_USER.ID in", values, "id");

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
                addCriterion("SYS_USER.ID not in", values, "id");

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
                addCriterion("SYS_USER.ID in", values, "id");

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
                addCriterion("SYS_USER.ID not in", values, "id");

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
                addCriterion("SYS_USER.ID in", Arrays.asList(values), "id");

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
                addCriterion("SYS_USER.ID not in", Arrays.asList(values), "id");

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
            addCriterion("SYS_USER.ID between", value1, value2, "id");

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
            addCriterion("SYS_USER.ID between", value1, value2, "id");

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
            addCriterion("SYS_USER.ID not between", value1, value2, "id");

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
            addCriterion("SYS_USER.ID not between", value1, value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("SYS_USER.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("SYS_USER.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "SYS_USER.REMARKS is not null AND SYS_USER.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion("(SYS_USER.REMARKS is null OR SYS_USER.REMARKS = '')");

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
            addCriterion("SYS_USER.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_USER.REMARKS");
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
            addCriterion("SYS_USER.REMARKS <>", value, "remarks");

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
            addCriterion("SYS_USER.REMARKS is null OR SYS_USER.REMARKS <>",
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
            StringBuffer str = new StringBuffer("SYS_USER.REMARKS");
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
            addCriterion("SYS_USER.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_USER.REMARKS");
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
            addCriterion("SYS_USER.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_USER.REMARKS");
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
            addCriterion("SYS_USER.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_USER.REMARKS");
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
            addCriterion("SYS_USER.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_USER.REMARKS");
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
            addCriterion("SYS_USER.REMARKS like", buffer.toString(), "remarks");

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
            addCriterion("SYS_USER.REMARKS not like", buffer.toString(),
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
                addCriterion("SYS_USER.REMARKS in", values, "remarks");

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
                addCriterion("SYS_USER.REMARKS not in", values, "remarks");

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
                addCriterion("SYS_USER.REMARKS in", Arrays.asList(values),
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
                addCriterion("SYS_USER.REMARKS not in", Arrays.asList(values),
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
            addCriterion("SYS_USER.REMARKS between", value1, value2, "remarks");

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
            addCriterion("SYS_USER.REMARKS not between", value1, value2,
                "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("SYS_USER.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("SYS_USER.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "SYS_USER.STATUS is not null AND SYS_USER.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion("(SYS_USER.STATUS is null OR SYS_USER.STATUS = '')");

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
            addCriterion("SYS_USER.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_USER.STATUS");
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
            addCriterion("SYS_USER.STATUS <>", value, "status");

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
            addCriterion("SYS_USER.STATUS is null OR SYS_USER.STATUS <>",
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
            StringBuffer str = new StringBuffer("SYS_USER.STATUS");
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
            addCriterion("SYS_USER.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_USER.STATUS");
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
            addCriterion("SYS_USER.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_USER.STATUS");
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
            addCriterion("SYS_USER.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_USER.STATUS");
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
            addCriterion("SYS_USER.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_USER.STATUS");
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
            addCriterion("SYS_USER.STATUS like", buffer.toString(), "status");

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
            addCriterion("SYS_USER.STATUS not like", buffer.toString(), "status");

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
                addCriterion("SYS_USER.STATUS in", values, "status");

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
                addCriterion("SYS_USER.STATUS not in", values, "status");

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
                addCriterion("SYS_USER.STATUS in", Arrays.asList(values),
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
                addCriterion("SYS_USER.STATUS not in", Arrays.asList(values),
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
            addCriterion("SYS_USER.STATUS between", value1, value2, "status");

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
            addCriterion("SYS_USER.STATUS not between", value1, value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserAccountIsNull() {
            addCriterion("SYS_USER.USER_ACCOUNT is null");

            return this;
        } // end andUserAccountIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserAccountIsNotNull() {
            addCriterion("SYS_USER.USER_ACCOUNT is not null");

            return this;
        } // end andUserAccountIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserAccountIsNotEmpty() {
            addCriterion(
                "SYS_USER.USER_ACCOUNT is not null AND SYS_USER.USER_ACCOUNT <> ''");

            return this;
        } // end andUserAccountIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserAccountIsEmpty() {
            addCriterion(
                "(SYS_USER.USER_ACCOUNT is null OR SYS_USER.USER_ACCOUNT = '')");

            return this;
        } // end andUserAccountIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserAccountEqualTo(String value) {
            addCriterion("SYS_USER.USER_ACCOUNT =", value, "userAccount");

            return this;
        } // end andUserAccountEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserAccountEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_USER.USER_ACCOUNT");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUserAccountEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserAccountNotEqualTo(String value) {
            addCriterion("SYS_USER.USER_ACCOUNT <>", value, "userAccount");

            return this;
        } // end andUserAccountNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserAccountNotEqualToOrIsNull(String value) {
            addCriterion("SYS_USER.USER_ACCOUNT is null OR SYS_USER.USER_ACCOUNT <>",
                value, "userAccount");

            return this;
        } // end andUserAccountNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserAccountNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_USER.USER_ACCOUNT");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUserAccountNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserAccountGreaterThan(String value) {
            addCriterion("SYS_USER.USER_ACCOUNT >", value, "userAccount");

            return this;
        } // end andUserAccountGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserAccountGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_USER.USER_ACCOUNT");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUserAccountGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserAccountGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_USER.USER_ACCOUNT >=", value, "userAccount");

            return this;
        } // end andUserAccountGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserAccountGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_USER.USER_ACCOUNT");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUserAccountGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserAccountLessThan(String value) {
            addCriterion("SYS_USER.USER_ACCOUNT <", value, "userAccount");

            return this;
        } // end andUserAccountLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserAccountLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_USER.USER_ACCOUNT");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUserAccountLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserAccountLessThanOrEqualTo(String value) {
            addCriterion("SYS_USER.USER_ACCOUNT <=", value, "userAccount");

            return this;
        } // end andUserAccountLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserAccountLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_USER.USER_ACCOUNT");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUserAccountLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserAccountLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_USER.USER_ACCOUNT like", buffer.toString(),
                "userAccount");

            return this;
        } // end andUserAccountLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserAccountNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_USER.USER_ACCOUNT not like", buffer.toString(),
                "userAccount");

            return this;
        } // end andUserAccountNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserAccountIn(List values) {
            if (values.size() == 1) {
                return andUserAccountEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_USER.USER_ACCOUNT in", values, "userAccount");

                return this;
            } // end else
        } // end andUserAccountIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserAccountNotIn(List values) {
            if (values.size() == 1) {
                return andUserAccountNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_USER.USER_ACCOUNT not in", values,
                    "userAccount");

                return this;
            } // end else
        } // end andUserAccountNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserAccountIn(Object[] values) {
            if (values.length == 1) {
                return andUserAccountEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_USER.USER_ACCOUNT in", Arrays.asList(values),
                    "userAccount");

                return this;
            } // end else
        } // end andUserAccountIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserAccountNotIn(Object[] values) {
            if (values.length == 1) {
                return andUserAccountNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_USER.USER_ACCOUNT not in",
                    Arrays.asList(values), "userAccount");

                return this;
            } // end else
        } // end andUserAccountNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserAccountBetween(String value1, String value2) {
            addCriterion("SYS_USER.USER_ACCOUNT between", value1, value2,
                "userAccount");

            return this;
        } // end andUserAccountBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserAccountNotBetween(String value1, String value2) {
            addCriterion("SYS_USER.USER_ACCOUNT not between", value1, value2,
                "userAccount");

            return this;
        } // end andUserAccountNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNameIsNull() {
            addCriterion("SYS_USER.USER_NAME is null");

            return this;
        } // end andUserNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNameIsNotNull() {
            addCriterion("SYS_USER.USER_NAME is not null");

            return this;
        } // end andUserNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNameIsNotEmpty() {
            addCriterion(
                "SYS_USER.USER_NAME is not null AND SYS_USER.USER_NAME <> ''");

            return this;
        } // end andUserNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNameIsEmpty() {
            addCriterion(
                "(SYS_USER.USER_NAME is null OR SYS_USER.USER_NAME = '')");

            return this;
        } // end andUserNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNameEqualTo(String value) {
            addCriterion("SYS_USER.USER_NAME =", value, "userName");

            return this;
        } // end andUserNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_USER.USER_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUserNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("SYS_USER.USER_NAME <>", value, "userName");

            return this;
        } // end andUserNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNameNotEqualToOrIsNull(String value) {
            addCriterion("SYS_USER.USER_NAME is null OR SYS_USER.USER_NAME <>",
                value, "userName");

            return this;
        } // end andUserNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_USER.USER_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUserNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("SYS_USER.USER_NAME >", value, "userName");

            return this;
        } // end andUserNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNameGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_USER.USER_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUserNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_USER.USER_NAME >=", value, "userName");

            return this;
        } // end andUserNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_USER.USER_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUserNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNameLessThan(String value) {
            addCriterion("SYS_USER.USER_NAME <", value, "userName");

            return this;
        } // end andUserNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_USER.USER_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUserNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("SYS_USER.USER_NAME <=", value, "userName");

            return this;
        } // end andUserNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_USER.USER_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUserNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_USER.USER_NAME like", buffer.toString(),
                "userName");

            return this;
        } // end andUserNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_USER.USER_NAME not like", buffer.toString(),
                "userName");

            return this;
        } // end andUserNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNameIn(List values) {
            if (values.size() == 1) {
                return andUserNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_USER.USER_NAME in", values, "userName");

                return this;
            } // end else
        } // end andUserNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNameNotIn(List values) {
            if (values.size() == 1) {
                return andUserNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_USER.USER_NAME not in", values, "userName");

                return this;
            } // end else
        } // end andUserNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNameIn(Object[] values) {
            if (values.length == 1) {
                return andUserNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_USER.USER_NAME in", Arrays.asList(values),
                    "userName");

                return this;
            } // end else
        } // end andUserNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andUserNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_USER.USER_NAME not in",
                    Arrays.asList(values), "userName");

                return this;
            } // end else
        } // end andUserNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("SYS_USER.USER_NAME between", value1, value2,
                "userName");

            return this;
        } // end andUserNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("SYS_USER.USER_NAME not between", value1, value2,
                "userName");

            return this;
        } // end andUserNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserTypeIsNull() {
            addCriterion("SYS_USER.USER_TYPE is null");

            return this;
        } // end andUserTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserTypeIsNotNull() {
            addCriterion("SYS_USER.USER_TYPE is not null");

            return this;
        } // end andUserTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserTypeIsNotEmpty() {
            addCriterion(
                "SYS_USER.USER_TYPE is not null AND SYS_USER.USER_TYPE <> ''");

            return this;
        } // end andUserTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserTypeIsEmpty() {
            addCriterion(
                "(SYS_USER.USER_TYPE is null OR SYS_USER.USER_TYPE = '')");

            return this;
        } // end andUserTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("SYS_USER.USER_TYPE =", value, "userType");

            return this;
        } // end andUserTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserTypeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_USER.USER_TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUserTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("SYS_USER.USER_TYPE <>", value, "userType");

            return this;
        } // end andUserTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserTypeNotEqualToOrIsNull(String value) {
            addCriterion("SYS_USER.USER_TYPE is null OR SYS_USER.USER_TYPE <>",
                value, "userType");

            return this;
        } // end andUserTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserTypeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_USER.USER_TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUserTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("SYS_USER.USER_TYPE >", value, "userType");

            return this;
        } // end andUserTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserTypeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_USER.USER_TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUserTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_USER.USER_TYPE >=", value, "userType");

            return this;
        } // end andUserTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_USER.USER_TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUserTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserTypeLessThan(String value) {
            addCriterion("SYS_USER.USER_TYPE <", value, "userType");

            return this;
        } // end andUserTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserTypeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_USER.USER_TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUserTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("SYS_USER.USER_TYPE <=", value, "userType");

            return this;
        } // end andUserTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_USER.USER_TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUserTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_USER.USER_TYPE like", buffer.toString(),
                "userType");

            return this;
        } // end andUserTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_USER.USER_TYPE not like", buffer.toString(),
                "userType");

            return this;
        } // end andUserTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserTypeIn(List values) {
            if (values.size() == 1) {
                return andUserTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_USER.USER_TYPE in", values, "userType");

                return this;
            } // end else
        } // end andUserTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserTypeNotIn(List values) {
            if (values.size() == 1) {
                return andUserTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_USER.USER_TYPE not in", values, "userType");

                return this;
            } // end else
        } // end andUserTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserTypeIn(Object[] values) {
            if (values.length == 1) {
                return andUserTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_USER.USER_TYPE in", Arrays.asList(values),
                    "userType");

                return this;
            } // end else
        } // end andUserTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andUserTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_USER.USER_TYPE not in",
                    Arrays.asList(values), "userType");

                return this;
            } // end else
        } // end andUserTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("SYS_USER.USER_TYPE between", value1, value2,
                "userType");

            return this;
        } // end andUserTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("SYS_USER.USER_TYPE not between", value1, value2,
                "userType");

            return this;
        } // end andUserTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordIsNull() {
            addCriterion("SYS_USER.PASSWORD is null");

            return this;
        } // end andPasswordIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordIsNotNull() {
            addCriterion("SYS_USER.PASSWORD is not null");

            return this;
        } // end andPasswordIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordIsNotEmpty() {
            addCriterion(
                "SYS_USER.PASSWORD is not null AND SYS_USER.PASSWORD <> ''");

            return this;
        } // end andPasswordIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordIsEmpty() {
            addCriterion(
                "(SYS_USER.PASSWORD is null OR SYS_USER.PASSWORD = '')");

            return this;
        } // end andPasswordIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordEqualTo(String value) {
            addCriterion("SYS_USER.PASSWORD =", value, "password");

            return this;
        } // end andPasswordEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_USER.PASSWORD");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPasswordEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("SYS_USER.PASSWORD <>", value, "password");

            return this;
        } // end andPasswordNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordNotEqualToOrIsNull(String value) {
            addCriterion("SYS_USER.PASSWORD is null OR SYS_USER.PASSWORD <>",
                value, "password");

            return this;
        } // end andPasswordNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_USER.PASSWORD");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPasswordNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("SYS_USER.PASSWORD >", value, "password");

            return this;
        } // end andPasswordGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_USER.PASSWORD");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPasswordGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_USER.PASSWORD >=", value, "password");

            return this;
        } // end andPasswordGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_USER.PASSWORD");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPasswordGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordLessThan(String value) {
            addCriterion("SYS_USER.PASSWORD <", value, "password");

            return this;
        } // end andPasswordLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_USER.PASSWORD");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPasswordLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("SYS_USER.PASSWORD <=", value, "password");

            return this;
        } // end andPasswordLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("SYS_USER.PASSWORD");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPasswordLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_USER.PASSWORD like", buffer.toString(), "password");

            return this;
        } // end andPasswordLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_USER.PASSWORD not like", buffer.toString(),
                "password");

            return this;
        } // end andPasswordNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordIn(List values) {
            if (values.size() == 1) {
                return andPasswordEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_USER.PASSWORD in", values, "password");

                return this;
            } // end else
        } // end andPasswordIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordNotIn(List values) {
            if (values.size() == 1) {
                return andPasswordNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_USER.PASSWORD not in", values, "password");

                return this;
            } // end else
        } // end andPasswordNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordIn(Object[] values) {
            if (values.length == 1) {
                return andPasswordEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_USER.PASSWORD in", Arrays.asList(values),
                    "password");

                return this;
            } // end else
        } // end andPasswordIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordNotIn(Object[] values) {
            if (values.length == 1) {
                return andPasswordNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_USER.PASSWORD not in", Arrays.asList(values),
                    "password");

                return this;
            } // end else
        } // end andPasswordNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("SYS_USER.PASSWORD between", value1, value2, "password");

            return this;
        } // end andPasswordBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("SYS_USER.PASSWORD not between", value1, value2,
                "password");

            return this;
        } // end andPasswordNotBetween()
    } // end Criteria
} // end SysUserDAOQueryBean
