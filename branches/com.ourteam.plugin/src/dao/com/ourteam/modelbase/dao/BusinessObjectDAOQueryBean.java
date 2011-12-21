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
 * BusinessObject query bean 2011-09-22 10:16:36
 *
 * @author Auto Gen
 */
public class BusinessObjectDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new BusinessObjectDAOQueryBean object.
     */
    public BusinessObjectDAOQueryBean() {
        super();
    } // end BusinessObjectDAOQueryBean()

    /**
     * Creates a new BusinessObjectDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public BusinessObjectDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end BusinessObjectDAOQueryBean()

    /**
     * Creates a new BusinessObjectDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public BusinessObjectDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end BusinessObjectDAOQueryBean()

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
    public void addBusinessObjectIdSelectProperty() {
        addBusinessObjectIdSelectProperty("businessObjectId");
    } // end addBusinessObjectIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addBusinessObjectIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessObjectDAO.BusinessObjectId, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessObjectDAO.BusinessObjectId,
                "businessObjectId");
        } // end else
    } // end addBusinessObjectIdSelectProperty()

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
            addSelectProperty(IBusinessObjectDAO.Description, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessObjectDAO.Description, "description");
        } // end else
    } // end addDescriptionSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addGenerateOptionSelectProperty() {
        addGenerateOptionSelectProperty("generateOption");
    } // end addGenerateOptionSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addGenerateOptionSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessObjectDAO.GenerateOption, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessObjectDAO.GenerateOption,
                "generateOption");
        } // end else
    } // end addGenerateOptionSelectProperty()

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
            addSelectProperty(IBusinessObjectDAO.Name, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessObjectDAO.Name, "name");
        } // end else
    } // end addNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addPackageIdSelectProperty() {
        addPackageIdSelectProperty("packageId");
    } // end addPackageIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addPackageIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessObjectDAO.PackageId, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessObjectDAO.PackageId, "packageId");
        } // end else
    } // end addPackageIdSelectProperty()

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
            addSelectProperty(IBusinessObjectDAO.State, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessObjectDAO.State, "state");
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
            addSelectProperty(IBusinessObjectDAO.Type, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessObjectDAO.Type, "type");
        } // end else
    } // end addTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addDomainIdSelectProperty() {
        addDomainIdSelectProperty("domainId");
    } // end addDomainIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addDomainIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessObjectDAO.DomainId, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessObjectDAO.DomainId, "domainId");
        } // end else
    } // end addDomainIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addDomainNameSelectProperty() {
        addDomainNameSelectProperty("domainName");
    } // end addDomainNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addDomainNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessObjectDAO.DomainName, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessObjectDAO.DomainName, "domainName");
        } // end else
    } // end addDomainNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addPackageNameSelectProperty() {
        addPackageNameSelectProperty("packageName");
    } // end addPackageNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addPackageNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessObjectDAO.PackageName, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessObjectDAO.PackageName, "packageName");
        } // end else
    } // end addPackageNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addBusinessObjectIdSelectProperty();

        addDescriptionSelectProperty();

        addGenerateOptionSelectProperty();

        addNameSelectProperty();

        addPackageIdSelectProperty();

        addStateSelectProperty();

        addTypeSelectProperty();

        addDomainIdSelectProperty();

        addDomainNameSelectProperty();

        addPackageNameSelectProperty();
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
        public Criteria andBusinessObjectIdIsNull() {
            addCriterion("BUSINESS_OBJECT.BUSINESS_OBJECT_ID is null");

            return this;
        } // end andBusinessObjectIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdIsNotNull() {
            addCriterion("BUSINESS_OBJECT.BUSINESS_OBJECT_ID is not null");

            return this;
        } // end andBusinessObjectIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdIsNotEmpty() {
            addCriterion(
                "BUSINESS_OBJECT.BUSINESS_OBJECT_ID is not null AND BUSINESS_OBJECT.BUSINESS_OBJECT_ID <> ''");

            return this;
        } // end andBusinessObjectIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdIsEmpty() {
            addCriterion(
                "(BUSINESS_OBJECT.BUSINESS_OBJECT_ID is null OR BUSINESS_OBJECT.BUSINESS_OBJECT_ID = '')");

            return this;
        } // end andBusinessObjectIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdEqualTo(long value) {
            return andBusinessObjectIdEqualTo(Long.valueOf(value));
        } // end andBusinessObjectIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdEqualTo(java.lang.Long value) {
            addCriterion("BUSINESS_OBJECT.BUSINESS_OBJECT_ID =", value,
                "businessObjectId");

            return this;
        } // end andBusinessObjectIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_OBJECT.BUSINESS_OBJECT_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessObjectIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdNotEqualTo(long value) {
            return andBusinessObjectIdNotEqualTo(Long.valueOf(value));
        } // end andBusinessObjectIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdNotEqualTo(java.lang.Long value) {
            addCriterion("BUSINESS_OBJECT.BUSINESS_OBJECT_ID <>", value,
                "businessObjectId");

            return this;
        } // end andBusinessObjectIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdNotEqualToOrIsNull(long value) {
            return andBusinessObjectIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andBusinessObjectIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("BUSINESS_OBJECT.BUSINESS_OBJECT_ID is null OR BUSINESS_OBJECT.BUSINESS_OBJECT_ID <>",
                value, "businessObjectId");

            return this;
        } // end andBusinessObjectIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_OBJECT.BUSINESS_OBJECT_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessObjectIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdGreaterThan(long value) {
            return andBusinessObjectIdGreaterThan(Long.valueOf(value));
        } // end andBusinessObjectIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdGreaterThan(java.lang.Long value) {
            addCriterion("BUSINESS_OBJECT.BUSINESS_OBJECT_ID >", value,
                "businessObjectId");

            return this;
        } // end andBusinessObjectIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_OBJECT.BUSINESS_OBJECT_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessObjectIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdGreaterThanOrEqualTo(long value) {
            return andBusinessObjectIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andBusinessObjectIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("BUSINESS_OBJECT.BUSINESS_OBJECT_ID >=", value,
                "businessObjectId");

            return this;
        } // end andBusinessObjectIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_OBJECT.BUSINESS_OBJECT_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessObjectIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdLessThan(long value) {
            return andBusinessObjectIdLessThan(Long.valueOf(value));
        } // end andBusinessObjectIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdLessThan(java.lang.Long value) {
            addCriterion("BUSINESS_OBJECT.BUSINESS_OBJECT_ID <", value,
                "businessObjectId");

            return this;
        } // end andBusinessObjectIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_OBJECT.BUSINESS_OBJECT_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessObjectIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdLessThanOrEqualTo(long value) {
            return andBusinessObjectIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andBusinessObjectIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("BUSINESS_OBJECT.BUSINESS_OBJECT_ID <=", value,
                "businessObjectId");

            return this;
        } // end andBusinessObjectIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_OBJECT.BUSINESS_OBJECT_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andBusinessObjectIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdIn(long[] values) {
            if (values.length == 1) {
                return andBusinessObjectIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_OBJECT.BUSINESS_OBJECT_ID in", values,
                    "businessObjectId");

                return this;
            } // end else
        } // end andBusinessObjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdNotIn(long[] values) {
            if (values.length == 1) {
                return andBusinessObjectIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_OBJECT.BUSINESS_OBJECT_ID not in",
                    values, "businessObjectId");

                return this;
            } // end else
        } // end andBusinessObjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdIn(List values) {
            if (values.size() == 1) {
                return andBusinessObjectIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_OBJECT.BUSINESS_OBJECT_ID in", values,
                    "businessObjectId");

                return this;
            } // end else
        } // end andBusinessObjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdNotIn(List values) {
            if (values.size() == 1) {
                return andBusinessObjectIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("BUSINESS_OBJECT.BUSINESS_OBJECT_ID not in",
                    values, "businessObjectId");

                return this;
            } // end else
        } // end andBusinessObjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdIn(Object[] values) {
            if (values.length == 1) {
                return andBusinessObjectIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_OBJECT.BUSINESS_OBJECT_ID in",
                    Arrays.asList(values), "businessObjectId");

                return this;
            } // end else
        } // end andBusinessObjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andBusinessObjectIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_OBJECT.BUSINESS_OBJECT_ID not in",
                    Arrays.asList(values), "businessObjectId");

                return this;
            } // end else
        } // end andBusinessObjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdBetween(long value1, long value2) {
            addCriterion("BUSINESS_OBJECT.BUSINESS_OBJECT_ID between", value1,
                value2, "businessObjectId");

            return this;
        } // end andBusinessObjectIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BUSINESS_OBJECT.BUSINESS_OBJECT_ID between", value1,
                value2, "businessObjectId");

            return this;
        } // end andBusinessObjectIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdNotBetween(long value1, long value2) {
            addCriterion("BUSINESS_OBJECT.BUSINESS_OBJECT_ID not between",
                value1, value2, "businessObjectId");

            return this;
        } // end andBusinessObjectIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andBusinessObjectIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BUSINESS_OBJECT.BUSINESS_OBJECT_ID not between",
                value1, value2, "businessObjectId");

            return this;
        } // end andBusinessObjectIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNull() {
            addCriterion("BUSINESS_OBJECT.DESCRIPTION is null");

            return this;
        } // end andDescriptionIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNotNull() {
            addCriterion("BUSINESS_OBJECT.DESCRIPTION is not null");

            return this;
        } // end andDescriptionIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNotEmpty() {
            addCriterion(
                "BUSINESS_OBJECT.DESCRIPTION is not null AND BUSINESS_OBJECT.DESCRIPTION <> ''");

            return this;
        } // end andDescriptionIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsEmpty() {
            addCriterion(
                "(BUSINESS_OBJECT.DESCRIPTION is null OR BUSINESS_OBJECT.DESCRIPTION = '')");

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
            addCriterion("BUSINESS_OBJECT.DESCRIPTION =", value, "description");

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
            StringBuffer str = new StringBuffer("BUSINESS_OBJECT.DESCRIPTION");
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
            addCriterion("BUSINESS_OBJECT.DESCRIPTION <>", value, "description");

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
            addCriterion("BUSINESS_OBJECT.DESCRIPTION is null OR BUSINESS_OBJECT.DESCRIPTION <>",
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
            StringBuffer str = new StringBuffer("BUSINESS_OBJECT.DESCRIPTION");
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
            addCriterion("BUSINESS_OBJECT.DESCRIPTION >", value, "description");

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
            StringBuffer str = new StringBuffer("BUSINESS_OBJECT.DESCRIPTION");
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
            addCriterion("BUSINESS_OBJECT.DESCRIPTION >=", value, "description");

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
            StringBuffer str = new StringBuffer("BUSINESS_OBJECT.DESCRIPTION");
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
            addCriterion("BUSINESS_OBJECT.DESCRIPTION <", value, "description");

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
            StringBuffer str = new StringBuffer("BUSINESS_OBJECT.DESCRIPTION");
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
            addCriterion("BUSINESS_OBJECT.DESCRIPTION <=", value, "description");

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
            StringBuffer str = new StringBuffer("BUSINESS_OBJECT.DESCRIPTION");
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
            addCriterion("BUSINESS_OBJECT.DESCRIPTION like", buffer.toString(),
                "description");

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
            addCriterion("BUSINESS_OBJECT.DESCRIPTION not like",
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
                addCriterion("BUSINESS_OBJECT.DESCRIPTION in", values,
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
                addCriterion("BUSINESS_OBJECT.DESCRIPTION not in", values,
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
                addCriterion("BUSINESS_OBJECT.DESCRIPTION in",
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
                addCriterion("BUSINESS_OBJECT.DESCRIPTION not in",
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
            addCriterion("BUSINESS_OBJECT.DESCRIPTION between", value1, value2,
                "description");

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
            addCriterion("BUSINESS_OBJECT.DESCRIPTION not between", value1,
                value2, "description");

            return this;
        } // end andDescriptionNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGenerateOptionIsNull() {
            addCriterion("BUSINESS_OBJECT.GENERATE_OPTION is null");

            return this;
        } // end andGenerateOptionIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGenerateOptionIsNotNull() {
            addCriterion("BUSINESS_OBJECT.GENERATE_OPTION is not null");

            return this;
        } // end andGenerateOptionIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGenerateOptionIsNotEmpty() {
            addCriterion(
                "BUSINESS_OBJECT.GENERATE_OPTION is not null AND BUSINESS_OBJECT.GENERATE_OPTION <> ''");

            return this;
        } // end andGenerateOptionIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGenerateOptionIsEmpty() {
            addCriterion(
                "(BUSINESS_OBJECT.GENERATE_OPTION is null OR BUSINESS_OBJECT.GENERATE_OPTION = '')");

            return this;
        } // end andGenerateOptionIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGenerateOptionEqualTo(Long value) {
            addCriterion("BUSINESS_OBJECT.GENERATE_OPTION =", value,
                "generateOption");

            return this;
        } // end andGenerateOptionEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGenerateOptionEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_OBJECT.GENERATE_OPTION");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andGenerateOptionEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGenerateOptionNotEqualTo(Long value) {
            addCriterion("BUSINESS_OBJECT.GENERATE_OPTION <>", value,
                "generateOption");

            return this;
        } // end andGenerateOptionNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGenerateOptionNotEqualToOrIsNull(Long value) {
            addCriterion("BUSINESS_OBJECT.GENERATE_OPTION is null OR BUSINESS_OBJECT.GENERATE_OPTION <>",
                value, "generateOption");

            return this;
        } // end andGenerateOptionNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGenerateOptionNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_OBJECT.GENERATE_OPTION");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andGenerateOptionNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGenerateOptionGreaterThan(Long value) {
            addCriterion("BUSINESS_OBJECT.GENERATE_OPTION >", value,
                "generateOption");

            return this;
        } // end andGenerateOptionGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGenerateOptionGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_OBJECT.GENERATE_OPTION");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andGenerateOptionGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGenerateOptionGreaterThanOrEqualTo(Long value) {
            addCriterion("BUSINESS_OBJECT.GENERATE_OPTION >=", value,
                "generateOption");

            return this;
        } // end andGenerateOptionGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGenerateOptionGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_OBJECT.GENERATE_OPTION");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andGenerateOptionGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGenerateOptionLessThan(Long value) {
            addCriterion("BUSINESS_OBJECT.GENERATE_OPTION <", value,
                "generateOption");

            return this;
        } // end andGenerateOptionLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGenerateOptionLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_OBJECT.GENERATE_OPTION");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andGenerateOptionLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGenerateOptionLessThanOrEqualTo(Long value) {
            addCriterion("BUSINESS_OBJECT.GENERATE_OPTION <=", value,
                "generateOption");

            return this;
        } // end andGenerateOptionLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGenerateOptionLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "BUSINESS_OBJECT.GENERATE_OPTION");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andGenerateOptionLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGenerateOptionIn(List values) {
            if (values.size() == 1) {
                return andGenerateOptionEqualTo((Long) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_OBJECT.GENERATE_OPTION in", values,
                    "generateOption");

                return this;
            } // end else
        } // end andGenerateOptionIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGenerateOptionNotIn(List values) {
            if (values.size() == 1) {
                return andGenerateOptionNotEqualTo((Long) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_OBJECT.GENERATE_OPTION not in", values,
                    "generateOption");

                return this;
            } // end else
        } // end andGenerateOptionNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGenerateOptionIn(Object[] values) {
            if (values.length == 1) {
                return andGenerateOptionEqualTo((Long) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_OBJECT.GENERATE_OPTION in",
                    Arrays.asList(values), "generateOption");

                return this;
            } // end else
        } // end andGenerateOptionIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGenerateOptionNotIn(Object[] values) {
            if (values.length == 1) {
                return andGenerateOptionNotEqualTo((Long) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_OBJECT.GENERATE_OPTION not in",
                    Arrays.asList(values), "generateOption");

                return this;
            } // end else
        } // end andGenerateOptionNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGenerateOptionBetween(Long value1, Long value2) {
            addCriterion("BUSINESS_OBJECT.GENERATE_OPTION between", value1,
                value2, "generateOption");

            return this;
        } // end andGenerateOptionBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andGenerateOptionNotBetween(Long value1, Long value2) {
            addCriterion("BUSINESS_OBJECT.GENERATE_OPTION not between", value1,
                value2, "generateOption");

            return this;
        } // end andGenerateOptionNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNull() {
            addCriterion("BUSINESS_OBJECT.NAME is null");

            return this;
        } // end andNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNotNull() {
            addCriterion("BUSINESS_OBJECT.NAME is not null");

            return this;
        } // end andNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNotEmpty() {
            addCriterion(
                "BUSINESS_OBJECT.NAME is not null AND BUSINESS_OBJECT.NAME <> ''");

            return this;
        } // end andNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsEmpty() {
            addCriterion(
                "(BUSINESS_OBJECT.NAME is null OR BUSINESS_OBJECT.NAME = '')");

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
            addCriterion("BUSINESS_OBJECT.NAME =", value, "name");

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
            StringBuffer str = new StringBuffer("BUSINESS_OBJECT.NAME");
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
            addCriterion("BUSINESS_OBJECT.NAME <>", value, "name");

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
            addCriterion("BUSINESS_OBJECT.NAME is null OR BUSINESS_OBJECT.NAME <>",
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
            StringBuffer str = new StringBuffer("BUSINESS_OBJECT.NAME");
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
            addCriterion("BUSINESS_OBJECT.NAME >", value, "name");

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
            StringBuffer str = new StringBuffer("BUSINESS_OBJECT.NAME");
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
            addCriterion("BUSINESS_OBJECT.NAME >=", value, "name");

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
            StringBuffer str = new StringBuffer("BUSINESS_OBJECT.NAME");
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
            addCriterion("BUSINESS_OBJECT.NAME <", value, "name");

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
            StringBuffer str = new StringBuffer("BUSINESS_OBJECT.NAME");
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
            addCriterion("BUSINESS_OBJECT.NAME <=", value, "name");

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
            StringBuffer str = new StringBuffer("BUSINESS_OBJECT.NAME");
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
            addCriterion("BUSINESS_OBJECT.NAME like", buffer.toString(), "name");

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
            addCriterion("BUSINESS_OBJECT.NAME not like", buffer.toString(),
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
                addCriterion("BUSINESS_OBJECT.NAME in", values, "name");

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
                addCriterion("BUSINESS_OBJECT.NAME not in", values, "name");

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
                addCriterion("BUSINESS_OBJECT.NAME in", Arrays.asList(values),
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
                addCriterion("BUSINESS_OBJECT.NAME not in",
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
            addCriterion("BUSINESS_OBJECT.NAME between", value1, value2, "name");

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
            addCriterion("BUSINESS_OBJECT.NAME not between", value1, value2,
                "name");

            return this;
        } // end andNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageIdIsNull() {
            addCriterion("BUSINESS_OBJECT.PACKAGE_ID is null");

            return this;
        } // end andPackageIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageIdIsNotNull() {
            addCriterion("BUSINESS_OBJECT.PACKAGE_ID is not null");

            return this;
        } // end andPackageIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageIdIsNotEmpty() {
            addCriterion(
                "BUSINESS_OBJECT.PACKAGE_ID is not null AND BUSINESS_OBJECT.PACKAGE_ID <> ''");

            return this;
        } // end andPackageIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageIdIsEmpty() {
            addCriterion(
                "(BUSINESS_OBJECT.PACKAGE_ID is null OR BUSINESS_OBJECT.PACKAGE_ID = '')");

            return this;
        } // end andPackageIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageIdEqualTo(long value) {
            return andPackageIdEqualTo(Long.valueOf(value));
        } // end andPackageIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageIdEqualTo(java.lang.Long value) {
            addCriterion("BUSINESS_OBJECT.PACKAGE_ID =", value, "packageId");

            return this;
        } // end andPackageIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_OBJECT.PACKAGE_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPackageIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageIdNotEqualTo(long value) {
            return andPackageIdNotEqualTo(Long.valueOf(value));
        } // end andPackageIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageIdNotEqualTo(java.lang.Long value) {
            addCriterion("BUSINESS_OBJECT.PACKAGE_ID <>", value, "packageId");

            return this;
        } // end andPackageIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageIdNotEqualToOrIsNull(long value) {
            return andPackageIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andPackageIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("BUSINESS_OBJECT.PACKAGE_ID is null OR BUSINESS_OBJECT.PACKAGE_ID <>",
                value, "packageId");

            return this;
        } // end andPackageIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_OBJECT.PACKAGE_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPackageIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageIdGreaterThan(long value) {
            return andPackageIdGreaterThan(Long.valueOf(value));
        } // end andPackageIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageIdGreaterThan(java.lang.Long value) {
            addCriterion("BUSINESS_OBJECT.PACKAGE_ID >", value, "packageId");

            return this;
        } // end andPackageIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_OBJECT.PACKAGE_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPackageIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageIdGreaterThanOrEqualTo(long value) {
            return andPackageIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andPackageIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("BUSINESS_OBJECT.PACKAGE_ID >=", value, "packageId");

            return this;
        } // end andPackageIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_OBJECT.PACKAGE_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPackageIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageIdLessThan(long value) {
            return andPackageIdLessThan(Long.valueOf(value));
        } // end andPackageIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageIdLessThan(java.lang.Long value) {
            addCriterion("BUSINESS_OBJECT.PACKAGE_ID <", value, "packageId");

            return this;
        } // end andPackageIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_OBJECT.PACKAGE_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPackageIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageIdLessThanOrEqualTo(long value) {
            return andPackageIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andPackageIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("BUSINESS_OBJECT.PACKAGE_ID <=", value, "packageId");

            return this;
        } // end andPackageIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("BUSINESS_OBJECT.PACKAGE_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPackageIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageIdIn(long[] values) {
            if (values.length == 1) {
                return andPackageIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_OBJECT.PACKAGE_ID in", values,
                    "packageId");

                return this;
            } // end else
        } // end andPackageIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageIdNotIn(long[] values) {
            if (values.length == 1) {
                return andPackageIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_OBJECT.PACKAGE_ID not in", values,
                    "packageId");

                return this;
            } // end else
        } // end andPackageIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageIdIn(List values) {
            if (values.size() == 1) {
                return andPackageIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_OBJECT.PACKAGE_ID in", values,
                    "packageId");

                return this;
            } // end else
        } // end andPackageIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageIdNotIn(List values) {
            if (values.size() == 1) {
                return andPackageIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("BUSINESS_OBJECT.PACKAGE_ID not in", values,
                    "packageId");

                return this;
            } // end else
        } // end andPackageIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageIdIn(Object[] values) {
            if (values.length == 1) {
                return andPackageIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_OBJECT.PACKAGE_ID in",
                    Arrays.asList(values), "packageId");

                return this;
            } // end else
        } // end andPackageIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andPackageIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("BUSINESS_OBJECT.PACKAGE_ID not in",
                    Arrays.asList(values), "packageId");

                return this;
            } // end else
        } // end andPackageIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageIdBetween(long value1, long value2) {
            addCriterion("BUSINESS_OBJECT.PACKAGE_ID between", value1, value2,
                "packageId");

            return this;
        } // end andPackageIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BUSINESS_OBJECT.PACKAGE_ID between", value1, value2,
                "packageId");

            return this;
        } // end andPackageIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageIdNotBetween(long value1, long value2) {
            addCriterion("BUSINESS_OBJECT.PACKAGE_ID not between", value1,
                value2, "packageId");

            return this;
        } // end andPackageIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("BUSINESS_OBJECT.PACKAGE_ID not between", value1,
                value2, "packageId");

            return this;
        } // end andPackageIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateIsNull() {
            addCriterion("BUSINESS_OBJECT.STATE is null");

            return this;
        } // end andStateIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateIsNotNull() {
            addCriterion("BUSINESS_OBJECT.STATE is not null");

            return this;
        } // end andStateIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateIsNotEmpty() {
            addCriterion(
                "BUSINESS_OBJECT.STATE is not null AND BUSINESS_OBJECT.STATE <> ''");

            return this;
        } // end andStateIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateIsEmpty() {
            addCriterion(
                "(BUSINESS_OBJECT.STATE is null OR BUSINESS_OBJECT.STATE = '')");

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
            addCriterion("BUSINESS_OBJECT.STATE =", value, "state");

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
            StringBuffer str = new StringBuffer("BUSINESS_OBJECT.STATE");
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
            addCriterion("BUSINESS_OBJECT.STATE <>", value, "state");

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
            addCriterion("BUSINESS_OBJECT.STATE is null OR BUSINESS_OBJECT.STATE <>",
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
            StringBuffer str = new StringBuffer("BUSINESS_OBJECT.STATE");
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
            addCriterion("BUSINESS_OBJECT.STATE >", value, "state");

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
            StringBuffer str = new StringBuffer("BUSINESS_OBJECT.STATE");
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
            addCriterion("BUSINESS_OBJECT.STATE >=", value, "state");

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
            StringBuffer str = new StringBuffer("BUSINESS_OBJECT.STATE");
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
            addCriterion("BUSINESS_OBJECT.STATE <", value, "state");

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
            StringBuffer str = new StringBuffer("BUSINESS_OBJECT.STATE");
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
            addCriterion("BUSINESS_OBJECT.STATE <=", value, "state");

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
            StringBuffer str = new StringBuffer("BUSINESS_OBJECT.STATE");
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
            addCriterion("BUSINESS_OBJECT.STATE like", buffer.toString(),
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
            addCriterion("BUSINESS_OBJECT.STATE not like", buffer.toString(),
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
                addCriterion("BUSINESS_OBJECT.STATE in", values, "state");

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
                addCriterion("BUSINESS_OBJECT.STATE not in", values, "state");

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
                addCriterion("BUSINESS_OBJECT.STATE in", Arrays.asList(values),
                    "state");

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
                addCriterion("BUSINESS_OBJECT.STATE not in",
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
            addCriterion("BUSINESS_OBJECT.STATE between", value1, value2,
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
            addCriterion("BUSINESS_OBJECT.STATE not between", value1, value2,
                "state");

            return this;
        } // end andStateNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeIsNull() {
            addCriterion("BUSINESS_OBJECT.TYPE is null");

            return this;
        } // end andTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeIsNotNull() {
            addCriterion("BUSINESS_OBJECT.TYPE is not null");

            return this;
        } // end andTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeIsNotEmpty() {
            addCriterion(
                "BUSINESS_OBJECT.TYPE is not null AND BUSINESS_OBJECT.TYPE <> ''");

            return this;
        } // end andTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeIsEmpty() {
            addCriterion(
                "(BUSINESS_OBJECT.TYPE is null OR BUSINESS_OBJECT.TYPE = '')");

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
            addCriterion("BUSINESS_OBJECT.TYPE =", value, "type");

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
            StringBuffer str = new StringBuffer("BUSINESS_OBJECT.TYPE");
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
            addCriterion("BUSINESS_OBJECT.TYPE <>", value, "type");

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
            addCriterion("BUSINESS_OBJECT.TYPE is null OR BUSINESS_OBJECT.TYPE <>",
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
            StringBuffer str = new StringBuffer("BUSINESS_OBJECT.TYPE");
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
            addCriterion("BUSINESS_OBJECT.TYPE >", value, "type");

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
            StringBuffer str = new StringBuffer("BUSINESS_OBJECT.TYPE");
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
            addCriterion("BUSINESS_OBJECT.TYPE >=", value, "type");

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
            StringBuffer str = new StringBuffer("BUSINESS_OBJECT.TYPE");
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
            addCriterion("BUSINESS_OBJECT.TYPE <", value, "type");

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
            StringBuffer str = new StringBuffer("BUSINESS_OBJECT.TYPE");
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
            addCriterion("BUSINESS_OBJECT.TYPE <=", value, "type");

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
            StringBuffer str = new StringBuffer("BUSINESS_OBJECT.TYPE");
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
            addCriterion("BUSINESS_OBJECT.TYPE like", buffer.toString(), "type");

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
            addCriterion("BUSINESS_OBJECT.TYPE not like", buffer.toString(),
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
                addCriterion("BUSINESS_OBJECT.TYPE in", values, "type");

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
                addCriterion("BUSINESS_OBJECT.TYPE not in", values, "type");

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
                addCriterion("BUSINESS_OBJECT.TYPE in", Arrays.asList(values),
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
                addCriterion("BUSINESS_OBJECT.TYPE not in",
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
            addCriterion("BUSINESS_OBJECT.TYPE between", value1, value2, "type");

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
            addCriterion("BUSINESS_OBJECT.TYPE not between", value1, value2,
                "type");

            return this;
        } // end andTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdIsNull() {
            addCriterion("package.BUSINESS_DOMAIN_ID is null");

            return this;
        } // end andDomainIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdIsNotNull() {
            addCriterion("package.BUSINESS_DOMAIN_ID is not null");

            return this;
        } // end andDomainIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdIsNotEmpty() {
            addCriterion(
                "package.BUSINESS_DOMAIN_ID is not null AND package.BUSINESS_DOMAIN_ID <> ''");

            return this;
        } // end andDomainIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdIsEmpty() {
            addCriterion(
                "(package.BUSINESS_DOMAIN_ID is null OR package.BUSINESS_DOMAIN_ID = '')");

            return this;
        } // end andDomainIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdEqualTo(long value) {
            return andDomainIdEqualTo(Long.valueOf(value));
        } // end andDomainIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdEqualTo(java.lang.Long value) {
            addCriterion("package.BUSINESS_DOMAIN_ID =", value, "domainId");

            return this;
        } // end andDomainIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("package.BUSINESS_DOMAIN_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdNotEqualTo(long value) {
            return andDomainIdNotEqualTo(Long.valueOf(value));
        } // end andDomainIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdNotEqualTo(java.lang.Long value) {
            addCriterion("package.BUSINESS_DOMAIN_ID <>", value, "domainId");

            return this;
        } // end andDomainIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdNotEqualToOrIsNull(long value) {
            return andDomainIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andDomainIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("package.BUSINESS_DOMAIN_ID is null OR package.BUSINESS_DOMAIN_ID <>",
                value, "domainId");

            return this;
        } // end andDomainIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("package.BUSINESS_DOMAIN_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdGreaterThan(long value) {
            return andDomainIdGreaterThan(Long.valueOf(value));
        } // end andDomainIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdGreaterThan(java.lang.Long value) {
            addCriterion("package.BUSINESS_DOMAIN_ID >", value, "domainId");

            return this;
        } // end andDomainIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("package.BUSINESS_DOMAIN_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdGreaterThanOrEqualTo(long value) {
            return andDomainIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andDomainIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("package.BUSINESS_DOMAIN_ID >=", value, "domainId");

            return this;
        } // end andDomainIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("package.BUSINESS_DOMAIN_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdLessThan(long value) {
            return andDomainIdLessThan(Long.valueOf(value));
        } // end andDomainIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdLessThan(java.lang.Long value) {
            addCriterion("package.BUSINESS_DOMAIN_ID <", value, "domainId");

            return this;
        } // end andDomainIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("package.BUSINESS_DOMAIN_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdLessThanOrEqualTo(long value) {
            return andDomainIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andDomainIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("package.BUSINESS_DOMAIN_ID <=", value, "domainId");

            return this;
        } // end andDomainIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("package.BUSINESS_DOMAIN_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdIn(long[] values) {
            if (values.length == 1) {
                return andDomainIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("package.BUSINESS_DOMAIN_ID in", values, "domainId");

                return this;
            } // end else
        } // end andDomainIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdNotIn(long[] values) {
            if (values.length == 1) {
                return andDomainIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("package.BUSINESS_DOMAIN_ID not in", values,
                    "domainId");

                return this;
            } // end else
        } // end andDomainIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdIn(List values) {
            if (values.size() == 1) {
                return andDomainIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("package.BUSINESS_DOMAIN_ID in", values, "domainId");

                return this;
            } // end else
        } // end andDomainIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdNotIn(List values) {
            if (values.size() == 1) {
                return andDomainIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("package.BUSINESS_DOMAIN_ID not in", values,
                    "domainId");

                return this;
            } // end else
        } // end andDomainIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdIn(Object[] values) {
            if (values.length == 1) {
                return andDomainIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("package.BUSINESS_DOMAIN_ID in",
                    Arrays.asList(values), "domainId");

                return this;
            } // end else
        } // end andDomainIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andDomainIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("package.BUSINESS_DOMAIN_ID not in",
                    Arrays.asList(values), "domainId");

                return this;
            } // end else
        } // end andDomainIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdBetween(long value1, long value2) {
            addCriterion("package.BUSINESS_DOMAIN_ID between", value1, value2,
                "domainId");

            return this;
        } // end andDomainIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("package.BUSINESS_DOMAIN_ID between", value1, value2,
                "domainId");

            return this;
        } // end andDomainIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdNotBetween(long value1, long value2) {
            addCriterion("package.BUSINESS_DOMAIN_ID not between", value1,
                value2, "domainId");

            return this;
        } // end andDomainIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("package.BUSINESS_DOMAIN_ID not between", value1,
                value2, "domainId");

            return this;
        } // end andDomainIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameIsNull() {
            addCriterion("domain.NAME is null");

            return this;
        } // end andDomainNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameIsNotNull() {
            addCriterion("domain.NAME is not null");

            return this;
        } // end andDomainNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameIsNotEmpty() {
            addCriterion("domain.NAME is not null AND domain.NAME <> ''");

            return this;
        } // end andDomainNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameIsEmpty() {
            addCriterion("(domain.NAME is null OR domain.NAME = '')");

            return this;
        } // end andDomainNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameEqualTo(String value) {
            addCriterion("domain.NAME =", value, "domainName");

            return this;
        } // end andDomainNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("domain.NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameNotEqualTo(String value) {
            addCriterion("domain.NAME <>", value, "domainName");

            return this;
        } // end andDomainNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameNotEqualToOrIsNull(String value) {
            addCriterion("domain.NAME is null OR domain.NAME <>", value,
                "domainName");

            return this;
        } // end andDomainNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("domain.NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameGreaterThan(String value) {
            addCriterion("domain.NAME >", value, "domainName");

            return this;
        } // end andDomainNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("domain.NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameGreaterThanOrEqualTo(String value) {
            addCriterion("domain.NAME >=", value, "domainName");

            return this;
        } // end andDomainNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("domain.NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameLessThan(String value) {
            addCriterion("domain.NAME <", value, "domainName");

            return this;
        } // end andDomainNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("domain.NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameLessThanOrEqualTo(String value) {
            addCriterion("domain.NAME <=", value, "domainName");

            return this;
        } // end andDomainNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("domain.NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDomainNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("domain.NAME like", buffer.toString(), "domainName");

            return this;
        } // end andDomainNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("domain.NAME not like", buffer.toString(), "domainName");

            return this;
        } // end andDomainNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameIn(List values) {
            if (values.size() == 1) {
                return andDomainNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("domain.NAME in", values, "domainName");

                return this;
            } // end else
        } // end andDomainNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameNotIn(List values) {
            if (values.size() == 1) {
                return andDomainNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("domain.NAME not in", values, "domainName");

                return this;
            } // end else
        } // end andDomainNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameIn(Object[] values) {
            if (values.length == 1) {
                return andDomainNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("domain.NAME in", Arrays.asList(values),
                    "domainName");

                return this;
            } // end else
        } // end andDomainNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andDomainNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("domain.NAME not in", Arrays.asList(values),
                    "domainName");

                return this;
            } // end else
        } // end andDomainNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameBetween(String value1, String value2) {
            addCriterion("domain.NAME between", value1, value2, "domainName");

            return this;
        } // end andDomainNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDomainNameNotBetween(String value1, String value2) {
            addCriterion("domain.NAME not between", value1, value2, "domainName");

            return this;
        } // end andDomainNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageNameIsNull() {
            addCriterion("package.NAME is null");

            return this;
        } // end andPackageNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageNameIsNotNull() {
            addCriterion("package.NAME is not null");

            return this;
        } // end andPackageNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageNameIsNotEmpty() {
            addCriterion("package.NAME is not null AND package.NAME <> ''");

            return this;
        } // end andPackageNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageNameIsEmpty() {
            addCriterion("(package.NAME is null OR package.NAME = '')");

            return this;
        } // end andPackageNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageNameEqualTo(String value) {
            addCriterion("package.NAME =", value, "packageName");

            return this;
        } // end andPackageNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("package.NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPackageNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageNameNotEqualTo(String value) {
            addCriterion("package.NAME <>", value, "packageName");

            return this;
        } // end andPackageNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageNameNotEqualToOrIsNull(String value) {
            addCriterion("package.NAME is null OR package.NAME <>", value,
                "packageName");

            return this;
        } // end andPackageNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("package.NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPackageNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageNameGreaterThan(String value) {
            addCriterion("package.NAME >", value, "packageName");

            return this;
        } // end andPackageNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("package.NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPackageNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageNameGreaterThanOrEqualTo(String value) {
            addCriterion("package.NAME >=", value, "packageName");

            return this;
        } // end andPackageNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("package.NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPackageNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageNameLessThan(String value) {
            addCriterion("package.NAME <", value, "packageName");

            return this;
        } // end andPackageNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("package.NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPackageNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageNameLessThanOrEqualTo(String value) {
            addCriterion("package.NAME <=", value, "packageName");

            return this;
        } // end andPackageNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("package.NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPackageNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("package.NAME like", buffer.toString(), "packageName");

            return this;
        } // end andPackageNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("package.NAME not like", buffer.toString(),
                "packageName");

            return this;
        } // end andPackageNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageNameIn(List values) {
            if (values.size() == 1) {
                return andPackageNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("package.NAME in", values, "packageName");

                return this;
            } // end else
        } // end andPackageNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageNameNotIn(List values) {
            if (values.size() == 1) {
                return andPackageNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("package.NAME not in", values, "packageName");

                return this;
            } // end else
        } // end andPackageNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageNameIn(Object[] values) {
            if (values.length == 1) {
                return andPackageNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("package.NAME in", Arrays.asList(values),
                    "packageName");

                return this;
            } // end else
        } // end andPackageNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andPackageNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("package.NAME not in", Arrays.asList(values),
                    "packageName");

                return this;
            } // end else
        } // end andPackageNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageNameBetween(String value1, String value2) {
            addCriterion("package.NAME between", value1, value2, "packageName");

            return this;
        } // end andPackageNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPackageNameNotBetween(String value1, String value2) {
            addCriterion("package.NAME not between", value1, value2,
                "packageName");

            return this;
        } // end andPackageNameNotBetween()
    } // end Criteria
} // end BusinessObjectDAOQueryBean
