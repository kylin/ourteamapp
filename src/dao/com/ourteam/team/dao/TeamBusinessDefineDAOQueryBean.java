/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.team.dao;

import net.dao.BaseQueryBean;
import net.dao.BaseWhereCriterion;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * TeamBusinessDefine query bean 2011-09-22 10:17:54
 *
 * @author Auto Gen
 */
public class TeamBusinessDefineDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new TeamBusinessDefineDAOQueryBean object.
     */
    public TeamBusinessDefineDAOQueryBean() {
        super();
    } // end TeamBusinessDefineDAOQueryBean()

    /**
     * Creates a new TeamBusinessDefineDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public TeamBusinessDefineDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end TeamBusinessDefineDAOQueryBean()

    /**
     * Creates a new TeamBusinessDefineDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public TeamBusinessDefineDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end TeamBusinessDefineDAOQueryBean()

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
            addSelectProperty(ITeamBusinessDefineDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(ITeamBusinessDefineDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addItemIconSelectProperty() {
        addItemIconSelectProperty("itemIcon");
    } // end addItemIconSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addItemIconSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ITeamBusinessDefineDAO.ItemIcon, aAlias);
        } // end if
        else {
            addSelectProperty(ITeamBusinessDefineDAO.ItemIcon, "itemIcon");
        } // end else
    } // end addItemIconSelectProperty()

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
            addSelectProperty(ITeamBusinessDefineDAO.ItemTitle, aAlias);
        } // end if
        else {
            addSelectProperty(ITeamBusinessDefineDAO.ItemTitle, "itemTitle");
        } // end else
    } // end addItemTitleSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addItemTypeSelectProperty() {
        addItemTypeSelectProperty("itemType");
    } // end addItemTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addItemTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ITeamBusinessDefineDAO.ItemType, aAlias);
        } // end if
        else {
            addSelectProperty(ITeamBusinessDefineDAO.ItemType, "itemType");
        } // end else
    } // end addItemTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addLinkPathSelectProperty() {
        addLinkPathSelectProperty("linkPath");
    } // end addLinkPathSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addLinkPathSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ITeamBusinessDefineDAO.LinkPath, aAlias);
        } // end if
        else {
            addSelectProperty(ITeamBusinessDefineDAO.LinkPath, "linkPath");
        } // end else
    } // end addLinkPathSelectProperty()

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
            addSelectProperty(ITeamBusinessDefineDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(ITeamBusinessDefineDAO.Remarks, "remarks");
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
            addSelectProperty(ITeamBusinessDefineDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(ITeamBusinessDefineDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addTeamIdSelectProperty() {
        addTeamIdSelectProperty("teamId");
    } // end addTeamIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addTeamIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ITeamBusinessDefineDAO.TeamId, aAlias);
        } // end if
        else {
            addSelectProperty(ITeamBusinessDefineDAO.TeamId, "teamId");
        } // end else
    } // end addTeamIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addItemCodeSelectProperty() {
        addItemCodeSelectProperty("itemCode");
    } // end addItemCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addItemCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ITeamBusinessDefineDAO.ItemCode, aAlias);
        } // end if
        else {
            addSelectProperty(ITeamBusinessDefineDAO.ItemCode, "itemCode");
        } // end else
    } // end addItemCodeSelectProperty()

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
            addSelectProperty(ITeamBusinessDefineDAO.TeamName, aAlias);
        } // end if
        else {
            addSelectProperty(ITeamBusinessDefineDAO.TeamName, "teamName");
        } // end else
    } // end addTeamNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addActionGroupIdSelectProperty() {
        addActionGroupIdSelectProperty("actionGroupId");
    } // end addActionGroupIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addActionGroupIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ITeamBusinessDefineDAO.ActionGroupId, aAlias);
        } // end if
        else {
            addSelectProperty(ITeamBusinessDefineDAO.ActionGroupId,
                "actionGroupId");
        } // end else
    } // end addActionGroupIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addSubNodeBuilderSelectProperty() {
        addSubNodeBuilderSelectProperty("subNodeBuilder");
    } // end addSubNodeBuilderSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addSubNodeBuilderSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ITeamBusinessDefineDAO.SubNodeBuilder, aAlias);
        } // end if
        else {
            addSelectProperty(ITeamBusinessDefineDAO.SubNodeBuilder,
                "subNodeBuilder");
        } // end else
    } // end addSubNodeBuilderSelectProperty()

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
            addSelectProperty(ITeamBusinessDefineDAO.SortIndex, aAlias);
        } // end if
        else {
            addSelectProperty(ITeamBusinessDefineDAO.SortIndex, "sortIndex");
        } // end else
    } // end addSortIndexSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addItemIconSelectProperty();

        addItemTitleSelectProperty();

        addItemTypeSelectProperty();

        addLinkPathSelectProperty();

        addRemarksSelectProperty();

        addStatusSelectProperty();

        addTeamIdSelectProperty();

        addItemCodeSelectProperty();

        addTeamNameSelectProperty();

        addActionGroupIdSelectProperty();

        addSubNodeBuilderSelectProperty();

        addSortIndexSelectProperty();
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
            addCriterion("TEAM_BUSINESS_DEFINE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("TEAM_BUSINESS_DEFINE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "TEAM_BUSINESS_DEFINE.ID is not null AND TEAM_BUSINESS_DEFINE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(TEAM_BUSINESS_DEFINE.ID is null OR TEAM_BUSINESS_DEFINE.ID = '')");

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
            addCriterion("TEAM_BUSINESS_DEFINE.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("TEAM_BUSINESS_DEFINE.ID");
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
            addCriterion("TEAM_BUSINESS_DEFINE.ID <>", value, "id");

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
            addCriterion("TEAM_BUSINESS_DEFINE.ID is null OR TEAM_BUSINESS_DEFINE.ID <>",
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
            StringBuffer str = new StringBuffer("TEAM_BUSINESS_DEFINE.ID");
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
            addCriterion("TEAM_BUSINESS_DEFINE.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("TEAM_BUSINESS_DEFINE.ID");
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
            addCriterion("TEAM_BUSINESS_DEFINE.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("TEAM_BUSINESS_DEFINE.ID");
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
            addCriterion("TEAM_BUSINESS_DEFINE.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("TEAM_BUSINESS_DEFINE.ID");
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
            addCriterion("TEAM_BUSINESS_DEFINE.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("TEAM_BUSINESS_DEFINE.ID");
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
                addCriterion("TEAM_BUSINESS_DEFINE.ID in", values, "id");

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
                addCriterion("TEAM_BUSINESS_DEFINE.ID not in", values, "id");

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
                addCriterion("TEAM_BUSINESS_DEFINE.ID in", values, "id");

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
                addCriterion("TEAM_BUSINESS_DEFINE.ID not in", values, "id");

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
                addCriterion("TEAM_BUSINESS_DEFINE.ID in",
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
                addCriterion("TEAM_BUSINESS_DEFINE.ID not in",
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
            addCriterion("TEAM_BUSINESS_DEFINE.ID between", value1, value2, "id");

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
            addCriterion("TEAM_BUSINESS_DEFINE.ID between", value1, value2, "id");

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
            addCriterion("TEAM_BUSINESS_DEFINE.ID not between", value1, value2,
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
            addCriterion("TEAM_BUSINESS_DEFINE.ID not between", value1, value2,
                "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemIconIsNull() {
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_ICON is null");

            return this;
        } // end andItemIconIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemIconIsNotNull() {
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_ICON is not null");

            return this;
        } // end andItemIconIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemIconIsNotEmpty() {
            addCriterion(
                "TEAM_BUSINESS_DEFINE.ITEM_ICON is not null AND TEAM_BUSINESS_DEFINE.ITEM_ICON <> ''");

            return this;
        } // end andItemIconIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemIconIsEmpty() {
            addCriterion(
                "(TEAM_BUSINESS_DEFINE.ITEM_ICON is null OR TEAM_BUSINESS_DEFINE.ITEM_ICON = '')");

            return this;
        } // end andItemIconIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemIconEqualTo(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_ICON =", value, "itemIcon");

            return this;
        } // end andItemIconEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemIconEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.ITEM_ICON");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemIconEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemIconNotEqualTo(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_ICON <>", value, "itemIcon");

            return this;
        } // end andItemIconNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemIconNotEqualToOrIsNull(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_ICON is null OR TEAM_BUSINESS_DEFINE.ITEM_ICON <>",
                value, "itemIcon");

            return this;
        } // end andItemIconNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemIconNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.ITEM_ICON");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemIconNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemIconGreaterThan(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_ICON >", value, "itemIcon");

            return this;
        } // end andItemIconGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemIconGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.ITEM_ICON");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemIconGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemIconGreaterThanOrEqualTo(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_ICON >=", value, "itemIcon");

            return this;
        } // end andItemIconGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemIconGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.ITEM_ICON");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemIconGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemIconLessThan(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_ICON <", value, "itemIcon");

            return this;
        } // end andItemIconLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemIconLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.ITEM_ICON");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemIconLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemIconLessThanOrEqualTo(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_ICON <=", value, "itemIcon");

            return this;
        } // end andItemIconLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemIconLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.ITEM_ICON");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemIconLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemIconLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_ICON like",
                buffer.toString(), "itemIcon");

            return this;
        } // end andItemIconLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemIconNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_ICON not like",
                buffer.toString(), "itemIcon");

            return this;
        } // end andItemIconNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemIconIn(List values) {
            if (values.size() == 1) {
                return andItemIconEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("TEAM_BUSINESS_DEFINE.ITEM_ICON in", values,
                    "itemIcon");

                return this;
            } // end else
        } // end andItemIconIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemIconNotIn(List values) {
            if (values.size() == 1) {
                return andItemIconNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("TEAM_BUSINESS_DEFINE.ITEM_ICON not in", values,
                    "itemIcon");

                return this;
            } // end else
        } // end andItemIconNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemIconIn(Object[] values) {
            if (values.length == 1) {
                return andItemIconEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("TEAM_BUSINESS_DEFINE.ITEM_ICON in",
                    Arrays.asList(values), "itemIcon");

                return this;
            } // end else
        } // end andItemIconIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemIconNotIn(Object[] values) {
            if (values.length == 1) {
                return andItemIconNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("TEAM_BUSINESS_DEFINE.ITEM_ICON not in",
                    Arrays.asList(values), "itemIcon");

                return this;
            } // end else
        } // end andItemIconNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemIconBetween(String value1, String value2) {
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_ICON between", value1,
                value2, "itemIcon");

            return this;
        } // end andItemIconBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemIconNotBetween(String value1, String value2) {
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_ICON not between", value1,
                value2, "itemIcon");

            return this;
        } // end andItemIconNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTitleIsNull() {
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_TITLE is null");

            return this;
        } // end andItemTitleIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTitleIsNotNull() {
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_TITLE is not null");

            return this;
        } // end andItemTitleIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTitleIsNotEmpty() {
            addCriterion(
                "TEAM_BUSINESS_DEFINE.ITEM_TITLE is not null AND TEAM_BUSINESS_DEFINE.ITEM_TITLE <> ''");

            return this;
        } // end andItemTitleIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTitleIsEmpty() {
            addCriterion(
                "(TEAM_BUSINESS_DEFINE.ITEM_TITLE is null OR TEAM_BUSINESS_DEFINE.ITEM_TITLE = '')");

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
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_TITLE =", value, "itemTitle");

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
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.ITEM_TITLE");
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
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_TITLE <>", value,
                "itemTitle");

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
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_TITLE is null OR TEAM_BUSINESS_DEFINE.ITEM_TITLE <>",
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
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.ITEM_TITLE");
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
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_TITLE >", value, "itemTitle");

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
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.ITEM_TITLE");
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
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_TITLE >=", value,
                "itemTitle");

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
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.ITEM_TITLE");
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
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_TITLE <", value, "itemTitle");

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
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.ITEM_TITLE");
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
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_TITLE <=", value,
                "itemTitle");

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
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.ITEM_TITLE");
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
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_TITLE like",
                buffer.toString(), "itemTitle");

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
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_TITLE not like",
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
                addCriterion("TEAM_BUSINESS_DEFINE.ITEM_TITLE in", values,
                    "itemTitle");

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
                addCriterion("TEAM_BUSINESS_DEFINE.ITEM_TITLE not in", values,
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
                addCriterion("TEAM_BUSINESS_DEFINE.ITEM_TITLE in",
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
                addCriterion("TEAM_BUSINESS_DEFINE.ITEM_TITLE not in",
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
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_TITLE between", value1,
                value2, "itemTitle");

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
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_TITLE not between", value1,
                value2, "itemTitle");

            return this;
        } // end andItemTitleNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTypeIsNull() {
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_TYPE is null");

            return this;
        } // end andItemTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTypeIsNotNull() {
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_TYPE is not null");

            return this;
        } // end andItemTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTypeIsNotEmpty() {
            addCriterion(
                "TEAM_BUSINESS_DEFINE.ITEM_TYPE is not null AND TEAM_BUSINESS_DEFINE.ITEM_TYPE <> ''");

            return this;
        } // end andItemTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTypeIsEmpty() {
            addCriterion(
                "(TEAM_BUSINESS_DEFINE.ITEM_TYPE is null OR TEAM_BUSINESS_DEFINE.ITEM_TYPE = '')");

            return this;
        } // end andItemTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTypeEqualTo(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_TYPE =", value, "itemType");

            return this;
        } // end andItemTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTypeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.ITEM_TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTypeNotEqualTo(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_TYPE <>", value, "itemType");

            return this;
        } // end andItemTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTypeNotEqualToOrIsNull(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_TYPE is null OR TEAM_BUSINESS_DEFINE.ITEM_TYPE <>",
                value, "itemType");

            return this;
        } // end andItemTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTypeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.ITEM_TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTypeGreaterThan(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_TYPE >", value, "itemType");

            return this;
        } // end andItemTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTypeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.ITEM_TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_TYPE >=", value, "itemType");

            return this;
        } // end andItemTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.ITEM_TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTypeLessThan(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_TYPE <", value, "itemType");

            return this;
        } // end andItemTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTypeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.ITEM_TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTypeLessThanOrEqualTo(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_TYPE <=", value, "itemType");

            return this;
        } // end andItemTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.ITEM_TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_TYPE like",
                buffer.toString(), "itemType");

            return this;
        } // end andItemTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_TYPE not like",
                buffer.toString(), "itemType");

            return this;
        } // end andItemTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTypeIn(List values) {
            if (values.size() == 1) {
                return andItemTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("TEAM_BUSINESS_DEFINE.ITEM_TYPE in", values,
                    "itemType");

                return this;
            } // end else
        } // end andItemTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTypeNotIn(List values) {
            if (values.size() == 1) {
                return andItemTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("TEAM_BUSINESS_DEFINE.ITEM_TYPE not in", values,
                    "itemType");

                return this;
            } // end else
        } // end andItemTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTypeIn(Object[] values) {
            if (values.length == 1) {
                return andItemTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("TEAM_BUSINESS_DEFINE.ITEM_TYPE in",
                    Arrays.asList(values), "itemType");

                return this;
            } // end else
        } // end andItemTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andItemTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("TEAM_BUSINESS_DEFINE.ITEM_TYPE not in",
                    Arrays.asList(values), "itemType");

                return this;
            } // end else
        } // end andItemTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTypeBetween(String value1, String value2) {
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_TYPE between", value1,
                value2, "itemType");

            return this;
        } // end andItemTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemTypeNotBetween(String value1, String value2) {
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_TYPE not between", value1,
                value2, "itemType");

            return this;
        } // end andItemTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLinkPathIsNull() {
            addCriterion("TEAM_BUSINESS_DEFINE.LINK_PATH is null");

            return this;
        } // end andLinkPathIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLinkPathIsNotNull() {
            addCriterion("TEAM_BUSINESS_DEFINE.LINK_PATH is not null");

            return this;
        } // end andLinkPathIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLinkPathIsNotEmpty() {
            addCriterion(
                "TEAM_BUSINESS_DEFINE.LINK_PATH is not null AND TEAM_BUSINESS_DEFINE.LINK_PATH <> ''");

            return this;
        } // end andLinkPathIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLinkPathIsEmpty() {
            addCriterion(
                "(TEAM_BUSINESS_DEFINE.LINK_PATH is null OR TEAM_BUSINESS_DEFINE.LINK_PATH = '')");

            return this;
        } // end andLinkPathIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLinkPathEqualTo(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.LINK_PATH =", value, "linkPath");

            return this;
        } // end andLinkPathEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLinkPathEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.LINK_PATH");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLinkPathEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLinkPathNotEqualTo(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.LINK_PATH <>", value, "linkPath");

            return this;
        } // end andLinkPathNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLinkPathNotEqualToOrIsNull(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.LINK_PATH is null OR TEAM_BUSINESS_DEFINE.LINK_PATH <>",
                value, "linkPath");

            return this;
        } // end andLinkPathNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLinkPathNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.LINK_PATH");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLinkPathNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLinkPathGreaterThan(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.LINK_PATH >", value, "linkPath");

            return this;
        } // end andLinkPathGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLinkPathGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.LINK_PATH");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLinkPathGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLinkPathGreaterThanOrEqualTo(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.LINK_PATH >=", value, "linkPath");

            return this;
        } // end andLinkPathGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLinkPathGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.LINK_PATH");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLinkPathGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLinkPathLessThan(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.LINK_PATH <", value, "linkPath");

            return this;
        } // end andLinkPathLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLinkPathLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.LINK_PATH");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLinkPathLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLinkPathLessThanOrEqualTo(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.LINK_PATH <=", value, "linkPath");

            return this;
        } // end andLinkPathLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLinkPathLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.LINK_PATH");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andLinkPathLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLinkPathLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("TEAM_BUSINESS_DEFINE.LINK_PATH like",
                buffer.toString(), "linkPath");

            return this;
        } // end andLinkPathLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLinkPathNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("TEAM_BUSINESS_DEFINE.LINK_PATH not like",
                buffer.toString(), "linkPath");

            return this;
        } // end andLinkPathNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLinkPathIn(List values) {
            if (values.size() == 1) {
                return andLinkPathEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("TEAM_BUSINESS_DEFINE.LINK_PATH in", values,
                    "linkPath");

                return this;
            } // end else
        } // end andLinkPathIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLinkPathNotIn(List values) {
            if (values.size() == 1) {
                return andLinkPathNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("TEAM_BUSINESS_DEFINE.LINK_PATH not in", values,
                    "linkPath");

                return this;
            } // end else
        } // end andLinkPathNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLinkPathIn(Object[] values) {
            if (values.length == 1) {
                return andLinkPathEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("TEAM_BUSINESS_DEFINE.LINK_PATH in",
                    Arrays.asList(values), "linkPath");

                return this;
            } // end else
        } // end andLinkPathIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLinkPathNotIn(Object[] values) {
            if (values.length == 1) {
                return andLinkPathNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("TEAM_BUSINESS_DEFINE.LINK_PATH not in",
                    Arrays.asList(values), "linkPath");

                return this;
            } // end else
        } // end andLinkPathNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLinkPathBetween(String value1, String value2) {
            addCriterion("TEAM_BUSINESS_DEFINE.LINK_PATH between", value1,
                value2, "linkPath");

            return this;
        } // end andLinkPathBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andLinkPathNotBetween(String value1, String value2) {
            addCriterion("TEAM_BUSINESS_DEFINE.LINK_PATH not between", value1,
                value2, "linkPath");

            return this;
        } // end andLinkPathNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("TEAM_BUSINESS_DEFINE.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("TEAM_BUSINESS_DEFINE.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "TEAM_BUSINESS_DEFINE.REMARKS is not null AND TEAM_BUSINESS_DEFINE.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(TEAM_BUSINESS_DEFINE.REMARKS is null OR TEAM_BUSINESS_DEFINE.REMARKS = '')");

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
            addCriterion("TEAM_BUSINESS_DEFINE.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("TEAM_BUSINESS_DEFINE.REMARKS");
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
            addCriterion("TEAM_BUSINESS_DEFINE.REMARKS <>", value, "remarks");

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
            addCriterion("TEAM_BUSINESS_DEFINE.REMARKS is null OR TEAM_BUSINESS_DEFINE.REMARKS <>",
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
            StringBuffer str = new StringBuffer("TEAM_BUSINESS_DEFINE.REMARKS");
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
            addCriterion("TEAM_BUSINESS_DEFINE.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("TEAM_BUSINESS_DEFINE.REMARKS");
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
            addCriterion("TEAM_BUSINESS_DEFINE.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("TEAM_BUSINESS_DEFINE.REMARKS");
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
            addCriterion("TEAM_BUSINESS_DEFINE.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("TEAM_BUSINESS_DEFINE.REMARKS");
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
            addCriterion("TEAM_BUSINESS_DEFINE.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("TEAM_BUSINESS_DEFINE.REMARKS");
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
            addCriterion("TEAM_BUSINESS_DEFINE.REMARKS like",
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
            addCriterion("TEAM_BUSINESS_DEFINE.REMARKS not like",
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
                addCriterion("TEAM_BUSINESS_DEFINE.REMARKS in", values,
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
                addCriterion("TEAM_BUSINESS_DEFINE.REMARKS not in", values,
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
                addCriterion("TEAM_BUSINESS_DEFINE.REMARKS in",
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
                addCriterion("TEAM_BUSINESS_DEFINE.REMARKS not in",
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
            addCriterion("TEAM_BUSINESS_DEFINE.REMARKS between", value1,
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
            addCriterion("TEAM_BUSINESS_DEFINE.REMARKS not between", value1,
                value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("TEAM_BUSINESS_DEFINE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("TEAM_BUSINESS_DEFINE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "TEAM_BUSINESS_DEFINE.STATUS is not null AND TEAM_BUSINESS_DEFINE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(TEAM_BUSINESS_DEFINE.STATUS is null OR TEAM_BUSINESS_DEFINE.STATUS = '')");

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
            addCriterion("TEAM_BUSINESS_DEFINE.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("TEAM_BUSINESS_DEFINE.STATUS");
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
            addCriterion("TEAM_BUSINESS_DEFINE.STATUS <>", value, "status");

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
            addCriterion("TEAM_BUSINESS_DEFINE.STATUS is null OR TEAM_BUSINESS_DEFINE.STATUS <>",
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
            StringBuffer str = new StringBuffer("TEAM_BUSINESS_DEFINE.STATUS");
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
            addCriterion("TEAM_BUSINESS_DEFINE.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("TEAM_BUSINESS_DEFINE.STATUS");
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
            addCriterion("TEAM_BUSINESS_DEFINE.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("TEAM_BUSINESS_DEFINE.STATUS");
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
            addCriterion("TEAM_BUSINESS_DEFINE.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("TEAM_BUSINESS_DEFINE.STATUS");
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
            addCriterion("TEAM_BUSINESS_DEFINE.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("TEAM_BUSINESS_DEFINE.STATUS");
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
            addCriterion("TEAM_BUSINESS_DEFINE.STATUS like", buffer.toString(),
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
            addCriterion("TEAM_BUSINESS_DEFINE.STATUS not like",
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
                addCriterion("TEAM_BUSINESS_DEFINE.STATUS in", values, "status");

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
                addCriterion("TEAM_BUSINESS_DEFINE.STATUS not in", values,
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
                addCriterion("TEAM_BUSINESS_DEFINE.STATUS in",
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
                addCriterion("TEAM_BUSINESS_DEFINE.STATUS not in",
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
            addCriterion("TEAM_BUSINESS_DEFINE.STATUS between", value1, value2,
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
            addCriterion("TEAM_BUSINESS_DEFINE.STATUS not between", value1,
                value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdIsNull() {
            addCriterion("TEAM_BUSINESS_DEFINE.TEAM_ID is null");

            return this;
        } // end andTeamIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdIsNotNull() {
            addCriterion("TEAM_BUSINESS_DEFINE.TEAM_ID is not null");

            return this;
        } // end andTeamIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdIsNotEmpty() {
            addCriterion(
                "TEAM_BUSINESS_DEFINE.TEAM_ID is not null AND TEAM_BUSINESS_DEFINE.TEAM_ID <> ''");

            return this;
        } // end andTeamIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdIsEmpty() {
            addCriterion(
                "(TEAM_BUSINESS_DEFINE.TEAM_ID is null OR TEAM_BUSINESS_DEFINE.TEAM_ID = '')");

            return this;
        } // end andTeamIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdEqualTo(long value) {
            return andTeamIdEqualTo(Long.valueOf(value));
        } // end andTeamIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdEqualTo(java.lang.Long value) {
            addCriterion("TEAM_BUSINESS_DEFINE.TEAM_ID =", value, "teamId");

            return this;
        } // end andTeamIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("TEAM_BUSINESS_DEFINE.TEAM_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdNotEqualTo(long value) {
            return andTeamIdNotEqualTo(Long.valueOf(value));
        } // end andTeamIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdNotEqualTo(java.lang.Long value) {
            addCriterion("TEAM_BUSINESS_DEFINE.TEAM_ID <>", value, "teamId");

            return this;
        } // end andTeamIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdNotEqualToOrIsNull(long value) {
            return andTeamIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andTeamIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("TEAM_BUSINESS_DEFINE.TEAM_ID is null OR TEAM_BUSINESS_DEFINE.TEAM_ID <>",
                value, "teamId");

            return this;
        } // end andTeamIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("TEAM_BUSINESS_DEFINE.TEAM_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdGreaterThan(long value) {
            return andTeamIdGreaterThan(Long.valueOf(value));
        } // end andTeamIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdGreaterThan(java.lang.Long value) {
            addCriterion("TEAM_BUSINESS_DEFINE.TEAM_ID >", value, "teamId");

            return this;
        } // end andTeamIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("TEAM_BUSINESS_DEFINE.TEAM_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdGreaterThanOrEqualTo(long value) {
            return andTeamIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andTeamIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("TEAM_BUSINESS_DEFINE.TEAM_ID >=", value, "teamId");

            return this;
        } // end andTeamIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("TEAM_BUSINESS_DEFINE.TEAM_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdLessThan(long value) {
            return andTeamIdLessThan(Long.valueOf(value));
        } // end andTeamIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdLessThan(java.lang.Long value) {
            addCriterion("TEAM_BUSINESS_DEFINE.TEAM_ID <", value, "teamId");

            return this;
        } // end andTeamIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("TEAM_BUSINESS_DEFINE.TEAM_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdLessThanOrEqualTo(long value) {
            return andTeamIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andTeamIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("TEAM_BUSINESS_DEFINE.TEAM_ID <=", value, "teamId");

            return this;
        } // end andTeamIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("TEAM_BUSINESS_DEFINE.TEAM_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdIn(long[] values) {
            if (values.length == 1) {
                return andTeamIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("TEAM_BUSINESS_DEFINE.TEAM_ID in", values, "teamId");

                return this;
            } // end else
        } // end andTeamIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdNotIn(long[] values) {
            if (values.length == 1) {
                return andTeamIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("TEAM_BUSINESS_DEFINE.TEAM_ID not in", values,
                    "teamId");

                return this;
            } // end else
        } // end andTeamIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdIn(List values) {
            if (values.size() == 1) {
                return andTeamIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("TEAM_BUSINESS_DEFINE.TEAM_ID in", values, "teamId");

                return this;
            } // end else
        } // end andTeamIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdNotIn(List values) {
            if (values.size() == 1) {
                return andTeamIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("TEAM_BUSINESS_DEFINE.TEAM_ID not in", values,
                    "teamId");

                return this;
            } // end else
        } // end andTeamIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdIn(Object[] values) {
            if (values.length == 1) {
                return andTeamIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("TEAM_BUSINESS_DEFINE.TEAM_ID in",
                    Arrays.asList(values), "teamId");

                return this;
            } // end else
        } // end andTeamIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andTeamIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("TEAM_BUSINESS_DEFINE.TEAM_ID not in",
                    Arrays.asList(values), "teamId");

                return this;
            } // end else
        } // end andTeamIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdBetween(long value1, long value2) {
            addCriterion("TEAM_BUSINESS_DEFINE.TEAM_ID between", value1,
                value2, "teamId");

            return this;
        } // end andTeamIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("TEAM_BUSINESS_DEFINE.TEAM_ID between", value1,
                value2, "teamId");

            return this;
        } // end andTeamIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdNotBetween(long value1, long value2) {
            addCriterion("TEAM_BUSINESS_DEFINE.TEAM_ID not between", value1,
                value2, "teamId");

            return this;
        } // end andTeamIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("TEAM_BUSINESS_DEFINE.TEAM_ID not between", value1,
                value2, "teamId");

            return this;
        } // end andTeamIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemCodeIsNull() {
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_CODE is null");

            return this;
        } // end andItemCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemCodeIsNotNull() {
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_CODE is not null");

            return this;
        } // end andItemCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemCodeIsNotEmpty() {
            addCriterion(
                "TEAM_BUSINESS_DEFINE.ITEM_CODE is not null AND TEAM_BUSINESS_DEFINE.ITEM_CODE <> ''");

            return this;
        } // end andItemCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemCodeIsEmpty() {
            addCriterion(
                "(TEAM_BUSINESS_DEFINE.ITEM_CODE is null OR TEAM_BUSINESS_DEFINE.ITEM_CODE = '')");

            return this;
        } // end andItemCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemCodeEqualTo(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_CODE =", value, "itemCode");

            return this;
        } // end andItemCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemCodeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.ITEM_CODE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemCodeNotEqualTo(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_CODE <>", value, "itemCode");

            return this;
        } // end andItemCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemCodeNotEqualToOrIsNull(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_CODE is null OR TEAM_BUSINESS_DEFINE.ITEM_CODE <>",
                value, "itemCode");

            return this;
        } // end andItemCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemCodeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.ITEM_CODE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemCodeGreaterThan(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_CODE >", value, "itemCode");

            return this;
        } // end andItemCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemCodeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.ITEM_CODE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_CODE >=", value, "itemCode");

            return this;
        } // end andItemCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.ITEM_CODE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemCodeLessThan(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_CODE <", value, "itemCode");

            return this;
        } // end andItemCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemCodeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.ITEM_CODE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemCodeLessThanOrEqualTo(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_CODE <=", value, "itemCode");

            return this;
        } // end andItemCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemCodeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.ITEM_CODE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andItemCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_CODE like",
                buffer.toString(), "itemCode");

            return this;
        } // end andItemCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_CODE not like",
                buffer.toString(), "itemCode");

            return this;
        } // end andItemCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemCodeIn(List values) {
            if (values.size() == 1) {
                return andItemCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("TEAM_BUSINESS_DEFINE.ITEM_CODE in", values,
                    "itemCode");

                return this;
            } // end else
        } // end andItemCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemCodeNotIn(List values) {
            if (values.size() == 1) {
                return andItemCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("TEAM_BUSINESS_DEFINE.ITEM_CODE not in", values,
                    "itemCode");

                return this;
            } // end else
        } // end andItemCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemCodeIn(Object[] values) {
            if (values.length == 1) {
                return andItemCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("TEAM_BUSINESS_DEFINE.ITEM_CODE in",
                    Arrays.asList(values), "itemCode");

                return this;
            } // end else
        } // end andItemCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andItemCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("TEAM_BUSINESS_DEFINE.ITEM_CODE not in",
                    Arrays.asList(values), "itemCode");

                return this;
            } // end else
        } // end andItemCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemCodeBetween(String value1, String value2) {
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_CODE between", value1,
                value2, "itemCode");

            return this;
        } // end andItemCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andItemCodeNotBetween(String value1, String value2) {
            addCriterion("TEAM_BUSINESS_DEFINE.ITEM_CODE not between", value1,
                value2, "itemCode");

            return this;
        } // end andItemCodeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameIsNull() {
            addCriterion("teamDefineD.TEAM_NAME is null");

            return this;
        } // end andTeamNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameIsNotNull() {
            addCriterion("teamDefineD.TEAM_NAME is not null");

            return this;
        } // end andTeamNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameIsNotEmpty() {
            addCriterion(
                "teamDefineD.TEAM_NAME is not null AND teamDefineD.TEAM_NAME <> ''");

            return this;
        } // end andTeamNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameIsEmpty() {
            addCriterion(
                "(teamDefineD.TEAM_NAME is null OR teamDefineD.TEAM_NAME = '')");

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
            addCriterion("teamDefineD.TEAM_NAME =", value, "teamName");

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
            StringBuffer str = new StringBuffer("teamDefineD.TEAM_NAME");
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
            addCriterion("teamDefineD.TEAM_NAME <>", value, "teamName");

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
            addCriterion("teamDefineD.TEAM_NAME is null OR teamDefineD.TEAM_NAME <>",
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
            StringBuffer str = new StringBuffer("teamDefineD.TEAM_NAME");
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
            addCriterion("teamDefineD.TEAM_NAME >", value, "teamName");

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
            StringBuffer str = new StringBuffer("teamDefineD.TEAM_NAME");
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
            addCriterion("teamDefineD.TEAM_NAME >=", value, "teamName");

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
            StringBuffer str = new StringBuffer("teamDefineD.TEAM_NAME");
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
            addCriterion("teamDefineD.TEAM_NAME <", value, "teamName");

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
            StringBuffer str = new StringBuffer("teamDefineD.TEAM_NAME");
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
            addCriterion("teamDefineD.TEAM_NAME <=", value, "teamName");

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
            StringBuffer str = new StringBuffer("teamDefineD.TEAM_NAME");
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
            addCriterion("teamDefineD.TEAM_NAME like", buffer.toString(),
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
            addCriterion("teamDefineD.TEAM_NAME not like", buffer.toString(),
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
                addCriterion("teamDefineD.TEAM_NAME in", values, "teamName");

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
                addCriterion("teamDefineD.TEAM_NAME not in", values, "teamName");

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
                addCriterion("teamDefineD.TEAM_NAME in", Arrays.asList(values),
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
                addCriterion("teamDefineD.TEAM_NAME not in",
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
            addCriterion("teamDefineD.TEAM_NAME between", value1, value2,
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
            addCriterion("teamDefineD.TEAM_NAME not between", value1, value2,
                "teamName");

            return this;
        } // end andTeamNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionGroupIdIsNull() {
            addCriterion("TEAM_BUSINESS_DEFINE.ACTION_GROUP_ID is null");

            return this;
        } // end andActionGroupIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionGroupIdIsNotNull() {
            addCriterion("TEAM_BUSINESS_DEFINE.ACTION_GROUP_ID is not null");

            return this;
        } // end andActionGroupIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionGroupIdIsNotEmpty() {
            addCriterion(
                "TEAM_BUSINESS_DEFINE.ACTION_GROUP_ID is not null AND TEAM_BUSINESS_DEFINE.ACTION_GROUP_ID <> ''");

            return this;
        } // end andActionGroupIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionGroupIdIsEmpty() {
            addCriterion(
                "(TEAM_BUSINESS_DEFINE.ACTION_GROUP_ID is null OR TEAM_BUSINESS_DEFINE.ACTION_GROUP_ID = '')");

            return this;
        } // end andActionGroupIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionGroupIdEqualTo(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.ACTION_GROUP_ID =", value,
                "actionGroupId");

            return this;
        } // end andActionGroupIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionGroupIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.ACTION_GROUP_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andActionGroupIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionGroupIdNotEqualTo(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.ACTION_GROUP_ID <>", value,
                "actionGroupId");

            return this;
        } // end andActionGroupIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionGroupIdNotEqualToOrIsNull(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.ACTION_GROUP_ID is null OR TEAM_BUSINESS_DEFINE.ACTION_GROUP_ID <>",
                value, "actionGroupId");

            return this;
        } // end andActionGroupIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionGroupIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.ACTION_GROUP_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andActionGroupIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionGroupIdGreaterThan(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.ACTION_GROUP_ID >", value,
                "actionGroupId");

            return this;
        } // end andActionGroupIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionGroupIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.ACTION_GROUP_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andActionGroupIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.ACTION_GROUP_ID >=", value,
                "actionGroupId");

            return this;
        } // end andActionGroupIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionGroupIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.ACTION_GROUP_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andActionGroupIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionGroupIdLessThan(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.ACTION_GROUP_ID <", value,
                "actionGroupId");

            return this;
        } // end andActionGroupIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionGroupIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.ACTION_GROUP_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andActionGroupIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionGroupIdLessThanOrEqualTo(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.ACTION_GROUP_ID <=", value,
                "actionGroupId");

            return this;
        } // end andActionGroupIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionGroupIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.ACTION_GROUP_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andActionGroupIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionGroupIdLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("TEAM_BUSINESS_DEFINE.ACTION_GROUP_ID like",
                buffer.toString(), "actionGroupId");

            return this;
        } // end andActionGroupIdLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionGroupIdNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("TEAM_BUSINESS_DEFINE.ACTION_GROUP_ID not like",
                buffer.toString(), "actionGroupId");

            return this;
        } // end andActionGroupIdNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionGroupIdIn(List values) {
            if (values.size() == 1) {
                return andActionGroupIdEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("TEAM_BUSINESS_DEFINE.ACTION_GROUP_ID in", values,
                    "actionGroupId");

                return this;
            } // end else
        } // end andActionGroupIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionGroupIdNotIn(List values) {
            if (values.size() == 1) {
                return andActionGroupIdNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("TEAM_BUSINESS_DEFINE.ACTION_GROUP_ID not in",
                    values, "actionGroupId");

                return this;
            } // end else
        } // end andActionGroupIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionGroupIdIn(Object[] values) {
            if (values.length == 1) {
                return andActionGroupIdEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("TEAM_BUSINESS_DEFINE.ACTION_GROUP_ID in",
                    Arrays.asList(values), "actionGroupId");

                return this;
            } // end else
        } // end andActionGroupIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionGroupIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andActionGroupIdNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("TEAM_BUSINESS_DEFINE.ACTION_GROUP_ID not in",
                    Arrays.asList(values), "actionGroupId");

                return this;
            } // end else
        } // end andActionGroupIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionGroupIdBetween(String value1, String value2) {
            addCriterion("TEAM_BUSINESS_DEFINE.ACTION_GROUP_ID between",
                value1, value2, "actionGroupId");

            return this;
        } // end andActionGroupIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionGroupIdNotBetween(String value1, String value2) {
            addCriterion("TEAM_BUSINESS_DEFINE.ACTION_GROUP_ID not between",
                value1, value2, "actionGroupId");

            return this;
        } // end andActionGroupIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSubNodeBuilderIsNull() {
            addCriterion("TEAM_BUSINESS_DEFINE.SUB_NODE_BUILDER is null");

            return this;
        } // end andSubNodeBuilderIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSubNodeBuilderIsNotNull() {
            addCriterion("TEAM_BUSINESS_DEFINE.SUB_NODE_BUILDER is not null");

            return this;
        } // end andSubNodeBuilderIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSubNodeBuilderIsNotEmpty() {
            addCriterion(
                "TEAM_BUSINESS_DEFINE.SUB_NODE_BUILDER is not null AND TEAM_BUSINESS_DEFINE.SUB_NODE_BUILDER <> ''");

            return this;
        } // end andSubNodeBuilderIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSubNodeBuilderIsEmpty() {
            addCriterion(
                "(TEAM_BUSINESS_DEFINE.SUB_NODE_BUILDER is null OR TEAM_BUSINESS_DEFINE.SUB_NODE_BUILDER = '')");

            return this;
        } // end andSubNodeBuilderIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSubNodeBuilderEqualTo(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.SUB_NODE_BUILDER =", value,
                "subNodeBuilder");

            return this;
        } // end andSubNodeBuilderEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSubNodeBuilderEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.SUB_NODE_BUILDER");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSubNodeBuilderEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSubNodeBuilderNotEqualTo(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.SUB_NODE_BUILDER <>", value,
                "subNodeBuilder");

            return this;
        } // end andSubNodeBuilderNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSubNodeBuilderNotEqualToOrIsNull(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.SUB_NODE_BUILDER is null OR TEAM_BUSINESS_DEFINE.SUB_NODE_BUILDER <>",
                value, "subNodeBuilder");

            return this;
        } // end andSubNodeBuilderNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSubNodeBuilderNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.SUB_NODE_BUILDER");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSubNodeBuilderNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSubNodeBuilderGreaterThan(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.SUB_NODE_BUILDER >", value,
                "subNodeBuilder");

            return this;
        } // end andSubNodeBuilderGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSubNodeBuilderGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.SUB_NODE_BUILDER");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSubNodeBuilderGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSubNodeBuilderGreaterThanOrEqualTo(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.SUB_NODE_BUILDER >=", value,
                "subNodeBuilder");

            return this;
        } // end andSubNodeBuilderGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSubNodeBuilderGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.SUB_NODE_BUILDER");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSubNodeBuilderGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSubNodeBuilderLessThan(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.SUB_NODE_BUILDER <", value,
                "subNodeBuilder");

            return this;
        } // end andSubNodeBuilderLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSubNodeBuilderLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.SUB_NODE_BUILDER");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSubNodeBuilderLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSubNodeBuilderLessThanOrEqualTo(String value) {
            addCriterion("TEAM_BUSINESS_DEFINE.SUB_NODE_BUILDER <=", value,
                "subNodeBuilder");

            return this;
        } // end andSubNodeBuilderLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSubNodeBuilderLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "TEAM_BUSINESS_DEFINE.SUB_NODE_BUILDER");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSubNodeBuilderLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSubNodeBuilderLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("TEAM_BUSINESS_DEFINE.SUB_NODE_BUILDER like",
                buffer.toString(), "subNodeBuilder");

            return this;
        } // end andSubNodeBuilderLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSubNodeBuilderNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("TEAM_BUSINESS_DEFINE.SUB_NODE_BUILDER not like",
                buffer.toString(), "subNodeBuilder");

            return this;
        } // end andSubNodeBuilderNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSubNodeBuilderIn(List values) {
            if (values.size() == 1) {
                return andSubNodeBuilderEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("TEAM_BUSINESS_DEFINE.SUB_NODE_BUILDER in",
                    values, "subNodeBuilder");

                return this;
            } // end else
        } // end andSubNodeBuilderIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSubNodeBuilderNotIn(List values) {
            if (values.size() == 1) {
                return andSubNodeBuilderNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("TEAM_BUSINESS_DEFINE.SUB_NODE_BUILDER not in",
                    values, "subNodeBuilder");

                return this;
            } // end else
        } // end andSubNodeBuilderNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSubNodeBuilderIn(Object[] values) {
            if (values.length == 1) {
                return andSubNodeBuilderEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("TEAM_BUSINESS_DEFINE.SUB_NODE_BUILDER in",
                    Arrays.asList(values), "subNodeBuilder");

                return this;
            } // end else
        } // end andSubNodeBuilderIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSubNodeBuilderNotIn(Object[] values) {
            if (values.length == 1) {
                return andSubNodeBuilderNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("TEAM_BUSINESS_DEFINE.SUB_NODE_BUILDER not in",
                    Arrays.asList(values), "subNodeBuilder");

                return this;
            } // end else
        } // end andSubNodeBuilderNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSubNodeBuilderBetween(String value1, String value2) {
            addCriterion("TEAM_BUSINESS_DEFINE.SUB_NODE_BUILDER between",
                value1, value2, "subNodeBuilder");

            return this;
        } // end andSubNodeBuilderBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSubNodeBuilderNotBetween(String value1, String value2) {
            addCriterion("TEAM_BUSINESS_DEFINE.SUB_NODE_BUILDER not between",
                value1, value2, "subNodeBuilder");

            return this;
        } // end andSubNodeBuilderNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIsNull() {
            addCriterion("TEAM_BUSINESS_DEFINE.SORT_INDEX is null");

            return this;
        } // end andSortIndexIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIsNotNull() {
            addCriterion("TEAM_BUSINESS_DEFINE.SORT_INDEX is not null");

            return this;
        } // end andSortIndexIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIsNotEmpty() {
            addCriterion(
                "TEAM_BUSINESS_DEFINE.SORT_INDEX is not null AND TEAM_BUSINESS_DEFINE.SORT_INDEX <> ''");

            return this;
        } // end andSortIndexIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSortIndexIsEmpty() {
            addCriterion(
                "(TEAM_BUSINESS_DEFINE.SORT_INDEX is null OR TEAM_BUSINESS_DEFINE.SORT_INDEX = '')");

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
            addCriterion("TEAM_BUSINESS_DEFINE.SORT_INDEX =", value, "sortIndex");

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
                    "TEAM_BUSINESS_DEFINE.SORT_INDEX");
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
            addCriterion("TEAM_BUSINESS_DEFINE.SORT_INDEX <>", value,
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
            addCriterion("TEAM_BUSINESS_DEFINE.SORT_INDEX is null OR TEAM_BUSINESS_DEFINE.SORT_INDEX <>",
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
                    "TEAM_BUSINESS_DEFINE.SORT_INDEX");
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
            addCriterion("TEAM_BUSINESS_DEFINE.SORT_INDEX >", value, "sortIndex");

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
                    "TEAM_BUSINESS_DEFINE.SORT_INDEX");
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
            addCriterion("TEAM_BUSINESS_DEFINE.SORT_INDEX >=", value,
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
                    "TEAM_BUSINESS_DEFINE.SORT_INDEX");
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
            addCriterion("TEAM_BUSINESS_DEFINE.SORT_INDEX <", value, "sortIndex");

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
                    "TEAM_BUSINESS_DEFINE.SORT_INDEX");
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
            addCriterion("TEAM_BUSINESS_DEFINE.SORT_INDEX <=", value,
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
                    "TEAM_BUSINESS_DEFINE.SORT_INDEX");
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
                addCriterion("TEAM_BUSINESS_DEFINE.SORT_INDEX in", values,
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
                addCriterion("TEAM_BUSINESS_DEFINE.SORT_INDEX not in", values,
                    "sortIndex");

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
                addCriterion("TEAM_BUSINESS_DEFINE.SORT_INDEX in", values,
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
                addCriterion("TEAM_BUSINESS_DEFINE.SORT_INDEX not in", values,
                    "sortIndex");

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
                addCriterion("TEAM_BUSINESS_DEFINE.SORT_INDEX in",
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
                addCriterion("TEAM_BUSINESS_DEFINE.SORT_INDEX not in",
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
            addCriterion("TEAM_BUSINESS_DEFINE.SORT_INDEX between", value1,
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
            addCriterion("TEAM_BUSINESS_DEFINE.SORT_INDEX between", value1,
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
            addCriterion("TEAM_BUSINESS_DEFINE.SORT_INDEX not between", value1,
                value2, "sortIndex");

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
            addCriterion("TEAM_BUSINESS_DEFINE.SORT_INDEX not between", value1,
                value2, "sortIndex");

            return this;
        } // end andSortIndexNotBetween()
    } // end Criteria
} // end TeamBusinessDefineDAOQueryBean
