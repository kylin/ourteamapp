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
 * TeamCalendarDefine query bean 2011-09-22 10:18:09
 *
 * @author Auto Gen
 */
public class TeamCalendarDefineDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new TeamCalendarDefineDAOQueryBean object.
     */
    public TeamCalendarDefineDAOQueryBean() {
        super();
    } // end TeamCalendarDefineDAOQueryBean()

    /**
     * Creates a new TeamCalendarDefineDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public TeamCalendarDefineDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end TeamCalendarDefineDAOQueryBean()

    /**
     * Creates a new TeamCalendarDefineDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public TeamCalendarDefineDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end TeamCalendarDefineDAOQueryBean()

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
            addSelectProperty(ITeamCalendarDefineDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(ITeamCalendarDefineDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

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
            addSelectProperty(ITeamCalendarDefineDAO.CalendarName, aAlias);
        } // end if
        else {
            addSelectProperty(ITeamCalendarDefineDAO.CalendarName,
                "calendarName");
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
            addSelectProperty(ITeamCalendarDefineDAO.CalendarType, aAlias);
        } // end if
        else {
            addSelectProperty(ITeamCalendarDefineDAO.CalendarType,
                "calendarType");
        } // end else
    } // end addCalendarTypeSelectProperty()

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
            addSelectProperty(ITeamCalendarDefineDAO.OwnerId, aAlias);
        } // end if
        else {
            addSelectProperty(ITeamCalendarDefineDAO.OwnerId, "ownerId");
        } // end else
    } // end addOwnerIdSelectProperty()

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
            addSelectProperty(ITeamCalendarDefineDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(ITeamCalendarDefineDAO.Remarks, "remarks");
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
            addSelectProperty(ITeamCalendarDefineDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(ITeamCalendarDefineDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addTeamNameSelectProperty() {
        addTeamNameSelectProperty("teamName");
    } // end addTeamNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addTeamNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ITeamCalendarDefineDAO.TeamName, aAlias);
        } // end if
        else {
            addSelectProperty(ITeamCalendarDefineDAO.TeamName, "teamName");
        } // end else
    } // end addTeamNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addTeamRemarksSelectProperty() {
        addTeamRemarksSelectProperty("teamRemarks");
    } // end addTeamRemarksSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addTeamRemarksSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ITeamCalendarDefineDAO.TeamRemarks, aAlias);
        } // end if
        else {
            addSelectProperty(ITeamCalendarDefineDAO.TeamRemarks, "teamRemarks");
        } // end else
    } // end addTeamRemarksSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addCalendarNameSelectProperty();

        addCalendarTypeSelectProperty();

        addOwnerIdSelectProperty();

        addRemarksSelectProperty();

        addStatusSelectProperty();

        addTeamNameSelectProperty();

        addTeamRemarksSelectProperty();
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
            addCriterion("CALENDAR_DEFINE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("CALENDAR_DEFINE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "CALENDAR_DEFINE.ID is not null AND CALENDAR_DEFINE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(CALENDAR_DEFINE.ID is null OR CALENDAR_DEFINE.ID = '')");

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
            addCriterion("CALENDAR_DEFINE.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("CALENDAR_DEFINE.ID");
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
            addCriterion("CALENDAR_DEFINE.ID <>", value, "id");

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
            addCriterion("CALENDAR_DEFINE.ID is null OR CALENDAR_DEFINE.ID <>",
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
            StringBuffer str = new StringBuffer("CALENDAR_DEFINE.ID");
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
            addCriterion("CALENDAR_DEFINE.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("CALENDAR_DEFINE.ID");
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
            addCriterion("CALENDAR_DEFINE.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("CALENDAR_DEFINE.ID");
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
            addCriterion("CALENDAR_DEFINE.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("CALENDAR_DEFINE.ID");
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
            addCriterion("CALENDAR_DEFINE.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("CALENDAR_DEFINE.ID");
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
                addCriterion("CALENDAR_DEFINE.ID in", values, "id");

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
                addCriterion("CALENDAR_DEFINE.ID not in", values, "id");

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
                addCriterion("CALENDAR_DEFINE.ID in", values, "id");

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
                addCriterion("CALENDAR_DEFINE.ID not in", values, "id");

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
                addCriterion("CALENDAR_DEFINE.ID in", Arrays.asList(values),
                    "id");

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
                addCriterion("CALENDAR_DEFINE.ID not in",
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
            addCriterion("CALENDAR_DEFINE.ID between", value1, value2, "id");

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
            addCriterion("CALENDAR_DEFINE.ID between", value1, value2, "id");

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
            addCriterion("CALENDAR_DEFINE.ID not between", value1, value2, "id");

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
            addCriterion("CALENDAR_DEFINE.ID not between", value1, value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarNameIsNull() {
            addCriterion("CALENDAR_DEFINE.CALENDAR_NAME is null");

            return this;
        } // end andCalendarNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarNameIsNotNull() {
            addCriterion("CALENDAR_DEFINE.CALENDAR_NAME is not null");

            return this;
        } // end andCalendarNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarNameIsNotEmpty() {
            addCriterion(
                "CALENDAR_DEFINE.CALENDAR_NAME is not null AND CALENDAR_DEFINE.CALENDAR_NAME <> ''");

            return this;
        } // end andCalendarNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarNameIsEmpty() {
            addCriterion(
                "(CALENDAR_DEFINE.CALENDAR_NAME is null OR CALENDAR_DEFINE.CALENDAR_NAME = '')");

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
            addCriterion("CALENDAR_DEFINE.CALENDAR_NAME =", value,
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
            StringBuffer str = new StringBuffer("CALENDAR_DEFINE.CALENDAR_NAME");
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
            addCriterion("CALENDAR_DEFINE.CALENDAR_NAME <>", value,
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
            addCriterion("CALENDAR_DEFINE.CALENDAR_NAME is null OR CALENDAR_DEFINE.CALENDAR_NAME <>",
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
            StringBuffer str = new StringBuffer("CALENDAR_DEFINE.CALENDAR_NAME");
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
            addCriterion("CALENDAR_DEFINE.CALENDAR_NAME >", value,
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
            StringBuffer str = new StringBuffer("CALENDAR_DEFINE.CALENDAR_NAME");
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
            addCriterion("CALENDAR_DEFINE.CALENDAR_NAME >=", value,
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
            StringBuffer str = new StringBuffer("CALENDAR_DEFINE.CALENDAR_NAME");
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
            addCriterion("CALENDAR_DEFINE.CALENDAR_NAME <", value,
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
            StringBuffer str = new StringBuffer("CALENDAR_DEFINE.CALENDAR_NAME");
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
            addCriterion("CALENDAR_DEFINE.CALENDAR_NAME <=", value,
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
            StringBuffer str = new StringBuffer("CALENDAR_DEFINE.CALENDAR_NAME");
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
            addCriterion("CALENDAR_DEFINE.CALENDAR_NAME like",
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
            addCriterion("CALENDAR_DEFINE.CALENDAR_NAME not like",
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
                addCriterion("CALENDAR_DEFINE.CALENDAR_NAME in", values,
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
                addCriterion("CALENDAR_DEFINE.CALENDAR_NAME not in", values,
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
                addCriterion("CALENDAR_DEFINE.CALENDAR_NAME in",
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
                addCriterion("CALENDAR_DEFINE.CALENDAR_NAME not in",
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
            addCriterion("CALENDAR_DEFINE.CALENDAR_NAME between", value1,
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
            addCriterion("CALENDAR_DEFINE.CALENDAR_NAME not between", value1,
                value2, "calendarName");

            return this;
        } // end andCalendarNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarTypeIsNull() {
            addCriterion("CALENDAR_DEFINE.CALENDAR_TYPE is null");

            return this;
        } // end andCalendarTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarTypeIsNotNull() {
            addCriterion("CALENDAR_DEFINE.CALENDAR_TYPE is not null");

            return this;
        } // end andCalendarTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarTypeIsNotEmpty() {
            addCriterion(
                "CALENDAR_DEFINE.CALENDAR_TYPE is not null AND CALENDAR_DEFINE.CALENDAR_TYPE <> ''");

            return this;
        } // end andCalendarTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCalendarTypeIsEmpty() {
            addCriterion(
                "(CALENDAR_DEFINE.CALENDAR_TYPE is null OR CALENDAR_DEFINE.CALENDAR_TYPE = '')");

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
            addCriterion("CALENDAR_DEFINE.CALENDAR_TYPE =", value,
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
            StringBuffer str = new StringBuffer("CALENDAR_DEFINE.CALENDAR_TYPE");
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
            addCriterion("CALENDAR_DEFINE.CALENDAR_TYPE <>", value,
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
            addCriterion("CALENDAR_DEFINE.CALENDAR_TYPE is null OR CALENDAR_DEFINE.CALENDAR_TYPE <>",
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
            StringBuffer str = new StringBuffer("CALENDAR_DEFINE.CALENDAR_TYPE");
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
            addCriterion("CALENDAR_DEFINE.CALENDAR_TYPE >", value,
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
            StringBuffer str = new StringBuffer("CALENDAR_DEFINE.CALENDAR_TYPE");
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
            addCriterion("CALENDAR_DEFINE.CALENDAR_TYPE >=", value,
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
            StringBuffer str = new StringBuffer("CALENDAR_DEFINE.CALENDAR_TYPE");
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
            addCriterion("CALENDAR_DEFINE.CALENDAR_TYPE <", value,
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
            StringBuffer str = new StringBuffer("CALENDAR_DEFINE.CALENDAR_TYPE");
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
            addCriterion("CALENDAR_DEFINE.CALENDAR_TYPE <=", value,
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
            StringBuffer str = new StringBuffer("CALENDAR_DEFINE.CALENDAR_TYPE");
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
            addCriterion("CALENDAR_DEFINE.CALENDAR_TYPE like",
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
            addCriterion("CALENDAR_DEFINE.CALENDAR_TYPE not like",
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
                addCriterion("CALENDAR_DEFINE.CALENDAR_TYPE in", values,
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
                addCriterion("CALENDAR_DEFINE.CALENDAR_TYPE not in", values,
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
                addCriterion("CALENDAR_DEFINE.CALENDAR_TYPE in",
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
                addCriterion("CALENDAR_DEFINE.CALENDAR_TYPE not in",
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
            addCriterion("CALENDAR_DEFINE.CALENDAR_TYPE between", value1,
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
            addCriterion("CALENDAR_DEFINE.CALENDAR_TYPE not between", value1,
                value2, "calendarType");

            return this;
        } // end andCalendarTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdIsNull() {
            addCriterion("CALENDAR_DEFINE.OWNER_ID is null");

            return this;
        } // end andOwnerIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdIsNotNull() {
            addCriterion("CALENDAR_DEFINE.OWNER_ID is not null");

            return this;
        } // end andOwnerIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdIsNotEmpty() {
            addCriterion(
                "CALENDAR_DEFINE.OWNER_ID is not null AND CALENDAR_DEFINE.OWNER_ID <> ''");

            return this;
        } // end andOwnerIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOwnerIdIsEmpty() {
            addCriterion(
                "(CALENDAR_DEFINE.OWNER_ID is null OR CALENDAR_DEFINE.OWNER_ID = '')");

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
            addCriterion("CALENDAR_DEFINE.OWNER_ID =", value, "ownerId");

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
            StringBuffer str = new StringBuffer("CALENDAR_DEFINE.OWNER_ID");
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
            addCriterion("CALENDAR_DEFINE.OWNER_ID <>", value, "ownerId");

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
            addCriterion("CALENDAR_DEFINE.OWNER_ID is null OR CALENDAR_DEFINE.OWNER_ID <>",
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
            StringBuffer str = new StringBuffer("CALENDAR_DEFINE.OWNER_ID");
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
            addCriterion("CALENDAR_DEFINE.OWNER_ID >", value, "ownerId");

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
            StringBuffer str = new StringBuffer("CALENDAR_DEFINE.OWNER_ID");
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
            addCriterion("CALENDAR_DEFINE.OWNER_ID >=", value, "ownerId");

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
            StringBuffer str = new StringBuffer("CALENDAR_DEFINE.OWNER_ID");
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
            addCriterion("CALENDAR_DEFINE.OWNER_ID <", value, "ownerId");

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
            StringBuffer str = new StringBuffer("CALENDAR_DEFINE.OWNER_ID");
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
            addCriterion("CALENDAR_DEFINE.OWNER_ID <=", value, "ownerId");

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
            StringBuffer str = new StringBuffer("CALENDAR_DEFINE.OWNER_ID");
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
                addCriterion("CALENDAR_DEFINE.OWNER_ID in", values, "ownerId");

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
                addCriterion("CALENDAR_DEFINE.OWNER_ID not in", values,
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
                addCriterion("CALENDAR_DEFINE.OWNER_ID in", values, "ownerId");

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
                addCriterion("CALENDAR_DEFINE.OWNER_ID not in", values,
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
                addCriterion("CALENDAR_DEFINE.OWNER_ID in",
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
                addCriterion("CALENDAR_DEFINE.OWNER_ID not in",
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
            addCriterion("CALENDAR_DEFINE.OWNER_ID between", value1, value2,
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
            addCriterion("CALENDAR_DEFINE.OWNER_ID between", value1, value2,
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
            addCriterion("CALENDAR_DEFINE.OWNER_ID not between", value1,
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
            addCriterion("CALENDAR_DEFINE.OWNER_ID not between", value1,
                value2, "ownerId");

            return this;
        } // end andOwnerIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("CALENDAR_DEFINE.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("CALENDAR_DEFINE.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "CALENDAR_DEFINE.REMARKS is not null AND CALENDAR_DEFINE.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(CALENDAR_DEFINE.REMARKS is null OR CALENDAR_DEFINE.REMARKS = '')");

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
            addCriterion("CALENDAR_DEFINE.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("CALENDAR_DEFINE.REMARKS");
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
            addCriterion("CALENDAR_DEFINE.REMARKS <>", value, "remarks");

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
            addCriterion("CALENDAR_DEFINE.REMARKS is null OR CALENDAR_DEFINE.REMARKS <>",
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
            StringBuffer str = new StringBuffer("CALENDAR_DEFINE.REMARKS");
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
            addCriterion("CALENDAR_DEFINE.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("CALENDAR_DEFINE.REMARKS");
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
            addCriterion("CALENDAR_DEFINE.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("CALENDAR_DEFINE.REMARKS");
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
            addCriterion("CALENDAR_DEFINE.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("CALENDAR_DEFINE.REMARKS");
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
            addCriterion("CALENDAR_DEFINE.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("CALENDAR_DEFINE.REMARKS");
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
            addCriterion("CALENDAR_DEFINE.REMARKS like", buffer.toString(),
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
            addCriterion("CALENDAR_DEFINE.REMARKS not like", buffer.toString(),
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
                addCriterion("CALENDAR_DEFINE.REMARKS in", values, "remarks");

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
                addCriterion("CALENDAR_DEFINE.REMARKS not in", values, "remarks");

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
                addCriterion("CALENDAR_DEFINE.REMARKS in",
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
                addCriterion("CALENDAR_DEFINE.REMARKS not in",
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
            addCriterion("CALENDAR_DEFINE.REMARKS between", value1, value2,
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
            addCriterion("CALENDAR_DEFINE.REMARKS not between", value1, value2,
                "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("CALENDAR_DEFINE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("CALENDAR_DEFINE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "CALENDAR_DEFINE.STATUS is not null AND CALENDAR_DEFINE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(CALENDAR_DEFINE.STATUS is null OR CALENDAR_DEFINE.STATUS = '')");

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
            addCriterion("CALENDAR_DEFINE.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("CALENDAR_DEFINE.STATUS");
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
            addCriterion("CALENDAR_DEFINE.STATUS <>", value, "status");

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
            addCriterion("CALENDAR_DEFINE.STATUS is null OR CALENDAR_DEFINE.STATUS <>",
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
            StringBuffer str = new StringBuffer("CALENDAR_DEFINE.STATUS");
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
            addCriterion("CALENDAR_DEFINE.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("CALENDAR_DEFINE.STATUS");
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
            addCriterion("CALENDAR_DEFINE.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("CALENDAR_DEFINE.STATUS");
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
            addCriterion("CALENDAR_DEFINE.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("CALENDAR_DEFINE.STATUS");
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
            addCriterion("CALENDAR_DEFINE.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("CALENDAR_DEFINE.STATUS");
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
            addCriterion("CALENDAR_DEFINE.STATUS like", buffer.toString(),
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
            addCriterion("CALENDAR_DEFINE.STATUS not like", buffer.toString(),
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
                addCriterion("CALENDAR_DEFINE.STATUS in", values, "status");

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
                addCriterion("CALENDAR_DEFINE.STATUS not in", values, "status");

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
                addCriterion("CALENDAR_DEFINE.STATUS in",
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
                addCriterion("CALENDAR_DEFINE.STATUS not in",
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
            addCriterion("CALENDAR_DEFINE.STATUS between", value1, value2,
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
            addCriterion("CALENDAR_DEFINE.STATUS not between", value1, value2,
                "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameIsNull() {
            addCriterion("teamDefineA.TEAM_NAME is null");

            return this;
        } // end andTeamNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameIsNotNull() {
            addCriterion("teamDefineA.TEAM_NAME is not null");

            return this;
        } // end andTeamNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameIsNotEmpty() {
            addCriterion(
                "teamDefineA.TEAM_NAME is not null AND teamDefineA.TEAM_NAME <> ''");

            return this;
        } // end andTeamNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameIsEmpty() {
            addCriterion(
                "(teamDefineA.TEAM_NAME is null OR teamDefineA.TEAM_NAME = '')");

            return this;
        } // end andTeamNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameEqualTo(String value) {
            addCriterion("teamDefineA.TEAM_NAME =", value, "teamName");

            return this;
        } // end andTeamNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("teamDefineA.TEAM_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameNotEqualTo(String value) {
            addCriterion("teamDefineA.TEAM_NAME <>", value, "teamName");

            return this;
        } // end andTeamNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameNotEqualToOrIsNull(String value) {
            addCriterion("teamDefineA.TEAM_NAME is null OR teamDefineA.TEAM_NAME <>",
                value, "teamName");

            return this;
        } // end andTeamNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("teamDefineA.TEAM_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameGreaterThan(String value) {
            addCriterion("teamDefineA.TEAM_NAME >", value, "teamName");

            return this;
        } // end andTeamNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("teamDefineA.TEAM_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameGreaterThanOrEqualTo(String value) {
            addCriterion("teamDefineA.TEAM_NAME >=", value, "teamName");

            return this;
        } // end andTeamNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("teamDefineA.TEAM_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameLessThan(String value) {
            addCriterion("teamDefineA.TEAM_NAME <", value, "teamName");

            return this;
        } // end andTeamNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("teamDefineA.TEAM_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameLessThanOrEqualTo(String value) {
            addCriterion("teamDefineA.TEAM_NAME <=", value, "teamName");

            return this;
        } // end andTeamNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("teamDefineA.TEAM_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("teamDefineA.TEAM_NAME like", buffer.toString(),
                "teamName");

            return this;
        } // end andTeamNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("teamDefineA.TEAM_NAME not like", buffer.toString(),
                "teamName");

            return this;
        } // end andTeamNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameIn(List values) {
            if (values.size() == 1) {
                return andTeamNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("teamDefineA.TEAM_NAME in", values, "teamName");

                return this;
            } // end else
        } // end andTeamNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameNotIn(List values) {
            if (values.size() == 1) {
                return andTeamNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("teamDefineA.TEAM_NAME not in", values, "teamName");

                return this;
            } // end else
        } // end andTeamNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameIn(Object[] values) {
            if (values.length == 1) {
                return andTeamNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("teamDefineA.TEAM_NAME in", Arrays.asList(values),
                    "teamName");

                return this;
            } // end else
        } // end andTeamNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andTeamNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("teamDefineA.TEAM_NAME not in",
                    Arrays.asList(values), "teamName");

                return this;
            } // end else
        } // end andTeamNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameBetween(String value1, String value2) {
            addCriterion("teamDefineA.TEAM_NAME between", value1, value2,
                "teamName");

            return this;
        } // end andTeamNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameNotBetween(String value1, String value2) {
            addCriterion("teamDefineA.TEAM_NAME not between", value1, value2,
                "teamName");

            return this;
        } // end andTeamNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRemarksIsNull() {
            addCriterion("teamDefineA.REMARKS is null");

            return this;
        } // end andTeamRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRemarksIsNotNull() {
            addCriterion("teamDefineA.REMARKS is not null");

            return this;
        } // end andTeamRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRemarksIsNotEmpty() {
            addCriterion(
                "teamDefineA.REMARKS is not null AND teamDefineA.REMARKS <> ''");

            return this;
        } // end andTeamRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRemarksIsEmpty() {
            addCriterion(
                "(teamDefineA.REMARKS is null OR teamDefineA.REMARKS = '')");

            return this;
        } // end andTeamRemarksIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRemarksEqualTo(String value) {
            addCriterion("teamDefineA.REMARKS =", value, "teamRemarks");

            return this;
        } // end andTeamRemarksEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRemarksEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("teamDefineA.REMARKS");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamRemarksEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRemarksNotEqualTo(String value) {
            addCriterion("teamDefineA.REMARKS <>", value, "teamRemarks");

            return this;
        } // end andTeamRemarksNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRemarksNotEqualToOrIsNull(String value) {
            addCriterion("teamDefineA.REMARKS is null OR teamDefineA.REMARKS <>",
                value, "teamRemarks");

            return this;
        } // end andTeamRemarksNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRemarksNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("teamDefineA.REMARKS");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamRemarksNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRemarksGreaterThan(String value) {
            addCriterion("teamDefineA.REMARKS >", value, "teamRemarks");

            return this;
        } // end andTeamRemarksGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRemarksGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("teamDefineA.REMARKS");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamRemarksGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("teamDefineA.REMARKS >=", value, "teamRemarks");

            return this;
        } // end andTeamRemarksGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRemarksGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("teamDefineA.REMARKS");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamRemarksGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRemarksLessThan(String value) {
            addCriterion("teamDefineA.REMARKS <", value, "teamRemarks");

            return this;
        } // end andTeamRemarksLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRemarksLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("teamDefineA.REMARKS");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamRemarksLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRemarksLessThanOrEqualTo(String value) {
            addCriterion("teamDefineA.REMARKS <=", value, "teamRemarks");

            return this;
        } // end andTeamRemarksLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRemarksLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("teamDefineA.REMARKS");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamRemarksLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRemarksLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("teamDefineA.REMARKS like", buffer.toString(),
                "teamRemarks");

            return this;
        } // end andTeamRemarksLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRemarksNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("teamDefineA.REMARKS not like", buffer.toString(),
                "teamRemarks");

            return this;
        } // end andTeamRemarksNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRemarksIn(List values) {
            if (values.size() == 1) {
                return andTeamRemarksEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("teamDefineA.REMARKS in", values, "teamRemarks");

                return this;
            } // end else
        } // end andTeamRemarksIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRemarksNotIn(List values) {
            if (values.size() == 1) {
                return andTeamRemarksNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("teamDefineA.REMARKS not in", values, "teamRemarks");

                return this;
            } // end else
        } // end andTeamRemarksNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRemarksIn(Object[] values) {
            if (values.length == 1) {
                return andTeamRemarksEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("teamDefineA.REMARKS in", Arrays.asList(values),
                    "teamRemarks");

                return this;
            } // end else
        } // end andTeamRemarksIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRemarksNotIn(Object[] values) {
            if (values.length == 1) {
                return andTeamRemarksNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("teamDefineA.REMARKS not in",
                    Arrays.asList(values), "teamRemarks");

                return this;
            } // end else
        } // end andTeamRemarksNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRemarksBetween(String value1, String value2) {
            addCriterion("teamDefineA.REMARKS between", value1, value2,
                "teamRemarks");

            return this;
        } // end andTeamRemarksBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRemarksNotBetween(String value1, String value2) {
            addCriterion("teamDefineA.REMARKS not between", value1, value2,
                "teamRemarks");

            return this;
        } // end andTeamRemarksNotBetween()
    } // end Criteria
} // end TeamCalendarDefineDAOQueryBean
