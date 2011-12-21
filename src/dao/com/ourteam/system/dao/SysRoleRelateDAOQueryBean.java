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
 * SysRoleRelate query bean 2011-09-22 10:11:21
 *
 * @author Auto Gen
 */
public class SysRoleRelateDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new SysRoleRelateDAOQueryBean object.
     */
    public SysRoleRelateDAOQueryBean() {
        super();
    } // end SysRoleRelateDAOQueryBean()

    /**
     * Creates a new SysRoleRelateDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public SysRoleRelateDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end SysRoleRelateDAOQueryBean()

    /**
     * Creates a new SysRoleRelateDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public SysRoleRelateDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end SysRoleRelateDAOQueryBean()

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
            addSelectProperty(ISysRoleRelateDAO.Id, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleRelateDAO.Id, "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRelatedSysRoleIdSelectProperty() {
        addRelatedSysRoleIdSelectProperty("relatedSysRoleId");
    } // end addRelatedSysRoleIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRelatedSysRoleIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysRoleRelateDAO.RelatedSysRoleId, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleRelateDAO.RelatedSysRoleId,
                "relatedSysRoleId");
        } // end else
    } // end addRelatedSysRoleIdSelectProperty()

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
            addSelectProperty(ISysRoleRelateDAO.Remarks, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleRelateDAO.Remarks, "remarks");
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
            addSelectProperty(ISysRoleRelateDAO.Status, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleRelateDAO.Status, "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addSysRoleGroupIdSelectProperty() {
        addSysRoleGroupIdSelectProperty("sysRoleGroupId");
    } // end addSysRoleGroupIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addSysRoleGroupIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysRoleRelateDAO.SysRoleGroupId, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleRelateDAO.SysRoleGroupId, "sysRoleGroupId");
        } // end else
    } // end addSysRoleGroupIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRelatedSysRoleCodeSelectProperty() {
        addRelatedSysRoleCodeSelectProperty("relatedSysRoleCode");
    } // end addRelatedSysRoleCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRelatedSysRoleCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysRoleRelateDAO.RelatedSysRoleCode, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleRelateDAO.RelatedSysRoleCode,
                "relatedSysRoleCode");
        } // end else
    } // end addRelatedSysRoleCodeSelectProperty()

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
            addSelectProperty(ISysRoleRelateDAO.SysRoleName, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleRelateDAO.SysRoleName, "sysRoleName");
        } // end else
    } // end addSysRoleNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addSysRoleCodeSelectProperty() {
        addSysRoleCodeSelectProperty("sysRoleCode");
    } // end addSysRoleCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addSysRoleCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysRoleRelateDAO.SysRoleCode, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleRelateDAO.SysRoleCode, "sysRoleCode");
        } // end else
    } // end addSysRoleCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addSysRoleTypeSelectProperty() {
        addSysRoleTypeSelectProperty("sysRoleType");
    } // end addSysRoleTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addSysRoleTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysRoleRelateDAO.SysRoleType, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleRelateDAO.SysRoleType, "sysRoleType");
        } // end else
    } // end addSysRoleTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addSysRoleDomainIdSelectProperty() {
        addSysRoleDomainIdSelectProperty("sysRoleDomainId");
    } // end addSysRoleDomainIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addSysRoleDomainIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysRoleRelateDAO.SysRoleDomainId, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleRelateDAO.SysRoleDomainId,
                "sysRoleDomainId");
        } // end else
    } // end addSysRoleDomainIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addSysDomainNameSelectProperty() {
        addSysDomainNameSelectProperty("sysDomainName");
    } // end addSysDomainNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addSysDomainNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysRoleRelateDAO.SysDomainName, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleRelateDAO.SysDomainName, "sysDomainName");
        } // end else
    } // end addSysDomainNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addSysDomainCodeSelectProperty() {
        addSysDomainCodeSelectProperty("sysDomainCode");
    } // end addSysDomainCodeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addSysDomainCodeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(ISysRoleRelateDAO.SysDomainCode, aAlias);
        } // end if
        else {
            addSelectProperty(ISysRoleRelateDAO.SysDomainCode, "sysDomainCode");
        } // end else
    } // end addSysDomainCodeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addRelatedSysRoleIdSelectProperty();

        addRemarksSelectProperty();

        addStatusSelectProperty();

        addSysRoleGroupIdSelectProperty();

        addRelatedSysRoleCodeSelectProperty();

        addSysRoleNameSelectProperty();

        addSysRoleCodeSelectProperty();

        addSysRoleTypeSelectProperty();

        addSysRoleDomainIdSelectProperty();

        addSysDomainNameSelectProperty();

        addSysDomainCodeSelectProperty();
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
            addCriterion("SYS_ROLE_RELATE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion("SYS_ROLE_RELATE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "SYS_ROLE_RELATE.ID is not null AND SYS_ROLE_RELATE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(SYS_ROLE_RELATE.ID is null OR SYS_ROLE_RELATE.ID = '')");

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
            addCriterion("SYS_ROLE_RELATE.ID =", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_ROLE_RELATE.ID");
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
            addCriterion("SYS_ROLE_RELATE.ID <>", value, "id");

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
            addCriterion("SYS_ROLE_RELATE.ID is null OR SYS_ROLE_RELATE.ID <>",
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
            StringBuffer str = new StringBuffer("SYS_ROLE_RELATE.ID");
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
            addCriterion("SYS_ROLE_RELATE.ID >", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_ROLE_RELATE.ID");
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
            addCriterion("SYS_ROLE_RELATE.ID >=", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_ROLE_RELATE.ID");
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
            addCriterion("SYS_ROLE_RELATE.ID <", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_ROLE_RELATE.ID");
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
            addCriterion("SYS_ROLE_RELATE.ID <=", value, "id");

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
            StringBuffer str = new StringBuffer("SYS_ROLE_RELATE.ID");
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
                addCriterion("SYS_ROLE_RELATE.ID in", values, "id");

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
                addCriterion("SYS_ROLE_RELATE.ID not in", values, "id");

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
                addCriterion("SYS_ROLE_RELATE.ID in", values, "id");

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
                addCriterion("SYS_ROLE_RELATE.ID not in", values, "id");

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
                addCriterion("SYS_ROLE_RELATE.ID in", Arrays.asList(values),
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
                addCriterion("SYS_ROLE_RELATE.ID not in",
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
            addCriterion("SYS_ROLE_RELATE.ID between", value1, value2, "id");

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
            addCriterion("SYS_ROLE_RELATE.ID between", value1, value2, "id");

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
            addCriterion("SYS_ROLE_RELATE.ID not between", value1, value2, "id");

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
            addCriterion("SYS_ROLE_RELATE.ID not between", value1, value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleIdIsNull() {
            addCriterion("SYS_ROLE_RELATE.RELATED_SYS_ROLE_ID is null");

            return this;
        } // end andRelatedSysRoleIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleIdIsNotNull() {
            addCriterion("SYS_ROLE_RELATE.RELATED_SYS_ROLE_ID is not null");

            return this;
        } // end andRelatedSysRoleIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleIdIsNotEmpty() {
            addCriterion(
                "SYS_ROLE_RELATE.RELATED_SYS_ROLE_ID is not null AND SYS_ROLE_RELATE.RELATED_SYS_ROLE_ID <> ''");

            return this;
        } // end andRelatedSysRoleIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleIdIsEmpty() {
            addCriterion(
                "(SYS_ROLE_RELATE.RELATED_SYS_ROLE_ID is null OR SYS_ROLE_RELATE.RELATED_SYS_ROLE_ID = '')");

            return this;
        } // end andRelatedSysRoleIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleIdEqualTo(long value) {
            return andRelatedSysRoleIdEqualTo(Long.valueOf(value));
        } // end andRelatedSysRoleIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleIdEqualTo(java.lang.Long value) {
            addCriterion("SYS_ROLE_RELATE.RELATED_SYS_ROLE_ID =", value,
                "relatedSysRoleId");

            return this;
        } // end andRelatedSysRoleIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RELATE.RELATED_SYS_ROLE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedSysRoleIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleIdNotEqualTo(long value) {
            return andRelatedSysRoleIdNotEqualTo(Long.valueOf(value));
        } // end andRelatedSysRoleIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleIdNotEqualTo(java.lang.Long value) {
            addCriterion("SYS_ROLE_RELATE.RELATED_SYS_ROLE_ID <>", value,
                "relatedSysRoleId");

            return this;
        } // end andRelatedSysRoleIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleIdNotEqualToOrIsNull(long value) {
            return andRelatedSysRoleIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andRelatedSysRoleIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("SYS_ROLE_RELATE.RELATED_SYS_ROLE_ID is null OR SYS_ROLE_RELATE.RELATED_SYS_ROLE_ID <>",
                value, "relatedSysRoleId");

            return this;
        } // end andRelatedSysRoleIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RELATE.RELATED_SYS_ROLE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedSysRoleIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleIdGreaterThan(long value) {
            return andRelatedSysRoleIdGreaterThan(Long.valueOf(value));
        } // end andRelatedSysRoleIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleIdGreaterThan(java.lang.Long value) {
            addCriterion("SYS_ROLE_RELATE.RELATED_SYS_ROLE_ID >", value,
                "relatedSysRoleId");

            return this;
        } // end andRelatedSysRoleIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RELATE.RELATED_SYS_ROLE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedSysRoleIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleIdGreaterThanOrEqualTo(long value) {
            return andRelatedSysRoleIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andRelatedSysRoleIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("SYS_ROLE_RELATE.RELATED_SYS_ROLE_ID >=", value,
                "relatedSysRoleId");

            return this;
        } // end andRelatedSysRoleIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RELATE.RELATED_SYS_ROLE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedSysRoleIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleIdLessThan(long value) {
            return andRelatedSysRoleIdLessThan(Long.valueOf(value));
        } // end andRelatedSysRoleIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleIdLessThan(java.lang.Long value) {
            addCriterion("SYS_ROLE_RELATE.RELATED_SYS_ROLE_ID <", value,
                "relatedSysRoleId");

            return this;
        } // end andRelatedSysRoleIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RELATE.RELATED_SYS_ROLE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedSysRoleIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleIdLessThanOrEqualTo(long value) {
            return andRelatedSysRoleIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andRelatedSysRoleIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("SYS_ROLE_RELATE.RELATED_SYS_ROLE_ID <=", value,
                "relatedSysRoleId");

            return this;
        } // end andRelatedSysRoleIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RELATE.RELATED_SYS_ROLE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedSysRoleIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleIdIn(long[] values) {
            if (values.length == 1) {
                return andRelatedSysRoleIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE_RELATE.RELATED_SYS_ROLE_ID in", values,
                    "relatedSysRoleId");

                return this;
            } // end else
        } // end andRelatedSysRoleIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleIdNotIn(long[] values) {
            if (values.length == 1) {
                return andRelatedSysRoleIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE_RELATE.RELATED_SYS_ROLE_ID not in",
                    values, "relatedSysRoleId");

                return this;
            } // end else
        } // end andRelatedSysRoleIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleIdIn(List values) {
            if (values.size() == 1) {
                return andRelatedSysRoleIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("SYS_ROLE_RELATE.RELATED_SYS_ROLE_ID in", values,
                    "relatedSysRoleId");

                return this;
            } // end else
        } // end andRelatedSysRoleIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleIdNotIn(List values) {
            if (values.size() == 1) {
                return andRelatedSysRoleIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("SYS_ROLE_RELATE.RELATED_SYS_ROLE_ID not in",
                    values, "relatedSysRoleId");

                return this;
            } // end else
        } // end andRelatedSysRoleIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleIdIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedSysRoleIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE_RELATE.RELATED_SYS_ROLE_ID in",
                    Arrays.asList(values), "relatedSysRoleId");

                return this;
            } // end else
        } // end andRelatedSysRoleIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedSysRoleIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE_RELATE.RELATED_SYS_ROLE_ID not in",
                    Arrays.asList(values), "relatedSysRoleId");

                return this;
            } // end else
        } // end andRelatedSysRoleIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleIdBetween(long value1, long value2) {
            addCriterion("SYS_ROLE_RELATE.RELATED_SYS_ROLE_ID between", value1,
                value2, "relatedSysRoleId");

            return this;
        } // end andRelatedSysRoleIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("SYS_ROLE_RELATE.RELATED_SYS_ROLE_ID between", value1,
                value2, "relatedSysRoleId");

            return this;
        } // end andRelatedSysRoleIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleIdNotBetween(long value1, long value2) {
            addCriterion("SYS_ROLE_RELATE.RELATED_SYS_ROLE_ID not between",
                value1, value2, "relatedSysRoleId");

            return this;
        } // end andRelatedSysRoleIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("SYS_ROLE_RELATE.RELATED_SYS_ROLE_ID not between",
                value1, value2, "relatedSysRoleId");

            return this;
        } // end andRelatedSysRoleIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNull() {
            addCriterion("SYS_ROLE_RELATE.REMARKS is null");

            return this;
        } // end andRemarksIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotNull() {
            addCriterion("SYS_ROLE_RELATE.REMARKS is not null");

            return this;
        } // end andRemarksIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsNotEmpty() {
            addCriterion(
                "SYS_ROLE_RELATE.REMARKS is not null AND SYS_ROLE_RELATE.REMARKS <> ''");

            return this;
        } // end andRemarksIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRemarksIsEmpty() {
            addCriterion(
                "(SYS_ROLE_RELATE.REMARKS is null OR SYS_ROLE_RELATE.REMARKS = '')");

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
            addCriterion("SYS_ROLE_RELATE.REMARKS =", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_ROLE_RELATE.REMARKS");
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
            addCriterion("SYS_ROLE_RELATE.REMARKS <>", value, "remarks");

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
            addCriterion("SYS_ROLE_RELATE.REMARKS is null OR SYS_ROLE_RELATE.REMARKS <>",
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
            StringBuffer str = new StringBuffer("SYS_ROLE_RELATE.REMARKS");
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
            addCriterion("SYS_ROLE_RELATE.REMARKS >", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_ROLE_RELATE.REMARKS");
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
            addCriterion("SYS_ROLE_RELATE.REMARKS >=", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_ROLE_RELATE.REMARKS");
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
            addCriterion("SYS_ROLE_RELATE.REMARKS <", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_ROLE_RELATE.REMARKS");
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
            addCriterion("SYS_ROLE_RELATE.REMARKS <=", value, "remarks");

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
            StringBuffer str = new StringBuffer("SYS_ROLE_RELATE.REMARKS");
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
            addCriterion("SYS_ROLE_RELATE.REMARKS like", buffer.toString(),
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
            addCriterion("SYS_ROLE_RELATE.REMARKS not like", buffer.toString(),
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
                addCriterion("SYS_ROLE_RELATE.REMARKS in", values, "remarks");

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
                addCriterion("SYS_ROLE_RELATE.REMARKS not in", values, "remarks");

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
                addCriterion("SYS_ROLE_RELATE.REMARKS in",
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
                addCriterion("SYS_ROLE_RELATE.REMARKS not in",
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
            addCriterion("SYS_ROLE_RELATE.REMARKS between", value1, value2,
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
            addCriterion("SYS_ROLE_RELATE.REMARKS not between", value1, value2,
                "remarks");

            return this;
        } // end andRemarksNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion("SYS_ROLE_RELATE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("SYS_ROLE_RELATE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "SYS_ROLE_RELATE.STATUS is not null AND SYS_ROLE_RELATE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(SYS_ROLE_RELATE.STATUS is null OR SYS_ROLE_RELATE.STATUS = '')");

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
            addCriterion("SYS_ROLE_RELATE.STATUS =", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_ROLE_RELATE.STATUS");
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
            addCriterion("SYS_ROLE_RELATE.STATUS <>", value, "status");

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
            addCriterion("SYS_ROLE_RELATE.STATUS is null OR SYS_ROLE_RELATE.STATUS <>",
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
            StringBuffer str = new StringBuffer("SYS_ROLE_RELATE.STATUS");
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
            addCriterion("SYS_ROLE_RELATE.STATUS >", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_ROLE_RELATE.STATUS");
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
            addCriterion("SYS_ROLE_RELATE.STATUS >=", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_ROLE_RELATE.STATUS");
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
            addCriterion("SYS_ROLE_RELATE.STATUS <", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_ROLE_RELATE.STATUS");
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
            addCriterion("SYS_ROLE_RELATE.STATUS <=", value, "status");

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
            StringBuffer str = new StringBuffer("SYS_ROLE_RELATE.STATUS");
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
            addCriterion("SYS_ROLE_RELATE.STATUS like", buffer.toString(),
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
            addCriterion("SYS_ROLE_RELATE.STATUS not like", buffer.toString(),
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
                addCriterion("SYS_ROLE_RELATE.STATUS in", values, "status");

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
                addCriterion("SYS_ROLE_RELATE.STATUS not in", values, "status");

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
                addCriterion("SYS_ROLE_RELATE.STATUS in",
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
                addCriterion("SYS_ROLE_RELATE.STATUS not in",
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
            addCriterion("SYS_ROLE_RELATE.STATUS between", value1, value2,
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
            addCriterion("SYS_ROLE_RELATE.STATUS not between", value1, value2,
                "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleGroupIdIsNull() {
            addCriterion("SYS_ROLE_RELATE.SYS_ROLE_GROUP_ID is null");

            return this;
        } // end andSysRoleGroupIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleGroupIdIsNotNull() {
            addCriterion("SYS_ROLE_RELATE.SYS_ROLE_GROUP_ID is not null");

            return this;
        } // end andSysRoleGroupIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleGroupIdIsNotEmpty() {
            addCriterion(
                "SYS_ROLE_RELATE.SYS_ROLE_GROUP_ID is not null AND SYS_ROLE_RELATE.SYS_ROLE_GROUP_ID <> ''");

            return this;
        } // end andSysRoleGroupIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleGroupIdIsEmpty() {
            addCriterion(
                "(SYS_ROLE_RELATE.SYS_ROLE_GROUP_ID is null OR SYS_ROLE_RELATE.SYS_ROLE_GROUP_ID = '')");

            return this;
        } // end andSysRoleGroupIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleGroupIdEqualTo(long value) {
            return andSysRoleGroupIdEqualTo(Long.valueOf(value));
        } // end andSysRoleGroupIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleGroupIdEqualTo(java.lang.Long value) {
            addCriterion("SYS_ROLE_RELATE.SYS_ROLE_GROUP_ID =", value,
                "sysRoleGroupId");

            return this;
        } // end andSysRoleGroupIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleGroupIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RELATE.SYS_ROLE_GROUP_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysRoleGroupIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleGroupIdNotEqualTo(long value) {
            return andSysRoleGroupIdNotEqualTo(Long.valueOf(value));
        } // end andSysRoleGroupIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleGroupIdNotEqualTo(java.lang.Long value) {
            addCriterion("SYS_ROLE_RELATE.SYS_ROLE_GROUP_ID <>", value,
                "sysRoleGroupId");

            return this;
        } // end andSysRoleGroupIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleGroupIdNotEqualToOrIsNull(long value) {
            return andSysRoleGroupIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andSysRoleGroupIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleGroupIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("SYS_ROLE_RELATE.SYS_ROLE_GROUP_ID is null OR SYS_ROLE_RELATE.SYS_ROLE_GROUP_ID <>",
                value, "sysRoleGroupId");

            return this;
        } // end andSysRoleGroupIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleGroupIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RELATE.SYS_ROLE_GROUP_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysRoleGroupIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleGroupIdGreaterThan(long value) {
            return andSysRoleGroupIdGreaterThan(Long.valueOf(value));
        } // end andSysRoleGroupIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleGroupIdGreaterThan(java.lang.Long value) {
            addCriterion("SYS_ROLE_RELATE.SYS_ROLE_GROUP_ID >", value,
                "sysRoleGroupId");

            return this;
        } // end andSysRoleGroupIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleGroupIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RELATE.SYS_ROLE_GROUP_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysRoleGroupIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleGroupIdGreaterThanOrEqualTo(long value) {
            return andSysRoleGroupIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andSysRoleGroupIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleGroupIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("SYS_ROLE_RELATE.SYS_ROLE_GROUP_ID >=", value,
                "sysRoleGroupId");

            return this;
        } // end andSysRoleGroupIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleGroupIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RELATE.SYS_ROLE_GROUP_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysRoleGroupIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleGroupIdLessThan(long value) {
            return andSysRoleGroupIdLessThan(Long.valueOf(value));
        } // end andSysRoleGroupIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleGroupIdLessThan(java.lang.Long value) {
            addCriterion("SYS_ROLE_RELATE.SYS_ROLE_GROUP_ID <", value,
                "sysRoleGroupId");

            return this;
        } // end andSysRoleGroupIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleGroupIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RELATE.SYS_ROLE_GROUP_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysRoleGroupIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleGroupIdLessThanOrEqualTo(long value) {
            return andSysRoleGroupIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andSysRoleGroupIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleGroupIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("SYS_ROLE_RELATE.SYS_ROLE_GROUP_ID <=", value,
                "sysRoleGroupId");

            return this;
        } // end andSysRoleGroupIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleGroupIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RELATE.SYS_ROLE_GROUP_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysRoleGroupIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleGroupIdIn(long[] values) {
            if (values.length == 1) {
                return andSysRoleGroupIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE_RELATE.SYS_ROLE_GROUP_ID in", values,
                    "sysRoleGroupId");

                return this;
            } // end else
        } // end andSysRoleGroupIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleGroupIdNotIn(long[] values) {
            if (values.length == 1) {
                return andSysRoleGroupIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE_RELATE.SYS_ROLE_GROUP_ID not in",
                    values, "sysRoleGroupId");

                return this;
            } // end else
        } // end andSysRoleGroupIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleGroupIdIn(List values) {
            if (values.size() == 1) {
                return andSysRoleGroupIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("SYS_ROLE_RELATE.SYS_ROLE_GROUP_ID in", values,
                    "sysRoleGroupId");

                return this;
            } // end else
        } // end andSysRoleGroupIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleGroupIdNotIn(List values) {
            if (values.size() == 1) {
                return andSysRoleGroupIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("SYS_ROLE_RELATE.SYS_ROLE_GROUP_ID not in",
                    values, "sysRoleGroupId");

                return this;
            } // end else
        } // end andSysRoleGroupIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleGroupIdIn(Object[] values) {
            if (values.length == 1) {
                return andSysRoleGroupIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE_RELATE.SYS_ROLE_GROUP_ID in",
                    Arrays.asList(values), "sysRoleGroupId");

                return this;
            } // end else
        } // end andSysRoleGroupIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleGroupIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andSysRoleGroupIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE_RELATE.SYS_ROLE_GROUP_ID not in",
                    Arrays.asList(values), "sysRoleGroupId");

                return this;
            } // end else
        } // end andSysRoleGroupIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleGroupIdBetween(long value1, long value2) {
            addCriterion("SYS_ROLE_RELATE.SYS_ROLE_GROUP_ID between", value1,
                value2, "sysRoleGroupId");

            return this;
        } // end andSysRoleGroupIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleGroupIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("SYS_ROLE_RELATE.SYS_ROLE_GROUP_ID between", value1,
                value2, "sysRoleGroupId");

            return this;
        } // end andSysRoleGroupIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleGroupIdNotBetween(long value1, long value2) {
            addCriterion("SYS_ROLE_RELATE.SYS_ROLE_GROUP_ID not between",
                value1, value2, "sysRoleGroupId");

            return this;
        } // end andSysRoleGroupIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleGroupIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("SYS_ROLE_RELATE.SYS_ROLE_GROUP_ID not between",
                value1, value2, "sysRoleGroupId");

            return this;
        } // end andSysRoleGroupIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleCodeIsNull() {
            addCriterion("SYS_ROLE_RELATE.RELATED_SYS_ROLE_CODE is null");

            return this;
        } // end andRelatedSysRoleCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleCodeIsNotNull() {
            addCriterion("SYS_ROLE_RELATE.RELATED_SYS_ROLE_CODE is not null");

            return this;
        } // end andRelatedSysRoleCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleCodeIsNotEmpty() {
            addCriterion(
                "SYS_ROLE_RELATE.RELATED_SYS_ROLE_CODE is not null AND SYS_ROLE_RELATE.RELATED_SYS_ROLE_CODE <> ''");

            return this;
        } // end andRelatedSysRoleCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleCodeIsEmpty() {
            addCriterion(
                "(SYS_ROLE_RELATE.RELATED_SYS_ROLE_CODE is null OR SYS_ROLE_RELATE.RELATED_SYS_ROLE_CODE = '')");

            return this;
        } // end andRelatedSysRoleCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleCodeEqualTo(String value) {
            addCriterion("SYS_ROLE_RELATE.RELATED_SYS_ROLE_CODE =", value,
                "relatedSysRoleCode");

            return this;
        } // end andRelatedSysRoleCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleCodeEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RELATE.RELATED_SYS_ROLE_CODE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedSysRoleCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleCodeNotEqualTo(String value) {
            addCriterion("SYS_ROLE_RELATE.RELATED_SYS_ROLE_CODE <>", value,
                "relatedSysRoleCode");

            return this;
        } // end andRelatedSysRoleCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleCodeNotEqualToOrIsNull(String value) {
            addCriterion("SYS_ROLE_RELATE.RELATED_SYS_ROLE_CODE is null OR SYS_ROLE_RELATE.RELATED_SYS_ROLE_CODE <>",
                value, "relatedSysRoleCode");

            return this;
        } // end andRelatedSysRoleCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleCodeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RELATE.RELATED_SYS_ROLE_CODE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedSysRoleCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleCodeGreaterThan(String value) {
            addCriterion("SYS_ROLE_RELATE.RELATED_SYS_ROLE_CODE >", value,
                "relatedSysRoleCode");

            return this;
        } // end andRelatedSysRoleCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleCodeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RELATE.RELATED_SYS_ROLE_CODE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedSysRoleCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_ROLE_RELATE.RELATED_SYS_ROLE_CODE >=", value,
                "relatedSysRoleCode");

            return this;
        } // end andRelatedSysRoleCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RELATE.RELATED_SYS_ROLE_CODE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedSysRoleCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleCodeLessThan(String value) {
            addCriterion("SYS_ROLE_RELATE.RELATED_SYS_ROLE_CODE <", value,
                "relatedSysRoleCode");

            return this;
        } // end andRelatedSysRoleCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleCodeLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RELATE.RELATED_SYS_ROLE_CODE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedSysRoleCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleCodeLessThanOrEqualTo(String value) {
            addCriterion("SYS_ROLE_RELATE.RELATED_SYS_ROLE_CODE <=", value,
                "relatedSysRoleCode");

            return this;
        } // end andRelatedSysRoleCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleCodeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "SYS_ROLE_RELATE.RELATED_SYS_ROLE_CODE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedSysRoleCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_ROLE_RELATE.RELATED_SYS_ROLE_CODE like",
                buffer.toString(), "relatedSysRoleCode");

            return this;
        } // end andRelatedSysRoleCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("SYS_ROLE_RELATE.RELATED_SYS_ROLE_CODE not like",
                buffer.toString(), "relatedSysRoleCode");

            return this;
        } // end andRelatedSysRoleCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleCodeIn(List values) {
            if (values.size() == 1) {
                return andRelatedSysRoleCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_ROLE_RELATE.RELATED_SYS_ROLE_CODE in",
                    values, "relatedSysRoleCode");

                return this;
            } // end else
        } // end andRelatedSysRoleCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleCodeNotIn(List values) {
            if (values.size() == 1) {
                return andRelatedSysRoleCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("SYS_ROLE_RELATE.RELATED_SYS_ROLE_CODE not in",
                    values, "relatedSysRoleCode");

                return this;
            } // end else
        } // end andRelatedSysRoleCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleCodeIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedSysRoleCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE_RELATE.RELATED_SYS_ROLE_CODE in",
                    Arrays.asList(values), "relatedSysRoleCode");

                return this;
            } // end else
        } // end andRelatedSysRoleCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedSysRoleCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("SYS_ROLE_RELATE.RELATED_SYS_ROLE_CODE not in",
                    Arrays.asList(values), "relatedSysRoleCode");

                return this;
            } // end else
        } // end andRelatedSysRoleCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleCodeBetween(String value1,
            String value2) {
            addCriterion("SYS_ROLE_RELATE.RELATED_SYS_ROLE_CODE between",
                value1, value2, "relatedSysRoleCode");

            return this;
        } // end andRelatedSysRoleCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedSysRoleCodeNotBetween(String value1,
            String value2) {
            addCriterion("SYS_ROLE_RELATE.RELATED_SYS_ROLE_CODE not between",
                value1, value2, "relatedSysRoleCode");

            return this;
        } // end andRelatedSysRoleCodeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleNameIsNull() {
            addCriterion("sysRoleA.ROLE_NAME is null");

            return this;
        } // end andSysRoleNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleNameIsNotNull() {
            addCriterion("sysRoleA.ROLE_NAME is not null");

            return this;
        } // end andSysRoleNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleNameIsNotEmpty() {
            addCriterion(
                "sysRoleA.ROLE_NAME is not null AND sysRoleA.ROLE_NAME <> ''");

            return this;
        } // end andSysRoleNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleNameIsEmpty() {
            addCriterion(
                "(sysRoleA.ROLE_NAME is null OR sysRoleA.ROLE_NAME = '')");

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
            addCriterion("sysRoleA.ROLE_NAME =", value, "sysRoleName");

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
            StringBuffer str = new StringBuffer("sysRoleA.ROLE_NAME");
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
            addCriterion("sysRoleA.ROLE_NAME <>", value, "sysRoleName");

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
            addCriterion("sysRoleA.ROLE_NAME is null OR sysRoleA.ROLE_NAME <>",
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
            StringBuffer str = new StringBuffer("sysRoleA.ROLE_NAME");
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
            addCriterion("sysRoleA.ROLE_NAME >", value, "sysRoleName");

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
            StringBuffer str = new StringBuffer("sysRoleA.ROLE_NAME");
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
            addCriterion("sysRoleA.ROLE_NAME >=", value, "sysRoleName");

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
            StringBuffer str = new StringBuffer("sysRoleA.ROLE_NAME");
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
            addCriterion("sysRoleA.ROLE_NAME <", value, "sysRoleName");

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
            StringBuffer str = new StringBuffer("sysRoleA.ROLE_NAME");
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
            addCriterion("sysRoleA.ROLE_NAME <=", value, "sysRoleName");

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
            StringBuffer str = new StringBuffer("sysRoleA.ROLE_NAME");
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
            addCriterion("sysRoleA.ROLE_NAME like", buffer.toString(),
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
            addCriterion("sysRoleA.ROLE_NAME not like", buffer.toString(),
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
                addCriterion("sysRoleA.ROLE_NAME in", values, "sysRoleName");

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
                addCriterion("sysRoleA.ROLE_NAME not in", values, "sysRoleName");

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
                addCriterion("sysRoleA.ROLE_NAME in", Arrays.asList(values),
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
                addCriterion("sysRoleA.ROLE_NAME not in",
                    Arrays.asList(values), "sysRoleName");

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
            addCriterion("sysRoleA.ROLE_NAME between", value1, value2,
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
            addCriterion("sysRoleA.ROLE_NAME not between", value1, value2,
                "sysRoleName");

            return this;
        } // end andSysRoleNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleCodeIsNull() {
            addCriterion("sysRoleA.ROLE_CODE is null");

            return this;
        } // end andSysRoleCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleCodeIsNotNull() {
            addCriterion("sysRoleA.ROLE_CODE is not null");

            return this;
        } // end andSysRoleCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleCodeIsNotEmpty() {
            addCriterion(
                "sysRoleA.ROLE_CODE is not null AND sysRoleA.ROLE_CODE <> ''");

            return this;
        } // end andSysRoleCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleCodeIsEmpty() {
            addCriterion(
                "(sysRoleA.ROLE_CODE is null OR sysRoleA.ROLE_CODE = '')");

            return this;
        } // end andSysRoleCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleCodeEqualTo(String value) {
            addCriterion("sysRoleA.ROLE_CODE =", value, "sysRoleCode");

            return this;
        } // end andSysRoleCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleCodeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysRoleA.ROLE_CODE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysRoleCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleCodeNotEqualTo(String value) {
            addCriterion("sysRoleA.ROLE_CODE <>", value, "sysRoleCode");

            return this;
        } // end andSysRoleCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleCodeNotEqualToOrIsNull(String value) {
            addCriterion("sysRoleA.ROLE_CODE is null OR sysRoleA.ROLE_CODE <>",
                value, "sysRoleCode");

            return this;
        } // end andSysRoleCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleCodeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysRoleA.ROLE_CODE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysRoleCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleCodeGreaterThan(String value) {
            addCriterion("sysRoleA.ROLE_CODE >", value, "sysRoleCode");

            return this;
        } // end andSysRoleCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleCodeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysRoleA.ROLE_CODE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysRoleCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sysRoleA.ROLE_CODE >=", value, "sysRoleCode");

            return this;
        } // end andSysRoleCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysRoleA.ROLE_CODE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysRoleCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleCodeLessThan(String value) {
            addCriterion("sysRoleA.ROLE_CODE <", value, "sysRoleCode");

            return this;
        } // end andSysRoleCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleCodeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysRoleA.ROLE_CODE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysRoleCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleCodeLessThanOrEqualTo(String value) {
            addCriterion("sysRoleA.ROLE_CODE <=", value, "sysRoleCode");

            return this;
        } // end andSysRoleCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleCodeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysRoleA.ROLE_CODE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysRoleCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysRoleA.ROLE_CODE like", buffer.toString(),
                "sysRoleCode");

            return this;
        } // end andSysRoleCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysRoleA.ROLE_CODE not like", buffer.toString(),
                "sysRoleCode");

            return this;
        } // end andSysRoleCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleCodeIn(List values) {
            if (values.size() == 1) {
                return andSysRoleCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysRoleA.ROLE_CODE in", values, "sysRoleCode");

                return this;
            } // end else
        } // end andSysRoleCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleCodeNotIn(List values) {
            if (values.size() == 1) {
                return andSysRoleCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysRoleA.ROLE_CODE not in", values, "sysRoleCode");

                return this;
            } // end else
        } // end andSysRoleCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleCodeIn(Object[] values) {
            if (values.length == 1) {
                return andSysRoleCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysRoleA.ROLE_CODE in", Arrays.asList(values),
                    "sysRoleCode");

                return this;
            } // end else
        } // end andSysRoleCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andSysRoleCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysRoleA.ROLE_CODE not in",
                    Arrays.asList(values), "sysRoleCode");

                return this;
            } // end else
        } // end andSysRoleCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleCodeBetween(String value1, String value2) {
            addCriterion("sysRoleA.ROLE_CODE between", value1, value2,
                "sysRoleCode");

            return this;
        } // end andSysRoleCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleCodeNotBetween(String value1, String value2) {
            addCriterion("sysRoleA.ROLE_CODE not between", value1, value2,
                "sysRoleCode");

            return this;
        } // end andSysRoleCodeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleTypeIsNull() {
            addCriterion("sysRoleA.ROLE_TYPE is null");

            return this;
        } // end andSysRoleTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleTypeIsNotNull() {
            addCriterion("sysRoleA.ROLE_TYPE is not null");

            return this;
        } // end andSysRoleTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleTypeIsNotEmpty() {
            addCriterion(
                "sysRoleA.ROLE_TYPE is not null AND sysRoleA.ROLE_TYPE <> ''");

            return this;
        } // end andSysRoleTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleTypeIsEmpty() {
            addCriterion(
                "(sysRoleA.ROLE_TYPE is null OR sysRoleA.ROLE_TYPE = '')");

            return this;
        } // end andSysRoleTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleTypeEqualTo(String value) {
            addCriterion("sysRoleA.ROLE_TYPE =", value, "sysRoleType");

            return this;
        } // end andSysRoleTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleTypeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysRoleA.ROLE_TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysRoleTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleTypeNotEqualTo(String value) {
            addCriterion("sysRoleA.ROLE_TYPE <>", value, "sysRoleType");

            return this;
        } // end andSysRoleTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleTypeNotEqualToOrIsNull(String value) {
            addCriterion("sysRoleA.ROLE_TYPE is null OR sysRoleA.ROLE_TYPE <>",
                value, "sysRoleType");

            return this;
        } // end andSysRoleTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleTypeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysRoleA.ROLE_TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysRoleTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleTypeGreaterThan(String value) {
            addCriterion("sysRoleA.ROLE_TYPE >", value, "sysRoleType");

            return this;
        } // end andSysRoleTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleTypeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysRoleA.ROLE_TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysRoleTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("sysRoleA.ROLE_TYPE >=", value, "sysRoleType");

            return this;
        } // end andSysRoleTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysRoleA.ROLE_TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysRoleTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleTypeLessThan(String value) {
            addCriterion("sysRoleA.ROLE_TYPE <", value, "sysRoleType");

            return this;
        } // end andSysRoleTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleTypeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysRoleA.ROLE_TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysRoleTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleTypeLessThanOrEqualTo(String value) {
            addCriterion("sysRoleA.ROLE_TYPE <=", value, "sysRoleType");

            return this;
        } // end andSysRoleTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysRoleA.ROLE_TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysRoleTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysRoleA.ROLE_TYPE like", buffer.toString(),
                "sysRoleType");

            return this;
        } // end andSysRoleTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysRoleA.ROLE_TYPE not like", buffer.toString(),
                "sysRoleType");

            return this;
        } // end andSysRoleTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleTypeIn(List values) {
            if (values.size() == 1) {
                return andSysRoleTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysRoleA.ROLE_TYPE in", values, "sysRoleType");

                return this;
            } // end else
        } // end andSysRoleTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleTypeNotIn(List values) {
            if (values.size() == 1) {
                return andSysRoleTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysRoleA.ROLE_TYPE not in", values, "sysRoleType");

                return this;
            } // end else
        } // end andSysRoleTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleTypeIn(Object[] values) {
            if (values.length == 1) {
                return andSysRoleTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysRoleA.ROLE_TYPE in", Arrays.asList(values),
                    "sysRoleType");

                return this;
            } // end else
        } // end andSysRoleTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andSysRoleTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysRoleA.ROLE_TYPE not in",
                    Arrays.asList(values), "sysRoleType");

                return this;
            } // end else
        } // end andSysRoleTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleTypeBetween(String value1, String value2) {
            addCriterion("sysRoleA.ROLE_TYPE between", value1, value2,
                "sysRoleType");

            return this;
        } // end andSysRoleTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleTypeNotBetween(String value1, String value2) {
            addCriterion("sysRoleA.ROLE_TYPE not between", value1, value2,
                "sysRoleType");

            return this;
        } // end andSysRoleTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleDomainIdIsNull() {
            addCriterion("sysRoleA.DOMAIN_ID is null");

            return this;
        } // end andSysRoleDomainIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleDomainIdIsNotNull() {
            addCriterion("sysRoleA.DOMAIN_ID is not null");

            return this;
        } // end andSysRoleDomainIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleDomainIdIsNotEmpty() {
            addCriterion(
                "sysRoleA.DOMAIN_ID is not null AND sysRoleA.DOMAIN_ID <> ''");

            return this;
        } // end andSysRoleDomainIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleDomainIdIsEmpty() {
            addCriterion(
                "(sysRoleA.DOMAIN_ID is null OR sysRoleA.DOMAIN_ID = '')");

            return this;
        } // end andSysRoleDomainIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleDomainIdEqualTo(long value) {
            return andSysRoleDomainIdEqualTo(Long.valueOf(value));
        } // end andSysRoleDomainIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleDomainIdEqualTo(java.lang.Long value) {
            addCriterion("sysRoleA.DOMAIN_ID =", value, "sysRoleDomainId");

            return this;
        } // end andSysRoleDomainIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleDomainIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysRoleA.DOMAIN_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysRoleDomainIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleDomainIdNotEqualTo(long value) {
            return andSysRoleDomainIdNotEqualTo(Long.valueOf(value));
        } // end andSysRoleDomainIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleDomainIdNotEqualTo(java.lang.Long value) {
            addCriterion("sysRoleA.DOMAIN_ID <>", value, "sysRoleDomainId");

            return this;
        } // end andSysRoleDomainIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleDomainIdNotEqualToOrIsNull(long value) {
            return andSysRoleDomainIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andSysRoleDomainIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleDomainIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("sysRoleA.DOMAIN_ID is null OR sysRoleA.DOMAIN_ID <>",
                value, "sysRoleDomainId");

            return this;
        } // end andSysRoleDomainIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleDomainIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysRoleA.DOMAIN_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysRoleDomainIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleDomainIdGreaterThan(long value) {
            return andSysRoleDomainIdGreaterThan(Long.valueOf(value));
        } // end andSysRoleDomainIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleDomainIdGreaterThan(java.lang.Long value) {
            addCriterion("sysRoleA.DOMAIN_ID >", value, "sysRoleDomainId");

            return this;
        } // end andSysRoleDomainIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleDomainIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysRoleA.DOMAIN_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysRoleDomainIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleDomainIdGreaterThanOrEqualTo(long value) {
            return andSysRoleDomainIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andSysRoleDomainIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleDomainIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("sysRoleA.DOMAIN_ID >=", value, "sysRoleDomainId");

            return this;
        } // end andSysRoleDomainIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleDomainIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysRoleA.DOMAIN_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysRoleDomainIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleDomainIdLessThan(long value) {
            return andSysRoleDomainIdLessThan(Long.valueOf(value));
        } // end andSysRoleDomainIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleDomainIdLessThan(java.lang.Long value) {
            addCriterion("sysRoleA.DOMAIN_ID <", value, "sysRoleDomainId");

            return this;
        } // end andSysRoleDomainIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleDomainIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysRoleA.DOMAIN_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysRoleDomainIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleDomainIdLessThanOrEqualTo(long value) {
            return andSysRoleDomainIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andSysRoleDomainIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleDomainIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("sysRoleA.DOMAIN_ID <=", value, "sysRoleDomainId");

            return this;
        } // end andSysRoleDomainIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleDomainIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysRoleA.DOMAIN_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysRoleDomainIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleDomainIdIn(long[] values) {
            if (values.length == 1) {
                return andSysRoleDomainIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("sysRoleA.DOMAIN_ID in", values, "sysRoleDomainId");

                return this;
            } // end else
        } // end andSysRoleDomainIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleDomainIdNotIn(long[] values) {
            if (values.length == 1) {
                return andSysRoleDomainIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("sysRoleA.DOMAIN_ID not in", values,
                    "sysRoleDomainId");

                return this;
            } // end else
        } // end andSysRoleDomainIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleDomainIdIn(List values) {
            if (values.size() == 1) {
                return andSysRoleDomainIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("sysRoleA.DOMAIN_ID in", values, "sysRoleDomainId");

                return this;
            } // end else
        } // end andSysRoleDomainIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleDomainIdNotIn(List values) {
            if (values.size() == 1) {
                return andSysRoleDomainIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("sysRoleA.DOMAIN_ID not in", values,
                    "sysRoleDomainId");

                return this;
            } // end else
        } // end andSysRoleDomainIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleDomainIdIn(Object[] values) {
            if (values.length == 1) {
                return andSysRoleDomainIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("sysRoleA.DOMAIN_ID in", Arrays.asList(values),
                    "sysRoleDomainId");

                return this;
            } // end else
        } // end andSysRoleDomainIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleDomainIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andSysRoleDomainIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("sysRoleA.DOMAIN_ID not in",
                    Arrays.asList(values), "sysRoleDomainId");

                return this;
            } // end else
        } // end andSysRoleDomainIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleDomainIdBetween(long value1, long value2) {
            addCriterion("sysRoleA.DOMAIN_ID between", value1, value2,
                "sysRoleDomainId");

            return this;
        } // end andSysRoleDomainIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleDomainIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("sysRoleA.DOMAIN_ID between", value1, value2,
                "sysRoleDomainId");

            return this;
        } // end andSysRoleDomainIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleDomainIdNotBetween(long value1, long value2) {
            addCriterion("sysRoleA.DOMAIN_ID not between", value1, value2,
                "sysRoleDomainId");

            return this;
        } // end andSysRoleDomainIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysRoleDomainIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("sysRoleA.DOMAIN_ID not between", value1, value2,
                "sysRoleDomainId");

            return this;
        } // end andSysRoleDomainIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainNameIsNull() {
            addCriterion("sysDomianA.DOMAIN_NAME is null");

            return this;
        } // end andSysDomainNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainNameIsNotNull() {
            addCriterion("sysDomianA.DOMAIN_NAME is not null");

            return this;
        } // end andSysDomainNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainNameIsNotEmpty() {
            addCriterion(
                "sysDomianA.DOMAIN_NAME is not null AND sysDomianA.DOMAIN_NAME <> ''");

            return this;
        } // end andSysDomainNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainNameIsEmpty() {
            addCriterion(
                "(sysDomianA.DOMAIN_NAME is null OR sysDomianA.DOMAIN_NAME = '')");

            return this;
        } // end andSysDomainNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainNameEqualTo(String value) {
            addCriterion("sysDomianA.DOMAIN_NAME =", value, "sysDomainName");

            return this;
        } // end andSysDomainNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysDomianA.DOMAIN_NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysDomainNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainNameNotEqualTo(String value) {
            addCriterion("sysDomianA.DOMAIN_NAME <>", value, "sysDomainName");

            return this;
        } // end andSysDomainNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainNameNotEqualToOrIsNull(String value) {
            addCriterion("sysDomianA.DOMAIN_NAME is null OR sysDomianA.DOMAIN_NAME <>",
                value, "sysDomainName");

            return this;
        } // end andSysDomainNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysDomianA.DOMAIN_NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysDomainNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainNameGreaterThan(String value) {
            addCriterion("sysDomianA.DOMAIN_NAME >", value, "sysDomainName");

            return this;
        } // end andSysDomainNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysDomianA.DOMAIN_NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysDomainNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainNameGreaterThanOrEqualTo(String value) {
            addCriterion("sysDomianA.DOMAIN_NAME >=", value, "sysDomainName");

            return this;
        } // end andSysDomainNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysDomianA.DOMAIN_NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysDomainNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainNameLessThan(String value) {
            addCriterion("sysDomianA.DOMAIN_NAME <", value, "sysDomainName");

            return this;
        } // end andSysDomainNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysDomianA.DOMAIN_NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysDomainNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainNameLessThanOrEqualTo(String value) {
            addCriterion("sysDomianA.DOMAIN_NAME <=", value, "sysDomainName");

            return this;
        } // end andSysDomainNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysDomianA.DOMAIN_NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysDomainNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysDomianA.DOMAIN_NAME like", buffer.toString(),
                "sysDomainName");

            return this;
        } // end andSysDomainNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysDomianA.DOMAIN_NAME not like", buffer.toString(),
                "sysDomainName");

            return this;
        } // end andSysDomainNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainNameIn(List values) {
            if (values.size() == 1) {
                return andSysDomainNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysDomianA.DOMAIN_NAME in", values,
                    "sysDomainName");

                return this;
            } // end else
        } // end andSysDomainNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainNameNotIn(List values) {
            if (values.size() == 1) {
                return andSysDomainNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysDomianA.DOMAIN_NAME not in", values,
                    "sysDomainName");

                return this;
            } // end else
        } // end andSysDomainNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainNameIn(Object[] values) {
            if (values.length == 1) {
                return andSysDomainNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysDomianA.DOMAIN_NAME in",
                    Arrays.asList(values), "sysDomainName");

                return this;
            } // end else
        } // end andSysDomainNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andSysDomainNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysDomianA.DOMAIN_NAME not in",
                    Arrays.asList(values), "sysDomainName");

                return this;
            } // end else
        } // end andSysDomainNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainNameBetween(String value1, String value2) {
            addCriterion("sysDomianA.DOMAIN_NAME between", value1, value2,
                "sysDomainName");

            return this;
        } // end andSysDomainNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainNameNotBetween(String value1, String value2) {
            addCriterion("sysDomianA.DOMAIN_NAME not between", value1, value2,
                "sysDomainName");

            return this;
        } // end andSysDomainNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainCodeIsNull() {
            addCriterion("sysDomianA.DOMAIN_CODE is null");

            return this;
        } // end andSysDomainCodeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainCodeIsNotNull() {
            addCriterion("sysDomianA.DOMAIN_CODE is not null");

            return this;
        } // end andSysDomainCodeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainCodeIsNotEmpty() {
            addCriterion(
                "sysDomianA.DOMAIN_CODE is not null AND sysDomianA.DOMAIN_CODE <> ''");

            return this;
        } // end andSysDomainCodeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainCodeIsEmpty() {
            addCriterion(
                "(sysDomianA.DOMAIN_CODE is null OR sysDomianA.DOMAIN_CODE = '')");

            return this;
        } // end andSysDomainCodeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainCodeEqualTo(String value) {
            addCriterion("sysDomianA.DOMAIN_CODE =", value, "sysDomainCode");

            return this;
        } // end andSysDomainCodeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainCodeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysDomianA.DOMAIN_CODE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysDomainCodeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainCodeNotEqualTo(String value) {
            addCriterion("sysDomianA.DOMAIN_CODE <>", value, "sysDomainCode");

            return this;
        } // end andSysDomainCodeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainCodeNotEqualToOrIsNull(String value) {
            addCriterion("sysDomianA.DOMAIN_CODE is null OR sysDomianA.DOMAIN_CODE <>",
                value, "sysDomainCode");

            return this;
        } // end andSysDomainCodeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainCodeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysDomianA.DOMAIN_CODE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysDomainCodeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainCodeGreaterThan(String value) {
            addCriterion("sysDomianA.DOMAIN_CODE >", value, "sysDomainCode");

            return this;
        } // end andSysDomainCodeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainCodeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysDomianA.DOMAIN_CODE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysDomainCodeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sysDomianA.DOMAIN_CODE >=", value, "sysDomainCode");

            return this;
        } // end andSysDomainCodeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainCodeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysDomianA.DOMAIN_CODE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysDomainCodeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainCodeLessThan(String value) {
            addCriterion("sysDomianA.DOMAIN_CODE <", value, "sysDomainCode");

            return this;
        } // end andSysDomainCodeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainCodeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("sysDomianA.DOMAIN_CODE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysDomainCodeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainCodeLessThanOrEqualTo(String value) {
            addCriterion("sysDomianA.DOMAIN_CODE <=", value, "sysDomainCode");

            return this;
        } // end andSysDomainCodeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainCodeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("sysDomianA.DOMAIN_CODE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andSysDomainCodeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainCodeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysDomianA.DOMAIN_CODE like", buffer.toString(),
                "sysDomainCode");

            return this;
        } // end andSysDomainCodeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainCodeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("sysDomianA.DOMAIN_CODE not like", buffer.toString(),
                "sysDomainCode");

            return this;
        } // end andSysDomainCodeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainCodeIn(List values) {
            if (values.size() == 1) {
                return andSysDomainCodeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysDomianA.DOMAIN_CODE in", values,
                    "sysDomainCode");

                return this;
            } // end else
        } // end andSysDomainCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainCodeNotIn(List values) {
            if (values.size() == 1) {
                return andSysDomainCodeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("sysDomianA.DOMAIN_CODE not in", values,
                    "sysDomainCode");

                return this;
            } // end else
        } // end andSysDomainCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainCodeIn(Object[] values) {
            if (values.length == 1) {
                return andSysDomainCodeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysDomianA.DOMAIN_CODE in",
                    Arrays.asList(values), "sysDomainCode");

                return this;
            } // end else
        } // end andSysDomainCodeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainCodeNotIn(Object[] values) {
            if (values.length == 1) {
                return andSysDomainCodeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("sysDomianA.DOMAIN_CODE not in",
                    Arrays.asList(values), "sysDomainCode");

                return this;
            } // end else
        } // end andSysDomainCodeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainCodeBetween(String value1, String value2) {
            addCriterion("sysDomianA.DOMAIN_CODE between", value1, value2,
                "sysDomainCode");

            return this;
        } // end andSysDomainCodeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andSysDomainCodeNotBetween(String value1, String value2) {
            addCriterion("sysDomianA.DOMAIN_CODE not between", value1, value2,
                "sysDomainCode");

            return this;
        } // end andSysDomainCodeNotBetween()
    } // end Criteria
} // end SysRoleRelateDAOQueryBean
