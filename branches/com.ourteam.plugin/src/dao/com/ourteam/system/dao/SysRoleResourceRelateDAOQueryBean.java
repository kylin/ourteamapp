/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.system.dao;

import net.dao.BaseQueryBean;
import net.dao.BaseWhereCriterion;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * SysRoleResourceRelate query bean 2011-09-22 10:11:23
 *
 * @author Auto Gen
 */
public class SysRoleResourceRelateDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new SysRoleResourceRelateDAOQueryBean object.
     */
    public SysRoleResourceRelateDAOQueryBean() {
        super();
    } // end SysRoleResourceRelateDAOQueryBean()

    /**
     * Creates a new SysRoleResourceRelateDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public SysRoleResourceRelateDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end SysRoleResourceRelateDAOQueryBean()

    /**
     * Creates a new SysRoleResourceRelateDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public SysRoleResourceRelateDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end SysRoleResourceRelateDAOQueryBean()

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
            addSelectProperty(ISysRoleResourceRelateDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleResourceRelateDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRelateCodeSelectProperty() {
        addRelateCodeSelectProperty("relateCode");
    } // end addRelateCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRelateCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysRoleResourceRelateDAO.RelateCode, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleResourceRelateDAO.RelateCode, "relateCode");
        } // end else
    } // end addRelateCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRelateNameSelectProperty() {
        addRelateNameSelectProperty("relateName");
    } // end addRelateNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRelateNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysRoleResourceRelateDAO.RelateName, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleResourceRelateDAO.RelateName, "relateName");
        } // end else
    } // end addRelateNameSelectProperty()

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
            addSelectProperty(ISysRoleResourceRelateDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleResourceRelateDAO.Remarks, "remarks");
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
            addSelectProperty(ISysRoleResourceRelateDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleResourceRelateDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addSysResourceIdSelectProperty() {
        addSysResourceIdSelectProperty("sysResourceId");
    } // end addSysResourceIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addSysResourceIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysRoleResourceRelateDAO.SysResourceId, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleResourceRelateDAO.SysResourceId,
                "sysResourceId");
        } // end else
    } // end addSysResourceIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addSysRoleIdSelectProperty() {
        addSysRoleIdSelectProperty("sysRoleId");
    } // end addSysRoleIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addSysRoleIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysRoleResourceRelateDAO.SysRoleId, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleResourceRelateDAO.SysRoleId, "sysRoleId");
        } // end else
    } // end addSysRoleIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addSysResourceTitleKeySelectProperty() {
        addSysResourceTitleKeySelectProperty("sysResourceTitleKey");
    } // end addSysResourceTitleKeySelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addSysResourceTitleKeySelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysRoleResourceRelateDAO.SysResourceTitleKey,
                aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleResourceRelateDAO.SysResourceTitleKey,
                "sysResourceTitleKey");
        } // end else
    } // end addSysResourceTitleKeySelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addSysRoleNameSelectProperty() {
        addSysRoleNameSelectProperty("sysRoleName");
    } // end addSysRoleNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addSysRoleNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysRoleResourceRelateDAO.SysRoleName, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleResourceRelateDAO.SysRoleName,
                "sysRoleName");
        } // end else
    } // end addSysRoleNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addRelateCodeSelectProperty();

        addRelateNameSelectProperty();

        addRemarksSelectProperty();

        addStatusSelectProperty();

        addSysResourceIdSelectProperty();

        addSysRoleIdSelectProperty();

        addSysResourceTitleKeySelectProperty();

        addSysRoleNameSelectProperty();
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
            addCriterion("SYS_ROLE_RESOURCE_RELATE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "SYS_ROLE_RESOURCE_RELATE.ID is not null AND SYS_ROLE_RESOURCE_RELATE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(SYS_ROLE_RESOURCE_RELATE.ID is null OR SYS_ROLE_RESOURCE_RELATE.ID = '')");

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
            addCriterion("SYS_ROLE_RESOURCE_RELATE.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_ROLE_RESOURCE_RELATE.ID");
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
            addCriterion("SYS_ROLE_RESOURCE_RELATE.ID <>", value, "id");

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
            addCriterion("SYS_ROLE_RESOURCE_RELATE.ID is null OR SYS_ROLE_RESOURCE_RELATE.ID <>",
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
            StringBuffer str = new StringBuffer("SYS_ROLE_RESOURCE_RELATE.ID");
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
            addCriterion("SYS_ROLE_RESOURCE_RELATE.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_ROLE_RESOURCE_RELATE.ID");
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
            addCriterion("SYS_ROLE_RESOURCE_RELATE.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_ROLE_RESOURCE_RELATE.ID");
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
            addCriterion("SYS_ROLE_RESOURCE_RELATE.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_ROLE_RESOURCE_RELATE.ID");
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
            addCriterion("SYS_ROLE_RESOURCE_RELATE.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_ROLE_RESOURCE_RELATE.ID");
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
                addCriterion("SYS_ROLE_RESOURCE_RELATE.ID in", values, "id");

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
                addCriterion("SYS_ROLE_RESOURCE_RELATE.ID not in", values, "id");

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
                addCriterion("SYS_ROLE_RESOURCE_RELATE.ID in", values, "id");

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
                addCriterion("SYS_ROLE_RESOURCE_RELATE.ID not in", values, "id");

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
                addCriterion("SYS_ROLE_RESOURCE_RELATE.ID in",
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
                addCriterion("SYS_ROLE_RESOURCE_RELATE.ID not in",
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
            addCriterion("SYS_ROLE_RESOURCE_RELATE.ID between", value1, value2,
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
            addCriterion("SYS_ROLE_RESOURCE_RELATE.ID between", value1, value2,
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
            addCriterion("SYS_ROLE_RESOURCE_RELATE.ID not between", value1,
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
            addCriterion("SYS_ROLE_RESOURCE_RELATE.ID not between", value1,
                value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateCodeIsNull() {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.RELATE_CODE is null");

            return this;
        } // end andRelateCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateCodeIsNotNull() {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.RELATE_CODE is not null");

            return this;
        } // end andRelateCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateCodeIsNotEmpty() {
            addCriterion(
                "SYS_ROLE_RESOURCE_RELATE.RELATE_CODE is not null AND SYS_ROLE_RESOURCE_RELATE.RELATE_CODE <> ''");

            return this;
        } // end andRelateCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateCodeIsEmpty() {
            addCriterion(
                "(SYS_ROLE_RESOURCE_RELATE.RELATE_CODE is null OR SYS_ROLE_RESOURCE_RELATE.RELATE_CODE = '')");

            return this;
        } // end andRelateCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateCodeEqualTo(String value) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.RELATE_CODE =", value,
                "relateCode");

            return this;
        } // end andRelateCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateCodeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RESOURCE_RELATE.RELATE_CODE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelateCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateCodeNotEqualTo(String value) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.RELATE_CODE <>", value,
                "relateCode");

            return this;
        } // end andRelateCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateCodeNotEqualToOrIsNull(String value) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.RELATE_CODE is null OR SYS_ROLE_RESOURCE_RELATE.RELATE_CODE <>",
                value, "relateCode");

            return this;
        } // end andRelateCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateCodeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RESOURCE_RELATE.RELATE_CODE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelateCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateCodeGreaterThan(String value) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.RELATE_CODE >", value,
                "relateCode");

            return this;
        } // end andRelateCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateCodeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RESOURCE_RELATE.RELATE_CODE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelateCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.RELATE_CODE >=", value,
                "relateCode");

            return this;
        } // end andRelateCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RESOURCE_RELATE.RELATE_CODE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelateCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateCodeLessThan(String value) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.RELATE_CODE <", value,
                "relateCode");

            return this;
        } // end andRelateCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateCodeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RESOURCE_RELATE.RELATE_CODE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelateCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateCodeLessThanOrEqualTo(String value) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.RELATE_CODE <=", value,
                "relateCode");

            return this;
        } // end andRelateCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateCodeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RESOURCE_RELATE.RELATE_CODE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelateCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_ROLE_RESOURCE_RELATE.RELATE_CODE like",
                buffer.toString(), "relateCode");

            return this;
        } // end andRelateCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_ROLE_RESOURCE_RELATE.RELATE_CODE not like",
                buffer.toString(), "relateCode");

            return this;
        } // end andRelateCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateCodeIn(List values) {
            if (values.size() == 1) {
                return andRelateCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_ROLE_RESOURCE_RELATE.RELATE_CODE in", values,
                    "relateCode");

                return this;
            } // end else
        } // end andRelateCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateCodeNotIn(List values) {
            if (values.size() == 1) {
                return andRelateCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_ROLE_RESOURCE_RELATE.RELATE_CODE not in",
                    values, "relateCode");

                return this;
            } // end else
        } // end andRelateCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateCodeIn(Object[] values) {
            if (values.length == 1) {
                return andRelateCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE_RESOURCE_RELATE.RELATE_CODE in",
                    Arrays.asList(values), "relateCode");

                return this;
            } // end else
        } // end andRelateCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andRelateCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE_RESOURCE_RELATE.RELATE_CODE not in",
                    Arrays.asList(values), "relateCode");

                return this;
            } // end else
        } // end andRelateCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateCodeBetween(String value1, String value2) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.RELATE_CODE between",
                value1, value2, "relateCode");

            return this;
        } // end andRelateCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateCodeNotBetween(String value1, String value2) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.RELATE_CODE not between",
                value1, value2, "relateCode");

            return this;
        } // end andRelateCodeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateNameIsNull() {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.RELATE_NAME is null");

            return this;
        } // end andRelateNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateNameIsNotNull() {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.RELATE_NAME is not null");

            return this;
        } // end andRelateNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateNameIsNotEmpty() {
            addCriterion(
                "SYS_ROLE_RESOURCE_RELATE.RELATE_NAME is not null AND SYS_ROLE_RESOURCE_RELATE.RELATE_NAME <> ''");

            return this;
        } // end andRelateNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateNameIsEmpty() {
            addCriterion(
                "(SYS_ROLE_RESOURCE_RELATE.RELATE_NAME is null OR SYS_ROLE_RESOURCE_RELATE.RELATE_NAME = '')");

            return this;
        } // end andRelateNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateNameEqualTo(String value) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.RELATE_NAME =", value,
                "relateName");

            return this;
        } // end andRelateNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RESOURCE_RELATE.RELATE_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelateNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateNameNotEqualTo(String value) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.RELATE_NAME <>", value,
                "relateName");

            return this;
        } // end andRelateNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateNameNotEqualToOrIsNull(String value) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.RELATE_NAME is null OR SYS_ROLE_RESOURCE_RELATE.RELATE_NAME <>",
                value, "relateName");

            return this;
        } // end andRelateNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RESOURCE_RELATE.RELATE_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelateNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateNameGreaterThan(String value) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.RELATE_NAME >", value,
                "relateName");

            return this;
        } // end andRelateNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateNameGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RESOURCE_RELATE.RELATE_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelateNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateNameGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.RELATE_NAME >=", value,
                "relateName");

            return this;
        } // end andRelateNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RESOURCE_RELATE.RELATE_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelateNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateNameLessThan(String value) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.RELATE_NAME <", value,
                "relateName");

            return this;
        } // end andRelateNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RESOURCE_RELATE.RELATE_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelateNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateNameLessThanOrEqualTo(String value) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.RELATE_NAME <=", value,
                "relateName");

            return this;
        } // end andRelateNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RESOURCE_RELATE.RELATE_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelateNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_ROLE_RESOURCE_RELATE.RELATE_NAME like",
                buffer.toString(), "relateName");

            return this;
        } // end andRelateNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_ROLE_RESOURCE_RELATE.RELATE_NAME not like",
                buffer.toString(), "relateName");

            return this;
        } // end andRelateNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateNameIn(List values) {
            if (values.size() == 1) {
                return andRelateNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_ROLE_RESOURCE_RELATE.RELATE_NAME in", values,
                    "relateName");

                return this;
            } // end else
        } // end andRelateNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateNameNotIn(List values) {
            if (values.size() == 1) {
                return andRelateNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_ROLE_RESOURCE_RELATE.RELATE_NAME not in",
                    values, "relateName");

                return this;
            } // end else
        } // end andRelateNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateNameIn(Object[] values) {
            if (values.length == 1) {
                return andRelateNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE_RESOURCE_RELATE.RELATE_NAME in",
                    Arrays.asList(values), "relateName");

                return this;
            } // end else
        } // end andRelateNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andRelateNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE_RESOURCE_RELATE.RELATE_NAME not in",
                    Arrays.asList(values), "relateName");

                return this;
            } // end else
        } // end andRelateNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateNameBetween(String value1, String value2) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.RELATE_NAME between",
                value1, value2, "relateName");

            return this;
        } // end andRelateNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateNameNotBetween(String value1, String value2) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.RELATE_NAME not between",
                value1, value2, "relateName");

            return this;
        } // end andRelateNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "SYS_ROLE_RESOURCE_RELATE.REMARKS is not null AND SYS_ROLE_RESOURCE_RELATE.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(SYS_ROLE_RESOURCE_RELATE.REMARKS is null OR SYS_ROLE_RESOURCE_RELATE.REMARKS = '')");

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
            addCriterion("SYS_ROLE_RESOURCE_RELATE.REMARKS =", value, "remarks");

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
                    "SYS_ROLE_RESOURCE_RELATE.REMARKS");
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
            addCriterion("SYS_ROLE_RESOURCE_RELATE.REMARKS <>", value, "remarks");

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
            addCriterion("SYS_ROLE_RESOURCE_RELATE.REMARKS is null OR SYS_ROLE_RESOURCE_RELATE.REMARKS <>",
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
                    "SYS_ROLE_RESOURCE_RELATE.REMARKS");
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
            addCriterion("SYS_ROLE_RESOURCE_RELATE.REMARKS >", value, "remarks");

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
                    "SYS_ROLE_RESOURCE_RELATE.REMARKS");
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
            addCriterion("SYS_ROLE_RESOURCE_RELATE.REMARKS >=", value, "remarks");

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
                    "SYS_ROLE_RESOURCE_RELATE.REMARKS");
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
            addCriterion("SYS_ROLE_RESOURCE_RELATE.REMARKS <", value, "remarks");

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
                    "SYS_ROLE_RESOURCE_RELATE.REMARKS");
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
            addCriterion("SYS_ROLE_RESOURCE_RELATE.REMARKS <=", value, "remarks");

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
                    "SYS_ROLE_RESOURCE_RELATE.REMARKS");
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
            addCriterion("SYS_ROLE_RESOURCE_RELATE.REMARKS like",
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
            addCriterion("SYS_ROLE_RESOURCE_RELATE.REMARKS not like",
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
                addCriterion("SYS_ROLE_RESOURCE_RELATE.REMARKS in", values,
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
                addCriterion("SYS_ROLE_RESOURCE_RELATE.REMARKS not in", values,
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
                addCriterion("SYS_ROLE_RESOURCE_RELATE.REMARKS in",
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
                addCriterion("SYS_ROLE_RESOURCE_RELATE.REMARKS not in",
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
            addCriterion("SYS_ROLE_RESOURCE_RELATE.REMARKS between", value1,
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
            addCriterion("SYS_ROLE_RESOURCE_RELATE.REMARKS not between",
                value1, value2, "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "SYS_ROLE_RESOURCE_RELATE.STATUS is not null AND SYS_ROLE_RESOURCE_RELATE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(SYS_ROLE_RESOURCE_RELATE.STATUS is null OR SYS_ROLE_RESOURCE_RELATE.STATUS = '')");

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
            addCriterion("SYS_ROLE_RESOURCE_RELATE.STATUS =", value, "status");

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
                    "SYS_ROLE_RESOURCE_RELATE.STATUS");
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
            addCriterion("SYS_ROLE_RESOURCE_RELATE.STATUS <>", value, "status");

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
            addCriterion("SYS_ROLE_RESOURCE_RELATE.STATUS is null OR SYS_ROLE_RESOURCE_RELATE.STATUS <>",
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
                    "SYS_ROLE_RESOURCE_RELATE.STATUS");
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
            addCriterion("SYS_ROLE_RESOURCE_RELATE.STATUS >", value, "status");

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
                    "SYS_ROLE_RESOURCE_RELATE.STATUS");
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
            addCriterion("SYS_ROLE_RESOURCE_RELATE.STATUS >=", value, "status");

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
                    "SYS_ROLE_RESOURCE_RELATE.STATUS");
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
            addCriterion("SYS_ROLE_RESOURCE_RELATE.STATUS <", value, "status");

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
                    "SYS_ROLE_RESOURCE_RELATE.STATUS");
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
            addCriterion("SYS_ROLE_RESOURCE_RELATE.STATUS <=", value, "status");

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
                    "SYS_ROLE_RESOURCE_RELATE.STATUS");
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
            addCriterion("SYS_ROLE_RESOURCE_RELATE.STATUS like",
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
            addCriterion("SYS_ROLE_RESOURCE_RELATE.STATUS not like",
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
                addCriterion("SYS_ROLE_RESOURCE_RELATE.STATUS in", values,
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
                addCriterion("SYS_ROLE_RESOURCE_RELATE.STATUS not in", values,
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
                addCriterion("SYS_ROLE_RESOURCE_RELATE.STATUS in",
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
                addCriterion("SYS_ROLE_RESOURCE_RELATE.STATUS not in",
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
            addCriterion("SYS_ROLE_RESOURCE_RELATE.STATUS between", value1,
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
            addCriterion("SYS_ROLE_RESOURCE_RELATE.STATUS not between", value1,
                value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdIsNull() {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_RESOURCE_ID is null");

            return this;
        } // end andSysResourceIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdIsNotNull() {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_RESOURCE_ID is not null");

            return this;
        } // end andSysResourceIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdIsNotEmpty() {
            addCriterion(
                "SYS_ROLE_RESOURCE_RELATE.SYS_RESOURCE_ID is not null AND SYS_ROLE_RESOURCE_RELATE.SYS_RESOURCE_ID <> ''");

            return this;
        } // end andSysResourceIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdIsEmpty() {
            addCriterion(
                "(SYS_ROLE_RESOURCE_RELATE.SYS_RESOURCE_ID is null OR SYS_ROLE_RESOURCE_RELATE.SYS_RESOURCE_ID = '')");

            return this;
        } // end andSysResourceIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdEqualTo(long value) {
            return andSysResourceIdEqualTo(Long.valueOf(value));
        } // end andSysResourceIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdEqualTo(java.lang.Long value) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_RESOURCE_ID =", value,
                "sysResourceId");

            return this;
        } // end andSysResourceIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RESOURCE_RELATE.SYS_RESOURCE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysResourceIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdNotEqualTo(long value) {
            return andSysResourceIdNotEqualTo(Long.valueOf(value));
        } // end andSysResourceIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdNotEqualTo(java.lang.Long value) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_RESOURCE_ID <>", value,
                "sysResourceId");

            return this;
        } // end andSysResourceIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdNotEqualToOrIsNull(long value) {
            return andSysResourceIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andSysResourceIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_RESOURCE_ID is null OR SYS_ROLE_RESOURCE_RELATE.SYS_RESOURCE_ID <>",
                value, "sysResourceId");

            return this;
        } // end andSysResourceIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RESOURCE_RELATE.SYS_RESOURCE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysResourceIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdGreaterThan(long value) {
            return andSysResourceIdGreaterThan(Long.valueOf(value));
        } // end andSysResourceIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdGreaterThan(java.lang.Long value) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_RESOURCE_ID >", value,
                "sysResourceId");

            return this;
        } // end andSysResourceIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RESOURCE_RELATE.SYS_RESOURCE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysResourceIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdGreaterThanOrEqualTo(long value) {
            return andSysResourceIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andSysResourceIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_RESOURCE_ID >=", value,
                "sysResourceId");

            return this;
        } // end andSysResourceIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RESOURCE_RELATE.SYS_RESOURCE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysResourceIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdLessThan(long value) {
            return andSysResourceIdLessThan(Long.valueOf(value));
        } // end andSysResourceIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdLessThan(java.lang.Long value) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_RESOURCE_ID <", value,
                "sysResourceId");

            return this;
        } // end andSysResourceIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RESOURCE_RELATE.SYS_RESOURCE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysResourceIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdLessThanOrEqualTo(long value) {
            return andSysResourceIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andSysResourceIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_RESOURCE_ID <=", value,
                "sysResourceId");

            return this;
        } // end andSysResourceIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RESOURCE_RELATE.SYS_RESOURCE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysResourceIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdIn(long[] values) {
            if (values.length == 1) {
                return andSysResourceIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_RESOURCE_ID in",
                    values, "sysResourceId");

                return this;
            } // end else
        } // end andSysResourceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdNotIn(long[] values) {
            if (values.length == 1) {
                return andSysResourceIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_RESOURCE_ID not in",
                    values, "sysResourceId");

                return this;
            } // end else
        } // end andSysResourceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdIn(List values) {
            if (values.size() == 1) {
                return andSysResourceIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_RESOURCE_ID in",
                    values, "sysResourceId");

                return this;
            } // end else
        } // end andSysResourceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdNotIn(List values) {
            if (values.size() == 1) {
                return andSysResourceIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_RESOURCE_ID not in",
                    values, "sysResourceId");

                return this;
            } // end else
        } // end andSysResourceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdIn(Object[] values) {
            if (values.length == 1) {
                return andSysResourceIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_RESOURCE_ID in",
                    Arrays.asList(values), "sysResourceId");

                return this;
            } // end else
        } // end andSysResourceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andSysResourceIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_RESOURCE_ID not in",
                    Arrays.asList(values), "sysResourceId");

                return this;
            } // end else
        } // end andSysResourceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdBetween(long value1, long value2) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_RESOURCE_ID between",
                value1, value2, "sysResourceId");

            return this;
        } // end andSysResourceIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_RESOURCE_ID between",
                value1, value2, "sysResourceId");

            return this;
        } // end andSysResourceIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdNotBetween(long value1, long value2) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_RESOURCE_ID not between",
                value1, value2, "sysResourceId");

            return this;
        } // end andSysResourceIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_RESOURCE_ID not between",
                value1, value2, "sysResourceId");

            return this;
        } // end andSysResourceIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleIdIsNull() {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_ROLE_ID is null");

            return this;
        } // end andSysRoleIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleIdIsNotNull() {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_ROLE_ID is not null");

            return this;
        } // end andSysRoleIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleIdIsNotEmpty() {
            addCriterion(
                "SYS_ROLE_RESOURCE_RELATE.SYS_ROLE_ID is not null AND SYS_ROLE_RESOURCE_RELATE.SYS_ROLE_ID <> ''");

            return this;
        } // end andSysRoleIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleIdIsEmpty() {
            addCriterion(
                "(SYS_ROLE_RESOURCE_RELATE.SYS_ROLE_ID is null OR SYS_ROLE_RESOURCE_RELATE.SYS_ROLE_ID = '')");

            return this;
        } // end andSysRoleIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleIdEqualTo(long value) {
            return andSysRoleIdEqualTo(Long.valueOf(value));
        } // end andSysRoleIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleIdEqualTo(java.lang.Long value) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_ROLE_ID =", value,
                "sysRoleId");

            return this;
        } // end andSysRoleIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RESOURCE_RELATE.SYS_ROLE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysRoleIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleIdNotEqualTo(long value) {
            return andSysRoleIdNotEqualTo(Long.valueOf(value));
        } // end andSysRoleIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleIdNotEqualTo(java.lang.Long value) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_ROLE_ID <>", value,
                "sysRoleId");

            return this;
        } // end andSysRoleIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleIdNotEqualToOrIsNull(long value) {
            return andSysRoleIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andSysRoleIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_ROLE_ID is null OR SYS_ROLE_RESOURCE_RELATE.SYS_ROLE_ID <>",
                value, "sysRoleId");

            return this;
        } // end andSysRoleIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RESOURCE_RELATE.SYS_ROLE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysRoleIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleIdGreaterThan(long value) {
            return andSysRoleIdGreaterThan(Long.valueOf(value));
        } // end andSysRoleIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleIdGreaterThan(java.lang.Long value) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_ROLE_ID >", value,
                "sysRoleId");

            return this;
        } // end andSysRoleIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RESOURCE_RELATE.SYS_ROLE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysRoleIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleIdGreaterThanOrEqualTo(long value) {
            return andSysRoleIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andSysRoleIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_ROLE_ID >=", value,
                "sysRoleId");

            return this;
        } // end andSysRoleIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RESOURCE_RELATE.SYS_ROLE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysRoleIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleIdLessThan(long value) {
            return andSysRoleIdLessThan(Long.valueOf(value));
        } // end andSysRoleIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleIdLessThan(java.lang.Long value) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_ROLE_ID <", value,
                "sysRoleId");

            return this;
        } // end andSysRoleIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RESOURCE_RELATE.SYS_ROLE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysRoleIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleIdLessThanOrEqualTo(long value) {
            return andSysRoleIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andSysRoleIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_ROLE_ID <=", value,
                "sysRoleId");

            return this;
        } // end andSysRoleIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RESOURCE_RELATE.SYS_ROLE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysRoleIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleIdIn(long[] values) {
            if (values.length == 1) {
                return andSysRoleIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_ROLE_ID in", values,
                    "sysRoleId");

                return this;
            } // end else
        } // end andSysRoleIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleIdNotIn(long[] values) {
            if (values.length == 1) {
                return andSysRoleIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_ROLE_ID not in",
                    values, "sysRoleId");

                return this;
            } // end else
        } // end andSysRoleIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleIdIn(List values) {
            if (values.size() == 1) {
                return andSysRoleIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_ROLE_ID in", values,
                    "sysRoleId");

                return this;
            } // end else
        } // end andSysRoleIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleIdNotIn(List values) {
            if (values.size() == 1) {
                return andSysRoleIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_ROLE_ID not in",
                    values, "sysRoleId");

                return this;
            } // end else
        } // end andSysRoleIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleIdIn(Object[] values) {
            if (values.length == 1) {
                return andSysRoleIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_ROLE_ID in",
                    Arrays.asList(values), "sysRoleId");

                return this;
            } // end else
        } // end andSysRoleIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andSysRoleIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_ROLE_ID not in",
                    Arrays.asList(values), "sysRoleId");

                return this;
            } // end else
        } // end andSysRoleIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleIdBetween(long value1, long value2) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_ROLE_ID between",
                value1, value2, "sysRoleId");

            return this;
        } // end andSysRoleIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_ROLE_ID between",
                value1, value2, "sysRoleId");

            return this;
        } // end andSysRoleIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleIdNotBetween(long value1, long value2) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_ROLE_ID not between",
                value1, value2, "sysRoleId");

            return this;
        } // end andSysRoleIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("SYS_ROLE_RESOURCE_RELATE.SYS_ROLE_ID not between",
                value1, value2, "sysRoleId");

            return this;
        } // end andSysRoleIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceTitleKeyIsNull() {
            addCriterion("sysResource.RESOURCE_TITLE_KEY is null");

            return this;
        } // end andSysResourceTitleKeyIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceTitleKeyIsNotNull() {
            addCriterion("sysResource.RESOURCE_TITLE_KEY is not null");

            return this;
        } // end andSysResourceTitleKeyIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceTitleKeyIsNotEmpty() {
            addCriterion(
                "sysResource.RESOURCE_TITLE_KEY is not null AND sysResource.RESOURCE_TITLE_KEY <> ''");

            return this;
        } // end andSysResourceTitleKeyIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceTitleKeyIsEmpty() {
            addCriterion(
                "(sysResource.RESOURCE_TITLE_KEY is null OR sysResource.RESOURCE_TITLE_KEY = '')");

            return this;
        } // end andSysResourceTitleKeyIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceTitleKeyEqualTo(String value) {
            addCriterion("sysResource.RESOURCE_TITLE_KEY =", value,
                "sysResourceTitleKey");

            return this;
        } // end andSysResourceTitleKeyEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceTitleKeyEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "sysResource.RESOURCE_TITLE_KEY");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysResourceTitleKeyEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceTitleKeyNotEqualTo(String value) {
            addCriterion("sysResource.RESOURCE_TITLE_KEY <>", value,
                "sysResourceTitleKey");

            return this;
        } // end andSysResourceTitleKeyNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceTitleKeyNotEqualToOrIsNull(String value) {
            addCriterion("sysResource.RESOURCE_TITLE_KEY is null OR sysResource.RESOURCE_TITLE_KEY <>",
                value, "sysResourceTitleKey");

            return this;
        } // end andSysResourceTitleKeyNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceTitleKeyNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "sysResource.RESOURCE_TITLE_KEY");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysResourceTitleKeyNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceTitleKeyGreaterThan(String value) {
            addCriterion("sysResource.RESOURCE_TITLE_KEY >", value,
                "sysResourceTitleKey");

            return this;
        } // end andSysResourceTitleKeyGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceTitleKeyGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "sysResource.RESOURCE_TITLE_KEY");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysResourceTitleKeyGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceTitleKeyGreaterThanOrEqualTo(String value) {
            addCriterion("sysResource.RESOURCE_TITLE_KEY >=", value,
                "sysResourceTitleKey");

            return this;
        } // end andSysResourceTitleKeyGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceTitleKeyGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "sysResource.RESOURCE_TITLE_KEY");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysResourceTitleKeyGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceTitleKeyLessThan(String value) {
            addCriterion("sysResource.RESOURCE_TITLE_KEY <", value,
                "sysResourceTitleKey");

            return this;
        } // end andSysResourceTitleKeyLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceTitleKeyLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "sysResource.RESOURCE_TITLE_KEY");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysResourceTitleKeyLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceTitleKeyLessThanOrEqualTo(String value) {
            addCriterion("sysResource.RESOURCE_TITLE_KEY <=", value,
                "sysResourceTitleKey");

            return this;
        } // end andSysResourceTitleKeyLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceTitleKeyLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "sysResource.RESOURCE_TITLE_KEY");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysResourceTitleKeyLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceTitleKeyLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysResource.RESOURCE_TITLE_KEY like",
                buffer.toString(), "sysResourceTitleKey");

            return this;
        } // end andSysResourceTitleKeyLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceTitleKeyNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysResource.RESOURCE_TITLE_KEY not like",
                buffer.toString(), "sysResourceTitleKey");

            return this;
        } // end andSysResourceTitleKeyNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceTitleKeyIn(List values) {
            if (values.size() == 1) {
                return andSysResourceTitleKeyEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysResource.RESOURCE_TITLE_KEY in", values,
                    "sysResourceTitleKey");

                return this;
            } // end else
        } // end andSysResourceTitleKeyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceTitleKeyNotIn(List values) {
            if (values.size() == 1) {
                return andSysResourceTitleKeyNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysResource.RESOURCE_TITLE_KEY not in", values,
                    "sysResourceTitleKey");

                return this;
            } // end else
        } // end andSysResourceTitleKeyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceTitleKeyIn(Object[] values) {
            if (values.length == 1) {
                return andSysResourceTitleKeyEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysResource.RESOURCE_TITLE_KEY in",
                    Arrays.asList(values), "sysResourceTitleKey");

                return this;
            } // end else
        } // end andSysResourceTitleKeyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceTitleKeyNotIn(Object[] values) {
            if (values.length == 1) {
                return andSysResourceTitleKeyNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysResource.RESOURCE_TITLE_KEY not in",
                    Arrays.asList(values), "sysResourceTitleKey");

                return this;
            } // end else
        } // end andSysResourceTitleKeyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceTitleKeyBetween(String value1,
            String value2) {
            addCriterion("sysResource.RESOURCE_TITLE_KEY between", value1,
                value2, "sysResourceTitleKey");

            return this;
        } // end andSysResourceTitleKeyBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysResourceTitleKeyNotBetween(String value1,
            String value2) {
            addCriterion("sysResource.RESOURCE_TITLE_KEY not between", value1,
                value2, "sysResourceTitleKey");

            return this;
        } // end andSysResourceTitleKeyNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleNameIsNull() {
            addCriterion("sysRole.ROLE_NAME is null");

            return this;
        } // end andSysRoleNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleNameIsNotNull() {
            addCriterion("sysRole.ROLE_NAME is not null");

            return this;
        } // end andSysRoleNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleNameIsNotEmpty() {
            addCriterion(
                "sysRole.ROLE_NAME is not null AND sysRole.ROLE_NAME <> ''");

            return this;
        } // end andSysRoleNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleNameIsEmpty() {
            addCriterion(
                "(sysRole.ROLE_NAME is null OR sysRole.ROLE_NAME = '')");

            return this;
        } // end andSysRoleNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleNameEqualTo(String value) {
            addCriterion("sysRole.ROLE_NAME =", value, "sysRoleName");

            return this;
        } // end andSysRoleNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysRole.ROLE_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysRoleNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleNameNotEqualTo(String value) {
            addCriterion("sysRole.ROLE_NAME <>", value, "sysRoleName");

            return this;
        } // end andSysRoleNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleNameNotEqualToOrIsNull(String value) {
            addCriterion("sysRole.ROLE_NAME is null OR sysRole.ROLE_NAME <>",
                value, "sysRoleName");

            return this;
        } // end andSysRoleNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysRole.ROLE_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysRoleNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleNameGreaterThan(String value) {
            addCriterion("sysRole.ROLE_NAME >", value, "sysRoleName");

            return this;
        } // end andSysRoleNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysRole.ROLE_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysRoleNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("sysRole.ROLE_NAME >=", value, "sysRoleName");

            return this;
        } // end andSysRoleNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysRole.ROLE_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysRoleNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleNameLessThan(String value) {
            addCriterion("sysRole.ROLE_NAME <", value, "sysRoleName");

            return this;
        } // end andSysRoleNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysRole.ROLE_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysRoleNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleNameLessThanOrEqualTo(String value) {
            addCriterion("sysRole.ROLE_NAME <=", value, "sysRoleName");

            return this;
        } // end andSysRoleNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysRole.ROLE_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysRoleNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysRole.ROLE_NAME like", buffer.toString(),
                "sysRoleName");

            return this;
        } // end andSysRoleNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysRole.ROLE_NAME not like", buffer.toString(),
                "sysRoleName");

            return this;
        } // end andSysRoleNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleNameIn(List values) {
            if (values.size() == 1) {
                return andSysRoleNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysRole.ROLE_NAME in", values, "sysRoleName");

                return this;
            } // end else
        } // end andSysRoleNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleNameNotIn(List values) {
            if (values.size() == 1) {
                return andSysRoleNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysRole.ROLE_NAME not in", values, "sysRoleName");

                return this;
            } // end else
        } // end andSysRoleNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleNameIn(Object[] values) {
            if (values.length == 1) {
                return andSysRoleNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysRole.ROLE_NAME in", Arrays.asList(values),
                    "sysRoleName");

                return this;
            } // end else
        } // end andSysRoleNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andSysRoleNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysRole.ROLE_NAME not in", Arrays.asList(values),
                    "sysRoleName");

                return this;
            } // end else
        } // end andSysRoleNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleNameBetween(String value1, String value2) {
            addCriterion("sysRole.ROLE_NAME between", value1, value2,
                "sysRoleName");

            return this;
        } // end andSysRoleNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleNameNotBetween(String value1, String value2) {
            addCriterion("sysRole.ROLE_NAME not between", value1, value2,
                "sysRoleName");

            return this;
        } // end andSysRoleNameNotBetween()
    } // end Criteria
} // end SysRoleResourceRelateDAOQueryBean
