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
 * BusinessObjectAction query bean 2011-09-22 10:16:37
 *
 * @author Auto Gen
 */
public class BusinessObjectActionDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new BusinessObjectActionDAOQueryBean object.
     */
    public BusinessObjectActionDAOQueryBean() {
        super();
    } // end BusinessObjectActionDAOQueryBean()

    /**
     * Creates a new BusinessObjectActionDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public BusinessObjectActionDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end BusinessObjectActionDAOQueryBean()

    /**
     * Creates a new BusinessObjectActionDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public BusinessObjectActionDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end BusinessObjectActionDAOQueryBean()

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
    public void addObjectActionIdSelectProperty() {
        addObjectActionIdSelectProperty("objectActionId");
    } // end addObjectActionIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addObjectActionIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessObjectActionDAO.ObjectActionId, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessObjectActionDAO.ObjectActionId,
                "objectActionId");
        } // end else
    } // end addObjectActionIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addActionSelectProperty() {
        addActionSelectProperty("action");
    } // end addActionSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addActionSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessObjectActionDAO.Action, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessObjectActionDAO.Action, "action");
        } // end else
    } // end addActionSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addObjectIdSelectProperty() {
        addObjectIdSelectProperty("objectId");
    } // end addObjectIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addObjectIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessObjectActionDAO.ObjectId, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessObjectActionDAO.ObjectId, "objectId");
        } // end else
    } // end addObjectIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addPropertyIdSelectProperty() {
        addPropertyIdSelectProperty("propertyId");
    } // end addPropertyIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addPropertyIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessObjectActionDAO.PropertyId, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessObjectActionDAO.PropertyId, "propertyId");
        } // end else
    } // end addPropertyIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addPropertyValueSelectProperty() {
        addPropertyValueSelectProperty("propertyValue");
    } // end addPropertyValueSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addPropertyValueSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessObjectActionDAO.PropertyValue, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessObjectActionDAO.PropertyValue,
                "propertyValue");
        } // end else
    } // end addPropertyValueSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addPropertyDataSizeSelectProperty() {
        addPropertyDataSizeSelectProperty("propertyDataSize");
    } // end addPropertyDataSizeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addPropertyDataSizeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessObjectActionDAO.PropertyDataSize, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessObjectActionDAO.PropertyDataSize,
                "propertyDataSize");
        } // end else
    } // end addPropertyDataSizeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addPropertyDataTypeSelectProperty() {
        addPropertyDataTypeSelectProperty("propertyDataType");
    } // end addPropertyDataTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addPropertyDataTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessObjectActionDAO.PropertyDataType, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessObjectActionDAO.PropertyDataType,
                "propertyDataType");
        } // end else
    } // end addPropertyDataTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addPropertyDefaultValueSelectProperty() {
        addPropertyDefaultValueSelectProperty("propertyDefaultValue");
    } // end addPropertyDefaultValueSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addPropertyDefaultValueSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessObjectActionDAO.PropertyDefaultValue,
                aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessObjectActionDAO.PropertyDefaultValue,
                "propertyDefaultValue");
        } // end else
    } // end addPropertyDefaultValueSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addPropertyDescriptionSelectProperty() {
        addPropertyDescriptionSelectProperty("propertyDescription");
    } // end addPropertyDescriptionSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addPropertyDescriptionSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessObjectActionDAO.PropertyDescription,
                aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessObjectActionDAO.PropertyDescription,
                "propertyDescription");
        } // end else
    } // end addPropertyDescriptionSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addPropertyIsEnumSelectProperty() {
        addPropertyIsEnumSelectProperty("propertyIsEnum");
    } // end addPropertyIsEnumSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addPropertyIsEnumSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessObjectActionDAO.PropertyIsEnum, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessObjectActionDAO.PropertyIsEnum,
                "propertyIsEnum");
        } // end else
    } // end addPropertyIsEnumSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addPropertyIsGenerateSelectProperty() {
        addPropertyIsGenerateSelectProperty("propertyIsGenerate");
    } // end addPropertyIsGenerateSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addPropertyIsGenerateSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessObjectActionDAO.PropertyIsGenerate,
                aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessObjectActionDAO.PropertyIsGenerate,
                "propertyIsGenerate");
        } // end else
    } // end addPropertyIsGenerateSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addPropertyIsPrimaryPropertySelectProperty() {
        addPropertyIsPrimaryPropertySelectProperty("propertyIsPrimaryProperty");
    } // end addPropertyIsPrimaryPropertySelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addPropertyIsPrimaryPropertySelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessObjectActionDAO.PropertyIsPrimaryProperty,
                aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessObjectActionDAO.PropertyIsPrimaryProperty,
                "propertyIsPrimaryProperty");
        } // end else
    } // end addPropertyIsPrimaryPropertySelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addPropertyKindSelectProperty() {
        addPropertyKindSelectProperty("propertyKind");
    } // end addPropertyKindSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addPropertyKindSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessObjectActionDAO.PropertyKind, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessObjectActionDAO.PropertyKind,
                "propertyKind");
        } // end else
    } // end addPropertyKindSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addPropertyNameSelectProperty() {
        addPropertyNameSelectProperty("propertyName");
    } // end addPropertyNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addPropertyNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessObjectActionDAO.PropertyName, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessObjectActionDAO.PropertyName,
                "propertyName");
        } // end else
    } // end addPropertyNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addPropertyOrderIndexSelectProperty() {
        addPropertyOrderIndexSelectProperty("propertyOrderIndex");
    } // end addPropertyOrderIndexSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addPropertyOrderIndexSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessObjectActionDAO.PropertyOrderIndex,
                aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessObjectActionDAO.PropertyOrderIndex,
                "propertyOrderIndex");
        } // end else
    } // end addPropertyOrderIndexSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addPropertyStateSelectProperty() {
        addPropertyStateSelectProperty("propertyState");
    } // end addPropertyStateSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addPropertyStateSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessObjectActionDAO.PropertyState, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessObjectActionDAO.PropertyState,
                "propertyState");
        } // end else
    } // end addPropertyStateSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addPropertyTypeSelectProperty() {
        addPropertyTypeSelectProperty("propertyType");
    } // end addPropertyTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addPropertyTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessObjectActionDAO.PropertyType, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessObjectActionDAO.PropertyType,
                "propertyType");
        } // end else
    } // end addPropertyTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addOperationSelectProperty() {
        addOperationSelectProperty("operation");
    } // end addOperationSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addOperationSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IBusinessObjectActionDAO.Operation, aAlias);
        } // end if
        else {
            addSelectProperty(IBusinessObjectActionDAO.Operation, "operation");
        } // end else
    } // end addOperationSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addObjectActionIdSelectProperty();

        addActionSelectProperty();

        addObjectIdSelectProperty();

        addPropertyIdSelectProperty();

        addPropertyValueSelectProperty();

        addPropertyDataSizeSelectProperty();

        addPropertyDataTypeSelectProperty();

        addPropertyDefaultValueSelectProperty();

        addPropertyDescriptionSelectProperty();

        addPropertyIsEnumSelectProperty();

        addPropertyIsGenerateSelectProperty();

        addPropertyIsPrimaryPropertySelectProperty();

        addPropertyKindSelectProperty();

        addPropertyNameSelectProperty();

        addPropertyOrderIndexSelectProperty();

        addPropertyStateSelectProperty();

        addPropertyTypeSelectProperty();

        addOperationSelectProperty();
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
        public Criteria andObjectActionIdIsNull() {
            addCriterion("OBJECT_ACTION.OBJECT_ACTION_ID is null");

            return this;
        } // end andObjectActionIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectActionIdIsNotNull() {
            addCriterion("OBJECT_ACTION.OBJECT_ACTION_ID is not null");

            return this;
        } // end andObjectActionIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectActionIdIsNotEmpty() {
            addCriterion(
                "OBJECT_ACTION.OBJECT_ACTION_ID is not null AND OBJECT_ACTION.OBJECT_ACTION_ID <> ''");

            return this;
        } // end andObjectActionIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectActionIdIsEmpty() {
            addCriterion(
                "(OBJECT_ACTION.OBJECT_ACTION_ID is null OR OBJECT_ACTION.OBJECT_ACTION_ID = '')");

            return this;
        } // end andObjectActionIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectActionIdEqualTo(long value) {
            return andObjectActionIdEqualTo(Long.valueOf(value));
        } // end andObjectActionIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectActionIdEqualTo(java.lang.Long value) {
            addCriterion("OBJECT_ACTION.OBJECT_ACTION_ID =", value,
                "objectActionId");

            return this;
        } // end andObjectActionIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectActionIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_ACTION.OBJECT_ACTION_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectActionIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectActionIdNotEqualTo(long value) {
            return andObjectActionIdNotEqualTo(Long.valueOf(value));
        } // end andObjectActionIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectActionIdNotEqualTo(java.lang.Long value) {
            addCriterion("OBJECT_ACTION.OBJECT_ACTION_ID <>", value,
                "objectActionId");

            return this;
        } // end andObjectActionIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectActionIdNotEqualToOrIsNull(long value) {
            return andObjectActionIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andObjectActionIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectActionIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("OBJECT_ACTION.OBJECT_ACTION_ID is null OR OBJECT_ACTION.OBJECT_ACTION_ID <>",
                value, "objectActionId");

            return this;
        } // end andObjectActionIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectActionIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_ACTION.OBJECT_ACTION_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectActionIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectActionIdGreaterThan(long value) {
            return andObjectActionIdGreaterThan(Long.valueOf(value));
        } // end andObjectActionIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectActionIdGreaterThan(java.lang.Long value) {
            addCriterion("OBJECT_ACTION.OBJECT_ACTION_ID >", value,
                "objectActionId");

            return this;
        } // end andObjectActionIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectActionIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_ACTION.OBJECT_ACTION_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectActionIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectActionIdGreaterThanOrEqualTo(long value) {
            return andObjectActionIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andObjectActionIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectActionIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("OBJECT_ACTION.OBJECT_ACTION_ID >=", value,
                "objectActionId");

            return this;
        } // end andObjectActionIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectActionIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_ACTION.OBJECT_ACTION_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectActionIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectActionIdLessThan(long value) {
            return andObjectActionIdLessThan(Long.valueOf(value));
        } // end andObjectActionIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectActionIdLessThan(java.lang.Long value) {
            addCriterion("OBJECT_ACTION.OBJECT_ACTION_ID <", value,
                "objectActionId");

            return this;
        } // end andObjectActionIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectActionIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_ACTION.OBJECT_ACTION_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectActionIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectActionIdLessThanOrEqualTo(long value) {
            return andObjectActionIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andObjectActionIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectActionIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("OBJECT_ACTION.OBJECT_ACTION_ID <=", value,
                "objectActionId");

            return this;
        } // end andObjectActionIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectActionIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_ACTION.OBJECT_ACTION_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectActionIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectActionIdIn(long[] values) {
            if (values.length == 1) {
                return andObjectActionIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_ACTION.OBJECT_ACTION_ID in", values,
                    "objectActionId");

                return this;
            } // end else
        } // end andObjectActionIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectActionIdNotIn(long[] values) {
            if (values.length == 1) {
                return andObjectActionIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_ACTION.OBJECT_ACTION_ID not in", values,
                    "objectActionId");

                return this;
            } // end else
        } // end andObjectActionIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectActionIdIn(List values) {
            if (values.size() == 1) {
                return andObjectActionIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_ACTION.OBJECT_ACTION_ID in", values,
                    "objectActionId");

                return this;
            } // end else
        } // end andObjectActionIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectActionIdNotIn(List values) {
            if (values.size() == 1) {
                return andObjectActionIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("OBJECT_ACTION.OBJECT_ACTION_ID not in", values,
                    "objectActionId");

                return this;
            } // end else
        } // end andObjectActionIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectActionIdIn(Object[] values) {
            if (values.length == 1) {
                return andObjectActionIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_ACTION.OBJECT_ACTION_ID in",
                    Arrays.asList(values), "objectActionId");

                return this;
            } // end else
        } // end andObjectActionIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectActionIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andObjectActionIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_ACTION.OBJECT_ACTION_ID not in",
                    Arrays.asList(values), "objectActionId");

                return this;
            } // end else
        } // end andObjectActionIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectActionIdBetween(long value1, long value2) {
            addCriterion("OBJECT_ACTION.OBJECT_ACTION_ID between", value1,
                value2, "objectActionId");

            return this;
        } // end andObjectActionIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectActionIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("OBJECT_ACTION.OBJECT_ACTION_ID between", value1,
                value2, "objectActionId");

            return this;
        } // end andObjectActionIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectActionIdNotBetween(long value1, long value2) {
            addCriterion("OBJECT_ACTION.OBJECT_ACTION_ID not between", value1,
                value2, "objectActionId");

            return this;
        } // end andObjectActionIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectActionIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("OBJECT_ACTION.OBJECT_ACTION_ID not between", value1,
                value2, "objectActionId");

            return this;
        } // end andObjectActionIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIsNull() {
            addCriterion("OBJECT_ACTION.ACTION is null");

            return this;
        } // end andActionIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIsNotNull() {
            addCriterion("OBJECT_ACTION.ACTION is not null");

            return this;
        } // end andActionIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIsNotEmpty() {
            addCriterion(
                "OBJECT_ACTION.ACTION is not null AND OBJECT_ACTION.ACTION <> ''");

            return this;
        } // end andActionIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIsEmpty() {
            addCriterion(
                "(OBJECT_ACTION.ACTION is null OR OBJECT_ACTION.ACTION = '')");

            return this;
        } // end andActionIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionEqualTo(String value) {
            addCriterion("OBJECT_ACTION.ACTION =", value, "action");

            return this;
        } // end andActionEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_ACTION.ACTION");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andActionEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionNotEqualTo(String value) {
            addCriterion("OBJECT_ACTION.ACTION <>", value, "action");

            return this;
        } // end andActionNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionNotEqualToOrIsNull(String value) {
            addCriterion("OBJECT_ACTION.ACTION is null OR OBJECT_ACTION.ACTION <>",
                value, "action");

            return this;
        } // end andActionNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_ACTION.ACTION");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andActionNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionGreaterThan(String value) {
            addCriterion("OBJECT_ACTION.ACTION >", value, "action");

            return this;
        } // end andActionGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_ACTION.ACTION");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andActionGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECT_ACTION.ACTION >=", value, "action");

            return this;
        } // end andActionGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_ACTION.ACTION");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andActionGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionLessThan(String value) {
            addCriterion("OBJECT_ACTION.ACTION <", value, "action");

            return this;
        } // end andActionLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_ACTION.ACTION");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andActionLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionLessThanOrEqualTo(String value) {
            addCriterion("OBJECT_ACTION.ACTION <=", value, "action");

            return this;
        } // end andActionLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_ACTION.ACTION");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andActionLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_ACTION.ACTION like", buffer.toString(),
                "action");

            return this;
        } // end andActionLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_ACTION.ACTION not like", buffer.toString(),
                "action");

            return this;
        } // end andActionNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIn(List values) {
            if (values.size() == 1) {
                return andActionEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_ACTION.ACTION in", values, "action");

                return this;
            } // end else
        } // end andActionIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionNotIn(List values) {
            if (values.size() == 1) {
                return andActionNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_ACTION.ACTION not in", values, "action");

                return this;
            } // end else
        } // end andActionNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionIn(Object[] values) {
            if (values.length == 1) {
                return andActionEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_ACTION.ACTION in", Arrays.asList(values),
                    "action");

                return this;
            } // end else
        } // end andActionIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionNotIn(Object[] values) {
            if (values.length == 1) {
                return andActionNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_ACTION.ACTION not in",
                    Arrays.asList(values), "action");

                return this;
            } // end else
        } // end andActionNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionBetween(String value1, String value2) {
            addCriterion("OBJECT_ACTION.ACTION between", value1, value2,
                "action");

            return this;
        } // end andActionBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andActionNotBetween(String value1, String value2) {
            addCriterion("OBJECT_ACTION.ACTION not between", value1, value2,
                "action");

            return this;
        } // end andActionNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdIsNull() {
            addCriterion("OBJECT_ACTION.OBJECT_ID is null");

            return this;
        } // end andObjectIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdIsNotNull() {
            addCriterion("OBJECT_ACTION.OBJECT_ID is not null");

            return this;
        } // end andObjectIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdIsNotEmpty() {
            addCriterion(
                "OBJECT_ACTION.OBJECT_ID is not null AND OBJECT_ACTION.OBJECT_ID <> ''");

            return this;
        } // end andObjectIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdIsEmpty() {
            addCriterion(
                "(OBJECT_ACTION.OBJECT_ID is null OR OBJECT_ACTION.OBJECT_ID = '')");

            return this;
        } // end andObjectIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdEqualTo(long value) {
            return andObjectIdEqualTo(Long.valueOf(value));
        } // end andObjectIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdEqualTo(java.lang.Long value) {
            addCriterion("OBJECT_ACTION.OBJECT_ID =", value, "objectId");

            return this;
        } // end andObjectIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_ACTION.OBJECT_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdNotEqualTo(long value) {
            return andObjectIdNotEqualTo(Long.valueOf(value));
        } // end andObjectIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdNotEqualTo(java.lang.Long value) {
            addCriterion("OBJECT_ACTION.OBJECT_ID <>", value, "objectId");

            return this;
        } // end andObjectIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdNotEqualToOrIsNull(long value) {
            return andObjectIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andObjectIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("OBJECT_ACTION.OBJECT_ID is null OR OBJECT_ACTION.OBJECT_ID <>",
                value, "objectId");

            return this;
        } // end andObjectIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_ACTION.OBJECT_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdGreaterThan(long value) {
            return andObjectIdGreaterThan(Long.valueOf(value));
        } // end andObjectIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdGreaterThan(java.lang.Long value) {
            addCriterion("OBJECT_ACTION.OBJECT_ID >", value, "objectId");

            return this;
        } // end andObjectIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_ACTION.OBJECT_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdGreaterThanOrEqualTo(long value) {
            return andObjectIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andObjectIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("OBJECT_ACTION.OBJECT_ID >=", value, "objectId");

            return this;
        } // end andObjectIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_ACTION.OBJECT_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdLessThan(long value) {
            return andObjectIdLessThan(Long.valueOf(value));
        } // end andObjectIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdLessThan(java.lang.Long value) {
            addCriterion("OBJECT_ACTION.OBJECT_ID <", value, "objectId");

            return this;
        } // end andObjectIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_ACTION.OBJECT_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdLessThanOrEqualTo(long value) {
            return andObjectIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andObjectIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("OBJECT_ACTION.OBJECT_ID <=", value, "objectId");

            return this;
        } // end andObjectIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_ACTION.OBJECT_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdIn(long[] values) {
            if (values.length == 1) {
                return andObjectIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_ACTION.OBJECT_ID in", values, "objectId");

                return this;
            } // end else
        } // end andObjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdNotIn(long[] values) {
            if (values.length == 1) {
                return andObjectIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_ACTION.OBJECT_ID not in", values,
                    "objectId");

                return this;
            } // end else
        } // end andObjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdIn(List values) {
            if (values.size() == 1) {
                return andObjectIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_ACTION.OBJECT_ID in", values, "objectId");

                return this;
            } // end else
        } // end andObjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdNotIn(List values) {
            if (values.size() == 1) {
                return andObjectIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_ACTION.OBJECT_ID not in", values,
                    "objectId");

                return this;
            } // end else
        } // end andObjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdIn(Object[] values) {
            if (values.length == 1) {
                return andObjectIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_ACTION.OBJECT_ID in",
                    Arrays.asList(values), "objectId");

                return this;
            } // end else
        } // end andObjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andObjectIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_ACTION.OBJECT_ID not in",
                    Arrays.asList(values), "objectId");

                return this;
            } // end else
        } // end andObjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdBetween(long value1, long value2) {
            addCriterion("OBJECT_ACTION.OBJECT_ID between", value1, value2,
                "objectId");

            return this;
        } // end andObjectIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("OBJECT_ACTION.OBJECT_ID between", value1, value2,
                "objectId");

            return this;
        } // end andObjectIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdNotBetween(long value1, long value2) {
            addCriterion("OBJECT_ACTION.OBJECT_ID not between", value1, value2,
                "objectId");

            return this;
        } // end andObjectIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("OBJECT_ACTION.OBJECT_ID not between", value1, value2,
                "objectId");

            return this;
        } // end andObjectIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdIsNull() {
            addCriterion("OBJECT_ACTION.PROPERTY_ID is null");

            return this;
        } // end andPropertyIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdIsNotNull() {
            addCriterion("OBJECT_ACTION.PROPERTY_ID is not null");

            return this;
        } // end andPropertyIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdIsNotEmpty() {
            addCriterion(
                "OBJECT_ACTION.PROPERTY_ID is not null AND OBJECT_ACTION.PROPERTY_ID <> ''");

            return this;
        } // end andPropertyIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdIsEmpty() {
            addCriterion(
                "(OBJECT_ACTION.PROPERTY_ID is null OR OBJECT_ACTION.PROPERTY_ID = '')");

            return this;
        } // end andPropertyIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdEqualTo(long value) {
            return andPropertyIdEqualTo(Long.valueOf(value));
        } // end andPropertyIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdEqualTo(java.lang.Long value) {
            addCriterion("OBJECT_ACTION.PROPERTY_ID =", value, "propertyId");

            return this;
        } // end andPropertyIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_ACTION.PROPERTY_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdNotEqualTo(long value) {
            return andPropertyIdNotEqualTo(Long.valueOf(value));
        } // end andPropertyIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdNotEqualTo(java.lang.Long value) {
            addCriterion("OBJECT_ACTION.PROPERTY_ID <>", value, "propertyId");

            return this;
        } // end andPropertyIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdNotEqualToOrIsNull(long value) {
            return andPropertyIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andPropertyIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdNotEqualToOrIsNull(java.lang.Long value) {
            addCriterion("OBJECT_ACTION.PROPERTY_ID is null OR OBJECT_ACTION.PROPERTY_ID <>",
                value, "propertyId");

            return this;
        } // end andPropertyIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_ACTION.PROPERTY_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdGreaterThan(long value) {
            return andPropertyIdGreaterThan(Long.valueOf(value));
        } // end andPropertyIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdGreaterThan(java.lang.Long value) {
            addCriterion("OBJECT_ACTION.PROPERTY_ID >", value, "propertyId");

            return this;
        } // end andPropertyIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_ACTION.PROPERTY_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdGreaterThanOrEqualTo(long value) {
            return andPropertyIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andPropertyIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdGreaterThanOrEqualTo(java.lang.Long value) {
            addCriterion("OBJECT_ACTION.PROPERTY_ID >=", value, "propertyId");

            return this;
        } // end andPropertyIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_ACTION.PROPERTY_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdLessThan(long value) {
            return andPropertyIdLessThan(Long.valueOf(value));
        } // end andPropertyIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdLessThan(java.lang.Long value) {
            addCriterion("OBJECT_ACTION.PROPERTY_ID <", value, "propertyId");

            return this;
        } // end andPropertyIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_ACTION.PROPERTY_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdLessThanOrEqualTo(long value) {
            return andPropertyIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andPropertyIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdLessThanOrEqualTo(java.lang.Long value) {
            addCriterion("OBJECT_ACTION.PROPERTY_ID <=", value, "propertyId");

            return this;
        } // end andPropertyIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_ACTION.PROPERTY_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdIn(long[] values) {
            if (values.length == 1) {
                return andPropertyIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_ACTION.PROPERTY_ID in", values,
                    "propertyId");

                return this;
            } // end else
        } // end andPropertyIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdNotIn(long[] values) {
            if (values.length == 1) {
                return andPropertyIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_ACTION.PROPERTY_ID not in", values,
                    "propertyId");

                return this;
            } // end else
        } // end andPropertyIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdIn(List values) {
            if (values.size() == 1) {
                return andPropertyIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_ACTION.PROPERTY_ID in", values,
                    "propertyId");

                return this;
            } // end else
        } // end andPropertyIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdNotIn(List values) {
            if (values.size() == 1) {
                return andPropertyIdNotEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_ACTION.PROPERTY_ID not in", values,
                    "propertyId");

                return this;
            } // end else
        } // end andPropertyIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_ACTION.PROPERTY_ID in",
                    Arrays.asList(values), "propertyId");

                return this;
            } // end else
        } // end andPropertyIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_ACTION.PROPERTY_ID not in",
                    Arrays.asList(values), "propertyId");

                return this;
            } // end else
        } // end andPropertyIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdBetween(long value1, long value2) {
            addCriterion("OBJECT_ACTION.PROPERTY_ID between", value1, value2,
                "propertyId");

            return this;
        } // end andPropertyIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("OBJECT_ACTION.PROPERTY_ID between", value1, value2,
                "propertyId");

            return this;
        } // end andPropertyIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdNotBetween(long value1, long value2) {
            addCriterion("OBJECT_ACTION.PROPERTY_ID not between", value1,
                value2, "propertyId");

            return this;
        } // end andPropertyIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("OBJECT_ACTION.PROPERTY_ID not between", value1,
                value2, "propertyId");

            return this;
        } // end andPropertyIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyValueIsNull() {
            addCriterion("OBJECT_ACTION.PROPERTY_VALUE is null");

            return this;
        } // end andPropertyValueIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyValueIsNotNull() {
            addCriterion("OBJECT_ACTION.PROPERTY_VALUE is not null");

            return this;
        } // end andPropertyValueIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyValueIsNotEmpty() {
            addCriterion(
                "OBJECT_ACTION.PROPERTY_VALUE is not null AND OBJECT_ACTION.PROPERTY_VALUE <> ''");

            return this;
        } // end andPropertyValueIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyValueIsEmpty() {
            addCriterion(
                "(OBJECT_ACTION.PROPERTY_VALUE is null OR OBJECT_ACTION.PROPERTY_VALUE = '')");

            return this;
        } // end andPropertyValueIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyValueEqualTo(String value) {
            addCriterion("OBJECT_ACTION.PROPERTY_VALUE =", value,
                "propertyValue");

            return this;
        } // end andPropertyValueEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyValueEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_ACTION.PROPERTY_VALUE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyValueEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyValueNotEqualTo(String value) {
            addCriterion("OBJECT_ACTION.PROPERTY_VALUE <>", value,
                "propertyValue");

            return this;
        } // end andPropertyValueNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyValueNotEqualToOrIsNull(String value) {
            addCriterion("OBJECT_ACTION.PROPERTY_VALUE is null OR OBJECT_ACTION.PROPERTY_VALUE <>",
                value, "propertyValue");

            return this;
        } // end andPropertyValueNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyValueNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_ACTION.PROPERTY_VALUE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyValueNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyValueGreaterThan(String value) {
            addCriterion("OBJECT_ACTION.PROPERTY_VALUE >", value,
                "propertyValue");

            return this;
        } // end andPropertyValueGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyValueGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_ACTION.PROPERTY_VALUE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyValueGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyValueGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECT_ACTION.PROPERTY_VALUE >=", value,
                "propertyValue");

            return this;
        } // end andPropertyValueGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyValueGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_ACTION.PROPERTY_VALUE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyValueGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyValueLessThan(String value) {
            addCriterion("OBJECT_ACTION.PROPERTY_VALUE <", value,
                "propertyValue");

            return this;
        } // end andPropertyValueLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyValueLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_ACTION.PROPERTY_VALUE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyValueLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyValueLessThanOrEqualTo(String value) {
            addCriterion("OBJECT_ACTION.PROPERTY_VALUE <=", value,
                "propertyValue");

            return this;
        } // end andPropertyValueLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyValueLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_ACTION.PROPERTY_VALUE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyValueLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyValueLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_ACTION.PROPERTY_VALUE like",
                buffer.toString(), "propertyValue");

            return this;
        } // end andPropertyValueLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyValueNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_ACTION.PROPERTY_VALUE not like",
                buffer.toString(), "propertyValue");

            return this;
        } // end andPropertyValueNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyValueIn(List values) {
            if (values.size() == 1) {
                return andPropertyValueEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_ACTION.PROPERTY_VALUE in", values,
                    "propertyValue");

                return this;
            } // end else
        } // end andPropertyValueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyValueNotIn(List values) {
            if (values.size() == 1) {
                return andPropertyValueNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_ACTION.PROPERTY_VALUE not in", values,
                    "propertyValue");

                return this;
            } // end else
        } // end andPropertyValueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyValueIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyValueEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_ACTION.PROPERTY_VALUE in",
                    Arrays.asList(values), "propertyValue");

                return this;
            } // end else
        } // end andPropertyValueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyValueNotIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyValueNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_ACTION.PROPERTY_VALUE not in",
                    Arrays.asList(values), "propertyValue");

                return this;
            } // end else
        } // end andPropertyValueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyValueBetween(String value1, String value2) {
            addCriterion("OBJECT_ACTION.PROPERTY_VALUE between", value1,
                value2, "propertyValue");

            return this;
        } // end andPropertyValueBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyValueNotBetween(String value1, String value2) {
            addCriterion("OBJECT_ACTION.PROPERTY_VALUE not between", value1,
                value2, "propertyValue");

            return this;
        } // end andPropertyValueNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataSizeIsNull() {
            addCriterion("property.DATA_SIZE is null");

            return this;
        } // end andPropertyDataSizeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataSizeIsNotNull() {
            addCriterion("property.DATA_SIZE is not null");

            return this;
        } // end andPropertyDataSizeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataSizeIsNotEmpty() {
            addCriterion(
                "property.DATA_SIZE is not null AND property.DATA_SIZE <> ''");

            return this;
        } // end andPropertyDataSizeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataSizeIsEmpty() {
            addCriterion(
                "(property.DATA_SIZE is null OR property.DATA_SIZE = '')");

            return this;
        } // end andPropertyDataSizeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataSizeEqualTo(Integer value) {
            addCriterion("property.DATA_SIZE =", value, "propertyDataSize");

            return this;
        } // end andPropertyDataSizeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataSizeEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.DATA_SIZE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyDataSizeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataSizeNotEqualTo(Integer value) {
            addCriterion("property.DATA_SIZE <>", value, "propertyDataSize");

            return this;
        } // end andPropertyDataSizeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataSizeNotEqualToOrIsNull(Integer value) {
            addCriterion("property.DATA_SIZE is null OR property.DATA_SIZE <>",
                value, "propertyDataSize");

            return this;
        } // end andPropertyDataSizeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataSizeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.DATA_SIZE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyDataSizeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataSizeGreaterThan(Integer value) {
            addCriterion("property.DATA_SIZE >", value, "propertyDataSize");

            return this;
        } // end andPropertyDataSizeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataSizeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.DATA_SIZE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyDataSizeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("property.DATA_SIZE >=", value, "propertyDataSize");

            return this;
        } // end andPropertyDataSizeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataSizeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.DATA_SIZE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyDataSizeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataSizeLessThan(Integer value) {
            addCriterion("property.DATA_SIZE <", value, "propertyDataSize");

            return this;
        } // end andPropertyDataSizeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataSizeLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.DATA_SIZE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyDataSizeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataSizeLessThanOrEqualTo(Integer value) {
            addCriterion("property.DATA_SIZE <=", value, "propertyDataSize");

            return this;
        } // end andPropertyDataSizeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataSizeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.DATA_SIZE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyDataSizeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataSizeIn(List values) {
            if (values.size() == 1) {
                return andPropertyDataSizeEqualTo((Integer) values.get(0));
            } // end if
            else {
                addCriterion("property.DATA_SIZE in", values, "propertyDataSize");

                return this;
            } // end else
        } // end andPropertyDataSizeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataSizeNotIn(List values) {
            if (values.size() == 1) {
                return andPropertyDataSizeNotEqualTo((Integer) values.get(0));
            } // end if
            else {
                addCriterion("property.DATA_SIZE not in", values,
                    "propertyDataSize");

                return this;
            } // end else
        } // end andPropertyDataSizeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataSizeIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyDataSizeEqualTo((Integer) values[0]);
            } // end if
            else {
                addCriterion("property.DATA_SIZE in", Arrays.asList(values),
                    "propertyDataSize");

                return this;
            } // end else
        } // end andPropertyDataSizeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataSizeNotIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyDataSizeNotEqualTo((Integer) values[0]);
            } // end if
            else {
                addCriterion("property.DATA_SIZE not in",
                    Arrays.asList(values), "propertyDataSize");

                return this;
            } // end else
        } // end andPropertyDataSizeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataSizeBetween(Integer value1,
            Integer value2) {
            addCriterion("property.DATA_SIZE between", value1, value2,
                "propertyDataSize");

            return this;
        } // end andPropertyDataSizeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataSizeNotBetween(Integer value1,
            Integer value2) {
            addCriterion("property.DATA_SIZE not between", value1, value2,
                "propertyDataSize");

            return this;
        } // end andPropertyDataSizeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeIsNull() {
            addCriterion("property.DATA_TYPE is null");

            return this;
        } // end andPropertyDataTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeIsNotNull() {
            addCriterion("property.DATA_TYPE is not null");

            return this;
        } // end andPropertyDataTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeIsNotEmpty() {
            addCriterion(
                "property.DATA_TYPE is not null AND property.DATA_TYPE <> ''");

            return this;
        } // end andPropertyDataTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeIsEmpty() {
            addCriterion(
                "(property.DATA_TYPE is null OR property.DATA_TYPE = '')");

            return this;
        } // end andPropertyDataTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeEqualTo(String value) {
            addCriterion("property.DATA_TYPE =", value, "propertyDataType");

            return this;
        } // end andPropertyDataTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.DATA_TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyDataTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeNotEqualTo(String value) {
            addCriterion("property.DATA_TYPE <>", value, "propertyDataType");

            return this;
        } // end andPropertyDataTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeNotEqualToOrIsNull(String value) {
            addCriterion("property.DATA_TYPE is null OR property.DATA_TYPE <>",
                value, "propertyDataType");

            return this;
        } // end andPropertyDataTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.DATA_TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyDataTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeGreaterThan(String value) {
            addCriterion("property.DATA_TYPE >", value, "propertyDataType");

            return this;
        } // end andPropertyDataTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.DATA_TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyDataTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeGreaterThanOrEqualTo(String value) {
            addCriterion("property.DATA_TYPE >=", value, "propertyDataType");

            return this;
        } // end andPropertyDataTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.DATA_TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyDataTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeLessThan(String value) {
            addCriterion("property.DATA_TYPE <", value, "propertyDataType");

            return this;
        } // end andPropertyDataTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.DATA_TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyDataTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeLessThanOrEqualTo(String value) {
            addCriterion("property.DATA_TYPE <=", value, "propertyDataType");

            return this;
        } // end andPropertyDataTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.DATA_TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyDataTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("property.DATA_TYPE like", buffer.toString(),
                "propertyDataType");

            return this;
        } // end andPropertyDataTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("property.DATA_TYPE not like", buffer.toString(),
                "propertyDataType");

            return this;
        } // end andPropertyDataTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeIn(List values) {
            if (values.size() == 1) {
                return andPropertyDataTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("property.DATA_TYPE in", values, "propertyDataType");

                return this;
            } // end else
        } // end andPropertyDataTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeNotIn(List values) {
            if (values.size() == 1) {
                return andPropertyDataTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("property.DATA_TYPE not in", values,
                    "propertyDataType");

                return this;
            } // end else
        } // end andPropertyDataTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyDataTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("property.DATA_TYPE in", Arrays.asList(values),
                    "propertyDataType");

                return this;
            } // end else
        } // end andPropertyDataTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyDataTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("property.DATA_TYPE not in",
                    Arrays.asList(values), "propertyDataType");

                return this;
            } // end else
        } // end andPropertyDataTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeBetween(String value1, String value2) {
            addCriterion("property.DATA_TYPE between", value1, value2,
                "propertyDataType");

            return this;
        } // end andPropertyDataTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDataTypeNotBetween(String value1,
            String value2) {
            addCriterion("property.DATA_TYPE not between", value1, value2,
                "propertyDataType");

            return this;
        } // end andPropertyDataTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDefaultValueIsNull() {
            addCriterion("property.VALUE is null");

            return this;
        } // end andPropertyDefaultValueIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDefaultValueIsNotNull() {
            addCriterion("property.VALUE is not null");

            return this;
        } // end andPropertyDefaultValueIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDefaultValueIsNotEmpty() {
            addCriterion("property.VALUE is not null AND property.VALUE <> ''");

            return this;
        } // end andPropertyDefaultValueIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDefaultValueIsEmpty() {
            addCriterion("(property.VALUE is null OR property.VALUE = '')");

            return this;
        } // end andPropertyDefaultValueIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDefaultValueEqualTo(String value) {
            addCriterion("property.VALUE =", value, "propertyDefaultValue");

            return this;
        } // end andPropertyDefaultValueEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDefaultValueEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.VALUE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyDefaultValueEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDefaultValueNotEqualTo(String value) {
            addCriterion("property.VALUE <>", value, "propertyDefaultValue");

            return this;
        } // end andPropertyDefaultValueNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDefaultValueNotEqualToOrIsNull(String value) {
            addCriterion("property.VALUE is null OR property.VALUE <>", value,
                "propertyDefaultValue");

            return this;
        } // end andPropertyDefaultValueNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDefaultValueNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.VALUE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyDefaultValueNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDefaultValueGreaterThan(String value) {
            addCriterion("property.VALUE >", value, "propertyDefaultValue");

            return this;
        } // end andPropertyDefaultValueGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDefaultValueGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.VALUE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyDefaultValueGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDefaultValueGreaterThanOrEqualTo(
            String value) {
            addCriterion("property.VALUE >=", value, "propertyDefaultValue");

            return this;
        } // end andPropertyDefaultValueGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDefaultValueGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.VALUE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyDefaultValueGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDefaultValueLessThan(String value) {
            addCriterion("property.VALUE <", value, "propertyDefaultValue");

            return this;
        } // end andPropertyDefaultValueLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDefaultValueLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.VALUE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyDefaultValueLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDefaultValueLessThanOrEqualTo(String value) {
            addCriterion("property.VALUE <=", value, "propertyDefaultValue");

            return this;
        } // end andPropertyDefaultValueLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDefaultValueLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.VALUE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyDefaultValueLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDefaultValueLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("property.VALUE like", buffer.toString(),
                "propertyDefaultValue");

            return this;
        } // end andPropertyDefaultValueLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDefaultValueNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("property.VALUE not like", buffer.toString(),
                "propertyDefaultValue");

            return this;
        } // end andPropertyDefaultValueNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDefaultValueIn(List values) {
            if (values.size() == 1) {
                return andPropertyDefaultValueEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("property.VALUE in", values, "propertyDefaultValue");

                return this;
            } // end else
        } // end andPropertyDefaultValueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDefaultValueNotIn(List values) {
            if (values.size() == 1) {
                return andPropertyDefaultValueNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("property.VALUE not in", values,
                    "propertyDefaultValue");

                return this;
            } // end else
        } // end andPropertyDefaultValueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDefaultValueIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyDefaultValueEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("property.VALUE in", Arrays.asList(values),
                    "propertyDefaultValue");

                return this;
            } // end else
        } // end andPropertyDefaultValueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDefaultValueNotIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyDefaultValueNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("property.VALUE not in", Arrays.asList(values),
                    "propertyDefaultValue");

                return this;
            } // end else
        } // end andPropertyDefaultValueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDefaultValueBetween(String value1,
            String value2) {
            addCriterion("property.VALUE between", value1, value2,
                "propertyDefaultValue");

            return this;
        } // end andPropertyDefaultValueBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDefaultValueNotBetween(String value1,
            String value2) {
            addCriterion("property.VALUE not between", value1, value2,
                "propertyDefaultValue");

            return this;
        } // end andPropertyDefaultValueNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDescriptionIsNull() {
            addCriterion("property.DESCRIPTION is null");

            return this;
        } // end andPropertyDescriptionIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDescriptionIsNotNull() {
            addCriterion("property.DESCRIPTION is not null");

            return this;
        } // end andPropertyDescriptionIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDescriptionIsNotEmpty() {
            addCriterion(
                "property.DESCRIPTION is not null AND property.DESCRIPTION <> ''");

            return this;
        } // end andPropertyDescriptionIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDescriptionIsEmpty() {
            addCriterion(
                "(property.DESCRIPTION is null OR property.DESCRIPTION = '')");

            return this;
        } // end andPropertyDescriptionIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDescriptionEqualTo(String value) {
            addCriterion("property.DESCRIPTION =", value, "propertyDescription");

            return this;
        } // end andPropertyDescriptionEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDescriptionEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.DESCRIPTION");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyDescriptionEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDescriptionNotEqualTo(String value) {
            addCriterion("property.DESCRIPTION <>", value, "propertyDescription");

            return this;
        } // end andPropertyDescriptionNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDescriptionNotEqualToOrIsNull(String value) {
            addCriterion("property.DESCRIPTION is null OR property.DESCRIPTION <>",
                value, "propertyDescription");

            return this;
        } // end andPropertyDescriptionNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDescriptionNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.DESCRIPTION");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyDescriptionNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDescriptionGreaterThan(String value) {
            addCriterion("property.DESCRIPTION >", value, "propertyDescription");

            return this;
        } // end andPropertyDescriptionGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDescriptionGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.DESCRIPTION");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyDescriptionGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("property.DESCRIPTION >=", value, "propertyDescription");

            return this;
        } // end andPropertyDescriptionGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDescriptionGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.DESCRIPTION");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyDescriptionGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDescriptionLessThan(String value) {
            addCriterion("property.DESCRIPTION <", value, "propertyDescription");

            return this;
        } // end andPropertyDescriptionLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDescriptionLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.DESCRIPTION");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyDescriptionLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDescriptionLessThanOrEqualTo(String value) {
            addCriterion("property.DESCRIPTION <=", value, "propertyDescription");

            return this;
        } // end andPropertyDescriptionLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDescriptionLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.DESCRIPTION");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyDescriptionLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDescriptionLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("property.DESCRIPTION like", buffer.toString(),
                "propertyDescription");

            return this;
        } // end andPropertyDescriptionLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDescriptionNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("property.DESCRIPTION not like", buffer.toString(),
                "propertyDescription");

            return this;
        } // end andPropertyDescriptionNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDescriptionIn(List values) {
            if (values.size() == 1) {
                return andPropertyDescriptionEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("property.DESCRIPTION in", values,
                    "propertyDescription");

                return this;
            } // end else
        } // end andPropertyDescriptionIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDescriptionNotIn(List values) {
            if (values.size() == 1) {
                return andPropertyDescriptionNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("property.DESCRIPTION not in", values,
                    "propertyDescription");

                return this;
            } // end else
        } // end andPropertyDescriptionNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDescriptionIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyDescriptionEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("property.DESCRIPTION in", Arrays.asList(values),
                    "propertyDescription");

                return this;
            } // end else
        } // end andPropertyDescriptionIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDescriptionNotIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyDescriptionNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("property.DESCRIPTION not in",
                    Arrays.asList(values), "propertyDescription");

                return this;
            } // end else
        } // end andPropertyDescriptionNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDescriptionBetween(String value1,
            String value2) {
            addCriterion("property.DESCRIPTION between", value1, value2,
                "propertyDescription");

            return this;
        } // end andPropertyDescriptionBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyDescriptionNotBetween(String value1,
            String value2) {
            addCriterion("property.DESCRIPTION not between", value1, value2,
                "propertyDescription");

            return this;
        } // end andPropertyDescriptionNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsEnumIsNull() {
            addCriterion("property.IS_ENUM is null");

            return this;
        } // end andPropertyIsEnumIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsEnumIsNotNull() {
            addCriterion("property.IS_ENUM is not null");

            return this;
        } // end andPropertyIsEnumIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsEnumIsNotEmpty() {
            addCriterion(
                "property.IS_ENUM is not null AND property.IS_ENUM <> ''");

            return this;
        } // end andPropertyIsEnumIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsEnumIsEmpty() {
            addCriterion("(property.IS_ENUM is null OR property.IS_ENUM = '')");

            return this;
        } // end andPropertyIsEnumIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsEnumEqualTo(String value) {
            addCriterion("property.IS_ENUM =", value, "propertyIsEnum");

            return this;
        } // end andPropertyIsEnumEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsEnumEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("property.IS_ENUM");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyIsEnumEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsEnumNotEqualTo(String value) {
            addCriterion("property.IS_ENUM <>", value, "propertyIsEnum");

            return this;
        } // end andPropertyIsEnumNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsEnumNotEqualToOrIsNull(String value) {
            addCriterion("property.IS_ENUM is null OR property.IS_ENUM <>",
                value, "propertyIsEnum");

            return this;
        } // end andPropertyIsEnumNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsEnumNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.IS_ENUM");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyIsEnumNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsEnumGreaterThan(String value) {
            addCriterion("property.IS_ENUM >", value, "propertyIsEnum");

            return this;
        } // end andPropertyIsEnumGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsEnumGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.IS_ENUM");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyIsEnumGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsEnumGreaterThanOrEqualTo(String value) {
            addCriterion("property.IS_ENUM >=", value, "propertyIsEnum");

            return this;
        } // end andPropertyIsEnumGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsEnumGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.IS_ENUM");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyIsEnumGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsEnumLessThan(String value) {
            addCriterion("property.IS_ENUM <", value, "propertyIsEnum");

            return this;
        } // end andPropertyIsEnumLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsEnumLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.IS_ENUM");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyIsEnumLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsEnumLessThanOrEqualTo(String value) {
            addCriterion("property.IS_ENUM <=", value, "propertyIsEnum");

            return this;
        } // end andPropertyIsEnumLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsEnumLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.IS_ENUM");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyIsEnumLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsEnumLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("property.IS_ENUM like", buffer.toString(),
                "propertyIsEnum");

            return this;
        } // end andPropertyIsEnumLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsEnumNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("property.IS_ENUM not like", buffer.toString(),
                "propertyIsEnum");

            return this;
        } // end andPropertyIsEnumNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsEnumIn(List values) {
            if (values.size() == 1) {
                return andPropertyIsEnumEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("property.IS_ENUM in", values, "propertyIsEnum");

                return this;
            } // end else
        } // end andPropertyIsEnumIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsEnumNotIn(List values) {
            if (values.size() == 1) {
                return andPropertyIsEnumNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("property.IS_ENUM not in", values, "propertyIsEnum");

                return this;
            } // end else
        } // end andPropertyIsEnumNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsEnumIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyIsEnumEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("property.IS_ENUM in", Arrays.asList(values),
                    "propertyIsEnum");

                return this;
            } // end else
        } // end andPropertyIsEnumIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsEnumNotIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyIsEnumNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("property.IS_ENUM not in", Arrays.asList(values),
                    "propertyIsEnum");

                return this;
            } // end else
        } // end andPropertyIsEnumNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsEnumBetween(String value1, String value2) {
            addCriterion("property.IS_ENUM between", value1, value2,
                "propertyIsEnum");

            return this;
        } // end andPropertyIsEnumBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsEnumNotBetween(String value1, String value2) {
            addCriterion("property.IS_ENUM not between", value1, value2,
                "propertyIsEnum");

            return this;
        } // end andPropertyIsEnumNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsGenerateIsNull() {
            addCriterion("property.IS_GENERATE is null");

            return this;
        } // end andPropertyIsGenerateIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsGenerateIsNotNull() {
            addCriterion("property.IS_GENERATE is not null");

            return this;
        } // end andPropertyIsGenerateIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsGenerateIsNotEmpty() {
            addCriterion(
                "property.IS_GENERATE is not null AND property.IS_GENERATE <> ''");

            return this;
        } // end andPropertyIsGenerateIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsGenerateIsEmpty() {
            addCriterion(
                "(property.IS_GENERATE is null OR property.IS_GENERATE = '')");

            return this;
        } // end andPropertyIsGenerateIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsGenerateEqualTo(String value) {
            addCriterion("property.IS_GENERATE =", value, "propertyIsGenerate");

            return this;
        } // end andPropertyIsGenerateEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsGenerateEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.IS_GENERATE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyIsGenerateEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsGenerateNotEqualTo(String value) {
            addCriterion("property.IS_GENERATE <>", value, "propertyIsGenerate");

            return this;
        } // end andPropertyIsGenerateNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsGenerateNotEqualToOrIsNull(String value) {
            addCriterion("property.IS_GENERATE is null OR property.IS_GENERATE <>",
                value, "propertyIsGenerate");

            return this;
        } // end andPropertyIsGenerateNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsGenerateNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.IS_GENERATE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyIsGenerateNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsGenerateGreaterThan(String value) {
            addCriterion("property.IS_GENERATE >", value, "propertyIsGenerate");

            return this;
        } // end andPropertyIsGenerateGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsGenerateGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.IS_GENERATE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyIsGenerateGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsGenerateGreaterThanOrEqualTo(String value) {
            addCriterion("property.IS_GENERATE >=", value, "propertyIsGenerate");

            return this;
        } // end andPropertyIsGenerateGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsGenerateGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.IS_GENERATE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyIsGenerateGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsGenerateLessThan(String value) {
            addCriterion("property.IS_GENERATE <", value, "propertyIsGenerate");

            return this;
        } // end andPropertyIsGenerateLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsGenerateLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.IS_GENERATE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyIsGenerateLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsGenerateLessThanOrEqualTo(String value) {
            addCriterion("property.IS_GENERATE <=", value, "propertyIsGenerate");

            return this;
        } // end andPropertyIsGenerateLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsGenerateLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.IS_GENERATE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyIsGenerateLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsGenerateLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("property.IS_GENERATE like", buffer.toString(),
                "propertyIsGenerate");

            return this;
        } // end andPropertyIsGenerateLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsGenerateNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("property.IS_GENERATE not like", buffer.toString(),
                "propertyIsGenerate");

            return this;
        } // end andPropertyIsGenerateNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsGenerateIn(List values) {
            if (values.size() == 1) {
                return andPropertyIsGenerateEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("property.IS_GENERATE in", values,
                    "propertyIsGenerate");

                return this;
            } // end else
        } // end andPropertyIsGenerateIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsGenerateNotIn(List values) {
            if (values.size() == 1) {
                return andPropertyIsGenerateNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("property.IS_GENERATE not in", values,
                    "propertyIsGenerate");

                return this;
            } // end else
        } // end andPropertyIsGenerateNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsGenerateIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyIsGenerateEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("property.IS_GENERATE in", Arrays.asList(values),
                    "propertyIsGenerate");

                return this;
            } // end else
        } // end andPropertyIsGenerateIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsGenerateNotIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyIsGenerateNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("property.IS_GENERATE not in",
                    Arrays.asList(values), "propertyIsGenerate");

                return this;
            } // end else
        } // end andPropertyIsGenerateNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsGenerateBetween(String value1,
            String value2) {
            addCriterion("property.IS_GENERATE between", value1, value2,
                "propertyIsGenerate");

            return this;
        } // end andPropertyIsGenerateBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsGenerateNotBetween(String value1,
            String value2) {
            addCriterion("property.IS_GENERATE not between", value1, value2,
                "propertyIsGenerate");

            return this;
        } // end andPropertyIsGenerateNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsPrimaryPropertyIsNull() {
            addCriterion("property.IS_PRIMARY_PROPERTY is null");

            return this;
        } // end andPropertyIsPrimaryPropertyIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsPrimaryPropertyIsNotNull() {
            addCriterion("property.IS_PRIMARY_PROPERTY is not null");

            return this;
        } // end andPropertyIsPrimaryPropertyIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsPrimaryPropertyIsNotEmpty() {
            addCriterion(
                "property.IS_PRIMARY_PROPERTY is not null AND property.IS_PRIMARY_PROPERTY <> ''");

            return this;
        } // end andPropertyIsPrimaryPropertyIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsPrimaryPropertyIsEmpty() {
            addCriterion(
                "(property.IS_PRIMARY_PROPERTY is null OR property.IS_PRIMARY_PROPERTY = '')");

            return this;
        } // end andPropertyIsPrimaryPropertyIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsPrimaryPropertyEqualTo(String value) {
            addCriterion("property.IS_PRIMARY_PROPERTY =", value,
                "propertyIsPrimaryProperty");

            return this;
        } // end andPropertyIsPrimaryPropertyEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsPrimaryPropertyEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.IS_PRIMARY_PROPERTY");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyIsPrimaryPropertyEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsPrimaryPropertyNotEqualTo(String value) {
            addCriterion("property.IS_PRIMARY_PROPERTY <>", value,
                "propertyIsPrimaryProperty");

            return this;
        } // end andPropertyIsPrimaryPropertyNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsPrimaryPropertyNotEqualToOrIsNull(
            String value) {
            addCriterion("property.IS_PRIMARY_PROPERTY is null OR property.IS_PRIMARY_PROPERTY <>",
                value, "propertyIsPrimaryProperty");

            return this;
        } // end andPropertyIsPrimaryPropertyNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsPrimaryPropertyNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.IS_PRIMARY_PROPERTY");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyIsPrimaryPropertyNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsPrimaryPropertyGreaterThan(String value) {
            addCriterion("property.IS_PRIMARY_PROPERTY >", value,
                "propertyIsPrimaryProperty");

            return this;
        } // end andPropertyIsPrimaryPropertyGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsPrimaryPropertyGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.IS_PRIMARY_PROPERTY");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyIsPrimaryPropertyGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsPrimaryPropertyGreaterThanOrEqualTo(
            String value) {
            addCriterion("property.IS_PRIMARY_PROPERTY >=", value,
                "propertyIsPrimaryProperty");

            return this;
        } // end andPropertyIsPrimaryPropertyGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsPrimaryPropertyGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.IS_PRIMARY_PROPERTY");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyIsPrimaryPropertyGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsPrimaryPropertyLessThan(String value) {
            addCriterion("property.IS_PRIMARY_PROPERTY <", value,
                "propertyIsPrimaryProperty");

            return this;
        } // end andPropertyIsPrimaryPropertyLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsPrimaryPropertyLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.IS_PRIMARY_PROPERTY");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyIsPrimaryPropertyLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsPrimaryPropertyLessThanOrEqualTo(
            String value) {
            addCriterion("property.IS_PRIMARY_PROPERTY <=", value,
                "propertyIsPrimaryProperty");

            return this;
        } // end andPropertyIsPrimaryPropertyLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsPrimaryPropertyLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.IS_PRIMARY_PROPERTY");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyIsPrimaryPropertyLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsPrimaryPropertyLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("property.IS_PRIMARY_PROPERTY like",
                buffer.toString(), "propertyIsPrimaryProperty");

            return this;
        } // end andPropertyIsPrimaryPropertyLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsPrimaryPropertyNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("property.IS_PRIMARY_PROPERTY not like",
                buffer.toString(), "propertyIsPrimaryProperty");

            return this;
        } // end andPropertyIsPrimaryPropertyNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsPrimaryPropertyIn(List values) {
            if (values.size() == 1) {
                return andPropertyIsPrimaryPropertyEqualTo((String) values.get(
                        0));
            } // end if
            else {
                addCriterion("property.IS_PRIMARY_PROPERTY in", values,
                    "propertyIsPrimaryProperty");

                return this;
            } // end else
        } // end andPropertyIsPrimaryPropertyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsPrimaryPropertyNotIn(List values) {
            if (values.size() == 1) {
                return andPropertyIsPrimaryPropertyNotEqualTo((String) values.get(
                        0));
            } // end if
            else {
                addCriterion("property.IS_PRIMARY_PROPERTY not in", values,
                    "propertyIsPrimaryProperty");

                return this;
            } // end else
        } // end andPropertyIsPrimaryPropertyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsPrimaryPropertyIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyIsPrimaryPropertyEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("property.IS_PRIMARY_PROPERTY in",
                    Arrays.asList(values), "propertyIsPrimaryProperty");

                return this;
            } // end else
        } // end andPropertyIsPrimaryPropertyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsPrimaryPropertyNotIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyIsPrimaryPropertyNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("property.IS_PRIMARY_PROPERTY not in",
                    Arrays.asList(values), "propertyIsPrimaryProperty");

                return this;
            } // end else
        } // end andPropertyIsPrimaryPropertyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsPrimaryPropertyBetween(String value1,
            String value2) {
            addCriterion("property.IS_PRIMARY_PROPERTY between", value1,
                value2, "propertyIsPrimaryProperty");

            return this;
        } // end andPropertyIsPrimaryPropertyBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsPrimaryPropertyNotBetween(String value1,
            String value2) {
            addCriterion("property.IS_PRIMARY_PROPERTY not between", value1,
                value2, "propertyIsPrimaryProperty");

            return this;
        } // end andPropertyIsPrimaryPropertyNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyKindIsNull() {
            addCriterion("property.PROPERTY_KIND is null");

            return this;
        } // end andPropertyKindIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyKindIsNotNull() {
            addCriterion("property.PROPERTY_KIND is not null");

            return this;
        } // end andPropertyKindIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyKindIsNotEmpty() {
            addCriterion(
                "property.PROPERTY_KIND is not null AND property.PROPERTY_KIND <> ''");

            return this;
        } // end andPropertyKindIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyKindIsEmpty() {
            addCriterion(
                "(property.PROPERTY_KIND is null OR property.PROPERTY_KIND = '')");

            return this;
        } // end andPropertyKindIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyKindEqualTo(String value) {
            addCriterion("property.PROPERTY_KIND =", value, "propertyKind");

            return this;
        } // end andPropertyKindEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyKindEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("property.PROPERTY_KIND");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyKindEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyKindNotEqualTo(String value) {
            addCriterion("property.PROPERTY_KIND <>", value, "propertyKind");

            return this;
        } // end andPropertyKindNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyKindNotEqualToOrIsNull(String value) {
            addCriterion("property.PROPERTY_KIND is null OR property.PROPERTY_KIND <>",
                value, "propertyKind");

            return this;
        } // end andPropertyKindNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyKindNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.PROPERTY_KIND");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyKindNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyKindGreaterThan(String value) {
            addCriterion("property.PROPERTY_KIND >", value, "propertyKind");

            return this;
        } // end andPropertyKindGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyKindGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.PROPERTY_KIND");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyKindGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyKindGreaterThanOrEqualTo(String value) {
            addCriterion("property.PROPERTY_KIND >=", value, "propertyKind");

            return this;
        } // end andPropertyKindGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyKindGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.PROPERTY_KIND");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyKindGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyKindLessThan(String value) {
            addCriterion("property.PROPERTY_KIND <", value, "propertyKind");

            return this;
        } // end andPropertyKindLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyKindLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("property.PROPERTY_KIND");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyKindLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyKindLessThanOrEqualTo(String value) {
            addCriterion("property.PROPERTY_KIND <=", value, "propertyKind");

            return this;
        } // end andPropertyKindLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyKindLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.PROPERTY_KIND");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyKindLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyKindLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("property.PROPERTY_KIND like", buffer.toString(),
                "propertyKind");

            return this;
        } // end andPropertyKindLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyKindNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("property.PROPERTY_KIND not like", buffer.toString(),
                "propertyKind");

            return this;
        } // end andPropertyKindNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyKindIn(List values) {
            if (values.size() == 1) {
                return andPropertyKindEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("property.PROPERTY_KIND in", values, "propertyKind");

                return this;
            } // end else
        } // end andPropertyKindIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyKindNotIn(List values) {
            if (values.size() == 1) {
                return andPropertyKindNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("property.PROPERTY_KIND not in", values,
                    "propertyKind");

                return this;
            } // end else
        } // end andPropertyKindNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyKindIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyKindEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("property.PROPERTY_KIND in",
                    Arrays.asList(values), "propertyKind");

                return this;
            } // end else
        } // end andPropertyKindIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyKindNotIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyKindNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("property.PROPERTY_KIND not in",
                    Arrays.asList(values), "propertyKind");

                return this;
            } // end else
        } // end andPropertyKindNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyKindBetween(String value1, String value2) {
            addCriterion("property.PROPERTY_KIND between", value1, value2,
                "propertyKind");

            return this;
        } // end andPropertyKindBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyKindNotBetween(String value1, String value2) {
            addCriterion("property.PROPERTY_KIND not between", value1, value2,
                "propertyKind");

            return this;
        } // end andPropertyKindNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameIsNull() {
            addCriterion("property.NAME is null");

            return this;
        } // end andPropertyNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameIsNotNull() {
            addCriterion("property.NAME is not null");

            return this;
        } // end andPropertyNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameIsNotEmpty() {
            addCriterion("property.NAME is not null AND property.NAME <> ''");

            return this;
        } // end andPropertyNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameIsEmpty() {
            addCriterion("(property.NAME is null OR property.NAME = '')");

            return this;
        } // end andPropertyNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameEqualTo(String value) {
            addCriterion("property.NAME =", value, "propertyName");

            return this;
        } // end andPropertyNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("property.NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameNotEqualTo(String value) {
            addCriterion("property.NAME <>", value, "propertyName");

            return this;
        } // end andPropertyNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameNotEqualToOrIsNull(String value) {
            addCriterion("property.NAME is null OR property.NAME <>", value,
                "propertyName");

            return this;
        } // end andPropertyNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameGreaterThan(String value) {
            addCriterion("property.NAME >", value, "propertyName");

            return this;
        } // end andPropertyNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameGreaterThanOrEqualTo(String value) {
            addCriterion("property.NAME >=", value, "propertyName");

            return this;
        } // end andPropertyNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameLessThan(String value) {
            addCriterion("property.NAME <", value, "propertyName");

            return this;
        } // end andPropertyNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("property.NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameLessThanOrEqualTo(String value) {
            addCriterion("property.NAME <=", value, "propertyName");

            return this;
        } // end andPropertyNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("property.NAME like", buffer.toString(), "propertyName");

            return this;
        } // end andPropertyNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("property.NAME not like", buffer.toString(),
                "propertyName");

            return this;
        } // end andPropertyNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameIn(List values) {
            if (values.size() == 1) {
                return andPropertyNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("property.NAME in", values, "propertyName");

                return this;
            } // end else
        } // end andPropertyNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameNotIn(List values) {
            if (values.size() == 1) {
                return andPropertyNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("property.NAME not in", values, "propertyName");

                return this;
            } // end else
        } // end andPropertyNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("property.NAME in", Arrays.asList(values),
                    "propertyName");

                return this;
            } // end else
        } // end andPropertyNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("property.NAME not in", Arrays.asList(values),
                    "propertyName");

                return this;
            } // end else
        } // end andPropertyNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameBetween(String value1, String value2) {
            addCriterion("property.NAME between", value1, value2, "propertyName");

            return this;
        } // end andPropertyNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyNameNotBetween(String value1, String value2) {
            addCriterion("property.NAME not between", value1, value2,
                "propertyName");

            return this;
        } // end andPropertyNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyOrderIndexIsNull() {
            addCriterion("property.ORDER_INDEX is null");

            return this;
        } // end andPropertyOrderIndexIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyOrderIndexIsNotNull() {
            addCriterion("property.ORDER_INDEX is not null");

            return this;
        } // end andPropertyOrderIndexIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyOrderIndexIsNotEmpty() {
            addCriterion(
                "property.ORDER_INDEX is not null AND property.ORDER_INDEX <> ''");

            return this;
        } // end andPropertyOrderIndexIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyOrderIndexIsEmpty() {
            addCriterion(
                "(property.ORDER_INDEX is null OR property.ORDER_INDEX = '')");

            return this;
        } // end andPropertyOrderIndexIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyOrderIndexEqualTo(Integer value) {
            addCriterion("property.ORDER_INDEX =", value, "propertyOrderIndex");

            return this;
        } // end andPropertyOrderIndexEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyOrderIndexEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.ORDER_INDEX");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyOrderIndexEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyOrderIndexNotEqualTo(Integer value) {
            addCriterion("property.ORDER_INDEX <>", value, "propertyOrderIndex");

            return this;
        } // end andPropertyOrderIndexNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyOrderIndexNotEqualToOrIsNull(Integer value) {
            addCriterion("property.ORDER_INDEX is null OR property.ORDER_INDEX <>",
                value, "propertyOrderIndex");

            return this;
        } // end andPropertyOrderIndexNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyOrderIndexNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.ORDER_INDEX");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyOrderIndexNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyOrderIndexGreaterThan(Integer value) {
            addCriterion("property.ORDER_INDEX >", value, "propertyOrderIndex");

            return this;
        } // end andPropertyOrderIndexGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyOrderIndexGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.ORDER_INDEX");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyOrderIndexGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyOrderIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("property.ORDER_INDEX >=", value, "propertyOrderIndex");

            return this;
        } // end andPropertyOrderIndexGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyOrderIndexGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.ORDER_INDEX");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyOrderIndexGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyOrderIndexLessThan(Integer value) {
            addCriterion("property.ORDER_INDEX <", value, "propertyOrderIndex");

            return this;
        } // end andPropertyOrderIndexLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyOrderIndexLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.ORDER_INDEX");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyOrderIndexLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyOrderIndexLessThanOrEqualTo(Integer value) {
            addCriterion("property.ORDER_INDEX <=", value, "propertyOrderIndex");

            return this;
        } // end andPropertyOrderIndexLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyOrderIndexLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.ORDER_INDEX");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyOrderIndexLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyOrderIndexIn(List values) {
            if (values.size() == 1) {
                return andPropertyOrderIndexEqualTo((Integer) values.get(0));
            } // end if
            else {
                addCriterion("property.ORDER_INDEX in", values,
                    "propertyOrderIndex");

                return this;
            } // end else
        } // end andPropertyOrderIndexIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyOrderIndexNotIn(List values) {
            if (values.size() == 1) {
                return andPropertyOrderIndexNotEqualTo((Integer) values.get(0));
            } // end if
            else {
                addCriterion("property.ORDER_INDEX not in", values,
                    "propertyOrderIndex");

                return this;
            } // end else
        } // end andPropertyOrderIndexNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyOrderIndexIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyOrderIndexEqualTo((Integer) values[0]);
            } // end if
            else {
                addCriterion("property.ORDER_INDEX in", Arrays.asList(values),
                    "propertyOrderIndex");

                return this;
            } // end else
        } // end andPropertyOrderIndexIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyOrderIndexNotIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyOrderIndexNotEqualTo((Integer) values[0]);
            } // end if
            else {
                addCriterion("property.ORDER_INDEX not in",
                    Arrays.asList(values), "propertyOrderIndex");

                return this;
            } // end else
        } // end andPropertyOrderIndexNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyOrderIndexBetween(Integer value1,
            Integer value2) {
            addCriterion("property.ORDER_INDEX between", value1, value2,
                "propertyOrderIndex");

            return this;
        } // end andPropertyOrderIndexBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyOrderIndexNotBetween(Integer value1,
            Integer value2) {
            addCriterion("property.ORDER_INDEX not between", value1, value2,
                "propertyOrderIndex");

            return this;
        } // end andPropertyOrderIndexNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStateIsNull() {
            addCriterion("property.STATE is null");

            return this;
        } // end andPropertyStateIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStateIsNotNull() {
            addCriterion("property.STATE is not null");

            return this;
        } // end andPropertyStateIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStateIsNotEmpty() {
            addCriterion("property.STATE is not null AND property.STATE <> ''");

            return this;
        } // end andPropertyStateIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStateIsEmpty() {
            addCriterion("(property.STATE is null OR property.STATE = '')");

            return this;
        } // end andPropertyStateIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStateEqualTo(String value) {
            addCriterion("property.STATE =", value, "propertyState");

            return this;
        } // end andPropertyStateEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStateEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("property.STATE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyStateEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStateNotEqualTo(String value) {
            addCriterion("property.STATE <>", value, "propertyState");

            return this;
        } // end andPropertyStateNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStateNotEqualToOrIsNull(String value) {
            addCriterion("property.STATE is null OR property.STATE <>", value,
                "propertyState");

            return this;
        } // end andPropertyStateNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStateNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.STATE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyStateNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStateGreaterThan(String value) {
            addCriterion("property.STATE >", value, "propertyState");

            return this;
        } // end andPropertyStateGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStateGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.STATE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyStateGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStateGreaterThanOrEqualTo(String value) {
            addCriterion("property.STATE >=", value, "propertyState");

            return this;
        } // end andPropertyStateGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStateGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.STATE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyStateGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStateLessThan(String value) {
            addCriterion("property.STATE <", value, "propertyState");

            return this;
        } // end andPropertyStateLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStateLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("property.STATE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyStateLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStateLessThanOrEqualTo(String value) {
            addCriterion("property.STATE <=", value, "propertyState");

            return this;
        } // end andPropertyStateLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStateLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.STATE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyStateLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStateLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("property.STATE like", buffer.toString(),
                "propertyState");

            return this;
        } // end andPropertyStateLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStateNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("property.STATE not like", buffer.toString(),
                "propertyState");

            return this;
        } // end andPropertyStateNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStateIn(List values) {
            if (values.size() == 1) {
                return andPropertyStateEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("property.STATE in", values, "propertyState");

                return this;
            } // end else
        } // end andPropertyStateIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStateNotIn(List values) {
            if (values.size() == 1) {
                return andPropertyStateNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("property.STATE not in", values, "propertyState");

                return this;
            } // end else
        } // end andPropertyStateNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStateIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyStateEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("property.STATE in", Arrays.asList(values),
                    "propertyState");

                return this;
            } // end else
        } // end andPropertyStateIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStateNotIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyStateNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("property.STATE not in", Arrays.asList(values),
                    "propertyState");

                return this;
            } // end else
        } // end andPropertyStateNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStateBetween(String value1, String value2) {
            addCriterion("property.STATE between", value1, value2,
                "propertyState");

            return this;
        } // end andPropertyStateBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyStateNotBetween(String value1, String value2) {
            addCriterion("property.STATE not between", value1, value2,
                "propertyState");

            return this;
        } // end andPropertyStateNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyTypeIsNull() {
            addCriterion("property.TYPE is null");

            return this;
        } // end andPropertyTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyTypeIsNotNull() {
            addCriterion("property.TYPE is not null");

            return this;
        } // end andPropertyTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyTypeIsNotEmpty() {
            addCriterion("property.TYPE is not null AND property.TYPE <> ''");

            return this;
        } // end andPropertyTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyTypeIsEmpty() {
            addCriterion("(property.TYPE is null OR property.TYPE = '')");

            return this;
        } // end andPropertyTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyTypeEqualTo(String value) {
            addCriterion("property.TYPE =", value, "propertyType");

            return this;
        } // end andPropertyTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyTypeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("property.TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyTypeNotEqualTo(String value) {
            addCriterion("property.TYPE <>", value, "propertyType");

            return this;
        } // end andPropertyTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyTypeNotEqualToOrIsNull(String value) {
            addCriterion("property.TYPE is null OR property.TYPE <>", value,
                "propertyType");

            return this;
        } // end andPropertyTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyTypeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyTypeGreaterThan(String value) {
            addCriterion("property.TYPE >", value, "propertyType");

            return this;
        } // end andPropertyTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyTypeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("property.TYPE >=", value, "propertyType");

            return this;
        } // end andPropertyTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyTypeLessThan(String value) {
            addCriterion("property.TYPE <", value, "propertyType");

            return this;
        } // end andPropertyTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyTypeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("property.TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyTypeLessThanOrEqualTo(String value) {
            addCriterion("property.TYPE <=", value, "propertyType");

            return this;
        } // end andPropertyTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("property.TYPE like", buffer.toString(), "propertyType");

            return this;
        } // end andPropertyTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("property.TYPE not like", buffer.toString(),
                "propertyType");

            return this;
        } // end andPropertyTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyTypeIn(List values) {
            if (values.size() == 1) {
                return andPropertyTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("property.TYPE in", values, "propertyType");

                return this;
            } // end else
        } // end andPropertyTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyTypeNotIn(List values) {
            if (values.size() == 1) {
                return andPropertyTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("property.TYPE not in", values, "propertyType");

                return this;
            } // end else
        } // end andPropertyTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyTypeIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("property.TYPE in", Arrays.asList(values),
                    "propertyType");

                return this;
            } // end else
        } // end andPropertyTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("property.TYPE not in", Arrays.asList(values),
                    "propertyType");

                return this;
            } // end else
        } // end andPropertyTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyTypeBetween(String value1, String value2) {
            addCriterion("property.TYPE between", value1, value2, "propertyType");

            return this;
        } // end andPropertyTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyTypeNotBetween(String value1, String value2) {
            addCriterion("property.TYPE not between", value1, value2,
                "propertyType");

            return this;
        } // end andPropertyTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationIsNull() {
            addCriterion("OBJECT_ACTION.OPERATION is null");

            return this;
        } // end andOperationIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationIsNotNull() {
            addCriterion("OBJECT_ACTION.OPERATION is not null");

            return this;
        } // end andOperationIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationIsNotEmpty() {
            addCriterion(
                "OBJECT_ACTION.OPERATION is not null AND OBJECT_ACTION.OPERATION <> ''");

            return this;
        } // end andOperationIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationIsEmpty() {
            addCriterion(
                "(OBJECT_ACTION.OPERATION is null OR OBJECT_ACTION.OPERATION = '')");

            return this;
        } // end andOperationIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationEqualTo(String value) {
            addCriterion("OBJECT_ACTION.OPERATION =", value, "operation");

            return this;
        } // end andOperationEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_ACTION.OPERATION");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOperationEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationNotEqualTo(String value) {
            addCriterion("OBJECT_ACTION.OPERATION <>", value, "operation");

            return this;
        } // end andOperationNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationNotEqualToOrIsNull(String value) {
            addCriterion("OBJECT_ACTION.OPERATION is null OR OBJECT_ACTION.OPERATION <>",
                value, "operation");

            return this;
        } // end andOperationNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_ACTION.OPERATION");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOperationNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationGreaterThan(String value) {
            addCriterion("OBJECT_ACTION.OPERATION >", value, "operation");

            return this;
        } // end andOperationGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_ACTION.OPERATION");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOperationGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECT_ACTION.OPERATION >=", value, "operation");

            return this;
        } // end andOperationGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_ACTION.OPERATION");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOperationGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationLessThan(String value) {
            addCriterion("OBJECT_ACTION.OPERATION <", value, "operation");

            return this;
        } // end andOperationLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_ACTION.OPERATION");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOperationLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationLessThanOrEqualTo(String value) {
            addCriterion("OBJECT_ACTION.OPERATION <=", value, "operation");

            return this;
        } // end andOperationLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_ACTION.OPERATION");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOperationLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_ACTION.OPERATION like", buffer.toString(),
                "operation");

            return this;
        } // end andOperationLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_ACTION.OPERATION not like", buffer.toString(),
                "operation");

            return this;
        } // end andOperationNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationIn(List values) {
            if (values.size() == 1) {
                return andOperationEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_ACTION.OPERATION in", values, "operation");

                return this;
            } // end else
        } // end andOperationIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationNotIn(List values) {
            if (values.size() == 1) {
                return andOperationNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_ACTION.OPERATION not in", values,
                    "operation");

                return this;
            } // end else
        } // end andOperationNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationIn(Object[] values) {
            if (values.length == 1) {
                return andOperationEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_ACTION.OPERATION in",
                    Arrays.asList(values), "operation");

                return this;
            } // end else
        } // end andOperationIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationNotIn(Object[] values) {
            if (values.length == 1) {
                return andOperationNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_ACTION.OPERATION not in",
                    Arrays.asList(values), "operation");

                return this;
            } // end else
        } // end andOperationNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationBetween(String value1, String value2) {
            addCriterion("OBJECT_ACTION.OPERATION between", value1, value2,
                "operation");

            return this;
        } // end andOperationBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOperationNotBetween(String value1, String value2) {
            addCriterion("OBJECT_ACTION.OPERATION not between", value1, value2,
                "operation");

            return this;
        } // end andOperationNotBetween()
    } // end Criteria
} // end BusinessObjectActionDAOQueryBean
