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
 * TeamMember query bean 2011-11-02 14:32:43
 *
 * @author Auto Gen
 */
public class TeamMemberDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new TeamMemberDAOQueryBean object.
     */
    public TeamMemberDAOQueryBean() {
        super();
    } // end TeamMemberDAOQueryBean()

    /**
     * Creates a new TeamMemberDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public TeamMemberDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end TeamMemberDAOQueryBean()

    /**
     * Creates a new TeamMemberDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public TeamMemberDAOQueryBean(BaseQueryBean aQueryBean, Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end TeamMemberDAOQueryBean()

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
            addSelectProperty(ITeamMemberDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(ITeamMemberDAO.Id, "id");
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
            addSelectProperty(ITeamMemberDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(ITeamMemberDAO.Remarks, "remarks");
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
            addSelectProperty(ITeamMemberDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(ITeamMemberDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addEmployeeIdSelectProperty() {
        addEmployeeIdSelectProperty("employeeId");
    } // end addEmployeeIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addEmployeeIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ITeamMemberDAO.EmployeeId, aAlias);
        } // end if
        else {
            addSelectProperty(ITeamMemberDAO.EmployeeId, "employeeId");
        } // end else
    } // end addEmployeeIdSelectProperty()

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
            addSelectProperty(ITeamMemberDAO.TeamId, aAlias);
        } // end if
        else {
            addSelectProperty(ITeamMemberDAO.TeamId, "teamId");
        } // end else
    } // end addTeamIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addTeamRoleIdSelectProperty() {
        addTeamRoleIdSelectProperty("teamRoleId");
    } // end addTeamRoleIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addTeamRoleIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ITeamMemberDAO.TeamRoleId, aAlias);
        } // end if
        else {
            addSelectProperty(ITeamMemberDAO.TeamRoleId, "teamRoleId");
        } // end else
    } // end addTeamRoleIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addTeamRoleCodeSelectProperty() {
        addTeamRoleCodeSelectProperty("teamRoleCode");
    } // end addTeamRoleCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addTeamRoleCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ITeamMemberDAO.TeamRoleCode, aAlias);
        } // end if
        else {
            addSelectProperty(ITeamMemberDAO.TeamRoleCode, "teamRoleCode");
        } // end else
    } // end addTeamRoleCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addTeamRoleNameSelectProperty() {
        addTeamRoleNameSelectProperty("teamRoleName");
    } // end addTeamRoleNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addTeamRoleNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ITeamMemberDAO.TeamRoleName, aAlias);
        } // end if
        else {
            addSelectProperty(ITeamMemberDAO.TeamRoleName, "teamRoleName");
        } // end else
    } // end addTeamRoleNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addTeamCodeSelectProperty() {
        addTeamCodeSelectProperty("teamCode");
    } // end addTeamCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addTeamCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ITeamMemberDAO.TeamCode, aAlias);
        } // end if
        else {
            addSelectProperty(ITeamMemberDAO.TeamCode, "teamCode");
        } // end else
    } // end addTeamCodeSelectProperty()

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
            addSelectProperty(ITeamMemberDAO.TeamName, aAlias);
        } // end if
        else {
            addSelectProperty(ITeamMemberDAO.TeamName, "teamName");
        } // end else
    } // end addTeamNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addEmployeeNameSelectProperty() {
        addEmployeeNameSelectProperty("employeeName");
    } // end addEmployeeNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addEmployeeNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ITeamMemberDAO.EmployeeName, aAlias);
        } // end if
        else {
            addSelectProperty(ITeamMemberDAO.EmployeeName, "employeeName");
        } // end else
    } // end addEmployeeNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addEmployeeCodeSelectProperty() {
        addEmployeeCodeSelectProperty("employeeCode");
    } // end addEmployeeCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addEmployeeCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ITeamMemberDAO.EmployeeCode, aAlias);
        } // end if
        else {
            addSelectProperty(ITeamMemberDAO.EmployeeCode, "employeeCode");
        } // end else
    } // end addEmployeeCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addRemarksSelectProperty();

        addStatusSelectProperty();

        addEmployeeIdSelectProperty();

        addTeamIdSelectProperty();

        addTeamRoleIdSelectProperty();

        addTeamRoleCodeSelectProperty();

        addTeamRoleNameSelectProperty();

        addTeamCodeSelectProperty();

        addTeamNameSelectProperty();

        addEmployeeNameSelectProperty();

        addEmployeeCodeSelectProperty();
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
            addCriterion("TEAM_MEMBER.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("TEAM_MEMBER.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion("TEAM_MEMBER.ID is not null AND TEAM_MEMBER.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion("(TEAM_MEMBER.ID is null OR TEAM_MEMBER.ID = '')");

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
            addCriterion("TEAM_MEMBER.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("TEAM_MEMBER.ID");
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
            addCriterion("TEAM_MEMBER.ID <>", value, "id");

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
            addCriterion("TEAM_MEMBER.ID is null OR TEAM_MEMBER.ID <>", value,
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
            StringBuffer str = new StringBuffer("TEAM_MEMBER.ID");
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
            addCriterion("TEAM_MEMBER.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("TEAM_MEMBER.ID");
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
            addCriterion("TEAM_MEMBER.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("TEAM_MEMBER.ID");
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
            addCriterion("TEAM_MEMBER.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("TEAM_MEMBER.ID");
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
            addCriterion("TEAM_MEMBER.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("TEAM_MEMBER.ID");
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
                addCriterion("TEAM_MEMBER.ID in", values, "id");

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
                addCriterion("TEAM_MEMBER.ID not in", values, "id");

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
                addCriterion("TEAM_MEMBER.ID in", values, "id");

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
                addCriterion("TEAM_MEMBER.ID not in", values, "id");

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
                addCriterion("TEAM_MEMBER.ID in", Arrays.asList(values), "id");

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
                addCriterion("TEAM_MEMBER.ID not in", Arrays.asList(values),
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
            addCriterion("TEAM_MEMBER.ID between", value1, value2, "id");

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
            addCriterion("TEAM_MEMBER.ID between", value1, value2, "id");

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
            addCriterion("TEAM_MEMBER.ID not between", value1, value2, "id");

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
            addCriterion("TEAM_MEMBER.ID not between", value1, value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("TEAM_MEMBER.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("TEAM_MEMBER.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "TEAM_MEMBER.REMARKS is not null AND TEAM_MEMBER.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(TEAM_MEMBER.REMARKS is null OR TEAM_MEMBER.REMARKS = '')");

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
            addCriterion("TEAM_MEMBER.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("TEAM_MEMBER.REMARKS");
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
            addCriterion("TEAM_MEMBER.REMARKS <>", value, "remarks");

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
            addCriterion("TEAM_MEMBER.REMARKS is null OR TEAM_MEMBER.REMARKS <>",
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
            StringBuffer str = new StringBuffer("TEAM_MEMBER.REMARKS");
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
            addCriterion("TEAM_MEMBER.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("TEAM_MEMBER.REMARKS");
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
            addCriterion("TEAM_MEMBER.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("TEAM_MEMBER.REMARKS");
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
            addCriterion("TEAM_MEMBER.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("TEAM_MEMBER.REMARKS");
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
            addCriterion("TEAM_MEMBER.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("TEAM_MEMBER.REMARKS");
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
            addCriterion("TEAM_MEMBER.REMARKS like", buffer.toString(),
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
            addCriterion("TEAM_MEMBER.REMARKS not like", buffer.toString(),
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
                addCriterion("TEAM_MEMBER.REMARKS in", values, "remarks");

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
                addCriterion("TEAM_MEMBER.REMARKS not in", values, "remarks");

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
                addCriterion("TEAM_MEMBER.REMARKS in", Arrays.asList(values),
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
                addCriterion("TEAM_MEMBER.REMARKS not in",
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
            addCriterion("TEAM_MEMBER.REMARKS between", value1, value2,
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
            addCriterion("TEAM_MEMBER.REMARKS not between", value1, value2,
                "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("TEAM_MEMBER.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("TEAM_MEMBER.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "TEAM_MEMBER.STATUS is not null AND TEAM_MEMBER.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(TEAM_MEMBER.STATUS is null OR TEAM_MEMBER.STATUS = '')");

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
            addCriterion("TEAM_MEMBER.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("TEAM_MEMBER.STATUS");
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
            addCriterion("TEAM_MEMBER.STATUS <>", value, "status");

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
            addCriterion("TEAM_MEMBER.STATUS is null OR TEAM_MEMBER.STATUS <>",
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
            StringBuffer str = new StringBuffer("TEAM_MEMBER.STATUS");
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
            addCriterion("TEAM_MEMBER.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("TEAM_MEMBER.STATUS");
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
            addCriterion("TEAM_MEMBER.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("TEAM_MEMBER.STATUS");
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
            addCriterion("TEAM_MEMBER.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("TEAM_MEMBER.STATUS");
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
            addCriterion("TEAM_MEMBER.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("TEAM_MEMBER.STATUS");
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
            addCriterion("TEAM_MEMBER.STATUS like", buffer.toString(), "status");

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
            addCriterion("TEAM_MEMBER.STATUS not like", buffer.toString(),
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
                addCriterion("TEAM_MEMBER.STATUS in", values, "status");

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
                addCriterion("TEAM_MEMBER.STATUS not in", values, "status");

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
                addCriterion("TEAM_MEMBER.STATUS in", Arrays.asList(values),
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
                addCriterion("TEAM_MEMBER.STATUS not in",
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
            addCriterion("TEAM_MEMBER.STATUS between", value1, value2, "status");

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
            addCriterion("TEAM_MEMBER.STATUS not between", value1, value2,
                "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdIsNull() {
            addCriterion("TEAM_MEMBER.EMPLOYEE_ID is null");

            return this;
        } // end andEmployeeIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("TEAM_MEMBER.EMPLOYEE_ID is not null");

            return this;
        } // end andEmployeeIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdIsNotEmpty() {
            addCriterion(
                "TEAM_MEMBER.EMPLOYEE_ID is not null AND TEAM_MEMBER.EMPLOYEE_ID <> ''");

            return this;
        } // end andEmployeeIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdIsEmpty() {
            addCriterion(
                "(TEAM_MEMBER.EMPLOYEE_ID is null OR TEAM_MEMBER.EMPLOYEE_ID = '')");

            return this;
        } // end andEmployeeIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdEqualTo(long value) {
            return andEmployeeIdEqualTo(Long.valueOf(value));
        } // end andEmployeeIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdEqualTo(java.lang.Long value) {
            addCriterion("TEAM_MEMBER.EMPLOYEE_ID =", value, "employeeId");

            return this;
        } // end andEmployeeIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("TEAM_MEMBER.EMPLOYEE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEmployeeIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdNotEqualTo(long value) {
            return andEmployeeIdNotEqualTo(Long.valueOf(value));
        } // end andEmployeeIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdNotEqualTo(java.lang.Long value) {
            addCriterion("TEAM_MEMBER.EMPLOYEE_ID <>", value, "employeeId");

            return this;
        } // end andEmployeeIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdNotEqualToOrIsNull(long value) {
            return andEmployeeIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andEmployeeIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("TEAM_MEMBER.EMPLOYEE_ID is null OR TEAM_MEMBER.EMPLOYEE_ID <>",
                value, "employeeId");

            return this;
        } // end andEmployeeIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("TEAM_MEMBER.EMPLOYEE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEmployeeIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdGreaterThan(long value) {
            return andEmployeeIdGreaterThan(Long.valueOf(value));
        } // end andEmployeeIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdGreaterThan(java.lang.Long value) {
            addCriterion("TEAM_MEMBER.EMPLOYEE_ID >", value, "employeeId");

            return this;
        } // end andEmployeeIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("TEAM_MEMBER.EMPLOYEE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEmployeeIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdGreaterThanOrEqualTo(long value) {
            return andEmployeeIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andEmployeeIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("TEAM_MEMBER.EMPLOYEE_ID >=", value, "employeeId");

            return this;
        } // end andEmployeeIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("TEAM_MEMBER.EMPLOYEE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEmployeeIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdLessThan(long value) {
            return andEmployeeIdLessThan(Long.valueOf(value));
        } // end andEmployeeIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdLessThan(java.lang.Long value) {
            addCriterion("TEAM_MEMBER.EMPLOYEE_ID <", value, "employeeId");

            return this;
        } // end andEmployeeIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("TEAM_MEMBER.EMPLOYEE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEmployeeIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdLessThanOrEqualTo(long value) {
            return andEmployeeIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andEmployeeIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("TEAM_MEMBER.EMPLOYEE_ID <=", value, "employeeId");

            return this;
        } // end andEmployeeIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("TEAM_MEMBER.EMPLOYEE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEmployeeIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdIn(long[] values) {
            if (values.length == 1) {
                return andEmployeeIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("TEAM_MEMBER.EMPLOYEE_ID in", values, "employeeId");

                return this;
            } // end else
        } // end andEmployeeIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdNotIn(long[] values) {
            if (values.length == 1) {
                return andEmployeeIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("TEAM_MEMBER.EMPLOYEE_ID not in", values,
                    "employeeId");

                return this;
            } // end else
        } // end andEmployeeIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdIn(List values) {
            if (values.size() == 1) {
                return andEmployeeIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("TEAM_MEMBER.EMPLOYEE_ID in", values, "employeeId");

                return this;
            } // end else
        } // end andEmployeeIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdNotIn(List values) {
            if (values.size() == 1) {
                return andEmployeeIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("TEAM_MEMBER.EMPLOYEE_ID not in", values,
                    "employeeId");

                return this;
            } // end else
        } // end andEmployeeIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdIn(Object[] values) {
            if (values.length == 1) {
                return andEmployeeIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("TEAM_MEMBER.EMPLOYEE_ID in",
                    Arrays.asList(values), "employeeId");

                return this;
            } // end else
        } // end andEmployeeIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andEmployeeIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("TEAM_MEMBER.EMPLOYEE_ID not in",
                    Arrays.asList(values), "employeeId");

                return this;
            } // end else
        } // end andEmployeeIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdBetween(long value1, long value2) {
            addCriterion("TEAM_MEMBER.EMPLOYEE_ID between", value1, value2,
                "employeeId");

            return this;
        } // end andEmployeeIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("TEAM_MEMBER.EMPLOYEE_ID between", value1, value2,
                "employeeId");

            return this;
        } // end andEmployeeIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdNotBetween(long value1, long value2) {
            addCriterion("TEAM_MEMBER.EMPLOYEE_ID not between", value1, value2,
                "employeeId");

            return this;
        } // end andEmployeeIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("TEAM_MEMBER.EMPLOYEE_ID not between", value1, value2,
                "employeeId");

            return this;
        } // end andEmployeeIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdIsNull() {
            addCriterion("TEAM_MEMBER.TEAM_ID is null");

            return this;
        } // end andTeamIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdIsNotNull() {
            addCriterion("TEAM_MEMBER.TEAM_ID is not null");

            return this;
        } // end andTeamIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdIsNotEmpty() {
            addCriterion(
                "TEAM_MEMBER.TEAM_ID is not null AND TEAM_MEMBER.TEAM_ID <> ''");

            return this;
        } // end andTeamIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamIdIsEmpty() {
            addCriterion(
                "(TEAM_MEMBER.TEAM_ID is null OR TEAM_MEMBER.TEAM_ID = '')");

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
            addCriterion("TEAM_MEMBER.TEAM_ID =", value, "teamId");

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
            StringBuffer str = new StringBuffer("TEAM_MEMBER.TEAM_ID");
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
            addCriterion("TEAM_MEMBER.TEAM_ID <>", value, "teamId");

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
            addCriterion("TEAM_MEMBER.TEAM_ID is null OR TEAM_MEMBER.TEAM_ID <>",
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
            StringBuffer str = new StringBuffer("TEAM_MEMBER.TEAM_ID");
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
            addCriterion("TEAM_MEMBER.TEAM_ID >", value, "teamId");

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
            StringBuffer str = new StringBuffer("TEAM_MEMBER.TEAM_ID");
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
            addCriterion("TEAM_MEMBER.TEAM_ID >=", value, "teamId");

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
            StringBuffer str = new StringBuffer("TEAM_MEMBER.TEAM_ID");
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
            addCriterion("TEAM_MEMBER.TEAM_ID <", value, "teamId");

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
            StringBuffer str = new StringBuffer("TEAM_MEMBER.TEAM_ID");
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
            addCriterion("TEAM_MEMBER.TEAM_ID <=", value, "teamId");

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
            StringBuffer str = new StringBuffer("TEAM_MEMBER.TEAM_ID");
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
                addCriterion("TEAM_MEMBER.TEAM_ID in", values, "teamId");

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
                addCriterion("TEAM_MEMBER.TEAM_ID not in", values, "teamId");

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
                addCriterion("TEAM_MEMBER.TEAM_ID in", values, "teamId");

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
                addCriterion("TEAM_MEMBER.TEAM_ID not in", values, "teamId");

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
                addCriterion("TEAM_MEMBER.TEAM_ID in", Arrays.asList(values),
                    "teamId");

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
                addCriterion("TEAM_MEMBER.TEAM_ID not in",
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
            addCriterion("TEAM_MEMBER.TEAM_ID between", value1, value2, "teamId");

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
            addCriterion("TEAM_MEMBER.TEAM_ID between", value1, value2, "teamId");

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
            addCriterion("TEAM_MEMBER.TEAM_ID not between", value1, value2,
                "teamId");

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
            addCriterion("TEAM_MEMBER.TEAM_ID not between", value1, value2,
                "teamId");

            return this;
        } // end andTeamIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleIdIsNull() {
            addCriterion("TEAM_MEMBER.TEAM_ROLE_ID is null");

            return this;
        } // end andTeamRoleIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleIdIsNotNull() {
            addCriterion("TEAM_MEMBER.TEAM_ROLE_ID is not null");

            return this;
        } // end andTeamRoleIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleIdIsNotEmpty() {
            addCriterion(
                "TEAM_MEMBER.TEAM_ROLE_ID is not null AND TEAM_MEMBER.TEAM_ROLE_ID <> ''");

            return this;
        } // end andTeamRoleIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleIdIsEmpty() {
            addCriterion(
                "(TEAM_MEMBER.TEAM_ROLE_ID is null OR TEAM_MEMBER.TEAM_ROLE_ID = '')");

            return this;
        } // end andTeamRoleIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleIdEqualTo(long value) {
            return andTeamRoleIdEqualTo(Long.valueOf(value));
        } // end andTeamRoleIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleIdEqualTo(java.lang.Long value) {
            addCriterion("TEAM_MEMBER.TEAM_ROLE_ID =", value, "teamRoleId");

            return this;
        } // end andTeamRoleIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("TEAM_MEMBER.TEAM_ROLE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamRoleIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleIdNotEqualTo(long value) {
            return andTeamRoleIdNotEqualTo(Long.valueOf(value));
        } // end andTeamRoleIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleIdNotEqualTo(java.lang.Long value) {
            addCriterion("TEAM_MEMBER.TEAM_ROLE_ID <>", value, "teamRoleId");

            return this;
        } // end andTeamRoleIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleIdNotEqualToOrIsNull(long value) {
            return andTeamRoleIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andTeamRoleIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("TEAM_MEMBER.TEAM_ROLE_ID is null OR TEAM_MEMBER.TEAM_ROLE_ID <>",
                value, "teamRoleId");

            return this;
        } // end andTeamRoleIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("TEAM_MEMBER.TEAM_ROLE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamRoleIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleIdGreaterThan(long value) {
            return andTeamRoleIdGreaterThan(Long.valueOf(value));
        } // end andTeamRoleIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleIdGreaterThan(java.lang.Long value) {
            addCriterion("TEAM_MEMBER.TEAM_ROLE_ID >", value, "teamRoleId");

            return this;
        } // end andTeamRoleIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("TEAM_MEMBER.TEAM_ROLE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamRoleIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleIdGreaterThanOrEqualTo(long value) {
            return andTeamRoleIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andTeamRoleIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("TEAM_MEMBER.TEAM_ROLE_ID >=", value, "teamRoleId");

            return this;
        } // end andTeamRoleIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("TEAM_MEMBER.TEAM_ROLE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamRoleIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleIdLessThan(long value) {
            return andTeamRoleIdLessThan(Long.valueOf(value));
        } // end andTeamRoleIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleIdLessThan(java.lang.Long value) {
            addCriterion("TEAM_MEMBER.TEAM_ROLE_ID <", value, "teamRoleId");

            return this;
        } // end andTeamRoleIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("TEAM_MEMBER.TEAM_ROLE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamRoleIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleIdLessThanOrEqualTo(long value) {
            return andTeamRoleIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andTeamRoleIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("TEAM_MEMBER.TEAM_ROLE_ID <=", value, "teamRoleId");

            return this;
        } // end andTeamRoleIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("TEAM_MEMBER.TEAM_ROLE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamRoleIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleIdIn(long[] values) {
            if (values.length == 1) {
                return andTeamRoleIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("TEAM_MEMBER.TEAM_ROLE_ID in", values, "teamRoleId");

                return this;
            } // end else
        } // end andTeamRoleIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleIdNotIn(long[] values) {
            if (values.length == 1) {
                return andTeamRoleIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("TEAM_MEMBER.TEAM_ROLE_ID not in", values,
                    "teamRoleId");

                return this;
            } // end else
        } // end andTeamRoleIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleIdIn(List values) {
            if (values.size() == 1) {
                return andTeamRoleIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("TEAM_MEMBER.TEAM_ROLE_ID in", values, "teamRoleId");

                return this;
            } // end else
        } // end andTeamRoleIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleIdNotIn(List values) {
            if (values.size() == 1) {
                return andTeamRoleIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("TEAM_MEMBER.TEAM_ROLE_ID not in", values,
                    "teamRoleId");

                return this;
            } // end else
        } // end andTeamRoleIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleIdIn(Object[] values) {
            if (values.length == 1) {
                return andTeamRoleIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("TEAM_MEMBER.TEAM_ROLE_ID in",
                    Arrays.asList(values), "teamRoleId");

                return this;
            } // end else
        } // end andTeamRoleIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andTeamRoleIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("TEAM_MEMBER.TEAM_ROLE_ID not in",
                    Arrays.asList(values), "teamRoleId");

                return this;
            } // end else
        } // end andTeamRoleIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleIdBetween(long value1, long value2) {
            addCriterion("TEAM_MEMBER.TEAM_ROLE_ID between", value1, value2,
                "teamRoleId");

            return this;
        } // end andTeamRoleIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("TEAM_MEMBER.TEAM_ROLE_ID between", value1, value2,
                "teamRoleId");

            return this;
        } // end andTeamRoleIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleIdNotBetween(long value1, long value2) {
            addCriterion("TEAM_MEMBER.TEAM_ROLE_ID not between", value1,
                value2, "teamRoleId");

            return this;
        } // end andTeamRoleIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("TEAM_MEMBER.TEAM_ROLE_ID not between", value1,
                value2, "teamRoleId");

            return this;
        } // end andTeamRoleIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleCodeIsNull() {
            addCriterion("teamRoleA.TEAM_ROLE_CODE is null");

            return this;
        } // end andTeamRoleCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleCodeIsNotNull() {
            addCriterion("teamRoleA.TEAM_ROLE_CODE is not null");

            return this;
        } // end andTeamRoleCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleCodeIsNotEmpty() {
            addCriterion(
                "teamRoleA.TEAM_ROLE_CODE is not null AND teamRoleA.TEAM_ROLE_CODE <> ''");

            return this;
        } // end andTeamRoleCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleCodeIsEmpty() {
            addCriterion(
                "(teamRoleA.TEAM_ROLE_CODE is null OR teamRoleA.TEAM_ROLE_CODE = '')");

            return this;
        } // end andTeamRoleCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleCodeEqualTo(String value) {
            addCriterion("teamRoleA.TEAM_ROLE_CODE =", value, "teamRoleCode");

            return this;
        } // end andTeamRoleCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleCodeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("teamRoleA.TEAM_ROLE_CODE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamRoleCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleCodeNotEqualTo(String value) {
            addCriterion("teamRoleA.TEAM_ROLE_CODE <>", value, "teamRoleCode");

            return this;
        } // end andTeamRoleCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleCodeNotEqualToOrIsNull(String value) {
            addCriterion("teamRoleA.TEAM_ROLE_CODE is null OR teamRoleA.TEAM_ROLE_CODE <>",
                value, "teamRoleCode");

            return this;
        } // end andTeamRoleCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleCodeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("teamRoleA.TEAM_ROLE_CODE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamRoleCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleCodeGreaterThan(String value) {
            addCriterion("teamRoleA.TEAM_ROLE_CODE >", value, "teamRoleCode");

            return this;
        } // end andTeamRoleCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleCodeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("teamRoleA.TEAM_ROLE_CODE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamRoleCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("teamRoleA.TEAM_ROLE_CODE >=", value, "teamRoleCode");

            return this;
        } // end andTeamRoleCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("teamRoleA.TEAM_ROLE_CODE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamRoleCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleCodeLessThan(String value) {
            addCriterion("teamRoleA.TEAM_ROLE_CODE <", value, "teamRoleCode");

            return this;
        } // end andTeamRoleCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleCodeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("teamRoleA.TEAM_ROLE_CODE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamRoleCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleCodeLessThanOrEqualTo(String value) {
            addCriterion("teamRoleA.TEAM_ROLE_CODE <=", value, "teamRoleCode");

            return this;
        } // end andTeamRoleCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleCodeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("teamRoleA.TEAM_ROLE_CODE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamRoleCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("teamRoleA.TEAM_ROLE_CODE like", buffer.toString(),
                "teamRoleCode");

            return this;
        } // end andTeamRoleCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("teamRoleA.TEAM_ROLE_CODE not like",
                buffer.toString(), "teamRoleCode");

            return this;
        } // end andTeamRoleCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleCodeIn(List values) {
            if (values.size() == 1) {
                return andTeamRoleCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("teamRoleA.TEAM_ROLE_CODE in", values,
                    "teamRoleCode");

                return this;
            } // end else
        } // end andTeamRoleCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleCodeNotIn(List values) {
            if (values.size() == 1) {
                return andTeamRoleCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("teamRoleA.TEAM_ROLE_CODE not in", values,
                    "teamRoleCode");

                return this;
            } // end else
        } // end andTeamRoleCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleCodeIn(Object[] values) {
            if (values.length == 1) {
                return andTeamRoleCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("teamRoleA.TEAM_ROLE_CODE in",
                    Arrays.asList(values), "teamRoleCode");

                return this;
            } // end else
        } // end andTeamRoleCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andTeamRoleCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("teamRoleA.TEAM_ROLE_CODE not in",
                    Arrays.asList(values), "teamRoleCode");

                return this;
            } // end else
        } // end andTeamRoleCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleCodeBetween(String value1, String value2) {
            addCriterion("teamRoleA.TEAM_ROLE_CODE between", value1, value2,
                "teamRoleCode");

            return this;
        } // end andTeamRoleCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleCodeNotBetween(String value1, String value2) {
            addCriterion("teamRoleA.TEAM_ROLE_CODE not between", value1,
                value2, "teamRoleCode");

            return this;
        } // end andTeamRoleCodeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleNameIsNull() {
            addCriterion("teamRoleA.TEAM_ROLE_NAME is null");

            return this;
        } // end andTeamRoleNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleNameIsNotNull() {
            addCriterion("teamRoleA.TEAM_ROLE_NAME is not null");

            return this;
        } // end andTeamRoleNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleNameIsNotEmpty() {
            addCriterion(
                "teamRoleA.TEAM_ROLE_NAME is not null AND teamRoleA.TEAM_ROLE_NAME <> ''");

            return this;
        } // end andTeamRoleNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleNameIsEmpty() {
            addCriterion(
                "(teamRoleA.TEAM_ROLE_NAME is null OR teamRoleA.TEAM_ROLE_NAME = '')");

            return this;
        } // end andTeamRoleNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleNameEqualTo(String value) {
            addCriterion("teamRoleA.TEAM_ROLE_NAME =", value, "teamRoleName");

            return this;
        } // end andTeamRoleNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("teamRoleA.TEAM_ROLE_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamRoleNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleNameNotEqualTo(String value) {
            addCriterion("teamRoleA.TEAM_ROLE_NAME <>", value, "teamRoleName");

            return this;
        } // end andTeamRoleNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleNameNotEqualToOrIsNull(String value) {
            addCriterion("teamRoleA.TEAM_ROLE_NAME is null OR teamRoleA.TEAM_ROLE_NAME <>",
                value, "teamRoleName");

            return this;
        } // end andTeamRoleNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("teamRoleA.TEAM_ROLE_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamRoleNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleNameGreaterThan(String value) {
            addCriterion("teamRoleA.TEAM_ROLE_NAME >", value, "teamRoleName");

            return this;
        } // end andTeamRoleNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("teamRoleA.TEAM_ROLE_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamRoleNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("teamRoleA.TEAM_ROLE_NAME >=", value, "teamRoleName");

            return this;
        } // end andTeamRoleNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("teamRoleA.TEAM_ROLE_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamRoleNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleNameLessThan(String value) {
            addCriterion("teamRoleA.TEAM_ROLE_NAME <", value, "teamRoleName");

            return this;
        } // end andTeamRoleNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("teamRoleA.TEAM_ROLE_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamRoleNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleNameLessThanOrEqualTo(String value) {
            addCriterion("teamRoleA.TEAM_ROLE_NAME <=", value, "teamRoleName");

            return this;
        } // end andTeamRoleNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("teamRoleA.TEAM_ROLE_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamRoleNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("teamRoleA.TEAM_ROLE_NAME like", buffer.toString(),
                "teamRoleName");

            return this;
        } // end andTeamRoleNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("teamRoleA.TEAM_ROLE_NAME not like",
                buffer.toString(), "teamRoleName");

            return this;
        } // end andTeamRoleNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleNameIn(List values) {
            if (values.size() == 1) {
                return andTeamRoleNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("teamRoleA.TEAM_ROLE_NAME in", values,
                    "teamRoleName");

                return this;
            } // end else
        } // end andTeamRoleNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleNameNotIn(List values) {
            if (values.size() == 1) {
                return andTeamRoleNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("teamRoleA.TEAM_ROLE_NAME not in", values,
                    "teamRoleName");

                return this;
            } // end else
        } // end andTeamRoleNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleNameIn(Object[] values) {
            if (values.length == 1) {
                return andTeamRoleNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("teamRoleA.TEAM_ROLE_NAME in",
                    Arrays.asList(values), "teamRoleName");

                return this;
            } // end else
        } // end andTeamRoleNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andTeamRoleNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("teamRoleA.TEAM_ROLE_NAME not in",
                    Arrays.asList(values), "teamRoleName");

                return this;
            } // end else
        } // end andTeamRoleNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleNameBetween(String value1, String value2) {
            addCriterion("teamRoleA.TEAM_ROLE_NAME between", value1, value2,
                "teamRoleName");

            return this;
        } // end andTeamRoleNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamRoleNameNotBetween(String value1, String value2) {
            addCriterion("teamRoleA.TEAM_ROLE_NAME not between", value1,
                value2, "teamRoleName");

            return this;
        } // end andTeamRoleNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeIsNull() {
            addCriterion("teamA.TEAM_CODE is null");

            return this;
        } // end andTeamCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeIsNotNull() {
            addCriterion("teamA.TEAM_CODE is not null");

            return this;
        } // end andTeamCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeIsNotEmpty() {
            addCriterion(
                "teamA.TEAM_CODE is not null AND teamA.TEAM_CODE <> ''");

            return this;
        } // end andTeamCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeIsEmpty() {
            addCriterion("(teamA.TEAM_CODE is null OR teamA.TEAM_CODE = '')");

            return this;
        } // end andTeamCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeEqualTo(String value) {
            addCriterion("teamA.TEAM_CODE =", value, "teamCode");

            return this;
        } // end andTeamCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("teamA.TEAM_CODE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeNotEqualTo(String value) {
            addCriterion("teamA.TEAM_CODE <>", value, "teamCode");

            return this;
        } // end andTeamCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeNotEqualToOrIsNull(String value) {
            addCriterion("teamA.TEAM_CODE is null OR teamA.TEAM_CODE <>",
                value, "teamCode");

            return this;
        } // end andTeamCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("teamA.TEAM_CODE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeGreaterThan(String value) {
            addCriterion("teamA.TEAM_CODE >", value, "teamCode");

            return this;
        } // end andTeamCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("teamA.TEAM_CODE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeGreaterThanOrEqualTo(String value) {
            addCriterion("teamA.TEAM_CODE >=", value, "teamCode");

            return this;
        } // end andTeamCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("teamA.TEAM_CODE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeLessThan(String value) {
            addCriterion("teamA.TEAM_CODE <", value, "teamCode");

            return this;
        } // end andTeamCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("teamA.TEAM_CODE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeLessThanOrEqualTo(String value) {
            addCriterion("teamA.TEAM_CODE <=", value, "teamCode");

            return this;
        } // end andTeamCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("teamA.TEAM_CODE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTeamCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("teamA.TEAM_CODE like", buffer.toString(), "teamCode");

            return this;
        } // end andTeamCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("teamA.TEAM_CODE not like", buffer.toString(),
                "teamCode");

            return this;
        } // end andTeamCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeIn(List values) {
            if (values.size() == 1) {
                return andTeamCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("teamA.TEAM_CODE in", values, "teamCode");

                return this;
            } // end else
        } // end andTeamCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeNotIn(List values) {
            if (values.size() == 1) {
                return andTeamCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("teamA.TEAM_CODE not in", values, "teamCode");

                return this;
            } // end else
        } // end andTeamCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeIn(Object[] values) {
            if (values.length == 1) {
                return andTeamCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("teamA.TEAM_CODE in", Arrays.asList(values),
                    "teamCode");

                return this;
            } // end else
        } // end andTeamCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andTeamCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("teamA.TEAM_CODE not in", Arrays.asList(values),
                    "teamCode");

                return this;
            } // end else
        } // end andTeamCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeBetween(String value1, String value2) {
            addCriterion("teamA.TEAM_CODE between", value1, value2, "teamCode");

            return this;
        } // end andTeamCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamCodeNotBetween(String value1, String value2) {
            addCriterion("teamA.TEAM_CODE not between", value1, value2,
                "teamCode");

            return this;
        } // end andTeamCodeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameIsNull() {
            addCriterion("teamA.TEAM_NAME is null");

            return this;
        } // end andTeamNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameIsNotNull() {
            addCriterion("teamA.TEAM_NAME is not null");

            return this;
        } // end andTeamNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameIsNotEmpty() {
            addCriterion(
                "teamA.TEAM_NAME is not null AND teamA.TEAM_NAME <> ''");

            return this;
        } // end andTeamNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTeamNameIsEmpty() {
            addCriterion("(teamA.TEAM_NAME is null OR teamA.TEAM_NAME = '')");

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
            addCriterion("teamA.TEAM_NAME =", value, "teamName");

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
            StringBuffer str = new StringBuffer("teamA.TEAM_NAME");
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
            addCriterion("teamA.TEAM_NAME <>", value, "teamName");

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
            addCriterion("teamA.TEAM_NAME is null OR teamA.TEAM_NAME <>",
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
            StringBuffer str = new StringBuffer("teamA.TEAM_NAME");
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
            addCriterion("teamA.TEAM_NAME >", value, "teamName");

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
            StringBuffer str = new StringBuffer("teamA.TEAM_NAME");
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
            addCriterion("teamA.TEAM_NAME >=", value, "teamName");

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
            StringBuffer str = new StringBuffer("teamA.TEAM_NAME");
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
            addCriterion("teamA.TEAM_NAME <", value, "teamName");

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
            StringBuffer str = new StringBuffer("teamA.TEAM_NAME");
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
            addCriterion("teamA.TEAM_NAME <=", value, "teamName");

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
            StringBuffer str = new StringBuffer("teamA.TEAM_NAME");
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
            addCriterion("teamA.TEAM_NAME like", buffer.toString(), "teamName");

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
            addCriterion("teamA.TEAM_NAME not like", buffer.toString(),
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
                addCriterion("teamA.TEAM_NAME in", values, "teamName");

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
                addCriterion("teamA.TEAM_NAME not in", values, "teamName");

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
                addCriterion("teamA.TEAM_NAME in", Arrays.asList(values),
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
                addCriterion("teamA.TEAM_NAME not in", Arrays.asList(values),
                    "teamName");

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
            addCriterion("teamA.TEAM_NAME between", value1, value2, "teamName");

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
            addCriterion("teamA.TEAM_NAME not between", value1, value2,
                "teamName");

            return this;
        } // end andTeamNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameIsNull() {
            addCriterion("employeeA.NAME is null");

            return this;
        } // end andEmployeeNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameIsNotNull() {
            addCriterion("employeeA.NAME is not null");

            return this;
        } // end andEmployeeNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameIsNotEmpty() {
            addCriterion("employeeA.NAME is not null AND employeeA.NAME <> ''");

            return this;
        } // end andEmployeeNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameIsEmpty() {
            addCriterion("(employeeA.NAME is null OR employeeA.NAME = '')");

            return this;
        } // end andEmployeeNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameEqualTo(String value) {
            addCriterion("employeeA.NAME =", value, "employeeName");

            return this;
        } // end andEmployeeNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeA.NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEmployeeNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameNotEqualTo(String value) {
            addCriterion("employeeA.NAME <>", value, "employeeName");

            return this;
        } // end andEmployeeNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameNotEqualToOrIsNull(String value) {
            addCriterion("employeeA.NAME is null OR employeeA.NAME <>", value,
                "employeeName");

            return this;
        } // end andEmployeeNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeA.NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEmployeeNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameGreaterThan(String value) {
            addCriterion("employeeA.NAME >", value, "employeeName");

            return this;
        } // end andEmployeeNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeA.NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEmployeeNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("employeeA.NAME >=", value, "employeeName");

            return this;
        } // end andEmployeeNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeA.NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEmployeeNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameLessThan(String value) {
            addCriterion("employeeA.NAME <", value, "employeeName");

            return this;
        } // end andEmployeeNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeA.NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEmployeeNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameLessThanOrEqualTo(String value) {
            addCriterion("employeeA.NAME <=", value, "employeeName");

            return this;
        } // end andEmployeeNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeA.NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEmployeeNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("employeeA.NAME like", buffer.toString(),
                "employeeName");

            return this;
        } // end andEmployeeNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("employeeA.NAME not like", buffer.toString(),
                "employeeName");

            return this;
        } // end andEmployeeNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameIn(List values) {
            if (values.size() == 1) {
                return andEmployeeNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("employeeA.NAME in", values, "employeeName");

                return this;
            } // end else
        } // end andEmployeeNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameNotIn(List values) {
            if (values.size() == 1) {
                return andEmployeeNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("employeeA.NAME not in", values, "employeeName");

                return this;
            } // end else
        } // end andEmployeeNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameIn(Object[] values) {
            if (values.length == 1) {
                return andEmployeeNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("employeeA.NAME in", Arrays.asList(values),
                    "employeeName");

                return this;
            } // end else
        } // end andEmployeeNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andEmployeeNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("employeeA.NAME not in", Arrays.asList(values),
                    "employeeName");

                return this;
            } // end else
        } // end andEmployeeNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameBetween(String value1, String value2) {
            addCriterion("employeeA.NAME between", value1, value2,
                "employeeName");

            return this;
        } // end andEmployeeNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeNameNotBetween(String value1, String value2) {
            addCriterion("employeeA.NAME not between", value1, value2,
                "employeeName");

            return this;
        } // end andEmployeeNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeIsNull() {
            addCriterion("employeeA.CODE is null");

            return this;
        } // end andEmployeeCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeIsNotNull() {
            addCriterion("employeeA.CODE is not null");

            return this;
        } // end andEmployeeCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeIsNotEmpty() {
            addCriterion("employeeA.CODE is not null AND employeeA.CODE <> ''");

            return this;
        } // end andEmployeeCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeIsEmpty() {
            addCriterion("(employeeA.CODE is null OR employeeA.CODE = '')");

            return this;
        } // end andEmployeeCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeEqualTo(String value) {
            addCriterion("employeeA.CODE =", value, "employeeCode");

            return this;
        } // end andEmployeeCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeA.CODE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEmployeeCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeNotEqualTo(String value) {
            addCriterion("employeeA.CODE <>", value, "employeeCode");

            return this;
        } // end andEmployeeCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeNotEqualToOrIsNull(String value) {
            addCriterion("employeeA.CODE is null OR employeeA.CODE <>", value,
                "employeeCode");

            return this;
        } // end andEmployeeCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeA.CODE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEmployeeCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeGreaterThan(String value) {
            addCriterion("employeeA.CODE >", value, "employeeCode");

            return this;
        } // end andEmployeeCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeA.CODE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEmployeeCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("employeeA.CODE >=", value, "employeeCode");

            return this;
        } // end andEmployeeCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeA.CODE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEmployeeCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeLessThan(String value) {
            addCriterion("employeeA.CODE <", value, "employeeCode");

            return this;
        } // end andEmployeeCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeA.CODE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEmployeeCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeLessThanOrEqualTo(String value) {
            addCriterion("employeeA.CODE <=", value, "employeeCode");

            return this;
        } // end andEmployeeCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("employeeA.CODE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andEmployeeCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("employeeA.CODE like", buffer.toString(),
                "employeeCode");

            return this;
        } // end andEmployeeCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("employeeA.CODE not like", buffer.toString(),
                "employeeCode");

            return this;
        } // end andEmployeeCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeIn(List values) {
            if (values.size() == 1) {
                return andEmployeeCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("employeeA.CODE in", values, "employeeCode");

                return this;
            } // end else
        } // end andEmployeeCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeNotIn(List values) {
            if (values.size() == 1) {
                return andEmployeeCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("employeeA.CODE not in", values, "employeeCode");

                return this;
            } // end else
        } // end andEmployeeCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeIn(Object[] values) {
            if (values.length == 1) {
                return andEmployeeCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("employeeA.CODE in", Arrays.asList(values),
                    "employeeCode");

                return this;
            } // end else
        } // end andEmployeeCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andEmployeeCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("employeeA.CODE not in", Arrays.asList(values),
                    "employeeCode");

                return this;
            } // end else
        } // end andEmployeeCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeBetween(String value1, String value2) {
            addCriterion("employeeA.CODE between", value1, value2,
                "employeeCode");

            return this;
        } // end andEmployeeCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andEmployeeCodeNotBetween(String value1, String value2) {
            addCriterion("employeeA.CODE not between", value1, value2,
                "employeeCode");

            return this;
        } // end andEmployeeCodeNotBetween()
    } // end Criteria
} // end TeamMemberDAOQueryBean
