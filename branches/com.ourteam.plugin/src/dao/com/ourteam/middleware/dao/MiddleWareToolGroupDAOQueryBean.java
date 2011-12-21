/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.middleware.dao;

import net.dao.BaseQueryBean;
import net.dao.BaseWhereCriterion;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * MiddleWareToolGroup query bean 2011-12-07 08:45:30
 *
 * @author Auto Gen
 */
public class MiddleWareToolGroupDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new MiddleWareToolGroupDAOQueryBean object.
     */
    public MiddleWareToolGroupDAOQueryBean() {
        super();
    } // end MiddleWareToolGroupDAOQueryBean()

    /**
     * Creates a new MiddleWareToolGroupDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public MiddleWareToolGroupDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end MiddleWareToolGroupDAOQueryBean()

    /**
     * Creates a new MiddleWareToolGroupDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public MiddleWareToolGroupDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end MiddleWareToolGroupDAOQueryBean()

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
            addSelectProperty(IMiddleWareToolGroupDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolGroupDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addGroupNameSelectProperty() {
        addGroupNameSelectProperty("groupName");
    } // end addGroupNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addGroupNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareToolGroupDAO.GroupName, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolGroupDAO.GroupName, "groupName");
        } // end else
    } // end addGroupNameSelectProperty()

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
            addSelectProperty(IMiddleWareToolGroupDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolGroupDAO.Remarks, "remarks");
        } // end else
    } // end addRemarksSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addSortIndexSelectProperty() {
        addSortIndexSelectProperty("sortIndex");
    } // end addSortIndexSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addSortIndexSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareToolGroupDAO.SortIndex, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolGroupDAO.SortIndex, "sortIndex");
        } // end else
    } // end addSortIndexSelectProperty()

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
            addSelectProperty(IMiddleWareToolGroupDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolGroupDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addParentGroupIdSelectProperty() {
        addParentGroupIdSelectProperty("parentGroupId");
    } // end addParentGroupIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addParentGroupIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareToolGroupDAO.ParentGroupId, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolGroupDAO.ParentGroupId,
                "parentGroupId");
        } // end else
    } // end addParentGroupIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addProviderIdSelectProperty() {
        addProviderIdSelectProperty("providerId");
    } // end addProviderIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addProviderIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IMiddleWareToolGroupDAO.ProviderId, aAlias);
        } // end if
        else {
            addSelectProperty(IMiddleWareToolGroupDAO.ProviderId, "providerId");
        } // end else
    } // end addProviderIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addGroupNameSelectProperty();

        addRemarksSelectProperty();

        addSortIndexSelectProperty();

        addStatusSelectProperty();

        addParentGroupIdSelectProperty();

        addProviderIdSelectProperty();
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
            addCriterion("MIDDLE_WARE_TOOL_GROUP.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL_GROUP.ID is not null AND MIDDLE_WARE_TOOL_GROUP.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL_GROUP.ID is null OR MIDDLE_WARE_TOOL_GROUP.ID = '')");

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
            addCriterion("MIDDLE_WARE_TOOL_GROUP.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_GROUP.ID");
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
            addCriterion("MIDDLE_WARE_TOOL_GROUP.ID <>", value, "id");

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
            addCriterion("MIDDLE_WARE_TOOL_GROUP.ID is null OR MIDDLE_WARE_TOOL_GROUP.ID <>",
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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_GROUP.ID");
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
            addCriterion("MIDDLE_WARE_TOOL_GROUP.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_GROUP.ID");
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
            addCriterion("MIDDLE_WARE_TOOL_GROUP.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_GROUP.ID");
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
            addCriterion("MIDDLE_WARE_TOOL_GROUP.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_GROUP.ID");
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
            addCriterion("MIDDLE_WARE_TOOL_GROUP.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_GROUP.ID");
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
                addCriterion("MIDDLE_WARE_TOOL_GROUP.ID in", values, "id");

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
                addCriterion("MIDDLE_WARE_TOOL_GROUP.ID not in", values, "id");

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
                addCriterion("MIDDLE_WARE_TOOL_GROUP.ID in", values, "id");

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
                addCriterion("MIDDLE_WARE_TOOL_GROUP.ID not in", values, "id");

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
                addCriterion("MIDDLE_WARE_TOOL_GROUP.ID in",
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
                addCriterion("MIDDLE_WARE_TOOL_GROUP.ID not in",
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
            addCriterion("MIDDLE_WARE_TOOL_GROUP.ID between", value1, value2,
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
            addCriterion("MIDDLE_WARE_TOOL_GROUP.ID between", value1, value2,
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
            addCriterion("MIDDLE_WARE_TOOL_GROUP.ID not between", value1,
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
            addCriterion("MIDDLE_WARE_TOOL_GROUP.ID not between", value1,
                value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupNameIsNull() {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.GROUP_NAME is null");

            return this;
        } // end andGroupNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupNameIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.GROUP_NAME is not null");

            return this;
        } // end andGroupNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupNameIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL_GROUP.GROUP_NAME is not null AND MIDDLE_WARE_TOOL_GROUP.GROUP_NAME <> ''");

            return this;
        } // end andGroupNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupNameIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL_GROUP.GROUP_NAME is null OR MIDDLE_WARE_TOOL_GROUP.GROUP_NAME = '')");

            return this;
        } // end andGroupNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.GROUP_NAME =", value,
                "groupName");

            return this;
        } // end andGroupNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_GROUP.GROUP_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andGroupNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.GROUP_NAME <>", value,
                "groupName");

            return this;
        } // end andGroupNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupNameNotEqualToOrIsNull(String value) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.GROUP_NAME is null OR MIDDLE_WARE_TOOL_GROUP.GROUP_NAME <>",
                value, "groupName");

            return this;
        } // end andGroupNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_GROUP.GROUP_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andGroupNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.GROUP_NAME >", value,
                "groupName");

            return this;
        } // end andGroupNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupNameGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_GROUP.GROUP_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andGroupNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.GROUP_NAME >=", value,
                "groupName");

            return this;
        } // end andGroupNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_GROUP.GROUP_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andGroupNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupNameLessThan(String value) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.GROUP_NAME <", value,
                "groupName");

            return this;
        } // end andGroupNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_GROUP.GROUP_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andGroupNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.GROUP_NAME <=", value,
                "groupName");

            return this;
        } // end andGroupNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_GROUP.GROUP_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andGroupNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_TOOL_GROUP.GROUP_NAME like",
                buffer.toString(), "groupName");

            return this;
        } // end andGroupNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("MIDDLE_WARE_TOOL_GROUP.GROUP_NAME not like",
                buffer.toString(), "groupName");

            return this;
        } // end andGroupNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupNameIn(List values) {
            if (values.size() == 1) {
                return andGroupNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_GROUP.GROUP_NAME in", values,
                    "groupName");

                return this;
            } // end else
        } // end andGroupNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupNameNotIn(List values) {
            if (values.size() == 1) {
                return andGroupNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_GROUP.GROUP_NAME not in",
                    values, "groupName");

                return this;
            } // end else
        } // end andGroupNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupNameIn(Object[] values) {
            if (values.length == 1) {
                return andGroupNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_GROUP.GROUP_NAME in",
                    Arrays.asList(values), "groupName");

                return this;
            } // end else
        } // end andGroupNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andGroupNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_GROUP.GROUP_NAME not in",
                    Arrays.asList(values), "groupName");

                return this;
            } // end else
        } // end andGroupNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.GROUP_NAME between", value1,
                value2, "groupName");

            return this;
        } // end andGroupNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.GROUP_NAME not between",
                value1, value2, "groupName");

            return this;
        } // end andGroupNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL_GROUP.REMARKS is not null AND MIDDLE_WARE_TOOL_GROUP.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL_GROUP.REMARKS is null OR MIDDLE_WARE_TOOL_GROUP.REMARKS = '')");

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
            addCriterion("MIDDLE_WARE_TOOL_GROUP.REMARKS =", value, "remarks");

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
                    "MIDDLE_WARE_TOOL_GROUP.REMARKS");
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
            addCriterion("MIDDLE_WARE_TOOL_GROUP.REMARKS <>", value, "remarks");

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
            addCriterion("MIDDLE_WARE_TOOL_GROUP.REMARKS is null OR MIDDLE_WARE_TOOL_GROUP.REMARKS <>",
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
                    "MIDDLE_WARE_TOOL_GROUP.REMARKS");
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
            addCriterion("MIDDLE_WARE_TOOL_GROUP.REMARKS >", value, "remarks");

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
                    "MIDDLE_WARE_TOOL_GROUP.REMARKS");
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
            addCriterion("MIDDLE_WARE_TOOL_GROUP.REMARKS >=", value, "remarks");

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
                    "MIDDLE_WARE_TOOL_GROUP.REMARKS");
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
            addCriterion("MIDDLE_WARE_TOOL_GROUP.REMARKS <", value, "remarks");

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
                    "MIDDLE_WARE_TOOL_GROUP.REMARKS");
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
            addCriterion("MIDDLE_WARE_TOOL_GROUP.REMARKS <=", value, "remarks");

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
                    "MIDDLE_WARE_TOOL_GROUP.REMARKS");
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
            addCriterion("MIDDLE_WARE_TOOL_GROUP.REMARKS like",
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
            addCriterion("MIDDLE_WARE_TOOL_GROUP.REMARKS not like",
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
                addCriterion("MIDDLE_WARE_TOOL_GROUP.REMARKS in", values,
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
                addCriterion("MIDDLE_WARE_TOOL_GROUP.REMARKS not in", values,
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
                addCriterion("MIDDLE_WARE_TOOL_GROUP.REMARKS in",
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
                addCriterion("MIDDLE_WARE_TOOL_GROUP.REMARKS not in",
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
            addCriterion("MIDDLE_WARE_TOOL_GROUP.REMARKS between", value1,
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
            addCriterion("MIDDLE_WARE_TOOL_GROUP.REMARKS not between", value1,
                value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIsNull() {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.SORT_INDEX is null");

            return this;
        } // end andSortIndexIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.SORT_INDEX is not null");

            return this;
        } // end andSortIndexIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL_GROUP.SORT_INDEX is not null AND MIDDLE_WARE_TOOL_GROUP.SORT_INDEX <> ''");

            return this;
        } // end andSortIndexIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL_GROUP.SORT_INDEX is null OR MIDDLE_WARE_TOOL_GROUP.SORT_INDEX = '')");

            return this;
        } // end andSortIndexIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexEqualTo(int value) {
            return andSortIndexEqualTo(Integer.valueOf(value));
        } // end andSortIndexEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexEqualTo(java.lang.Integer value) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.SORT_INDEX =", value,
                "sortIndex");

            return this;
        } // end andSortIndexEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_GROUP.SORT_INDEX");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSortIndexEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexNotEqualTo(int value) {
            return andSortIndexNotEqualTo(Integer.valueOf(value));
        } // end andSortIndexNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexNotEqualTo(java.lang.Integer value) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.SORT_INDEX <>", value,
                "sortIndex");

            return this;
        } // end andSortIndexNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexNotEqualToOrIsNull(int value) {
            return andSortIndexNotEqualToOrIsNull(Integer.valueOf(value));
        } // end andSortIndexNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexNotEqualToOrIsNull(java.lang.Integer value) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.SORT_INDEX is null OR MIDDLE_WARE_TOOL_GROUP.SORT_INDEX <>",
                value, "sortIndex");

            return this;
        } // end andSortIndexNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_GROUP.SORT_INDEX");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSortIndexNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexGreaterThan(int value) {
            return andSortIndexGreaterThan(Integer.valueOf(value));
        } // end andSortIndexGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexGreaterThan(java.lang.Integer value) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.SORT_INDEX >", value,
                "sortIndex");

            return this;
        } // end andSortIndexGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_GROUP.SORT_INDEX");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSortIndexGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexGreaterThanOrEqualTo(int value) {
            return andSortIndexGreaterThanOrEqualTo(Integer.valueOf(value));
        } // end andSortIndexGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexGreaterThanOrEqualTo(
            java.lang.Integer value) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.SORT_INDEX >=", value,
                "sortIndex");

            return this;
        } // end andSortIndexGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_GROUP.SORT_INDEX");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSortIndexGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexLessThan(int value) {
            return andSortIndexLessThan(Integer.valueOf(value));
        } // end andSortIndexLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexLessThan(java.lang.Integer value) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.SORT_INDEX <", value,
                "sortIndex");

            return this;
        } // end andSortIndexLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_GROUP.SORT_INDEX");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSortIndexLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexLessThanOrEqualTo(int value) {
            return andSortIndexLessThanOrEqualTo(Integer.valueOf(value));
        } // end andSortIndexLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexLessThanOrEqualTo(java.lang.Integer value) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.SORT_INDEX <=", value,
                "sortIndex");

            return this;
        } // end andSortIndexLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_GROUP.SORT_INDEX");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSortIndexLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIn(int[] values) {
            if (values.length == 1) {
                return andSortIndexEqualTo((int) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_GROUP.SORT_INDEX in", values,
                    "sortIndex");

                return this;
            } // end else
        } // end andSortIndexIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexNotIn(int[] values) {
            if (values.length == 1) {
                return andSortIndexNotEqualTo((int) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_GROUP.SORT_INDEX not in",
                    values, "sortIndex");

                return this;
            } // end else
        } // end andSortIndexNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIn(List values) {
            if (values.size() == 1) {
                return andSortIndexEqualTo((java.lang.Integer) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_GROUP.SORT_INDEX in", values,
                    "sortIndex");

                return this;
            } // end else
        } // end andSortIndexIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexNotIn(List values) {
            if (values.size() == 1) {
                return andSortIndexNotEqualTo((java.lang.Integer) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_GROUP.SORT_INDEX not in",
                    values, "sortIndex");

                return this;
            } // end else
        } // end andSortIndexNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIn(Object[] values) {
            if (values.length == 1) {
                return andSortIndexEqualTo((java.lang.Integer) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_GROUP.SORT_INDEX in",
                    Arrays.asList(values), "sortIndex");

                return this;
            } // end else
        } // end andSortIndexIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexNotIn(Object[] values) {
            if (values.length == 1) {
                return andSortIndexNotEqualTo((java.lang.Integer) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_GROUP.SORT_INDEX not in",
                    Arrays.asList(values), "sortIndex");

                return this;
            } // end else
        } // end andSortIndexNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexBetween(int value1, int value2) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.SORT_INDEX between", value1,
                value2, "sortIndex");

            return this;
        } // end andSortIndexBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexBetween(java.lang.Integer value1,
            java.lang.Integer value2) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.SORT_INDEX between", value1,
                value2, "sortIndex");

            return this;
        } // end andSortIndexBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexNotBetween(int value1, int value2) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.SORT_INDEX not between",
                value1, value2, "sortIndex");

            return this;
        } // end andSortIndexNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexNotBetween(java.lang.Integer value1,
            java.lang.Integer value2) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.SORT_INDEX not between",
                value1, value2, "sortIndex");

            return this;
        } // end andSortIndexNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL_GROUP.STATUS is not null AND MIDDLE_WARE_TOOL_GROUP.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL_GROUP.STATUS is null OR MIDDLE_WARE_TOOL_GROUP.STATUS = '')");

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
            addCriterion("MIDDLE_WARE_TOOL_GROUP.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_GROUP.STATUS");
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
            addCriterion("MIDDLE_WARE_TOOL_GROUP.STATUS <>", value, "status");

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
            addCriterion("MIDDLE_WARE_TOOL_GROUP.STATUS is null OR MIDDLE_WARE_TOOL_GROUP.STATUS <>",
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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_GROUP.STATUS");
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
            addCriterion("MIDDLE_WARE_TOOL_GROUP.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_GROUP.STATUS");
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
            addCriterion("MIDDLE_WARE_TOOL_GROUP.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_GROUP.STATUS");
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
            addCriterion("MIDDLE_WARE_TOOL_GROUP.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_GROUP.STATUS");
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
            addCriterion("MIDDLE_WARE_TOOL_GROUP.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("MIDDLE_WARE_TOOL_GROUP.STATUS");
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
            addCriterion("MIDDLE_WARE_TOOL_GROUP.STATUS like",
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
            addCriterion("MIDDLE_WARE_TOOL_GROUP.STATUS not like",
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
                addCriterion("MIDDLE_WARE_TOOL_GROUP.STATUS in", values,
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
                addCriterion("MIDDLE_WARE_TOOL_GROUP.STATUS not in", values,
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
                addCriterion("MIDDLE_WARE_TOOL_GROUP.STATUS in",
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
                addCriterion("MIDDLE_WARE_TOOL_GROUP.STATUS not in",
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
            addCriterion("MIDDLE_WARE_TOOL_GROUP.STATUS between", value1,
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
            addCriterion("MIDDLE_WARE_TOOL_GROUP.STATUS not between", value1,
                value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentGroupIdIsNull() {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.PARENT_GROUP_ID is null");

            return this;
        } // end andParentGroupIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentGroupIdIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.PARENT_GROUP_ID is not null");

            return this;
        } // end andParentGroupIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentGroupIdIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL_GROUP.PARENT_GROUP_ID is not null AND MIDDLE_WARE_TOOL_GROUP.PARENT_GROUP_ID <> ''");

            return this;
        } // end andParentGroupIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentGroupIdIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL_GROUP.PARENT_GROUP_ID is null OR MIDDLE_WARE_TOOL_GROUP.PARENT_GROUP_ID = '')");

            return this;
        } // end andParentGroupIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentGroupIdEqualTo(long value) {
            return andParentGroupIdEqualTo(Long.valueOf(value));
        } // end andParentGroupIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentGroupIdEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.PARENT_GROUP_ID =", value,
                "parentGroupId");

            return this;
        } // end andParentGroupIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentGroupIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_GROUP.PARENT_GROUP_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentGroupIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentGroupIdNotEqualTo(long value) {
            return andParentGroupIdNotEqualTo(Long.valueOf(value));
        } // end andParentGroupIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentGroupIdNotEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.PARENT_GROUP_ID <>", value,
                "parentGroupId");

            return this;
        } // end andParentGroupIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentGroupIdNotEqualToOrIsNull(long value) {
            return andParentGroupIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andParentGroupIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentGroupIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.PARENT_GROUP_ID is null OR MIDDLE_WARE_TOOL_GROUP.PARENT_GROUP_ID <>",
                value, "parentGroupId");

            return this;
        } // end andParentGroupIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentGroupIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_GROUP.PARENT_GROUP_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentGroupIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentGroupIdGreaterThan(long value) {
            return andParentGroupIdGreaterThan(Long.valueOf(value));
        } // end andParentGroupIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentGroupIdGreaterThan(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.PARENT_GROUP_ID >", value,
                "parentGroupId");

            return this;
        } // end andParentGroupIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentGroupIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_GROUP.PARENT_GROUP_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentGroupIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentGroupIdGreaterThanOrEqualTo(long value) {
            return andParentGroupIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andParentGroupIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentGroupIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.PARENT_GROUP_ID >=", value,
                "parentGroupId");

            return this;
        } // end andParentGroupIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentGroupIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_GROUP.PARENT_GROUP_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentGroupIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentGroupIdLessThan(long value) {
            return andParentGroupIdLessThan(Long.valueOf(value));
        } // end andParentGroupIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentGroupIdLessThan(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.PARENT_GROUP_ID <", value,
                "parentGroupId");

            return this;
        } // end andParentGroupIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentGroupIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_GROUP.PARENT_GROUP_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentGroupIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentGroupIdLessThanOrEqualTo(long value) {
            return andParentGroupIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andParentGroupIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentGroupIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.PARENT_GROUP_ID <=", value,
                "parentGroupId");

            return this;
        } // end andParentGroupIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentGroupIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_GROUP.PARENT_GROUP_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentGroupIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentGroupIdIn(long[] values) {
            if (values.length == 1) {
                return andParentGroupIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_GROUP.PARENT_GROUP_ID in",
                    values, "parentGroupId");

                return this;
            } // end else
        } // end andParentGroupIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentGroupIdNotIn(long[] values) {
            if (values.length == 1) {
                return andParentGroupIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_GROUP.PARENT_GROUP_ID not in",
                    values, "parentGroupId");

                return this;
            } // end else
        } // end andParentGroupIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentGroupIdIn(List values) {
            if (values.size() == 1) {
                return andParentGroupIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_GROUP.PARENT_GROUP_ID in",
                    values, "parentGroupId");

                return this;
            } // end else
        } // end andParentGroupIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentGroupIdNotIn(List values) {
            if (values.size() == 1) {
                return andParentGroupIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_GROUP.PARENT_GROUP_ID not in",
                    values, "parentGroupId");

                return this;
            } // end else
        } // end andParentGroupIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentGroupIdIn(Object[] values) {
            if (values.length == 1) {
                return andParentGroupIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_GROUP.PARENT_GROUP_ID in",
                    Arrays.asList(values), "parentGroupId");

                return this;
            } // end else
        } // end andParentGroupIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentGroupIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andParentGroupIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_GROUP.PARENT_GROUP_ID not in",
                    Arrays.asList(values), "parentGroupId");

                return this;
            } // end else
        } // end andParentGroupIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentGroupIdBetween(long value1, long value2) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.PARENT_GROUP_ID between",
                value1, value2, "parentGroupId");

            return this;
        } // end andParentGroupIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentGroupIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.PARENT_GROUP_ID between",
                value1, value2, "parentGroupId");

            return this;
        } // end andParentGroupIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentGroupIdNotBetween(long value1, long value2) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.PARENT_GROUP_ID not between",
                value1, value2, "parentGroupId");

            return this;
        } // end andParentGroupIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentGroupIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.PARENT_GROUP_ID not between",
                value1, value2, "parentGroupId");

            return this;
        } // end andParentGroupIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdIsNull() {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.PROVIDER_ID is null");

            return this;
        } // end andProviderIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdIsNotNull() {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.PROVIDER_ID is not null");

            return this;
        } // end andProviderIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdIsNotEmpty() {
            addCriterion(
                "MIDDLE_WARE_TOOL_GROUP.PROVIDER_ID is not null AND MIDDLE_WARE_TOOL_GROUP.PROVIDER_ID <> ''");

            return this;
        } // end andProviderIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdIsEmpty() {
            addCriterion(
                "(MIDDLE_WARE_TOOL_GROUP.PROVIDER_ID is null OR MIDDLE_WARE_TOOL_GROUP.PROVIDER_ID = '')");

            return this;
        } // end andProviderIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdEqualTo(long value) {
            return andProviderIdEqualTo(Long.valueOf(value));
        } // end andProviderIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.PROVIDER_ID =", value,
                "providerId");

            return this;
        } // end andProviderIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_GROUP.PROVIDER_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdNotEqualTo(long value) {
            return andProviderIdNotEqualTo(Long.valueOf(value));
        } // end andProviderIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdNotEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.PROVIDER_ID <>", value,
                "providerId");

            return this;
        } // end andProviderIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdNotEqualToOrIsNull(long value) {
            return andProviderIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andProviderIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.PROVIDER_ID is null OR MIDDLE_WARE_TOOL_GROUP.PROVIDER_ID <>",
                value, "providerId");

            return this;
        } // end andProviderIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_GROUP.PROVIDER_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdGreaterThan(long value) {
            return andProviderIdGreaterThan(Long.valueOf(value));
        } // end andProviderIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdGreaterThan(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.PROVIDER_ID >", value,
                "providerId");

            return this;
        } // end andProviderIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_GROUP.PROVIDER_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdGreaterThanOrEqualTo(long value) {
            return andProviderIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andProviderIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.PROVIDER_ID >=", value,
                "providerId");

            return this;
        } // end andProviderIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_GROUP.PROVIDER_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdLessThan(long value) {
            return andProviderIdLessThan(Long.valueOf(value));
        } // end andProviderIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdLessThan(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.PROVIDER_ID <", value,
                "providerId");

            return this;
        } // end andProviderIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_GROUP.PROVIDER_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdLessThanOrEqualTo(long value) {
            return andProviderIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andProviderIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.PROVIDER_ID <=", value,
                "providerId");

            return this;
        } // end andProviderIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "MIDDLE_WARE_TOOL_GROUP.PROVIDER_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProviderIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdIn(long[] values) {
            if (values.length == 1) {
                return andProviderIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_GROUP.PROVIDER_ID in", values,
                    "providerId");

                return this;
            } // end else
        } // end andProviderIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdNotIn(long[] values) {
            if (values.length == 1) {
                return andProviderIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_GROUP.PROVIDER_ID not in",
                    values, "providerId");

                return this;
            } // end else
        } // end andProviderIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdIn(List values) {
            if (values.size() == 1) {
                return andProviderIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_GROUP.PROVIDER_ID in", values,
                    "providerId");

                return this;
            } // end else
        } // end andProviderIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdNotIn(List values) {
            if (values.size() == 1) {
                return andProviderIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_GROUP.PROVIDER_ID not in",
                    values, "providerId");

                return this;
            } // end else
        } // end andProviderIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdIn(Object[] values) {
            if (values.length == 1) {
                return andProviderIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_GROUP.PROVIDER_ID in",
                    Arrays.asList(values), "providerId");

                return this;
            } // end else
        } // end andProviderIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andProviderIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("MIDDLE_WARE_TOOL_GROUP.PROVIDER_ID not in",
                    Arrays.asList(values), "providerId");

                return this;
            } // end else
        } // end andProviderIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdBetween(long value1, long value2) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.PROVIDER_ID between", value1,
                value2, "providerId");

            return this;
        } // end andProviderIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.PROVIDER_ID between", value1,
                value2, "providerId");

            return this;
        } // end andProviderIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdNotBetween(long value1, long value2) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.PROVIDER_ID not between",
                value1, value2, "providerId");

            return this;
        } // end andProviderIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProviderIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("MIDDLE_WARE_TOOL_GROUP.PROVIDER_ID not between",
                value1, value2, "providerId");

            return this;
        } // end andProviderIdNotBetween()
    } // end Criteria
} // end MiddleWareToolGroupDAOQueryBean
