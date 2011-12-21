/**
 *Copyright (C) 2000-2010 OurTeam.com All rights reserved.
*/
package com.ourteam.modelbase.dao;

import net.dao.BaseQueryBean;
import net.dao.BaseWhereCriterion;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * BusinessPackage query bean 2011-09-22 10:16:38
 *
 * @author Auto Gen
 */
public class BusinessPackageDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new BusinessPackageDAOQueryBean object.
     */
    public BusinessPackageDAOQueryBean() {
        super();
    } // end BusinessPackageDAOQueryBean()

    /**
     * Creates a new BusinessPackageDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public BusinessPackageDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end BusinessPackageDAOQueryBean()

    /**
     * Creates a new BusinessPackageDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public BusinessPackageDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end BusinessPackageDAOQueryBean()

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
    public void addBusinessPackageIdSelectProperty() {
        addBusinessPackageIdSelectProperty("businessPackageId");
    } // end addBusinessPackageIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addBusinessPackageIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessPackageDAO.BusinessPackageId, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessPackageDAO.BusinessPackageId,
                "businessPackageId");
        } // end else
    } // end addBusinessPackageIdSelectProperty()

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
            addSelectProperty(IBusinessPackageDAO.BusinessDomainId, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessPackageDAO.BusinessDomainId,
                "businessDomainId");
        } // end else
    } // end addBusinessDomainIdSelectProperty()

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
            addSelectProperty(IBusinessPackageDAO.Description, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessPackageDAO.Description, "description");
        } // end else
    } // end addDescriptionSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addNameSelectProperty() {
        addNameSelectProperty("name");
    } // end addNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessPackageDAO.Name, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessPackageDAO.Name, "name");
        } // end else
    } // end addNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addParentPackageIdSelectProperty() {
        addParentPackageIdSelectProperty("parentPackageId");
    } // end addParentPackageIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addParentPackageIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessPackageDAO.ParentPackageId, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessPackageDAO.ParentPackageId,
                "parentPackageId");
        } // end else
    } // end addParentPackageIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addStateSelectProperty() {
        addStateSelectProperty("state");
    } // end addStateSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addStateSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessPackageDAO.State, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessPackageDAO.State, "state");
        } // end else
    } // end addStateSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addTypeSelectProperty() {
        addTypeSelectProperty("type");
    } // end addTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessPackageDAO.Type, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessPackageDAO.Type, "type");
        } // end else
    } // end addTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addBusinessPackageIdSelectProperty();

        addBusinessDomainIdSelectProperty();

        addDescriptionSelectProperty();

        addNameSelectProperty();

        addParentPackageIdSelectProperty();

        addStateSelectProperty();

        addTypeSelectProperty();
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
        public Criteria andBusinessPackageIdIsNull() {
            addCriterion("BUSINESS_PACKAGE.BUSINESS_PACKAGE_ID is null");

            return this;
        } // end andBusinessPackageIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageIdIsNotNull() {
            addCriterion("BUSINESS_PACKAGE.BUSINESS_PACKAGE_ID is not null");

            return this;
        } // end andBusinessPackageIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageIdIsNotEmpty() {
            addCriterion(
                "BUSINESS_PACKAGE.BUSINESS_PACKAGE_ID is not null AND BUSINESS_PACKAGE.BUSINESS_PACKAGE_ID <> ''");

            return this;
        } // end andBusinessPackageIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageIdIsEmpty() {
            addCriterion(
                "(BUSINESS_PACKAGE.BUSINESS_PACKAGE_ID is null OR BUSINESS_PACKAGE.BUSINESS_PACKAGE_ID = '')");

            return this;
        } // end andBusinessPackageIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageIdEqualTo(long value) {
            return andBusinessPackageIdEqualTo(Long.valueOf(value));
        } // end andBusinessPackageIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageIdEqualTo(java.lang.Long value) {
            addCriterion("BUSINESS_PACKAGE.BUSINESS_PACKAGE_ID =", value,
                "businessPackageId");

            return this;
        } // end andBusinessPackageIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_PACKAGE.BUSINESS_PACKAGE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessPackageIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageIdNotEqualTo(long value) {
            return andBusinessPackageIdNotEqualTo(Long.valueOf(value));
        } // end andBusinessPackageIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageIdNotEqualTo(java.lang.Long value) {
            addCriterion("BUSINESS_PACKAGE.BUSINESS_PACKAGE_ID <>", value,
                "businessPackageId");

            return this;
        } // end andBusinessPackageIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageIdNotEqualToOrIsNull(long value) {
            return andBusinessPackageIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andBusinessPackageIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("BUSINESS_PACKAGE.BUSINESS_PACKAGE_ID is null OR BUSINESS_PACKAGE.BUSINESS_PACKAGE_ID <>",
                value, "businessPackageId");

            return this;
        } // end andBusinessPackageIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_PACKAGE.BUSINESS_PACKAGE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessPackageIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageIdGreaterThan(long value) {
            return andBusinessPackageIdGreaterThan(Long.valueOf(value));
        } // end andBusinessPackageIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageIdGreaterThan(java.lang.Long value) {
            addCriterion("BUSINESS_PACKAGE.BUSINESS_PACKAGE_ID >", value,
                "businessPackageId");

            return this;
        } // end andBusinessPackageIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_PACKAGE.BUSINESS_PACKAGE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessPackageIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageIdGreaterThanOrEqualTo(long value) {
            return andBusinessPackageIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andBusinessPackageIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("BUSINESS_PACKAGE.BUSINESS_PACKAGE_ID >=", value,
                "businessPackageId");

            return this;
        } // end andBusinessPackageIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_PACKAGE.BUSINESS_PACKAGE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessPackageIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageIdLessThan(long value) {
            return andBusinessPackageIdLessThan(Long.valueOf(value));
        } // end andBusinessPackageIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageIdLessThan(java.lang.Long value) {
            addCriterion("BUSINESS_PACKAGE.BUSINESS_PACKAGE_ID <", value,
                "businessPackageId");

            return this;
        } // end andBusinessPackageIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_PACKAGE.BUSINESS_PACKAGE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessPackageIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageIdLessThanOrEqualTo(long value) {
            return andBusinessPackageIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andBusinessPackageIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("BUSINESS_PACKAGE.BUSINESS_PACKAGE_ID <=", value,
                "businessPackageId");

            return this;
        } // end andBusinessPackageIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_PACKAGE.BUSINESS_PACKAGE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessPackageIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageIdIn(long[] values) {
            if (values.length == 1) {
                return andBusinessPackageIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_PACKAGE.BUSINESS_PACKAGE_ID in", values,
                    "businessPackageId");

                return this;
            } // end else
        } // end andBusinessPackageIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageIdNotIn(long[] values) {
            if (values.length == 1) {
                return andBusinessPackageIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_PACKAGE.BUSINESS_PACKAGE_ID not in",
                    values, "businessPackageId");

                return this;
            } // end else
        } // end andBusinessPackageIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageIdIn(List values) {
            if (values.size() == 1) {
                return andBusinessPackageIdEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("BUSINESS_PACKAGE.BUSINESS_PACKAGE_ID in", values,
                    "businessPackageId");

                return this;
            } // end else
        } // end andBusinessPackageIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageIdNotIn(List values) {
            if (values.size() == 1) {
                return andBusinessPackageIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("BUSINESS_PACKAGE.BUSINESS_PACKAGE_ID not in",
                    values, "businessPackageId");

                return this;
            } // end else
        } // end andBusinessPackageIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageIdIn(Object[] values) {
            if (values.length == 1) {
                return andBusinessPackageIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_PACKAGE.BUSINESS_PACKAGE_ID in",
                    Arrays.asList(values), "businessPackageId");

                return this;
            } // end else
        } // end andBusinessPackageIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andBusinessPackageIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_PACKAGE.BUSINESS_PACKAGE_ID not in",
                    Arrays.asList(values), "businessPackageId");

                return this;
            } // end else
        } // end andBusinessPackageIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageIdBetween(long value1, long value2) {
            addCriterion("BUSINESS_PACKAGE.BUSINESS_PACKAGE_ID between",
                value1, value2, "businessPackageId");

            return this;
        } // end andBusinessPackageIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BUSINESS_PACKAGE.BUSINESS_PACKAGE_ID between",
                value1, value2, "businessPackageId");

            return this;
        } // end andBusinessPackageIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageIdNotBetween(long value1, long value2) {
            addCriterion("BUSINESS_PACKAGE.BUSINESS_PACKAGE_ID not between",
                value1, value2, "businessPackageId");

            return this;
        } // end andBusinessPackageIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessPackageIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BUSINESS_PACKAGE.BUSINESS_PACKAGE_ID not between",
                value1, value2, "businessPackageId");

            return this;
        } // end andBusinessPackageIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdIsNull() {
            addCriterion("BUSINESS_PACKAGE.BUSINESS_DOMAIN_ID is null");

            return this;
        } // end andBusinessDomainIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdIsNotNull() {
            addCriterion("BUSINESS_PACKAGE.BUSINESS_DOMAIN_ID is not null");

            return this;
        } // end andBusinessDomainIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdIsNotEmpty() {
            addCriterion(
                "BUSINESS_PACKAGE.BUSINESS_DOMAIN_ID is not null AND BUSINESS_PACKAGE.BUSINESS_DOMAIN_ID <> ''");

            return this;
        } // end andBusinessDomainIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessDomainIdIsEmpty() {
            addCriterion(
                "(BUSINESS_PACKAGE.BUSINESS_DOMAIN_ID is null OR BUSINESS_PACKAGE.BUSINESS_DOMAIN_ID = '')");

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
            addCriterion("BUSINESS_PACKAGE.BUSINESS_DOMAIN_ID =", value,
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
                    "BUSINESS_PACKAGE.BUSINESS_DOMAIN_ID");
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
            addCriterion("BUSINESS_PACKAGE.BUSINESS_DOMAIN_ID <>", value,
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
            addCriterion("BUSINESS_PACKAGE.BUSINESS_DOMAIN_ID is null OR BUSINESS_PACKAGE.BUSINESS_DOMAIN_ID <>",
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
                    "BUSINESS_PACKAGE.BUSINESS_DOMAIN_ID");
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
            addCriterion("BUSINESS_PACKAGE.BUSINESS_DOMAIN_ID >", value,
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
                    "BUSINESS_PACKAGE.BUSINESS_DOMAIN_ID");
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
            addCriterion("BUSINESS_PACKAGE.BUSINESS_DOMAIN_ID >=", value,
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
                    "BUSINESS_PACKAGE.BUSINESS_DOMAIN_ID");
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
            addCriterion("BUSINESS_PACKAGE.BUSINESS_DOMAIN_ID <", value,
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
                    "BUSINESS_PACKAGE.BUSINESS_DOMAIN_ID");
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
            addCriterion("BUSINESS_PACKAGE.BUSINESS_DOMAIN_ID <=", value,
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
                    "BUSINESS_PACKAGE.BUSINESS_DOMAIN_ID");
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
                addCriterion("BUSINESS_PACKAGE.BUSINESS_DOMAIN_ID in", values,
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
                addCriterion("BUSINESS_PACKAGE.BUSINESS_DOMAIN_ID not in",
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
                addCriterion("BUSINESS_PACKAGE.BUSINESS_DOMAIN_ID in", values,
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
                addCriterion("BUSINESS_PACKAGE.BUSINESS_DOMAIN_ID not in",
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
                addCriterion("BUSINESS_PACKAGE.BUSINESS_DOMAIN_ID in",
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
                addCriterion("BUSINESS_PACKAGE.BUSINESS_DOMAIN_ID not in",
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
            addCriterion("BUSINESS_PACKAGE.BUSINESS_DOMAIN_ID between", value1,
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
            addCriterion("BUSINESS_PACKAGE.BUSINESS_DOMAIN_ID between", value1,
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
            addCriterion("BUSINESS_PACKAGE.BUSINESS_DOMAIN_ID not between",
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
            addCriterion("BUSINESS_PACKAGE.BUSINESS_DOMAIN_ID not between",
                value1, value2, "businessDomainId");

            return this;
        } // end andBusinessDomainIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNull() {
            addCriterion("BUSINESS_PACKAGE.DESCRIPTION is null");

            return this;
        } // end andDescriptionIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNotNull() {
            addCriterion("BUSINESS_PACKAGE.DESCRIPTION is not null");

            return this;
        } // end andDescriptionIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNotEmpty() {
            addCriterion(
                "BUSINESS_PACKAGE.DESCRIPTION is not null AND BUSINESS_PACKAGE.DESCRIPTION <> ''");

            return this;
        } // end andDescriptionIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsEmpty() {
            addCriterion(
                "(BUSINESS_PACKAGE.DESCRIPTION is null OR BUSINESS_PACKAGE.DESCRIPTION = '')");

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
            addCriterion("BUSINESS_PACKAGE.DESCRIPTION =", value, "description");

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
            StringBuffer str = new StringBuffer("BUSINESS_PACKAGE.DESCRIPTION");
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
            addCriterion("BUSINESS_PACKAGE.DESCRIPTION <>", value, "description");

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
            addCriterion("BUSINESS_PACKAGE.DESCRIPTION is null OR BUSINESS_PACKAGE.DESCRIPTION <>",
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
            StringBuffer str = new StringBuffer("BUSINESS_PACKAGE.DESCRIPTION");
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
            addCriterion("BUSINESS_PACKAGE.DESCRIPTION >", value, "description");

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
            StringBuffer str = new StringBuffer("BUSINESS_PACKAGE.DESCRIPTION");
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
            addCriterion("BUSINESS_PACKAGE.DESCRIPTION >=", value, "description");

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
            StringBuffer str = new StringBuffer("BUSINESS_PACKAGE.DESCRIPTION");
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
            addCriterion("BUSINESS_PACKAGE.DESCRIPTION <", value, "description");

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
            StringBuffer str = new StringBuffer("BUSINESS_PACKAGE.DESCRIPTION");
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
            addCriterion("BUSINESS_PACKAGE.DESCRIPTION <=", value, "description");

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
            StringBuffer str = new StringBuffer("BUSINESS_PACKAGE.DESCRIPTION");
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
            addCriterion("BUSINESS_PACKAGE.DESCRIPTION like",
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
            addCriterion("BUSINESS_PACKAGE.DESCRIPTION not like",
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
                addCriterion("BUSINESS_PACKAGE.DESCRIPTION in", values,
                    "description");

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
                addCriterion("BUSINESS_PACKAGE.DESCRIPTION not in", values,
                    "description");

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
                addCriterion("BUSINESS_PACKAGE.DESCRIPTION in",
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
                addCriterion("BUSINESS_PACKAGE.DESCRIPTION not in",
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
            addCriterion("BUSINESS_PACKAGE.DESCRIPTION between", value1,
                value2, "description");

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
            addCriterion("BUSINESS_PACKAGE.DESCRIPTION not between", value1,
                value2, "description");

            return this;
        } // end andDescriptionNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNull() {
            addCriterion("BUSINESS_PACKAGE.NAME is null");

            return this;
        } // end andNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNotNull() {
            addCriterion("BUSINESS_PACKAGE.NAME is not null");

            return this;
        } // end andNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNotEmpty() {
            addCriterion(
                "BUSINESS_PACKAGE.NAME is not null AND BUSINESS_PACKAGE.NAME <> ''");

            return this;
        } // end andNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsEmpty() {
            addCriterion(
                "(BUSINESS_PACKAGE.NAME is null OR BUSINESS_PACKAGE.NAME = '')");

            return this;
        } // end andNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameEqualTo(String value) {
            addCriterion("BUSINESS_PACKAGE.NAME =", value, "name");

            return this;
        } // end andNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_PACKAGE.NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameNotEqualTo(String value) {
            addCriterion("BUSINESS_PACKAGE.NAME <>", value, "name");

            return this;
        } // end andNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameNotEqualToOrIsNull(String value) {
            addCriterion("BUSINESS_PACKAGE.NAME is null OR BUSINESS_PACKAGE.NAME <>",
                value, "name");

            return this;
        } // end andNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_PACKAGE.NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameGreaterThan(String value) {
            addCriterion("BUSINESS_PACKAGE.NAME >", value, "name");

            return this;
        } // end andNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_PACKAGE.NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_PACKAGE.NAME >=", value, "name");

            return this;
        } // end andNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_PACKAGE.NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameLessThan(String value) {
            addCriterion("BUSINESS_PACKAGE.NAME <", value, "name");

            return this;
        } // end andNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_PACKAGE.NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_PACKAGE.NAME <=", value, "name");

            return this;
        } // end andNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameLessThanOrEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_PACKAGE.NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BUSINESS_PACKAGE.NAME like", buffer.toString(), "name");

            return this;
        } // end andNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BUSINESS_PACKAGE.NAME not like", buffer.toString(),
                "name");

            return this;
        } // end andNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIn(List values) {
            if (values.size() == 1) {
                return andNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_PACKAGE.NAME in", values, "name");

                return this;
            } // end else
        } // end andNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameNotIn(List values) {
            if (values.size() == 1) {
                return andNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_PACKAGE.NAME not in", values, "name");

                return this;
            } // end else
        } // end andNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIn(Object[] values) {
            if (values.length == 1) {
                return andNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_PACKAGE.NAME in", Arrays.asList(values),
                    "name");

                return this;
            } // end else
        } // end andNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_PACKAGE.NAME not in",
                    Arrays.asList(values), "name");

                return this;
            } // end else
        } // end andNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("BUSINESS_PACKAGE.NAME between", value1, value2, "name");

            return this;
        } // end andNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_PACKAGE.NAME not between", value1, value2,
                "name");

            return this;
        } // end andNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentPackageIdIsNull() {
            addCriterion("BUSINESS_PACKAGE.PARENT_PACKAGE_ID is null");

            return this;
        } // end andParentPackageIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentPackageIdIsNotNull() {
            addCriterion("BUSINESS_PACKAGE.PARENT_PACKAGE_ID is not null");

            return this;
        } // end andParentPackageIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentPackageIdIsNotEmpty() {
            addCriterion(
                "BUSINESS_PACKAGE.PARENT_PACKAGE_ID is not null AND BUSINESS_PACKAGE.PARENT_PACKAGE_ID <> ''");

            return this;
        } // end andParentPackageIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentPackageIdIsEmpty() {
            addCriterion(
                "(BUSINESS_PACKAGE.PARENT_PACKAGE_ID is null OR BUSINESS_PACKAGE.PARENT_PACKAGE_ID = '')");

            return this;
        } // end andParentPackageIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentPackageIdEqualTo(Long value) {
            addCriterion("BUSINESS_PACKAGE.PARENT_PACKAGE_ID =", value,
                "parentPackageId");

            return this;
        } // end andParentPackageIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentPackageIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_PACKAGE.PARENT_PACKAGE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentPackageIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentPackageIdNotEqualTo(Long value) {
            addCriterion("BUSINESS_PACKAGE.PARENT_PACKAGE_ID <>", value,
                "parentPackageId");

            return this;
        } // end andParentPackageIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentPackageIdNotEqualToOrIsNull(Long value) {
            addCriterion("BUSINESS_PACKAGE.PARENT_PACKAGE_ID is null OR BUSINESS_PACKAGE.PARENT_PACKAGE_ID <>",
                value, "parentPackageId");

            return this;
        } // end andParentPackageIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentPackageIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_PACKAGE.PARENT_PACKAGE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentPackageIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentPackageIdGreaterThan(Long value) {
            addCriterion("BUSINESS_PACKAGE.PARENT_PACKAGE_ID >", value,
                "parentPackageId");

            return this;
        } // end andParentPackageIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentPackageIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_PACKAGE.PARENT_PACKAGE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentPackageIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentPackageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BUSINESS_PACKAGE.PARENT_PACKAGE_ID >=", value,
                "parentPackageId");

            return this;
        } // end andParentPackageIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentPackageIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_PACKAGE.PARENT_PACKAGE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentPackageIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentPackageIdLessThan(Long value) {
            addCriterion("BUSINESS_PACKAGE.PARENT_PACKAGE_ID <", value,
                "parentPackageId");

            return this;
        } // end andParentPackageIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentPackageIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_PACKAGE.PARENT_PACKAGE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentPackageIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentPackageIdLessThanOrEqualTo(Long value) {
            addCriterion("BUSINESS_PACKAGE.PARENT_PACKAGE_ID <=", value,
                "parentPackageId");

            return this;
        } // end andParentPackageIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentPackageIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_PACKAGE.PARENT_PACKAGE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andParentPackageIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentPackageIdIn(List values) {
            if (values.size() == 1) {
                return andParentPackageIdEqualTo((Long) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_PACKAGE.PARENT_PACKAGE_ID in", values,
                    "parentPackageId");

                return this;
            } // end else
        } // end andParentPackageIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentPackageIdNotIn(List values) {
            if (values.size() == 1) {
                return andParentPackageIdNotEqualTo((Long) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_PACKAGE.PARENT_PACKAGE_ID not in",
                    values, "parentPackageId");

                return this;
            } // end else
        } // end andParentPackageIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentPackageIdIn(Object[] values) {
            if (values.length == 1) {
                return andParentPackageIdEqualTo((Long) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_PACKAGE.PARENT_PACKAGE_ID in",
                    Arrays.asList(values), "parentPackageId");

                return this;
            } // end else
        } // end andParentPackageIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentPackageIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andParentPackageIdNotEqualTo((Long) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_PACKAGE.PARENT_PACKAGE_ID not in",
                    Arrays.asList(values), "parentPackageId");

                return this;
            } // end else
        } // end andParentPackageIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentPackageIdBetween(Long value1, Long value2) {
            addCriterion("BUSINESS_PACKAGE.PARENT_PACKAGE_ID between", value1,
                value2, "parentPackageId");

            return this;
        } // end andParentPackageIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andParentPackageIdNotBetween(Long value1, Long value2) {
            addCriterion("BUSINESS_PACKAGE.PARENT_PACKAGE_ID not between",
                value1, value2, "parentPackageId");

            return this;
        } // end andParentPackageIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateIsNull() {
            addCriterion("BUSINESS_PACKAGE.STATE is null");

            return this;
        } // end andStateIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateIsNotNull() {
            addCriterion("BUSINESS_PACKAGE.STATE is not null");

            return this;
        } // end andStateIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateIsNotEmpty() {
            addCriterion(
                "BUSINESS_PACKAGE.STATE is not null AND BUSINESS_PACKAGE.STATE <> ''");

            return this;
        } // end andStateIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateIsEmpty() {
            addCriterion(
                "(BUSINESS_PACKAGE.STATE is null OR BUSINESS_PACKAGE.STATE = '')");

            return this;
        } // end andStateIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateEqualTo(String value) {
            addCriterion("BUSINESS_PACKAGE.STATE =", value, "state");

            return this;
        } // end andStateEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_PACKAGE.STATE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStateEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateNotEqualTo(String value) {
            addCriterion("BUSINESS_PACKAGE.STATE <>", value, "state");

            return this;
        } // end andStateNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateNotEqualToOrIsNull(String value) {
            addCriterion("BUSINESS_PACKAGE.STATE is null OR BUSINESS_PACKAGE.STATE <>",
                value, "state");

            return this;
        } // end andStateNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_PACKAGE.STATE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStateNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateGreaterThan(String value) {
            addCriterion("BUSINESS_PACKAGE.STATE >", value, "state");

            return this;
        } // end andStateGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_PACKAGE.STATE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStateGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_PACKAGE.STATE >=", value, "state");

            return this;
        } // end andStateGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_PACKAGE.STATE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStateGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateLessThan(String value) {
            addCriterion("BUSINESS_PACKAGE.STATE <", value, "state");

            return this;
        } // end andStateLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_PACKAGE.STATE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStateLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_PACKAGE.STATE <=", value, "state");

            return this;
        } // end andStateLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_PACKAGE.STATE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andStateLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BUSINESS_PACKAGE.STATE like", buffer.toString(),
                "state");

            return this;
        } // end andStateLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BUSINESS_PACKAGE.STATE not like", buffer.toString(),
                "state");

            return this;
        } // end andStateNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateIn(List values) {
            if (values.size() == 1) {
                return andStateEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_PACKAGE.STATE in", values, "state");

                return this;
            } // end else
        } // end andStateIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateNotIn(List values) {
            if (values.size() == 1) {
                return andStateNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_PACKAGE.STATE not in", values, "state");

                return this;
            } // end else
        } // end andStateNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateIn(Object[] values) {
            if (values.length == 1) {
                return andStateEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_PACKAGE.STATE in",
                    Arrays.asList(values), "state");

                return this;
            } // end else
        } // end andStateIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateNotIn(Object[] values) {
            if (values.length == 1) {
                return andStateNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_PACKAGE.STATE not in",
                    Arrays.asList(values), "state");

                return this;
            } // end else
        } // end andStateNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("BUSINESS_PACKAGE.STATE between", value1, value2,
                "state");

            return this;
        } // end andStateBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_PACKAGE.STATE not between", value1, value2,
                "state");

            return this;
        } // end andStateNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeIsNull() {
            addCriterion("BUSINESS_PACKAGE.TYPE is null");

            return this;
        } // end andTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeIsNotNull() {
            addCriterion("BUSINESS_PACKAGE.TYPE is not null");

            return this;
        } // end andTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeIsNotEmpty() {
            addCriterion(
                "BUSINESS_PACKAGE.TYPE is not null AND BUSINESS_PACKAGE.TYPE <> ''");

            return this;
        } // end andTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeIsEmpty() {
            addCriterion(
                "(BUSINESS_PACKAGE.TYPE is null OR BUSINESS_PACKAGE.TYPE = '')");

            return this;
        } // end andTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeEqualTo(String value) {
            addCriterion("BUSINESS_PACKAGE.TYPE =", value, "type");

            return this;
        } // end andTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_PACKAGE.TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("BUSINESS_PACKAGE.TYPE <>", value, "type");

            return this;
        } // end andTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeNotEqualToOrIsNull(String value) {
            addCriterion("BUSINESS_PACKAGE.TYPE is null OR BUSINESS_PACKAGE.TYPE <>",
                value, "type");

            return this;
        } // end andTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_PACKAGE.TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeGreaterThan(String value) {
            addCriterion("BUSINESS_PACKAGE.TYPE >", value, "type");

            return this;
        } // end andTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_PACKAGE.TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_PACKAGE.TYPE >=", value, "type");

            return this;
        } // end andTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_PACKAGE.TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeLessThan(String value) {
            addCriterion("BUSINESS_PACKAGE.TYPE <", value, "type");

            return this;
        } // end andTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_PACKAGE.TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_PACKAGE.TYPE <=", value, "type");

            return this;
        } // end andTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeLessThanOrEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_PACKAGE.TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BUSINESS_PACKAGE.TYPE like", buffer.toString(), "type");

            return this;
        } // end andTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("BUSINESS_PACKAGE.TYPE not like", buffer.toString(),
                "type");

            return this;
        } // end andTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeIn(List values) {
            if (values.size() == 1) {
                return andTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_PACKAGE.TYPE in", values, "type");

                return this;
            } // end else
        } // end andTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeNotIn(List values) {
            if (values.size() == 1) {
                return andTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_PACKAGE.TYPE not in", values, "type");

                return this;
            } // end else
        } // end andTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeIn(Object[] values) {
            if (values.length == 1) {
                return andTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_PACKAGE.TYPE in", Arrays.asList(values),
                    "type");

                return this;
            } // end else
        } // end andTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_PACKAGE.TYPE not in",
                    Arrays.asList(values), "type");

                return this;
            } // end else
        } // end andTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("BUSINESS_PACKAGE.TYPE between", value1, value2, "type");

            return this;
        } // end andTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_PACKAGE.TYPE not between", value1, value2,
                "type");

            return this;
        } // end andTypeNotBetween()
    } // end Criteria
} // end BusinessPackageDAOQueryBean
