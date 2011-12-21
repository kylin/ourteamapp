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
 * ObjectRelationAttr query bean 2011-09-22 10:16:44
 *
 * @author Auto Gen
 */
public class ObjectRelationAttrDAOQueryBean extends BaseQueryBean {
    /**
     * Creates a new ObjectRelationAttrDAOQueryBean object.
     */
    public ObjectRelationAttrDAOQueryBean() {
        super();
    } // end ObjectRelationAttrDAOQueryBean()

    /**
     * Creates a new ObjectRelationAttrDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     */
    public ObjectRelationAttrDAOQueryBean(BaseQueryBean aQueryBean) {
        super(aQueryBean);
    } // end ObjectRelationAttrDAOQueryBean()

    /**
     * Creates a new ObjectRelationAttrDAOQueryBean object.
     *
     * @param aQueryBean DOCUMENT ME!
     * @param tableReplaceMap DOCUMENT ME!
     */
    public ObjectRelationAttrDAOQueryBean(BaseQueryBean aQueryBean,
        Map tableReplaceMap) {
        super(aQueryBean, tableReplaceMap);
    } // end ObjectRelationAttrDAOQueryBean()

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
    public void addObjectRelationAttrIdSelectProperty() {
        addObjectRelationAttrIdSelectProperty("objectRelationAttrId");
    } // end addObjectRelationAttrIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addObjectRelationAttrIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectRelationAttrDAO.ObjectRelationAttrId,
                aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationAttrDAO.ObjectRelationAttrId,
                "objectRelationAttrId");
        } // end else
    } // end addObjectRelationAttrIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addObjectRelationIdSelectProperty() {
        addObjectRelationIdSelectProperty("objectRelationId");
    } // end addObjectRelationIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addObjectRelationIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectRelationAttrDAO.ObjectRelationId, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationAttrDAO.ObjectRelationId,
                "objectRelationId");
        } // end else
    } // end addObjectRelationIdSelectProperty()

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
            addSelectProperty(IObjectRelationAttrDAO.PropertyId, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationAttrDAO.PropertyId, "propertyId");
        } // end else
    } // end addPropertyIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRelatedPropertyIdSelectProperty() {
        addRelatedPropertyIdSelectProperty("relatedPropertyId");
    } // end addRelatedPropertyIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRelatedPropertyIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectRelationAttrDAO.RelatedPropertyId, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationAttrDAO.RelatedPropertyId,
                "relatedPropertyId");
        } // end else
    } // end addRelatedPropertyIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addObjectRelationDescriptionSelectProperty() {
        addObjectRelationDescriptionSelectProperty("objectRelationDescription");
    } // end addObjectRelationDescriptionSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addObjectRelationDescriptionSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectRelationAttrDAO.ObjectRelationDescription,
                aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationAttrDAO.ObjectRelationDescription,
                "objectRelationDescription");
        } // end else
    } // end addObjectRelationDescriptionSelectProperty()

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
            addSelectProperty(IObjectRelationAttrDAO.PropertyDataSize, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationAttrDAO.PropertyDataSize,
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
            addSelectProperty(IObjectRelationAttrDAO.PropertyDataType, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationAttrDAO.PropertyDataType,
                "propertyDataType");
        } // end else
    } // end addPropertyDataTypeSelectProperty()

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
            addSelectProperty(IObjectRelationAttrDAO.PropertyDescription, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationAttrDAO.PropertyDescription,
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
            addSelectProperty(IObjectRelationAttrDAO.PropertyIsEnum, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationAttrDAO.PropertyIsEnum,
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
            addSelectProperty(IObjectRelationAttrDAO.PropertyIsGenerate, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationAttrDAO.PropertyIsGenerate,
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
            addSelectProperty(IObjectRelationAttrDAO.PropertyIsPrimaryProperty,
                aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationAttrDAO.PropertyIsPrimaryProperty,
                "propertyIsPrimaryProperty");
        } // end else
    } // end addPropertyIsPrimaryPropertySelectProperty()

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
            addSelectProperty(IObjectRelationAttrDAO.PropertyName, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationAttrDAO.PropertyName,
                "propertyName");
        } // end else
    } // end addPropertyNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addPropertyObjectIdSelectProperty() {
        addPropertyObjectIdSelectProperty("propertyObjectId");
    } // end addPropertyObjectIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addPropertyObjectIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectRelationAttrDAO.PropertyObjectId, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationAttrDAO.PropertyObjectId,
                "propertyObjectId");
        } // end else
    } // end addPropertyObjectIdSelectProperty()

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
            addSelectProperty(IObjectRelationAttrDAO.PropertyOrderIndex, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationAttrDAO.PropertyOrderIndex,
                "propertyOrderIndex");
        } // end else
    } // end addPropertyOrderIndexSelectProperty()

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
            addSelectProperty(IObjectRelationAttrDAO.PropertyKind, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationAttrDAO.PropertyKind,
                "propertyKind");
        } // end else
    } // end addPropertyKindSelectProperty()

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
            addSelectProperty(IObjectRelationAttrDAO.PropertyState, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationAttrDAO.PropertyState,
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
            addSelectProperty(IObjectRelationAttrDAO.PropertyType, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationAttrDAO.PropertyType,
                "propertyType");
        } // end else
    } // end addPropertyTypeSelectProperty()

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
            addSelectProperty(IObjectRelationAttrDAO.PropertyValue, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationAttrDAO.PropertyValue,
                "propertyValue");
        } // end else
    } // end addPropertyValueSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRelatedPropertyDataSizeSelectProperty() {
        addRelatedPropertyDataSizeSelectProperty("relatedPropertyDataSize");
    } // end addRelatedPropertyDataSizeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRelatedPropertyDataSizeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectRelationAttrDAO.RelatedPropertyDataSize,
                aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationAttrDAO.RelatedPropertyDataSize,
                "relatedPropertyDataSize");
        } // end else
    } // end addRelatedPropertyDataSizeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRelatedPropertyDataTypeSelectProperty() {
        addRelatedPropertyDataTypeSelectProperty("relatedPropertyDataType");
    } // end addRelatedPropertyDataTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRelatedPropertyDataTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectRelationAttrDAO.RelatedPropertyDataType,
                aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationAttrDAO.RelatedPropertyDataType,
                "relatedPropertyDataType");
        } // end else
    } // end addRelatedPropertyDataTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRelatedPropertyDescriptionSelectProperty() {
        addRelatedPropertyDescriptionSelectProperty(
            "relatedPropertyDescription");
    } // end addRelatedPropertyDescriptionSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRelatedPropertyDescriptionSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectRelationAttrDAO.RelatedPropertyDescription,
                aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationAttrDAO.RelatedPropertyDescription,
                "relatedPropertyDescription");
        } // end else
    } // end addRelatedPropertyDescriptionSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRelatedPropertyIsEnumSelectProperty() {
        addRelatedPropertyIsEnumSelectProperty("relatedPropertyIsEnum");
    } // end addRelatedPropertyIsEnumSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRelatedPropertyIsEnumSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectRelationAttrDAO.RelatedPropertyIsEnum,
                aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationAttrDAO.RelatedPropertyIsEnum,
                "relatedPropertyIsEnum");
        } // end else
    } // end addRelatedPropertyIsEnumSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRelatedPropertyIsGenerateSelectProperty() {
        addRelatedPropertyIsGenerateSelectProperty("relatedPropertyIsGenerate");
    } // end addRelatedPropertyIsGenerateSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRelatedPropertyIsGenerateSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectRelationAttrDAO.RelatedPropertyIsGenerate,
                aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationAttrDAO.RelatedPropertyIsGenerate,
                "relatedPropertyIsGenerate");
        } // end else
    } // end addRelatedPropertyIsGenerateSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRelatedPropertyIsPrimaryPropertySelectProperty() {
        addRelatedPropertyIsPrimaryPropertySelectProperty(
            "relatedPropertyIsPrimaryProperty");
    } // end addRelatedPropertyIsPrimaryPropertySelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRelatedPropertyIsPrimaryPropertySelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectRelationAttrDAO.RelatedPropertyIsPrimaryProperty,
                aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationAttrDAO.RelatedPropertyIsPrimaryProperty,
                "relatedPropertyIsPrimaryProperty");
        } // end else
    } // end addRelatedPropertyIsPrimaryPropertySelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRelatedPropertyNameSelectProperty() {
        addRelatedPropertyNameSelectProperty("relatedPropertyName");
    } // end addRelatedPropertyNameSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRelatedPropertyNameSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectRelationAttrDAO.RelatedPropertyName, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationAttrDAO.RelatedPropertyName,
                "relatedPropertyName");
        } // end else
    } // end addRelatedPropertyNameSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRelatedPropertyObjectIdSelectProperty() {
        addRelatedPropertyObjectIdSelectProperty("relatedPropertyObjectId");
    } // end addRelatedPropertyObjectIdSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRelatedPropertyObjectIdSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectRelationAttrDAO.RelatedPropertyObjectId,
                aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationAttrDAO.RelatedPropertyObjectId,
                "relatedPropertyObjectId");
        } // end else
    } // end addRelatedPropertyObjectIdSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRelatedPropertyOrderIndexSelectProperty() {
        addRelatedPropertyOrderIndexSelectProperty("relatedPropertyOrderIndex");
    } // end addRelatedPropertyOrderIndexSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRelatedPropertyOrderIndexSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectRelationAttrDAO.RelatedPropertyOrderIndex,
                aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationAttrDAO.RelatedPropertyOrderIndex,
                "relatedPropertyOrderIndex");
        } // end else
    } // end addRelatedPropertyOrderIndexSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRelatedPropertyKindSelectProperty() {
        addRelatedPropertyKindSelectProperty("relatedPropertyKind");
    } // end addRelatedPropertyKindSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRelatedPropertyKindSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectRelationAttrDAO.RelatedPropertyKind, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationAttrDAO.RelatedPropertyKind,
                "relatedPropertyKind");
        } // end else
    } // end addRelatedPropertyKindSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRelatedPropertyStateSelectProperty() {
        addRelatedPropertyStateSelectProperty("relatedPropertyState");
    } // end addRelatedPropertyStateSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRelatedPropertyStateSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectRelationAttrDAO.RelatedPropertyState,
                aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationAttrDAO.RelatedPropertyState,
                "relatedPropertyState");
        } // end else
    } // end addRelatedPropertyStateSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRelatedPropertyTypeSelectProperty() {
        addRelatedPropertyTypeSelectProperty("relatedPropertyType");
    } // end addRelatedPropertyTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRelatedPropertyTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectRelationAttrDAO.RelatedPropertyType, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationAttrDAO.RelatedPropertyType,
                "relatedPropertyType");
        } // end else
    } // end addRelatedPropertyTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRelatedPropertyValueSelectProperty() {
        addRelatedPropertyValueSelectProperty("relatedPropertyValue");
    } // end addRelatedPropertyValueSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRelatedPropertyValueSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectRelationAttrDAO.RelatedPropertyValue,
                aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationAttrDAO.RelatedPropertyValue,
                "relatedPropertyValue");
        } // end else
    } // end addRelatedPropertyValueSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRelateAttrTypeSelectProperty() {
        addRelateAttrTypeSelectProperty("relateAttrType");
    } // end addRelateAttrTypeSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRelateAttrTypeSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectRelationAttrDAO.RelateAttrType, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationAttrDAO.RelateAttrType,
                "relateAttrType");
        } // end else
    } // end addRelateAttrTypeSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addPropertyIsUniqueSelectProperty() {
        addPropertyIsUniqueSelectProperty("propertyIsUnique");
    } // end addPropertyIsUniqueSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addPropertyIsUniqueSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectRelationAttrDAO.PropertyIsUnique, aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationAttrDAO.PropertyIsUnique,
                "propertyIsUnique");
        } // end else
    } // end addPropertyIsUniqueSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addRelatedPropertyIsUniqueSelectProperty() {
        addRelatedPropertyIsUniqueSelectProperty("relatedPropertyIsUnique");
    } // end addRelatedPropertyIsUniqueSelectProperty()

    /**
     * DOCUMENT ME!
     *
     * @param aAlias DOCUMENT ME!
     */
    public void addRelatedPropertyIsUniqueSelectProperty(String aAlias) {
        if (StringUtils.isNotBlank(aAlias)) {
            addSelectProperty(IObjectRelationAttrDAO.RelatedPropertyIsUnique,
                aAlias);
        } // end if
        else {
            addSelectProperty(IObjectRelationAttrDAO.RelatedPropertyIsUnique,
                "relatedPropertyIsUnique");
        } // end else
    } // end addRelatedPropertyIsUniqueSelectProperty()

    /**
     * DOCUMENT ME!
     */
    public void addAllSelectProperties() {
        addObjectRelationAttrIdSelectProperty();

        addObjectRelationIdSelectProperty();

        addPropertyIdSelectProperty();

        addRelatedPropertyIdSelectProperty();

        addObjectRelationDescriptionSelectProperty();

        addPropertyDataSizeSelectProperty();

        addPropertyDataTypeSelectProperty();

        addPropertyDescriptionSelectProperty();

        addPropertyIsEnumSelectProperty();

        addPropertyIsGenerateSelectProperty();

        addPropertyIsPrimaryPropertySelectProperty();

        addPropertyNameSelectProperty();

        addPropertyObjectIdSelectProperty();

        addPropertyOrderIndexSelectProperty();

        addPropertyKindSelectProperty();

        addPropertyStateSelectProperty();

        addPropertyTypeSelectProperty();

        addPropertyValueSelectProperty();

        addRelatedPropertyDataSizeSelectProperty();

        addRelatedPropertyDataTypeSelectProperty();

        addRelatedPropertyDescriptionSelectProperty();

        addRelatedPropertyIsEnumSelectProperty();

        addRelatedPropertyIsGenerateSelectProperty();

        addRelatedPropertyIsPrimaryPropertySelectProperty();

        addRelatedPropertyNameSelectProperty();

        addRelatedPropertyObjectIdSelectProperty();

        addRelatedPropertyOrderIndexSelectProperty();

        addRelatedPropertyKindSelectProperty();

        addRelatedPropertyStateSelectProperty();

        addRelatedPropertyTypeSelectProperty();

        addRelatedPropertyValueSelectProperty();

        addRelateAttrTypeSelectProperty();

        addPropertyIsUniqueSelectProperty();

        addRelatedPropertyIsUniqueSelectProperty();
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
        public Criteria andObjectRelationAttrIdIsNull() {
            addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ATTR_ID is null");

            return this;
        } // end andObjectRelationAttrIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationAttrIdIsNotNull() {
            addCriterion(
                "OBJECT_RELATION_ATTR.OBJECT_RELATION_ATTR_ID is not null");

            return this;
        } // end andObjectRelationAttrIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationAttrIdIsNotEmpty() {
            addCriterion(
                "OBJECT_RELATION_ATTR.OBJECT_RELATION_ATTR_ID is not null AND OBJECT_RELATION_ATTR.OBJECT_RELATION_ATTR_ID <> ''");

            return this;
        } // end andObjectRelationAttrIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationAttrIdIsEmpty() {
            addCriterion(
                "(OBJECT_RELATION_ATTR.OBJECT_RELATION_ATTR_ID is null OR OBJECT_RELATION_ATTR.OBJECT_RELATION_ATTR_ID = '')");

            return this;
        } // end andObjectRelationAttrIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationAttrIdEqualTo(long value) {
            return andObjectRelationAttrIdEqualTo(Long.valueOf(value));
        } // end andObjectRelationAttrIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationAttrIdEqualTo(java.lang.Long value) {
            addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ATTR_ID =",
                value, "objectRelationAttrId");

            return this;
        } // end andObjectRelationAttrIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationAttrIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION_ATTR.OBJECT_RELATION_ATTR_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectRelationAttrIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationAttrIdNotEqualTo(long value) {
            return andObjectRelationAttrIdNotEqualTo(Long.valueOf(value));
        } // end andObjectRelationAttrIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationAttrIdNotEqualTo(java.lang.Long value) {
            addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ATTR_ID <>",
                value, "objectRelationAttrId");

            return this;
        } // end andObjectRelationAttrIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationAttrIdNotEqualToOrIsNull(long value) {
            return andObjectRelationAttrIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andObjectRelationAttrIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationAttrIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ATTR_ID is null OR OBJECT_RELATION_ATTR.OBJECT_RELATION_ATTR_ID <>",
                value, "objectRelationAttrId");

            return this;
        } // end andObjectRelationAttrIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationAttrIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION_ATTR.OBJECT_RELATION_ATTR_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectRelationAttrIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationAttrIdGreaterThan(long value) {
            return andObjectRelationAttrIdGreaterThan(Long.valueOf(value));
        } // end andObjectRelationAttrIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationAttrIdGreaterThan(java.lang.Long value) {
            addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ATTR_ID >",
                value, "objectRelationAttrId");

            return this;
        } // end andObjectRelationAttrIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationAttrIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION_ATTR.OBJECT_RELATION_ATTR_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectRelationAttrIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationAttrIdGreaterThanOrEqualTo(long value) {
            return andObjectRelationAttrIdGreaterThanOrEqualTo(Long.valueOf(
                    value));
        } // end andObjectRelationAttrIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationAttrIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ATTR_ID >=",
                value, "objectRelationAttrId");

            return this;
        } // end andObjectRelationAttrIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationAttrIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION_ATTR.OBJECT_RELATION_ATTR_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectRelationAttrIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationAttrIdLessThan(long value) {
            return andObjectRelationAttrIdLessThan(Long.valueOf(value));
        } // end andObjectRelationAttrIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationAttrIdLessThan(java.lang.Long value) {
            addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ATTR_ID <",
                value, "objectRelationAttrId");

            return this;
        } // end andObjectRelationAttrIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationAttrIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION_ATTR.OBJECT_RELATION_ATTR_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectRelationAttrIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationAttrIdLessThanOrEqualTo(long value) {
            return andObjectRelationAttrIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andObjectRelationAttrIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationAttrIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ATTR_ID <=",
                value, "objectRelationAttrId");

            return this;
        } // end andObjectRelationAttrIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationAttrIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION_ATTR.OBJECT_RELATION_ATTR_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectRelationAttrIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationAttrIdIn(long[] values) {
            if (values.length == 1) {
                return andObjectRelationAttrIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ATTR_ID in",
                    values, "objectRelationAttrId");

                return this;
            } // end else
        } // end andObjectRelationAttrIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationAttrIdNotIn(long[] values) {
            if (values.length == 1) {
                return andObjectRelationAttrIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ATTR_ID not in",
                    values, "objectRelationAttrId");

                return this;
            } // end else
        } // end andObjectRelationAttrIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationAttrIdIn(List values) {
            if (values.size() == 1) {
                return andObjectRelationAttrIdEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ATTR_ID in",
                    values, "objectRelationAttrId");

                return this;
            } // end else
        } // end andObjectRelationAttrIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationAttrIdNotIn(List values) {
            if (values.size() == 1) {
                return andObjectRelationAttrIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ATTR_ID not in",
                    values, "objectRelationAttrId");

                return this;
            } // end else
        } // end andObjectRelationAttrIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationAttrIdIn(Object[] values) {
            if (values.length == 1) {
                return andObjectRelationAttrIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ATTR_ID in",
                    Arrays.asList(values), "objectRelationAttrId");

                return this;
            } // end else
        } // end andObjectRelationAttrIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationAttrIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andObjectRelationAttrIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ATTR_ID not in",
                    Arrays.asList(values), "objectRelationAttrId");

                return this;
            } // end else
        } // end andObjectRelationAttrIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationAttrIdBetween(long value1, long value2) {
            addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ATTR_ID between",
                value1, value2, "objectRelationAttrId");

            return this;
        } // end andObjectRelationAttrIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationAttrIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ATTR_ID between",
                value1, value2, "objectRelationAttrId");

            return this;
        } // end andObjectRelationAttrIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationAttrIdNotBetween(long value1,
            long value2) {
            addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ATTR_ID not between",
                value1, value2, "objectRelationAttrId");

            return this;
        } // end andObjectRelationAttrIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationAttrIdNotBetween(
            java.lang.Long value1, java.lang.Long value2) {
            addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ATTR_ID not between",
                value1, value2, "objectRelationAttrId");

            return this;
        } // end andObjectRelationAttrIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdIsNull() {
            addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ID is null");

            return this;
        } // end andObjectRelationIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdIsNotNull() {
            addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ID is not null");

            return this;
        } // end andObjectRelationIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdIsNotEmpty() {
            addCriterion(
                "OBJECT_RELATION_ATTR.OBJECT_RELATION_ID is not null AND OBJECT_RELATION_ATTR.OBJECT_RELATION_ID <> ''");

            return this;
        } // end andObjectRelationIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdIsEmpty() {
            addCriterion(
                "(OBJECT_RELATION_ATTR.OBJECT_RELATION_ID is null OR OBJECT_RELATION_ATTR.OBJECT_RELATION_ID = '')");

            return this;
        } // end andObjectRelationIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdEqualTo(long value) {
            return andObjectRelationIdEqualTo(Long.valueOf(value));
        } // end andObjectRelationIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdEqualTo(java.lang.Long value) {
            addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ID =", value,
                "objectRelationId");

            return this;
        } // end andObjectRelationIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION_ATTR.OBJECT_RELATION_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectRelationIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdNotEqualTo(long value) {
            return andObjectRelationIdNotEqualTo(Long.valueOf(value));
        } // end andObjectRelationIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdNotEqualTo(java.lang.Long value) {
            addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ID <>", value,
                "objectRelationId");

            return this;
        } // end andObjectRelationIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdNotEqualToOrIsNull(long value) {
            return andObjectRelationIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andObjectRelationIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ID is null OR OBJECT_RELATION_ATTR.OBJECT_RELATION_ID <>",
                value, "objectRelationId");

            return this;
        } // end andObjectRelationIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION_ATTR.OBJECT_RELATION_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectRelationIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdGreaterThan(long value) {
            return andObjectRelationIdGreaterThan(Long.valueOf(value));
        } // end andObjectRelationIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdGreaterThan(java.lang.Long value) {
            addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ID >", value,
                "objectRelationId");

            return this;
        } // end andObjectRelationIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION_ATTR.OBJECT_RELATION_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectRelationIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdGreaterThanOrEqualTo(long value) {
            return andObjectRelationIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andObjectRelationIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ID >=", value,
                "objectRelationId");

            return this;
        } // end andObjectRelationIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION_ATTR.OBJECT_RELATION_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectRelationIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdLessThan(long value) {
            return andObjectRelationIdLessThan(Long.valueOf(value));
        } // end andObjectRelationIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdLessThan(java.lang.Long value) {
            addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ID <", value,
                "objectRelationId");

            return this;
        } // end andObjectRelationIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION_ATTR.OBJECT_RELATION_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectRelationIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdLessThanOrEqualTo(long value) {
            return andObjectRelationIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andObjectRelationIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ID <=", value,
                "objectRelationId");

            return this;
        } // end andObjectRelationIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION_ATTR.OBJECT_RELATION_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectRelationIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdIn(long[] values) {
            if (values.length == 1) {
                return andObjectRelationIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ID in",
                    values, "objectRelationId");

                return this;
            } // end else
        } // end andObjectRelationIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdNotIn(long[] values) {
            if (values.length == 1) {
                return andObjectRelationIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ID not in",
                    values, "objectRelationId");

                return this;
            } // end else
        } // end andObjectRelationIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdIn(List values) {
            if (values.size() == 1) {
                return andObjectRelationIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ID in",
                    values, "objectRelationId");

                return this;
            } // end else
        } // end andObjectRelationIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdNotIn(List values) {
            if (values.size() == 1) {
                return andObjectRelationIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ID not in",
                    values, "objectRelationId");

                return this;
            } // end else
        } // end andObjectRelationIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdIn(Object[] values) {
            if (values.length == 1) {
                return andObjectRelationIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ID in",
                    Arrays.asList(values), "objectRelationId");

                return this;
            } // end else
        } // end andObjectRelationIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andObjectRelationIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ID not in",
                    Arrays.asList(values), "objectRelationId");

                return this;
            } // end else
        } // end andObjectRelationIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdBetween(long value1, long value2) {
            addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ID between",
                value1, value2, "objectRelationId");

            return this;
        } // end andObjectRelationIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ID between",
                value1, value2, "objectRelationId");

            return this;
        } // end andObjectRelationIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdNotBetween(long value1, long value2) {
            addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ID not between",
                value1, value2, "objectRelationId");

            return this;
        } // end andObjectRelationIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("OBJECT_RELATION_ATTR.OBJECT_RELATION_ID not between",
                value1, value2, "objectRelationId");

            return this;
        } // end andObjectRelationIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdIsNull() {
            addCriterion("OBJECT_RELATION_ATTR.PROPERTY_ID is null");

            return this;
        } // end andPropertyIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdIsNotNull() {
            addCriterion("OBJECT_RELATION_ATTR.PROPERTY_ID is not null");

            return this;
        } // end andPropertyIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdIsNotEmpty() {
            addCriterion(
                "OBJECT_RELATION_ATTR.PROPERTY_ID is not null AND OBJECT_RELATION_ATTR.PROPERTY_ID <> ''");

            return this;
        } // end andPropertyIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIdIsEmpty() {
            addCriterion(
                "(OBJECT_RELATION_ATTR.PROPERTY_ID is null OR OBJECT_RELATION_ATTR.PROPERTY_ID = '')");

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
            addCriterion("OBJECT_RELATION_ATTR.PROPERTY_ID =", value,
                "propertyId");

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
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION_ATTR.PROPERTY_ID");
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
            addCriterion("OBJECT_RELATION_ATTR.PROPERTY_ID <>", value,
                "propertyId");

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
            addCriterion("OBJECT_RELATION_ATTR.PROPERTY_ID is null OR OBJECT_RELATION_ATTR.PROPERTY_ID <>",
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
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION_ATTR.PROPERTY_ID");
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
            addCriterion("OBJECT_RELATION_ATTR.PROPERTY_ID >", value,
                "propertyId");

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
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION_ATTR.PROPERTY_ID");
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
            addCriterion("OBJECT_RELATION_ATTR.PROPERTY_ID >=", value,
                "propertyId");

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
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION_ATTR.PROPERTY_ID");
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
            addCriterion("OBJECT_RELATION_ATTR.PROPERTY_ID <", value,
                "propertyId");

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
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION_ATTR.PROPERTY_ID");
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
            addCriterion("OBJECT_RELATION_ATTR.PROPERTY_ID <=", value,
                "propertyId");

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
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION_ATTR.PROPERTY_ID");
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
                addCriterion("OBJECT_RELATION_ATTR.PROPERTY_ID in", values,
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
                addCriterion("OBJECT_RELATION_ATTR.PROPERTY_ID not in", values,
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
                addCriterion("OBJECT_RELATION_ATTR.PROPERTY_ID in", values,
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
                addCriterion("OBJECT_RELATION_ATTR.PROPERTY_ID not in", values,
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
                addCriterion("OBJECT_RELATION_ATTR.PROPERTY_ID in",
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
                addCriterion("OBJECT_RELATION_ATTR.PROPERTY_ID not in",
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
            addCriterion("OBJECT_RELATION_ATTR.PROPERTY_ID between", value1,
                value2, "propertyId");

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
            addCriterion("OBJECT_RELATION_ATTR.PROPERTY_ID between", value1,
                value2, "propertyId");

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
            addCriterion("OBJECT_RELATION_ATTR.PROPERTY_ID not between",
                value1, value2, "propertyId");

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
            addCriterion("OBJECT_RELATION_ATTR.PROPERTY_ID not between",
                value1, value2, "propertyId");

            return this;
        } // end andPropertyIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIdIsNull() {
            addCriterion("OBJECT_RELATION_ATTR.RELATED_PROPERTY_ID is null");

            return this;
        } // end andRelatedPropertyIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIdIsNotNull() {
            addCriterion("OBJECT_RELATION_ATTR.RELATED_PROPERTY_ID is not null");

            return this;
        } // end andRelatedPropertyIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIdIsNotEmpty() {
            addCriterion(
                "OBJECT_RELATION_ATTR.RELATED_PROPERTY_ID is not null AND OBJECT_RELATION_ATTR.RELATED_PROPERTY_ID <> ''");

            return this;
        } // end andRelatedPropertyIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIdIsEmpty() {
            addCriterion(
                "(OBJECT_RELATION_ATTR.RELATED_PROPERTY_ID is null OR OBJECT_RELATION_ATTR.RELATED_PROPERTY_ID = '')");

            return this;
        } // end andRelatedPropertyIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIdEqualTo(long value) {
            return andRelatedPropertyIdEqualTo(Long.valueOf(value));
        } // end andRelatedPropertyIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIdEqualTo(java.lang.Long value) {
            addCriterion("OBJECT_RELATION_ATTR.RELATED_PROPERTY_ID =", value,
                "relatedPropertyId");

            return this;
        } // end andRelatedPropertyIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION_ATTR.RELATED_PROPERTY_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIdNotEqualTo(long value) {
            return andRelatedPropertyIdNotEqualTo(Long.valueOf(value));
        } // end andRelatedPropertyIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIdNotEqualTo(java.lang.Long value) {
            addCriterion("OBJECT_RELATION_ATTR.RELATED_PROPERTY_ID <>", value,
                "relatedPropertyId");

            return this;
        } // end andRelatedPropertyIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIdNotEqualToOrIsNull(long value) {
            return andRelatedPropertyIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andRelatedPropertyIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("OBJECT_RELATION_ATTR.RELATED_PROPERTY_ID is null OR OBJECT_RELATION_ATTR.RELATED_PROPERTY_ID <>",
                value, "relatedPropertyId");

            return this;
        } // end andRelatedPropertyIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION_ATTR.RELATED_PROPERTY_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIdGreaterThan(long value) {
            return andRelatedPropertyIdGreaterThan(Long.valueOf(value));
        } // end andRelatedPropertyIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIdGreaterThan(java.lang.Long value) {
            addCriterion("OBJECT_RELATION_ATTR.RELATED_PROPERTY_ID >", value,
                "relatedPropertyId");

            return this;
        } // end andRelatedPropertyIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION_ATTR.RELATED_PROPERTY_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIdGreaterThanOrEqualTo(long value) {
            return andRelatedPropertyIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andRelatedPropertyIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("OBJECT_RELATION_ATTR.RELATED_PROPERTY_ID >=", value,
                "relatedPropertyId");

            return this;
        } // end andRelatedPropertyIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION_ATTR.RELATED_PROPERTY_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIdLessThan(long value) {
            return andRelatedPropertyIdLessThan(Long.valueOf(value));
        } // end andRelatedPropertyIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIdLessThan(java.lang.Long value) {
            addCriterion("OBJECT_RELATION_ATTR.RELATED_PROPERTY_ID <", value,
                "relatedPropertyId");

            return this;
        } // end andRelatedPropertyIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION_ATTR.RELATED_PROPERTY_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIdLessThanOrEqualTo(long value) {
            return andRelatedPropertyIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andRelatedPropertyIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("OBJECT_RELATION_ATTR.RELATED_PROPERTY_ID <=", value,
                "relatedPropertyId");

            return this;
        } // end andRelatedPropertyIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION_ATTR.RELATED_PROPERTY_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIdIn(long[] values) {
            if (values.length == 1) {
                return andRelatedPropertyIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_RELATION_ATTR.RELATED_PROPERTY_ID in",
                    values, "relatedPropertyId");

                return this;
            } // end else
        } // end andRelatedPropertyIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIdNotIn(long[] values) {
            if (values.length == 1) {
                return andRelatedPropertyIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_RELATION_ATTR.RELATED_PROPERTY_ID not in",
                    values, "relatedPropertyId");

                return this;
            } // end else
        } // end andRelatedPropertyIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIdIn(List values) {
            if (values.size() == 1) {
                return andRelatedPropertyIdEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("OBJECT_RELATION_ATTR.RELATED_PROPERTY_ID in",
                    values, "relatedPropertyId");

                return this;
            } // end else
        } // end andRelatedPropertyIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIdNotIn(List values) {
            if (values.size() == 1) {
                return andRelatedPropertyIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("OBJECT_RELATION_ATTR.RELATED_PROPERTY_ID not in",
                    values, "relatedPropertyId");

                return this;
            } // end else
        } // end andRelatedPropertyIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIdIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedPropertyIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_RELATION_ATTR.RELATED_PROPERTY_ID in",
                    Arrays.asList(values), "relatedPropertyId");

                return this;
            } // end else
        } // end andRelatedPropertyIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedPropertyIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_RELATION_ATTR.RELATED_PROPERTY_ID not in",
                    Arrays.asList(values), "relatedPropertyId");

                return this;
            } // end else
        } // end andRelatedPropertyIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIdBetween(long value1, long value2) {
            addCriterion("OBJECT_RELATION_ATTR.RELATED_PROPERTY_ID between",
                value1, value2, "relatedPropertyId");

            return this;
        } // end andRelatedPropertyIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("OBJECT_RELATION_ATTR.RELATED_PROPERTY_ID between",
                value1, value2, "relatedPropertyId");

            return this;
        } // end andRelatedPropertyIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIdNotBetween(long value1, long value2) {
            addCriterion("OBJECT_RELATION_ATTR.RELATED_PROPERTY_ID not between",
                value1, value2, "relatedPropertyId");

            return this;
        } // end andRelatedPropertyIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("OBJECT_RELATION_ATTR.RELATED_PROPERTY_ID not between",
                value1, value2, "relatedPropertyId");

            return this;
        } // end andRelatedPropertyIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationDescriptionIsNull() {
            addCriterion("objectRelation.DESCRIPTION is null");

            return this;
        } // end andObjectRelationDescriptionIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationDescriptionIsNotNull() {
            addCriterion("objectRelation.DESCRIPTION is not null");

            return this;
        } // end andObjectRelationDescriptionIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationDescriptionIsNotEmpty() {
            addCriterion(
                "objectRelation.DESCRIPTION is not null AND objectRelation.DESCRIPTION <> ''");

            return this;
        } // end andObjectRelationDescriptionIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationDescriptionIsEmpty() {
            addCriterion(
                "(objectRelation.DESCRIPTION is null OR objectRelation.DESCRIPTION = '')");

            return this;
        } // end andObjectRelationDescriptionIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationDescriptionEqualTo(String value) {
            addCriterion("objectRelation.DESCRIPTION =", value,
                "objectRelationDescription");

            return this;
        } // end andObjectRelationDescriptionEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationDescriptionEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("objectRelation.DESCRIPTION");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectRelationDescriptionEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationDescriptionNotEqualTo(String value) {
            addCriterion("objectRelation.DESCRIPTION <>", value,
                "objectRelationDescription");

            return this;
        } // end andObjectRelationDescriptionNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationDescriptionNotEqualToOrIsNull(
            String value) {
            addCriterion("objectRelation.DESCRIPTION is null OR objectRelation.DESCRIPTION <>",
                value, "objectRelationDescription");

            return this;
        } // end andObjectRelationDescriptionNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationDescriptionNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("objectRelation.DESCRIPTION");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectRelationDescriptionNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationDescriptionGreaterThan(String value) {
            addCriterion("objectRelation.DESCRIPTION >", value,
                "objectRelationDescription");

            return this;
        } // end andObjectRelationDescriptionGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationDescriptionGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("objectRelation.DESCRIPTION");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectRelationDescriptionGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationDescriptionGreaterThanOrEqualTo(
            String value) {
            addCriterion("objectRelation.DESCRIPTION >=", value,
                "objectRelationDescription");

            return this;
        } // end andObjectRelationDescriptionGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationDescriptionGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("objectRelation.DESCRIPTION");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectRelationDescriptionGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationDescriptionLessThan(String value) {
            addCriterion("objectRelation.DESCRIPTION <", value,
                "objectRelationDescription");

            return this;
        } // end andObjectRelationDescriptionLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationDescriptionLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("objectRelation.DESCRIPTION");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectRelationDescriptionLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationDescriptionLessThanOrEqualTo(
            String value) {
            addCriterion("objectRelation.DESCRIPTION <=", value,
                "objectRelationDescription");

            return this;
        } // end andObjectRelationDescriptionLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationDescriptionLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("objectRelation.DESCRIPTION");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andObjectRelationDescriptionLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationDescriptionLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("objectRelation.DESCRIPTION like", buffer.toString(),
                "objectRelationDescription");

            return this;
        } // end andObjectRelationDescriptionLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationDescriptionNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("objectRelation.DESCRIPTION not like",
                buffer.toString(), "objectRelationDescription");

            return this;
        } // end andObjectRelationDescriptionNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationDescriptionIn(List values) {
            if (values.size() == 1) {
                return andObjectRelationDescriptionEqualTo((String) values.get(
                        0));
            } // end if
            else {
                addCriterion("objectRelation.DESCRIPTION in", values,
                    "objectRelationDescription");

                return this;
            } // end else
        } // end andObjectRelationDescriptionIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationDescriptionNotIn(List values) {
            if (values.size() == 1) {
                return andObjectRelationDescriptionNotEqualTo((String) values.get(
                        0));
            } // end if
            else {
                addCriterion("objectRelation.DESCRIPTION not in", values,
                    "objectRelationDescription");

                return this;
            } // end else
        } // end andObjectRelationDescriptionNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationDescriptionIn(Object[] values) {
            if (values.length == 1) {
                return andObjectRelationDescriptionEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("objectRelation.DESCRIPTION in",
                    Arrays.asList(values), "objectRelationDescription");

                return this;
            } // end else
        } // end andObjectRelationDescriptionIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationDescriptionNotIn(Object[] values) {
            if (values.length == 1) {
                return andObjectRelationDescriptionNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("objectRelation.DESCRIPTION not in",
                    Arrays.asList(values), "objectRelationDescription");

                return this;
            } // end else
        } // end andObjectRelationDescriptionNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationDescriptionBetween(String value1,
            String value2) {
            addCriterion("objectRelation.DESCRIPTION between", value1, value2,
                "objectRelationDescription");

            return this;
        } // end andObjectRelationDescriptionBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andObjectRelationDescriptionNotBetween(String value1,
            String value2) {
            addCriterion("objectRelation.DESCRIPTION not between", value1,
                value2, "objectRelationDescription");

            return this;
        } // end andObjectRelationDescriptionNotBetween()

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
        public Criteria andPropertyObjectIdIsNull() {
            addCriterion("property.OBJECT_ID is null");

            return this;
        } // end andPropertyObjectIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyObjectIdIsNotNull() {
            addCriterion("property.OBJECT_ID is not null");

            return this;
        } // end andPropertyObjectIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyObjectIdIsNotEmpty() {
            addCriterion(
                "property.OBJECT_ID is not null AND property.OBJECT_ID <> ''");

            return this;
        } // end andPropertyObjectIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyObjectIdIsEmpty() {
            addCriterion(
                "(property.OBJECT_ID is null OR property.OBJECT_ID = '')");

            return this;
        } // end andPropertyObjectIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyObjectIdEqualTo(long value) {
            return andPropertyObjectIdEqualTo(Long.valueOf(value));
        } // end andPropertyObjectIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyObjectIdEqualTo(java.lang.Long value) {
            addCriterion("property.OBJECT_ID =", value, "propertyObjectId");

            return this;
        } // end andPropertyObjectIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyObjectIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.OBJECT_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyObjectIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyObjectIdNotEqualTo(long value) {
            return andPropertyObjectIdNotEqualTo(Long.valueOf(value));
        } // end andPropertyObjectIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyObjectIdNotEqualTo(java.lang.Long value) {
            addCriterion("property.OBJECT_ID <>", value, "propertyObjectId");

            return this;
        } // end andPropertyObjectIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyObjectIdNotEqualToOrIsNull(long value) {
            return andPropertyObjectIdNotEqualToOrIsNull(Long.valueOf(value));
        } // end andPropertyObjectIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyObjectIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("property.OBJECT_ID is null OR property.OBJECT_ID <>",
                value, "propertyObjectId");

            return this;
        } // end andPropertyObjectIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyObjectIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.OBJECT_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyObjectIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyObjectIdGreaterThan(long value) {
            return andPropertyObjectIdGreaterThan(Long.valueOf(value));
        } // end andPropertyObjectIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyObjectIdGreaterThan(java.lang.Long value) {
            addCriterion("property.OBJECT_ID >", value, "propertyObjectId");

            return this;
        } // end andPropertyObjectIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyObjectIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.OBJECT_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyObjectIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyObjectIdGreaterThanOrEqualTo(long value) {
            return andPropertyObjectIdGreaterThanOrEqualTo(Long.valueOf(value));
        } // end andPropertyObjectIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyObjectIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("property.OBJECT_ID >=", value, "propertyObjectId");

            return this;
        } // end andPropertyObjectIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyObjectIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.OBJECT_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyObjectIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyObjectIdLessThan(long value) {
            return andPropertyObjectIdLessThan(Long.valueOf(value));
        } // end andPropertyObjectIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyObjectIdLessThan(java.lang.Long value) {
            addCriterion("property.OBJECT_ID <", value, "propertyObjectId");

            return this;
        } // end andPropertyObjectIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyObjectIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.OBJECT_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyObjectIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyObjectIdLessThanOrEqualTo(long value) {
            return andPropertyObjectIdLessThanOrEqualTo(Long.valueOf(value));
        } // end andPropertyObjectIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyObjectIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("property.OBJECT_ID <=", value, "propertyObjectId");

            return this;
        } // end andPropertyObjectIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyObjectIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.OBJECT_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyObjectIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyObjectIdIn(long[] values) {
            if (values.length == 1) {
                return andPropertyObjectIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("property.OBJECT_ID in", values, "propertyObjectId");

                return this;
            } // end else
        } // end andPropertyObjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyObjectIdNotIn(long[] values) {
            if (values.length == 1) {
                return andPropertyObjectIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("property.OBJECT_ID not in", values,
                    "propertyObjectId");

                return this;
            } // end else
        } // end andPropertyObjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyObjectIdIn(List values) {
            if (values.size() == 1) {
                return andPropertyObjectIdEqualTo((java.lang.Long) values.get(0));
            } // end if
            else {
                addCriterion("property.OBJECT_ID in", values, "propertyObjectId");

                return this;
            } // end else
        } // end andPropertyObjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyObjectIdNotIn(List values) {
            if (values.size() == 1) {
                return andPropertyObjectIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("property.OBJECT_ID not in", values,
                    "propertyObjectId");

                return this;
            } // end else
        } // end andPropertyObjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyObjectIdIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyObjectIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("property.OBJECT_ID in", Arrays.asList(values),
                    "propertyObjectId");

                return this;
            } // end else
        } // end andPropertyObjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyObjectIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyObjectIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("property.OBJECT_ID not in",
                    Arrays.asList(values), "propertyObjectId");

                return this;
            } // end else
        } // end andPropertyObjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyObjectIdBetween(long value1, long value2) {
            addCriterion("property.OBJECT_ID between", value1, value2,
                "propertyObjectId");

            return this;
        } // end andPropertyObjectIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyObjectIdBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("property.OBJECT_ID between", value1, value2,
                "propertyObjectId");

            return this;
        } // end andPropertyObjectIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyObjectIdNotBetween(long value1, long value2) {
            addCriterion("property.OBJECT_ID not between", value1, value2,
                "propertyObjectId");

            return this;
        } // end andPropertyObjectIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyObjectIdNotBetween(java.lang.Long value1,
            java.lang.Long value2) {
            addCriterion("property.OBJECT_ID not between", value1, value2,
                "propertyObjectId");

            return this;
        } // end andPropertyObjectIdNotBetween()

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
        public Criteria andPropertyValueIsNull() {
            addCriterion("property.VALUE is null");

            return this;
        } // end andPropertyValueIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyValueIsNotNull() {
            addCriterion("property.VALUE is not null");

            return this;
        } // end andPropertyValueIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyValueIsNotEmpty() {
            addCriterion("property.VALUE is not null AND property.VALUE <> ''");

            return this;
        } // end andPropertyValueIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyValueIsEmpty() {
            addCriterion("(property.VALUE is null OR property.VALUE = '')");

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
            addCriterion("property.VALUE =", value, "propertyValue");

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
            StringBuffer str = new StringBuffer("property.VALUE");
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
            addCriterion("property.VALUE <>", value, "propertyValue");

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
            addCriterion("property.VALUE is null OR property.VALUE <>", value,
                "propertyValue");

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
            StringBuffer str = new StringBuffer("property.VALUE");
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
            addCriterion("property.VALUE >", value, "propertyValue");

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
            StringBuffer str = new StringBuffer("property.VALUE");
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
            addCriterion("property.VALUE >=", value, "propertyValue");

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
            StringBuffer str = new StringBuffer("property.VALUE");
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
            addCriterion("property.VALUE <", value, "propertyValue");

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
            StringBuffer str = new StringBuffer("property.VALUE");
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
            addCriterion("property.VALUE <=", value, "propertyValue");

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
            StringBuffer str = new StringBuffer("property.VALUE");
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
            addCriterion("property.VALUE like", buffer.toString(),
                "propertyValue");

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
            addCriterion("property.VALUE not like", buffer.toString(),
                "propertyValue");

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
                addCriterion("property.VALUE in", values, "propertyValue");

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
                addCriterion("property.VALUE not in", values, "propertyValue");

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
                addCriterion("property.VALUE in", Arrays.asList(values),
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
        public Criteria andPropertyValueNotIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyValueNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("property.VALUE not in", Arrays.asList(values),
                    "propertyValue");

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
            addCriterion("property.VALUE between", value1, value2,
                "propertyValue");

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
            addCriterion("property.VALUE not between", value1, value2,
                "propertyValue");

            return this;
        } // end andPropertyValueNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataSizeIsNull() {
            addCriterion("relatedProperty.DATA_SIZE is null");

            return this;
        } // end andRelatedPropertyDataSizeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataSizeIsNotNull() {
            addCriterion("relatedProperty.DATA_SIZE is not null");

            return this;
        } // end andRelatedPropertyDataSizeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataSizeIsNotEmpty() {
            addCriterion(
                "relatedProperty.DATA_SIZE is not null AND relatedProperty.DATA_SIZE <> ''");

            return this;
        } // end andRelatedPropertyDataSizeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataSizeIsEmpty() {
            addCriterion(
                "(relatedProperty.DATA_SIZE is null OR relatedProperty.DATA_SIZE = '')");

            return this;
        } // end andRelatedPropertyDataSizeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataSizeEqualTo(Integer value) {
            addCriterion("relatedProperty.DATA_SIZE =", value,
                "relatedPropertyDataSize");

            return this;
        } // end andRelatedPropertyDataSizeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataSizeEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.DATA_SIZE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyDataSizeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataSizeNotEqualTo(Integer value) {
            addCriterion("relatedProperty.DATA_SIZE <>", value,
                "relatedPropertyDataSize");

            return this;
        } // end andRelatedPropertyDataSizeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataSizeNotEqualToOrIsNull(
            Integer value) {
            addCriterion("relatedProperty.DATA_SIZE is null OR relatedProperty.DATA_SIZE <>",
                value, "relatedPropertyDataSize");

            return this;
        } // end andRelatedPropertyDataSizeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataSizeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.DATA_SIZE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyDataSizeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataSizeGreaterThan(Integer value) {
            addCriterion("relatedProperty.DATA_SIZE >", value,
                "relatedPropertyDataSize");

            return this;
        } // end andRelatedPropertyDataSizeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataSizeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.DATA_SIZE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyDataSizeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataSizeGreaterThanOrEqualTo(
            Integer value) {
            addCriterion("relatedProperty.DATA_SIZE >=", value,
                "relatedPropertyDataSize");

            return this;
        } // end andRelatedPropertyDataSizeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataSizeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.DATA_SIZE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyDataSizeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataSizeLessThan(Integer value) {
            addCriterion("relatedProperty.DATA_SIZE <", value,
                "relatedPropertyDataSize");

            return this;
        } // end andRelatedPropertyDataSizeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataSizeLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.DATA_SIZE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyDataSizeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataSizeLessThanOrEqualTo(
            Integer value) {
            addCriterion("relatedProperty.DATA_SIZE <=", value,
                "relatedPropertyDataSize");

            return this;
        } // end andRelatedPropertyDataSizeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataSizeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.DATA_SIZE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyDataSizeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataSizeIn(List values) {
            if (values.size() == 1) {
                return andRelatedPropertyDataSizeEqualTo((Integer) values.get(0));
            } // end if
            else {
                addCriterion("relatedProperty.DATA_SIZE in", values,
                    "relatedPropertyDataSize");

                return this;
            } // end else
        } // end andRelatedPropertyDataSizeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataSizeNotIn(List values) {
            if (values.size() == 1) {
                return andRelatedPropertyDataSizeNotEqualTo((Integer) values.get(
                        0));
            } // end if
            else {
                addCriterion("relatedProperty.DATA_SIZE not in", values,
                    "relatedPropertyDataSize");

                return this;
            } // end else
        } // end andRelatedPropertyDataSizeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataSizeIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedPropertyDataSizeEqualTo((Integer) values[0]);
            } // end if
            else {
                addCriterion("relatedProperty.DATA_SIZE in",
                    Arrays.asList(values), "relatedPropertyDataSize");

                return this;
            } // end else
        } // end andRelatedPropertyDataSizeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataSizeNotIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedPropertyDataSizeNotEqualTo((Integer) values[0]);
            } // end if
            else {
                addCriterion("relatedProperty.DATA_SIZE not in",
                    Arrays.asList(values), "relatedPropertyDataSize");

                return this;
            } // end else
        } // end andRelatedPropertyDataSizeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataSizeBetween(Integer value1,
            Integer value2) {
            addCriterion("relatedProperty.DATA_SIZE between", value1, value2,
                "relatedPropertyDataSize");

            return this;
        } // end andRelatedPropertyDataSizeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataSizeNotBetween(Integer value1,
            Integer value2) {
            addCriterion("relatedProperty.DATA_SIZE not between", value1,
                value2, "relatedPropertyDataSize");

            return this;
        } // end andRelatedPropertyDataSizeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataTypeIsNull() {
            addCriterion("relatedProperty.DATA_TYPE is null");

            return this;
        } // end andRelatedPropertyDataTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataTypeIsNotNull() {
            addCriterion("relatedProperty.DATA_TYPE is not null");

            return this;
        } // end andRelatedPropertyDataTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataTypeIsNotEmpty() {
            addCriterion(
                "relatedProperty.DATA_TYPE is not null AND relatedProperty.DATA_TYPE <> ''");

            return this;
        } // end andRelatedPropertyDataTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataTypeIsEmpty() {
            addCriterion(
                "(relatedProperty.DATA_TYPE is null OR relatedProperty.DATA_TYPE = '')");

            return this;
        } // end andRelatedPropertyDataTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataTypeEqualTo(String value) {
            addCriterion("relatedProperty.DATA_TYPE =", value,
                "relatedPropertyDataType");

            return this;
        } // end andRelatedPropertyDataTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataTypeEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.DATA_TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyDataTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataTypeNotEqualTo(String value) {
            addCriterion("relatedProperty.DATA_TYPE <>", value,
                "relatedPropertyDataType");

            return this;
        } // end andRelatedPropertyDataTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataTypeNotEqualToOrIsNull(
            String value) {
            addCriterion("relatedProperty.DATA_TYPE is null OR relatedProperty.DATA_TYPE <>",
                value, "relatedPropertyDataType");

            return this;
        } // end andRelatedPropertyDataTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataTypeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.DATA_TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyDataTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataTypeGreaterThan(String value) {
            addCriterion("relatedProperty.DATA_TYPE >", value,
                "relatedPropertyDataType");

            return this;
        } // end andRelatedPropertyDataTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataTypeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.DATA_TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyDataTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataTypeGreaterThanOrEqualTo(
            String value) {
            addCriterion("relatedProperty.DATA_TYPE >=", value,
                "relatedPropertyDataType");

            return this;
        } // end andRelatedPropertyDataTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.DATA_TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyDataTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataTypeLessThan(String value) {
            addCriterion("relatedProperty.DATA_TYPE <", value,
                "relatedPropertyDataType");

            return this;
        } // end andRelatedPropertyDataTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataTypeLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.DATA_TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyDataTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataTypeLessThanOrEqualTo(
            String value) {
            addCriterion("relatedProperty.DATA_TYPE <=", value,
                "relatedPropertyDataType");

            return this;
        } // end andRelatedPropertyDataTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.DATA_TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyDataTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("relatedProperty.DATA_TYPE like", buffer.toString(),
                "relatedPropertyDataType");

            return this;
        } // end andRelatedPropertyDataTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("relatedProperty.DATA_TYPE not like",
                buffer.toString(), "relatedPropertyDataType");

            return this;
        } // end andRelatedPropertyDataTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataTypeIn(List values) {
            if (values.size() == 1) {
                return andRelatedPropertyDataTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("relatedProperty.DATA_TYPE in", values,
                    "relatedPropertyDataType");

                return this;
            } // end else
        } // end andRelatedPropertyDataTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataTypeNotIn(List values) {
            if (values.size() == 1) {
                return andRelatedPropertyDataTypeNotEqualTo((String) values.get(
                        0));
            } // end if
            else {
                addCriterion("relatedProperty.DATA_TYPE not in", values,
                    "relatedPropertyDataType");

                return this;
            } // end else
        } // end andRelatedPropertyDataTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataTypeIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedPropertyDataTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("relatedProperty.DATA_TYPE in",
                    Arrays.asList(values), "relatedPropertyDataType");

                return this;
            } // end else
        } // end andRelatedPropertyDataTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedPropertyDataTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("relatedProperty.DATA_TYPE not in",
                    Arrays.asList(values), "relatedPropertyDataType");

                return this;
            } // end else
        } // end andRelatedPropertyDataTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataTypeBetween(String value1,
            String value2) {
            addCriterion("relatedProperty.DATA_TYPE between", value1, value2,
                "relatedPropertyDataType");

            return this;
        } // end andRelatedPropertyDataTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDataTypeNotBetween(String value1,
            String value2) {
            addCriterion("relatedProperty.DATA_TYPE not between", value1,
                value2, "relatedPropertyDataType");

            return this;
        } // end andRelatedPropertyDataTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDescriptionIsNull() {
            addCriterion("relatedProperty.DESCRIPTION is null");

            return this;
        } // end andRelatedPropertyDescriptionIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDescriptionIsNotNull() {
            addCriterion("relatedProperty.DESCRIPTION is not null");

            return this;
        } // end andRelatedPropertyDescriptionIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDescriptionIsNotEmpty() {
            addCriterion(
                "relatedProperty.DESCRIPTION is not null AND relatedProperty.DESCRIPTION <> ''");

            return this;
        } // end andRelatedPropertyDescriptionIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDescriptionIsEmpty() {
            addCriterion(
                "(relatedProperty.DESCRIPTION is null OR relatedProperty.DESCRIPTION = '')");

            return this;
        } // end andRelatedPropertyDescriptionIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDescriptionEqualTo(String value) {
            addCriterion("relatedProperty.DESCRIPTION =", value,
                "relatedPropertyDescription");

            return this;
        } // end andRelatedPropertyDescriptionEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDescriptionEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.DESCRIPTION");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyDescriptionEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDescriptionNotEqualTo(String value) {
            addCriterion("relatedProperty.DESCRIPTION <>", value,
                "relatedPropertyDescription");

            return this;
        } // end andRelatedPropertyDescriptionNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDescriptionNotEqualToOrIsNull(
            String value) {
            addCriterion("relatedProperty.DESCRIPTION is null OR relatedProperty.DESCRIPTION <>",
                value, "relatedPropertyDescription");

            return this;
        } // end andRelatedPropertyDescriptionNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDescriptionNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.DESCRIPTION");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyDescriptionNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDescriptionGreaterThan(String value) {
            addCriterion("relatedProperty.DESCRIPTION >", value,
                "relatedPropertyDescription");

            return this;
        } // end andRelatedPropertyDescriptionGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDescriptionGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.DESCRIPTION");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyDescriptionGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDescriptionGreaterThanOrEqualTo(
            String value) {
            addCriterion("relatedProperty.DESCRIPTION >=", value,
                "relatedPropertyDescription");

            return this;
        } // end andRelatedPropertyDescriptionGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDescriptionGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.DESCRIPTION");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyDescriptionGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDescriptionLessThan(String value) {
            addCriterion("relatedProperty.DESCRIPTION <", value,
                "relatedPropertyDescription");

            return this;
        } // end andRelatedPropertyDescriptionLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDescriptionLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.DESCRIPTION");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyDescriptionLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDescriptionLessThanOrEqualTo(
            String value) {
            addCriterion("relatedProperty.DESCRIPTION <=", value,
                "relatedPropertyDescription");

            return this;
        } // end andRelatedPropertyDescriptionLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDescriptionLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.DESCRIPTION");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyDescriptionLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDescriptionLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("relatedProperty.DESCRIPTION like", buffer.toString(),
                "relatedPropertyDescription");

            return this;
        } // end andRelatedPropertyDescriptionLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDescriptionNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("relatedProperty.DESCRIPTION not like",
                buffer.toString(), "relatedPropertyDescription");

            return this;
        } // end andRelatedPropertyDescriptionNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDescriptionIn(List values) {
            if (values.size() == 1) {
                return andRelatedPropertyDescriptionEqualTo((String) values.get(
                        0));
            } // end if
            else {
                addCriterion("relatedProperty.DESCRIPTION in", values,
                    "relatedPropertyDescription");

                return this;
            } // end else
        } // end andRelatedPropertyDescriptionIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDescriptionNotIn(List values) {
            if (values.size() == 1) {
                return andRelatedPropertyDescriptionNotEqualTo((String) values.get(
                        0));
            } // end if
            else {
                addCriterion("relatedProperty.DESCRIPTION not in", values,
                    "relatedPropertyDescription");

                return this;
            } // end else
        } // end andRelatedPropertyDescriptionNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDescriptionIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedPropertyDescriptionEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("relatedProperty.DESCRIPTION in",
                    Arrays.asList(values), "relatedPropertyDescription");

                return this;
            } // end else
        } // end andRelatedPropertyDescriptionIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDescriptionNotIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedPropertyDescriptionNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("relatedProperty.DESCRIPTION not in",
                    Arrays.asList(values), "relatedPropertyDescription");

                return this;
            } // end else
        } // end andRelatedPropertyDescriptionNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDescriptionBetween(String value1,
            String value2) {
            addCriterion("relatedProperty.DESCRIPTION between", value1, value2,
                "relatedPropertyDescription");

            return this;
        } // end andRelatedPropertyDescriptionBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyDescriptionNotBetween(String value1,
            String value2) {
            addCriterion("relatedProperty.DESCRIPTION not between", value1,
                value2, "relatedPropertyDescription");

            return this;
        } // end andRelatedPropertyDescriptionNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsEnumIsNull() {
            addCriterion("relatedProperty.IS_ENUM is null");

            return this;
        } // end andRelatedPropertyIsEnumIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsEnumIsNotNull() {
            addCriterion("relatedProperty.IS_ENUM is not null");

            return this;
        } // end andRelatedPropertyIsEnumIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsEnumIsNotEmpty() {
            addCriterion(
                "relatedProperty.IS_ENUM is not null AND relatedProperty.IS_ENUM <> ''");

            return this;
        } // end andRelatedPropertyIsEnumIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsEnumIsEmpty() {
            addCriterion(
                "(relatedProperty.IS_ENUM is null OR relatedProperty.IS_ENUM = '')");

            return this;
        } // end andRelatedPropertyIsEnumIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsEnumEqualTo(String value) {
            addCriterion("relatedProperty.IS_ENUM =", value,
                "relatedPropertyIsEnum");

            return this;
        } // end andRelatedPropertyIsEnumEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsEnumEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.IS_ENUM");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyIsEnumEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsEnumNotEqualTo(String value) {
            addCriterion("relatedProperty.IS_ENUM <>", value,
                "relatedPropertyIsEnum");

            return this;
        } // end andRelatedPropertyIsEnumNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsEnumNotEqualToOrIsNull(String value) {
            addCriterion("relatedProperty.IS_ENUM is null OR relatedProperty.IS_ENUM <>",
                value, "relatedPropertyIsEnum");

            return this;
        } // end andRelatedPropertyIsEnumNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsEnumNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.IS_ENUM");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyIsEnumNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsEnumGreaterThan(String value) {
            addCriterion("relatedProperty.IS_ENUM >", value,
                "relatedPropertyIsEnum");

            return this;
        } // end andRelatedPropertyIsEnumGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsEnumGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.IS_ENUM");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyIsEnumGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsEnumGreaterThanOrEqualTo(
            String value) {
            addCriterion("relatedProperty.IS_ENUM >=", value,
                "relatedPropertyIsEnum");

            return this;
        } // end andRelatedPropertyIsEnumGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsEnumGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.IS_ENUM");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyIsEnumGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsEnumLessThan(String value) {
            addCriterion("relatedProperty.IS_ENUM <", value,
                "relatedPropertyIsEnum");

            return this;
        } // end andRelatedPropertyIsEnumLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsEnumLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.IS_ENUM");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyIsEnumLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsEnumLessThanOrEqualTo(String value) {
            addCriterion("relatedProperty.IS_ENUM <=", value,
                "relatedPropertyIsEnum");

            return this;
        } // end andRelatedPropertyIsEnumLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsEnumLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.IS_ENUM");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyIsEnumLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsEnumLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("relatedProperty.IS_ENUM like", buffer.toString(),
                "relatedPropertyIsEnum");

            return this;
        } // end andRelatedPropertyIsEnumLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsEnumNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("relatedProperty.IS_ENUM not like", buffer.toString(),
                "relatedPropertyIsEnum");

            return this;
        } // end andRelatedPropertyIsEnumNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsEnumIn(List values) {
            if (values.size() == 1) {
                return andRelatedPropertyIsEnumEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("relatedProperty.IS_ENUM in", values,
                    "relatedPropertyIsEnum");

                return this;
            } // end else
        } // end andRelatedPropertyIsEnumIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsEnumNotIn(List values) {
            if (values.size() == 1) {
                return andRelatedPropertyIsEnumNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("relatedProperty.IS_ENUM not in", values,
                    "relatedPropertyIsEnum");

                return this;
            } // end else
        } // end andRelatedPropertyIsEnumNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsEnumIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedPropertyIsEnumEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("relatedProperty.IS_ENUM in",
                    Arrays.asList(values), "relatedPropertyIsEnum");

                return this;
            } // end else
        } // end andRelatedPropertyIsEnumIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsEnumNotIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedPropertyIsEnumNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("relatedProperty.IS_ENUM not in",
                    Arrays.asList(values), "relatedPropertyIsEnum");

                return this;
            } // end else
        } // end andRelatedPropertyIsEnumNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsEnumBetween(String value1,
            String value2) {
            addCriterion("relatedProperty.IS_ENUM between", value1, value2,
                "relatedPropertyIsEnum");

            return this;
        } // end andRelatedPropertyIsEnumBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsEnumNotBetween(String value1,
            String value2) {
            addCriterion("relatedProperty.IS_ENUM not between", value1, value2,
                "relatedPropertyIsEnum");

            return this;
        } // end andRelatedPropertyIsEnumNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsGenerateIsNull() {
            addCriterion("relatedProperty.IS_GENERATE is null");

            return this;
        } // end andRelatedPropertyIsGenerateIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsGenerateIsNotNull() {
            addCriterion("relatedProperty.IS_GENERATE is not null");

            return this;
        } // end andRelatedPropertyIsGenerateIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsGenerateIsNotEmpty() {
            addCriterion(
                "relatedProperty.IS_GENERATE is not null AND relatedProperty.IS_GENERATE <> ''");

            return this;
        } // end andRelatedPropertyIsGenerateIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsGenerateIsEmpty() {
            addCriterion(
                "(relatedProperty.IS_GENERATE is null OR relatedProperty.IS_GENERATE = '')");

            return this;
        } // end andRelatedPropertyIsGenerateIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsGenerateEqualTo(String value) {
            addCriterion("relatedProperty.IS_GENERATE =", value,
                "relatedPropertyIsGenerate");

            return this;
        } // end andRelatedPropertyIsGenerateEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsGenerateEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.IS_GENERATE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyIsGenerateEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsGenerateNotEqualTo(String value) {
            addCriterion("relatedProperty.IS_GENERATE <>", value,
                "relatedPropertyIsGenerate");

            return this;
        } // end andRelatedPropertyIsGenerateNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsGenerateNotEqualToOrIsNull(
            String value) {
            addCriterion("relatedProperty.IS_GENERATE is null OR relatedProperty.IS_GENERATE <>",
                value, "relatedPropertyIsGenerate");

            return this;
        } // end andRelatedPropertyIsGenerateNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsGenerateNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.IS_GENERATE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyIsGenerateNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsGenerateGreaterThan(String value) {
            addCriterion("relatedProperty.IS_GENERATE >", value,
                "relatedPropertyIsGenerate");

            return this;
        } // end andRelatedPropertyIsGenerateGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsGenerateGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.IS_GENERATE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyIsGenerateGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsGenerateGreaterThanOrEqualTo(
            String value) {
            addCriterion("relatedProperty.IS_GENERATE >=", value,
                "relatedPropertyIsGenerate");

            return this;
        } // end andRelatedPropertyIsGenerateGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsGenerateGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.IS_GENERATE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyIsGenerateGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsGenerateLessThan(String value) {
            addCriterion("relatedProperty.IS_GENERATE <", value,
                "relatedPropertyIsGenerate");

            return this;
        } // end andRelatedPropertyIsGenerateLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsGenerateLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.IS_GENERATE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyIsGenerateLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsGenerateLessThanOrEqualTo(
            String value) {
            addCriterion("relatedProperty.IS_GENERATE <=", value,
                "relatedPropertyIsGenerate");

            return this;
        } // end andRelatedPropertyIsGenerateLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsGenerateLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.IS_GENERATE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyIsGenerateLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsGenerateLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("relatedProperty.IS_GENERATE like", buffer.toString(),
                "relatedPropertyIsGenerate");

            return this;
        } // end andRelatedPropertyIsGenerateLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsGenerateNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("relatedProperty.IS_GENERATE not like",
                buffer.toString(), "relatedPropertyIsGenerate");

            return this;
        } // end andRelatedPropertyIsGenerateNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsGenerateIn(List values) {
            if (values.size() == 1) {
                return andRelatedPropertyIsGenerateEqualTo((String) values.get(
                        0));
            } // end if
            else {
                addCriterion("relatedProperty.IS_GENERATE in", values,
                    "relatedPropertyIsGenerate");

                return this;
            } // end else
        } // end andRelatedPropertyIsGenerateIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsGenerateNotIn(List values) {
            if (values.size() == 1) {
                return andRelatedPropertyIsGenerateNotEqualTo((String) values.get(
                        0));
            } // end if
            else {
                addCriterion("relatedProperty.IS_GENERATE not in", values,
                    "relatedPropertyIsGenerate");

                return this;
            } // end else
        } // end andRelatedPropertyIsGenerateNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsGenerateIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedPropertyIsGenerateEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("relatedProperty.IS_GENERATE in",
                    Arrays.asList(values), "relatedPropertyIsGenerate");

                return this;
            } // end else
        } // end andRelatedPropertyIsGenerateIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsGenerateNotIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedPropertyIsGenerateNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("relatedProperty.IS_GENERATE not in",
                    Arrays.asList(values), "relatedPropertyIsGenerate");

                return this;
            } // end else
        } // end andRelatedPropertyIsGenerateNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsGenerateBetween(String value1,
            String value2) {
            addCriterion("relatedProperty.IS_GENERATE between", value1, value2,
                "relatedPropertyIsGenerate");

            return this;
        } // end andRelatedPropertyIsGenerateBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsGenerateNotBetween(String value1,
            String value2) {
            addCriterion("relatedProperty.IS_GENERATE not between", value1,
                value2, "relatedPropertyIsGenerate");

            return this;
        } // end andRelatedPropertyIsGenerateNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsPrimaryPropertyIsNull() {
            addCriterion("relatedProperty.IS_PRIMARY_PROPERTY is null");

            return this;
        } // end andRelatedPropertyIsPrimaryPropertyIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsPrimaryPropertyIsNotNull() {
            addCriterion("relatedProperty.IS_PRIMARY_PROPERTY is not null");

            return this;
        } // end andRelatedPropertyIsPrimaryPropertyIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsPrimaryPropertyIsNotEmpty() {
            addCriterion(
                "relatedProperty.IS_PRIMARY_PROPERTY is not null AND relatedProperty.IS_PRIMARY_PROPERTY <> ''");

            return this;
        } // end andRelatedPropertyIsPrimaryPropertyIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsPrimaryPropertyIsEmpty() {
            addCriterion(
                "(relatedProperty.IS_PRIMARY_PROPERTY is null OR relatedProperty.IS_PRIMARY_PROPERTY = '')");

            return this;
        } // end andRelatedPropertyIsPrimaryPropertyIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsPrimaryPropertyEqualTo(String value) {
            addCriterion("relatedProperty.IS_PRIMARY_PROPERTY =", value,
                "relatedPropertyIsPrimaryProperty");

            return this;
        } // end andRelatedPropertyIsPrimaryPropertyEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsPrimaryPropertyEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "relatedProperty.IS_PRIMARY_PROPERTY");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyIsPrimaryPropertyEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsPrimaryPropertyNotEqualTo(
            String value) {
            addCriterion("relatedProperty.IS_PRIMARY_PROPERTY <>", value,
                "relatedPropertyIsPrimaryProperty");

            return this;
        } // end andRelatedPropertyIsPrimaryPropertyNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsPrimaryPropertyNotEqualToOrIsNull(
            String value) {
            addCriterion("relatedProperty.IS_PRIMARY_PROPERTY is null OR relatedProperty.IS_PRIMARY_PROPERTY <>",
                value, "relatedPropertyIsPrimaryProperty");

            return this;
        } // end andRelatedPropertyIsPrimaryPropertyNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsPrimaryPropertyNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "relatedProperty.IS_PRIMARY_PROPERTY");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyIsPrimaryPropertyNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsPrimaryPropertyGreaterThan(
            String value) {
            addCriterion("relatedProperty.IS_PRIMARY_PROPERTY >", value,
                "relatedPropertyIsPrimaryProperty");

            return this;
        } // end andRelatedPropertyIsPrimaryPropertyGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsPrimaryPropertyGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "relatedProperty.IS_PRIMARY_PROPERTY");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyIsPrimaryPropertyGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsPrimaryPropertyGreaterThanOrEqualTo(
            String value) {
            addCriterion("relatedProperty.IS_PRIMARY_PROPERTY >=", value,
                "relatedPropertyIsPrimaryProperty");

            return this;
        } // end andRelatedPropertyIsPrimaryPropertyGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsPrimaryPropertyGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "relatedProperty.IS_PRIMARY_PROPERTY");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyIsPrimaryPropertyGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsPrimaryPropertyLessThan(
            String value) {
            addCriterion("relatedProperty.IS_PRIMARY_PROPERTY <", value,
                "relatedPropertyIsPrimaryProperty");

            return this;
        } // end andRelatedPropertyIsPrimaryPropertyLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsPrimaryPropertyLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "relatedProperty.IS_PRIMARY_PROPERTY");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyIsPrimaryPropertyLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsPrimaryPropertyLessThanOrEqualTo(
            String value) {
            addCriterion("relatedProperty.IS_PRIMARY_PROPERTY <=", value,
                "relatedPropertyIsPrimaryProperty");

            return this;
        } // end andRelatedPropertyIsPrimaryPropertyLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsPrimaryPropertyLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "relatedProperty.IS_PRIMARY_PROPERTY");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyIsPrimaryPropertyLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsPrimaryPropertyLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("relatedProperty.IS_PRIMARY_PROPERTY like",
                buffer.toString(), "relatedPropertyIsPrimaryProperty");

            return this;
        } // end andRelatedPropertyIsPrimaryPropertyLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsPrimaryPropertyNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("relatedProperty.IS_PRIMARY_PROPERTY not like",
                buffer.toString(), "relatedPropertyIsPrimaryProperty");

            return this;
        } // end andRelatedPropertyIsPrimaryPropertyNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsPrimaryPropertyIn(List values) {
            if (values.size() == 1) {
                return andRelatedPropertyIsPrimaryPropertyEqualTo((String) values.get(
                        0));
            } // end if
            else {
                addCriterion("relatedProperty.IS_PRIMARY_PROPERTY in", values,
                    "relatedPropertyIsPrimaryProperty");

                return this;
            } // end else
        } // end andRelatedPropertyIsPrimaryPropertyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsPrimaryPropertyNotIn(List values) {
            if (values.size() == 1) {
                return andRelatedPropertyIsPrimaryPropertyNotEqualTo((String) values.get(
                        0));
            } // end if
            else {
                addCriterion("relatedProperty.IS_PRIMARY_PROPERTY not in",
                    values, "relatedPropertyIsPrimaryProperty");

                return this;
            } // end else
        } // end andRelatedPropertyIsPrimaryPropertyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsPrimaryPropertyIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedPropertyIsPrimaryPropertyEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("relatedProperty.IS_PRIMARY_PROPERTY in",
                    Arrays.asList(values), "relatedPropertyIsPrimaryProperty");

                return this;
            } // end else
        } // end andRelatedPropertyIsPrimaryPropertyIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsPrimaryPropertyNotIn(
            Object[] values) {
            if (values.length == 1) {
                return andRelatedPropertyIsPrimaryPropertyNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("relatedProperty.IS_PRIMARY_PROPERTY not in",
                    Arrays.asList(values), "relatedPropertyIsPrimaryProperty");

                return this;
            } // end else
        } // end andRelatedPropertyIsPrimaryPropertyNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsPrimaryPropertyBetween(
            String value1, String value2) {
            addCriterion("relatedProperty.IS_PRIMARY_PROPERTY between", value1,
                value2, "relatedPropertyIsPrimaryProperty");

            return this;
        } // end andRelatedPropertyIsPrimaryPropertyBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsPrimaryPropertyNotBetween(
            String value1, String value2) {
            addCriterion("relatedProperty.IS_PRIMARY_PROPERTY not between",
                value1, value2, "relatedPropertyIsPrimaryProperty");

            return this;
        } // end andRelatedPropertyIsPrimaryPropertyNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyNameIsNull() {
            addCriterion("relatedProperty.NAME is null");

            return this;
        } // end andRelatedPropertyNameIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyNameIsNotNull() {
            addCriterion("relatedProperty.NAME is not null");

            return this;
        } // end andRelatedPropertyNameIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyNameIsNotEmpty() {
            addCriterion(
                "relatedProperty.NAME is not null AND relatedProperty.NAME <> ''");

            return this;
        } // end andRelatedPropertyNameIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyNameIsEmpty() {
            addCriterion(
                "(relatedProperty.NAME is null OR relatedProperty.NAME = '')");

            return this;
        } // end andRelatedPropertyNameIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyNameEqualTo(String value) {
            addCriterion("relatedProperty.NAME =", value, "relatedPropertyName");

            return this;
        } // end andRelatedPropertyNameEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyNameEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.NAME");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyNameEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyNameNotEqualTo(String value) {
            addCriterion("relatedProperty.NAME <>", value, "relatedPropertyName");

            return this;
        } // end andRelatedPropertyNameNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyNameNotEqualToOrIsNull(String value) {
            addCriterion("relatedProperty.NAME is null OR relatedProperty.NAME <>",
                value, "relatedPropertyName");

            return this;
        } // end andRelatedPropertyNameNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyNameNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.NAME");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyNameNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyNameGreaterThan(String value) {
            addCriterion("relatedProperty.NAME >", value, "relatedPropertyName");

            return this;
        } // end andRelatedPropertyNameGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyNameGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.NAME");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyNameGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyNameGreaterThanOrEqualTo(String value) {
            addCriterion("relatedProperty.NAME >=", value, "relatedPropertyName");

            return this;
        } // end andRelatedPropertyNameGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyNameGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.NAME");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyNameGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyNameLessThan(String value) {
            addCriterion("relatedProperty.NAME <", value, "relatedPropertyName");

            return this;
        } // end andRelatedPropertyNameLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyNameLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.NAME");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyNameLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyNameLessThanOrEqualTo(String value) {
            addCriterion("relatedProperty.NAME <=", value, "relatedPropertyName");

            return this;
        } // end andRelatedPropertyNameLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyNameLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.NAME");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyNameLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyNameLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("relatedProperty.NAME like", buffer.toString(),
                "relatedPropertyName");

            return this;
        } // end andRelatedPropertyNameLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyNameNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("relatedProperty.NAME not like", buffer.toString(),
                "relatedPropertyName");

            return this;
        } // end andRelatedPropertyNameNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyNameIn(List values) {
            if (values.size() == 1) {
                return andRelatedPropertyNameEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("relatedProperty.NAME in", values,
                    "relatedPropertyName");

                return this;
            } // end else
        } // end andRelatedPropertyNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyNameNotIn(List values) {
            if (values.size() == 1) {
                return andRelatedPropertyNameNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("relatedProperty.NAME not in", values,
                    "relatedPropertyName");

                return this;
            } // end else
        } // end andRelatedPropertyNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyNameIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedPropertyNameEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("relatedProperty.NAME in", Arrays.asList(values),
                    "relatedPropertyName");

                return this;
            } // end else
        } // end andRelatedPropertyNameIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyNameNotIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedPropertyNameNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("relatedProperty.NAME not in",
                    Arrays.asList(values), "relatedPropertyName");

                return this;
            } // end else
        } // end andRelatedPropertyNameNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyNameBetween(String value1,
            String value2) {
            addCriterion("relatedProperty.NAME between", value1, value2,
                "relatedPropertyName");

            return this;
        } // end andRelatedPropertyNameBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyNameNotBetween(String value1,
            String value2) {
            addCriterion("relatedProperty.NAME not between", value1, value2,
                "relatedPropertyName");

            return this;
        } // end andRelatedPropertyNameNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyObjectIdIsNull() {
            addCriterion("relatedProperty.OBJECT_ID is null");

            return this;
        } // end andRelatedPropertyObjectIdIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyObjectIdIsNotNull() {
            addCriterion("relatedProperty.OBJECT_ID is not null");

            return this;
        } // end andRelatedPropertyObjectIdIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyObjectIdIsNotEmpty() {
            addCriterion(
                "relatedProperty.OBJECT_ID is not null AND relatedProperty.OBJECT_ID <> ''");

            return this;
        } // end andRelatedPropertyObjectIdIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyObjectIdIsEmpty() {
            addCriterion(
                "(relatedProperty.OBJECT_ID is null OR relatedProperty.OBJECT_ID = '')");

            return this;
        } // end andRelatedPropertyObjectIdIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyObjectIdEqualTo(long value) {
            return andRelatedPropertyObjectIdEqualTo(Long.valueOf(value));
        } // end andRelatedPropertyObjectIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyObjectIdEqualTo(java.lang.Long value) {
            addCriterion("relatedProperty.OBJECT_ID =", value,
                "relatedPropertyObjectId");

            return this;
        } // end andRelatedPropertyObjectIdEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyObjectIdEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.OBJECT_ID");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyObjectIdEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyObjectIdNotEqualTo(long value) {
            return andRelatedPropertyObjectIdNotEqualTo(Long.valueOf(value));
        } // end andRelatedPropertyObjectIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyObjectIdNotEqualTo(
            java.lang.Long value) {
            addCriterion("relatedProperty.OBJECT_ID <>", value,
                "relatedPropertyObjectId");

            return this;
        } // end andRelatedPropertyObjectIdNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyObjectIdNotEqualToOrIsNull(long value) {
            return andRelatedPropertyObjectIdNotEqualToOrIsNull(Long.valueOf(
                    value));
        } // end andRelatedPropertyObjectIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyObjectIdNotEqualToOrIsNull(
            java.lang.Long value) {
            addCriterion("relatedProperty.OBJECT_ID is null OR relatedProperty.OBJECT_ID <>",
                value, "relatedPropertyObjectId");

            return this;
        } // end andRelatedPropertyObjectIdNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyObjectIdNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.OBJECT_ID");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyObjectIdNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyObjectIdGreaterThan(long value) {
            return andRelatedPropertyObjectIdGreaterThan(Long.valueOf(value));
        } // end andRelatedPropertyObjectIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyObjectIdGreaterThan(
            java.lang.Long value) {
            addCriterion("relatedProperty.OBJECT_ID >", value,
                "relatedPropertyObjectId");

            return this;
        } // end andRelatedPropertyObjectIdGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyObjectIdGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.OBJECT_ID");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyObjectIdGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyObjectIdGreaterThanOrEqualTo(
            long value) {
            return andRelatedPropertyObjectIdGreaterThanOrEqualTo(Long.valueOf(
                    value));
        } // end andRelatedPropertyObjectIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyObjectIdGreaterThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("relatedProperty.OBJECT_ID >=", value,
                "relatedPropertyObjectId");

            return this;
        } // end andRelatedPropertyObjectIdGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyObjectIdGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.OBJECT_ID");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyObjectIdGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyObjectIdLessThan(long value) {
            return andRelatedPropertyObjectIdLessThan(Long.valueOf(value));
        } // end andRelatedPropertyObjectIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyObjectIdLessThan(java.lang.Long value) {
            addCriterion("relatedProperty.OBJECT_ID <", value,
                "relatedPropertyObjectId");

            return this;
        } // end andRelatedPropertyObjectIdLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyObjectIdLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.OBJECT_ID");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyObjectIdLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyObjectIdLessThanOrEqualTo(long value) {
            return andRelatedPropertyObjectIdLessThanOrEqualTo(Long.valueOf(
                    value));
        } // end andRelatedPropertyObjectIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyObjectIdLessThanOrEqualTo(
            java.lang.Long value) {
            addCriterion("relatedProperty.OBJECT_ID <=", value,
                "relatedPropertyObjectId");

            return this;
        } // end andRelatedPropertyObjectIdLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyObjectIdLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.OBJECT_ID");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyObjectIdLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyObjectIdIn(long[] values) {
            if (values.length == 1) {
                return andRelatedPropertyObjectIdEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("relatedProperty.OBJECT_ID in", values,
                    "relatedPropertyObjectId");

                return this;
            } // end else
        } // end andRelatedPropertyObjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyObjectIdNotIn(long[] values) {
            if (values.length == 1) {
                return andRelatedPropertyObjectIdNotEqualTo((long) values[0]);
            } // end if
            else {
                addCriterion("relatedProperty.OBJECT_ID not in", values,
                    "relatedPropertyObjectId");

                return this;
            } // end else
        } // end andRelatedPropertyObjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyObjectIdIn(List values) {
            if (values.size() == 1) {
                return andRelatedPropertyObjectIdEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("relatedProperty.OBJECT_ID in", values,
                    "relatedPropertyObjectId");

                return this;
            } // end else
        } // end andRelatedPropertyObjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyObjectIdNotIn(List values) {
            if (values.size() == 1) {
                return andRelatedPropertyObjectIdNotEqualTo((java.lang.Long) values.get(
                        0));
            } // end if
            else {
                addCriterion("relatedProperty.OBJECT_ID not in", values,
                    "relatedPropertyObjectId");

                return this;
            } // end else
        } // end andRelatedPropertyObjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyObjectIdIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedPropertyObjectIdEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("relatedProperty.OBJECT_ID in",
                    Arrays.asList(values), "relatedPropertyObjectId");

                return this;
            } // end else
        } // end andRelatedPropertyObjectIdIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyObjectIdNotIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedPropertyObjectIdNotEqualTo((java.lang.Long) values[0]);
            } // end if
            else {
                addCriterion("relatedProperty.OBJECT_ID not in",
                    Arrays.asList(values), "relatedPropertyObjectId");

                return this;
            } // end else
        } // end andRelatedPropertyObjectIdNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyObjectIdBetween(long value1,
            long value2) {
            addCriterion("relatedProperty.OBJECT_ID between", value1, value2,
                "relatedPropertyObjectId");

            return this;
        } // end andRelatedPropertyObjectIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyObjectIdBetween(
            java.lang.Long value1, java.lang.Long value2) {
            addCriterion("relatedProperty.OBJECT_ID between", value1, value2,
                "relatedPropertyObjectId");

            return this;
        } // end andRelatedPropertyObjectIdBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyObjectIdNotBetween(long value1,
            long value2) {
            addCriterion("relatedProperty.OBJECT_ID not between", value1,
                value2, "relatedPropertyObjectId");

            return this;
        } // end andRelatedPropertyObjectIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyObjectIdNotBetween(
            java.lang.Long value1, java.lang.Long value2) {
            addCriterion("relatedProperty.OBJECT_ID not between", value1,
                value2, "relatedPropertyObjectId");

            return this;
        } // end andRelatedPropertyObjectIdNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyOrderIndexIsNull() {
            addCriterion("relatedProperty.ORDER_INDEX is null");

            return this;
        } // end andRelatedPropertyOrderIndexIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyOrderIndexIsNotNull() {
            addCriterion("relatedProperty.ORDER_INDEX is not null");

            return this;
        } // end andRelatedPropertyOrderIndexIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyOrderIndexIsNotEmpty() {
            addCriterion(
                "relatedProperty.ORDER_INDEX is not null AND relatedProperty.ORDER_INDEX <> ''");

            return this;
        } // end andRelatedPropertyOrderIndexIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyOrderIndexIsEmpty() {
            addCriterion(
                "(relatedProperty.ORDER_INDEX is null OR relatedProperty.ORDER_INDEX = '')");

            return this;
        } // end andRelatedPropertyOrderIndexIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyOrderIndexEqualTo(Integer value) {
            addCriterion("relatedProperty.ORDER_INDEX =", value,
                "relatedPropertyOrderIndex");

            return this;
        } // end andRelatedPropertyOrderIndexEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyOrderIndexEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.ORDER_INDEX");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyOrderIndexEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyOrderIndexNotEqualTo(Integer value) {
            addCriterion("relatedProperty.ORDER_INDEX <>", value,
                "relatedPropertyOrderIndex");

            return this;
        } // end andRelatedPropertyOrderIndexNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyOrderIndexNotEqualToOrIsNull(
            Integer value) {
            addCriterion("relatedProperty.ORDER_INDEX is null OR relatedProperty.ORDER_INDEX <>",
                value, "relatedPropertyOrderIndex");

            return this;
        } // end andRelatedPropertyOrderIndexNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyOrderIndexNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.ORDER_INDEX");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyOrderIndexNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyOrderIndexGreaterThan(Integer value) {
            addCriterion("relatedProperty.ORDER_INDEX >", value,
                "relatedPropertyOrderIndex");

            return this;
        } // end andRelatedPropertyOrderIndexGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyOrderIndexGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.ORDER_INDEX");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyOrderIndexGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyOrderIndexGreaterThanOrEqualTo(
            Integer value) {
            addCriterion("relatedProperty.ORDER_INDEX >=", value,
                "relatedPropertyOrderIndex");

            return this;
        } // end andRelatedPropertyOrderIndexGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyOrderIndexGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.ORDER_INDEX");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyOrderIndexGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyOrderIndexLessThan(Integer value) {
            addCriterion("relatedProperty.ORDER_INDEX <", value,
                "relatedPropertyOrderIndex");

            return this;
        } // end andRelatedPropertyOrderIndexLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyOrderIndexLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.ORDER_INDEX");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyOrderIndexLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyOrderIndexLessThanOrEqualTo(
            Integer value) {
            addCriterion("relatedProperty.ORDER_INDEX <=", value,
                "relatedPropertyOrderIndex");

            return this;
        } // end andRelatedPropertyOrderIndexLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyOrderIndexLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.ORDER_INDEX");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyOrderIndexLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyOrderIndexIn(List values) {
            if (values.size() == 1) {
                return andRelatedPropertyOrderIndexEqualTo((Integer) values.get(
                        0));
            } // end if
            else {
                addCriterion("relatedProperty.ORDER_INDEX in", values,
                    "relatedPropertyOrderIndex");

                return this;
            } // end else
        } // end andRelatedPropertyOrderIndexIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyOrderIndexNotIn(List values) {
            if (values.size() == 1) {
                return andRelatedPropertyOrderIndexNotEqualTo((Integer) values.get(
                        0));
            } // end if
            else {
                addCriterion("relatedProperty.ORDER_INDEX not in", values,
                    "relatedPropertyOrderIndex");

                return this;
            } // end else
        } // end andRelatedPropertyOrderIndexNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyOrderIndexIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedPropertyOrderIndexEqualTo((Integer) values[0]);
            } // end if
            else {
                addCriterion("relatedProperty.ORDER_INDEX in",
                    Arrays.asList(values), "relatedPropertyOrderIndex");

                return this;
            } // end else
        } // end andRelatedPropertyOrderIndexIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyOrderIndexNotIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedPropertyOrderIndexNotEqualTo((Integer) values[0]);
            } // end if
            else {
                addCriterion("relatedProperty.ORDER_INDEX not in",
                    Arrays.asList(values), "relatedPropertyOrderIndex");

                return this;
            } // end else
        } // end andRelatedPropertyOrderIndexNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyOrderIndexBetween(Integer value1,
            Integer value2) {
            addCriterion("relatedProperty.ORDER_INDEX between", value1, value2,
                "relatedPropertyOrderIndex");

            return this;
        } // end andRelatedPropertyOrderIndexBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyOrderIndexNotBetween(Integer value1,
            Integer value2) {
            addCriterion("relatedProperty.ORDER_INDEX not between", value1,
                value2, "relatedPropertyOrderIndex");

            return this;
        } // end andRelatedPropertyOrderIndexNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyKindIsNull() {
            addCriterion("relatedProperty.PROPERTY_KIND is null");

            return this;
        } // end andRelatedPropertyKindIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyKindIsNotNull() {
            addCriterion("relatedProperty.PROPERTY_KIND is not null");

            return this;
        } // end andRelatedPropertyKindIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyKindIsNotEmpty() {
            addCriterion(
                "relatedProperty.PROPERTY_KIND is not null AND relatedProperty.PROPERTY_KIND <> ''");

            return this;
        } // end andRelatedPropertyKindIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyKindIsEmpty() {
            addCriterion(
                "(relatedProperty.PROPERTY_KIND is null OR relatedProperty.PROPERTY_KIND = '')");

            return this;
        } // end andRelatedPropertyKindIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyKindEqualTo(String value) {
            addCriterion("relatedProperty.PROPERTY_KIND =", value,
                "relatedPropertyKind");

            return this;
        } // end andRelatedPropertyKindEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyKindEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.PROPERTY_KIND");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyKindEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyKindNotEqualTo(String value) {
            addCriterion("relatedProperty.PROPERTY_KIND <>", value,
                "relatedPropertyKind");

            return this;
        } // end andRelatedPropertyKindNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyKindNotEqualToOrIsNull(String value) {
            addCriterion("relatedProperty.PROPERTY_KIND is null OR relatedProperty.PROPERTY_KIND <>",
                value, "relatedPropertyKind");

            return this;
        } // end andRelatedPropertyKindNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyKindNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.PROPERTY_KIND");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyKindNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyKindGreaterThan(String value) {
            addCriterion("relatedProperty.PROPERTY_KIND >", value,
                "relatedPropertyKind");

            return this;
        } // end andRelatedPropertyKindGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyKindGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.PROPERTY_KIND");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyKindGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyKindGreaterThanOrEqualTo(String value) {
            addCriterion("relatedProperty.PROPERTY_KIND >=", value,
                "relatedPropertyKind");

            return this;
        } // end andRelatedPropertyKindGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyKindGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.PROPERTY_KIND");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyKindGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyKindLessThan(String value) {
            addCriterion("relatedProperty.PROPERTY_KIND <", value,
                "relatedPropertyKind");

            return this;
        } // end andRelatedPropertyKindLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyKindLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.PROPERTY_KIND");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyKindLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyKindLessThanOrEqualTo(String value) {
            addCriterion("relatedProperty.PROPERTY_KIND <=", value,
                "relatedPropertyKind");

            return this;
        } // end andRelatedPropertyKindLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyKindLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.PROPERTY_KIND");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyKindLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyKindLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("relatedProperty.PROPERTY_KIND like",
                buffer.toString(), "relatedPropertyKind");

            return this;
        } // end andRelatedPropertyKindLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyKindNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("relatedProperty.PROPERTY_KIND not like",
                buffer.toString(), "relatedPropertyKind");

            return this;
        } // end andRelatedPropertyKindNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyKindIn(List values) {
            if (values.size() == 1) {
                return andRelatedPropertyKindEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("relatedProperty.PROPERTY_KIND in", values,
                    "relatedPropertyKind");

                return this;
            } // end else
        } // end andRelatedPropertyKindIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyKindNotIn(List values) {
            if (values.size() == 1) {
                return andRelatedPropertyKindNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("relatedProperty.PROPERTY_KIND not in", values,
                    "relatedPropertyKind");

                return this;
            } // end else
        } // end andRelatedPropertyKindNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyKindIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedPropertyKindEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("relatedProperty.PROPERTY_KIND in",
                    Arrays.asList(values), "relatedPropertyKind");

                return this;
            } // end else
        } // end andRelatedPropertyKindIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyKindNotIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedPropertyKindNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("relatedProperty.PROPERTY_KIND not in",
                    Arrays.asList(values), "relatedPropertyKind");

                return this;
            } // end else
        } // end andRelatedPropertyKindNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyKindBetween(String value1,
            String value2) {
            addCriterion("relatedProperty.PROPERTY_KIND between", value1,
                value2, "relatedPropertyKind");

            return this;
        } // end andRelatedPropertyKindBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyKindNotBetween(String value1,
            String value2) {
            addCriterion("relatedProperty.PROPERTY_KIND not between", value1,
                value2, "relatedPropertyKind");

            return this;
        } // end andRelatedPropertyKindNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyStateIsNull() {
            addCriterion("relatedProperty.STATE is null");

            return this;
        } // end andRelatedPropertyStateIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyStateIsNotNull() {
            addCriterion("relatedProperty.STATE is not null");

            return this;
        } // end andRelatedPropertyStateIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyStateIsNotEmpty() {
            addCriterion(
                "relatedProperty.STATE is not null AND relatedProperty.STATE <> ''");

            return this;
        } // end andRelatedPropertyStateIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyStateIsEmpty() {
            addCriterion(
                "(relatedProperty.STATE is null OR relatedProperty.STATE = '')");

            return this;
        } // end andRelatedPropertyStateIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyStateEqualTo(String value) {
            addCriterion("relatedProperty.STATE =", value,
                "relatedPropertyState");

            return this;
        } // end andRelatedPropertyStateEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyStateEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.STATE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyStateEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyStateNotEqualTo(String value) {
            addCriterion("relatedProperty.STATE <>", value,
                "relatedPropertyState");

            return this;
        } // end andRelatedPropertyStateNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyStateNotEqualToOrIsNull(String value) {
            addCriterion("relatedProperty.STATE is null OR relatedProperty.STATE <>",
                value, "relatedPropertyState");

            return this;
        } // end andRelatedPropertyStateNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyStateNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.STATE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyStateNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyStateGreaterThan(String value) {
            addCriterion("relatedProperty.STATE >", value,
                "relatedPropertyState");

            return this;
        } // end andRelatedPropertyStateGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyStateGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.STATE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyStateGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyStateGreaterThanOrEqualTo(
            String value) {
            addCriterion("relatedProperty.STATE >=", value,
                "relatedPropertyState");

            return this;
        } // end andRelatedPropertyStateGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyStateGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.STATE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyStateGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyStateLessThan(String value) {
            addCriterion("relatedProperty.STATE <", value,
                "relatedPropertyState");

            return this;
        } // end andRelatedPropertyStateLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyStateLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.STATE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyStateLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyStateLessThanOrEqualTo(String value) {
            addCriterion("relatedProperty.STATE <=", value,
                "relatedPropertyState");

            return this;
        } // end andRelatedPropertyStateLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyStateLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.STATE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyStateLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyStateLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("relatedProperty.STATE like", buffer.toString(),
                "relatedPropertyState");

            return this;
        } // end andRelatedPropertyStateLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyStateNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("relatedProperty.STATE not like", buffer.toString(),
                "relatedPropertyState");

            return this;
        } // end andRelatedPropertyStateNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyStateIn(List values) {
            if (values.size() == 1) {
                return andRelatedPropertyStateEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("relatedProperty.STATE in", values,
                    "relatedPropertyState");

                return this;
            } // end else
        } // end andRelatedPropertyStateIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyStateNotIn(List values) {
            if (values.size() == 1) {
                return andRelatedPropertyStateNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("relatedProperty.STATE not in", values,
                    "relatedPropertyState");

                return this;
            } // end else
        } // end andRelatedPropertyStateNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyStateIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedPropertyStateEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("relatedProperty.STATE in", Arrays.asList(values),
                    "relatedPropertyState");

                return this;
            } // end else
        } // end andRelatedPropertyStateIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyStateNotIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedPropertyStateNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("relatedProperty.STATE not in",
                    Arrays.asList(values), "relatedPropertyState");

                return this;
            } // end else
        } // end andRelatedPropertyStateNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyStateBetween(String value1,
            String value2) {
            addCriterion("relatedProperty.STATE between", value1, value2,
                "relatedPropertyState");

            return this;
        } // end andRelatedPropertyStateBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyStateNotBetween(String value1,
            String value2) {
            addCriterion("relatedProperty.STATE not between", value1, value2,
                "relatedPropertyState");

            return this;
        } // end andRelatedPropertyStateNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyTypeIsNull() {
            addCriterion("relatedProperty.TYPE is null");

            return this;
        } // end andRelatedPropertyTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyTypeIsNotNull() {
            addCriterion("relatedProperty.TYPE is not null");

            return this;
        } // end andRelatedPropertyTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyTypeIsNotEmpty() {
            addCriterion(
                "relatedProperty.TYPE is not null AND relatedProperty.TYPE <> ''");

            return this;
        } // end andRelatedPropertyTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyTypeIsEmpty() {
            addCriterion(
                "(relatedProperty.TYPE is null OR relatedProperty.TYPE = '')");

            return this;
        } // end andRelatedPropertyTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyTypeEqualTo(String value) {
            addCriterion("relatedProperty.TYPE =", value, "relatedPropertyType");

            return this;
        } // end andRelatedPropertyTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyTypeEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyTypeNotEqualTo(String value) {
            addCriterion("relatedProperty.TYPE <>", value, "relatedPropertyType");

            return this;
        } // end andRelatedPropertyTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyTypeNotEqualToOrIsNull(String value) {
            addCriterion("relatedProperty.TYPE is null OR relatedProperty.TYPE <>",
                value, "relatedPropertyType");

            return this;
        } // end andRelatedPropertyTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyTypeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyTypeGreaterThan(String value) {
            addCriterion("relatedProperty.TYPE >", value, "relatedPropertyType");

            return this;
        } // end andRelatedPropertyTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyTypeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("relatedProperty.TYPE >=", value, "relatedPropertyType");

            return this;
        } // end andRelatedPropertyTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyTypeLessThan(String value) {
            addCriterion("relatedProperty.TYPE <", value, "relatedPropertyType");

            return this;
        } // end andRelatedPropertyTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyTypeLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyTypeLessThanOrEqualTo(String value) {
            addCriterion("relatedProperty.TYPE <=", value, "relatedPropertyType");

            return this;
        } // end andRelatedPropertyTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("relatedProperty.TYPE like", buffer.toString(),
                "relatedPropertyType");

            return this;
        } // end andRelatedPropertyTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("relatedProperty.TYPE not like", buffer.toString(),
                "relatedPropertyType");

            return this;
        } // end andRelatedPropertyTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyTypeIn(List values) {
            if (values.size() == 1) {
                return andRelatedPropertyTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("relatedProperty.TYPE in", values,
                    "relatedPropertyType");

                return this;
            } // end else
        } // end andRelatedPropertyTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyTypeNotIn(List values) {
            if (values.size() == 1) {
                return andRelatedPropertyTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("relatedProperty.TYPE not in", values,
                    "relatedPropertyType");

                return this;
            } // end else
        } // end andRelatedPropertyTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyTypeIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedPropertyTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("relatedProperty.TYPE in", Arrays.asList(values),
                    "relatedPropertyType");

                return this;
            } // end else
        } // end andRelatedPropertyTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedPropertyTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("relatedProperty.TYPE not in",
                    Arrays.asList(values), "relatedPropertyType");

                return this;
            } // end else
        } // end andRelatedPropertyTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyTypeBetween(String value1,
            String value2) {
            addCriterion("relatedProperty.TYPE between", value1, value2,
                "relatedPropertyType");

            return this;
        } // end andRelatedPropertyTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyTypeNotBetween(String value1,
            String value2) {
            addCriterion("relatedProperty.TYPE not between", value1, value2,
                "relatedPropertyType");

            return this;
        } // end andRelatedPropertyTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyValueIsNull() {
            addCriterion("relatedProperty.VALUE is null");

            return this;
        } // end andRelatedPropertyValueIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyValueIsNotNull() {
            addCriterion("relatedProperty.VALUE is not null");

            return this;
        } // end andRelatedPropertyValueIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyValueIsNotEmpty() {
            addCriterion(
                "relatedProperty.VALUE is not null AND relatedProperty.VALUE <> ''");

            return this;
        } // end andRelatedPropertyValueIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyValueIsEmpty() {
            addCriterion(
                "(relatedProperty.VALUE is null OR relatedProperty.VALUE = '')");

            return this;
        } // end andRelatedPropertyValueIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyValueEqualTo(String value) {
            addCriterion("relatedProperty.VALUE =", value,
                "relatedPropertyValue");

            return this;
        } // end andRelatedPropertyValueEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyValueEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.VALUE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyValueEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyValueNotEqualTo(String value) {
            addCriterion("relatedProperty.VALUE <>", value,
                "relatedPropertyValue");

            return this;
        } // end andRelatedPropertyValueNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyValueNotEqualToOrIsNull(String value) {
            addCriterion("relatedProperty.VALUE is null OR relatedProperty.VALUE <>",
                value, "relatedPropertyValue");

            return this;
        } // end andRelatedPropertyValueNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyValueNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.VALUE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyValueNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyValueGreaterThan(String value) {
            addCriterion("relatedProperty.VALUE >", value,
                "relatedPropertyValue");

            return this;
        } // end andRelatedPropertyValueGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyValueGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.VALUE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyValueGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyValueGreaterThanOrEqualTo(
            String value) {
            addCriterion("relatedProperty.VALUE >=", value,
                "relatedPropertyValue");

            return this;
        } // end andRelatedPropertyValueGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyValueGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.VALUE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyValueGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyValueLessThan(String value) {
            addCriterion("relatedProperty.VALUE <", value,
                "relatedPropertyValue");

            return this;
        } // end andRelatedPropertyValueLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyValueLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.VALUE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyValueLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyValueLessThanOrEqualTo(String value) {
            addCriterion("relatedProperty.VALUE <=", value,
                "relatedPropertyValue");

            return this;
        } // end andRelatedPropertyValueLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyValueLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.VALUE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyValueLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyValueLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("relatedProperty.VALUE like", buffer.toString(),
                "relatedPropertyValue");

            return this;
        } // end andRelatedPropertyValueLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyValueNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("relatedProperty.VALUE not like", buffer.toString(),
                "relatedPropertyValue");

            return this;
        } // end andRelatedPropertyValueNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyValueIn(List values) {
            if (values.size() == 1) {
                return andRelatedPropertyValueEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("relatedProperty.VALUE in", values,
                    "relatedPropertyValue");

                return this;
            } // end else
        } // end andRelatedPropertyValueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyValueNotIn(List values) {
            if (values.size() == 1) {
                return andRelatedPropertyValueNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("relatedProperty.VALUE not in", values,
                    "relatedPropertyValue");

                return this;
            } // end else
        } // end andRelatedPropertyValueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyValueIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedPropertyValueEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("relatedProperty.VALUE in", Arrays.asList(values),
                    "relatedPropertyValue");

                return this;
            } // end else
        } // end andRelatedPropertyValueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyValueNotIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedPropertyValueNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("relatedProperty.VALUE not in",
                    Arrays.asList(values), "relatedPropertyValue");

                return this;
            } // end else
        } // end andRelatedPropertyValueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyValueBetween(String value1,
            String value2) {
            addCriterion("relatedProperty.VALUE between", value1, value2,
                "relatedPropertyValue");

            return this;
        } // end andRelatedPropertyValueBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyValueNotBetween(String value1,
            String value2) {
            addCriterion("relatedProperty.VALUE not between", value1, value2,
                "relatedPropertyValue");

            return this;
        } // end andRelatedPropertyValueNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateAttrTypeIsNull() {
            addCriterion("OBJECT_RELATION_ATTR.RELATE_ATTR_TYPE is null");

            return this;
        } // end andRelateAttrTypeIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateAttrTypeIsNotNull() {
            addCriterion("OBJECT_RELATION_ATTR.RELATE_ATTR_TYPE is not null");

            return this;
        } // end andRelateAttrTypeIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateAttrTypeIsNotEmpty() {
            addCriterion(
                "OBJECT_RELATION_ATTR.RELATE_ATTR_TYPE is not null AND OBJECT_RELATION_ATTR.RELATE_ATTR_TYPE <> ''");

            return this;
        } // end andRelateAttrTypeIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateAttrTypeIsEmpty() {
            addCriterion(
                "(OBJECT_RELATION_ATTR.RELATE_ATTR_TYPE is null OR OBJECT_RELATION_ATTR.RELATE_ATTR_TYPE = '')");

            return this;
        } // end andRelateAttrTypeIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateAttrTypeEqualTo(String value) {
            addCriterion("OBJECT_RELATION_ATTR.RELATE_ATTR_TYPE =", value,
                "relateAttrType");

            return this;
        } // end andRelateAttrTypeEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateAttrTypeEqualToForeignKey(java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION_ATTR.RELATE_ATTR_TYPE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelateAttrTypeEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateAttrTypeNotEqualTo(String value) {
            addCriterion("OBJECT_RELATION_ATTR.RELATE_ATTR_TYPE <>", value,
                "relateAttrType");

            return this;
        } // end andRelateAttrTypeNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateAttrTypeNotEqualToOrIsNull(String value) {
            addCriterion("OBJECT_RELATION_ATTR.RELATE_ATTR_TYPE is null OR OBJECT_RELATION_ATTR.RELATE_ATTR_TYPE <>",
                value, "relateAttrType");

            return this;
        } // end andRelateAttrTypeNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateAttrTypeNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION_ATTR.RELATE_ATTR_TYPE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelateAttrTypeNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateAttrTypeGreaterThan(String value) {
            addCriterion("OBJECT_RELATION_ATTR.RELATE_ATTR_TYPE >", value,
                "relateAttrType");

            return this;
        } // end andRelateAttrTypeGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateAttrTypeGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION_ATTR.RELATE_ATTR_TYPE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelateAttrTypeGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateAttrTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECT_RELATION_ATTR.RELATE_ATTR_TYPE >=", value,
                "relateAttrType");

            return this;
        } // end andRelateAttrTypeGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateAttrTypeGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION_ATTR.RELATE_ATTR_TYPE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelateAttrTypeGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateAttrTypeLessThan(String value) {
            addCriterion("OBJECT_RELATION_ATTR.RELATE_ATTR_TYPE <", value,
                "relateAttrType");

            return this;
        } // end andRelateAttrTypeLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateAttrTypeLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION_ATTR.RELATE_ATTR_TYPE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelateAttrTypeLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateAttrTypeLessThanOrEqualTo(String value) {
            addCriterion("OBJECT_RELATION_ATTR.RELATE_ATTR_TYPE <=", value,
                "relateAttrType");

            return this;
        } // end andRelateAttrTypeLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateAttrTypeLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer(
                    "OBJECT_RELATION_ATTR.RELATE_ATTR_TYPE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelateAttrTypeLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateAttrTypeLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_RELATION_ATTR.RELATE_ATTR_TYPE like",
                buffer.toString(), "relateAttrType");

            return this;
        } // end andRelateAttrTypeLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateAttrTypeNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("OBJECT_RELATION_ATTR.RELATE_ATTR_TYPE not like",
                buffer.toString(), "relateAttrType");

            return this;
        } // end andRelateAttrTypeNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateAttrTypeIn(List values) {
            if (values.size() == 1) {
                return andRelateAttrTypeEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_RELATION_ATTR.RELATE_ATTR_TYPE in",
                    values, "relateAttrType");

                return this;
            } // end else
        } // end andRelateAttrTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateAttrTypeNotIn(List values) {
            if (values.size() == 1) {
                return andRelateAttrTypeNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("OBJECT_RELATION_ATTR.RELATE_ATTR_TYPE not in",
                    values, "relateAttrType");

                return this;
            } // end else
        } // end andRelateAttrTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateAttrTypeIn(Object[] values) {
            if (values.length == 1) {
                return andRelateAttrTypeEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_RELATION_ATTR.RELATE_ATTR_TYPE in",
                    Arrays.asList(values), "relateAttrType");

                return this;
            } // end else
        } // end andRelateAttrTypeIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateAttrTypeNotIn(Object[] values) {
            if (values.length == 1) {
                return andRelateAttrTypeNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("OBJECT_RELATION_ATTR.RELATE_ATTR_TYPE not in",
                    Arrays.asList(values), "relateAttrType");

                return this;
            } // end else
        } // end andRelateAttrTypeNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateAttrTypeBetween(String value1, String value2) {
            addCriterion("OBJECT_RELATION_ATTR.RELATE_ATTR_TYPE between",
                value1, value2, "relateAttrType");

            return this;
        } // end andRelateAttrTypeBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelateAttrTypeNotBetween(String value1, String value2) {
            addCriterion("OBJECT_RELATION_ATTR.RELATE_ATTR_TYPE not between",
                value1, value2, "relateAttrType");

            return this;
        } // end andRelateAttrTypeNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsUniqueIsNull() {
            addCriterion("property.IS_UNIQUE is null");

            return this;
        } // end andPropertyIsUniqueIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsUniqueIsNotNull() {
            addCriterion("property.IS_UNIQUE is not null");

            return this;
        } // end andPropertyIsUniqueIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsUniqueIsNotEmpty() {
            addCriterion(
                "property.IS_UNIQUE is not null AND property.IS_UNIQUE <> ''");

            return this;
        } // end andPropertyIsUniqueIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsUniqueIsEmpty() {
            addCriterion(
                "(property.IS_UNIQUE is null OR property.IS_UNIQUE = '')");

            return this;
        } // end andPropertyIsUniqueIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsUniqueEqualTo(String value) {
            addCriterion("property.IS_UNIQUE =", value, "propertyIsUnique");

            return this;
        } // end andPropertyIsUniqueEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsUniqueEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.IS_UNIQUE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyIsUniqueEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsUniqueNotEqualTo(String value) {
            addCriterion("property.IS_UNIQUE <>", value, "propertyIsUnique");

            return this;
        } // end andPropertyIsUniqueNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsUniqueNotEqualToOrIsNull(String value) {
            addCriterion("property.IS_UNIQUE is null OR property.IS_UNIQUE <>",
                value, "propertyIsUnique");

            return this;
        } // end andPropertyIsUniqueNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsUniqueNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.IS_UNIQUE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyIsUniqueNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsUniqueGreaterThan(String value) {
            addCriterion("property.IS_UNIQUE >", value, "propertyIsUnique");

            return this;
        } // end andPropertyIsUniqueGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsUniqueGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.IS_UNIQUE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyIsUniqueGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsUniqueGreaterThanOrEqualTo(String value) {
            addCriterion("property.IS_UNIQUE >=", value, "propertyIsUnique");

            return this;
        } // end andPropertyIsUniqueGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsUniqueGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.IS_UNIQUE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyIsUniqueGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsUniqueLessThan(String value) {
            addCriterion("property.IS_UNIQUE <", value, "propertyIsUnique");

            return this;
        } // end andPropertyIsUniqueLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsUniqueLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.IS_UNIQUE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyIsUniqueLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsUniqueLessThanOrEqualTo(String value) {
            addCriterion("property.IS_UNIQUE <=", value, "propertyIsUnique");

            return this;
        } // end andPropertyIsUniqueLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsUniqueLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("property.IS_UNIQUE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andPropertyIsUniqueLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsUniqueLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("property.IS_UNIQUE like", buffer.toString(),
                "propertyIsUnique");

            return this;
        } // end andPropertyIsUniqueLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsUniqueNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("property.IS_UNIQUE not like", buffer.toString(),
                "propertyIsUnique");

            return this;
        } // end andPropertyIsUniqueNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsUniqueIn(List values) {
            if (values.size() == 1) {
                return andPropertyIsUniqueEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("property.IS_UNIQUE in", values, "propertyIsUnique");

                return this;
            } // end else
        } // end andPropertyIsUniqueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsUniqueNotIn(List values) {
            if (values.size() == 1) {
                return andPropertyIsUniqueNotEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("property.IS_UNIQUE not in", values,
                    "propertyIsUnique");

                return this;
            } // end else
        } // end andPropertyIsUniqueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsUniqueIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyIsUniqueEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("property.IS_UNIQUE in", Arrays.asList(values),
                    "propertyIsUnique");

                return this;
            } // end else
        } // end andPropertyIsUniqueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsUniqueNotIn(Object[] values) {
            if (values.length == 1) {
                return andPropertyIsUniqueNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("property.IS_UNIQUE not in",
                    Arrays.asList(values), "propertyIsUnique");

                return this;
            } // end else
        } // end andPropertyIsUniqueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsUniqueBetween(String value1, String value2) {
            addCriterion("property.IS_UNIQUE between", value1, value2,
                "propertyIsUnique");

            return this;
        } // end andPropertyIsUniqueBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andPropertyIsUniqueNotBetween(String value1,
            String value2) {
            addCriterion("property.IS_UNIQUE not between", value1, value2,
                "propertyIsUnique");

            return this;
        } // end andPropertyIsUniqueNotBetween()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsUniqueIsNull() {
            addCriterion("relatedProperty.IS_UNIQUE is null");

            return this;
        } // end andRelatedPropertyIsUniqueIsNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsUniqueIsNotNull() {
            addCriterion("relatedProperty.IS_UNIQUE is not null");

            return this;
        } // end andRelatedPropertyIsUniqueIsNotNull()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsUniqueIsNotEmpty() {
            addCriterion(
                "relatedProperty.IS_UNIQUE is not null AND relatedProperty.IS_UNIQUE <> ''");

            return this;
        } // end andRelatedPropertyIsUniqueIsNotEmpty()

        /**
         * DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsUniqueIsEmpty() {
            addCriterion(
                "(relatedProperty.IS_UNIQUE is null OR relatedProperty.IS_UNIQUE = '')");

            return this;
        } // end andRelatedPropertyIsUniqueIsEmpty()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsUniqueEqualTo(String value) {
            addCriterion("relatedProperty.IS_UNIQUE =", value,
                "relatedPropertyIsUnique");

            return this;
        } // end andRelatedPropertyIsUniqueEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsUniqueEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.IS_UNIQUE");
            str.append(" = ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyIsUniqueEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsUniqueNotEqualTo(String value) {
            addCriterion("relatedProperty.IS_UNIQUE <>", value,
                "relatedPropertyIsUnique");

            return this;
        } // end andRelatedPropertyIsUniqueNotEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsUniqueNotEqualToOrIsNull(
            String value) {
            addCriterion("relatedProperty.IS_UNIQUE is null OR relatedProperty.IS_UNIQUE <>",
                value, "relatedPropertyIsUnique");

            return this;
        } // end andRelatedPropertyIsUniqueNotEqualToOrIsNull()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsUniqueNotEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.IS_UNIQUE");
            str.append(" <> ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyIsUniqueNotEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsUniqueGreaterThan(String value) {
            addCriterion("relatedProperty.IS_UNIQUE >", value,
                "relatedPropertyIsUnique");

            return this;
        } // end andRelatedPropertyIsUniqueGreaterThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsUniqueGreaterThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.IS_UNIQUE");
            str.append(" > ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyIsUniqueGreaterThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsUniqueGreaterThanOrEqualTo(
            String value) {
            addCriterion("relatedProperty.IS_UNIQUE >=", value,
                "relatedPropertyIsUnique");

            return this;
        } // end andRelatedPropertyIsUniqueGreaterThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsUniqueGreaterThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.IS_UNIQUE");
            str.append(" >= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyIsUniqueGreaterThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsUniqueLessThan(String value) {
            addCriterion("relatedProperty.IS_UNIQUE <", value,
                "relatedPropertyIsUnique");

            return this;
        } // end andRelatedPropertyIsUniqueLessThan()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsUniqueLessThanForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.IS_UNIQUE");
            str.append(" < ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyIsUniqueLessThanForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsUniqueLessThanOrEqualTo(
            String value) {
            addCriterion("relatedProperty.IS_UNIQUE <=", value,
                "relatedPropertyIsUnique");

            return this;
        } // end andRelatedPropertyIsUniqueLessThanOrEqualTo()

        /**
         * DOCUMENT ME!
         *
         * @param key DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsUniqueLessThanOrEqualToForeignKey(
            java.lang.String key) {
            StringBuffer str = new StringBuffer("relatedProperty.IS_UNIQUE");
            str.append(" <= ").append(key);
            addForeignKeyCriterion(str.toString());

            return this;
        } // end andRelatedPropertyIsUniqueLessThanOrEqualToForeignKey()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsUniqueLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("relatedProperty.IS_UNIQUE like", buffer.toString(),
                "relatedPropertyIsUnique");

            return this;
        } // end andRelatedPropertyIsUniqueLike()

        /**
         * DOCUMENT ME!
         *
         * @param value DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsUniqueNotLike(String value) {
            StringBuffer buffer = new StringBuffer("%");
            buffer.append(value);
            buffer.append("%");
            addCriterion("relatedProperty.IS_UNIQUE not like",
                buffer.toString(), "relatedPropertyIsUnique");

            return this;
        } // end andRelatedPropertyIsUniqueNotLike()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsUniqueIn(List values) {
            if (values.size() == 1) {
                return andRelatedPropertyIsUniqueEqualTo((String) values.get(0));
            } // end if
            else {
                addCriterion("relatedProperty.IS_UNIQUE in", values,
                    "relatedPropertyIsUnique");

                return this;
            } // end else
        } // end andRelatedPropertyIsUniqueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsUniqueNotIn(List values) {
            if (values.size() == 1) {
                return andRelatedPropertyIsUniqueNotEqualTo((String) values.get(
                        0));
            } // end if
            else {
                addCriterion("relatedProperty.IS_UNIQUE not in", values,
                    "relatedPropertyIsUnique");

                return this;
            } // end else
        } // end andRelatedPropertyIsUniqueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsUniqueIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedPropertyIsUniqueEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("relatedProperty.IS_UNIQUE in",
                    Arrays.asList(values), "relatedPropertyIsUnique");

                return this;
            } // end else
        } // end andRelatedPropertyIsUniqueIn()

        /**
         * DOCUMENT ME!
         *
         * @param values DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsUniqueNotIn(Object[] values) {
            if (values.length == 1) {
                return andRelatedPropertyIsUniqueNotEqualTo((String) values[0]);
            } // end if
            else {
                addCriterion("relatedProperty.IS_UNIQUE not in",
                    Arrays.asList(values), "relatedPropertyIsUnique");

                return this;
            } // end else
        } // end andRelatedPropertyIsUniqueNotIn()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsUniqueBetween(String value1,
            String value2) {
            addCriterion("relatedProperty.IS_UNIQUE between", value1, value2,
                "relatedPropertyIsUnique");

            return this;
        } // end andRelatedPropertyIsUniqueBetween()

        /**
         * DOCUMENT ME!
         *
         * @param value1 DOCUMENT ME!
         * @param value2 DOCUMENT ME!
         *
         * @return DOCUMENT ME!
         */
        public Criteria andRelatedPropertyIsUniqueNotBetween(String value1,
            String value2) {
            addCriterion("relatedProperty.IS_UNIQUE not between", value1,
                value2, "relatedPropertyIsUnique");

            return this;
        } // end andRelatedPropertyIsUniqueNotBetween()
    } // end Criteria
} // end ObjectRelationAttrDAOQueryBean
