/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.resource.dao;

import net.dao.BaseQueryBean;
import net.dao.BaseWhereCriterion;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * ResourceBooking query bean 2011-09-22 10:18:25
 *
 * @author Auto Gen
 */
public class ResourceBookingDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new ResourceBookingDAOQueryBean object.
     */
    public ResourceBookingDAOQueryBean() {
        super();
    } // end ResourceBookingDAOQueryBean()

    /**
     * Creates a new ResourceBookingDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public ResourceBookingDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end ResourceBookingDAOQueryBean()

    /**
     * Creates a new ResourceBookingDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public ResourceBookingDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end ResourceBookingDAOQueryBean()

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
            addSelectProperty(IResourceBookingDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IResourceBookingDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addEndTimeSelectProperty() {
        addEndTimeSelectProperty("endTime");
    } // end addEndTimeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addEndTimeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IResourceBookingDAO.EndTime, aAlias);
        } // end if
        else {
            addSelectProperty(IResourceBookingDAO.EndTime, "endTime");
        } // end else
    } // end addEndTimeSelectProperty()

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
            addSelectProperty(IResourceBookingDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IResourceBookingDAO.Remarks, "remarks");
        } // end else
    } // end addRemarksSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addResourceInstanceIdSelectProperty() {
        addResourceInstanceIdSelectProperty("resourceInstanceId");
    } // end addResourceInstanceIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addResourceInstanceIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IResourceBookingDAO.ResourceInstanceId, aAlias);
        } // end if
        else {
            addSelectProperty(IResourceBookingDAO.ResourceInstanceId,
                "resourceInstanceId");
        } // end else
    } // end addResourceInstanceIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addResourceTypeIdSelectProperty() {
        addResourceTypeIdSelectProperty("resourceTypeId");
    } // end addResourceTypeIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addResourceTypeIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IResourceBookingDAO.ResourceTypeId, aAlias);
        } // end if
        else {
            addSelectProperty(IResourceBookingDAO.ResourceTypeId,
                "resourceTypeId");
        } // end else
    } // end addResourceTypeIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addStartTimeSelectProperty() {
        addStartTimeSelectProperty("startTime");
    } // end addStartTimeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addStartTimeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IResourceBookingDAO.StartTime, aAlias);
        } // end if
        else {
            addSelectProperty(IResourceBookingDAO.StartTime, "startTime");
        } // end else
    } // end addStartTimeSelectProperty()

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
            addSelectProperty(IResourceBookingDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IResourceBookingDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addResourceInstanceCodeSelectProperty() {
        addResourceInstanceCodeSelectProperty("resourceInstanceCode");
    } // end addResourceInstanceCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addResourceInstanceCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IResourceBookingDAO.ResourceInstanceCode, aAlias);
        } // end if
        else {
            addSelectProperty(IResourceBookingDAO.ResourceInstanceCode,
                "resourceInstanceCode");
        } // end else
    } // end addResourceInstanceCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addResourceInstanceNameSelectProperty() {
        addResourceInstanceNameSelectProperty("resourceInstanceName");
    } // end addResourceInstanceNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addResourceInstanceNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IResourceBookingDAO.ResourceInstanceName, aAlias);
        } // end if
        else {
            addSelectProperty(IResourceBookingDAO.ResourceInstanceName,
                "resourceInstanceName");
        } // end else
    } // end addResourceInstanceNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addResourceInstanceStatusSelectProperty() {
        addResourceInstanceStatusSelectProperty("resourceInstanceStatus");
    } // end addResourceInstanceStatusSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addResourceInstanceStatusSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IResourceBookingDAO.ResourceInstanceStatus, aAlias);
        } // end if
        else {
            addSelectProperty(IResourceBookingDAO.ResourceInstanceStatus,
                "resourceInstanceStatus");
        } // end else
    } // end addResourceInstanceStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addResourceTypeCodeSelectProperty() {
        addResourceTypeCodeSelectProperty("resourceTypeCode");
    } // end addResourceTypeCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addResourceTypeCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IResourceBookingDAO.ResourceTypeCode, aAlias);
        } // end if
        else {
            addSelectProperty(IResourceBookingDAO.ResourceTypeCode,
                "resourceTypeCode");
        } // end else
    } // end addResourceTypeCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addResourceTypeNameSelectProperty() {
        addResourceTypeNameSelectProperty("resourceTypeName");
    } // end addResourceTypeNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addResourceTypeNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IResourceBookingDAO.ResourceTypeName, aAlias);
        } // end if
        else {
            addSelectProperty(IResourceBookingDAO.ResourceTypeName,
                "resourceTypeName");
        } // end else
    } // end addResourceTypeNameSelectProperty()

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
            addSelectProperty(IResourceBookingDAO.UserId, aAlias);
        } // end if
        else {
            addSelectProperty(IResourceBookingDAO.UserId, "userId");
        } // end else
    } // end addUserIdSelectProperty()

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
            addSelectProperty(IResourceBookingDAO.UserName, aAlias);
        } // end if
        else {
            addSelectProperty(IResourceBookingDAO.UserName, "userName");
        } // end else
    } // end addUserNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addEndTimeSelectProperty();

        addRemarksSelectProperty();

        addResourceInstanceIdSelectProperty();

        addResourceTypeIdSelectProperty();

        addStartTimeSelectProperty();

        addStatusSelectProperty();

        addResourceInstanceCodeSelectProperty();

        addResourceInstanceNameSelectProperty();

        addResourceInstanceStatusSelectProperty();

        addResourceTypeCodeSelectProperty();

        addResourceTypeNameSelectProperty();

        addUserIdSelectProperty();

        addUserNameSelectProperty();
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
            addCriterion("RESOURCE_BOOKING.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("RESOURCE_BOOKING.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "RESOURCE_BOOKING.ID is not null AND RESOURCE_BOOKING.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(RESOURCE_BOOKING.ID is null OR RESOURCE_BOOKING.ID = '')");

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
            addCriterion("RESOURCE_BOOKING.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("RESOURCE_BOOKING.ID");
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
            addCriterion("RESOURCE_BOOKING.ID <>", value, "id");

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
            addCriterion("RESOURCE_BOOKING.ID is null OR RESOURCE_BOOKING.ID <>",
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
            StringBuffer str = new StringBuffer("RESOURCE_BOOKING.ID");
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
            addCriterion("RESOURCE_BOOKING.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("RESOURCE_BOOKING.ID");
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
            addCriterion("RESOURCE_BOOKING.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("RESOURCE_BOOKING.ID");
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
            addCriterion("RESOURCE_BOOKING.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("RESOURCE_BOOKING.ID");
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
            addCriterion("RESOURCE_BOOKING.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("RESOURCE_BOOKING.ID");
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
                addCriterion("RESOURCE_BOOKING.ID in", values, "id");

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
                addCriterion("RESOURCE_BOOKING.ID not in", values, "id");

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
                addCriterion("RESOURCE_BOOKING.ID in", values, "id");

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
                addCriterion("RESOURCE_BOOKING.ID not in", values, "id");

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
                addCriterion("RESOURCE_BOOKING.ID in", Arrays.asList(values),
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
                addCriterion("RESOURCE_BOOKING.ID not in",
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
            addCriterion("RESOURCE_BOOKING.ID between", value1, value2, "id");

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
            addCriterion("RESOURCE_BOOKING.ID between", value1, value2, "id");

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
            addCriterion("RESOURCE_BOOKING.ID not between", value1, value2, "id");

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
            addCriterion("RESOURCE_BOOKING.ID not between", value1, value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndTimeIsNull() {
            addCriterion("RESOURCE_BOOKING.END_TIME is null");

            return this;
        } // end andEndTimeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndTimeIsNotNull() {
            addCriterion("RESOURCE_BOOKING.END_TIME is not null");

            return this;
        } // end andEndTimeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndTimeIsNotEmpty() {
            addCriterion(
                "RESOURCE_BOOKING.END_TIME is not null AND RESOURCE_BOOKING.END_TIME <> ''");

            return this;
        } // end andEndTimeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndTimeIsEmpty() {
            addCriterion(
                "(RESOURCE_BOOKING.END_TIME is null OR RESOURCE_BOOKING.END_TIME = '')");

            return this;
        } // end andEndTimeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndTimeEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("RESOURCE_BOOKING.END_TIME =", value,
                "endTime");

            return this;
        } // end andEndTimeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndTimeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("RESOURCE_BOOKING.END_TIME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEndTimeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndTimeNotEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("RESOURCE_BOOKING.END_TIME <>", value,
                "endTime");

            return this;
        } // end andEndTimeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndTimeNotEqualToOrIsNull(java.util.Date value) {
            addCriterionForJDBCDate("RESOURCE_BOOKING.END_TIME is null OR RESOURCE_BOOKING.END_TIME <>",
                value, "endTime");

            return this;
        } // end andEndTimeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndTimeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("RESOURCE_BOOKING.END_TIME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEndTimeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndTimeGreaterThan(java.util.Date value) {
            addCriterionForJDBCDate("RESOURCE_BOOKING.END_TIME >", value,
                "endTime");

            return this;
        } // end andEndTimeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndTimeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("RESOURCE_BOOKING.END_TIME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEndTimeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndTimeGreaterThanOrEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("RESOURCE_BOOKING.END_TIME >=", value,
                "endTime");

            return this;
        } // end andEndTimeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndTimeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("RESOURCE_BOOKING.END_TIME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEndTimeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndTimeLessThan(java.util.Date value) {
            addCriterionForJDBCDate("RESOURCE_BOOKING.END_TIME <", value,
                "endTime");

            return this;
        } // end andEndTimeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndTimeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("RESOURCE_BOOKING.END_TIME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEndTimeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndTimeLessThanOrEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("RESOURCE_BOOKING.END_TIME <=", value,
                "endTime");

            return this;
        } // end andEndTimeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndTimeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("RESOURCE_BOOKING.END_TIME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEndTimeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndTimeIn(List values) {
            if (values.size() == 1) {
                return andEndTimeEqualTo((java.util.Date) values.get(0));
            } // end if
            else {
                addCriterionForJDBCDate("RESOURCE_BOOKING.END_TIME in", values,
                    "endTime");

                return this;
            } // end else
        } // end andEndTimeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndTimeNotIn(List values) {
            if (values.size() == 1) {
                return andEndTimeNotEqualTo((java.util.Date) values.get(0));
            } // end if
            else {
                addCriterionForJDBCDate("RESOURCE_BOOKING.END_TIME not in",
                    values, "endTime");

                return this;
            } // end else
        } // end andEndTimeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndTimeIn(Object[] values) {
            if (values.length == 1) {
                return andEndTimeEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("RESOURCE_BOOKING.END_TIME in",
                    Arrays.asList(values), "endTime");

                return this;
            } // end else
        } // end andEndTimeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndTimeNotIn(Object[] values) {
            if (values.length == 1) {
                return andEndTimeNotEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("RESOURCE_BOOKING.END_TIME not in",
                    Arrays.asList(values), "endTime");

                return this;
            } // end else
        } // end andEndTimeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndTimeBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("RESOURCE_BOOKING.END_TIME between",
                value1, value2, "endTime");

            return this;
        } // end andEndTimeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEndTimeNotBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("RESOURCE_BOOKING.END_TIME not between",
                value1, value2, "endTime");

            return this;
        } // end andEndTimeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("RESOURCE_BOOKING.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("RESOURCE_BOOKING.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "RESOURCE_BOOKING.REMARKS is not null AND RESOURCE_BOOKING.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(RESOURCE_BOOKING.REMARKS is null OR RESOURCE_BOOKING.REMARKS = '')");

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
            addCriterion("RESOURCE_BOOKING.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("RESOURCE_BOOKING.REMARKS");
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
            addCriterion("RESOURCE_BOOKING.REMARKS <>", value, "remarks");

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
            addCriterion("RESOURCE_BOOKING.REMARKS is null OR RESOURCE_BOOKING.REMARKS <>",
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
            StringBuffer str = new StringBuffer("RESOURCE_BOOKING.REMARKS");
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
            addCriterion("RESOURCE_BOOKING.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("RESOURCE_BOOKING.REMARKS");
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
            addCriterion("RESOURCE_BOOKING.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("RESOURCE_BOOKING.REMARKS");
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
            addCriterion("RESOURCE_BOOKING.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("RESOURCE_BOOKING.REMARKS");
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
            addCriterion("RESOURCE_BOOKING.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("RESOURCE_BOOKING.REMARKS");
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
            addCriterion("RESOURCE_BOOKING.REMARKS like", buffer.toString(),
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
            addCriterion("RESOURCE_BOOKING.REMARKS not like",
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
                addCriterion("RESOURCE_BOOKING.REMARKS in", values, "remarks");

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
                addCriterion("RESOURCE_BOOKING.REMARKS not in", values,
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
                addCriterion("RESOURCE_BOOKING.REMARKS in",
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
                addCriterion("RESOURCE_BOOKING.REMARKS not in",
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
            addCriterion("RESOURCE_BOOKING.REMARKS between", value1, value2,
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
            addCriterion("RESOURCE_BOOKING.REMARKS not between", value1,
                value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdIsNull() {
            addCriterion("RESOURCE_BOOKING.RESOURCE_INSTANCE_ID is null");

            return this;
        } // end andResourceInstanceIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdIsNotNull() {
            addCriterion("RESOURCE_BOOKING.RESOURCE_INSTANCE_ID is not null");

            return this;
        } // end andResourceInstanceIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdIsNotEmpty() {
            addCriterion(
                "RESOURCE_BOOKING.RESOURCE_INSTANCE_ID is not null AND RESOURCE_BOOKING.RESOURCE_INSTANCE_ID <> ''");

            return this;
        } // end andResourceInstanceIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdIsEmpty() {
            addCriterion(
                "(RESOURCE_BOOKING.RESOURCE_INSTANCE_ID is null OR RESOURCE_BOOKING.RESOURCE_INSTANCE_ID = '')");

            return this;
        } // end andResourceInstanceIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdEqualTo(long value) {
            return andResourceInstanceIdEqualTo(Long.valueOf(value));
        } // end andResourceInstanceIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdEqualTo(java.lang.Long value) {
            addCriterion("RESOURCE_BOOKING.RESOURCE_INSTANCE_ID =", value,
                "resourceInstanceId");

            return this;
        } // end andResourceInstanceIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_BOOKING.RESOURCE_INSTANCE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceInstanceIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdNotEqualTo(long value) {
            return andResourceInstanceIdNotEqualTo(Long.valueOf(value));
        } // end andResourceInstanceIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdNotEqualTo(java.lang.Long value) {
            addCriterion("RESOURCE_BOOKING.RESOURCE_INSTANCE_ID <>", value,
                "resourceInstanceId");

            return this;
        } // end andResourceInstanceIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdNotEqualToOrIsNull(long value) {
            return andResourceInstanceIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andResourceInstanceIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("RESOURCE_BOOKING.RESOURCE_INSTANCE_ID is null OR RESOURCE_BOOKING.RESOURCE_INSTANCE_ID <>",
                value, "resourceInstanceId");

            return this;
        } // end andResourceInstanceIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_BOOKING.RESOURCE_INSTANCE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceInstanceIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdGreaterThan(long value) {
            return andResourceInstanceIdGreaterThan(Long.valueOf(value));
        } // end andResourceInstanceIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdGreaterThan(java.lang.Long value) {
            addCriterion("RESOURCE_BOOKING.RESOURCE_INSTANCE_ID >", value,
                "resourceInstanceId");

            return this;
        } // end andResourceInstanceIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_BOOKING.RESOURCE_INSTANCE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceInstanceIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdGreaterThanOrEqualTo(long value) {
            return andResourceInstanceIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andResourceInstanceIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("RESOURCE_BOOKING.RESOURCE_INSTANCE_ID >=", value,
                "resourceInstanceId");

            return this;
        } // end andResourceInstanceIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_BOOKING.RESOURCE_INSTANCE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceInstanceIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdLessThan(long value) {
            return andResourceInstanceIdLessThan(Long.valueOf(value));
        } // end andResourceInstanceIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdLessThan(java.lang.Long value) {
            addCriterion("RESOURCE_BOOKING.RESOURCE_INSTANCE_ID <", value,
                "resourceInstanceId");

            return this;
        } // end andResourceInstanceIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_BOOKING.RESOURCE_INSTANCE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceInstanceIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdLessThanOrEqualTo(long value) {
            return andResourceInstanceIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andResourceInstanceIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("RESOURCE_BOOKING.RESOURCE_INSTANCE_ID <=", value,
                "resourceInstanceId");

            return this;
        } // end andResourceInstanceIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_BOOKING.RESOURCE_INSTANCE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceInstanceIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdIn(long[] values) {
            if (values.length == 1) {
                return andResourceInstanceIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("RESOURCE_BOOKING.RESOURCE_INSTANCE_ID in",
                    values, "resourceInstanceId");

                return this;
            } // end else
        } // end andResourceInstanceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdNotIn(long[] values) {
            if (values.length == 1) {
                return andResourceInstanceIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("RESOURCE_BOOKING.RESOURCE_INSTANCE_ID not in",
                    values, "resourceInstanceId");

                return this;
            } // end else
        } // end andResourceInstanceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdIn(List values) {
            if (values.size() == 1) {
                return andResourceInstanceIdEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("RESOURCE_BOOKING.RESOURCE_INSTANCE_ID in",
                    values, "resourceInstanceId");

                return this;
            } // end else
        } // end andResourceInstanceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdNotIn(List values) {
            if (values.size() == 1) {
                return andResourceInstanceIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("RESOURCE_BOOKING.RESOURCE_INSTANCE_ID not in",
                    values, "resourceInstanceId");

                return this;
            } // end else
        } // end andResourceInstanceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdIn(Object[] values) {
            if (values.length == 1) {
                return andResourceInstanceIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("RESOURCE_BOOKING.RESOURCE_INSTANCE_ID in",
                    Arrays.asList(values), "resourceInstanceId");

                return this;
            } // end else
        } // end andResourceInstanceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andResourceInstanceIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("RESOURCE_BOOKING.RESOURCE_INSTANCE_ID not in",
                    Arrays.asList(values), "resourceInstanceId");

                return this;
            } // end else
        } // end andResourceInstanceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdBetween(long value1, long value2) {
            addCriterion("RESOURCE_BOOKING.RESOURCE_INSTANCE_ID between",
                value1, value2, "resourceInstanceId");

            return this;
        } // end andResourceInstanceIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("RESOURCE_BOOKING.RESOURCE_INSTANCE_ID between",
                value1, value2, "resourceInstanceId");

            return this;
        } // end andResourceInstanceIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdNotBetween(long value1, long value2) {
            addCriterion("RESOURCE_BOOKING.RESOURCE_INSTANCE_ID not between",
                value1, value2, "resourceInstanceId");

            return this;
        } // end andResourceInstanceIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("RESOURCE_BOOKING.RESOURCE_INSTANCE_ID not between",
                value1, value2, "resourceInstanceId");

            return this;
        } // end andResourceInstanceIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdIsNull() {
            addCriterion("RESOURCE_BOOKING.RESOURCE_TYPE_ID is null");

            return this;
        } // end andResourceTypeIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdIsNotNull() {
            addCriterion("RESOURCE_BOOKING.RESOURCE_TYPE_ID is not null");

            return this;
        } // end andResourceTypeIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdIsNotEmpty() {
            addCriterion(
                "RESOURCE_BOOKING.RESOURCE_TYPE_ID is not null AND RESOURCE_BOOKING.RESOURCE_TYPE_ID <> ''");

            return this;
        } // end andResourceTypeIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdIsEmpty() {
            addCriterion(
                "(RESOURCE_BOOKING.RESOURCE_TYPE_ID is null OR RESOURCE_BOOKING.RESOURCE_TYPE_ID = '')");

            return this;
        } // end andResourceTypeIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdEqualTo(long value) {
            return andResourceTypeIdEqualTo(Long.valueOf(value));
        } // end andResourceTypeIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdEqualTo(java.lang.Long value) {
            addCriterion("RESOURCE_BOOKING.RESOURCE_TYPE_ID =", value,
                "resourceTypeId");

            return this;
        } // end andResourceTypeIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_BOOKING.RESOURCE_TYPE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceTypeIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdNotEqualTo(long value) {
            return andResourceTypeIdNotEqualTo(Long.valueOf(value));
        } // end andResourceTypeIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdNotEqualTo(java.lang.Long value) {
            addCriterion("RESOURCE_BOOKING.RESOURCE_TYPE_ID <>", value,
                "resourceTypeId");

            return this;
        } // end andResourceTypeIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdNotEqualToOrIsNull(long value) {
            return andResourceTypeIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andResourceTypeIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("RESOURCE_BOOKING.RESOURCE_TYPE_ID is null OR RESOURCE_BOOKING.RESOURCE_TYPE_ID <>",
                value, "resourceTypeId");

            return this;
        } // end andResourceTypeIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_BOOKING.RESOURCE_TYPE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceTypeIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdGreaterThan(long value) {
            return andResourceTypeIdGreaterThan(Long.valueOf(value));
        } // end andResourceTypeIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdGreaterThan(java.lang.Long value) {
            addCriterion("RESOURCE_BOOKING.RESOURCE_TYPE_ID >", value,
                "resourceTypeId");

            return this;
        } // end andResourceTypeIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_BOOKING.RESOURCE_TYPE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceTypeIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdGreaterThanOrEqualTo(long value) {
            return andResourceTypeIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andResourceTypeIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("RESOURCE_BOOKING.RESOURCE_TYPE_ID >=", value,
                "resourceTypeId");

            return this;
        } // end andResourceTypeIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_BOOKING.RESOURCE_TYPE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceTypeIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdLessThan(long value) {
            return andResourceTypeIdLessThan(Long.valueOf(value));
        } // end andResourceTypeIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdLessThan(java.lang.Long value) {
            addCriterion("RESOURCE_BOOKING.RESOURCE_TYPE_ID <", value,
                "resourceTypeId");

            return this;
        } // end andResourceTypeIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_BOOKING.RESOURCE_TYPE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceTypeIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdLessThanOrEqualTo(long value) {
            return andResourceTypeIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andResourceTypeIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("RESOURCE_BOOKING.RESOURCE_TYPE_ID <=", value,
                "resourceTypeId");

            return this;
        } // end andResourceTypeIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "RESOURCE_BOOKING.RESOURCE_TYPE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceTypeIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdIn(long[] values) {
            if (values.length == 1) {
                return andResourceTypeIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("RESOURCE_BOOKING.RESOURCE_TYPE_ID in", values,
                    "resourceTypeId");

                return this;
            } // end else
        } // end andResourceTypeIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdNotIn(long[] values) {
            if (values.length == 1) {
                return andResourceTypeIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("RESOURCE_BOOKING.RESOURCE_TYPE_ID not in",
                    values, "resourceTypeId");

                return this;
            } // end else
        } // end andResourceTypeIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdIn(List values) {
            if (values.size() == 1) {
                return andResourceTypeIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("RESOURCE_BOOKING.RESOURCE_TYPE_ID in", values,
                    "resourceTypeId");

                return this;
            } // end else
        } // end andResourceTypeIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdNotIn(List values) {
            if (values.size() == 1) {
                return andResourceTypeIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("RESOURCE_BOOKING.RESOURCE_TYPE_ID not in",
                    values, "resourceTypeId");

                return this;
            } // end else
        } // end andResourceTypeIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdIn(Object[] values) {
            if (values.length == 1) {
                return andResourceTypeIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("RESOURCE_BOOKING.RESOURCE_TYPE_ID in",
                    Arrays.asList(values), "resourceTypeId");

                return this;
            } // end else
        } // end andResourceTypeIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andResourceTypeIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("RESOURCE_BOOKING.RESOURCE_TYPE_ID not in",
                    Arrays.asList(values), "resourceTypeId");

                return this;
            } // end else
        } // end andResourceTypeIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdBetween(long value1, long value2) {
            addCriterion("RESOURCE_BOOKING.RESOURCE_TYPE_ID between", value1,
                value2, "resourceTypeId");

            return this;
        } // end andResourceTypeIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("RESOURCE_BOOKING.RESOURCE_TYPE_ID between", value1,
                value2, "resourceTypeId");

            return this;
        } // end andResourceTypeIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdNotBetween(long value1, long value2) {
            addCriterion("RESOURCE_BOOKING.RESOURCE_TYPE_ID not between",
                value1, value2, "resourceTypeId");

            return this;
        } // end andResourceTypeIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("RESOURCE_BOOKING.RESOURCE_TYPE_ID not between",
                value1, value2, "resourceTypeId");

            return this;
        } // end andResourceTypeIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartTimeIsNull() {
            addCriterion("RESOURCE_BOOKING.START_TIME is null");

            return this;
        } // end andStartTimeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartTimeIsNotNull() {
            addCriterion("RESOURCE_BOOKING.START_TIME is not null");

            return this;
        } // end andStartTimeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartTimeIsNotEmpty() {
            addCriterion(
                "RESOURCE_BOOKING.START_TIME is not null AND RESOURCE_BOOKING.START_TIME <> ''");

            return this;
        } // end andStartTimeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartTimeIsEmpty() {
            addCriterion(
                "(RESOURCE_BOOKING.START_TIME is null OR RESOURCE_BOOKING.START_TIME = '')");

            return this;
        } // end andStartTimeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartTimeEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("RESOURCE_BOOKING.START_TIME =", value,
                "startTime");

            return this;
        } // end andStartTimeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartTimeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("RESOURCE_BOOKING.START_TIME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStartTimeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartTimeNotEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("RESOURCE_BOOKING.START_TIME <>", value,
                "startTime");

            return this;
        } // end andStartTimeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartTimeNotEqualToOrIsNull(java.util.Date value) {
            addCriterionForJDBCDate("RESOURCE_BOOKING.START_TIME is null OR RESOURCE_BOOKING.START_TIME <>",
                value, "startTime");

            return this;
        } // end andStartTimeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartTimeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("RESOURCE_BOOKING.START_TIME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStartTimeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartTimeGreaterThan(java.util.Date value) {
            addCriterionForJDBCDate("RESOURCE_BOOKING.START_TIME >", value,
                "startTime");

            return this;
        } // end andStartTimeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartTimeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("RESOURCE_BOOKING.START_TIME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStartTimeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartTimeGreaterThanOrEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("RESOURCE_BOOKING.START_TIME >=", value,
                "startTime");

            return this;
        } // end andStartTimeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartTimeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("RESOURCE_BOOKING.START_TIME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStartTimeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartTimeLessThan(java.util.Date value) {
            addCriterionForJDBCDate("RESOURCE_BOOKING.START_TIME <", value,
                "startTime");

            return this;
        } // end andStartTimeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartTimeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("RESOURCE_BOOKING.START_TIME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStartTimeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartTimeLessThanOrEqualTo(java.util.Date value) {
            addCriterionForJDBCDate("RESOURCE_BOOKING.START_TIME <=", value,
                "startTime");

            return this;
        } // end andStartTimeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartTimeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("RESOURCE_BOOKING.START_TIME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStartTimeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartTimeIn(List values) {
            if (values.size() == 1) {
                return andStartTimeEqualTo((java.util.Date) values.get(0));
            } // end if
            else {
                addCriterionForJDBCDate("RESOURCE_BOOKING.START_TIME in",
                    values, "startTime");

                return this;
            } // end else
        } // end andStartTimeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartTimeNotIn(List values) {
            if (values.size() == 1) {
                return andStartTimeNotEqualTo((java.util.Date) values.get(0));
            } // end if
            else {
                addCriterionForJDBCDate("RESOURCE_BOOKING.START_TIME not in",
                    values, "startTime");

                return this;
            } // end else
        } // end andStartTimeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartTimeIn(Object[] values) {
            if (values.length == 1) {
                return andStartTimeEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("RESOURCE_BOOKING.START_TIME in",
                    Arrays.asList(values), "startTime");

                return this;
            } // end else
        } // end andStartTimeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartTimeNotIn(Object[] values) {
            if (values.length == 1) {
                return andStartTimeNotEqualTo((java.util.Date) values[0]);
            } // end if
            else {
                addCriterionForJDBCDate("RESOURCE_BOOKING.START_TIME not in",
                    Arrays.asList(values), "startTime");

                return this;
            } // end else
        } // end andStartTimeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartTimeBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("RESOURCE_BOOKING.START_TIME between",
                value1, value2, "startTime");

            return this;
        } // end andStartTimeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStartTimeNotBetween(java.util.Date value1,
            java.util.Date value2) {
            addCriterionForJDBCDate("RESOURCE_BOOKING.START_TIME not between",
                value1, value2, "startTime");

            return this;
        } // end andStartTimeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("RESOURCE_BOOKING.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("RESOURCE_BOOKING.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "RESOURCE_BOOKING.STATUS is not null AND RESOURCE_BOOKING.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(RESOURCE_BOOKING.STATUS is null OR RESOURCE_BOOKING.STATUS = '')");

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
            addCriterion("RESOURCE_BOOKING.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("RESOURCE_BOOKING.STATUS");
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
            addCriterion("RESOURCE_BOOKING.STATUS <>", value, "status");

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
            addCriterion("RESOURCE_BOOKING.STATUS is null OR RESOURCE_BOOKING.STATUS <>",
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
            StringBuffer str = new StringBuffer("RESOURCE_BOOKING.STATUS");
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
            addCriterion("RESOURCE_BOOKING.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("RESOURCE_BOOKING.STATUS");
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
            addCriterion("RESOURCE_BOOKING.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("RESOURCE_BOOKING.STATUS");
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
            addCriterion("RESOURCE_BOOKING.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("RESOURCE_BOOKING.STATUS");
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
            addCriterion("RESOURCE_BOOKING.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("RESOURCE_BOOKING.STATUS");
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
            addCriterion("RESOURCE_BOOKING.STATUS like", buffer.toString(),
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
            addCriterion("RESOURCE_BOOKING.STATUS not like", buffer.toString(),
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
                addCriterion("RESOURCE_BOOKING.STATUS in", values, "status");

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
                addCriterion("RESOURCE_BOOKING.STATUS not in", values, "status");

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
                addCriterion("RESOURCE_BOOKING.STATUS in",
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
                addCriterion("RESOURCE_BOOKING.STATUS not in",
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
            addCriterion("RESOURCE_BOOKING.STATUS between", value1, value2,
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
            addCriterion("RESOURCE_BOOKING.STATUS not between", value1, value2,
                "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceCodeIsNull() {
            addCriterion("ResourceInstanceE.CODE is null");

            return this;
        } // end andResourceInstanceCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceCodeIsNotNull() {
            addCriterion("ResourceInstanceE.CODE is not null");

            return this;
        } // end andResourceInstanceCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceCodeIsNotEmpty() {
            addCriterion(
                "ResourceInstanceE.CODE is not null AND ResourceInstanceE.CODE <> ''");

            return this;
        } // end andResourceInstanceCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceCodeIsEmpty() {
            addCriterion(
                "(ResourceInstanceE.CODE is null OR ResourceInstanceE.CODE = '')");

            return this;
        } // end andResourceInstanceCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceCodeEqualTo(String value) {
            addCriterion("ResourceInstanceE.CODE =", value,
                "resourceInstanceCode");

            return this;
        } // end andResourceInstanceCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceCodeEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("ResourceInstanceE.CODE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceInstanceCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceCodeNotEqualTo(String value) {
            addCriterion("ResourceInstanceE.CODE <>", value,
                "resourceInstanceCode");

            return this;
        } // end andResourceInstanceCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceCodeNotEqualToOrIsNull(String value) {
            addCriterion("ResourceInstanceE.CODE is null OR ResourceInstanceE.CODE <>",
                value, "resourceInstanceCode");

            return this;
        } // end andResourceInstanceCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceCodeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("ResourceInstanceE.CODE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceInstanceCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceCodeGreaterThan(String value) {
            addCriterion("ResourceInstanceE.CODE >", value,
                "resourceInstanceCode");

            return this;
        } // end andResourceInstanceCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceCodeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("ResourceInstanceE.CODE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceInstanceCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceCodeGreaterThanOrEqualTo(
            String value) {
            addCriterion("ResourceInstanceE.CODE >=", value,
                "resourceInstanceCode");

            return this;
        } // end andResourceInstanceCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("ResourceInstanceE.CODE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceInstanceCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceCodeLessThan(String value) {
            addCriterion("ResourceInstanceE.CODE <", value,
                "resourceInstanceCode");

            return this;
        } // end andResourceInstanceCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceCodeLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("ResourceInstanceE.CODE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceInstanceCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceCodeLessThanOrEqualTo(String value) {
            addCriterion("ResourceInstanceE.CODE <=", value,
                "resourceInstanceCode");

            return this;
        } // end andResourceInstanceCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceCodeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("ResourceInstanceE.CODE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceInstanceCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("ResourceInstanceE.CODE like", buffer.toString(),
                "resourceInstanceCode");

            return this;
        } // end andResourceInstanceCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("ResourceInstanceE.CODE not like", buffer.toString(),
                "resourceInstanceCode");

            return this;
        } // end andResourceInstanceCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceCodeIn(List values) {
            if (values.size() == 1) {
                return andResourceInstanceCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("ResourceInstanceE.CODE in", values,
                    "resourceInstanceCode");

                return this;
            } // end else
        } // end andResourceInstanceCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceCodeNotIn(List values) {
            if (values.size() == 1) {
                return andResourceInstanceCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("ResourceInstanceE.CODE not in", values,
                    "resourceInstanceCode");

                return this;
            } // end else
        } // end andResourceInstanceCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceCodeIn(Object[] values) {
            if (values.length == 1) {
                return andResourceInstanceCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("ResourceInstanceE.CODE in",
                    Arrays.asList(values), "resourceInstanceCode");

                return this;
            } // end else
        } // end andResourceInstanceCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andResourceInstanceCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("ResourceInstanceE.CODE not in",
                    Arrays.asList(values), "resourceInstanceCode");

                return this;
            } // end else
        } // end andResourceInstanceCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceCodeBetween(String value1,
            String value2) {
            addCriterion("ResourceInstanceE.CODE between", value1, value2,
                "resourceInstanceCode");

            return this;
        } // end andResourceInstanceCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceCodeNotBetween(String value1,
            String value2) {
            addCriterion("ResourceInstanceE.CODE not between", value1, value2,
                "resourceInstanceCode");

            return this;
        } // end andResourceInstanceCodeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceNameIsNull() {
            addCriterion("ResourceInstanceE.NAME is null");

            return this;
        } // end andResourceInstanceNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceNameIsNotNull() {
            addCriterion("ResourceInstanceE.NAME is not null");

            return this;
        } // end andResourceInstanceNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceNameIsNotEmpty() {
            addCriterion(
                "ResourceInstanceE.NAME is not null AND ResourceInstanceE.NAME <> ''");

            return this;
        } // end andResourceInstanceNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceNameIsEmpty() {
            addCriterion(
                "(ResourceInstanceE.NAME is null OR ResourceInstanceE.NAME = '')");

            return this;
        } // end andResourceInstanceNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceNameEqualTo(String value) {
            addCriterion("ResourceInstanceE.NAME =", value,
                "resourceInstanceName");

            return this;
        } // end andResourceInstanceNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceNameEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("ResourceInstanceE.NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceInstanceNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceNameNotEqualTo(String value) {
            addCriterion("ResourceInstanceE.NAME <>", value,
                "resourceInstanceName");

            return this;
        } // end andResourceInstanceNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceNameNotEqualToOrIsNull(String value) {
            addCriterion("ResourceInstanceE.NAME is null OR ResourceInstanceE.NAME <>",
                value, "resourceInstanceName");

            return this;
        } // end andResourceInstanceNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("ResourceInstanceE.NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceInstanceNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceNameGreaterThan(String value) {
            addCriterion("ResourceInstanceE.NAME >", value,
                "resourceInstanceName");

            return this;
        } // end andResourceInstanceNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("ResourceInstanceE.NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceInstanceNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceNameGreaterThanOrEqualTo(
            String value) {
            addCriterion("ResourceInstanceE.NAME >=", value,
                "resourceInstanceName");

            return this;
        } // end andResourceInstanceNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("ResourceInstanceE.NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceInstanceNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceNameLessThan(String value) {
            addCriterion("ResourceInstanceE.NAME <", value,
                "resourceInstanceName");

            return this;
        } // end andResourceInstanceNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceNameLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("ResourceInstanceE.NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceInstanceNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceNameLessThanOrEqualTo(String value) {
            addCriterion("ResourceInstanceE.NAME <=", value,
                "resourceInstanceName");

            return this;
        } // end andResourceInstanceNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("ResourceInstanceE.NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceInstanceNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("ResourceInstanceE.NAME like", buffer.toString(),
                "resourceInstanceName");

            return this;
        } // end andResourceInstanceNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("ResourceInstanceE.NAME not like", buffer.toString(),
                "resourceInstanceName");

            return this;
        } // end andResourceInstanceNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceNameIn(List values) {
            if (values.size() == 1) {
                return andResourceInstanceNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("ResourceInstanceE.NAME in", values,
                    "resourceInstanceName");

                return this;
            } // end else
        } // end andResourceInstanceNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceNameNotIn(List values) {
            if (values.size() == 1) {
                return andResourceInstanceNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("ResourceInstanceE.NAME not in", values,
                    "resourceInstanceName");

                return this;
            } // end else
        } // end andResourceInstanceNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceNameIn(Object[] values) {
            if (values.length == 1) {
                return andResourceInstanceNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("ResourceInstanceE.NAME in",
                    Arrays.asList(values), "resourceInstanceName");

                return this;
            } // end else
        } // end andResourceInstanceNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andResourceInstanceNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("ResourceInstanceE.NAME not in",
                    Arrays.asList(values), "resourceInstanceName");

                return this;
            } // end else
        } // end andResourceInstanceNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceNameBetween(String value1,
            String value2) {
            addCriterion("ResourceInstanceE.NAME between", value1, value2,
                "resourceInstanceName");

            return this;
        } // end andResourceInstanceNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceNameNotBetween(String value1,
            String value2) {
            addCriterion("ResourceInstanceE.NAME not between", value1, value2,
                "resourceInstanceName");

            return this;
        } // end andResourceInstanceNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceStatusIsNull() {
            addCriterion("ResourceInstanceE.STATUS is null");

            return this;
        } // end andResourceInstanceStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceStatusIsNotNull() {
            addCriterion("ResourceInstanceE.STATUS is not null");

            return this;
        } // end andResourceInstanceStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceStatusIsNotEmpty() {
            addCriterion(
                "ResourceInstanceE.STATUS is not null AND ResourceInstanceE.STATUS <> ''");

            return this;
        } // end andResourceInstanceStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceStatusIsEmpty() {
            addCriterion(
                "(ResourceInstanceE.STATUS is null OR ResourceInstanceE.STATUS = '')");

            return this;
        } // end andResourceInstanceStatusIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceStatusEqualTo(String value) {
            addCriterion("ResourceInstanceE.STATUS =", value,
                "resourceInstanceStatus");

            return this;
        } // end andResourceInstanceStatusEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceStatusEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("ResourceInstanceE.STATUS");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceInstanceStatusEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceStatusNotEqualTo(String value) {
            addCriterion("ResourceInstanceE.STATUS <>", value,
                "resourceInstanceStatus");

            return this;
        } // end andResourceInstanceStatusNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceStatusNotEqualToOrIsNull(
            String value) {
            addCriterion("ResourceInstanceE.STATUS is null OR ResourceInstanceE.STATUS <>",
                value, "resourceInstanceStatus");

            return this;
        } // end andResourceInstanceStatusNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceStatusNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("ResourceInstanceE.STATUS");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceInstanceStatusNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceStatusGreaterThan(String value) {
            addCriterion("ResourceInstanceE.STATUS >", value,
                "resourceInstanceStatus");

            return this;
        } // end andResourceInstanceStatusGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceStatusGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("ResourceInstanceE.STATUS");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceInstanceStatusGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceStatusGreaterThanOrEqualTo(
            String value) {
            addCriterion("ResourceInstanceE.STATUS >=", value,
                "resourceInstanceStatus");

            return this;
        } // end andResourceInstanceStatusGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceStatusGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("ResourceInstanceE.STATUS");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceInstanceStatusGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceStatusLessThan(String value) {
            addCriterion("ResourceInstanceE.STATUS <", value,
                "resourceInstanceStatus");

            return this;
        } // end andResourceInstanceStatusLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceStatusLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("ResourceInstanceE.STATUS");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceInstanceStatusLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceStatusLessThanOrEqualTo(String value) {
            addCriterion("ResourceInstanceE.STATUS <=", value,
                "resourceInstanceStatus");

            return this;
        } // end andResourceInstanceStatusLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceStatusLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("ResourceInstanceE.STATUS");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceInstanceStatusLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceStatusLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("ResourceInstanceE.STATUS like", buffer.toString(),
                "resourceInstanceStatus");

            return this;
        } // end andResourceInstanceStatusLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceStatusNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("ResourceInstanceE.STATUS not like",
                buffer.toString(), "resourceInstanceStatus");

            return this;
        } // end andResourceInstanceStatusNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceStatusIn(List values) {
            if (values.size() == 1) {
                return andResourceInstanceStatusEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("ResourceInstanceE.STATUS in", values,
                    "resourceInstanceStatus");

                return this;
            } // end else
        } // end andResourceInstanceStatusIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceStatusNotIn(List values) {
            if (values.size() == 1) {
                return andResourceInstanceStatusNotEqualTo((String) values.get(
                        0));
            } // end if
            else {
                addCriterion("ResourceInstanceE.STATUS not in", values,
                    "resourceInstanceStatus");

                return this;
            } // end else
        } // end andResourceInstanceStatusNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceStatusIn(Object[] values) {
            if (values.length == 1) {
                return andResourceInstanceStatusEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("ResourceInstanceE.STATUS in",
                    Arrays.asList(values), "resourceInstanceStatus");

                return this;
            } // end else
        } // end andResourceInstanceStatusIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceStatusNotIn(Object[] values) {
            if (values.length == 1) {
                return andResourceInstanceStatusNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("ResourceInstanceE.STATUS not in",
                    Arrays.asList(values), "resourceInstanceStatus");

                return this;
            } // end else
        } // end andResourceInstanceStatusNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceStatusBetween(String value1,
            String value2) {
            addCriterion("ResourceInstanceE.STATUS between", value1, value2,
                "resourceInstanceStatus");

            return this;
        } // end andResourceInstanceStatusBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceInstanceStatusNotBetween(String value1,
            String value2) {
            addCriterion("ResourceInstanceE.STATUS not between", value1,
                value2, "resourceInstanceStatus");

            return this;
        } // end andResourceInstanceStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeCodeIsNull() {
            addCriterion("ResourceTypeE.CODE is null");

            return this;
        } // end andResourceTypeCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeCodeIsNotNull() {
            addCriterion("ResourceTypeE.CODE is not null");

            return this;
        } // end andResourceTypeCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeCodeIsNotEmpty() {
            addCriterion(
                "ResourceTypeE.CODE is not null AND ResourceTypeE.CODE <> ''");

            return this;
        } // end andResourceTypeCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeCodeIsEmpty() {
            addCriterion(
                "(ResourceTypeE.CODE is null OR ResourceTypeE.CODE = '')");

            return this;
        } // end andResourceTypeCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeCodeEqualTo(String value) {
            addCriterion("ResourceTypeE.CODE =", value, "resourceTypeCode");

            return this;
        } // end andResourceTypeCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeCodeEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("ResourceTypeE.CODE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceTypeCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeCodeNotEqualTo(String value) {
            addCriterion("ResourceTypeE.CODE <>", value, "resourceTypeCode");

            return this;
        } // end andResourceTypeCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeCodeNotEqualToOrIsNull(String value) {
            addCriterion("ResourceTypeE.CODE is null OR ResourceTypeE.CODE <>",
                value, "resourceTypeCode");

            return this;
        } // end andResourceTypeCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeCodeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("ResourceTypeE.CODE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceTypeCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeCodeGreaterThan(String value) {
            addCriterion("ResourceTypeE.CODE >", value, "resourceTypeCode");

            return this;
        } // end andResourceTypeCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeCodeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("ResourceTypeE.CODE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceTypeCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ResourceTypeE.CODE >=", value, "resourceTypeCode");

            return this;
        } // end andResourceTypeCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("ResourceTypeE.CODE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceTypeCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeCodeLessThan(String value) {
            addCriterion("ResourceTypeE.CODE <", value, "resourceTypeCode");

            return this;
        } // end andResourceTypeCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeCodeLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("ResourceTypeE.CODE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceTypeCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("ResourceTypeE.CODE <=", value, "resourceTypeCode");

            return this;
        } // end andResourceTypeCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeCodeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("ResourceTypeE.CODE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceTypeCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("ResourceTypeE.CODE like", buffer.toString(),
                "resourceTypeCode");

            return this;
        } // end andResourceTypeCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("ResourceTypeE.CODE not like", buffer.toString(),
                "resourceTypeCode");

            return this;
        } // end andResourceTypeCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeCodeIn(List values) {
            if (values.size() == 1) {
                return andResourceTypeCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("ResourceTypeE.CODE in", values, "resourceTypeCode");

                return this;
            } // end else
        } // end andResourceTypeCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeCodeNotIn(List values) {
            if (values.size() == 1) {
                return andResourceTypeCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("ResourceTypeE.CODE not in", values,
                    "resourceTypeCode");

                return this;
            } // end else
        } // end andResourceTypeCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeCodeIn(Object[] values) {
            if (values.length == 1) {
                return andResourceTypeCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("ResourceTypeE.CODE in", Arrays.asList(values),
                    "resourceTypeCode");

                return this;
            } // end else
        } // end andResourceTypeCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andResourceTypeCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("ResourceTypeE.CODE not in",
                    Arrays.asList(values), "resourceTypeCode");

                return this;
            } // end else
        } // end andResourceTypeCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeCodeBetween(String value1, String value2) {
            addCriterion("ResourceTypeE.CODE between", value1, value2,
                "resourceTypeCode");

            return this;
        } // end andResourceTypeCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeCodeNotBetween(String value1,
            String value2) {
            addCriterion("ResourceTypeE.CODE not between", value1, value2,
                "resourceTypeCode");

            return this;
        } // end andResourceTypeCodeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeNameIsNull() {
            addCriterion("ResourceTypeE.NAME is null");

            return this;
        } // end andResourceTypeNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeNameIsNotNull() {
            addCriterion("ResourceTypeE.NAME is not null");

            return this;
        } // end andResourceTypeNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeNameIsNotEmpty() {
            addCriterion(
                "ResourceTypeE.NAME is not null AND ResourceTypeE.NAME <> ''");

            return this;
        } // end andResourceTypeNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeNameIsEmpty() {
            addCriterion(
                "(ResourceTypeE.NAME is null OR ResourceTypeE.NAME = '')");

            return this;
        } // end andResourceTypeNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeNameEqualTo(String value) {
            addCriterion("ResourceTypeE.NAME =", value, "resourceTypeName");

            return this;
        } // end andResourceTypeNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeNameEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("ResourceTypeE.NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceTypeNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeNameNotEqualTo(String value) {
            addCriterion("ResourceTypeE.NAME <>", value, "resourceTypeName");

            return this;
        } // end andResourceTypeNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeNameNotEqualToOrIsNull(String value) {
            addCriterion("ResourceTypeE.NAME is null OR ResourceTypeE.NAME <>",
                value, "resourceTypeName");

            return this;
        } // end andResourceTypeNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("ResourceTypeE.NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceTypeNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeNameGreaterThan(String value) {
            addCriterion("ResourceTypeE.NAME >", value, "resourceTypeName");

            return this;
        } // end andResourceTypeNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("ResourceTypeE.NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceTypeNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("ResourceTypeE.NAME >=", value, "resourceTypeName");

            return this;
        } // end andResourceTypeNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("ResourceTypeE.NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceTypeNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeNameLessThan(String value) {
            addCriterion("ResourceTypeE.NAME <", value, "resourceTypeName");

            return this;
        } // end andResourceTypeNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeNameLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("ResourceTypeE.NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceTypeNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeNameLessThanOrEqualTo(String value) {
            addCriterion("ResourceTypeE.NAME <=", value, "resourceTypeName");

            return this;
        } // end andResourceTypeNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("ResourceTypeE.NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andResourceTypeNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("ResourceTypeE.NAME like", buffer.toString(),
                "resourceTypeName");

            return this;
        } // end andResourceTypeNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("ResourceTypeE.NAME not like", buffer.toString(),
                "resourceTypeName");

            return this;
        } // end andResourceTypeNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeNameIn(List values) {
            if (values.size() == 1) {
                return andResourceTypeNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("ResourceTypeE.NAME in", values, "resourceTypeName");

                return this;
            } // end else
        } // end andResourceTypeNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeNameNotIn(List values) {
            if (values.size() == 1) {
                return andResourceTypeNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("ResourceTypeE.NAME not in", values,
                    "resourceTypeName");

                return this;
            } // end else
        } // end andResourceTypeNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeNameIn(Object[] values) {
            if (values.length == 1) {
                return andResourceTypeNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("ResourceTypeE.NAME in", Arrays.asList(values),
                    "resourceTypeName");

                return this;
            } // end else
        } // end andResourceTypeNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andResourceTypeNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("ResourceTypeE.NAME not in",
                    Arrays.asList(values), "resourceTypeName");

                return this;
            } // end else
        } // end andResourceTypeNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeNameBetween(String value1, String value2) {
            addCriterion("ResourceTypeE.NAME between", value1, value2,
                "resourceTypeName");

            return this;
        } // end andResourceTypeNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andResourceTypeNameNotBetween(String value1,
            String value2) {
            addCriterion("ResourceTypeE.NAME not between", value1, value2,
                "resourceTypeName");

            return this;
        } // end andResourceTypeNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdIsNull() {
            addCriterion("RESOURCE_BOOKING.USER_ID is null");

            return this;
        } // end andUserIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdIsNotNull() {
            addCriterion("RESOURCE_BOOKING.USER_ID is not null");

            return this;
        } // end andUserIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdIsNotEmpty() {
            addCriterion(
                "RESOURCE_BOOKING.USER_ID is not null AND RESOURCE_BOOKING.USER_ID <> ''");

            return this;
        } // end andUserIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserIdIsEmpty() {
            addCriterion(
                "(RESOURCE_BOOKING.USER_ID is null OR RESOURCE_BOOKING.USER_ID = '')");

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
            addCriterion("RESOURCE_BOOKING.USER_ID =", value, "userId");

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
            StringBuffer str = new StringBuffer("RESOURCE_BOOKING.USER_ID");
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
            addCriterion("RESOURCE_BOOKING.USER_ID <>", value, "userId");

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
            addCriterion("RESOURCE_BOOKING.USER_ID is null OR RESOURCE_BOOKING.USER_ID <>",
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
            StringBuffer str = new StringBuffer("RESOURCE_BOOKING.USER_ID");
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
            addCriterion("RESOURCE_BOOKING.USER_ID >", value, "userId");

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
            StringBuffer str = new StringBuffer("RESOURCE_BOOKING.USER_ID");
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
            addCriterion("RESOURCE_BOOKING.USER_ID >=", value, "userId");

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
            StringBuffer str = new StringBuffer("RESOURCE_BOOKING.USER_ID");
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
            addCriterion("RESOURCE_BOOKING.USER_ID <", value, "userId");

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
            StringBuffer str = new StringBuffer("RESOURCE_BOOKING.USER_ID");
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
            addCriterion("RESOURCE_BOOKING.USER_ID <=", value, "userId");

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
            StringBuffer str = new StringBuffer("RESOURCE_BOOKING.USER_ID");
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
                addCriterion("RESOURCE_BOOKING.USER_ID in", values, "userId");

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
                addCriterion("RESOURCE_BOOKING.USER_ID not in", values, "userId");

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
                addCriterion("RESOURCE_BOOKING.USER_ID in", values, "userId");

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
                addCriterion("RESOURCE_BOOKING.USER_ID not in", values, "userId");

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
                addCriterion("RESOURCE_BOOKING.USER_ID in",
                    Arrays.asList(values), "userId");

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
                addCriterion("RESOURCE_BOOKING.USER_ID not in",
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
            addCriterion("RESOURCE_BOOKING.USER_ID between", value1, value2,
                "userId");

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
            addCriterion("RESOURCE_BOOKING.USER_ID between", value1, value2,
                "userId");

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
            addCriterion("RESOURCE_BOOKING.USER_ID not between", value1,
                value2, "userId");

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
            addCriterion("RESOURCE_BOOKING.USER_ID not between", value1,
                value2, "userId");

            return this;
        } // end andUserIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNameIsNull() {
            addCriterion("sysUserE.USER_NAME is null");

            return this;
        } // end andUserNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNameIsNotNull() {
            addCriterion("sysUserE.USER_NAME is not null");

            return this;
        } // end andUserNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNameIsNotEmpty() {
            addCriterion(
                "sysUserE.USER_NAME is not null AND sysUserE.USER_NAME <> ''");

            return this;
        } // end andUserNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andUserNameIsEmpty() {
            addCriterion(
                "(sysUserE.USER_NAME is null OR sysUserE.USER_NAME = '')");

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
            addCriterion("sysUserE.USER_NAME =", value, "userName");

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
            StringBuffer str = new StringBuffer("sysUserE.USER_NAME");
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
            addCriterion("sysUserE.USER_NAME <>", value, "userName");

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
            addCriterion("sysUserE.USER_NAME is null OR sysUserE.USER_NAME <>",
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
            StringBuffer str = new StringBuffer("sysUserE.USER_NAME");
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
            addCriterion("sysUserE.USER_NAME >", value, "userName");

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
            StringBuffer str = new StringBuffer("sysUserE.USER_NAME");
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
            addCriterion("sysUserE.USER_NAME >=", value, "userName");

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
            StringBuffer str = new StringBuffer("sysUserE.USER_NAME");
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
            addCriterion("sysUserE.USER_NAME <", value, "userName");

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
            StringBuffer str = new StringBuffer("sysUserE.USER_NAME");
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
            addCriterion("sysUserE.USER_NAME <=", value, "userName");

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
            StringBuffer str = new StringBuffer("sysUserE.USER_NAME");
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
            addCriterion("sysUserE.USER_NAME like", buffer.toString(),
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
            addCriterion("sysUserE.USER_NAME not like", buffer.toString(),
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
                addCriterion("sysUserE.USER_NAME in", values, "userName");

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
                addCriterion("sysUserE.USER_NAME not in", values, "userName");

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
                addCriterion("sysUserE.USER_NAME in", Arrays.asList(values),
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
                addCriterion("sysUserE.USER_NAME not in",
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
            addCriterion("sysUserE.USER_NAME between", value1, value2,
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
            addCriterion("sysUserE.USER_NAME not between", value1, value2,
                "userName");

            return this;
        } // end andUserNameNotBetween()
    } // end Criteria
} // end ResourceBookingDAOQueryBean
