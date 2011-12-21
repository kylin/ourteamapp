/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.hr.dao;

import net.dao.BaseQueryBean;
import net.dao.BaseWhereCriterion;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * Employee query bean 2011-10-31 11:55:27
 *
 * @author Auto Gen
 */
public class EmployeeDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new EmployeeDAOQueryBean object.
     */
    public EmployeeDAOQueryBean() {
        super();
    } // end EmployeeDAOQueryBean()

    /**
     * Creates a new EmployeeDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public EmployeeDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end EmployeeDAOQueryBean()

    /**
     * Creates a new EmployeeDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public EmployeeDAOQueryBean(BaseQueryBean aQueryBean, Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end EmployeeDAOQueryBean()

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
            addSelectProperty(IEmployeeDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IEmployeeDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addBirthDaySelectProperty() {
        addBirthDaySelectProperty("birthDay");
    } // end addBirthDaySelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addBirthDaySelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IEmployeeDAO.BirthDay, aAlias);
        } // end if
        else {
            addSelectProperty(IEmployeeDAO.BirthDay, "birthDay");
        } // end else
    } // end addBirthDaySelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addHomeAddressSelectProperty() {
        addHomeAddressSelectProperty("homeAddress");
    } // end addHomeAddressSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addHomeAddressSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IEmployeeDAO.HomeAddress, aAlias);
        } // end if
        else {
            addSelectProperty(IEmployeeDAO.HomeAddress, "homeAddress");
        } // end else
    } // end addHomeAddressSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addMailAddressSelectProperty() {
        addMailAddressSelectProperty("mailAddress");
    } // end addMailAddressSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addMailAddressSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IEmployeeDAO.MailAddress, aAlias);
        } // end if
        else {
            addSelectProperty(IEmployeeDAO.MailAddress, "mailAddress");
        } // end else
    } // end addMailAddressSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addNameSelectProperty() {
        addNameSelectProperty("name");
    } // end addNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IEmployeeDAO.Name, aAlias);
        } // end if
        else {
            addSelectProperty(IEmployeeDAO.Name, "name");
        } // end else
    } // end addNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addPhoneCallSelectProperty() {
        addPhoneCallSelectProperty("phoneCall");
    } // end addPhoneCallSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addPhoneCallSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IEmployeeDAO.PhoneCall, aAlias);
        } // end if
        else {
            addSelectProperty(IEmployeeDAO.PhoneCall, "phoneCall");
        } // end else
    } // end addPhoneCallSelectProperty()

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
            addSelectProperty(IEmployeeDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IEmployeeDAO.Remarks, "remarks");
        } // end else
    } // end addRemarksSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addSexSelectProperty() {
        addSexSelectProperty("sex");
    } // end addSexSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addSexSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IEmployeeDAO.Sex, aAlias);
        } // end if
        else {
            addSelectProperty(IEmployeeDAO.Sex, "sex");
        } // end else
    } // end addSexSelectProperty()

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
            addSelectProperty(IEmployeeDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IEmployeeDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addUserIdSelectProperty() {
        addUserIdSelectProperty("userId");
    } // end addUserIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addUserIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IEmployeeDAO.UserId, aAlias);
        } // end if
        else {
            addSelectProperty(IEmployeeDAO.UserId, "userId");
        } // end else
    } // end addUserIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addCodeSelectProperty() {
        addCodeSelectProperty("code");
    } // end addCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IEmployeeDAO.Code, aAlias);
        } // end if
        else {
            addSelectProperty(IEmployeeDAO.Code, "code");
        } // end else
    } // end addCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addBirthDaySelectProperty();

        addHomeAddressSelectProperty();

        addMailAddressSelectProperty();

        addNameSelectProperty();

        addPhoneCallSelectProperty();

        addRemarksSelectProperty();

        addSexSelectProperty();

        addStatusSelectProperty();

        addUserIdSelectProperty();

        addCodeSelectProperty();
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
            addCriterion("HR_EMPLOYEE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("HR_EMPLOYEE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion("HR_EMPLOYEE.ID is not null AND HR_EMPLOYEE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion("(HR_EMPLOYEE.ID is null OR HR_EMPLOYEE.ID = '')");

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
            addCriterion("HR_EMPLOYEE.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.ID");
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
            addCriterion("HR_EMPLOYEE.ID <>", value, "id");

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
            addCriterion("HR_EMPLOYEE.ID is null OR HR_EMPLOYEE.ID <>", value,
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
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.ID");
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
            addCriterion("HR_EMPLOYEE.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.ID");
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
            addCriterion("HR_EMPLOYEE.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.ID");
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
            addCriterion("HR_EMPLOYEE.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.ID");
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
            addCriterion("HR_EMPLOYEE.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.ID");
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
                addCriterion("HR_EMPLOYEE.ID in", values, "id");

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
                addCriterion("HR_EMPLOYEE.ID not in", values, "id");

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
                addCriterion("HR_EMPLOYEE.ID in", values, "id");

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
                addCriterion("HR_EMPLOYEE.ID not in", values, "id");

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
                addCriterion("HR_EMPLOYEE.ID in", Arrays.asList(values), "id");

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
                addCriterion("HR_EMPLOYEE.ID not in", Arrays.asList(values),
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
            addCriterion("HR_EMPLOYEE.ID between", value1, value2, "id");

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
            addCriterion("HR_EMPLOYEE.ID between", value1, value2, "id");

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
            addCriterion("HR_EMPLOYEE.ID not between", value1, value2, "id");

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
            addCriterion("HR_EMPLOYEE.ID not between", value1, value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBirthDayIsNull() {
            addCriterion("HR_EMPLOYEE.BIRTH_DAY is null");

            return this;
        } // end andBirthDayIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBirthDayIsNotNull() {
            addCriterion("HR_EMPLOYEE.BIRTH_DAY is not null");

            return this;
        } // end andBirthDayIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBirthDayIsNotEmpty() {
            addCriterion(
                "HR_EMPLOYEE.BIRTH_DAY is not null AND HR_EMPLOYEE.BIRTH_DAY <> ''");

            return this;
        } // end andBirthDayIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBirthDayIsEmpty() {
            addCriterion(
                "(HR_EMPLOYEE.BIRTH_DAY is null OR HR_EMPLOYEE.BIRTH_DAY = '')");

            return this;
        } // end andBirthDayIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBirthDayEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("HR_EMPLOYEE.BIRTH_DAY =", value, "birthDay");

            return this;
        } // end andBirthDayEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBirthDayEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.BIRTH_DAY");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBirthDayEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBirthDayNotEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("HR_EMPLOYEE.BIRTH_DAY <>", value,
                "birthDay");

            return this;
        } // end andBirthDayNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBirthDayNotEqualToOrIsNull(java.util.Date value) {
            addCriterionForJDBCDate("HR_EMPLOYEE.BIRTH_DAY is null OR HR_EMPLOYEE.BIRTH_DAY <>",
                value, "birthDay");

            return this;
        } // end andBirthDayNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBirthDayNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.BIRTH_DAY");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBirthDayNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBirthDayGreaterThan(java.util.Date value) {
            addCriterionForJDBCDate("HR_EMPLOYEE.BIRTH_DAY >", value, "birthDay");

            return this;
        } // end andBirthDayGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBirthDayGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.BIRTH_DAY");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBirthDayGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBirthDayGreaterThanOrEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("HR_EMPLOYEE.BIRTH_DAY >=", value,
                "birthDay");

            return this;
        } // end andBirthDayGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBirthDayGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.BIRTH_DAY");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBirthDayGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBirthDayLessThan(java.util.Date value) {
            addCriterionForJDBCDate("HR_EMPLOYEE.BIRTH_DAY <", value, "birthDay");

            return this;
        } // end andBirthDayLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBirthDayLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.BIRTH_DAY");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBirthDayLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBirthDayLessThanOrEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("HR_EMPLOYEE.BIRTH_DAY <=", value,
                "birthDay");

            return this;
        } // end andBirthDayLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBirthDayLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.BIRTH_DAY");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBirthDayLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBirthDayIn(List values) {
            if (values.size() == 1) {
                return andBirthDayEqualTo((java.util.Date) values.get(0));
            } // end if
            else {
                addCriterionForJDBCDate("HR_EMPLOYEE.BIRTH_DAY in", values,
                    "birthDay");

                return this;
            } // end else
        } // end andBirthDayIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBirthDayNotIn(List values) {
            if (values.size() == 1) {
                return andBirthDayNotEqualTo((java.util.Date) values.get(0));
            } // end if
            else {
                addCriterionForJDBCDate("HR_EMPLOYEE.BIRTH_DAY not in", values,
                    "birthDay");

                return this;
            } // end else
        } // end andBirthDayNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBirthDayIn(Object[] values) {
            if (values.length == 1) {
                return andBirthDayEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("HR_EMPLOYEE.BIRTH_DAY in",
                    Arrays.asList(values), "birthDay");

                return this;
            } // end else
        } // end andBirthDayIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBirthDayNotIn(Object[] values) {
            if (values.length == 1) {
                return andBirthDayNotEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("HR_EMPLOYEE.BIRTH_DAY not in",
                    Arrays.asList(values), "birthDay");

                return this;
            } // end else
        } // end andBirthDayNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBirthDayBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("HR_EMPLOYEE.BIRTH_DAY between", value1,
                value2, "birthDay");

            return this;
        } // end andBirthDayBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBirthDayNotBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("HR_EMPLOYEE.BIRTH_DAY not between",
                value1, value2, "birthDay");

            return this;
        } // end andBirthDayNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHomeAddressIsNull() {
            addCriterion("HR_EMPLOYEE.HOME_ADDRESS is null");

            return this;
        } // end andHomeAddressIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHomeAddressIsNotNull() {
            addCriterion("HR_EMPLOYEE.HOME_ADDRESS is not null");

            return this;
        } // end andHomeAddressIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHomeAddressIsNotEmpty() {
            addCriterion(
                "HR_EMPLOYEE.HOME_ADDRESS is not null AND HR_EMPLOYEE.HOME_ADDRESS <> ''");

            return this;
        } // end andHomeAddressIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHomeAddressIsEmpty() {
            addCriterion(
                "(HR_EMPLOYEE.HOME_ADDRESS is null OR HR_EMPLOYEE.HOME_ADDRESS = '')");

            return this;
        } // end andHomeAddressIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHomeAddressEqualTo(String value) {
            addCriterion("HR_EMPLOYEE.HOME_ADDRESS =", value, "homeAddress");

            return this;
        } // end andHomeAddressEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHomeAddressEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.HOME_ADDRESS");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andHomeAddressEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHomeAddressNotEqualTo(String value) {
            addCriterion("HR_EMPLOYEE.HOME_ADDRESS <>", value, "homeAddress");

            return this;
        } // end andHomeAddressNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHomeAddressNotEqualToOrIsNull(String value) {
            addCriterion("HR_EMPLOYEE.HOME_ADDRESS is null OR HR_EMPLOYEE.HOME_ADDRESS <>",
                value, "homeAddress");

            return this;
        } // end andHomeAddressNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHomeAddressNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.HOME_ADDRESS");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andHomeAddressNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHomeAddressGreaterThan(String value) {
            addCriterion("HR_EMPLOYEE.HOME_ADDRESS >", value, "homeAddress");

            return this;
        } // end andHomeAddressGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHomeAddressGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.HOME_ADDRESS");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andHomeAddressGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHomeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("HR_EMPLOYEE.HOME_ADDRESS >=", value, "homeAddress");

            return this;
        } // end andHomeAddressGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHomeAddressGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.HOME_ADDRESS");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andHomeAddressGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHomeAddressLessThan(String value) {
            addCriterion("HR_EMPLOYEE.HOME_ADDRESS <", value, "homeAddress");

            return this;
        } // end andHomeAddressLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHomeAddressLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.HOME_ADDRESS");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andHomeAddressLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHomeAddressLessThanOrEqualTo(String value) {
            addCriterion("HR_EMPLOYEE.HOME_ADDRESS <=", value, "homeAddress");

            return this;
        } // end andHomeAddressLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHomeAddressLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.HOME_ADDRESS");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andHomeAddressLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHomeAddressLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("HR_EMPLOYEE.HOME_ADDRESS like", buffer.toString(),
                "homeAddress");

            return this;
        } // end andHomeAddressLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHomeAddressNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("HR_EMPLOYEE.HOME_ADDRESS not like",
                buffer.toString(), "homeAddress");

            return this;
        } // end andHomeAddressNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHomeAddressIn(List values) {
            if (values.size() == 1) {
                return andHomeAddressEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("HR_EMPLOYEE.HOME_ADDRESS in", values,
                    "homeAddress");

                return this;
            } // end else
        } // end andHomeAddressIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHomeAddressNotIn(List values) {
            if (values.size() == 1) {
                return andHomeAddressNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("HR_EMPLOYEE.HOME_ADDRESS not in", values,
                    "homeAddress");

                return this;
            } // end else
        } // end andHomeAddressNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHomeAddressIn(Object[] values) {
            if (values.length == 1) {
                return andHomeAddressEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("HR_EMPLOYEE.HOME_ADDRESS in",
                    Arrays.asList(values), "homeAddress");

                return this;
            } // end else
        } // end andHomeAddressIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHomeAddressNotIn(Object[] values) {
            if (values.length == 1) {
                return andHomeAddressNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("HR_EMPLOYEE.HOME_ADDRESS not in",
                    Arrays.asList(values), "homeAddress");

                return this;
            } // end else
        } // end andHomeAddressNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHomeAddressBetween(String value1, String value2) {
            addCriterion("HR_EMPLOYEE.HOME_ADDRESS between", value1, value2,
                "homeAddress");

            return this;
        } // end andHomeAddressBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andHomeAddressNotBetween(String value1, String value2) {
            addCriterion("HR_EMPLOYEE.HOME_ADDRESS not between", value1,
                value2, "homeAddress");

            return this;
        } // end andHomeAddressNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMailAddressIsNull() {
            addCriterion("HR_EMPLOYEE.MAIL_ADDRESS is null");

            return this;
        } // end andMailAddressIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMailAddressIsNotNull() {
            addCriterion("HR_EMPLOYEE.MAIL_ADDRESS is not null");

            return this;
        } // end andMailAddressIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMailAddressIsNotEmpty() {
            addCriterion(
                "HR_EMPLOYEE.MAIL_ADDRESS is not null AND HR_EMPLOYEE.MAIL_ADDRESS <> ''");

            return this;
        } // end andMailAddressIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMailAddressIsEmpty() {
            addCriterion(
                "(HR_EMPLOYEE.MAIL_ADDRESS is null OR HR_EMPLOYEE.MAIL_ADDRESS = '')");

            return this;
        } // end andMailAddressIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMailAddressEqualTo(String value) {
            addCriterion("HR_EMPLOYEE.MAIL_ADDRESS =", value, "mailAddress");

            return this;
        } // end andMailAddressEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMailAddressEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.MAIL_ADDRESS");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMailAddressEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMailAddressNotEqualTo(String value) {
            addCriterion("HR_EMPLOYEE.MAIL_ADDRESS <>", value, "mailAddress");

            return this;
        } // end andMailAddressNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMailAddressNotEqualToOrIsNull(String value) {
            addCriterion("HR_EMPLOYEE.MAIL_ADDRESS is null OR HR_EMPLOYEE.MAIL_ADDRESS <>",
                value, "mailAddress");

            return this;
        } // end andMailAddressNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMailAddressNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.MAIL_ADDRESS");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMailAddressNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMailAddressGreaterThan(String value) {
            addCriterion("HR_EMPLOYEE.MAIL_ADDRESS >", value, "mailAddress");

            return this;
        } // end andMailAddressGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMailAddressGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.MAIL_ADDRESS");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMailAddressGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("HR_EMPLOYEE.MAIL_ADDRESS >=", value, "mailAddress");

            return this;
        } // end andMailAddressGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMailAddressGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.MAIL_ADDRESS");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMailAddressGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMailAddressLessThan(String value) {
            addCriterion("HR_EMPLOYEE.MAIL_ADDRESS <", value, "mailAddress");

            return this;
        } // end andMailAddressLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMailAddressLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.MAIL_ADDRESS");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMailAddressLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMailAddressLessThanOrEqualTo(String value) {
            addCriterion("HR_EMPLOYEE.MAIL_ADDRESS <=", value, "mailAddress");

            return this;
        } // end andMailAddressLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMailAddressLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.MAIL_ADDRESS");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andMailAddressLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMailAddressLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("HR_EMPLOYEE.MAIL_ADDRESS like", buffer.toString(),
                "mailAddress");

            return this;
        } // end andMailAddressLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMailAddressNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("HR_EMPLOYEE.MAIL_ADDRESS not like",
                buffer.toString(), "mailAddress");

            return this;
        } // end andMailAddressNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMailAddressIn(List values) {
            if (values.size() == 1) {
                return andMailAddressEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("HR_EMPLOYEE.MAIL_ADDRESS in", values,
                    "mailAddress");

                return this;
            } // end else
        } // end andMailAddressIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMailAddressNotIn(List values) {
            if (values.size() == 1) {
                return andMailAddressNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("HR_EMPLOYEE.MAIL_ADDRESS not in", values,
                    "mailAddress");

                return this;
            } // end else
        } // end andMailAddressNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMailAddressIn(Object[] values) {
            if (values.length == 1) {
                return andMailAddressEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("HR_EMPLOYEE.MAIL_ADDRESS in",
                    Arrays.asList(values), "mailAddress");

                return this;
            } // end else
        } // end andMailAddressIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMailAddressNotIn(Object[] values) {
            if (values.length == 1) {
                return andMailAddressNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("HR_EMPLOYEE.MAIL_ADDRESS not in",
                    Arrays.asList(values), "mailAddress");

                return this;
            } // end else
        } // end andMailAddressNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMailAddressBetween(String value1, String value2) {
            addCriterion("HR_EMPLOYEE.MAIL_ADDRESS between", value1, value2,
                "mailAddress");

            return this;
        } // end andMailAddressBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andMailAddressNotBetween(String value1, String value2) {
            addCriterion("HR_EMPLOYEE.MAIL_ADDRESS not between", value1,
                value2, "mailAddress");

            return this;
        } // end andMailAddressNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNull() {
            addCriterion("HR_EMPLOYEE.NAME is null");

            return this;
        } // end andNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNotNull() {
            addCriterion("HR_EMPLOYEE.NAME is not null");

            return this;
        } // end andNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNotEmpty() {
            addCriterion(
                "HR_EMPLOYEE.NAME is not null AND HR_EMPLOYEE.NAME <> ''");

            return this;
        } // end andNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsEmpty() {
            addCriterion("(HR_EMPLOYEE.NAME is null OR HR_EMPLOYEE.NAME = '')");

            return this;
        } // end andNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameEqualTo(String value) {
            addCriterion("HR_EMPLOYEE.NAME =", value, "name");

            return this;
        } // end andNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameNotEqualTo(String value) {
            addCriterion("HR_EMPLOYEE.NAME <>", value, "name");

            return this;
        } // end andNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameNotEqualToOrIsNull(String value) {
            addCriterion("HR_EMPLOYEE.NAME is null OR HR_EMPLOYEE.NAME <>",
                value, "name");

            return this;
        } // end andNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameGreaterThan(String value) {
            addCriterion("HR_EMPLOYEE.NAME >", value, "name");

            return this;
        } // end andNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("HR_EMPLOYEE.NAME >=", value, "name");

            return this;
        } // end andNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameLessThan(String value) {
            addCriterion("HR_EMPLOYEE.NAME <", value, "name");

            return this;
        } // end andNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("HR_EMPLOYEE.NAME <=", value, "name");

            return this;
        } // end andNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameLessThanOrEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("HR_EMPLOYEE.NAME like", buffer.toString(), "name");

            return this;
        } // end andNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("HR_EMPLOYEE.NAME not like", buffer.toString(), "name");

            return this;
        } // end andNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIn(List values) {
            if (values.size() == 1) {
                return andNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("HR_EMPLOYEE.NAME in", values, "name");

                return this;
            } // end else
        } // end andNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameNotIn(List values) {
            if (values.size() == 1) {
                return andNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("HR_EMPLOYEE.NAME not in", values, "name");

                return this;
            } // end else
        } // end andNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIn(Object[] values) {
            if (values.length == 1) {
                return andNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("HR_EMPLOYEE.NAME in", Arrays.asList(values),
                    "name");

                return this;
            } // end else
        } // end andNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("HR_EMPLOYEE.NAME not in", Arrays.asList(values),
                    "name");

                return this;
            } // end else
        } // end andNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("HR_EMPLOYEE.NAME between", value1, value2, "name");

            return this;
        } // end andNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("HR_EMPLOYEE.NAME not between", value1, value2, "name");

            return this;
        } // end andNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPhoneCallIsNull() {
            addCriterion("HR_EMPLOYEE.PHONE_CALL is null");

            return this;
        } // end andPhoneCallIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPhoneCallIsNotNull() {
            addCriterion("HR_EMPLOYEE.PHONE_CALL is not null");

            return this;
        } // end andPhoneCallIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPhoneCallIsNotEmpty() {
            addCriterion(
                "HR_EMPLOYEE.PHONE_CALL is not null AND HR_EMPLOYEE.PHONE_CALL <> ''");

            return this;
        } // end andPhoneCallIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPhoneCallIsEmpty() {
            addCriterion(
                "(HR_EMPLOYEE.PHONE_CALL is null OR HR_EMPLOYEE.PHONE_CALL = '')");

            return this;
        } // end andPhoneCallIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPhoneCallEqualTo(String value) {
            addCriterion("HR_EMPLOYEE.PHONE_CALL =", value, "phoneCall");

            return this;
        } // end andPhoneCallEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPhoneCallEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.PHONE_CALL");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPhoneCallEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPhoneCallNotEqualTo(String value) {
            addCriterion("HR_EMPLOYEE.PHONE_CALL <>", value, "phoneCall");

            return this;
        } // end andPhoneCallNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPhoneCallNotEqualToOrIsNull(String value) {
            addCriterion("HR_EMPLOYEE.PHONE_CALL is null OR HR_EMPLOYEE.PHONE_CALL <>",
                value, "phoneCall");

            return this;
        } // end andPhoneCallNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPhoneCallNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.PHONE_CALL");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPhoneCallNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPhoneCallGreaterThan(String value) {
            addCriterion("HR_EMPLOYEE.PHONE_CALL >", value, "phoneCall");

            return this;
        } // end andPhoneCallGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPhoneCallGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.PHONE_CALL");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPhoneCallGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPhoneCallGreaterThanOrEqualTo(String value) {
            addCriterion("HR_EMPLOYEE.PHONE_CALL >=", value, "phoneCall");

            return this;
        } // end andPhoneCallGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPhoneCallGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.PHONE_CALL");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPhoneCallGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPhoneCallLessThan(String value) {
            addCriterion("HR_EMPLOYEE.PHONE_CALL <", value, "phoneCall");

            return this;
        } // end andPhoneCallLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPhoneCallLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.PHONE_CALL");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPhoneCallLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPhoneCallLessThanOrEqualTo(String value) {
            addCriterion("HR_EMPLOYEE.PHONE_CALL <=", value, "phoneCall");

            return this;
        } // end andPhoneCallLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPhoneCallLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.PHONE_CALL");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPhoneCallLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPhoneCallLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("HR_EMPLOYEE.PHONE_CALL like", buffer.toString(),
                "phoneCall");

            return this;
        } // end andPhoneCallLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPhoneCallNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("HR_EMPLOYEE.PHONE_CALL not like", buffer.toString(),
                "phoneCall");

            return this;
        } // end andPhoneCallNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPhoneCallIn(List values) {
            if (values.size() == 1) {
                return andPhoneCallEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("HR_EMPLOYEE.PHONE_CALL in", values, "phoneCall");

                return this;
            } // end else
        } // end andPhoneCallIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPhoneCallNotIn(List values) {
            if (values.size() == 1) {
                return andPhoneCallNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("HR_EMPLOYEE.PHONE_CALL not in", values,
                    "phoneCall");

                return this;
            } // end else
        } // end andPhoneCallNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPhoneCallIn(Object[] values) {
            if (values.length == 1) {
                return andPhoneCallEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("HR_EMPLOYEE.PHONE_CALL in",
                    Arrays.asList(values), "phoneCall");

                return this;
            } // end else
        } // end andPhoneCallIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPhoneCallNotIn(Object[] values) {
            if (values.length == 1) {
                return andPhoneCallNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("HR_EMPLOYEE.PHONE_CALL not in",
                    Arrays.asList(values), "phoneCall");

                return this;
            } // end else
        } // end andPhoneCallNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPhoneCallBetween(String value1, String value2) {
            addCriterion("HR_EMPLOYEE.PHONE_CALL between", value1, value2,
                "phoneCall");

            return this;
        } // end andPhoneCallBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPhoneCallNotBetween(String value1, String value2) {
            addCriterion("HR_EMPLOYEE.PHONE_CALL not between", value1, value2,
                "phoneCall");

            return this;
        } // end andPhoneCallNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("HR_EMPLOYEE.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("HR_EMPLOYEE.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "HR_EMPLOYEE.REMARKS is not null AND HR_EMPLOYEE.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(HR_EMPLOYEE.REMARKS is null OR HR_EMPLOYEE.REMARKS = '')");

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
            addCriterion("HR_EMPLOYEE.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.REMARKS");
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
            addCriterion("HR_EMPLOYEE.REMARKS <>", value, "remarks");

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
            addCriterion("HR_EMPLOYEE.REMARKS is null OR HR_EMPLOYEE.REMARKS <>",
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
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.REMARKS");
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
            addCriterion("HR_EMPLOYEE.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.REMARKS");
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
            addCriterion("HR_EMPLOYEE.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.REMARKS");
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
            addCriterion("HR_EMPLOYEE.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.REMARKS");
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
            addCriterion("HR_EMPLOYEE.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.REMARKS");
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
            addCriterion("HR_EMPLOYEE.REMARKS like", buffer.toString(),
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
            addCriterion("HR_EMPLOYEE.REMARKS not like", buffer.toString(),
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
                addCriterion("HR_EMPLOYEE.REMARKS in", values, "remarks");

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
                addCriterion("HR_EMPLOYEE.REMARKS not in", values, "remarks");

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
                addCriterion("HR_EMPLOYEE.REMARKS in", Arrays.asList(values),
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
                addCriterion("HR_EMPLOYEE.REMARKS not in",
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
            addCriterion("HR_EMPLOYEE.REMARKS between", value1, value2,
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
            addCriterion("HR_EMPLOYEE.REMARKS not between", value1, value2,
                "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSexIsNull() {
            addCriterion("HR_EMPLOYEE.SEX is null");

            return this;
        } // end andSexIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSexIsNotNull() {
            addCriterion("HR_EMPLOYEE.SEX is not null");

            return this;
        } // end andSexIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSexIsNotEmpty() {
            addCriterion(
                "HR_EMPLOYEE.SEX is not null AND HR_EMPLOYEE.SEX <> ''");

            return this;
        } // end andSexIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSexIsEmpty() {
            addCriterion("(HR_EMPLOYEE.SEX is null OR HR_EMPLOYEE.SEX = '')");

            return this;
        } // end andSexIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSexEqualTo(String value) {
            addCriterion("HR_EMPLOYEE.SEX =", value, "sex");

            return this;
        } // end andSexEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSexEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.SEX");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSexEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSexNotEqualTo(String value) {
            addCriterion("HR_EMPLOYEE.SEX <>", value, "sex");

            return this;
        } // end andSexNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSexNotEqualToOrIsNull(String value) {
            addCriterion("HR_EMPLOYEE.SEX is null OR HR_EMPLOYEE.SEX <>",
                value, "sex");

            return this;
        } // end andSexNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSexNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.SEX");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSexNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSexGreaterThan(String value) {
            addCriterion("HR_EMPLOYEE.SEX >", value, "sex");

            return this;
        } // end andSexGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSexGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.SEX");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSexGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("HR_EMPLOYEE.SEX >=", value, "sex");

            return this;
        } // end andSexGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSexGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.SEX");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSexGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSexLessThan(String value) {
            addCriterion("HR_EMPLOYEE.SEX <", value, "sex");

            return this;
        } // end andSexLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSexLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.SEX");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSexLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("HR_EMPLOYEE.SEX <=", value, "sex");

            return this;
        } // end andSexLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSexLessThanOrEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.SEX");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSexLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSexLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("HR_EMPLOYEE.SEX like", buffer.toString(), "sex");

            return this;
        } // end andSexLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSexNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("HR_EMPLOYEE.SEX not like", buffer.toString(), "sex");

            return this;
        } // end andSexNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSexIn(List values) {
            if (values.size() == 1) {
                return andSexEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("HR_EMPLOYEE.SEX in", values, "sex");

                return this;
            } // end else
        } // end andSexIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSexNotIn(List values) {
            if (values.size() == 1) {
                return andSexNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("HR_EMPLOYEE.SEX not in", values, "sex");

                return this;
            } // end else
        } // end andSexNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSexIn(Object[] values) {
            if (values.length == 1) {
                return andSexEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("HR_EMPLOYEE.SEX in", Arrays.asList(values), "sex");

                return this;
            } // end else
        } // end andSexIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSexNotIn(Object[] values) {
            if (values.length == 1) {
                return andSexNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("HR_EMPLOYEE.SEX not in", Arrays.asList(values),
                    "sex");

                return this;
            } // end else
        } // end andSexNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("HR_EMPLOYEE.SEX between", value1, value2, "sex");

            return this;
        } // end andSexBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("HR_EMPLOYEE.SEX not between", value1, value2, "sex");

            return this;
        } // end andSexNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("HR_EMPLOYEE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("HR_EMPLOYEE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "HR_EMPLOYEE.STATUS is not null AND HR_EMPLOYEE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(HR_EMPLOYEE.STATUS is null OR HR_EMPLOYEE.STATUS = '')");

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
            addCriterion("HR_EMPLOYEE.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.STATUS");
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
            addCriterion("HR_EMPLOYEE.STATUS <>", value, "status");

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
            addCriterion("HR_EMPLOYEE.STATUS is null OR HR_EMPLOYEE.STATUS <>",
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
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.STATUS");
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
            addCriterion("HR_EMPLOYEE.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.STATUS");
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
            addCriterion("HR_EMPLOYEE.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.STATUS");
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
            addCriterion("HR_EMPLOYEE.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.STATUS");
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
            addCriterion("HR_EMPLOYEE.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.STATUS");
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
            addCriterion("HR_EMPLOYEE.STATUS like", buffer.toString(), "status");

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
            addCriterion("HR_EMPLOYEE.STATUS not like", buffer.toString(),
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
                addCriterion("HR_EMPLOYEE.STATUS in", values, "status");

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
                addCriterion("HR_EMPLOYEE.STATUS not in", values, "status");

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
                addCriterion("HR_EMPLOYEE.STATUS in", Arrays.asList(values),
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
                addCriterion("HR_EMPLOYEE.STATUS not in",
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
            addCriterion("HR_EMPLOYEE.STATUS between", value1, value2, "status");

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
            addCriterion("HR_EMPLOYEE.STATUS not between", value1, value2,
                "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdIsNull() {
            addCriterion("HR_EMPLOYEE.USER_ID is null");

            return this;
        } // end andUserIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdIsNotNull() {
            addCriterion("HR_EMPLOYEE.USER_ID is not null");

            return this;
        } // end andUserIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdIsNotEmpty() {
            addCriterion(
                "HR_EMPLOYEE.USER_ID is not null AND HR_EMPLOYEE.USER_ID <> ''");

            return this;
        } // end andUserIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdIsEmpty() {
            addCriterion(
                "(HR_EMPLOYEE.USER_ID is null OR HR_EMPLOYEE.USER_ID = '')");

            return this;
        } // end andUserIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdEqualTo(long value) {
            return andUserIdEqualTo(Long.valueOf(value));
        } // end andUserIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdEqualTo(java.lang.Long value) {
            addCriterion("HR_EMPLOYEE.USER_ID =", value, "userId");

            return this;
        } // end andUserIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.USER_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUserIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdNotEqualTo(long value) {
            return andUserIdNotEqualTo(Long.valueOf(value));
        } // end andUserIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdNotEqualTo(java.lang.Long value) {
            addCriterion("HR_EMPLOYEE.USER_ID <>", value, "userId");

            return this;
        } // end andUserIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdNotEqualToOrIsNull(long value) {
            return andUserIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andUserIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("HR_EMPLOYEE.USER_ID is null OR HR_EMPLOYEE.USER_ID <>",
                value, "userId");

            return this;
        } // end andUserIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.USER_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUserIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdGreaterThan(long value) {
            return andUserIdGreaterThan(Long.valueOf(value));
        } // end andUserIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdGreaterThan(java.lang.Long value) {
            addCriterion("HR_EMPLOYEE.USER_ID >", value, "userId");

            return this;
        } // end andUserIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.USER_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUserIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdGreaterThanOrEqualTo(long value) {
            return andUserIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andUserIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("HR_EMPLOYEE.USER_ID >=", value, "userId");

            return this;
        } // end andUserIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.USER_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUserIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdLessThan(long value) {
            return andUserIdLessThan(Long.valueOf(value));
        } // end andUserIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdLessThan(java.lang.Long value) {
            addCriterion("HR_EMPLOYEE.USER_ID <", value, "userId");

            return this;
        } // end andUserIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.USER_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUserIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdLessThanOrEqualTo(long value) {
            return andUserIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andUserIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("HR_EMPLOYEE.USER_ID <=", value, "userId");

            return this;
        } // end andUserIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.USER_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andUserIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdIn(long[] values) {
            if (values.length == 1) {
                return andUserIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("HR_EMPLOYEE.USER_ID in", values, "userId");

                return this;
            } // end else
        } // end andUserIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdNotIn(long[] values) {
            if (values.length == 1) {
                return andUserIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("HR_EMPLOYEE.USER_ID not in", values, "userId");

                return this;
            } // end else
        } // end andUserIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdIn(List values) {
            if (values.size() == 1) {
                return andUserIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("HR_EMPLOYEE.USER_ID in", values, "userId");

                return this;
            } // end else
        } // end andUserIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdNotIn(List values) {
            if (values.size() == 1) {
                return andUserIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("HR_EMPLOYEE.USER_ID not in", values, "userId");

                return this;
            } // end else
        } // end andUserIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdIn(Object[] values) {
            if (values.length == 1) {
                return andUserIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("HR_EMPLOYEE.USER_ID in", Arrays.asList(values),
                    "userId");

                return this;
            } // end else
        } // end andUserIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andUserIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("HR_EMPLOYEE.USER_ID not in",
                    Arrays.asList(values), "userId");

                return this;
            } // end else
        } // end andUserIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdBetween(long value1, long value2) {
            addCriterion("HR_EMPLOYEE.USER_ID between", value1, value2, "userId");

            return this;
        } // end andUserIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("HR_EMPLOYEE.USER_ID between", value1, value2, "userId");

            return this;
        } // end andUserIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdNotBetween(long value1, long value2) {
            addCriterion("HR_EMPLOYEE.USER_ID not between", value1, value2,
                "userId");

            return this;
        } // end andUserIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("HR_EMPLOYEE.USER_ID not between", value1, value2,
                "userId");

            return this;
        } // end andUserIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeIsNull() {
            addCriterion("HR_EMPLOYEE.CODE is null");

            return this;
        } // end andCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeIsNotNull() {
            addCriterion("HR_EMPLOYEE.CODE is not null");

            return this;
        } // end andCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeIsNotEmpty() {
            addCriterion(
                "HR_EMPLOYEE.CODE is not null AND HR_EMPLOYEE.CODE <> ''");

            return this;
        } // end andCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeIsEmpty() {
            addCriterion("(HR_EMPLOYEE.CODE is null OR HR_EMPLOYEE.CODE = '')");

            return this;
        } // end andCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeEqualTo(String value) {
            addCriterion("HR_EMPLOYEE.CODE =", value, "code");

            return this;
        } // end andCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.CODE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("HR_EMPLOYEE.CODE <>", value, "code");

            return this;
        } // end andCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeNotEqualToOrIsNull(String value) {
            addCriterion("HR_EMPLOYEE.CODE is null OR HR_EMPLOYEE.CODE <>",
                value, "code");

            return this;
        } // end andCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.CODE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeGreaterThan(String value) {
            addCriterion("HR_EMPLOYEE.CODE >", value, "code");

            return this;
        } // end andCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.CODE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("HR_EMPLOYEE.CODE >=", value, "code");

            return this;
        } // end andCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.CODE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeLessThan(String value) {
            addCriterion("HR_EMPLOYEE.CODE <", value, "code");

            return this;
        } // end andCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.CODE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("HR_EMPLOYEE.CODE <=", value, "code");

            return this;
        } // end andCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeLessThanOrEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("HR_EMPLOYEE.CODE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("HR_EMPLOYEE.CODE like", buffer.toString(), "code");

            return this;
        } // end andCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("HR_EMPLOYEE.CODE not like", buffer.toString(), "code");

            return this;
        } // end andCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeIn(List values) {
            if (values.size() == 1) {
                return andCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("HR_EMPLOYEE.CODE in", values, "code");

                return this;
            } // end else
        } // end andCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeNotIn(List values) {
            if (values.size() == 1) {
                return andCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("HR_EMPLOYEE.CODE not in", values, "code");

                return this;
            } // end else
        } // end andCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeIn(Object[] values) {
            if (values.length == 1) {
                return andCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("HR_EMPLOYEE.CODE in", Arrays.asList(values),
                    "code");

                return this;
            } // end else
        } // end andCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("HR_EMPLOYEE.CODE not in", Arrays.asList(values),
                    "code");

                return this;
            } // end else
        } // end andCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("HR_EMPLOYEE.CODE between", value1, value2, "code");

            return this;
        } // end andCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("HR_EMPLOYEE.CODE not between", value1, value2, "code");

            return this;
        } // end andCodeNotBetween()
    } // end Criteria
} // end EmployeeDAOQueryBean
