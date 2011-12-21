/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.bpm.dao;

import net.dao.BaseQueryBean;
import net.dao.BaseWhereCriterion;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * BpmProcessRolePurview query bean 2011-11-01 13:19:55
 *
 * @author Auto Gen
 */
public class BpmProcessRolePurviewDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new BpmProcessRolePurviewDAOQueryBean object.
     */
    public BpmProcessRolePurviewDAOQueryBean() {
        super();
    } // end BpmProcessRolePurviewDAOQueryBean()

    /**
     * Creates a new BpmProcessRolePurviewDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public BpmProcessRolePurviewDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end BpmProcessRolePurviewDAOQueryBean()

    /**
     * Creates a new BpmProcessRolePurviewDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public BpmProcessRolePurviewDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end BpmProcessRolePurviewDAOQueryBean()

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
            addSelectProperty(IBpmProcessRolePurviewDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessRolePurviewDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addCanBreakSelectProperty() {
        addCanBreakSelectProperty("canBreak");
    } // end addCanBreakSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addCanBreakSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmProcessRolePurviewDAO.CanBreak, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessRolePurviewDAO.CanBreak, "canBreak");
        } // end else
    } // end addCanBreakSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addCanStartSelectProperty() {
        addCanStartSelectProperty("canStart");
    } // end addCanStartSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addCanStartSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmProcessRolePurviewDAO.CanStart, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessRolePurviewDAO.CanStart, "canStart");
        } // end else
    } // end addCanStartSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addProcessDefineIdSelectProperty() {
        addProcessDefineIdSelectProperty("processDefineId");
    } // end addProcessDefineIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addProcessDefineIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmProcessRolePurviewDAO.ProcessDefineId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessRolePurviewDAO.ProcessDefineId,
                "processDefineId");
        } // end else
    } // end addProcessDefineIdSelectProperty()

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
            addSelectProperty(IBpmProcessRolePurviewDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessRolePurviewDAO.Remarks, "remarks");
        } // end else
    } // end addRemarksSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRoleIdSelectProperty() {
        addRoleIdSelectProperty("roleId");
    } // end addRoleIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRoleIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmProcessRolePurviewDAO.RoleId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessRolePurviewDAO.RoleId, "roleId");
        } // end else
    } // end addRoleIdSelectProperty()

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
            addSelectProperty(IBpmProcessRolePurviewDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessRolePurviewDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRoleNameSelectProperty() {
        addRoleNameSelectProperty("roleName");
    } // end addRoleNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRoleNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmProcessRolePurviewDAO.RoleName, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessRolePurviewDAO.RoleName, "roleName");
        } // end else
    } // end addRoleNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRoleCodeSelectProperty() {
        addRoleCodeSelectProperty("roleCode");
    } // end addRoleCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRoleCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmProcessRolePurviewDAO.RoleCode, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessRolePurviewDAO.RoleCode, "roleCode");
        } // end else
    } // end addRoleCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addCanReAssignSelectProperty() {
        addCanReAssignSelectProperty("canReAssign");
    } // end addCanReAssignSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addCanReAssignSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmProcessRolePurviewDAO.CanReAssign, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmProcessRolePurviewDAO.CanReAssign,
                "canReAssign");
        } // end else
    } // end addCanReAssignSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addCanBreakSelectProperty();

        addCanStartSelectProperty();

        addProcessDefineIdSelectProperty();

        addRemarksSelectProperty();

        addRoleIdSelectProperty();

        addStatusSelectProperty();

        addRoleNameSelectProperty();

        addRoleCodeSelectProperty();

        addCanReAssignSelectProperty();
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
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_ROLE_PURVIEW.ID is not null AND BPM_PROCESS_ROLE_PURVIEW.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_ROLE_PURVIEW.ID is null OR BPM_PROCESS_ROLE_PURVIEW.ID = '')");

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
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_ROLE_PURVIEW.ID");
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
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.ID <>", value, "id");

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
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.ID is null OR BPM_PROCESS_ROLE_PURVIEW.ID <>",
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
            StringBuffer str = new StringBuffer("BPM_PROCESS_ROLE_PURVIEW.ID");
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
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_ROLE_PURVIEW.ID");
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
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_ROLE_PURVIEW.ID");
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
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_ROLE_PURVIEW.ID");
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
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_PROCESS_ROLE_PURVIEW.ID");
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
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.ID in", values, "id");

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
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.ID not in", values, "id");

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
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.ID in", values, "id");

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
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.ID not in", values, "id");

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
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.ID in",
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
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.ID not in",
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
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.ID between", value1, value2,
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
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.ID between", value1, value2,
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
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.ID not between", value1,
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
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.ID not between", value1,
                value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanBreakIsNull() {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_BREAK is null");

            return this;
        } // end andCanBreakIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanBreakIsNotNull() {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_BREAK is not null");

            return this;
        } // end andCanBreakIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanBreakIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_ROLE_PURVIEW.CAN_BREAK is not null AND BPM_PROCESS_ROLE_PURVIEW.CAN_BREAK <> ''");

            return this;
        } // end andCanBreakIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanBreakIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_ROLE_PURVIEW.CAN_BREAK is null OR BPM_PROCESS_ROLE_PURVIEW.CAN_BREAK = '')");

            return this;
        } // end andCanBreakIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanBreakEqualTo(String value) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_BREAK =", value,
                "canBreak");

            return this;
        } // end andCanBreakEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanBreakEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_ROLE_PURVIEW.CAN_BREAK");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCanBreakEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanBreakNotEqualTo(String value) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_BREAK <>", value,
                "canBreak");

            return this;
        } // end andCanBreakNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanBreakNotEqualToOrIsNull(String value) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_BREAK is null OR BPM_PROCESS_ROLE_PURVIEW.CAN_BREAK <>",
                value, "canBreak");

            return this;
        } // end andCanBreakNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanBreakNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_ROLE_PURVIEW.CAN_BREAK");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCanBreakNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanBreakGreaterThan(String value) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_BREAK >", value,
                "canBreak");

            return this;
        } // end andCanBreakGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanBreakGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_ROLE_PURVIEW.CAN_BREAK");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCanBreakGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanBreakGreaterThanOrEqualTo(String value) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_BREAK >=", value,
                "canBreak");

            return this;
        } // end andCanBreakGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanBreakGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_ROLE_PURVIEW.CAN_BREAK");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCanBreakGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanBreakLessThan(String value) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_BREAK <", value,
                "canBreak");

            return this;
        } // end andCanBreakLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanBreakLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_ROLE_PURVIEW.CAN_BREAK");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCanBreakLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanBreakLessThanOrEqualTo(String value) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_BREAK <=", value,
                "canBreak");

            return this;
        } // end andCanBreakLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanBreakLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_ROLE_PURVIEW.CAN_BREAK");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCanBreakLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanBreakLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_BREAK like",
                buffer.toString(), "canBreak");

            return this;
        } // end andCanBreakLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanBreakNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_BREAK not like",
                buffer.toString(), "canBreak");

            return this;
        } // end andCanBreakNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanBreakIn(List values) {
            if (values.size() == 1) {
                return andCanBreakEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_BREAK in", values,
                    "canBreak");

                return this;
            } // end else
        } // end andCanBreakIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanBreakNotIn(List values) {
            if (values.size() == 1) {
                return andCanBreakNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_BREAK not in",
                    values, "canBreak");

                return this;
            } // end else
        } // end andCanBreakNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanBreakIn(Object[] values) {
            if (values.length == 1) {
                return andCanBreakEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_BREAK in",
                    Arrays.asList(values), "canBreak");

                return this;
            } // end else
        } // end andCanBreakIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanBreakNotIn(Object[] values) {
            if (values.length == 1) {
                return andCanBreakNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_BREAK not in",
                    Arrays.asList(values), "canBreak");

                return this;
            } // end else
        } // end andCanBreakNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanBreakBetween(String value1, String value2) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_BREAK between", value1,
                value2, "canBreak");

            return this;
        } // end andCanBreakBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanBreakNotBetween(String value1, String value2) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_BREAK not between",
                value1, value2, "canBreak");

            return this;
        } // end andCanBreakNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanStartIsNull() {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_START is null");

            return this;
        } // end andCanStartIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanStartIsNotNull() {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_START is not null");

            return this;
        } // end andCanStartIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanStartIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_ROLE_PURVIEW.CAN_START is not null AND BPM_PROCESS_ROLE_PURVIEW.CAN_START <> ''");

            return this;
        } // end andCanStartIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanStartIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_ROLE_PURVIEW.CAN_START is null OR BPM_PROCESS_ROLE_PURVIEW.CAN_START = '')");

            return this;
        } // end andCanStartIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanStartEqualTo(String value) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_START =", value,
                "canStart");

            return this;
        } // end andCanStartEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanStartEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_ROLE_PURVIEW.CAN_START");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCanStartEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanStartNotEqualTo(String value) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_START <>", value,
                "canStart");

            return this;
        } // end andCanStartNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanStartNotEqualToOrIsNull(String value) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_START is null OR BPM_PROCESS_ROLE_PURVIEW.CAN_START <>",
                value, "canStart");

            return this;
        } // end andCanStartNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanStartNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_ROLE_PURVIEW.CAN_START");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCanStartNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanStartGreaterThan(String value) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_START >", value,
                "canStart");

            return this;
        } // end andCanStartGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanStartGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_ROLE_PURVIEW.CAN_START");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCanStartGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanStartGreaterThanOrEqualTo(String value) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_START >=", value,
                "canStart");

            return this;
        } // end andCanStartGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanStartGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_ROLE_PURVIEW.CAN_START");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCanStartGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanStartLessThan(String value) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_START <", value,
                "canStart");

            return this;
        } // end andCanStartLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanStartLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_ROLE_PURVIEW.CAN_START");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCanStartLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanStartLessThanOrEqualTo(String value) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_START <=", value,
                "canStart");

            return this;
        } // end andCanStartLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanStartLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_ROLE_PURVIEW.CAN_START");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCanStartLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanStartLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_START like",
                buffer.toString(), "canStart");

            return this;
        } // end andCanStartLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanStartNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_START not like",
                buffer.toString(), "canStart");

            return this;
        } // end andCanStartNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanStartIn(List values) {
            if (values.size() == 1) {
                return andCanStartEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_START in", values,
                    "canStart");

                return this;
            } // end else
        } // end andCanStartIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanStartNotIn(List values) {
            if (values.size() == 1) {
                return andCanStartNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_START not in",
                    values, "canStart");

                return this;
            } // end else
        } // end andCanStartNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanStartIn(Object[] values) {
            if (values.length == 1) {
                return andCanStartEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_START in",
                    Arrays.asList(values), "canStart");

                return this;
            } // end else
        } // end andCanStartIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanStartNotIn(Object[] values) {
            if (values.length == 1) {
                return andCanStartNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_START not in",
                    Arrays.asList(values), "canStart");

                return this;
            } // end else
        } // end andCanStartNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanStartBetween(String value1, String value2) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_START between", value1,
                value2, "canStart");

            return this;
        } // end andCanStartBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanStartNotBetween(String value1, String value2) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_START not between",
                value1, value2, "canStart");

            return this;
        } // end andCanStartNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdIsNull() {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.PROCESS_DEFINE_ID is null");

            return this;
        } // end andProcessDefineIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdIsNotNull() {
            addCriterion(
                "BPM_PROCESS_ROLE_PURVIEW.PROCESS_DEFINE_ID is not null");

            return this;
        } // end andProcessDefineIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_ROLE_PURVIEW.PROCESS_DEFINE_ID is not null AND BPM_PROCESS_ROLE_PURVIEW.PROCESS_DEFINE_ID <> ''");

            return this;
        } // end andProcessDefineIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_ROLE_PURVIEW.PROCESS_DEFINE_ID is null OR BPM_PROCESS_ROLE_PURVIEW.PROCESS_DEFINE_ID = '')");

            return this;
        } // end andProcessDefineIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdEqualTo(long value) {
            return andProcessDefineIdEqualTo(Long.valueOf(value));
        } // end andProcessDefineIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdEqualTo(java.lang.Long value) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.PROCESS_DEFINE_ID =", value,
                "processDefineId");

            return this;
        } // end andProcessDefineIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_ROLE_PURVIEW.PROCESS_DEFINE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessDefineIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdNotEqualTo(long value) {
            return andProcessDefineIdNotEqualTo(Long.valueOf(value));
        } // end andProcessDefineIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdNotEqualTo(java.lang.Long value) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.PROCESS_DEFINE_ID <>",
                value, "processDefineId");

            return this;
        } // end andProcessDefineIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdNotEqualToOrIsNull(long value) {
            return andProcessDefineIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andProcessDefineIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.PROCESS_DEFINE_ID is null OR BPM_PROCESS_ROLE_PURVIEW.PROCESS_DEFINE_ID <>",
                value, "processDefineId");

            return this;
        } // end andProcessDefineIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_ROLE_PURVIEW.PROCESS_DEFINE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessDefineIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdGreaterThan(long value) {
            return andProcessDefineIdGreaterThan(Long.valueOf(value));
        } // end andProcessDefineIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdGreaterThan(java.lang.Long value) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.PROCESS_DEFINE_ID >", value,
                "processDefineId");

            return this;
        } // end andProcessDefineIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_ROLE_PURVIEW.PROCESS_DEFINE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessDefineIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdGreaterThanOrEqualTo(long value) {
            return andProcessDefineIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andProcessDefineIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.PROCESS_DEFINE_ID >=",
                value, "processDefineId");

            return this;
        } // end andProcessDefineIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_ROLE_PURVIEW.PROCESS_DEFINE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessDefineIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdLessThan(long value) {
            return andProcessDefineIdLessThan(Long.valueOf(value));
        } // end andProcessDefineIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdLessThan(java.lang.Long value) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.PROCESS_DEFINE_ID <", value,
                "processDefineId");

            return this;
        } // end andProcessDefineIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_ROLE_PURVIEW.PROCESS_DEFINE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessDefineIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdLessThanOrEqualTo(long value) {
            return andProcessDefineIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andProcessDefineIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.PROCESS_DEFINE_ID <=",
                value, "processDefineId");

            return this;
        } // end andProcessDefineIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_ROLE_PURVIEW.PROCESS_DEFINE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andProcessDefineIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdIn(long[] values) {
            if (values.length == 1) {
                return andProcessDefineIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.PROCESS_DEFINE_ID in",
                    values, "processDefineId");

                return this;
            } // end else
        } // end andProcessDefineIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdNotIn(long[] values) {
            if (values.length == 1) {
                return andProcessDefineIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.PROCESS_DEFINE_ID not in",
                    values, "processDefineId");

                return this;
            } // end else
        } // end andProcessDefineIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdIn(List values) {
            if (values.size() == 1) {
                return andProcessDefineIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.PROCESS_DEFINE_ID in",
                    values, "processDefineId");

                return this;
            } // end else
        } // end andProcessDefineIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdNotIn(List values) {
            if (values.size() == 1) {
                return andProcessDefineIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.PROCESS_DEFINE_ID not in",
                    values, "processDefineId");

                return this;
            } // end else
        } // end andProcessDefineIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdIn(Object[] values) {
            if (values.length == 1) {
                return andProcessDefineIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.PROCESS_DEFINE_ID in",
                    Arrays.asList(values), "processDefineId");

                return this;
            } // end else
        } // end andProcessDefineIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andProcessDefineIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.PROCESS_DEFINE_ID not in",
                    Arrays.asList(values), "processDefineId");

                return this;
            } // end else
        } // end andProcessDefineIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdBetween(long value1, long value2) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.PROCESS_DEFINE_ID between",
                value1, value2, "processDefineId");

            return this;
        } // end andProcessDefineIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.PROCESS_DEFINE_ID between",
                value1, value2, "processDefineId");

            return this;
        } // end andProcessDefineIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdNotBetween(long value1, long value2) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.PROCESS_DEFINE_ID not between",
                value1, value2, "processDefineId");

            return this;
        } // end andProcessDefineIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andProcessDefineIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.PROCESS_DEFINE_ID not between",
                value1, value2, "processDefineId");

            return this;
        } // end andProcessDefineIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_ROLE_PURVIEW.REMARKS is not null AND BPM_PROCESS_ROLE_PURVIEW.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_ROLE_PURVIEW.REMARKS is null OR BPM_PROCESS_ROLE_PURVIEW.REMARKS = '')");

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
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.REMARKS =", value, "remarks");

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
                    "BPM_PROCESS_ROLE_PURVIEW.REMARKS");
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
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.REMARKS <>", value, "remarks");

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
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.REMARKS is null OR BPM_PROCESS_ROLE_PURVIEW.REMARKS <>",
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
                    "BPM_PROCESS_ROLE_PURVIEW.REMARKS");
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
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.REMARKS >", value, "remarks");

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
                    "BPM_PROCESS_ROLE_PURVIEW.REMARKS");
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
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.REMARKS >=", value, "remarks");

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
                    "BPM_PROCESS_ROLE_PURVIEW.REMARKS");
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
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.REMARKS <", value, "remarks");

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
                    "BPM_PROCESS_ROLE_PURVIEW.REMARKS");
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
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.REMARKS <=", value, "remarks");

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
                    "BPM_PROCESS_ROLE_PURVIEW.REMARKS");
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
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.REMARKS like",
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
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.REMARKS not like",
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
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.REMARKS in", values,
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
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.REMARKS not in", values,
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
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.REMARKS in",
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
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.REMARKS not in",
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
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.REMARKS between", value1,
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
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.REMARKS not between",
                value1, value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdIsNull() {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.ROLE_ID is null");

            return this;
        } // end andRoleIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdIsNotNull() {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.ROLE_ID is not null");

            return this;
        } // end andRoleIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_ROLE_PURVIEW.ROLE_ID is not null AND BPM_PROCESS_ROLE_PURVIEW.ROLE_ID <> ''");

            return this;
        } // end andRoleIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_ROLE_PURVIEW.ROLE_ID is null OR BPM_PROCESS_ROLE_PURVIEW.ROLE_ID = '')");

            return this;
        } // end andRoleIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdEqualTo(long value) {
            return andRoleIdEqualTo(Long.valueOf(value));
        } // end andRoleIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdEqualTo(java.lang.Long value) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.ROLE_ID =", value, "roleId");

            return this;
        } // end andRoleIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_ROLE_PURVIEW.ROLE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdNotEqualTo(long value) {
            return andRoleIdNotEqualTo(Long.valueOf(value));
        } // end andRoleIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdNotEqualTo(java.lang.Long value) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.ROLE_ID <>", value, "roleId");

            return this;
        } // end andRoleIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdNotEqualToOrIsNull(long value) {
            return andRoleIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andRoleIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.ROLE_ID is null OR BPM_PROCESS_ROLE_PURVIEW.ROLE_ID <>",
                value, "roleId");

            return this;
        } // end andRoleIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_ROLE_PURVIEW.ROLE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdGreaterThan(long value) {
            return andRoleIdGreaterThan(Long.valueOf(value));
        } // end andRoleIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdGreaterThan(java.lang.Long value) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.ROLE_ID >", value, "roleId");

            return this;
        } // end andRoleIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_ROLE_PURVIEW.ROLE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdGreaterThanOrEqualTo(long value) {
            return andRoleIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andRoleIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.ROLE_ID >=", value, "roleId");

            return this;
        } // end andRoleIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_ROLE_PURVIEW.ROLE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdLessThan(long value) {
            return andRoleIdLessThan(Long.valueOf(value));
        } // end andRoleIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdLessThan(java.lang.Long value) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.ROLE_ID <", value, "roleId");

            return this;
        } // end andRoleIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_ROLE_PURVIEW.ROLE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdLessThanOrEqualTo(long value) {
            return andRoleIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andRoleIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.ROLE_ID <=", value, "roleId");

            return this;
        } // end andRoleIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_ROLE_PURVIEW.ROLE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdIn(long[] values) {
            if (values.length == 1) {
                return andRoleIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.ROLE_ID in", values,
                    "roleId");

                return this;
            } // end else
        } // end andRoleIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdNotIn(long[] values) {
            if (values.length == 1) {
                return andRoleIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.ROLE_ID not in", values,
                    "roleId");

                return this;
            } // end else
        } // end andRoleIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdIn(List values) {
            if (values.size() == 1) {
                return andRoleIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.ROLE_ID in", values,
                    "roleId");

                return this;
            } // end else
        } // end andRoleIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdNotIn(List values) {
            if (values.size() == 1) {
                return andRoleIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.ROLE_ID not in", values,
                    "roleId");

                return this;
            } // end else
        } // end andRoleIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdIn(Object[] values) {
            if (values.length == 1) {
                return andRoleIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.ROLE_ID in",
                    Arrays.asList(values), "roleId");

                return this;
            } // end else
        } // end andRoleIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andRoleIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.ROLE_ID not in",
                    Arrays.asList(values), "roleId");

                return this;
            } // end else
        } // end andRoleIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdBetween(long value1, long value2) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.ROLE_ID between", value1,
                value2, "roleId");

            return this;
        } // end andRoleIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.ROLE_ID between", value1,
                value2, "roleId");

            return this;
        } // end andRoleIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdNotBetween(long value1, long value2) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.ROLE_ID not between",
                value1, value2, "roleId");

            return this;
        } // end andRoleIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.ROLE_ID not between",
                value1, value2, "roleId");

            return this;
        } // end andRoleIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_ROLE_PURVIEW.STATUS is not null AND BPM_PROCESS_ROLE_PURVIEW.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_ROLE_PURVIEW.STATUS is null OR BPM_PROCESS_ROLE_PURVIEW.STATUS = '')");

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
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_ROLE_PURVIEW.STATUS");
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
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.STATUS <>", value, "status");

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
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.STATUS is null OR BPM_PROCESS_ROLE_PURVIEW.STATUS <>",
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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_ROLE_PURVIEW.STATUS");
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
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_ROLE_PURVIEW.STATUS");
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
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_ROLE_PURVIEW.STATUS");
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
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_ROLE_PURVIEW.STATUS");
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
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_ROLE_PURVIEW.STATUS");
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
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.STATUS like",
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
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.STATUS not like",
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
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.STATUS in", values,
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
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.STATUS not in", values,
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
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.STATUS in",
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
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.STATUS not in",
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
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.STATUS between", value1,
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
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.STATUS not between", value1,
                value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameIsNull() {
            addCriterion("bpmRoleD.ROLE_NAME is null");

            return this;
        } // end andRoleNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameIsNotNull() {
            addCriterion("bpmRoleD.ROLE_NAME is not null");

            return this;
        } // end andRoleNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameIsNotEmpty() {
            addCriterion(
                "bpmRoleD.ROLE_NAME is not null AND bpmRoleD.ROLE_NAME <> ''");

            return this;
        } // end andRoleNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameIsEmpty() {
            addCriterion(
                "(bpmRoleD.ROLE_NAME is null OR bpmRoleD.ROLE_NAME = '')");

            return this;
        } // end andRoleNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("bpmRoleD.ROLE_NAME =", value, "roleName");

            return this;
        } // end andRoleNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmRoleD.ROLE_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("bpmRoleD.ROLE_NAME <>", value, "roleName");

            return this;
        } // end andRoleNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameNotEqualToOrIsNull(String value) {
            addCriterion("bpmRoleD.ROLE_NAME is null OR bpmRoleD.ROLE_NAME <>",
                value, "roleName");

            return this;
        } // end andRoleNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmRoleD.ROLE_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("bpmRoleD.ROLE_NAME >", value, "roleName");

            return this;
        } // end andRoleNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmRoleD.ROLE_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("bpmRoleD.ROLE_NAME >=", value, "roleName");

            return this;
        } // end andRoleNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmRoleD.ROLE_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameLessThan(String value) {
            addCriterion("bpmRoleD.ROLE_NAME <", value, "roleName");

            return this;
        } // end andRoleNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmRoleD.ROLE_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("bpmRoleD.ROLE_NAME <=", value, "roleName");

            return this;
        } // end andRoleNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmRoleD.ROLE_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("bpmRoleD.ROLE_NAME like", buffer.toString(),
                "roleName");

            return this;
        } // end andRoleNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("bpmRoleD.ROLE_NAME not like", buffer.toString(),
                "roleName");

            return this;
        } // end andRoleNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameIn(List values) {
            if (values.size() == 1) {
                return andRoleNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("bpmRoleD.ROLE_NAME in", values, "roleName");

                return this;
            } // end else
        } // end andRoleNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameNotIn(List values) {
            if (values.size() == 1) {
                return andRoleNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("bpmRoleD.ROLE_NAME not in", values, "roleName");

                return this;
            } // end else
        } // end andRoleNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameIn(Object[] values) {
            if (values.length == 1) {
                return andRoleNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("bpmRoleD.ROLE_NAME in", Arrays.asList(values),
                    "roleName");

                return this;
            } // end else
        } // end andRoleNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andRoleNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("bpmRoleD.ROLE_NAME not in",
                    Arrays.asList(values), "roleName");

                return this;
            } // end else
        } // end andRoleNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("bpmRoleD.ROLE_NAME between", value1, value2,
                "roleName");

            return this;
        } // end andRoleNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("bpmRoleD.ROLE_NAME not between", value1, value2,
                "roleName");

            return this;
        } // end andRoleNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeIsNull() {
            addCriterion("bpmRoleD.ROLE_KEY is null");

            return this;
        } // end andRoleCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeIsNotNull() {
            addCriterion("bpmRoleD.ROLE_KEY is not null");

            return this;
        } // end andRoleCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeIsNotEmpty() {
            addCriterion(
                "bpmRoleD.ROLE_KEY is not null AND bpmRoleD.ROLE_KEY <> ''");

            return this;
        } // end andRoleCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeIsEmpty() {
            addCriterion(
                "(bpmRoleD.ROLE_KEY is null OR bpmRoleD.ROLE_KEY = '')");

            return this;
        } // end andRoleCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeEqualTo(String value) {
            addCriterion("bpmRoleD.ROLE_KEY =", value, "roleCode");

            return this;
        } // end andRoleCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmRoleD.ROLE_KEY");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeNotEqualTo(String value) {
            addCriterion("bpmRoleD.ROLE_KEY <>", value, "roleCode");

            return this;
        } // end andRoleCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeNotEqualToOrIsNull(String value) {
            addCriterion("bpmRoleD.ROLE_KEY is null OR bpmRoleD.ROLE_KEY <>",
                value, "roleCode");

            return this;
        } // end andRoleCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmRoleD.ROLE_KEY");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeGreaterThan(String value) {
            addCriterion("bpmRoleD.ROLE_KEY >", value, "roleCode");

            return this;
        } // end andRoleCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmRoleD.ROLE_KEY");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bpmRoleD.ROLE_KEY >=", value, "roleCode");

            return this;
        } // end andRoleCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmRoleD.ROLE_KEY");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeLessThan(String value) {
            addCriterion("bpmRoleD.ROLE_KEY <", value, "roleCode");

            return this;
        } // end andRoleCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmRoleD.ROLE_KEY");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeLessThanOrEqualTo(String value) {
            addCriterion("bpmRoleD.ROLE_KEY <=", value, "roleCode");

            return this;
        } // end andRoleCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmRoleD.ROLE_KEY");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("bpmRoleD.ROLE_KEY like", buffer.toString(), "roleCode");

            return this;
        } // end andRoleCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("bpmRoleD.ROLE_KEY not like", buffer.toString(),
                "roleCode");

            return this;
        } // end andRoleCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeIn(List values) {
            if (values.size() == 1) {
                return andRoleCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("bpmRoleD.ROLE_KEY in", values, "roleCode");

                return this;
            } // end else
        } // end andRoleCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeNotIn(List values) {
            if (values.size() == 1) {
                return andRoleCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("bpmRoleD.ROLE_KEY not in", values, "roleCode");

                return this;
            } // end else
        } // end andRoleCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeIn(Object[] values) {
            if (values.length == 1) {
                return andRoleCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("bpmRoleD.ROLE_KEY in", Arrays.asList(values),
                    "roleCode");

                return this;
            } // end else
        } // end andRoleCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andRoleCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("bpmRoleD.ROLE_KEY not in", Arrays.asList(values),
                    "roleCode");

                return this;
            } // end else
        } // end andRoleCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeBetween(String value1, String value2) {
            addCriterion("bpmRoleD.ROLE_KEY between", value1, value2, "roleCode");

            return this;
        } // end andRoleCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleCodeNotBetween(String value1, String value2) {
            addCriterion("bpmRoleD.ROLE_KEY not between", value1, value2,
                "roleCode");

            return this;
        } // end andRoleCodeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanReAssignIsNull() {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_RE_ASSIGN is null");

            return this;
        } // end andCanReAssignIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanReAssignIsNotNull() {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_RE_ASSIGN is not null");

            return this;
        } // end andCanReAssignIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanReAssignIsNotEmpty() {
            addCriterion(
                "BPM_PROCESS_ROLE_PURVIEW.CAN_RE_ASSIGN is not null AND BPM_PROCESS_ROLE_PURVIEW.CAN_RE_ASSIGN <> ''");

            return this;
        } // end andCanReAssignIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanReAssignIsEmpty() {
            addCriterion(
                "(BPM_PROCESS_ROLE_PURVIEW.CAN_RE_ASSIGN is null OR BPM_PROCESS_ROLE_PURVIEW.CAN_RE_ASSIGN = '')");

            return this;
        } // end andCanReAssignIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanReAssignEqualTo(String value) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_RE_ASSIGN =", value,
                "canReAssign");

            return this;
        } // end andCanReAssignEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanReAssignEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_ROLE_PURVIEW.CAN_RE_ASSIGN");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCanReAssignEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanReAssignNotEqualTo(String value) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_RE_ASSIGN <>", value,
                "canReAssign");

            return this;
        } // end andCanReAssignNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanReAssignNotEqualToOrIsNull(String value) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_RE_ASSIGN is null OR BPM_PROCESS_ROLE_PURVIEW.CAN_RE_ASSIGN <>",
                value, "canReAssign");

            return this;
        } // end andCanReAssignNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanReAssignNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_ROLE_PURVIEW.CAN_RE_ASSIGN");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCanReAssignNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanReAssignGreaterThan(String value) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_RE_ASSIGN >", value,
                "canReAssign");

            return this;
        } // end andCanReAssignGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanReAssignGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_ROLE_PURVIEW.CAN_RE_ASSIGN");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCanReAssignGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanReAssignGreaterThanOrEqualTo(String value) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_RE_ASSIGN >=", value,
                "canReAssign");

            return this;
        } // end andCanReAssignGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanReAssignGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_ROLE_PURVIEW.CAN_RE_ASSIGN");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCanReAssignGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanReAssignLessThan(String value) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_RE_ASSIGN <", value,
                "canReAssign");

            return this;
        } // end andCanReAssignLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanReAssignLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_ROLE_PURVIEW.CAN_RE_ASSIGN");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCanReAssignLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanReAssignLessThanOrEqualTo(String value) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_RE_ASSIGN <=", value,
                "canReAssign");

            return this;
        } // end andCanReAssignLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanReAssignLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BPM_PROCESS_ROLE_PURVIEW.CAN_RE_ASSIGN");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andCanReAssignLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanReAssignLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_RE_ASSIGN like",
                buffer.toString(), "canReAssign");

            return this;
        } // end andCanReAssignLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanReAssignNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_RE_ASSIGN not like",
                buffer.toString(), "canReAssign");

            return this;
        } // end andCanReAssignNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanReAssignIn(List values) {
            if (values.size() == 1) {
                return andCanReAssignEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_RE_ASSIGN in",
                    values, "canReAssign");

                return this;
            } // end else
        } // end andCanReAssignIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanReAssignNotIn(List values) {
            if (values.size() == 1) {
                return andCanReAssignNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_RE_ASSIGN not in",
                    values, "canReAssign");

                return this;
            } // end else
        } // end andCanReAssignNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanReAssignIn(Object[] values) {
            if (values.length == 1) {
                return andCanReAssignEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_RE_ASSIGN in",
                    Arrays.asList(values), "canReAssign");

                return this;
            } // end else
        } // end andCanReAssignIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanReAssignNotIn(Object[] values) {
            if (values.length == 1) {
                return andCanReAssignNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_RE_ASSIGN not in",
                    Arrays.asList(values), "canReAssign");

                return this;
            } // end else
        } // end andCanReAssignNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanReAssignBetween(String value1, String value2) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_RE_ASSIGN between",
                value1, value2, "canReAssign");

            return this;
        } // end andCanReAssignBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andCanReAssignNotBetween(String value1, String value2) {
            addCriterion("BPM_PROCESS_ROLE_PURVIEW.CAN_RE_ASSIGN not between",
                value1, value2, "canReAssign");

            return this;
        } // end andCanReAssignNotBetween()
    } // end Criteria
} // end BpmProcessRolePurviewDAOQueryBean
