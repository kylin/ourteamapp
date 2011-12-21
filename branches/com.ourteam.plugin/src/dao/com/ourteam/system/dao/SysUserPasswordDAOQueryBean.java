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
 * SysUserPassword query bean 2011-09-22 10:11:25
 *
 * @author Auto Gen
 */
public class SysUserPasswordDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new SysUserPasswordDAOQueryBean object.
     */
    public SysUserPasswordDAOQueryBean() {
        super();
    } // end SysUserPasswordDAOQueryBean()

    /**
     * Creates a new SysUserPasswordDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public SysUserPasswordDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end SysUserPasswordDAOQueryBean()

    /**
     * Creates a new SysUserPasswordDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public SysUserPasswordDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end SysUserPasswordDAOQueryBean()

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
            addSelectProperty(ISysUserPasswordDAO.UserName, aAlias);
        } // end if
        else {
            addSelectProperty(ISysUserPasswordDAO.UserName, "userName");
        } // end else
    } // end addUserNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addEnabledSelectProperty() {
        addEnabledSelectProperty("enabled");
    } // end addEnabledSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addEnabledSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysUserPasswordDAO.Enabled, aAlias);
        } // end if
        else {
            addSelectProperty(ISysUserPasswordDAO.Enabled, "enabled");
        } // end else
    } // end addEnabledSelectProperty()

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
            addSelectProperty(ISysUserPasswordDAO.Password, aAlias);
        } // end if
        else {
            addSelectProperty(ISysUserPasswordDAO.Password, "password");
        } // end else
    } // end addPasswordSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addUserNameSelectProperty();

        addEnabledSelectProperty();

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
        public Criteria andUserNameIsNull() {
            addCriterion("USERS.USERNAME is null");

            return this;
        } // end andUserNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNameIsNotNull() {
            addCriterion("USERS.USERNAME is not null");

            return this;
        } // end andUserNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNameIsNotEmpty() {
            addCriterion("USERS.USERNAME is not null AND USERS.USERNAME <> ''");

            return this;
        } // end andUserNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNameIsEmpty() {
            addCriterion("(USERS.USERNAME is null OR USERS.USERNAME = '')");

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
            addCriterion("USERS.USERNAME =", value, "userName");

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
            StringBuffer str = new StringBuffer("USERS.USERNAME");
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
            addCriterion("USERS.USERNAME <>", value, "userName");

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
            addCriterion("USERS.USERNAME is null OR USERS.USERNAME <>", value,
                "userName");

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
            StringBuffer str = new StringBuffer("USERS.USERNAME");
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
            addCriterion("USERS.USERNAME >", value, "userName");

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
            StringBuffer str = new StringBuffer("USERS.USERNAME");
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
            addCriterion("USERS.USERNAME >=", value, "userName");

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
            StringBuffer str = new StringBuffer("USERS.USERNAME");
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
            addCriterion("USERS.USERNAME <", value, "userName");

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
            StringBuffer str = new StringBuffer("USERS.USERNAME");
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
            addCriterion("USERS.USERNAME <=", value, "userName");

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
            StringBuffer str = new StringBuffer("USERS.USERNAME");
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
            addCriterion("USERS.USERNAME like", buffer.toString(), "userName");

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
            addCriterion("USERS.USERNAME not like", buffer.toString(),
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
                addCriterion("USERS.USERNAME in", values, "userName");

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
                addCriterion("USERS.USERNAME not in", values, "userName");

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
                addCriterion("USERS.USERNAME in", Arrays.asList(values),
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
                addCriterion("USERS.USERNAME not in", Arrays.asList(values),
                    "userName");

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
            addCriterion("USERS.USERNAME between", value1, value2, "userName");

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
            addCriterion("USERS.USERNAME not between", value1, value2,
                "userName");

            return this;
        } // end andUserNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEnabledIsNull() {
            addCriterion("USERS.ENABLED is null");

            return this;
        } // end andEnabledIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEnabledIsNotNull() {
            addCriterion("USERS.ENABLED is not null");

            return this;
        } // end andEnabledIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEnabledIsNotEmpty() {
            addCriterion("USERS.ENABLED is not null AND USERS.ENABLED <> ''");

            return this;
        } // end andEnabledIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEnabledIsEmpty() {
            addCriterion("(USERS.ENABLED is null OR USERS.ENABLED = '')");

            return this;
        } // end andEnabledIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEnabledEqualTo(String value) {
            addCriterion("USERS.ENABLED =", value, "enabled");

            return this;
        } // end andEnabledEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEnabledEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("USERS.ENABLED");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEnabledEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEnabledNotEqualTo(String value) {
            addCriterion("USERS.ENABLED <>", value, "enabled");

            return this;
        } // end andEnabledNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEnabledNotEqualToOrIsNull(String value) {
            addCriterion("USERS.ENABLED is null OR USERS.ENABLED <>", value,
                "enabled");

            return this;
        } // end andEnabledNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEnabledNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("USERS.ENABLED");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEnabledNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEnabledGreaterThan(String value) {
            addCriterion("USERS.ENABLED >", value, "enabled");

            return this;
        } // end andEnabledGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEnabledGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("USERS.ENABLED");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEnabledGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEnabledGreaterThanOrEqualTo(String value) {
            addCriterion("USERS.ENABLED >=", value, "enabled");

            return this;
        } // end andEnabledGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEnabledGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("USERS.ENABLED");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEnabledGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEnabledLessThan(String value) {
            addCriterion("USERS.ENABLED <", value, "enabled");

            return this;
        } // end andEnabledLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEnabledLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("USERS.ENABLED");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEnabledLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEnabledLessThanOrEqualTo(String value) {
            addCriterion("USERS.ENABLED <=", value, "enabled");

            return this;
        } // end andEnabledLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEnabledLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("USERS.ENABLED");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEnabledLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEnabledLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("USERS.ENABLED like", buffer.toString(), "enabled");

            return this;
        } // end andEnabledLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEnabledNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("USERS.ENABLED not like", buffer.toString(), "enabled");

            return this;
        } // end andEnabledNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEnabledIn(List values) {
            if (values.size() == 1) {
                return andEnabledEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("USERS.ENABLED in", values, "enabled");

                return this;
            } // end else
        } // end andEnabledIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEnabledNotIn(List values) {
            if (values.size() == 1) {
                return andEnabledNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("USERS.ENABLED not in", values, "enabled");

                return this;
            } // end else
        } // end andEnabledNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEnabledIn(Object[] values) {
            if (values.length == 1) {
                return andEnabledEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("USERS.ENABLED in", Arrays.asList(values),
                    "enabled");

                return this;
            } // end else
        } // end andEnabledIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEnabledNotIn(Object[] values) {
            if (values.length == 1) {
                return andEnabledNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("USERS.ENABLED not in", Arrays.asList(values),
                    "enabled");

                return this;
            } // end else
        } // end andEnabledNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEnabledBetween(String value1, String value2) {
            addCriterion("USERS.ENABLED between", value1, value2, "enabled");

            return this;
        } // end andEnabledBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEnabledNotBetween(String value1, String value2) {
            addCriterion("USERS.ENABLED not between", value1, value2, "enabled");

            return this;
        } // end andEnabledNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordIsNull() {
            addCriterion("USERS.PASSWORD is null");

            return this;
        } // end andPasswordIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordIsNotNull() {
            addCriterion("USERS.PASSWORD is not null");

            return this;
        } // end andPasswordIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordIsNotEmpty() {
            addCriterion("USERS.PASSWORD is not null AND USERS.PASSWORD <> ''");

            return this;
        } // end andPasswordIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPasswordIsEmpty() {
            addCriterion("(USERS.PASSWORD is null OR USERS.PASSWORD = '')");

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
            addCriterion("USERS.PASSWORD =", value, "password");

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
            StringBuffer str = new StringBuffer("USERS.PASSWORD");
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
            addCriterion("USERS.PASSWORD <>", value, "password");

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
            addCriterion("USERS.PASSWORD is null OR USERS.PASSWORD <>", value,
                "password");

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
            StringBuffer str = new StringBuffer("USERS.PASSWORD");
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
            addCriterion("USERS.PASSWORD >", value, "password");

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
            StringBuffer str = new StringBuffer("USERS.PASSWORD");
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
            addCriterion("USERS.PASSWORD >=", value, "password");

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
            StringBuffer str = new StringBuffer("USERS.PASSWORD");
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
            addCriterion("USERS.PASSWORD <", value, "password");

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
            StringBuffer str = new StringBuffer("USERS.PASSWORD");
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
            addCriterion("USERS.PASSWORD <=", value, "password");

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
            StringBuffer str = new StringBuffer("USERS.PASSWORD");
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
            addCriterion("USERS.PASSWORD like", buffer.toString(), "password");

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
            addCriterion("USERS.PASSWORD not like", buffer.toString(),
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
                addCriterion("USERS.PASSWORD in", values, "password");

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
                addCriterion("USERS.PASSWORD not in", values, "password");

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
                addCriterion("USERS.PASSWORD in", Arrays.asList(values),
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
                addCriterion("USERS.PASSWORD not in", Arrays.asList(values),
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
            addCriterion("USERS.PASSWORD between", value1, value2, "password");

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
            addCriterion("USERS.PASSWORD not between", value1, value2,
                "password");

            return this;
        } // end andPasswordNotBetween()
    } // end Criteria
} // end SysUserPasswordDAOQueryBean
