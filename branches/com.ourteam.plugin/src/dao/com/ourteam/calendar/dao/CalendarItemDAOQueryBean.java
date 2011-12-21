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
 * CalendarItem query bean 2011-09-22 10:18:07
 *
 * @author Auto Gen
 */
public class CalendarItemDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new CalendarItemDAOQueryBean object.
     */
    public CalendarItemDAOQueryBean() {
        super();
    } // end CalendarItemDAOQueryBean()

    /**
     * Creates a new CalendarItemDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public CalendarItemDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end CalendarItemDAOQueryBean()

    /**
     * Creates a new CalendarItemDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public CalendarItemDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end CalendarItemDAOQueryBean()

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
            addSelectProperty(ICalendarItemDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(ICalendarItemDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAlermConfigSelectProperty() {
        addAlermConfigSelectProperty("alermConfig");
    } // end addAlermConfigSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addAlermConfigSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ICalendarItemDAO.AlermConfig, aAlias);
        } // end if
        else {
            addSelectProperty(ICalendarItemDAO.AlermConfig, "alermConfig");
        } // end else
    } // end addAlermConfigSelectProperty()

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
            addSelectProperty(ICalendarItemDAO.CalendarId, aAlias);
        } // end if
        else {
            addSelectProperty(ICalendarItemDAO.CalendarId, "calendarId");
        } // end else
    } // end addCalendarIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addEndDateTimeSelectProperty() {
        addEndDateTimeSelectProperty("endDateTime");
    } // end addEndDateTimeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addEndDateTimeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ICalendarItemDAO.EndDateTime, aAlias);
        } // end if
        else {
            addSelectProperty(ICalendarItemDAO.EndDateTime, "endDateTime");
        } // end else
    } // end addEndDateTimeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addFullDateItemSelectProperty() {
        addFullDateItemSelectProperty("fullDateItem");
    } // end addFullDateItemSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addFullDateItemSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ICalendarItemDAO.FullDateItem, aAlias);
        } // end if
        else {
            addSelectProperty(ICalendarItemDAO.FullDateItem, "fullDateItem");
        } // end else
    } // end addFullDateItemSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addItemAttchmentSelectProperty() {
        addItemAttchmentSelectProperty("itemAttchment");
    } // end addItemAttchmentSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addItemAttchmentSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ICalendarItemDAO.ItemAttchment, aAlias);
        } // end if
        else {
            addSelectProperty(ICalendarItemDAO.ItemAttchment, "itemAttchment");
        } // end else
    } // end addItemAttchmentSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addItemContentSelectProperty() {
        addItemContentSelectProperty("itemContent");
    } // end addItemContentSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addItemContentSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ICalendarItemDAO.ItemContent, aAlias);
        } // end if
        else {
            addSelectProperty(ICalendarItemDAO.ItemContent, "itemContent");
        } // end else
    } // end addItemContentSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addItemLocaltionSelectProperty() {
        addItemLocaltionSelectProperty("itemLocaltion");
    } // end addItemLocaltionSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addItemLocaltionSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ICalendarItemDAO.ItemLocaltion, aAlias);
        } // end if
        else {
            addSelectProperty(ICalendarItemDAO.ItemLocaltion, "itemLocaltion");
        } // end else
    } // end addItemLocaltionSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addItemTitleSelectProperty() {
        addItemTitleSelectProperty("itemTitle");
    } // end addItemTitleSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addItemTitleSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ICalendarItemDAO.ItemTitle, aAlias);
        } // end if
        else {
            addSelectProperty(ICalendarItemDAO.ItemTitle, "itemTitle");
        } // end else
    } // end addItemTitleSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addProtectedTypeSelectProperty() {
        addProtectedTypeSelectProperty("protectedType");
    } // end addProtectedTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addProtectedTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ICalendarItemDAO.ProtectedType, aAlias);
        } // end if
        else {
            addSelectProperty(ICalendarItemDAO.ProtectedType, "protectedType");
        } // end else
    } // end addProtectedTypeSelectProperty()

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
            addSelectProperty(ICalendarItemDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(ICalendarItemDAO.Remarks, "remarks");
        } // end else
    } // end addRemarksSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRepeateConfigSelectProperty() {
        addRepeateConfigSelectProperty("repeateConfig");
    } // end addRepeateConfigSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRepeateConfigSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ICalendarItemDAO.RepeateConfig, aAlias);
        } // end if
        else {
            addSelectProperty(ICalendarItemDAO.RepeateConfig, "repeateConfig");
        } // end else
    } // end addRepeateConfigSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addStartDateTimeSelectProperty() {
        addStartDateTimeSelectProperty("startDateTime");
    } // end addStartDateTimeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addStartDateTimeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ICalendarItemDAO.StartDateTime, aAlias);
        } // end if
        else {
            addSelectProperty(ICalendarItemDAO.StartDateTime, "startDateTime");
        } // end else
    } // end addStartDateTimeSelectProperty()

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
            addSelectProperty(ICalendarItemDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(ICalendarItemDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addCalendarNameSelectProperty() {
        addCalendarNameSelectProperty("calendarName");
    } // end addCalendarNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addCalendarNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ICalendarItemDAO.CalendarName, aAlias);
        } // end if
        else {
            addSelectProperty(ICalendarItemDAO.CalendarName, "calendarName");
        } // end else
    } // end addCalendarNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addCalendarTypeSelectProperty() {
        addCalendarTypeSelectProperty("calendarType");
    } // end addCalendarTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addCalendarTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ICalendarItemDAO.CalendarType, aAlias);
        } // end if
        else {
            addSelectProperty(ICalendarItemDAO.CalendarType, "calendarType");
        } // end else
    } // end addCalendarTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addCalendarStyleSelectProperty() {
        addCalendarStyleSelectProperty("calendarStyle");
    } // end addCalendarStyleSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addCalendarStyleSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ICalendarItemDAO.CalendarStyle, aAlias);
        } // end if
        else {
            addSelectProperty(ICalendarItemDAO.CalendarStyle, "calendarStyle");
        } // end else
    } // end addCalendarStyleSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addOwnerIdSelectProperty() {
        addOwnerIdSelectProperty("ownerId");
    } // end addOwnerIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addOwnerIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ICalendarItemDAO.OwnerId, aAlias);
        } // end if
        else {
            addSelectProperty(ICalendarItemDAO.OwnerId, "ownerId");
        } // end else
    } // end addOwnerIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addAlermConfigSelectProperty();

        addCalendarIdSelectProperty();

        addEndDateTimeSelectProperty();

        addFullDateItemSelectProperty();

        addItemAttchmentSelectProperty();

        addItemContentSelectProperty();

        addItemLocaltionSelectProperty();

        addItemTitleSelectProperty();

        addProtectedTypeSelectProperty();

        addRemarksSelectProperty();

        addRepeateConfigSelectProperty();

        addStartDateTimeSelectProperty();

        addStatusSelectProperty();

        addCalendarNameSelectProperty();

        addCalendarTypeSelectProperty();

        addCalendarStyleSelectProperty();

        addOwnerIdSelectProperty();
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
            addCriterion("CALENDAR_ITEM.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("CALENDAR_ITEM.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "CALENDAR_ITEM.ID is not null AND CALENDAR_ITEM.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion("(CALENDAR_ITEM.ID is null OR CALENDAR_ITEM.ID = '')");

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
            addCriterion("CALENDAR_ITEM.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.ID");
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
            addCriterion("CALENDAR_ITEM.ID <>", value, "id");

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
            addCriterion("CALENDAR_ITEM.ID is null OR CALENDAR_ITEM.ID <>",
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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.ID");
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
            addCriterion("CALENDAR_ITEM.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.ID");
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
            addCriterion("CALENDAR_ITEM.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.ID");
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
            addCriterion("CALENDAR_ITEM.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.ID");
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
            addCriterion("CALENDAR_ITEM.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.ID");
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
                addCriterion("CALENDAR_ITEM.ID in", values, "id");

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
                addCriterion("CALENDAR_ITEM.ID not in", values, "id");

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
                addCriterion("CALENDAR_ITEM.ID in", values, "id");

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
                addCriterion("CALENDAR_ITEM.ID not in", values, "id");

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
                addCriterion("CALENDAR_ITEM.ID in", Arrays.asList(values), "id");

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
                addCriterion("CALENDAR_ITEM.ID not in", Arrays.asList(values),
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
            addCriterion("CALENDAR_ITEM.ID between", value1, value2, "id");

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
            addCriterion("CALENDAR_ITEM.ID between", value1, value2, "id");

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
            addCriterion("CALENDAR_ITEM.ID not between", value1, value2, "id");

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
            addCriterion("CALENDAR_ITEM.ID not between", value1, value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAlermConfigIsNull() {
            addCriterion("CALENDAR_ITEM.ALERM_CONFIG is null");

            return this;
        } // end andAlermConfigIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAlermConfigIsNotNull() {
            addCriterion("CALENDAR_ITEM.ALERM_CONFIG is not null");

            return this;
        } // end andAlermConfigIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAlermConfigIsNotEmpty() {
            addCriterion(
                "CALENDAR_ITEM.ALERM_CONFIG is not null AND CALENDAR_ITEM.ALERM_CONFIG <> ''");

            return this;
        } // end andAlermConfigIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAlermConfigIsEmpty() {
            addCriterion(
                "(CALENDAR_ITEM.ALERM_CONFIG is null OR CALENDAR_ITEM.ALERM_CONFIG = '')");

            return this;
        } // end andAlermConfigIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAlermConfigEqualTo(String value) {
            addCriterion("CALENDAR_ITEM.ALERM_CONFIG =", value, "alermConfig");

            return this;
        } // end andAlermConfigEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAlermConfigEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.ALERM_CONFIG");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAlermConfigEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAlermConfigNotEqualTo(String value) {
            addCriterion("CALENDAR_ITEM.ALERM_CONFIG <>", value, "alermConfig");

            return this;
        } // end andAlermConfigNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAlermConfigNotEqualToOrIsNull(String value) {
            addCriterion("CALENDAR_ITEM.ALERM_CONFIG is null OR CALENDAR_ITEM.ALERM_CONFIG <>",
                value, "alermConfig");

            return this;
        } // end andAlermConfigNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAlermConfigNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.ALERM_CONFIG");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAlermConfigNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAlermConfigGreaterThan(String value) {
            addCriterion("CALENDAR_ITEM.ALERM_CONFIG >", value, "alermConfig");

            return this;
        } // end andAlermConfigGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAlermConfigGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.ALERM_CONFIG");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAlermConfigGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAlermConfigGreaterThanOrEqualTo(String value) {
            addCriterion("CALENDAR_ITEM.ALERM_CONFIG >=", value, "alermConfig");

            return this;
        } // end andAlermConfigGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAlermConfigGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.ALERM_CONFIG");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAlermConfigGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAlermConfigLessThan(String value) {
            addCriterion("CALENDAR_ITEM.ALERM_CONFIG <", value, "alermConfig");

            return this;
        } // end andAlermConfigLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAlermConfigLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.ALERM_CONFIG");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAlermConfigLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAlermConfigLessThanOrEqualTo(String value) {
            addCriterion("CALENDAR_ITEM.ALERM_CONFIG <=", value, "alermConfig");

            return this;
        } // end andAlermConfigLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAlermConfigLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.ALERM_CONFIG");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andAlermConfigLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAlermConfigLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("CALENDAR_ITEM.ALERM_CONFIG like", buffer.toString(),
                "alermConfig");

            return this;
        } // end andAlermConfigLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAlermConfigNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("CALENDAR_ITEM.ALERM_CONFIG not like",
                buffer.toString(), "alermConfig");

            return this;
        } // end andAlermConfigNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAlermConfigIn(List values) {
            if (values.size() == 1) {
                return andAlermConfigEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("CALENDAR_ITEM.ALERM_CONFIG in", values,
                    "alermConfig");

                return this;
            } // end else
        } // end andAlermConfigIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAlermConfigNotIn(List values) {
            if (values.size() == 1) {
                return andAlermConfigNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("CALENDAR_ITEM.ALERM_CONFIG not in", values,
                    "alermConfig");

                return this;
            } // end else
        } // end andAlermConfigNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAlermConfigIn(Object[] values) {
            if (values.length == 1) {
                return andAlermConfigEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("CALENDAR_ITEM.ALERM_CONFIG in",
                    Arrays.asList(values), "alermConfig");

                return this;
            } // end else
        } // end andAlermConfigIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAlermConfigNotIn(Object[] values) {
            if (values.length == 1) {
                return andAlermConfigNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("CALENDAR_ITEM.ALERM_CONFIG not in",
                    Arrays.asList(values), "alermConfig");

                return this;
            } // end else
        } // end andAlermConfigNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAlermConfigBetween(String value1, String value2) {
            addCriterion("CALENDAR_ITEM.ALERM_CONFIG between", value1, value2,
                "alermConfig");

            return this;
        } // end andAlermConfigBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andAlermConfigNotBetween(String value1, String value2) {
            addCriterion("CALENDAR_ITEM.ALERM_CONFIG not between", value1,
                value2, "alermConfig");

            return this;
        } // end andAlermConfigNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdIsNull() {
            addCriterion("CALENDAR_ITEM.CALENDAR_ID is null");

            return this;
        } // end andCalendarIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdIsNotNull() {
            addCriterion("CALENDAR_ITEM.CALENDAR_ID is not null");

            return this;
        } // end andCalendarIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdIsNotEmpty() {
            addCriterion(
                "CALENDAR_ITEM.CALENDAR_ID is not null AND CALENDAR_ITEM.CALENDAR_ID <> ''");

            return this;
        } // end andCalendarIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarIdIsEmpty() {
            addCriterion(
                "(CALENDAR_ITEM.CALENDAR_ID is null OR CALENDAR_ITEM.CALENDAR_ID = '')");

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
            addCriterion("CALENDAR_ITEM.CALENDAR_ID =", value, "calendarId");

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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.CALENDAR_ID");
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
            addCriterion("CALENDAR_ITEM.CALENDAR_ID <>", value, "calendarId");

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
            addCriterion("CALENDAR_ITEM.CALENDAR_ID is null OR CALENDAR_ITEM.CALENDAR_ID <>",
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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.CALENDAR_ID");
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
            addCriterion("CALENDAR_ITEM.CALENDAR_ID >", value, "calendarId");

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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.CALENDAR_ID");
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
            addCriterion("CALENDAR_ITEM.CALENDAR_ID >=", value, "calendarId");

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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.CALENDAR_ID");
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
            addCriterion("CALENDAR_ITEM.CALENDAR_ID <", value, "calendarId");

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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.CALENDAR_ID");
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
            addCriterion("CALENDAR_ITEM.CALENDAR_ID <=", value, "calendarId");

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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.CALENDAR_ID");
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
                addCriterion("CALENDAR_ITEM.CALENDAR_ID in", values,
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
                addCriterion("CALENDAR_ITEM.CALENDAR_ID not in", values,
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
                addCriterion("CALENDAR_ITEM.CALENDAR_ID in", values,
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
                addCriterion("CALENDAR_ITEM.CALENDAR_ID not in", values,
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
                addCriterion("CALENDAR_ITEM.CALENDAR_ID in",
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
                addCriterion("CALENDAR_ITEM.CALENDAR_ID not in",
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
            addCriterion("CALENDAR_ITEM.CALENDAR_ID between", value1, value2,
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
            addCriterion("CALENDAR_ITEM.CALENDAR_ID between", value1, value2,
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
            addCriterion("CALENDAR_ITEM.CALENDAR_ID not between", value1,
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
            addCriterion("CALENDAR_ITEM.CALENDAR_ID not between", value1,
                value2, "calendarId");

            return this;
        } // end andCalendarIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeIsNull() {
            addCriterion("CALENDAR_ITEM.END_DATE_TIME is null");

            return this;
        } // end andEndDateTimeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeIsNotNull() {
            addCriterion("CALENDAR_ITEM.END_DATE_TIME is not null");

            return this;
        } // end andEndDateTimeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeIsNotEmpty() {
            addCriterion(
                "CALENDAR_ITEM.END_DATE_TIME is not null AND CALENDAR_ITEM.END_DATE_TIME <> ''");

            return this;
        } // end andEndDateTimeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeIsEmpty() {
            addCriterion(
                "(CALENDAR_ITEM.END_DATE_TIME is null OR CALENDAR_ITEM.END_DATE_TIME = '')");

            return this;
        } // end andEndDateTimeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("CALENDAR_ITEM.END_DATE_TIME =", value,
                "endDateTime");

            return this;
        } // end andEndDateTimeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.END_DATE_TIME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEndDateTimeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeNotEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("CALENDAR_ITEM.END_DATE_TIME <>", value,
                "endDateTime");

            return this;
        } // end andEndDateTimeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeNotEqualToOrIsNull(java.util.Date value) {
            addCriterionForJDBCDate("CALENDAR_ITEM.END_DATE_TIME is null OR CALENDAR_ITEM.END_DATE_TIME <>",
                value, "endDateTime");

            return this;
        } // end andEndDateTimeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.END_DATE_TIME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEndDateTimeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeGreaterThan(java.util.Date value) {
            addCriterionForJDBCDate("CALENDAR_ITEM.END_DATE_TIME >", value,
                "endDateTime");

            return this;
        } // end andEndDateTimeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.END_DATE_TIME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEndDateTimeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeGreaterThanOrEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("CALENDAR_ITEM.END_DATE_TIME >=", value,
                "endDateTime");

            return this;
        } // end andEndDateTimeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.END_DATE_TIME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEndDateTimeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeLessThan(java.util.Date value) {
            addCriterionForJDBCDate("CALENDAR_ITEM.END_DATE_TIME <", value,
                "endDateTime");

            return this;
        } // end andEndDateTimeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.END_DATE_TIME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEndDateTimeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeLessThanOrEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("CALENDAR_ITEM.END_DATE_TIME <=", value,
                "endDateTime");

            return this;
        } // end andEndDateTimeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.END_DATE_TIME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEndDateTimeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeIn(List values) {
            if (values.size() == 1) {
                return andEndDateTimeEqualTo((java.util.Date) values.get(0));
            } // end if
            else {
                addCriterionForJDBCDate("CALENDAR_ITEM.END_DATE_TIME in",
                    values, "endDateTime");

                return this;
            } // end else
        } // end andEndDateTimeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeNotIn(List values) {
            if (values.size() == 1) {
                return andEndDateTimeNotEqualTo((java.util.Date) values.get(0));
            } // end if
            else {
                addCriterionForJDBCDate("CALENDAR_ITEM.END_DATE_TIME not in",
                    values, "endDateTime");

                return this;
            } // end else
        } // end andEndDateTimeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeIn(Object[] values) {
            if (values.length == 1) {
                return andEndDateTimeEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("CALENDAR_ITEM.END_DATE_TIME in",
                    Arrays.asList(values), "endDateTime");

                return this;
            } // end else
        } // end andEndDateTimeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeNotIn(Object[] values) {
            if (values.length == 1) {
                return andEndDateTimeNotEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("CALENDAR_ITEM.END_DATE_TIME not in",
                    Arrays.asList(values), "endDateTime");

                return this;
            } // end else
        } // end andEndDateTimeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("CALENDAR_ITEM.END_DATE_TIME between",
                value1, value2, "endDateTime");

            return this;
        } // end andEndDateTimeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndDateTimeNotBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("CALENDAR_ITEM.END_DATE_TIME not between",
                value1, value2, "endDateTime");

            return this;
        } // end andEndDateTimeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFullDateItemIsNull() {
            addCriterion("CALENDAR_ITEM.FULL_DATE_ITEM is null");

            return this;
        } // end andFullDateItemIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFullDateItemIsNotNull() {
            addCriterion("CALENDAR_ITEM.FULL_DATE_ITEM is not null");

            return this;
        } // end andFullDateItemIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFullDateItemIsNotEmpty() {
            addCriterion(
                "CALENDAR_ITEM.FULL_DATE_ITEM is not null AND CALENDAR_ITEM.FULL_DATE_ITEM <> ''");

            return this;
        } // end andFullDateItemIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFullDateItemIsEmpty() {
            addCriterion(
                "(CALENDAR_ITEM.FULL_DATE_ITEM is null OR CALENDAR_ITEM.FULL_DATE_ITEM = '')");

            return this;
        } // end andFullDateItemIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFullDateItemEqualTo(String value) {
            addCriterion("CALENDAR_ITEM.FULL_DATE_ITEM =", value, "fullDateItem");

            return this;
        } // end andFullDateItemEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFullDateItemEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.FULL_DATE_ITEM");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFullDateItemEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFullDateItemNotEqualTo(String value) {
            addCriterion("CALENDAR_ITEM.FULL_DATE_ITEM <>", value,
                "fullDateItem");

            return this;
        } // end andFullDateItemNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFullDateItemNotEqualToOrIsNull(String value) {
            addCriterion("CALENDAR_ITEM.FULL_DATE_ITEM is null OR CALENDAR_ITEM.FULL_DATE_ITEM <>",
                value, "fullDateItem");

            return this;
        } // end andFullDateItemNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFullDateItemNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.FULL_DATE_ITEM");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFullDateItemNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFullDateItemGreaterThan(String value) {
            addCriterion("CALENDAR_ITEM.FULL_DATE_ITEM >", value, "fullDateItem");

            return this;
        } // end andFullDateItemGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFullDateItemGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.FULL_DATE_ITEM");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFullDateItemGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFullDateItemGreaterThanOrEqualTo(String value) {
            addCriterion("CALENDAR_ITEM.FULL_DATE_ITEM >=", value,
                "fullDateItem");

            return this;
        } // end andFullDateItemGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFullDateItemGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.FULL_DATE_ITEM");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFullDateItemGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFullDateItemLessThan(String value) {
            addCriterion("CALENDAR_ITEM.FULL_DATE_ITEM <", value, "fullDateItem");

            return this;
        } // end andFullDateItemLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFullDateItemLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.FULL_DATE_ITEM");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFullDateItemLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFullDateItemLessThanOrEqualTo(String value) {
            addCriterion("CALENDAR_ITEM.FULL_DATE_ITEM <=", value,
                "fullDateItem");

            return this;
        } // end andFullDateItemLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFullDateItemLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.FULL_DATE_ITEM");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andFullDateItemLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFullDateItemLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("CALENDAR_ITEM.FULL_DATE_ITEM like",
                buffer.toString(), "fullDateItem");

            return this;
        } // end andFullDateItemLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFullDateItemNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("CALENDAR_ITEM.FULL_DATE_ITEM not like",
                buffer.toString(), "fullDateItem");

            return this;
        } // end andFullDateItemNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFullDateItemIn(List values) {
            if (values.size() == 1) {
                return andFullDateItemEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("CALENDAR_ITEM.FULL_DATE_ITEM in", values,
                    "fullDateItem");

                return this;
            } // end else
        } // end andFullDateItemIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFullDateItemNotIn(List values) {
            if (values.size() == 1) {
                return andFullDateItemNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("CALENDAR_ITEM.FULL_DATE_ITEM not in", values,
                    "fullDateItem");

                return this;
            } // end else
        } // end andFullDateItemNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFullDateItemIn(Object[] values) {
            if (values.length == 1) {
                return andFullDateItemEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("CALENDAR_ITEM.FULL_DATE_ITEM in",
                    Arrays.asList(values), "fullDateItem");

                return this;
            } // end else
        } // end andFullDateItemIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFullDateItemNotIn(Object[] values) {
            if (values.length == 1) {
                return andFullDateItemNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("CALENDAR_ITEM.FULL_DATE_ITEM not in",
                    Arrays.asList(values), "fullDateItem");

                return this;
            } // end else
        } // end andFullDateItemNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFullDateItemBetween(String value1, String value2) {
            addCriterion("CALENDAR_ITEM.FULL_DATE_ITEM between", value1,
                value2, "fullDateItem");

            return this;
        } // end andFullDateItemBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andFullDateItemNotBetween(String value1, String value2) {
            addCriterion("CALENDAR_ITEM.FULL_DATE_ITEM not between", value1,
                value2, "fullDateItem");

            return this;
        } // end andFullDateItemNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemAttchmentIsNull() {
            addCriterion("CALENDAR_ITEM.ITEM_ATTCHMENT is null");

            return this;
        } // end andItemAttchmentIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemAttchmentIsNotNull() {
            addCriterion("CALENDAR_ITEM.ITEM_ATTCHMENT is not null");

            return this;
        } // end andItemAttchmentIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemAttchmentIsNotEmpty() {
            addCriterion(
                "CALENDAR_ITEM.ITEM_ATTCHMENT is not null AND CALENDAR_ITEM.ITEM_ATTCHMENT <> ''");

            return this;
        } // end andItemAttchmentIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemAttchmentIsEmpty() {
            addCriterion(
                "(CALENDAR_ITEM.ITEM_ATTCHMENT is null OR CALENDAR_ITEM.ITEM_ATTCHMENT = '')");

            return this;
        } // end andItemAttchmentIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemAttchmentEqualTo(String value) {
            addCriterion("CALENDAR_ITEM.ITEM_ATTCHMENT =", value,
                "itemAttchment");

            return this;
        } // end andItemAttchmentEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemAttchmentEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.ITEM_ATTCHMENT");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemAttchmentEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemAttchmentNotEqualTo(String value) {
            addCriterion("CALENDAR_ITEM.ITEM_ATTCHMENT <>", value,
                "itemAttchment");

            return this;
        } // end andItemAttchmentNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemAttchmentNotEqualToOrIsNull(String value) {
            addCriterion("CALENDAR_ITEM.ITEM_ATTCHMENT is null OR CALENDAR_ITEM.ITEM_ATTCHMENT <>",
                value, "itemAttchment");

            return this;
        } // end andItemAttchmentNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemAttchmentNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.ITEM_ATTCHMENT");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemAttchmentNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemAttchmentGreaterThan(String value) {
            addCriterion("CALENDAR_ITEM.ITEM_ATTCHMENT >", value,
                "itemAttchment");

            return this;
        } // end andItemAttchmentGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemAttchmentGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.ITEM_ATTCHMENT");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemAttchmentGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemAttchmentGreaterThanOrEqualTo(String value) {
            addCriterion("CALENDAR_ITEM.ITEM_ATTCHMENT >=", value,
                "itemAttchment");

            return this;
        } // end andItemAttchmentGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemAttchmentGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.ITEM_ATTCHMENT");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemAttchmentGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemAttchmentLessThan(String value) {
            addCriterion("CALENDAR_ITEM.ITEM_ATTCHMENT <", value,
                "itemAttchment");

            return this;
        } // end andItemAttchmentLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemAttchmentLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.ITEM_ATTCHMENT");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemAttchmentLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemAttchmentLessThanOrEqualTo(String value) {
            addCriterion("CALENDAR_ITEM.ITEM_ATTCHMENT <=", value,
                "itemAttchment");

            return this;
        } // end andItemAttchmentLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemAttchmentLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.ITEM_ATTCHMENT");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemAttchmentLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemAttchmentLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("CALENDAR_ITEM.ITEM_ATTCHMENT like",
                buffer.toString(), "itemAttchment");

            return this;
        } // end andItemAttchmentLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemAttchmentNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("CALENDAR_ITEM.ITEM_ATTCHMENT not like",
                buffer.toString(), "itemAttchment");

            return this;
        } // end andItemAttchmentNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemAttchmentIn(List values) {
            if (values.size() == 1) {
                return andItemAttchmentEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("CALENDAR_ITEM.ITEM_ATTCHMENT in", values,
                    "itemAttchment");

                return this;
            } // end else
        } // end andItemAttchmentIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemAttchmentNotIn(List values) {
            if (values.size() == 1) {
                return andItemAttchmentNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("CALENDAR_ITEM.ITEM_ATTCHMENT not in", values,
                    "itemAttchment");

                return this;
            } // end else
        } // end andItemAttchmentNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemAttchmentIn(Object[] values) {
            if (values.length == 1) {
                return andItemAttchmentEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("CALENDAR_ITEM.ITEM_ATTCHMENT in",
                    Arrays.asList(values), "itemAttchment");

                return this;
            } // end else
        } // end andItemAttchmentIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemAttchmentNotIn(Object[] values) {
            if (values.length == 1) {
                return andItemAttchmentNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("CALENDAR_ITEM.ITEM_ATTCHMENT not in",
                    Arrays.asList(values), "itemAttchment");

                return this;
            } // end else
        } // end andItemAttchmentNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemAttchmentBetween(String value1, String value2) {
            addCriterion("CALENDAR_ITEM.ITEM_ATTCHMENT between", value1,
                value2, "itemAttchment");

            return this;
        } // end andItemAttchmentBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemAttchmentNotBetween(String value1, String value2) {
            addCriterion("CALENDAR_ITEM.ITEM_ATTCHMENT not between", value1,
                value2, "itemAttchment");

            return this;
        } // end andItemAttchmentNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemContentIsNull() {
            addCriterion("CALENDAR_ITEM.ITEM_CONTENT is null");

            return this;
        } // end andItemContentIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemContentIsNotNull() {
            addCriterion("CALENDAR_ITEM.ITEM_CONTENT is not null");

            return this;
        } // end andItemContentIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemContentIsNotEmpty() {
            addCriterion(
                "CALENDAR_ITEM.ITEM_CONTENT is not null AND CALENDAR_ITEM.ITEM_CONTENT <> ''");

            return this;
        } // end andItemContentIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemContentIsEmpty() {
            addCriterion(
                "(CALENDAR_ITEM.ITEM_CONTENT is null OR CALENDAR_ITEM.ITEM_CONTENT = '')");

            return this;
        } // end andItemContentIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemContentEqualTo(String value) {
            addCriterion("CALENDAR_ITEM.ITEM_CONTENT =", value, "itemContent");

            return this;
        } // end andItemContentEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemContentEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.ITEM_CONTENT");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemContentEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemContentNotEqualTo(String value) {
            addCriterion("CALENDAR_ITEM.ITEM_CONTENT <>", value, "itemContent");

            return this;
        } // end andItemContentNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemContentNotEqualToOrIsNull(String value) {
            addCriterion("CALENDAR_ITEM.ITEM_CONTENT is null OR CALENDAR_ITEM.ITEM_CONTENT <>",
                value, "itemContent");

            return this;
        } // end andItemContentNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemContentNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.ITEM_CONTENT");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemContentNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemContentGreaterThan(String value) {
            addCriterion("CALENDAR_ITEM.ITEM_CONTENT >", value, "itemContent");

            return this;
        } // end andItemContentGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemContentGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.ITEM_CONTENT");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemContentGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemContentGreaterThanOrEqualTo(String value) {
            addCriterion("CALENDAR_ITEM.ITEM_CONTENT >=", value, "itemContent");

            return this;
        } // end andItemContentGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemContentGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.ITEM_CONTENT");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemContentGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemContentLessThan(String value) {
            addCriterion("CALENDAR_ITEM.ITEM_CONTENT <", value, "itemContent");

            return this;
        } // end andItemContentLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemContentLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.ITEM_CONTENT");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemContentLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemContentLessThanOrEqualTo(String value) {
            addCriterion("CALENDAR_ITEM.ITEM_CONTENT <=", value, "itemContent");

            return this;
        } // end andItemContentLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemContentLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.ITEM_CONTENT");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemContentLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemContentLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("CALENDAR_ITEM.ITEM_CONTENT like", buffer.toString(),
                "itemContent");

            return this;
        } // end andItemContentLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemContentNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("CALENDAR_ITEM.ITEM_CONTENT not like",
                buffer.toString(), "itemContent");

            return this;
        } // end andItemContentNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemContentIn(List values) {
            if (values.size() == 1) {
                return andItemContentEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("CALENDAR_ITEM.ITEM_CONTENT in", values,
                    "itemContent");

                return this;
            } // end else
        } // end andItemContentIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemContentNotIn(List values) {
            if (values.size() == 1) {
                return andItemContentNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("CALENDAR_ITEM.ITEM_CONTENT not in", values,
                    "itemContent");

                return this;
            } // end else
        } // end andItemContentNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemContentIn(Object[] values) {
            if (values.length == 1) {
                return andItemContentEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("CALENDAR_ITEM.ITEM_CONTENT in",
                    Arrays.asList(values), "itemContent");

                return this;
            } // end else
        } // end andItemContentIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemContentNotIn(Object[] values) {
            if (values.length == 1) {
                return andItemContentNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("CALENDAR_ITEM.ITEM_CONTENT not in",
                    Arrays.asList(values), "itemContent");

                return this;
            } // end else
        } // end andItemContentNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemContentBetween(String value1, String value2) {
            addCriterion("CALENDAR_ITEM.ITEM_CONTENT between", value1, value2,
                "itemContent");

            return this;
        } // end andItemContentBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemContentNotBetween(String value1, String value2) {
            addCriterion("CALENDAR_ITEM.ITEM_CONTENT not between", value1,
                value2, "itemContent");

            return this;
        } // end andItemContentNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemLocaltionIsNull() {
            addCriterion("CALENDAR_ITEM.ITEM_LOCALTION is null");

            return this;
        } // end andItemLocaltionIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemLocaltionIsNotNull() {
            addCriterion("CALENDAR_ITEM.ITEM_LOCALTION is not null");

            return this;
        } // end andItemLocaltionIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemLocaltionIsNotEmpty() {
            addCriterion(
                "CALENDAR_ITEM.ITEM_LOCALTION is not null AND CALENDAR_ITEM.ITEM_LOCALTION <> ''");

            return this;
        } // end andItemLocaltionIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemLocaltionIsEmpty() {
            addCriterion(
                "(CALENDAR_ITEM.ITEM_LOCALTION is null OR CALENDAR_ITEM.ITEM_LOCALTION = '')");

            return this;
        } // end andItemLocaltionIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemLocaltionEqualTo(String value) {
            addCriterion("CALENDAR_ITEM.ITEM_LOCALTION =", value,
                "itemLocaltion");

            return this;
        } // end andItemLocaltionEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemLocaltionEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.ITEM_LOCALTION");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemLocaltionEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemLocaltionNotEqualTo(String value) {
            addCriterion("CALENDAR_ITEM.ITEM_LOCALTION <>", value,
                "itemLocaltion");

            return this;
        } // end andItemLocaltionNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemLocaltionNotEqualToOrIsNull(String value) {
            addCriterion("CALENDAR_ITEM.ITEM_LOCALTION is null OR CALENDAR_ITEM.ITEM_LOCALTION <>",
                value, "itemLocaltion");

            return this;
        } // end andItemLocaltionNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemLocaltionNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.ITEM_LOCALTION");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemLocaltionNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemLocaltionGreaterThan(String value) {
            addCriterion("CALENDAR_ITEM.ITEM_LOCALTION >", value,
                "itemLocaltion");

            return this;
        } // end andItemLocaltionGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemLocaltionGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.ITEM_LOCALTION");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemLocaltionGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemLocaltionGreaterThanOrEqualTo(String value) {
            addCriterion("CALENDAR_ITEM.ITEM_LOCALTION >=", value,
                "itemLocaltion");

            return this;
        } // end andItemLocaltionGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemLocaltionGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.ITEM_LOCALTION");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemLocaltionGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemLocaltionLessThan(String value) {
            addCriterion("CALENDAR_ITEM.ITEM_LOCALTION <", value,
                "itemLocaltion");

            return this;
        } // end andItemLocaltionLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemLocaltionLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.ITEM_LOCALTION");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemLocaltionLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemLocaltionLessThanOrEqualTo(String value) {
            addCriterion("CALENDAR_ITEM.ITEM_LOCALTION <=", value,
                "itemLocaltion");

            return this;
        } // end andItemLocaltionLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemLocaltionLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.ITEM_LOCALTION");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemLocaltionLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemLocaltionLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("CALENDAR_ITEM.ITEM_LOCALTION like",
                buffer.toString(), "itemLocaltion");

            return this;
        } // end andItemLocaltionLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemLocaltionNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("CALENDAR_ITEM.ITEM_LOCALTION not like",
                buffer.toString(), "itemLocaltion");

            return this;
        } // end andItemLocaltionNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemLocaltionIn(List values) {
            if (values.size() == 1) {
                return andItemLocaltionEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("CALENDAR_ITEM.ITEM_LOCALTION in", values,
                    "itemLocaltion");

                return this;
            } // end else
        } // end andItemLocaltionIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemLocaltionNotIn(List values) {
            if (values.size() == 1) {
                return andItemLocaltionNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("CALENDAR_ITEM.ITEM_LOCALTION not in", values,
                    "itemLocaltion");

                return this;
            } // end else
        } // end andItemLocaltionNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemLocaltionIn(Object[] values) {
            if (values.length == 1) {
                return andItemLocaltionEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("CALENDAR_ITEM.ITEM_LOCALTION in",
                    Arrays.asList(values), "itemLocaltion");

                return this;
            } // end else
        } // end andItemLocaltionIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemLocaltionNotIn(Object[] values) {
            if (values.length == 1) {
                return andItemLocaltionNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("CALENDAR_ITEM.ITEM_LOCALTION not in",
                    Arrays.asList(values), "itemLocaltion");

                return this;
            } // end else
        } // end andItemLocaltionNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemLocaltionBetween(String value1, String value2) {
            addCriterion("CALENDAR_ITEM.ITEM_LOCALTION between", value1,
                value2, "itemLocaltion");

            return this;
        } // end andItemLocaltionBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemLocaltionNotBetween(String value1, String value2) {
            addCriterion("CALENDAR_ITEM.ITEM_LOCALTION not between", value1,
                value2, "itemLocaltion");

            return this;
        } // end andItemLocaltionNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTitleIsNull() {
            addCriterion("CALENDAR_ITEM.ITEM_TITLE is null");

            return this;
        } // end andItemTitleIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTitleIsNotNull() {
            addCriterion("CALENDAR_ITEM.ITEM_TITLE is not null");

            return this;
        } // end andItemTitleIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTitleIsNotEmpty() {
            addCriterion(
                "CALENDAR_ITEM.ITEM_TITLE is not null AND CALENDAR_ITEM.ITEM_TITLE <> ''");

            return this;
        } // end andItemTitleIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTitleIsEmpty() {
            addCriterion(
                "(CALENDAR_ITEM.ITEM_TITLE is null OR CALENDAR_ITEM.ITEM_TITLE = '')");

            return this;
        } // end andItemTitleIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTitleEqualTo(String value) {
            addCriterion("CALENDAR_ITEM.ITEM_TITLE =", value, "itemTitle");

            return this;
        } // end andItemTitleEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTitleEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.ITEM_TITLE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemTitleEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTitleNotEqualTo(String value) {
            addCriterion("CALENDAR_ITEM.ITEM_TITLE <>", value, "itemTitle");

            return this;
        } // end andItemTitleNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTitleNotEqualToOrIsNull(String value) {
            addCriterion("CALENDAR_ITEM.ITEM_TITLE is null OR CALENDAR_ITEM.ITEM_TITLE <>",
                value, "itemTitle");

            return this;
        } // end andItemTitleNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTitleNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.ITEM_TITLE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemTitleNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTitleGreaterThan(String value) {
            addCriterion("CALENDAR_ITEM.ITEM_TITLE >", value, "itemTitle");

            return this;
        } // end andItemTitleGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTitleGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.ITEM_TITLE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemTitleGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTitleGreaterThanOrEqualTo(String value) {
            addCriterion("CALENDAR_ITEM.ITEM_TITLE >=", value, "itemTitle");

            return this;
        } // end andItemTitleGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTitleGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.ITEM_TITLE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemTitleGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTitleLessThan(String value) {
            addCriterion("CALENDAR_ITEM.ITEM_TITLE <", value, "itemTitle");

            return this;
        } // end andItemTitleLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTitleLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.ITEM_TITLE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemTitleLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTitleLessThanOrEqualTo(String value) {
            addCriterion("CALENDAR_ITEM.ITEM_TITLE <=", value, "itemTitle");

            return this;
        } // end andItemTitleLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTitleLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.ITEM_TITLE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemTitleLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTitleLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("CALENDAR_ITEM.ITEM_TITLE like", buffer.toString(),
                "itemTitle");

            return this;
        } // end andItemTitleLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTitleNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("CALENDAR_ITEM.ITEM_TITLE not like",
                buffer.toString(), "itemTitle");

            return this;
        } // end andItemTitleNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTitleIn(List values) {
            if (values.size() == 1) {
                return andItemTitleEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("CALENDAR_ITEM.ITEM_TITLE in", values, "itemTitle");

                return this;
            } // end else
        } // end andItemTitleIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTitleNotIn(List values) {
            if (values.size() == 1) {
                return andItemTitleNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("CALENDAR_ITEM.ITEM_TITLE not in", values,
                    "itemTitle");

                return this;
            } // end else
        } // end andItemTitleNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTitleIn(Object[] values) {
            if (values.length == 1) {
                return andItemTitleEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("CALENDAR_ITEM.ITEM_TITLE in",
                    Arrays.asList(values), "itemTitle");

                return this;
            } // end else
        } // end andItemTitleIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTitleNotIn(Object[] values) {
            if (values.length == 1) {
                return andItemTitleNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("CALENDAR_ITEM.ITEM_TITLE not in",
                    Arrays.asList(values), "itemTitle");

                return this;
            } // end else
        } // end andItemTitleNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTitleBetween(String value1, String value2) {
            addCriterion("CALENDAR_ITEM.ITEM_TITLE between", value1, value2,
                "itemTitle");

            return this;
        } // end andItemTitleBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTitleNotBetween(String value1, String value2) {
            addCriterion("CALENDAR_ITEM.ITEM_TITLE not between", value1,
                value2, "itemTitle");

            return this;
        } // end andItemTitleNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProtectedTypeIsNull() {
            addCriterion("CALENDAR_ITEM.PROTECTED_TYPE is null");

            return this;
        } // end andProtectedTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProtectedTypeIsNotNull() {
            addCriterion("CALENDAR_ITEM.PROTECTED_TYPE is not null");

            return this;
        } // end andProtectedTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProtectedTypeIsNotEmpty() {
            addCriterion(
                "CALENDAR_ITEM.PROTECTED_TYPE is not null AND CALENDAR_ITEM.PROTECTED_TYPE <> ''");

            return this;
        } // end andProtectedTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProtectedTypeIsEmpty() {
            addCriterion(
                "(CALENDAR_ITEM.PROTECTED_TYPE is null OR CALENDAR_ITEM.PROTECTED_TYPE = '')");

            return this;
        } // end andProtectedTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProtectedTypeEqualTo(String value) {
            addCriterion("CALENDAR_ITEM.PROTECTED_TYPE =", value,
                "protectedType");

            return this;
        } // end andProtectedTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProtectedTypeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.PROTECTED_TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProtectedTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProtectedTypeNotEqualTo(String value) {
            addCriterion("CALENDAR_ITEM.PROTECTED_TYPE <>", value,
                "protectedType");

            return this;
        } // end andProtectedTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProtectedTypeNotEqualToOrIsNull(String value) {
            addCriterion("CALENDAR_ITEM.PROTECTED_TYPE is null OR CALENDAR_ITEM.PROTECTED_TYPE <>",
                value, "protectedType");

            return this;
        } // end andProtectedTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProtectedTypeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.PROTECTED_TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProtectedTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProtectedTypeGreaterThan(String value) {
            addCriterion("CALENDAR_ITEM.PROTECTED_TYPE >", value,
                "protectedType");

            return this;
        } // end andProtectedTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProtectedTypeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.PROTECTED_TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProtectedTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProtectedTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CALENDAR_ITEM.PROTECTED_TYPE >=", value,
                "protectedType");

            return this;
        } // end andProtectedTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProtectedTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.PROTECTED_TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProtectedTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProtectedTypeLessThan(String value) {
            addCriterion("CALENDAR_ITEM.PROTECTED_TYPE <", value,
                "protectedType");

            return this;
        } // end andProtectedTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProtectedTypeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.PROTECTED_TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProtectedTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProtectedTypeLessThanOrEqualTo(String value) {
            addCriterion("CALENDAR_ITEM.PROTECTED_TYPE <=", value,
                "protectedType");

            return this;
        } // end andProtectedTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProtectedTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.PROTECTED_TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProtectedTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProtectedTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("CALENDAR_ITEM.PROTECTED_TYPE like",
                buffer.toString(), "protectedType");

            return this;
        } // end andProtectedTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProtectedTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("CALENDAR_ITEM.PROTECTED_TYPE not like",
                buffer.toString(), "protectedType");

            return this;
        } // end andProtectedTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProtectedTypeIn(List values) {
            if (values.size() == 1) {
                return andProtectedTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("CALENDAR_ITEM.PROTECTED_TYPE in", values,
                    "protectedType");

                return this;
            } // end else
        } // end andProtectedTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProtectedTypeNotIn(List values) {
            if (values.size() == 1) {
                return andProtectedTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("CALENDAR_ITEM.PROTECTED_TYPE not in", values,
                    "protectedType");

                return this;
            } // end else
        } // end andProtectedTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProtectedTypeIn(Object[] values) {
            if (values.length == 1) {
                return andProtectedTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("CALENDAR_ITEM.PROTECTED_TYPE in",
                    Arrays.asList(values), "protectedType");

                return this;
            } // end else
        } // end andProtectedTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProtectedTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andProtectedTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("CALENDAR_ITEM.PROTECTED_TYPE not in",
                    Arrays.asList(values), "protectedType");

                return this;
            } // end else
        } // end andProtectedTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProtectedTypeBetween(String value1, String value2) {
            addCriterion("CALENDAR_ITEM.PROTECTED_TYPE between", value1,
                value2, "protectedType");

            return this;
        } // end andProtectedTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProtectedTypeNotBetween(String value1, String value2) {
            addCriterion("CALENDAR_ITEM.PROTECTED_TYPE not between", value1,
                value2, "protectedType");

            return this;
        } // end andProtectedTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("CALENDAR_ITEM.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("CALENDAR_ITEM.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "CALENDAR_ITEM.REMARKS is not null AND CALENDAR_ITEM.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(CALENDAR_ITEM.REMARKS is null OR CALENDAR_ITEM.REMARKS = '')");

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
            addCriterion("CALENDAR_ITEM.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.REMARKS");
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
            addCriterion("CALENDAR_ITEM.REMARKS <>", value, "remarks");

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
            addCriterion("CALENDAR_ITEM.REMARKS is null OR CALENDAR_ITEM.REMARKS <>",
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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.REMARKS");
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
            addCriterion("CALENDAR_ITEM.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.REMARKS");
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
            addCriterion("CALENDAR_ITEM.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.REMARKS");
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
            addCriterion("CALENDAR_ITEM.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.REMARKS");
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
            addCriterion("CALENDAR_ITEM.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.REMARKS");
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
            addCriterion("CALENDAR_ITEM.REMARKS like", buffer.toString(),
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
            addCriterion("CALENDAR_ITEM.REMARKS not like", buffer.toString(),
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
                addCriterion("CALENDAR_ITEM.REMARKS in", values, "remarks");

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
                addCriterion("CALENDAR_ITEM.REMARKS not in", values, "remarks");

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
                addCriterion("CALENDAR_ITEM.REMARKS in", Arrays.asList(values),
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
                addCriterion("CALENDAR_ITEM.REMARKS not in",
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
            addCriterion("CALENDAR_ITEM.REMARKS between", value1, value2,
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
            addCriterion("CALENDAR_ITEM.REMARKS not between", value1, value2,
                "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRepeateConfigIsNull() {
            addCriterion("CALENDAR_ITEM.REPEATE_CONFIG is null");

            return this;
        } // end andRepeateConfigIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRepeateConfigIsNotNull() {
            addCriterion("CALENDAR_ITEM.REPEATE_CONFIG is not null");

            return this;
        } // end andRepeateConfigIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRepeateConfigIsNotEmpty() {
            addCriterion(
                "CALENDAR_ITEM.REPEATE_CONFIG is not null AND CALENDAR_ITEM.REPEATE_CONFIG <> ''");

            return this;
        } // end andRepeateConfigIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRepeateConfigIsEmpty() {
            addCriterion(
                "(CALENDAR_ITEM.REPEATE_CONFIG is null OR CALENDAR_ITEM.REPEATE_CONFIG = '')");

            return this;
        } // end andRepeateConfigIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRepeateConfigEqualTo(String value) {
            addCriterion("CALENDAR_ITEM.REPEATE_CONFIG =", value,
                "repeateConfig");

            return this;
        } // end andRepeateConfigEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRepeateConfigEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.REPEATE_CONFIG");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRepeateConfigEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRepeateConfigNotEqualTo(String value) {
            addCriterion("CALENDAR_ITEM.REPEATE_CONFIG <>", value,
                "repeateConfig");

            return this;
        } // end andRepeateConfigNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRepeateConfigNotEqualToOrIsNull(String value) {
            addCriterion("CALENDAR_ITEM.REPEATE_CONFIG is null OR CALENDAR_ITEM.REPEATE_CONFIG <>",
                value, "repeateConfig");

            return this;
        } // end andRepeateConfigNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRepeateConfigNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.REPEATE_CONFIG");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRepeateConfigNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRepeateConfigGreaterThan(String value) {
            addCriterion("CALENDAR_ITEM.REPEATE_CONFIG >", value,
                "repeateConfig");

            return this;
        } // end andRepeateConfigGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRepeateConfigGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.REPEATE_CONFIG");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRepeateConfigGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRepeateConfigGreaterThanOrEqualTo(String value) {
            addCriterion("CALENDAR_ITEM.REPEATE_CONFIG >=", value,
                "repeateConfig");

            return this;
        } // end andRepeateConfigGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRepeateConfigGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.REPEATE_CONFIG");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRepeateConfigGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRepeateConfigLessThan(String value) {
            addCriterion("CALENDAR_ITEM.REPEATE_CONFIG <", value,
                "repeateConfig");

            return this;
        } // end andRepeateConfigLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRepeateConfigLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.REPEATE_CONFIG");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRepeateConfigLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRepeateConfigLessThanOrEqualTo(String value) {
            addCriterion("CALENDAR_ITEM.REPEATE_CONFIG <=", value,
                "repeateConfig");

            return this;
        } // end andRepeateConfigLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRepeateConfigLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.REPEATE_CONFIG");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRepeateConfigLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRepeateConfigLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("CALENDAR_ITEM.REPEATE_CONFIG like",
                buffer.toString(), "repeateConfig");

            return this;
        } // end andRepeateConfigLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRepeateConfigNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("CALENDAR_ITEM.REPEATE_CONFIG not like",
                buffer.toString(), "repeateConfig");

            return this;
        } // end andRepeateConfigNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRepeateConfigIn(List values) {
            if (values.size() == 1) {
                return andRepeateConfigEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("CALENDAR_ITEM.REPEATE_CONFIG in", values,
                    "repeateConfig");

                return this;
            } // end else
        } // end andRepeateConfigIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRepeateConfigNotIn(List values) {
            if (values.size() == 1) {
                return andRepeateConfigNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("CALENDAR_ITEM.REPEATE_CONFIG not in", values,
                    "repeateConfig");

                return this;
            } // end else
        } // end andRepeateConfigNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRepeateConfigIn(Object[] values) {
            if (values.length == 1) {
                return andRepeateConfigEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("CALENDAR_ITEM.REPEATE_CONFIG in",
                    Arrays.asList(values), "repeateConfig");

                return this;
            } // end else
        } // end andRepeateConfigIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRepeateConfigNotIn(Object[] values) {
            if (values.length == 1) {
                return andRepeateConfigNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("CALENDAR_ITEM.REPEATE_CONFIG not in",
                    Arrays.asList(values), "repeateConfig");

                return this;
            } // end else
        } // end andRepeateConfigNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRepeateConfigBetween(String value1, String value2) {
            addCriterion("CALENDAR_ITEM.REPEATE_CONFIG between", value1,
                value2, "repeateConfig");

            return this;
        } // end andRepeateConfigBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRepeateConfigNotBetween(String value1, String value2) {
            addCriterion("CALENDAR_ITEM.REPEATE_CONFIG not between", value1,
                value2, "repeateConfig");

            return this;
        } // end andRepeateConfigNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeIsNull() {
            addCriterion("CALENDAR_ITEM.START_DATE_TIME is null");

            return this;
        } // end andStartDateTimeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeIsNotNull() {
            addCriterion("CALENDAR_ITEM.START_DATE_TIME is not null");

            return this;
        } // end andStartDateTimeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeIsNotEmpty() {
            addCriterion(
                "CALENDAR_ITEM.START_DATE_TIME is not null AND CALENDAR_ITEM.START_DATE_TIME <> ''");

            return this;
        } // end andStartDateTimeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeIsEmpty() {
            addCriterion(
                "(CALENDAR_ITEM.START_DATE_TIME is null OR CALENDAR_ITEM.START_DATE_TIME = '')");

            return this;
        } // end andStartDateTimeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("CALENDAR_ITEM.START_DATE_TIME =", value,
                "startDateTime");

            return this;
        } // end andStartDateTimeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.START_DATE_TIME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStartDateTimeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeNotEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("CALENDAR_ITEM.START_DATE_TIME <>", value,
                "startDateTime");

            return this;
        } // end andStartDateTimeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeNotEqualToOrIsNull(java.util.Date value) {
            addCriterionForJDBCDate("CALENDAR_ITEM.START_DATE_TIME is null OR CALENDAR_ITEM.START_DATE_TIME <>",
                value, "startDateTime");

            return this;
        } // end andStartDateTimeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.START_DATE_TIME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStartDateTimeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeGreaterThan(java.util.Date value) {
            addCriterionForJDBCDate("CALENDAR_ITEM.START_DATE_TIME >", value,
                "startDateTime");

            return this;
        } // end andStartDateTimeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.START_DATE_TIME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStartDateTimeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeGreaterThanOrEqualTo(
            java.util.Date value) {
            addCriterionForJDBCDate("CALENDAR_ITEM.START_DATE_TIME >=", value,
                "startDateTime");

            return this;
        } // end andStartDateTimeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.START_DATE_TIME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStartDateTimeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeLessThan(java.util.Date value) {
            addCriterionForJDBCDate("CALENDAR_ITEM.START_DATE_TIME <", value,
                "startDateTime");

            return this;
        } // end andStartDateTimeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.START_DATE_TIME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStartDateTimeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeLessThanOrEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("CALENDAR_ITEM.START_DATE_TIME <=", value,
                "startDateTime");

            return this;
        } // end andStartDateTimeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.START_DATE_TIME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStartDateTimeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeIn(List values) {
            if (values.size() == 1) {
                return andStartDateTimeEqualTo((java.util.Date) values.get(0));
            } // end if
            else {
                addCriterionForJDBCDate("CALENDAR_ITEM.START_DATE_TIME in",
                    values, "startDateTime");

                return this;
            } // end else
        } // end andStartDateTimeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeNotIn(List values) {
            if (values.size() == 1) {
                return andStartDateTimeNotEqualTo((java.util.Date) values.get(0));
            } // end if
            else {
                addCriterionForJDBCDate("CALENDAR_ITEM.START_DATE_TIME not in",
                    values, "startDateTime");

                return this;
            } // end else
        } // end andStartDateTimeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeIn(Object[] values) {
            if (values.length == 1) {
                return andStartDateTimeEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("CALENDAR_ITEM.START_DATE_TIME in",
                    Arrays.asList(values), "startDateTime");

                return this;
            } // end else
        } // end andStartDateTimeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeNotIn(Object[] values) {
            if (values.length == 1) {
                return andStartDateTimeNotEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("CALENDAR_ITEM.START_DATE_TIME not in",
                    Arrays.asList(values), "startDateTime");

                return this;
            } // end else
        } // end andStartDateTimeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("CALENDAR_ITEM.START_DATE_TIME between",
                value1, value2, "startDateTime");

            return this;
        } // end andStartDateTimeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartDateTimeNotBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("CALENDAR_ITEM.START_DATE_TIME not between",
                value1, value2, "startDateTime");

            return this;
        } // end andStartDateTimeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("CALENDAR_ITEM.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("CALENDAR_ITEM.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "CALENDAR_ITEM.STATUS is not null AND CALENDAR_ITEM.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(CALENDAR_ITEM.STATUS is null OR CALENDAR_ITEM.STATUS = '')");

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
            addCriterion("CALENDAR_ITEM.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.STATUS");
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
            addCriterion("CALENDAR_ITEM.STATUS <>", value, "status");

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
            addCriterion("CALENDAR_ITEM.STATUS is null OR CALENDAR_ITEM.STATUS <>",
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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.STATUS");
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
            addCriterion("CALENDAR_ITEM.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.STATUS");
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
            addCriterion("CALENDAR_ITEM.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.STATUS");
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
            addCriterion("CALENDAR_ITEM.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.STATUS");
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
            addCriterion("CALENDAR_ITEM.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("CALENDAR_ITEM.STATUS");
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
            addCriterion("CALENDAR_ITEM.STATUS like", buffer.toString(),
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
            addCriterion("CALENDAR_ITEM.STATUS not like", buffer.toString(),
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
                addCriterion("CALENDAR_ITEM.STATUS in", values, "status");

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
                addCriterion("CALENDAR_ITEM.STATUS not in", values, "status");

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
                addCriterion("CALENDAR_ITEM.STATUS in", Arrays.asList(values),
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
                addCriterion("CALENDAR_ITEM.STATUS not in",
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
            addCriterion("CALENDAR_ITEM.STATUS between", value1, value2,
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
            addCriterion("CALENDAR_ITEM.STATUS not between", value1, value2,
                "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarNameIsNull() {
            addCriterion("calendarDefineB.CALENDAR_NAME is null");

            return this;
        } // end andCalendarNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarNameIsNotNull() {
            addCriterion("calendarDefineB.CALENDAR_NAME is not null");

            return this;
        } // end andCalendarNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarNameIsNotEmpty() {
            addCriterion(
                "calendarDefineB.CALENDAR_NAME is not null AND calendarDefineB.CALENDAR_NAME <> ''");

            return this;
        } // end andCalendarNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarNameIsEmpty() {
            addCriterion(
                "(calendarDefineB.CALENDAR_NAME is null OR calendarDefineB.CALENDAR_NAME = '')");

            return this;
        } // end andCalendarNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarNameEqualTo(String value) {
            addCriterion("calendarDefineB.CALENDAR_NAME =", value,
                "calendarName");

            return this;
        } // end andCalendarNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("calendarDefineB.CALENDAR_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCalendarNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarNameNotEqualTo(String value) {
            addCriterion("calendarDefineB.CALENDAR_NAME <>", value,
                "calendarName");

            return this;
        } // end andCalendarNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarNameNotEqualToOrIsNull(String value) {
            addCriterion("calendarDefineB.CALENDAR_NAME is null OR calendarDefineB.CALENDAR_NAME <>",
                value, "calendarName");

            return this;
        } // end andCalendarNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("calendarDefineB.CALENDAR_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCalendarNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarNameGreaterThan(String value) {
            addCriterion("calendarDefineB.CALENDAR_NAME >", value,
                "calendarName");

            return this;
        } // end andCalendarNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("calendarDefineB.CALENDAR_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCalendarNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarNameGreaterThanOrEqualTo(String value) {
            addCriterion("calendarDefineB.CALENDAR_NAME >=", value,
                "calendarName");

            return this;
        } // end andCalendarNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("calendarDefineB.CALENDAR_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCalendarNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarNameLessThan(String value) {
            addCriterion("calendarDefineB.CALENDAR_NAME <", value,
                "calendarName");

            return this;
        } // end andCalendarNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("calendarDefineB.CALENDAR_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCalendarNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarNameLessThanOrEqualTo(String value) {
            addCriterion("calendarDefineB.CALENDAR_NAME <=", value,
                "calendarName");

            return this;
        } // end andCalendarNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("calendarDefineB.CALENDAR_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCalendarNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("calendarDefineB.CALENDAR_NAME like",
                buffer.toString(), "calendarName");

            return this;
        } // end andCalendarNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("calendarDefineB.CALENDAR_NAME not like",
                buffer.toString(), "calendarName");

            return this;
        } // end andCalendarNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarNameIn(List values) {
            if (values.size() == 1) {
                return andCalendarNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("calendarDefineB.CALENDAR_NAME in", values,
                    "calendarName");

                return this;
            } // end else
        } // end andCalendarNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarNameNotIn(List values) {
            if (values.size() == 1) {
                return andCalendarNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("calendarDefineB.CALENDAR_NAME not in", values,
                    "calendarName");

                return this;
            } // end else
        } // end andCalendarNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarNameIn(Object[] values) {
            if (values.length == 1) {
                return andCalendarNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("calendarDefineB.CALENDAR_NAME in",
                    Arrays.asList(values), "calendarName");

                return this;
            } // end else
        } // end andCalendarNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andCalendarNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("calendarDefineB.CALENDAR_NAME not in",
                    Arrays.asList(values), "calendarName");

                return this;
            } // end else
        } // end andCalendarNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarNameBetween(String value1, String value2) {
            addCriterion("calendarDefineB.CALENDAR_NAME between", value1,
                value2, "calendarName");

            return this;
        } // end andCalendarNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarNameNotBetween(String value1, String value2) {
            addCriterion("calendarDefineB.CALENDAR_NAME not between", value1,
                value2, "calendarName");

            return this;
        } // end andCalendarNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarTypeIsNull() {
            addCriterion("calendarDefineB.CALENDAR_TYPE is null");

            return this;
        } // end andCalendarTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarTypeIsNotNull() {
            addCriterion("calendarDefineB.CALENDAR_TYPE is not null");

            return this;
        } // end andCalendarTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarTypeIsNotEmpty() {
            addCriterion(
                "calendarDefineB.CALENDAR_TYPE is not null AND calendarDefineB.CALENDAR_TYPE <> ''");

            return this;
        } // end andCalendarTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarTypeIsEmpty() {
            addCriterion(
                "(calendarDefineB.CALENDAR_TYPE is null OR calendarDefineB.CALENDAR_TYPE = '')");

            return this;
        } // end andCalendarTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarTypeEqualTo(String value) {
            addCriterion("calendarDefineB.CALENDAR_TYPE =", value,
                "calendarType");

            return this;
        } // end andCalendarTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarTypeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("calendarDefineB.CALENDAR_TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCalendarTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarTypeNotEqualTo(String value) {
            addCriterion("calendarDefineB.CALENDAR_TYPE <>", value,
                "calendarType");

            return this;
        } // end andCalendarTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarTypeNotEqualToOrIsNull(String value) {
            addCriterion("calendarDefineB.CALENDAR_TYPE is null OR calendarDefineB.CALENDAR_TYPE <>",
                value, "calendarType");

            return this;
        } // end andCalendarTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarTypeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("calendarDefineB.CALENDAR_TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCalendarTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarTypeGreaterThan(String value) {
            addCriterion("calendarDefineB.CALENDAR_TYPE >", value,
                "calendarType");

            return this;
        } // end andCalendarTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarTypeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("calendarDefineB.CALENDAR_TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCalendarTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarTypeGreaterThanOrEqualTo(String value) {
            addCriterion("calendarDefineB.CALENDAR_TYPE >=", value,
                "calendarType");

            return this;
        } // end andCalendarTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("calendarDefineB.CALENDAR_TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCalendarTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarTypeLessThan(String value) {
            addCriterion("calendarDefineB.CALENDAR_TYPE <", value,
                "calendarType");

            return this;
        } // end andCalendarTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarTypeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("calendarDefineB.CALENDAR_TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCalendarTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarTypeLessThanOrEqualTo(String value) {
            addCriterion("calendarDefineB.CALENDAR_TYPE <=", value,
                "calendarType");

            return this;
        } // end andCalendarTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("calendarDefineB.CALENDAR_TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCalendarTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("calendarDefineB.CALENDAR_TYPE like",
                buffer.toString(), "calendarType");

            return this;
        } // end andCalendarTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("calendarDefineB.CALENDAR_TYPE not like",
                buffer.toString(), "calendarType");

            return this;
        } // end andCalendarTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarTypeIn(List values) {
            if (values.size() == 1) {
                return andCalendarTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("calendarDefineB.CALENDAR_TYPE in", values,
                    "calendarType");

                return this;
            } // end else
        } // end andCalendarTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarTypeNotIn(List values) {
            if (values.size() == 1) {
                return andCalendarTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("calendarDefineB.CALENDAR_TYPE not in", values,
                    "calendarType");

                return this;
            } // end else
        } // end andCalendarTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarTypeIn(Object[] values) {
            if (values.length == 1) {
                return andCalendarTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("calendarDefineB.CALENDAR_TYPE in",
                    Arrays.asList(values), "calendarType");

                return this;
            } // end else
        } // end andCalendarTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andCalendarTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("calendarDefineB.CALENDAR_TYPE not in",
                    Arrays.asList(values), "calendarType");

                return this;
            } // end else
        } // end andCalendarTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarTypeBetween(String value1, String value2) {
            addCriterion("calendarDefineB.CALENDAR_TYPE between", value1,
                value2, "calendarType");

            return this;
        } // end andCalendarTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarTypeNotBetween(String value1, String value2) {
            addCriterion("calendarDefineB.CALENDAR_TYPE not between", value1,
                value2, "calendarType");

            return this;
        } // end andCalendarTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarStyleIsNull() {
            addCriterion("calendarDefineB.CALENDAR_STYLE is null");

            return this;
        } // end andCalendarStyleIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarStyleIsNotNull() {
            addCriterion("calendarDefineB.CALENDAR_STYLE is not null");

            return this;
        } // end andCalendarStyleIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarStyleIsNotEmpty() {
            addCriterion(
                "calendarDefineB.CALENDAR_STYLE is not null AND calendarDefineB.CALENDAR_STYLE <> ''");

            return this;
        } // end andCalendarStyleIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarStyleIsEmpty() {
            addCriterion(
                "(calendarDefineB.CALENDAR_STYLE is null OR calendarDefineB.CALENDAR_STYLE = '')");

            return this;
        } // end andCalendarStyleIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarStyleEqualTo(String value) {
            addCriterion("calendarDefineB.CALENDAR_STYLE =", value,
                "calendarStyle");

            return this;
        } // end andCalendarStyleEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarStyleEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "calendarDefineB.CALENDAR_STYLE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCalendarStyleEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarStyleNotEqualTo(String value) {
            addCriterion("calendarDefineB.CALENDAR_STYLE <>", value,
                "calendarStyle");

            return this;
        } // end andCalendarStyleNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarStyleNotEqualToOrIsNull(String value) {
            addCriterion("calendarDefineB.CALENDAR_STYLE is null OR calendarDefineB.CALENDAR_STYLE <>",
                value, "calendarStyle");

            return this;
        } // end andCalendarStyleNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarStyleNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "calendarDefineB.CALENDAR_STYLE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCalendarStyleNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarStyleGreaterThan(String value) {
            addCriterion("calendarDefineB.CALENDAR_STYLE >", value,
                "calendarStyle");

            return this;
        } // end andCalendarStyleGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarStyleGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "calendarDefineB.CALENDAR_STYLE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCalendarStyleGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarStyleGreaterThanOrEqualTo(String value) {
            addCriterion("calendarDefineB.CALENDAR_STYLE >=", value,
                "calendarStyle");

            return this;
        } // end andCalendarStyleGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarStyleGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "calendarDefineB.CALENDAR_STYLE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCalendarStyleGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarStyleLessThan(String value) {
            addCriterion("calendarDefineB.CALENDAR_STYLE <", value,
                "calendarStyle");

            return this;
        } // end andCalendarStyleLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarStyleLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "calendarDefineB.CALENDAR_STYLE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCalendarStyleLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarStyleLessThanOrEqualTo(String value) {
            addCriterion("calendarDefineB.CALENDAR_STYLE <=", value,
                "calendarStyle");

            return this;
        } // end andCalendarStyleLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarStyleLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "calendarDefineB.CALENDAR_STYLE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCalendarStyleLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarStyleLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("calendarDefineB.CALENDAR_STYLE like",
                buffer.toString(), "calendarStyle");

            return this;
        } // end andCalendarStyleLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarStyleNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("calendarDefineB.CALENDAR_STYLE not like",
                buffer.toString(), "calendarStyle");

            return this;
        } // end andCalendarStyleNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarStyleIn(List values) {
            if (values.size() == 1) {
                return andCalendarStyleEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("calendarDefineB.CALENDAR_STYLE in", values,
                    "calendarStyle");

                return this;
            } // end else
        } // end andCalendarStyleIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarStyleNotIn(List values) {
            if (values.size() == 1) {
                return andCalendarStyleNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("calendarDefineB.CALENDAR_STYLE not in", values,
                    "calendarStyle");

                return this;
            } // end else
        } // end andCalendarStyleNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarStyleIn(Object[] values) {
            if (values.length == 1) {
                return andCalendarStyleEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("calendarDefineB.CALENDAR_STYLE in",
                    Arrays.asList(values), "calendarStyle");

                return this;
            } // end else
        } // end andCalendarStyleIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarStyleNotIn(Object[] values) {
            if (values.length == 1) {
                return andCalendarStyleNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("calendarDefineB.CALENDAR_STYLE not in",
                    Arrays.asList(values), "calendarStyle");

                return this;
            } // end else
        } // end andCalendarStyleNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarStyleBetween(String value1, String value2) {
            addCriterion("calendarDefineB.CALENDAR_STYLE between", value1,
                value2, "calendarStyle");

            return this;
        } // end andCalendarStyleBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarStyleNotBetween(String value1, String value2) {
            addCriterion("calendarDefineB.CALENDAR_STYLE not between", value1,
                value2, "calendarStyle");

            return this;
        } // end andCalendarStyleNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdIsNull() {
            addCriterion("calendarDefineB.OWNER_ID is null");

            return this;
        } // end andOwnerIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdIsNotNull() {
            addCriterion("calendarDefineB.OWNER_ID is not null");

            return this;
        } // end andOwnerIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdIsNotEmpty() {
            addCriterion(
                "calendarDefineB.OWNER_ID is not null AND calendarDefineB.OWNER_ID <> ''");

            return this;
        } // end andOwnerIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdIsEmpty() {
            addCriterion(
                "(calendarDefineB.OWNER_ID is null OR calendarDefineB.OWNER_ID = '')");

            return this;
        } // end andOwnerIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdEqualTo(long value) {
            return andOwnerIdEqualTo(Long.valueOf(value));
        } // end andOwnerIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdEqualTo(java.lang.Long value) {
            addCriterion("calendarDefineB.OWNER_ID =", value, "ownerId");

            return this;
        } // end andOwnerIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("calendarDefineB.OWNER_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOwnerIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdNotEqualTo(long value) {
            return andOwnerIdNotEqualTo(Long.valueOf(value));
        } // end andOwnerIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdNotEqualTo(java.lang.Long value) {
            addCriterion("calendarDefineB.OWNER_ID <>", value, "ownerId");

            return this;
        } // end andOwnerIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdNotEqualToOrIsNull(long value) {
            return andOwnerIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andOwnerIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("calendarDefineB.OWNER_ID is null OR calendarDefineB.OWNER_ID <>",
                value, "ownerId");

            return this;
        } // end andOwnerIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("calendarDefineB.OWNER_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOwnerIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdGreaterThan(long value) {
            return andOwnerIdGreaterThan(Long.valueOf(value));
        } // end andOwnerIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdGreaterThan(java.lang.Long value) {
            addCriterion("calendarDefineB.OWNER_ID >", value, "ownerId");

            return this;
        } // end andOwnerIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("calendarDefineB.OWNER_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOwnerIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdGreaterThanOrEqualTo(long value) {
            return andOwnerIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andOwnerIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("calendarDefineB.OWNER_ID >=", value, "ownerId");

            return this;
        } // end andOwnerIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("calendarDefineB.OWNER_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOwnerIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdLessThan(long value) {
            return andOwnerIdLessThan(Long.valueOf(value));
        } // end andOwnerIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdLessThan(java.lang.Long value) {
            addCriterion("calendarDefineB.OWNER_ID <", value, "ownerId");

            return this;
        } // end andOwnerIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("calendarDefineB.OWNER_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOwnerIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdLessThanOrEqualTo(long value) {
            return andOwnerIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andOwnerIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("calendarDefineB.OWNER_ID <=", value, "ownerId");

            return this;
        } // end andOwnerIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("calendarDefineB.OWNER_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOwnerIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdIn(long[] values) {
            if (values.length == 1) {
                return andOwnerIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("calendarDefineB.OWNER_ID in", values, "ownerId");

                return this;
            } // end else
        } // end andOwnerIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdNotIn(long[] values) {
            if (values.length == 1) {
                return andOwnerIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("calendarDefineB.OWNER_ID not in", values,
                    "ownerId");

                return this;
            } // end else
        } // end andOwnerIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdIn(List values) {
            if (values.size() == 1) {
                return andOwnerIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("calendarDefineB.OWNER_ID in", values, "ownerId");

                return this;
            } // end else
        } // end andOwnerIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdNotIn(List values) {
            if (values.size() == 1) {
                return andOwnerIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("calendarDefineB.OWNER_ID not in", values,
                    "ownerId");

                return this;
            } // end else
        } // end andOwnerIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdIn(Object[] values) {
            if (values.length == 1) {
                return andOwnerIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("calendarDefineB.OWNER_ID in",
                    Arrays.asList(values), "ownerId");

                return this;
            } // end else
        } // end andOwnerIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andOwnerIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("calendarDefineB.OWNER_ID not in",
                    Arrays.asList(values), "ownerId");

                return this;
            } // end else
        } // end andOwnerIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdBetween(long value1, long value2) {
            addCriterion("calendarDefineB.OWNER_ID between", value1, value2,
                "ownerId");

            return this;
        } // end andOwnerIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("calendarDefineB.OWNER_ID between", value1, value2,
                "ownerId");

            return this;
        } // end andOwnerIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdNotBetween(long value1, long value2) {
            addCriterion("calendarDefineB.OWNER_ID not between", value1,
                value2, "ownerId");

            return this;
        } // end andOwnerIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("calendarDefineB.OWNER_ID not between", value1,
                value2, "ownerId");

            return this;
        } // end andOwnerIdNotBetween()
    } // end Criteria
} // end CalendarItemDAOQueryBean
