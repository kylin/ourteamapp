/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.workspace.dao;

import net.dao.BaseQueryBean;
import net.dao.BaseWhereCriterion;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * WorkspaceResourceBusinessPackageRelate query bean 2011-09-22 10:17:25
 *
 * @author Auto Gen
 */
public class WorkspaceResourceBusinessPackageRelateDAOQueryBean
    extends BaseQueryBean {
    /**
     * Creates a new WorkspaceResourceBusinessPackageRelateDAOQueryBean object.
     */
    public WorkspaceResourceBusinessPackageRelateDAOQueryBean() {
        super();
    } // end WorkspaceResourceBusinessPackageRelateDAOQueryBean()

    /**
     * Creates a new WorkspaceResourceBusinessPackageRelateDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public WorkspaceResourceBusinessPackageRelateDAOQueryBean(
        BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end WorkspaceResourceBusinessPackageRelateDAOQueryBean()

    /**
     * Creates a new WorkspaceResourceBusinessPackageRelateDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public WorkspaceResourceBusinessPackageRelateDAOQueryBean(
        BaseQueryBean aQueryBean, Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end WorkspaceResourceBusinessPackageRelateDAOQueryBean()

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
            addSelectProperty(IWorkspaceResourceBusinessPackageRelateDAO.Id,
                aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceResourceBusinessPackageRelateDAO.Id,
                "id");
        } // end else
    } // end addIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addBusinessPcakageIdSelectProperty() {
        addBusinessPcakageIdSelectProperty("businessPcakageId");
    } // end addBusinessPcakageIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addBusinessPcakageIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IWorkspaceResourceBusinessPackageRelateDAO.BusinessPcakageId,
                aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceResourceBusinessPackageRelateDAO.BusinessPcakageId,
                "businessPcakageId");
        } // end else
    } // end addBusinessPcakageIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addDescriptionSelectProperty() {
        addDescriptionSelectProperty("description");
    } // end addDescriptionSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addDescriptionSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IWorkspaceResourceBusinessPackageRelateDAO.Description,
                aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceResourceBusinessPackageRelateDAO.Description,
                "description");
        } // end else
    } // end addDescriptionSelectProperty()

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
            addSelectProperty(IWorkspaceResourceBusinessPackageRelateDAO.Status,
                aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceResourceBusinessPackageRelateDAO.Status,
                "status");
        } // end else
    } // end addStatusSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addWorkspaceResourceIdSelectProperty() {
        addWorkspaceResourceIdSelectProperty("workspaceResourceId");
    } // end addWorkspaceResourceIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addWorkspaceResourceIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IWorkspaceResourceBusinessPackageRelateDAO.WorkspaceResourceId,
                aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceResourceBusinessPackageRelateDAO.WorkspaceResourceId,
                "workspaceResourceId");
        } // end else
    } // end addWorkspaceResourceIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addBusinessPackageNameSelectProperty() {
        addBusinessPackageNameSelectProperty("businessPackageName");
    } // end addBusinessPackageNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addBusinessPackageNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IWorkspaceResourceBusinessPackageRelateDAO.BusinessPackageName,
                aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceResourceBusinessPackageRelateDAO.BusinessPackageName,
                "businessPackageName");
        } // end else
    } // end addBusinessPackageNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addBusinessDomainNameSelectProperty() {
        addBusinessDomainNameSelectProperty("businessDomainName");
    } // end addBusinessDomainNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addBusinessDomainNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IWorkspaceResourceBusinessPackageRelateDAO.BusinessDomainName,
                aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceResourceBusinessPackageRelateDAO.BusinessDomainName,
                "businessDomainName");
        } // end else
    } // end addBusinessDomainNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addBusinessDomainIdSelectProperty() {
        addBusinessDomainIdSelectProperty("businessDomainId");
    } // end addBusinessDomainIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addBusinessDomainIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IWorkspaceResourceBusinessPackageRelateDAO.BusinessDomainId,
                aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceResourceBusinessPackageRelateDAO.BusinessDomainId,
                "businessDomainId");
        } // end else
    } // end addBusinessDomainIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addBusinessPackageTypeSelectProperty() {
        addBusinessPackageTypeSelectProperty("businessPackageType");
    } // end addBusinessPackageTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addBusinessPackageTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IWorkspaceResourceBusinessPackageRelateDAO.BusinessPackageType,
                aAlias);
        } // end if
        else {
            addSelectProperty(IWorkspaceResourceBusinessPackageRelateDAO.BusinessPackageType,
                "businessPackageType");
        } // end else
    } // end addBusinessPackageTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addIdSelectProperty();

        addBusinessPcakageIdSelectProperty();

        addDescriptionSelectProperty();

        addStatusSelectProperty();

        addWorkspaceResourceIdSelectProperty();

        addBusinessPackageNameSelectProperty();

        addBusinessDomainNameSelectProperty();

        addBusinessDomainIdSelectProperty();

        addBusinessPackageTypeSelectProperty();
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
            addCriterion(
                "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.ID is null");

            return this;
        } // end andIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotNull() {
            addCriterion(
                "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.ID is not null");

            return this;
        } // end andIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsNotEmpty() {
            addCriterion(
                "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.ID is not null AND WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.ID <> ''");

            return this;
        } // end andIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIdIsEmpty() {
            addCriterion(
                "(WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.ID is null OR WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.ID = '')");

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
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.ID =",
                value, "id");

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
                    "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.ID");
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
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.ID <>",
                value, "id");

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
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.ID is null OR WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.ID <>",
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
                    "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.ID");
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
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.ID >",
                value, "id");

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
                    "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.ID");
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
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.ID >=",
                value, "id");

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
                    "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.ID");
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
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.ID <",
                value, "id");

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
                    "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.ID");
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
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.ID <=",
                value, "id");

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
                    "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.ID");
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
                addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.ID in",
                    values, "id");

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
                addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.ID not in",
                    values, "id");

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
                addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.ID in",
                    values, "id");

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
                addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.ID not in",
                    values, "id");

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
                addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.ID in",
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
                addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.ID not in",
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
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.ID between",
                value1, value2, "id");

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
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.ID between",
                value1, value2, "id");

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
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.ID not between",
                value1, value2, "id");

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
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.ID not between",
                value1, value2, "id");

            return this;
        } // end andIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPcakageIdIsNull() {
            addCriterion(
                "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.BUSINESS_PCAKAGE_ID is null");

            return this;
        } // end andBusinessPcakageIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPcakageIdIsNotNull() {
            addCriterion(
                "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.BUSINESS_PCAKAGE_ID is not null");

            return this;
        } // end andBusinessPcakageIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPcakageIdIsNotEmpty() {
            addCriterion(
                "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.BUSINESS_PCAKAGE_ID is not null AND WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.BUSINESS_PCAKAGE_ID <> ''");

            return this;
        } // end andBusinessPcakageIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPcakageIdIsEmpty() {
            addCriterion(
                "(WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.BUSINESS_PCAKAGE_ID is null OR WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.BUSINESS_PCAKAGE_ID = '')");

            return this;
        } // end andBusinessPcakageIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPcakageIdEqualTo(long value) {
            return andBusinessPcakageIdEqualTo(Long.valueOf(value));
        } // end andBusinessPcakageIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPcakageIdEqualTo(java.lang.Long value) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.BUSINESS_PCAKAGE_ID =",
                value, "businessPcakageId");

            return this;
        } // end andBusinessPcakageIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPcakageIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.BUSINESS_PCAKAGE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessPcakageIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPcakageIdNotEqualTo(long value) {
            return andBusinessPcakageIdNotEqualTo(Long.valueOf(value));
        } // end andBusinessPcakageIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPcakageIdNotEqualTo(java.lang.Long value) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.BUSINESS_PCAKAGE_ID <>",
                value, "businessPcakageId");

            return this;
        } // end andBusinessPcakageIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPcakageIdNotEqualToOrIsNull(long value) {
            return andBusinessPcakageIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andBusinessPcakageIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPcakageIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.BUSINESS_PCAKAGE_ID is null OR WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.BUSINESS_PCAKAGE_ID <>",
                value, "businessPcakageId");

            return this;
        } // end andBusinessPcakageIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPcakageIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.BUSINESS_PCAKAGE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessPcakageIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPcakageIdGreaterThan(long value) {
            return andBusinessPcakageIdGreaterThan(Long.valueOf(value));
        } // end andBusinessPcakageIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPcakageIdGreaterThan(java.lang.Long value) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.BUSINESS_PCAKAGE_ID >",
                value, "businessPcakageId");

            return this;
        } // end andBusinessPcakageIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPcakageIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.BUSINESS_PCAKAGE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessPcakageIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPcakageIdGreaterThanOrEqualTo(long value) {
            return andBusinessPcakageIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andBusinessPcakageIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPcakageIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.BUSINESS_PCAKAGE_ID >=",
                value, "businessPcakageId");

            return this;
        } // end andBusinessPcakageIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPcakageIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.BUSINESS_PCAKAGE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessPcakageIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPcakageIdLessThan(long value) {
            return andBusinessPcakageIdLessThan(Long.valueOf(value));
        } // end andBusinessPcakageIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPcakageIdLessThan(java.lang.Long value) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.BUSINESS_PCAKAGE_ID <",
                value, "businessPcakageId");

            return this;
        } // end andBusinessPcakageIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPcakageIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.BUSINESS_PCAKAGE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessPcakageIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPcakageIdLessThanOrEqualTo(long value) {
            return andBusinessPcakageIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andBusinessPcakageIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPcakageIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.BUSINESS_PCAKAGE_ID <=",
                value, "businessPcakageId");

            return this;
        } // end andBusinessPcakageIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPcakageIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.BUSINESS_PCAKAGE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessPcakageIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPcakageIdIn(long[] values) {
            if (values.length == 1) {
                return andBusinessPcakageIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.BUSINESS_PCAKAGE_ID in",
                    values, "businessPcakageId");

                return this;
            } // end else
        } // end andBusinessPcakageIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPcakageIdNotIn(long[] values) {
            if (values.length == 1) {
                return andBusinessPcakageIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.BUSINESS_PCAKAGE_ID not in",
                    values, "businessPcakageId");

                return this;
            } // end else
        } // end andBusinessPcakageIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPcakageIdIn(List values) {
            if (values.size() == 1) {
                return andBusinessPcakageIdEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.BUSINESS_PCAKAGE_ID in",
                    values, "businessPcakageId");

                return this;
            } // end else
        } // end andBusinessPcakageIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPcakageIdNotIn(List values) {
            if (values.size() == 1) {
                return andBusinessPcakageIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.BUSINESS_PCAKAGE_ID not in",
                    values, "businessPcakageId");

                return this;
            } // end else
        } // end andBusinessPcakageIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPcakageIdIn(Object[] values) {
            if (values.length == 1) {
                return andBusinessPcakageIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.BUSINESS_PCAKAGE_ID in",
                    Arrays.asList(values), "businessPcakageId");

                return this;
            } // end else
        } // end andBusinessPcakageIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPcakageIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andBusinessPcakageIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.BUSINESS_PCAKAGE_ID not in",
                    Arrays.asList(values), "businessPcakageId");

                return this;
            } // end else
        } // end andBusinessPcakageIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPcakageIdBetween(long value1, long value2) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.BUSINESS_PCAKAGE_ID between",
                value1, value2, "businessPcakageId");

            return this;
        } // end andBusinessPcakageIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPcakageIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.BUSINESS_PCAKAGE_ID between",
                value1, value2, "businessPcakageId");

            return this;
        } // end andBusinessPcakageIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPcakageIdNotBetween(long value1, long value2) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.BUSINESS_PCAKAGE_ID not between",
                value1, value2, "businessPcakageId");

            return this;
        } // end andBusinessPcakageIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPcakageIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.BUSINESS_PCAKAGE_ID not between",
                value1, value2, "businessPcakageId");

            return this;
        } // end andBusinessPcakageIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNull() {
            addCriterion(
                "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.DESCRIPTION is null");

            return this;
        } // end andDescriptionIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNotNull() {
            addCriterion(
                "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.DESCRIPTION is not null");

            return this;
        } // end andDescriptionIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNotEmpty() {
            addCriterion(
                "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.DESCRIPTION is not null AND WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.DESCRIPTION <> ''");

            return this;
        } // end andDescriptionIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsEmpty() {
            addCriterion(
                "(WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.DESCRIPTION is null OR WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.DESCRIPTION = '')");

            return this;
        } // end andDescriptionIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.DESCRIPTION =",
                value, "description");

            return this;
        } // end andDescriptionEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.DESCRIPTION");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDescriptionEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.DESCRIPTION <>",
                value, "description");

            return this;
        } // end andDescriptionNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionNotEqualToOrIsNull(String value) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.DESCRIPTION is null OR WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.DESCRIPTION <>",
                value, "description");

            return this;
        } // end andDescriptionNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.DESCRIPTION");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDescriptionNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.DESCRIPTION >",
                value, "description");

            return this;
        } // end andDescriptionGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.DESCRIPTION");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDescriptionGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.DESCRIPTION >=",
                value, "description");

            return this;
        } // end andDescriptionGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.DESCRIPTION");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDescriptionGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionLessThan(String value) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.DESCRIPTION <",
                value, "description");

            return this;
        } // end andDescriptionLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.DESCRIPTION");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDescriptionLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.DESCRIPTION <=",
                value, "description");

            return this;
        } // end andDescriptionLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.DESCRIPTION");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDescriptionLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.DESCRIPTION like",
                buffer.toString(), "description");

            return this;
        } // end andDescriptionLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.DESCRIPTION not like",
                buffer.toString(), "description");

            return this;
        } // end andDescriptionNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIn(List values) {
            if (values.size() == 1) {
                return andDescriptionEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.DESCRIPTION in",
                    values, "description");

                return this;
            } // end else
        } // end andDescriptionIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionNotIn(List values) {
            if (values.size() == 1) {
                return andDescriptionNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.DESCRIPTION not in",
                    values, "description");

                return this;
            } // end else
        } // end andDescriptionNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIn(Object[] values) {
            if (values.length == 1) {
                return andDescriptionEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.DESCRIPTION in",
                    Arrays.asList(values), "description");

                return this;
            } // end else
        } // end andDescriptionIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionNotIn(Object[] values) {
            if (values.length == 1) {
                return andDescriptionNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.DESCRIPTION not in",
                    Arrays.asList(values), "description");

                return this;
            } // end else
        } // end andDescriptionNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.DESCRIPTION between",
                value1, value2, "description");

            return this;
        } // end andDescriptionBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.DESCRIPTION not between",
                value1, value2, "description");

            return this;
        } // end andDescriptionNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNull() {
            addCriterion(
                "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.STATUS is null");

            return this;
        } // end andStatusIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotNull() {
            addCriterion(
                "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.STATUS is not null");

            return this;
        } // end andStatusIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsNotEmpty() {
            addCriterion(
                "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.STATUS is not null AND WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.STATUS <> ''");

            return this;
        } // end andStatusIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIsEmpty() {
            addCriterion(
                "(WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.STATUS is null OR WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.STATUS = '')");

            return this;
        } // end andStatusIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.STATUS =",
                value, "status");

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
                    "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.STATUS");
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
        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.STATUS <>",
                value, "status");

            return this;
        } // end andStatusNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusNotEqualToOrIsNull(Integer value) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.STATUS is null OR WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.STATUS <>",
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
                    "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.STATUS");
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
        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.STATUS >",
                value, "status");

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
                    "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.STATUS");
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
        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.STATUS >=",
                value, "status");

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
                    "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.STATUS");
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
        public Criteria andStatusLessThan(Integer value) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.STATUS <",
                value, "status");

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
                    "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.STATUS");
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
        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.STATUS <=",
                value, "status");

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
                    "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.STATUS");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStatusLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStatusIn(List values) {
            if (values.size() == 1) {
                return andStatusEqualTo((Integer) values.get(0));
            } // end if
            else {
                addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.STATUS in",
                    values, "status");

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
                return andStatusNotEqualTo((Integer) values.get(0));
            } // end if
            else {
                addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.STATUS not in",
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
                return andStatusEqualTo((Integer) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.STATUS in",
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
                return andStatusNotEqualTo((Integer) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.STATUS not in",
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
        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.STATUS between",
                value1, value2, "status");

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
        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.STATUS not between",
                value1, value2, "status");

            return this;
        } // end andStatusNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceResourceIdIsNull() {
            addCriterion(
                "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.WORKSPACE_RESOURCE_ID is null");

            return this;
        } // end andWorkspaceResourceIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceResourceIdIsNotNull() {
            addCriterion(
                "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.WORKSPACE_RESOURCE_ID is not null");

            return this;
        } // end andWorkspaceResourceIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceResourceIdIsNotEmpty() {
            addCriterion(
                "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.WORKSPACE_RESOURCE_ID is not null AND WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.WORKSPACE_RESOURCE_ID <> ''");

            return this;
        } // end andWorkspaceResourceIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceResourceIdIsEmpty() {
            addCriterion(
                "(WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.WORKSPACE_RESOURCE_ID is null OR WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.WORKSPACE_RESOURCE_ID = '')");

            return this;
        } // end andWorkspaceResourceIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceResourceIdEqualTo(long value) {
            return andWorkspaceResourceIdEqualTo(Long.valueOf(value));
        } // end andWorkspaceResourceIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceResourceIdEqualTo(java.lang.Long value) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.WORKSPACE_RESOURCE_ID =",
                value, "workspaceResourceId");

            return this;
        } // end andWorkspaceResourceIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceResourceIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.WORKSPACE_RESOURCE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspaceResourceIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceResourceIdNotEqualTo(long value) {
            return andWorkspaceResourceIdNotEqualTo(Long.valueOf(value));
        } // end andWorkspaceResourceIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceResourceIdNotEqualTo(java.lang.Long value) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.WORKSPACE_RESOURCE_ID <>",
                value, "workspaceResourceId");

            return this;
        } // end andWorkspaceResourceIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceResourceIdNotEqualToOrIsNull(long value) {
            return andWorkspaceResourceIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andWorkspaceResourceIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceResourceIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.WORKSPACE_RESOURCE_ID is null OR WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.WORKSPACE_RESOURCE_ID <>",
                value, "workspaceResourceId");

            return this;
        } // end andWorkspaceResourceIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceResourceIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.WORKSPACE_RESOURCE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspaceResourceIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceResourceIdGreaterThan(long value) {
            return andWorkspaceResourceIdGreaterThan(Long.valueOf(value));
        } // end andWorkspaceResourceIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceResourceIdGreaterThan(java.lang.Long value) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.WORKSPACE_RESOURCE_ID >",
                value, "workspaceResourceId");

            return this;
        } // end andWorkspaceResourceIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceResourceIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.WORKSPACE_RESOURCE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspaceResourceIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceResourceIdGreaterThanOrEqualTo(long value) {
            return andWorkspaceResourceIdGreaterThanOrEqualTo(Long.valueOf(
                    value));
        } // end andWorkspaceResourceIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceResourceIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.WORKSPACE_RESOURCE_ID >=",
                value, "workspaceResourceId");

            return this;
        } // end andWorkspaceResourceIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceResourceIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.WORKSPACE_RESOURCE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspaceResourceIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceResourceIdLessThan(long value) {
            return andWorkspaceResourceIdLessThan(Long.valueOf(value));
        } // end andWorkspaceResourceIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceResourceIdLessThan(java.lang.Long value) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.WORKSPACE_RESOURCE_ID <",
                value, "workspaceResourceId");

            return this;
        } // end andWorkspaceResourceIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceResourceIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.WORKSPACE_RESOURCE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspaceResourceIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceResourceIdLessThanOrEqualTo(long value) {
            return andWorkspaceResourceIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andWorkspaceResourceIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceResourceIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.WORKSPACE_RESOURCE_ID <=",
                value, "workspaceResourceId");

            return this;
        } // end andWorkspaceResourceIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceResourceIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.WORKSPACE_RESOURCE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andWorkspaceResourceIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceResourceIdIn(long[] values) {
            if (values.length == 1) {
                return andWorkspaceResourceIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.WORKSPACE_RESOURCE_ID in",
                    values, "workspaceResourceId");

                return this;
            } // end else
        } // end andWorkspaceResourceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceResourceIdNotIn(long[] values) {
            if (values.length == 1) {
                return andWorkspaceResourceIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.WORKSPACE_RESOURCE_ID not in",
                    values, "workspaceResourceId");

                return this;
            } // end else
        } // end andWorkspaceResourceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceResourceIdIn(List values) {
            if (values.size() == 1) {
                return andWorkspaceResourceIdEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.WORKSPACE_RESOURCE_ID in",
                    values, "workspaceResourceId");

                return this;
            } // end else
        } // end andWorkspaceResourceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceResourceIdNotIn(List values) {
            if (values.size() == 1) {
                return andWorkspaceResourceIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.WORKSPACE_RESOURCE_ID not in",
                    values, "workspaceResourceId");

                return this;
            } // end else
        } // end andWorkspaceResourceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceResourceIdIn(Object[] values) {
            if (values.length == 1) {
                return andWorkspaceResourceIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.WORKSPACE_RESOURCE_ID in",
                    Arrays.asList(values), "workspaceResourceId");

                return this;
            } // end else
        } // end andWorkspaceResourceIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceResourceIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andWorkspaceResourceIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.WORKSPACE_RESOURCE_ID not in",
                    Arrays.asList(values), "workspaceResourceId");

                return this;
            } // end else
        } // end andWorkspaceResourceIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceResourceIdBetween(long value1, long value2) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.WORKSPACE_RESOURCE_ID between",
                value1, value2, "workspaceResourceId");

            return this;
        } // end andWorkspaceResourceIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceResourceIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.WORKSPACE_RESOURCE_ID between",
                value1, value2, "workspaceResourceId");

            return this;
        } // end andWorkspaceResourceIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceResourceIdNotBetween(long value1,
            long value2) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.WORKSPACE_RESOURCE_ID not between",
                value1, value2, "workspaceResourceId");

            return this;
        } // end andWorkspaceResourceIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andWorkspaceResourceIdNotBetween(
            java.lang.Long value1, java.lang.Long value2) {
            addCriterion("WORKSPACE_RESOURCE_BUSINESS_PACKAGE_RELATE.WORKSPACE_RESOURCE_ID not between",
                value1, value2, "workspaceResourceId");

            return this;
        } // end andWorkspaceResourceIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageNameIsNull() {
            addCriterion("businessPackage.NAME is null");

            return this;
        } // end andBusinessPackageNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageNameIsNotNull() {
            addCriterion("businessPackage.NAME is not null");

            return this;
        } // end andBusinessPackageNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageNameIsNotEmpty() {
            addCriterion(
                "businessPackage.NAME is not null AND businessPackage.NAME <> ''");

            return this;
        } // end andBusinessPackageNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageNameIsEmpty() {
            addCriterion(
                "(businessPackage.NAME is null OR businessPackage.NAME = '')");

            return this;
        } // end andBusinessPackageNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageNameEqualTo(String value) {
            addCriterion("businessPackage.NAME =", value, "businessPackageName");

            return this;
        } // end andBusinessPackageNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageNameEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("businessPackage.NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessPackageNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageNameNotEqualTo(String value) {
            addCriterion("businessPackage.NAME <>", value, "businessPackageName");

            return this;
        } // end andBusinessPackageNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageNameNotEqualToOrIsNull(String value) {
            addCriterion("businessPackage.NAME is null OR businessPackage.NAME <>",
                value, "businessPackageName");

            return this;
        } // end andBusinessPackageNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("businessPackage.NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessPackageNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageNameGreaterThan(String value) {
            addCriterion("businessPackage.NAME >", value, "businessPackageName");

            return this;
        } // end andBusinessPackageNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("businessPackage.NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessPackageNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageNameGreaterThanOrEqualTo(String value) {
            addCriterion("businessPackage.NAME >=", value, "businessPackageName");

            return this;
        } // end andBusinessPackageNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("businessPackage.NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessPackageNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageNameLessThan(String value) {
            addCriterion("businessPackage.NAME <", value, "businessPackageName");

            return this;
        } // end andBusinessPackageNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageNameLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("businessPackage.NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessPackageNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageNameLessThanOrEqualTo(String value) {
            addCriterion("businessPackage.NAME <=", value, "businessPackageName");

            return this;
        } // end andBusinessPackageNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("businessPackage.NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessPackageNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("businessPackage.NAME like", buffer.toString(),
                "businessPackageName");

            return this;
        } // end andBusinessPackageNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("businessPackage.NAME not like", buffer.toString(),
                "businessPackageName");

            return this;
        } // end andBusinessPackageNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageNameIn(List values) {
            if (values.size() == 1) {
                return andBusinessPackageNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("businessPackage.NAME in", values,
                    "businessPackageName");

                return this;
            } // end else
        } // end andBusinessPackageNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageNameNotIn(List values) {
            if (values.size() == 1) {
                return andBusinessPackageNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("businessPackage.NAME not in", values,
                    "businessPackageName");

                return this;
            } // end else
        } // end andBusinessPackageNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageNameIn(Object[] values) {
            if (values.length == 1) {
                return andBusinessPackageNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("businessPackage.NAME in", Arrays.asList(values),
                    "businessPackageName");

                return this;
            } // end else
        } // end andBusinessPackageNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andBusinessPackageNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("businessPackage.NAME not in",
                    Arrays.asList(values), "businessPackageName");

                return this;
            } // end else
        } // end andBusinessPackageNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageNameBetween(String value1,
            String value2) {
            addCriterion("businessPackage.NAME between", value1, value2,
                "businessPackageName");

            return this;
        } // end andBusinessPackageNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageNameNotBetween(String value1,
            String value2) {
            addCriterion("businessPackage.NAME not between", value1, value2,
                "businessPackageName");

            return this;
        } // end andBusinessPackageNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainNameIsNull() {
            addCriterion("businessDomain.NAME is null");

            return this;
        } // end andBusinessDomainNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainNameIsNotNull() {
            addCriterion("businessDomain.NAME is not null");

            return this;
        } // end andBusinessDomainNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainNameIsNotEmpty() {
            addCriterion(
                "businessDomain.NAME is not null AND businessDomain.NAME <> ''");

            return this;
        } // end andBusinessDomainNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainNameIsEmpty() {
            addCriterion(
                "(businessDomain.NAME is null OR businessDomain.NAME = '')");

            return this;
        } // end andBusinessDomainNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainNameEqualTo(String value) {
            addCriterion("businessDomain.NAME =", value, "businessDomainName");

            return this;
        } // end andBusinessDomainNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainNameEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("businessDomain.NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessDomainNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainNameNotEqualTo(String value) {
            addCriterion("businessDomain.NAME <>", value, "businessDomainName");

            return this;
        } // end andBusinessDomainNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainNameNotEqualToOrIsNull(String value) {
            addCriterion("businessDomain.NAME is null OR businessDomain.NAME <>",
                value, "businessDomainName");

            return this;
        } // end andBusinessDomainNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("businessDomain.NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessDomainNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainNameGreaterThan(String value) {
            addCriterion("businessDomain.NAME >", value, "businessDomainName");

            return this;
        } // end andBusinessDomainNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("businessDomain.NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessDomainNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainNameGreaterThanOrEqualTo(String value) {
            addCriterion("businessDomain.NAME >=", value, "businessDomainName");

            return this;
        } // end andBusinessDomainNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("businessDomain.NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessDomainNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainNameLessThan(String value) {
            addCriterion("businessDomain.NAME <", value, "businessDomainName");

            return this;
        } // end andBusinessDomainNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainNameLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("businessDomain.NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessDomainNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainNameLessThanOrEqualTo(String value) {
            addCriterion("businessDomain.NAME <=", value, "businessDomainName");

            return this;
        } // end andBusinessDomainNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("businessDomain.NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessDomainNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("businessDomain.NAME like", buffer.toString(),
                "businessDomainName");

            return this;
        } // end andBusinessDomainNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("businessDomain.NAME not like", buffer.toString(),
                "businessDomainName");

            return this;
        } // end andBusinessDomainNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainNameIn(List values) {
            if (values.size() == 1) {
                return andBusinessDomainNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("businessDomain.NAME in", values,
                    "businessDomainName");

                return this;
            } // end else
        } // end andBusinessDomainNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainNameNotIn(List values) {
            if (values.size() == 1) {
                return andBusinessDomainNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("businessDomain.NAME not in", values,
                    "businessDomainName");

                return this;
            } // end else
        } // end andBusinessDomainNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainNameIn(Object[] values) {
            if (values.length == 1) {
                return andBusinessDomainNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("businessDomain.NAME in", Arrays.asList(values),
                    "businessDomainName");

                return this;
            } // end else
        } // end andBusinessDomainNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andBusinessDomainNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("businessDomain.NAME not in",
                    Arrays.asList(values), "businessDomainName");

                return this;
            } // end else
        } // end andBusinessDomainNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainNameBetween(String value1,
            String value2) {
            addCriterion("businessDomain.NAME between", value1, value2,
                "businessDomainName");

            return this;
        } // end andBusinessDomainNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainNameNotBetween(String value1,
            String value2) {
            addCriterion("businessDomain.NAME not between", value1, value2,
                "businessDomainName");

            return this;
        } // end andBusinessDomainNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdIsNull() {
            addCriterion("businessPackage.BUSINESS_DOMAIN_ID is null");

            return this;
        } // end andBusinessDomainIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdIsNotNull() {
            addCriterion("businessPackage.BUSINESS_DOMAIN_ID is not null");

            return this;
        } // end andBusinessDomainIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdIsNotEmpty() {
            addCriterion(
                "businessPackage.BUSINESS_DOMAIN_ID is not null AND businessPackage.BUSINESS_DOMAIN_ID <> ''");

            return this;
        } // end andBusinessDomainIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdIsEmpty() {
            addCriterion(
                "(businessPackage.BUSINESS_DOMAIN_ID is null OR businessPackage.BUSINESS_DOMAIN_ID = '')");

            return this;
        } // end andBusinessDomainIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdEqualTo(long value) {
            return andBusinessDomainIdEqualTo(Long.valueOf(value));
        } // end andBusinessDomainIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdEqualTo(java.lang.Long value) {
            addCriterion("businessPackage.BUSINESS_DOMAIN_ID =", value,
                "businessDomainId");

            return this;
        } // end andBusinessDomainIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "businessPackage.BUSINESS_DOMAIN_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessDomainIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdNotEqualTo(long value) {
            return andBusinessDomainIdNotEqualTo(Long.valueOf(value));
        } // end andBusinessDomainIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdNotEqualTo(java.lang.Long value) {
            addCriterion("businessPackage.BUSINESS_DOMAIN_ID <>", value,
                "businessDomainId");

            return this;
        } // end andBusinessDomainIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdNotEqualToOrIsNull(long value) {
            return andBusinessDomainIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andBusinessDomainIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("businessPackage.BUSINESS_DOMAIN_ID is null OR businessPackage.BUSINESS_DOMAIN_ID <>",
                value, "businessDomainId");

            return this;
        } // end andBusinessDomainIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "businessPackage.BUSINESS_DOMAIN_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessDomainIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdGreaterThan(long value) {
            return andBusinessDomainIdGreaterThan(Long.valueOf(value));
        } // end andBusinessDomainIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdGreaterThan(java.lang.Long value) {
            addCriterion("businessPackage.BUSINESS_DOMAIN_ID >", value,
                "businessDomainId");

            return this;
        } // end andBusinessDomainIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "businessPackage.BUSINESS_DOMAIN_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessDomainIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdGreaterThanOrEqualTo(long value) {
            return andBusinessDomainIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andBusinessDomainIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("businessPackage.BUSINESS_DOMAIN_ID >=", value,
                "businessDomainId");

            return this;
        } // end andBusinessDomainIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "businessPackage.BUSINESS_DOMAIN_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessDomainIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdLessThan(long value) {
            return andBusinessDomainIdLessThan(Long.valueOf(value));
        } // end andBusinessDomainIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdLessThan(java.lang.Long value) {
            addCriterion("businessPackage.BUSINESS_DOMAIN_ID <", value,
                "businessDomainId");

            return this;
        } // end andBusinessDomainIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "businessPackage.BUSINESS_DOMAIN_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessDomainIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdLessThanOrEqualTo(long value) {
            return andBusinessDomainIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andBusinessDomainIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("businessPackage.BUSINESS_DOMAIN_ID <=", value,
                "businessDomainId");

            return this;
        } // end andBusinessDomainIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "businessPackage.BUSINESS_DOMAIN_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessDomainIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdIn(long[] values) {
            if (values.length == 1) {
                return andBusinessDomainIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("businessPackage.BUSINESS_DOMAIN_ID in", values,
                    "businessDomainId");

                return this;
            } // end else
        } // end andBusinessDomainIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdNotIn(long[] values) {
            if (values.length == 1) {
                return andBusinessDomainIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("businessPackage.BUSINESS_DOMAIN_ID not in",
                    values, "businessDomainId");

                return this;
            } // end else
        } // end andBusinessDomainIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdIn(List values) {
            if (values.size() == 1) {
                return andBusinessDomainIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("businessPackage.BUSINESS_DOMAIN_ID in", values,
                    "businessDomainId");

                return this;
            } // end else
        } // end andBusinessDomainIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdNotIn(List values) {
            if (values.size() == 1) {
                return andBusinessDomainIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("businessPackage.BUSINESS_DOMAIN_ID not in",
                    values, "businessDomainId");

                return this;
            } // end else
        } // end andBusinessDomainIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdIn(Object[] values) {
            if (values.length == 1) {
                return andBusinessDomainIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("businessPackage.BUSINESS_DOMAIN_ID in",
                    Arrays.asList(values), "businessDomainId");

                return this;
            } // end else
        } // end andBusinessDomainIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andBusinessDomainIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("businessPackage.BUSINESS_DOMAIN_ID not in",
                    Arrays.asList(values), "businessDomainId");

                return this;
            } // end else
        } // end andBusinessDomainIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdBetween(long value1, long value2) {
            addCriterion("businessPackage.BUSINESS_DOMAIN_ID between", value1,
                value2, "businessDomainId");

            return this;
        } // end andBusinessDomainIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("businessPackage.BUSINESS_DOMAIN_ID between", value1,
                value2, "businessDomainId");

            return this;
        } // end andBusinessDomainIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdNotBetween(long value1, long value2) {
            addCriterion("businessPackage.BUSINESS_DOMAIN_ID not between",
                value1, value2, "businessDomainId");

            return this;
        } // end andBusinessDomainIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("businessPackage.BUSINESS_DOMAIN_ID not between",
                value1, value2, "businessDomainId");

            return this;
        } // end andBusinessDomainIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageTypeIsNull() {
            addCriterion("businessPackage.TYPE is null");

            return this;
        } // end andBusinessPackageTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageTypeIsNotNull() {
            addCriterion("businessPackage.TYPE is not null");

            return this;
        } // end andBusinessPackageTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageTypeIsNotEmpty() {
            addCriterion(
                "businessPackage.TYPE is not null AND businessPackage.TYPE <> ''");

            return this;
        } // end andBusinessPackageTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageTypeIsEmpty() {
            addCriterion(
                "(businessPackage.TYPE is null OR businessPackage.TYPE = '')");

            return this;
        } // end andBusinessPackageTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageTypeEqualTo(String value) {
            addCriterion("businessPackage.TYPE =", value, "businessPackageType");

            return this;
        } // end andBusinessPackageTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageTypeEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("businessPackage.TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessPackageTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageTypeNotEqualTo(String value) {
            addCriterion("businessPackage.TYPE <>", value, "businessPackageType");

            return this;
        } // end andBusinessPackageTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageTypeNotEqualToOrIsNull(String value) {
            addCriterion("businessPackage.TYPE is null OR businessPackage.TYPE <>",
                value, "businessPackageType");

            return this;
        } // end andBusinessPackageTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageTypeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("businessPackage.TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessPackageTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageTypeGreaterThan(String value) {
            addCriterion("businessPackage.TYPE >", value, "businessPackageType");

            return this;
        } // end andBusinessPackageTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageTypeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("businessPackage.TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessPackageTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("businessPackage.TYPE >=", value, "businessPackageType");

            return this;
        } // end andBusinessPackageTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("businessPackage.TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessPackageTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageTypeLessThan(String value) {
            addCriterion("businessPackage.TYPE <", value, "businessPackageType");

            return this;
        } // end andBusinessPackageTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageTypeLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("businessPackage.TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessPackageTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageTypeLessThanOrEqualTo(String value) {
            addCriterion("businessPackage.TYPE <=", value, "businessPackageType");

            return this;
        } // end andBusinessPackageTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("businessPackage.TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessPackageTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("businessPackage.TYPE like", buffer.toString(),
                "businessPackageType");

            return this;
        } // end andBusinessPackageTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("businessPackage.TYPE not like", buffer.toString(),
                "businessPackageType");

            return this;
        } // end andBusinessPackageTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageTypeIn(List values) {
            if (values.size() == 1) {
                return andBusinessPackageTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("businessPackage.TYPE in", values,
                    "businessPackageType");

                return this;
            } // end else
        } // end andBusinessPackageTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageTypeNotIn(List values) {
            if (values.size() == 1) {
                return andBusinessPackageTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("businessPackage.TYPE not in", values,
                    "businessPackageType");

                return this;
            } // end else
        } // end andBusinessPackageTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageTypeIn(Object[] values) {
            if (values.length == 1) {
                return andBusinessPackageTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("businessPackage.TYPE in", Arrays.asList(values),
                    "businessPackageType");

                return this;
            } // end else
        } // end andBusinessPackageTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andBusinessPackageTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("businessPackage.TYPE not in",
                    Arrays.asList(values), "businessPackageType");

                return this;
            } // end else
        } // end andBusinessPackageTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageTypeBetween(String value1,
            String value2) {
            addCriterion("businessPackage.TYPE between", value1, value2,
                "businessPackageType");

            return this;
        } // end andBusinessPackageTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageTypeNotBetween(String value1,
            String value2) {
            addCriterion("businessPackage.TYPE not between", value1, value2,
                "businessPackageType");

            return this;
        } // end andBusinessPackageTypeNotBetween()
    } // end Criteria
} // end WorkspaceResourceBusinessPackageRelateDAOQueryBean
