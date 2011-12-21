/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.calendar.dao;

import net.dao.BaseQueryBean;
import net.dao.BaseWhereCriterion;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * CalendarItemAssign query bean 2011-09-22 10:18:09
 *
 * @author Auto Gen
 */
public class CalendarItemAssignDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new CalendarItemAssignDAOQueryBean object.
     */
    public CalendarItemAssignDAOQueryBean() {
        super();
    } // end CalendarItemAssignDAOQueryBean()

    /**
     * Creates a new CalendarItemAssignDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public CalendarItemAssignDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end CalendarItemAssignDAOQueryBean()

    /**
     * Creates a new CalendarItemAssignDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public CalendarItemAssignDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end CalendarItemAssignDAOQueryBean()

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
            addSelectProperty(ICalendarItemAssignDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(ICalendarItemAssignDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAssignPercentSelectProperty() {
        addAssignPercentSelectProperty("assignPercent");
    } // end addAssignPercentSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addAssignPercentSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ICalendarItemAssignDAO.AssignPercent, aAlias);
        } // end if
        else {
            addSelectProperty(ICalendarItemAssignDAO.AssignPercent,
                "assignPercent");
        } // end else
    } // end addAssignPercentSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addCalendarItemIdSelectProperty() {
        addCalendarItemIdSelectProperty("calendarItemId");
    } // end addCalendarItemIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addCalendarItemIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ICalendarItemAssignDAO.CalendarItemId, aAlias);
        } // end if
        else {
            addSelectProperty(ICalendarItemAssignDAO.CalendarItemId,
                "calendarItemId");
        } // end else
    } // end addCalendarItemIdSelectProperty()

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
            addSelectProperty(ICalendarItemAssignDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(ICalendarItemAssignDAO.Remarks, "remarks");
        } // end else
    } // end addRemarksSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addSysUserIdSelectProperty() {
        addSysUserIdSelectProperty("sysUserId");
    } // end addSysUserIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addSysUserIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ICalendarItemAssignDAO.SysUserId, aAlias);
        } // end if
        else {
            addSelectProperty(ICalendarItemAssignDAO.SysUserId, "sysUserId");
        } // end else
    } // end addSysUserIdSelectProperty()

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
            addSelectProperty(ICalendarItemAssignDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(ICalendarItemAssignDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addIsLeaderSelectProperty() {
        addIsLeaderSelectProperty("isLeader");
    } // end addIsLeaderSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addIsLeaderSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ICalendarItemAssignDAO.IsLeader, aAlias);
        } // end if
        else {
            addSelectProperty(ICalendarItemAssignDAO.IsLeader, "isLeader");
        } // end else
    } // end addIsLeaderSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addAssignPercentSelectProperty();

        addCalendarItemIdSelectProperty();

        addRemarksSelectProperty();

        addSysUserIdSelectProperty();

        addStatusSelectProperty();

        addIsLeaderSelectProperty();
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
            addCriterion("CALENDAR_ITEM_ASSIGN.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("CALENDAR_ITEM_ASSIGN.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "CALENDAR_ITEM_ASSIGN.ID is not null AND CALENDAR_ITEM_ASSIGN.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(CALENDAR_ITEM_ASSIGN.ID is null OR CALENDAR_ITEM_ASSIGN.ID = '')");

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
            addCriterion("CALENDAR_ITEM_ASSIGN.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM_ASSIGN.ID");
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
            addCriterion("CALENDAR_ITEM_ASSIGN.ID <>", value, "id");

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
            addCriterion("CALENDAR_ITEM_ASSIGN.ID is null OR CALENDAR_ITEM_ASSIGN.ID <>",
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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM_ASSIGN.ID");
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
            addCriterion("CALENDAR_ITEM_ASSIGN.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM_ASSIGN.ID");
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
            addCriterion("CALENDAR_ITEM_ASSIGN.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM_ASSIGN.ID");
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
            addCriterion("CALENDAR_ITEM_ASSIGN.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM_ASSIGN.ID");
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
            addCriterion("CALENDAR_ITEM_ASSIGN.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM_ASSIGN.ID");
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
                addCriterion("CALENDAR_ITEM_ASSIGN.ID in", values, "id");

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
                addCriterion("CALENDAR_ITEM_ASSIGN.ID not in", values, "id");

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
                addCriterion("CALENDAR_ITEM_ASSIGN.ID in", values, "id");

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
                addCriterion("CALENDAR_ITEM_ASSIGN.ID not in", values, "id");

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
                addCriterion("CALENDAR_ITEM_ASSIGN.ID in",
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
                addCriterion("CALENDAR_ITEM_ASSIGN.ID not in",
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
            addCriterion("CALENDAR_ITEM_ASSIGN.ID between", value1, value2, "id");

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
            addCriterion("CALENDAR_ITEM_ASSIGN.ID between", value1, value2, "id");

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
            addCriterion("CALENDAR_ITEM_ASSIGN.ID not between", value1, value2,
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
            addCriterion("CALENDAR_ITEM_ASSIGN.ID not between", value1, value2,
                "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignPercentIsNull() {
            addCriterion("CALENDAR_ITEM_ASSIGN.ASSIGN_PERCENT is null");

            return this;
        } // end andAssignPercentIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignPercentIsNotNull() {
            addCriterion("CALENDAR_ITEM_ASSIGN.ASSIGN_PERCENT is not null");

            return this;
        } // end andAssignPercentIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignPercentIsNotEmpty() {
            addCriterion(
                "CALENDAR_ITEM_ASSIGN.ASSIGN_PERCENT is not null AND CALENDAR_ITEM_ASSIGN.ASSIGN_PERCENT <> ''");

            return this;
        } // end andAssignPercentIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignPercentIsEmpty() {
            addCriterion(
                "(CALENDAR_ITEM_ASSIGN.ASSIGN_PERCENT is null OR CALENDAR_ITEM_ASSIGN.ASSIGN_PERCENT = '')");

            return this;
        } // end andAssignPercentIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignPercentEqualTo(Double value) {
            addCriterion("CALENDAR_ITEM_ASSIGN.ASSIGN_PERCENT =", value,
                "assignPercent");

            return this;
        } // end andAssignPercentEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignPercentEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "CALENDAR_ITEM_ASSIGN.ASSIGN_PERCENT");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAssignPercentEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignPercentNotEqualTo(Double value) {
            addCriterion("CALENDAR_ITEM_ASSIGN.ASSIGN_PERCENT <>", value,
                "assignPercent");

            return this;
        } // end andAssignPercentNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignPercentNotEqualToOrIsNull(Double value) {
            addCriterion("CALENDAR_ITEM_ASSIGN.ASSIGN_PERCENT is null OR CALENDAR_ITEM_ASSIGN.ASSIGN_PERCENT <>",
                value, "assignPercent");

            return this;
        } // end andAssignPercentNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignPercentNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "CALENDAR_ITEM_ASSIGN.ASSIGN_PERCENT");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAssignPercentNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignPercentGreaterThan(Double value) {
            addCriterion("CALENDAR_ITEM_ASSIGN.ASSIGN_PERCENT >", value,
                "assignPercent");

            return this;
        } // end andAssignPercentGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignPercentGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "CALENDAR_ITEM_ASSIGN.ASSIGN_PERCENT");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAssignPercentGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignPercentGreaterThanOrEqualTo(Double value) {
            addCriterion("CALENDAR_ITEM_ASSIGN.ASSIGN_PERCENT >=", value,
                "assignPercent");

            return this;
        } // end andAssignPercentGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignPercentGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "CALENDAR_ITEM_ASSIGN.ASSIGN_PERCENT");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAssignPercentGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignPercentLessThan(Double value) {
            addCriterion("CALENDAR_ITEM_ASSIGN.ASSIGN_PERCENT <", value,
                "assignPercent");

            return this;
        } // end andAssignPercentLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignPercentLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "CALENDAR_ITEM_ASSIGN.ASSIGN_PERCENT");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAssignPercentLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignPercentLessThanOrEqualTo(Double value) {
            addCriterion("CALENDAR_ITEM_ASSIGN.ASSIGN_PERCENT <=", value,
                "assignPercent");

            return this;
        } // end andAssignPercentLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignPercentLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "CALENDAR_ITEM_ASSIGN.ASSIGN_PERCENT");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAssignPercentLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignPercentIn(List values) {
            if (values.size() == 1) {
                return andAssignPercentEqualTo((Double) values.get(0));
            } // end if
            else {
                addCriterion("CALENDAR_ITEM_ASSIGN.ASSIGN_PERCENT in", values,
                    "assignPercent");

                return this;
            } // end else
        } // end andAssignPercentIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignPercentNotIn(List values) {
            if (values.size() == 1) {
                return andAssignPercentNotEqualTo((Double) values.get(0));
            } // end if
            else {
                addCriterion("CALENDAR_ITEM_ASSIGN.ASSIGN_PERCENT not in",
                    values, "assignPercent");

                return this;
            } // end else
        } // end andAssignPercentNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignPercentIn(Object[] values) {
            if (values.length == 1) {
                return andAssignPercentEqualTo((Double) values[0]);
            } // end if
            else {
                addCriterion("CALENDAR_ITEM_ASSIGN.ASSIGN_PERCENT in",
                    Arrays.asList(values), "assignPercent");

                return this;
            } // end else
        } // end andAssignPercentIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignPercentNotIn(Object[] values) {
            if (values.length == 1) {
                return andAssignPercentNotEqualTo((Double) values[0]);
            } // end if
            else {
                addCriterion("CALENDAR_ITEM_ASSIGN.ASSIGN_PERCENT not in",
                    Arrays.asList(values), "assignPercent");

                return this;
            } // end else
        } // end andAssignPercentNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignPercentBetween(Double value1, Double value2) {
            addCriterion("CALENDAR_ITEM_ASSIGN.ASSIGN_PERCENT between", value1,
                value2, "assignPercent");

            return this;
        } // end andAssignPercentBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAssignPercentNotBetween(Double value1, Double value2) {
            addCriterion("CALENDAR_ITEM_ASSIGN.ASSIGN_PERCENT not between",
                value1, value2, "assignPercent");

            return this;
        } // end andAssignPercentNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdIsNull() {
            addCriterion("CALENDAR_ITEM_ASSIGN.CALENDAR_ITEM_ID is null");

            return this;
        } // end andCalendarItemIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdIsNotNull() {
            addCriterion("CALENDAR_ITEM_ASSIGN.CALENDAR_ITEM_ID is not null");

            return this;
        } // end andCalendarItemIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdIsNotEmpty() {
            addCriterion(
                "CALENDAR_ITEM_ASSIGN.CALENDAR_ITEM_ID is not null AND CALENDAR_ITEM_ASSIGN.CALENDAR_ITEM_ID <> ''");

            return this;
        } // end andCalendarItemIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdIsEmpty() {
            addCriterion(
                "(CALENDAR_ITEM_ASSIGN.CALENDAR_ITEM_ID is null OR CALENDAR_ITEM_ASSIGN.CALENDAR_ITEM_ID = '')");

            return this;
        } // end andCalendarItemIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdEqualTo(long value) {
            return andCalendarItemIdEqualTo(Long.valueOf(value));
        } // end andCalendarItemIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdEqualTo(java.lang.Long value) {
            addCriterion("CALENDAR_ITEM_ASSIGN.CALENDAR_ITEM_ID =", value,
                "calendarItemId");

            return this;
        } // end andCalendarItemIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "CALENDAR_ITEM_ASSIGN.CALENDAR_ITEM_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCalendarItemIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdNotEqualTo(long value) {
            return andCalendarItemIdNotEqualTo(Long.valueOf(value));
        } // end andCalendarItemIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdNotEqualTo(java.lang.Long value) {
            addCriterion("CALENDAR_ITEM_ASSIGN.CALENDAR_ITEM_ID <>", value,
                "calendarItemId");

            return this;
        } // end andCalendarItemIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdNotEqualToOrIsNull(long value) {
            return andCalendarItemIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andCalendarItemIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("CALENDAR_ITEM_ASSIGN.CALENDAR_ITEM_ID is null OR CALENDAR_ITEM_ASSIGN.CALENDAR_ITEM_ID <>",
                value, "calendarItemId");

            return this;
        } // end andCalendarItemIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "CALENDAR_ITEM_ASSIGN.CALENDAR_ITEM_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCalendarItemIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdGreaterThan(long value) {
            return andCalendarItemIdGreaterThan(Long.valueOf(value));
        } // end andCalendarItemIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdGreaterThan(java.lang.Long value) {
            addCriterion("CALENDAR_ITEM_ASSIGN.CALENDAR_ITEM_ID >", value,
                "calendarItemId");

            return this;
        } // end andCalendarItemIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "CALENDAR_ITEM_ASSIGN.CALENDAR_ITEM_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCalendarItemIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdGreaterThanOrEqualTo(long value) {
            return andCalendarItemIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andCalendarItemIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("CALENDAR_ITEM_ASSIGN.CALENDAR_ITEM_ID >=", value,
                "calendarItemId");

            return this;
        } // end andCalendarItemIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "CALENDAR_ITEM_ASSIGN.CALENDAR_ITEM_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCalendarItemIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdLessThan(long value) {
            return andCalendarItemIdLessThan(Long.valueOf(value));
        } // end andCalendarItemIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdLessThan(java.lang.Long value) {
            addCriterion("CALENDAR_ITEM_ASSIGN.CALENDAR_ITEM_ID <", value,
                "calendarItemId");

            return this;
        } // end andCalendarItemIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "CALENDAR_ITEM_ASSIGN.CALENDAR_ITEM_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCalendarItemIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdLessThanOrEqualTo(long value) {
            return andCalendarItemIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andCalendarItemIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("CALENDAR_ITEM_ASSIGN.CALENDAR_ITEM_ID <=", value,
                "calendarItemId");

            return this;
        } // end andCalendarItemIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "CALENDAR_ITEM_ASSIGN.CALENDAR_ITEM_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCalendarItemIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdIn(long[] values) {
            if (values.length == 1) {
                return andCalendarItemIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("CALENDAR_ITEM_ASSIGN.CALENDAR_ITEM_ID in",
                    values, "calendarItemId");

                return this;
            } // end else
        } // end andCalendarItemIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdNotIn(long[] values) {
            if (values.length == 1) {
                return andCalendarItemIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("CALENDAR_ITEM_ASSIGN.CALENDAR_ITEM_ID not in",
                    values, "calendarItemId");

                return this;
            } // end else
        } // end andCalendarItemIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdIn(List values) {
            if (values.size() == 1) {
                return andCalendarItemIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("CALENDAR_ITEM_ASSIGN.CALENDAR_ITEM_ID in",
                    values, "calendarItemId");

                return this;
            } // end else
        } // end andCalendarItemIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdNotIn(List values) {
            if (values.size() == 1) {
                return andCalendarItemIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("CALENDAR_ITEM_ASSIGN.CALENDAR_ITEM_ID not in",
                    values, "calendarItemId");

                return this;
            } // end else
        } // end andCalendarItemIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdIn(Object[] values) {
            if (values.length == 1) {
                return andCalendarItemIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("CALENDAR_ITEM_ASSIGN.CALENDAR_ITEM_ID in",
                    Arrays.asList(values), "calendarItemId");

                return this;
            } // end else
        } // end andCalendarItemIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andCalendarItemIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("CALENDAR_ITEM_ASSIGN.CALENDAR_ITEM_ID not in",
                    Arrays.asList(values), "calendarItemId");

                return this;
            } // end else
        } // end andCalendarItemIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdBetween(long value1, long value2) {
            addCriterion("CALENDAR_ITEM_ASSIGN.CALENDAR_ITEM_ID between",
                value1, value2, "calendarItemId");

            return this;
        } // end andCalendarItemIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("CALENDAR_ITEM_ASSIGN.CALENDAR_ITEM_ID between",
                value1, value2, "calendarItemId");

            return this;
        } // end andCalendarItemIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdNotBetween(long value1, long value2) {
            addCriterion("CALENDAR_ITEM_ASSIGN.CALENDAR_ITEM_ID not between",
                value1, value2, "calendarItemId");

            return this;
        } // end andCalendarItemIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("CALENDAR_ITEM_ASSIGN.CALENDAR_ITEM_ID not between",
                value1, value2, "calendarItemId");

            return this;
        } // end andCalendarItemIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("CALENDAR_ITEM_ASSIGN.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("CALENDAR_ITEM_ASSIGN.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "CALENDAR_ITEM_ASSIGN.REMARKS is not null AND CALENDAR_ITEM_ASSIGN.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(CALENDAR_ITEM_ASSIGN.REMARKS is null OR CALENDAR_ITEM_ASSIGN.REMARKS = '')");

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
            addCriterion("CALENDAR_ITEM_ASSIGN.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM_ASSIGN.REMARKS");
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
            addCriterion("CALENDAR_ITEM_ASSIGN.REMARKS <>", value, "remarks");

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
            addCriterion("CALENDAR_ITEM_ASSIGN.REMARKS is null OR CALENDAR_ITEM_ASSIGN.REMARKS <>",
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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM_ASSIGN.REMARKS");
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
            addCriterion("CALENDAR_ITEM_ASSIGN.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM_ASSIGN.REMARKS");
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
            addCriterion("CALENDAR_ITEM_ASSIGN.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM_ASSIGN.REMARKS");
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
            addCriterion("CALENDAR_ITEM_ASSIGN.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM_ASSIGN.REMARKS");
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
            addCriterion("CALENDAR_ITEM_ASSIGN.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM_ASSIGN.REMARKS");
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
            addCriterion("CALENDAR_ITEM_ASSIGN.REMARKS like",
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
            addCriterion("CALENDAR_ITEM_ASSIGN.REMARKS not like",
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
                addCriterion("CALENDAR_ITEM_ASSIGN.REMARKS in", values,
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
                addCriterion("CALENDAR_ITEM_ASSIGN.REMARKS not in", values,
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
                addCriterion("CALENDAR_ITEM_ASSIGN.REMARKS in",
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
                addCriterion("CALENDAR_ITEM_ASSIGN.REMARKS not in",
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
            addCriterion("CALENDAR_ITEM_ASSIGN.REMARKS between", value1,
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
            addCriterion("CALENDAR_ITEM_ASSIGN.REMARKS not between", value1,
                value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysUserIdIsNull() {
            addCriterion("CALENDAR_ITEM_ASSIGN.SYS_USER_ID is null");

            return this;
        } // end andSysUserIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysUserIdIsNotNull() {
            addCriterion("CALENDAR_ITEM_ASSIGN.SYS_USER_ID is not null");

            return this;
        } // end andSysUserIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysUserIdIsNotEmpty() {
            addCriterion(
                "CALENDAR_ITEM_ASSIGN.SYS_USER_ID is not null AND CALENDAR_ITEM_ASSIGN.SYS_USER_ID <> ''");

            return this;
        } // end andSysUserIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysUserIdIsEmpty() {
            addCriterion(
                "(CALENDAR_ITEM_ASSIGN.SYS_USER_ID is null OR CALENDAR_ITEM_ASSIGN.SYS_USER_ID = '')");

            return this;
        } // end andSysUserIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysUserIdEqualTo(long value) {
            return andSysUserIdEqualTo(Long.valueOf(value));
        } // end andSysUserIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysUserIdEqualTo(java.lang.Long value) {
            addCriterion("CALENDAR_ITEM_ASSIGN.SYS_USER_ID =", value,
                "sysUserId");

            return this;
        } // end andSysUserIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysUserIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "CALENDAR_ITEM_ASSIGN.SYS_USER_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysUserIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysUserIdNotEqualTo(long value) {
            return andSysUserIdNotEqualTo(Long.valueOf(value));
        } // end andSysUserIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysUserIdNotEqualTo(java.lang.Long value) {
            addCriterion("CALENDAR_ITEM_ASSIGN.SYS_USER_ID <>", value,
                "sysUserId");

            return this;
        } // end andSysUserIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysUserIdNotEqualToOrIsNull(long value) {
            return andSysUserIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andSysUserIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysUserIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("CALENDAR_ITEM_ASSIGN.SYS_USER_ID is null OR CALENDAR_ITEM_ASSIGN.SYS_USER_ID <>",
                value, "sysUserId");

            return this;
        } // end andSysUserIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysUserIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "CALENDAR_ITEM_ASSIGN.SYS_USER_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysUserIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysUserIdGreaterThan(long value) {
            return andSysUserIdGreaterThan(Long.valueOf(value));
        } // end andSysUserIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysUserIdGreaterThan(java.lang.Long value) {
            addCriterion("CALENDAR_ITEM_ASSIGN.SYS_USER_ID >", value,
                "sysUserId");

            return this;
        } // end andSysUserIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysUserIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "CALENDAR_ITEM_ASSIGN.SYS_USER_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysUserIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysUserIdGreaterThanOrEqualTo(long value) {
            return andSysUserIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andSysUserIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysUserIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("CALENDAR_ITEM_ASSIGN.SYS_USER_ID >=", value,
                "sysUserId");

            return this;
        } // end andSysUserIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysUserIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "CALENDAR_ITEM_ASSIGN.SYS_USER_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysUserIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysUserIdLessThan(long value) {
            return andSysUserIdLessThan(Long.valueOf(value));
        } // end andSysUserIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysUserIdLessThan(java.lang.Long value) {
            addCriterion("CALENDAR_ITEM_ASSIGN.SYS_USER_ID <", value,
                "sysUserId");

            return this;
        } // end andSysUserIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysUserIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "CALENDAR_ITEM_ASSIGN.SYS_USER_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysUserIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysUserIdLessThanOrEqualTo(long value) {
            return andSysUserIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andSysUserIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysUserIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("CALENDAR_ITEM_ASSIGN.SYS_USER_ID <=", value,
                "sysUserId");

            return this;
        } // end andSysUserIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysUserIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "CALENDAR_ITEM_ASSIGN.SYS_USER_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysUserIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysUserIdIn(long[] values) {
            if (values.length == 1) {
                return andSysUserIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("CALENDAR_ITEM_ASSIGN.SYS_USER_ID in", values,
                    "sysUserId");

                return this;
            } // end else
        } // end andSysUserIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysUserIdNotIn(long[] values) {
            if (values.length == 1) {
                return andSysUserIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("CALENDAR_ITEM_ASSIGN.SYS_USER_ID not in", values,
                    "sysUserId");

                return this;
            } // end else
        } // end andSysUserIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysUserIdIn(List values) {
            if (values.size() == 1) {
                return andSysUserIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("CALENDAR_ITEM_ASSIGN.SYS_USER_ID in", values,
                    "sysUserId");

                return this;
            } // end else
        } // end andSysUserIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysUserIdNotIn(List values) {
            if (values.size() == 1) {
                return andSysUserIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("CALENDAR_ITEM_ASSIGN.SYS_USER_ID not in", values,
                    "sysUserId");

                return this;
            } // end else
        } // end andSysUserIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysUserIdIn(Object[] values) {
            if (values.length == 1) {
                return andSysUserIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("CALENDAR_ITEM_ASSIGN.SYS_USER_ID in",
                    Arrays.asList(values), "sysUserId");

                return this;
            } // end else
        } // end andSysUserIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysUserIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andSysUserIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("CALENDAR_ITEM_ASSIGN.SYS_USER_ID not in",
                    Arrays.asList(values), "sysUserId");

                return this;
            } // end else
        } // end andSysUserIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysUserIdBetween(long value1, long value2) {
            addCriterion("CALENDAR_ITEM_ASSIGN.SYS_USER_ID between", value1,
                value2, "sysUserId");

            return this;
        } // end andSysUserIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysUserIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("CALENDAR_ITEM_ASSIGN.SYS_USER_ID between", value1,
                value2, "sysUserId");

            return this;
        } // end andSysUserIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysUserIdNotBetween(long value1, long value2) {
            addCriterion("CALENDAR_ITEM_ASSIGN.SYS_USER_ID not between",
                value1, value2, "sysUserId");

            return this;
        } // end andSysUserIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysUserIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("CALENDAR_ITEM_ASSIGN.SYS_USER_ID not between",
                value1, value2, "sysUserId");

            return this;
        } // end andSysUserIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("CALENDAR_ITEM_ASSIGN.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("CALENDAR_ITEM_ASSIGN.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "CALENDAR_ITEM_ASSIGN.STATUS is not null AND CALENDAR_ITEM_ASSIGN.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(CALENDAR_ITEM_ASSIGN.STATUS is null OR CALENDAR_ITEM_ASSIGN.STATUS = '')");

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
            addCriterion("CALENDAR_ITEM_ASSIGN.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM_ASSIGN.STATUS");
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
            addCriterion("CALENDAR_ITEM_ASSIGN.STATUS <>", value, "status");

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
            addCriterion("CALENDAR_ITEM_ASSIGN.STATUS is null OR CALENDAR_ITEM_ASSIGN.STATUS <>",
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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM_ASSIGN.STATUS");
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
            addCriterion("CALENDAR_ITEM_ASSIGN.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM_ASSIGN.STATUS");
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
            addCriterion("CALENDAR_ITEM_ASSIGN.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM_ASSIGN.STATUS");
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
            addCriterion("CALENDAR_ITEM_ASSIGN.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM_ASSIGN.STATUS");
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
            addCriterion("CALENDAR_ITEM_ASSIGN.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM_ASSIGN.STATUS");
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
            addCriterion("CALENDAR_ITEM_ASSIGN.STATUS like", buffer.toString(),
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
            addCriterion("CALENDAR_ITEM_ASSIGN.STATUS not like",
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
                addCriterion("CALENDAR_ITEM_ASSIGN.STATUS in", values, "status");

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
                addCriterion("CALENDAR_ITEM_ASSIGN.STATUS not in", values,
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
                addCriterion("CALENDAR_ITEM_ASSIGN.STATUS in",
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
                addCriterion("CALENDAR_ITEM_ASSIGN.STATUS not in",
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
            addCriterion("CALENDAR_ITEM_ASSIGN.STATUS between", value1, value2,
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
            addCriterion("CALENDAR_ITEM_ASSIGN.STATUS not between", value1,
                value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsLeaderIsNull() {
            addCriterion("CALENDAR_ITEM_ASSIGN.IS_LEADER is null");

            return this;
        } // end andIsLeaderIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsLeaderIsNotNull() {
            addCriterion("CALENDAR_ITEM_ASSIGN.IS_LEADER is not null");

            return this;
        } // end andIsLeaderIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsLeaderIsNotEmpty() {
            addCriterion(
                "CALENDAR_ITEM_ASSIGN.IS_LEADER is not null AND CALENDAR_ITEM_ASSIGN.IS_LEADER <> ''");

            return this;
        } // end andIsLeaderIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsLeaderIsEmpty() {
            addCriterion(
                "(CALENDAR_ITEM_ASSIGN.IS_LEADER is null OR CALENDAR_ITEM_ASSIGN.IS_LEADER = '')");

            return this;
        } // end andIsLeaderIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsLeaderEqualTo(String value) {
            addCriterion("CALENDAR_ITEM_ASSIGN.IS_LEADER =", value, "isLeader");

            return this;
        } // end andIsLeaderEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsLeaderEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "CALENDAR_ITEM_ASSIGN.IS_LEADER");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsLeaderEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsLeaderNotEqualTo(String value) {
            addCriterion("CALENDAR_ITEM_ASSIGN.IS_LEADER <>", value, "isLeader");

            return this;
        } // end andIsLeaderNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsLeaderNotEqualToOrIsNull(String value) {
            addCriterion("CALENDAR_ITEM_ASSIGN.IS_LEADER is null OR CALENDAR_ITEM_ASSIGN.IS_LEADER <>",
                value, "isLeader");

            return this;
        } // end andIsLeaderNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsLeaderNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "CALENDAR_ITEM_ASSIGN.IS_LEADER");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsLeaderNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsLeaderGreaterThan(String value) {
            addCriterion("CALENDAR_ITEM_ASSIGN.IS_LEADER >", value, "isLeader");

            return this;
        } // end andIsLeaderGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsLeaderGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "CALENDAR_ITEM_ASSIGN.IS_LEADER");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsLeaderGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("CALENDAR_ITEM_ASSIGN.IS_LEADER >=", value, "isLeader");

            return this;
        } // end andIsLeaderGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsLeaderGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "CALENDAR_ITEM_ASSIGN.IS_LEADER");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsLeaderGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsLeaderLessThan(String value) {
            addCriterion("CALENDAR_ITEM_ASSIGN.IS_LEADER <", value, "isLeader");

            return this;
        } // end andIsLeaderLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsLeaderLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "CALENDAR_ITEM_ASSIGN.IS_LEADER");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsLeaderLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsLeaderLessThanOrEqualTo(String value) {
            addCriterion("CALENDAR_ITEM_ASSIGN.IS_LEADER <=", value, "isLeader");

            return this;
        } // end andIsLeaderLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsLeaderLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "CALENDAR_ITEM_ASSIGN.IS_LEADER");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsLeaderLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsLeaderLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("CALENDAR_ITEM_ASSIGN.IS_LEADER like",
                buffer.toString(), "isLeader");

            return this;
        } // end andIsLeaderLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsLeaderNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("CALENDAR_ITEM_ASSIGN.IS_LEADER not like",
                buffer.toString(), "isLeader");

            return this;
        } // end andIsLeaderNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsLeaderIn(List values) {
            if (values.size() == 1) {
                return andIsLeaderEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("CALENDAR_ITEM_ASSIGN.IS_LEADER in", values,
                    "isLeader");

                return this;
            } // end else
        } // end andIsLeaderIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsLeaderNotIn(List values) {
            if (values.size() == 1) {
                return andIsLeaderNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("CALENDAR_ITEM_ASSIGN.IS_LEADER not in", values,
                    "isLeader");

                return this;
            } // end else
        } // end andIsLeaderNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsLeaderIn(Object[] values) {
            if (values.length == 1) {
                return andIsLeaderEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("CALENDAR_ITEM_ASSIGN.IS_LEADER in",
                    Arrays.asList(values), "isLeader");

                return this;
            } // end else
        } // end andIsLeaderIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsLeaderNotIn(Object[] values) {
            if (values.length == 1) {
                return andIsLeaderNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("CALENDAR_ITEM_ASSIGN.IS_LEADER not in",
                    Arrays.asList(values), "isLeader");

                return this;
            } // end else
        } // end andIsLeaderNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsLeaderBetween(String value1, String value2) {
            addCriterion("CALENDAR_ITEM_ASSIGN.IS_LEADER between", value1,
                value2, "isLeader");

            return this;
        } // end andIsLeaderBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsLeaderNotBetween(String value1, String value2) {
            addCriterion("CALENDAR_ITEM_ASSIGN.IS_LEADER not between", value1,
                value2, "isLeader");

            return this;
        } // end andIsLeaderNotBetween()
    } // end Criteria
} // end CalendarItemAssignDAOQueryBean
