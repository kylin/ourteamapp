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
 * CalendarDate query bean 2011-09-22 10:18:06
 *
 * @author Auto Gen
 */
public class CalendarDateDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new CalendarDateDAOQueryBean object.
     */
    public CalendarDateDAOQueryBean() {
        super();
    } // end CalendarDateDAOQueryBean()

    /**
     * Creates a new CalendarDateDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public CalendarDateDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end CalendarDateDAOQueryBean()

    /**
     * Creates a new CalendarDateDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public CalendarDateDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end CalendarDateDAOQueryBean()

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
            addSelectProperty(ICalendarDateDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(ICalendarDateDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

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
            addSelectProperty(ICalendarDateDAO.CalendarItemId, aAlias);
        } // end if
        else {
            addSelectProperty(ICalendarDateDAO.CalendarItemId, "calendarItemId");
        } // end else
    } // end addCalendarItemIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addItemDateSelectProperty() {
        addItemDateSelectProperty("itemDate");
    } // end addItemDateSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addItemDateSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ICalendarDateDAO.ItemDate, aAlias);
        } // end if
        else {
            addSelectProperty(ICalendarDateDAO.ItemDate, "itemDate");
        } // end else
    } // end addItemDateSelectProperty()

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
            addSelectProperty(ICalendarDateDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(ICalendarDateDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addCalendarIdSelectProperty() {
        addCalendarIdSelectProperty("calendarId");
    } // end addCalendarIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addCalendarIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ICalendarDateDAO.CalendarId, aAlias);
        } // end if
        else {
            addSelectProperty(ICalendarDateDAO.CalendarId, "calendarId");
        } // end else
    } // end addCalendarIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addCalendarItemIdSelectProperty();

        addItemDateSelectProperty();

        addStatusSelectProperty();

        addCalendarIdSelectProperty();
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
            addCriterion("CALENDAR_DATE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("CALENDAR_DATE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "CALENDAR_DATE.ID is not null AND CALENDAR_DATE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion("(CALENDAR_DATE.ID is null OR CALENDAR_DATE.ID = '')");

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
            addCriterion("CALENDAR_DATE.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("CALENDAR_DATE.ID");
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
            addCriterion("CALENDAR_DATE.ID <>", value, "id");

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
            addCriterion("CALENDAR_DATE.ID is null OR CALENDAR_DATE.ID <>",
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
            StringBuffer str = new StringBuffer("CALENDAR_DATE.ID");
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
            addCriterion("CALENDAR_DATE.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("CALENDAR_DATE.ID");
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
            addCriterion("CALENDAR_DATE.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("CALENDAR_DATE.ID");
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
            addCriterion("CALENDAR_DATE.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("CALENDAR_DATE.ID");
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
            addCriterion("CALENDAR_DATE.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("CALENDAR_DATE.ID");
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
                addCriterion("CALENDAR_DATE.ID in", values, "id");

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
                addCriterion("CALENDAR_DATE.ID not in", values, "id");

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
                addCriterion("CALENDAR_DATE.ID in", values, "id");

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
                addCriterion("CALENDAR_DATE.ID not in", values, "id");

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
                addCriterion("CALENDAR_DATE.ID in", Arrays.asList(values), "id");

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
                addCriterion("CALENDAR_DATE.ID not in", Arrays.asList(values),
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
            addCriterion("CALENDAR_DATE.ID between", value1, value2, "id");

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
            addCriterion("CALENDAR_DATE.ID between", value1, value2, "id");

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
            addCriterion("CALENDAR_DATE.ID not between", value1, value2, "id");

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
            addCriterion("CALENDAR_DATE.ID not between", value1, value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdIsNull() {
            addCriterion("CALENDAR_DATE.CALENDAR_ITEM_ID is null");

            return this;
        } // end andCalendarItemIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdIsNotNull() {
            addCriterion("CALENDAR_DATE.CALENDAR_ITEM_ID is not null");

            return this;
        } // end andCalendarItemIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdIsNotEmpty() {
            addCriterion(
                "CALENDAR_DATE.CALENDAR_ITEM_ID is not null AND CALENDAR_DATE.CALENDAR_ITEM_ID <> ''");

            return this;
        } // end andCalendarItemIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarItemIdIsEmpty() {
            addCriterion(
                "(CALENDAR_DATE.CALENDAR_ITEM_ID is null OR CALENDAR_DATE.CALENDAR_ITEM_ID = '')");

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
            addCriterion("CALENDAR_DATE.CALENDAR_ITEM_ID =", value,
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
                    "CALENDAR_DATE.CALENDAR_ITEM_ID");
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
            addCriterion("CALENDAR_DATE.CALENDAR_ITEM_ID <>", value,
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
            addCriterion("CALENDAR_DATE.CALENDAR_ITEM_ID is null OR CALENDAR_DATE.CALENDAR_ITEM_ID <>",
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
                    "CALENDAR_DATE.CALENDAR_ITEM_ID");
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
            addCriterion("CALENDAR_DATE.CALENDAR_ITEM_ID >", value,
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
                    "CALENDAR_DATE.CALENDAR_ITEM_ID");
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
            addCriterion("CALENDAR_DATE.CALENDAR_ITEM_ID >=", value,
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
                    "CALENDAR_DATE.CALENDAR_ITEM_ID");
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
            addCriterion("CALENDAR_DATE.CALENDAR_ITEM_ID <", value,
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
                    "CALENDAR_DATE.CALENDAR_ITEM_ID");
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
            addCriterion("CALENDAR_DATE.CALENDAR_ITEM_ID <=", value,
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
                    "CALENDAR_DATE.CALENDAR_ITEM_ID");
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
                addCriterion("CALENDAR_DATE.CALENDAR_ITEM_ID in", values,
                    "calendarItemId");

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
                addCriterion("CALENDAR_DATE.CALENDAR_ITEM_ID not in", values,
                    "calendarItemId");

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
                addCriterion("CALENDAR_DATE.CALENDAR_ITEM_ID in", values,
                    "calendarItemId");

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
                addCriterion("CALENDAR_DATE.CALENDAR_ITEM_ID not in", values,
                    "calendarItemId");

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
                addCriterion("CALENDAR_DATE.CALENDAR_ITEM_ID in",
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
                addCriterion("CALENDAR_DATE.CALENDAR_ITEM_ID not in",
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
            addCriterion("CALENDAR_DATE.CALENDAR_ITEM_ID between", value1,
                value2, "calendarItemId");

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
            addCriterion("CALENDAR_DATE.CALENDAR_ITEM_ID between", value1,
                value2, "calendarItemId");

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
            addCriterion("CALENDAR_DATE.CALENDAR_ITEM_ID not between", value1,
                value2, "calendarItemId");

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
            addCriterion("CALENDAR_DATE.CALENDAR_ITEM_ID not between", value1,
                value2, "calendarItemId");

            return this;
        } // end andCalendarItemIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemDateIsNull() {
            addCriterion("CALENDAR_DATE.ITEM_DATE is null");

            return this;
        } // end andItemDateIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemDateIsNotNull() {
            addCriterion("CALENDAR_DATE.ITEM_DATE is not null");

            return this;
        } // end andItemDateIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemDateIsNotEmpty() {
            addCriterion(
                "CALENDAR_DATE.ITEM_DATE is not null AND CALENDAR_DATE.ITEM_DATE <> ''");

            return this;
        } // end andItemDateIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemDateIsEmpty() {
            addCriterion(
                "(CALENDAR_DATE.ITEM_DATE is null OR CALENDAR_DATE.ITEM_DATE = '')");

            return this;
        } // end andItemDateIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemDateEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("CALENDAR_DATE.ITEM_DATE =", value,
                "itemDate");

            return this;
        } // end andItemDateEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemDateEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_DATE.ITEM_DATE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemDateEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemDateNotEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("CALENDAR_DATE.ITEM_DATE <>", value,
                "itemDate");

            return this;
        } // end andItemDateNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemDateNotEqualToOrIsNull(java.util.Date value) {
            addCriterionForJDBCDate("CALENDAR_DATE.ITEM_DATE is null OR CALENDAR_DATE.ITEM_DATE <>",
                value, "itemDate");

            return this;
        } // end andItemDateNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemDateNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_DATE.ITEM_DATE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemDateNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemDateGreaterThan(java.util.Date value) {
            addCriterionForJDBCDate("CALENDAR_DATE.ITEM_DATE >", value,
                "itemDate");

            return this;
        } // end andItemDateGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemDateGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_DATE.ITEM_DATE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemDateGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemDateGreaterThanOrEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("CALENDAR_DATE.ITEM_DATE >=", value,
                "itemDate");

            return this;
        } // end andItemDateGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemDateGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_DATE.ITEM_DATE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemDateGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemDateLessThan(java.util.Date value) {
            addCriterionForJDBCDate("CALENDAR_DATE.ITEM_DATE <", value,
                "itemDate");

            return this;
        } // end andItemDateLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemDateLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_DATE.ITEM_DATE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemDateLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemDateLessThanOrEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("CALENDAR_DATE.ITEM_DATE <=", value,
                "itemDate");

            return this;
        } // end andItemDateLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemDateLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_DATE.ITEM_DATE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemDateLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemDateIn(List values) {
            if (values.size() == 1) {
                return andItemDateEqualTo((java.util.Date) values.get(0));
            } // end if
            else {
                addCriterionForJDBCDate("CALENDAR_DATE.ITEM_DATE in", values,
                    "itemDate");

                return this;
            } // end else
        } // end andItemDateIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemDateNotIn(List values) {
            if (values.size() == 1) {
                return andItemDateNotEqualTo((java.util.Date) values.get(0));
            } // end if
            else {
                addCriterionForJDBCDate("CALENDAR_DATE.ITEM_DATE not in",
                    values, "itemDate");

                return this;
            } // end else
        } // end andItemDateNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemDateIn(Object[] values) {
            if (values.length == 1) {
                return andItemDateEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("CALENDAR_DATE.ITEM_DATE in",
                    Arrays.asList(values), "itemDate");

                return this;
            } // end else
        } // end andItemDateIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemDateNotIn(Object[] values) {
            if (values.length == 1) {
                return andItemDateNotEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("CALENDAR_DATE.ITEM_DATE not in",
                    Arrays.asList(values), "itemDate");

                return this;
            } // end else
        } // end andItemDateNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemDateBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("CALENDAR_DATE.ITEM_DATE between", value1,
                value2, "itemDate");

            return this;
        } // end andItemDateBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemDateNotBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("CALENDAR_DATE.ITEM_DATE not between",
                value1, value2, "itemDate");

            return this;
        } // end andItemDateNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("CALENDAR_DATE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("CALENDAR_DATE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "CALENDAR_DATE.STATUS is not null AND CALENDAR_DATE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(CALENDAR_DATE.STATUS is null OR CALENDAR_DATE.STATUS = '')");

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
            addCriterion("CALENDAR_DATE.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("CALENDAR_DATE.STATUS");
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
            addCriterion("CALENDAR_DATE.STATUS <>", value, "status");

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
            addCriterion("CALENDAR_DATE.STATUS is null OR CALENDAR_DATE.STATUS <>",
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
            StringBuffer str = new StringBuffer("CALENDAR_DATE.STATUS");
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
            addCriterion("CALENDAR_DATE.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("CALENDAR_DATE.STATUS");
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
            addCriterion("CALENDAR_DATE.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("CALENDAR_DATE.STATUS");
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
            addCriterion("CALENDAR_DATE.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("CALENDAR_DATE.STATUS");
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
            addCriterion("CALENDAR_DATE.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("CALENDAR_DATE.STATUS");
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
            addCriterion("CALENDAR_DATE.STATUS like", buffer.toString(),
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
            addCriterion("CALENDAR_DATE.STATUS not like", buffer.toString(),
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
                addCriterion("CALENDAR_DATE.STATUS in", values, "status");

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
                addCriterion("CALENDAR_DATE.STATUS not in", values, "status");

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
                addCriterion("CALENDAR_DATE.STATUS in", Arrays.asList(values),
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
                addCriterion("CALENDAR_DATE.STATUS not in",
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
            addCriterion("CALENDAR_DATE.STATUS between", value1, value2,
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
            addCriterion("CALENDAR_DATE.STATUS not between", value1, value2,
                "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdIsNull() {
            addCriterion("CALENDAR_DATE.CALENDAR_ID is null");

            return this;
        } // end andCalendarIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdIsNotNull() {
            addCriterion("CALENDAR_DATE.CALENDAR_ID is not null");

            return this;
        } // end andCalendarIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdIsNotEmpty() {
            addCriterion(
                "CALENDAR_DATE.CALENDAR_ID is not null AND CALENDAR_DATE.CALENDAR_ID <> ''");

            return this;
        } // end andCalendarIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdIsEmpty() {
            addCriterion(
                "(CALENDAR_DATE.CALENDAR_ID is null OR CALENDAR_DATE.CALENDAR_ID = '')");

            return this;
        } // end andCalendarIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdEqualTo(long value) {
            return andCalendarIdEqualTo(Long.valueOf(value));
        } // end andCalendarIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdEqualTo(java.lang.Long value) {
            addCriterion("CALENDAR_DATE.CALENDAR_ID =", value, "calendarId");

            return this;
        } // end andCalendarIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_DATE.CALENDAR_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCalendarIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdNotEqualTo(long value) {
            return andCalendarIdNotEqualTo(Long.valueOf(value));
        } // end andCalendarIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdNotEqualTo(java.lang.Long value) {
            addCriterion("CALENDAR_DATE.CALENDAR_ID <>", value, "calendarId");

            return this;
        } // end andCalendarIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdNotEqualToOrIsNull(long value) {
            return andCalendarIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andCalendarIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("CALENDAR_DATE.CALENDAR_ID is null OR CALENDAR_DATE.CALENDAR_ID <>",
                value, "calendarId");

            return this;
        } // end andCalendarIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_DATE.CALENDAR_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCalendarIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdGreaterThan(long value) {
            return andCalendarIdGreaterThan(Long.valueOf(value));
        } // end andCalendarIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdGreaterThan(java.lang.Long value) {
            addCriterion("CALENDAR_DATE.CALENDAR_ID >", value, "calendarId");

            return this;
        } // end andCalendarIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_DATE.CALENDAR_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCalendarIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdGreaterThanOrEqualTo(long value) {
            return andCalendarIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andCalendarIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("CALENDAR_DATE.CALENDAR_ID >=", value, "calendarId");

            return this;
        } // end andCalendarIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_DATE.CALENDAR_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCalendarIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdLessThan(long value) {
            return andCalendarIdLessThan(Long.valueOf(value));
        } // end andCalendarIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdLessThan(java.lang.Long value) {
            addCriterion("CALENDAR_DATE.CALENDAR_ID <", value, "calendarId");

            return this;
        } // end andCalendarIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_DATE.CALENDAR_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCalendarIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdLessThanOrEqualTo(long value) {
            return andCalendarIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andCalendarIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("CALENDAR_DATE.CALENDAR_ID <=", value, "calendarId");

            return this;
        } // end andCalendarIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_DATE.CALENDAR_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCalendarIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdIn(long[] values) {
            if (values.length == 1) {
                return andCalendarIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("CALENDAR_DATE.CALENDAR_ID in", values,
                    "calendarId");

                return this;
            } // end else
        } // end andCalendarIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdNotIn(long[] values) {
            if (values.length == 1) {
                return andCalendarIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("CALENDAR_DATE.CALENDAR_ID not in", values,
                    "calendarId");

                return this;
            } // end else
        } // end andCalendarIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdIn(List values) {
            if (values.size() == 1) {
                return andCalendarIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("CALENDAR_DATE.CALENDAR_ID in", values,
                    "calendarId");

                return this;
            } // end else
        } // end andCalendarIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdNotIn(List values) {
            if (values.size() == 1) {
                return andCalendarIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("CALENDAR_DATE.CALENDAR_ID not in", values,
                    "calendarId");

                return this;
            } // end else
        } // end andCalendarIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdIn(Object[] values) {
            if (values.length == 1) {
                return andCalendarIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("CALENDAR_DATE.CALENDAR_ID in",
                    Arrays.asList(values), "calendarId");

                return this;
            } // end else
        } // end andCalendarIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andCalendarIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("CALENDAR_DATE.CALENDAR_ID not in",
                    Arrays.asList(values), "calendarId");

                return this;
            } // end else
        } // end andCalendarIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdBetween(long value1, long value2) {
            addCriterion("CALENDAR_DATE.CALENDAR_ID between", value1, value2,
                "calendarId");

            return this;
        } // end andCalendarIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("CALENDAR_DATE.CALENDAR_ID between", value1, value2,
                "calendarId");

            return this;
        } // end andCalendarIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdNotBetween(long value1, long value2) {
            addCriterion("CALENDAR_DATE.CALENDAR_ID not between", value1,
                value2, "calendarId");

            return this;
        } // end andCalendarIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("CALENDAR_DATE.CALENDAR_ID not between", value1,
                value2, "calendarId");

            return this;
        } // end andCalendarIdNotBetween()
    } // end Criteria
} // end CalendarDateDAOQueryBean
