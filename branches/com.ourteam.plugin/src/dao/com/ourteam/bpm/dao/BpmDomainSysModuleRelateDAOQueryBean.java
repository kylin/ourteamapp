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
 * BpmDomainSysModuleRelate query bean 2011-11-04 10:00:54
 *
 * @author Auto Gen
 */
public class BpmDomainSysModuleRelateDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new BpmDomainSysModuleRelateDAOQueryBean object.
     */
    public BpmDomainSysModuleRelateDAOQueryBean() {
        super();
    } // end BpmDomainSysModuleRelateDAOQueryBean()

    /**
     * Creates a new BpmDomainSysModuleRelateDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public BpmDomainSysModuleRelateDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end BpmDomainSysModuleRelateDAOQueryBean()

    /**
     * Creates a new BpmDomainSysModuleRelateDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public BpmDomainSysModuleRelateDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end BpmDomainSysModuleRelateDAOQueryBean()

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
            addSelectProperty(IBpmDomainSysModuleRelateDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmDomainSysModuleRelateDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

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
            addSelectProperty(IBpmDomainSysModuleRelateDAO.BpmDomainId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmDomainSysModuleRelateDAO.BpmDomainId,
                "bpmDomainId");
        } // end else
    } // end addBpmDomainIdSelectProperty()

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
            addSelectProperty(IBpmDomainSysModuleRelateDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmDomainSysModuleRelateDAO.Remarks, "remarks");
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
            addSelectProperty(IBpmDomainSysModuleRelateDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmDomainSysModuleRelateDAO.Status, "status");
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
            addSelectProperty(IBpmDomainSysModuleRelateDAO.SysModuleId, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmDomainSysModuleRelateDAO.SysModuleId,
                "sysModuleId");
        } // end else
    } // end addSysModuleIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addModuleNameSelectProperty() {
        addModuleNameSelectProperty("moduleName");
    } // end addModuleNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addModuleNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmDomainSysModuleRelateDAO.ModuleName, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmDomainSysModuleRelateDAO.ModuleName,
                "moduleName");
        } // end else
    } // end addModuleNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addModuleCodeSelectProperty() {
        addModuleCodeSelectProperty("moduleCode");
    } // end addModuleCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addModuleCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmDomainSysModuleRelateDAO.ModuleCode, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmDomainSysModuleRelateDAO.ModuleCode,
                "moduleCode");
        } // end else
    } // end addModuleCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addModuleIconSelectProperty() {
        addModuleIconSelectProperty("moduleIcon");
    } // end addModuleIconSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addModuleIconSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBpmDomainSysModuleRelateDAO.ModuleIcon, aAlias);
        } // end if
        else {
            addSelectProperty(IBpmDomainSysModuleRelateDAO.ModuleIcon,
                "moduleIcon");
        } // end else
    } // end addModuleIconSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addBpmDomainIdSelectProperty();

        addRemarksSelectProperty();

        addStatusSelectProperty();

        addSysModuleIdSelectProperty();

        addModuleNameSelectProperty();

        addModuleCodeSelectProperty();

        addModuleIconSelectProperty();
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "BPM_DOMAIN_SYS_MODULE_RELATE.ID is not null AND BPM_DOMAIN_SYS_MODULE_RELATE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(BPM_DOMAIN_SYS_MODULE_RELATE.ID is null OR BPM_DOMAIN_SYS_MODULE_RELATE.ID = '')");

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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.ID =", value, "id");

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
            StringBuffer str = new StringBuffer(
                    "BPM_DOMAIN_SYS_MODULE_RELATE.ID");
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.ID <>", value, "id");

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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.ID is null OR BPM_DOMAIN_SYS_MODULE_RELATE.ID <>",
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
            StringBuffer str = new StringBuffer(
                    "BPM_DOMAIN_SYS_MODULE_RELATE.ID");
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.ID >", value, "id");

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
            StringBuffer str = new StringBuffer(
                    "BPM_DOMAIN_SYS_MODULE_RELATE.ID");
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer(
                    "BPM_DOMAIN_SYS_MODULE_RELATE.ID");
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.ID <", value, "id");

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
            StringBuffer str = new StringBuffer(
                    "BPM_DOMAIN_SYS_MODULE_RELATE.ID");
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer(
                    "BPM_DOMAIN_SYS_MODULE_RELATE.ID");
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
                addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.ID in", values, "id");

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
                addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.ID not in", values,
                    "id");

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
                addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.ID in", values, "id");

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
                addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.ID not in", values,
                    "id");

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
                addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.ID in",
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
                addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.ID not in",
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.ID between", value1,
                value2, "id");

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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.ID between", value1,
                value2, "id");

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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.ID not between", value1,
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.ID not between", value1,
                value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdIsNull() {
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.BPM_DOMAIN_ID is null");

            return this;
        } // end andBpmDomainIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdIsNotNull() {
            addCriterion(
                "BPM_DOMAIN_SYS_MODULE_RELATE.BPM_DOMAIN_ID is not null");

            return this;
        } // end andBpmDomainIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdIsNotEmpty() {
            addCriterion(
                "BPM_DOMAIN_SYS_MODULE_RELATE.BPM_DOMAIN_ID is not null AND BPM_DOMAIN_SYS_MODULE_RELATE.BPM_DOMAIN_ID <> ''");

            return this;
        } // end andBpmDomainIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBpmDomainIdIsEmpty() {
            addCriterion(
                "(BPM_DOMAIN_SYS_MODULE_RELATE.BPM_DOMAIN_ID is null OR BPM_DOMAIN_SYS_MODULE_RELATE.BPM_DOMAIN_ID = '')");

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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.BPM_DOMAIN_ID =", value,
                "bpmDomainId");

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
            StringBuffer str = new StringBuffer(
                    "BPM_DOMAIN_SYS_MODULE_RELATE.BPM_DOMAIN_ID");
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.BPM_DOMAIN_ID <>",
                value, "bpmDomainId");

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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.BPM_DOMAIN_ID is null OR BPM_DOMAIN_SYS_MODULE_RELATE.BPM_DOMAIN_ID <>",
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
            StringBuffer str = new StringBuffer(
                    "BPM_DOMAIN_SYS_MODULE_RELATE.BPM_DOMAIN_ID");
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.BPM_DOMAIN_ID >", value,
                "bpmDomainId");

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
            StringBuffer str = new StringBuffer(
                    "BPM_DOMAIN_SYS_MODULE_RELATE.BPM_DOMAIN_ID");
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.BPM_DOMAIN_ID >=",
                value, "bpmDomainId");

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
            StringBuffer str = new StringBuffer(
                    "BPM_DOMAIN_SYS_MODULE_RELATE.BPM_DOMAIN_ID");
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.BPM_DOMAIN_ID <", value,
                "bpmDomainId");

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
            StringBuffer str = new StringBuffer(
                    "BPM_DOMAIN_SYS_MODULE_RELATE.BPM_DOMAIN_ID");
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.BPM_DOMAIN_ID <=",
                value, "bpmDomainId");

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
            StringBuffer str = new StringBuffer(
                    "BPM_DOMAIN_SYS_MODULE_RELATE.BPM_DOMAIN_ID");
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
                addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.BPM_DOMAIN_ID in",
                    values, "bpmDomainId");

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
                addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.BPM_DOMAIN_ID not in",
                    values, "bpmDomainId");

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
                addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.BPM_DOMAIN_ID in",
                    values, "bpmDomainId");

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
                addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.BPM_DOMAIN_ID not in",
                    values, "bpmDomainId");

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
                addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.BPM_DOMAIN_ID in",
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
                addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.BPM_DOMAIN_ID not in",
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.BPM_DOMAIN_ID between",
                value1, value2, "bpmDomainId");

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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.BPM_DOMAIN_ID between",
                value1, value2, "bpmDomainId");

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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.BPM_DOMAIN_ID not between",
                value1, value2, "bpmDomainId");

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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.BPM_DOMAIN_ID not between",
                value1, value2, "bpmDomainId");

            return this;
        } // end andBpmDomainIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "BPM_DOMAIN_SYS_MODULE_RELATE.REMARKS is not null AND BPM_DOMAIN_SYS_MODULE_RELATE.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(BPM_DOMAIN_SYS_MODULE_RELATE.REMARKS is null OR BPM_DOMAIN_SYS_MODULE_RELATE.REMARKS = '')");

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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.REMARKS =", value,
                "remarks");

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
                    "BPM_DOMAIN_SYS_MODULE_RELATE.REMARKS");
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.REMARKS <>", value,
                "remarks");

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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.REMARKS is null OR BPM_DOMAIN_SYS_MODULE_RELATE.REMARKS <>",
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
                    "BPM_DOMAIN_SYS_MODULE_RELATE.REMARKS");
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.REMARKS >", value,
                "remarks");

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
                    "BPM_DOMAIN_SYS_MODULE_RELATE.REMARKS");
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.REMARKS >=", value,
                "remarks");

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
                    "BPM_DOMAIN_SYS_MODULE_RELATE.REMARKS");
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.REMARKS <", value,
                "remarks");

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
                    "BPM_DOMAIN_SYS_MODULE_RELATE.REMARKS");
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.REMARKS <=", value,
                "remarks");

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
                    "BPM_DOMAIN_SYS_MODULE_RELATE.REMARKS");
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.REMARKS like",
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.REMARKS not like",
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
                addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.REMARKS in", values,
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
                addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.REMARKS not in",
                    values, "remarks");

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
                addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.REMARKS in",
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
                addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.REMARKS not in",
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.REMARKS between",
                value1, value2, "remarks");

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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.REMARKS not between",
                value1, value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "BPM_DOMAIN_SYS_MODULE_RELATE.STATUS is not null AND BPM_DOMAIN_SYS_MODULE_RELATE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(BPM_DOMAIN_SYS_MODULE_RELATE.STATUS is null OR BPM_DOMAIN_SYS_MODULE_RELATE.STATUS = '')");

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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.STATUS =", value,
                "status");

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
                    "BPM_DOMAIN_SYS_MODULE_RELATE.STATUS");
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.STATUS <>", value,
                "status");

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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.STATUS is null OR BPM_DOMAIN_SYS_MODULE_RELATE.STATUS <>",
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
                    "BPM_DOMAIN_SYS_MODULE_RELATE.STATUS");
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.STATUS >", value,
                "status");

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
                    "BPM_DOMAIN_SYS_MODULE_RELATE.STATUS");
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.STATUS >=", value,
                "status");

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
                    "BPM_DOMAIN_SYS_MODULE_RELATE.STATUS");
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.STATUS <", value,
                "status");

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
                    "BPM_DOMAIN_SYS_MODULE_RELATE.STATUS");
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.STATUS <=", value,
                "status");

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
                    "BPM_DOMAIN_SYS_MODULE_RELATE.STATUS");
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.STATUS like",
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.STATUS not like",
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
                addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.STATUS in", values,
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
                addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.STATUS not in",
                    values, "status");

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
                addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.STATUS in",
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
                addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.STATUS not in",
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.STATUS between", value1,
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.STATUS not between",
                value1, value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdIsNull() {
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.SYS_MODULE_ID is null");

            return this;
        } // end andSysModuleIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdIsNotNull() {
            addCriterion(
                "BPM_DOMAIN_SYS_MODULE_RELATE.SYS_MODULE_ID is not null");

            return this;
        } // end andSysModuleIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdIsNotEmpty() {
            addCriterion(
                "BPM_DOMAIN_SYS_MODULE_RELATE.SYS_MODULE_ID is not null AND BPM_DOMAIN_SYS_MODULE_RELATE.SYS_MODULE_ID <> ''");

            return this;
        } // end andSysModuleIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysModuleIdIsEmpty() {
            addCriterion(
                "(BPM_DOMAIN_SYS_MODULE_RELATE.SYS_MODULE_ID is null OR BPM_DOMAIN_SYS_MODULE_RELATE.SYS_MODULE_ID = '')");

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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.SYS_MODULE_ID =", value,
                "sysModuleId");

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
            StringBuffer str = new StringBuffer(
                    "BPM_DOMAIN_SYS_MODULE_RELATE.SYS_MODULE_ID");
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.SYS_MODULE_ID <>",
                value, "sysModuleId");

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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.SYS_MODULE_ID is null OR BPM_DOMAIN_SYS_MODULE_RELATE.SYS_MODULE_ID <>",
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
            StringBuffer str = new StringBuffer(
                    "BPM_DOMAIN_SYS_MODULE_RELATE.SYS_MODULE_ID");
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.SYS_MODULE_ID >", value,
                "sysModuleId");

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
            StringBuffer str = new StringBuffer(
                    "BPM_DOMAIN_SYS_MODULE_RELATE.SYS_MODULE_ID");
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.SYS_MODULE_ID >=",
                value, "sysModuleId");

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
            StringBuffer str = new StringBuffer(
                    "BPM_DOMAIN_SYS_MODULE_RELATE.SYS_MODULE_ID");
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.SYS_MODULE_ID <", value,
                "sysModuleId");

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
            StringBuffer str = new StringBuffer(
                    "BPM_DOMAIN_SYS_MODULE_RELATE.SYS_MODULE_ID");
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.SYS_MODULE_ID <=",
                value, "sysModuleId");

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
            StringBuffer str = new StringBuffer(
                    "BPM_DOMAIN_SYS_MODULE_RELATE.SYS_MODULE_ID");
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
                addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.SYS_MODULE_ID in",
                    values, "sysModuleId");

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
                addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.SYS_MODULE_ID not in",
                    values, "sysModuleId");

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
                addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.SYS_MODULE_ID in",
                    values, "sysModuleId");

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
                addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.SYS_MODULE_ID not in",
                    values, "sysModuleId");

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
                addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.SYS_MODULE_ID in",
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
                addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.SYS_MODULE_ID not in",
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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.SYS_MODULE_ID between",
                value1, value2, "sysModuleId");

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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.SYS_MODULE_ID between",
                value1, value2, "sysModuleId");

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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.SYS_MODULE_ID not between",
                value1, value2, "sysModuleId");

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
            addCriterion("BPM_DOMAIN_SYS_MODULE_RELATE.SYS_MODULE_ID not between",
                value1, value2, "sysModuleId");

            return this;
        } // end andSysModuleIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleNameIsNull() {
            addCriterion("sysModuleF.MODULE_NAME is null");

            return this;
        } // end andModuleNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleNameIsNotNull() {
            addCriterion("sysModuleF.MODULE_NAME is not null");

            return this;
        } // end andModuleNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleNameIsNotEmpty() {
            addCriterion(
                "sysModuleF.MODULE_NAME is not null AND sysModuleF.MODULE_NAME <> ''");

            return this;
        } // end andModuleNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleNameIsEmpty() {
            addCriterion(
                "(sysModuleF.MODULE_NAME is null OR sysModuleF.MODULE_NAME = '')");

            return this;
        } // end andModuleNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleNameEqualTo(String value) {
            addCriterion("sysModuleF.MODULE_NAME =", value, "moduleName");

            return this;
        } // end andModuleNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleF.MODULE_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andModuleNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleNameNotEqualTo(String value) {
            addCriterion("sysModuleF.MODULE_NAME <>", value, "moduleName");

            return this;
        } // end andModuleNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleNameNotEqualToOrIsNull(String value) {
            addCriterion("sysModuleF.MODULE_NAME is null OR sysModuleF.MODULE_NAME <>",
                value, "moduleName");

            return this;
        } // end andModuleNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleF.MODULE_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andModuleNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleNameGreaterThan(String value) {
            addCriterion("sysModuleF.MODULE_NAME >", value, "moduleName");

            return this;
        } // end andModuleNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleNameGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleF.MODULE_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andModuleNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("sysModuleF.MODULE_NAME >=", value, "moduleName");

            return this;
        } // end andModuleNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleF.MODULE_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andModuleNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleNameLessThan(String value) {
            addCriterion("sysModuleF.MODULE_NAME <", value, "moduleName");

            return this;
        } // end andModuleNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleF.MODULE_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andModuleNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleNameLessThanOrEqualTo(String value) {
            addCriterion("sysModuleF.MODULE_NAME <=", value, "moduleName");

            return this;
        } // end andModuleNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleF.MODULE_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andModuleNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysModuleF.MODULE_NAME like", buffer.toString(),
                "moduleName");

            return this;
        } // end andModuleNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysModuleF.MODULE_NAME not like", buffer.toString(),
                "moduleName");

            return this;
        } // end andModuleNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleNameIn(List values) {
            if (values.size() == 1) {
                return andModuleNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysModuleF.MODULE_NAME in", values, "moduleName");

                return this;
            } // end else
        } // end andModuleNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleNameNotIn(List values) {
            if (values.size() == 1) {
                return andModuleNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysModuleF.MODULE_NAME not in", values,
                    "moduleName");

                return this;
            } // end else
        } // end andModuleNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleNameIn(Object[] values) {
            if (values.length == 1) {
                return andModuleNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysModuleF.MODULE_NAME in",
                    Arrays.asList(values), "moduleName");

                return this;
            } // end else
        } // end andModuleNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andModuleNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysModuleF.MODULE_NAME not in",
                    Arrays.asList(values), "moduleName");

                return this;
            } // end else
        } // end andModuleNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleNameBetween(String value1, String value2) {
            addCriterion("sysModuleF.MODULE_NAME between", value1, value2,
                "moduleName");

            return this;
        } // end andModuleNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleNameNotBetween(String value1, String value2) {
            addCriterion("sysModuleF.MODULE_NAME not between", value1, value2,
                "moduleName");

            return this;
        } // end andModuleNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleCodeIsNull() {
            addCriterion("sysModuleF.MODULE_CODE is null");

            return this;
        } // end andModuleCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleCodeIsNotNull() {
            addCriterion("sysModuleF.MODULE_CODE is not null");

            return this;
        } // end andModuleCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleCodeIsNotEmpty() {
            addCriterion(
                "sysModuleF.MODULE_CODE is not null AND sysModuleF.MODULE_CODE <> ''");

            return this;
        } // end andModuleCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleCodeIsEmpty() {
            addCriterion(
                "(sysModuleF.MODULE_CODE is null OR sysModuleF.MODULE_CODE = '')");

            return this;
        } // end andModuleCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleCodeEqualTo(String value) {
            addCriterion("sysModuleF.MODULE_CODE =", value, "moduleCode");

            return this;
        } // end andModuleCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleCodeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleF.MODULE_CODE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andModuleCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleCodeNotEqualTo(String value) {
            addCriterion("sysModuleF.MODULE_CODE <>", value, "moduleCode");

            return this;
        } // end andModuleCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleCodeNotEqualToOrIsNull(String value) {
            addCriterion("sysModuleF.MODULE_CODE is null OR sysModuleF.MODULE_CODE <>",
                value, "moduleCode");

            return this;
        } // end andModuleCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleCodeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleF.MODULE_CODE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andModuleCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleCodeGreaterThan(String value) {
            addCriterion("sysModuleF.MODULE_CODE >", value, "moduleCode");

            return this;
        } // end andModuleCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleCodeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleF.MODULE_CODE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andModuleCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sysModuleF.MODULE_CODE >=", value, "moduleCode");

            return this;
        } // end andModuleCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleF.MODULE_CODE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andModuleCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleCodeLessThan(String value) {
            addCriterion("sysModuleF.MODULE_CODE <", value, "moduleCode");

            return this;
        } // end andModuleCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleCodeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleF.MODULE_CODE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andModuleCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleCodeLessThanOrEqualTo(String value) {
            addCriterion("sysModuleF.MODULE_CODE <=", value, "moduleCode");

            return this;
        } // end andModuleCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleCodeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleF.MODULE_CODE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andModuleCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysModuleF.MODULE_CODE like", buffer.toString(),
                "moduleCode");

            return this;
        } // end andModuleCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysModuleF.MODULE_CODE not like", buffer.toString(),
                "moduleCode");

            return this;
        } // end andModuleCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleCodeIn(List values) {
            if (values.size() == 1) {
                return andModuleCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysModuleF.MODULE_CODE in", values, "moduleCode");

                return this;
            } // end else
        } // end andModuleCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleCodeNotIn(List values) {
            if (values.size() == 1) {
                return andModuleCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysModuleF.MODULE_CODE not in", values,
                    "moduleCode");

                return this;
            } // end else
        } // end andModuleCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleCodeIn(Object[] values) {
            if (values.length == 1) {
                return andModuleCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysModuleF.MODULE_CODE in",
                    Arrays.asList(values), "moduleCode");

                return this;
            } // end else
        } // end andModuleCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andModuleCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysModuleF.MODULE_CODE not in",
                    Arrays.asList(values), "moduleCode");

                return this;
            } // end else
        } // end andModuleCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleCodeBetween(String value1, String value2) {
            addCriterion("sysModuleF.MODULE_CODE between", value1, value2,
                "moduleCode");

            return this;
        } // end andModuleCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleCodeNotBetween(String value1, String value2) {
            addCriterion("sysModuleF.MODULE_CODE not between", value1, value2,
                "moduleCode");

            return this;
        } // end andModuleCodeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleIconIsNull() {
            addCriterion("sysModuleF.MODULE_ICON is null");

            return this;
        } // end andModuleIconIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleIconIsNotNull() {
            addCriterion("sysModuleF.MODULE_ICON is not null");

            return this;
        } // end andModuleIconIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleIconIsNotEmpty() {
            addCriterion(
                "sysModuleF.MODULE_ICON is not null AND sysModuleF.MODULE_ICON <> ''");

            return this;
        } // end andModuleIconIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleIconIsEmpty() {
            addCriterion(
                "(sysModuleF.MODULE_ICON is null OR sysModuleF.MODULE_ICON = '')");

            return this;
        } // end andModuleIconIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleIconEqualTo(String value) {
            addCriterion("sysModuleF.MODULE_ICON =", value, "moduleIcon");

            return this;
        } // end andModuleIconEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleIconEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleF.MODULE_ICON");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andModuleIconEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleIconNotEqualTo(String value) {
            addCriterion("sysModuleF.MODULE_ICON <>", value, "moduleIcon");

            return this;
        } // end andModuleIconNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleIconNotEqualToOrIsNull(String value) {
            addCriterion("sysModuleF.MODULE_ICON is null OR sysModuleF.MODULE_ICON <>",
                value, "moduleIcon");

            return this;
        } // end andModuleIconNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleIconNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleF.MODULE_ICON");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andModuleIconNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleIconGreaterThan(String value) {
            addCriterion("sysModuleF.MODULE_ICON >", value, "moduleIcon");

            return this;
        } // end andModuleIconGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleIconGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleF.MODULE_ICON");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andModuleIconGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleIconGreaterThanOrEqualTo(String value) {
            addCriterion("sysModuleF.MODULE_ICON >=", value, "moduleIcon");

            return this;
        } // end andModuleIconGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleIconGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleF.MODULE_ICON");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andModuleIconGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleIconLessThan(String value) {
            addCriterion("sysModuleF.MODULE_ICON <", value, "moduleIcon");

            return this;
        } // end andModuleIconLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleIconLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleF.MODULE_ICON");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andModuleIconLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleIconLessThanOrEqualTo(String value) {
            addCriterion("sysModuleF.MODULE_ICON <=", value, "moduleIcon");

            return this;
        } // end andModuleIconLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleIconLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysModuleF.MODULE_ICON");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andModuleIconLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleIconLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysModuleF.MODULE_ICON like", buffer.toString(),
                "moduleIcon");

            return this;
        } // end andModuleIconLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleIconNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysModuleF.MODULE_ICON not like", buffer.toString(),
                "moduleIcon");

            return this;
        } // end andModuleIconNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleIconIn(List values) {
            if (values.size() == 1) {
                return andModuleIconEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysModuleF.MODULE_ICON in", values, "moduleIcon");

                return this;
            } // end else
        } // end andModuleIconIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleIconNotIn(List values) {
            if (values.size() == 1) {
                return andModuleIconNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysModuleF.MODULE_ICON not in", values,
                    "moduleIcon");

                return this;
            } // end else
        } // end andModuleIconNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleIconIn(Object[] values) {
            if (values.length == 1) {
                return andModuleIconEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysModuleF.MODULE_ICON in",
                    Arrays.asList(values), "moduleIcon");

                return this;
            } // end else
        } // end andModuleIconIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleIconNotIn(Object[] values) {
            if (values.length == 1) {
                return andModuleIconNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysModuleF.MODULE_ICON not in",
                    Arrays.asList(values), "moduleIcon");

                return this;
            } // end else
        } // end andModuleIconNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleIconBetween(String value1, String value2) {
            addCriterion("sysModuleF.MODULE_ICON between", value1, value2,
                "moduleIcon");

            return this;
        } // end andModuleIconBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andModuleIconNotBetween(String value1, String value2) {
            addCriterion("sysModuleF.MODULE_ICON not between", value1, value2,
                "moduleIcon");

            return this;
        } // end andModuleIconNotBetween()
    } // end Criteria
} // end BpmDomainSysModuleRelateDAOQueryBean
