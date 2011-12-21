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
 * ObjectProperty query bean 2011-09-22 10:16:41
 *
 * @author Auto Gen
 */
public class ObjectPropertyDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new ObjectPropertyDAOQueryBean object.
     */
    public ObjectPropertyDAOQueryBean() {
        super();
    } // end ObjectPropertyDAOQueryBean()

    /**
     * Creates a new ObjectPropertyDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public ObjectPropertyDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end ObjectPropertyDAOQueryBean()

    /**
     * Creates a new ObjectPropertyDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public ObjectPropertyDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end ObjectPropertyDAOQueryBean()

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
    public void addObjectPropertyIdSelectProperty() {
        addObjectPropertyIdSelectProperty("objectPropertyId");
    } // end addObjectPropertyIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addObjectPropertyIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectPropertyDAO.ObjectPropertyId, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectPropertyDAO.ObjectPropertyId,
                "objectPropertyId");
        } // end else
    } // end addObjectPropertyIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addDataSizeSelectProperty() {
        addDataSizeSelectProperty("dataSize");
    } // end addDataSizeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addDataSizeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectPropertyDAO.DataSize, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectPropertyDAO.DataSize, "dataSize");
        } // end else
    } // end addDataSizeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addDataTypeSelectProperty() {
        addDataTypeSelectProperty("dataType");
    } // end addDataTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addDataTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectPropertyDAO.DataType, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectPropertyDAO.DataType, "dataType");
        } // end else
    } // end addDataTypeSelectProperty()

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
            addSelectProperty(IObjectPropertyDAO.Description, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectPropertyDAO.Description, "description");
        } // end else
    } // end addDescriptionSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addIsEnumSelectProperty() {
        addIsEnumSelectProperty("isEnum");
    } // end addIsEnumSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addIsEnumSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectPropertyDAO.IsEnum, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectPropertyDAO.IsEnum, "isEnum");
        } // end else
    } // end addIsEnumSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addIsGenerateSelectProperty() {
        addIsGenerateSelectProperty("isGenerate");
    } // end addIsGenerateSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addIsGenerateSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectPropertyDAO.IsGenerate, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectPropertyDAO.IsGenerate, "isGenerate");
        } // end else
    } // end addIsGenerateSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addIsPrimaryPropertySelectProperty() {
        addIsPrimaryPropertySelectProperty("isPrimaryProperty");
    } // end addIsPrimaryPropertySelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addIsPrimaryPropertySelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectPropertyDAO.IsPrimaryProperty, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectPropertyDAO.IsPrimaryProperty,
                "isPrimaryProperty");
        } // end else
    } // end addIsPrimaryPropertySelectProperty()

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
            addSelectProperty(IObjectPropertyDAO.Name, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectPropertyDAO.Name, "name");
        } // end else
    } // end addNameSelectProperty()

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
            addSelectProperty(IObjectPropertyDAO.ObjectId, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectPropertyDAO.ObjectId, "objectId");
        } // end else
    } // end addObjectIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addOrderIndexSelectProperty() {
        addOrderIndexSelectProperty("orderIndex");
    } // end addOrderIndexSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addOrderIndexSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectPropertyDAO.OrderIndex, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectPropertyDAO.OrderIndex, "orderIndex");
        } // end else
    } // end addOrderIndexSelectProperty()

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
            addSelectProperty(IObjectPropertyDAO.PropertyKind, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectPropertyDAO.PropertyKind, "propertyKind");
        } // end else
    } // end addPropertyKindSelectProperty()

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
            addSelectProperty(IObjectPropertyDAO.State, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectPropertyDAO.State, "state");
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
            addSelectProperty(IObjectPropertyDAO.Type, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectPropertyDAO.Type, "type");
        } // end else
    } // end addTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addValueSelectProperty() {
        addValueSelectProperty("value");
    } // end addValueSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addValueSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectPropertyDAO.Value, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectPropertyDAO.Value, "value");
        } // end else
    } // end addValueSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addIsUniqueSelectProperty() {
        addIsUniqueSelectProperty("isUnique");
    } // end addIsUniqueSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addIsUniqueSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectPropertyDAO.IsUnique, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectPropertyDAO.IsUnique, "isUnique");
        } // end else
    } // end addIsUniqueSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addObjectNameSelectProperty() {
        addObjectNameSelectProperty("objectName");
    } // end addObjectNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addObjectNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectPropertyDAO.ObjectName, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectPropertyDAO.ObjectName, "objectName");
        } // end else
    } // end addObjectNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addIsAllowNullSelectProperty() {
        addIsAllowNullSelectProperty("isAllowNull");
    } // end addIsAllowNullSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addIsAllowNullSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectPropertyDAO.IsAllowNull, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectPropertyDAO.IsAllowNull, "isAllowNull");
        } // end else
    } // end addIsAllowNullSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addPrecisionSizeSelectProperty() {
        addPrecisionSizeSelectProperty("precisionSize");
    } // end addPrecisionSizeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addPrecisionSizeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectPropertyDAO.PrecisionSize, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectPropertyDAO.PrecisionSize, "precisionSize");
        } // end else
    } // end addPrecisionSizeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addIsReadableSelectProperty() {
        addIsReadableSelectProperty("isReadable");
    } // end addIsReadableSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addIsReadableSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectPropertyDAO.IsReadable, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectPropertyDAO.IsReadable, "isReadable");
        } // end else
    } // end addIsReadableSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addIsWritableSelectProperty() {
        addIsWritableSelectProperty("isWritable");
    } // end addIsWritableSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addIsWritableSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectPropertyDAO.IsWritable, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectPropertyDAO.IsWritable, "isWritable");
        } // end else
    } // end addIsWritableSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addIsArraySelectProperty() {
        addIsArraySelectProperty("isArray");
    } // end addIsArraySelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addIsArraySelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectPropertyDAO.IsArray, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectPropertyDAO.IsArray, "isArray");
        } // end else
    } // end addIsArraySelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addReferenceObjectIdSelectProperty() {
        addReferenceObjectIdSelectProperty("referenceObjectId");
    } // end addReferenceObjectIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addReferenceObjectIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectPropertyDAO.ReferenceObjectId, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectPropertyDAO.ReferenceObjectId,
                "referenceObjectId");
        } // end else
    } // end addReferenceObjectIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addObjectPropertyIdSelectProperty();

        addDataSizeSelectProperty();

        addDataTypeSelectProperty();

        addDescriptionSelectProperty();

        addIsEnumSelectProperty();

        addIsGenerateSelectProperty();

        addIsPrimaryPropertySelectProperty();

        addNameSelectProperty();

        addObjectIdSelectProperty();

        addOrderIndexSelectProperty();

        addPropertyKindSelectProperty();

        addStateSelectProperty();

        addTypeSelectProperty();

        addValueSelectProperty();

        addIsUniqueSelectProperty();

        addObjectNameSelectProperty();

        addIsAllowNullSelectProperty();

        addPrecisionSizeSelectProperty();

        addIsReadableSelectProperty();

        addIsWritableSelectProperty();

        addIsArraySelectProperty();

        addReferenceObjectIdSelectProperty();
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
        public Criteria andObjectPropertyIdIsNull() {
            addCriterion("OBJECT_PROPERTY.OBJECT_PROPERTY is null");

            return this;
        } // end andObjectPropertyIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectPropertyIdIsNotNull() {
            addCriterion("OBJECT_PROPERTY.OBJECT_PROPERTY is not null");

            return this;
        } // end andObjectPropertyIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectPropertyIdIsNotEmpty() {
            addCriterion(
                "OBJECT_PROPERTY.OBJECT_PROPERTY is not null AND OBJECT_PROPERTY.OBJECT_PROPERTY <> ''");

            return this;
        } // end andObjectPropertyIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectPropertyIdIsEmpty() {
            addCriterion(
                "(OBJECT_PROPERTY.OBJECT_PROPERTY is null OR OBJECT_PROPERTY.OBJECT_PROPERTY = '')");

            return this;
        } // end andObjectPropertyIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectPropertyIdEqualTo(long value) {
            return andObjectPropertyIdEqualTo(Long.valueOf(value));
        } // end andObjectPropertyIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectPropertyIdEqualTo(java.lang.Long value) {
            addCriterion("OBJECT_PROPERTY.OBJECT_PROPERTY =", value,
                "objectPropertyId");

            return this;
        } // end andObjectPropertyIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectPropertyIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_PROPERTY.OBJECT_PROPERTY");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectPropertyIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectPropertyIdNotEqualTo(long value) {
            return andObjectPropertyIdNotEqualTo(Long.valueOf(value));
        } // end andObjectPropertyIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectPropertyIdNotEqualTo(java.lang.Long value) {
            addCriterion("OBJECT_PROPERTY.OBJECT_PROPERTY <>", value,
                "objectPropertyId");

            return this;
        } // end andObjectPropertyIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectPropertyIdNotEqualToOrIsNull(long value) {
            return andObjectPropertyIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andObjectPropertyIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectPropertyIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("OBJECT_PROPERTY.OBJECT_PROPERTY is null OR OBJECT_PROPERTY.OBJECT_PROPERTY <>",
                value, "objectPropertyId");

            return this;
        } // end andObjectPropertyIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectPropertyIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_PROPERTY.OBJECT_PROPERTY");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectPropertyIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectPropertyIdGreaterThan(long value) {
            return andObjectPropertyIdGreaterThan(Long.valueOf(value));
        } // end andObjectPropertyIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectPropertyIdGreaterThan(java.lang.Long value) {
            addCriterion("OBJECT_PROPERTY.OBJECT_PROPERTY >", value,
                "objectPropertyId");

            return this;
        } // end andObjectPropertyIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectPropertyIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_PROPERTY.OBJECT_PROPERTY");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectPropertyIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectPropertyIdGreaterThanOrEqualTo(long value) {
            return andObjectPropertyIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andObjectPropertyIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectPropertyIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("OBJECT_PROPERTY.OBJECT_PROPERTY >=", value,
                "objectPropertyId");

            return this;
        } // end andObjectPropertyIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectPropertyIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_PROPERTY.OBJECT_PROPERTY");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectPropertyIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectPropertyIdLessThan(long value) {
            return andObjectPropertyIdLessThan(Long.valueOf(value));
        } // end andObjectPropertyIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectPropertyIdLessThan(java.lang.Long value) {
            addCriterion("OBJECT_PROPERTY.OBJECT_PROPERTY <", value,
                "objectPropertyId");

            return this;
        } // end andObjectPropertyIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectPropertyIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_PROPERTY.OBJECT_PROPERTY");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectPropertyIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectPropertyIdLessThanOrEqualTo(long value) {
            return andObjectPropertyIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andObjectPropertyIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectPropertyIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("OBJECT_PROPERTY.OBJECT_PROPERTY <=", value,
                "objectPropertyId");

            return this;
        } // end andObjectPropertyIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectPropertyIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_PROPERTY.OBJECT_PROPERTY");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectPropertyIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectPropertyIdIn(long[] values) {
            if (values.length == 1) {
                return andObjectPropertyIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.OBJECT_PROPERTY in", values,
                    "objectPropertyId");

                return this;
            } // end else
        } // end andObjectPropertyIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectPropertyIdNotIn(long[] values) {
            if (values.length == 1) {
                return andObjectPropertyIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.OBJECT_PROPERTY not in", values,
                    "objectPropertyId");

                return this;
            } // end else
        } // end andObjectPropertyIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectPropertyIdIn(List values) {
            if (values.size() == 1) {
                return andObjectPropertyIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.OBJECT_PROPERTY in", values,
                    "objectPropertyId");

                return this;
            } // end else
        } // end andObjectPropertyIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectPropertyIdNotIn(List values) {
            if (values.size() == 1) {
                return andObjectPropertyIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.OBJECT_PROPERTY not in", values,
                    "objectPropertyId");

                return this;
            } // end else
        } // end andObjectPropertyIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectPropertyIdIn(Object[] values) {
            if (values.length == 1) {
                return andObjectPropertyIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.OBJECT_PROPERTY in",
                    Arrays.asList(values), "objectPropertyId");

                return this;
            } // end else
        } // end andObjectPropertyIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectPropertyIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andObjectPropertyIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.OBJECT_PROPERTY not in",
                    Arrays.asList(values), "objectPropertyId");

                return this;
            } // end else
        } // end andObjectPropertyIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectPropertyIdBetween(long value1, long value2) {
            addCriterion("OBJECT_PROPERTY.OBJECT_PROPERTY between", value1,
                value2, "objectPropertyId");

            return this;
        } // end andObjectPropertyIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectPropertyIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("OBJECT_PROPERTY.OBJECT_PROPERTY between", value1,
                value2, "objectPropertyId");

            return this;
        } // end andObjectPropertyIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectPropertyIdNotBetween(long value1, long value2) {
            addCriterion("OBJECT_PROPERTY.OBJECT_PROPERTY not between", value1,
                value2, "objectPropertyId");

            return this;
        } // end andObjectPropertyIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectPropertyIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("OBJECT_PROPERTY.OBJECT_PROPERTY not between", value1,
                value2, "objectPropertyId");

            return this;
        } // end andObjectPropertyIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataSizeIsNull() {
            addCriterion("OBJECT_PROPERTY.DATA_SIZE is null");

            return this;
        } // end andDataSizeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataSizeIsNotNull() {
            addCriterion("OBJECT_PROPERTY.DATA_SIZE is not null");

            return this;
        } // end andDataSizeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataSizeIsNotEmpty() {
            addCriterion(
                "OBJECT_PROPERTY.DATA_SIZE is not null AND OBJECT_PROPERTY.DATA_SIZE <> ''");

            return this;
        } // end andDataSizeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataSizeIsEmpty() {
            addCriterion(
                "(OBJECT_PROPERTY.DATA_SIZE is null OR OBJECT_PROPERTY.DATA_SIZE = '')");

            return this;
        } // end andDataSizeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataSizeEqualTo(Integer value) {
            addCriterion("OBJECT_PROPERTY.DATA_SIZE =", value, "dataSize");

            return this;
        } // end andDataSizeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataSizeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.DATA_SIZE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDataSizeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataSizeNotEqualTo(Integer value) {
            addCriterion("OBJECT_PROPERTY.DATA_SIZE <>", value, "dataSize");

            return this;
        } // end andDataSizeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataSizeNotEqualToOrIsNull(Integer value) {
            addCriterion("OBJECT_PROPERTY.DATA_SIZE is null OR OBJECT_PROPERTY.DATA_SIZE <>",
                value, "dataSize");

            return this;
        } // end andDataSizeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataSizeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.DATA_SIZE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDataSizeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataSizeGreaterThan(Integer value) {
            addCriterion("OBJECT_PROPERTY.DATA_SIZE >", value, "dataSize");

            return this;
        } // end andDataSizeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataSizeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.DATA_SIZE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDataSizeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("OBJECT_PROPERTY.DATA_SIZE >=", value, "dataSize");

            return this;
        } // end andDataSizeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataSizeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.DATA_SIZE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDataSizeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataSizeLessThan(Integer value) {
            addCriterion("OBJECT_PROPERTY.DATA_SIZE <", value, "dataSize");

            return this;
        } // end andDataSizeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataSizeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.DATA_SIZE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDataSizeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataSizeLessThanOrEqualTo(Integer value) {
            addCriterion("OBJECT_PROPERTY.DATA_SIZE <=", value, "dataSize");

            return this;
        } // end andDataSizeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataSizeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.DATA_SIZE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDataSizeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataSizeIn(List values) {
            if (values.size() == 1) {
                return andDataSizeEqualTo((Integer) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.DATA_SIZE in", values, "dataSize");

                return this;
            } // end else
        } // end andDataSizeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataSizeNotIn(List values) {
            if (values.size() == 1) {
                return andDataSizeNotEqualTo((Integer) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.DATA_SIZE not in", values,
                    "dataSize");

                return this;
            } // end else
        } // end andDataSizeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataSizeIn(Object[] values) {
            if (values.length == 1) {
                return andDataSizeEqualTo((Integer) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.DATA_SIZE in",
                    Arrays.asList(values), "dataSize");

                return this;
            } // end else
        } // end andDataSizeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataSizeNotIn(Object[] values) {
            if (values.length == 1) {
                return andDataSizeNotEqualTo((Integer) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.DATA_SIZE not in",
                    Arrays.asList(values), "dataSize");

                return this;
            } // end else
        } // end andDataSizeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataSizeBetween(Integer value1, Integer value2) {
            addCriterion("OBJECT_PROPERTY.DATA_SIZE between", value1, value2,
                "dataSize");

            return this;
        } // end andDataSizeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("OBJECT_PROPERTY.DATA_SIZE not between", value1,
                value2, "dataSize");

            return this;
        } // end andDataSizeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeIsNull() {
            addCriterion("OBJECT_PROPERTY.DATA_TYPE is null");

            return this;
        } // end andDataTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeIsNotNull() {
            addCriterion("OBJECT_PROPERTY.DATA_TYPE is not null");

            return this;
        } // end andDataTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeIsNotEmpty() {
            addCriterion(
                "OBJECT_PROPERTY.DATA_TYPE is not null AND OBJECT_PROPERTY.DATA_TYPE <> ''");

            return this;
        } // end andDataTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeIsEmpty() {
            addCriterion(
                "(OBJECT_PROPERTY.DATA_TYPE is null OR OBJECT_PROPERTY.DATA_TYPE = '')");

            return this;
        } // end andDataTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.DATA_TYPE =", value, "dataType");

            return this;
        } // end andDataTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.DATA_TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDataTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeNotEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.DATA_TYPE <>", value, "dataType");

            return this;
        } // end andDataTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeNotEqualToOrIsNull(String value) {
            addCriterion("OBJECT_PROPERTY.DATA_TYPE is null OR OBJECT_PROPERTY.DATA_TYPE <>",
                value, "dataType");

            return this;
        } // end andDataTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.DATA_TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDataTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeGreaterThan(String value) {
            addCriterion("OBJECT_PROPERTY.DATA_TYPE >", value, "dataType");

            return this;
        } // end andDataTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.DATA_TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDataTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.DATA_TYPE >=", value, "dataType");

            return this;
        } // end andDataTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.DATA_TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDataTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeLessThan(String value) {
            addCriterion("OBJECT_PROPERTY.DATA_TYPE <", value, "dataType");

            return this;
        } // end andDataTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.DATA_TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDataTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeLessThanOrEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.DATA_TYPE <=", value, "dataType");

            return this;
        } // end andDataTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.DATA_TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andDataTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_PROPERTY.DATA_TYPE like", buffer.toString(),
                "dataType");

            return this;
        } // end andDataTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_PROPERTY.DATA_TYPE not like",
                buffer.toString(), "dataType");

            return this;
        } // end andDataTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeIn(List values) {
            if (values.size() == 1) {
                return andDataTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.DATA_TYPE in", values, "dataType");

                return this;
            } // end else
        } // end andDataTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeNotIn(List values) {
            if (values.size() == 1) {
                return andDataTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.DATA_TYPE not in", values,
                    "dataType");

                return this;
            } // end else
        } // end andDataTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeIn(Object[] values) {
            if (values.length == 1) {
                return andDataTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.DATA_TYPE in",
                    Arrays.asList(values), "dataType");

                return this;
            } // end else
        } // end andDataTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andDataTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.DATA_TYPE not in",
                    Arrays.asList(values), "dataType");

                return this;
            } // end else
        } // end andDataTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeBetween(String value1, String value2) {
            addCriterion("OBJECT_PROPERTY.DATA_TYPE between", value1, value2,
                "dataType");

            return this;
        } // end andDataTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDataTypeNotBetween(String value1, String value2) {
            addCriterion("OBJECT_PROPERTY.DATA_TYPE not between", value1,
                value2, "dataType");

            return this;
        } // end andDataTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNull() {
            addCriterion("OBJECT_PROPERTY.DESCRIPTION is null");

            return this;
        } // end andDescriptionIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNotNull() {
            addCriterion("OBJECT_PROPERTY.DESCRIPTION is not null");

            return this;
        } // end andDescriptionIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsNotEmpty() {
            addCriterion(
                "OBJECT_PROPERTY.DESCRIPTION is not null AND OBJECT_PROPERTY.DESCRIPTION <> ''");

            return this;
        } // end andDescriptionIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andDescriptionIsEmpty() {
            addCriterion(
                "(OBJECT_PROPERTY.DESCRIPTION is null OR OBJECT_PROPERTY.DESCRIPTION = '')");

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
            addCriterion("OBJECT_PROPERTY.DESCRIPTION =", value, "description");

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
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.DESCRIPTION");
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
            addCriterion("OBJECT_PROPERTY.DESCRIPTION <>", value, "description");

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
            addCriterion("OBJECT_PROPERTY.DESCRIPTION is null OR OBJECT_PROPERTY.DESCRIPTION <>",
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
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.DESCRIPTION");
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
            addCriterion("OBJECT_PROPERTY.DESCRIPTION >", value, "description");

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
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.DESCRIPTION");
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
            addCriterion("OBJECT_PROPERTY.DESCRIPTION >=", value, "description");

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
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.DESCRIPTION");
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
            addCriterion("OBJECT_PROPERTY.DESCRIPTION <", value, "description");

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
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.DESCRIPTION");
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
            addCriterion("OBJECT_PROPERTY.DESCRIPTION <=", value, "description");

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
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.DESCRIPTION");
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
            addCriterion("OBJECT_PROPERTY.DESCRIPTION like", buffer.toString(),
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
            addCriterion("OBJECT_PROPERTY.DESCRIPTION not like",
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
                addCriterion("OBJECT_PROPERTY.DESCRIPTION in", values,
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
                addCriterion("OBJECT_PROPERTY.DESCRIPTION not in", values,
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
                addCriterion("OBJECT_PROPERTY.DESCRIPTION in",
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
                addCriterion("OBJECT_PROPERTY.DESCRIPTION not in",
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
            addCriterion("OBJECT_PROPERTY.DESCRIPTION between", value1, value2,
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
            addCriterion("OBJECT_PROPERTY.DESCRIPTION not between", value1,
                value2, "description");

            return this;
        } // end andDescriptionNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsEnumIsNull() {
            addCriterion("OBJECT_PROPERTY.IS_ENUM is null");

            return this;
        } // end andIsEnumIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsEnumIsNotNull() {
            addCriterion("OBJECT_PROPERTY.IS_ENUM is not null");

            return this;
        } // end andIsEnumIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsEnumIsNotEmpty() {
            addCriterion(
                "OBJECT_PROPERTY.IS_ENUM is not null AND OBJECT_PROPERTY.IS_ENUM <> ''");

            return this;
        } // end andIsEnumIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsEnumIsEmpty() {
            addCriterion(
                "(OBJECT_PROPERTY.IS_ENUM is null OR OBJECT_PROPERTY.IS_ENUM = '')");

            return this;
        } // end andIsEnumIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsEnumEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.IS_ENUM =", value, "isEnum");

            return this;
        } // end andIsEnumEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsEnumEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_ENUM");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsEnumEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsEnumNotEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.IS_ENUM <>", value, "isEnum");

            return this;
        } // end andIsEnumNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsEnumNotEqualToOrIsNull(String value) {
            addCriterion("OBJECT_PROPERTY.IS_ENUM is null OR OBJECT_PROPERTY.IS_ENUM <>",
                value, "isEnum");

            return this;
        } // end andIsEnumNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsEnumNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_ENUM");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsEnumNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsEnumGreaterThan(String value) {
            addCriterion("OBJECT_PROPERTY.IS_ENUM >", value, "isEnum");

            return this;
        } // end andIsEnumGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsEnumGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_ENUM");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsEnumGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsEnumGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.IS_ENUM >=", value, "isEnum");

            return this;
        } // end andIsEnumGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsEnumGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_ENUM");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsEnumGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsEnumLessThan(String value) {
            addCriterion("OBJECT_PROPERTY.IS_ENUM <", value, "isEnum");

            return this;
        } // end andIsEnumLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsEnumLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_ENUM");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsEnumLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsEnumLessThanOrEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.IS_ENUM <=", value, "isEnum");

            return this;
        } // end andIsEnumLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsEnumLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_ENUM");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsEnumLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsEnumLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_PROPERTY.IS_ENUM like", buffer.toString(),
                "isEnum");

            return this;
        } // end andIsEnumLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsEnumNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_PROPERTY.IS_ENUM not like", buffer.toString(),
                "isEnum");

            return this;
        } // end andIsEnumNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsEnumIn(List values) {
            if (values.size() == 1) {
                return andIsEnumEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.IS_ENUM in", values, "isEnum");

                return this;
            } // end else
        } // end andIsEnumIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsEnumNotIn(List values) {
            if (values.size() == 1) {
                return andIsEnumNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.IS_ENUM not in", values, "isEnum");

                return this;
            } // end else
        } // end andIsEnumNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsEnumIn(Object[] values) {
            if (values.length == 1) {
                return andIsEnumEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.IS_ENUM in",
                    Arrays.asList(values), "isEnum");

                return this;
            } // end else
        } // end andIsEnumIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsEnumNotIn(Object[] values) {
            if (values.length == 1) {
                return andIsEnumNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.IS_ENUM not in",
                    Arrays.asList(values), "isEnum");

                return this;
            } // end else
        } // end andIsEnumNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsEnumBetween(String value1, String value2) {
            addCriterion("OBJECT_PROPERTY.IS_ENUM between", value1, value2,
                "isEnum");

            return this;
        } // end andIsEnumBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsEnumNotBetween(String value1, String value2) {
            addCriterion("OBJECT_PROPERTY.IS_ENUM not between", value1, value2,
                "isEnum");

            return this;
        } // end andIsEnumNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsGenerateIsNull() {
            addCriterion("OBJECT_PROPERTY.IS_GENERATE is null");

            return this;
        } // end andIsGenerateIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsGenerateIsNotNull() {
            addCriterion("OBJECT_PROPERTY.IS_GENERATE is not null");

            return this;
        } // end andIsGenerateIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsGenerateIsNotEmpty() {
            addCriterion(
                "OBJECT_PROPERTY.IS_GENERATE is not null AND OBJECT_PROPERTY.IS_GENERATE <> ''");

            return this;
        } // end andIsGenerateIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsGenerateIsEmpty() {
            addCriterion(
                "(OBJECT_PROPERTY.IS_GENERATE is null OR OBJECT_PROPERTY.IS_GENERATE = '')");

            return this;
        } // end andIsGenerateIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsGenerateEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.IS_GENERATE =", value, "isGenerate");

            return this;
        } // end andIsGenerateEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsGenerateEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_GENERATE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsGenerateEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsGenerateNotEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.IS_GENERATE <>", value, "isGenerate");

            return this;
        } // end andIsGenerateNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsGenerateNotEqualToOrIsNull(String value) {
            addCriterion("OBJECT_PROPERTY.IS_GENERATE is null OR OBJECT_PROPERTY.IS_GENERATE <>",
                value, "isGenerate");

            return this;
        } // end andIsGenerateNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsGenerateNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_GENERATE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsGenerateNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsGenerateGreaterThan(String value) {
            addCriterion("OBJECT_PROPERTY.IS_GENERATE >", value, "isGenerate");

            return this;
        } // end andIsGenerateGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsGenerateGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_GENERATE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsGenerateGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsGenerateGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.IS_GENERATE >=", value, "isGenerate");

            return this;
        } // end andIsGenerateGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsGenerateGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_GENERATE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsGenerateGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsGenerateLessThan(String value) {
            addCriterion("OBJECT_PROPERTY.IS_GENERATE <", value, "isGenerate");

            return this;
        } // end andIsGenerateLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsGenerateLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_GENERATE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsGenerateLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsGenerateLessThanOrEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.IS_GENERATE <=", value, "isGenerate");

            return this;
        } // end andIsGenerateLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsGenerateLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_GENERATE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsGenerateLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsGenerateLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_PROPERTY.IS_GENERATE like", buffer.toString(),
                "isGenerate");

            return this;
        } // end andIsGenerateLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsGenerateNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_PROPERTY.IS_GENERATE not like",
                buffer.toString(), "isGenerate");

            return this;
        } // end andIsGenerateNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsGenerateIn(List values) {
            if (values.size() == 1) {
                return andIsGenerateEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.IS_GENERATE in", values,
                    "isGenerate");

                return this;
            } // end else
        } // end andIsGenerateIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsGenerateNotIn(List values) {
            if (values.size() == 1) {
                return andIsGenerateNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.IS_GENERATE not in", values,
                    "isGenerate");

                return this;
            } // end else
        } // end andIsGenerateNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsGenerateIn(Object[] values) {
            if (values.length == 1) {
                return andIsGenerateEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.IS_GENERATE in",
                    Arrays.asList(values), "isGenerate");

                return this;
            } // end else
        } // end andIsGenerateIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsGenerateNotIn(Object[] values) {
            if (values.length == 1) {
                return andIsGenerateNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.IS_GENERATE not in",
                    Arrays.asList(values), "isGenerate");

                return this;
            } // end else
        } // end andIsGenerateNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsGenerateBetween(String value1, String value2) {
            addCriterion("OBJECT_PROPERTY.IS_GENERATE between", value1, value2,
                "isGenerate");

            return this;
        } // end andIsGenerateBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsGenerateNotBetween(String value1, String value2) {
            addCriterion("OBJECT_PROPERTY.IS_GENERATE not between", value1,
                value2, "isGenerate");

            return this;
        } // end andIsGenerateNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsPrimaryPropertyIsNull() {
            addCriterion("OBJECT_PROPERTY.IS_PRIMARY_PROPERTY is null");

            return this;
        } // end andIsPrimaryPropertyIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsPrimaryPropertyIsNotNull() {
            addCriterion("OBJECT_PROPERTY.IS_PRIMARY_PROPERTY is not null");

            return this;
        } // end andIsPrimaryPropertyIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsPrimaryPropertyIsNotEmpty() {
            addCriterion(
                "OBJECT_PROPERTY.IS_PRIMARY_PROPERTY is not null AND OBJECT_PROPERTY.IS_PRIMARY_PROPERTY <> ''");

            return this;
        } // end andIsPrimaryPropertyIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsPrimaryPropertyIsEmpty() {
            addCriterion(
                "(OBJECT_PROPERTY.IS_PRIMARY_PROPERTY is null OR OBJECT_PROPERTY.IS_PRIMARY_PROPERTY = '')");

            return this;
        } // end andIsPrimaryPropertyIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsPrimaryPropertyEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.IS_PRIMARY_PROPERTY =", value,
                "isPrimaryProperty");

            return this;
        } // end andIsPrimaryPropertyEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsPrimaryPropertyEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_PROPERTY.IS_PRIMARY_PROPERTY");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsPrimaryPropertyEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsPrimaryPropertyNotEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.IS_PRIMARY_PROPERTY <>", value,
                "isPrimaryProperty");

            return this;
        } // end andIsPrimaryPropertyNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsPrimaryPropertyNotEqualToOrIsNull(String value) {
            addCriterion("OBJECT_PROPERTY.IS_PRIMARY_PROPERTY is null OR OBJECT_PROPERTY.IS_PRIMARY_PROPERTY <>",
                value, "isPrimaryProperty");

            return this;
        } // end andIsPrimaryPropertyNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsPrimaryPropertyNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_PROPERTY.IS_PRIMARY_PROPERTY");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsPrimaryPropertyNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsPrimaryPropertyGreaterThan(String value) {
            addCriterion("OBJECT_PROPERTY.IS_PRIMARY_PROPERTY >", value,
                "isPrimaryProperty");

            return this;
        } // end andIsPrimaryPropertyGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsPrimaryPropertyGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_PROPERTY.IS_PRIMARY_PROPERTY");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsPrimaryPropertyGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsPrimaryPropertyGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.IS_PRIMARY_PROPERTY >=", value,
                "isPrimaryProperty");

            return this;
        } // end andIsPrimaryPropertyGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsPrimaryPropertyGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_PROPERTY.IS_PRIMARY_PROPERTY");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsPrimaryPropertyGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsPrimaryPropertyLessThan(String value) {
            addCriterion("OBJECT_PROPERTY.IS_PRIMARY_PROPERTY <", value,
                "isPrimaryProperty");

            return this;
        } // end andIsPrimaryPropertyLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsPrimaryPropertyLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_PROPERTY.IS_PRIMARY_PROPERTY");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsPrimaryPropertyLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsPrimaryPropertyLessThanOrEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.IS_PRIMARY_PROPERTY <=", value,
                "isPrimaryProperty");

            return this;
        } // end andIsPrimaryPropertyLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsPrimaryPropertyLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_PROPERTY.IS_PRIMARY_PROPERTY");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsPrimaryPropertyLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsPrimaryPropertyLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_PROPERTY.IS_PRIMARY_PROPERTY like",
                buffer.toString(), "isPrimaryProperty");

            return this;
        } // end andIsPrimaryPropertyLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsPrimaryPropertyNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_PROPERTY.IS_PRIMARY_PROPERTY not like",
                buffer.toString(), "isPrimaryProperty");

            return this;
        } // end andIsPrimaryPropertyNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsPrimaryPropertyIn(List values) {
            if (values.size() == 1) {
                return andIsPrimaryPropertyEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.IS_PRIMARY_PROPERTY in", values,
                    "isPrimaryProperty");

                return this;
            } // end else
        } // end andIsPrimaryPropertyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsPrimaryPropertyNotIn(List values) {
            if (values.size() == 1) {
                return andIsPrimaryPropertyNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.IS_PRIMARY_PROPERTY not in",
                    values, "isPrimaryProperty");

                return this;
            } // end else
        } // end andIsPrimaryPropertyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsPrimaryPropertyIn(Object[] values) {
            if (values.length == 1) {
                return andIsPrimaryPropertyEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.IS_PRIMARY_PROPERTY in",
                    Arrays.asList(values), "isPrimaryProperty");

                return this;
            } // end else
        } // end andIsPrimaryPropertyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsPrimaryPropertyNotIn(Object[] values) {
            if (values.length == 1) {
                return andIsPrimaryPropertyNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.IS_PRIMARY_PROPERTY not in",
                    Arrays.asList(values), "isPrimaryProperty");

                return this;
            } // end else
        } // end andIsPrimaryPropertyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsPrimaryPropertyBetween(String value1, String value2) {
            addCriterion("OBJECT_PROPERTY.IS_PRIMARY_PROPERTY between", value1,
                value2, "isPrimaryProperty");

            return this;
        } // end andIsPrimaryPropertyBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsPrimaryPropertyNotBetween(String value1,
            String value2) {
            addCriterion("OBJECT_PROPERTY.IS_PRIMARY_PROPERTY not between",
                value1, value2, "isPrimaryProperty");

            return this;
        } // end andIsPrimaryPropertyNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNull() {
            addCriterion("OBJECT_PROPERTY.NAME is null");

            return this;
        } // end andNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNotNull() {
            addCriterion("OBJECT_PROPERTY.NAME is not null");

            return this;
        } // end andNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsNotEmpty() {
            addCriterion(
                "OBJECT_PROPERTY.NAME is not null AND OBJECT_PROPERTY.NAME <> ''");

            return this;
        } // end andNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andNameIsEmpty() {
            addCriterion(
                "(OBJECT_PROPERTY.NAME is null OR OBJECT_PROPERTY.NAME = '')");

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
            addCriterion("OBJECT_PROPERTY.NAME =", value, "name");

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
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.NAME");
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
            addCriterion("OBJECT_PROPERTY.NAME <>", value, "name");

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
            addCriterion("OBJECT_PROPERTY.NAME is null OR OBJECT_PROPERTY.NAME <>",
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
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.NAME");
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
            addCriterion("OBJECT_PROPERTY.NAME >", value, "name");

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
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.NAME");
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
            addCriterion("OBJECT_PROPERTY.NAME >=", value, "name");

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
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.NAME");
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
            addCriterion("OBJECT_PROPERTY.NAME <", value, "name");

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
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.NAME");
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
            addCriterion("OBJECT_PROPERTY.NAME <=", value, "name");

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
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.NAME");
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
            addCriterion("OBJECT_PROPERTY.NAME like", buffer.toString(), "name");

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
            addCriterion("OBJECT_PROPERTY.NAME not like", buffer.toString(),
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
                addCriterion("OBJECT_PROPERTY.NAME in", values, "name");

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
                addCriterion("OBJECT_PROPERTY.NAME not in", values, "name");

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
                addCriterion("OBJECT_PROPERTY.NAME in", Arrays.asList(values),
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
                addCriterion("OBJECT_PROPERTY.NAME not in",
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
            addCriterion("OBJECT_PROPERTY.NAME between", value1, value2, "name");

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
            addCriterion("OBJECT_PROPERTY.NAME not between", value1, value2,
                "name");

            return this;
        } // end andNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdIsNull() {
            addCriterion("OBJECT_PROPERTY.OBJECT_ID is null");

            return this;
        } // end andObjectIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdIsNotNull() {
            addCriterion("OBJECT_PROPERTY.OBJECT_ID is not null");

            return this;
        } // end andObjectIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdIsNotEmpty() {
            addCriterion(
                "OBJECT_PROPERTY.OBJECT_ID is not null AND OBJECT_PROPERTY.OBJECT_ID <> ''");

            return this;
        } // end andObjectIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectIdIsEmpty() {
            addCriterion(
                "(OBJECT_PROPERTY.OBJECT_ID is null OR OBJECT_PROPERTY.OBJECT_ID = '')");

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
            addCriterion("OBJECT_PROPERTY.OBJECT_ID =", value, "objectId");

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
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.OBJECT_ID");
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
            addCriterion("OBJECT_PROPERTY.OBJECT_ID <>", value, "objectId");

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
            addCriterion("OBJECT_PROPERTY.OBJECT_ID is null OR OBJECT_PROPERTY.OBJECT_ID <>",
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
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.OBJECT_ID");
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
            addCriterion("OBJECT_PROPERTY.OBJECT_ID >", value, "objectId");

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
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.OBJECT_ID");
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
            addCriterion("OBJECT_PROPERTY.OBJECT_ID >=", value, "objectId");

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
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.OBJECT_ID");
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
            addCriterion("OBJECT_PROPERTY.OBJECT_ID <", value, "objectId");

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
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.OBJECT_ID");
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
            addCriterion("OBJECT_PROPERTY.OBJECT_ID <=", value, "objectId");

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
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.OBJECT_ID");
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
                addCriterion("OBJECT_PROPERTY.OBJECT_ID in", values, "objectId");

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
                addCriterion("OBJECT_PROPERTY.OBJECT_ID not in", values,
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
                addCriterion("OBJECT_PROPERTY.OBJECT_ID in", values, "objectId");

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
                addCriterion("OBJECT_PROPERTY.OBJECT_ID not in", values,
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
                addCriterion("OBJECT_PROPERTY.OBJECT_ID in",
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
                addCriterion("OBJECT_PROPERTY.OBJECT_ID not in",
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
            addCriterion("OBJECT_PROPERTY.OBJECT_ID between", value1, value2,
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
            addCriterion("OBJECT_PROPERTY.OBJECT_ID between", value1, value2,
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
            addCriterion("OBJECT_PROPERTY.OBJECT_ID not between", value1,
                value2, "objectId");

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
            addCriterion("OBJECT_PROPERTY.OBJECT_ID not between", value1,
                value2, "objectId");

            return this;
        } // end andObjectIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexIsNull() {
            addCriterion("OBJECT_PROPERTY.ORDER_INDEX is null");

            return this;
        } // end andOrderIndexIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexIsNotNull() {
            addCriterion("OBJECT_PROPERTY.ORDER_INDEX is not null");

            return this;
        } // end andOrderIndexIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexIsNotEmpty() {
            addCriterion(
                "OBJECT_PROPERTY.ORDER_INDEX is not null AND OBJECT_PROPERTY.ORDER_INDEX <> ''");

            return this;
        } // end andOrderIndexIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexIsEmpty() {
            addCriterion(
                "(OBJECT_PROPERTY.ORDER_INDEX is null OR OBJECT_PROPERTY.ORDER_INDEX = '')");

            return this;
        } // end andOrderIndexIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexEqualTo(Integer value) {
            addCriterion("OBJECT_PROPERTY.ORDER_INDEX =", value, "orderIndex");

            return this;
        } // end andOrderIndexEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.ORDER_INDEX");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOrderIndexEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexNotEqualTo(Integer value) {
            addCriterion("OBJECT_PROPERTY.ORDER_INDEX <>", value, "orderIndex");

            return this;
        } // end andOrderIndexNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexNotEqualToOrIsNull(Integer value) {
            addCriterion("OBJECT_PROPERTY.ORDER_INDEX is null OR OBJECT_PROPERTY.ORDER_INDEX <>",
                value, "orderIndex");

            return this;
        } // end andOrderIndexNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.ORDER_INDEX");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOrderIndexNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexGreaterThan(Integer value) {
            addCriterion("OBJECT_PROPERTY.ORDER_INDEX >", value, "orderIndex");

            return this;
        } // end andOrderIndexGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.ORDER_INDEX");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOrderIndexGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("OBJECT_PROPERTY.ORDER_INDEX >=", value, "orderIndex");

            return this;
        } // end andOrderIndexGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.ORDER_INDEX");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOrderIndexGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexLessThan(Integer value) {
            addCriterion("OBJECT_PROPERTY.ORDER_INDEX <", value, "orderIndex");

            return this;
        } // end andOrderIndexLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.ORDER_INDEX");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOrderIndexLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexLessThanOrEqualTo(Integer value) {
            addCriterion("OBJECT_PROPERTY.ORDER_INDEX <=", value, "orderIndex");

            return this;
        } // end andOrderIndexLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.ORDER_INDEX");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andOrderIndexLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexIn(List values) {
            if (values.size() == 1) {
                return andOrderIndexEqualTo((Integer) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.ORDER_INDEX in", values,
                    "orderIndex");

                return this;
            } // end else
        } // end andOrderIndexIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexNotIn(List values) {
            if (values.size() == 1) {
                return andOrderIndexNotEqualTo((Integer) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.ORDER_INDEX not in", values,
                    "orderIndex");

                return this;
            } // end else
        } // end andOrderIndexNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexIn(Object[] values) {
            if (values.length == 1) {
                return andOrderIndexEqualTo((Integer) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.ORDER_INDEX in",
                    Arrays.asList(values), "orderIndex");

                return this;
            } // end else
        } // end andOrderIndexIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexNotIn(Object[] values) {
            if (values.length == 1) {
                return andOrderIndexNotEqualTo((Integer) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.ORDER_INDEX not in",
                    Arrays.asList(values), "orderIndex");

                return this;
            } // end else
        } // end andOrderIndexNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexBetween(Integer value1, Integer value2) {
            addCriterion("OBJECT_PROPERTY.ORDER_INDEX between", value1, value2,
                "orderIndex");

            return this;
        } // end andOrderIndexBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andOrderIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("OBJECT_PROPERTY.ORDER_INDEX not between", value1,
                value2, "orderIndex");

            return this;
        } // end andOrderIndexNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyKindIsNull() {
            addCriterion("OBJECT_PROPERTY.PROPERTY_KIND is null");

            return this;
        } // end andPropertyKindIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyKindIsNotNull() {
            addCriterion("OBJECT_PROPERTY.PROPERTY_KIND is not null");

            return this;
        } // end andPropertyKindIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyKindIsNotEmpty() {
            addCriterion(
                "OBJECT_PROPERTY.PROPERTY_KIND is not null AND OBJECT_PROPERTY.PROPERTY_KIND <> ''");

            return this;
        } // end andPropertyKindIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyKindIsEmpty() {
            addCriterion(
                "(OBJECT_PROPERTY.PROPERTY_KIND is null OR OBJECT_PROPERTY.PROPERTY_KIND = '')");

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
            addCriterion("OBJECT_PROPERTY.PROPERTY_KIND =", value,
                "propertyKind");

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
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.PROPERTY_KIND");
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
            addCriterion("OBJECT_PROPERTY.PROPERTY_KIND <>", value,
                "propertyKind");

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
            addCriterion("OBJECT_PROPERTY.PROPERTY_KIND is null OR OBJECT_PROPERTY.PROPERTY_KIND <>",
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
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.PROPERTY_KIND");
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
            addCriterion("OBJECT_PROPERTY.PROPERTY_KIND >", value,
                "propertyKind");

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
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.PROPERTY_KIND");
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
            addCriterion("OBJECT_PROPERTY.PROPERTY_KIND >=", value,
                "propertyKind");

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
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.PROPERTY_KIND");
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
            addCriterion("OBJECT_PROPERTY.PROPERTY_KIND <", value,
                "propertyKind");

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
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.PROPERTY_KIND");
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
            addCriterion("OBJECT_PROPERTY.PROPERTY_KIND <=", value,
                "propertyKind");

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
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.PROPERTY_KIND");
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
            addCriterion("OBJECT_PROPERTY.PROPERTY_KIND like",
                buffer.toString(), "propertyKind");

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
            addCriterion("OBJECT_PROPERTY.PROPERTY_KIND not like",
                buffer.toString(), "propertyKind");

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
                addCriterion("OBJECT_PROPERTY.PROPERTY_KIND in", values,
                    "propertyKind");

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
                addCriterion("OBJECT_PROPERTY.PROPERTY_KIND not in", values,
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
                addCriterion("OBJECT_PROPERTY.PROPERTY_KIND in",
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
                addCriterion("OBJECT_PROPERTY.PROPERTY_KIND not in",
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
            addCriterion("OBJECT_PROPERTY.PROPERTY_KIND between", value1,
                value2, "propertyKind");

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
            addCriterion("OBJECT_PROPERTY.PROPERTY_KIND not between", value1,
                value2, "propertyKind");

            return this;
        } // end andPropertyKindNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateIsNull() {
            addCriterion("OBJECT_PROPERTY.STATE is null");

            return this;
        } // end andStateIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateIsNotNull() {
            addCriterion("OBJECT_PROPERTY.STATE is not null");

            return this;
        } // end andStateIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateIsNotEmpty() {
            addCriterion(
                "OBJECT_PROPERTY.STATE is not null AND OBJECT_PROPERTY.STATE <> ''");

            return this;
        } // end andStateIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andStateIsEmpty() {
            addCriterion(
                "(OBJECT_PROPERTY.STATE is null OR OBJECT_PROPERTY.STATE = '')");

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
            addCriterion("OBJECT_PROPERTY.STATE =", value, "state");

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
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.STATE");
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
            addCriterion("OBJECT_PROPERTY.STATE <>", value, "state");

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
            addCriterion("OBJECT_PROPERTY.STATE is null OR OBJECT_PROPERTY.STATE <>",
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
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.STATE");
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
            addCriterion("OBJECT_PROPERTY.STATE >", value, "state");

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
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.STATE");
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
            addCriterion("OBJECT_PROPERTY.STATE >=", value, "state");

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
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.STATE");
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
            addCriterion("OBJECT_PROPERTY.STATE <", value, "state");

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
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.STATE");
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
            addCriterion("OBJECT_PROPERTY.STATE <=", value, "state");

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
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.STATE");
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
            addCriterion("OBJECT_PROPERTY.STATE like", buffer.toString(),
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
            addCriterion("OBJECT_PROPERTY.STATE not like", buffer.toString(),
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
                addCriterion("OBJECT_PROPERTY.STATE in", values, "state");

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
                addCriterion("OBJECT_PROPERTY.STATE not in", values, "state");

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
                addCriterion("OBJECT_PROPERTY.STATE in", Arrays.asList(values),
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
                addCriterion("OBJECT_PROPERTY.STATE not in",
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
            addCriterion("OBJECT_PROPERTY.STATE between", value1, value2,
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
            addCriterion("OBJECT_PROPERTY.STATE not between", value1, value2,
                "state");

            return this;
        } // end andStateNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeIsNull() {
            addCriterion("OBJECT_PROPERTY.TYPE is null");

            return this;
        } // end andTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeIsNotNull() {
            addCriterion("OBJECT_PROPERTY.TYPE is not null");

            return this;
        } // end andTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeIsNotEmpty() {
            addCriterion(
                "OBJECT_PROPERTY.TYPE is not null AND OBJECT_PROPERTY.TYPE <> ''");

            return this;
        } // end andTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andTypeIsEmpty() {
            addCriterion(
                "(OBJECT_PROPERTY.TYPE is null OR OBJECT_PROPERTY.TYPE = '')");

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
            addCriterion("OBJECT_PROPERTY.TYPE =", value, "type");

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
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.TYPE");
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
            addCriterion("OBJECT_PROPERTY.TYPE <>", value, "type");

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
            addCriterion("OBJECT_PROPERTY.TYPE is null OR OBJECT_PROPERTY.TYPE <>",
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
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.TYPE");
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
            addCriterion("OBJECT_PROPERTY.TYPE >", value, "type");

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
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.TYPE");
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
            addCriterion("OBJECT_PROPERTY.TYPE >=", value, "type");

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
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.TYPE");
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
            addCriterion("OBJECT_PROPERTY.TYPE <", value, "type");

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
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.TYPE");
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
            addCriterion("OBJECT_PROPERTY.TYPE <=", value, "type");

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
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.TYPE");
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
            addCriterion("OBJECT_PROPERTY.TYPE like", buffer.toString(), "type");

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
            addCriterion("OBJECT_PROPERTY.TYPE not like", buffer.toString(),
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
                addCriterion("OBJECT_PROPERTY.TYPE in", values, "type");

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
                addCriterion("OBJECT_PROPERTY.TYPE not in", values, "type");

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
                addCriterion("OBJECT_PROPERTY.TYPE in", Arrays.asList(values),
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
                addCriterion("OBJECT_PROPERTY.TYPE not in",
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
            addCriterion("OBJECT_PROPERTY.TYPE between", value1, value2, "type");

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
            addCriterion("OBJECT_PROPERTY.TYPE not between", value1, value2,
                "type");

            return this;
        } // end andTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueIsNull() {
            addCriterion("OBJECT_PROPERTY.VALUE is null");

            return this;
        } // end andValueIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueIsNotNull() {
            addCriterion("OBJECT_PROPERTY.VALUE is not null");

            return this;
        } // end andValueIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueIsNotEmpty() {
            addCriterion(
                "OBJECT_PROPERTY.VALUE is not null AND OBJECT_PROPERTY.VALUE <> ''");

            return this;
        } // end andValueIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueIsEmpty() {
            addCriterion(
                "(OBJECT_PROPERTY.VALUE is null OR OBJECT_PROPERTY.VALUE = '')");

            return this;
        } // end andValueIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.VALUE =", value, "value");

            return this;
        } // end andValueEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.VALUE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValueEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueNotEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.VALUE <>", value, "value");

            return this;
        } // end andValueNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueNotEqualToOrIsNull(String value) {
            addCriterion("OBJECT_PROPERTY.VALUE is null OR OBJECT_PROPERTY.VALUE <>",
                value, "value");

            return this;
        } // end andValueNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.VALUE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValueNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueGreaterThan(String value) {
            addCriterion("OBJECT_PROPERTY.VALUE >", value, "value");

            return this;
        } // end andValueGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.VALUE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValueGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.VALUE >=", value, "value");

            return this;
        } // end andValueGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.VALUE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValueGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLessThan(String value) {
            addCriterion("OBJECT_PROPERTY.VALUE <", value, "value");

            return this;
        } // end andValueLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.VALUE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValueLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLessThanOrEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.VALUE <=", value, "value");

            return this;
        } // end andValueLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.VALUE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andValueLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_PROPERTY.VALUE like", buffer.toString(),
                "value");

            return this;
        } // end andValueLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_PROPERTY.VALUE not like", buffer.toString(),
                "value");

            return this;
        } // end andValueNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueIn(List values) {
            if (values.size() == 1) {
                return andValueEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.VALUE in", values, "value");

                return this;
            } // end else
        } // end andValueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueNotIn(List values) {
            if (values.size() == 1) {
                return andValueNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.VALUE not in", values, "value");

                return this;
            } // end else
        } // end andValueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueIn(Object[] values) {
            if (values.length == 1) {
                return andValueEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.VALUE in", Arrays.asList(values),
                    "value");

                return this;
            } // end else
        } // end andValueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueNotIn(Object[] values) {
            if (values.length == 1) {
                return andValueNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.VALUE not in",
                    Arrays.asList(values), "value");

                return this;
            } // end else
        } // end andValueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueBetween(String value1, String value2) {
            addCriterion("OBJECT_PROPERTY.VALUE between", value1, value2,
                "value");

            return this;
        } // end andValueBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andValueNotBetween(String value1, String value2) {
            addCriterion("OBJECT_PROPERTY.VALUE not between", value1, value2,
                "value");

            return this;
        } // end andValueNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsUniqueIsNull() {
            addCriterion("OBJECT_PROPERTY.IS_UNIQUE is null");

            return this;
        } // end andIsUniqueIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsUniqueIsNotNull() {
            addCriterion("OBJECT_PROPERTY.IS_UNIQUE is not null");

            return this;
        } // end andIsUniqueIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsUniqueIsNotEmpty() {
            addCriterion(
                "OBJECT_PROPERTY.IS_UNIQUE is not null AND OBJECT_PROPERTY.IS_UNIQUE <> ''");

            return this;
        } // end andIsUniqueIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsUniqueIsEmpty() {
            addCriterion(
                "(OBJECT_PROPERTY.IS_UNIQUE is null OR OBJECT_PROPERTY.IS_UNIQUE = '')");

            return this;
        } // end andIsUniqueIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsUniqueEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.IS_UNIQUE =", value, "isUnique");

            return this;
        } // end andIsUniqueEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsUniqueEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_UNIQUE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsUniqueEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsUniqueNotEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.IS_UNIQUE <>", value, "isUnique");

            return this;
        } // end andIsUniqueNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsUniqueNotEqualToOrIsNull(String value) {
            addCriterion("OBJECT_PROPERTY.IS_UNIQUE is null OR OBJECT_PROPERTY.IS_UNIQUE <>",
                value, "isUnique");

            return this;
        } // end andIsUniqueNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsUniqueNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_UNIQUE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsUniqueNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsUniqueGreaterThan(String value) {
            addCriterion("OBJECT_PROPERTY.IS_UNIQUE >", value, "isUnique");

            return this;
        } // end andIsUniqueGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsUniqueGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_UNIQUE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsUniqueGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsUniqueGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.IS_UNIQUE >=", value, "isUnique");

            return this;
        } // end andIsUniqueGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsUniqueGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_UNIQUE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsUniqueGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsUniqueLessThan(String value) {
            addCriterion("OBJECT_PROPERTY.IS_UNIQUE <", value, "isUnique");

            return this;
        } // end andIsUniqueLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsUniqueLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_UNIQUE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsUniqueLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsUniqueLessThanOrEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.IS_UNIQUE <=", value, "isUnique");

            return this;
        } // end andIsUniqueLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsUniqueLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_UNIQUE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsUniqueLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsUniqueLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_PROPERTY.IS_UNIQUE like", buffer.toString(),
                "isUnique");

            return this;
        } // end andIsUniqueLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsUniqueNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_PROPERTY.IS_UNIQUE not like",
                buffer.toString(), "isUnique");

            return this;
        } // end andIsUniqueNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsUniqueIn(List values) {
            if (values.size() == 1) {
                return andIsUniqueEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.IS_UNIQUE in", values, "isUnique");

                return this;
            } // end else
        } // end andIsUniqueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsUniqueNotIn(List values) {
            if (values.size() == 1) {
                return andIsUniqueNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.IS_UNIQUE not in", values,
                    "isUnique");

                return this;
            } // end else
        } // end andIsUniqueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsUniqueIn(Object[] values) {
            if (values.length == 1) {
                return andIsUniqueEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.IS_UNIQUE in",
                    Arrays.asList(values), "isUnique");

                return this;
            } // end else
        } // end andIsUniqueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsUniqueNotIn(Object[] values) {
            if (values.length == 1) {
                return andIsUniqueNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.IS_UNIQUE not in",
                    Arrays.asList(values), "isUnique");

                return this;
            } // end else
        } // end andIsUniqueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsUniqueBetween(String value1, String value2) {
            addCriterion("OBJECT_PROPERTY.IS_UNIQUE between", value1, value2,
                "isUnique");

            return this;
        } // end andIsUniqueBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsUniqueNotBetween(String value1, String value2) {
            addCriterion("OBJECT_PROPERTY.IS_UNIQUE not between", value1,
                value2, "isUnique");

            return this;
        } // end andIsUniqueNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectNameIsNull() {
            addCriterion("businessObject.NAME is null");

            return this;
        } // end andObjectNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectNameIsNotNull() {
            addCriterion("businessObject.NAME is not null");

            return this;
        } // end andObjectNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectNameIsNotEmpty() {
            addCriterion(
                "businessObject.NAME is not null AND businessObject.NAME <> ''");

            return this;
        } // end andObjectNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectNameIsEmpty() {
            addCriterion(
                "(businessObject.NAME is null OR businessObject.NAME = '')");

            return this;
        } // end andObjectNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectNameEqualTo(String value) {
            addCriterion("businessObject.NAME =", value, "objectName");

            return this;
        } // end andObjectNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectNameEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("businessObject.NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectNameNotEqualTo(String value) {
            addCriterion("businessObject.NAME <>", value, "objectName");

            return this;
        } // end andObjectNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectNameNotEqualToOrIsNull(String value) {
            addCriterion("businessObject.NAME is null OR businessObject.NAME <>",
                value, "objectName");

            return this;
        } // end andObjectNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectNameNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("businessObject.NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectNameGreaterThan(String value) {
            addCriterion("businessObject.NAME >", value, "objectName");

            return this;
        } // end andObjectNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectNameGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("businessObject.NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("businessObject.NAME >=", value, "objectName");

            return this;
        } // end andObjectNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("businessObject.NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectNameLessThan(String value) {
            addCriterion("businessObject.NAME <", value, "objectName");

            return this;
        } // end andObjectNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectNameLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("businessObject.NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectNameLessThanOrEqualTo(String value) {
            addCriterion("businessObject.NAME <=", value, "objectName");

            return this;
        } // end andObjectNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("businessObject.NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("businessObject.NAME like", buffer.toString(),
                "objectName");

            return this;
        } // end andObjectNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("businessObject.NAME not like", buffer.toString(),
                "objectName");

            return this;
        } // end andObjectNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectNameIn(List values) {
            if (values.size() == 1) {
                return andObjectNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("businessObject.NAME in", values, "objectName");

                return this;
            } // end else
        } // end andObjectNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectNameNotIn(List values) {
            if (values.size() == 1) {
                return andObjectNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("businessObject.NAME not in", values, "objectName");

                return this;
            } // end else
        } // end andObjectNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectNameIn(Object[] values) {
            if (values.length == 1) {
                return andObjectNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("businessObject.NAME in", Arrays.asList(values),
                    "objectName");

                return this;
            } // end else
        } // end andObjectNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andObjectNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("businessObject.NAME not in",
                    Arrays.asList(values), "objectName");

                return this;
            } // end else
        } // end andObjectNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectNameBetween(String value1, String value2) {
            addCriterion("businessObject.NAME between", value1, value2,
                "objectName");

            return this;
        } // end andObjectNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectNameNotBetween(String value1, String value2) {
            addCriterion("businessObject.NAME not between", value1, value2,
                "objectName");

            return this;
        } // end andObjectNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsAllowNullIsNull() {
            addCriterion("OBJECT_PROPERTY.IS_ALLOW_NULL is null");

            return this;
        } // end andIsAllowNullIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsAllowNullIsNotNull() {
            addCriterion("OBJECT_PROPERTY.IS_ALLOW_NULL is not null");

            return this;
        } // end andIsAllowNullIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsAllowNullIsNotEmpty() {
            addCriterion(
                "OBJECT_PROPERTY.IS_ALLOW_NULL is not null AND OBJECT_PROPERTY.IS_ALLOW_NULL <> ''");

            return this;
        } // end andIsAllowNullIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsAllowNullIsEmpty() {
            addCriterion(
                "(OBJECT_PROPERTY.IS_ALLOW_NULL is null OR OBJECT_PROPERTY.IS_ALLOW_NULL = '')");

            return this;
        } // end andIsAllowNullIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsAllowNullEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.IS_ALLOW_NULL =", value, "isAllowNull");

            return this;
        } // end andIsAllowNullEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsAllowNullEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_ALLOW_NULL");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsAllowNullEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsAllowNullNotEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.IS_ALLOW_NULL <>", value,
                "isAllowNull");

            return this;
        } // end andIsAllowNullNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsAllowNullNotEqualToOrIsNull(String value) {
            addCriterion("OBJECT_PROPERTY.IS_ALLOW_NULL is null OR OBJECT_PROPERTY.IS_ALLOW_NULL <>",
                value, "isAllowNull");

            return this;
        } // end andIsAllowNullNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsAllowNullNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_ALLOW_NULL");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsAllowNullNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsAllowNullGreaterThan(String value) {
            addCriterion("OBJECT_PROPERTY.IS_ALLOW_NULL >", value, "isAllowNull");

            return this;
        } // end andIsAllowNullGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsAllowNullGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_ALLOW_NULL");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsAllowNullGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsAllowNullGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.IS_ALLOW_NULL >=", value,
                "isAllowNull");

            return this;
        } // end andIsAllowNullGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsAllowNullGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_ALLOW_NULL");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsAllowNullGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsAllowNullLessThan(String value) {
            addCriterion("OBJECT_PROPERTY.IS_ALLOW_NULL <", value, "isAllowNull");

            return this;
        } // end andIsAllowNullLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsAllowNullLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_ALLOW_NULL");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsAllowNullLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsAllowNullLessThanOrEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.IS_ALLOW_NULL <=", value,
                "isAllowNull");

            return this;
        } // end andIsAllowNullLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsAllowNullLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_ALLOW_NULL");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsAllowNullLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsAllowNullLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_PROPERTY.IS_ALLOW_NULL like",
                buffer.toString(), "isAllowNull");

            return this;
        } // end andIsAllowNullLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsAllowNullNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_PROPERTY.IS_ALLOW_NULL not like",
                buffer.toString(), "isAllowNull");

            return this;
        } // end andIsAllowNullNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsAllowNullIn(List values) {
            if (values.size() == 1) {
                return andIsAllowNullEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.IS_ALLOW_NULL in", values,
                    "isAllowNull");

                return this;
            } // end else
        } // end andIsAllowNullIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsAllowNullNotIn(List values) {
            if (values.size() == 1) {
                return andIsAllowNullNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.IS_ALLOW_NULL not in", values,
                    "isAllowNull");

                return this;
            } // end else
        } // end andIsAllowNullNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsAllowNullIn(Object[] values) {
            if (values.length == 1) {
                return andIsAllowNullEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.IS_ALLOW_NULL in",
                    Arrays.asList(values), "isAllowNull");

                return this;
            } // end else
        } // end andIsAllowNullIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsAllowNullNotIn(Object[] values) {
            if (values.length == 1) {
                return andIsAllowNullNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.IS_ALLOW_NULL not in",
                    Arrays.asList(values), "isAllowNull");

                return this;
            } // end else
        } // end andIsAllowNullNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsAllowNullBetween(String value1, String value2) {
            addCriterion("OBJECT_PROPERTY.IS_ALLOW_NULL between", value1,
                value2, "isAllowNull");

            return this;
        } // end andIsAllowNullBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsAllowNullNotBetween(String value1, String value2) {
            addCriterion("OBJECT_PROPERTY.IS_ALLOW_NULL not between", value1,
                value2, "isAllowNull");

            return this;
        } // end andIsAllowNullNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPrecisionSizeIsNull() {
            addCriterion("OBJECT_PROPERTY.PRECISION_SIZE is null");

            return this;
        } // end andPrecisionSizeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPrecisionSizeIsNotNull() {
            addCriterion("OBJECT_PROPERTY.PRECISION_SIZE is not null");

            return this;
        } // end andPrecisionSizeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPrecisionSizeIsNotEmpty() {
            addCriterion(
                "OBJECT_PROPERTY.PRECISION_SIZE is not null AND OBJECT_PROPERTY.PRECISION_SIZE <> ''");

            return this;
        } // end andPrecisionSizeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPrecisionSizeIsEmpty() {
            addCriterion(
                "(OBJECT_PROPERTY.PRECISION_SIZE is null OR OBJECT_PROPERTY.PRECISION_SIZE = '')");

            return this;
        } // end andPrecisionSizeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPrecisionSizeEqualTo(Integer value) {
            addCriterion("OBJECT_PROPERTY.PRECISION_SIZE =", value,
                "precisionSize");

            return this;
        } // end andPrecisionSizeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPrecisionSizeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_PROPERTY.PRECISION_SIZE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPrecisionSizeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPrecisionSizeNotEqualTo(Integer value) {
            addCriterion("OBJECT_PROPERTY.PRECISION_SIZE <>", value,
                "precisionSize");

            return this;
        } // end andPrecisionSizeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPrecisionSizeNotEqualToOrIsNull(Integer value) {
            addCriterion("OBJECT_PROPERTY.PRECISION_SIZE is null OR OBJECT_PROPERTY.PRECISION_SIZE <>",
                value, "precisionSize");

            return this;
        } // end andPrecisionSizeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPrecisionSizeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_PROPERTY.PRECISION_SIZE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPrecisionSizeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPrecisionSizeGreaterThan(Integer value) {
            addCriterion("OBJECT_PROPERTY.PRECISION_SIZE >", value,
                "precisionSize");

            return this;
        } // end andPrecisionSizeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPrecisionSizeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_PROPERTY.PRECISION_SIZE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPrecisionSizeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPrecisionSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("OBJECT_PROPERTY.PRECISION_SIZE >=", value,
                "precisionSize");

            return this;
        } // end andPrecisionSizeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPrecisionSizeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_PROPERTY.PRECISION_SIZE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPrecisionSizeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPrecisionSizeLessThan(Integer value) {
            addCriterion("OBJECT_PROPERTY.PRECISION_SIZE <", value,
                "precisionSize");

            return this;
        } // end andPrecisionSizeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPrecisionSizeLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_PROPERTY.PRECISION_SIZE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPrecisionSizeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPrecisionSizeLessThanOrEqualTo(Integer value) {
            addCriterion("OBJECT_PROPERTY.PRECISION_SIZE <=", value,
                "precisionSize");

            return this;
        } // end andPrecisionSizeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPrecisionSizeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_PROPERTY.PRECISION_SIZE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPrecisionSizeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPrecisionSizeIn(List values) {
            if (values.size() == 1) {
                return andPrecisionSizeEqualTo((Integer) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.PRECISION_SIZE in", values,
                    "precisionSize");

                return this;
            } // end else
        } // end andPrecisionSizeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPrecisionSizeNotIn(List values) {
            if (values.size() == 1) {
                return andPrecisionSizeNotEqualTo((Integer) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.PRECISION_SIZE not in", values,
                    "precisionSize");

                return this;
            } // end else
        } // end andPrecisionSizeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPrecisionSizeIn(Object[] values) {
            if (values.length == 1) {
                return andPrecisionSizeEqualTo((Integer) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.PRECISION_SIZE in",
                    Arrays.asList(values), "precisionSize");

                return this;
            } // end else
        } // end andPrecisionSizeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPrecisionSizeNotIn(Object[] values) {
            if (values.length == 1) {
                return andPrecisionSizeNotEqualTo((Integer) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.PRECISION_SIZE not in",
                    Arrays.asList(values), "precisionSize");

                return this;
            } // end else
        } // end andPrecisionSizeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPrecisionSizeBetween(Integer value1, Integer value2) {
            addCriterion("OBJECT_PROPERTY.PRECISION_SIZE between", value1,
                value2, "precisionSize");

            return this;
        } // end andPrecisionSizeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPrecisionSizeNotBetween(Integer value1,
            Integer value2) {
            addCriterion("OBJECT_PROPERTY.PRECISION_SIZE not between", value1,
                value2, "precisionSize");

            return this;
        } // end andPrecisionSizeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsReadableIsNull() {
            addCriterion("OBJECT_PROPERTY.IS_READ_ABLE is null");

            return this;
        } // end andIsReadableIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsReadableIsNotNull() {
            addCriterion("OBJECT_PROPERTY.IS_READ_ABLE is not null");

            return this;
        } // end andIsReadableIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsReadableIsNotEmpty() {
            addCriterion(
                "OBJECT_PROPERTY.IS_READ_ABLE is not null AND OBJECT_PROPERTY.IS_READ_ABLE <> ''");

            return this;
        } // end andIsReadableIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsReadableIsEmpty() {
            addCriterion(
                "(OBJECT_PROPERTY.IS_READ_ABLE is null OR OBJECT_PROPERTY.IS_READ_ABLE = '')");

            return this;
        } // end andIsReadableIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsReadableEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.IS_READ_ABLE =", value, "isReadable");

            return this;
        } // end andIsReadableEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsReadableEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_READ_ABLE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsReadableEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsReadableNotEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.IS_READ_ABLE <>", value, "isReadable");

            return this;
        } // end andIsReadableNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsReadableNotEqualToOrIsNull(String value) {
            addCriterion("OBJECT_PROPERTY.IS_READ_ABLE is null OR OBJECT_PROPERTY.IS_READ_ABLE <>",
                value, "isReadable");

            return this;
        } // end andIsReadableNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsReadableNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_READ_ABLE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsReadableNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsReadableGreaterThan(String value) {
            addCriterion("OBJECT_PROPERTY.IS_READ_ABLE >", value, "isReadable");

            return this;
        } // end andIsReadableGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsReadableGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_READ_ABLE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsReadableGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsReadableGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.IS_READ_ABLE >=", value, "isReadable");

            return this;
        } // end andIsReadableGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsReadableGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_READ_ABLE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsReadableGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsReadableLessThan(String value) {
            addCriterion("OBJECT_PROPERTY.IS_READ_ABLE <", value, "isReadable");

            return this;
        } // end andIsReadableLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsReadableLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_READ_ABLE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsReadableLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsReadableLessThanOrEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.IS_READ_ABLE <=", value, "isReadable");

            return this;
        } // end andIsReadableLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsReadableLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_READ_ABLE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsReadableLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsReadableLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_PROPERTY.IS_READ_ABLE like",
                buffer.toString(), "isReadable");

            return this;
        } // end andIsReadableLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsReadableNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_PROPERTY.IS_READ_ABLE not like",
                buffer.toString(), "isReadable");

            return this;
        } // end andIsReadableNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsReadableIn(List values) {
            if (values.size() == 1) {
                return andIsReadableEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.IS_READ_ABLE in", values,
                    "isReadable");

                return this;
            } // end else
        } // end andIsReadableIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsReadableNotIn(List values) {
            if (values.size() == 1) {
                return andIsReadableNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.IS_READ_ABLE not in", values,
                    "isReadable");

                return this;
            } // end else
        } // end andIsReadableNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsReadableIn(Object[] values) {
            if (values.length == 1) {
                return andIsReadableEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.IS_READ_ABLE in",
                    Arrays.asList(values), "isReadable");

                return this;
            } // end else
        } // end andIsReadableIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsReadableNotIn(Object[] values) {
            if (values.length == 1) {
                return andIsReadableNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.IS_READ_ABLE not in",
                    Arrays.asList(values), "isReadable");

                return this;
            } // end else
        } // end andIsReadableNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsReadableBetween(String value1, String value2) {
            addCriterion("OBJECT_PROPERTY.IS_READ_ABLE between", value1,
                value2, "isReadable");

            return this;
        } // end andIsReadableBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsReadableNotBetween(String value1, String value2) {
            addCriterion("OBJECT_PROPERTY.IS_READ_ABLE not between", value1,
                value2, "isReadable");

            return this;
        } // end andIsReadableNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsWritableIsNull() {
            addCriterion("OBJECT_PROPERTY.IS_WRIT_ABLE is null");

            return this;
        } // end andIsWritableIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsWritableIsNotNull() {
            addCriterion("OBJECT_PROPERTY.IS_WRIT_ABLE is not null");

            return this;
        } // end andIsWritableIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsWritableIsNotEmpty() {
            addCriterion(
                "OBJECT_PROPERTY.IS_WRIT_ABLE is not null AND OBJECT_PROPERTY.IS_WRIT_ABLE <> ''");

            return this;
        } // end andIsWritableIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsWritableIsEmpty() {
            addCriterion(
                "(OBJECT_PROPERTY.IS_WRIT_ABLE is null OR OBJECT_PROPERTY.IS_WRIT_ABLE = '')");

            return this;
        } // end andIsWritableIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsWritableEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.IS_WRIT_ABLE =", value, "isWritable");

            return this;
        } // end andIsWritableEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsWritableEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_WRIT_ABLE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsWritableEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsWritableNotEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.IS_WRIT_ABLE <>", value, "isWritable");

            return this;
        } // end andIsWritableNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsWritableNotEqualToOrIsNull(String value) {
            addCriterion("OBJECT_PROPERTY.IS_WRIT_ABLE is null OR OBJECT_PROPERTY.IS_WRIT_ABLE <>",
                value, "isWritable");

            return this;
        } // end andIsWritableNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsWritableNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_WRIT_ABLE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsWritableNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsWritableGreaterThan(String value) {
            addCriterion("OBJECT_PROPERTY.IS_WRIT_ABLE >", value, "isWritable");

            return this;
        } // end andIsWritableGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsWritableGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_WRIT_ABLE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsWritableGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsWritableGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.IS_WRIT_ABLE >=", value, "isWritable");

            return this;
        } // end andIsWritableGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsWritableGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_WRIT_ABLE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsWritableGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsWritableLessThan(String value) {
            addCriterion("OBJECT_PROPERTY.IS_WRIT_ABLE <", value, "isWritable");

            return this;
        } // end andIsWritableLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsWritableLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_WRIT_ABLE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsWritableLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsWritableLessThanOrEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.IS_WRIT_ABLE <=", value, "isWritable");

            return this;
        } // end andIsWritableLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsWritableLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_WRIT_ABLE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsWritableLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsWritableLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_PROPERTY.IS_WRIT_ABLE like",
                buffer.toString(), "isWritable");

            return this;
        } // end andIsWritableLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsWritableNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_PROPERTY.IS_WRIT_ABLE not like",
                buffer.toString(), "isWritable");

            return this;
        } // end andIsWritableNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsWritableIn(List values) {
            if (values.size() == 1) {
                return andIsWritableEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.IS_WRIT_ABLE in", values,
                    "isWritable");

                return this;
            } // end else
        } // end andIsWritableIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsWritableNotIn(List values) {
            if (values.size() == 1) {
                return andIsWritableNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.IS_WRIT_ABLE not in", values,
                    "isWritable");

                return this;
            } // end else
        } // end andIsWritableNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsWritableIn(Object[] values) {
            if (values.length == 1) {
                return andIsWritableEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.IS_WRIT_ABLE in",
                    Arrays.asList(values), "isWritable");

                return this;
            } // end else
        } // end andIsWritableIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsWritableNotIn(Object[] values) {
            if (values.length == 1) {
                return andIsWritableNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.IS_WRIT_ABLE not in",
                    Arrays.asList(values), "isWritable");

                return this;
            } // end else
        } // end andIsWritableNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsWritableBetween(String value1, String value2) {
            addCriterion("OBJECT_PROPERTY.IS_WRIT_ABLE between", value1,
                value2, "isWritable");

            return this;
        } // end andIsWritableBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsWritableNotBetween(String value1, String value2) {
            addCriterion("OBJECT_PROPERTY.IS_WRIT_ABLE not between", value1,
                value2, "isWritable");

            return this;
        } // end andIsWritableNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayIsNull() {
            addCriterion("OBJECT_PROPERTY.IS_ARRAY is null");

            return this;
        } // end andIsArrayIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayIsNotNull() {
            addCriterion("OBJECT_PROPERTY.IS_ARRAY is not null");

            return this;
        } // end andIsArrayIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayIsNotEmpty() {
            addCriterion(
                "OBJECT_PROPERTY.IS_ARRAY is not null AND OBJECT_PROPERTY.IS_ARRAY <> ''");

            return this;
        } // end andIsArrayIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayIsEmpty() {
            addCriterion(
                "(OBJECT_PROPERTY.IS_ARRAY is null OR OBJECT_PROPERTY.IS_ARRAY = '')");

            return this;
        } // end andIsArrayIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.IS_ARRAY =", value, "isArray");

            return this;
        } // end andIsArrayEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_ARRAY");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsArrayEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayNotEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.IS_ARRAY <>", value, "isArray");

            return this;
        } // end andIsArrayNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayNotEqualToOrIsNull(String value) {
            addCriterion("OBJECT_PROPERTY.IS_ARRAY is null OR OBJECT_PROPERTY.IS_ARRAY <>",
                value, "isArray");

            return this;
        } // end andIsArrayNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayNotEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_ARRAY");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsArrayNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayGreaterThan(String value) {
            addCriterion("OBJECT_PROPERTY.IS_ARRAY >", value, "isArray");

            return this;
        } // end andIsArrayGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayGreaterThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_ARRAY");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsArrayGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.IS_ARRAY >=", value, "isArray");

            return this;
        } // end andIsArrayGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_ARRAY");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsArrayGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayLessThan(String value) {
            addCriterion("OBJECT_PROPERTY.IS_ARRAY <", value, "isArray");

            return this;
        } // end andIsArrayLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayLessThanForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_ARRAY");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsArrayLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayLessThanOrEqualTo(String value) {
            addCriterion("OBJECT_PROPERTY.IS_ARRAY <=", value, "isArray");

            return this;
        } // end andIsArrayLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("OBJECT_PROPERTY.IS_ARRAY");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andIsArrayLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_PROPERTY.IS_ARRAY like", buffer.toString(),
                "isArray");

            return this;
        } // end andIsArrayLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_PROPERTY.IS_ARRAY not like",
                buffer.toString(), "isArray");

            return this;
        } // end andIsArrayNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayIn(List values) {
            if (values.size() == 1) {
                return andIsArrayEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.IS_ARRAY in", values, "isArray");

                return this;
            } // end else
        } // end andIsArrayIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayNotIn(List values) {
            if (values.size() == 1) {
                return andIsArrayNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.IS_ARRAY not in", values,
                    "isArray");

                return this;
            } // end else
        } // end andIsArrayNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayIn(Object[] values) {
            if (values.length == 1) {
                return andIsArrayEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.IS_ARRAY in",
                    Arrays.asList(values), "isArray");

                return this;
            } // end else
        } // end andIsArrayIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayNotIn(Object[] values) {
            if (values.length == 1) {
                return andIsArrayNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.IS_ARRAY not in",
                    Arrays.asList(values), "isArray");

                return this;
            } // end else
        } // end andIsArrayNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayBetween(String value1, String value2) {
            addCriterion("OBJECT_PROPERTY.IS_ARRAY between", value1, value2,
                "isArray");

            return this;
        } // end andIsArrayBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andIsArrayNotBetween(String value1, String value2) {
            addCriterion("OBJECT_PROPERTY.IS_ARRAY not between", value1,
                value2, "isArray");

            return this;
        } // end andIsArrayNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdIsNull() {
            addCriterion("OBJECT_PROPERTY.REFERENCE_OBJECT_ID is null");

            return this;
        } // end andReferenceObjectIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdIsNotNull() {
            addCriterion("OBJECT_PROPERTY.REFERENCE_OBJECT_ID is not null");

            return this;
        } // end andReferenceObjectIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdIsNotEmpty() {
            addCriterion(
                "OBJECT_PROPERTY.REFERENCE_OBJECT_ID is not null AND OBJECT_PROPERTY.REFERENCE_OBJECT_ID <> ''");

            return this;
        } // end andReferenceObjectIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdIsEmpty() {
            addCriterion(
                "(OBJECT_PROPERTY.REFERENCE_OBJECT_ID is null OR OBJECT_PROPERTY.REFERENCE_OBJECT_ID = '')");

            return this;
        } // end andReferenceObjectIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdEqualTo(Long value) {
            addCriterion("OBJECT_PROPERTY.REFERENCE_OBJECT_ID =", value,
                "referenceObjectId");

            return this;
        } // end andReferenceObjectIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_PROPERTY.REFERENCE_OBJECT_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReferenceObjectIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdNotEqualTo(Long value) {
            addCriterion("OBJECT_PROPERTY.REFERENCE_OBJECT_ID <>", value,
                "referenceObjectId");

            return this;
        } // end andReferenceObjectIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdNotEqualToOrIsNull(Long value) {
            addCriterion("OBJECT_PROPERTY.REFERENCE_OBJECT_ID is null OR OBJECT_PROPERTY.REFERENCE_OBJECT_ID <>",
                value, "referenceObjectId");

            return this;
        } // end andReferenceObjectIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_PROPERTY.REFERENCE_OBJECT_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReferenceObjectIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdGreaterThan(Long value) {
            addCriterion("OBJECT_PROPERTY.REFERENCE_OBJECT_ID >", value,
                "referenceObjectId");

            return this;
        } // end andReferenceObjectIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_PROPERTY.REFERENCE_OBJECT_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReferenceObjectIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OBJECT_PROPERTY.REFERENCE_OBJECT_ID >=", value,
                "referenceObjectId");

            return this;
        } // end andReferenceObjectIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_PROPERTY.REFERENCE_OBJECT_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReferenceObjectIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdLessThan(Long value) {
            addCriterion("OBJECT_PROPERTY.REFERENCE_OBJECT_ID <", value,
                "referenceObjectId");

            return this;
        } // end andReferenceObjectIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_PROPERTY.REFERENCE_OBJECT_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReferenceObjectIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdLessThanOrEqualTo(Long value) {
            addCriterion("OBJECT_PROPERTY.REFERENCE_OBJECT_ID <=", value,
                "referenceObjectId");

            return this;
        } // end andReferenceObjectIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_PROPERTY.REFERENCE_OBJECT_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andReferenceObjectIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdIn(List values) {
            if (values.size() == 1) {
                return andReferenceObjectIdEqualTo((Long) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.REFERENCE_OBJECT_ID in", values,
                    "referenceObjectId");

                return this;
            } // end else
        } // end andReferenceObjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdNotIn(List values) {
            if (values.size() == 1) {
                return andReferenceObjectIdNotEqualTo((Long) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.REFERENCE_OBJECT_ID not in",
                    values, "referenceObjectId");

                return this;
            } // end else
        } // end andReferenceObjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdIn(Object[] values) {
            if (values.length == 1) {
                return andReferenceObjectIdEqualTo((Long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.REFERENCE_OBJECT_ID in",
                    Arrays.asList(values), "referenceObjectId");

                return this;
            } // end else
        } // end andReferenceObjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andReferenceObjectIdNotEqualTo((Long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_PROPERTY.REFERENCE_OBJECT_ID not in",
                    Arrays.asList(values), "referenceObjectId");

                return this;
            } // end else
        } // end andReferenceObjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdBetween(Long value1, Long value2) {
            addCriterion("OBJECT_PROPERTY.REFERENCE_OBJECT_ID between", value1,
                value2, "referenceObjectId");

            return this;
        } // end andReferenceObjectIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andReferenceObjectIdNotBetween(Long value1, Long value2) {
            addCriterion("OBJECT_PROPERTY.REFERENCE_OBJECT_ID not between",
                value1, value2, "referenceObjectId");

            return this;
        } // end andReferenceObjectIdNotBetween()
    } // end Criteria
} // end ObjectPropertyDAOQueryBean
