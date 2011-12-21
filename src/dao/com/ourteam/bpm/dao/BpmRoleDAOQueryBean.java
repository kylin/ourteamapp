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
 * BpmRole query bean 2011-11-04 13:12:55
 *
 * @author Auto Gen
 */
public class BpmRoleDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new BpmRoleDAOQueryBean object.
     */
    public BpmRoleDAOQueryBean() {
        super();
    } // end BpmRoleDAOQueryBean()

    /**
     * Creates a new BpmRoleDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public BpmRoleDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end BpmRoleDAOQueryBean()

    /**
     * Creates a new BpmRoleDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public BpmRoleDAOQueryBean(BaseQueryBean aQueryBean, Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end BpmRoleDAOQueryBean()

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
            addSelectProperty(IBpmRoleDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmRoleDAO.Id, "id");
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
            addSelectProperty(IBpmRoleDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmRoleDAO.Remarks, "remarks");
        } // end else
    } // end addRemarksSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRoleKeySelectProperty() {
        addRoleKeySelectProperty("roleKey");
    } // end addRoleKeySelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRoleKeySelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmRoleDAO.RoleKey, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmRoleDAO.RoleKey, "roleKey");
        } // end else
    } // end addRoleKeySelectProperty()

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
            addSelectProperty(IBpmRoleDAO.RoleName, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmRoleDAO.RoleName, "roleName");
        } // end else
    } // end addRoleNameSelectProperty()

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
            addSelectProperty(IBpmRoleDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmRoleDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addSysModuleIdSelectProperty() {
        addSysModuleIdSelectProperty("sysModuleId");
    } // end addSysModuleIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addSysModuleIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmRoleDAO.SysModuleId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmRoleDAO.SysModuleId, "sysModuleId");
        } // end else
    } // end addSysModuleIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addSysModuleNameSelectProperty() {
        addSysModuleNameSelectProperty("sysModuleName");
    } // end addSysModuleNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addSysModuleNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmRoleDAO.SysModuleName, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmRoleDAO.SysModuleName, "sysModuleName");
        } // end else
    } // end addSysModuleNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addSysModuleCodeSelectProperty() {
        addSysModuleCodeSelectProperty("sysModuleCode");
    } // end addSysModuleCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addSysModuleCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmRoleDAO.SysModuleCode, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmRoleDAO.SysModuleCode, "sysModuleCode");
        } // end else
    } // end addSysModuleCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addBpmDomainIdSelectProperty() {
        addBpmDomainIdSelectProperty("bpmDomainId");
    } // end addBpmDomainIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addBpmDomainIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmRoleDAO.BpmDomainId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmRoleDAO.BpmDomainId, "bpmDomainId");
        } // end else
    } // end addBpmDomainIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addBpmDomainCodeSelectProperty() {
        addBpmDomainCodeSelectProperty("bpmDomainCode");
    } // end addBpmDomainCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addBpmDomainCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmRoleDAO.BpmDomainCode, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmRoleDAO.BpmDomainCode, "bpmDomainCode");
        } // end else
    } // end addBpmDomainCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addBpmDomainNameSelectProperty() {
        addBpmDomainNameSelectProperty("bpmDomainName");
    } // end addBpmDomainNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addBpmDomainNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmRoleDAO.BpmDomainName, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmRoleDAO.BpmDomainName, "bpmDomainName");
        } // end else
    } // end addBpmDomainNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addRemarksSelectProperty();

        addRoleKeySelectProperty();

        addRoleNameSelectProperty();

        addStatusSelectProperty();

        addSysModuleIdSelectProperty();

        addSysModuleNameSelectProperty();

        addSysModuleCodeSelectProperty();

        addBpmDomainIdSelectProperty();

        addBpmDomainCodeSelectProperty();

        addBpmDomainNameSelectProperty();
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
            addCriterion("BPM_ROLE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("BPM_ROLE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion("BPM_ROLE.ID is not null AND BPM_ROLE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion("(BPM_ROLE.ID is null OR BPM_ROLE.ID = '')");

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
            addCriterion("BPM_ROLE.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_ROLE.ID");
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
            addCriterion("BPM_ROLE.ID <>", value, "id");

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
            addCriterion("BPM_ROLE.ID is null OR BPM_ROLE.ID <>", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_ROLE.ID");
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
            addCriterion("BPM_ROLE.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_ROLE.ID");
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
            addCriterion("BPM_ROLE.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_ROLE.ID");
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
            addCriterion("BPM_ROLE.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_ROLE.ID");
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
            addCriterion("BPM_ROLE.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("BPM_ROLE.ID");
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
                addCriterion("BPM_ROLE.ID in", values, "id");

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
                addCriterion("BPM_ROLE.ID not in", values, "id");

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
                addCriterion("BPM_ROLE.ID in", values, "id");

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
                addCriterion("BPM_ROLE.ID not in", values, "id");

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
                addCriterion("BPM_ROLE.ID in", Arrays.asList(values), "id");

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
                addCriterion("BPM_ROLE.ID not in", Arrays.asList(values), "id");

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
            addCriterion("BPM_ROLE.ID between", value1, value2, "id");

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
            addCriterion("BPM_ROLE.ID between", value1, value2, "id");

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
            addCriterion("BPM_ROLE.ID not between", value1, value2, "id");

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
            addCriterion("BPM_ROLE.ID not between", value1, value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("BPM_ROLE.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("BPM_ROLE.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "BPM_ROLE.REMARKS is not null AND BPM_ROLE.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion("(BPM_ROLE.REMARKS is null OR BPM_ROLE.REMARKS = '')");

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
            addCriterion("BPM_ROLE.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("BPM_ROLE.REMARKS");
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
            addCriterion("BPM_ROLE.REMARKS <>", value, "remarks");

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
            addCriterion("BPM_ROLE.REMARKS is null OR BPM_ROLE.REMARKS <>",
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
            StringBuffer str = new StringBuffer("BPM_ROLE.REMARKS");
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
            addCriterion("BPM_ROLE.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("BPM_ROLE.REMARKS");
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
            addCriterion("BPM_ROLE.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("BPM_ROLE.REMARKS");
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
            addCriterion("BPM_ROLE.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("BPM_ROLE.REMARKS");
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
            addCriterion("BPM_ROLE.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("BPM_ROLE.REMARKS");
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
            addCriterion("BPM_ROLE.REMARKS like", buffer.toString(), "remarks");

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
            addCriterion("BPM_ROLE.REMARKS not like", buffer.toString(),
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
                addCriterion("BPM_ROLE.REMARKS in", values, "remarks");

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
                addCriterion("BPM_ROLE.REMARKS not in", values, "remarks");

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
                addCriterion("BPM_ROLE.REMARKS in", Arrays.asList(values),
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
                addCriterion("BPM_ROLE.REMARKS not in", Arrays.asList(values),
                    "remarks");

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
            addCriterion("BPM_ROLE.REMARKS between", value1, value2, "remarks");

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
            addCriterion("BPM_ROLE.REMARKS not between", value1, value2,
                "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleKeyIsNull() {
            addCriterion("BPM_ROLE.ROLE_KEY is null");

            return this;
        } // end andRoleKeyIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleKeyIsNotNull() {
            addCriterion("BPM_ROLE.ROLE_KEY is not null");

            return this;
        } // end andRoleKeyIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleKeyIsNotEmpty() {
            addCriterion(
                "BPM_ROLE.ROLE_KEY is not null AND BPM_ROLE.ROLE_KEY <> ''");

            return this;
        } // end andRoleKeyIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleKeyIsEmpty() {
            addCriterion(
                "(BPM_ROLE.ROLE_KEY is null OR BPM_ROLE.ROLE_KEY = '')");

            return this;
        } // end andRoleKeyIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleKeyEqualTo(String value) {
            addCriterion("BPM_ROLE.ROLE_KEY =", value, "roleKey");

            return this;
        } // end andRoleKeyEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleKeyEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ROLE.ROLE_KEY");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleKeyEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleKeyNotEqualTo(String value) {
            addCriterion("BPM_ROLE.ROLE_KEY <>", value, "roleKey");

            return this;
        } // end andRoleKeyNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleKeyNotEqualToOrIsNull(String value) {
            addCriterion("BPM_ROLE.ROLE_KEY is null OR BPM_ROLE.ROLE_KEY <>",
                value, "roleKey");

            return this;
        } // end andRoleKeyNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleKeyNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ROLE.ROLE_KEY");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleKeyNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleKeyGreaterThan(String value) {
            addCriterion("BPM_ROLE.ROLE_KEY >", value, "roleKey");

            return this;
        } // end andRoleKeyGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleKeyGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ROLE.ROLE_KEY");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleKeyGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleKeyGreaterThanOrEqualTo(String value) {
            addCriterion("BPM_ROLE.ROLE_KEY >=", value, "roleKey");

            return this;
        } // end andRoleKeyGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleKeyGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ROLE.ROLE_KEY");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleKeyGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleKeyLessThan(String value) {
            addCriterion("BPM_ROLE.ROLE_KEY <", value, "roleKey");

            return this;
        } // end andRoleKeyLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleKeyLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ROLE.ROLE_KEY");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleKeyLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleKeyLessThanOrEqualTo(String value) {
            addCriterion("BPM_ROLE.ROLE_KEY <=", value, "roleKey");

            return this;
        } // end andRoleKeyLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleKeyLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ROLE.ROLE_KEY");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRoleKeyLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleKeyLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_ROLE.ROLE_KEY like", buffer.toString(), "roleKey");

            return this;
        } // end andRoleKeyLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleKeyNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BPM_ROLE.ROLE_KEY not like", buffer.toString(),
                "roleKey");

            return this;
        } // end andRoleKeyNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleKeyIn(List values) {
            if (values.size() == 1) {
                return andRoleKeyEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_ROLE.ROLE_KEY in", values, "roleKey");

                return this;
            } // end else
        } // end andRoleKeyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleKeyNotIn(List values) {
            if (values.size() == 1) {
                return andRoleKeyNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BPM_ROLE.ROLE_KEY not in", values, "roleKey");

                return this;
            } // end else
        } // end andRoleKeyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleKeyIn(Object[] values) {
            if (values.length == 1) {
                return andRoleKeyEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_ROLE.ROLE_KEY in", Arrays.asList(values),
                    "roleKey");

                return this;
            } // end else
        } // end andRoleKeyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleKeyNotIn(Object[] values) {
            if (values.length == 1) {
                return andRoleKeyNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BPM_ROLE.ROLE_KEY not in", Arrays.asList(values),
                    "roleKey");

                return this;
            } // end else
        } // end andRoleKeyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleKeyBetween(String value1, String value2) {
            addCriterion("BPM_ROLE.ROLE_KEY between", value1, value2, "roleKey");

            return this;
        } // end andRoleKeyBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleKeyNotBetween(String value1, String value2) {
            addCriterion("BPM_ROLE.ROLE_KEY not between", value1, value2,
                "roleKey");

            return this;
        } // end andRoleKeyNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameIsNull() {
            addCriterion("BPM_ROLE.ROLE_NAME is null");

            return this;
        } // end andRoleNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameIsNotNull() {
            addCriterion("BPM_ROLE.ROLE_NAME is not null");

            return this;
        } // end andRoleNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameIsNotEmpty() {
            addCriterion(
                "BPM_ROLE.ROLE_NAME is not null AND BPM_ROLE.ROLE_NAME <> ''");

            return this;
        } // end andRoleNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRoleNameIsEmpty() {
            addCriterion(
                "(BPM_ROLE.ROLE_NAME is null OR BPM_ROLE.ROLE_NAME = '')");

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
            addCriterion("BPM_ROLE.ROLE_NAME =", value, "roleName");

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
            StringBuffer str = new StringBuffer("BPM_ROLE.ROLE_NAME");
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
            addCriterion("BPM_ROLE.ROLE_NAME <>", value, "roleName");

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
            addCriterion("BPM_ROLE.ROLE_NAME is null OR BPM_ROLE.ROLE_NAME <>",
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
            StringBuffer str = new StringBuffer("BPM_ROLE.ROLE_NAME");
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
            addCriterion("BPM_ROLE.ROLE_NAME >", value, "roleName");

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
            StringBuffer str = new StringBuffer("BPM_ROLE.ROLE_NAME");
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
            addCriterion("BPM_ROLE.ROLE_NAME >=", value, "roleName");

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
            StringBuffer str = new StringBuffer("BPM_ROLE.ROLE_NAME");
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
            addCriterion("BPM_ROLE.ROLE_NAME <", value, "roleName");

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
            StringBuffer str = new StringBuffer("BPM_ROLE.ROLE_NAME");
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
            addCriterion("BPM_ROLE.ROLE_NAME <=", value, "roleName");

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
            StringBuffer str = new StringBuffer("BPM_ROLE.ROLE_NAME");
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
            addCriterion("BPM_ROLE.ROLE_NAME like", buffer.toString(),
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
            addCriterion("BPM_ROLE.ROLE_NAME not like", buffer.toString(),
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
                addCriterion("BPM_ROLE.ROLE_NAME in", values, "roleName");

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
                addCriterion("BPM_ROLE.ROLE_NAME not in", values, "roleName");

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
                addCriterion("BPM_ROLE.ROLE_NAME in", Arrays.asList(values),
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
                addCriterion("BPM_ROLE.ROLE_NAME not in",
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
            addCriterion("BPM_ROLE.ROLE_NAME between", value1, value2,
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
            addCriterion("BPM_ROLE.ROLE_NAME not between", value1, value2,
                "roleName");

            return this;
        } // end andRoleNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("BPM_ROLE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("BPM_ROLE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "BPM_ROLE.STATUS is not null AND BPM_ROLE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion("(BPM_ROLE.STATUS is null OR BPM_ROLE.STATUS = '')");

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
            addCriterion("BPM_ROLE.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_ROLE.STATUS");
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
            addCriterion("BPM_ROLE.STATUS <>", value, "status");

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
            addCriterion("BPM_ROLE.STATUS is null OR BPM_ROLE.STATUS <>",
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
            StringBuffer str = new StringBuffer("BPM_ROLE.STATUS");
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
            addCriterion("BPM_ROLE.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_ROLE.STATUS");
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
            addCriterion("BPM_ROLE.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_ROLE.STATUS");
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
            addCriterion("BPM_ROLE.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_ROLE.STATUS");
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
            addCriterion("BPM_ROLE.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("BPM_ROLE.STATUS");
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
            addCriterion("BPM_ROLE.STATUS like", buffer.toString(), "status");

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
            addCriterion("BPM_ROLE.STATUS not like", buffer.toString(), "status");

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
                addCriterion("BPM_ROLE.STATUS in", values, "status");

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
                addCriterion("BPM_ROLE.STATUS not in", values, "status");

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
                addCriterion("BPM_ROLE.STATUS in", Arrays.asList(values),
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
                addCriterion("BPM_ROLE.STATUS not in", Arrays.asList(values),
                    "status");

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
            addCriterion("BPM_ROLE.STATUS between", value1, value2, "status");

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
            addCriterion("BPM_ROLE.STATUS not between", value1, value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdIsNull() {
            addCriterion("BPM_ROLE.SYS_MODULE_ID is null");

            return this;
        } // end andSysModuleIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdIsNotNull() {
            addCriterion("BPM_ROLE.SYS_MODULE_ID is not null");

            return this;
        } // end andSysModuleIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdIsNotEmpty() {
            addCriterion(
                "BPM_ROLE.SYS_MODULE_ID is not null AND BPM_ROLE.SYS_MODULE_ID <> ''");

            return this;
        } // end andSysModuleIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdIsEmpty() {
            addCriterion(
                "(BPM_ROLE.SYS_MODULE_ID is null OR BPM_ROLE.SYS_MODULE_ID = '')");

            return this;
        } // end andSysModuleIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdEqualTo(long value) {
            return andSysModuleIdEqualTo(Long.valueOf(value));
        } // end andSysModuleIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdEqualTo(java.lang.Long value) {
            addCriterion("BPM_ROLE.SYS_MODULE_ID =", value, "sysModuleId");

            return this;
        } // end andSysModuleIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ROLE.SYS_MODULE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysModuleIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdNotEqualTo(long value) {
            return andSysModuleIdNotEqualTo(Long.valueOf(value));
        } // end andSysModuleIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdNotEqualTo(java.lang.Long value) {
            addCriterion("BPM_ROLE.SYS_MODULE_ID <>", value, "sysModuleId");

            return this;
        } // end andSysModuleIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdNotEqualToOrIsNull(long value) {
            return andSysModuleIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andSysModuleIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("BPM_ROLE.SYS_MODULE_ID is null OR BPM_ROLE.SYS_MODULE_ID <>",
                value, "sysModuleId");

            return this;
        } // end andSysModuleIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ROLE.SYS_MODULE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysModuleIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdGreaterThan(long value) {
            return andSysModuleIdGreaterThan(Long.valueOf(value));
        } // end andSysModuleIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdGreaterThan(java.lang.Long value) {
            addCriterion("BPM_ROLE.SYS_MODULE_ID >", value, "sysModuleId");

            return this;
        } // end andSysModuleIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ROLE.SYS_MODULE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysModuleIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdGreaterThanOrEqualTo(long value) {
            return andSysModuleIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andSysModuleIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_ROLE.SYS_MODULE_ID >=", value, "sysModuleId");

            return this;
        } // end andSysModuleIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ROLE.SYS_MODULE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysModuleIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdLessThan(long value) {
            return andSysModuleIdLessThan(Long.valueOf(value));
        } // end andSysModuleIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdLessThan(java.lang.Long value) {
            addCriterion("BPM_ROLE.SYS_MODULE_ID <", value, "sysModuleId");

            return this;
        } // end andSysModuleIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ROLE.SYS_MODULE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysModuleIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdLessThanOrEqualTo(long value) {
            return andSysModuleIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andSysModuleIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_ROLE.SYS_MODULE_ID <=", value, "sysModuleId");

            return this;
        } // end andSysModuleIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ROLE.SYS_MODULE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysModuleIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdIn(long[] values) {
            if (values.length == 1) {
                return andSysModuleIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_ROLE.SYS_MODULE_ID in", values, "sysModuleId");

                return this;
            } // end else
        } // end andSysModuleIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdNotIn(long[] values) {
            if (values.length == 1) {
                return andSysModuleIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_ROLE.SYS_MODULE_ID not in", values,
                    "sysModuleId");

                return this;
            } // end else
        } // end andSysModuleIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdIn(List values) {
            if (values.size() == 1) {
                return andSysModuleIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_ROLE.SYS_MODULE_ID in", values, "sysModuleId");

                return this;
            } // end else
        } // end andSysModuleIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdNotIn(List values) {
            if (values.size() == 1) {
                return andSysModuleIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_ROLE.SYS_MODULE_ID not in", values,
                    "sysModuleId");

                return this;
            } // end else
        } // end andSysModuleIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdIn(Object[] values) {
            if (values.length == 1) {
                return andSysModuleIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_ROLE.SYS_MODULE_ID in",
                    Arrays.asList(values), "sysModuleId");

                return this;
            } // end else
        } // end andSysModuleIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andSysModuleIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_ROLE.SYS_MODULE_ID not in",
                    Arrays.asList(values), "sysModuleId");

                return this;
            } // end else
        } // end andSysModuleIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdBetween(long value1, long value2) {
            addCriterion("BPM_ROLE.SYS_MODULE_ID between", value1, value2,
                "sysModuleId");

            return this;
        } // end andSysModuleIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_ROLE.SYS_MODULE_ID between", value1, value2,
                "sysModuleId");

            return this;
        } // end andSysModuleIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdNotBetween(long value1, long value2) {
            addCriterion("BPM_ROLE.SYS_MODULE_ID not between", value1, value2,
                "sysModuleId");

            return this;
        } // end andSysModuleIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_ROLE.SYS_MODULE_ID not between", value1, value2,
                "sysModuleId");

            return this;
        } // end andSysModuleIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameIsNull() {
            addCriterion("sysModuleB.MODULE_NAME is null");

            return this;
        } // end andSysModuleNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameIsNotNull() {
            addCriterion("sysModuleB.MODULE_NAME is not null");

            return this;
        } // end andSysModuleNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameIsNotEmpty() {
            addCriterion(
                "sysModuleB.MODULE_NAME is not null AND sysModuleB.MODULE_NAME <> ''");

            return this;
        } // end andSysModuleNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameIsEmpty() {
            addCriterion(
                "(sysModuleB.MODULE_NAME is null OR sysModuleB.MODULE_NAME = '')");

            return this;
        } // end andSysModuleNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameEqualTo(String value) {
            addCriterion("sysModuleB.MODULE_NAME =", value, "sysModuleName");

            return this;
        } // end andSysModuleNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleB.MODULE_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysModuleNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameNotEqualTo(String value) {
            addCriterion("sysModuleB.MODULE_NAME <>", value, "sysModuleName");

            return this;
        } // end andSysModuleNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameNotEqualToOrIsNull(String value) {
            addCriterion("sysModuleB.MODULE_NAME is null OR sysModuleB.MODULE_NAME <>",
                value, "sysModuleName");

            return this;
        } // end andSysModuleNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleB.MODULE_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysModuleNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameGreaterThan(String value) {
            addCriterion("sysModuleB.MODULE_NAME >", value, "sysModuleName");

            return this;
        } // end andSysModuleNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleB.MODULE_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysModuleNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("sysModuleB.MODULE_NAME >=", value, "sysModuleName");

            return this;
        } // end andSysModuleNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleB.MODULE_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysModuleNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameLessThan(String value) {
            addCriterion("sysModuleB.MODULE_NAME <", value, "sysModuleName");

            return this;
        } // end andSysModuleNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleB.MODULE_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysModuleNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameLessThanOrEqualTo(String value) {
            addCriterion("sysModuleB.MODULE_NAME <=", value, "sysModuleName");

            return this;
        } // end andSysModuleNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleB.MODULE_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysModuleNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysModuleB.MODULE_NAME like", buffer.toString(),
                "sysModuleName");

            return this;
        } // end andSysModuleNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysModuleB.MODULE_NAME not like", buffer.toString(),
                "sysModuleName");

            return this;
        } // end andSysModuleNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameIn(List values) {
            if (values.size() == 1) {
                return andSysModuleNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysModuleB.MODULE_NAME in", values,
                    "sysModuleName");

                return this;
            } // end else
        } // end andSysModuleNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameNotIn(List values) {
            if (values.size() == 1) {
                return andSysModuleNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysModuleB.MODULE_NAME not in", values,
                    "sysModuleName");

                return this;
            } // end else
        } // end andSysModuleNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameIn(Object[] values) {
            if (values.length == 1) {
                return andSysModuleNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysModuleB.MODULE_NAME in",
                    Arrays.asList(values), "sysModuleName");

                return this;
            } // end else
        } // end andSysModuleNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andSysModuleNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysModuleB.MODULE_NAME not in",
                    Arrays.asList(values), "sysModuleName");

                return this;
            } // end else
        } // end andSysModuleNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameBetween(String value1, String value2) {
            addCriterion("sysModuleB.MODULE_NAME between", value1, value2,
                "sysModuleName");

            return this;
        } // end andSysModuleNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleNameNotBetween(String value1, String value2) {
            addCriterion("sysModuleB.MODULE_NAME not between", value1, value2,
                "sysModuleName");

            return this;
        } // end andSysModuleNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeIsNull() {
            addCriterion("sysModuleB.MODULE_CODE is null");

            return this;
        } // end andSysModuleCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeIsNotNull() {
            addCriterion("sysModuleB.MODULE_CODE is not null");

            return this;
        } // end andSysModuleCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeIsNotEmpty() {
            addCriterion(
                "sysModuleB.MODULE_CODE is not null AND sysModuleB.MODULE_CODE <> ''");

            return this;
        } // end andSysModuleCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeIsEmpty() {
            addCriterion(
                "(sysModuleB.MODULE_CODE is null OR sysModuleB.MODULE_CODE = '')");

            return this;
        } // end andSysModuleCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeEqualTo(String value) {
            addCriterion("sysModuleB.MODULE_CODE =", value, "sysModuleCode");

            return this;
        } // end andSysModuleCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleB.MODULE_CODE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysModuleCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeNotEqualTo(String value) {
            addCriterion("sysModuleB.MODULE_CODE <>", value, "sysModuleCode");

            return this;
        } // end andSysModuleCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeNotEqualToOrIsNull(String value) {
            addCriterion("sysModuleB.MODULE_CODE is null OR sysModuleB.MODULE_CODE <>",
                value, "sysModuleCode");

            return this;
        } // end andSysModuleCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleB.MODULE_CODE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysModuleCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeGreaterThan(String value) {
            addCriterion("sysModuleB.MODULE_CODE >", value, "sysModuleCode");

            return this;
        } // end andSysModuleCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleB.MODULE_CODE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysModuleCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sysModuleB.MODULE_CODE >=", value, "sysModuleCode");

            return this;
        } // end andSysModuleCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleB.MODULE_CODE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysModuleCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeLessThan(String value) {
            addCriterion("sysModuleB.MODULE_CODE <", value, "sysModuleCode");

            return this;
        } // end andSysModuleCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleB.MODULE_CODE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysModuleCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeLessThanOrEqualTo(String value) {
            addCriterion("sysModuleB.MODULE_CODE <=", value, "sysModuleCode");

            return this;
        } // end andSysModuleCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleB.MODULE_CODE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysModuleCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysModuleB.MODULE_CODE like", buffer.toString(),
                "sysModuleCode");

            return this;
        } // end andSysModuleCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysModuleB.MODULE_CODE not like", buffer.toString(),
                "sysModuleCode");

            return this;
        } // end andSysModuleCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeIn(List values) {
            if (values.size() == 1) {
                return andSysModuleCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysModuleB.MODULE_CODE in", values,
                    "sysModuleCode");

                return this;
            } // end else
        } // end andSysModuleCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeNotIn(List values) {
            if (values.size() == 1) {
                return andSysModuleCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysModuleB.MODULE_CODE not in", values,
                    "sysModuleCode");

                return this;
            } // end else
        } // end andSysModuleCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeIn(Object[] values) {
            if (values.length == 1) {
                return andSysModuleCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysModuleB.MODULE_CODE in",
                    Arrays.asList(values), "sysModuleCode");

                return this;
            } // end else
        } // end andSysModuleCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andSysModuleCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysModuleB.MODULE_CODE not in",
                    Arrays.asList(values), "sysModuleCode");

                return this;
            } // end else
        } // end andSysModuleCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeBetween(String value1, String value2) {
            addCriterion("sysModuleB.MODULE_CODE between", value1, value2,
                "sysModuleCode");

            return this;
        } // end andSysModuleCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleCodeNotBetween(String value1, String value2) {
            addCriterion("sysModuleB.MODULE_CODE not between", value1, value2,
                "sysModuleCode");

            return this;
        } // end andSysModuleCodeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdIsNull() {
            addCriterion("BPM_ROLE.BPM_DOMAIN_ID is null");

            return this;
        } // end andBpmDomainIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdIsNotNull() {
            addCriterion("BPM_ROLE.BPM_DOMAIN_ID is not null");

            return this;
        } // end andBpmDomainIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdIsNotEmpty() {
            addCriterion(
                "BPM_ROLE.BPM_DOMAIN_ID is not null AND BPM_ROLE.BPM_DOMAIN_ID <> ''");

            return this;
        } // end andBpmDomainIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdIsEmpty() {
            addCriterion(
                "(BPM_ROLE.BPM_DOMAIN_ID is null OR BPM_ROLE.BPM_DOMAIN_ID = '')");

            return this;
        } // end andBpmDomainIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdEqualTo(long value) {
            return andBpmDomainIdEqualTo(Long.valueOf(value));
        } // end andBpmDomainIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdEqualTo(java.lang.Long value) {
            addCriterion("BPM_ROLE.BPM_DOMAIN_ID =", value, "bpmDomainId");

            return this;
        } // end andBpmDomainIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ROLE.BPM_DOMAIN_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBpmDomainIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdNotEqualTo(long value) {
            return andBpmDomainIdNotEqualTo(Long.valueOf(value));
        } // end andBpmDomainIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdNotEqualTo(java.lang.Long value) {
            addCriterion("BPM_ROLE.BPM_DOMAIN_ID <>", value, "bpmDomainId");

            return this;
        } // end andBpmDomainIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdNotEqualToOrIsNull(long value) {
            return andBpmDomainIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andBpmDomainIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("BPM_ROLE.BPM_DOMAIN_ID is null OR BPM_ROLE.BPM_DOMAIN_ID <>",
                value, "bpmDomainId");

            return this;
        } // end andBpmDomainIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ROLE.BPM_DOMAIN_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBpmDomainIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdGreaterThan(long value) {
            return andBpmDomainIdGreaterThan(Long.valueOf(value));
        } // end andBpmDomainIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdGreaterThan(java.lang.Long value) {
            addCriterion("BPM_ROLE.BPM_DOMAIN_ID >", value, "bpmDomainId");

            return this;
        } // end andBpmDomainIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ROLE.BPM_DOMAIN_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBpmDomainIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdGreaterThanOrEqualTo(long value) {
            return andBpmDomainIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andBpmDomainIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_ROLE.BPM_DOMAIN_ID >=", value, "bpmDomainId");

            return this;
        } // end andBpmDomainIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ROLE.BPM_DOMAIN_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBpmDomainIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdLessThan(long value) {
            return andBpmDomainIdLessThan(Long.valueOf(value));
        } // end andBpmDomainIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdLessThan(java.lang.Long value) {
            addCriterion("BPM_ROLE.BPM_DOMAIN_ID <", value, "bpmDomainId");

            return this;
        } // end andBpmDomainIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ROLE.BPM_DOMAIN_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBpmDomainIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdLessThanOrEqualTo(long value) {
            return andBpmDomainIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andBpmDomainIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("BPM_ROLE.BPM_DOMAIN_ID <=", value, "bpmDomainId");

            return this;
        } // end andBpmDomainIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BPM_ROLE.BPM_DOMAIN_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBpmDomainIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdIn(long[] values) {
            if (values.length == 1) {
                return andBpmDomainIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_ROLE.BPM_DOMAIN_ID in", values, "bpmDomainId");

                return this;
            } // end else
        } // end andBpmDomainIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdNotIn(long[] values) {
            if (values.length == 1) {
                return andBpmDomainIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BPM_ROLE.BPM_DOMAIN_ID not in", values,
                    "bpmDomainId");

                return this;
            } // end else
        } // end andBpmDomainIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdIn(List values) {
            if (values.size() == 1) {
                return andBpmDomainIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_ROLE.BPM_DOMAIN_ID in", values, "bpmDomainId");

                return this;
            } // end else
        } // end andBpmDomainIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdNotIn(List values) {
            if (values.size() == 1) {
                return andBpmDomainIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BPM_ROLE.BPM_DOMAIN_ID not in", values,
                    "bpmDomainId");

                return this;
            } // end else
        } // end andBpmDomainIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdIn(Object[] values) {
            if (values.length == 1) {
                return andBpmDomainIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_ROLE.BPM_DOMAIN_ID in",
                    Arrays.asList(values), "bpmDomainId");

                return this;
            } // end else
        } // end andBpmDomainIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andBpmDomainIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BPM_ROLE.BPM_DOMAIN_ID not in",
                    Arrays.asList(values), "bpmDomainId");

                return this;
            } // end else
        } // end andBpmDomainIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdBetween(long value1, long value2) {
            addCriterion("BPM_ROLE.BPM_DOMAIN_ID between", value1, value2,
                "bpmDomainId");

            return this;
        } // end andBpmDomainIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_ROLE.BPM_DOMAIN_ID between", value1, value2,
                "bpmDomainId");

            return this;
        } // end andBpmDomainIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdNotBetween(long value1, long value2) {
            addCriterion("BPM_ROLE.BPM_DOMAIN_ID not between", value1, value2,
                "bpmDomainId");

            return this;
        } // end andBpmDomainIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BPM_ROLE.BPM_DOMAIN_ID not between", value1, value2,
                "bpmDomainId");

            return this;
        } // end andBpmDomainIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainCodeIsNull() {
            addCriterion("bpmDomainB.CODE is null");

            return this;
        } // end andBpmDomainCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainCodeIsNotNull() {
            addCriterion("bpmDomainB.CODE is not null");

            return this;
        } // end andBpmDomainCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainCodeIsNotEmpty() {
            addCriterion(
                "bpmDomainB.CODE is not null AND bpmDomainB.CODE <> ''");

            return this;
        } // end andBpmDomainCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainCodeIsEmpty() {
            addCriterion("(bpmDomainB.CODE is null OR bpmDomainB.CODE = '')");

            return this;
        } // end andBpmDomainCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainCodeEqualTo(String value) {
            addCriterion("bpmDomainB.CODE =", value, "bpmDomainCode");

            return this;
        } // end andBpmDomainCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainCodeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmDomainB.CODE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBpmDomainCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainCodeNotEqualTo(String value) {
            addCriterion("bpmDomainB.CODE <>", value, "bpmDomainCode");

            return this;
        } // end andBpmDomainCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainCodeNotEqualToOrIsNull(String value) {
            addCriterion("bpmDomainB.CODE is null OR bpmDomainB.CODE <>",
                value, "bpmDomainCode");

            return this;
        } // end andBpmDomainCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainCodeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmDomainB.CODE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBpmDomainCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainCodeGreaterThan(String value) {
            addCriterion("bpmDomainB.CODE >", value, "bpmDomainCode");

            return this;
        } // end andBpmDomainCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainCodeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmDomainB.CODE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBpmDomainCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bpmDomainB.CODE >=", value, "bpmDomainCode");

            return this;
        } // end andBpmDomainCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmDomainB.CODE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBpmDomainCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainCodeLessThan(String value) {
            addCriterion("bpmDomainB.CODE <", value, "bpmDomainCode");

            return this;
        } // end andBpmDomainCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainCodeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmDomainB.CODE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBpmDomainCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainCodeLessThanOrEqualTo(String value) {
            addCriterion("bpmDomainB.CODE <=", value, "bpmDomainCode");

            return this;
        } // end andBpmDomainCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainCodeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmDomainB.CODE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBpmDomainCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("bpmDomainB.CODE like", buffer.toString(),
                "bpmDomainCode");

            return this;
        } // end andBpmDomainCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("bpmDomainB.CODE not like", buffer.toString(),
                "bpmDomainCode");

            return this;
        } // end andBpmDomainCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainCodeIn(List values) {
            if (values.size() == 1) {
                return andBpmDomainCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("bpmDomainB.CODE in", values, "bpmDomainCode");

                return this;
            } // end else
        } // end andBpmDomainCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainCodeNotIn(List values) {
            if (values.size() == 1) {
                return andBpmDomainCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("bpmDomainB.CODE not in", values, "bpmDomainCode");

                return this;
            } // end else
        } // end andBpmDomainCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainCodeIn(Object[] values) {
            if (values.length == 1) {
                return andBpmDomainCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("bpmDomainB.CODE in", Arrays.asList(values),
                    "bpmDomainCode");

                return this;
            } // end else
        } // end andBpmDomainCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andBpmDomainCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("bpmDomainB.CODE not in", Arrays.asList(values),
                    "bpmDomainCode");

                return this;
            } // end else
        } // end andBpmDomainCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainCodeBetween(String value1, String value2) {
            addCriterion("bpmDomainB.CODE between", value1, value2,
                "bpmDomainCode");

            return this;
        } // end andBpmDomainCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainCodeNotBetween(String value1, String value2) {
            addCriterion("bpmDomainB.CODE not between", value1, value2,
                "bpmDomainCode");

            return this;
        } // end andBpmDomainCodeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainNameIsNull() {
            addCriterion("bpmDomainB.NAME is null");

            return this;
        } // end andBpmDomainNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainNameIsNotNull() {
            addCriterion("bpmDomainB.NAME is not null");

            return this;
        } // end andBpmDomainNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainNameIsNotEmpty() {
            addCriterion(
                "bpmDomainB.NAME is not null AND bpmDomainB.NAME <> ''");

            return this;
        } // end andBpmDomainNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainNameIsEmpty() {
            addCriterion("(bpmDomainB.NAME is null OR bpmDomainB.NAME = '')");

            return this;
        } // end andBpmDomainNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainNameEqualTo(String value) {
            addCriterion("bpmDomainB.NAME =", value, "bpmDomainName");

            return this;
        } // end andBpmDomainNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmDomainB.NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBpmDomainNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainNameNotEqualTo(String value) {
            addCriterion("bpmDomainB.NAME <>", value, "bpmDomainName");

            return this;
        } // end andBpmDomainNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainNameNotEqualToOrIsNull(String value) {
            addCriterion("bpmDomainB.NAME is null OR bpmDomainB.NAME <>",
                value, "bpmDomainName");

            return this;
        } // end andBpmDomainNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmDomainB.NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBpmDomainNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainNameGreaterThan(String value) {
            addCriterion("bpmDomainB.NAME >", value, "bpmDomainName");

            return this;
        } // end andBpmDomainNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmDomainB.NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBpmDomainNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainNameGreaterThanOrEqualTo(String value) {
            addCriterion("bpmDomainB.NAME >=", value, "bpmDomainName");

            return this;
        } // end andBpmDomainNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmDomainB.NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBpmDomainNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainNameLessThan(String value) {
            addCriterion("bpmDomainB.NAME <", value, "bpmDomainName");

            return this;
        } // end andBpmDomainNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmDomainB.NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBpmDomainNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainNameLessThanOrEqualTo(String value) {
            addCriterion("bpmDomainB.NAME <=", value, "bpmDomainName");

            return this;
        } // end andBpmDomainNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("bpmDomainB.NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBpmDomainNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("bpmDomainB.NAME like", buffer.toString(),
                "bpmDomainName");

            return this;
        } // end andBpmDomainNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("bpmDomainB.NAME not like", buffer.toString(),
                "bpmDomainName");

            return this;
        } // end andBpmDomainNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainNameIn(List values) {
            if (values.size() == 1) {
                return andBpmDomainNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("bpmDomainB.NAME in", values, "bpmDomainName");

                return this;
            } // end else
        } // end andBpmDomainNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainNameNotIn(List values) {
            if (values.size() == 1) {
                return andBpmDomainNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("bpmDomainB.NAME not in", values, "bpmDomainName");

                return this;
            } // end else
        } // end andBpmDomainNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainNameIn(Object[] values) {
            if (values.length == 1) {
                return andBpmDomainNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("bpmDomainB.NAME in", Arrays.asList(values),
                    "bpmDomainName");

                return this;
            } // end else
        } // end andBpmDomainNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andBpmDomainNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("bpmDomainB.NAME not in", Arrays.asList(values),
                    "bpmDomainName");

                return this;
            } // end else
        } // end andBpmDomainNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainNameBetween(String value1, String value2) {
            addCriterion("bpmDomainB.NAME between", value1, value2,
                "bpmDomainName");

            return this;
        } // end andBpmDomainNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainNameNotBetween(String value1, String value2) {
            addCriterion("bpmDomainB.NAME not between", value1, value2,
                "bpmDomainName");

            return this;
        } // end andBpmDomainNameNotBetween()
    } // end Criteria
} // end BpmRoleDAOQueryBean
